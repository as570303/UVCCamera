package com.serenegiant.usbcameratest;

import android.app.Application;
import android.support.multidex.MultiDex;

/**
 * @author as752497576@gmail.com
 * @description
 * @time 2023/2/13
 */
public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        MultiDex.install(this);
    }
}
