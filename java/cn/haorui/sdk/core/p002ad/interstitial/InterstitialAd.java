package cn.haorui.sdk.core.p002ad.interstitial;

import android.app.Activity;
import cn.haorui.sdk.core.loader.InterfaceC0508d;
import cn.haorui.sdk.core.p002ad.BaseAd;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class InterstitialAd extends BaseAd implements IInterstitialAd, Serializable {
    public InterstitialAd(InterfaceC0508d interfaceC0508d, String str) {
        super(interfaceC0508d, str);
    }

    public abstract void showAd();

    public abstract void showAd(Activity activity);
}
