package com.tramini.plugin.p261a.p264c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: com.tramini.plugin.a.c.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3330b {

    /* JADX INFO: renamed from: a */
    private a f18097a;

    /* JADX INFO: renamed from: com.tramini.plugin.a.c.b$a */
    public class a extends SQLiteOpenHelper {
        public a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    public AbstractC3330b(Context context) {
        this.f18097a = new a(context, mo15171c());
    }

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase m15169a() {
        return this.f18097a.getReadableDatabase();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized SQLiteDatabase m15170b() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = this.f18097a.getWritableDatabase();
        } catch (Exception unused) {
            writableDatabase = null;
        }
        return writableDatabase;
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo15171c();

    /* JADX INFO: renamed from: d */
    public abstract int mo15172d();

    /* JADX INFO: renamed from: e */
    public abstract void mo15173e();

    /* JADX INFO: renamed from: f */
    public abstract void mo15174f();

    /* JADX INFO: renamed from: g */
    public abstract void mo15175g();
}
