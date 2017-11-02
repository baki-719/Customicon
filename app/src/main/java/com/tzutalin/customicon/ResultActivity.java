package com.tzutalin.customicon;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Optional;

/**
 * Created by pixeleye02 on 2017-10-31.
 */

public class ResultActivity extends AppCompatActivity {

    private String TAG = "ResultActivity";
    private int DONT_SELECT_DECO = 999;

    private int[] selectedDeco;
    private int emoticon;
    private int backgroundResource;

    private Bitmap eyebrowRight;
    private Bitmap eyebrowLeft;
    private Bitmap eyeLeft;
    private Bitmap eyeRight;
    private Bitmap nose;
    private Bitmap mouth;
    private Bitmap glasses;
    private Bitmap background;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        emoticon = intent.getExtras().getInt("emoticon");
        selectedDeco = intent.getExtras().getIntArray("selectedDeco");
        Log.d(TAG, String.valueOf(emoticon));

        setBackground(emoticon);

        setContentView(new ResultView(this));
    }

    private void setBackground(int emoticon){
        switch (emoticon) {
            case 1: //ryan
                backgroundResource = R.drawable.ryan_emoticon2;
                break;
            case 2: //ggam
                backgroundResource = R.drawable.ggam_emoticon2;
                break;
        }
    }

    private class ResultView extends View {

        public ResultView(Context context) {
            super(context);
            Resources resources = context.getResources();
            switch(emoticon){
                case 1:
                    background = BitmapFactory.decodeResource(resources, backgroundResource);
                    eyebrowRight = BitmapFactory.decodeResource(resources, selectedDeco[0]);
                    eyebrowLeft = BitmapFactory.decodeResource(resources, selectedDeco[0]);
                    eyeRight = BitmapFactory.decodeResource(resources, selectedDeco[1]);
                    eyeLeft = BitmapFactory.decodeResource(resources, selectedDeco[1]);
                    nose = BitmapFactory.decodeResource(resources, selectedDeco[2]);
                    if(selectedDeco[4]!=DONT_SELECT_DECO) glasses = BitmapFactory.decodeResource(resources, selectedDeco[4]);
                    break;
                case 2:
                    background = BitmapFactory.decodeResource(resources, backgroundResource);
                    eyeRight = BitmapFactory.decodeResource(resources, selectedDeco[1]);
                    eyeLeft = BitmapFactory.decodeResource(resources, selectedDeco[1]);
                    mouth = BitmapFactory.decodeResource(resources, selectedDeco[3]);
                    if(selectedDeco[4]!=DONT_SELECT_DECO) glasses = BitmapFactory.decodeResource(resources, selectedDeco[4]);
                    break;
            }


        }

        @Override
        protected void onDraw(Canvas canvas) {

            int width = canvas.getWidth();
            int height = canvas.getHeight();

            Matrix sideInversion = new Matrix();
            sideInversion.setScale(-1,1);

            Bitmap eyeLeftInversion;
            Bitmap eyebrowLeftInversion;
            Bitmap resize_background;
            Bitmap resize_nose;
            Bitmap resize_eyeRight;
            Bitmap resize_eyebrowRight;
            Bitmap resize_eyeLeft;
            Bitmap resize_eyebrowLeft;
            Bitmap resize_mouth;
            Bitmap resize_glasses = null;

            switch (emoticon) {
                case 1: // ryan
                    eyeLeftInversion = Bitmap.createBitmap(eyeLeft, 0, 0,
                            eyeLeft.getWidth(), eyeLeft.getHeight(), sideInversion, false);
                    eyebrowLeftInversion = Bitmap.createBitmap(eyebrowLeft, 0, 0,
                            eyebrowLeft.getWidth(), eyebrowLeft.getHeight(), sideInversion, false);

                    resize_background = Bitmap.createScaledBitmap(background, width, height-400, true);
                    resize_nose = Bitmap.createScaledBitmap(nose, 500, 500, true);
                    resize_eyeRight = Bitmap.createScaledBitmap(eyeRight, 300, 300, true);
                    resize_eyebrowRight = Bitmap.createScaledBitmap(eyebrowRight, 200, 200, true);

                    resize_eyeLeft = Bitmap.createScaledBitmap(eyeLeftInversion, 300, 300, true);
                    resize_eyebrowLeft = Bitmap.createScaledBitmap(eyebrowLeftInversion, 200, 200, true);
                    if(selectedDeco[4]!=DONT_SELECT_DECO) resize_glasses = Bitmap.createScaledBitmap(glasses, 600,600, true);

                    canvas.drawBitmap(resize_background, 0, 0, null);
                    canvas.drawBitmap(resize_eyebrowRight, 560, 170, null);
                    canvas.drawBitmap(resize_eyebrowLeft, 310, 170, null);
                    canvas.drawBitmap(resize_eyeRight, 500, 200, null);
                    canvas.drawBitmap(resize_eyeLeft, 270,200,null);
                    canvas.drawBitmap(resize_nose, 280, 250, null);
                    if(selectedDeco[4]!=DONT_SELECT_DECO) canvas.drawBitmap(resize_glasses, 235, 60, null);
                    break;
                case 2: // ggam
                    eyeLeftInversion = Bitmap.createBitmap(eyeLeft, 0, 0,
                            eyeLeft.getWidth(), eyeLeft.getHeight(), sideInversion, false);

                    resize_background = Bitmap.createScaledBitmap(background, width, height-400, true);
                    resize_eyeRight = Bitmap.createScaledBitmap(eyeRight, 300, 300, true);
                    resize_eyeLeft = Bitmap.createScaledBitmap(eyeLeftInversion, 300, 300, true);
                    resize_mouth = Bitmap.createScaledBitmap(mouth, 300, 300, true);
                    if(selectedDeco[4]!=DONT_SELECT_DECO) resize_glasses = Bitmap.createScaledBitmap(glasses, 600,600, true);

                    canvas.drawBitmap(resize_background, 0, 0, null);
                    canvas.drawBitmap(resize_eyeRight, 515, 200, null);
                    canvas.drawBitmap(resize_eyeLeft, 285,200,null);
                    canvas.drawBitmap(resize_mouth, 400, 300, null);
                    if(selectedDeco[4]!=DONT_SELECT_DECO) canvas.drawBitmap(resize_glasses, 245, 60, null);
                    break;
            }

            super.onDraw(canvas);
        }
    }
}
