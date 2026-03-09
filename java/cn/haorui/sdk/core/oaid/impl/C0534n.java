package cn.haorui.sdk.core.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.oaid.OAIDException;
import cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l;
import cn.haorui.sdk.core.oaid.repeackage.com.samsung.android.deviceidservice.InterfaceC0543a;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.n */
/* JADX INFO: loaded from: classes.dex */
public class C0534n implements InterfaceC0520b {

    /* JADX INFO: renamed from: a */
    public final Context f206a;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.n$a */
    public class a implements ServiceConnectionC0532l.a {
        public a(C0534n c0534n) {
        }

        @Override // cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l.a
        /* JADX INFO: renamed from: a */
        public String mo69a(IBinder iBinder) {
            InterfaceC0543a c4641a;
            int i = InterfaceC0543a.a.f223a;
            if (iBinder == null) {
                c4641a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                c4641a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0543a)) ? new InterfaceC0543a.a.C4641a(iBinder) : (InterfaceC0543a) iInterfaceQueryLocalInterface;
            }
            if (c4641a != null) {
                return c4641a.mo82a();
            }
            throw new OAIDException("IDeviceIdService is null");
        }
    }

    public C0534n(Context context) {
        this.f206a = context;
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public void mo67a(InterfaceC0519a interfaceC0519a) {
        if (this.f206a == null || interfaceC0519a == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        ServiceConnectionC0532l.m70a(this.f206a, intent, interfaceC0519a, new a(this));
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public boolean mo68a() {
        Context context = this.f206a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.samsung.android.deviceidservice", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
