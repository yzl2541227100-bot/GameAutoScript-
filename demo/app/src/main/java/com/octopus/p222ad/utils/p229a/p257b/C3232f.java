package com.octopus.p222ad.utils.p229a.p257b;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.octopus.p222ad.utils.p229a.C3246e;
import com.octopus.p222ad.utils.p229a.C3247f;
import com.octopus.p222ad.utils.p229a.InterfaceC3244c;
import com.octopus.p222ad.utils.p229a.InterfaceC3245d;
import com.octopus.p222ad.utils.p229a.p230a.p231a.p241e.p242a.p243a.p244a.p245a.p246a.InterfaceC3221a;
import com.octopus.p222ad.utils.p229a.p257b.ServiceConnectionC3239m;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.b.f */
/* JADX INFO: loaded from: classes2.dex */
public class C3232f implements InterfaceC3245d {

    /* JADX INFO: renamed from: a */
    private final Context f17857a;

    public C3232f(Context context) {
        this.f17857a = context;
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public void mo14919a(InterfaceC3244c interfaceC3244c) {
        if (this.f17857a == null || interfaceC3244c == null) {
            return;
        }
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        ServiceConnectionC3239m.m14929a(this.f17857a, intent, interfaceC3244c, new ServiceConnectionC3239m.a() { // from class: com.octopus.ad.utils.a.b.f.1
            @Override // com.octopus.p222ad.utils.p229a.p257b.ServiceConnectionC3239m.a
            /* JADX INFO: renamed from: a */
            public String mo14921a(IBinder iBinder) throws C3246e, RemoteException {
                InterfaceC3221a interfaceC3221aM14888a = InterfaceC3221a.a.m14888a(iBinder);
                if (interfaceC3221aM14888a.mo14887a(true)) {
                    C3247f.m14935a("User has disabled advertising identifier");
                }
                return interfaceC3221aM14888a.mo14886a();
            }
        });
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public boolean mo14920a() {
        Context context = this.f17857a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.android.vending", 0) != null;
        } catch (Exception e) {
            C3247f.m14935a(e);
            return false;
        }
    }
}
