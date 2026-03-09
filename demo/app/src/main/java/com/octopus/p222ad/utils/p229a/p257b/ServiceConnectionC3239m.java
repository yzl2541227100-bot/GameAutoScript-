package com.octopus.p222ad.utils.p229a.p257b;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.octopus.p222ad.utils.p229a.C3246e;
import com.octopus.p222ad.utils.p229a.C3247f;
import com.octopus.p222ad.utils.p229a.InterfaceC3244c;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.b.m */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceConnectionC3239m implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final Context f17870a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC3244c f17871b;

    /* JADX INFO: renamed from: c */
    private final a f17872c;

    /* JADX INFO: renamed from: com.octopus.ad.utils.a.b.m$a */
    @FunctionalInterface
    public interface a {
        /* JADX INFO: renamed from: a */
        String mo14921a(IBinder iBinder) throws C3246e, RemoteException;
    }

    private ServiceConnectionC3239m(Context context, InterfaceC3244c interfaceC3244c, a aVar) {
        this.f17870a = context instanceof Application ? context : context.getApplicationContext();
        this.f17871b = interfaceC3244c;
        this.f17872c = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m14929a(Context context, Intent intent, InterfaceC3244c interfaceC3244c, a aVar) {
        new ServiceConnectionC3239m(context, interfaceC3244c, aVar).m14930a(intent);
    }

    /* JADX INFO: renamed from: a */
    private void m14930a(Intent intent) {
        try {
            if (!this.f17870a.bindService(intent, this, 1)) {
                throw new C3246e("Service binding failed");
            }
            C3247f.m14935a("Service has been bound: " + intent);
        } catch (Exception e) {
            this.f17871b.mo14853a(e);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3247f.m14935a("Service has been connected: " + componentName.getClassName());
        try {
            try {
                try {
                    String strMo14921a = this.f17872c.mo14921a(iBinder);
                    if (strMo14921a == null || strMo14921a.length() == 0) {
                        throw new C3246e("OAID/GAID acquire failed");
                    }
                    C3247f.m14935a("OAID/GAID acquire success: " + strMo14921a);
                    this.f17871b.mo14854a(strMo14921a);
                    this.f17870a.unbindService(this);
                    C3247f.m14935a("Service has been unbound: " + componentName.getClassName());
                } catch (Exception e) {
                    C3247f.m14935a(e);
                    this.f17871b.mo14853a(e);
                    this.f17870a.unbindService(this);
                    C3247f.m14935a("Service has been unbound: " + componentName.getClassName());
                }
            } catch (Exception e2) {
                C3247f.m14935a(e2);
            }
        } catch (Throwable th) {
            try {
                this.f17870a.unbindService(this);
                C3247f.m14935a("Service has been unbound: " + componentName.getClassName());
            } catch (Exception e3) {
                C3247f.m14935a(e3);
            }
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        C3247f.m14935a("Service has been disconnected: " + componentName.getClassName());
    }
}
