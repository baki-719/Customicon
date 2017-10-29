package com.tzutalin.customicon.Utils.Resize;

/**
 * Created by DEV on 2017-10-29.
 */

public class Emoticons {

    private double widthSize; //emoticon face
    private double heightSize; //emoticon face
    private double emoticonFaceRatio = 20;
    private double imageWidth;  //emoticon image
    private double imageHeight; //emoticon image
    private double emoticonImageRatio = 100;

    public Emoticons() {
    }

    public double getWidthSize() {
        return widthSize;
    }

    public void setWidthSize(double widthSize) {
        this.widthSize = widthSize;
    }

    public double getHeightSize() {
        return heightSize;
    }

    public void setHeightSize(double heightSize) {
        this.heightSize = heightSize;
    }

    public double getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(double imageWidth) {
        this.imageWidth = imageWidth;
    }

    public double getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(double imageHeight) {
        this.imageHeight = imageHeight;
    }

    public double getEmoticonFaceRatio() {
        return emoticonFaceRatio;
    }

    public double getEmoticonImageRatio() {
        return emoticonImageRatio;
    }
}