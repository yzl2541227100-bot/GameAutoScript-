package com.anythink.expressad.foundation.p120g.p135g;

import android.content.Context;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.g.b */
/* JADX INFO: loaded from: classes.dex */
public class C1862b {

    /* JADX INFO: renamed from: a */
    private static final String f11474a = "b";

    /* JADX INFO: renamed from: b */
    private static WeakHashMap<Context, C1863c> f11475b = new WeakHashMap<>();

    /* JADX INFO: renamed from: c */
    private C1863c f11476c;

    /* JADX INFO: renamed from: d */
    private Context f11477d;

    private C1862b(Context context) {
        this.f11477d = context;
        if (f11475b.get(context) != null) {
            this.f11476c = f11475b.get(this.f11477d);
            return;
        }
        C1863c c1863c = new C1863c(this.f11477d, 5);
        this.f11476c = c1863c;
        f11475b.put(this.f11477d, c1863c);
    }

    /* JADX INFO: renamed from: a */
    private void m9648a(AbstractRunnableC1861a abstractRunnableC1861a) {
        this.f11476c.m9653a(abstractRunnableC1861a);
    }
}
