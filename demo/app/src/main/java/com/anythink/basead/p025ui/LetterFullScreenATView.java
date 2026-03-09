package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.basead.p010a.p013c.C0730a;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;

/* JADX INFO: loaded from: classes.dex */
public class LetterFullScreenATView extends FullScreenATView {

    /* JADX INFO: renamed from: ad */
    public C0730a f1456ad;

    /* JADX INFO: renamed from: ae */
    public int f1457ae;

    /* JADX INFO: renamed from: af */
    public int f1458af;

    /* JADX INFO: renamed from: ag */
    public int f1459ag;

    /* JADX INFO: renamed from: ah */
    public int f1460ah;

    /* JADX INFO: renamed from: ai */
    public int f1461ai;

    /* JADX INFO: renamed from: aj */
    public int f1462aj;

    /* JADX INFO: renamed from: com.anythink.basead.ui.LetterFullScreenATView$1 */
    public class ViewOnClickListenerC08721 implements View.OnClickListener {
        public ViewOnClickListenerC08721() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LetterFullScreenATView.this.mo700a(1, 7);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.LetterFullScreenATView$2 */
    public class ViewOnClickListenerC08732 implements View.OnClickListener {
        public ViewOnClickListenerC08732() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LetterFullScreenATView.this.mo700a(1, 1);
        }
    }

    public LetterFullScreenATView(Context context) {
        super(context);
        this.f1457ae = C1345i.m4153a(getContext(), 13.0f);
        this.f1458af = C1345i.m4153a(getContext(), 60.0f);
        this.f1459ag = C1345i.m4153a(getContext(), 53.0f);
        this.f1460ah = C1345i.m4153a(getContext(), 17.0f);
    }

    public LetterFullScreenATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, String str, int i, int i2) {
        super(context, c1248m, abstractC1247l, str, i, i2);
        this.f1457ae = C1345i.m4153a(getContext(), 13.0f);
        this.f1458af = C1345i.m4153a(getContext(), 60.0f);
        this.f1459ag = C1345i.m4153a(getContext(), 53.0f);
        this.f1460ah = C1345i.m4153a(getContext(), 17.0f);
    }

    /* JADX INFO: renamed from: R */
    private void m882R() {
        this.f1457ae = (this.f1269x - ((int) (((double) ((this.f1270y - this.f1459ag) - this.f1458af)) * 0.49714285714285716d))) / 2;
    }

    @Override // com.anythink.basead.p025ui.FullScreenATView, com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: F */
    public final void mo764F() {
        if (mo779b(this.f1237E)) {
            super.mo764F();
        } else {
            mo773O().setVisibility(8);
        }
    }

    @Override // com.anythink.basead.p025ui.FullScreenATView, com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: J */
    public final void mo768J() {
        m874Q();
        if (mo779b(this.f1237E)) {
            PanelView panelViewMo773O = mo773O();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) panelViewMo773O.getLayoutParams();
            layoutParams.addRule(3, this.f1246N.getId());
            layoutParams.height = -2;
            layoutParams.bottomMargin = this.f1456ad.m241b();
            layoutParams.addRule(12, 0);
            panelViewMo773O.setPadding(0, C1345i.m4153a(getContext(), 30.0f), 0, (((this.f1456ad.m241b() / 129) * 69) + this.f1456ad.m236a()) - layoutParams.bottomMargin);
            panelViewMo773O.setBackgroundColor(-1);
            this.f1246N.getLayoutParams().height = this.f1461ai;
        } else {
            ((RelativeLayout.LayoutParams) this.f1246N.getLayoutParams()).bottomMargin = this.f1462aj;
            this.f1246N.getLayoutParams().height = this.f1461ai;
            this.f1246N.setPadding(0, 0, 0, (this.f1456ad.m236a() - this.f1462aj) - this.f1456ad.m241b());
            mo765G();
        }
        this.f1456ad.m238a(this.f1243K);
    }

    @Override // com.anythink.basead.p025ui.FullScreenATView, com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: K */
    public final void mo769K() {
        super.mo769K();
        Drawable drawableMo724b = this.f1246N.mo724b();
        if (drawableMo724b != null) {
            setBackgroundDrawable(drawableMo724b);
        }
    }

    @Override // com.anythink.basead.p025ui.FullScreenATView, com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo669a() {
        AbstractC1249n abstractC1249n;
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_letter_full_screen", "layout"), this);
        setGravity(13);
        C1248m c1248m = this.f1160b;
        if (c1248m == null || (abstractC1249n = c1248m.f4333n) == null || abstractC1249n.m3251D() != 0) {
            return;
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.LetterFullScreenATView.1
            public ViewOnClickListenerC08721() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LetterFullScreenATView.this.mo700a(1, 7);
            }
        });
    }

    @Override // com.anythink.basead.p025ui.FullScreenATView, com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: b */
    public final void mo777b() {
        this.f1457ae = (this.f1269x - ((int) (((double) ((this.f1270y - this.f1459ag) - this.f1458af)) * 0.49714285714285716d))) / 2;
        super.mo777b();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1243K.getLayoutParams();
        int i = this.f1460ah;
        layoutParams.setMargins(i, this.f1458af, i, this.f1459ag);
        int i2 = this.f1457ae;
        setPadding(i2, 0, i2, 0);
    }

    @Override // com.anythink.basead.p025ui.FullScreenATView, com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: b */
    public final boolean mo779b(int i) {
        if (this.f1161c.m3210k()) {
            return false;
        }
        return (TextUtils.isEmpty(this.f1161c.m3237x()) && TextUtils.isEmpty(this.f1161c.m3233v()) && TextUtils.isEmpty(this.f1161c.m3235w())) ? false : true;
    }

    @Override // com.anythink.basead.p025ui.FullScreenATView, com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: c */
    public final void mo780c() {
        super.mo780c();
        C0730a c0730a = new C0730a(getContext());
        this.f1456ad = c0730a;
        c0730a.m240a(this.f1161c, new View.OnClickListener() { // from class: com.anythink.basead.ui.LetterFullScreenATView.2
            public ViewOnClickListenerC08732() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LetterFullScreenATView.this.mo700a(1, 1);
            }
        });
        this.f1456ad.m239a(this, this.f1243K.getId());
        this.f1456ad.m237a(this.f1269x - (this.f1457ae * 2));
        this.f1461ai = (this.f1269x - (this.f1457ae * 2)) - (this.f1460ah * 2);
        if (mo779b(this.f1237E)) {
            return;
        }
        this.f1462aj = this.f1456ad.m241b();
        this.f1461ai = ((this.f1461ai + this.f1456ad.m236a()) - this.f1462aj) - this.f1456ad.m241b();
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView, com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: m */
    public final RelativeLayout.LayoutParams mo715m() {
        int i = (this.f1461ai * 2) / 3;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, i, 0, 0);
        return layoutParams;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(1140850688);
    }

    @Override // com.anythink.basead.p025ui.FullScreenATView, com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: r */
    public final int mo787r() {
        return this.f1237E;
    }

    @Override // com.anythink.basead.p025ui.FullScreenATView, com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: x */
    public final void mo793x() {
        this.f1237E = 9;
        PanelView panelViewMo773O = mo773O();
        if (panelViewMo773O != null) {
            panelViewMo773O.setLayoutType(this.f1237E);
            ((LinearLayout.LayoutParams) panelViewMo773O.findViewById(C1345i.m4154a(getContext(), "myoffer_iv_banner_icon", "id")).getLayoutParams()).bottomMargin = C1345i.m4153a(getContext(), 30.0f);
        }
    }
}
