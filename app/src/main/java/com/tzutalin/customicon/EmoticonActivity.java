package com.tzutalin.customicon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.tzutalin.customicon.Utils.Shape.ShapeData;

import org.aspectj.lang.reflect.InterTypeConstructorDeclaration;

/**
 * Created by DEV on 2017-10-31.
 */

public class EmoticonActivity extends AppCompatActivity {

    private ShapeData shapeData;
    private boolean isDeveloping;

    private ImageView ryan;
    private ImageView ggam;
    private ImageView rabbit;
    private ImageView jibang;

    Intent nextIntent = new Intent(getApplicationContext(), DecoActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emoticon);

        init();

        Intent intent = getIntent();
        isDeveloping = intent.getExtras().getBoolean("isDeveloping");

        shapeData = (ShapeData) intent.getSerializableExtra("shapeData");
        nextIntent.putExtra("shapeData", shapeData);


//        ryan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(nextIntent);
//            }
//        });
//
//        jibang.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(nextIntent);
//            }
//        });
//
//        rabbit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(nextIntent);
//            }
//        });
//
//        ggam.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(nextIntent);
//            }
//        });

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
            if (isDeveloping) {
                switch (v.getId()) {
                    case R.id.user_image1:
                        break;
                    case R.id.user_image2:
                        break;
                    case R.id.user_image3:
                        break;
                    case R.id.user_image4:
                        break;
                }
            } else {
                switch (v.getId()) {
                    case R.id.user_image1:
                        startActivity(nextIntent);
                        break;
                    case R.id.user_image2:
                        startActivity(nextIntent);
                        break;
                    case R.id.user_image3:
                        startActivity(nextIntent);
                        break;
                    case R.id.user_image4:
                        startActivity(nextIntent);
                        break;
                }
            }
        }
    };
}
