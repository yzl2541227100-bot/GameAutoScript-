package com.anythink.core.common.p069p;

import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATCustomLoadListenerExt;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p055f.C1243h;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.common.p.a */
/* JADX INFO: loaded from: classes.dex */
public class C1362a implements ATCustomLoadListenerExt {

    /* JADX INFO: renamed from: a */
    private static final String f5358a = "a";

    /* JADX INFO: renamed from: b */
    private final C1243h f5359b;

    /* JADX INFO: renamed from: c */
    private final String f5360c;

    /* JADX INFO: renamed from: d */
    private final Map<String, Object> f5361d;

    /* JADX INFO: renamed from: e */
    private final ATCustomLoadListener f5362e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f5363f = false;

    public C1362a(C1243h c1243h, String str, Map<String, Object> map, ATCustomLoadListener aTCustomLoadListener) {
        this.f5359b = c1243h;
        this.f5360c = str;
        this.f5362e = aTCustomLoadListener;
        this.f5361d = map;
    }

    /* JADX INFO: renamed from: a */
    private boolean m4275a() {
        Map<String, Object> map = this.f5361d;
        if (map == null) {
            return false;
        }
        try {
            Object obj = map.get("ad_s_reqf_mode");
            if (obj != null) {
                return obj.toString().equals("2");
            }
        } catch (Throwable th) {
            new StringBuilder("isSupportDoubleCallback() >>> ").append(th.getMessage());
        }
        return false;
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public void onAdCacheLoaded(BaseAd... baseAdArr) {
        StringBuilder sb = new StringBuilder("onAdCacheLoaded() >>> adSourceId: ");
        sb.append(this.f5360c);
        sb.append(" isCallbacked: ");
        sb.append(this.f5363f);
        if (this.f5363f) {
            return;
        }
        this.f5363f = true;
        ATCustomLoadListener aTCustomLoadListener = this.f5362e;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdCacheLoaded(baseAdArr);
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public void onAdDataLoaded() {
        ATCustomLoadListener aTCustomLoadListener = this.f5362e;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdDataLoaded();
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListenerExt
    public void onAdDataLoadedWithAds(BaseAd... baseAdArr) {
        new StringBuilder("onAdDataLoaded() >>> called. adSourceId: ").append(this.f5360c);
        ATCustomLoadListener aTCustomLoadListener = this.f5362e;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdDataLoaded();
        }
        if (m4275a()) {
            C1243h c1243h = this.f5359b;
            if (c1243h != null) {
                c1243h.m3065c();
            }
            onAdCacheLoaded(baseAdArr);
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public void onAdLoadError(String str, String str2) {
        ATCustomLoadListener aTCustomLoadListener = this.f5362e;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError(str, str2);
        }
    }
}
