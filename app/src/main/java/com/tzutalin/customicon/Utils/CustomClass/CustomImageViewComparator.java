package com.tzutalin.customicon.Utils.CustomClass;

import java.util.Comparator;

/**
 * Created by DEV on 2017-11-02.
 */

public class CustomImageViewComparator implements Comparator<CustomImageView> {

    @Override
    public int compare(CustomImageView o1, CustomImageView o2) {
        double firstValue = o1.getGap();
        double secondValue = o2.getGap();

        if (firstValue > secondValue) return 1;
        else if(firstValue < secondValue) return -1;
        else return 0;
    }
}
