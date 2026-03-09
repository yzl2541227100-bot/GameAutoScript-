package com.anythink.basead.p025ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p025ui.MraidContainerView;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1345i;

/* JADX INFO: loaded from: classes.dex */
public class MraidBannerATView extends BaseBannerATView {

    /* JADX INFO: renamed from: A */
    public boolean f1495A;

    /* JADX INFO: renamed from: B */
    public boolean f1496B;

    /* JADX INFO: renamed from: y */
    public MraidContainerView f1497y;

    /* JADX INFO: renamed from: z */
    public boolean f1498z;

    /* JADX INFO: renamed from: com.anythink.basead.ui.MraidBannerATView$1 */
    public class C08841 implements MraidContainerView.InterfaceC0889a {
        public C08841() {
        }

        @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
        /* JADX INFO: renamed from: a */
        public final void mo890a() {
            MraidBannerATView mraidBannerATView = MraidBannerATView.this;
            mraidBannerATView.f1498z = true;
            mraidBannerATView.m889o();
            try {
                MraidBannerATView.this.mo720b();
            } catch (Throwable unused) {
            }
        }

        @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
        /* JADX INFO: renamed from: a */
        public final void mo891a(String str) {
            MraidBannerATView.this.f1161c.m3236w(str);
            MraidBannerATView.this.mo700a(1, 13);
        }

        @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
        /* JADX INFO: renamed from: b */
        public final void mo892b() {
        }

        @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
        /* JADX INFO: renamed from: c */
        public final void mo893c() {
        }
    }

    public MraidBannerATView(Context context) {
        super(context);
    }

    public MraidBannerATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, InterfaceC0771a interfaceC0771a) {
        super(context, c1248m, abstractC1247l, interfaceC0771a);
        mo721c();
    }

    /* JADX INFO: renamed from: p */
    private void m888p() {
        int iM4153a;
        int iM4153a2;
        String strM3383x = this.f1160b.f4333n.m3383x();
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_web_banner_ad_layout", "layout"), this);
        iM4153a = C1345i.m4153a(getContext(), 50.0f);
        iM4153a2 = C1345i.m4153a(getContext(), 320.0f);
        strM3383x.hashCode();
        switch (strM3383x) {
            case "300x250":
                iM4153a2 = C1345i.m4153a(getContext(), 300.0f);
                iM4153a = C1345i.m4153a(getContext(), 250.0f);
                break;
            case "320x90":
                iM4153a2 = C1345i.m4153a(getContext(), 320.0f);
                iM4153a = C1345i.m4153a(getContext(), 90.0f);
                break;
            case "728x90":
                iM4153a2 = C1345i.m4153a(getContext(), 720.0f);
                iM4153a = C1345i.m4153a(getContext(), 90.0f);
                break;
        }
        int iMin = Math.min(iM4153a2, getResources().getDisplayMetrics().widthPixels);
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f1161c, this.f1160b, new C08841());
        this.f1497y = mraidContainerView;
        mraidContainerView.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_web", "id"));
        this.f1497y.setMinimumHeight(C1345i.m4153a(getContext(), 50.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iMin, iM4153a);
        layoutParams.gravity = 17;
        frameLayout.addView(this.f1497y, 0, layoutParams);
        setLayoutParams(new ViewGroup.LayoutParams(iMin, iM4153a));
        this.f1212w = (CloseImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_close", "id"));
        if (this.f1160b.f4333n.m3385y() != 0) {
            this.f1212w.setVisibility(8);
        } else {
            this.f1212w.setVisibility(0);
            mo698a(this.f1212w, this.f1160b.f4333n.m3363n());
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo669a() {
        int iM4153a;
        int iM4153a2;
        String strM3383x = this.f1160b.f4333n.m3383x();
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_web_banner_ad_layout", "layout"), this);
        iM4153a = C1345i.m4153a(getContext(), 50.0f);
        iM4153a2 = C1345i.m4153a(getContext(), 320.0f);
        strM3383x.hashCode();
        switch (strM3383x) {
            case "300x250":
                iM4153a2 = C1345i.m4153a(getContext(), 300.0f);
                iM4153a = C1345i.m4153a(getContext(), 250.0f);
                break;
            case "320x90":
                iM4153a2 = C1345i.m4153a(getContext(), 320.0f);
                iM4153a = C1345i.m4153a(getContext(), 90.0f);
                break;
            case "728x90":
                iM4153a2 = C1345i.m4153a(getContext(), 720.0f);
                iM4153a = C1345i.m4153a(getContext(), 90.0f);
                break;
        }
        int iMin = Math.min(iM4153a2, getResources().getDisplayMetrics().widthPixels);
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f1161c, this.f1160b, new C08841());
        this.f1497y = mraidContainerView;
        mraidContainerView.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_web", "id"));
        this.f1497y.setMinimumHeight(C1345i.m4153a(getContext(), 50.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iMin, iM4153a);
        layoutParams.gravity = 17;
        frameLayout.addView(this.f1497y, 0, layoutParams);
        setLayoutParams(new ViewGroup.LayoutParams(iMin, iM4153a));
        this.f1212w = (CloseImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_close", "id"));
        if (this.f1160b.f4333n.m3385y() != 0) {
            this.f1212w.setVisibility(8);
        } else {
            this.f1212w.setVisibility(0);
            mo698a(this.f1212w, this.f1160b.f4333n.m3363n());
        }
    }

    @Override // com.anythink.basead.p025ui.BaseBannerATView
    /* JADX INFO: renamed from: b */
    public final void mo720b() {
        if (this.f1497y == null) {
            return;
        }
        super.mo720b();
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    public void destroy() {
        super.destroy();
        MraidContainerView mraidContainerView = this.f1497y;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m889o() {
        if (this.f1498z && this.f1495A && !this.f1496B) {
            this.f1496B = true;
            C1322e.m3894a(this.f1160b, this.f1161c);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1495A = true;
        m889o();
    }

    @Override // com.anythink.basead.p025ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1495A = false;
    }
}
