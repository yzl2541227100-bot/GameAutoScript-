package com.umeng.commonsdk.statistics;

import com.umeng.commonsdk.statistics.common.C3489e;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3483b {

    /* JADX INFO: renamed from: a */
    public static final String f19141a = "Android";

    /* JADX INFO: renamed from: b */
    public static final String f19142b = "Android";

    /* JADX INFO: renamed from: c */
    public static final String f19143c = "MobclickAgent";

    /* JADX INFO: renamed from: d */
    public static boolean f19144d = true;

    /* JADX INFO: renamed from: e */
    public static String[] f19145e = {UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};

    /* JADX INFO: renamed from: f */
    public static final boolean f19146f = C3489e.f19173a;

    /* JADX INFO: renamed from: g */
    private static int f19147g = 1;

    /* JADX INFO: renamed from: a */
    public static synchronized int m16253a() {
        return f19147g;
    }

    /* JADX INFO: renamed from: a */
    public static void m16254a(int i) {
        f19147g = i;
    }
}
