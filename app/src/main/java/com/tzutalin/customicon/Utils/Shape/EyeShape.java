package com.tzutalin.customicon.Utils.Shape;

import android.graphics.Point;

import java.util.List;
import java.util.Map;

/**
 * Created by DEV on 2017-10-25.
 */


// TODO: 2017-10-27 have to restart at first
public class EyeShape extends Shape{
    private List<Point> points;
    private Point front;
    private Point back;
    private Point top;
    private Point bottom;
    private double slope;
    private double height;
    private double width;

    public EyeShape(List<Point> landmarks) {
        points = landmarks;
        front = landmarks.get(0);
        back = landmarks.get(3);
        top = calMidPoint(landmarks.get(1), landmarks.get(2));
        bottom = calMidPoint(landmarks.get(4), landmarks.get(5));

        setShape();
    }

    public void setShape() {
        height = calDistance(top, bottom);
        width = calDistance(front, back);
        slope = calSlope(front, back);
    }

    public double getSlope() {
        return slope;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
