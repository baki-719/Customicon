package com.tzutalin.customicon.Utils;

import android.graphics.Point;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by DEV on 2017-10-25.
 */

public class EyeShape {
    private ArrayList<Point> points;
    private Point front;
    private Point back;
    private Point top;
    private Point bottom;
    private Map shape;

    public EyeShape(ArrayList<Point> landmarks) {
        points = landmarks;
        front = landmarks.get(0);
        back = landmarks.get(3);
        top = calMid(landmarks.get(1), landmarks.get(2));
        bottom = calMid(landmarks.get(4), landmarks.get(5));
    }

    public Point calMid(Point front, Point back) {
        int midX = calMidPoint(front.x, back.x);
        int midY = calMidPoint(front.y, back.y);
        Point tmp = new Point(midX, midY);
        return tmp;
    }

    public int calMidPoint(int x, int y) {
        int tmp = x + y;
        int result;
        if (tmp < 0) tmp = tmp*(-1); // mark change
        result = tmp/2;
        return  result;
    }

    public double calDistance(Point a, Point b) {
        int disX = a.x - b.x;
        int disY = a.y - b.y;
        double distence = Math.sqrt(Math.pow(disX, 2) + Math.pow(disY, 2));
        return  distence;
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
