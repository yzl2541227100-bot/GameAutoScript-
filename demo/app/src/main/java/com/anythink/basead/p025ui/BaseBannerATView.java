package com.anythink.basead.p025ui;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p025ui.p028c.InterfaceC0995a;
import com.anythink.basead.p025ui.p029d.C0997b;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseBannerATView extends BaseATView {
    public final String TAG;

    /* JADX INFO: renamed from: v */
    public InterfaceC0771a f1211v;

    /* JADX INFO: renamed from: w */
    public CloseImageView f1212w;

    /* JADX INFO: renamed from: x */
    public View f1213x;

    /* JADX INFO: renamed from: y */
    private C0997b f1214y;

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseBannerATView$1 */
    public class C08151 implements InterfaceC0995a {
        public C08151() {
        }

        @Override // com.anythink.basead.p025ui.p028c.InterfaceC0995a
        /* JADX INFO: renamed from: a */
        public final void mo672a(int i, int i2) {
            BaseBannerATView.this.mo700a(i, i2);
        }
    }

    public BaseBannerATView(Context context) {
        super(context);
        this.TAG = getClass().getSimpleName();
    }

    public BaseBannerATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, InterfaceC0771a interfaceC0771a) {
        super(context, c1248m, abstractC1247l);
        this.TAG = getClass().getSimpleName();
        this.f1211v = interfaceC0771a;
        if (c1248m != null) {
            if (abstractC1247l == null || !abstractC1247l.mo2424P()) {
                AbstractC1249n abstractC1249n = c1248m.f4333n;
                if (abstractC1249n != null && abstractC1249n.m3312am()) {
                    C0997b c0997b = new C0997b();
                    this.f1214y = c0997b;
                    c0997b.m1216a(true).m1215a(new C08151());
                } else {
                    C0997b c0997b2 = this.f1214y;
                    if (c0997b2 != null) {
                        c0997b2.m1216a(false);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m718a(C1248m c1248m, AbstractC1247l abstractC1247l) {
        if (c1248m != null) {
            if (abstractC1247l == null || !abstractC1247l.mo2424P()) {
                AbstractC1249n abstractC1249n = c1248m.f4333n;
                if (abstractC1249n != null && abstractC1249n.m3312am()) {
                    C0997b c0997b = new C0997b();
                    this.f1214y = c0997b;
                    c0997b.m1216a(true).m1215a(new C08151());
                } else {
                    C0997b c0997b2 = this.f1214y;
                    if (c0997b2 != null) {
                        c0997b2.m1216a(false);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private boolean m719o() {
        if (this.f1213x == null) {
            this.f1213x = findViewById(C1345i.m4154a(getContext(), "myoffer_guide2click_container", "id"));
        }
        View view = this.f1213x;
        return view != null && view.getVisibility() == 0;
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo700a(int i, int i2) {
        super.mo700a(i, i2);
        mo698a(this.f1212w, this.f1160b.f4333n.m3361m());
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo703a(C0779i c0779i) {
        InterfaceC0771a interfaceC0771a = this.f1211v;
        if (interfaceC0771a != null) {
            interfaceC0771a.onAdClick(c0779i);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo704a(boolean z) {
        InterfaceC0771a interfaceC0771a = this.f1211v;
        if (interfaceC0771a != null) {
            interfaceC0771a.onDeeplinkCallback(z);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo720b() {
        mo701a(this.f1160b.f4333n.m3287V() < 0 ? 100 : this.f1160b.f4333n.m3287V(), new Runnable() { // from class: com.anythink.basead.ui.BaseBannerATView.2
            @Override // java.lang.Runnable
            public final void run() {
                BaseBannerATView.super.mo710h();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void mo721c() {
        this.f1212w.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseBannerATView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC0771a interfaceC0771a = BaseBannerATView.this.f1211v;
                if (interfaceC0771a != null) {
                    interfaceC0771a.onAdClosed();
                }
            }
        });
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: e */
    public final void mo707e() {
        InterfaceC0771a interfaceC0771a = this.f1211v;
        if (interfaceC0771a != null) {
            interfaceC0771a.onAdShow(new C0779i());
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: m */
    public final RelativeLayout.LayoutParams mo715m() {
        int measuredHeight = getMeasuredHeight() - C1345i.m4153a(getContext(), 12.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.setMargins(0, measuredHeight, 0, 0);
        return layoutParams;
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: n */
    public final int mo716n() {
        return 4;
    }

    @Override // com.anythink.basead.p025ui.BaseATView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0997b c0997b;
        return (m719o() || (c0997b = this.f1214y) == null) ? super.onInterceptTouchEvent(motionEvent) : c0997b.m1217a(motionEvent);
    }

    @Override // com.anythink.basead.p025ui.BaseATView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0997b c0997b;
        return (m719o() || (c0997b = this.f1214y) == null) ? super.onTouchEvent(motionEvent) : c0997b.m1218a(this, motionEvent);
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (Build.VERSION.SDK_INT >= 24) {
            if (z) {
                m699a(110);
            } else {
                m699a(111);
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (Build.VERSION.SDK_INT < 24) {
            if (i == 0) {
                m699a(110);
            } else {
                m699a(111);
            }
        }
    }
}
