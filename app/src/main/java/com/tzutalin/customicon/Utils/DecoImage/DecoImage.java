package com.tzutalin.customicon.Utils.DecoImage;

import android.support.annotation.NonNull;

import com.bumptech.glide.load.engine.Resource;

/**
 * Created by DEV on 2017-11-01.
 */

public class DecoImage  implements Comparable{

    private int resource;
    private double gap;
    private double height;
    private double width;
    private double slope;
    private double length;
    private double totalValue;
    private String imgPath;
    private String type; //eyebrow, eye, nose, mouth

    private boolean isClicked = false;

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public boolean isClicked() {
        return isClicked;
    }

    public void setClicked(boolean clicked) {
        isClicked = clicked;
    }

    public double getGap() {
        return gap;
    }

    public void setGap(double gap) {
        this.gap = gap;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSlope() {
        return slope;
    }

    public void setSlope(double slope) {
        this.slope = slope;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double Length) {
        this.length = Length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int compareTo(@NonNull Object o) {
        DecoImage other = (DecoImage) o;
        if(gap < other.getGap()) return -1;
        else if(gap > other.getGap()) return 1;
        else return 0;
    }
}
