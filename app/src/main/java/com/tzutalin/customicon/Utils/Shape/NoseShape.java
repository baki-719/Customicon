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
        left = points.get(31);
        right = points.get(35);
        top = points.get(27);
        bottom = points.get(33);

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
