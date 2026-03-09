package com.anythink.china.p030a.p031a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.anythink.china.p030a.InterfaceC1033a;
import com.anythink.china.p030a.p031a.InterfaceC1047n;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.anythink.china.a.a.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1048o {

    /* JADX INFO: renamed from: a */
    public final LinkedBlockingQueue<IBinder> f2282a = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: b */
    public ServiceConnection f2283b = new ServiceConnection() { // from class: com.anythink.china.a.a.o.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                C1048o.this.f2282a.put(iBinder);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: renamed from: c */
    private Context f2284c;

    public C1048o(Context context) {
        this.f2284c = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m1367a(InterfaceC1033a interfaceC1033a) {
        try {
            this.f2284c.getPackageManager().getPackageInfo("com.samsung.android.deviceidservice", 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (!this.f2284c.bindService(intent, this.f2283b, 1)) {
            interfaceC1033a.mo1322a();
            return;
        }
        try {
            interfaceC1033a.mo1323a(new InterfaceC1047n.a(this.f2282a.take()).m1366a(), false);
        } catch (Throwable th2) {
            th2.printStackTrace();
            th2.getMessage();
            interfaceC1033a.mo1322a();
        }
    }
}
