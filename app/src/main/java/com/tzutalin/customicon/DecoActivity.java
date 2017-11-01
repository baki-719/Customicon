package com.tzutalin.customicon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.tzutalin.customicon.Utils.CustomClass.CustomImageView;
import com.tzutalin.customicon.Utils.Decos.RyanDeco;
import com.tzutalin.customicon.Utils.Shape.ShapeData;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by pixeleye02 on 2017-10-31.
 */

// TODO: 2017-10-31 sort face component to shapeData
// TODO: 2017-11-02 function which is chage image when select image
public class DecoActivity extends AppCompatActivity {

    @BindView(R.id.confirm)
    Button confrimBtn;
    //    eyeborw
    CustomImageView[] eyebrowViews;
    //    eye
    CustomImageView[] eyeViews;
    //    nose
    CustomImageView[] noseViews;
    //    mouth
    CustomImageView[] mouthViews;

    private String TAG = "DecoActivity";
    private int DONT_SELECT_DECO = 999;

    private boolean[] bitList = new boolean[16];
    private ShapeData shapeData;
    private int emoticon;

    private int selectedEyebrow = DONT_SELECT_DECO;
    private int selectedEye = DONT_SELECT_DECO;
    private int selectedNose = DONT_SELECT_DECO;
    private int selectedMouth = DONT_SELECT_DECO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deco);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        shapeData = (ShapeData) intent.getSerializableExtra("shapeData");
        emoticon = intent.getExtras().getInt("emoticon");
        eyebrowViews = new CustomImageView[]{( (CustomImageView) findViewById(R.id.eyebrow1))
                , (CustomImageView) findViewById(R.id.eyebrow2)
                , (CustomImageView) findViewById(R.id.eyebrow3)
                , (CustomImageView) findViewById(R.id.eyebrow4)};
        eyeViews =  new CustomImageView[] {(CustomImageView) findViewById(R.id.eye1)
                , (CustomImageView) findViewById(R.id.eye2)
                , (CustomImageView) findViewById(R.id.eye3)
                , (CustomImageView) findViewById(R.id.eye4)
        };
       noseViews = new CustomImageView[]{(CustomImageView) findViewById(R.id.nose1)
               , (CustomImageView) findViewById(R.id.nose2)
               , (CustomImageView) findViewById(R.id.nose3)
               , (CustomImageView) findViewById(R.id.nose4)
       };
       mouthViews  = new CustomImageView[]{(CustomImageView) findViewById(R.id.mouth1)
               , (CustomImageView) findViewById(R.id.mouth2)
               , (CustomImageView) findViewById(R.id.mouth3)
               , (CustomImageView) findViewById(R.id.mouth4)
       };
       setEmoticon(emoticon);
    }

    protected void setEmoticon(int emoticon) {
        switch (emoticon) {
            case 1: //ryan
                RyanDeco ryanDeco = new RyanDeco(eyebrowViews, eyeViews, noseViews, mouthViews);
                break;
            case 2: //ggam
                break;
            case 3: //rabbit
                break;
            case 4: //jibang
                break;
        }
    }

    @OnClick(R.id.confirm)
    void clickedConfirmBtn() {
        if (selectedEyebrow == DONT_SELECT_DECO || selectedEye == DONT_SELECT_DECO || selectedNose == DONT_SELECT_DECO || selectedMouth == DONT_SELECT_DECO)
            Toast.makeText(DecoActivity.this, "Pick image plz", Toast.LENGTH_SHORT).show();
        else {
            Intent intent = new Intent(DecoActivity.this, ResultActivity.class);
            int[] selectedDeco = {selectedEyebrow
                    , selectedEye
                    , selectedNose
                    , selectedMouth};
            intent.putExtra("selectedDeco", selectedDeco);
            startActivity(intent);
        }
    }

    @OnClick({R.id.eyebrow1, R.id.eyebrow2, R.id.eyebrow3, R.id.eyebrow4, R.id.eye1, R.id.eye2, R.id.eye3, R.id.eye4, R.id.nose1, R.id.nose2, R.id.nose3, R.id.nose4, R.id.mouth1, R.id.mouth2, R.id.mouth3, R.id.mouth4})
    void imageViewsClick(View v) {
        switch (v.getId()) {
            case R.id.eyebrow1:
                selectedEyebrow = 1;
                break;
            case R.id.eyebrow2:
                selectedEyebrow = 2;
                break;
            case R.id.eyebrow3:
                selectedEyebrow = 3;
                break;
            case R.id.eyebrow4:
                selectedEyebrow = 4;
                break;
            case R.id.eye1:
                selectedEye = 1;
                break;
            case R.id.eye2:
                selectedEye = 2;
                break;
            case R.id.eye3:
                selectedEye = 3;
                break;
            case R.id.eye4:
                selectedEye = 4;
                break;
            case R.id.nose1:
                selectedNose = 1;
                break;
            case R.id.nose2:
                selectedNose = 2;
                break;
            case R.id.nose3:
                selectedNose = 3;
                break;
            case R.id.nose4:
                selectedNose = 4;
                break;
            case R.id.mouth1:
                selectedMouth = 1;
                break;
            case R.id.mouth2:
                selectedMouth = 2;
                break;
            case R.id.mouth3:
                selectedMouth = 3;
                break;
            case R.id.mouth4:
                selectedMouth = 4;
                break;
        }
    }
}
