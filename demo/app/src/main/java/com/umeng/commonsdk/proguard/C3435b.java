package com.umeng.commonsdk.proguard;

import android.content.Context;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3435b {

    /* JADX INFO: renamed from: b */
    private static C3435b f18756b;

    /* JADX INFO: renamed from: a */
    private Context f18757a;

    /* JADX INFO: renamed from: c */
    private C3452c f18758c;

    private C3435b(Context context) {
        this.f18757a = context;
        this.f18758c = new C3452c(context);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C3435b m15851a(Context context) {
        if (f18756b == null) {
            f18756b = new C3435b(context.getApplicationContext());
        }
        return f18756b;
    }

    /* JADX INFO: renamed from: a */
    public C3452c m15852a() {
        return this.f18758c;
    }
}
