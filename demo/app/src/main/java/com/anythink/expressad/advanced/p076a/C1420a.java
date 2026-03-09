package com.anythink.expressad.advanced.p076a;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.advanced.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1420a {

    /* JADX INFO: renamed from: a */
    private static Map<String, Boolean> f6431a = new HashMap();

    /* JADX INFO: renamed from: a */
    private static void m5399a() {
        f6431a.clear();
    }

    /* JADX INFO: renamed from: a */
    public static void m5400a(String str) {
        f6431a.put(str, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5401b(String str) {
        if (f6431a.containsKey(str)) {
            return f6431a.get(str).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m5402c(String str) {
        f6431a.remove(str);
    }
}
