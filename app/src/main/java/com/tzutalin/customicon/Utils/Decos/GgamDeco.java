package com.tzutalin.customicon.Utils.Decos;

import android.util.Log;
import android.widget.ImageView;

import com.tzutalin.customicon.R;
import com.tzutalin.customicon.Utils.DecoImage.DecoEye;
import com.tzutalin.customicon.Utils.DecoImage.DecoEyebrow;
import com.tzutalin.customicon.Utils.DecoImage.DecoMouth;
import com.tzutalin.customicon.Utils.DecoImage.DecoNose;
import com.tzutalin.customicon.Utils.Shape.ShapeData;

import java.util.Arrays;

/**
 * Created by DEV on 2017-11-02.
 */

public class GgamDeco extends Deco {
    private ImageView[] decoEyebrows;
    private ImageView[] decoEyes;
    private ImageView[] decoNoses;
    private ImageView[] decoMouths;
    private ShapeData shapeData; //face shpae data
    private DecoEyebrow[] emoEyebrows;
    private DecoEye[] emoEyes;
    private DecoNose[] emoNoses;
    private DecoMouth[] emoMouths; //these object sort

    public GgamDeco() {
    }

    public GgamDeco(ImageView[] decoEyebrows, ImageView[] decoEyes, ImageView[] decoNoses, ImageView[] decoMouths, ShapeData shapeData) {
        this.decoEyebrows = decoEyebrows;
        this.decoEyes = decoEyes;
        this.decoNoses = decoNoses;
        this.decoMouths = decoMouths;
        this.shapeData = shapeData;

        emoEyebrows = new DecoEyebrow[4];
        emoEyes = new DecoEye[4];
        emoNoses = new DecoNose[4];
        emoMouths = new DecoMouth[4];

        for(int i = 0 ; i<emoEyebrows.length;i++) emoEyebrows[i] = new DecoEyebrow();
        for(int i = 0 ; i<emoEyes.length;i++) emoEyes[i] = new DecoEye();
        for(int i = 0 ; i<emoNoses.length;i++) emoNoses[i] = new DecoNose();
        for(int i = 0 ; i<emoMouths.length;i++) emoMouths[i] = new DecoMouth();


        init();
        sort(emoEyes, emoMouths);
        binding();

    }

    public void init() {
        emoEyes[0].setResource(R.drawable.eye1);
        emoEyes[1].setResource(R.drawable.ryan_eye2);
        emoEyes[2].setResource(R.drawable.ryan_eye3);
        emoEyes[3].setResource(R.drawable.ryan_eye4);
        emoMouths[0].setResource(R.drawable.ggam_mouth1);
        emoMouths[1].setResource(R.drawable.ggam_mouth2);
        emoMouths[2].setResource(R.drawable.ggam_mouth3);
        emoMouths[3].setResource(R.drawable.ggam_mouth4);


        emoEyes[0].setSlope(0);
        emoEyes[1].setSlope(0);
        emoEyes[2].setSlope(18);
        emoEyes[3].setSlope(0);
        emoMouths[0].setHeight(0);
        emoMouths[1].setHeight(150);
        emoMouths[2].setHeight(200);
        emoMouths[3].setHeight(75);
        for(int i = 0 ; i < 4; i++) {
            emoEyes[i].setGap_(shapeData);
            emoMouths[i].setGap_(shapeData);
        }
    }

    public void sort(DecoEye[] decoEyes, DecoMouth[] decoMouths){
        Arrays.sort(decoEyes);
        Arrays.sort(decoMouths);
    }

    private void binding() {
        for(int i = 0 ; i< emoEyes.length ; i++) {
            decoEyes[i].setImageResource(emoEyes[i].getResource());
            decoMouths[i].setImageResource(emoMouths[i].getResource());
        }
    }

    public DecoEyebrow[] getEmoEyebrows() {
        return emoEyebrows;
    }

    public DecoEye[] getEmoEyes() {
        return emoEyes;
    }

    public DecoNose[] getEmoNoses() {
        return emoNoses;
    }

    public DecoMouth[] getEmoMouths() {
        return emoMouths;
    }
}
