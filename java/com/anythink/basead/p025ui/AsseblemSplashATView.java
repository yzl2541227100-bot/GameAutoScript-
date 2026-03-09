package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.p010a.C0731d;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p025ui.p028c.InterfaceC0995a;
import com.anythink.basead.p025ui.p029d.C0996a;
import com.anythink.basead.p025ui.p029d.C0998c;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1339c;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p071ui.component.RoundImageView;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import p285z2.InterfaceC4047k3;

/* JADX INFO: loaded from: classes.dex */
public class AsseblemSplashATView extends BaseSdkSplashATView {
    public AsseblemSplashATView(Context context) {
        super(context);
    }

    public AsseblemSplashATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, InterfaceC0771a interfaceC0771a) {
        super(context, c1248m, abstractC1247l, interfaceC0771a);
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo669a() {
        LayoutInflater layoutInflaterFrom;
        Context context;
        String str;
        if (this.f1160b.f4333n.m3381w() == 2) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
            context = getContext();
            str = "myoffer_splash_ad_layout_asseblem_vertical_land";
        } else {
            layoutInflaterFrom = LayoutInflater.from(getContext());
            context = getContext();
            str = "myoffer_splash_ad_layout_asseblem_vertical_port";
        }
        View viewInflate = layoutInflaterFrom.inflate(C1345i.m4154a(context, str, "layout"), this);
        mo817o();
        C0996a c0996a = this.f1337L;
        if (c0996a != null) {
            c0996a.m1207a(-102).m1208a(new InterfaceC0995a() { // from class: com.anythink.basead.ui.AsseblemSplashATView.1
                @Override // com.anythink.basead.p025ui.p028c.InterfaceC0995a
                /* JADX INFO: renamed from: a */
                public final void mo672a(int i, int i2) {
                    AsseblemSplashATView.this.mo700a(i, i2);
                }
            }).m1210a(getContext(), viewInflate);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseSdkSplashATView
    /* JADX INFO: renamed from: b */
    public final void mo670b() {
        TextView textView = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_ad_title", "id"));
        TextView textView2 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_ad_install_btn", "id"));
        TextView textView3 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_desc", "id"));
        final FrameLayout frameLayout = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_ad_content_image_area", "id"));
        final RoundImageView roundImageView = (RoundImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_bg", "id"));
        final RoundImageView roundImageView2 = (RoundImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_icon", "id"));
        this.f1177s = textView2;
        if (TextUtils.isEmpty(this.f1161c.m3237x())) {
            C0998c.m1219a(roundImageView2);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) roundImageView2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.rightMargin = 0;
                roundImageView2.setLayoutParams(layoutParams);
            }
            if (textView != null) {
                textView.setGravity(17);
            }
            if (textView3 != null) {
                textView3.setGravity(17);
            }
        } else {
            roundImageView2.setVisibility(0);
            roundImageView2.setNeedRadiu(true);
            roundImageView2.setRadiusInDip(12);
            int i = roundImageView2.getLayoutParams().width;
            C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1161c.m3237x()), i, i, new C1378b.a() { // from class: com.anythink.basead.ui.AsseblemSplashATView.2
                @Override // com.anythink.core.common.res.C1378b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.C1378b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(str, AsseblemSplashATView.this.f1161c.m3237x())) {
                        roundImageView2.setImageBitmap(bitmap);
                    }
                }
            });
        }
        this.f1174p.add(roundImageView2);
        frameLayout.removeAllViews();
        final WrapRoundImageView wrapRoundImageView = new WrapRoundImageView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        wrapRoundImageView.setLayoutParams(layoutParams2);
        wrapRoundImageView.setNeedRadiu(false);
        wrapRoundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        wrapRoundImageView.setVisibility(4);
        frameLayout.addView(wrapRoundImageView, layoutParams2);
        frameLayout.setVisibility(0);
        roundImageView.setNeedRadiu(false);
        if (TextUtils.isEmpty(this.f1161c.m3239y())) {
            roundImageView.setBackgroundColor(Color.parseColor("#EFEFEF"));
        } else {
            C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1161c.m3239y()), getResources().getDisplayMetrics().widthPixels, (getResources().getDisplayMetrics().widthPixels * 627) / InterfaceC4047k3.Ooooooo, new C1378b.a() { // from class: com.anythink.basead.ui.AsseblemSplashATView.3
                @Override // com.anythink.core.common.res.C1378b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.C1378b.a
                public final void onSuccess(String str, final Bitmap bitmap) {
                    if (TextUtils.equals(str, AsseblemSplashATView.this.f1161c.m3239y())) {
                        frameLayout.post(new Runnable() { // from class: com.anythink.basead.ui.AsseblemSplashATView.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                C08053 c08053 = C08053.this;
                                wrapRoundImageView.setBitmapAndResize(bitmap, frameLayout.getWidth(), frameLayout.getHeight());
                                wrapRoundImageView.setVisibility(0);
                            }
                        });
                        C1339c.m4025a(AsseblemSplashATView.this.getContext(), bitmap, new C1339c.a() { // from class: com.anythink.basead.ui.AsseblemSplashATView.3.2
                            @Override // com.anythink.core.common.p066o.C1339c.a
                            /* JADX INFO: renamed from: a */
                            public final void mo673a() {
                            }

                            @Override // com.anythink.core.common.p066o.C1339c.a
                            /* JADX INFO: renamed from: a */
                            public final void mo674a(Bitmap bitmap2) {
                                roundImageView.setImageBitmap(bitmap2);
                            }
                        });
                    }
                }
            });
            this.f1174p.add(wrapRoundImageView);
        }
        if (TextUtils.isEmpty(this.f1161c.m3233v())) {
            textView.setVisibility(4);
        } else {
            textView.setText(this.f1161c.m3233v());
            textView.setVisibility(0);
        }
        this.f1174p.add(textView);
        if (TextUtils.isEmpty(this.f1161c.m3157A())) {
            textView2.setText(C0731d.m243a(getContext(), this.f1161c));
        } else {
            textView2.setText(this.f1161c.m3157A());
        }
        this.f1174p.add(textView2);
        if (textView3 != null) {
            if (TextUtils.isEmpty(this.f1161c.m3235w())) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(this.f1161c.m3235w());
            }
            this.f1174p.add(textView3);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseSdkSplashATView
    /* JADX INFO: renamed from: c */
    public void mo671c() {
        super.mo701a(this.f1160b.f4333n.m3287V() < 0 ? 100 : this.f1160b.f4333n.m3287V(), new Runnable() { // from class: com.anythink.basead.ui.AsseblemSplashATView.4
            @Override // java.lang.Runnable
            public final void run() {
                AsseblemSplashATView asseblemSplashATView = AsseblemSplashATView.this;
                if (asseblemSplashATView.f1333H == null) {
                    return;
                }
                AsseblemSplashATView.super.mo710h();
            }
        });
    }
}
