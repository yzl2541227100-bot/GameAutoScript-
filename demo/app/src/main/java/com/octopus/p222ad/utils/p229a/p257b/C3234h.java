package com.octopus.p222ad.utils.p229a.p257b;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.octopus.p222ad.utils.p229a.C3246e;
import com.octopus.p222ad.utils.p229a.C3247f;
import com.octopus.p222ad.utils.p229a.InterfaceC3244c;
import com.octopus.p222ad.utils.p229a.InterfaceC3245d;
import com.octopus.p222ad.utils.p229a.p230a.p231a.p255i.p256a.InterfaceC3225a;
import com.octopus.p222ad.utils.p229a.p257b.ServiceConnectionC3239m;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.b.h */
/* JADX INFO: loaded from: classes2.dex */
public class C3234h implements InterfaceC3245d {

    /* JADX INFO: renamed from: a */
    private final Context f17862a;

    public C3234h(Context context) {
        this.f17862a = context;
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public void mo14919a(InterfaceC3244c interfaceC3244c) {
        if (this.f17862a == null || interfaceC3244c == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        ServiceConnectionC3239m.m14929a(this.f17862a, intent, interfaceC3244c, new ServiceConnectionC3239m.a() { // from class: com.octopus.ad.utils.a.b.h.1
            @Override // com.octopus.p222ad.utils.p229a.p257b.ServiceConnectionC3239m.a
            /* JADX INFO: renamed from: a */
            public String mo14921a(IBinder iBinder) throws C3246e, RemoteException {
                InterfaceC3225a interfaceC3225aM14908a = InterfaceC3225a.a.m14908a(iBinder);
                if (interfaceC3225aM14908a == null) {
                    throw new C3246e("IDeviceidInterface is null");
                }
                if (interfaceC3225aM14908a.mo14907c()) {
                    return interfaceC3225aM14908a.mo14902a();
                }
                throw new C3246e("IDeviceidInterface#isSupport return false");
            }
        });
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public boolean mo14920a() {
        Context context = this.f17862a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.zui.deviceidservice", 0) != null;
        } catch (Exception e) {
            C3247f.m14935a(e);
            return false;
        }
    }
}
