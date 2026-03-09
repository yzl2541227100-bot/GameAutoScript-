package com.anythink.network.myoffer;

import android.content.Context;
import android.view.View;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p022f.C0787e;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;

/* JADX INFO: loaded from: classes.dex */
public class MyOfferATNativeAd extends CustomNativeAd {

    /* JADX INFO: renamed from: a */
    public C0787e f14885a;

    /* JADX INFO: renamed from: b */
    public Context f14886b;

    /* JADX INFO: renamed from: c */
    public View f14887c;

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MyOfferATNativeAd(android.content.Context r3, com.anythink.basead.p022f.C0787e r4) {
        /*
            r2 = this;
            r2.<init>()
            android.content.Context r3 = r3.getApplicationContext()
            r2.f14886b = r3
            r2.f14885a = r4
            com.anythink.network.myoffer.MyOfferATNativeAd$1 r3 = new com.anythink.network.myoffer.MyOfferATNativeAd$1
            r3.<init>()
            r4.m602a(r3)
            com.anythink.basead.f.e r3 = r2.f14885a
            com.anythink.core.common.f.z r3 = r3.m584e()
            java.util.Map r3 = com.anythink.basead.C0738b.m279a(r3)
            r2.setNetworkInfoMap(r3)
            com.anythink.basead.f.e r3 = r2.f14885a
            java.lang.String r3 = r3.m608j()
            r2.setAdChoiceIconUrl(r3)
            com.anythink.basead.f.e r3 = r2.f14885a
            java.lang.String r3 = r3.m603b()
            r2.setTitle(r3)
            com.anythink.basead.f.e r3 = r2.f14885a
            java.lang.String r3 = r3.m604f()
            r2.setDescriptionText(r3)
            com.anythink.basead.f.e r3 = r2.f14885a
            java.lang.String r3 = r3.m606h()
            r2.setIconImageUrl(r3)
            com.anythink.basead.f.e r3 = r2.f14885a
            java.lang.String r3 = r3.m607i()
            r2.setMainImageUrl(r3)
            com.anythink.basead.f.e r3 = r2.f14885a
            java.lang.String r3 = r3.m605g()
            r2.setCallToActionText(r3)
            com.anythink.basead.f.e r3 = r2.f14885a
            int r3 = r3.m613p()
            r4 = 1
            if (r3 == r4) goto L6d
            r0 = 2
            if (r3 == r0) goto L69
            r1 = 3
            if (r3 == r1) goto L69
            r0 = 4
            if (r3 == r0) goto L6d
            goto L70
        L69:
            r2.setNativeInteractionType(r0)
            goto L70
        L6d:
            r2.setNativeInteractionType(r4)
        L70:
            com.anythink.basead.f.e r3 = r2.f14885a
            int r3 = r3.m609l()
            r2.setMainImageWidth(r3)
            com.anythink.basead.f.e r3 = r2.f14885a
            int r3 = r3.m610m()
            r2.setMainImageHeight(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.network.myoffer.MyOfferATNativeAd.<init>(android.content.Context, com.anythink.basead.f.e):void");
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
        C0787e c0787e = this.f14885a;
        if (c0787e != null) {
            c0787e.m611n();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        C0787e c0787e = this.f14885a;
        if (c0787e != null) {
            c0787e.m602a((InterfaceC0771a) null);
            this.f14885a.m612o();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.AbstractC2372a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.f14887c == null) {
            this.f14887c = C0787e.m595k();
        }
        return this.f14887c;
    }

    @Override // com.anythink.nativead.unitgroup.AbstractC2372a, com.anythink.core.api.IATThirdPartyMaterial
    public int getDownloadStatus() {
        int iM614q;
        C0787e c0787e = this.f14885a;
        if (c0787e == null || (iM614q = c0787e.m614q()) < 0) {
            return 0;
        }
        return iM614q;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.AbstractC2372a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.f14885a != null) {
            this.f14885a.m600a(view, aTNativePrepareInfo.getClickViewList(), aTNativePrepareInfo instanceof ATNativePrepareExInfo ? ((ATNativePrepareExInfo) aTNativePrepareInfo).getCreativeClickViewList() : null);
        }
    }
}
