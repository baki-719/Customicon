package com.tzutalin.customicon.Utils.DecoImage;

/**
 * Created by DEV on 2017-11-01.
 */

public class DecoEye extends DecoImage {

    private double height;
    private double width;
    private double slope;

    public DecoEye(double height, double width, double slope) {
        this.height = height;
        this.width = width;
        this.slope = slope;
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
}
