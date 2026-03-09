package com.anythink.china.p030a.p031a;

import android.app.KeyguardManager;
import android.content.Context;
import com.anythink.china.p030a.InterfaceC1033a;

/* JADX INFO: renamed from: com.anythink.china.a.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1037d {

    /* JADX INFO: renamed from: a */
    private Context f2240a;

    /* JADX INFO: renamed from: b */
    private KeyguardManager f2241b;

    public C1037d(Context context) {
        this.f2240a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m1327a(InterfaceC1033a interfaceC1033a) {
        Context context = this.f2240a;
        if (context == null) {
            return;
        }
        if (this.f2241b == null) {
            this.f2241b = (KeyguardManager) context.getSystemService("keyguard");
        }
        KeyguardManager keyguardManager = this.f2241b;
        if (keyguardManager == null) {
            interfaceC1033a.mo1322a();
            return;
        }
        try {
            Object objInvoke = keyguardManager.getClass().getDeclaredMethod("obtainOaid", new Class[0]).invoke(this.f2241b, new Object[0]);
            if (objInvoke != null) {
                interfaceC1033a.mo1323a(objInvoke.toString(), false);
            } else {
                interfaceC1033a.mo1322a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
