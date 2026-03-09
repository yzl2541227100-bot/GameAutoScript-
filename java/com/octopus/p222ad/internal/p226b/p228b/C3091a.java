package com.octopus.p222ad.internal.p226b.p228b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.octopus.p222ad.internal.p226b.C3103k;
import com.octopus.p222ad.internal.p226b.C3108p;
import net.grandcentrix.tray.provider.TrayContract;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.b.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3091a extends SQLiteOpenHelper implements InterfaceC3093c {

    /* JADX INFO: renamed from: a */
    private static final String[] f17041a = {TrayContract.Preferences.Columns.f19815ID, C1781c.f10246am, "length", "mime"};

    public C3091a(Context context) {
        super(context, "AndroidVideoCache.db", (SQLiteDatabase.CursorFactory) null, 1);
        C3103k.m14329a(context);
    }

    /* JADX INFO: renamed from: a */
    private ContentValues m14270a(C3108p c3108p) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C1781c.f10246am, c3108p.f17095a);
        contentValues.put("length", Integer.valueOf(c3108p.f17096b));
        contentValues.put("mime", c3108p.f17097c);
        return contentValues;
    }

    /* JADX INFO: renamed from: a */
    private C3108p m14271a(Cursor cursor) {
        return new C3108p(cursor.getString(cursor.getColumnIndexOrThrow(C1781c.f10246am)), cursor.getInt(cursor.getColumnIndexOrThrow("length")), cursor.getString(cursor.getColumnIndexOrThrow("mime")));
    }

    @Override // com.octopus.p222ad.internal.p226b.p228b.InterfaceC3093c
    /* JADX INFO: renamed from: a */
    public C3108p mo14272a(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        C3103k.m14329a(str);
        C3108p c3108pM14271a = null;
        try {
            cursorQuery = getReadableDatabase().query("SourceInfo", f17041a, "url=?", new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        c3108pM14271a = m14271a(cursorQuery);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return c3108pM14271a;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }

    @Override // com.octopus.p222ad.internal.p226b.p228b.InterfaceC3093c
    /* JADX INFO: renamed from: a */
    public void mo14273a(String str, C3108p c3108p) {
        C3103k.m14333a(str, c3108p);
        boolean z = mo14272a(str) != null;
        ContentValues contentValuesM14270a = m14270a(c3108p);
        if (z) {
            getWritableDatabase().update("SourceInfo", contentValuesM14270a, "url=?", new String[]{str});
        } else {
            getWritableDatabase().insert("SourceInfo", null, contentValuesM14270a);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C3103k.m14329a(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new IllegalStateException("Should not be called. There is no any migration");
    }
}
