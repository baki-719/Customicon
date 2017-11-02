package com.tzutalin.customicon.Utils.DecoImage;

import android.util.Log;

import com.tzutalin.customicon.Utils.Shape.Shape;
import com.tzutalin.customicon.Utils.Shape.ShapeData;

/**
 * Created by DEV on 2017-11-01.
 */

public class DecoEyebrow extends DecoImage {

    private static final String TYPE = "eyebrow";

    public DecoEyebrow() {
    }

    public DecoEyebrow(double slope, double length) {
        super.setSlope(slope);
        super.setLength(length);
        super.setType(TYPE);
    }

    public void setGap_(ShapeData shapeData){
        super.setGap(changeGap(shapeData));
    }

    private double changeGap(ShapeData shapeData) {
        double gap = Math.abs(getSlope() - shapeData.getEyebrowSlope());
        Log.d("Eyebrow gap : ", String.valueOf(gap));
        return gap;
    }

}
