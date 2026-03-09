package net.grandcentrix.tray.core;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class TrayLog {
    public static boolean DEBUG = false;
    private static String TAG = "net.grandcentrix.tray.core.TrayLog";

    public TrayLog() {
        throw new IllegalStateException("no instances");
    }

    /* JADX INFO: renamed from: d */
    public static void m17037d(String str) {
        if (str == null) {
            str = "";
        }
        Log.d(TAG, str);
    }

    /* JADX INFO: renamed from: e */
    public static void m17038e(String str) {
        if (str == null) {
            str = "";
        }
        Log.e(TAG, str);
    }

    /* JADX INFO: renamed from: e */
    public static void m17039e(Throwable th, String str) {
        Log.e(TAG, str, th);
    }

    public static void setTag(String str) {
        m17037d("Changing log tag to " + str);
        TAG = str;
        DEBUG = Log.isLoggable(str, 2);
    }

    /* JADX INFO: renamed from: v */
    public static void m17040v(String str) {
        if (DEBUG) {
            if (str == null) {
                str = "";
            }
            Log.v(TAG, str);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m17041w(String str) {
        if (str == null) {
            str = "";
        }
        Log.w(TAG, str);
    }

    public static void wtf(String str) {
        if (str == null) {
            str = "";
        }
        Log.wtf(TAG, str);
    }

    public static void wtf(Throwable th, String str) {
        Log.wtf(TAG, str, th);
    }
}
