package cn.haorui.sdk.core.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.oaid.OAIDException;
import cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l;
import cn.haorui.sdk.core.oaid.repeackage.com.zui.deviceidservice.InterfaceC0544a;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.h */
/* JADX INFO: loaded from: classes.dex */
public class C0528h implements InterfaceC0520b {

    /* JADX INFO: renamed from: a */
    public final Context f196a;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.h$a */
    public class a implements ServiceConnectionC0532l.a {
        public a(C0528h c0528h) {
        }

        @Override // cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l.a
        /* JADX INFO: renamed from: a */
        public String mo69a(IBinder iBinder) {
            InterfaceC0544a c4642a;
            int i = InterfaceC0544a.a.f225a;
            if (iBinder == null) {
                c4642a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zui.deviceidservice.IDeviceidInterface");
                c4642a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0544a)) ? new InterfaceC0544a.a.C4642a(iBinder) : (InterfaceC0544a) iInterfaceQueryLocalInterface;
            }
            if (c4642a == null) {
                throw new OAIDException("IDeviceidInterface is null");
            }
            if (c4642a.mo84b()) {
                return c4642a.mo83a();
            }
            throw new OAIDException("IDeviceidInterface#isSupport return false");
        }
    }

    public C0528h(Context context) {
        this.f196a = context;
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public void mo67a(InterfaceC0519a interfaceC0519a) {
        if (this.f196a == null || interfaceC0519a == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        ServiceConnectionC0532l.m70a(this.f196a, intent, interfaceC0519a, new a(this));
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public boolean mo68a() {
        Context context = this.f196a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.zui.deviceidservice", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
