package com.lidroid.xutils.util;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class LogUtils {
    public static boolean allowD = true;
    public static boolean allowE = true;
    public static boolean allowI = true;
    public static boolean allowV = true;
    public static boolean allowW = true;
    public static boolean allowWtf = true;
    public static CustomLogger customLogger = null;
    public static String customTagPrefix = "";

    public interface CustomLogger {
        /* JADX INFO: renamed from: d */
        void m13799d(String str, String str2);

        /* JADX INFO: renamed from: d */
        void m13800d(String str, String str2, Throwable th);

        /* JADX INFO: renamed from: e */
        void m13801e(String str, String str2);

        /* JADX INFO: renamed from: e */
        void m13802e(String str, String str2, Throwable th);

        /* JADX INFO: renamed from: i */
        void m13803i(String str, String str2);

        /* JADX INFO: renamed from: i */
        void m13804i(String str, String str2, Throwable th);

        /* JADX INFO: renamed from: v */
        void m13805v(String str, String str2);

        /* JADX INFO: renamed from: v */
        void m13806v(String str, String str2, Throwable th);

        /* JADX INFO: renamed from: w */
        void m13807w(String str, String str2);

        /* JADX INFO: renamed from: w */
        void m13808w(String str, String str2, Throwable th);

        /* JADX INFO: renamed from: w */
        void m13809w(String str, Throwable th);

        void wtf(String str, String str2);

        void wtf(String str, String str2, Throwable th);

        void wtf(String str, Throwable th);
    }

    private LogUtils() {
    }

    /* JADX INFO: renamed from: d */
    public static void m13788d(String str) {
        if (allowD) {
            String strGenerateTag = generateTag(OtherUtils.getCallerStackTraceElement());
            CustomLogger customLogger2 = customLogger;
            if (customLogger2 != null) {
                customLogger2.m13799d(strGenerateTag, str);
            } else {
                Log.d(strGenerateTag, str);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m13789d(String str, Throwable th) {
        if (allowD) {
            String strGenerateTag = generateTag(OtherUtils.getCallerStackTraceElement());
            CustomLogger customLogger2 = customLogger;
            if (customLogger2 != null) {
                customLogger2.m13800d(strGenerateTag, str, th);
            } else {
                Log.d(strGenerateTag, str, th);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m13790e(String str) {
        if (allowE) {
            String strGenerateTag = generateTag(OtherUtils.getCallerStackTraceElement());
            CustomLogger customLogger2 = customLogger;
            if (customLogger2 != null) {
                customLogger2.m13801e(strGenerateTag, str);
            } else {
                Log.e(strGenerateTag, str);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m13791e(String str, Throwable th) {
        if (allowE) {
            String strGenerateTag = generateTag(OtherUtils.getCallerStackTraceElement());
            CustomLogger customLogger2 = customLogger;
            if (customLogger2 != null) {
                customLogger2.m13802e(strGenerateTag, str, th);
            } else {
                Log.e(strGenerateTag, str, th);
            }
        }
    }

    private static String generateTag(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        String str = String.format("%s.%s(L:%d)", className.substring(className.lastIndexOf(".") + 1), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
        if (TextUtils.isEmpty(customTagPrefix)) {
            return str;
        }
        return String.valueOf(customTagPrefix) + ":" + str;
    }

    /* JADX INFO: renamed from: i */
    public static void m13792i(String str) {
        if (allowI) {
            String strGenerateTag = generateTag(OtherUtils.getCallerStackTraceElement());
            CustomLogger customLogger2 = customLogger;
            if (customLogger2 != null) {
                customLogger2.m13803i(strGenerateTag, str);
            } else {
                Log.i(strGenerateTag, str);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m13793i(String str, Throwable th) {
        if (allowI) {
            String strGenerateTag = generateTag(OtherUtils.getCallerStackTraceElement());
            CustomLogger customLogger2 = customLogger;
            if (customLogger2 != null) {
                customLogger2.m13804i(strGenerateTag, str, th);
            } else {
                Log.i(strGenerateTag, str, th);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m13794v(String str) {
        if (allowV) {
            String strGenerateTag = generateTag(OtherUtils.getCallerStackTraceElement());
            CustomLogger customLogger2 = customLogger;
            if (customLogger2 != null) {
                customLogger2.m13805v(strGenerateTag, str);
            } else {
                Log.v(strGenerateTag, str);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m13795v(String str, Throwable th) {
        if (allowV) {
            String strGenerateTag = generateTag(OtherUtils.getCallerStackTraceElement());
            CustomLogger customLogger2 = customLogger;
            if (customLogger2 != null) {
                customLogger2.m13806v(strGenerateTag, str, th);
            } else {
                Log.v(strGenerateTag, str, th);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m13796w(String str) {
        if (allowW) {
            String strGenerateTag = generateTag(OtherUtils.getCallerStackTraceElement());
            CustomLogger customLogger2 = customLogger;
            if (customLogger2 != null) {
                customLogger2.m13807w(strGenerateTag, str);
            } else {
                Log.w(strGenerateTag, str);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m13797w(String str, Throwable th) {
        if (allowW) {
            String strGenerateTag = generateTag(OtherUtils.getCallerStackTraceElement());
            CustomLogger customLogger2 = customLogger;
            if (customLogger2 != null) {
                customLogger2.m13808w(strGenerateTag, str, th);
            } else {
                Log.w(strGenerateTag, str, th);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m13798w(Throwable th) {
        if (allowW) {
            String strGenerateTag = generateTag(OtherUtils.getCallerStackTraceElement());
            CustomLogger customLogger2 = customLogger;
            if (customLogger2 != null) {
                customLogger2.m13809w(strGenerateTag, th);
            } else {
                Log.w(strGenerateTag, th);
            }
        }
    }

    public static void wtf(String str) {
        if (allowWtf) {
            String strGenerateTag = generateTag(OtherUtils.getCallerStackTraceElement());
            CustomLogger customLogger2 = customLogger;
            if (customLogger2 != null) {
                customLogger2.wtf(strGenerateTag, str);
            } else {
                Log.wtf(strGenerateTag, str);
            }
        }
    }

    public static void wtf(String str, Throwable th) {
        if (allowWtf) {
            String strGenerateTag = generateTag(OtherUtils.getCallerStackTraceElement());
            CustomLogger customLogger2 = customLogger;
            if (customLogger2 != null) {
                customLogger2.wtf(strGenerateTag, str, th);
            } else {
                Log.wtf(strGenerateTag, str, th);
            }
        }
    }

    public static void wtf(Throwable th) {
        if (allowWtf) {
            String strGenerateTag = generateTag(OtherUtils.getCallerStackTraceElement());
            CustomLogger customLogger2 = customLogger;
            if (customLogger2 != null) {
                customLogger2.wtf(strGenerateTag, th);
            } else {
                Log.wtf(strGenerateTag, th);
            }
        }
    }
}
