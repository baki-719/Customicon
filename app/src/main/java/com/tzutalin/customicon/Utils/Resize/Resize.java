package com.tzutalin.customicon.Utils.Resize;

import android.util.Log;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by DEV on 2017-10-29.
 */

public class Resize {

    private double imageRatio;
    private double emoRatio;
    private double imageHWRatio; //image size ratio
    private double imageFHWRatio; //face of user size ratio
    private double emoHWRatio; //emoticon size ratio
    private double emoFHWRatio; //face of emoticon size ratio

    public Resize(double imageHWRatio, double imageFHWRatio, double emoHWRatio, double emoFHWRatio) {
        this.imageHWRatio = imageHWRatio;
        this.imageFHWRatio = imageFHWRatio;
        this.emoHWRatio = emoHWRatio;
        this.emoFHWRatio = emoFHWRatio;
        this.imageRatio = imageFHWRatio/imageHWRatio;
        this.emoRatio = emoFHWRatio/emoHWRatio;
    }

    public double resizeShapeData(HashMap<String, Double> shape) {
        Set<Map.Entry<String, Double>> set = shape.entrySet();
        Iterator<Map.Entry<String, Double>> iter = set.iterator();

        while(iter.hasNext()) {
            double tmp = iter.next().getValue();
            tmp = tmp * (emoRatio/imageRatio);

            Log.d("iterator", Double.toString(tmp));
        }
        return 0;
    }
}
