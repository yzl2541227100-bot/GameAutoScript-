package com.iflytek.voiceads;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.voiceads.listener.IFLYAdListener;
import com.iflytek.voiceads.utils.C2989g;
import com.iflytek.voiceads.utils.C2991i;
import com.iflytek.voiceads.view.InterstitialAdView;

/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class IFLYInterstitialAdImpl extends IFLYInterstitialAd {

    /* JADX INFO: renamed from: a */
    public InterstitialAdView f16112a;

    /* JADX WARN: Multi-variable type inference failed */
    private IFLYInterstitialAdImpl(Context context, String str) {
        super(context);
        this.f16112a = new InterstitialAdView(context, this, str, this.mInternalListener);
    }

    public static synchronized IFLYInterstitialAd createInterstitialAd(Context context, String str) {
        IFLYInterstitialAdImpl iFLYInterstitialAdImpl = null;
        synchronized (IFLYInterstitialAdImpl.class) {
            if (TextUtils.isEmpty(str) || context == null) {
                C2989g.m13555a("IFLY_AD_SDK", "Ad constructor parameters error!");
            } else if (C2991i.m13564a(context)) {
                iFLYInterstitialAdImpl = new IFLYInterstitialAdImpl(context, str);
            } else {
                C2989g.m13555a("IFLY_AD_SDK", "please check your uses-permission");
            }
        }
        return iFLYInterstitialAdImpl;
    }

    public void destroy() {
        super.destroy();
        if (this.f16112a != null) {
            this.f16112a.m13721l();
            this.f16112a = null;
        }
    }

    public synchronized void loadAd(IFLYAdListener iFLYAdListener) {
        if (this.f16112a != null) {
            this.f16112a.mo13704a(iFLYAdListener);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setParameter(String str, Object obj) {
        if (this.f16112a != null) {
            this.f16112a.m13706a(str, obj);
        }
    }

    public synchronized void showAd() {
        if (this.f16112a != null) {
            this.f16112a.m13716g();
        }
    }
}
