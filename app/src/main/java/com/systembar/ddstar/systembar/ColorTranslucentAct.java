package com.systembar.ddstar.systembar;

import android.os.Bundle;

public class ColorTranslucentAct extends BaseAct {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_color_translucent;
    }
}
