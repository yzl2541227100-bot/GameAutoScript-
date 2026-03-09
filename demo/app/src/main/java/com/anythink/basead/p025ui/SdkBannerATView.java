package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.p010a.p012b.C0724c;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p055f.C1261z;
import com.anythink.core.common.p066o.C1339c;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.core.common.p071ui.component.RoundImageView;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import com.anythink.core.common.res.image.RecycleImageView;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class SdkBannerATView extends BaseBannerATView {

    /* JADX INFO: renamed from: B */
    private static final int f1655B = 1;

    /* JADX INFO: renamed from: C */
    private static final int f1656C = 2;

    /* JADX INFO: renamed from: A */
    private int f1657A;

    /* JADX INFO: renamed from: D */
    private final View.OnClickListener f1658D;

    /* JADX INFO: renamed from: E */
    private final View.OnClickListener f1659E;

    /* JADX INFO: renamed from: y */
    public boolean f1660y;

    /* JADX INFO: renamed from: z */
    public String f1661z;

    /* JADX INFO: renamed from: com.anythink.basead.ui.SdkBannerATView$10 */
    public class C092210 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f1663a;

        public C092210(ImageView imageView) {
            this.f1663a = imageView;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(SdkBannerATView.this.f1161c.m3241z(), str)) {
                this.f1663a.setImageBitmap(bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.SdkBannerATView$11 */
    public class ViewOnClickListenerC092311 implements View.OnClickListener {
        public ViewOnClickListenerC092311() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.SdkBannerATView$12 */
    public class ViewOnClickListenerC092412 implements View.OnClickListener {
        public ViewOnClickListenerC092412() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1350n.m4203a(C1175n.m2059a().m2148f(), SdkBannerATView.this.f1161c.m3173L());
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.SdkBannerATView$13 */
    public class ViewOnClickListenerC092513 implements View.OnClickListener {
        public ViewOnClickListenerC092513() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1350n.m4203a(C1175n.m2059a().m2148f(), SdkBannerATView.this.f1161c.m3174M());
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.SdkBannerATView$14 */
    public class ViewOnClickListenerC092614 implements View.OnClickListener {
        public ViewOnClickListenerC092614() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.SdkBannerATView$15 */
    public class C092715 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RoundImageView f1669a;

        public C092715(RoundImageView roundImageView) {
            this.f1669a = roundImageView;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(SdkBannerATView.this.f1161c.m3237x(), str)) {
                this.f1669a.setImageBitmap(bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.SdkBannerATView$2 */
    public class C09282 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f1671a;

        public C09282(ImageView imageView) {
            this.f1671a = imageView;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(SdkBannerATView.this.f1161c.m3241z(), str)) {
                this.f1671a.setImageBitmap(bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.SdkBannerATView$3 */
    public class C09293 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RoundImageView f1673a;

        public C09293(RoundImageView roundImageView) {
            this.f1673a = roundImageView;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(SdkBannerATView.this.f1161c.m3239y(), str)) {
                this.f1673a.setImageBitmap(bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.SdkBannerATView$4 */
    public class ViewOnClickListenerC09304 implements View.OnClickListener {
        public ViewOnClickListenerC09304() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.SdkBannerATView$5 */
    public class ViewOnClickListenerC09315 implements View.OnClickListener {
        public ViewOnClickListenerC09315() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1350n.m4203a(C1175n.m2059a().m2148f(), SdkBannerATView.this.f1161c.m3173L());
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.SdkBannerATView$6 */
    public class ViewOnClickListenerC09326 implements View.OnClickListener {
        public ViewOnClickListenerC09326() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1350n.m4203a(C1175n.m2059a().m2148f(), SdkBannerATView.this.f1161c.m3174M());
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.SdkBannerATView$7 */
    public class ViewOnClickListenerC09337 implements View.OnClickListener {
        public ViewOnClickListenerC09337() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.SdkBannerATView$9 */
    public class C09359 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f1680a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RecycleImageView f1681b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ RecycleImageView f1682c;

        public C09359(String str, RecycleImageView recycleImageView, RecycleImageView recycleImageView2) {
            this.f1680a = str;
            this.f1681b = recycleImageView;
            this.f1682c = recycleImageView2;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, final Bitmap bitmap) {
            if (TextUtils.equals(this.f1680a, str)) {
                this.f1681b.setImageBitmap(bitmap);
                SdkBannerATView.this.post(new Runnable() { // from class: com.anythink.basead.ui.SdkBannerATView.9.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int[] iArrM4270a = C1360x.m4270a(SdkBannerATView.this.getWidth(), SdkBannerATView.this.getHeight(), bitmap.getWidth() / bitmap.getHeight());
                        ViewGroup.LayoutParams layoutParams = C09359.this.f1681b.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = iArrM4270a[0];
                            layoutParams.height = iArrM4270a[1];
                            C09359.this.f1681b.setLayoutParams(layoutParams);
                        }
                    }
                });
                C1339c.m4025a(SdkBannerATView.this.getContext(), bitmap, new C1339c.a() { // from class: com.anythink.basead.ui.SdkBannerATView.9.2
                    @Override // com.anythink.core.common.p066o.C1339c.a
                    /* JADX INFO: renamed from: a */
                    public final void mo673a() {
                    }

                    @Override // com.anythink.core.common.p066o.C1339c.a
                    /* JADX INFO: renamed from: a */
                    public final void mo674a(Bitmap bitmap2) {
                        C09359.this.f1682c.setImageBitmap(bitmap2);
                    }
                });
            }
        }
    }

    public SdkBannerATView(Context context) {
        super(context);
        this.f1657A = 2;
        this.f1658D = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (2 != SdkBannerATView.this.f1657A) {
                    SdkBannerATView.super.mo700a(1, 3);
                    return;
                }
                AbstractC1249n abstractC1249n = SdkBannerATView.this.f1160b.f4333n;
                if (abstractC1249n == null || abstractC1249n.m3251D() != 0) {
                    return;
                }
                SdkBannerATView.super.mo700a(1, 3);
            }
        };
        this.f1659E = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerATView sdkBannerATView = SdkBannerATView.this;
                View view2 = sdkBannerATView.f1177s;
                if (view2 == null || view2 != view) {
                    SdkBannerATView.super.mo700a(1, 2);
                } else {
                    SdkBannerATView.super.mo700a(1, 1);
                }
            }
        };
    }

    public SdkBannerATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, InterfaceC0771a interfaceC0771a) {
        super(context, c1248m, abstractC1247l, interfaceC0771a);
        this.f1657A = 2;
        this.f1658D = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (2 != SdkBannerATView.this.f1657A) {
                    SdkBannerATView.super.mo700a(1, 3);
                    return;
                }
                AbstractC1249n abstractC1249n = SdkBannerATView.this.f1160b.f4333n;
                if (abstractC1249n == null || abstractC1249n.m3251D() != 0) {
                    return;
                }
                SdkBannerATView.super.mo700a(1, 3);
            }
        };
        this.f1659E = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerATView sdkBannerATView = SdkBannerATView.this;
                View view2 = sdkBannerATView.f1177s;
                if (view2 == null || view2 != view) {
                    SdkBannerATView.super.mo700a(1, 2);
                } else {
                    SdkBannerATView.super.mo700a(1, 1);
                }
            }
        };
        mo720b();
        mo721c();
    }

    /* JADX INFO: renamed from: a */
    private int m1020a(String str) {
        AbstractC1247l abstractC1247l = this.f1161c;
        int i = 1;
        if (!(abstractC1247l instanceof AbstractC1217aj) ? !(abstractC1247l instanceof C1261z) || TextUtils.isEmpty(str) || !C0724c.m204c(str) : ((AbstractC1217aj) abstractC1247l).m2490ai() != 1) {
            i = 2;
        }
        this.f1657A = i;
        return i;
    }

    /* JADX INFO: renamed from: b */
    private void m1022b(String str) {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_root", "id"));
        this.f1212w = (CloseImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_close", "id"));
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_container", "id"));
        TextView textView = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_publisher_name", "id"));
        TextView textView2 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_privacy_agreement", "id"));
        TextView textView3 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_permission_manage", "id"));
        TextView textView4 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_version_name", "id"));
        if (this.f1160b.f4333n.m3385y() == 0) {
            this.f1212w.setVisibility(0);
            if (TextUtils.equals(AbstractC1249n.f4339d, this.f1661z)) {
                ViewGroup.LayoutParams layoutParams = this.f1212w.getLayoutParams();
                layoutParams.width = C1345i.m4153a(getContext(), 23.0f);
                layoutParams.height = C1345i.m4153a(getContext(), 23.0f);
                this.f1212w.setLayoutParams(layoutParams);
            }
            mo698a(this.f1212w, this.f1160b.f4333n.m3363n());
        } else {
            this.f1212w.setVisibility(8);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        relativeLayout.setLayoutParams(layoutParams2);
        RecycleImageView recycleImageView = new RecycleImageView(getContext());
        recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(recycleImageView, 0, new RelativeLayout.LayoutParams(-1, -1));
        RecycleImageView recycleImageView2 = new RecycleImageView(getContext());
        recycleImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C1378b.m4482a(getContext()).m4495a(new C1381e(1, str), new C09359(str, recycleImageView2, recycleImageView));
        this.f1174p.add(recycleImageView2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(13);
        addView(recycleImageView2, 1, layoutParams3);
        if (!TextUtils.isEmpty(this.f1161c.m3241z())) {
            ImageView imageView = (ImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_self_ad_logo", "id"));
            C1378b.m4482a(getContext()).m4495a(new C1381e(1, this.f1161c.m3241z()), new C092210(imageView));
            this.f1174p.add(imageView);
        }
        if (this.f1161c.m3176O()) {
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
            }
            if (textView != null) {
                textView.setVisibility(0);
                textView.setText(this.f1161c.m3171J());
                textView.setOnClickListener(new ViewOnClickListenerC092311());
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setOnClickListener(new ViewOnClickListenerC092412());
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
                textView3.setOnClickListener(new ViewOnClickListenerC092513());
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
                textView4.setText(getContext().getResources().getString(C1345i.m4154a(getContext(), "myoffer_panel_version", C1875i.f11532g), this.f1161c.m3172K()));
                textView4.setOnClickListener(new ViewOnClickListenerC092614());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e2 A[PHI: r11 r15 r18
  0x03e2: PHI (r11v12 java.lang.Object) = (r11v11 java.lang.Object), (r11v13 java.lang.Object) binds: [B:108:0x03e0, B:104:0x03d1] A[DONT_GENERATE, DONT_INLINE]
  0x03e2: PHI (r15v4 java.lang.Object) = (r15v3 java.lang.Object), (r15v5 java.lang.Object) binds: [B:108:0x03e0, B:104:0x03d1] A[DONT_GENERATE, DONT_INLINE]
  0x03e2: PHI (r18v2 android.widget.TextView) = (r18v1 android.widget.TextView), (r18v3 android.widget.TextView) binds: [B:108:0x03e0, B:104:0x03d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x07b2  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1026o() {
        /*
            Method dump skipped, instruction units count: 2110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.SdkBannerATView.m1026o():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0383  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1027p() {
        /*
            Method dump skipped, instruction units count: 1356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.SdkBannerATView.m1027p():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e2 A[PHI: r11 r15 r18
  0x03e2: PHI (r11v12 java.lang.Object) = (r11v11 java.lang.Object), (r11v13 java.lang.Object) binds: [B:108:0x03e0, B:104:0x03d1] A[DONT_GENERATE, DONT_INLINE]
  0x03e2: PHI (r15v4 java.lang.Object) = (r15v3 java.lang.Object), (r15v5 java.lang.Object) binds: [B:108:0x03e0, B:104:0x03d1] A[DONT_GENERATE, DONT_INLINE]
  0x03e2: PHI (r18v2 android.widget.TextView) = (r18v1 android.widget.TextView), (r18v3 android.widget.TextView) binds: [B:108:0x03e0, B:104:0x03d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x07b2  */
    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo669a() {
        /*
            Method dump skipped, instruction units count: 2110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.SdkBannerATView.mo669a():void");
    }

    @Override // com.anythink.basead.p025ui.BaseBannerATView
    /* JADX INFO: renamed from: c */
    public final void mo721c() {
        int size = this.f1174p.size();
        for (int i = 0; i < size; i++) {
            View view = this.f1174p.get(i);
            if (view != null) {
                view.setOnClickListener(this.f1659E);
            }
        }
        setOnClickListener(this.f1658D);
        super.mo721c();
    }
}
