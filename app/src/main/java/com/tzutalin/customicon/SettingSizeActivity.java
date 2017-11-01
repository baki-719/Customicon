package com.tzutalin.customicon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Pixeleye_server on 2017-11-01.
 */

public class SettingSizeActivity extends AppCompatActivity {

    private EditText top;
    private EditText bottom;
    private EditText left;
    private EditText right;
    private Button button;

    private int topSize;
    private int bottomSize;
    private int leftSize;
    private int rightSize;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_size);

        init();


    }

    protected void init() {
        top = (EditText) findViewById(R.id.editTextTop);
        bottom = (EditText) findViewById(R.id.editTextBottom);
        left = (EditText) findViewById(R.id.editTextLeft);
        right = (EditText) findViewById(R.id.editTextRight);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            topSize = Integer.parseInt(top.getText().toString());
            bottomSize = Integer.parseInt(bottom.getText().toString());
            leftSize = Integer.parseInt(left.getText().toString());
            rightSize = Integer.parseInt(right.getText().toString());

            Intent intent = new Intent(SettingSizeActivity.this, RectEmoticonActivity.class);
            intent.putExtra("top",topSize);
            intent.putExtra("bottom", bottomSize);
            intent.putExtra("left", leftSize);
            intent.putExtra("right", rightSize);

            startActivity(intent);

        }
    };
}
