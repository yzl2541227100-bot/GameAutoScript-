package com.tramini.plugin.p261a.p264c;

import android.content.Context;

/* JADX INFO: renamed from: com.tramini.plugin.a.c.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3331c extends AbstractC3330b {

    /* JADX INFO: renamed from: a */
    private static C3331c f18099a;

    private C3331c(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static C3331c m15176a(Context context) {
        if (f18099a == null) {
            synchronized (C3331c.class) {
                f18099a = new C3331c(context.getApplicationContext());
            }
        }
        return f18099a;
    }

    /* JADX INFO: renamed from: h */
    private void m15177h() {
        try {
            m15170b().execSQL("DROP TABLE IF EXISTS 'il'");
            m15170b().execSQL("DROP TABLE IF EXISTS 'il_all'");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tramini.plugin.p261a.p264c.AbstractC3330b
    /* JADX INFO: renamed from: c */
    public final String mo15171c() {
        return "tramini.db";
    }

    @Override // com.tramini.plugin.p261a.p264c.AbstractC3330b
    /* JADX INFO: renamed from: d */
    public final int mo15172d() {
        return 2;
    }

    @Override // com.tramini.plugin.p261a.p264c.AbstractC3330b
    /* JADX INFO: renamed from: e */
    public final void mo15173e() {
    }

    @Override // com.tramini.plugin.p261a.p264c.AbstractC3330b
    /* JADX INFO: renamed from: f */
    public final void mo15174f() {
    }

    @Override // com.tramini.plugin.p261a.p264c.AbstractC3330b
    /* JADX INFO: renamed from: g */
    public final void mo15175g() {
    }
}
