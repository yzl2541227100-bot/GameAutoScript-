package cn.haorui.sdk.core.oaid.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.oaid.OAIDException;
import java.util.Objects;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.i */
/* JADX INFO: loaded from: classes.dex */
public class C0529i implements InterfaceC0520b {

    /* JADX INFO: renamed from: a */
    public final Context f197a;

    public C0529i(Context context) {
        this.f197a = context;
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public void mo67a(InterfaceC0519a interfaceC0519a) {
        if (this.f197a == null || interfaceC0519a == null) {
            return;
        }
        try {
            Cursor cursorQuery = this.f197a.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
            try {
                Objects.requireNonNull(cursorQuery);
                cursorQuery.moveToFirst();
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                if (string == null || string.length() == 0) {
                    throw new OAIDException("OAID query failed");
                }
                String str = "OAID query success: " + string;
                ((AdSdk.C0476a) interfaceC0519a).m17a(string);
                cursorQuery.close();
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public boolean mo68a() {
        Context context = this.f197a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().resolveContentProvider("com.meizu.flyme.openidsdk", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
