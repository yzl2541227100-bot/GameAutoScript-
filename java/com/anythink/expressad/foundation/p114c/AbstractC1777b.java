package com.anythink.expressad.foundation.p114c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.c.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1777b {

    /* JADX INFO: renamed from: a */
    private a f10158a;

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.c.b$a */
    public class a extends SQLiteOpenHelper {
        public a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 67);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            AbstractC1777b.this.mo8580b(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            AbstractC1777b.this.mo8578a(sQLiteDatabase);
        }
    }

    public AbstractC1777b(Context context) {
        this.f10158a = new a(context, mo8581c());
    }

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase m8577a() {
        return this.f10158a.getReadableDatabase();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo8578a(SQLiteDatabase sQLiteDatabase);

    /* JADX INFO: renamed from: b */
    public final synchronized SQLiteDatabase m8579b() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = this.f10158a.getWritableDatabase();
        } catch (Exception unused) {
            writableDatabase = null;
        }
        return writableDatabase;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo8580b(SQLiteDatabase sQLiteDatabase);

    /* JADX INFO: renamed from: c */
    public abstract String mo8581c();

    /* JADX INFO: renamed from: d */
    public abstract int mo8582d();

    /* JADX INFO: renamed from: e */
    public abstract void mo8583e();
}
