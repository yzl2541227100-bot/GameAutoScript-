package com.anythink.expressad.foundation.p114c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.anythink.expressad.C1404a;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.c.c */
/* JADX INFO: loaded from: classes.dex */
public class C1778c extends AbstractC1777b {

    /* JADX INFO: renamed from: a */
    private static volatile C1778c f10160a;

    private C1778c(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static C1778c m8584a(Context context) {
        if (f10160a == null) {
            synchronized (C1778c.class) {
                if (f10160a == null) {
                    f10160a = new C1778c(context.getApplicationContext());
                }
            }
        }
        return f10160a;
    }

    /* JADX INFO: renamed from: c */
    private static void m8585c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaign'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'frequence'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaignclick'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'click_time'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'load_stat'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'fq_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dailyplaycap'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'display_resource_type'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'unit_id'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'c_replace_temp'");
        } catch (Exception e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m8586f() {
    }

    @Override // com.anythink.expressad.foundation.p114c.AbstractC1777b
    /* JADX INFO: renamed from: a */
    public final void mo8578a(SQLiteDatabase sQLiteDatabase) {
        m8585c(sQLiteDatabase);
    }

    @Override // com.anythink.expressad.foundation.p114c.AbstractC1777b
    /* JADX INFO: renamed from: b */
    public final void mo8580b(SQLiteDatabase sQLiteDatabase) {
        m8585c(sQLiteDatabase);
    }

    @Override // com.anythink.expressad.foundation.p114c.AbstractC1777b
    /* JADX INFO: renamed from: c */
    public final String mo8581c() {
        return "anythink_expressad.db";
    }

    @Override // com.anythink.expressad.foundation.p114c.AbstractC1777b
    /* JADX INFO: renamed from: d */
    public final int mo8582d() {
        return 67;
    }

    @Override // com.anythink.expressad.foundation.p114c.AbstractC1777b
    /* JADX INFO: renamed from: e */
    public final void mo8583e() {
    }
}
