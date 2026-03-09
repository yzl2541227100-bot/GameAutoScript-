package com.anythink.network.adx;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p016d.C0769h;
import com.anythink.basead.p021e.AbstractC0775e;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p025ui.BaseMediaATView;
import com.anythink.basead.p025ui.OwnNativeATView;
import com.anythink.core.common.p053d.C1195b;
import com.anythink.core.common.p053d.C1196c;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;

/* JADX INFO: loaded from: classes.dex */
public class AdxATNativeAd extends CustomNativeAd {

    /* JADX INFO: renamed from: a */
    public C0769h f14843a;

    /* JADX INFO: renamed from: b */
    public Context f14844b;

    /* JADX INFO: renamed from: c */
    public boolean f14845c;

    /* JADX INFO: renamed from: d */
    public boolean f14846d;

    /* JADX INFO: renamed from: e */
    public View f14847e;

    /* JADX INFO: renamed from: f */
    public AbstractC0775e f14848f;

    /* JADX INFO: renamed from: com.anythink.network.adx.AdxATNativeAd$1 */
    public class C23791 extends AbstractC0775e {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f14849c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23791(AbstractC1247l abstractC1247l, C1243h c1243h, Context context) {
            super(abstractC1247l, c1243h);
            context = context;
        }

        @Override // com.anythink.basead.p021e.AbstractC0775e, com.anythink.basead.p021e.InterfaceC0771a
        public final void onAdClick(C0779i c0779i) {
            super.onAdClick(c0779i);
            AdxATNativeAd.this.notifyAdClicked();
            if (AdxATNativeAd.this.f14843a.m499a().m3225r() == 67) {
                if (AdxATNativeAd.this.f14843a.m508a(true, false)) {
                    C1196c.m2305a(context).m2301a(AdxATNativeAd.this.f14843a.m499a().m3229t(), 1, 0);
                }
                if (AdxATNativeAd.this.f14843a.m508a(false, false)) {
                    C1195b.m2304a(context).m2301a(AdxATNativeAd.this.f14843a.m499a().m3229t(), 1, 0);
                }
            }
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onAdClosed() {
            AdxATNativeAd.this.notifyAdDislikeClick();
        }

        @Override // com.anythink.basead.p021e.AbstractC0775e, com.anythink.basead.p021e.InterfaceC0771a
        public final void onAdShow(C0779i c0779i) {
            super.onAdShow(c0779i);
            AdxATNativeAd.this.notifyAdImpression();
            if (AdxATNativeAd.this.f14843a.m499a().m3225r() == 67) {
                if (AdxATNativeAd.this.f14843a.m508a(true, true)) {
                    C1196c.m2305a(context).m2301a(AdxATNativeAd.this.f14843a.m499a().m3229t(), 0, 1);
                }
                if (AdxATNativeAd.this.f14843a.m508a(false, true)) {
                    C1195b.m2304a(context).m2301a(AdxATNativeAd.this.f14843a.m499a().m3229t(), 0, 1);
                }
            }
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onDeeplinkCallback(boolean z) {
            AdxATNativeAd.this.notifyDeeplinkCallback(z);
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onShowFailed(C0747e c0747e) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.network.adx.AdxATNativeAd$2 */
    public class C23802 implements BaseMediaATView.InterfaceC0819a {
        public C23802() {
        }

        @Override // com.anythink.basead.p025ui.BaseMediaATView.InterfaceC0819a
        public final void onClickCloseView() {
            AdxATNativeAd.this.notifyAdDislikeClick();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AdxATNativeAd(android.content.Context r3, com.anythink.basead.p016d.C0769h r4, boolean r5, boolean r6) {
        /*
            r2 = this;
            r2.<init>()
            android.content.Context r0 = r3.getApplicationContext()
            r2.f14844b = r0
            r2.f14843a = r4
            com.anythink.core.common.f.l r4 = r4.m499a()
            java.util.Map r4 = com.anythink.basead.C0738b.m279a(r4)
            r2.setNetworkInfoMap(r4)
            com.anythink.network.adx.AdxATNativeAd$1 r4 = new com.anythink.network.adx.AdxATNativeAd$1
            com.anythink.basead.d.h r0 = r2.f14843a
            com.anythink.core.common.f.l r0 = r0.m499a()
            r1 = 0
            r4.<init>(r0, r1)
            r2.f14848f = r4
            com.anythink.basead.d.h r3 = r2.f14843a
            r3.m505a(r4)
            r2.f14845c = r5
            r2.f14846d = r6
            com.anythink.basead.d.h r3 = r2.f14843a
            int r3 = r3.m527t()
            r4 = 2
            r5 = 1
            if (r3 != r5) goto L3c
            java.lang.String r3 = "1"
        L39:
            r2.mAdSourceType = r3
            goto L41
        L3c:
            if (r3 != r4) goto L41
            java.lang.String r3 = "2"
            goto L39
        L41:
            com.anythink.basead.d.h r3 = r2.f14843a
            boolean r3 = r3.m522o()
            if (r3 == 0) goto L4a
            return
        L4a:
            com.anythink.basead.d.h r3 = r2.f14843a
            java.lang.String r3 = r3.m514g()
            r2.setAdChoiceIconUrl(r3)
            com.anythink.basead.d.h r3 = r2.f14843a
            java.lang.String r3 = r3.m509b()
            r2.setTitle(r3)
            com.anythink.basead.d.h r3 = r2.f14843a
            java.lang.String r3 = r3.m510c()
            r2.setDescriptionText(r3)
            com.anythink.basead.d.h r3 = r2.f14843a
            java.lang.String r3 = r3.m512e()
            r2.setIconImageUrl(r3)
            com.anythink.basead.d.h r3 = r2.f14843a
            java.lang.String r3 = r3.m513f()
            r2.setMainImageUrl(r3)
            com.anythink.basead.d.h r3 = r2.f14843a
            java.lang.String r3 = r3.m511d()
            r2.setCallToActionText(r3)
            com.anythink.basead.d.h r3 = r2.f14843a
            boolean r3 = r3.m521n()
            if (r3 == 0) goto L92
            com.anythink.network.adx.AdxAppDownloadInfo r3 = new com.anythink.network.adx.AdxAppDownloadInfo
            com.anythink.basead.d.h r6 = r2.f14843a
            r3.<init>(r6)
            r2.setAdAppInfo(r3)
        L92:
            com.anythink.basead.d.h r3 = r2.f14843a
            int r3 = r3.m530w()
            if (r3 == r5) goto La7
            if (r3 == r4) goto La3
            r6 = 3
            if (r3 == r6) goto La3
            r4 = 4
            if (r3 == r4) goto La7
            goto Laa
        La3:
            r2.setNativeInteractionType(r4)
            goto Laa
        La7:
            r2.setNativeInteractionType(r5)
        Laa:
            com.anythink.basead.d.h r3 = r2.f14843a
            int r3 = r3.m528u()
            r2.setMainImageWidth(r3)
            com.anythink.basead.d.h r3 = r2.f14843a
            int r3 = r3.m529v()
            r2.setMainImageHeight(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.network.adx.AdxATNativeAd.<init>(android.content.Context, com.anythink.basead.d.h, boolean, boolean):void");
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
        C0769h c0769h = this.f14843a;
        if (c0769h != null) {
            c0769h.m523p();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        C0769h c0769h = this.f14843a;
        if (c0769h != null) {
            c0769h.m505a((InterfaceC0771a) null);
            this.f14843a.m524q();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.AbstractC2372a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.f14847e == null) {
            this.f14847e = this.f14843a.m498a(this.f14844b, this.f14846d, new BaseMediaATView.InterfaceC0819a() { // from class: com.anythink.network.adx.AdxATNativeAd.2
                public C23802() {
                }

                @Override // com.anythink.basead.p025ui.BaseMediaATView.InterfaceC0819a
                public final void onClickCloseView() {
                    AdxATNativeAd.this.notifyAdDislikeClick();
                }
            });
        }
        return this.f14847e;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        if (this.f14843a == null || this.f14845c) {
            return null;
        }
        return new OwnNativeATView(this.f14844b);
    }

    @Override // com.anythink.nativead.unitgroup.AbstractC2372a, com.anythink.core.api.IATThirdPartyMaterial
    public int getDownloadStatus() {
        int iM531x;
        C0769h c0769h = this.f14843a;
        if (c0769h == null || (iM531x = c0769h.m531x()) < 0) {
            return 0;
        }
        return iM531x;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.AbstractC2372a
    public boolean isNativeExpress() {
        return this.f14843a.m522o();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.AbstractC2372a
    public void onPause() {
        C0769h c0769h = this.f14843a;
        if (c0769h != null) {
            c0769h.m526s();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.AbstractC2372a
    public void onResume() {
        C0769h c0769h = this.f14843a;
        if (c0769h != null) {
            c0769h.m525r();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.AbstractC2372a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        AbstractC0775e abstractC0775e = this.f14848f;
        if (abstractC0775e != null) {
            abstractC0775e.updateTrackingInfo(getDetail());
        }
        this.f14843a.m525r();
        if (this.f14845c || this.f14843a == null) {
            return;
        }
        this.f14843a.m503a(view, aTNativePrepareInfo.getClickViewList(), aTNativePrepareInfo instanceof ATNativePrepareExInfo ? ((ATNativePrepareExInfo) aTNativePrepareInfo).getCreativeClickViewList() : null);
    }
}
