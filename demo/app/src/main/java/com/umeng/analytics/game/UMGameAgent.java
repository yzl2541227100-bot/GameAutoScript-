package com.umeng.analytics.game;

import android.content.Context;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.statistics.common.MLog;

/* JADX INFO: loaded from: classes2.dex */
public class UMGameAgent extends MobclickAgent {

    /* JADX INFO: renamed from: a */
    private static final String f18301a = "Input string is null or empty";

    /* JADX INFO: renamed from: b */
    private static final String f18302b = "Input string must be less than 64 chars";

    /* JADX INFO: renamed from: c */
    private static final String f18303c = "Input value type is negative";

    /* JADX INFO: renamed from: d */
    private static final String f18304d = "The int value for 'Pay Channels' ranges between 1 ~ 99 ";

    /* JADX INFO: renamed from: e */
    private static final C3378b f18305e = new C3378b();

    /* JADX INFO: renamed from: f */
    private static Context f18306f;

    /* JADX INFO: renamed from: a */
    private static boolean m15439a(String str) {
        return str == null || str.trim().length() <= 0;
    }

    public static void bonus(double d, int i) {
        if (d < 0.0d) {
            MLog.m16269e(f18303c);
        } else if (i <= 0 || i >= 100) {
            MLog.m16269e(f18304d);
        } else {
            f18305e.m15454a(d, i);
        }
    }

    public static void bonus(String str, int i, double d, int i2) {
        if (m15439a(str)) {
            MLog.m16269e(f18301a);
            return;
        }
        if (i < 0 || d < 0.0d) {
            MLog.m16269e(f18303c);
        } else if (i2 <= 0 || i2 >= 100) {
            MLog.m16269e(f18304d);
        } else {
            f18305e.m15460a(str, i, d, i2);
        }
    }

    public static void buy(String str, int i, double d) {
        if (m15439a(str)) {
            MLog.m16269e(f18301a);
        } else if (i < 0 || d < 0.0d) {
            MLog.m16269e(f18303c);
        } else {
            f18305e.m15459a(str, i, d);
        }
    }

    public static void exchange(double d, String str, double d2, int i, String str2) {
        if (d < 0.0d || d2 < 0.0d) {
            MLog.m16269e(f18303c);
        } else if (i <= 0 || i >= 100) {
            MLog.m16269e(f18304d);
        } else {
            f18305e.m15455a(d, str, d2, i, str2);
        }
    }

    public static void failLevel(String str) {
        if (m15439a(str)) {
            MLog.m16269e(f18301a);
        } else if (str.length() > 64) {
            MLog.m16269e(f18302b);
        } else {
            f18305e.m15466d(str);
        }
    }

    public static void finishLevel(String str) {
        if (m15439a(str)) {
            MLog.m16269e(f18301a);
        } else if (str.length() > 64) {
            MLog.m16269e(f18302b);
        } else {
            f18305e.m15465c(str);
        }
    }

    public static void init(Context context) {
        try {
            if (f18306f == null && context != null) {
                f18306f = context.getApplicationContext();
            }
            f18305e.m15457a(f18306f);
        } catch (Throwable unused) {
            MLog.m16269e("please check Context!");
        }
    }

    public static void pay(double d, double d2, int i) {
        if (i <= 0 || i >= 100) {
            MLog.m16269e(f18304d);
        } else if (d < 0.0d || d2 < 0.0d) {
            MLog.m16269e(f18303c);
        } else {
            f18305e.m15453a(d, d2, i);
        }
    }

    public static void pay(double d, String str, int i, double d2, int i2) {
        if (i2 <= 0 || i2 >= 100) {
            MLog.m16269e(f18304d);
            return;
        }
        if (d < 0.0d || i < 0 || d2 < 0.0d) {
            MLog.m16269e(f18303c);
        } else if (m15439a(str)) {
            MLog.m16269e(f18301a);
        } else {
            f18305e.m15456a(d, str, i, d2, i2);
        }
    }

    public static void setPlayerLevel(int i) {
        f18305e.m15458a(String.valueOf(i));
    }

    public static void setTraceSleepTime(boolean z) {
        f18305e.m15461a(z);
    }

    public static void startLevel(String str) {
        if (m15439a(str)) {
            MLog.m16269e(f18301a);
        } else if (str.length() > 64) {
            MLog.m16269e(f18302b);
        } else {
            f18305e.m15463b(str);
        }
    }

    public static void use(String str, int i, double d) {
        if (m15439a(str)) {
            MLog.m16269e(f18301a);
        } else if (i < 0 || d < 0.0d) {
            MLog.m16269e(f18303c);
        } else {
            f18305e.m15464b(str, i, d);
        }
    }
}
