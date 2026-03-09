package com.anythink.network.onlineapi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.p016d.C0769h;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p025ui.BaseMediaATView;
import com.anythink.basead.p025ui.OwnNativeATView;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;

/* JADX INFO: loaded from: classes.dex */
public class OnlineApiATNativeAd extends CustomNativeAd {

    /* JADX INFO: renamed from: a */
    public C0769h f14922a;

    /* JADX INFO: renamed from: b */
    public Context f14923b;

    /* JADX INFO: renamed from: c */
    public View f14924c;

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OnlineApiATNativeAd(android.content.Context r3, com.anythink.basead.p016d.C0769h r4) {
        /*
            r2 = this;
            r2.<init>()
            android.content.Context r3 = r3.getApplicationContext()
            r2.f14923b = r3
            r2.f14922a = r4
            com.anythink.network.onlineapi.OnlineApiATNativeAd$1 r3 = new com.anythink.network.onlineapi.OnlineApiATNativeAd$1
            r3.<init>()
            r4.m505a(r3)
            com.anythink.basead.d.h r3 = r2.f14922a
            com.anythink.core.common.f.l r3 = r3.m499a()
            java.util.Map r3 = com.anythink.basead.C0738b.m279a(r3)
            r2.setNetworkInfoMap(r3)
            com.anythink.basead.d.h r3 = r2.f14922a
            java.lang.String r3 = r3.m514g()
            r2.setAdChoiceIconUrl(r3)
            com.anythink.basead.d.h r3 = r2.f14922a
            java.lang.String r3 = r3.m509b()
            r2.setTitle(r3)
            com.anythink.basead.d.h r3 = r2.f14922a
            java.lang.String r3 = r3.m510c()
            r2.setDescriptionText(r3)
            com.anythink.basead.d.h r3 = r2.f14922a
            java.lang.String r3 = r3.m512e()
            r2.setIconImageUrl(r3)
            com.anythink.basead.d.h r3 = r2.f14922a
            java.lang.String r3 = r3.m513f()
            r2.setMainImageUrl(r3)
            com.anythink.basead.d.h r3 = r2.f14922a
            java.lang.String r3 = r3.m511d()
            r2.setCallToActionText(r3)
            com.anythink.basead.d.h r3 = r2.f14922a
            boolean r3 = r3.m521n()
            if (r3 == 0) goto L68
            com.anythink.network.adx.AdxAppDownloadInfo r3 = new com.anythink.network.adx.AdxAppDownloadInfo
            com.anythink.basead.d.h r4 = r2.f14922a
            r3.<init>(r4)
            r2.setAdAppInfo(r3)
        L68:
            com.anythink.basead.d.h r3 = r2.f14922a
            int r3 = r3.m530w()
            r4 = 1
            if (r3 == r4) goto L7f
            r0 = 2
            if (r3 == r0) goto L7b
            r1 = 3
            if (r3 == r1) goto L7b
            r0 = 4
            if (r3 == r0) goto L7f
            goto L82
        L7b:
            r2.setNativeInteractionType(r0)
            goto L82
        L7f:
            r2.setNativeInteractionType(r4)
        L82:
            com.anythink.basead.d.h r3 = r2.f14922a
            int r3 = r3.m528u()
            r2.setMainImageWidth(r3)
            com.anythink.basead.d.h r3 = r2.f14922a
            int r3 = r3.m529v()
            r2.setMainImageHeight(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.network.onlineapi.OnlineApiATNativeAd.<init>(android.content.Context, com.anythink.basead.d.h):void");
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
        C0769h c0769h = this.f14922a;
        if (c0769h != null) {
            c0769h.m523p();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        C0769h c0769h = this.f14922a;
        if (c0769h != null) {
            c0769h.m505a((InterfaceC0771a) null);
            this.f14922a.m524q();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.AbstractC2372a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.f14924c == null) {
            this.f14924c = this.f14922a.m498a(this.f14923b, false, (BaseMediaATView.InterfaceC0819a) null);
        }
        return this.f14924c;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        if (this.f14922a != null) {
            return new OwnNativeATView(this.f14923b);
        }
        return null;
    }

    @Override // com.anythink.nativead.unitgroup.AbstractC2372a, com.anythink.core.api.IATThirdPartyMaterial
    public int getDownloadStatus() {
        int iM531x;
        C0769h c0769h = this.f14922a;
        if (c0769h == null || (iM531x = c0769h.m531x()) < 0) {
            return 0;
        }
        return iM531x;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.AbstractC2372a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.f14922a != null) {
            this.f14922a.m503a(view, aTNativePrepareInfo.getClickViewList(), aTNativePrepareInfo instanceof ATNativePrepareExInfo ? ((ATNativePrepareExInfo) aTNativePrepareInfo).getCreativeClickViewList() : null);
        }
    }
}
