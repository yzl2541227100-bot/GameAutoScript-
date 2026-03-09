package com.iflytek.voiceads.download;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.iflytek.voiceads.download.DownloadService;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.b */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class ServiceConnectionC2926b implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2923a f16249a;

    ServiceConnectionC2926b(C2923a c2923a) {
        this.f16249a = c2923a;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f16249a.f16247i = (DownloadService.BinderC2922a) iBinder;
        this.f16249a.f16247i.m13297a(this.f16249a.f16246h);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f16249a.f16247i = null;
    }
}
