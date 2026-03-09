package cn.haorui.sdk.core.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l;
import cn.haorui.sdk.core.oaid.repeackage.com.google.android.gms.ads.identifier.internal.InterfaceC0541a;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.f */
/* JADX INFO: loaded from: classes.dex */
public class C0526f implements InterfaceC0520b {

    /* JADX INFO: renamed from: a */
    public final Context f193a;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.f$a */
    public class a implements ServiceConnectionC0532l.a {
        public a(C0526f c0526f) {
        }

        @Override // cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l.a
        /* JADX INFO: renamed from: a */
        public String mo69a(IBinder iBinder) {
            InterfaceC0541a c4639a;
            int i = InterfaceC0541a.a.f219a;
            if (iBinder == null) {
                c4639a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                c4639a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0541a)) ? new InterfaceC0541a.a.C4639a(iBinder) : (InterfaceC0541a) iInterfaceQueryLocalInterface;
            }
            c4639a.mo79a(true);
            return c4639a.mo80c();
        }
    }

    public C0526f(Context context) {
        this.f193a = context;
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public void mo67a(InterfaceC0519a interfaceC0519a) {
        if (this.f193a == null || interfaceC0519a == null) {
            return;
        }
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        ServiceConnectionC0532l.m70a(this.f193a, intent, interfaceC0519a, new a(this));
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public boolean mo68a() {
        Context context = this.f193a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.android.vending", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
