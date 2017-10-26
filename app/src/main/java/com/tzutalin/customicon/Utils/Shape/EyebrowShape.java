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



    public double calSlope(Point a, Point b) {
        double deltaX = b.y - a.y;
        double deltaY = b.x - a.x;

        double slope =  deltaY / deltaX ;

        return slope;
    }

    public void setShape() {
        double dis = calDistance(mid, top);
        double slope = calSlope(front, back);

        shape.put("distance", dis);
        shape.put("slope", slope);
    }


}
