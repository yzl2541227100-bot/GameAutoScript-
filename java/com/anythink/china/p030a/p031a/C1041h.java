package com.anythink.china.p030a.p031a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.anythink.china.p030a.InterfaceC1033a;
import com.anythink.china.p030a.p031a.InterfaceC1040g;

/* JADX INFO: renamed from: com.anythink.china.a.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1041h {

    /* JADX INFO: renamed from: a */
    private static final String f2256a = "OaidAidlUtil";

    /* JADX INFO: renamed from: b */
    private static final String f2257b = "com.huawei.hwid";

    /* JADX INFO: renamed from: c */
    private static final String f2258c = "com.uodis.opendevice.OPENIDS_SERVICE";

    /* JADX INFO: renamed from: d */
    private Context f2259d;

    /* JADX INFO: renamed from: e */
    private ServiceConnection f2260e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1040g f2261f;

    /* JADX INFO: renamed from: g */
    private InterfaceC1033a f2262g;

    /* JADX INFO: renamed from: com.anythink.china.a.a.h$a */
    public final class a implements ServiceConnection {
        private a() {
        }

        public /* synthetic */ a(C1041h c1041h, byte b) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC1033a interfaceC1033a;
            C1041h.this.f2261f = InterfaceC1040g.a.m1340a(iBinder);
            try {
                if (C1041h.this.f2261f != null) {
                    try {
                        if (C1041h.this.f2262g != null) {
                            C1041h.this.f2262g.mo1323a(C1041h.this.f2261f.mo1338a(), C1041h.this.f2261f.mo1339b());
                        }
                    } catch (RemoteException e) {
                        if (C1041h.this.f2262g != null) {
                            interfaceC1033a = C1041h.this.f2262g;
                            e.getMessage();
                            interfaceC1033a.mo1322a();
                        }
                    } catch (Exception e2) {
                        if (C1041h.this.f2262g != null) {
                            interfaceC1033a = C1041h.this.f2262g;
                            e2.getMessage();
                            interfaceC1033a.mo1322a();
                        }
                    }
                }
            } finally {
                C1041h.m1347c(C1041h.this);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            C1041h.this.f2261f = null;
        }
    }

    public C1041h(Context context) {
        this.f2259d = context;
    }

    /* JADX INFO: renamed from: a */
    private boolean m1344a() {
        byte b = 0;
        if (this.f2259d == null) {
            return false;
        }
        this.f2260e = new a(this, b);
        Intent intent = new Intent(f2258c);
        intent.setPackage(f2257b);
        return this.f2259d.bindService(intent, this.f2260e, 1);
    }

    /* JADX INFO: renamed from: b */
    private void m1346b() {
        ServiceConnection serviceConnection;
        Context context = this.f2259d;
        if (context == null || (serviceConnection = this.f2260e) == null) {
            return;
        }
        try {
            context.unbindService(serviceConnection);
        } catch (Throwable unused) {
        }
        this.f2261f = null;
        this.f2259d = null;
        this.f2262g = null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1347c(C1041h c1041h) {
        ServiceConnection serviceConnection;
        Context context = c1041h.f2259d;
        if (context == null || (serviceConnection = c1041h.f2260e) == null) {
            return;
        }
        try {
            context.unbindService(serviceConnection);
        } catch (Throwable unused) {
        }
        c1041h.f2261f = null;
        c1041h.f2259d = null;
        c1041h.f2262g = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m1348a(InterfaceC1033a interfaceC1033a) {
        this.f2262g = interfaceC1033a;
        if (this.f2259d != null) {
            this.f2260e = new a(this, (byte) 0);
            Intent intent = new Intent(f2258c);
            intent.setPackage(f2257b);
            this.f2259d.bindService(intent, this.f2260e, 1);
        }
    }
}
