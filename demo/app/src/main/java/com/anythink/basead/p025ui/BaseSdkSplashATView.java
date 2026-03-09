package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1209ab;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p055f.C1261z;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.core.common.p071ui.component.RoundImageView;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseSdkSplashATView extends BaseSplashATView {
    public static final int TYPE_ASSEBLEM = 1;
    public static final int TYPE_SINGLE_PICTURE = 0;

    /* JADX INFO: renamed from: A */
    public TextView f1290A;

    /* JADX INFO: renamed from: B */
    public final View.OnClickListener f1291B;

    /* JADX INFO: renamed from: v */
    public RoundImageView f1292v;

    /* JADX INFO: renamed from: w */
    public ViewGroup f1293w;

    /* JADX INFO: renamed from: x */
    public TextView f1294x;

    /* JADX INFO: renamed from: y */
    public TextView f1295y;

    /* JADX INFO: renamed from: z */
    public TextView f1296z;

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseSdkSplashATView$1 */
    public class ViewOnClickListenerC08341 implements View.OnClickListener {
        public ViewOnClickListenerC08341() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AbstractC1249n abstractC1249n = BaseSdkSplashATView.this.f1160b.f4333n;
            if (abstractC1249n == null || abstractC1249n.m3251D() != 0) {
                return;
            }
            BaseSdkSplashATView.super.mo700a(1, 3);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseSdkSplashATView$2 */
    public class ViewOnClickListenerC08352 implements View.OnClickListener {
        public ViewOnClickListenerC08352() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1350n.m4203a(C1175n.m2059a().m2148f(), BaseSdkSplashATView.this.f1161c.m3173L());
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseSdkSplashATView$3 */
    public class ViewOnClickListenerC08363 implements View.OnClickListener {
        public ViewOnClickListenerC08363() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1350n.m4203a(C1175n.m2059a().m2148f(), BaseSdkSplashATView.this.f1161c.m3174M());
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseSdkSplashATView$4 */
    public class C08374 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup.LayoutParams f1300a;

        public C08374(ViewGroup.LayoutParams layoutParams) {
            layoutParams = layoutParams;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
            BaseSdkSplashATView.this.f1292v.setVisibility(8);
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, BaseSdkSplashATView.this.f1161c.m3241z())) {
                ViewGroup.LayoutParams layoutParams = layoutParams;
                int i = layoutParams.height;
                layoutParams.width = (int) (i * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                layoutParams.height = i;
                BaseSdkSplashATView.this.f1292v.setLayoutParams(layoutParams);
                BaseSdkSplashATView.this.f1292v.setScaleType(ImageView.ScaleType.FIT_XY);
                BaseSdkSplashATView.this.f1292v.setImageBitmap(bitmap);
                BaseSdkSplashATView.this.f1292v.setVisibility(0);
            }
        }
    }

    public BaseSdkSplashATView(Context context) {
        super(context);
        this.f1291B = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSdkSplashATView.1
            public ViewOnClickListenerC08341() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC1249n abstractC1249n = BaseSdkSplashATView.this.f1160b.f4333n;
                if (abstractC1249n == null || abstractC1249n.m3251D() != 0) {
                    return;
                }
                BaseSdkSplashATView.super.mo700a(1, 3);
            }
        };
    }

    public BaseSdkSplashATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, InterfaceC0771a interfaceC0771a) {
        super(context, c1248m, abstractC1247l, interfaceC0771a);
        this.f1291B = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSdkSplashATView.1
            public ViewOnClickListenerC08341() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC1249n abstractC1249n = BaseSdkSplashATView.this.f1160b.f4333n;
                if (abstractC1249n == null || abstractC1249n.m3251D() != 0) {
                    return;
                }
                BaseSdkSplashATView.super.mo700a(1, 3);
            }
        };
        mo671c();
        mo818p();
        mo698a(this.f1329D, this.f1160b.f4333n.m3363n());
    }

    public static boolean isSinglePicture(AbstractC1247l abstractC1247l, AbstractC1249n abstractC1249n) {
        return ((abstractC1247l instanceof C1261z) && (abstractC1249n instanceof C1209ab)) ? 2 == ((C1209ab) abstractC1249n).m2432at() : (abstractC1247l instanceof AbstractC1217aj) && 1 == ((AbstractC1217aj) abstractC1247l).m2490ai();
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo670b();

    /* JADX INFO: renamed from: c */
    public abstract void mo671c();

    /* JADX INFO: renamed from: o */
    public void mo817o() {
        mo670b();
        this.f1293w = (ViewGroup) findViewById(C1345i.m4154a(getContext(), "myoffer_four_element_container", "id"));
        this.f1294x = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_publisher_name", "id"));
        this.f1295y = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_privacy_agreement", "id"));
        this.f1296z = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_permission_manage", "id"));
        this.f1290A = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_version_name", "id"));
        if (this.f1161c.m3176O()) {
            ViewGroup viewGroup = this.f1293w;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            TextView textView = this.f1294x;
            if (textView != null) {
                textView.setVisibility(0);
                this.f1294x.setText(this.f1161c.m3171J());
                this.f1174p.add(this.f1294x);
            }
            TextView textView2 = this.f1295y;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.f1295y.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSdkSplashATView.2
                    public ViewOnClickListenerC08352() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1350n.m4203a(C1175n.m2059a().m2148f(), BaseSdkSplashATView.this.f1161c.m3173L());
                    }
                });
            }
            TextView textView3 = this.f1296z;
            if (textView3 != null) {
                textView3.setVisibility(0);
                this.f1296z.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSdkSplashATView.3
                    public ViewOnClickListenerC08363() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1350n.m4203a(C1175n.m2059a().m2148f(), BaseSdkSplashATView.this.f1161c.m3174M());
                    }
                });
            }
            TextView textView4 = this.f1290A;
            if (textView4 != null) {
                textView4.setVisibility(0);
                this.f1290A.setText(getContext().getResources().getString(C1345i.m4154a(getContext(), "myoffer_panel_version", C1875i.f11532g), this.f1161c.m3172K()));
                this.f1174p.add(this.f1290A);
            }
        } else {
            ViewGroup viewGroup2 = this.f1293w;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            TextView textView5 = this.f1290A;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            TextView textView6 = this.f1294x;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            TextView textView7 = this.f1295y;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            TextView textView8 = this.f1296z;
            if (textView8 != null) {
                textView8.setVisibility(8);
            }
            try {
                View viewFindViewById = findViewById(C1345i.m4154a(getContext(), "myoffer_four_element_container_bg", "id"));
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundDrawable(null);
                }
            } catch (Throwable unused) {
            }
        }
        RoundImageView roundImageView = (RoundImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_ad_logo", "id"));
        this.f1292v = roundImageView;
        ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
        if (!TextUtils.isEmpty(this.f1161c.m3241z())) {
            this.f1292v.setVisibility(0);
            int i = layoutParams.width;
            C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1161c.m3241z()), i, i, new C1378b.a() { // from class: com.anythink.basead.ui.BaseSdkSplashATView.4

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ViewGroup.LayoutParams f1300a;

                public C08374(ViewGroup.LayoutParams layoutParams2) {
                    layoutParams = layoutParams2;
                }

                @Override // com.anythink.core.common.res.C1378b.a
                public final void onFail(String str, String str2) {
                    BaseSdkSplashATView.this.f1292v.setVisibility(8);
                }

                @Override // com.anythink.core.common.res.C1378b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(str, BaseSdkSplashATView.this.f1161c.m3241z())) {
                        ViewGroup.LayoutParams layoutParams2 = layoutParams;
                        int i2 = layoutParams2.height;
                        layoutParams2.width = (int) (i2 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                        layoutParams2.height = i2;
                        BaseSdkSplashATView.this.f1292v.setLayoutParams(layoutParams2);
                        BaseSdkSplashATView.this.f1292v.setScaleType(ImageView.ScaleType.FIT_XY);
                        BaseSdkSplashATView.this.f1292v.setImageBitmap(bitmap);
                        BaseSdkSplashATView.this.f1292v.setVisibility(0);
                    }
                }
            });
        } else if (this.f1161c.m3175N() != null) {
            Bitmap bitmapM3175N = this.f1161c.m3175N();
            int i2 = layoutParams2.height;
            layoutParams2.width = (int) (i2 * ((bitmapM3175N.getWidth() * 1.0f) / bitmapM3175N.getHeight()));
            layoutParams2.height = i2;
            this.f1292v.setLayoutParams(layoutParams2);
            this.f1292v.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f1292v.setImageBitmap(bitmapM3175N);
            this.f1292v.setImageBitmap(this.f1161c.m3175N());
            this.f1292v.setVisibility(0);
        } else {
            this.f1292v.setVisibility(8);
        }
        this.f1174p.add(this.f1292v);
    }

    @Override // com.anythink.basead.p025ui.BaseSplashATView
    /* JADX INFO: renamed from: p */
    public void mo818p() {
        super.mo818p();
        setOnClickListener(this.f1291B);
    }
}
