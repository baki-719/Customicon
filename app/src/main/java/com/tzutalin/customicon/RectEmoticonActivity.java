package com.tzutalin.customicon;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.dexafree.materialList.card.Card;
import com.dexafree.materialList.card.provider.BigImageCardProvider;
import com.dexafree.materialList.view.MaterialListView;
import com.tzutalin.dlib.VisionDetRet;

import org.androidannotations.annotations.ViewById;

import hugo.weaving.DebugLog;
import timber.log.Timber;

/**
 * Created by DEV on 2017-10-31.
 */

public class RectEmoticonActivity extends AppCompatActivity {

    private Intent intent;
    private MaterialListView mListView;
    private int top;
    private int bottom;
    private int left;
    private int right;

    private static final String TAG = "RectEmoticonActivity";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_rect);

        intent = getIntent();
        top = intent.getExtras().getInt("top");
        bottom = intent.getExtras().getInt("bottom");
        left = intent.getExtras().getInt("left");
        right = intent.getExtras().getInt("right");

        init();

    }

    private void init() {
        mListView = (MaterialListView) findViewById(R.id.material_listview_emo);

        Resources res = getResources();
        Drawable drawable = res.getDrawable(R.drawable.ryan);
        String imgPath = drawable.toString();
        Log.d(TAG, "imgPath : " + imgPath);
        Card card = new Card.Builder(RectEmoticonActivity.this)
                .withProvider(BigImageCardProvider.class)
                .setDrawable(drawRect(new VisionDetRet("face"
                        , 0
                        , left
                        , top
                        , right
                        , bottom), Color.GREEN))
                .endConfig()
                .build();
        addCardListView(card);
    }

    protected void addCardListView(Card card) {
        mListView.add(card);
    }

    protected BitmapDrawable drawRect(VisionDetRet ret, int color) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.ryan_emoticon);
        android.graphics.Bitmap.Config bitmapConfig = bm.getConfig();
        // set default bitmap config if none
        if (bitmapConfig == null) {
            bitmapConfig = android.graphics.Bitmap.Config.ARGB_8888;
        }
        // resource bitmaps are imutable,
        // so we need to convert it to mutable one
        bm = bm.copy(bitmapConfig, true);
        int width = bm.getWidth();
        int height = bm.getHeight();
        // By ratio scale
        float aspectRatio = bm.getWidth() / (float) bm.getHeight();

        final int MAX_SIZE = 512;
        int newWidth = MAX_SIZE;
        int newHeight = MAX_SIZE;
        float resizeRatio = 1;
        newHeight = Math.round(newWidth / aspectRatio);
        if (bm.getWidth() > MAX_SIZE && bm.getHeight() > MAX_SIZE) {
            Timber.tag(TAG).d("Resize Bitmap");
            bm = getResizedBitmap(bm, newWidth, newHeight);
            resizeRatio = (float) bm.getWidth() / (float) width;
            Timber.tag(TAG).d("resizeRatio " + resizeRatio);
        }
        // Create canvas to draw
        Canvas canvas = new Canvas(bm);
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.STROKE);
        // Loop result list

        Rect bounds = new Rect();
        bounds.left = (int) (ret.getLeft() * resizeRatio);
        bounds.top = (int) (ret.getTop() * resizeRatio);
        bounds.right = (int) (ret.getRight() * resizeRatio);
        bounds.bottom = (int) (ret.getBottom() * resizeRatio);

        double rectHeight = bounds.right - bounds.left;
        double rectWidth = bounds.top - bounds.bottom;

        Log.d(TAG, "Rect : " + bounds.toString());
        Log.d(TAG, "Height : " + rectHeight);
        Log.d(TAG, "Width : " + rectWidth);

        canvas.drawRect(bounds, paint);

        return new BitmapDrawable(getResources(), bm);
    }

    @DebugLog
    protected Bitmap getResizedBitmap(Bitmap bm, int newWidth, int newHeight) {
        Bitmap resizedBitmap = Bitmap.createScaledBitmap(bm, newWidth, newHeight, true);
        return resizedBitmap;
    }


}




