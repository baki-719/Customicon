package com.tzutalin.customicon.Utils.Shape;

import java.io.Serializable;

/**
 * Created by pixeleye02 on 2017-10-31.
 */

public class ShapeData implements Serializable {
    private double eyebrowSlope;
    private double eyebrowLength;
    private double eyeSlope;
    private double eyeWidth;
    private double eyeHeight;
    private double noseHeight;
    private double noseWidth;
    private double mouthHeight;
    private double mouthWidth;

    public ShapeData(double eyebrowSlope, double eyebrowLength, double eyeSlope, double eyeWidth, double eyeHeight, double noseHeight, double noseWidth, double mouthHeight, double mouthWidth) {
        this.eyebrowSlope = eyebrowSlope;
        this.eyebrowLength = eyebrowLength;
        this.eyeSlope = eyeSlope;
        this.eyeWidth = eyeWidth;
        this.eyeHeight = eyeHeight;
        this.noseHeight = noseHeight;
        this.noseWidth = noseWidth;
        this.mouthHeight = mouthHeight;
        this.mouthWidth = mouthWidth;
    }

    @Override
    public String toString(){
        return "(eyebrowSlop : "+eyebrowSlope+
                ", eyebrowLength : " +eyebrowLength+
                ", eyeSlope : " +eyeSlope+
                ", eyeHeight : " +eyeHeight+
                ", eyeWidth : " +eyeWidth+
                ", noseHeight : " +noseHeight+
                ", noseWidth : " +noseWidth+
                ", mouthHeight : " +mouthHeight+
                ", mouthWidth : " +mouthWidth+")";
    }

    public double getEyebrowSlope() {
        return eyebrowSlope;
    }

    public double getEyebrowLength() {
        return eyebrowLength;
    }

    public double getEyeSlope() {
        return eyeSlope;
    }

    public double getEyeWidth() {
        return eyeWidth;
    }

    public double getEyeHeight() {
        return eyeHeight;
    }

    public double getNoseHeight() {
        return noseHeight;
    }

    public double getNoseWidth() {
        return noseWidth;
    }

    public double getMouthHeight() {
        return mouthHeight;
    }

    public double getMouthWidth() {
        return mouthWidth;
    }
}
