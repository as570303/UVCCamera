package com.serenegiant.usb;//package com.serenegiant.usb;
//
//
//import java.sql.Time;
//
///**
// * @author as752497576@gmail.com
// * @description
// * @time 2022/8/31
// */
//
//public class FpsCounter {
//    private int cnt;
//    private int prevCnt;
//    private long startTime;
//    private long prevTime;
//    private float fps;
//    private float totalFps;
//
//    public FpsCounter() {
//        this.reset();
//    }
//
//    public synchronized FpsCounter reset() {
//        this.cnt = this.prevCnt = 0;
//        this.startTime = this.prevTime = Time.nanoTime() - 1L;
//        return this;
//    }
//
//    public synchronized void count() {
//        ++this.cnt;
//    }
//
//    public synchronized FpsCounter update() {
//        long t = Time.nanoTime();
//        this.fps = (float)(this.cnt - this.prevCnt) * 1.0E9F / (float)(t - this.prevTime);
//        this.prevCnt = this.cnt;
//        this.prevTime = t;
//        this.totalFps = (float)this.cnt * 1.0E9F / (float)(t - this.startTime);
//        return this;
//    }
//
//    public synchronized float getFps() {
//        return this.fps;
//    }
//
//    public synchronized float getTotalFps() {
//        return this.totalFps;
//    }
//}
//
