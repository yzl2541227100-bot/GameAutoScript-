package com.anythink.expressad.exoplayer.p107k;

import android.annotation.TargetApi;
import android.os.Trace;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.ad */
/* JADX INFO: loaded from: classes.dex */
public final class C1715ad {
    private C1715ad() {
    }

    /* JADX INFO: renamed from: a */
    public static void m8039a() {
        if (C1717af.f9627a >= 18) {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8040a(String str) {
        if (C1717af.f9627a >= 18) {
            Trace.beginSection(str);
        }
    }

    @TargetApi(18)
    /* JADX INFO: renamed from: b */
    private static void m8041b() {
        Trace.endSection();
    }

    @TargetApi(18)
    /* JADX INFO: renamed from: b */
    private static void m8042b(String str) {
        Trace.beginSection(str);
    }
}
