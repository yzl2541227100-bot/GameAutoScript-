package cn.haorui.sdk.core.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.oaid.OAIDException;
import cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l;
import cn.haorui.sdk.core.oaid.repeackage.com.bun.lib.InterfaceC0539a;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.j */
/* JADX INFO: loaded from: classes.dex */
public class C0530j implements InterfaceC0520b {

    /* JADX INFO: renamed from: a */
    public final Context f198a;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.j$a */
    public class a implements ServiceConnectionC0532l.a {
        public a(C0530j c0530j) {
        }

        @Override // cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l.a
        /* JADX INFO: renamed from: a */
        public String mo69a(IBinder iBinder) {
            InterfaceC0539a c4637a;
            int i = InterfaceC0539a.a.f215a;
            if (iBinder == null) {
                c4637a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bun.lib.MsaIdInterface");
                c4637a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0539a)) ? new InterfaceC0539a.a.C4637a(iBinder) : (InterfaceC0539a) iInterfaceQueryLocalInterface;
            }
            if (c4637a == null) {
                throw new OAIDException("MsaIdInterface is null");
            }
            if (c4637a.mo77d()) {
                return c4637a.mo76a();
            }
            throw new OAIDException("MsaIdInterface#isSupported return false");
        }
    }

    public C0530j(Context context) {
        this.f198a = context;
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public void mo67a(InterfaceC0519a interfaceC0519a) {
        if (this.f198a == null || interfaceC0519a == null) {
            return;
        }
        try {
            Intent intent = new Intent("com.bun.msa.action.start.service");
            intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaKlService");
            intent.putExtra("com.bun.msa.param.pkgname", this.f198a.getPackageName());
            if (Build.VERSION.SDK_INT < 26) {
                this.f198a.startService(intent);
            } else {
                this.f198a.startForegroundService(intent);
            }
        } catch (Exception unused) {
        }
        Intent intent2 = new Intent("com.bun.msa.action.bindto.service");
        intent2.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent2.putExtra("com.bun.msa.param.pkgname", this.f198a.getPackageName());
        ServiceConnectionC0532l.m70a(this.f198a, intent2, interfaceC0519a, new a(this));
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public boolean mo68a() {
        Context context = this.f198a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.mdid.msa", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
