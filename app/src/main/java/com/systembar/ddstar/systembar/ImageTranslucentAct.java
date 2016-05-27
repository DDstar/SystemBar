package com.systembar.ddstar.systembar;

import android.os.Bundle;
import android.view.View;

public class ImageTranslucentAct extends BaseAct {
    View rootLatout;
    int[] bacRes = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5, R.drawable.image_6, R.drawable.image_7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        rootLatout = findViewById(R.id.root);
    }

    int index;

    public void changeBac(View v) {
        index++;
        index = index % bacRes.length;
        rootLatout.setBackgroundResource(bacRes[index]);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_image_translucent;
    }

//    @Override
//    protected int getLayoutId() {
//        return R.layout.activity_image_translucent;
//    }
}
