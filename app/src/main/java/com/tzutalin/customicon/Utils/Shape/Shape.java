package com.tzutalin.customicon.Utils.Shape;

import android.graphics.Point;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by DEV on 2017-10-27.
 */

public class Shape {

    protected Point mid;


    public Point calMidPoint(Point front, Point back) {
        int midX = calMid(front.x, back.x);
        int midY = calMid(front.y, back.y);
        mid = new Point(midX, midY);
        return mid;
    }

    public int calMid(int x, int y) {
        int tmp = x + y;
        int result;
        if (tmp < 0) tmp = tmp * (-1); // mark change
        result = tmp / 2;
        return result;
    }

    public double calDistance(Point a, Point b) {
        int disX = a.x - b.x;
        int disY = a.y - b.y;
        double distance = Math.sqrt(Math.pow(disX, 2) + Math.pow(disY, 2));
        return distance;
    }

    public double calSlope(Point a, Point b) {
        double deltaX = b.y - a.y;
        double deltaY = b.x - a.x;

        double slope =  deltaY / deltaX ;

        return slope;
    }

}
