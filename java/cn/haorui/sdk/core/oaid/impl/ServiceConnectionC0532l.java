package cn.haorui.sdk.core.oaid.impl;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.OAIDException;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.l */
/* JADX INFO: loaded from: classes.dex */
public class ServiceConnectionC0532l implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final Context f200a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0519a f201b;

    /* JADX INFO: renamed from: c */
    public final a f202c;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.l$a */
    @FunctionalInterface
    public interface a {
        /* JADX INFO: renamed from: a */
        String mo69a(IBinder iBinder);
    }

    public ServiceConnectionC0532l(Context context, InterfaceC0519a interfaceC0519a, a aVar) {
        this.f200a = context instanceof Application ? context : context.getApplicationContext();
        this.f201b = interfaceC0519a;
        this.f202c = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m70a(Context context, Intent intent, InterfaceC0519a interfaceC0519a, a aVar) {
        ServiceConnectionC0532l serviceConnectionC0532l = new ServiceConnectionC0532l(context, interfaceC0519a, aVar);
        try {
            if (!serviceConnectionC0532l.f200a.bindService(intent, serviceConnectionC0532l, 1)) {
                throw new OAIDException("Service binding failed");
            }
            String str = "Service has been bound: " + intent;
        } catch (Exception unused) {
            ((AdSdk.C0476a) serviceConnectionC0532l.f201b).getClass();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        StringBuilder sb;
        String strMo69a;
        String str = "Service has been connected: " + componentName.getClassName();
        try {
            try {
                try {
                    strMo69a = this.f202c.mo69a(iBinder);
                } catch (Exception unused) {
                    return;
                }
            } catch (Exception unused2) {
                ((AdSdk.C0476a) this.f201b).getClass();
                this.f200a.unbindService(this);
                sb = new StringBuilder();
                sb.append("Service has been unbound: ");
            }
            if (strMo69a == null || strMo69a.length() == 0) {
                throw new OAIDException("OAID/AAID acquire failed");
            }
            String str2 = "OAID/AAID acquire success: " + strMo69a;
            ((AdSdk.C0476a) this.f201b).m17a(strMo69a);
            this.f200a.unbindService(this);
            sb = new StringBuilder();
            sb.append("Service has been unbound: ");
            sb.append(componentName.getClassName());
            sb.toString();
        } catch (Throwable th) {
            try {
                this.f200a.unbindService(this);
                String str3 = "Service has been unbound: " + componentName.getClassName();
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        String str = "Service has been disconnected: " + componentName.getClassName();
    }
}
