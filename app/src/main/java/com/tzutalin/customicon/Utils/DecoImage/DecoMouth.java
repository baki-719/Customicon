package com.tzutalin.customicon.Utils.DecoImage;

import android.util.Log;

import com.tzutalin.customicon.Utils.Shape.ShapeData;

/**
 * Created by DEV on 2017-11-01.
 */

public class DecoMouth extends DecoImage {

    private static final String TYPE = "mouth";

    public DecoMouth() {
    }

    public DecoMouth(double height, double width) {
        super.setHeight(height);
        super.setWidth(width);
        super.setType(TYPE);
    }


    public void setGap_(ShapeData shapeData){
        super.setGap(changeGap(shapeData));
    }

    private double changeGap(ShapeData shapeData) {
        double gap = Math.abs(getHeight() - shapeData.getMouthHeight());
        Log.d("Mouth gap : ", String.valueOf(gap));
        return gap;
    }

}
