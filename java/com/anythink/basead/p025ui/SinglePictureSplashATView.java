package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.p010a.C0731d;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p025ui.p028c.InterfaceC0995a;
import com.anythink.basead.p025ui.p029d.C0996a;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1339c;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p071ui.component.RoundImageView;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import p285z2.InterfaceC4047k3;

/* JADX INFO: loaded from: classes.dex */
public class SinglePictureSplashATView extends BaseSdkSplashATView {

    /* JADX INFO: renamed from: com.anythink.basead.ui.SinglePictureSplashATView$1 */
    public class C09371 implements InterfaceC0995a {
        public C09371() {
        }

        @Override // com.anythink.basead.p025ui.p028c.InterfaceC0995a
        /* JADX INFO: renamed from: a */
        public final void mo672a(int i, int i2) {
            SinglePictureSplashATView.this.mo700a(i, i2);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.SinglePictureSplashATView$2 */
    public class C09382 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RoundImageView f1707a;

        /* JADX INFO: renamed from: com.anythink.basead.ui.SinglePictureSplashATView$2$1 */
        public class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ WrapRoundImageView f1709a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bitmap f1710b;

            public AnonymousClass1(WrapRoundImageView wrapRoundImageView, Bitmap bitmap) {
                wrapRoundImageView = wrapRoundImageView;
                bitmap = bitmap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                wrapRoundImageView.setBitmapAndResize(bitmap, SinglePictureSplashATView.this.getWidth(), SinglePictureSplashATView.this.getHeight());
            }
        }

        /* JADX INFO: renamed from: com.anythink.basead.ui.SinglePictureSplashATView$2$2 */
        public class AnonymousClass2 implements C1339c.a {
            public AnonymousClass2() {
            }

            @Override // com.anythink.core.common.p066o.C1339c.a
            /* JADX INFO: renamed from: a */
            public final void mo673a() {
            }

            @Override // com.anythink.core.common.p066o.C1339c.a
            /* JADX INFO: renamed from: a */
            public final void mo674a(Bitmap bitmap) {
                roundImageView.setImageBitmap(bitmap);
            }
        }

        public C09382(RoundImageView roundImageView) {
            roundImageView = roundImageView;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, SinglePictureSplashATView.this.f1161c.m3239y())) {
                SinglePictureSplashATView singlePictureSplashATView = SinglePictureSplashATView.this;
                WrapRoundImageView wrapRoundImageView = (WrapRoundImageView) singlePictureSplashATView.findViewById(C1345i.m4154a(singlePictureSplashATView.getContext(), "myoffer_splash_ad_content_image_area", "id"));
                if (SinglePictureSplashATView.this.f1160b.f4333n.m3367p() == 2) {
                    wrapRoundImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    wrapRoundImageView.setImageBitmap(bitmap);
                } else {
                    wrapRoundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    wrapRoundImageView.post(new Runnable() { // from class: com.anythink.basead.ui.SinglePictureSplashATView.2.1

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ WrapRoundImageView f1709a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ Bitmap f1710b;

                        public AnonymousClass1(WrapRoundImageView wrapRoundImageView2, Bitmap bitmap2) {
                            wrapRoundImageView = wrapRoundImageView2;
                            bitmap = bitmap2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            wrapRoundImageView.setBitmapAndResize(bitmap, SinglePictureSplashATView.this.getWidth(), SinglePictureSplashATView.this.getHeight());
                        }
                    });
                }
                if (roundImageView != null) {
                    C1339c.m4025a(SinglePictureSplashATView.this.getContext(), bitmap2, new C1339c.a() { // from class: com.anythink.basead.ui.SinglePictureSplashATView.2.2
                        public AnonymousClass2() {
                        }

                        @Override // com.anythink.core.common.p066o.C1339c.a
                        /* JADX INFO: renamed from: a */
                        public final void mo673a() {
                        }

                        @Override // com.anythink.core.common.p066o.C1339c.a
                        /* JADX INFO: renamed from: a */
                        public final void mo674a(Bitmap bitmap2) {
                            roundImageView.setImageBitmap(bitmap2);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.SinglePictureSplashATView$3 */
    public class RunnableC09393 implements Runnable {
        public RunnableC09393() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SinglePictureSplashATView singlePictureSplashATView;
            String str;
            SinglePictureSplashATView singlePictureSplashATView2 = SinglePictureSplashATView.this;
            if (singlePictureSplashATView2.f1333H == null) {
                return;
            }
            int width = singlePictureSplashATView2.getWidth();
            int height = SinglePictureSplashATView.this.getHeight();
            int i = (int) (((double) SinglePictureSplashATView.this.getResources().getDisplayMetrics().widthPixels) * 0.5d);
            int i2 = (int) (((double) SinglePictureSplashATView.this.getResources().getDisplayMetrics().heightPixels) * 0.5d);
            if (width < i) {
                singlePictureSplashATView = SinglePictureSplashATView.this;
                str = "Splash display width is less than 50% of screen width!";
            } else {
                singlePictureSplashATView = SinglePictureSplashATView.this;
                if (height >= i2) {
                    SinglePictureSplashATView.super.mo710h();
                    return;
                }
                str = "Splash display height is less than 50% of screen height!";
            }
            singlePictureSplashATView.m839a(C0748f.m310a(C0748f.f729k, str));
            Log.e("anythink", str);
        }
    }

    public SinglePictureSplashATView(Context context) {
        super(context);
    }

    public SinglePictureSplashATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, InterfaceC0771a interfaceC0771a) {
        super(context, c1248m, abstractC1247l, interfaceC0771a);
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo669a() {
        LayoutInflater layoutInflaterFrom;
        Context context;
        String str;
        if (this.f1160b.f4333n.m3381w() == 2) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
            context = getContext();
            str = "myoffer_splash_ad_layout_single_land";
        } else {
            layoutInflaterFrom = LayoutInflater.from(getContext());
            context = getContext();
            str = "myoffer_splash_ad_layout_single_port";
        }
        View viewInflate = layoutInflaterFrom.inflate(C1345i.m4154a(context, str, "layout"), this);
        mo817o();
        C0996a c0996a = this.f1337L;
        if (c0996a != null) {
            c0996a.m1207a(-102).m1208a(new InterfaceC0995a() { // from class: com.anythink.basead.ui.SinglePictureSplashATView.1
                public C09371() {
                }

                @Override // com.anythink.basead.p025ui.p028c.InterfaceC0995a
                /* JADX INFO: renamed from: a */
                public final void mo672a(int i, int i2) {
                    SinglePictureSplashATView.this.mo700a(i, i2);
                }
            }).m1210a(getContext(), viewInflate);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseSdkSplashATView
    /* JADX INFO: renamed from: b */
    public final void mo670b() {
        TextView textView = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_splash_ad_install_btn", "id"));
        this.f1177s = textView;
        C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1161c.m3239y()), getResources().getDisplayMetrics().widthPixels, (getResources().getDisplayMetrics().widthPixels * 627) / InterfaceC4047k3.Ooooooo, new C1378b.a() { // from class: com.anythink.basead.ui.SinglePictureSplashATView.2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ RoundImageView f1707a;

            /* JADX INFO: renamed from: com.anythink.basead.ui.SinglePictureSplashATView$2$1 */
            public class AnonymousClass1 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ WrapRoundImageView f1709a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Bitmap f1710b;

                public AnonymousClass1(WrapRoundImageView wrapRoundImageView2, Bitmap bitmap2) {
                    wrapRoundImageView = wrapRoundImageView2;
                    bitmap = bitmap2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    wrapRoundImageView.setBitmapAndResize(bitmap, SinglePictureSplashATView.this.getWidth(), SinglePictureSplashATView.this.getHeight());
                }
            }

            /* JADX INFO: renamed from: com.anythink.basead.ui.SinglePictureSplashATView$2$2 */
            public class AnonymousClass2 implements C1339c.a {
                public AnonymousClass2() {
                }

                @Override // com.anythink.core.common.p066o.C1339c.a
                /* JADX INFO: renamed from: a */
                public final void mo673a() {
                }

                @Override // com.anythink.core.common.p066o.C1339c.a
                /* JADX INFO: renamed from: a */
                public final void mo674a(Bitmap bitmap2) {
                    roundImageView.setImageBitmap(bitmap2);
                }
            }

            public C09382(RoundImageView roundImageView) {
                roundImageView = roundImageView;
            }

            @Override // com.anythink.core.common.res.C1378b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.C1378b.a
            public final void onSuccess(String str, Bitmap bitmap2) {
                if (TextUtils.equals(str, SinglePictureSplashATView.this.f1161c.m3239y())) {
                    SinglePictureSplashATView singlePictureSplashATView = SinglePictureSplashATView.this;
                    WrapRoundImageView wrapRoundImageView2 = (WrapRoundImageView) singlePictureSplashATView.findViewById(C1345i.m4154a(singlePictureSplashATView.getContext(), "myoffer_splash_ad_content_image_area", "id"));
                    if (SinglePictureSplashATView.this.f1160b.f4333n.m3367p() == 2) {
                        wrapRoundImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        wrapRoundImageView2.setImageBitmap(bitmap2);
                    } else {
                        wrapRoundImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        wrapRoundImageView2.post(new Runnable() { // from class: com.anythink.basead.ui.SinglePictureSplashATView.2.1

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ WrapRoundImageView f1709a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ Bitmap f1710b;

                            public AnonymousClass1(WrapRoundImageView wrapRoundImageView22, Bitmap bitmap22) {
                                wrapRoundImageView = wrapRoundImageView22;
                                bitmap = bitmap22;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                wrapRoundImageView.setBitmapAndResize(bitmap, SinglePictureSplashATView.this.getWidth(), SinglePictureSplashATView.this.getHeight());
                            }
                        });
                    }
                    if (roundImageView != null) {
                        C1339c.m4025a(SinglePictureSplashATView.this.getContext(), bitmap22, new C1339c.a() { // from class: com.anythink.basead.ui.SinglePictureSplashATView.2.2
                            public AnonymousClass2() {
                            }

                            @Override // com.anythink.core.common.p066o.C1339c.a
                            /* JADX INFO: renamed from: a */
                            public final void mo673a() {
                            }

                            @Override // com.anythink.core.common.p066o.C1339c.a
                            /* JADX INFO: renamed from: a */
                            public final void mo674a(Bitmap bitmap22) {
                                roundImageView.setImageBitmap(bitmap22);
                            }
                        });
                    }
                }
            }
        });
        AbstractC1249n abstractC1249n = this.f1160b.f4333n;
        if (abstractC1249n == null || textView == null) {
            return;
        }
        if (abstractC1249n.m3251D() == 0 || mo713k()) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (TextUtils.isEmpty(this.f1161c.m3157A())) {
            textView.setText(C0731d.m243a(getContext(), this.f1161c));
        } else {
            textView.setText(this.f1161c.m3157A());
        }
        this.f1174p.add(textView);
    }

    @Override // com.anythink.basead.p025ui.BaseSdkSplashATView
    /* JADX INFO: renamed from: c */
    public final void mo671c() {
        super.mo701a(this.f1160b.f4333n.m3287V() < 0 ? 100 : this.f1160b.f4333n.m3287V(), new Runnable() { // from class: com.anythink.basead.ui.SinglePictureSplashATView.3
            public RunnableC09393() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SinglePictureSplashATView singlePictureSplashATView;
                String str;
                SinglePictureSplashATView singlePictureSplashATView2 = SinglePictureSplashATView.this;
                if (singlePictureSplashATView2.f1333H == null) {
                    return;
                }
                int width = singlePictureSplashATView2.getWidth();
                int height = SinglePictureSplashATView.this.getHeight();
                int i = (int) (((double) SinglePictureSplashATView.this.getResources().getDisplayMetrics().widthPixels) * 0.5d);
                int i2 = (int) (((double) SinglePictureSplashATView.this.getResources().getDisplayMetrics().heightPixels) * 0.5d);
                if (width < i) {
                    singlePictureSplashATView = SinglePictureSplashATView.this;
                    str = "Splash display width is less than 50% of screen width!";
                } else {
                    singlePictureSplashATView = SinglePictureSplashATView.this;
                    if (height >= i2) {
                        SinglePictureSplashATView.super.mo710h();
                        return;
                    }
                    str = "Splash display height is less than 50% of screen height!";
                }
                singlePictureSplashATView.m839a(C0748f.m310a(C0748f.f729k, str));
                Log.e("anythink", str);
            }
        });
    }
}
