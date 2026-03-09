package com.iflytek.voiceads;

import android.content.Context;
import com.iflytek.voiceads.listener.IFLYNativeListener;
import com.iflytek.voiceads.p209c.C2916a;

/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class IFLYNativeAdImpl extends IFLYNativeAd {

    /* JADX INFO: renamed from: a */
    private C2916a f16113a;

    public IFLYNativeAdImpl(Context context, String str, IFLYNativeListener iFLYNativeListener) {
        this.f16113a = new C2916a(context, str, iFLYNativeListener);
    }

    public void loadAd() {
        if (this.f16113a != null) {
            this.f16113a.m13284a();
        }
    }

    public void setParameter(String str, Object obj) {
        if (this.f16113a != null) {
            this.f16113a.m13285a(str, obj);
        }
    }
}
