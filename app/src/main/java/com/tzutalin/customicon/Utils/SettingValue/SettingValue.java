package com.tzutalin.customicon.Utils.SettingValue;

/**
 * Created by Pixeleye_server on 2017-11-03.
 */

public class SettingValue {
    private static final int eyebrowSlope1 = -20;
    private static final int eyebrowSlope2 = 6;
    private static final int eyebrowSlope3 = 10;
    private static final int eyebrowSlope4 = 7;

    private static final int eyeSlope1 = 8;
    private static final int eyeSlope2 = 8;
    private static final int eyeSlope3 = 5;
    private static final int eyeSlope4 = 12;

    private static final int noseHeight1 = 100;
    private static final int noseHeight2 = 180;
    private static final int noseHeight3 = 260;
    private static final int noseHeight4 = 380;

    private static final int noseWidth1 = 50;
    private static final int noseWidth2 = 120;
    private static final int noseWidth3 = 130;
    private static final int noseWidth4 = 230;

    private static final int mouthHeight1 = 40;
    private static final int mouthHeight2 = 100;
    private static final int mouthHeight3 = 160;
    private static final int mouthHeight4 = 40;


    public SettingValue() {
    }

    public int getEyebrowSlope(int flag) {
        if(flag == 1) return eyebrowSlope1;
        else if(flag == 2) return eyebrowSlope2;
        else if(flag == 3) return eyebrowSlope3;
        else return eyebrowSlope4;
    }

    public int getEyeSlope(int flag) {
        if(flag == 1) return eyeSlope1;
        else if(flag == 2) return eyeSlope2;
        else if(flag == 3) return eyeSlope3;
        else return eyeSlope4;
    }

    public int getNoseHeight(int flag) {
        if(flag == 1) return noseHeight1;
        else if(flag == 2) return noseHeight2;
        else if(flag == 3) return noseHeight3;
        else return noseHeight4;
    }

    public int getNoseWidth(int flag) {
        if(flag == 1) return noseWidth1;
        else if(flag == 2) return noseWidth2;
        else if(flag == 3) return noseWidth3;
        else return noseWidth4;
    }

    public int getMouthHeight(int flag) {
        if(flag == 1) return mouthHeight1;
        else if(flag == 2) return mouthHeight2;
        else if(flag == 3) return mouthHeight3;
        else return mouthHeight4;
    }
}
