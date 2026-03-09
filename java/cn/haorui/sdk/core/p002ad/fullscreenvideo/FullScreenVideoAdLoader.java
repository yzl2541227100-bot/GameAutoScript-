package cn.haorui.sdk.core.p002ad.fullscreenvideo;

import android.app.Activity;
import androidx.annotation.NonNull;
import cn.haorui.sdk.adsail_ad.nativ.NativeAdSlot;
import cn.haorui.sdk.core.C0479a;
import cn.haorui.sdk.core.domain.HRAdInfo;
import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.loader.InterfaceC0508d;
import cn.haorui.sdk.core.p002ad.BaseFullScreenVideoAdLoader;
import cn.haorui.sdk.platform.p003hr.fullscreenvideo.HRFullScreenVideoHRAdWrapper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class FullScreenVideoAdLoader extends BaseFullScreenVideoAdLoader<FullScreenVideoAdListener> {
    public static final String KEY_HEIGHT = "KEY_HEIGHT";
    public static final String KEY_WIDTH = "KEY_WIDTH";
    private static final String TAG = "FullScreenVideoAdLoader";

    public FullScreenVideoAdLoader(@NonNull Activity activity, @NonNull String str, FullScreenVideoAdListener fullScreenVideoAdListener) {
        super(activity, str, fullScreenVideoAdListener);
    }

    @Override // cn.haorui.sdk.core.p002ad.BaseFullScreenVideoAdLoader
    public InterfaceC0508d createAdSailDelegateInternal(NativeAdSlot nativeAdSlot) {
        return new HRFullScreenVideoHRAdWrapper(this, nativeAdSlot);
    }

    @Override // cn.haorui.sdk.core.loader.AbstractC0497b
    public InterfaceC0508d createDelegate(SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo) {
        return C0479a.m18a(sdkAdInfo.getSdk()).fullScreenVideoLoader(this, sdkAdInfo, hRAdInfo);
    }

    public void loadAd(float f, float f2) {
        HashMap map = new HashMap();
        map.put("KEY_WIDTH", Float.valueOf(f));
        map.put("KEY_HEIGHT", Float.valueOf(f2));
        loadAd(map);
    }
}
