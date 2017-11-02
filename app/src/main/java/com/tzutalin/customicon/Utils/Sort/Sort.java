package com.tzutalin.customicon.Utils.Sort;

import com.tzutalin.customicon.Utils.DecoImage.DecoImage;
import com.tzutalin.customicon.Utils.Shape.ShapeData;

import java.util.Arrays;

/**
 * Created by DEV on 2017-11-01.
 */

public class Sort {
    private int gap;
    private DecoImage[] decoImages;
    private ShapeData shapeData;

    public void setGaps(double comp, DecoImage[] decoImages, ShapeData shapeData){
        this.decoImages = decoImages;
        this.shapeData = shapeData;
    }

    public void ordetByAsc(){
        Arrays.sort(decoImages);
    }
}
