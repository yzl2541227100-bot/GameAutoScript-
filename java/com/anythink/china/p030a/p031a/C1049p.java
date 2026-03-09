package com.anythink.china.p030a.p031a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: renamed from: com.anythink.china.a.a.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1049p {

    /* JADX INFO: renamed from: b */
    private Context f2287b;

    /* JADX INFO: renamed from: c */
    private boolean f2288c = false;

    /* JADX INFO: renamed from: a */
    public String f2286a = null;

    public C1049p(Context context) {
        this.f2287b = context;
    }

    /* JADX INFO: renamed from: a */
    public final String m1368a() {
        try {
            Cursor cursorQuery = this.f2287b.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
            if (cursorQuery != null) {
                string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("value")) : null;
                cursorQuery.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return string;
    }
}
