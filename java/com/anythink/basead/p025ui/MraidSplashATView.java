package com.anythink.basead.p025ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p025ui.MraidContainerView;
import com.anythink.basead.p025ui.p026a.C0959a;
import com.anythink.basead.p025ui.p028c.InterfaceC0995a;
import com.anythink.basead.p025ui.p029d.C0996a;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;

/* JADX INFO: loaded from: classes.dex */
public class MraidSplashATView extends BaseSplashATView {

    /* JADX INFO: renamed from: v */
    public MraidContainerView f1534v;

    /* JADX INFO: renamed from: w */
    public boolean f1535w;

    /* JADX INFO: renamed from: com.anythink.basead.ui.MraidSplashATView$2 */
    public class C08962 implements MraidContainerView.InterfaceC0889a {
        public C08962() {
        }

        @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
        /* JADX INFO: renamed from: a */
        public final void mo890a() {
            try {
                MraidSplashATView.m912a(MraidSplashATView.this);
            } catch (Throwable unused) {
            }
        }

        @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
        /* JADX INFO: renamed from: a */
        public final void mo891a(String str) {
            MraidSplashATView.this.f1161c.m3236w(str);
            MraidSplashATView.this.mo700a(1, 13);
        }

        @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
        /* JADX INFO: renamed from: b */
        public final void mo892b() {
            MraidSplashATView.this.m699a(106);
            MraidSplashATView.this.mo818p();
        }

        @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
        /* JADX INFO: renamed from: c */
        public final void mo893c() {
            MraidSplashATView.this.m839a(C0748f.m310a(C0748f.f729k, C0748f.f718Q));
            MraidSplashATView.this.m840a(true, 5);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.MraidSplashATView$3 */
    public class ViewTreeObserverOnGlobalLayoutListenerC08973 implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserver f1538a;

        public ViewTreeObserverOnGlobalLayoutListenerC08973(ViewTreeObserver viewTreeObserver) {
            this.f1538a = viewTreeObserver;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            try {
                MraidSplashATView mraidSplashATView = MraidSplashATView.this;
                if (!mraidSplashATView.f1535w) {
                    mraidSplashATView.f1535w = true;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mraidSplashATView.f1534v.getLayoutParams();
                    layoutParams.width = C1345i.m4153a(C1175n.m2059a().m2148f(), MraidSplashATView.this.f1161c.m3196g());
                    layoutParams.height = C1345i.m4153a(C1175n.m2059a().m2148f(), MraidSplashATView.this.f1161c.m3199h());
                    int width = MraidSplashATView.this.getWidth();
                    int height = MraidSplashATView.this.getHeight();
                    float fM3196g = MraidSplashATView.this.f1161c.m3196g() / (MraidSplashATView.this.f1161c.m3199h() * 1.0f);
                    layoutParams.width = Math.min(width, layoutParams.width);
                    int iMin = Math.min(height, layoutParams.height);
                    layoutParams.height = iMin;
                    int i = layoutParams.width;
                    float f = i / (iMin * 1.0f);
                    if (f > fM3196g) {
                        layoutParams.width = (int) (iMin * fM3196g);
                    } else if (f < fM3196g) {
                        layoutParams.height = (int) (i / fM3196g);
                    }
                    layoutParams.gravity = 17;
                }
                this.f1538a.removeGlobalOnLayoutListener(this);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.MraidSplashATView$4 */
    public class RunnableC08984 implements Runnable {
        public RunnableC08984() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MraidSplashATView mraidSplashATView = MraidSplashATView.this;
            if (mraidSplashATView.f1333H == null) {
                return;
            }
            MraidSplashATView.super.mo710h();
        }
    }

    public MraidSplashATView(Context context) {
        super(context);
    }

    public MraidSplashATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, InterfaceC0771a interfaceC0771a) {
        super(context, c1248m, abstractC1247l, interfaceC0771a);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m912a(MraidSplashATView mraidSplashATView) {
        if (mraidSplashATView.f1161c.m3210k() && mraidSplashATView.f1534v == null) {
            return;
        }
        super.mo701a(mraidSplashATView.f1160b.f4333n.m3287V() < 0 ? 100 : mraidSplashATView.f1160b.f4333n.m3287V(), mraidSplashATView.new RunnableC08984());
    }

    /* JADX INFO: renamed from: b */
    private void m914b() {
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f1161c, this.f1160b, new C08962());
        this.f1534v = mraidContainerView;
        mraidContainerView.setNeedRegisterVolumeChangeReceiver(true);
        this.f1534v.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_web", "id"));
        if (this.f1161c.m3196g() > 0 && this.f1161c.m3199h() > 0) {
            ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC08973(viewTreeObserver));
            if (frameLayout != null) {
                frameLayout.setBackgroundDrawable(new C0959a());
            }
        }
        if (frameLayout != null) {
            this.f1534v.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(this.f1534v);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m916c() {
        if (this.f1161c.m3210k() && this.f1534v == null) {
            return;
        }
        super.mo701a(this.f1160b.f4333n.m3287V() < 0 ? 100 : this.f1160b.f4333n.m3287V(), new RunnableC08984());
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo669a() {
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_web_splash_ad_layout", "layout"), this);
        C0996a c0996a = this.f1337L;
        if (c0996a != null) {
            c0996a.m1207a(-102).m1208a(new InterfaceC0995a() { // from class: com.anythink.basead.ui.MraidSplashATView.1
                @Override // com.anythink.basead.p025ui.p028c.InterfaceC0995a
                /* JADX INFO: renamed from: a */
                public final void mo672a(int i, int i2) {
                    MraidSplashATView.this.mo700a(i, i2);
                }
            }).m1210a(getContext(), this);
        }
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f1161c, this.f1160b, new C08962());
        this.f1534v = mraidContainerView;
        mraidContainerView.setNeedRegisterVolumeChangeReceiver(true);
        this.f1534v.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_web", "id"));
        if (this.f1161c.m3196g() > 0 && this.f1161c.m3199h() > 0) {
            ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC08973(viewTreeObserver));
            if (frameLayout != null) {
                frameLayout.setBackgroundDrawable(new C0959a());
            }
        }
        if (frameLayout != null) {
            this.f1534v.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(this.f1534v);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseSplashATView, com.anythink.basead.p025ui.BaseATView
    public void destroy() {
        super.destroy();
        MraidContainerView mraidContainerView = this.f1534v;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        MraidContainerView mraidContainerView = this.f1534v;
        if (mraidContainerView != null) {
            mraidContainerView.fireMraidIsViewable(z);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseSplashATView
    /* JADX INFO: renamed from: p */
    public final void mo818p() {
        int size = this.f1174p.size();
        for (int i = 0; i < size; i++) {
            View view = this.f1174p.get(i);
            if (view != null) {
                view.setOnClickListener(this.f1336K);
            }
        }
    }
}
