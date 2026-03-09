package cn.haorui.sdk.core.oaid.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.core.loader.C0509e;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.oaid.OAIDException;
import java.util.Objects;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.o */
/* JADX INFO: loaded from: classes.dex */
public class C0535o implements InterfaceC0520b {

    /* JADX INFO: renamed from: a */
    public final Context f207a;

    public C0535o(Context context) {
        this.f207a = context;
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public void mo67a(InterfaceC0519a interfaceC0519a) {
        if (this.f207a == null || interfaceC0519a == null) {
            return;
        }
        try {
            Cursor cursorQuery = this.f207a.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
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
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        return C0509e.m42a("persist.sys.identifierid.supported", "0").equals("1");
    }
}
