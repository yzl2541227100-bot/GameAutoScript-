package com.octopus.p222ad.utils.p229a.p257b;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.octopus.p222ad.utils.p229a.C3246e;
import com.octopus.p222ad.utils.p229a.C3247f;
import com.octopus.p222ad.utils.p229a.InterfaceC3244c;
import com.octopus.p222ad.utils.p229a.InterfaceC3245d;
import com.octopus.p222ad.utils.p229a.p230a.p231a.p239d.p240a.InterfaceC3220a;
import com.octopus.p222ad.utils.p229a.p257b.ServiceConnectionC3239m;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.b.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3228b implements InterfaceC3245d {

    /* JADX INFO: renamed from: a */
    private final Context f17851a;

    public C3228b(Context context) {
        this.f17851a = context instanceof Application ? context : context.getApplicationContext();
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public void mo14919a(InterfaceC3244c interfaceC3244c) {
        if (this.f17851a == null || interfaceC3244c == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.coolpad.deviceidsupport", "com.coolpad.deviceidsupport.DeviceIdService"));
        ServiceConnectionC3239m.m14929a(this.f17851a, intent, interfaceC3244c, new ServiceConnectionC3239m.a() { // from class: com.octopus.ad.utils.a.b.b.1
            @Override // com.octopus.p222ad.utils.p229a.p257b.ServiceConnectionC3239m.a
            /* JADX INFO: renamed from: a */
            public String mo14921a(IBinder iBinder) throws C3246e, RemoteException {
                InterfaceC3220a interfaceC3220aM14884a = InterfaceC3220a.a.m14884a(iBinder);
                if (interfaceC3220aM14884a != null) {
                    return interfaceC3220aM14884a.mo14880b(C3228b.this.f17851a.getPackageName());
                }
                throw new C3246e("IDeviceIdManager is null");
            }
        });
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public boolean mo14920a() {
        Context context = this.f17851a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.coolpad.deviceidsupport", 0) != null;
        } catch (Exception e) {
            C3247f.m14935a(e);
            return false;
        }
    }
}
