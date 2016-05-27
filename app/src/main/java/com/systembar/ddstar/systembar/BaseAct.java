package com.systembar.ddstar.systembar;

import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/**
 * Created by DDstar on 2016/5/26.
 */
public abstract class BaseAct extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getLayoutId());
        ViewGroup contentGroup = (ViewGroup) findViewById(Window.ID_ANDROID_CONTENT);
        View parentView = contentGroup.getChildAt(0);
        if (parentView != null && Build.VERSION.SDK_INT >= 14) {
            parentView.setFitsSystemWindows(true);
        }
    }

    /**
     * 获取当前ActivityID
     *
     * @return
     */
    abstract protected int getLayoutId();
}
