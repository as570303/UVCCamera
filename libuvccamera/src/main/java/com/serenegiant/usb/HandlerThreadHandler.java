package com.serenegiant.usb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/**
 * @author as752497576@gmail.com
 * @description
 * @time 2022/8/31
 */

public class HandlerThreadHandler extends Handler {
 private static final String TAG = "HandlerThreadHandler";

 public static final  HandlerThreadHandler createHandler() {
  return createHandler("HandlerThreadHandler");
 }

 public static final HandlerThreadHandler createHandler(String name) {
  HandlerThread thread = new HandlerThread(name);
  thread.start();
  return new HandlerThreadHandler(thread.getLooper());
 }

 public static final HandlerThreadHandler createHandler(Callback callback) {
  return createHandler("HandlerThreadHandler", callback);
 }

 public static final HandlerThreadHandler createHandler(String name, Callback callback) {
  HandlerThread thread = new HandlerThread(name);
  thread.start();
  return new HandlerThreadHandler(thread.getLooper(), callback);
 }

 private HandlerThreadHandler(Looper looper) {
  super(looper);
 }

 private HandlerThreadHandler(Looper looper, Callback callback) {
  super(looper, callback);
 }
}

