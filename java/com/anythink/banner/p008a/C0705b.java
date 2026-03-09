package com.anythink.banner.p008a;

import android.content.Context;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.banner.unitgroup.api.CustomBannerEventListener;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p065n.C1320c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1352p;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.anythink.banner.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0705b implements CustomBannerEventListener {

    /* JADX INFO: renamed from: a */
    public WeakReference<InterfaceC0707d> f373a;

    /* JADX INFO: renamed from: b */
    public CustomBannerAdapter f374b;

    /* JADX INFO: renamed from: c */
    public boolean f375c;

    /* JADX INFO: renamed from: d */
    private int f376d;

    public C0705b(InterfaceC0707d interfaceC0707d, CustomBannerAdapter customBannerAdapter, boolean z) {
        this.f375c = false;
        this.f373a = new WeakReference<>(interfaceC0707d);
        this.f374b = customBannerAdapter;
        this.f375c = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m117a(int i) {
        this.f376d = i;
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdClicked() {
        CustomBannerAdapter customBannerAdapter = this.f374b;
        if (customBannerAdapter != null) {
            C1243h trackingInfo = customBannerAdapter.getTrackingInfo();
            trackingInfo.m3028G(this.f376d);
            C1320c.m3839a(C1175n.m2059a().m2148f()).m3851a(6, trackingInfo);
            C1352p.m4208a(trackingInfo, C1169h.n.f3178d, C1169h.n.f3186l, "");
            InterfaceC0707d interfaceC0707d = this.f373a.get();
            if (interfaceC0707d != null) {
                interfaceC0707d.onBannerClicked(this.f374b);
            }
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdClose() {
        if (this.f374b != null) {
            InterfaceC0707d interfaceC0707d = this.f373a.get();
            if (interfaceC0707d != null) {
                interfaceC0707d.onBannerClose(this.f374b);
            }
            C1243h trackingInfo = this.f374b.getTrackingInfo();
            C1352p.m4208a(trackingInfo, C1169h.n.f3179e, C1169h.n.f3186l, "");
            if (trackingInfo != null) {
                C1322e.m3889a(trackingInfo, false);
            }
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdShow() {
        if (this.f374b != null) {
            InterfaceC0707d interfaceC0707d = this.f373a.get();
            if (interfaceC0707d != null) {
                interfaceC0707d.onBannerShow(this.f374b, this.f375c);
            }
            C1243h trackingInfo = this.f374b.getTrackingInfo();
            trackingInfo.m3056a(this.f374b.getNetworkInfoMap());
            C1352p.m4208a(trackingInfo, C1169h.n.f3177c, C1169h.n.f3186l, "");
            C1320c.m3839a(C1175n.m2059a().m2148f()).m3852a(4, trackingInfo, this.f374b.getUnitGroupInfo());
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onDeeplinkCallback(boolean z) {
        InterfaceC0707d interfaceC0707d = this.f373a.get();
        if (interfaceC0707d != null) {
            interfaceC0707d.onDeeplinkCallback(this.f374b, z);
        }
        CustomBannerAdapter customBannerAdapter = this.f374b;
        if (customBannerAdapter != null) {
            C1352p.m4208a(customBannerAdapter.getTrackingInfo(), C1169h.n.f3183i, z ? C1169h.n.f3186l : C1169h.n.f3187m, "");
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        InterfaceC0707d interfaceC0707d = this.f373a.get();
        if (interfaceC0707d != null) {
            interfaceC0707d.onDownloadConfirm(context, this.f374b, aTNetworkConfirmInfo);
        }
        CustomBannerAdapter customBannerAdapter = this.f374b;
        if (customBannerAdapter != null) {
            C1352p.m4208a(customBannerAdapter.getTrackingInfo(), C1169h.n.f3184j, C1169h.n.f3186l, "");
        }
    }
}
