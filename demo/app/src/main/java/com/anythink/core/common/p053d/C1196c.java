package com.anythink.core.common.p053d;

import android.content.Context;

/* JADX INFO: renamed from: com.anythink.core.common.d.c */
/* JADX INFO: loaded from: classes.dex */
public class C1196c extends C1194a {

    /* JADX INFO: renamed from: c */
    private static volatile C1196c f3571c;

    private C1196c(Context context) {
        super(context);
        this.f3569b = 1;
    }

    /* JADX INFO: renamed from: a */
    public static C1196c m2305a(Context context) {
        if (f3571c == null) {
            synchronized (C1196c.class) {
                if (f3571c == null) {
                    f3571c = new C1196c(context);
                }
            }
        }
        return f3571c;
    }
}
