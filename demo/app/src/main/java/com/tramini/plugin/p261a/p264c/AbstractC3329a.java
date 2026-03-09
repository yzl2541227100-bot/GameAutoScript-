package com.tramini.plugin.p261a.p264c;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: com.tramini.plugin.a.c.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3329a<T> {

    /* JADX INFO: renamed from: a */
    private AbstractC3330b f18096a;

    private AbstractC3329a(AbstractC3330b abstractC3330b) {
        this.f18096a = abstractC3330b;
    }

    /* JADX INFO: renamed from: d */
    private SQLiteDatabase m15164d() {
        return this.f18096a.m15169a();
    }

    /* JADX INFO: renamed from: e */
    private SQLiteDatabase m15165e() {
        return this.f18096a.m15170b();
    }

    /* JADX INFO: renamed from: a */
    public abstract long m15166a();

    /* JADX INFO: renamed from: b */
    public abstract long m15167b();

    /* JADX INFO: renamed from: c */
    public abstract boolean m15168c();
}
