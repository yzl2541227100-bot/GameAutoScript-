package cn.haorui.sdk.core.oaid.impl;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.oaid.OAIDException;
import cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l;
import cn.haorui.sdk.core.oaid.repeackage.com.coolpad.deviceidsupport.InterfaceC0540a;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.b */
/* JADX INFO: loaded from: classes.dex */
public class C0522b implements InterfaceC0520b {

    /* JADX INFO: renamed from: a */
    public final Context f188a;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.b$a */
    public class a implements ServiceConnectionC0532l.a {
        public a() {
        }

        @Override // cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l.a
        /* JADX INFO: renamed from: a */
        public String mo69a(IBinder iBinder) {
            InterfaceC0540a c4638a;
            int i = InterfaceC0540a.a.f217a;
            if (iBinder == null) {
                c4638a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
                c4638a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0540a)) ? new InterfaceC0540a.a.C4638a(iBinder) : (InterfaceC0540a) iInterfaceQueryLocalInterface;
            }
            if (c4638a != null) {
                return c4638a.mo78a(C0522b.this.f188a.getPackageName());
            }
            throw new OAIDException("IDeviceIdManager is null");
        }
    }

    public C0522b(Context context) {
        this.f188a = context instanceof Application ? context : context.getApplicationContext();
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public void mo67a(InterfaceC0519a interfaceC0519a) {
        if (this.f188a == null || interfaceC0519a == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.coolpad.deviceidsupport", "com.coolpad.deviceidsupport.DeviceIdService"));
        ServiceConnectionC0532l.m70a(this.f188a, intent, interfaceC0519a, new a());
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public boolean mo68a() {
        Context context = this.f188a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.coolpad.deviceidsupport", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
