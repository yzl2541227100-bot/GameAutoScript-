package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1874h;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1890x;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2080b;
import com.anythink.expressad.video.dynview.p166i.C2094c;
import com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.anythink.expressad.video.module.p172a.p173a.C2181g;
import com.anythink.expressad.video.module.p172a.p173a.C2183i;
import com.anythink.expressad.video.module.p172a.p173a.C2185k;
import com.anythink.expressad.video.module.p172a.p173a.C2186l;
import com.anythink.expressad.video.module.p174b.C2190a;
import com.anythink.expressad.video.signal.InterfaceC2306e;
import com.anythink.expressad.video.signal.InterfaceC2311h;
import com.anythink.expressad.video.signal.factory.C2309b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkContainerView extends AnythinkBaseView implements InterfaceC2306e, InterfaceC2311h {

    /* JADX INFO: renamed from: A */
    private int f13510A;

    /* JADX INFO: renamed from: B */
    private boolean f13511B;

    /* JADX INFO: renamed from: C */
    private boolean f13512C;

    /* JADX INFO: renamed from: D */
    private boolean f13513D;

    /* JADX INFO: renamed from: E */
    private boolean f13514E;

    /* JADX INFO: renamed from: F */
    private boolean f13515F;

    /* JADX INFO: renamed from: G */
    private boolean f13516G;

    /* JADX INFO: renamed from: H */
    private int f13517H;

    /* JADX INFO: renamed from: I */
    private boolean f13518I;

    /* JADX INFO: renamed from: J */
    private boolean f13519J;

    /* JADX INFO: renamed from: K */
    private int f13520K;

    /* JADX INFO: renamed from: L */
    private int f13521L;

    /* JADX INFO: renamed from: M */
    private int f13522M;

    /* JADX INFO: renamed from: N */
    private int f13523N;

    /* JADX INFO: renamed from: O */
    private int f13524O;

    /* JADX INFO: renamed from: P */
    private String f13525P;

    /* JADX INFO: renamed from: Q */
    private C2309b f13526Q;

    /* JADX INFO: renamed from: R */
    private AnyThinkOrderCampView f13527R;

    /* JADX INFO: renamed from: S */
    private boolean f13528S;

    /* JADX INFO: renamed from: T */
    private boolean f13529T;

    /* JADX INFO: renamed from: U */
    private List<C1781c> f13530U;

    /* JADX INFO: renamed from: n */
    private AnythinkPlayableView f13531n;

    /* JADX INFO: renamed from: o */
    private AnythinkClickCTAView f13532o;

    /* JADX INFO: renamed from: p */
    private AnythinkClickMiniCardView f13533p;

    /* JADX INFO: renamed from: q */
    private AnythinkNativeEndCardView f13534q;

    /* JADX INFO: renamed from: r */
    private AnythinkH5EndCardView f13535r;

    /* JADX INFO: renamed from: s */
    private AnythinkVideoEndCoverView f13536s;

    /* JADX INFO: renamed from: t */
    private AnythinkVastEndCardView f13537t;

    /* JADX INFO: renamed from: u */
    private AnythinkLandingPageView f13538u;

    /* JADX INFO: renamed from: v */
    private AnythinkAlertWebview f13539v;

    /* JADX INFO: renamed from: w */
    private String f13540w;

    /* JADX INFO: renamed from: x */
    private int f13541x;

    /* JADX INFO: renamed from: y */
    private int f13542y;

    /* JADX INFO: renamed from: z */
    private int f13543z;

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkContainerView$4 */
    public class C21234 extends C2183i {
        public C21234(InterfaceC2174a interfaceC2174a) {
            super(interfaceC2174a);
        }

        @Override // com.anythink.expressad.video.module.p172a.p173a.C2183i, com.anythink.expressad.video.module.p172a.p173a.C2180f, com.anythink.expressad.video.module.p172a.InterfaceC2174a
        /* JADX INFO: renamed from: a */
        public final void mo10950a(int i, Object obj) {
            super.mo10950a(i, obj);
            if (i == 100) {
                AnythinkContainerView.this.webviewshow();
                AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                anythinkContainerView.onConfigurationChanged(anythinkContainerView.getResources().getConfiguration());
            }
        }
    }

    public AnythinkContainerView(Context context) {
        super(context);
        this.f13542y = 1;
        this.f13543z = 1;
        this.f13510A = 1;
        this.f13511B = false;
        this.f13512C = false;
        this.f13513D = false;
        this.f13514E = false;
        this.f13515F = true;
        this.f13516G = false;
        this.f13518I = false;
        this.f13519J = false;
        this.f13528S = false;
        this.f13529T = false;
        this.f13530U = new ArrayList();
    }

    public AnythinkContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13542y = 1;
        this.f13543z = 1;
        this.f13510A = 1;
        this.f13511B = false;
        this.f13512C = false;
        this.f13513D = false;
        this.f13514E = false;
        this.f13515F = true;
        this.f13516G = false;
        this.f13518I = false;
        this.f13519J = false;
        this.f13528S = false;
        this.f13529T = false;
        this.f13530U = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    private void m11330a(Configuration configuration, AnythinkBaseView... anythinkBaseViewArr) {
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if ((anythinkBaseView != null && (anythinkBaseView instanceof AnythinkClickMiniCardView)) || (anythinkBaseView != null && anythinkBaseView.getVisibility() == 0 && anythinkBaseView.getParent() != null && !isLast())) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m11331a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11333a(InterfaceC2174a interfaceC2174a, AnythinkBaseView... anythinkBaseViewArr) {
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null) {
                anythinkBaseView.setNotifyListener(anythinkBaseView instanceof AnythinkClickMiniCardView ? new C2181g(this.f13533p, interfaceC2174a) : new C2183i(interfaceC2174a));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11334a(C2309b c2309b) {
        if (this.f13531n == null) {
            this.f13531n = new AnythinkPlayableView(this.f13477a);
        }
        this.f13531n.setCloseDelayShowTime(this.f13543z);
        this.f13531n.setPlayCloseBtnTm(this.f13510A);
        this.f13531n.setCampaign(this.f13478b);
        this.f13531n.setNotifyListener(new C21234(this.f13481e));
        this.f13531n.preLoadData(c2309b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m11335a(C2309b c2309b, Integer num) {
        InterfaceC2174a interfaceC2174a;
        this.f13526Q = c2309b;
        C1781c c1781c = this.f13478b;
        if (c1781c != null) {
            if (num == null) {
                num = Integer.valueOf(c1781c.m8798F());
            }
            if (!isLast()) {
                m11353p();
            }
            int iIntValue = num.intValue();
            if (iIntValue != 1) {
                if (iIntValue == 3) {
                    if (this.f13537t == null) {
                        this.f13537t = new AnythinkVastEndCardView(this.f13477a);
                    }
                    this.f13537t.setCampaign(this.f13478b);
                    this.f13537t.setNotifyListener(new C2186l(this.f13481e));
                    this.f13537t.preLoadData(c2309b);
                    return;
                }
                if (iIntValue == 4) {
                    if (this.f13538u == null) {
                        this.f13538u = new AnythinkLandingPageView(this.f13477a);
                    }
                    this.f13538u.setCampaign(this.f13478b);
                    this.f13538u.setNotifyListener(new C2183i(this.f13481e));
                    return;
                }
                if (iIntValue != 5) {
                    if (this.f13542y != 2) {
                        C1781c c1781c2 = this.f13478b;
                        int iM8955c = (c1781c2 == null || c1781c2.m8805M() == null) ? 0 : this.f13478b.m8805M().m8955c();
                        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f13534q;
                        if (anythinkNativeEndCardView == null && anythinkNativeEndCardView == null) {
                            if (this.f13478b.m8886j()) {
                                m11354q();
                            } else {
                                AnythinkNativeEndCardView anythinkNativeEndCardView2 = new AnythinkNativeEndCardView(this.f13477a, null, false, -1, this.f13478b.m8872f() == 2, iM8955c, this.f13478b.m8850as());
                                this.f13534q = anythinkNativeEndCardView2;
                                anythinkNativeEndCardView2.setCampaign(this.f13478b);
                            }
                        }
                        this.f13534q.setLayout();
                        this.f13534q.setCampaign(this.f13478b);
                        this.f13534q.setUnitId(this.f13540w);
                        this.f13534q.setCloseBtnDelay(this.f13543z);
                        this.f13534q.setNotifyListener(new C2183i(this.f13481e));
                        this.f13534q.preLoadData(c2309b);
                        this.f13534q.setNotchPadding(this.f13520K, this.f13521L, this.f13522M, this.f13523N);
                        return;
                    }
                    boolean zM8886j = this.f13478b.m8886j();
                    boolean zM9848f = C1886t.m9848f(this.f13478b.m8801I());
                    C1781c c1781c3 = this.f13478b;
                    if ((c1781c3 == null || !zM8886j || zM9848f) && c1781c3.m8872f() != 2) {
                        if (this.f13535r == null) {
                            this.f13535r = new AnythinkH5EndCardView(this.f13477a);
                        }
                        if (this.f13478b.m8887k() == 5 && (interfaceC2174a = this.f13481e) != null && (interfaceC2174a instanceof C2185k)) {
                            ((C2185k) interfaceC2174a).m11505a(this.f13478b);
                        }
                        this.f13535r.setCampaign(this.f13478b);
                        this.f13535r.setCloseDelayShowTime(this.f13543z);
                        this.f13535r.setNotifyListener(new C2183i(this.f13481e));
                        this.f13535r.setUnitId(this.f13540w);
                        this.f13535r.setNotchValue(this.f13525P, this.f13520K, this.f13521L, this.f13522M, this.f13523N);
                        this.f13535r.preLoadData(c2309b);
                        if (this.f13513D) {
                            return;
                        }
                        StringBuilder sb = new StringBuilder("showTransparent = ");
                        sb.append(this.f13513D);
                        sb.append(" addview");
                        addView(this.f13535r);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11336a(AnythinkH5EndCardView... anythinkH5EndCardViewArr) {
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0 && anythinkH5EndCardView.getParent() != null && !isLast()) {
                anythinkH5EndCardView.webviewshow();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m11337a() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1;
    }

    /* JADX INFO: renamed from: b */
    private void m11338b() {
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11339b(int i) {
        if (i != -3) {
            if (i != -2) {
                if (this.f13532o == null) {
                    this.f13532o = new AnythinkClickCTAView(this.f13477a);
                }
                this.f13532o.setCampaign(this.f13478b);
                this.f13532o.setUnitId(this.f13540w);
                this.f13532o.setNotifyListener(new C2183i(this.f13481e));
                this.f13532o.preLoadData(this.f13526Q);
                return;
            }
            C1781c c1781c = this.f13478b;
            if (c1781c == null || c1781c.m8798F() != 2) {
                return;
            }
            if (this.f13533p == null) {
                this.f13533p = new AnythinkClickMiniCardView(this.f13477a);
            }
            this.f13533p.setCampaign(this.f13478b);
            AnythinkClickMiniCardView anythinkClickMiniCardView = this.f13533p;
            anythinkClickMiniCardView.setNotifyListener(new C2181g(anythinkClickMiniCardView, this.f13481e));
            this.f13533p.preLoadData(this.f13526Q);
            setMatchParent();
            m11350m();
            m11353p();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11340b(C2309b c2309b) {
        this.f13526Q = c2309b;
        if (this.f13536s == null) {
            AnythinkVideoEndCoverView anythinkVideoEndCoverView = new AnythinkVideoEndCoverView(this.f13477a);
            this.f13536s = anythinkVideoEndCoverView;
            anythinkVideoEndCoverView.setCampaign(this.f13478b);
            this.f13536s.setNotifyListener(new C2183i(this.f13481e));
            this.f13536s.preLoadData(c2309b);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11341b(AnythinkH5EndCardView... anythinkH5EndCardViewArr) {
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0) {
                anythinkH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m11342e() {
        C1781c c1781c = this.f13478b;
        if (c1781c != null) {
            boolean zM8886j = c1781c.m8886j();
            boolean zM9848f = C1886t.m9848f(this.f13478b.m8801I());
            if (zM8886j && !zM9848f) {
                m11346i();
                return;
            }
        }
        if (this.f13542y != 2 || this.f13518I) {
            m11346i();
        } else {
            m11345h();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m11343f() {
        if (this.f13537t == null) {
            m11335a(this.f13526Q, (Integer) 3);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        addView(this.f13537t, layoutParams);
        this.f13537t.notifyShowListener();
    }

    /* JADX INFO: renamed from: g */
    private void m11344g() {
        if (this.f13538u == null) {
            m11335a(this.f13526Q, (Integer) 4);
        }
        this.f13538u.setUnitId(this.f13540w);
        this.f13538u.preLoadData(this.f13526Q);
        addView(this.f13538u);
    }

    /* JADX INFO: renamed from: h */
    private void m11345h() {
        if (this.f13535r == null) {
            m11335a(this.f13526Q, (Integer) 2);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f13535r;
        if (anythinkH5EndCardView == null || !anythinkH5EndCardView.isLoadSuccess()) {
            m11346i();
            AnythinkH5EndCardView anythinkH5EndCardView2 = this.f13535r;
            if (anythinkH5EndCardView2 != null) {
                anythinkH5EndCardView2.reportRenderResult("timeout", 3);
                this.f13535r.setError(true);
            }
        } else {
            this.f13518I = true;
            addView(this.f13535r);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f13535r.excuteTask();
            this.f13535r.setNotchValue(this.f13525P, this.f13520K, this.f13521L, this.f13522M, this.f13523N);
        }
        AnythinkH5EndCardView anythinkH5EndCardView3 = this.f13535r;
        if (anythinkH5EndCardView3 != null) {
            anythinkH5EndCardView3.setUnitId(this.f13540w);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m11346i() {
        this.f13542y = 1;
        if (this.f13534q == null) {
            m11335a(this.f13526Q, (Integer) 2);
        }
        addView(this.f13534q);
        onConfigurationChanged(getResources().getConfiguration());
        this.f13534q.notifyShowListener();
        this.f13529T = true;
        bringToFront();
    }

    /* JADX INFO: renamed from: j */
    private void m11347j() {
        AnythinkVideoEndCoverView anythinkVideoEndCoverView = this.f13536s;
        if (anythinkVideoEndCoverView == null) {
            C2309b c2309b = this.f13526Q;
            this.f13526Q = c2309b;
            if (anythinkVideoEndCoverView == null) {
                AnythinkVideoEndCoverView anythinkVideoEndCoverView2 = new AnythinkVideoEndCoverView(this.f13477a);
                this.f13536s = anythinkVideoEndCoverView2;
                anythinkVideoEndCoverView2.setCampaign(this.f13478b);
                this.f13536s.setNotifyListener(new C2183i(this.f13481e));
                this.f13536s.preLoadData(c2309b);
            }
        }
        addView(this.f13536s);
        onConfigurationChanged(getResources().getConfiguration());
        this.f13529T = true;
        bringToFront();
    }

    /* JADX INFO: renamed from: k */
    private void m11348k() {
        if (this.f13531n == null) {
            preLoadData(this.f13526Q);
        }
        addView(this.f13531n);
        AnythinkPlayableView anythinkPlayableView = this.f13531n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.setUnitId(this.f13540w);
            C1781c c1781c = this.f13478b;
            if (c1781c != null && c1781c.m8800H() && this.f13478b.m8802J() == 2) {
                this.f13531n.setCloseVisible(0);
            }
            this.f13531n.setNotchValue(this.f13525P, this.f13520K, this.f13521L, this.f13522M, this.f13523N);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m11349l() {
        if (this.f13532o == null) {
            m11339b(-1);
        }
        if (this.f13532o != null) {
            C1781c c1781c = this.f13478b;
            if (c1781c == null || !c1781c.m8886j()) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                addView(this.f13532o, 0, layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private void m11350m() {
        if (this.f13533p == null) {
            m11339b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f13513D && this.f13515F) {
            this.f13515F = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f13533p, layoutParams);
    }

    /* JADX INFO: renamed from: n */
    private void m11351n() {
        if (this.f13539v == null) {
            m11352o();
        }
        AnythinkAlertWebview anythinkAlertWebview = this.f13539v;
        if (anythinkAlertWebview != null && anythinkAlertWebview.getParent() != null) {
            removeView(this.f13539v);
        }
        addView(this.f13539v);
    }

    /* JADX INFO: renamed from: o */
    private void m11352o() {
        if (this.f13539v == null) {
            AnythinkAlertWebview anythinkAlertWebview = new AnythinkAlertWebview(this.f13477a);
            this.f13539v = anythinkAlertWebview;
            anythinkAlertWebview.setUnitId(this.f13540w);
            this.f13539v.setCampaign(this.f13478b);
        }
        this.f13539v.preLoadData(this.f13526Q);
    }

    /* JADX INFO: renamed from: p */
    private void m11353p() {
        this.f13512C = false;
        this.f13529T = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i = 0;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof AnythinkContainerView) {
                    i++;
                } else {
                    viewGroup.bringChildToFront(childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m11354q() {
        int i;
        InterfaceC2174a interfaceC2174a;
        C1781c c1781c = this.f13478b;
        if (c1781c == null) {
            return;
        }
        String strM8801I = c1781c.m8801I();
        if (TextUtils.isEmpty(strM8801I)) {
            i = 404;
        } else {
            try {
                i = Integer.parseInt(C1890x.m9870a(strM8801I, "ecid"));
            } catch (Throwable th) {
                th.getMessage();
                i = 404;
            }
        }
        this.f13534q = new AnythinkNativeEndCardView(this.f13477a, null, true, i, this.f13478b.m8872f() == 2, this.f13488l, this.f13478b.m8850as());
        if (this.f13478b.m8887k() == 5 && (interfaceC2174a = this.f13481e) != null && (interfaceC2174a instanceof C2185k)) {
            ((C2185k) interfaceC2174a).m11505a(this.f13478b);
        }
        this.f13534q.setCampaign(this.f13478b);
    }

    public void addOrderViewData(List<C1781c> list) {
        if (list == null) {
            return;
        }
        this.f13530U = list;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view != null) {
            m11331a(view);
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            m11331a(view);
            super.addView(view, layoutParams);
        }
    }

    public boolean canBackPress() {
        if (this.f13534q != null) {
            return false;
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f13535r;
        if (anythinkH5EndCardView == null && (anythinkH5EndCardView = this.f13538u) == null && (anythinkH5EndCardView = this.f13531n) == null) {
            return false;
        }
        return anythinkH5EndCardView.canBackPress();
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void configurationChanged(int i, int i2, int i3) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f13533p;
        if (anythinkClickMiniCardView == null || anythinkClickMiniCardView.getVisibility() != 0) {
            return;
        }
        this.f13533p.resizeMiniCard(i, i2);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public boolean endCardShowing() {
        return this.f13511B;
    }

    public boolean endcardIsPlayable() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f13535r;
        return anythinkH5EndCardView != null && anythinkH5EndCardView.isPlayable();
    }

    public AnythinkH5EndCardView getH5EndCardView() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f13535r;
        return anythinkH5EndCardView == null ? this.f13531n : anythinkH5EndCardView;
    }

    public C1781c getReSetCampaign() {
        if (!this.f13478b.m8886j() || !TextUtils.isEmpty(this.f13478b.m8801I())) {
            return null;
        }
        int size = this.f13530U.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (this.f13530U.get(i2) != null && this.f13530U.get(i2).m10146aZ() == this.f13478b.m10146aZ()) {
                    i = i2 - 1;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (i < 0 || i >= size || this.f13530U.get(i) == null) {
            return null;
        }
        return this.f13530U.get(i);
    }

    public boolean getShowingTransparent() {
        return this.f13513D;
    }

    public String getUnitID() {
        return this.f13540w;
    }

    public int getVideoInteractiveType() {
        return this.f13541x;
    }

    public int getVideoSkipTime() {
        return this.f13517H;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e, com.anythink.expressad.video.signal.InterfaceC2311h
    public void handlerPlayableException(String str) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f13535r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.handlerPlayableException(str);
            if (!this.f13518I) {
                return;
            }
        }
        m11342e();
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void hideAlertWebview() {
        if (isLast()) {
            return;
        }
        if (this.f13528S && !this.f13529T) {
            m11353p();
            this.f13528S = false;
        }
        AnythinkAlertWebview anythinkAlertWebview = this.f13539v;
        if (anythinkAlertWebview == null || anythinkAlertWebview.getParent() == null) {
            return;
        }
        removeView(this.f13539v);
        AnythinkClickCTAView anythinkClickCTAView = this.f13532o;
        if (anythinkClickCTAView == null || anythinkClickCTAView.getParent() == null) {
            return;
        }
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void install(C1781c c1781c) {
        this.f13481e.mo10950a(105, c1781c);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup != null && viewGroup.indexOfChild(this) == 0;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void ivRewardAdsWithoutVideo(String str) {
        this.f13481e.mo10950a(103, str);
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public boolean miniCardLoaded() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f13533p;
        return anythinkClickMiniCardView != null && anythinkClickMiniCardView.isLoadSuccess();
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public boolean miniCardShowing() {
        return this.f13512C;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void notifyCloseBtn(int i) {
        AnythinkPlayableView anythinkPlayableView = this.f13531n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.notifyCloseBtn(i);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f13535r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.notifyCloseBtn(i);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnythinkBaseView[] anythinkBaseViewArr = {this.f13531n, this.f13532o, this.f13533p, this.f13534q, this.f13535r, this.f13537t, this.f13538u, this.f13536s};
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if ((anythinkBaseView != null && (anythinkBaseView instanceof AnythinkClickMiniCardView)) || (anythinkBaseView != null && anythinkBaseView.getVisibility() == 0 && anythinkBaseView.getParent() != null && !isLast())) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    public void onEndcardBackPress() {
        InterfaceC2174a interfaceC2174a;
        int i;
        if (this.f13534q != null || this.f13537t != null) {
            interfaceC2174a = this.f13481e;
            i = 104;
        } else {
            if (this.f13538u == null) {
                AnythinkH5EndCardView anythinkH5EndCardView = this.f13535r;
                if (anythinkH5EndCardView != null) {
                    anythinkH5EndCardView.onBackPress();
                    return;
                }
                return;
            }
            interfaceC2174a = this.f13481e;
            i = 103;
        }
        interfaceC2174a.mo10950a(i, "");
    }

    public void onMiniEndcardBackPress() {
        if (this.f13512C) {
            this.f13481e.mo10950a(107, "");
        }
    }

    public void onPlayableBackPress() {
        AnythinkPlayableView anythinkPlayableView = this.f13531n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.onBackPress();
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void orientation(Configuration configuration) {
        AnythinkH5EndCardView[] anythinkH5EndCardViewArr = {this.f13531n, this.f13533p, this.f13535r, this.f13539v};
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0) {
                anythinkH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2307f
    public void preLoadData(final C2309b c2309b) {
        this.f13526Q = c2309b;
        C1781c c1781c = this.f13478b;
        if (c1781c != null) {
            if (c1781c.m8802J() == 2) {
                if (this.f13531n == null) {
                    this.f13531n = new AnythinkPlayableView(this.f13477a);
                }
                this.f13531n.setCloseDelayShowTime(this.f13543z);
                this.f13531n.setPlayCloseBtnTm(this.f13510A);
                this.f13531n.setCampaign(this.f13478b);
                this.f13531n.setNotifyListener(new C21234(this.f13481e));
                this.f13531n.preLoadData(c2309b);
            } else {
                m11339b(this.f13541x);
                if (this.f13478b.m8886j()) {
                    try {
                        m11335a(c2309b, Integer.valueOf(this.f13478b.m8798F()));
                    } catch (Throwable th) {
                        th.getMessage();
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                                anythinkContainerView.m11335a(c2309b, Integer.valueOf(anythinkContainerView.f13478b.m8798F()));
                            }
                        });
                    }
                    C1886t.m9848f(this.f13478b.m8801I());
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                            anythinkContainerView.m11335a(c2309b, Integer.valueOf(anythinkContainerView.f13478b.m8798F()));
                        }
                    }, getVideoSkipTime());
                }
            }
            m11352o();
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e, com.anythink.expressad.video.signal.InterfaceC2311h
    public void readyStatus(int i) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f13535r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.readyStatus(i);
        }
    }

    public void release() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f13535r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.release();
            this.f13535r = null;
        }
        AnythinkPlayableView anythinkPlayableView = this.f13531n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.release();
        }
        AnythinkLandingPageView anythinkLandingPageView = this.f13538u;
        if (anythinkLandingPageView != null) {
            anythinkLandingPageView.release();
        }
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f13534q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.clearMoreOfferBitmap();
            this.f13534q.release();
        }
        if (this.f13481e != null) {
            this.f13481e = null;
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void resizeMiniCard(int i, int i2, int i3) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f13533p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.resizeMiniCard(i, i2);
            this.f13533p.setRadius(i3);
            removeAllViews();
            setMatchParent();
            this.f13529T = true;
            bringToFront();
            m11350m();
        }
    }

    public void setAnythinkClickMiniCardViewTransparent() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f13533p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setAnythinkClickMiniCardViewTransparent();
            this.f13533p.setAnythinkClickMiniCardViewClickable(false);
        }
    }

    public void setCloseDelayTime(int i) {
        this.f13543z = i;
    }

    public void setEndscreenType(int i) {
        this.f13542y = i;
    }

    public void setJSFactory(C2309b c2309b) {
        this.f13526Q = c2309b;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        new StringBuilder("NOTCH ContainerView ").append(String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i)));
        this.f13524O = i;
        this.f13520K = i2;
        this.f13521L = i3;
        this.f13522M = i4;
        this.f13523N = i5;
        this.f13525P = C1874h.m9682a(i, i2, i3, i4, i5);
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f13534q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setNotchPadding(i2, i3, i4, i5);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f13535r;
        if (anythinkH5EndCardView != null && anythinkH5EndCardView.f13584s != null) {
            anythinkH5EndCardView.setNotchValue(this.f13525P, i2, i3, i4, i5);
            C1469j.m5701a();
            C1469j.m5703a((WebView) this.f13535r.f13584s, "oncutoutfetched", Base64.encodeToString(this.f13525P.getBytes(), 0));
        }
        AnythinkPlayableView anythinkPlayableView = this.f13531n;
        if (anythinkPlayableView != null && anythinkPlayableView.f13584s != null) {
            anythinkPlayableView.setNotchValue(this.f13525P, i2, i3, i4, i5);
            C1469j.m5701a();
            C1469j.m5703a((WebView) this.f13531n.f13584s, "oncutoutfetched", Base64.encodeToString(this.f13525P.getBytes(), 0));
        }
        AnyThinkOrderCampView anyThinkOrderCampView = this.f13527R;
        if (anyThinkOrderCampView != null) {
            anyThinkOrderCampView.setNotchPadding(i2, i3, i4, i5);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void setNotifyListener(InterfaceC2174a interfaceC2174a) {
        super.setNotifyListener(interfaceC2174a);
        AnythinkBaseView[] anythinkBaseViewArr = {this.f13531n, this.f13532o, this.f13533p, this.f13534q, this.f13535r, this.f13537t, this.f13538u, this.f13536s};
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null) {
                anythinkBaseView.setNotifyListener(anythinkBaseView instanceof AnythinkClickMiniCardView ? new C2181g(this.f13533p, interfaceC2174a) : new C2183i(interfaceC2174a));
            }
        }
    }

    public void setOnPause() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f13534q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f13534q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i) {
        this.f13510A = i;
    }

    public void setRewardStatus(boolean z) {
        this.f13519J = z;
    }

    public void setShowingTransparent(boolean z) {
        this.f13513D = z;
    }

    public void setUnitID(String str) {
        this.f13540w = str;
    }

    public void setVideoInteractiveType(int i) {
        C1781c c1781c = this.f13478b;
        if (c1781c == null || !c1781c.m8886j()) {
            this.f13541x = i;
            return;
        }
        int iM11191a = C2094c.m11191a(this.f13478b);
        if (iM11191a == 100) {
            this.f13541x = i;
        } else {
            this.f13541x = iM11191a;
        }
    }

    public void setVideoSkipTime(int i) {
        this.f13517H = i;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public boolean showAlertWebView() {
        AnythinkAlertWebview anythinkAlertWebview = this.f13539v;
        if (anythinkAlertWebview == null || !anythinkAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (!(viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1) && !this.f13529T) {
            removeAllViews();
            bringToFront();
            this.f13528S = true;
        }
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f13533p;
        if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.f13539v == null) {
            m11352o();
        }
        AnythinkAlertWebview anythinkAlertWebview2 = this.f13539v;
        if (anythinkAlertWebview2 != null && anythinkAlertWebview2.getParent() != null) {
            removeView(this.f13539v);
        }
        addView(this.f13539v);
        setBackgroundColor(0);
        this.f13539v.webviewshow();
        return true;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void showEndcard(int i) {
        InterfaceC2174a interfaceC2174a;
        int i2;
        C1781c c1781c = this.f13478b;
        if (c1781c != null) {
            if (i == 1) {
                interfaceC2174a = this.f13481e;
                i2 = 104;
            } else if (i != 100) {
                if (i == 3) {
                    removeAllViews();
                    setMatchParent();
                    if (this.f13537t == null) {
                        m11335a(this.f13526Q, (Integer) 3);
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(13, -1);
                    addView(this.f13537t, layoutParams);
                    this.f13537t.notifyShowListener();
                } else if (i == 4) {
                    this.f13481e.mo10950a(113, "");
                    removeAllViews();
                    setMatchParent();
                    if (this.f13538u == null) {
                        m11335a(this.f13526Q, (Integer) 4);
                    }
                    this.f13538u.setUnitId(this.f13540w);
                    this.f13538u.preLoadData(this.f13526Q);
                    addView(this.f13538u);
                } else if (i != 5) {
                    removeAllViews();
                    setMatchParent();
                    this.f13529T = true;
                    bringToFront();
                    m11342e();
                    interfaceC2174a = this.f13481e;
                    i2 = 117;
                } else {
                    interfaceC2174a = this.f13481e;
                    i2 = 106;
                }
                this.f13529T = true;
                bringToFront();
            } else {
                if (c1781c.m8802J() == 2) {
                    this.f13514E = true;
                }
                m11331a(this.f13531n);
                setMatchParent();
                m11346i();
            }
            interfaceC2174a.mo10950a(i2, "");
        }
        this.f13511B = true;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f13533p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setMiniCardLocation(i, i2, i3, i4);
            this.f13533p.setRadius(i5);
            this.f13533p.setCloseVisible(8);
            this.f13533p.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.f13529T = true;
            bringToFront();
            m11350m();
            if (this.f13516G) {
                return;
            }
            this.f13516G = true;
            this.f13481e.mo10950a(109, "");
            this.f13481e.mo10950a(117, "");
        }
    }

    public void showOrderCampView() {
        AnyThinkOrderCampView anyThinkOrderCampView = new AnyThinkOrderCampView(this.f13477a);
        this.f13527R = anyThinkOrderCampView;
        anyThinkOrderCampView.setCampaignExes(this.f13530U);
        InterfaceC2174a interfaceC2174a = this.f13481e;
        if (interfaceC2174a != null && (interfaceC2174a instanceof C2185k)) {
            ((C2185k) interfaceC2174a).m11507a(this.f13530U);
        }
        this.f13527R.setNotifyListener(new C2183i(this.f13481e));
        this.f13527R.setRewarded(this.f13519J);
        this.f13527R.setNotchPadding(this.f13520K, this.f13521L, this.f13522M, this.f13523N);
        this.f13527R.setCampOrderViewBuildCallback(new InterfaceC2080b() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.3
            @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2080b
            /* JADX INFO: renamed from: a */
            public final void mo11129a() {
                InterfaceC2174a interfaceC2174a2 = AnythinkContainerView.this.f13481e;
                if (interfaceC2174a2 != null) {
                    interfaceC2174a2.mo10950a(117, "");
                }
            }

            @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2080b
            /* JADX INFO: renamed from: b */
            public final void mo11130b() {
                if (AnythinkContainerView.this.f13478b.m8872f() == 2) {
                    AnythinkContainerView.this.showVideoEndCover();
                } else {
                    AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                    anythinkContainerView.showEndcard(anythinkContainerView.f13478b.m8798F());
                }
            }
        });
        this.f13527R.createView(this);
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void showPlayableView() {
        if (this.f13478b == null || this.f13514E) {
            return;
        }
        removeAllViews();
        setMatchParent();
        if (this.f13531n == null) {
            preLoadData(this.f13526Q);
        }
        addView(this.f13531n);
        AnythinkPlayableView anythinkPlayableView = this.f13531n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.setUnitId(this.f13540w);
            C1781c c1781c = this.f13478b;
            if (c1781c != null && c1781c.m8800H() && this.f13478b.m8802J() == 2) {
                this.f13531n.setCloseVisible(0);
            }
            this.f13531n.setNotchValue(this.f13525P, this.f13520K, this.f13521L, this.f13522M, this.f13523N);
        }
        this.f13529T = true;
        bringToFront();
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void showVideoClickView(int i) {
        C1781c c1781c;
        if (this.f13478b != null) {
            if (i == -1) {
                if (isLast() || endCardShowing()) {
                    return;
                }
                m11353p();
                return;
            }
            if (i == 1) {
                if (this.f13511B) {
                    return;
                }
                AnythinkH5EndCardView anythinkH5EndCardView = this.f13535r;
                if (anythinkH5EndCardView != null && anythinkH5EndCardView.getParent() != null) {
                    removeView(this.f13535r);
                }
                AnythinkClickMiniCardView anythinkClickMiniCardView = this.f13533p;
                if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.getParent() != null) {
                    removeView(this.f13533p);
                }
                AnythinkClickCTAView anythinkClickCTAView = this.f13532o;
                if (anythinkClickCTAView == null || anythinkClickCTAView.getParent() == null) {
                    try {
                        C1781c c1781c2 = this.f13478b;
                        if (c1781c2 != null && c1781c2.m8802J() == 1) {
                            this.f13529T = true;
                            if (this.f13532o == null) {
                                m11339b(-1);
                            }
                            if (this.f13532o != null && ((c1781c = this.f13478b) == null || !c1781c.m8886j())) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.f13532o, 0, layoutParams);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            AnythinkClickCTAView anythinkClickCTAView2 = this.f13532o;
            if (anythinkClickCTAView2 != null && anythinkClickCTAView2.getParent() != null) {
                removeView(this.f13532o);
            }
            AnythinkAlertWebview anythinkAlertWebview = this.f13539v;
            if (anythinkAlertWebview == null || anythinkAlertWebview.getParent() == null) {
                AnythinkClickMiniCardView anythinkClickMiniCardView2 = this.f13533p;
                if (anythinkClickMiniCardView2 == null || anythinkClickMiniCardView2.getParent() == null) {
                    try {
                        C1781c c1781c3 = this.f13478b;
                        if (c1781c3 != null && c1781c3.m8802J() == 1) {
                            setMatchParent();
                            m11350m();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (!miniCardLoaded()) {
                    m11353p();
                    return;
                }
                AnythinkH5EndCardView anythinkH5EndCardView2 = this.f13535r;
                if (anythinkH5EndCardView2 != null && anythinkH5EndCardView2.getParent() != null) {
                    removeView(this.f13535r);
                }
                this.f13481e.mo10950a(112, "");
                C1781c c1781c4 = this.f13478b;
                if (c1781c4 != null && !c1781c4.m8854aw()) {
                    this.f13478b.m8855ax();
                    C2190a.m11532e(this.f13477a, this.f13478b);
                }
                if (this.f13513D) {
                    this.f13481e.mo10950a(115, "");
                } else {
                    this.f13529T = true;
                    bringToFront();
                    webviewshow();
                    onConfigurationChanged(getResources().getConfiguration());
                }
                this.f13512C = true;
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        AnythinkVideoEndCoverView anythinkVideoEndCoverView = this.f13536s;
        if (anythinkVideoEndCoverView == null) {
            C2309b c2309b = this.f13526Q;
            this.f13526Q = c2309b;
            if (anythinkVideoEndCoverView == null) {
                AnythinkVideoEndCoverView anythinkVideoEndCoverView2 = new AnythinkVideoEndCoverView(this.f13477a);
                this.f13536s = anythinkVideoEndCoverView2;
                anythinkVideoEndCoverView2.setCampaign(this.f13478b);
                this.f13536s.setNotifyListener(new C2183i(this.f13481e));
                this.f13536s.preLoadData(c2309b);
            }
        }
        addView(this.f13536s);
        onConfigurationChanged(getResources().getConfiguration());
        this.f13529T = true;
        bringToFront();
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void toggleCloseBtn(int i) {
        AnythinkPlayableView anythinkPlayableView = this.f13531n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.toggleCloseBtn(i);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f13535r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.toggleCloseBtn(i);
        }
    }

    public void triggerCloseBtn(String str) {
        if (this.f13478b != null) {
            this.f13481e.mo10950a(InterfaceC2174a.f13804H, "");
            this.f13481e.mo10950a(104, "");
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void webviewshow() {
        AnythinkH5EndCardView[] anythinkH5EndCardViewArr = {this.f13531n, this.f13533p, this.f13535r, this.f13539v};
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0 && anythinkH5EndCardView.getParent() != null && !isLast()) {
                anythinkH5EndCardView.webviewshow();
            }
        }
    }
}
