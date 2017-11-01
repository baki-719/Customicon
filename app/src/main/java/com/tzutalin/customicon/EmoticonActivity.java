package com.tzutalin.customicon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.tzutalin.customicon.Utils.Dev.Dev;
import com.tzutalin.customicon.Utils.Shape.ShapeData;

import org.aspectj.lang.reflect.InterTypeConstructorDeclaration;

/**
 * Created by DEV on 2017-10-31.
 */

public class EmoticonActivity extends AppCompatActivity {

    private ShapeData shapeData;
    private Dev dev = new Dev();

    private ImageView ryan;
    private ImageView ggam;
    private ImageView rabbit;
    private ImageView jibang;

    private Intent nextIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emoticon);

        init();
        Intent tmpIntent = getIntent();
        nextIntent = new Intent(getApplicationContext(), DecoActivity.class);

        shapeData = (ShapeData) tmpIntent.getSerializableExtra("shapeData");
        nextIntent.putExtra("shapeData", shapeData);


    }

    private void init() {
        ryan = (ImageView) findViewById(R.id.user_image1);
        ryan.setOnClickListener(mClickListener);
        GlideDrawableImageViewTarget gifImage1 = new GlideDrawableImageViewTarget(ryan);
        Glide.with(this).load(R.drawable.ryan).into(gifImage1);

        ggam = (ImageView) findViewById(R.id.user_image2);
        ggam.setOnClickListener(mClickListener);
        GlideDrawableImageViewTarget gifImage2 = new GlideDrawableImageViewTarget(ggam);
        Glide.with(this).load(R.drawable.ggam).into(gifImage2);

        rabbit = (ImageView) findViewById(R.id.user_image3);
        rabbit.setOnClickListener(mClickListener);
        GlideDrawableImageViewTarget gifImage3 = new GlideDrawableImageViewTarget(rabbit);
        Glide.with(this).load(R.drawable.rabbit).into(gifImage3);

        jibang = (ImageView) findViewById(R.id.user_image4);
        jibang.setOnClickListener(mClickListener);
        GlideDrawableImageViewTarget gifImage4 = new GlideDrawableImageViewTarget(jibang);
        Glide.with(this).load(R.drawable.jibang).into(gifImage4);

    }

    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (dev.isDeveloping()) {
                Intent tmpIntent = new Intent(EmoticonActivity.this, SettingSizeActivity.class);
                switch (v.getId()) {
                    case R.id.user_image1:
                        tmpIntent.putExtra("emoticon", 1);
                        startActivity(tmpIntent);
                        break;
                    case R.id.user_image2:
                        break;
                    case R.id.user_image3:
                        break;
                    case R.id.user_image4:
                        break;
                }
            } else {
                int emoticonNum = 9;
                switch (v.getId()) {
                    case R.id.user_image1:
                        emoticonNum = 1; //1. ryan
                        break;
                    case R.id.user_image2:
                        emoticonNum = 2; //2. ggam
                        break;
                    case R.id.user_image3:
                        emoticonNum = 3; //3.rabbit
                        break;
                    case R.id.user_image4:
                        emoticonNum = 4; //4.jibang
                        break;
                }
                nextIntent.putExtra("emoticon", emoticonNum);
                startActivity(nextIntent);
            }
        }
    };
}
