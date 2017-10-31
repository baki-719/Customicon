package com.tzutalin.customicon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.tzutalin.customicon.Utils.Shape.ShapeData;

/**
 * Created by pixeleye02 on 2017-10-31.
 */

public class DecoActivity extends AppCompatActivity{

    private boolean[] bitList = new boolean[16];
    private ShapeData shapeData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deco);

        Intent intent = getIntent();
        shapeData = (ShapeData) intent.getSerializableExtra("shapeData");

        findViewById(R.id.confirm).setOnClickListener(mClickListner);
        findViewById(R.id.eyebrow1).setOnClickListener(mClickListner);
        findViewById(R.id.eyebrow2).setOnClickListener(mClickListner);
        ImageView eyebrow3 = (ImageView) findViewById(R.id.eyebrow3);
        ImageView eyebrow4 = (ImageView) findViewById(R.id.eyebrow4);

        ImageView eye1 = (ImageView) findViewById(R.id.eye1);
        ImageView eye2 = (ImageView) findViewById(R.id.eye2);
        ImageView eye3 = (ImageView) findViewById(R.id.eye3);
        ImageView eye4 = (ImageView) findViewById(R.id.eye4);

        ImageView nose1 = (ImageView) findViewById(R.id.nose1);
        ImageView nose2 = (ImageView) findViewById(R.id.nose2);
        ImageView nose3 = (ImageView) findViewById(R.id.nose3);
        ImageView nose4 = (ImageView) findViewById(R.id.nose4);

        ImageView mouth1 = (ImageView) findViewById(R.id.mouth1);
        ImageView mouth2 = (ImageView) findViewById(R.id.mouth2);
        ImageView mouth3 = (ImageView) findViewById(R.id.mouth3);
        ImageView mouth4 = (ImageView) findViewById(R.id.mouth4);


    }

    Button.OnClickListener mClickListner = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.eyebrow1:
                    bitList[0] = true;
                    break;
                case R.id.confirm:
                    Intent intent = new Intent(DecoActivity.this, ResultActivity.class);
                    intent.putExtra("value", bitList);
                    startActivity(intent);
                    break;

            }
        }
    };
}
