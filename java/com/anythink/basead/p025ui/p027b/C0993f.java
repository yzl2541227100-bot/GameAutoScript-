package com.anythink.basead.p025ui.p027b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.p010a.C0731d;
import com.anythink.basead.p025ui.BaseSdkSplashATView;
import com.anythink.basead.p025ui.BaseShakeView;
import com.anythink.basead.p025ui.ShakeBorderThumbView;
import com.anythink.basead.p025ui.ShakeThumbView;
import com.anythink.basead.p025ui.ShakeView;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.basead.p025ui.p027b.C0992e;
import com.anythink.core.api.ATSDKGlobalSetting;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.expressad.video.module.p172a.p173a.C2187m;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.ui.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0993f extends AbstractC0989b {

    /* JADX INFO: renamed from: i */
    public BaseShakeView f1998i;

    /* JADX INFO: renamed from: j */
    public BaseShakeView f1999j;

    /* JADX INFO: renamed from: p */
    private boolean f2005p = false;

    /* JADX INFO: renamed from: k */
    public final long f2000k = C2187m.f13871ag;

    /* JADX INFO: renamed from: l */
    public final long f2001l = 500;

    /* JADX INFO: renamed from: m */
    public boolean f2002m = false;

    /* JADX INFO: renamed from: n */
    public boolean f2003n = false;

    /* JADX INFO: renamed from: o */
    public boolean f2004o = false;

    /* JADX INFO: renamed from: a */
    private void m1186a(BaseShakeView baseShakeView) {
        baseShakeView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.b.f.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC0989b.a aVar = C0993f.this.f1984h;
                if (aVar != null) {
                    aVar.mo534a(1, 5);
                }
            }
        });
        baseShakeView.setOnShakeListener(new BaseShakeView.InterfaceC0852a() { // from class: com.anythink.basead.ui.b.f.3
            @Override // com.anythink.basead.p025ui.BaseShakeView.InterfaceC0852a
            /* JADX INFO: renamed from: a */
            public final boolean mo827a() {
                if (!C0993f.this.m1193b()) {
                    return false;
                }
                AbstractC0989b.a aVar = C0993f.this.f1984h;
                if (aVar == null) {
                    return true;
                }
                aVar.mo534a(4, 5);
                return true;
            }
        }, this.f1979c.f4333n);
    }

    /* JADX INFO: renamed from: c */
    private void m1188c() {
        View view = this.f1983g;
        int iIndexOfChild = (view == null || this.f1980d.indexOfChild(view) <= 0) ? -1 : this.f1980d.indexOfChild(this.f1983g);
        if (this.f1981e == 3) {
            BaseShakeView baseShakeView = this.f1998i;
            if (baseShakeView != null) {
                C1360x.m4265a(baseShakeView);
                this.f1998i.setVisibility(0);
                this.f1980d.addView(this.f1998i, iIndexOfChild);
                return;
            }
            return;
        }
        RelativeLayout relativeLayout = null;
        try {
            relativeLayout = (RelativeLayout) this.f1980d.findViewById(C1345i.m4154a(this.f1977a, "myoffer_end_card_id", "id"));
        } catch (Throwable unused) {
        }
        BaseShakeView baseShakeView2 = this.f1998i;
        if (baseShakeView2 != null) {
            C1360x.m4265a(baseShakeView2);
            this.f1998i.setVisibility(8);
            if (relativeLayout != null) {
                relativeLayout.addView(this.f1998i);
            } else {
                this.f1980d.addView(this.f1998i, iIndexOfChild);
            }
        }
        BaseShakeView baseShakeView3 = this.f1999j;
        if (baseShakeView3 != null) {
            C1360x.m4265a(baseShakeView3);
            this.f1999j.setVisibility(8);
            if (relativeLayout != null) {
                relativeLayout.addView(this.f1999j);
            } else {
                this.f1980d.addView(this.f1999j, iIndexOfChild);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m1189d() {
        if (this.f1998i == null || this.f1999j == null || this.f2005p || !m1192g()) {
            return;
        }
        this.f2005p = true;
        this.f1998i.setVisibility(0);
        this.f1998i.postDelayed(new Runnable() { // from class: com.anythink.basead.ui.b.f.1
            @Override // java.lang.Runnable
            public final void run() {
                if (C0993f.this.m1192g()) {
                    try {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.2f);
                        valueAnimatorOfFloat.setDuration(500L);
                        valueAnimatorOfFloat.setRepeatCount(1);
                        valueAnimatorOfFloat.setRepeatMode(2);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.b.f.1.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                if (C0993f.this.f1998i.getVisibility() == 0) {
                                    C0993f.this.f1998i.setAlpha(fFloatValue);
                                }
                                BaseShakeView baseShakeView = C0993f.this.f1999j;
                                if (baseShakeView == null || baseShakeView.getVisibility() != 0) {
                                    return;
                                }
                                C0993f.this.f1999j.setAlpha(fFloatValue);
                            }
                        });
                        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.anythink.basead.ui.b.f.1.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationRepeat(Animator animator) {
                                super.onAnimationRepeat(animator);
                                C0993f.this.f1998i.setVisibility(8);
                                C0993f c0993f = C0993f.this;
                                if (c0993f.f1999j == null || !c0993f.m1192g()) {
                                    return;
                                }
                                C0993f.this.f1999j.setAlpha(0.2f);
                                C0993f.this.f1999j.setVisibility(0);
                            }
                        });
                        valueAnimatorOfFloat.start();
                    } catch (Throwable unused) {
                        C0993f.this.f1998i.setVisibility(8);
                        C0993f c0993f = C0993f.this;
                        if (c0993f.f1999j == null || !c0993f.m1192g()) {
                            return;
                        }
                        C0993f.this.f1999j.setVisibility(0);
                    }
                }
            }
        }, C2187m.f13871ag);
    }

    /* JADX INFO: renamed from: e */
    private void m1190e() {
        m1191f();
        if (this.f1999j == null || this.f1981e != 1 || C0731d.m246b(this.f1978b) || C0731d.m244a(this.f1978b) || this.f1979c.f4333n.m3251D() != 0) {
            return;
        }
        this.f1999j.setAlpha(1.0f);
        this.f1999j.setVisibility(0);
    }

    /* JADX INFO: renamed from: f */
    private void m1191f() {
        BaseShakeView baseShakeView = this.f1998i;
        if (baseShakeView != null) {
            baseShakeView.setVisibility(8);
        }
        BaseShakeView baseShakeView2 = this.f1999j;
        if (baseShakeView2 != null) {
            baseShakeView2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public boolean m1192g() {
        return (this.f1981e == 1 && C0731d.m245a(this.f1978b, this.f1979c) && this.f2002m) ? false : true;
    }

    @Override // com.anythink.basead.p025ui.p027b.AbstractC0989b
    /* JADX INFO: renamed from: a */
    public final void mo1180a() {
    }

    @Override // com.anythink.basead.p025ui.p027b.AbstractC0989b
    /* JADX INFO: renamed from: a */
    public final void mo1181a(int i, Map<String, Object> map) {
        boolean z = false;
        if (i == 102) {
            this.f2002m = true;
            if (this.f1981e == 1 && C0731d.m245a(this.f1978b, this.f1979c)) {
                m1191f();
                if (this.f1999j == null || this.f1981e != 1 || C0731d.m246b(this.f1978b) || C0731d.m244a(this.f1978b) || this.f1979c.f4333n.m3251D() != 0) {
                    return;
                }
                this.f1999j.setAlpha(1.0f);
                this.f1999j.setVisibility(0);
                return;
            }
            return;
        }
        if (i == 105) {
            m1191f();
            return;
        }
        if (i == 106) {
            if (this.f1981e == 3 && C0731d.m246b(this.f1978b)) {
                m1188c();
                return;
            }
            return;
        }
        if (i == 110) {
            this.f2003n = true;
            return;
        }
        if (i == 111) {
            this.f2003n = false;
            return;
        }
        switch (i) {
            case 114:
                if (this.f1981e == 1) {
                    m1188c();
                    m1189d();
                }
                if (map != null) {
                    Object obj = map.get(C0992e.a.f1997a);
                    if ((obj instanceof Integer) && ((Integer) obj).intValue() == 1) {
                        z = true;
                    }
                }
                if (z || (this.f1981e == 2 && !C0731d.m244a(this.f1978b))) {
                    m1188c();
                    m1189d();
                }
                break;
            case 115:
                this.f2004o = true;
                break;
            case 116:
                if (this.f1981e == 3 && !C0731d.m246b(this.f1978b)) {
                    m1188c();
                    break;
                }
                break;
        }
    }

    @Override // com.anythink.basead.p025ui.p027b.AbstractC0989b
    /* JADX INFO: renamed from: a */
    public final void mo1182a(Context context, AbstractC1247l abstractC1247l, C1248m c1248m, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, AbstractC0989b.a aVar) {
        ShakeBorderThumbView shakeBorderThumbView;
        BaseShakeView baseShakeView;
        int iM4153a;
        BaseShakeView baseShakeView2;
        super.mo1182a(context, abstractC1247l, c1248m, viewGroup, relativeLayout, view, i, aVar);
        boolean z = true;
        if (this.f1981e != 3) {
            this.f1998i = new ShakeThumbView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f1998i.setLayoutParams(layoutParams);
            this.f1999j = new ShakeBorderThumbView(context);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(11);
            if (i == 1 && C1341e.m4068g(context) == 2) {
                layoutParams2.addRule(12);
                layoutParams2.setMargins(0, 0, 0, C1345i.m4153a(context, 192.0f));
            } else {
                layoutParams2.addRule(15);
            }
            this.f1999j.setLayoutParams(layoutParams2);
            m1186a(this.f1998i);
            baseShakeView2 = this.f1999j;
        } else {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            if ((this.f1979c.f4333n.m3314ao() != 1 || TextUtils.isEmpty(this.f1979c.f4333n.m3316aq())) && !this.f1979c.f4333n.m3301ab() && !this.f1979c.f4333n.m3311al()) {
                z = false;
            }
            if (this.f1978b.m3210k()) {
                if (z) {
                    shakeBorderThumbView = new ShakeBorderThumbView(context);
                    this.f1998i = shakeBorderThumbView;
                    layoutParams3.addRule(11);
                    layoutParams3.addRule(15);
                    this.f1998i.setLayoutParams(layoutParams3);
                    baseShakeView2 = this.f1998i;
                } else {
                    this.f1998i = new ShakeThumbView(context);
                    layoutParams3.addRule(13);
                    baseShakeView = this.f1998i;
                    iM4153a = C1345i.m4153a(context, 26.0f);
                    baseShakeView.setPadding(0, 0, 0, iM4153a);
                    this.f1998i.setLayoutParams(layoutParams3);
                    baseShakeView2 = this.f1998i;
                }
            } else if (BaseSdkSplashATView.isSinglePicture(this.f1978b, this.f1979c.f4333n)) {
                this.f1998i = new ShakeView(context);
                layoutParams3.addRule(14);
                layoutParams3.addRule(12);
                int iM4153a2 = C1345i.m4153a(context, this.f1979c.f4333n.m3381w() == 2 ? 46.0f : 63.0f);
                if (this.f1979c.f4333n.m3311al()) {
                    iM4153a2 = C1345i.m4153a(context, 100.0f);
                }
                ((ShakeView) this.f1998i).setNeedHideShakeIcon(z);
                layoutParams3.setMargins(0, 0, 0, iM4153a2);
                if (abstractC1247l.mo2426d() == 4) {
                    String directlySplashAdShakeIconString = ATSDKGlobalSetting.getDirectlySplashAdShakeIconString();
                    if (!TextUtils.isEmpty(directlySplashAdShakeIconString)) {
                        ((ShakeView) this.f1998i).setShakeHintText(directlySplashAdShakeIconString);
                    }
                }
                this.f1998i.setLayoutParams(layoutParams3);
                baseShakeView2 = this.f1998i;
            } else if (z) {
                shakeBorderThumbView = new ShakeBorderThumbView(context);
                this.f1998i = shakeBorderThumbView;
                layoutParams3.addRule(11);
                layoutParams3.addRule(15);
                this.f1998i.setLayoutParams(layoutParams3);
                baseShakeView2 = this.f1998i;
            } else {
                this.f1998i = new ShakeThumbView(context);
                layoutParams3.addRule(13);
                if (this.f1979c.f4333n.m3381w() == 2) {
                    baseShakeView = this.f1998i;
                    iM4153a = C1345i.m4153a(context, 26.0f);
                } else {
                    baseShakeView = this.f1998i;
                    iM4153a = C1345i.m4153a(context, 92.0f);
                }
                baseShakeView.setPadding(0, 0, 0, iM4153a);
                this.f1998i.setLayoutParams(layoutParams3);
                baseShakeView2 = this.f1998i;
            }
        }
        m1186a(baseShakeView2);
        BaseShakeView baseShakeView3 = this.f1998i;
        if (baseShakeView3 != null) {
            baseShakeView3.setShakeSetting(this.f1979c.f4333n);
        }
        BaseShakeView baseShakeView4 = this.f1999j;
        if (baseShakeView4 != null) {
            baseShakeView4.setShakeSetting(this.f1979c.f4333n);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1193b() {
        int i = this.f1981e;
        if (i == 3 || !this.f2003n) {
            return i == 3 && !this.f2004o;
        }
        return true;
    }
}
