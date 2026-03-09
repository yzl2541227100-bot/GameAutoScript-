package cn.haorui.sdk.core.oaid.impl;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.oaid.OAIDException;
import cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l;
import cn.haorui.sdk.core.oaid.repeackage.com.heytap.openid.InterfaceC0542a;
import java.security.MessageDigest;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.m */
/* JADX INFO: loaded from: classes.dex */
public class C0533m implements InterfaceC0520b {

    /* JADX INFO: renamed from: a */
    public final Context f203a;

    /* JADX INFO: renamed from: b */
    public String f204b;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.m$a */
    public class a implements ServiceConnectionC0532l.a {
        public a() {
        }

        @Override // cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l.a
        /* JADX INFO: renamed from: a */
        public String mo69a(IBinder iBinder) throws RemoteException {
            try {
                return C0533m.m71a(C0533m.this, iBinder);
            } catch (RemoteException e) {
                throw e;
            } catch (OAIDException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new OAIDException(e3);
            }
        }
    }

    public C0533m(Context context) {
        this.f203a = context instanceof Application ? context : context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static String m71a(C0533m c0533m, IBinder iBinder) {
        String packageName = c0533m.f203a.getPackageName();
        String string = c0533m.f204b;
        if (string == null) {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(c0533m.f203a.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
            }
            string = sb.toString();
            c0533m.f204b = string;
        }
        return c0533m.m72a(iBinder, packageName, string);
    }

    /* JADX INFO: renamed from: a */
    public final String m72a(IBinder iBinder, String str, String str2) {
        InterfaceC0542a c4640a;
        int i = InterfaceC0542a.a.f221a;
        if (iBinder == null) {
            c4640a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            c4640a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0542a)) ? new InterfaceC0542a.a.C4640a(iBinder) : (InterfaceC0542a) iInterfaceQueryLocalInterface;
        }
        if (c4640a != null) {
            return c4640a.mo81a(str, str2, "OUID");
        }
        throw new OAIDException("IOpenID is null");
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public void mo67a(InterfaceC0519a interfaceC0519a) {
        if (this.f203a == null || interfaceC0519a == null) {
            return;
        }
        Intent intent = new Intent("action.com.heytap.openid.OPEN_ID_SERVICE");
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        ServiceConnectionC0532l.m70a(this.f203a, intent, interfaceC0519a, new a());
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public boolean mo68a() {
        Context context = this.f203a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.heytap.openid", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
