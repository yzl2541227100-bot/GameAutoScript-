package cn.haorui.sdk.core.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.oaid.OAIDException;
import cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l;
import cn.haorui.sdk.core.oaid.repeackage.com.android.creator.InterfaceC0537a;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.e */
/* JADX INFO: loaded from: classes.dex */
public class C0525e implements InterfaceC0520b {

    /* JADX INFO: renamed from: a */
    public final Context f192a;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.e$a */
    public class a implements ServiceConnectionC0532l.a {
        public a(C0525e c0525e) {
        }

        @Override // cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l.a
        /* JADX INFO: renamed from: a */
        public String mo69a(IBinder iBinder) {
            InterfaceC0537a c4635a;
            int i = InterfaceC0537a.a.f211a;
            if (iBinder == null) {
                c4635a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.creator.IdsSupplier");
                c4635a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0537a)) ? new InterfaceC0537a.a.C4635a(iBinder) : (InterfaceC0537a) iInterfaceQueryLocalInterface;
            }
            if (c4635a != null) {
                return c4635a.mo73a();
            }
            throw new OAIDException("IdsSupplier is null");
        }
    }

    public C0525e(Context context) {
        this.f192a = context;
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public void mo67a(InterfaceC0519a interfaceC0519a) {
        if (this.f192a == null || interfaceC0519a == null) {
            return;
        }
        Intent intent = new Intent("android.service.action.msa");
        intent.setPackage("com.android.creator");
        ServiceConnectionC0532l.m70a(this.f192a, intent, interfaceC0519a, new a(this));
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public boolean mo68a() {
        Context context = this.f192a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.android.creator", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
