package com.anythink.interstitial.p183a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.C1201f;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.p050a.C1150b;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1171j;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1240e;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1257v;
import com.anythink.core.common.p065n.C1320c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p065n.C1324g;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.interstitial.api.ATInterstitialExListener;
import com.anythink.interstitial.api.ATInterstitialListener;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.interstitial.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2352e implements CustomInterstitialEventListener {

    /* JADX INFO: renamed from: a */
    public ATInterstitialListener f14804a;

    /* JADX INFO: renamed from: b */
    public CustomInterstitialAdapter f14805b;

    /* JADX INFO: renamed from: c */
    public long f14806c;

    /* JADX INFO: renamed from: d */
    public long f14807d;

    /* JADX INFO: renamed from: e */
    public int f14808e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f14809f = true;

    public C2352e(CustomInterstitialAdapter customInterstitialAdapter, ATInterstitialListener aTInterstitialListener) {
        this.f14804a = aTInterstitialListener;
        this.f14805b = customInterstitialAdapter;
    }

    /* JADX INFO: renamed from: a */
    private static void m12175a(String str) {
        C1240e c1240eM4571c;
        if (TextUtils.isEmpty(str) || (c1240eM4571c = C1387u.m4556a().m4571c(str)) == null) {
            return;
        }
        C1387u.m4556a().m4572d(str);
        C1201f.m2340a(C1175n.m2059a().m2148f(), str, "3").m2400c(C1387u.m4556a().m4569b(str, c1240eM4571c.m2973a()));
    }

    /* JADX INFO: renamed from: a */
    private static void m12176a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1201f c1201fM2340a = C1201f.m2340a(C1175n.m2059a().m2099E(), str, "3");
        if (c1201fM2340a.m2394a((ATAdStatusInfo) null)) {
            C1257v c1257v = new C1257v();
            c1257v.m3446a(C1175n.m2059a().m2099E());
            c1257v.f4483d = i;
            c1201fM2340a.m2398b(C1175n.m2059a().m2099E(), "3", str, c1257v, null);
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onDeeplinkCallback(boolean z) {
        ATInterstitialListener aTInterstitialListener = this.f14804a;
        if (aTInterstitialListener != null && (aTInterstitialListener instanceof ATInterstitialExListener)) {
            ((ATInterstitialExListener) aTInterstitialListener).onDeeplinkCallback(C1171j.m2045a(this.f14805b), z);
        }
        CustomInterstitialAdapter customInterstitialAdapter = this.f14805b;
        if (customInterstitialAdapter != null) {
            C1352p.m4208a(customInterstitialAdapter.getTrackingInfo(), C1169h.n.f3183i, z ? C1169h.n.f3186l : C1169h.n.f3187m, "");
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        ATInterstitialListener aTInterstitialListener = this.f14804a;
        if (aTInterstitialListener != null && (aTInterstitialListener instanceof ATInterstitialExListener)) {
            ((ATInterstitialExListener) aTInterstitialListener).onDownloadConfirm(context, C1171j.m2045a(this.f14805b), aTNetworkConfirmInfo);
        }
        CustomInterstitialAdapter customInterstitialAdapter = this.f14805b;
        if (customInterstitialAdapter != null) {
            C1352p.m4208a(customInterstitialAdapter.getTrackingInfo(), C1169h.n.f3184j, C1169h.n.f3186l, "");
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdClicked() {
        CustomInterstitialAdapter customInterstitialAdapter = this.f14805b;
        if (customInterstitialAdapter != null) {
            C1243h trackingInfo = customInterstitialAdapter.getTrackingInfo();
            C1352p.m4208a(trackingInfo, C1169h.n.f3178d, C1169h.n.f3186l, "");
            C1320c.m3839a(C1175n.m2059a().m2148f()).m3851a(6, trackingInfo);
        }
        ATInterstitialListener aTInterstitialListener = this.f14804a;
        if (aTInterstitialListener != null) {
            aTInterstitialListener.onInterstitialAdClicked(C1171j.m2045a(this.f14805b));
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdClose() {
        CustomInterstitialAdapter customInterstitialAdapter = this.f14805b;
        if (customInterstitialAdapter != null) {
            C1243h trackingInfo = customInterstitialAdapter.getTrackingInfo();
            int dismissType = this.f14808e;
            if (dismissType == 0) {
                dismissType = this.f14805b.getDismissType();
            }
            if (dismissType == 0) {
                dismissType = 1;
            }
            trackingInfo.m3023D(dismissType);
            C1352p.m4208a(trackingInfo, C1169h.n.f3179e, C1169h.n.f3186l, "");
            long j = this.f14806c;
            if (j != 0) {
                C1322e.m3890a(trackingInfo, false, j, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f14807d);
            }
            Map<String, Object> adExtraInfoMap = this.f14805b.getAdExtraInfoMap();
            if (adExtraInfoMap != null) {
                Object obj = adExtraInfoMap.get(C1150b.b.f2927a);
                if (obj instanceof Integer) {
                    trackingInfo.m3032I(((Integer) obj).intValue());
                }
            }
            C1322e.m3889a(trackingInfo, false);
            try {
                this.f14805b.clearImpressionListener();
                this.f14805b.internalDestory();
            } catch (Throwable unused) {
            }
            ATInterstitialListener aTInterstitialListener = this.f14804a;
            if (aTInterstitialListener != null) {
                aTInterstitialListener.onInterstitialAdClose(C1171j.m2049a(trackingInfo, this.f14805b));
            }
            if (trackingInfo != null) {
                m12175a(trackingInfo.m2677ah());
            }
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdShow() {
        this.f14806c = System.currentTimeMillis();
        this.f14807d = SystemClock.elapsedRealtime();
        C1171j c1171jM2045a = C1171j.m2045a(this.f14805b);
        CustomInterstitialAdapter customInterstitialAdapter = this.f14805b;
        if (customInterstitialAdapter != null) {
            C1243h trackingInfo = customInterstitialAdapter.getTrackingInfo();
            trackingInfo.m3056a(this.f14805b.getNetworkInfoMap());
            String ilrd = this.f14805b.getILRD();
            if (!TextUtils.isEmpty(ilrd)) {
                trackingInfo.m3055a(ilrd);
            }
            String strM2677ah = "";
            C1352p.m4208a(trackingInfo, C1169h.n.f3177c, C1169h.n.f3186l, "");
            C1320c.m3839a(C1175n.m2059a().m2148f()).m3852a(4, trackingInfo, this.f14805b.getUnitGroupInfo());
            if (trackingInfo != null) {
                strM2677ah = trackingInfo.m2677ah();
                C1387u.m4556a().m4563a(strM2677ah, c1171jM2045a);
            }
            m12176a(strM2677ah, 6);
        }
        if (this.f14804a != null) {
            if (c1171jM2045a.getNetworkFirmId() == -1) {
                C1324g.m3940a("Interstitial", this.f14805b, null);
            }
            this.f14804a.onInterstitialAdShow(c1171jM2045a);
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoEnd() {
        CustomInterstitialAdapter customInterstitialAdapter = this.f14805b;
        if (customInterstitialAdapter != null) {
            if (customInterstitialAdapter.getDismissType() == 0) {
                this.f14808e = 3;
            }
            C1243h trackingInfo = this.f14805b.getTrackingInfo();
            C1320c.m3839a(C1175n.m2059a().m2148f()).m3851a(9, trackingInfo);
            ATInterstitialListener aTInterstitialListener = this.f14804a;
            if (aTInterstitialListener != null) {
                aTInterstitialListener.onInterstitialAdVideoEnd(C1171j.m2045a(this.f14805b));
            }
            C1352p.m4208a(trackingInfo, C1169h.n.f3180f, C1169h.n.f3186l, "");
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoError(String str, String str2) {
        String strM2677ah;
        this.f14808e = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2);
        CustomInterstitialAdapter customInterstitialAdapter = this.f14805b;
        if (customInterstitialAdapter != null) {
            C1243h trackingInfo = customInterstitialAdapter.getTrackingInfo();
            if (trackingInfo.m3039P() == 66) {
                this.f14809f = false;
            }
            C1322e.m3882a(trackingInfo, errorCode, this.f14805b.getNetworkInfoMap());
            if (trackingInfo != null) {
                strM2677ah = trackingInfo.m2677ah();
                m12175a(trackingInfo.m2677ah());
            } else {
                strM2677ah = "";
            }
            m12176a(strM2677ah, 7);
            C1352p.m4208a(trackingInfo, C1169h.n.f3181g, C1169h.n.f3187m, str2);
        }
        ATInterstitialListener aTInterstitialListener = this.f14804a;
        if (aTInterstitialListener != null) {
            aTInterstitialListener.onInterstitialAdVideoError(errorCode);
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoStart() {
        CustomInterstitialAdapter customInterstitialAdapter = this.f14805b;
        if (customInterstitialAdapter != null) {
            C1243h trackingInfo = customInterstitialAdapter.getTrackingInfo();
            if (this.f14809f) {
                C1320c.m3839a(C1175n.m2059a().m2148f()).m3851a(8, trackingInfo);
                ATInterstitialListener aTInterstitialListener = this.f14804a;
                if (aTInterstitialListener != null) {
                    aTInterstitialListener.onInterstitialAdVideoStart(C1171j.m2045a(this.f14805b));
                }
            }
        }
    }
}
