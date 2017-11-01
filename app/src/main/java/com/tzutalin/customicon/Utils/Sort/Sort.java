package com.tzutalin.customicon.Utils.Sort;

import com.tzutalin.customicon.Utils.CustomClass.CustomImageView;

import java.util.ArrayList;

/**
 * Created by DEV on 2017-11-01.
 */

public class Sort {
    private int gap;

    public void setGaps(double comp, CustomImageView customImageView){
        double newGap = Math.abs(comp-customImageView.getGap());
        customImageView.setGap(newGap);
    }

    public void ordetByAsc(){

    }
}
