package com.anythink.basead.p025ui.guidetoclickv2;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.p010a.C0731d;
import com.anythink.basead.p025ui.GuideToClickView;
import com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.expressad.exoplayer.C1575f;

/* JADX INFO: renamed from: com.anythink.basead.ui.guidetoclickv2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1019b {

    /* JADX INFO: renamed from: a */
    public Context f2141a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f2142b;

    /* JADX INFO: renamed from: c */
    public View f2143c;

    /* JADX INFO: renamed from: d */
    public Runnable f2144d;

    /* JADX INFO: renamed from: e */
    private AbstractC1247l f2145e;

    /* JADX INFO: renamed from: f */
    private C1248m f2146f;

    /* JADX INFO: renamed from: g */
    private int f2147g;

    /* JADX INFO: renamed from: h */
    private int f2148h;

    /* JADX INFO: renamed from: i */
    private BaseG2CV2View.InterfaceC1001b f2149i;

    /* JADX INFO: renamed from: j */
    private BaseG2CV2View f2150j;

    /* JADX INFO: renamed from: k */
    private long f2151k;

    /* JADX INFO: renamed from: l */
    private long f2152l;

    /* JADX INFO: renamed from: m */
    private long f2153m;

    /* JADX INFO: renamed from: n */
    private String f2154n;

    /* JADX INFO: renamed from: o */
    private int f2155o;

    /* JADX INFO: renamed from: p */
    private AbstractC0989b.a f2156p;

    /* JADX INFO: renamed from: q */
    private boolean f2157q = false;

    /* JADX INFO: renamed from: r */
    private int f2158r;

    /* JADX INFO: renamed from: s */
    private long f2159s;

    /* JADX INFO: renamed from: t */
    private long f2160t;

    /* JADX INFO: renamed from: com.anythink.basead.ui.guidetoclickv2.b$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f2161a;

        public AnonymousClass1(int i) {
            i = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view;
            int i;
            if (C1019b.this.f2150j == null) {
                C1019b c1019b = C1019b.this;
                c1019b.f2150j = C1019b.m1273a(c1019b, c1019b.f2148h);
                if (C1019b.this.f2150j != null) {
                    C1019b.this.f2159s = System.currentTimeMillis();
                    C1019b.this.f2150j.init(C1019b.this.f2153m, i, C1019b.this.f2155o, C1019b.this.f2156p, C1019b.this.f2149i);
                    C1019b c1019b2 = C1019b.this;
                    RelativeLayout relativeLayout = c1019b2.f2142b;
                    if (relativeLayout != null) {
                        relativeLayout.addView(c1019b2.f2150j);
                    }
                    C1019b c1019b3 = C1019b.this;
                    int i2 = c1019b3.f2148h;
                    if (i2 == 3 || i2 == 4 || i2 == 6) {
                        view = c1019b3.f2143c;
                        if (view != null) {
                            i = 0;
                            view.setVisibility(i);
                        }
                    } else {
                        view = c1019b3.f2143c;
                        if (view != null) {
                            i = 8;
                            view.setVisibility(i);
                        }
                    }
                }
            }
            C1019b.this.f2150j.resumeAnimPlay();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.guidetoclickv2.b$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseG2CV2View f2163a;

        public AnonymousClass2(BaseG2CV2View baseG2CV2View) {
            this.f2163a = baseG2CV2View;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RelativeLayout relativeLayout = C1019b.this.f2142b;
            if (relativeLayout == null || relativeLayout.getMeasuredHeight() <= C1345i.m4153a(C1019b.this.f2141a, 90.0f)) {
                return;
            }
            ((FingerG2CV2View) this.f2163a).setFingerViewMode(GuideToClickView.C0870a.f1447f);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.guidetoclickv2.b$3 */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RelativeLayout relativeLayout = C1019b.this.f2142b;
            if (relativeLayout != null) {
                if ((relativeLayout.getMeasuredHeight() < 100 || C1019b.this.f2142b.getMeasuredWidth() < 200) && C1019b.this.f2149i != null) {
                    C1019b.this.f2149i.mo1226b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.guidetoclickv2.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f2166a;

        /* JADX INFO: renamed from: b */
        public int f2167b;

        /* JADX INFO: renamed from: c */
        public long f2168c;

        /* JADX INFO: renamed from: d */
        public long f2169d;

        /* JADX INFO: renamed from: e */
        private String f2170e;

        /* JADX INFO: renamed from: f */
        private int f2171f;

        public a(int i, int i2, long j, long j2, String str, int i3) {
            this.f2166a = i;
            this.f2167b = i2;
            this.f2168c = j;
            this.f2169d = j2;
            this.f2170e = str;
            this.f2171f = i3;
        }
    }

    public C1019b(Context context, AbstractC1247l abstractC1247l, C1248m c1248m, int i, a aVar, RelativeLayout relativeLayout, View view, AbstractC0989b.a aVar2, BaseG2CV2View.InterfaceC1001b interfaceC1001b) {
        this.f2152l = 0L;
        this.f2153m = C1575f.f8394a;
        this.f2154n = "";
        this.f2155o = 1;
        this.f2141a = context;
        this.f2145e = abstractC1247l;
        this.f2146f = c1248m;
        this.f2142b = relativeLayout;
        this.f2143c = view;
        this.f2147g = i;
        this.f2156p = aVar2;
        this.f2149i = interfaceC1001b;
        this.f2148h = aVar.f2167b;
        this.f2153m = aVar.f2168c;
        this.f2152l = aVar.f2169d;
        this.f2154n = aVar.f2170e;
        this.f2155o = aVar.f2171f;
        this.f2158r = aVar.f2166a;
        this.f2144d = new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.b.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f2161a;

            public AnonymousClass1(int i2) {
                i = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view2;
                int i2;
                if (C1019b.this.f2150j == null) {
                    C1019b c1019b = C1019b.this;
                    c1019b.f2150j = C1019b.m1273a(c1019b, c1019b.f2148h);
                    if (C1019b.this.f2150j != null) {
                        C1019b.this.f2159s = System.currentTimeMillis();
                        C1019b.this.f2150j.init(C1019b.this.f2153m, i, C1019b.this.f2155o, C1019b.this.f2156p, C1019b.this.f2149i);
                        C1019b c1019b2 = C1019b.this;
                        RelativeLayout relativeLayout2 = c1019b2.f2142b;
                        if (relativeLayout2 != null) {
                            relativeLayout2.addView(c1019b2.f2150j);
                        }
                        C1019b c1019b3 = C1019b.this;
                        int i22 = c1019b3.f2148h;
                        if (i22 == 3 || i22 == 4 || i22 == 6) {
                            view2 = c1019b3.f2143c;
                            if (view2 != null) {
                                i2 = 0;
                                view2.setVisibility(i2);
                            }
                        } else {
                            view2 = c1019b3.f2143c;
                            if (view2 != null) {
                                i2 = 8;
                                view2.setVisibility(i2);
                            }
                        }
                    }
                }
                C1019b.this.f2150j.resumeAnimPlay();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BaseG2CV2View m1273a(C1019b c1019b, int i) {
        BaseG2CV2View hintTextG2CV2View;
        BaseG2CV2View baseG2CV2View;
        switch (i) {
            case 1:
                GestureG2CV2View gestureG2CV2View = new GestureG2CV2View(c1019b.f2141a);
                gestureG2CV2View.setLayoutParams(c1019b.m1280c(i));
                gestureG2CV2View.setVerticalLandscape(c1019b.f2143c == null);
                baseG2CV2View = gestureG2CV2View;
                break;
            case 2:
                PicVerifyG2CV2View picVerifyG2CV2View = new PicVerifyG2CV2View(c1019b.f2141a);
                picVerifyG2CV2View.loadImage(c1019b.f2145e.m3239y());
                hintTextG2CV2View = picVerifyG2CV2View;
                hintTextG2CV2View.setLayoutParams(c1019b.m1280c(i));
                baseG2CV2View = hintTextG2CV2View;
                break;
            case 3:
                QuestionDialogG2CV2View questionDialogG2CV2View = new QuestionDialogG2CV2View(c1019b.f2141a);
                questionDialogG2CV2View.setLayoutParams(c1019b.m1280c(i));
                questionDialogG2CV2View.setQuestionAnswer(!TextUtils.isEmpty(c1019b.f2145e.m3233v()) ? c1019b.f2145e.m3233v() : !TextUtils.isEmpty(c1019b.f2145e.m3235w()) ? c1019b.f2145e.m3235w() : "", c1019b.f2154n);
                baseG2CV2View = questionDialogG2CV2View;
                break;
            case 4:
                hintTextG2CV2View = new HintTextG2CV2View(c1019b.f2141a);
                hintTextG2CV2View.setLayoutParams(c1019b.m1280c(i));
                baseG2CV2View = hintTextG2CV2View;
                break;
            case 5:
                hintTextG2CV2View = new JumpConfirmG2CV2View(c1019b.f2141a);
                hintTextG2CV2View.setLayoutParams(c1019b.m1280c(i));
                baseG2CV2View = hintTextG2CV2View;
                break;
            case 6:
                FingerG2CV2View fingerG2CV2View = new FingerG2CV2View(c1019b.f2141a);
                int i2 = 501;
                switch (c1019b.f2147g) {
                    case 2:
                        i2 = 502;
                        if (c1019b.f2143c == null) {
                            i2 = 503;
                        }
                        break;
                    case 3:
                        i2 = GuideToClickView.C0870a.f1448g;
                        break;
                    case 4:
                        i2 = GuideToClickView.C0870a.f1446e;
                        c1019b.f2142b.post(c1019b.new AnonymousClass2(fingerG2CV2View));
                        break;
                    case 5:
                    case 6:
                        i2 = 504;
                        break;
                }
                fingerG2CV2View.setFingerViewMode(i2);
                hintTextG2CV2View = fingerG2CV2View;
                hintTextG2CV2View.setLayoutParams(c1019b.m1280c(i));
                baseG2CV2View = hintTextG2CV2View;
                break;
            case 7:
                hintTextG2CV2View = new FullOrientationG2CV2View(c1019b.f2141a);
                hintTextG2CV2View.setLayoutParams(c1019b.m1280c(i));
                baseG2CV2View = hintTextG2CV2View;
                break;
            default:
                baseG2CV2View = null;
                break;
        }
        int i3 = c1019b.f2147g;
        if (i3 == 5 || i3 == 6) {
            c1019b.f2142b.post(c1019b.new AnonymousClass3());
        }
        return baseG2CV2View;
    }

    /* JADX INFO: renamed from: a */
    private void m1275a(int i) {
        if (i == 3 || i == 4 || i == 6) {
            View view = this.f2143c;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        View view2 = this.f2143c;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: b */
    private BaseG2CV2View m1277b(int i) {
        BaseG2CV2View hintTextG2CV2View;
        BaseG2CV2View baseG2CV2View;
        switch (i) {
            case 1:
                GestureG2CV2View gestureG2CV2View = new GestureG2CV2View(this.f2141a);
                gestureG2CV2View.setLayoutParams(m1280c(i));
                gestureG2CV2View.setVerticalLandscape(this.f2143c == null);
                baseG2CV2View = gestureG2CV2View;
                break;
            case 2:
                PicVerifyG2CV2View picVerifyG2CV2View = new PicVerifyG2CV2View(this.f2141a);
                picVerifyG2CV2View.loadImage(this.f2145e.m3239y());
                hintTextG2CV2View = picVerifyG2CV2View;
                hintTextG2CV2View.setLayoutParams(m1280c(i));
                baseG2CV2View = hintTextG2CV2View;
                break;
            case 3:
                QuestionDialogG2CV2View questionDialogG2CV2View = new QuestionDialogG2CV2View(this.f2141a);
                questionDialogG2CV2View.setLayoutParams(m1280c(i));
                questionDialogG2CV2View.setQuestionAnswer(!TextUtils.isEmpty(this.f2145e.m3233v()) ? this.f2145e.m3233v() : !TextUtils.isEmpty(this.f2145e.m3235w()) ? this.f2145e.m3235w() : "", this.f2154n);
                baseG2CV2View = questionDialogG2CV2View;
                break;
            case 4:
                hintTextG2CV2View = new HintTextG2CV2View(this.f2141a);
                hintTextG2CV2View.setLayoutParams(m1280c(i));
                baseG2CV2View = hintTextG2CV2View;
                break;
            case 5:
                hintTextG2CV2View = new JumpConfirmG2CV2View(this.f2141a);
                hintTextG2CV2View.setLayoutParams(m1280c(i));
                baseG2CV2View = hintTextG2CV2View;
                break;
            case 6:
                FingerG2CV2View fingerG2CV2View = new FingerG2CV2View(this.f2141a);
                int i2 = 501;
                switch (this.f2147g) {
                    case 2:
                        i2 = 502;
                        if (this.f2143c == null) {
                            i2 = 503;
                        }
                        break;
                    case 3:
                        i2 = GuideToClickView.C0870a.f1448g;
                        break;
                    case 4:
                        i2 = GuideToClickView.C0870a.f1446e;
                        this.f2142b.post(new AnonymousClass2(fingerG2CV2View));
                        break;
                    case 5:
                    case 6:
                        i2 = 504;
                        break;
                }
                fingerG2CV2View.setFingerViewMode(i2);
                hintTextG2CV2View = fingerG2CV2View;
                hintTextG2CV2View.setLayoutParams(m1280c(i));
                baseG2CV2View = hintTextG2CV2View;
                break;
            case 7:
                hintTextG2CV2View = new FullOrientationG2CV2View(this.f2141a);
                hintTextG2CV2View.setLayoutParams(m1280c(i));
                baseG2CV2View = hintTextG2CV2View;
                break;
            default:
                baseG2CV2View = null;
                break;
        }
        int i3 = this.f2147g;
        if (i3 == 5 || i3 == 6) {
            this.f2142b.post(new AnonymousClass3());
        }
        return baseG2CV2View;
    }

    /* JADX INFO: renamed from: b */
    private static /* synthetic */ void m1278b(C1019b c1019b, int i) {
        if (i == 3 || i == 4 || i == 6) {
            View view = c1019b.f2143c;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        View view2 = c1019b.f2143c;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: c */
    private RelativeLayout.LayoutParams m1280c(int i) {
        RelativeLayout.LayoutParams layoutParams;
        int i2;
        switch (i) {
            case 1:
                return new RelativeLayout.LayoutParams(-1, -1);
            case 2:
                return new RelativeLayout.LayoutParams(-1, -1);
            case 3:
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(13);
                return layoutParams;
            case 4:
                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (this.f2147g != 2 && this.f2155o == 1) {
                    layoutParams.setMargins(0, 0, 0, C1345i.m4153a(this.f2142b.getContext(), 290.0f));
                    layoutParams.addRule(12);
                    return layoutParams;
                }
                layoutParams.addRule(13);
                return layoutParams;
            case 5:
                if (this.f2147g == 2) {
                    layoutParams = new RelativeLayout.LayoutParams(-1, C1345i.m4153a(this.f2142b.getContext(), 48.0f));
                    layoutParams.setMargins(C1345i.m4153a(this.f2142b.getContext(), 36.0f), 0, C1345i.m4153a(this.f2142b.getContext(), 36.0f), 0);
                    layoutParams.addRule(13);
                    return layoutParams;
                }
                layoutParams = new RelativeLayout.LayoutParams(C1345i.m4153a(this.f2142b.getContext(), 300.0f), C1345i.m4153a(this.f2142b.getContext(), 48.0f));
                if (this.f2155o == 2) {
                    layoutParams.setMargins(0, 0, C1345i.m4153a(this.f2142b.getContext(), 24.0f), C1345i.m4153a(this.f2142b.getContext(), 96.0f));
                    i2 = 11;
                } else {
                    layoutParams.setMargins(0, 0, 0, C1345i.m4153a(this.f2142b.getContext(), 290.0f));
                    i2 = 14;
                }
                layoutParams.addRule(i2);
                layoutParams.addRule(12);
                return layoutParams;
            case 6:
                return new RelativeLayout.LayoutParams(-1, -1);
            case 7:
                return new RelativeLayout.LayoutParams(-1, -1);
            default:
                return new RelativeLayout.LayoutParams(-2, -2);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m1282d() {
        int i = this.f2147g;
        if (i == 5 || i == 6) {
            this.f2142b.post(new AnonymousClass3());
        }
    }

    /* JADX INFO: renamed from: e */
    private void m1284e() {
        if (this.f2159s > 0) {
            C1248m c1248m = this.f2146f;
            AbstractC1247l abstractC1247l = this.f2145e;
            C1322e.m3898a(c1248m, abstractC1247l, C0731d.m245a(abstractC1247l, c1248m), this.f2158r, this.f2148h, this.f2159s, this.f2160t);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1286a() {
        if (this.f2157q) {
            return;
        }
        this.f2157q = true;
        this.f2151k = SystemClock.elapsedRealtime();
        C1175n.m2059a().m2118a(this.f2144d, this.f2152l);
    }

    /* JADX INFO: renamed from: b */
    public final void m1287b() {
        if (this.f2157q) {
            this.f2157q = false;
            long j = this.f2152l;
            if (j > 0) {
                this.f2152l = Math.max(j - (SystemClock.elapsedRealtime() - this.f2151k), 0L);
            }
            C1175n.m2059a().m2144d(this.f2144d);
            BaseG2CV2View baseG2CV2View = this.f2150j;
            if (baseG2CV2View != null) {
                baseG2CV2View.pauseAnimPlay();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1288c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f2159s;
        this.f2160t = jCurrentTimeMillis - j;
        if (j > 0) {
            C1248m c1248m = this.f2146f;
            AbstractC1247l abstractC1247l = this.f2145e;
            C1322e.m3898a(c1248m, abstractC1247l, C0731d.m245a(abstractC1247l, c1248m), this.f2158r, this.f2148h, this.f2159s, this.f2160t);
        }
        C1175n.m2059a().m2144d(this.f2144d);
        BaseG2CV2View baseG2CV2View = this.f2150j;
        if (baseG2CV2View != null) {
            baseG2CV2View.release();
            C1360x.m4265a(this.f2150j);
        }
        View view = this.f2143c;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
