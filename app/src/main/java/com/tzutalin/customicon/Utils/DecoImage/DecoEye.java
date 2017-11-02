package com.tzutalin.customicon.Utils.DecoImage;

import android.util.Log;

import com.tzutalin.customicon.Utils.Shape.ShapeData;

/**
 * Created by DEV on 2017-11-01.
 */

public class DecoEye extends DecoImage {

    private static final String TYPE = "eye";

    public DecoEye() {
    }

    public DecoEye(double height, double width, double slope) {
        super.setHeight(height);
        super.setWidth(width);
        super.setSlope(slope);
        super.setType(TYPE);
    }

    public void setGap_(ShapeData shapeData) {super.setGap(changeGap(shapeData));}

    private double changeGap(ShapeData shapeData) {
        double gap;
        gap = Math.abs(getSlope() - shapeData.getEyeSlope());
        Log.d("Eye gap : ", String.valueOf(gap));
        return gap;
    }
}
