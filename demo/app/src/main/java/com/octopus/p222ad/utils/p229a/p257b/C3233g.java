package com.octopus.p222ad.utils.p229a.p257b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import com.octopus.p222ad.utils.p229a.C3246e;
import com.octopus.p222ad.utils.p229a.C3247f;
import com.octopus.p222ad.utils.p229a.InterfaceC3244c;
import com.octopus.p222ad.utils.p229a.InterfaceC3245d;
import com.octopus.p222ad.utils.p229a.p230a.p231a.p252h.p253a.p254a.InterfaceC3224a;
import com.octopus.p222ad.utils.p229a.p257b.ServiceConnectionC3239m;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.b.g */
/* JADX INFO: loaded from: classes2.dex */
public class C3233g implements InterfaceC3245d {

    /* JADX INFO: renamed from: a */
    private final Context f17859a;

    /* JADX INFO: renamed from: b */
    private String f17860b;

    public C3233g(Context context) {
        this.f17859a = context;
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public void mo14919a(InterfaceC3244c interfaceC3244c) {
        Context context = this.f17859a;
        if (context == null || interfaceC3244c == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                String string = Settings.Global.getString(context.getContentResolver(), "pps_oaid");
                if (!TextUtils.isEmpty(string)) {
                    C3247f.m14935a("Get oaid from global settings: " + string);
                    interfaceC3244c.mo14854a(string);
                    return;
                }
            } catch (Exception e) {
                C3247f.m14935a(e);
            }
        }
        if (TextUtils.isEmpty(this.f17860b) && !mo14920a()) {
            interfaceC3244c.mo14853a(new C3246e("Huawei Advertising ID not available"));
            return;
        }
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage(this.f17860b);
        ServiceConnectionC3239m.m14929a(this.f17859a, intent, interfaceC3244c, new ServiceConnectionC3239m.a() { // from class: com.octopus.ad.utils.a.b.g.1
            @Override // com.octopus.p222ad.utils.p229a.p257b.ServiceConnectionC3239m.a
            /* JADX INFO: renamed from: a */
            public String mo14921a(IBinder iBinder) throws C3246e, RemoteException {
                InterfaceC3224a interfaceC3224aM14900a = InterfaceC3224a.a.m14900a(iBinder);
                if (interfaceC3224aM14900a.mo14899b()) {
                    throw new C3246e("User has disabled advertising identifier");
                }
                return interfaceC3224aM14900a.mo14898a();
            }
        });
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public boolean mo14920a() {
        Context context = this.f17859a;
        if (context == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.getPackageInfo("com.huawei.hwid", 0) != null) {
                this.f17860b = "com.huawei.hwid";
            } else if (packageManager.getPackageInfo("com.huawei.hwid.tv", 0) != null) {
                this.f17860b = "com.huawei.hwid.tv";
            } else {
                this.f17860b = "com.huawei.hms";
                if (packageManager.getPackageInfo("com.huawei.hms", 0) == null) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            C3247f.m14935a(e);
            return false;
        }
    }
}
