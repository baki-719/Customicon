package com.tzutalin.customicon.Utils.Decos;

import com.tzutalin.customicon.R;
import com.tzutalin.customicon.Utils.CustomClass.CustomImageView;
import com.tzutalin.customicon.Utils.Shape.ShapeData;
import com.tzutalin.customicon.Utils.Sort.Sort;

/**
 * Created by DEV on 2017-11-02.
 */
// TODO: 2017-11-02 have to finish sort function
// TODO: 2017-11-02 if sort customimageview, it will need deco's data(ex. slope, length)
public class RyanDeco {
    private CustomImageView[] decoEyebrows;
    private CustomImageView[] decoEyes;
    private CustomImageView[] decoNoses;
    private CustomImageView[] decoMouths;
    private ShapeData shapeData;

    public RyanDeco() {
    }

    public RyanDeco(CustomImageView[] decoEyebrows, CustomImageView[] decoEyes, CustomImageView[] decoNoses, CustomImageView[] decoMouths, ShapeData shapeData) {
        this.decoEyebrows = decoEyebrows;
        this.decoEyes = decoEyes;
        this.decoNoses = decoNoses;
        this.decoMouths = decoMouths;
        this.shapeData = shapeData;

        Sort sort = new Sort();
        init();
    }

    public void setGap(Sort sort, CustomImageView[] customImageViews, ShapeData shapeData){
        for(int i = 0; i < customImageViews.length; i++) {
        }
    }

    public void sort(){

    }

    public void init() {
        decoEyebrows[0].setImageResource(R.drawable.ryan_eyebrow1);
        decoEyebrows[1].setImageResource(R.drawable.ryan_eyebrow2);
        decoEyebrows[2].setImageResource(R.drawable.ryan_eyebrow3);
        decoEyebrows[3].setImageResource(R.drawable.ryan_eyebrow4);
        decoEyes[0].setImageResource(R.drawable.eye1);
        decoEyes[1].setImageResource(R.drawable.ryan_eye2);
        decoEyes[2].setImageResource(R.drawable.ryan_eye3);
        decoEyes[3].setImageResource(R.drawable.ryan_eye4);
        decoNoses[0].setImageResource(R.drawable.ryan_nose1);
        decoNoses[1].setImageResource(R.drawable.ryan_nose2);
        decoNoses[2].setImageResource(R.drawable.ryan_nose3);
        decoNoses[3].setImageResource(R.drawable.ryan_nose4);
    }

    public CustomImageView[] getDecoEyebrows() {
        return decoEyebrows;
    }

    public void setDecoEyebrows(CustomImageView[] decoEyebrows) {
        this.decoEyebrows = decoEyebrows;
    }

    public CustomImageView[] getDecoEyes() {
        return decoEyes;
    }

    public void setDecoEyes(CustomImageView[] decoEyes) {
        this.decoEyes = decoEyes;
    }

    public CustomImageView[] getDecoNoses() {
        return decoNoses;
    }

    public void setDecoNoses(CustomImageView[] decoNoses) {
        this.decoNoses = decoNoses;
    }

    public CustomImageView[] getDecoMouths() {
        return decoMouths;
    }

    public void setDecoMouths(CustomImageView[] decoMouths) {
        this.decoMouths = decoMouths;
    }
}
