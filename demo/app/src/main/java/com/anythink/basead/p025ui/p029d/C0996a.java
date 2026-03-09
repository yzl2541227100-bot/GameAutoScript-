package com.anythink.basead.p025ui.p029d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.basead.p025ui.BaseSdkSplashATView;
import com.anythink.basead.p025ui.p028c.InterfaceC0995a;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: renamed from: com.anythink.basead.ui.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0996a {

    /* JADX INFO: renamed from: a */
    public static final int f2021a = -100;

    /* JADX INFO: renamed from: b */
    public static final int f2022b = -101;

    /* JADX INFO: renamed from: c */
    public static final int f2023c = -102;

    /* JADX INFO: renamed from: d */
    private final AbstractC1247l<?> f2024d;

    /* JADX INFO: renamed from: e */
    private final AbstractC1249n f2025e;

    /* JADX INFO: renamed from: f */
    private int f2026f;

    /* JADX INFO: renamed from: g */
    private View f2027g;

    /* JADX INFO: renamed from: h */
    private View f2028h;

    /* JADX INFO: renamed from: i */
    private View f2029i;

    /* JADX INFO: renamed from: j */
    private View f2030j;

    /* JADX INFO: renamed from: k */
    private View f2031k;

    /* JADX INFO: renamed from: l */
    private View f2032l;

    /* JADX INFO: renamed from: m */
    private View f2033m;

    /* JADX INFO: renamed from: n */
    private View f2034n;

    /* JADX INFO: renamed from: o */
    private InterfaceC0995a f2035o;

    public C0996a(AbstractC1247l<?> abstractC1247l, AbstractC1249n abstractC1249n) {
        this.f2024d = abstractC1247l;
        this.f2025e = abstractC1249n;
    }

    /* JADX INFO: renamed from: a */
    private static int m1199a(Context context, float f) {
        return C1345i.m4153a(context, f);
    }

    /* JADX INFO: renamed from: a */
    private void m1201a(Context context) {
        if (this.f2029i == null) {
            this.f2029i = this.f2027g.findViewById(C1345i.m4154a(context, "myoffer_splash_ad_install_btn", "id"));
        }
        if (this.f2030j == null) {
            this.f2030j = this.f2027g.findViewById(C1345i.m4154a(context, "myoffer_shake_view", "id"));
        }
        if (BaseSdkSplashATView.isSinglePicture(this.f2024d, this.f2025e)) {
            this.f2032l.setPadding(0, C1345i.m4153a(context, 26.0f), 0, 0);
            m1202a(context, this.f2029i, 100.0f);
            m1202a(context, this.f2030j, 100.0f);
        } else if (this.f2025e.m3381w() == 2) {
            this.f2032l.setPadding(0, 0, 0, 0);
            View view = this.f2033m;
            if (view != null && view.getLayoutParams() != null) {
                ViewGroup.LayoutParams layoutParams = this.f2033m.getLayoutParams();
                layoutParams.height = C1345i.m4153a(context, 46.0f);
                this.f2033m.setLayoutParams(layoutParams);
                this.f2033m.setPadding(C1345i.m4153a(context, 31.0f), C1345i.m4153a(context, 13.0f), C1345i.m4153a(context, 33.0f), C1345i.m4153a(context, 13.0f));
                this.f2033m.setBackgroundResource(C1345i.m4154a(context, "myoffer_invalid_button_shape_radius_24", C1875i.f11528c));
            }
            View view2 = this.f2034n;
            if (view2 != null && view2.getLayoutParams() != null) {
                ViewGroup.LayoutParams layoutParams2 = this.f2034n.getLayoutParams();
                if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                    layoutParams3.addRule(0, C1345i.m4154a(context, "myoffer_fl_invalid_btn", "id"));
                    layoutParams3.rightMargin = C1345i.m4153a(context, 10.0f);
                    this.f2034n.setLayoutParams(layoutParams3);
                }
                this.f2034n.setPadding(0, 0, 0, 0);
            }
        } else {
            this.f2032l.setPadding(0, C1345i.m4153a(context, 26.0f), 0, 0);
            View view3 = this.f2028h;
            if (view3 != null) {
                view3.setPadding(0, C1345i.m4153a(context, 25.0f), 0, 0);
            }
        }
        this.f2032l.setVisibility(0);
        m1203a(false);
    }

    /* JADX INFO: renamed from: a */
    private static void m1202a(Context context, View view, float f) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = C1345i.m4153a(context, f);
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).bottomMargin = C1345i.m4153a(context, f);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1203a(boolean z) {
        View view;
        View.OnClickListener onClickListener;
        if (!z || (view = this.f2033m) == null) {
            view = this.f2032l;
            if (view == null) {
                return;
            } else {
                onClickListener = new View.OnClickListener() { // from class: com.anythink.basead.ui.d.a.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        if (C0996a.this.f2035o != null) {
                            C0996a.this.f2035o.mo672a(10, 14);
                        }
                    }
                };
            }
        } else {
            onClickListener = new View.OnClickListener() { // from class: com.anythink.basead.ui.d.a.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (C0996a.this.f2035o != null) {
                        C0996a.this.f2035o.mo672a(10, 14);
                    }
                }
            };
        }
        view.setOnClickListener(onClickListener);
    }

    /* JADX INFO: renamed from: b */
    private void m1205b(Context context) {
        View viewFindViewById = this.f2027g.findViewById(C1345i.m4154a(context, "myoffer_include_invalid_button_full_screen", "id"));
        this.f2032l = viewFindViewById;
        if (viewFindViewById == null) {
            this.f2032l = this.f2027g.findViewById(C1345i.m4154a(context, "myoffer_fl_invalid_btn", "id"));
        }
        this.f2028h = this.f2027g.findViewById(C1345i.m4154a(context, "myoffer_splash_ad_bottom_container", "id"));
        this.f2031k = this.f2027g.findViewById(C1345i.m4154a(context, "myoffer_ll_top_content", "id"));
        this.f2029i = this.f2027g.findViewById(C1345i.m4154a(context, "myoffer_btn_banner_cta", "id"));
        this.f2030j = this.f2027g.findViewById(C1345i.m4154a(context, "myoffer_shake_hint_text", "id"));
        this.f2034n = this.f2027g.findViewById(C1345i.m4154a(context, "myoffer_ll_title_desc_container", "id"));
        View view = this.f2032l;
        if (view != null) {
            this.f2033m = view.findViewById(C1345i.m4154a(context, "myoffer_invalid_btn", "id"));
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m1206b(Context context, View view, float f) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = C1345i.m4153a(context, f);
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).topMargin = C1345i.m4153a(context, f);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0996a m1207a(int i) {
        this.f2026f = i;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C0996a m1208a(InterfaceC0995a interfaceC0995a) {
        this.f2035o = interfaceC0995a;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final void m1209a() {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.basead.ui.d.a.3
            @Override // java.lang.Runnable
            public final void run() {
                if (C0996a.this.f2032l != null) {
                    C0996a.this.f2032l.setVisibility(8);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x034f A[PHI: r2
  0x034f: PHI (r2v37 android.view.ViewGroup$LayoutParams) = (r2v28 android.view.ViewGroup$LayoutParams), (r2v68 android.view.ViewGroup$LayoutParams) binds: [B:104:0x034d, B:75:0x0239] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e3  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1210a(android.content.Context r17, android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.p029d.C0996a.m1210a(android.content.Context, android.view.View):void");
    }

    /* JADX INFO: renamed from: b */
    public final void m1211b() {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.basead.ui.d.a.4
            @Override // java.lang.Runnable
            public final void run() {
                if (C0996a.this.f2032l != null) {
                    C0996a.this.f2032l.setVisibility(0);
                }
            }
        });
    }
}
