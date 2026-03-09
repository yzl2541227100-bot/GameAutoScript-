package com.anythink.interstitial.p183a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.C1201f;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.C1389w;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p061j.InterfaceC1296b;
import com.anythink.core.common.p061j.InterfaceC1298d;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.interstitial.api.ATInterstitialAutoEventListener;
import com.anythink.interstitial.api.ATInterstitialAutoLoadListener;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.interstitial.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C2350c implements InterfaceC1296b {

    /* JADX INFO: renamed from: c */
    private static volatile C2350c f14774c;

    /* JADX INFO: renamed from: a */
    public String f14775a = "InterstitialAuto";

    /* JADX INFO: renamed from: b */
    public ATInterstitialAutoLoadListener f14776b = new ATInterstitialAutoLoadListener() { // from class: com.anythink.interstitial.a.c.1
        @Override // com.anythink.interstitial.api.ATInterstitialAutoLoadListener
        public final void onInterstitialAutoLoadFail(final String str, final AdError adError) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.interstitial.a.c.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (C2350c.this.f14777d != null) {
                        C2350c.this.f14777d.onInterstitialAutoLoadFail(str, adError);
                    }
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialAutoLoadListener
        public final void onInterstitialAutoLoaded(final String str) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.interstitial.a.c.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (C2350c.this.f14777d != null) {
                        C2350c.this.f14777d.onInterstitialAutoLoaded(str);
                    }
                }
            });
        }
    };

    /* JADX INFO: renamed from: d */
    private ATInterstitialAutoLoadListener f14777d;

    /* JADX INFO: renamed from: a */
    public static C2350c m12160a() {
        if (f14774c == null) {
            synchronized (C2350c.class) {
                if (f14774c == null) {
                    f14774c = new C2350c();
                }
            }
        }
        return f14774c;
    }

    /* JADX INFO: renamed from: a */
    private void m12162a(Activity activity, String str, ATInterstitialAutoEventListener aTInterstitialAutoEventListener) {
        m12170a(activity, str, "", aTInterstitialAutoEventListener);
    }

    /* JADX INFO: renamed from: a */
    public static void m12163a(String str, String str2, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1175n.m2059a().m2121a(str, str2, "3", map);
    }

    /* JADX INFO: renamed from: a */
    public static void m12164a(String str, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1387u.m4556a().m4566a(str, map);
    }

    /* JADX INFO: renamed from: b */
    private ATInterstitialAutoLoadListener m12165b() {
        return this.f14776b;
    }

    /* JADX INFO: renamed from: b */
    public static void m12166b(String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                C1387u.m4556a().m4567a(str, false);
                InterfaceC1298d interfaceC1298dM2383a = m12169f(str).m2383a();
                if (interfaceC1298dM2383a != null) {
                    interfaceC1298dM2383a.mo3729a((InterfaceC1296b) null);
                    interfaceC1298dM2383a.mo3732c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static List<ATAdInfo> m12167d(String str) {
        C1201f c1201fM12169f = m12169f(str);
        if (c1201fM12169f != null) {
            return c1201fM12169f.m2396b(C1175n.m2059a().m2099E());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private ATAdStatusInfo m12168e(String str) {
        if (C1175n.m2059a().m2148f() == null || TextUtils.isEmpty(C1175n.m2059a().m2165o()) || TextUtils.isEmpty(C1175n.m2059a().m2167p())) {
            Log.e(this.f14775a, "SDK init error!");
            return null;
        }
        C1201f c1201fM12169f = m12169f(str);
        if (c1201fM12169f != null) {
            return c1201fM12169f.m2380a(C1175n.m2059a().m2099E(), (Map<String, Object>) null);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private static C1201f m12169f(String str) {
        return C1201f.m2340a(C1175n.m2059a().m2148f(), str, "3");
    }

    /* JADX INFO: renamed from: a */
    public final void m12170a(Activity activity, String str, String str2, ATInterstitialAutoEventListener aTInterstitialAutoEventListener) {
        C1352p.m4217b(str, C1169h.n.f3194t, C1169h.n.f3199y, C1169h.n.f3188n, "");
        if (TextUtils.isEmpty(str)) {
            Log.e(this.f14775a, "PlacementId is Empty!");
            return;
        }
        if (C1175n.m2059a().m2148f() == null || TextUtils.isEmpty(C1175n.m2059a().m2165o()) || TextUtils.isEmpty(C1175n.m2059a().m2167p())) {
            Log.e(this.f14775a, "Show error: SDK init error!");
            return;
        }
        if (activity == null) {
            Log.e(this.f14775a, "Interstitial Show Activity is null.");
        }
        C2348a.m12145a(activity, str).m12158a(activity, str2, new C2351d(aTInterstitialAutoEventListener), (ATEventInterface) null, (Map<String, Object>) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m12171a(Context context, String[] strArr, ATInterstitialAutoLoadListener aTInterstitialAutoLoadListener) {
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
                        InterfaceC1298d interfaceC1298dM2383a = m12169f(str2).m2383a();
                        if (interfaceC1298dM2383a != null) {
                            interfaceC1298dM2383a.mo3729a(this);
                            interfaceC1298dM2383a.mo3727a(context, 3);
                        }
                    }
                    Log.w("anythink", str);
                }
            }
        }
        this.f14777d = aTInterstitialAutoLoadListener;
    }

    @Override // com.anythink.core.common.p061j.InterfaceC1296b
    /* JADX INFO: renamed from: a */
    public final void mo3733a(String str) {
        ATInterstitialAutoLoadListener aTInterstitialAutoLoadListener = m12160a().f14776b;
        if (aTInterstitialAutoLoadListener != null) {
            aTInterstitialAutoLoadListener.onInterstitialAutoLoaded(str);
        }
    }

    @Override // com.anythink.core.common.p061j.InterfaceC1296b
    /* JADX INFO: renamed from: a */
    public final void mo3734a(String str, AdError adError) {
        ATInterstitialAutoLoadListener aTInterstitialAutoLoadListener = m12160a().f14776b;
        if (aTInterstitialAutoLoadListener != null) {
            aTInterstitialAutoLoadListener.onInterstitialAutoLoadFail(str, adError);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12172a(String... strArr) {
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
                    InterfaceC1298d interfaceC1298dM2383a = m12169f(str2).m2383a();
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
    public final boolean m12173b(String str) {
        boolean zIsReady = false;
        if (!TextUtils.isEmpty(str)) {
            ATAdStatusInfo aTAdStatusInfoM12168e = m12168e(str);
            if (aTAdStatusInfoM12168e == null) {
                return false;
            }
            zIsReady = aTAdStatusInfoM12168e.isReady();
        }
        C1352p.m4217b(str, C1169h.n.f3194t, C1169h.n.f3200z, String.valueOf(zIsReady), "");
        return zIsReady;
    }

    /* JADX INFO: renamed from: c */
    public final ATAdStatusInfo m12174c(String str) {
        ATAdStatusInfo aTAdStatusInfo;
        if (TextUtils.isEmpty(str) || (aTAdStatusInfo = m12168e(str)) == null) {
            aTAdStatusInfo = new ATAdStatusInfo(false, false, null);
        }
        C1352p.m4217b(str, C1169h.n.f3194t, C1169h.n.f3171A, aTAdStatusInfo.toString(), "");
        return aTAdStatusInfo;
    }
}
