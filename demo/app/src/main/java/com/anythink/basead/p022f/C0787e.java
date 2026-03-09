package com.anythink.basead.p022f;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anythink.basead.p010a.C0717a;
import com.anythink.basead.p010a.C0721b;
import com.anythink.basead.p015c.C0751i;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p022f.p023a.C0783b;
import com.anythink.basead.p025ui.p027b.AbstractC0988a;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p055f.C1261z;
import com.anythink.core.common.p066o.p067a.AbstractC1327a;
import com.anythink.core.common.p066o.p067a.C1329c;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.f.e */
/* JADX INFO: loaded from: classes.dex */
public class C0787e extends AbstractC0785c {

    /* JADX INFO: renamed from: a */
    public InterfaceC0771a f1009a;

    /* JADX INFO: renamed from: k */
    public C1329c f1010k;

    /* JADX INFO: renamed from: l */
    public C0721b f1011l;

    /* JADX INFO: renamed from: m */
    public View f1012m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f1013n;

    /* JADX INFO: renamed from: o */
    public View f1014o;

    /* JADX INFO: renamed from: p */
    public View.OnClickListener f1015p;

    /* JADX INFO: renamed from: q */
    public View.OnClickListener f1016q;

    /* JADX INFO: renamed from: r */
    public AbstractC0988a f1017r;

    /* JADX INFO: renamed from: s */
    private final String f1018s;

    /* JADX INFO: renamed from: com.anythink.basead.f.e$4, reason: invalid class name */
    public class AnonymousClass4 extends AbstractC1327a {
        public AnonymousClass4() {
        }

        @Override // com.anythink.core.common.p066o.p067a.AbstractC1327a, com.anythink.core.common.p066o.p067a.InterfaceC1328b
        public final void recordImpression(View view) {
            C0787e.this.m596r();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.f.e$5, reason: invalid class name */
    public class AnonymousClass5 implements AbstractC0989b.a {
        public AnonymousClass5() {
        }

        @Override // com.anythink.basead.p025ui.p027b.AbstractC0989b.a
        /* JADX INFO: renamed from: a */
        public final void mo534a(int i, int i2) {
            C0787e.this.m589a(i, i2, false);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.f.e$6, reason: invalid class name */
    public class AnonymousClass6 extends AbstractC0988a {
        public AnonymousClass6(ViewGroup viewGroup, AbstractC1247l abstractC1247l, C1248m c1248m, AbstractC0989b.a aVar) {
            super(viewGroup, abstractC1247l, c1248m, 5, aVar);
        }

        @Override // com.anythink.basead.p025ui.p027b.AbstractC0988a
        /* JADX INFO: renamed from: a */
        public final ViewGroup.LayoutParams mo535a() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            if (C0787e.this.f1012m != null) {
                layoutParams.gravity = 81;
                layoutParams.setMargins(0, 0, 0, 0);
            }
            return layoutParams;
        }
    }

    public C0787e(Context context, C1248m c1248m, String str, boolean z) {
        super(context, c1248m, str, z);
        this.f1018s = getClass().getSimpleName();
        this.f1015p = new View.OnClickListener() { // from class: com.anythink.basead.f.e.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0787e.this.m601a(view, false);
            }
        };
        this.f1016q = new View.OnClickListener() { // from class: com.anythink.basead.f.e.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0787e.this.m601a(view, true);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    private void m587a(int i) {
        AbstractC0988a abstractC0988a = this.f1017r;
        if (abstractC0988a != null) {
            abstractC0988a.m1177a(i);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m588a(int i, int i2) {
        m589a(i, i2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m589a(final int i, final int i2, boolean z) {
        m596r();
        if (this.f1011l == null) {
            this.f1011l = new C0721b(this.f998c, this.f999d, this.f1002g);
        }
        if (this.f1011l.m158a()) {
            return;
        }
        this.f1011l.m156a(new C0721b.b() { // from class: com.anythink.basead.f.e.3
            @Override // com.anythink.basead.p010a.C0721b.b
            /* JADX INFO: renamed from: a */
            public final void mo162a() {
                InterfaceC0771a interfaceC0771a = C0787e.this.f1009a;
                if (interfaceC0771a != null) {
                    interfaceC0771a.onAdClick(new C0779i().m559a(i, i2));
                }
            }

            @Override // com.anythink.basead.p010a.C0721b.b
            /* JADX INFO: renamed from: a */
            public final void mo163a(boolean z3) {
                InterfaceC0771a interfaceC0771a = C0787e.this.f1009a;
                if (interfaceC0771a != null) {
                    interfaceC0771a.onDeeplinkCallback(z3);
                }
            }

            @Override // com.anythink.basead.p010a.C0721b.b
            /* JADX INFO: renamed from: a */
            public final boolean mo164a(String str, IOfferClickHandler iOfferClickHandler) {
                return false;
            }

            @Override // com.anythink.basead.p010a.C0721b.b
            /* JADX INFO: renamed from: b */
            public final void mo165b() {
            }

            @Override // com.anythink.basead.p010a.C0721b.b
            /* JADX INFO: renamed from: c */
            public final void mo166c() {
            }
        });
        C0751i c0751i = new C0751i(this.f999d.f4323d, "");
        if (z) {
            c0751i.f771k = true;
        }
        this.f1011l.m157a(c0751i);
        m587a(113);
    }

    /* JADX INFO: renamed from: a */
    private void m590a(View view) {
        C1261z c1261z;
        C1248m c1248m;
        this.f1012m = view;
        if (view != null && (view instanceof ViewGroup) && (c1261z = this.f1002g) != null && (c1248m = this.f999d) != null) {
            this.f1017r = new AnonymousClass6((ViewGroup) view, c1261z, c1248m, new AnonymousClass5());
        }
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        if (this.f1010k == null) {
            view.getContext();
            this.f1010k = new C1329c();
        }
        this.f1010k.m3964a(view, anonymousClass4);
    }

    /* JADX INFO: renamed from: a */
    private void m591a(View view, View.OnClickListener onClickListener) {
        if (!(view instanceof ViewGroup)) {
            view.setOnClickListener(onClickListener);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            m591a(viewGroup.getChildAt(i), onClickListener);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m592a(View view, View[] viewArr) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m592a(viewGroup.getChildAt(i), viewArr);
            }
            return;
        }
        if ((view instanceof Button) || (view instanceof TextView)) {
            String string = ((TextView) view).getText().toString();
            if (TextUtils.isEmpty(string) || !TextUtils.equals(string, m605g())) {
                return;
            }
            viewArr[0] = view;
        }
    }

    /* JADX INFO: renamed from: k */
    public static View m595k() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m596r() {
        if (this.f1013n) {
            return;
        }
        m587a(114);
        this.f1013n = true;
        C0783b.m572a(this.f998c).m574a(this.f1002g);
        C0717a.m126a(8, this.f1002g, new C0751i(this.f999d.f4323d, ""));
        InterfaceC0771a interfaceC0771a = this.f1009a;
        if (interfaceC0771a != null) {
            interfaceC0771a.onAdShow(new C0779i());
        }
    }

    /* JADX INFO: renamed from: s */
    private void m597s() {
        C1261z c1261z;
        C1248m c1248m;
        View view = this.f1012m;
        if (view == null || !(view instanceof ViewGroup) || (c1261z = this.f1002g) == null || (c1248m = this.f999d) == null) {
            return;
        }
        this.f1017r = new AnonymousClass6((ViewGroup) view, c1261z, c1248m, new AnonymousClass5());
    }

    /* JADX INFO: renamed from: t */
    private int m598t() {
        C1261z c1261z = this.f1002g;
        if (c1261z != null) {
            return c1261z.m3183W();
        }
        return 0;
    }

    /* JADX INFO: renamed from: u */
    private int m599u() {
        C1261z c1261z = this.f1002g;
        if (c1261z != null) {
            return c1261z.m3184X();
        }
        return 0;
    }

    @Override // com.anythink.basead.p022f.InterfaceC0781a
    /* JADX INFO: renamed from: a */
    public final void mo560a(Activity activity, Map<String, Object> map) {
    }

    /* JADX INFO: renamed from: a */
    public final void m600a(View view, List<View> list, List<View> list2) {
        C1261z c1261z;
        C1248m c1248m;
        this.f1012m = view;
        if (view != null && (view instanceof ViewGroup) && (c1261z = this.f1002g) != null && (c1248m = this.f999d) != null) {
            this.f1017r = new AnonymousClass6((ViewGroup) view, c1261z, c1248m, new AnonymousClass5());
        }
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        if (this.f1010k == null) {
            view.getContext();
            this.f1010k = new C1329c();
        }
        this.f1010k.m3964a(view, anonymousClass4);
        if (list == null || list.size() <= 0) {
            m591a(view, this.f1015p);
        } else {
            View[] viewArr = new View[1];
            m592a(view, viewArr);
            if (viewArr[0] != null) {
                this.f1014o = viewArr[0];
            }
            for (View view2 : list) {
                if (view2 != null) {
                    view2.setOnClickListener(this.f1015p);
                }
            }
        }
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        for (View view3 : list2) {
            if (view3 != null) {
                view3.setOnClickListener(this.f1016q);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m601a(View view, boolean z) {
        View view2 = this.f1014o;
        if (view2 != null && view == view2) {
            m589a(1, 1, z);
        } else {
            View view3 = this.f1012m;
            m589a(1, (view3 == null || view != view3) ? 2 : 3, z);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m602a(InterfaceC0771a interfaceC0771a) {
        this.f1009a = interfaceC0771a;
    }

    /* JADX INFO: renamed from: b */
    public final String m603b() {
        C1261z c1261z = this.f1002g;
        return c1261z != null ? c1261z.m3233v() : "";
    }

    /* JADX INFO: renamed from: f */
    public final String m604f() {
        C1261z c1261z = this.f1002g;
        return c1261z != null ? c1261z.m3235w() : "";
    }

    /* JADX INFO: renamed from: g */
    public final String m605g() {
        C1261z c1261z = this.f1002g;
        return c1261z != null ? c1261z.m3157A() : "";
    }

    /* JADX INFO: renamed from: h */
    public final String m606h() {
        C1261z c1261z = this.f1002g;
        return c1261z != null ? c1261z.m3237x() : "";
    }

    /* JADX INFO: renamed from: i */
    public final String m607i() {
        C1261z c1261z = this.f1002g;
        return c1261z != null ? c1261z.m3239y() : "";
    }

    /* JADX INFO: renamed from: j */
    public final String m608j() {
        C1261z c1261z = this.f1002g;
        return c1261z != null ? c1261z.m3241z() : "";
    }

    /* JADX INFO: renamed from: l */
    public final int m609l() {
        C1261z c1261z = this.f1002g;
        if (c1261z != null) {
            return c1261z.m3183W();
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final int m610m() {
        C1261z c1261z = this.f1002g;
        if (c1261z != null) {
            return c1261z.m3184X();
        }
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m611n() {
        C1329c c1329c = this.f1010k;
        if (c1329c != null) {
            c1329c.m3962a();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m612o() {
        m611n();
        m587a(112);
        this.f1009a = null;
        C0721b c0721b = this.f1011l;
        if (c0721b != null) {
            c0721b.m161d();
            this.f1011l = null;
        }
        C1329c c1329c = this.f1010k;
        if (c1329c != null) {
            c1329c.m3965b();
            this.f1010k = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m613p() {
        C1261z c1261z = this.f1002g;
        if (c1261z != null) {
            return c1261z.m3169H();
        }
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public final int m614q() {
        C1261z c1261z = this.f1002g;
        if (c1261z != null) {
            return c1261z.m3182V();
        }
        return 0;
    }
}
