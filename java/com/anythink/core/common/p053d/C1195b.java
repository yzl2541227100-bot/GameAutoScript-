package com.anythink.core.common.p053d;

import android.content.Context;

/* JADX INFO: renamed from: com.anythink.core.common.d.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1195b extends C1194a {

    /* JADX INFO: renamed from: c */
    public static volatile C1194a f3570c;

    private C1195b(Context context) {
        super(context);
        this.f3569b = 2;
    }

    /* JADX INFO: renamed from: a */
    public static C1194a m2304a(Context context) {
        if (f3570c == null) {
            synchronized (C1194a.class) {
                if (f3570c == null) {
                    f3570c = new C1195b(context);
                }
            }
        }
        return f3570c;
    }
}
