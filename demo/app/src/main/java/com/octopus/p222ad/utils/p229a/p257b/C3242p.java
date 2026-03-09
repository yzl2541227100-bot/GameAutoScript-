package com.octopus.p222ad.utils.p229a.p257b;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.octopus.p222ad.utils.p229a.C3246e;
import com.octopus.p222ad.utils.p229a.C3247f;
import com.octopus.p222ad.utils.p229a.C3248g;
import com.octopus.p222ad.utils.p229a.InterfaceC3244c;
import com.octopus.p222ad.utils.p229a.InterfaceC3245d;
import java.util.Objects;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.b.p */
/* JADX INFO: loaded from: classes2.dex */
public class C3242p implements InterfaceC3245d {

    /* JADX INFO: renamed from: a */
    private final Context f17878a;

    public C3242p(Context context) {
        this.f17878a = context;
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public void mo14919a(InterfaceC3244c interfaceC3244c) {
        if (this.f17878a == null || interfaceC3244c == null) {
            return;
        }
        try {
            Cursor cursorQuery = this.f17878a.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
            try {
                Objects.requireNonNull(cursorQuery);
                cursorQuery.moveToFirst();
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                if (string == null || string.length() == 0) {
                    throw new C3246e("OAID query failed");
                }
                C3247f.m14935a("OAID query success: " + string);
                interfaceC3244c.mo14854a(string);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } finally {
            }
        } catch (Exception e) {
            C3247f.m14935a(e);
            interfaceC3244c.mo14853a(e);
        }
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public boolean mo14920a() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        return C3248g.m14937a("persist.sys.identifierid.supported", "0").equals("1");
    }
}
