package com.iflytek.voiceads.download.p215c;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.iflytek.voiceads.download.p216d.C2938a;
import java.util.ArrayList;
import java.util.List;
import net.grandcentrix.tray.provider.TrayContract;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.c.b */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2935b implements InterfaceC2934a {

    /* JADX INFO: renamed from: a */
    private static final String[] f16273a = {TrayContract.Preferences.Columns.f19815ID, "uri", "path"};

    /* JADX INFO: renamed from: b */
    private static final String f16274b = String.format("REPLACE INTO %s (_id,uri,path) VALUES(?,?,?);", "download_info");

    /* JADX INFO: renamed from: c */
    private C2936c f16275c;

    /* JADX INFO: renamed from: d */
    private SQLiteDatabase f16276d;

    /* JADX INFO: renamed from: e */
    private SQLiteDatabase f16277e;

    public C2935b(Context context) {
        this.f16275c = new C2936c(context);
        this.f16276d = this.f16275c.getWritableDatabase();
        this.f16277e = this.f16275c.getReadableDatabase();
    }

    /* JADX INFO: renamed from: a */
    private void m13332a(Cursor cursor, C2938a c2938a) {
        c2938a.m13379b(cursor.getInt(0));
        c2938a.m13375a(cursor.getString(1));
        c2938a.m13381b(cursor.getString(2));
    }

    @Override // com.iflytek.voiceads.download.p215c.InterfaceC2934a
    /* JADX INFO: renamed from: a */
    public C2938a mo13328a(int i) {
        C2938a c2938a = null;
        Cursor cursorQuery = this.f16277e.query("download_info", f16273a, "_id=?", new String[]{String.valueOf(i)}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            while (cursorQuery.moveToNext()) {
                c2938a = new C2938a();
                m13332a(cursorQuery, c2938a);
            }
            cursorQuery.close();
        }
        return c2938a;
    }

    @Override // com.iflytek.voiceads.download.p215c.InterfaceC2934a
    /* JADX INFO: renamed from: a */
    public List<C2938a> mo13329a() {
        Cursor cursorQuery = this.f16277e.query("download_info", null, null, null, null, null, null);
        ArrayList arrayList = new ArrayList();
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            while (cursorQuery.moveToNext()) {
                C2938a c2938a = new C2938a();
                m13332a(cursorQuery, c2938a);
                arrayList.add(c2938a);
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    @Override // com.iflytek.voiceads.download.p215c.InterfaceC2934a
    /* JADX INFO: renamed from: a */
    public void mo13330a(C2938a c2938a) {
        this.f16276d.execSQL(f16274b, new Object[]{Integer.valueOf(c2938a.m13387h()), c2938a.m13378b(), c2938a.m13382c()});
    }

    @Override // com.iflytek.voiceads.download.p215c.InterfaceC2934a
    /* JADX INFO: renamed from: b */
    public void mo13331b(C2938a c2938a) {
        this.f16276d.delete("download_info", "_id=?", new String[]{String.valueOf(c2938a.m13387h())});
    }
}
