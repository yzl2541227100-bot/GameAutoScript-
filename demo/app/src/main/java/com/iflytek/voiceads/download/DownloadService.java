package com.iflytek.voiceads.download;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.iflytek.voiceads.download.p216d.C2938a;

/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class DownloadService extends Service {

    /* JADX INFO: renamed from: a */
    private BinderC2922a f16237a = new BinderC2922a();

    /* JADX INFO: renamed from: com.iflytek.voiceads.download.DownloadService$a */
    class BinderC2922a extends Binder {
        BinderC2922a() {
        }

        /* JADX INFO: renamed from: a */
        public void m13297a(C2938a c2938a) {
            C2923a.m13299a(DownloadService.this.getBaseContext()).mo13308b(c2938a);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f16237a;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
