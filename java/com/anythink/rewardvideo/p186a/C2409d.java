package com.anythink.rewardvideo.p186a;

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
import com.anythink.core.common.p057g.InterfaceC1265c;
import com.anythink.core.common.p065n.C1320c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p065n.C1324g;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.expressad.exoplayer.C1575f;
import com.anythink.rewardvideo.api.ATRewardVideoExListener;
import com.anythink.rewardvideo.api.ATRewardVideoListener;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.rewardvideo.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2409d implements CustomRewardedVideoEventListener {

    /* JADX INFO: renamed from: b */
    public long f14996b;

    /* JADX INFO: renamed from: c */
    public boolean f14997c;

    /* JADX INFO: renamed from: d */
    public C1243h f14998d;

    /* JADX INFO: renamed from: e */
    public boolean f14999e;

    /* JADX INFO: renamed from: f */
    public long f15000f;

    /* JADX INFO: renamed from: g */
    public long f15001g;

    /* JADX INFO: renamed from: j */
    private ATRewardVideoListener f15004j;

    /* JADX INFO: renamed from: k */
    private CustomRewardVideoAdapter f15005k;

    /* JADX INFO: renamed from: l */
    private InterfaceC1265c f15006l;

    /* JADX INFO: renamed from: m */
    private long f15007m;

    /* JADX INFO: renamed from: n */
    private long f15008n;

    /* JADX INFO: renamed from: h */
    public int f15002h = 0;

    /* JADX INFO: renamed from: a */
    public long f14995a = 0;

    /* JADX INFO: renamed from: i */
    public boolean f15003i = true;

    public C2409d(CustomRewardVideoAdapter customRewardVideoAdapter, InterfaceC1265c interfaceC1265c, ATRewardVideoListener aTRewardVideoListener) {
        this.f15004j = aTRewardVideoListener;
        this.f15005k = customRewardVideoAdapter;
        this.f15006l = interfaceC1265c;
    }

    /* JADX INFO: renamed from: a */
    private C1243h m12451a() {
        CustomRewardVideoAdapter customRewardVideoAdapter;
        if (this.f14998d == null && (customRewardVideoAdapter = this.f15005k) != null) {
            C1243h c1243hM3045V = customRewardVideoAdapter.getTrackingInfo().m3045V();
            this.f14998d = c1243hM3045V;
            c1243hM3045V.f4213q = 6;
            this.f14998d.m3095h(C1344h.m4144b(c1243hM3045V.m2678ai(), this.f14998d.m3026F(), System.currentTimeMillis()));
        }
        return this.f14998d;
    }

    /* JADX INFO: renamed from: a */
    private void m12453a(AdError adError, C1243h c1243h) {
        C1352p.m4208a(c1243h, C1169h.n.f3177c, C1169h.n.f3187m, adError.printStackTrace());
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f15005k;
        C1322e.m3882a(c1243h, adError, customRewardVideoAdapter != null ? customRewardVideoAdapter.getNetworkInfoMap() : null);
    }

    /* JADX INFO: renamed from: a */
    private void m12454a(C1243h c1243h) {
        String ilrd = this.f15005k.getILRD();
        if (!TextUtils.isEmpty(ilrd)) {
            c1243h.m3055a(ilrd);
        }
        if (this.f15003i) {
            C1320c.m3839a(C1175n.m2059a().m2148f()).m3851a(8, c1243h);
        }
        C1320c.m3839a(C1175n.m2059a().m2148f()).m3852a(4, c1243h, this.f15005k.getUnitGroupInfo());
        C1352p.m4208a(c1243h, C1169h.n.f3177c, C1169h.n.f3186l, "");
    }

    /* JADX INFO: renamed from: a */
    private static void m12455a(String str) {
        C1240e c1240eM4571c;
        if (TextUtils.isEmpty(str) || (c1240eM4571c = C1387u.m4556a().m4571c(str)) == null) {
            return;
        }
        C1387u.m4556a().m4572d(str);
        C1201f.m2340a(C1175n.m2059a().m2148f(), str, "1").m2400c(C1387u.m4556a().m4569b(str, c1240eM4571c.m2973a()));
    }

    /* JADX INFO: renamed from: a */
    private static void m12456a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1201f c1201fM2340a = C1201f.m2340a(C1175n.m2059a().m2099E(), str, "1");
        if (c1201fM2340a.m2394a((ATAdStatusInfo) null)) {
            C1257v c1257v = new C1257v();
            c1257v.m3446a(C1175n.m2059a().m2099E());
            c1257v.f4483d = i;
            c1201fM2340a.m2398b(C1175n.m2059a().m2099E(), "1", str, c1257v, null);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m12457b(C1243h c1243h) {
        C1352p.m4208a(c1243h, C1169h.n.f3180f, C1169h.n.f3186l, "");
        C1320c.m3839a(C1175n.m2059a().m2148f()).m3851a(9, c1243h);
    }

    /* JADX INFO: renamed from: c */
    private static void m12458c(C1243h c1243h) {
        C1320c.m3839a(C1175n.m2059a().m2148f()).m3851a(6, c1243h);
        C1352p.m4208a(c1243h, C1169h.n.f3178d, C1169h.n.f3186l, "");
    }

    /* JADX INFO: renamed from: d */
    private void m12459d(C1243h c1243h) {
        C1320c.m3839a(C1175n.m2059a().m2148f()).m3852a(13, c1243h, this.f15005k.getUnitGroupInfo());
        m12454a(c1243h);
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onAgainReward() {
        InterfaceC1265c interfaceC1265c;
        C1243h c1243hM12451a = m12451a();
        if (!this.f14999e && (interfaceC1265c = this.f15006l) != null) {
            interfaceC1265c.mo3612a(this.f15000f, this.f15001g, this.f15005k, c1243hM12451a);
        }
        this.f14999e = true;
        ATRewardVideoListener aTRewardVideoListener = this.f15004j;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onAgainReward(C1171j.m2049a(c1243hM12451a, this.f15005k));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onDeeplinkCallback(boolean z) {
        ATRewardVideoListener aTRewardVideoListener = this.f15004j;
        if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            ((ATRewardVideoExListener) aTRewardVideoListener).onDeeplinkCallback(C1171j.m2045a(this.f15005k), z);
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f15005k;
        if (customRewardVideoAdapter != null) {
            C1352p.m4208a(customRewardVideoAdapter.getTrackingInfo(), C1169h.n.f3183i, z ? C1169h.n.f3186l : C1169h.n.f3187m, "");
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        ATRewardVideoListener aTRewardVideoListener = this.f15004j;
        if (aTRewardVideoListener != null && (aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            ((ATRewardVideoExListener) aTRewardVideoListener).onDownloadConfirm(context, C1171j.m2045a(this.f15005k), aTNetworkConfirmInfo);
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f15005k;
        if (customRewardVideoAdapter != null) {
            C1352p.m4208a(customRewardVideoAdapter.getTrackingInfo(), C1169h.n.f3184j, C1169h.n.f3186l, "");
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onReward() {
        InterfaceC1265c interfaceC1265c;
        if (!this.f14997c && (interfaceC1265c = this.f15006l) != null) {
            long j = this.f15007m;
            long j2 = this.f15008n;
            CustomRewardVideoAdapter customRewardVideoAdapter = this.f15005k;
            interfaceC1265c.mo3612a(j, j2, customRewardVideoAdapter, customRewardVideoAdapter.getTrackingInfo());
        }
        this.f14997c = true;
        ATRewardVideoListener aTRewardVideoListener = this.f15004j;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onReward(C1171j.m2045a(this.f15005k));
        }
        CustomRewardVideoAdapter customRewardVideoAdapter2 = this.f15005k;
        if (customRewardVideoAdapter2 != null) {
            C1352p.m4208a(customRewardVideoAdapter2.getTrackingInfo(), C1169h.n.f3182h, C1169h.n.f3186l, "");
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayClicked() {
        C1243h c1243hM12451a = m12451a();
        if (this.f15005k != null && c1243hM12451a != null) {
            m12458c(c1243hM12451a);
        }
        ATRewardVideoListener aTRewardVideoListener = this.f15004j;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayClicked(C1171j.m2049a(c1243hM12451a, this.f15005k));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayEnd() {
        if (this.f15001g == 0) {
            this.f15001g = SystemClock.elapsedRealtime();
        }
        C1243h c1243hM12451a = m12451a();
        if (this.f15005k != null && c1243hM12451a != null) {
            m12457b(c1243hM12451a);
        }
        ATRewardVideoListener aTRewardVideoListener = this.f15004j;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayEnd(C1171j.m2049a(c1243hM12451a, this.f15005k));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayFailed(String str, String str2) {
        this.f15002h = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2);
        C1243h c1243hM12451a = m12451a();
        if (this.f15005k != null && c1243hM12451a != null) {
            m12453a(errorCode, c1243hM12451a);
        }
        ATRewardVideoListener aTRewardVideoListener = this.f15004j;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayFailed(errorCode, C1171j.m2049a(c1243hM12451a, this.f15005k));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayStart() {
        this.f15002h = 0;
        if (this.f15000f == 0) {
            this.f15000f = SystemClock.elapsedRealtime();
        }
        this.f15001g = 0L;
        C1243h c1243hM12451a = m12451a();
        if (this.f15005k != null && c1243hM12451a != null) {
            C1320c.m3839a(C1175n.m2059a().m2148f()).m3852a(13, c1243hM12451a, this.f15005k.getUnitGroupInfo());
            m12454a(c1243hM12451a);
        }
        ATRewardVideoListener aTRewardVideoListener = this.f15004j;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayStart(C1171j.m2049a(c1243hM12451a, this.f15005k));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdClosed() {
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f15005k;
        if (customRewardVideoAdapter != null) {
            C1243h trackingInfo = customRewardVideoAdapter.getTrackingInfo();
            int dismissType = this.f15002h;
            if (dismissType == 0) {
                dismissType = this.f15005k.getDismissType();
            }
            if (dismissType == 0) {
                dismissType = 1;
            }
            trackingInfo.m3023D(dismissType);
            C1352p.m4208a(trackingInfo, C1169h.n.f3179e, C1169h.n.f3186l, "");
            long j = this.f14995a;
            if (j != 0) {
                C1322e.m3890a(trackingInfo, this.f14997c, j, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f14996b);
            }
            Map<String, Object> adExtraInfoMap = this.f15005k.getAdExtraInfoMap();
            if (adExtraInfoMap != null) {
                Object obj = adExtraInfoMap.get(C1150b.b.f2927a);
                if (obj instanceof Integer) {
                    trackingInfo.m3032I(((Integer) obj).intValue());
                }
            }
            C1322e.m3889a(trackingInfo, this.f14997c);
            if (this.f14997c) {
                try {
                    this.f15005k.clearImpressionListener();
                    this.f15005k.internalDestory();
                } catch (Throwable unused) {
                }
            } else {
                C1175n.m2059a().m2118a(new Runnable() { // from class: com.anythink.rewardvideo.a.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            C2409d.this.f15005k.clearImpressionListener();
                            C2409d.this.f15005k.internalDestory();
                        } catch (Throwable unused2) {
                        }
                    }
                }, C1575f.f8394a);
            }
            if (trackingInfo != null) {
                m12455a(trackingInfo.m2677ah());
            }
            ATRewardVideoListener aTRewardVideoListener = this.f15004j;
            if (aTRewardVideoListener != null) {
                aTRewardVideoListener.onRewardedVideoAdClosed(C1171j.m2049a(trackingInfo, this.f15005k));
            }
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayClicked() {
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f15005k;
        if (customRewardVideoAdapter != null) {
            m12458c(customRewardVideoAdapter.getTrackingInfo());
        }
        ATRewardVideoListener aTRewardVideoListener = this.f15004j;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onRewardedVideoAdPlayClicked(C1171j.m2045a(this.f15005k));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayEnd() {
        if (this.f15008n == 0) {
            this.f15008n = SystemClock.elapsedRealtime();
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f15005k;
        if (customRewardVideoAdapter != null) {
            if (customRewardVideoAdapter.getDismissType() == 0) {
                this.f15002h = 3;
            }
            m12457b(this.f15005k.getTrackingInfo());
        }
        ATRewardVideoListener aTRewardVideoListener = this.f15004j;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onRewardedVideoAdPlayEnd(C1171j.m2045a(this.f15005k));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayFailed(String str, String str2) {
        this.f15002h = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2);
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f15005k;
        if (customRewardVideoAdapter != null) {
            C1243h trackingInfo = customRewardVideoAdapter.getTrackingInfo();
            if (trackingInfo.m3039P() == 66) {
                this.f15003i = false;
            }
            String strM2677ah = trackingInfo.m2677ah();
            m12453a(errorCode, trackingInfo);
            if (trackingInfo != null) {
                m12455a(trackingInfo.m2677ah());
            }
            m12456a(strM2677ah, 7);
        }
        ATRewardVideoListener aTRewardVideoListener = this.f15004j;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, C1171j.m2045a(this.f15005k));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayStart() {
        String strM2677ah;
        this.f14995a = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f14996b = jElapsedRealtime;
        if (this.f15007m == 0) {
            this.f15007m = jElapsedRealtime;
        }
        C1171j c1171jM2045a = C1171j.m2045a(this.f15005k);
        CustomRewardVideoAdapter customRewardVideoAdapter = this.f15005k;
        if (customRewardVideoAdapter != null) {
            C1243h trackingInfo = customRewardVideoAdapter.getTrackingInfo();
            trackingInfo.m3056a(this.f15005k.getNetworkInfoMap());
            m12454a(trackingInfo);
            if (trackingInfo != null) {
                strM2677ah = trackingInfo.m2677ah();
                C1387u.m4556a().m4563a(strM2677ah, c1171jM2045a);
            } else {
                strM2677ah = "";
            }
            m12456a(strM2677ah, 6);
        }
        if (!this.f15003i || this.f15004j == null) {
            return;
        }
        if (c1171jM2045a.getNetworkFirmId() == -1) {
            C1324g.m3940a(C1169h.j.f3156b, this.f15005k, null);
        }
        this.f15004j.onRewardedVideoAdPlayStart(c1171jM2045a);
    }
}
