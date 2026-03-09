package com.king.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: com.king.sdk.a */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceC3027a extends Service {

    /* JADX INFO: renamed from: a */
    private static InterfaceC3029b f16627a;

    /* JADX INFO: renamed from: b */
    private AbstractBinderC3033f f16628b;

    /* JADX INFO: renamed from: a */
    public static InterfaceC3029b m13742a() {
        return f16627a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f16628b;
    }
}
