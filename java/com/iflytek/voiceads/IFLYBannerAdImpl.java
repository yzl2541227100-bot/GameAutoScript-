package com.iflytek.voiceads;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.voiceads.listener.IFLYAdListener;
import com.iflytek.voiceads.utils.C2989g;
import com.iflytek.voiceads.utils.C2991i;
import com.iflytek.voiceads.view.BannerAdView;

/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class IFLYBannerAdImpl extends IFLYBannerAd {

    /* JADX INFO: renamed from: a */
    public BannerAdView f16111a;

    /* JADX WARN: Multi-variable type inference failed */
    private IFLYBannerAdImpl(Context context, String str) {
        super(context);
        this.f16111a = new BannerAdView(context, this, str, this.mInternalListener);
    }

    public static IFLYBannerAdImpl createBannerAd(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            C2989g.m13555a("IFLY_AD_SDK", "Ad constructor parameters error!");
            return null;
        }
        if (C2991i.m13564a(context)) {
            return new IFLYBannerAdImpl(context, str);
        }
        C2989g.m13555a("IFLY_AD_SDK", "please check your uses-permission");
        return null;
    }

    public synchronized void destroy() {
        super.destroy();
        if (this.f16111a != null) {
            this.f16111a.m13721l();
            this.f16111a = null;
        }
    }

    public synchronized void loadAd(IFLYAdListener iFLYAdListener) {
        if (this.f16111a != null) {
            this.f16111a.mo13704a(iFLYAdListener);
        }
    }

    public void setParameter(String str, Object obj) {
        if (this.f16111a != null) {
            this.f16111a.m13706a(str, obj);
        }
    }

    public synchronized void showAd() {
        if (this.f16111a != null) {
            this.f16111a.m13716g();
        }
    }
}
