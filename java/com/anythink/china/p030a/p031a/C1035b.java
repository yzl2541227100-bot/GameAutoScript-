package com.anythink.china.p030a.p031a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.anythink.china.p030a.InterfaceC1033a;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.anythink.china.a.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1035b {

    /* JADX INFO: renamed from: a */
    public final LinkedBlockingQueue<IBinder> f2234a = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: b */
    public ServiceConnection f2235b = new ServiceConnection() { // from class: com.anythink.china.a.a.b.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                C1035b.this.f2234a.put(iBinder);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: renamed from: c */
    private Context f2236c;

    public C1035b(Context context) {
        this.f2236c = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m1325a(InterfaceC1033a interfaceC1033a) {
        try {
            this.f2236c.getPackageManager().getPackageInfo("com.asus.msa.SupplementaryDID", 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Intent intent = new Intent();
        intent.setAction("com.asus.msa.action.ACCESS_DID");
        intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
        if (!this.f2236c.bindService(intent, this.f2235b, 1)) {
            interfaceC1033a.mo1322a();
            return;
        }
        try {
            interfaceC1033a.mo1323a(new C1034a(this.f2234a.take()).m1324a(), false);
        } catch (Exception e) {
            e.getMessage();
            interfaceC1033a.mo1322a();
        } catch (Throwable th2) {
            th2.getMessage();
            interfaceC1033a.mo1322a();
        }
    }
}
