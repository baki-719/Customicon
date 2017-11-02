package com.tzutalin.customicon.Utils.DecoImage;

import android.util.Log;

import com.tzutalin.customicon.Utils.Shape.ShapeData;

/**
 * Created by DEV on 2017-11-01.
 */

public class DecoNose extends DecoImage {

    private static final String TYPE = "nose";

    public DecoNose() {
    }

    public DecoNose(double height, double width) {
        super.setHeight(height);
        super.setWidth(width);
        super.setType(TYPE);
    }

    public void setGap_(ShapeData shapeData){
        super.setGap(changeGap(shapeData));
    }

    private double changeGap(ShapeData shapeData) {
        double gap = Math.abs(Math.abs(getWidth()*getHeight()) - Math.abs(shapeData.getNoseHeight()*shapeData.getNoseWidth()));
        Log.d("Nose gap : ", String.valueOf(gap));
        return gap;
    }
}
