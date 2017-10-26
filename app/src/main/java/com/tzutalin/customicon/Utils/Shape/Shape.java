package com.tzutalin.customicon.Utils.Shape;

import android.graphics.Point;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by DEV on 2017-10-27.
 */

public class Shape {

    private List<Point> points;
    protected Point mid;
    protected HashMap<String, Double> shape = new HashMap<>();



    public void calMidPoint(Point front, Point back) {
        int midX = calMid(front.x, back.x);
        int midY = calMid(front.y, back.y);
        mid = new Point(midX, midY);
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


    public List<Point> getPoints() {
        return points;
    }

    public Map getShape() {
        return shape;
    }


}
