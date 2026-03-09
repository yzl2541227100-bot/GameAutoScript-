package com.iflytek.voiceads.view;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.voiceads.config.AdError;
import com.iflytek.voiceads.listener.IFLYAdListener;
import com.iflytek.voiceads.listener.InternalListener;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.view.a */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class HandlerC3019a extends Handler {

    /* JADX INFO: renamed from: a */
    private IFLYAdListener f16606a;

    /* JADX INFO: renamed from: b */
    private InternalListener f16607b;

    public HandlerC3019a() {
        super(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public void m13724a(int i, int i2) {
        sendMessageDelayed(obtainMessage(i), i2);
    }

    /* JADX INFO: renamed from: a */
    public void m13725a(int i, Object obj) {
        sendMessage(obtainMessage(i, obj));
    }

    /* JADX INFO: renamed from: a */
    public void m13726a(IFLYAdListener iFLYAdListener) {
        this.f16606a = iFLYAdListener;
    }

    /* JADX INFO: renamed from: a */
    public void m13727a(InternalListener internalListener) {
        this.f16607b = internalListener;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.f16606a == null) {
            C2989g.m13557b("IFLY_AD_SDK", "htmlAd listener is null");
        }
        switch (message.what) {
            case 0:
                this.f16606a.onAdReceive();
                break;
            case 1:
                this.f16606a.onAdFailed((AdError) message.obj);
                break;
            case 2:
                this.f16606a.onAdClick();
                break;
            case 3:
                this.f16606a.onAdClose();
                break;
            case 4:
                this.f16607b.onAdDestroy();
                break;
        }
    }
}
