package com.tzutalin.customicon.Utils.Decos;

import android.util.Log;
import android.widget.ImageView;

import com.tzutalin.customicon.R;
import com.tzutalin.customicon.Utils.DecoImage.DecoEye;
import com.tzutalin.customicon.Utils.DecoImage.DecoEyebrow;
import com.tzutalin.customicon.Utils.DecoImage.DecoImage;
import com.tzutalin.customicon.Utils.DecoImage.DecoMouth;
import com.tzutalin.customicon.Utils.DecoImage.DecoNose;
import com.tzutalin.customicon.Utils.Shape.ShapeData;

import java.util.Arrays;

/**
 * Created by DEV on 2017-11-02.
 */
public class RyanDeco extends Deco{
    private ImageView[] decoEyebrows;
    private ImageView[] decoEyes;
    private ImageView[] decoNoses;
    private ImageView[] decoMouths;
    private ShapeData shapeData; //face shpae data
    private DecoEyebrow[] emoEyebrows;
    private DecoEye[] emoEyes;
    private DecoNose[] emoNoses;
    private DecoMouth[] emoMouths; //these object sort

    public RyanDeco() {
    }

    public RyanDeco(ImageView[] decoEyebrows, ImageView[] decoEyes, ImageView[] decoNoses, ImageView[] decoMouths, ShapeData shapeData) {
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
        for(DecoEyebrow tmp : emoEyebrows) Log.d("before sorting : ", String.valueOf(tmp.getSlope()));
        sort(emoEyebrows, emoEyes, emoNoses);
        for(DecoEyebrow tmp : emoEyebrows) Log.d("after sorting : ", String.valueOf(tmp.getSlope()));
        binding();

    }

    public void init() {
        emoEyebrows[0].setResource(R.drawable.ryan_eyebrow1);
        emoEyebrows[1].setResource(R.drawable.ryan_eyebrow2);
        emoEyebrows[2].setResource(R.drawable.ryan_eyebrow3);
        emoEyebrows[3].setResource(R.drawable.ryan_eyebrow4);
        emoEyes[0].setResource(R.drawable.eye1);
        emoEyes[1].setResource(R.drawable.ryan_eye2);
        emoEyes[2].setResource(R.drawable.ryan_eye3);
        emoEyes[3].setResource(R.drawable.ryan_eye4);
        emoNoses[0].setResource(R.drawable.ryan_nose1);
        emoNoses[1].setResource(R.drawable.ryan_nose2);
        emoNoses[2].setResource(R.drawable.ryan_nose3);
        emoNoses[3].setResource(R.drawable.ryan_nose4);

        emoEyebrows[0].setSlope(0);
//        emoEyebrows[0].setLength(10);
        emoEyebrows[1].setSlope(-45);
//        emoEyebrows[1].setLength(10);
        emoEyebrows[2].setSlope(45);
//        emoEyebrows[2].setLength(10);
        emoEyebrows[3].setSlope(-20);
//        emoEyebrows[3].setLength(10);
        emoEyes[0].setSlope(0);
        emoEyes[1].setSlope(0);
        emoEyes[2].setSlope(18);
        emoEyes[3].setSlope(0);
        emoNoses[0].setHeight(100);
        emoNoses[0].setWidth(100);
        emoNoses[1].setHeight(350);
        emoNoses[1].setWidth(100);
        emoNoses[2].setHeight(400);
        emoNoses[2].setWidth(100);
        emoNoses[3].setHeight(600);
        emoNoses[3].setWidth(200);
        for(int i = 0 ; i < 4; i++) {
            emoEyebrows[i].setGap_(shapeData);
            emoEyes[i].setGap_(shapeData);
            emoNoses[i].setGap_(shapeData);
        }
    }

    public void sort(DecoEyebrow[] decoEyebrows, DecoEye[] decoEyes, DecoNose[] decoNoses){
        Arrays.sort(decoEyebrows);
        Arrays.sort(decoEyes);
        Arrays.sort(decoNoses);
    }

    private void binding() {
        for(int i = 0 ; i< emoEyebrows.length ; i++) {
            decoEyebrows[i].setImageResource(emoEyebrows[i].getResource());
            decoEyes[i].setImageResource(emoEyes[i].getResource());
            decoNoses[i].setImageResource(emoNoses[i].getResource());
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
