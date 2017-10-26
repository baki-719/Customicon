package com.tzutalin.customicon.Utils;

import android.graphics.Point;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by DEV on 2017-10-25.
 */

public class EyebrowShape {
    private List<Point> points;
    private Point front;
    private Point back;
    private Point top;
    private Point mid;
    private HashMap<String, Double> shape = new HashMap<>();


    public EyebrowShape(List<Point> landmarks) {
        points = landmarks;
        front = points.get(0);
        back = points.get(4);
        top = points.get(2);

        cal();
    }

    public void cal() {
        calMid();
        setShape();
    }

    public List<Point> getPoints() {
        return points;
    }

    public void calMid() {
        int midX = calMidPoint(front.x, back.x);
        int midY = calMidPoint(front.y, back.y);
        mid = new Point(midX, midY);
    }

    public int calMidPoint(int x, int y) {
        int tmp = x + y;
        int result;
        if (tmp < 0) tmp = tmp * (-1); // mark change
        result = tmp / 2;
        return result;
    }

    public double calDistance(Point a, Point b) {
        int disX = a.x - b.x;
        int disY = a.y - b.y;
        double distence = Math.sqrt(Math.pow(disX, 2) + Math.pow(disY, 2));
        return distence;
    }

    public double calSlope(Point a, Point b) {
        double slope = (b.y - a.y) / (b.x - a.x);

        return slope;
    }

    public void setShape() {
        double dis = calDistance(mid, top);
        double slope = calSlope(front, back);

        shape.put("distance", dis);
        shape.put("slope", slope);
    }

    public Map getShape() {
        return shape;
    }
}
