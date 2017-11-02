package com.tzutalin.customicon.Utils.Decos;

import android.widget.ImageView;

import com.tzutalin.customicon.Utils.DecoImage.DecoEye;
import com.tzutalin.customicon.Utils.DecoImage.DecoEyebrow;
import com.tzutalin.customicon.Utils.DecoImage.DecoMouth;
import com.tzutalin.customicon.Utils.DecoImage.DecoNose;
import com.tzutalin.customicon.Utils.Shape.ShapeData;

import java.util.Arrays;

/**
 * Created by Pixeleye_server on 2017-11-02.
 */

public class Deco {
    private ImageView[] decoEyebrows;
    private ImageView[] decoEyes;
    private ImageView[] decoNoses;
    private ImageView[] decoMouths;
    private ShapeData shapeData; //face shpae data
    private DecoEyebrow[] emoEyebrows;
    private DecoEye[] emoEyes;
    private DecoNose[] emoNoses;
    private DecoMouth[] emoMouths; //these object sort

    public Deco() {
    }

    public Deco(ImageView[] decoEyebrows, ImageView[] decoEyes, ImageView[] decoNoses, ImageView[] decoMouths, ShapeData shapeData) {
        this.decoEyebrows = decoEyebrows;
        this.decoEyes = decoEyes;
        this.decoNoses = decoNoses;
        this.decoMouths = decoMouths;
        this.shapeData = shapeData;

        emoEyebrows = new DecoEyebrow[4];
        emoEyes = new DecoEye[4];
        emoNoses = new DecoNose[4];
        emoMouths = new DecoMouth[4];

        for (int i = 0; i < emoEyebrows.length; i++) emoEyebrows[i] = new DecoEyebrow();
        for (int i = 0; i < emoEyes.length; i++) emoEyes[i] = new DecoEye();
        for (int i = 0; i < emoNoses.length; i++) emoNoses[i] = new DecoNose();
        for (int i = 0; i < emoMouths.length; i++) emoMouths[i] = new DecoMouth();
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
