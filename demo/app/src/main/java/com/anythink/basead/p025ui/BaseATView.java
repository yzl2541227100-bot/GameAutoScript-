package com.anythink.basead.p025ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.p010a.C0717a;
import com.anythink.basead.p010a.C0721b;
import com.anythink.basead.p010a.C0731d;
import com.anythink.basead.p015c.C0743a;
import com.anythink.basead.p015c.C0751i;
import com.anythink.basead.p016d.p020c.C0764d;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p022f.p023a.C0783b;
import com.anythink.basead.p025ui.guidetoclickv2.InterfaceC1020c;
import com.anythink.basead.p025ui.guidetoclickv2.InterfaceC1021d;
import com.anythink.basead.p025ui.p027b.AbstractC0988a;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.p053d.C1195b;
import com.anythink.core.common.p053d.C1196c;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p055f.C1261z;
import com.anythink.core.common.p066o.p067a.AbstractC1327a;
import com.anythink.core.common.p066o.p067a.C1329c;
import com.anythink.expressad.shake.C1974a;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseATView extends RelativeLayout implements InterfaceC1021d {

    /* JADX INFO: renamed from: a */
    public String f1159a;

    /* JADX INFO: renamed from: b */
    public C1248m f1160b;

    /* JADX INFO: renamed from: c */
    public AbstractC1247l f1161c;

    /* JADX INFO: renamed from: d */
    public C1329c f1162d;

    /* JADX INFO: renamed from: e */
    public C0721b f1163e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f1164f;

    /* JADX INFO: renamed from: g */
    public int f1165g;

    /* JADX INFO: renamed from: h */
    public int f1166h;

    /* JADX INFO: renamed from: i */
    public int f1167i;

    /* JADX INFO: renamed from: j */
    public int f1168j;

    /* JADX INFO: renamed from: k */
    public int f1169k;

    /* JADX INFO: renamed from: l */
    public int f1170l;

    /* JADX INFO: renamed from: m */
    public int f1171m;

    /* JADX INFO: renamed from: n */
    public int f1172n;

    /* JADX INFO: renamed from: o */
    public String f1173o;

    /* JADX INFO: renamed from: p */
    public List<View> f1174p;

    /* JADX INFO: renamed from: q */
    public View f1175q;

    /* JADX INFO: renamed from: r */
    public boolean f1176r;

    /* JADX INFO: renamed from: s */
    public View f1177s;

    /* JADX INFO: renamed from: t */
    public AbstractC0988a f1178t;

    /* JADX INFO: renamed from: u */
    public InterfaceC1020c f1179u;

    /* JADX INFO: renamed from: v */
    private boolean f1180v;

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseATView$1 */
    public class C08091 implements AbstractC0989b.a {
        public C08091() {
        }

        @Override // com.anythink.basead.p025ui.p027b.AbstractC0989b.a
        /* JADX INFO: renamed from: a */
        public final void mo534a(int i, int i2) {
            BaseATView.this.mo700a(i, i2);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseATView$2 */
    public class C08102 extends AbstractC0988a {
        public C08102(ViewGroup viewGroup, AbstractC1247l abstractC1247l, C1248m c1248m, int i, AbstractC0989b.a aVar) {
            super(viewGroup, abstractC1247l, c1248m, i, aVar);
        }

        @Override // com.anythink.basead.p025ui.p027b.AbstractC0988a
        /* JADX INFO: renamed from: a */
        public final ViewGroup.LayoutParams mo535a() {
            return BaseATView.this.mo715m();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseATView$a */
    public static class C0813a {

        /* JADX INFO: renamed from: a */
        public static final int f1188a = 101;

        /* JADX INFO: renamed from: b */
        public static final int f1189b = 102;

        /* JADX INFO: renamed from: c */
        public static final int f1190c = 103;

        /* JADX INFO: renamed from: d */
        public static final int f1191d = 104;

        /* JADX INFO: renamed from: e */
        public static final int f1192e = 105;

        /* JADX INFO: renamed from: f */
        public static final int f1193f = 106;

        /* JADX INFO: renamed from: g */
        public static final int f1194g = 107;

        /* JADX INFO: renamed from: h */
        public static final int f1195h = 108;

        /* JADX INFO: renamed from: i */
        public static final int f1196i = 110;

        /* JADX INFO: renamed from: j */
        public static final int f1197j = 111;

        /* JADX INFO: renamed from: k */
        public static final int f1198k = 112;

        /* JADX INFO: renamed from: l */
        public static final int f1199l = 113;

        /* JADX INFO: renamed from: m */
        public static final int f1200m = 114;

        /* JADX INFO: renamed from: n */
        public static final int f1201n = 115;

        /* JADX INFO: renamed from: o */
        public static final int f1202o = 116;

        /* JADX INFO: renamed from: p */
        public static final int f1203p = 117;
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseATView$b */
    public static class C0814b {

        /* JADX INFO: renamed from: a */
        public static final int f1204a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f1205b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f1206c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f1207d = 3;

        /* JADX INFO: renamed from: e */
        public static final int f1208e = 4;

        /* JADX INFO: renamed from: f */
        public static final int f1209f = 5;

        /* JADX INFO: renamed from: g */
        public static final int f1210g = 6;
    }

    public BaseATView(Context context) {
        super(context);
        this.f1159a = "BaseATView";
        this.f1180v = false;
        this.f1176r = false;
    }

    public BaseATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l) {
        this(context, c1248m, abstractC1247l, "");
    }

    public BaseATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, String str) {
        super(context);
        this.f1159a = "BaseATView";
        this.f1180v = false;
        this.f1176r = false;
        this.f1160b = c1248m;
        this.f1161c = abstractC1247l;
        this.f1173o = str;
        this.f1174p = new ArrayList();
        mo706d();
        mo669a();
        this.f1178t = new C08102(this, this.f1161c, this.f1160b, mo716n(), new C08091());
        setFocusable(true);
        setClickable(true);
    }

    /* JADX INFO: renamed from: a */
    private boolean m691a(MotionEvent motionEvent) {
        synchronized (this) {
            try {
                InterfaceC1020c interfaceC1020c = this.f1179u;
                if (interfaceC1020c != null) {
                    if (interfaceC1020c.mo1240a(motionEvent)) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m692b(int i) {
        Random random = new Random();
        if (i <= 0) {
            return 0;
        }
        double d = i;
        int i2 = (int) (0.1d * d);
        return random.nextInt((((int) (d * 0.9d)) - i2) + 1) + i2;
    }

    /* JADX INFO: renamed from: b */
    private void m693b() {
        this.f1178t = new C08102(this, this.f1161c, this.f1160b, mo716n(), new C08091());
    }

    /* JADX INFO: renamed from: b */
    private void m694b(View view) {
        this.f1175q = view;
    }

    /* JADX INFO: renamed from: c */
    private void m695c() {
        AbstractC1247l abstractC1247l = this.f1161c;
        if (abstractC1247l instanceof C1261z) {
            C0783b.m572a(getContext()).m574a((C1261z) this.f1161c);
        } else if (abstractC1247l instanceof AbstractC1217aj) {
            C0764d c0764dM453a = C0764d.m453a();
            Context context = getContext();
            C1248m c1248m = this.f1160b;
            c0764dM453a.m455a(context, C0764d.m454a(c1248m.f4321b, c1248m.f4322c), this.f1161c, this.f1160b.f4333n);
        }
        AbstractC1247l abstractC1247l2 = this.f1161c;
        if ((abstractC1247l2 instanceof AbstractC1217aj) && this.f1160b.f4325f == 67) {
            if (((AbstractC1217aj) abstractC1247l2).m2481a(true, true)) {
                C1196c.m2305a(getContext()).m2301a(this.f1161c.m3229t(), 0, 1);
            }
            if (((AbstractC1217aj) this.f1161c).m2481a(false, true)) {
                C1195b.m2304a(getContext()).m2301a(this.f1161c.m3231u(), 0, 1);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private void m696o() {
        AbstractC1247l abstractC1247l = this.f1161c;
        if ((abstractC1247l instanceof AbstractC1217aj) && this.f1160b.f4325f == 67) {
            if (((AbstractC1217aj) abstractC1247l).m2481a(true, false)) {
                C1196c.m2305a(getContext()).m2301a(this.f1161c.m3229t(), 1, 0);
            }
            if (((AbstractC1217aj) this.f1161c).m2481a(false, false)) {
                C1195b.m2304a(getContext()).m2301a(this.f1161c.m3231u(), 1, 0);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private boolean m697p() {
        return C0731d.m246b(this.f1161c);
    }

    /* JADX INFO: renamed from: a */
    public float mo698a(InterfaceC0958a interfaceC0958a, int i) {
        float f = 1.0f;
        if (interfaceC0958a != null) {
            if (i == 2) {
                f = 1.5f;
            } else if (i == 3) {
                f = 0.75f;
            } else if (i == 4) {
                f = 0.5f;
            }
            interfaceC0958a.setClickAreaScaleFactor(f);
        }
        return f;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo669a();

    /* JADX INFO: renamed from: a */
    public final void m699a(int i) {
        AbstractC0988a abstractC0988a = this.f1178t;
        if (abstractC0988a != null) {
            abstractC0988a.m1177a(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo700a(int i, int i2) {
        this.f1180v = true;
        mo710h();
        if (this.f1163e == null) {
            this.f1163e = new C0721b(getContext(), this.f1160b, this.f1161c);
        }
        if (this.f1163e.m158a()) {
            return;
        }
        if (this.f1176r) {
            if (i2 == 1) {
                i2 = 6;
            } else if (i2 == 2 || i2 == 3) {
                i2 = 7;
            } else if (i2 == 4) {
                i2 = 8;
            } else if (i2 == 5) {
                i2 = 9;
            }
        }
        final C0779i c0779iM559a = new C0779i().m559a(i, i2);
        this.f1163e.m156a(new C0721b.b() { // from class: com.anythink.basead.ui.BaseATView.3
            @Override // com.anythink.basead.p010a.C0721b.b
            /* JADX INFO: renamed from: a */
            public final void mo162a() {
                BaseATView.this.mo703a(c0779iM559a);
                BaseATView baseATView = BaseATView.this;
                AbstractC1247l abstractC1247l = baseATView.f1161c;
                if ((abstractC1247l instanceof AbstractC1217aj) && baseATView.f1160b.f4325f == 67) {
                    if (((AbstractC1217aj) abstractC1247l).m2481a(true, false)) {
                        C1196c.m2305a(baseATView.getContext()).m2301a(baseATView.f1161c.m3229t(), 1, 0);
                    }
                    if (((AbstractC1217aj) baseATView.f1161c).m2481a(false, false)) {
                        C1195b.m2304a(baseATView.getContext()).m2301a(baseATView.f1161c.m3231u(), 1, 0);
                    }
                }
            }

            @Override // com.anythink.basead.p010a.C0721b.b
            /* JADX INFO: renamed from: a */
            public final void mo163a(boolean z) {
                BaseATView.this.mo704a(z);
            }

            @Override // com.anythink.basead.p010a.C0721b.b
            /* JADX INFO: renamed from: a */
            public final boolean mo164a(String str, IOfferClickHandler iOfferClickHandler) {
                return BaseATView.this.mo705a(str, iOfferClickHandler);
            }

            @Override // com.anythink.basead.p010a.C0721b.b
            /* JADX INFO: renamed from: b */
            public final void mo165b() {
                BaseATView.this.mo708f();
            }

            @Override // com.anythink.basead.p010a.C0721b.b
            /* JADX INFO: renamed from: c */
            public final void mo166c() {
                BaseATView.this.mo709g();
            }
        });
        C0751i c0751iMo711i = mo711i();
        if (i != 1) {
            View view = this.f1175q;
            if (view != null) {
                m702a(view);
            } else {
                m702a(this);
            }
        }
        c0751iMo711i.f767g = m712j();
        this.f1163e.m157a(c0751iMo711i);
        m699a(113);
    }

    /* JADX INFO: renamed from: a */
    public void mo701a(final int i, final Runnable runnable) {
        getContext();
        this.f1162d = i > 0 ? new C1329c(i) : new C1329c();
        this.f1162d.m3964a(this, new AbstractC1327a() { // from class: com.anythink.basead.ui.BaseATView.4
            @Override // com.anythink.core.common.p066o.p067a.AbstractC1327a, com.anythink.core.common.p066o.p067a.InterfaceC1328b
            public final int getImpressionMinTimeViewed() {
                int i2 = i;
                if (i2 > 0) {
                    return i2;
                }
                return 50;
            }

            @Override // com.anythink.core.common.p066o.p067a.AbstractC1327a, com.anythink.core.common.p066o.p067a.InterfaceC1328b
            public final void recordImpression(View view) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m702a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        int iM692b = m692b(width);
        int iM692b2 = m692b(height);
        int i3 = i + iM692b;
        this.f1165g = i3;
        this.f1166h = i2 + iM692b2;
        this.f1169k = iM692b;
        this.f1170l = iM692b2;
        this.f1167i = i3 + ((int) (Math.random() * 15.0d));
        int iRandom = iM692b + i2 + ((int) (Math.random() * 15.0d));
        this.f1168j = iRandom;
        this.f1171m = this.f1167i - i;
        this.f1172n = iRandom - i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo703a(C0779i c0779i);

    /* JADX INFO: renamed from: a */
    public abstract void mo704a(boolean z);

    /* JADX INFO: renamed from: a */
    public boolean mo705a(String str, IOfferClickHandler iOfferClickHandler) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void mo706d() {
    }

    public void destroy() {
        m699a(112);
        C0721b c0721b = this.f1163e;
        if (c0721b != null) {
            c0721b.m161d();
        }
        C1329c c1329c = this.f1162d;
        if (c1329c != null) {
            c1329c.m3965b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1165g = (int) motionEvent.getRawX();
            this.f1166h = (int) motionEvent.getRawY();
            this.f1169k = (int) motionEvent.getX();
            this.f1170l = (int) motionEvent.getY();
        } else if (action == 1 || action == 3) {
            this.f1167i = (int) motionEvent.getRawX();
            this.f1168j = (int) motionEvent.getRawY();
            this.f1171m = (int) motionEvent.getX();
            this.f1172n = (int) motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo707e();

    /* JADX INFO: renamed from: f */
    public void mo708f() {
    }

    /* JADX INFO: renamed from: g */
    public void mo709g() {
    }

    public boolean getHasPerformClick() {
        return this.f1180v;
    }

    /* JADX INFO: renamed from: h */
    public synchronized void mo710h() {
        if (this.f1164f) {
            return;
        }
        this.f1164f = true;
        AbstractC1247l abstractC1247l = this.f1161c;
        if (abstractC1247l instanceof C1261z) {
            C0783b.m572a(getContext()).m574a((C1261z) this.f1161c);
        } else if (abstractC1247l instanceof AbstractC1217aj) {
            C0764d c0764dM453a = C0764d.m453a();
            Context context = getContext();
            C1248m c1248m = this.f1160b;
            c0764dM453a.m455a(context, C0764d.m454a(c1248m.f4321b, c1248m.f4322c), this.f1161c, this.f1160b.f4333n);
        }
        AbstractC1247l abstractC1247l2 = this.f1161c;
        if ((abstractC1247l2 instanceof AbstractC1217aj) && this.f1160b.f4325f == 67) {
            if (((AbstractC1217aj) abstractC1247l2).m2481a(true, true)) {
                C1196c.m2305a(getContext()).m2301a(this.f1161c.m3229t(), 0, 1);
            }
            if (((AbstractC1217aj) this.f1161c).m2481a(false, true)) {
                C1195b.m2304a(getContext()).m2301a(this.f1161c.m3231u(), 0, 1);
            }
        }
        m699a(114);
        C0717a.m126a(8, this.f1161c, mo711i());
        mo707e();
    }

    /* JADX INFO: renamed from: i */
    public C0751i mo711i() {
        C0751i c0751i = new C0751i(this.f1160b.f4323d, "");
        c0751i.f765e = getWidth();
        c0751i.f766f = getHeight();
        return c0751i;
    }

    public boolean isShowingEndCardAfterVideoPlay() {
        return this.f1176r;
    }

    /* JADX INFO: renamed from: j */
    public final C0743a m712j() {
        C0743a c0743a = new C0743a();
        c0743a.f680a = this.f1165g;
        c0743a.f681b = this.f1166h;
        c0743a.f682c = this.f1167i;
        c0743a.f683d = this.f1168j;
        c0743a.f684e = this.f1169k;
        c0743a.f685f = this.f1170l;
        c0743a.f686g = this.f1171m;
        c0743a.f687h = this.f1172n;
        return c0743a;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo713k() {
        C1248m c1248m;
        AbstractC1249n abstractC1249n;
        return C1974a.m10477a().m10480b() && (c1248m = this.f1160b) != null && (abstractC1249n = c1248m.f4333n) != null && abstractC1249n.m3277Q() == 1;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo714l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public RelativeLayout.LayoutParams mo715m() {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public int mo716n() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m699a(116);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m699a(117);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (m691a(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (m691a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.InterfaceC1021d
    public void setCallback(InterfaceC1020c interfaceC1020c) {
        synchronized (this) {
            this.f1179u = interfaceC1020c;
        }
    }

    public void setHasPerformClick(boolean z) {
        this.f1180v = z;
    }

    public void setShowingEndCardAfterVideoPlay(boolean z) {
        this.f1176r = z;
    }
}
