package com.anythink.china.p030a.p031a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.anythink.china.p030a.InterfaceC1033a;
import com.anythink.china.p030a.p031a.InterfaceC1050q;

/* JADX INFO: renamed from: com.anythink.china.a.a.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1051r {

    /* JADX INFO: renamed from: a */
    public InterfaceC1050q f2290a;

    /* JADX INFO: renamed from: b */
    public ServiceConnection f2291b = new ServiceConnection() { // from class: com.anythink.china.a.a.r.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1051r.this.f2290a = new InterfaceC1050q.a(iBinder);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: renamed from: c */
    private Context f2292c;

    public C1051r(Context context) {
        this.f2292c = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m1371a(InterfaceC1033a interfaceC1033a) {
        InterfaceC1050q interfaceC1050q;
        try {
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            if (!this.f2292c.bindService(intent, this.f2291b, 1) || (interfaceC1050q = this.f2290a) == null) {
                interfaceC1033a.mo1322a();
            } else {
                interfaceC1033a.mo1323a(interfaceC1050q.mo1369a(), false);
            }
        } catch (Throwable th) {
            th.getMessage();
            interfaceC1033a.mo1322a();
        }
    }
}
