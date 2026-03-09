package com.anythink.china.p030a.p031a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.anythink.china.p030a.InterfaceC1033a;
import com.anythink.china.p030a.p031a.InterfaceC1042i;

/* JADX INFO: renamed from: com.anythink.china.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1036c implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private Context f2238a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1033a f2239b;

    public ServiceConnectionC1036c(Context context) {
        this.f2238a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m1326a(InterfaceC1033a interfaceC1033a) {
        if (this.f2238a == null) {
            return;
        }
        try {
            this.f2239b = interfaceC1033a;
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.coolpad.deviceidsupport", "com.coolpad.deviceidsupport.DeviceIdService"));
            this.f2238a.bindService(intent, this, 1);
        } catch (Throwable th) {
            InterfaceC1033a interfaceC1033a2 = this.f2239b;
            if (interfaceC1033a2 != null) {
                th.getMessage();
                interfaceC1033a2.mo1322a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            InterfaceC1042i interfaceC1042iM1356a = InterfaceC1042i.b.m1356a(iBinder);
            if (interfaceC1042iM1356a != null) {
                this.f2239b.mo1323a(interfaceC1042iM1356a.mo1352b(this.f2238a.getPackageName()), false);
            } else {
                this.f2239b.mo1322a();
            }
        } catch (Throwable th) {
            try {
                InterfaceC1033a interfaceC1033a = this.f2239b;
                if (interfaceC1033a != null) {
                    th.getMessage();
                    interfaceC1033a.mo1322a();
                }
                try {
                    this.f2238a.unbindService(this);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            } finally {
                try {
                    this.f2238a.unbindService(this);
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
