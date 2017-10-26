package com.tzutalin.customicon.Utils.Shape;

import android.graphics.Point;

import java.util.ArrayList;

/**
 * Created by DEV on 2017-10-27.
 */

public class FaceShape extends Shape {
    private Point left;
    private Point right;
    private Point bottom;
    private double height;
    private double weight;


    public FaceShape(ArrayList<Point> landmarks) {
        this.left = landmarks.get(0);
        this.right = landmarks.get(16);
        this.bottom = landmarks.get(8);

        cal();
        setShape();
    }

    public void cal(){
        calMidPoint(left, right);
        height = calDistance(mid, bottom);
        weight = calDistance(left, right);
    }

    public void setShape() {
        shape.put("height", height);
        shape.put("weight", weight);
    }


}
