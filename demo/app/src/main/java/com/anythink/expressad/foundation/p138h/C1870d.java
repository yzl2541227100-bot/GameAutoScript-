package com.anythink.expressad.foundation.p138h;

import android.content.Context;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.d */
/* JADX INFO: loaded from: classes.dex */
public class C1870d {
    /* JADX INFO: renamed from: a */
    private static void m9677a() {
    }

    /* JADX INFO: renamed from: a */
    public static void m9678a(Context context) {
        if (context == null) {
            return;
        }
        try {
            Class<?> cls = Class.forName("com.anythink.expressad.atsignalcommon.webEnvCheck.WebEnvCheckEntry");
            cls.getMethod("check", Context.class).invoke(cls.newInstance(), context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
