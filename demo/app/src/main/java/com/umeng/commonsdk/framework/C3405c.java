package com.umeng.commonsdk.framework;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: com.umeng.commonsdk.framework.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3405c {

    /* JADX INFO: renamed from: a */
    public static final String f18616a = "analytics";

    /* JADX INFO: renamed from: b */
    public static final String f18617b = "push";

    /* JADX INFO: renamed from: c */
    public static final String f18618c = "share";

    /* JADX INFO: renamed from: d */
    public static final String f18619d = "internal";

    /* JADX INFO: renamed from: e */
    private static HashMap<String, UMLogDataProtocol> f18620e = null;

    /* JADX INFO: renamed from: f */
    private static Context f18621f = null;

    /* JADX INFO: renamed from: g */
    private static final int f18622g = 16385;

    /* JADX INFO: renamed from: h */
    private static final int f18623h = 20480;

    /* JADX INFO: renamed from: i */
    private static final int f18624i = 24577;

    /* JADX INFO: renamed from: j */
    private static final int f18625j = 28672;

    /* JADX INFO: renamed from: k */
    private static final int f18626k = 32769;

    /* JADX INFO: renamed from: l */
    private static final int f18627l = 36864;

    /* JADX INFO: renamed from: a */
    public static Context m15665a() {
        return f18621f;
    }

    /* JADX INFO: renamed from: a */
    public static UMLogDataProtocol m15666a(String str) {
        if (f18620e.containsKey(str)) {
            return f18620e.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m15667a(int i) {
        String str = (i < f18622g || i > 20480) ? "analytics" : "push";
        if (i >= f18624i && i <= f18625j) {
            str = "share";
        }
        return (i < 32769 || i > f18627l) ? str : f18619d;
    }

    /* JADX INFO: renamed from: a */
    public static void m15668a(Context context) {
        if (f18621f == null) {
            f18621f = context.getApplicationContext();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15669a(int i, UMLogDataProtocol uMLogDataProtocol) {
        if (f18620e == null) {
            f18620e = new HashMap<>();
        }
        String strM15667a = m15667a(i);
        if (f18620e.containsKey(strM15667a)) {
            return true;
        }
        if (!m15665a().getPackageName().equals(C3404b.m15647a(m15665a().getApplicationContext()))) {
            return false;
        }
        f18620e.put(strM15667a, uMLogDataProtocol);
        return true;
    }
}
