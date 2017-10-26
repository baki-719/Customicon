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
    private Map shape;

    public EyeShape(List<Point> landmarks) {
        points = landmarks;
        front = landmarks.get(0);
        back = landmarks.get(3);
        top = calMid(landmarks.get(1), landmarks.get(2));
        bottom = calMid(landmarks.get(4), landmarks.get(5));
    }

    public Point calMid(Point front, Point back) {
        Point tmp = null;
        return tmp;
    }



    public double calSlope(Point a, Point b) {
        int slope = (b.y - a.y)/(b.x - a.x);
        if(slope < 0) slope = slope*(-1);

        return slope;
    }

    public void setShape() {
        shape.put("height", calDistance(top, bottom));
        shape.put("weight", calDistance(front, back));
        shape.put("slope", calSlope(front, back));
    }

    public Map getShape() {
        return shape;
    }

}
