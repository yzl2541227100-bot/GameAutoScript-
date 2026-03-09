package com.octopus.p222ad.utils.p229a.p257b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.octopus.p222ad.utils.p229a.C3246e;
import com.octopus.p222ad.utils.p229a.C3247f;
import com.octopus.p222ad.utils.p229a.InterfaceC3244c;
import com.octopus.p222ad.utils.p229a.InterfaceC3245d;
import com.octopus.p222ad.utils.p229a.p230a.p231a.p234b.p235a.p236a.InterfaceC3218a;
import com.octopus.p222ad.utils.p229a.p257b.ServiceConnectionC3239m;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.b.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3227a implements InterfaceC3245d {

    /* JADX INFO: renamed from: a */
    private final Context f17849a;

    public C3227a(Context context) {
        this.f17849a = context;
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public void mo14919a(InterfaceC3244c interfaceC3244c) {
        if (this.f17849a == null || interfaceC3244c == null) {
            return;
        }
        Intent intent = new Intent("com.asus.msa.action.ACCESS_DID");
        intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
        ServiceConnectionC3239m.m14929a(this.f17849a, intent, interfaceC3244c, new ServiceConnectionC3239m.a() { // from class: com.octopus.ad.utils.a.b.a.1
            @Override // com.octopus.p222ad.utils.p229a.p257b.ServiceConnectionC3239m.a
            /* JADX INFO: renamed from: a */
            public String mo14921a(IBinder iBinder) throws C3246e, RemoteException {
                InterfaceC3218a interfaceC3218aM14867a = InterfaceC3218a.a.m14867a(iBinder);
                if (interfaceC3218aM14867a == null) {
                    throw new C3246e("IDidAidlInterface is null");
                }
                if (interfaceC3218aM14867a.mo14862a()) {
                    return interfaceC3218aM14867a.mo14864c();
                }
                throw new C3246e("IDidAidlInterface#isSupport return false");
            }
        });
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public boolean mo14920a() {
        Context context = this.f17849a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.asus.msa.SupplementaryDID", 0) != null;
        } catch (Exception e) {
            C3247f.m14935a(e);
            return false;
        }
    }
}
