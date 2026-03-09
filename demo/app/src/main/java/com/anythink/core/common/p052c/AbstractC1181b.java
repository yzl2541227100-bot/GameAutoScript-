package com.anythink.core.common.p052c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: com.anythink.core.common.c.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1181b {

    /* JADX INFO: renamed from: a */
    private a f3458a;

    /* JADX INFO: renamed from: com.anythink.core.common.c.b$a */
    public class a extends SQLiteOpenHelper {
        public a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 12);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            AbstractC1181b.this.mo2204a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            AbstractC1181b.this.mo2207b(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            AbstractC1181b.this.mo2205a(sQLiteDatabase, i, i2);
        }
    }

    public AbstractC1181b(Context context) {
        this.f3458a = new a(context, mo2208c());
    }

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase m2203a() {
        return this.f3458a.getReadableDatabase();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2204a(SQLiteDatabase sQLiteDatabase);

    /* JADX INFO: renamed from: a */
    public abstract void mo2205a(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* JADX INFO: renamed from: b */
    public final synchronized SQLiteDatabase m2206b() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = this.f3458a.getWritableDatabase();
        } catch (Exception unused) {
            writableDatabase = null;
        }
        return writableDatabase;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo2207b(SQLiteDatabase sQLiteDatabase);

    /* JADX INFO: renamed from: c */
    public abstract String mo2208c();

    /* JADX INFO: renamed from: d */
    public abstract int mo2209d();
}
