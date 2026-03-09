package com.anythink.china.p030a.p031a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.anythink.china.p030a.InterfaceC1033a;
import com.anythink.china.p030a.p031a.InterfaceC1038e;

/* JADX INFO: renamed from: com.anythink.china.a.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1039f implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private Context f2250a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1033a f2251b;

    public ServiceConnectionC1039f(Context context) {
        this.f2250a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m1337a(InterfaceC1033a interfaceC1033a) {
        if (this.f2250a == null) {
            return;
        }
        this.f2251b = interfaceC1033a;
        try {
            Intent intent = new Intent("android.service.action.msa");
            intent.setPackage("com.android.creator");
            this.f2250a.bindService(intent, this, 1);
        } catch (Throwable th) {
            th.getMessage();
            interfaceC1033a.mo1322a();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            InterfaceC1038e interfaceC1038eM1333a = InterfaceC1038e.b.m1333a(iBinder);
            if (interfaceC1038eM1333a != null) {
                this.f2251b.mo1323a(interfaceC1038eM1333a.mo1330b(), false);
            } else {
                this.f2251b.mo1322a();
            }
        } catch (Throwable th) {
            try {
                InterfaceC1033a interfaceC1033a = this.f2251b;
                if (interfaceC1033a != null) {
                    th.getMessage();
                    interfaceC1033a.mo1322a();
                }
                try {
                    this.f2250a.unbindService(this);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            } finally {
                try {
                    this.f2250a.unbindService(this);
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
