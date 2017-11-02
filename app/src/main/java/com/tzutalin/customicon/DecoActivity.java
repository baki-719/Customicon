package com.tzutalin.customicon;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tzutalin.customicon.Utils.Decos.Deco;
import com.tzutalin.customicon.Utils.Decos.GgamDeco;
import com.tzutalin.customicon.Utils.Decos.RyanDeco;
import com.tzutalin.customicon.Utils.Shape.ShapeData;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by pixeleye02 on 2017-10-31.
 */

public class DecoActivity extends AppCompatActivity {

    @BindView(R.id.confirm)
    Button confirmBtn;
    //    eyebrow
    ImageView[] eyebrowViews;
    //    eye
    ImageView[] eyeViews;
    //    nose
    ImageView[] noseViews;
    //    mouth
    ImageView[] mouthViews;
    @BindView(R.id.eyebrow_text)
    TextView eyebrowText;
    @BindView(R.id.eye_text)
    TextView eyeText;
    @BindView(R.id.nose_text)
    TextView noseText;
    @BindView(R.id.mouth_text)
    TextView mouthText;

    private String TAG = "DecoActivity";
    private int DONT_SELECT_DECO = 999;

    private boolean intentCondition;
    private boolean[] bitList = new boolean[16];
    private ShapeData shapeData;
    private int emoticon;

    private Deco tmpDeco;

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
        eyebrowViews = new ImageView[]{((ImageView) findViewById(R.id.eyebrow1))
                , (ImageView) findViewById(R.id.eyebrow2)
                , (ImageView) findViewById(R.id.eyebrow3)
                , (ImageView) findViewById(R.id.eyebrow4)};
        eyeViews = new ImageView[]{(ImageView) findViewById(R.id.eye1)
                , (ImageView) findViewById(R.id.eye2)
                , (ImageView) findViewById(R.id.eye3)
                , (ImageView) findViewById(R.id.eye4)
        };
        noseViews = new ImageView[]{(ImageView) findViewById(R.id.nose1)
                , (ImageView) findViewById(R.id.nose2)
                , (ImageView) findViewById(R.id.nose3)
                , (ImageView) findViewById(R.id.nose4)
        };
        mouthViews = new ImageView[]{(ImageView) findViewById(R.id.mouth1)
                , (ImageView) findViewById(R.id.mouth2)
                , (ImageView) findViewById(R.id.mouth3)
                , (ImageView) findViewById(R.id.mouth4)
        };
        setEmoticon(emoticon);
    }

    protected void setEmoticon(int emoticon) {
        switch (emoticon) {
            case 1: //ryan
                tmpDeco = new RyanDeco(eyebrowViews, eyeViews, noseViews, mouthViews, shapeData);
                mouthText.setVisibility(View.GONE);
                for (int i = 0; i < mouthViews.length; i++) mouthViews[i].setVisibility(View.GONE);
                break;
            case 2: //ggam
                tmpDeco = new GgamDeco(eyebrowViews, eyeViews, noseViews, mouthViews, shapeData);
                eyebrowText.setVisibility(View.GONE);
                noseText.setVisibility(View.GONE);
                for (int i = 0; i < eyebrowViews.length; i++) eyebrowViews[i].setVisibility(View.GONE);
                for (int i = 0; i < mouthViews.length; i++) noseViews[i].setVisibility(View.GONE);
                break;
            case 3: //rabbit
                break;
            case 4: //jibang
                break;
        }
    }

    @OnClick(R.id.confirm)
    void clickedConfirmBtn() {
        setIntentCondition();
        if (!intentCondition)
            Toast.makeText(DecoActivity.this, "Pick deco plz", Toast.LENGTH_SHORT).show();
        else {
            Intent intent = new Intent(DecoActivity.this, ResultActivity.class);
            int[] selectedDeco = {selectedEyebrow
                    , selectedEye
                    , selectedNose
                    , selectedMouth};
            intent.putExtra("emoticon", emoticon);
            intent.putExtra("selectedDeco", selectedDeco);
            startActivity(intent);
        }
    }

    private void setIntentCondition() {
        switch (emoticon) {
            case 1: //ryan
                intentCondition = (selectedEyebrow != DONT_SELECT_DECO
                        && selectedEye != DONT_SELECT_DECO
                        && selectedNose != DONT_SELECT_DECO);
                break;
            case 2: //ggam
                intentCondition = (selectedEye != DONT_SELECT_DECO
                        && selectedMouth != DONT_SELECT_DECO);

                break;
        }
    }

    @OnClick({R.id.eyebrow1, R.id.eyebrow2, R.id.eyebrow3, R.id.eyebrow4, R.id.eye1, R.id.eye2, R.id.eye3, R.id.eye4, R.id.nose1, R.id.nose2, R.id.nose3, R.id.nose4, R.id.mouth1, R.id.mouth2, R.id.mouth3, R.id.mouth4})
    void imageViewsClick(View v) {
        switch (v.getId()) {
            case R.id.eyebrow1:
                selectedEyebrow = tmpDeco.getEmoEyebrows()[0].getResource();
                setBaseBackground(eyebrowViews);
                eyebrowViews[0].setBackgroundColor(Color.GRAY);
                break;
            case R.id.eyebrow2:
                selectedEyebrow = tmpDeco.getEmoEyebrows()[1].getResource();
                setBaseBackground(eyebrowViews);
                eyebrowViews[1].setBackgroundColor(Color.GRAY);
                break;
            case R.id.eyebrow3:
                selectedEyebrow = tmpDeco.getEmoEyebrows()[2].getResource();
                setBaseBackground(eyebrowViews);
                eyebrowViews[2].setBackgroundColor(Color.GRAY);
                break;
            case R.id.eyebrow4:
                selectedEyebrow = tmpDeco.getEmoEyebrows()[3].getResource();
                setBaseBackground(eyebrowViews);
                eyebrowViews[3].setBackgroundColor(Color.GRAY);
                break;
            case R.id.eye1:
                selectedEye = tmpDeco.getEmoEyes()[0].getResource();
                setBaseBackground(eyeViews);
                eyeViews[0].setBackgroundColor(Color.GRAY);
                break;
            case R.id.eye2:
                selectedEye = tmpDeco.getEmoEyes()[1].getResource();
                setBaseBackground(eyeViews);
                eyeViews[1].setBackgroundColor(Color.GRAY);
                break;
            case R.id.eye3:
                selectedEye = tmpDeco.getEmoEyes()[2].getResource();
                setBaseBackground(eyeViews);
                eyeViews[2].setBackgroundColor(Color.GRAY);
                break;
            case R.id.eye4:
                selectedEye = tmpDeco.getEmoEyes()[3].getResource();
                setBaseBackground(eyeViews);
                eyeViews[3].setBackgroundColor(Color.GRAY);
                break;
            case R.id.nose1:
                selectedNose = tmpDeco.getEmoNoses()[0].getResource();
                setBaseBackground(noseViews);
                noseViews[0].setBackgroundColor(Color.GRAY);
                break;
            case R.id.nose2:
                selectedNose = tmpDeco.getEmoNoses()[1].getResource();
                setBaseBackground(noseViews);
                noseViews[1].setBackgroundColor(Color.GRAY);
                break;
            case R.id.nose3:
                selectedNose = tmpDeco.getEmoNoses()[2].getResource();
                setBaseBackground(noseViews);
                noseViews[2].setBackgroundColor(Color.GRAY);
                break;
            case R.id.nose4:
                selectedNose = tmpDeco.getEmoNoses()[3].getResource();
                setBaseBackground(noseViews);
                noseViews[3].setBackgroundColor(Color.GRAY);
                break;
            case R.id.mouth1:
                selectedMouth = tmpDeco.getEmoMouths()[0].getResource();
                setBaseBackground(mouthViews);
                mouthViews[0].setBackgroundColor(Color.GRAY);
                break;
            case R.id.mouth2:
                selectedMouth = tmpDeco.getEmoMouths()[1].getResource();
                setBaseBackground(mouthViews);
                mouthViews[1].setBackgroundColor(Color.GRAY);
                break;
            case R.id.mouth3:
                selectedMouth = tmpDeco.getEmoMouths()[2].getResource();
                setBaseBackground(mouthViews);
                mouthViews[2].setBackgroundColor(Color.GRAY);
                break;
            case R.id.mouth4:
                selectedMouth = tmpDeco.getEmoMouths()[3].getResource();
                setBaseBackground(mouthViews);
                mouthViews[3].setBackgroundColor(Color.GRAY);
                break;
        }
    }

    private void setBaseBackground(ImageView[] imageViews) {
        for (int i = 0; i < imageViews.length; i++)
            imageViews[i].setBackgroundColor(Color.rgb(172, 235, 244));
    }


}
