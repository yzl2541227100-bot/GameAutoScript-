package com.octopus.p222ad.utils.p229a.p257b;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import com.octopus.p222ad.utils.p229a.C3246e;
import com.octopus.p222ad.utils.p229a.C3247f;
import com.octopus.p222ad.utils.p229a.InterfaceC3244c;
import com.octopus.p222ad.utils.p229a.InterfaceC3245d;
import com.octopus.p222ad.utils.p229a.p230a.p231a.p247f.p248a.InterfaceC3222a;
import com.octopus.p222ad.utils.p229a.p257b.ServiceConnectionC3239m;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.b.n */
/* JADX INFO: loaded from: classes2.dex */
public class C3240n implements InterfaceC3245d {

    /* JADX INFO: renamed from: a */
    private final Context f17873a;

    /* JADX INFO: renamed from: b */
    private String f17874b;

    public C3240n(Context context) {
        this.f17873a = context instanceof Application ? context : context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"PackageManagerGetSignatures"})
    /* JADX INFO: renamed from: a */
    public String m14931a(IBinder iBinder) throws C3246e, PackageManager.NameNotFoundException, NoSuchAlgorithmException, RemoteException {
        String packageName = this.f17873a.getPackageName();
        String str = this.f17874b;
        if (str != null) {
            return m14932a(iBinder, packageName, str);
        }
        byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(this.f17873a.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray());
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
        }
        String string = sb.toString();
        this.f17874b = string;
        return m14932a(iBinder, packageName, string);
    }

    /* JADX INFO: renamed from: a */
    private String m14932a(IBinder iBinder, String str, String str2) throws C3246e, RemoteException {
        InterfaceC3222a interfaceC3222aM14892a = InterfaceC3222a.a.m14892a(iBinder);
        if (interfaceC3222aM14892a != null) {
            return interfaceC3222aM14892a.mo14890a(str, str2, "OUID");
        }
        throw new C3246e("IOpenID is null");
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public void mo14919a(InterfaceC3244c interfaceC3244c) {
        if (this.f17873a == null || interfaceC3244c == null) {
            return;
        }
        Intent intent = new Intent("action.com.heytap.openid.OPEN_ID_SERVICE");
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        ServiceConnectionC3239m.m14929a(this.f17873a, intent, interfaceC3244c, new ServiceConnectionC3239m.a() { // from class: com.octopus.ad.utils.a.b.n.1
            @Override // com.octopus.p222ad.utils.p229a.p257b.ServiceConnectionC3239m.a
            /* JADX INFO: renamed from: a */
            public String mo14921a(IBinder iBinder) throws C3246e, RemoteException {
                try {
                    return C3240n.this.m14931a(iBinder);
                } catch (RemoteException e) {
                    throw e;
                } catch (C3246e e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw new C3246e(e3);
                }
            }
        });
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public boolean mo14920a() {
        Context context = this.f17873a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.heytap.openid", 0) != null;
        } catch (Exception e) {
            C3247f.m14935a(e);
            return false;
        }
    }
}
