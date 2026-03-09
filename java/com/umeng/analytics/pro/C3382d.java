package com.umeng.analytics.pro;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3381c;

/* JADX INFO: renamed from: com.umeng.analytics.pro.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3382d extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b */
    private static Context f18472b;

    /* JADX INFO: renamed from: a */
    private String f18473a;

    /* JADX INFO: renamed from: com.umeng.analytics.pro.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C3382d f18474a = new C3382d(C3382d.f18472b, C3384f.m15483b(C3382d.f18472b), C3381c.f18418c, null, 1);

        private a() {
        }
    }

    private C3382d(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, TextUtils.isEmpty(str) ? C3381c.f18418c : str, cursorFactory, i);
        this.f18473a = null;
        m15473a();
    }

    private C3382d(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(new C3379a(context, str), str2, cursorFactory, i);
    }

    public /* synthetic */ C3382d(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i, AnonymousClass1 anonymousClass1) {
        this(context, str, str2, cursorFactory, i);
    }

    /* JADX INFO: renamed from: a */
    public static C3382d m15467a(Context context) {
        if (f18472b == null) {
            f18472b = context.getApplicationContext();
        }
        return a.f18474a;
    }

    /* JADX INFO: renamed from: a */
    private void m15468a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f18473a = "create table if not exists __dp(id INTEGER primary key autoincrement, __id INTEGER, __ii TEXT, __ty INTEGER, __ve TEXT, __io TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __dp(id INTEGER primary key autoincrement, __id INTEGER, __ii TEXT, __ty INTEGER, __ve TEXT, __io TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m15470b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f18473a = "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER)";
            sQLiteDatabase.execSQL("create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER)");
        } catch (SQLException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private void m15471c(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f18473a = "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER)";
            sQLiteDatabase.execSQL("create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER)");
        } catch (SQLException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    private void m15472d(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f18473a = "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15473a() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!C3384f.m15482a(C3381c.e.f18455a, writableDatabase)) {
                m15472d(writableDatabase);
            }
            if (!C3384f.m15482a(C3381c.d.f18446a, writableDatabase)) {
                m15471c(writableDatabase);
            }
            if (!C3384f.m15482a(C3381c.c.f18439a, writableDatabase)) {
                m15470b(writableDatabase);
            }
            if (C3384f.m15482a(C3381c.a.f18422a, writableDatabase)) {
                return;
            }
            m15468a(writableDatabase);
        } catch (Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                m15472d(sQLiteDatabase);
                m15471c(sQLiteDatabase);
                m15470b(sQLiteDatabase);
                m15468a(sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase == null) {
                    return;
                }
            } catch (SQLiteDatabaseCorruptException unused) {
                C3384f.m15481a(f18472b);
                if (sQLiteDatabase == null) {
                    return;
                }
            } catch (Throwable unused2) {
                if (sQLiteDatabase == null) {
                    return;
                }
            }
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused3) {
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable unused4) {
                }
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
