package com.tzutalin.customicon.Utils.DecoImage;

/**
 * Created by DEV on 2017-11-01.
 */

public class DecoEyebrow extends DecoImage {
    private double slope;
    private double length;

    public DecoEyebrow(double slope, double length) {
        this.slope = slope;
        this.length = length;
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

    public void setLength(double length) {
        this.length = length;
    }
}
