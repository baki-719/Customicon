package com.tzutalin.customicon.Utils.DecoImage;

import com.bumptech.glide.load.engine.Resource;

/**
 * Created by DEV on 2017-11-01.
 */

public class DecoImage {

    private int resource;
    private String imgPath;
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
}
