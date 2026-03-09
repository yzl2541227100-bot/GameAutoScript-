package com.anythink.basead.p025ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.p016d.C0770i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p071ui.component.RoundImageView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ThirdPartySplashATView extends AsseblemSplashATView {

    /* JADX INFO: renamed from: Q */
    public BaseAd f1776Q;

    public ThirdPartySplashATView(Context context) {
        super(context);
    }

    public ThirdPartySplashATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, InterfaceC0771a interfaceC0771a, String str) {
        RelativeLayout.LayoutParams layoutParams;
        Context context2;
        float f;
        BaseAd baseAd;
        super(context, c1248m, abstractC1247l, interfaceC0771a);
        this.f1776Q = C0770i.m538a().m539a(str);
        FrameLayout frameLayout = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_ad_lable_area", "id"));
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            this.f1174p.add(frameLayout);
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_ad_content_image_area", "id"));
        if (frameLayout2 != null && (baseAd = this.f1776Q) != null && baseAd.getAdMediaView(new Object[0]) != null) {
            View adMediaView = this.f1776Q.getAdMediaView(new Object[0]);
            if (adMediaView.getParent() != null) {
                ((ViewGroup) adMediaView.getParent()).removeView(adMediaView);
            }
            frameLayout2.addView(adMediaView, new FrameLayout.LayoutParams(-1, -1));
        }
        RoundImageView roundImageView = (RoundImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_icon", "id"));
        if (roundImageView != null && this.f1776Q.getAdIconView() != null && roundImageView.getParent() != null && (roundImageView.getParent() instanceof ViewGroup)) {
            TextView textView = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_ad_title", "id"));
            if (textView != null) {
                textView.setGravity(3);
            }
            TextView textView2 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_desc", "id"));
            if (textView2 != null) {
                textView2.setGravity(3);
            }
            roundImageView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams2 = roundImageView.getLayoutParams();
            layoutParams2.width = layoutParams2.height;
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                if (this.f1160b.f4333n.m3381w() == 2) {
                    layoutParams = (RelativeLayout.LayoutParams) layoutParams2;
                    context2 = getContext();
                    f = 18.0f;
                } else {
                    layoutParams = (RelativeLayout.LayoutParams) layoutParams2;
                    context2 = getContext();
                    f = 12.0f;
                }
                layoutParams.rightMargin = C1345i.m4153a(context2, f);
            }
            roundImageView.setLayoutParams(layoutParams2);
            ((ViewGroup) roundImageView.getParent()).addView(this.f1776Q.getAdIconView(), roundImageView.getLayoutParams());
        }
        if (((BaseSdkSplashATView) this).f1292v == null || this.f1776Q.getAdLogoView() == null || ((BaseSdkSplashATView) this).f1292v.getParent() == null || !(((BaseSdkSplashATView) this).f1292v.getParent() instanceof ViewGroup)) {
            return;
        }
        ((BaseSdkSplashATView) this).f1292v.setVisibility(0);
        ((ViewGroup) ((BaseSdkSplashATView) this).f1292v.getParent()).addView(this.f1776Q.getAdLogoView(), ((BaseSdkSplashATView) this).f1292v.getLayoutParams());
    }

    /* JADX INFO: renamed from: q */
    private void m1070q() {
        RelativeLayout.LayoutParams layoutParams;
        Context context;
        float f;
        BaseAd baseAd;
        FrameLayout frameLayout = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_ad_lable_area", "id"));
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            this.f1174p.add(frameLayout);
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_ad_content_image_area", "id"));
        if (frameLayout2 != null && (baseAd = this.f1776Q) != null && baseAd.getAdMediaView(new Object[0]) != null) {
            View adMediaView = this.f1776Q.getAdMediaView(new Object[0]);
            if (adMediaView.getParent() != null) {
                ((ViewGroup) adMediaView.getParent()).removeView(adMediaView);
            }
            frameLayout2.addView(adMediaView, new FrameLayout.LayoutParams(-1, -1));
        }
        RoundImageView roundImageView = (RoundImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_icon", "id"));
        if (roundImageView != null && this.f1776Q.getAdIconView() != null && roundImageView.getParent() != null && (roundImageView.getParent() instanceof ViewGroup)) {
            TextView textView = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_ad_title", "id"));
            if (textView != null) {
                textView.setGravity(3);
            }
            TextView textView2 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_desc", "id"));
            if (textView2 != null) {
                textView2.setGravity(3);
            }
            roundImageView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams2 = roundImageView.getLayoutParams();
            layoutParams2.width = layoutParams2.height;
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                if (this.f1160b.f4333n.m3381w() == 2) {
                    layoutParams = (RelativeLayout.LayoutParams) layoutParams2;
                    context = getContext();
                    f = 18.0f;
                } else {
                    layoutParams = (RelativeLayout.LayoutParams) layoutParams2;
                    context = getContext();
                    f = 12.0f;
                }
                layoutParams.rightMargin = C1345i.m4153a(context, f);
            }
            roundImageView.setLayoutParams(layoutParams2);
            ((ViewGroup) roundImageView.getParent()).addView(this.f1776Q.getAdIconView(), roundImageView.getLayoutParams());
        }
        if (((BaseSdkSplashATView) this).f1292v == null || this.f1776Q.getAdLogoView() == null || ((BaseSdkSplashATView) this).f1292v.getParent() == null || !(((BaseSdkSplashATView) this).f1292v.getParent() instanceof ViewGroup)) {
            return;
        }
        ((BaseSdkSplashATView) this).f1292v.setVisibility(0);
        ((ViewGroup) ((BaseSdkSplashATView) this).f1292v.getParent()).addView(this.f1776Q.getAdLogoView(), ((BaseSdkSplashATView) this).f1292v.getLayoutParams());
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final float mo698a(InterfaceC0958a interfaceC0958a, int i) {
        return 1.0f;
    }

    @Override // com.anythink.basead.p025ui.AsseblemSplashATView, com.anythink.basead.p025ui.BaseSdkSplashATView
    /* JADX INFO: renamed from: c */
    public final void mo671c() {
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: k */
    public final boolean mo713k() {
        return false;
    }

    @Override // com.anythink.basead.p025ui.BaseSdkSplashATView
    /* JADX INFO: renamed from: o */
    public final void mo817o() {
        super.mo817o();
    }

    @Override // com.anythink.basead.p025ui.BaseSdkSplashATView, com.anythink.basead.p025ui.BaseSplashATView
    /* JADX INFO: renamed from: p */
    public final void mo818p() {
    }

    public void registerNativeClickListener(View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 85;
        layoutParams.bottomMargin = C1345i.m4153a(getContext(), 5.0f);
        layoutParams.rightMargin = C1345i.m4153a(getContext(), 12.0f);
        if (this.f1776Q != null) {
            if (this.f1160b.f4333n.m3251D() == 0) {
                this.f1174p.add(this);
                this.f1776Q.registerListener(view, this.f1174p, layoutParams);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f1177s);
                this.f1776Q.registerListener(view, arrayList, layoutParams);
            }
        }
    }
}
