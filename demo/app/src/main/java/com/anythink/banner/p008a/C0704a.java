package com.anythink.banner.p008a;

import android.content.Context;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.basead.p021e.AbstractC0777g;
import com.anythink.basead.p025ui.ThirdPartyBannerATView;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import com.anythink.core.common.C1201f;
import com.anythink.core.common.p051b.AbstractC1168g;
import com.anythink.core.common.p051b.C1163b;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.InterfaceC1162a;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1257v;
import com.anythink.core.common.p055f.p056a.C1204b;
import com.anythink.core.common.p055f.p056a.C1205c;
import com.anythink.core.common.p055f.p056a.C1207e;
import com.anythink.core.common.p055f.p056a.InterfaceC1203a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.banner.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0704a {

    /* JADX INFO: renamed from: a */
    public static final String f363a = C1169h.j.f3157c + C0704a.class.getSimpleName();

    /* JADX INFO: renamed from: e */
    private static final Map<String, C0704a> f364e = new ConcurrentHashMap(3);

    /* JADX INFO: renamed from: b */
    private final Context f365b;

    /* JADX INFO: renamed from: c */
    private final String f366c;

    /* JADX INFO: renamed from: d */
    private final C1201f f367d;

    private C0704a(Context context, String str) {
        this.f365b = context.getApplicationContext();
        this.f366c = str;
        this.f367d = C1201f.m2340a(context, str, "2");
    }

    /* JADX INFO: renamed from: a */
    public static C0704a m108a(Context context, String str) {
        Map<String, C0704a> map = f364e;
        C0704a c0704a = map.get(str);
        if (c0704a == null) {
            synchronized (C0704a.class) {
                if (c0704a == null) {
                    c0704a = new C0704a(context, str);
                    map.put(str, c0704a);
                }
            }
        }
        return c0704a;
    }

    /* JADX INFO: renamed from: a */
    public static void m109a(String str) {
        f364e.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final View m110a(Context context, C1234b c1234b, CustomBannerAdapter customBannerAdapter, final C0705b c0705b) {
        if (customBannerAdapter == null || c1234b == null) {
            return null;
        }
        if (!customBannerAdapter.isMixFormatAd()) {
            customBannerAdapter.setAdEventListener(c0705b);
            return customBannerAdapter.getBannerView();
        }
        BaseAd baseAdM2905e = c1234b.m2905e();
        if (!(baseAdM2905e instanceof C1207e)) {
            return null;
        }
        final ThirdPartyBannerATView thirdPartyBannerATView = new ThirdPartyBannerATView(context, baseAdM2905e, new C1205c((InterfaceC1203a) baseAdM2905e, customBannerAdapter.getTrackingInfo(), Integer.parseInt("2")), new C1204b((C1207e) baseAdM2905e), new AbstractC0777g() { // from class: com.anythink.banner.a.a.1
            @Override // com.anythink.basead.p021e.AbstractC0777g, com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdClosed() {
                C0705b c0705b2 = c0705b;
                if (c0705b2 != null) {
                    c0705b2.onBannerAdClose();
                }
            }
        });
        baseAdM2905e.setNativeEventListener(new AbstractC1168g() { // from class: com.anythink.banner.a.a.2
            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onAdClicked(View view) {
                C0705b c0705b2 = c0705b;
                if (c0705b2 != null) {
                    c0705b2.m117a(thirdPartyBannerATView.getClickedArea());
                    c0705b.onBannerAdClicked();
                }
            }

            @Override // com.anythink.core.common.p051b.AbstractC1168g, com.anythink.core.common.p051b.InterfaceC1173l
            public final void onAdDislikeButtonClick() {
                C0705b c0705b2 = c0705b;
                if (c0705b2 != null) {
                    c0705b2.onBannerAdClose();
                }
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onAdImpressed() {
                C0705b c0705b2 = c0705b;
                if (c0705b2 != null) {
                    c0705b2.onBannerAdShow();
                }
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onDeeplinkCallback(boolean z) {
                C0705b c0705b2 = c0705b;
                if (c0705b2 != null) {
                    c0705b2.onDeeplinkCallback(z);
                }
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onDownloadConfirmCallback(Context context2, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                C0705b c0705b2 = c0705b;
                if (c0705b2 != null) {
                    c0705b2.onDownloadConfirm(context2, aTNetworkConfirmInfo);
                }
            }
        });
        return thirdPartyBannerATView;
    }

    /* JADX INFO: renamed from: a */
    public final ATAdStatusInfo m111a(Context context, Map<String, Object> map) {
        return this.f367d.m2380a(context, map);
    }

    /* JADX INFO: renamed from: a */
    public final List<ATAdInfo> m112a(Context context) {
        return this.f367d.m2396b(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m113a(Context context, int i, InterfaceC1162a interfaceC1162a, C1163b c1163b, Map<String, Object> map, ATAdxBidFloorInfo aTAdxBidFloorInfo) {
        C1257v c1257v = new C1257v();
        c1257v.f4484e = c1163b;
        c1257v.m3446a(context);
        c1257v.f4483d = i;
        if (map != null) {
            try {
                c1257v.f4486g = new HashMap(map);
            } catch (Throwable unused) {
            }
        }
        c1257v.f4491l = aTAdxBidFloorInfo;
        this.f367d.m2398b(this.f365b, "2", this.f366c, c1257v, interfaceC1162a);
    }

    /* JADX INFO: renamed from: a */
    public final void m114a(C1234b c1234b) {
        this.f367d.m2388a(c1234b);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m115a() {
        return this.f367d.m2403f();
    }

    /* JADX INFO: renamed from: b */
    public final C1234b m116b(Context context, Map<String, Object> map) {
        return this.f367d.m2381a(context, false, true, map);
    }
}
