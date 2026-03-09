package cn.haorui.sdk.core.utils;

import android.util.Log;
import cn.haorui.sdk.core.AdSdk;

/* JADX INFO: loaded from: classes.dex */
public class LogUtil {
    public static final String TAG = "HrSdk";

    /* JADX INFO: renamed from: d */
    public static void m86d(String str, String str2) {
        if (AdSdk.adConfig().enableDebug()) {
            Log.d(getTag(str), str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m87e(String str, String str2) {
        Log.e(getTag(str), str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m88e(String str, String str2, Exception exc) {
        Log.e(getTag(str), str2, exc);
    }

    private static String getTag(String str) {
        StringBuffer stringBuffer = new StringBuffer(TAG);
        stringBuffer.append("_");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: i */
    public static void m89i(String str, String str2) {
        if (AdSdk.adConfig().enableDebug()) {
            Log.i(getTag(str), str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m90i(String str, String str2, Throwable th) {
        if (AdSdk.adConfig().enableDebug()) {
            Log.i(getTag(str), str2, th);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m91w(String str, String str2) {
        Log.w(getTag(str), str2);
    }
}
