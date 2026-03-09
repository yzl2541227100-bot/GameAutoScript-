package com.anythink.nativead.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.p051b.C1163b;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.InterfaceC1162a;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.nativead.p184a.C2357a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ATNative {
    private final String TAG = ATNative.class.getSimpleName();
    public InterfaceC1162a adLoadListener = new InterfaceC1162a() { // from class: com.anythink.nativead.api.ATNative.1
        @Override // com.anythink.core.common.p051b.InterfaceC1162a
        public void onAdLoadFail(final AdError adError) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.nativead.api.ATNative.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATNativeNetworkListener aTNativeNetworkListener = ATNative.this.mListener;
                    if (aTNativeNetworkListener != null) {
                        aTNativeNetworkListener.onNativeAdLoadFail(adError);
                    }
                }
            });
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1162a
        public void onAdLoaded() {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.nativead.api.ATNative.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    ATNativeNetworkListener aTNativeNetworkListener = ATNative.this.mListener;
                    if (aTNativeNetworkListener != null) {
                        aTNativeNetworkListener.onNativeAdLoaded();
                    }
                }
            });
        }
    };
    public WeakReference<Activity> mActivityRef;
    public C2357a mAdLoadManager;
    public C1163b mAdSourceEventListener;
    public Context mContext;
    public ATAdSourceStatusListener mDeveloperStatusListener;
    public ATNativeNetworkListener mListener;
    public String mPlacementId;
    public Map<String, Object> mTKExtraMap;

    public ATNative(Context context, String str, ATNativeNetworkListener aTNativeNetworkListener) {
        this.mContext = context.getApplicationContext();
        if (context != null && (context instanceof Activity)) {
            this.mActivityRef = new WeakReference<>((Activity) context);
        }
        this.mPlacementId = str;
        this.mListener = aTNativeNetworkListener;
        this.mAdLoadManager = C2357a.m12177a(context, str);
    }

    public static void entryAdScenario(String str, String str2) {
        C1175n.m2059a().m2121a(str, str2, "0", (Map<String, Object>) null);
    }

    public static void entryAdScenario(String str, String str2, Map<String, Object> map) {
        C1175n.m2059a().m2121a(str, str2, "0", map);
    }

    private Context getContext() {
        Activity activity;
        WeakReference<Activity> weakReference = this.mActivityRef;
        return (weakReference == null || (activity = weakReference.get()) == null) ? this.mContext : activity;
    }

    public ATAdStatusInfo checkAdStatus() {
        if (C1175n.m2059a().m2148f() == null || TextUtils.isEmpty(C1175n.m2059a().m2165o()) || TextUtils.isEmpty(C1175n.m2059a().m2167p())) {
            Log.e(this.TAG, "SDK init error!");
            return new ATAdStatusInfo(false, false, null);
        }
        ATAdStatusInfo aTAdStatusInfoM12178a = this.mAdLoadManager.m12178a(getContext(), this.mTKExtraMap);
        C1352p.m4217b(this.mPlacementId, C1169h.n.f3192r, C1169h.n.f3171A, aTAdStatusInfoM12178a.toString(), "");
        return aTAdStatusInfoM12178a;
    }

    public List<ATAdInfo> checkValidAdCaches() {
        C2357a c2357a = this.mAdLoadManager;
        if (c2357a != null) {
            return c2357a.m12180a(getContext());
        }
        return null;
    }

    public NativeAd getNativeAd() {
        C1234b c1234bM12179a = this.mAdLoadManager.m12179a("", this.mTKExtraMap);
        if (c1234bM12179a != null) {
            return new NativeAd(getContext(), this.mPlacementId, c1234bM12179a);
        }
        return null;
    }

    public NativeAd getNativeAd(String str) {
        if (!C1344h.m4150c(str)) {
            str = "";
        }
        C1234b c1234bM12179a = this.mAdLoadManager.m12179a(str, this.mTKExtraMap);
        if (c1234bM12179a != null) {
            return new NativeAd(getContext(), this.mPlacementId, c1234bM12179a);
        }
        return null;
    }

    public void makeAdRequest() {
        makeAdRequest(null);
    }

    public void makeAdRequest(ATAdxBidFloorInfo aTAdxBidFloorInfo) {
        C1352p.m4215a(this.mPlacementId, C1169h.n.f3192r, C1169h.n.f3197w, C1169h.n.f3188n, "", true);
        this.mAdLoadManager.m12181a(getContext(), this.adLoadListener, this.mAdSourceEventListener, this.mTKExtraMap, aTAdxBidFloorInfo);
    }

    public void setAdListener(ATNativeNetworkListener aTNativeNetworkListener) {
        this.mListener = aTNativeNetworkListener;
    }

    public void setAdSourceStatusListener(ATAdSourceStatusListener aTAdSourceStatusListener) {
        if (this.mAdSourceEventListener == null) {
            this.mAdSourceEventListener = new C1163b();
        }
        this.mDeveloperStatusListener = aTAdSourceStatusListener;
        this.mAdSourceEventListener.m2015a(aTAdSourceStatusListener);
    }

    public void setLocalExtra(Map<String, Object> map) {
        C1387u.m4556a().m4566a(this.mPlacementId, map);
    }

    public void setTKExtra(Map<String, Object> map) {
        if (this.mTKExtraMap == null) {
            this.mTKExtraMap = new ConcurrentHashMap();
        }
        this.mTKExtraMap.clear();
        this.mTKExtraMap.putAll(map);
    }
}
