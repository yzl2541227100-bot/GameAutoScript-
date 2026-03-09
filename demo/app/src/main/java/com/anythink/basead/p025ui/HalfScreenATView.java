package com.anythink.basead.p025ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.p010a.C0731d;
import com.anythink.basead.p025ui.animplayerview.BasePlayerView;
import com.anythink.basead.p025ui.p028c.InterfaceC0995a;
import com.anythink.basead.p025ui.p029d.C0996a;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;

/* JADX INFO: loaded from: classes.dex */
public class HalfScreenATView extends BaseScreenATView {
    public static final String TAG = HalfScreenATView.class.getSimpleName();

    /* JADX INFO: renamed from: ad */
    public final int f1449ad;

    /* JADX INFO: renamed from: ae */
    public final int f1450ae;

    /* JADX INFO: renamed from: af */
    public final int f1451af;

    /* JADX INFO: renamed from: ag */
    public int f1452ag;

    /* JADX INFO: renamed from: ah */
    private View f1453ah;

    /* JADX INFO: renamed from: ai */
    private C0996a f1454ai;

    public HalfScreenATView(Context context) {
        super(context);
        this.f1449ad = 1;
        this.f1450ae = 2;
        this.f1451af = 3;
    }

    public HalfScreenATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, String str, int i, int i2) {
        super(context, c1248m, abstractC1247l, str, i, i2);
        this.f1449ad = 1;
        this.f1450ae = 2;
        this.f1451af = 3;
        setId(C1345i.m4154a(getContext(), "myoffer_half_screen_view_id", "id"));
        if (c1248m != null) {
            this.f1454ai = new C0996a(abstractC1247l, c1248m.f4333n);
        }
    }

    /* JADX INFO: renamed from: S */
    private boolean m878S() {
        return this.f1161c.m3210k() || this.f1255W <= this.f1256aa;
    }

    /* JADX INFO: renamed from: T */
    private boolean m879T() {
        return !C0731d.m244a(this.f1161c);
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: B */
    public final void mo760B() {
        super.m761C();
        super.m781c(1);
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: G */
    public final void mo765G() {
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: J */
    public void mo768J() {
        BaseEndCardView baseEndCardView;
        BasePlayerView basePlayerView;
        if (this.f1243K == null || (baseEndCardView = this.f1246N) == null || baseEndCardView.getParent() != null || (basePlayerView = this.f1244L) == null) {
            return;
        }
        this.f1243K.addView(this.f1246N, 1, basePlayerView.getLayoutParams());
    }

    /* JADX INFO: renamed from: Q */
    public int mo880Q() {
        int i = this.f1452ag;
        if (i != 1) {
            return i != 2 ? 4 : 3;
        }
        return 7;
    }

    /* JADX INFO: renamed from: R */
    public void mo881R() {
        int i;
        int i2;
        int i3;
        int iM4153a;
        int i4;
        int iM4153a2;
        RelativeLayout relativeLayout;
        BasePlayerView basePlayerView;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1245M.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f1243K.getLayoutParams();
        int i5 = layoutParams2.leftMargin;
        int i6 = layoutParams2.rightMargin;
        int i7 = layoutParams2.topMargin;
        int i8 = layoutParams2.bottomMargin;
        BasePlayerView basePlayerView2 = this.f1244L;
        RelativeLayout.LayoutParams layoutParams3 = basePlayerView2 != null ? (RelativeLayout.LayoutParams) basePlayerView2.getLayoutParams() : null;
        int iM4165b = C1345i.m4165b(getContext());
        if (iM4165b <= 0) {
            iM4165b = C1345i.m4153a(getContext(), 25.0f);
        }
        int i9 = this.f1452ag;
        if (i9 == 1) {
            if (this.f1268w == 2) {
                i2 = (this.f1270y - i7) - i8;
                i3 = (int) (i2 * 1.75f);
                iM4153a = C1345i.m4153a(getContext(), 120.0f);
                if (i7 < iM4165b) {
                    layoutParams2.topMargin = (int) (iM4165b * 1.1f);
                }
                layoutParams2.width = i3;
                this.f1243K.setLayoutParams(layoutParams2);
            } else if (m878S()) {
                i3 = (this.f1269x - i5) - i6;
                i2 = (int) (i3 / 0.5714286f);
                iM4153a = C1345i.m4153a(getContext(), 240.0f);
            } else {
                i3 = (this.f1269x - i5) - i6;
                i2 = (int) (i3 / 1.032258f);
                iM4153a = C1345i.m4153a(getContext(), 120.0f);
            }
            this.f1271z = i3;
            this.f1233A = i2;
        } else {
            if (i9 != 2) {
                View viewFindViewById = this.f1245M.findViewById(C1345i.m4154a(getContext(), "myoffer_panel_view_blank", "id"));
                i = viewFindViewById != null ? ((RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams()).topMargin : 0;
                if (this.f1268w == 1) {
                    i3 = (this.f1269x - i5) - i6;
                    i2 = (int) (i3 / 1.032258f);
                    this.f1271z = i3;
                    int i10 = (int) (i3 / 2.0f);
                    this.f1233A = i10;
                    iM4153a = (i2 - i10) + i;
                } else {
                    if (i7 < iM4165b) {
                        i7 = (int) (iM4165b * 1.1f);
                        layoutParams2.topMargin = i7;
                    }
                    i2 = (this.f1270y - i7) - i8;
                    i3 = (int) (i2 * 1.032258f);
                    this.f1271z = i3;
                    int i11 = (int) (i3 / 2.0f);
                    this.f1233A = i11;
                    iM4153a = (i2 - i11) + i;
                    layoutParams2.width = i3;
                    this.f1243K.setLayoutParams(layoutParams2);
                }
            } else {
                if (this.f1268w != 1) {
                    if (i7 < iM4165b) {
                        i7 = (int) (iM4165b * 1.1f);
                        layoutParams2.topMargin = i7;
                    }
                    i2 = (this.f1270y - i7) - i8;
                    i3 = (int) (i2 * 1.6f);
                    if (this.f1454ai != null && (iM4153a2 = this.f1269x - (C1345i.m4153a(getContext(), 116.0f) * 2)) < i3) {
                        i2 = (int) (iM4153a2 / 1.6f);
                        i3 = iM4153a2;
                    }
                    this.f1233A = i2;
                    int i12 = (int) (i2 * 0.56f);
                    this.f1271z = i12;
                    i4 = i3 - i12;
                    layoutParams2.width = i3;
                    this.f1243K.setLayoutParams(layoutParams2);
                    iM4153a = i2;
                    layoutParams2.width = i3;
                    layoutParams2.height = i2;
                    this.f1243K.setLayoutParams(layoutParams2);
                    if (layoutParams3 != null && (basePlayerView = this.f1244L) != null) {
                        layoutParams3.width = this.f1271z;
                        layoutParams3.height = this.f1233A;
                        basePlayerView.setLayoutParams(layoutParams3);
                    }
                    layoutParams.width = i4;
                    layoutParams.height = iM4153a;
                    this.f1245M.setLayoutParams(layoutParams);
                    if ((this.f1452ag != 2 && this.f1268w == 2) || (relativeLayout = (RelativeLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_guide2click_container", "id"))) == null || layoutParams3 == null) {
                        return;
                    }
                    relativeLayout.setLayoutParams(layoutParams3);
                }
                View viewFindViewById2 = this.f1245M.findViewById(C1345i.m4154a(getContext(), "myoffer_panel_view_blank", "id"));
                i = viewFindViewById2 != null ? ((RelativeLayout.LayoutParams) viewFindViewById2.getLayoutParams()).topMargin : 0;
                i3 = (this.f1269x - i5) - i6;
                float f = i3;
                int i13 = (int) (f / 0.5714286f);
                if (this.f1270y < (C1345i.m4153a(getContext(), 28.0f) * 2) + i13) {
                    iM4153a = (int) (f / 1.8181819f);
                    this.f1271z = i3;
                    this.f1233A = (i13 - iM4153a) + i;
                } else {
                    this.f1271z = i3;
                    int i14 = (int) (i3 / 0.8f);
                    this.f1233A = i14;
                    iM4153a = (i13 - i14) + i;
                }
                i2 = i13;
            }
        }
        i4 = i3;
        layoutParams2.width = i3;
        layoutParams2.height = i2;
        this.f1243K.setLayoutParams(layoutParams2);
        if (layoutParams3 != null) {
            layoutParams3.width = this.f1271z;
            layoutParams3.height = this.f1233A;
            basePlayerView.setLayoutParams(layoutParams3);
        }
        layoutParams.width = i4;
        layoutParams.height = iM4153a;
        this.f1245M.setLayoutParams(layoutParams);
        if (this.f1452ag != 2) {
        }
        relativeLayout.setLayoutParams(layoutParams3);
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public void mo669a() {
        LayoutInflater layoutInflaterFrom;
        Context context;
        String str;
        int i = this.f1452ag;
        if (i == 1) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
            context = getContext();
            str = "myoffer_half_screen_empty_info";
        } else if (i != 2) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
            context = getContext();
            str = "myoffer_half_screen_horizontal";
        } else {
            layoutInflaterFrom = LayoutInflater.from(getContext());
            context = getContext();
            str = "myoffer_half_screen_vertical";
        }
        this.f1453ah = layoutInflaterFrom.inflate(C1345i.m4154a(context, str, "layout"), this);
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: b */
    public void mo777b() {
        super.mo777b();
        try {
            mo881R();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        C0996a c0996a = this.f1454ai;
        if (c0996a != null) {
            c0996a.m1207a(this.f1237E).m1208a(new InterfaceC0995a() { // from class: com.anythink.basead.ui.HalfScreenATView.1
                @Override // com.anythink.basead.p025ui.p028c.InterfaceC0995a
                /* JADX INFO: renamed from: a */
                public final void mo672a(int i, int i2) {
                    HalfScreenATView.this.mo700a(i, i2);
                }
            }).m1210a(getContext(), this.f1453ah);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: b */
    public boolean mo779b(int i) {
        return !this.f1161c.m3210k();
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView, com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: d */
    public final void mo706d() {
        super.mo706d();
        if ((!C0731d.m244a(this.f1161c)) || this.f1161c.m3210k()) {
            this.f1452ag = 1;
        } else {
            this.f1452ag = m878S() ? 2 : 3;
        }
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView, com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: m */
    public RelativeLayout.LayoutParams mo715m() {
        RelativeLayout relativeLayout = this.f1243K;
        if (relativeLayout == null || this.f1245M == null) {
            return super.mo715m();
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f1245M.getLayoutParams();
        int i = (layoutParams.height * 2) / 3;
        RelativeLayout relativeLayout2 = this.f1244L;
        if (relativeLayout2 != null || (relativeLayout2 = this.f1246N) != null) {
            i = (((RelativeLayout.LayoutParams) relativeLayout2.getLayoutParams()).height * 2) / 3;
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(0, i, (this.f1452ag == 2 && this.f1268w == 2) ? layoutParams2.width + 0 : 0, 0);
        return layoutParams3;
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: n */
    public final int mo716n() {
        return 2;
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: r */
    public final int mo787r() {
        return this.f1237E;
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: v */
    public final void mo791v() {
        super.mo791v();
        if (this.f1161c.m3168G() == 1) {
            if (this.f1161c.m3178R() > 0 && this.f1161c.m3179S() > 0) {
                this.f1255W = this.f1161c.m3178R();
                this.f1256aa = this.f1161c.m3179S();
            }
            StringBuilder sb = new StringBuilder("VideoHalfScreen mMaterialWidth: ");
            sb.append(this.f1255W);
            sb.append(", mMaterialHeight: ");
            sb.append(this.f1256aa);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: x */
    public final void mo793x() {
        View cTAButton;
        super.mo793x();
        int iMo880Q = mo880Q();
        this.f1237E = iMo880Q;
        PanelView panelView = this.f1245M;
        if (panelView != null) {
            panelView.setLayoutType(iMo880Q);
            if (this.f1237E == 7 && this.f1160b.f4333n.m3251D() == 0 && (cTAButton = this.f1245M.getCTAButton()) != null) {
                cTAButton.setVisibility(8);
            }
        }
        if (mo779b(this.f1237E)) {
            mo764F();
        } else {
            mo773O().setVisibility(8);
        }
    }
}
