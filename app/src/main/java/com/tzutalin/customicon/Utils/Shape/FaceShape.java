package com.tzutalin.customicon.Utils.Shape;

import android.graphics.Point;

import java.util.List;

/**
 * Created by DEV on 2017-10-27.
 */

public class FaceShape extends Shape {
    private Point left;
    private Point right;
    private Point bottom;
    private double height;
    private double width;


    public FaceShape(List<Point> landmarks) {
        this.left = landmarks.get(0);
        this.right = landmarks.get(16);
        this.bottom = landmarks.get(8);

        cal();
        setShape();
    }

    public void cal(){
        calMidPoint(left, right);
        height = calDistance(mid, bottom);
        width = calDistance(left, right);
    }

    public void setShape() {
        shape.put("height", height);
        shape.put("width", width);
        shape.put("ratio", height/width);
    }


}
