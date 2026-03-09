package com.iflytek.voiceads.download.p215c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.c.c */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2936c extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    private static final String f16278a = String.format("CREATE TABLE %s (_id integer PRIMARY KEY NOT NULL,uri varchar(255) NOT NULL,path varchar(255) NOT NULL);", "download_info");

    public C2936c(Context context) {
        super(context, "ifly_ad.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f16278a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
