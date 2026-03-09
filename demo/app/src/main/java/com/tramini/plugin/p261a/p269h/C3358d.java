package com.tramini.plugin.p261a.p269h;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.h.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C3358d {

    /* JADX INFO: renamed from: a */
    public static JSONObject f18220a;

    /* JADX INFO: renamed from: a */
    private static void m15304a(String str) {
        try {
            f18220a = new JSONObject(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
