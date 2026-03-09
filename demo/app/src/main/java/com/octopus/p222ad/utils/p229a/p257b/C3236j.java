package com.octopus.p222ad.utils.p229a.p257b;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import com.octopus.p222ad.utils.p229a.C3246e;
import com.octopus.p222ad.utils.p229a.C3247f;
import com.octopus.p222ad.utils.p229a.InterfaceC3244c;
import com.octopus.p222ad.utils.p229a.InterfaceC3245d;
import com.octopus.p222ad.utils.p229a.p230a.p231a.p237c.p238a.InterfaceC3219a;
import com.octopus.p222ad.utils.p229a.p257b.ServiceConnectionC3239m;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.b.j */
/* JADX INFO: loaded from: classes2.dex */
public class C3236j implements InterfaceC3245d {

    /* JADX INFO: renamed from: a */
    private final Context f17865a;

    public C3236j(Context context) {
        this.f17865a = context;
    }

    /* JADX INFO: renamed from: b */
    private void m14923b() {
        try {
            Intent intent = new Intent("com.bun.msa.action.start.service");
            intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaKlService");
            intent.putExtra("com.bun.msa.param.pkgname", this.f17865a.getPackageName());
            if (Build.VERSION.SDK_INT < 26) {
                this.f17865a.startService(intent);
            } else {
                this.f17865a.startForegroundService(intent);
            }
        } catch (Exception e) {
            C3247f.m14935a(e);
        }
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public void mo14919a(InterfaceC3244c interfaceC3244c) {
        if (this.f17865a == null || interfaceC3244c == null) {
            return;
        }
        m14923b();
        Intent intent = new Intent("com.bun.msa.action.bindto.service");
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent.putExtra("com.bun.msa.param.pkgname", this.f17865a.getPackageName());
        ServiceConnectionC3239m.m14929a(this.f17865a, intent, interfaceC3244c, new ServiceConnectionC3239m.a() { // from class: com.octopus.ad.utils.a.b.j.1
            @Override // com.octopus.p222ad.utils.p229a.p257b.ServiceConnectionC3239m.a
            /* JADX INFO: renamed from: a */
            public String mo14921a(IBinder iBinder) throws C3246e, RemoteException {
                InterfaceC3219a interfaceC3219aM14875a = InterfaceC3219a.a.m14875a(iBinder);
                if (interfaceC3219aM14875a == null) {
                    throw new C3246e("MsaIdInterface is null");
                }
                if (interfaceC3219aM14875a.mo14869a()) {
                    return interfaceC3219aM14875a.mo14871c();
                }
                throw new C3246e("MsaIdInterface#isSupported return false");
            }
        });
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public boolean mo14920a() {
        Context context = this.f17865a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.mdid.msa", 0) != null;
        } catch (Exception e) {
            C3247f.m14935a(e);
            return false;
        }
    }
}
