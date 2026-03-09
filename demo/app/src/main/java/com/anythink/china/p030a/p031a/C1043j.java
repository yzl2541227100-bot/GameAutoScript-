package com.anythink.china.p030a.p031a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.china.p030a.InterfaceC1033a;

/* JADX INFO: renamed from: com.anythink.china.a.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1043j {

    /* JADX INFO: renamed from: a */
    private Context f2274a;

    public C1043j(Context context) {
        this.f2274a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m1360a(InterfaceC1033a interfaceC1033a) {
        try {
            this.f2274a.getPackageManager().getPackageInfo("com.meizu.flyme.openidsdk", 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String string = null;
        try {
            Cursor cursorQuery = this.f2274a.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.moveToFirst();
                int columnIndex = cursorQuery.getColumnIndex("value");
                if (columnIndex > 0) {
                    string = cursorQuery.getString(columnIndex);
                }
            }
            interfaceC1033a.mo1323a(string, false);
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
        if (TextUtils.isEmpty(string)) {
            interfaceC1033a.mo1322a();
        }
    }
}
