package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p025ui.p029d.C0996a;
import com.anythink.core.api.ATSDKGlobalSetting;
import com.anythink.core.common.p050a.C1150b;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.core.common.p066o.p067a.C1332f;
import com.anythink.expressad.exoplayer.C1575f;
import com.anythink.expressad.foundation.p138h.C1875i;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseSplashATView extends BaseATView {

    /* JADX INFO: renamed from: C */
    public TextView f1328C;

    /* JADX INFO: renamed from: D */
    public CloseFrameLayout f1329D;

    /* JADX INFO: renamed from: E */
    public String f1330E;

    /* JADX INFO: renamed from: F */
    public Timer f1331F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f1332G;

    /* JADX INFO: renamed from: H */
    public InterfaceC0771a f1333H;

    /* JADX INFO: renamed from: I */
    public C0987b f1334I;

    /* JADX INFO: renamed from: J */
    public final long f1335J;

    /* JADX INFO: renamed from: K */
    public final View.OnClickListener f1336K;

    /* JADX INFO: renamed from: L */
    public C0996a f1337L;

    /* JADX INFO: renamed from: M */
    public boolean f1338M;

    /* JADX INFO: renamed from: N */
    public boolean f1339N;

    /* JADX INFO: renamed from: O */
    public boolean f1340O;

    /* JADX INFO: renamed from: P */
    public boolean f1341P;

    /* JADX INFO: renamed from: v */
    private C1332f.b f1342v;

    /* JADX INFO: renamed from: w */
    private long f1343w;

    /* JADX INFO: renamed from: x */
    private Map<String, Object> f1344x;

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseSplashATView$2 */
    public class ViewOnClickListenerC08542 implements View.OnClickListener {
        public ViewOnClickListenerC08542() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (BaseSplashATView.this.f1160b.f4333n.m3379v() == 0 || BaseSplashATView.this.f1340O) {
                BaseSplashATView.this.m840a(true, 1);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseSplashATView$3 */
    public class C08553 extends TimerTask {
        public C08553() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            BaseSplashATView baseSplashATView = BaseSplashATView.this;
            if (C1360x.m4269a(baseSplashATView, baseSplashATView.f1342v)) {
                BaseSplashATView.this.post(new Runnable() { // from class: com.anythink.basead.ui.BaseSplashATView.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        long j = BaseSplashATView.this.f1343w;
                        BaseSplashATView baseSplashATView2 = BaseSplashATView.this;
                        if (j <= 0) {
                            BaseSplashATView.m837e(baseSplashATView2);
                        } else {
                            baseSplashATView2.m828a(baseSplashATView2.f1343w);
                        }
                        BaseSplashATView.this.f1343w -= 1000;
                    }
                });
            }
        }
    }

    public BaseSplashATView(Context context) {
        super(context);
        this.f1330E = "Skip";
        this.f1335J = 1000L;
        this.f1343w = C1575f.f8394a;
        this.f1336K = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSplashATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashATView baseSplashATView = BaseSplashATView.this;
                View view2 = baseSplashATView.f1177s;
                if (view2 == null || view2 != view) {
                    BaseSplashATView.super.mo700a(1, 2);
                } else {
                    BaseSplashATView.super.mo700a(1, 1);
                }
            }
        };
        this.f1338M = false;
        this.f1339N = false;
        this.f1340O = false;
    }

    public BaseSplashATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, InterfaceC0771a interfaceC0771a) {
        super(context, c1248m, abstractC1247l);
        this.f1330E = "Skip";
        this.f1335J = 1000L;
        this.f1343w = C1575f.f8394a;
        this.f1336K = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSplashATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashATView baseSplashATView = BaseSplashATView.this;
                View view2 = baseSplashATView.f1177s;
                if (view2 == null || view2 != view) {
                    BaseSplashATView.super.mo700a(1, 2);
                } else {
                    BaseSplashATView.super.mo700a(1, 1);
                }
            }
        };
        this.f1338M = false;
        this.f1339N = false;
        this.f1340O = false;
        this.f1342v = new C1332f.b();
        this.f1333H = interfaceC0771a;
        this.f1330E = getResources().getString(C1345i.m4154a(getContext(), "myoffer_splash_skip_text", C1875i.f11532g));
        this.f1328C = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_skip", "id"));
        this.f1329D = (CloseFrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_skip_area", "id"));
        this.f1343w = this.f1160b.f4333n.m3375t();
        this.f1332G = false;
        mo698a(this.f1329D, this.f1160b.f4333n.m3363n());
        if (abstractC1247l.mo2426d() == 4) {
            try {
                TextView textView = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_ad_install_btn", "id"));
                Drawable directlySplashAdCTAButtongBgDrawable = ATSDKGlobalSetting.getDirectlySplashAdCTAButtongBgDrawable();
                if (textView != null) {
                    if (directlySplashAdCTAButtongBgDrawable != null) {
                        textView.setBackgroundDrawable(directlySplashAdCTAButtongBgDrawable);
                    } else {
                        textView.setBackgroundResource(C1345i.m4154a(getContext(), "myoffer_splash_bg_rectangle_btn_cta_directly_asseblem", C1875i.f11528c));
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m828a(long j) {
        TextView textView;
        StringBuilder sb;
        String str;
        if (this.f1160b.f4333n.m3379v() == 0) {
            textView = this.f1328C;
            sb = new StringBuilder();
            sb.append(j / 1000);
            sb.append("s | ");
            str = this.f1330E;
        } else {
            textView = this.f1328C;
            sb = new StringBuilder();
            sb.append(j / 1000);
            str = " s";
        }
        sb.append(str);
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    private void m832b() {
        if (this.f1339N) {
            return;
        }
        this.f1339N = true;
        if (this.f1341P) {
            return;
        }
        this.f1329D.setVisibility(0);
        this.f1329D.setOnClickListener(new ViewOnClickListenerC08542());
        this.f1340O = false;
        Timer timer = new Timer();
        this.f1331F = timer;
        timer.schedule(new C08553(), 1000L, 1000L);
        m828a(this.f1343w);
        this.f1343w -= 1000;
    }

    /* JADX INFO: renamed from: c */
    private void m835c() {
        this.f1329D.setVisibility(0);
        this.f1329D.setOnClickListener(new ViewOnClickListenerC08542());
        this.f1340O = false;
        Timer timer = new Timer();
        this.f1331F = timer;
        timer.schedule(new C08553(), 1000L, 1000L);
        m828a(this.f1343w);
        this.f1343w -= 1000;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m837e(BaseSplashATView baseSplashATView) {
        baseSplashATView.m840a(true, 2);
        baseSplashATView.f1328C.setText(baseSplashATView.f1330E);
        baseSplashATView.f1340O = true;
    }

    /* JADX INFO: renamed from: o */
    private void m838o() {
        m840a(true, 2);
        this.f1328C.setText(this.f1330E);
        this.f1340O = true;
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo700a(int i, int i2) {
        super.mo700a(i, i2);
        mo698a(this.f1329D, this.f1160b.f4333n.m3361m());
    }

    /* JADX INFO: renamed from: a */
    public final void m839a(C0747e c0747e) {
        if (this.f1338M) {
            return;
        }
        this.f1338M = true;
        InterfaceC0771a interfaceC0771a = this.f1333H;
        if (interfaceC0771a != null) {
            interfaceC0771a.onShowFailed(c0747e);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo703a(C0779i c0779i) {
        InterfaceC0771a interfaceC0771a = this.f1333H;
        if (interfaceC0771a != null) {
            interfaceC0771a.onAdClick(c0779i);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo704a(boolean z) {
        InterfaceC0771a interfaceC0771a = this.f1333H;
        if (interfaceC0771a != null) {
            interfaceC0771a.onDeeplinkCallback(z);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m840a(boolean z, int i) {
        Timer timer = this.f1331F;
        if (timer != null) {
            timer.cancel();
        }
        this.f1331F = null;
        if (this.f1332G) {
            return;
        }
        this.f1332G = true;
        m699a(115);
        if (!this.f1338M) {
            m839a(C0748f.m310a(C0748f.f729k, "SplashView not showing on screen."));
        }
        Map<String, Object> map = this.f1344x;
        if (map != null) {
            map.put(C1150b.b.f2927a, Integer.valueOf(i));
            this.f1344x.put(C1150b.b.f2928b, Boolean.valueOf(z));
        }
        InterfaceC0771a interfaceC0771a = this.f1333H;
        if (interfaceC0771a != null) {
            interfaceC0771a.onAdClosed();
        }
    }

    public void checkSkipViewLocation() {
        try {
            ViewGroup.LayoutParams layoutParams = this.f1328C.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                int iM4165b = ((FrameLayout.LayoutParams) layoutParams).topMargin + C1345i.m4165b(getContext());
                int[] iArr = new int[2];
                this.f1328C.getLocationOnScreen(iArr);
                if (iArr[1] < iM4165b) {
                    int i = iM4165b - iArr[1];
                    ViewParent parent = this.f1328C.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).setPadding(((ViewGroup) parent).getPaddingLeft(), ((ViewGroup) parent).getPaddingTop() + i, ((ViewGroup) parent).getPaddingRight(), ((ViewGroup) parent).getPaddingBottom());
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: d */
    public final void mo706d() {
        super.mo706d();
        C1248m c1248m = this.f1160b;
        if (c1248m != null) {
            this.f1337L = new C0996a(this.f1161c, c1248m.f4333n);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    public void destroy() {
        super.destroy();
        this.f1333H = null;
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: e */
    public final void mo707e() {
        this.f1338M = true;
        InterfaceC0771a interfaceC0771a = this.f1333H;
        if (interfaceC0771a != null) {
            interfaceC0771a.onAdShow(new C0779i());
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: f */
    public final void mo708f() {
        if (this.f1161c instanceof AbstractC1217aj) {
            if (this.f1334I == null) {
                this.f1334I = new C0987b(this);
            }
            this.f1334I.m1169b();
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: g */
    public final void mo709g() {
        if (!(this.f1161c instanceof AbstractC1217aj) || this.f1334I == null) {
            return;
        }
        post(new Runnable() { // from class: com.anythink.basead.ui.BaseSplashATView.4
            @Override // java.lang.Runnable
            public final void run() {
                BaseSplashATView.this.f1334I.m1170c();
            }
        });
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: m */
    public final RelativeLayout.LayoutParams mo715m() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.f1160b.f4333n.m3381w() == 2) {
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.setMargins(0, 0, 0, C1345i.m4153a(getContext(), 154.0f));
        } else {
            int measuredHeight = (getMeasuredHeight() * 2) / 3;
            layoutParams.addRule(11);
            layoutParams.setMargins(0, measuredHeight, 0, 0);
        }
        return layoutParams;
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: n */
    public final int mo716n() {
        return 3;
    }

    @Override // com.anythink.basead.p025ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.anythink.basead.p025ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m840a(false, 3);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkSkipViewLocation();
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
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (Build.VERSION.SDK_INT < 24) {
            if (i == 0) {
                m699a(110);
            } else {
                m699a(111);
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0 || this.f1339N) {
            return;
        }
        this.f1339N = true;
        if (this.f1341P) {
            return;
        }
        this.f1329D.setVisibility(0);
        this.f1329D.setOnClickListener(new ViewOnClickListenerC08542());
        this.f1340O = false;
        Timer timer = new Timer();
        this.f1331F = timer;
        timer.schedule(new C08553(), 1000L, 1000L);
        m828a(this.f1343w);
        this.f1343w -= 1000;
    }

    /* JADX INFO: renamed from: p */
    public void mo818p() {
        int size = this.f1174p.size();
        for (int i = 0; i < size; i++) {
            View view = this.f1174p.get(i);
            if (view != null) {
                view.setOnClickListener(this.f1336K);
            }
        }
    }

    public void setAdExtraInfoMap(Map<String, Object> map) {
        this.f1344x = map;
    }

    public void setDontCountDown(boolean z) {
        CloseFrameLayout closeFrameLayout;
        this.f1341P = z;
        if (!z || (closeFrameLayout = this.f1329D) == null) {
            return;
        }
        closeFrameLayout.setVisibility(8);
    }
}
