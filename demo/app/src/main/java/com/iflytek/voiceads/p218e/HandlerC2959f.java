package com.iflytek.voiceads.p218e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.voiceads.config.AdError;
import com.iflytek.voiceads.conn.VideoDataRef;
import com.iflytek.voiceads.listener.IFLYVideoListener;

/* JADX INFO: renamed from: com.iflytek.voiceads.e.f */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class HandlerC2959f extends Handler {

    /* JADX INFO: renamed from: a */
    private IFLYVideoListener f16365a;

    public HandlerC2959f() {
        super(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public void m13431a(int i, Object obj) {
        sendMessage(obtainMessage(i, obj));
    }

    /* JADX INFO: renamed from: a */
    public void m13432a(IFLYVideoListener iFLYVideoListener) {
        this.f16365a = iFLYVideoListener;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f16365a.onAdLoaded((VideoDataRef) message.obj);
                break;
            case 1:
                this.f16365a.onAdFailed((AdError) message.obj);
                break;
        }
    }
}
