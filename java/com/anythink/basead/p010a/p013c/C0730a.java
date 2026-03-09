package com.anythink.basead.p010a.p013c;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.p010a.C0731d;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: renamed from: com.anythink.basead.a.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0730a {

    /* JADX INFO: renamed from: a */
    public TextView f560a;

    /* JADX INFO: renamed from: b */
    public View f561b;

    /* JADX INFO: renamed from: c */
    public ImageView f562c;

    /* JADX INFO: renamed from: d */
    public View f563d;

    /* JADX INFO: renamed from: e */
    public View f564e;

    /* JADX INFO: renamed from: f */
    public Context f565f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f566g;

    /* JADX INFO: renamed from: h */
    public boolean f567h;

    /* JADX INFO: renamed from: i */
    public boolean f568i;

    /* JADX INFO: renamed from: j */
    public int f569j;

    /* JADX INFO: renamed from: k */
    public int f570k;

    /* JADX INFO: renamed from: l */
    private ViewGroup f571l;

    /* JADX INFO: renamed from: m */
    private TextView f572m;

    /* JADX INFO: renamed from: n */
    private TextView f573n;

    /* JADX INFO: renamed from: o */
    private TextView f574o;

    /* JADX INFO: renamed from: p */
    private TextView f575p;

    /* JADX INFO: renamed from: com.anythink.basead.a.c.a$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC1247l f579a;

        public AnonymousClass2(AbstractC1247l abstractC1247l) {
            this.f579a = abstractC1247l;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1350n.m4203a(C1175n.m2059a().m2148f(), this.f579a.m3173L());
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.c.a$3, reason: invalid class name */
    public class AnonymousClass3 implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC1247l f581a;

        public AnonymousClass3(AbstractC1247l abstractC1247l) {
            this.f581a = abstractC1247l;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1350n.m4203a(C1175n.m2059a().m2148f(), this.f581a.m3174M());
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.c.a$4, reason: invalid class name */
    public class AnonymousClass4 implements View.OnClickListener {
        public AnonymousClass4() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.c.a$5, reason: invalid class name */
    public class AnonymousClass5 implements View.OnClickListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    public C0730a(Context context) {
        this.f565f = context;
        this.f563d = LayoutInflater.from(context).inflate(C1345i.m4154a(context, "myoffer_letter_top_layout", "layout"), (ViewGroup) null);
        View view = new View(context);
        this.f564e = view;
        view.setBackgroundResource(C1345i.m4154a(context, "myoffer_letter_bottom", C1875i.f11528c));
        this.f560a = (TextView) this.f563d.findViewById(C1345i.m4154a(context, "myoffer_btn_banner_cta", "id"));
        this.f561b = this.f563d.findViewById(C1345i.m4154a(context, "myoffer_letter_icon", "id"));
        this.f571l = (ViewGroup) this.f563d.findViewById(C1345i.m4154a(context, "myoffer_four_element_container", "id"));
        this.f572m = (TextView) this.f563d.findViewById(C1345i.m4154a(context, "myoffer_version_name", "id"));
        this.f573n = (TextView) this.f563d.findViewById(C1345i.m4154a(context, "myoffer_publisher_name", "id"));
        this.f574o = (TextView) this.f563d.findViewById(C1345i.m4154a(context, "myoffer_permission_manage", "id"));
        this.f575p = (TextView) this.f563d.findViewById(C1345i.m4154a(context, "myoffer_privacy_agreement", "id"));
        this.f562c = (ImageView) this.f563d.findViewById(C1345i.m4154a(context, "myoffer_ad_logo", "id"));
    }

    /* JADX INFO: renamed from: a */
    private void m235a(AbstractC1247l abstractC1247l) {
        if (!abstractC1247l.m3176O()) {
            ViewGroup viewGroup = this.f571l;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            TextView textView = this.f572m;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = this.f573n;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TextView textView3 = this.f575p;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TextView textView4 = this.f574o;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            try {
                View viewFindViewById = this.f563d.findViewById(C1345i.m4154a(this.f565f, "myoffer_four_element_container_bg", "id"));
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundDrawable(null);
                    return;
                }
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        this.f572m.setText(this.f565f.getResources().getString(C1345i.m4154a(this.f565f, "myoffer_panel_version", C1875i.f11532g), abstractC1247l.m3172K()));
        this.f573n.setText(abstractC1247l.m3171J());
        this.f575p.setOnClickListener(new AnonymousClass2(abstractC1247l));
        this.f574o.setOnClickListener(new AnonymousClass3(abstractC1247l));
        this.f572m.setOnClickListener(new AnonymousClass4());
        this.f573n.setOnClickListener(new AnonymousClass5());
        ViewGroup viewGroup2 = this.f571l;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        TextView textView5 = this.f572m;
        if (textView5 != null) {
            textView5.setVisibility(0);
        }
        TextView textView6 = this.f573n;
        if (textView6 != null) {
            textView6.setVisibility(0);
        }
        TextView textView7 = this.f575p;
        if (textView7 != null) {
            textView7.setVisibility(0);
        }
        TextView textView8 = this.f574o;
        if (textView8 != null) {
            textView8.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m236a() {
        return this.f569j;
    }

    /* JADX INFO: renamed from: a */
    public final void m237a(int i) {
        this.f569j = (i * 111) / 300;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f563d.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = this.f569j;
        this.f563d.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f564e.getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = (layoutParams.height * 200) / 111;
        this.f564e.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f560a.getLayoutParams();
        layoutParams3.height = (layoutParams.height * 48) / 126;
        layoutParams3.bottomMargin = (this.f569j / 129) * 35;
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f561b.getLayoutParams();
        int i2 = this.f569j;
        layoutParams4.bottomMargin = (i2 / 129) * 35;
        this.f570k = i2 / 3;
    }

    /* JADX INFO: renamed from: a */
    public final void m238a(final View view) {
        if (this.f567h || this.f568i) {
            return;
        }
        this.f567h = true;
        view.postDelayed(new Runnable() { // from class: com.anythink.basead.a.c.a.6
            @Override // java.lang.Runnable
            public final void run() {
                C0730a.this.f566g = ValueAnimator.ofFloat(0.0f, 720.0f);
                C0730a.this.f566g.setDuration(C1659a.f9130f);
                C0730a.this.f566g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.a.c.a.6.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        double dSin = Math.sin(Math.toRadians(((Float) valueAnimator.getAnimatedValue()).floatValue())) * Math.pow(((valueAnimator.getDuration() * 2) - valueAnimator.getCurrentPlayTime()) / (valueAnimator.getDuration() * 2.0f), 2.0d);
                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                        view.setTranslationY(-((float) (((double) C0730a.this.f570k) * dSin)));
                    }
                });
                if (C0730a.this.f566g.isStarted()) {
                    return;
                }
                C0730a.this.f566g.start();
            }
        }, C1659a.f9130f);
    }

    /* JADX INFO: renamed from: a */
    public final void m239a(RelativeLayout relativeLayout, int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, i);
        this.f563d.setLayoutParams(layoutParams);
        relativeLayout.addView(this.f563d, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(8, this.f563d.getId());
        layoutParams2.addRule(5, this.f563d.getId());
        layoutParams2.addRule(7, this.f563d.getId());
        relativeLayout.addView(this.f564e, 0, layoutParams2);
    }

    /* JADX INFO: renamed from: a */
    public final void m240a(AbstractC1247l abstractC1247l, View.OnClickListener onClickListener) {
        if (TextUtils.isEmpty(abstractC1247l.m3165E())) {
            this.f560a.setVisibility(8);
            this.f561b.setVisibility(0);
        } else {
            if (TextUtils.isEmpty(abstractC1247l.m3157A())) {
                this.f560a.setText(C0731d.m243a(this.f565f, abstractC1247l));
            } else {
                this.f560a.setText(abstractC1247l.m3157A());
            }
            this.f560a.setOnClickListener(onClickListener);
            this.f561b.setVisibility(8);
            this.f560a.setVisibility(0);
        }
        if (this.f562c != null) {
            final String strM3241z = abstractC1247l.m3241z();
            if (TextUtils.isEmpty(strM3241z)) {
                this.f562c.setVisibility(8);
            } else {
                final ViewGroup.LayoutParams layoutParams = this.f562c.getLayoutParams();
                C1378b.m4482a(this.f565f).m4494a(new C1381e(1, strM3241z), layoutParams.width, layoutParams.height, new C1378b.a() { // from class: com.anythink.basead.a.c.a.1
                    @Override // com.anythink.core.common.res.C1378b.a
                    public final void onFail(String str, String str2) {
                        C0730a.this.f562c.setVisibility(8);
                    }

                    @Override // com.anythink.core.common.res.C1378b.a
                    public final void onSuccess(String str, Bitmap bitmap) {
                        if (TextUtils.equals(str, strM3241z)) {
                            C0730a.this.f562c.setImageBitmap(bitmap);
                            ViewGroup.LayoutParams layoutParams2 = layoutParams;
                            int i = layoutParams2.height;
                            layoutParams2.width = (int) (i * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                            layoutParams2.height = i;
                            C0730a.this.f562c.setLayoutParams(layoutParams2);
                            C0730a.this.f562c.setScaleType(ImageView.ScaleType.FIT_XY);
                            C0730a.this.f562c.setImageBitmap(bitmap);
                            C0730a.this.f562c.setVisibility(0);
                        }
                    }
                });
            }
        }
        if (!abstractC1247l.m3176O()) {
            ViewGroup viewGroup = this.f571l;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            TextView textView = this.f572m;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = this.f573n;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TextView textView3 = this.f575p;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TextView textView4 = this.f574o;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            try {
                View viewFindViewById = this.f563d.findViewById(C1345i.m4154a(this.f565f, "myoffer_four_element_container_bg", "id"));
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundDrawable(null);
                    return;
                }
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        this.f572m.setText(this.f565f.getResources().getString(C1345i.m4154a(this.f565f, "myoffer_panel_version", C1875i.f11532g), abstractC1247l.m3172K()));
        this.f573n.setText(abstractC1247l.m3171J());
        this.f575p.setOnClickListener(new AnonymousClass2(abstractC1247l));
        this.f574o.setOnClickListener(new AnonymousClass3(abstractC1247l));
        this.f572m.setOnClickListener(new AnonymousClass4());
        this.f573n.setOnClickListener(new AnonymousClass5());
        ViewGroup viewGroup2 = this.f571l;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        TextView textView5 = this.f572m;
        if (textView5 != null) {
            textView5.setVisibility(0);
        }
        TextView textView6 = this.f573n;
        if (textView6 != null) {
            textView6.setVisibility(0);
        }
        TextView textView7 = this.f575p;
        if (textView7 != null) {
            textView7.setVisibility(0);
        }
        TextView textView8 = this.f574o;
        if (textView8 != null) {
            textView8.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m241b() {
        return this.f570k;
    }

    /* JADX INFO: renamed from: c */
    public final void m242c() {
        this.f568i = true;
        try {
            ValueAnimator valueAnimator = this.f566g;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.f566g.cancel();
        } catch (Throwable unused) {
        }
    }
}
