package com.tzutalin.customicon.Utils.Shape;

import android.graphics.Point;

import java.util.List;

/**
 * Created by DEV on 2017-10-25.
 */

public class EyebrowShape extends Shape {
    private List<Point> points;
    private Point front;
    private Point back;
    private Point top;
    private double slope;
    private double length;


    public EyebrowShape(List<Point> landmarks) {
        points = landmarks;
        front = points.get(0);
        back = points.get(4);
        top = points.get(2);

        cal();
    }

    public void cal() {
        calMidPoint(front, back);
        setShape();
    }

    public double getSlope() {
        return slope;
    }

    public double getLength() {
        return length;
    }

    public void setShape() {
        length = calDistance(mid, top);
        slope = calSlope(front, back);
    }


}
