package com.iflytek.voiceads.p209c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.voiceads.config.AdError;
import com.iflytek.voiceads.conn.NativeDataRef;
import com.iflytek.voiceads.listener.IFLYNativeListener;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.c.d */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class HandlerC2919d extends Handler {

    /* JADX INFO: renamed from: a */
    private IFLYNativeListener f16187a;

    public HandlerC2919d() {
        super(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public void m13291a(int i, Object obj) {
        sendMessage(obtainMessage(i, obj));
    }

    /* JADX INFO: renamed from: a */
    public void m13292a(IFLYNativeListener iFLYNativeListener) {
        this.f16187a = iFLYNativeListener;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.f16187a == null) {
            C2989g.m13557b("IFLY_AD_SDK", "native listener is null");
        }
        switch (message.what) {
            case 0:
                this.f16187a.onAdLoaded((NativeDataRef) message.obj);
                break;
            case 1:
                this.f16187a.onAdFailed((AdError) message.obj);
                break;
        }
    }
}
