package com.anythink.basead.p025ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.p010a.p013c.C0730a;
import com.anythink.basead.p025ui.animplayerview.BasePlayerView;
import com.anythink.basead.p025ui.p027b.C0992e;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class LetterHalfScreenATView extends HalfScreenATView {

    /* JADX INFO: renamed from: ah */
    public C0730a f1465ah;

    /* JADX INFO: renamed from: ai */
    public int f1466ai;

    /* JADX INFO: renamed from: aj */
    public int f1467aj;

    /* JADX INFO: renamed from: com.anythink.basead.ui.LetterHalfScreenATView$1 */
    public class ViewOnClickListenerC08741 implements View.OnClickListener {
        public ViewOnClickListenerC08741() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LetterHalfScreenATView.this.mo700a(1, 7);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.LetterHalfScreenATView$2 */
    public class ViewOnClickListenerC08752 implements View.OnClickListener {
        public ViewOnClickListenerC08752() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LetterHalfScreenATView.this.mo700a(1, 1);
        }
    }

    public LetterHalfScreenATView(Context context) {
        super(context);
    }

    public LetterHalfScreenATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, String str, int i, int i2) {
        super(context, c1248m, abstractC1247l, str, i, i2);
        if (this.f1178t != null) {
            HashMap map = new HashMap();
            map.put(C0992e.a.f1997a, 1);
            this.f1178t.m1179a(map);
        }
    }

    /* JADX INFO: renamed from: S */
    private void m883S() {
        this.f1465ah.m240a(this.f1161c, new ViewOnClickListenerC08752());
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: F */
    public final void mo764F() {
        if (mo779b(this.f1237E)) {
            super.mo764F();
        } else {
            mo773O().setVisibility(8);
        }
    }

    @Override // com.anythink.basead.p025ui.HalfScreenATView, com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: J */
    public final void mo768J() {
        this.f1246N.setPadding(this.f1244L.getPaddingLeft(), this.f1244L.getPaddingTop(), this.f1244L.getPaddingRight(), this.f1244L.getPaddingBottom());
        super.mo768J();
    }

    @Override // com.anythink.basead.p025ui.HalfScreenATView
    /* JADX INFO: renamed from: Q */
    public final int mo880Q() {
        return 9;
    }

    @Override // com.anythink.basead.p025ui.HalfScreenATView
    /* JADX INFO: renamed from: R */
    public final void mo881R() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1245M.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f1243K.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f1244L.getLayoutParams();
        int i = this.f1269x;
        int i2 = (i - layoutParams2.leftMargin) - layoutParams2.rightMargin;
        int i3 = this.f1466ai;
        int i4 = i2 - (i3 * 2);
        this.f1271z = i4;
        this.f1233A = i4;
        this.f1465ah.m237a(i - (i3 * 2));
        int iM236a = this.f1465ah.m236a();
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        this.f1243K.setLayoutParams(layoutParams2);
        layoutParams3.width = this.f1271z;
        layoutParams3.height = this.f1233A;
        this.f1244L.setLayoutParams(layoutParams3);
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.topMargin = this.f1233A;
        layoutParams.bottomMargin = this.f1465ah.m241b();
        this.f1245M.setLayoutParams(layoutParams);
        PanelView panelView = this.f1245M;
        panelView.setPadding(panelView.getPaddingLeft(), this.f1245M.getPaddingTop(), this.f1245M.getPaddingRight(), (iM236a - this.f1465ah.m241b()) + C1345i.m4153a(getContext(), 9.0f));
        if (!mo779b(this.f1237E)) {
            layoutParams3.bottomMargin = this.f1465ah.m241b();
            layoutParams3.height = (this.f1233A + this.f1465ah.m236a()) - (this.f1465ah.m241b() * 2);
            this.f1244L.setLayoutParams(layoutParams3);
            BasePlayerView basePlayerView = this.f1244L;
            basePlayerView.setPadding(basePlayerView.getPaddingLeft(), this.f1244L.getPaddingTop(), this.f1244L.getPaddingRight(), this.f1465ah.m236a() - (this.f1465ah.m241b() * 2));
        }
        this.f1467aj = layoutParams3.height;
        this.f1465ah.m238a(this.f1243K);
    }

    @Override // com.anythink.basead.p025ui.HalfScreenATView, com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo669a() {
        this.f1466ai = C1345i.m4153a(getContext(), 38.0f);
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_half_screen_letter_vertical", "layout"), this);
        int i = this.f1466ai;
        setPadding(i, 0, i, 0);
        setBackgroundResource(C1345i.m4154a(getContext(), "dailog_background_color", C1875i.f11529d));
    }

    @Override // com.anythink.basead.p025ui.HalfScreenATView, com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: b */
    public final void mo777b() {
        AbstractC1249n abstractC1249n;
        super.mo777b();
        C1248m c1248m = this.f1160b;
        if (c1248m == null || (abstractC1249n = c1248m.f4333n) == null || abstractC1249n.m3251D() != 0) {
            return;
        }
        this.f1243K.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.LetterHalfScreenATView.1
            public ViewOnClickListenerC08741() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LetterHalfScreenATView.this.mo700a(1, 7);
            }
        });
    }

    @Override // com.anythink.basead.p025ui.HalfScreenATView, com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: b */
    public final boolean mo779b(int i) {
        if (this.f1161c.m3210k()) {
            return false;
        }
        return (TextUtils.isEmpty(this.f1161c.m3237x()) && TextUtils.isEmpty(this.f1161c.m3233v()) && TextUtils.isEmpty(this.f1161c.m3235w())) ? false : true;
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: c */
    public final void mo780c() {
        super.mo780c();
        C0730a c0730a = new C0730a(getContext());
        this.f1465ah = c0730a;
        c0730a.m239a((RelativeLayout) this.f1243K.getParent(), this.f1243K.getId());
        this.f1465ah.m240a(this.f1161c, new ViewOnClickListenerC08752());
    }

    @Override // com.anythink.basead.p025ui.HalfScreenATView, com.anythink.basead.p025ui.BaseScreenATView, com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: m */
    public final RelativeLayout.LayoutParams mo715m() {
        int i = (this.f1467aj * 2) / 3;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, i, 0, 0);
        return layoutParams;
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: u */
    public final void mo790u() {
        super.mo790u();
        C0730a c0730a = this.f1465ah;
        if (c0730a != null) {
            c0730a.m242c();
        }
    }
}
