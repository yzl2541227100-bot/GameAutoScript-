package com.anythink.core.p038b.p040b;

import com.anythink.core.api.ATBiddingListener;
import com.anythink.core.api.ATBiddingListenerExt;
import com.anythink.core.api.ATBiddingResult;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p055f.C1243h;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.b.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C1102a implements ATBiddingListenerExt {

    /* JADX INFO: renamed from: a */
    private static final String f2623a = "a";

    /* JADX INFO: renamed from: b */
    private final C1243h f2624b;

    /* JADX INFO: renamed from: c */
    private final String f2625c;

    /* JADX INFO: renamed from: d */
    private final Map<String, Object> f2626d;

    /* JADX INFO: renamed from: e */
    private final ATBiddingListener f2627e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f2628f = false;

    public C1102a(C1243h c1243h, String str, Map<String, Object> map, ATBiddingListener aTBiddingListener) {
        this.f2624b = c1243h;
        this.f2625c = str;
        this.f2626d = map;
        this.f2627e = aTBiddingListener;
    }

    /* JADX INFO: renamed from: a */
    private boolean m1630a() {
        Map<String, Object> map = this.f2626d;
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

    @Override // com.anythink.core.api.ATBiddingListener
    public void onC2SBidResult(ATBiddingResult aTBiddingResult) {
        ATBiddingListener aTBiddingListener = this.f2627e;
        if (aTBiddingListener != null) {
            aTBiddingListener.onC2SBidResult(aTBiddingResult);
        }
    }

    @Override // com.anythink.core.api.ATBiddingListener
    public void onC2SBiddingResultWithCache(ATBiddingResult aTBiddingResult, BaseAd baseAd) {
        StringBuilder sb = new StringBuilder("onC2SBiddingResultWithCache() >>> adSourceId: ");
        sb.append(this.f2625c);
        sb.append(" isCallbacked: ");
        sb.append(this.f2628f);
        if (this.f2628f) {
            return;
        }
        this.f2628f = true;
        ATBiddingListener aTBiddingListener = this.f2627e;
        if (aTBiddingListener != null) {
            aTBiddingListener.onC2SBiddingResultWithCache(aTBiddingResult, baseAd);
        }
    }

    @Override // com.anythink.core.api.ATBiddingListenerExt
    public void onC2SBiddingResultWithData(ATBiddingResult aTBiddingResult, BaseAd baseAd) {
        new StringBuilder("onC2SBiddingResultWithData() >>> adSourceId: ").append(this.f2625c);
        C1243h c1243h = this.f2624b;
        if (c1243h != null) {
            c1243h.m3098i(System.currentTimeMillis());
        }
        if (m1630a()) {
            C1243h c1243h2 = this.f2624b;
            if (c1243h2 != null) {
                c1243h2.m3065c();
            }
            onC2SBiddingResultWithCache(aTBiddingResult, baseAd);
        }
    }
}
