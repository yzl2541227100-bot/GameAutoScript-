package com.anythink.rewardvideo.p186a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.C1201f;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.C1389w;
import com.anythink.core.common.p051b.AbstractC1165d;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1171j;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p061j.InterfaceC1296b;
import com.anythink.core.common.p061j.InterfaceC1298d;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.rewardvideo.api.ATRewardVideoAutoEventListener;
import com.anythink.rewardvideo.api.ATRewardVideoAutoLoadListener;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.rewardvideo.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C2408c implements InterfaceC1296b {

    /* JADX INFO: renamed from: c */
    private static volatile C2408c f14985c;

    /* JADX INFO: renamed from: a */
    public String f14986a = "RewardVideoAuto";

    /* JADX INFO: renamed from: b */
    public ATRewardVideoAutoLoadListener f14987b = new ATRewardVideoAutoLoadListener() { // from class: com.anythink.rewardvideo.a.c.1
        @Override // com.anythink.rewardvideo.api.ATRewardVideoAutoLoadListener
        public final void onRewardVideoAutoLoadFail(final String str, final AdError adError) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.c.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (C2408c.this.f14988d != null) {
                        C2408c.this.f14988d.onRewardVideoAutoLoadFail(str, adError);
                    }
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoAutoLoadListener
        public final void onRewardVideoAutoLoaded(final String str) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.c.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (C2408c.this.f14988d != null) {
                        C2408c.this.f14988d.onRewardVideoAutoLoaded(str);
                    }
                }
            });
        }
    };

    /* JADX INFO: renamed from: d */
    private ATRewardVideoAutoLoadListener f14988d;

    /* JADX INFO: renamed from: a */
    public static C2408c m12436a() {
        if (f14985c == null) {
            synchronized (C2408c.class) {
                if (f14985c == null) {
                    f14985c = new C2408c();
                }
            }
        }
        return f14985c;
    }

    /* JADX INFO: renamed from: a */
    private void m12438a(Activity activity, String str, ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener) {
        m12445a(activity, str, "", aTRewardVideoAutoEventListener);
    }

    /* JADX INFO: renamed from: a */
    public static void m12439a(String str, String str2, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1175n.m2059a().m2121a(str, str2, "1", map);
    }

    /* JADX INFO: renamed from: a */
    public static void m12440a(String str, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1387u.m4556a().m4566a(str, map);
    }

    /* JADX INFO: renamed from: b */
    private ATRewardVideoAutoLoadListener m12441b() {
        return this.f14987b;
    }

    /* JADX INFO: renamed from: b */
    public static void m12442b(String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                C1387u.m4556a().m4567a(str, false);
                InterfaceC1298d interfaceC1298dM2383a = m12444f(str).m2383a();
                if (interfaceC1298dM2383a != null) {
                    interfaceC1298dM2383a.mo3729a((InterfaceC1296b) null);
                    interfaceC1298dM2383a.mo3732c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private ATAdStatusInfo m12443e(String str) {
        if (C1175n.m2059a().m2148f() == null || TextUtils.isEmpty(C1175n.m2059a().m2165o()) || TextUtils.isEmpty(C1175n.m2059a().m2167p())) {
            Log.e(this.f14986a, "SDK init error!");
            return null;
        }
        C1201f c1201fM12444f = m12444f(str);
        if (c1201fM12444f != null) {
            return c1201fM12444f.m2380a(C1175n.m2059a().m2099E(), (Map<String, Object>) null);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private static C1201f m12444f(String str) {
        return C1201f.m2340a(C1175n.m2059a().m2148f(), str, "1");
    }

    /* JADX INFO: renamed from: a */
    public final void m12445a(Activity activity, String str, String str2, ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener) {
        C1352p.m4217b(str, C1169h.n.f3195u, C1169h.n.f3199y, C1169h.n.f3188n, "");
        if (TextUtils.isEmpty(str)) {
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", "placementId is empty.");
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onRewardedVideoAdPlayFailed(errorCode, C1171j.m2045a((AbstractC1165d) null));
            }
            Log.e(this.f14986a, "PlacementId is Empty!");
        }
        if (C1175n.m2059a().m2148f() != null && !TextUtils.isEmpty(C1175n.m2059a().m2165o()) && !TextUtils.isEmpty(C1175n.m2059a().m2167p())) {
            if (activity == null) {
                Log.e(this.f14986a, "RewardedVideo Show Activity is null.");
            }
            C2406a.m12430a(activity, str).m12434a(activity, str2, new C2407b(aTRewardVideoAutoEventListener), null, null);
        } else {
            AdError errorCode2 = ErrorCode.getErrorCode(ErrorCode.exception, "", "sdk init error");
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onRewardedVideoAdPlayFailed(errorCode2, C1171j.m2045a((AbstractC1165d) null));
            }
            Log.e(this.f14986a, "SDK init error!");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12446a(Context context, String[] strArr, ATRewardVideoAutoLoadListener aTRewardVideoAutoLoadListener) {
        String str;
        if (context instanceof Activity) {
            C1175n.m2059a().m2110a((Activity) context);
        }
        if (strArr != null) {
            for (String str2 : strArr) {
                if (!TextUtils.isEmpty(str2)) {
                    if (ATAdxSetting.getInstance().isAdxNetworkMode(str2)) {
                        str = "Forbidden placement, this placement is in adx network mode";
                    } else if (C1389w.m4583a().m4628c(str2)) {
                        str = "Forbidden placement";
                    } else if (!C1387u.m4556a().m4573e(str2)) {
                        C1387u.m4556a().m4567a(str2, true);
                        InterfaceC1298d interfaceC1298dM2383a = m12444f(str2).m2383a();
                        if (interfaceC1298dM2383a != null) {
                            interfaceC1298dM2383a.mo3729a(this);
                            interfaceC1298dM2383a.mo3727a(context, 3);
                        }
                    }
                    Log.w("anythink", str);
                }
            }
        }
        this.f14988d = aTRewardVideoAutoLoadListener;
    }

    @Override // com.anythink.core.common.p061j.InterfaceC1296b
    /* JADX INFO: renamed from: a */
    public final void mo3733a(String str) {
        ATRewardVideoAutoLoadListener aTRewardVideoAutoLoadListener = m12436a().f14987b;
        if (aTRewardVideoAutoLoadListener != null) {
            aTRewardVideoAutoLoadListener.onRewardVideoAutoLoaded(str);
        }
    }

    @Override // com.anythink.core.common.p061j.InterfaceC1296b
    /* JADX INFO: renamed from: a */
    public final void mo3734a(String str, AdError adError) {
        ATRewardVideoAutoLoadListener aTRewardVideoAutoLoadListener = m12436a().f14987b;
        if (aTRewardVideoAutoLoadListener != null) {
            aTRewardVideoAutoLoadListener.onRewardVideoAutoLoadFail(str, adError);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12447a(String... strArr) {
        String str;
        if (strArr == null) {
            return;
        }
        for (String str2 : strArr) {
            if (!TextUtils.isEmpty(str2)) {
                if (ATAdxSetting.getInstance().isAdxNetworkMode(str2)) {
                    str = "Forbidden placement, this placement is in adx network mode";
                } else if (C1389w.m4583a().m4628c(str2)) {
                    str = "Forbidden placement";
                } else if (!C1387u.m4556a().m4573e(str2)) {
                    C1387u.m4556a().m4567a(str2, true);
                    InterfaceC1298d interfaceC1298dM2383a = m12444f(str2).m2383a();
                    if (interfaceC1298dM2383a != null) {
                        interfaceC1298dM2383a.mo3729a(this);
                        interfaceC1298dM2383a.mo3727a(C1175n.m2059a().m2099E(), 3);
                    }
                }
                Log.w("anythink", str);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12448b(String str) {
        boolean zIsReady = false;
        if (!TextUtils.isEmpty(str)) {
            ATAdStatusInfo aTAdStatusInfoM12443e = m12443e(str);
            if (aTAdStatusInfoM12443e == null) {
                return false;
            }
            zIsReady = aTAdStatusInfoM12443e.isReady();
        }
        C1352p.m4217b(str, C1169h.n.f3195u, C1169h.n.f3200z, String.valueOf(zIsReady), "");
        return zIsReady;
    }

    /* JADX INFO: renamed from: c */
    public final ATAdStatusInfo m12449c(String str) {
        ATAdStatusInfo aTAdStatusInfo;
        if (TextUtils.isEmpty(str) || (aTAdStatusInfo = m12443e(str)) == null) {
            aTAdStatusInfo = new ATAdStatusInfo(false, false, null);
        }
        C1352p.m4217b(str, C1169h.n.f3195u, C1169h.n.f3171A, aTAdStatusInfo.toString(), "");
        return aTAdStatusInfo;
    }

    /* JADX INFO: renamed from: d */
    public final List<ATAdInfo> m12450d(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(this.f14986a, "PlacementId is empty.");
            return null;
        }
        C1201f c1201fM12444f = m12444f(str);
        if (c1201fM12444f != null) {
            return c1201fM12444f.m2396b(C1175n.m2059a().m2099E());
        }
        return null;
    }
}
