package com.tzutalin.customicon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.tzutalin.customicon.Utils.Shape.ShapeData;

import org.aspectj.lang.reflect.InterTypeConstructorDeclaration;

/**
 * Created by DEV on 2017-10-31.
 */

public class EmoticonActivity extends AppCompatActivity{

    private ShapeData shapeData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emoticon);

        Intent intent = getIntent();
        shapeData = (ShapeData) intent.getSerializableExtra("shapeData");

        ImageView ryan = (ImageView) findViewById(R.id.user_image1);
        GlideDrawableImageViewTarget gifImage1 = new GlideDrawableImageViewTarget(ryan);
        Glide.with(this).load(R.drawable.ryan).into(gifImage1);

        ImageView ggam = (ImageView) findViewById(R.id.user_image2);
        GlideDrawableImageViewTarget gifImage2 = new GlideDrawableImageViewTarget(ggam);
        Glide.with(this).load(R.drawable.ggam).into(gifImage2);

        ImageView rabbit = (ImageView) findViewById(R.id.user_image3);
        GlideDrawableImageViewTarget gifImage3 = new GlideDrawableImageViewTarget(rabbit);
        Glide.with(this).load(R.drawable.rabbit).into(gifImage3);

        ImageView jibang = (ImageView) findViewById(R.id.user_image4);
        GlideDrawableImageViewTarget gifImage4 = new GlideDrawableImageViewTarget(jibang);
        Glide.with(this).load(R.drawable.jibang).into(gifImage4);

        ryan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DecoActivity.class);
                intent.putExtra("shapeData",shapeData);
                startActivity(intent);
            }
        });

        jibang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DecoActivity.class);
                intent.putExtra("shapeData",shapeData);
                startActivity(intent);
            }
        });

        rabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DecoActivity.class);
                intent.putExtra("shapeData",shapeData);
                startActivity(intent);
            }
        });

        ggam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DecoActivity.class);
                intent.putExtra("shapeData",shapeData);
                startActivity(intent);
            }
        });
    }
}
