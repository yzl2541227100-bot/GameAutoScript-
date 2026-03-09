package cn.haorui.sdk.core.oaid.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.oaid.OAIDException;
import cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l;
import cn.haorui.sdk.core.oaid.repeackage.com.asus.msa.SupplementaryDID.InterfaceC0538a;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.a */
/* JADX INFO: loaded from: classes.dex */
public class C0521a implements InterfaceC0520b {

    /* JADX INFO: renamed from: a */
    public final Context f187a;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.a$a */
    public class a implements ServiceConnectionC0532l.a {
        public a(C0521a c0521a) {
        }

        @Override // cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l.a
        /* JADX INFO: renamed from: a */
        public String mo69a(IBinder iBinder) {
            InterfaceC0538a c4636a;
            int i = InterfaceC0538a.a.f213a;
            if (iBinder == null) {
                c4636a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                c4636a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0538a)) ? new InterfaceC0538a.a.C4636a(iBinder) : (InterfaceC0538a) iInterfaceQueryLocalInterface;
            }
            if (c4636a == null) {
                throw new OAIDException("IDidAidlInterface is null");
            }
            if (c4636a.mo75b()) {
                return c4636a.mo74a();
            }
            throw new OAIDException("IDidAidlInterface#isSupport return false");
        }
    }

    public C0521a(Context context) {
        this.f187a = context;
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public void mo67a(InterfaceC0519a interfaceC0519a) {
        if (this.f187a == null || interfaceC0519a == null) {
            return;
        }
        Intent intent = new Intent("com.asus.msa.action.ACCESS_DID");
        intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
        ServiceConnectionC0532l.m70a(this.f187a, intent, interfaceC0519a, new a(this));
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public boolean mo68a() {
        Context context = this.f187a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.asus.msa.SupplementaryDID", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
