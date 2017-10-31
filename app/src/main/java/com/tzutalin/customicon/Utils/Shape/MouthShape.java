package com.tzutalin.customicon.Utils.Shape;

import android.graphics.Point;

import java.util.List;

/**
 * Created by pixeleye02 on 2017-10-31.
 */

public class MouthShape extends Shape {

    private List<Point> points;
    private Point left;
    private Point right;
    private Point top;
    private Point bottom;
    private double width;
    private double height;

    public MouthShape(List<Point> landmarks) {
        points = landmarks;
        left = points.get(46);
        right = points.get(54);
        top = calMidPoint(points.get(50), points.get(52));
        bottom = points.get(57);

        setShape();
    }

    public void setShape() {
        width = calDistance(left, right);
        height = calDistance(top, bottom);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
