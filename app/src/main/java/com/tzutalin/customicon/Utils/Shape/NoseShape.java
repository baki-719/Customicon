package com.tzutalin.customicon.Utils.Shape;

import android.graphics.Point;

import java.util.List;

/**
 * Created by pixeleye02 on 2017-10-31.
 */

public class NoseShape extends Shape {
    private List<Point> points;
    private Point left;
    private Point right;
    private Point top;
    private Point bottom;
    private double height;
    private double width;

    public NoseShape(List<Point> landmarks) {
        points = landmarks;
        left = points.get(4);
        right = points.get(8);
        top = points.get(0);
        bottom = points.get(6);

        setShape();
    }

    public void setShape() {
        width = calDistance(left, right);
        height = calDistance(top, bottom);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
