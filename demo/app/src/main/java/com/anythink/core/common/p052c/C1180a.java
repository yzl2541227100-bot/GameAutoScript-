package com.anythink.core.common.p052c;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: com.anythink.core.common.c.a */
/* JADX INFO: loaded from: classes.dex */
public class C1180a<T> {

    /* JADX INFO: renamed from: a */
    public AbstractC1181b f3457a;

    public C1180a(AbstractC1181b abstractC1181b) {
        this.f3457a = null;
        this.f3457a = abstractC1181b;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized SQLiteDatabase m2201a() {
        return this.f3457a.m2203a();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized SQLiteDatabase m2202b() {
        return this.f3457a.m2206b();
    }
}
