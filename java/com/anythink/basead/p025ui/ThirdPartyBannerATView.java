package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p055f.p056a.C1207e;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.core.common.p071ui.component.RoundImageView;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ThirdPartyBannerATView extends BaseBannerATView {

    /* JADX INFO: renamed from: A */
    private FrameLayout f1730A;

    /* JADX INFO: renamed from: B */
    private FrameLayout f1731B;

    /* JADX INFO: renamed from: C */
    private LinearLayout f1732C;

    /* JADX INFO: renamed from: D */
    private TextView f1733D;

    /* JADX INFO: renamed from: E */
    private TextView f1734E;

    /* JADX INFO: renamed from: F */
    private SpreadAnimLayout f1735F;

    /* JADX INFO: renamed from: G */
    private ImageView f1736G;

    /* JADX INFO: renamed from: H */
    private TextView f1737H;

    /* JADX INFO: renamed from: I */
    private RoundImageView f1738I;

    /* JADX INFO: renamed from: J */
    private View f1739J;

    /* JADX INFO: renamed from: K */
    private View f1740K;

    /* JADX INFO: renamed from: L */
    private List<Integer> f1741L;

    /* JADX INFO: renamed from: M */
    private float f1742M;

    /* JADX INFO: renamed from: N */
    private float f1743N;

    /* JADX INFO: renamed from: O */
    private boolean f1744O;

    /* JADX INFO: renamed from: P */
    private int f1745P;

    /* JADX INFO: renamed from: Q */
    private int f1746Q;

    /* JADX INFO: renamed from: R */
    private View f1747R;

    /* JADX INFO: renamed from: S */
    private FrameLayout f1748S;

    /* JADX INFO: renamed from: T */
    private TextView f1749T;

    /* JADX INFO: renamed from: y */
    private ViewGroup f1750y;

    /* JADX INFO: renamed from: z */
    private C1207e f1751z;

    /* JADX INFO: renamed from: com.anythink.basead.ui.ThirdPartyBannerATView$1 */
    public class C09431 implements C1378b.a {
        public C09431() {
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(ThirdPartyBannerATView.this.f1161c.m3237x(), str)) {
                ThirdPartyBannerATView.this.f1738I.setImageBitmap(bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.ThirdPartyBannerATView$2 */
    public class ViewTreeObserverOnGlobalLayoutListenerC09442 implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f1753a;

        public ViewTreeObserverOnGlobalLayoutListenerC09442(View view) {
            this.f1753a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT >= 16) {
                this.f1753a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            int height = this.f1753a.getHeight();
            int width = this.f1753a.getWidth();
            ViewGroup.LayoutParams layoutParams = this.f1753a.getLayoutParams();
            int iM1048b = ThirdPartyBannerATView.m1048b(ThirdPartyBannerATView.this);
            layoutParams.height = iM1048b;
            layoutParams.width = (iM1048b * width) / height;
            this.f1753a.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.ThirdPartyBannerATView$3 */
    public class C09453 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f1755a;

        public C09453(String str) {
            this.f1755a = str;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(this.f1755a, str)) {
                ThirdPartyBannerATView.this.f1736G.setVisibility(0);
                ThirdPartyBannerATView.this.f1736G.setImageBitmap(bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.ThirdPartyBannerATView$4 */
    public class C09464 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f1757a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RoundImageView f1758b;

        public C09464(String str, RoundImageView roundImageView) {
            this.f1757a = str;
            this.f1758b = roundImageView;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(this.f1757a, str)) {
                this.f1758b.setImageBitmap(bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.ThirdPartyBannerATView$5 */
    public class ViewOnClickListenerC09475 implements View.OnClickListener {
        public ViewOnClickListenerC09475() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1350n.m4203a(C1175n.m2059a().m2148f(), ThirdPartyBannerATView.this.f1161c.m3173L());
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.ThirdPartyBannerATView$6 */
    public class ViewOnClickListenerC09486 implements View.OnClickListener {
        public ViewOnClickListenerC09486() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1350n.m4203a(C1175n.m2059a().m2148f(), ThirdPartyBannerATView.this.f1161c.m3174M());
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.ThirdPartyBannerATView$7 */
    public class ViewOnClickListenerC09497 implements View.OnClickListener {
        public ViewOnClickListenerC09497() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.ThirdPartyBannerATView$8 */
    public class ViewOnClickListenerC09508 implements View.OnClickListener {
        public ViewOnClickListenerC09508() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    public ThirdPartyBannerATView(Context context) {
        super(context);
        this.f1744O = false;
        this.f1746Q = 5;
    }

    public ThirdPartyBannerATView(Context context, BaseAd baseAd, C1248m c1248m, AbstractC1247l<?> abstractC1247l, InterfaceC0771a interfaceC0771a) {
        ViewGroup.LayoutParams layoutParams;
        super(context, c1248m, abstractC1247l, interfaceC0771a);
        this.f1744O = false;
        this.f1746Q = 5;
        if (baseAd instanceof C1207e) {
            this.f1751z = (C1207e) baseAd;
        }
        C1207e c1207e = this.f1751z;
        if (c1207e == null || abstractC1247l == null || c1248m == null) {
            return;
        }
        this.f1745P = c1207e.mo2421g();
        this.f1744O = this.f1751z.mo2423i() == 0;
        this.f1741L = new ArrayList();
        for (int i : this.f1751z.mo2422h()) {
            this.f1741L.add(Integer.valueOf(i));
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_banner_native_ad_layout_320x50", "layout"), (ViewGroup) this, false);
        this.f1750y = viewGroup;
        addView(viewGroup);
        this.f1730A = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_mediaview_container", "id"));
        this.f1731B = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_icon_container", "id"));
        this.f1732C = (LinearLayout) findViewById(C1345i.m4154a(getContext(), "ll_title_desc", "id"));
        this.f1738I = (RoundImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_icon", "id"));
        this.f1733D = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_ad_title", "id"));
        this.f1734E = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_desc", "id"));
        this.f1737H = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_ad_install_btn", "id"));
        this.f1735F = (SpreadAnimLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_spread_layout", "id"));
        this.f1736G = (ImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_self_ad_logo", "id"));
        this.f1748S = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_ad_choice_container", "id"));
        this.f1749T = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_ad_from", "id"));
        CloseImageView closeImageView = (CloseImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_close", "id"));
        this.f1212w = closeImageView;
        m1043a(this.f1749T, this.f1751z.getAdFrom());
        if (closeImageView != null) {
            if (this.f1744O) {
                closeImageView.setVisibility(0);
            } else {
                closeImageView.setVisibility(8);
            }
        }
        View adIconView = this.f1751z.getAdIconView();
        this.f1739J = adIconView;
        if (adIconView != null) {
            if (adIconView.getParent() != null && (this.f1739J.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.f1739J.getParent()).removeView(this.f1739J);
            }
            this.f1731B.removeAllViews();
            this.f1731B.addView(this.f1739J, new FrameLayout.LayoutParams(-1, -1));
        } else if (TextUtils.isEmpty(this.f1161c.m3237x()) || this.f1738I == null) {
            FrameLayout frameLayout = this.f1731B;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.f1731B.getLayoutParams();
            this.f1738I.setRadiusInDip(6);
            this.f1738I.setNeedRadiu(true);
            C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1161c.m3237x()), layoutParams2.width, layoutParams2.height, new C09431());
        }
        m1043a(this.f1733D, this.f1161c.m3233v());
        String strM3157A = this.f1161c.m3157A();
        m1043a(this.f1737H, strM3157A);
        if (TextUtils.isEmpty(strM3157A)) {
            SpreadAnimLayout spreadAnimLayout = this.f1735F;
            if (spreadAnimLayout != null) {
                spreadAnimLayout.setVisibility(8);
            }
        } else {
            SpreadAnimLayout spreadAnimLayout2 = this.f1735F;
            if (spreadAnimLayout2 != null) {
                spreadAnimLayout2.setRoundRadius(C1345i.m4153a(getContext(), 16.67f));
            }
        }
        m1043a(this.f1734E, this.f1161c.m3235w());
        View adLogoView = this.f1751z.getAdLogoView();
        if (adLogoView != null) {
            if (this.f1748S != null) {
                if (adLogoView.getParent() != null && (adLogoView.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) adLogoView.getParent()).removeView(adLogoView);
                }
                this.f1748S.removeAllViews();
                this.f1748S.addView(adLogoView);
                adLogoView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC09442(adLogoView));
            }
        } else if (this.f1736G != null) {
            String strM3241z = this.f1161c.m3241z();
            if (TextUtils.isEmpty(strM3241z)) {
                this.f1736G.setVisibility(8);
            } else {
                C1378b.m4482a(getContext()).m4495a(new C1381e(1, strM3241z), new C09453(strM3241z));
            }
        }
        if (this.f1730A != null) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 17;
            this.f1740K = this.f1751z.getAdMediaView(new Object[0]);
            String mainImageUrl = this.f1751z.getMainImageUrl();
            if (this.f1740K != null) {
                this.f1730A.setVisibility(0);
                if (this.f1740K.getParent() != null) {
                    ((ViewGroup) this.f1740K.getParent()).removeView(this.f1740K);
                }
                this.f1730A.addView(this.f1740K, layoutParams3);
            } else if (TextUtils.isEmpty(mainImageUrl)) {
                this.f1730A.setVisibility(8);
                SpreadAnimLayout spreadAnimLayout3 = this.f1735F;
                if (spreadAnimLayout3 != null && spreadAnimLayout3.getVisibility() == 0) {
                    this.f1735F.setRoundRadius(m1040a(24.0f));
                }
            } else {
                this.f1730A.setVisibility(0);
                RoundImageView roundImageView = new RoundImageView(getContext());
                this.f1730A.addView(roundImageView, layoutParams3);
                C1378b.m4482a(getContext()).m4495a(new C1381e(1, mainImageUrl), new C09464(mainImageUrl, roundImageView));
            }
        }
        TextView textView = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_publisher_name", "id"));
        TextView textView2 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_privacy_agreement", "id"));
        View viewFindViewById = findViewById(C1345i.m4154a(getContext(), "myoffer_banner_center_line", "id"));
        TextView textView3 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_permission_manage", "id"));
        TextView textView4 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_version_name", "id"));
        if (this.f1161c.m3176O()) {
            m1043a(textView, this.f1161c.m3171J());
            m1043a(textView4, this.f1161c.m3172K());
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setOnClickListener(new ViewOnClickListenerC09475());
            }
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
                textView3.setOnClickListener(new ViewOnClickListenerC09486());
            }
            if (textView != null && textView.getVisibility() == 0) {
                textView.setOnClickListener(new ViewOnClickListenerC09497());
            }
            if (textView4 != null && textView4.getVisibility() == 0) {
                textView4.setOnClickListener(new ViewOnClickListenerC09508());
            }
        }
        mo721c();
        C1207e c1207e2 = this.f1751z;
        if (this.f1750y != null) {
            Context context2 = getContext();
            int iM4153a = C1345i.m4153a(context2, 320.0f);
            int iM4153a2 = C1345i.m4153a(context2, 50.0f);
            ViewGroup customAdContainer = c1207e2 != null ? c1207e2.getCustomAdContainer() : null;
            if (customAdContainer != null) {
                ViewGroup.LayoutParams layoutParams4 = customAdContainer.getLayoutParams();
                if (layoutParams4 == null) {
                    layoutParams4 = new ViewGroup.LayoutParams(iM4153a, iM4153a2);
                } else {
                    layoutParams4.width = iM4153a;
                    layoutParams4.height = iM4153a2;
                }
                customAdContainer.setLayoutParams(layoutParams4);
                removeAllViews();
                if (customAdContainer instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iM4153a, iM4153a2);
                    layoutParams5.gravity = 17;
                    layoutParams = layoutParams5;
                } else {
                    layoutParams = new ViewGroup.LayoutParams(iM4153a, iM4153a2);
                }
                this.f1750y.setLayoutParams(layoutParams);
                C1360x.m4265a(customAdContainer);
                customAdContainer.addView(this.f1750y);
                if (customAdContainer.getParent() != null) {
                    ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
                }
                addView(customAdContainer);
            }
            m1049b(this.f1750y);
        }
    }

    /* JADX INFO: renamed from: a */
    private int m1040a(float f) {
        return C1345i.m4153a(getContext(), f);
    }

    /* JADX INFO: renamed from: a */
    private static int m1041a(Context context) {
        return C1345i.m4153a(context, 320.0f);
    }

    /* JADX INFO: renamed from: a */
    private static void m1043a(TextView textView, String str) {
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1044a(BaseAd baseAd) {
        ViewGroup.LayoutParams layoutParams;
        if (this.f1750y == null) {
            return;
        }
        Context context = getContext();
        int iM4153a = C1345i.m4153a(context, 320.0f);
        int iM4153a2 = C1345i.m4153a(context, 50.0f);
        ViewGroup customAdContainer = baseAd != null ? baseAd.getCustomAdContainer() : null;
        if (customAdContainer != null) {
            ViewGroup.LayoutParams layoutParams2 = customAdContainer.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(iM4153a, iM4153a2);
            } else {
                layoutParams2.width = iM4153a;
                layoutParams2.height = iM4153a2;
            }
            customAdContainer.setLayoutParams(layoutParams2);
            removeAllViews();
            if (customAdContainer instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iM4153a, iM4153a2);
                layoutParams3.gravity = 17;
                layoutParams = layoutParams3;
            } else {
                layoutParams = new ViewGroup.LayoutParams(iM4153a, iM4153a2);
            }
            this.f1750y.setLayoutParams(layoutParams);
            C1360x.m4265a(customAdContainer);
            customAdContainer.addView(this.f1750y);
            if (customAdContainer.getParent() != null) {
                ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
            }
            addView(customAdContainer);
        }
        m1049b(this.f1750y);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1045a(float f, float f2, View view) {
        if (view == null) {
            return false;
        }
        float x = view.getX();
        float y = view.getY();
        return f >= x && f <= ((float) view.getWidth()) + x && f2 >= y && f2 <= ((float) view.getHeight()) + y;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m1046a(float r5, float r6, android.view.View r7, java.util.List<java.lang.Integer> r8) {
        /*
            r4 = this;
            r4.f1747R = r7
            com.anythink.core.common.f.a.e r0 = r4.f1751z
            r1 = 1
            if (r0 == 0) goto L5f
            if (r8 == 0) goto L5f
            int r0 = r8.size()
            if (r0 != 0) goto L10
            goto L5f
        L10:
            android.widget.FrameLayout r0 = r4.f1730A
            if (r7 == r0) goto L58
            android.widget.FrameLayout r0 = r4.f1731B
            if (r7 != r0) goto L19
            goto L58
        L19:
            android.widget.LinearLayout r0 = r4.f1732C
            if (r7 != r0) goto L51
            float r0 = r7.getX()
            float r0 = r5 - r0
            float r2 = r7.getY()
            float r2 = r6 - r2
            android.widget.TextView r3 = r4.f1733D
            boolean r0 = m1045a(r0, r2, r3)
            if (r0 == 0) goto L3d
            r5 = 2
        L32:
            r4.f1746Q = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L38:
            boolean r5 = r8.contains(r5)
            return r5
        L3d:
            float r0 = r7.getX()
            float r5 = r5 - r0
            float r0 = r7.getY()
            float r6 = r6 - r0
            android.widget.TextView r0 = r4.f1734E
            boolean r5 = m1045a(r5, r6, r0)
            if (r5 == 0) goto L51
            r5 = 3
            goto L32
        L51:
            com.anythink.basead.ui.SpreadAnimLayout r5 = r4.f1735F
            if (r7 != r5) goto L57
            r5 = 4
            goto L32
        L57:
            return r1
        L58:
            r4.f1746Q = r1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            goto L38
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.ThirdPartyBannerATView.m1046a(float, float, android.view.View, java.util.List):boolean");
    }

    /* JADX INFO: renamed from: b */
    private static int m1047b(Context context) {
        return C1345i.m4153a(context, 50.0f);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m1048b(ThirdPartyBannerATView thirdPartyBannerATView) {
        return thirdPartyBannerATView.m1040a(8.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1049b(android.view.View r9) {
        /*
            r8 = this;
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            com.anythink.core.common.f.m r1 = r8.f1160b
            int r1 = r1.f4325f
            r2 = 83
            r3 = 1
            if (r1 != r3) goto L12
            r0.gravity = r2
            goto L35
        L12:
            r4 = 8
            if (r1 != r4) goto L29
            r0.gravity = r2
            r1 = 1107296256(0x42000000, float:32.0)
            int r1 = r8.m1040a(r1)
            r0.width = r1
            r1 = 1090519040(0x41000000, float:8.0)
            int r1 = r8.m1040a(r1)
            r0.height = r1
            goto L35
        L29:
            r1 = 85
            r0.gravity = r1
            r1 = 1073741824(0x40000000, float:2.0)
            int r1 = r8.m1040a(r1)
            r0.rightMargin = r1
        L35:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = r8.m1040a(r1)
            r0.bottomMargin = r1
            com.anythink.core.basead.b.b r1 = new com.anythink.core.basead.b.b
            r1.<init>()
            com.anythink.core.common.f.a.e r2 = r8.f1751z
            int[] r2 = r2.mo2422h()
            if (r2 != 0) goto L4e
            r8.m1051c(r8)
            goto Lad
        L4e:
            int r4 = r2.length
            r5 = 0
        L50:
            if (r5 >= r4) goto Lad
            r6 = r2[r5]
            if (r6 != r3) goto L7a
            android.view.View r6 = r8.f1739J
            if (r6 == 0) goto L63
            r8.m1051c(r6)
            android.view.View r6 = r8.f1739J
        L5f:
            r1.m1751b(r6)
            goto L6d
        L63:
            com.anythink.core.common.ui.component.RoundImageView r6 = r8.f1738I
            if (r6 == 0) goto L6d
            r8.m1051c(r6)
            com.anythink.core.common.ui.component.RoundImageView r6 = r8.f1738I
            goto L5f
        L6d:
            android.view.View r6 = r8.f1740K
            r8.m1051c(r6)
            android.view.View r6 = r8.f1740K
            if (r6 == 0) goto Laa
            r1.m1753c(r6)
            goto Laa
        L7a:
            r7 = 2
            if (r6 != r7) goto L88
            android.widget.TextView r6 = r8.f1733D
            r8.m1051c(r6)
            android.widget.TextView r6 = r8.f1733D
            r1.m1749a(r6)
            goto Laa
        L88:
            r7 = 3
            if (r6 != r7) goto L96
            android.widget.TextView r6 = r8.f1734E
            r8.m1051c(r6)
            android.widget.TextView r6 = r8.f1734E
            r1.m1755d(r6)
            goto Laa
        L96:
            r7 = 4
            if (r6 != r7) goto La4
            android.widget.TextView r6 = r8.f1737H
            r8.m1051c(r6)
            android.widget.TextView r6 = r8.f1737H
            r1.m1757e(r6)
            goto Laa
        La4:
            r7 = 5
            if (r6 != r7) goto Laa
            r8.m1051c(r8)
        Laa:
            int r5 = r5 + 1
            goto L50
        Lad:
            com.anythink.basead.ui.CloseImageView r2 = r8.f1212w
            if (r2 == 0) goto Lb4
            r1.m1759f(r2)
        Lb4:
            com.anythink.core.common.f.a.e r2 = r8.f1751z
            java.util.List<android.view.View> r3 = r8.f1174p
            r2.registerListener(r9, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.ThirdPartyBannerATView.m1049b(android.view.View):void");
    }

    /* JADX INFO: renamed from: c */
    private void m1051c(View view) {
        if (view != null) {
            this.f1174p.add(view);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m1052o() {
        this.f1745P = this.f1751z.mo2421g();
        this.f1744O = this.f1751z.mo2423i() == 0;
        this.f1741L = new ArrayList();
        for (int i : this.f1751z.mo2422h()) {
            this.f1741L.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: p */
    private void m1053p() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_banner_native_ad_layout_320x50", "layout"), (ViewGroup) this, false);
        this.f1750y = viewGroup;
        addView(viewGroup);
        this.f1730A = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_mediaview_container", "id"));
        this.f1731B = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_icon_container", "id"));
        this.f1732C = (LinearLayout) findViewById(C1345i.m4154a(getContext(), "ll_title_desc", "id"));
        this.f1738I = (RoundImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_icon", "id"));
        this.f1733D = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_ad_title", "id"));
        this.f1734E = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_desc", "id"));
        this.f1737H = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_ad_install_btn", "id"));
        this.f1735F = (SpreadAnimLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_spread_layout", "id"));
        this.f1736G = (ImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_self_ad_logo", "id"));
        this.f1748S = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_ad_choice_container", "id"));
        this.f1749T = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_ad_from", "id"));
        CloseImageView closeImageView = (CloseImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_close", "id"));
        this.f1212w = closeImageView;
        m1043a(this.f1749T, this.f1751z.getAdFrom());
        if (closeImageView != null) {
            if (this.f1744O) {
                closeImageView.setVisibility(0);
            } else {
                closeImageView.setVisibility(8);
            }
        }
        View adIconView = this.f1751z.getAdIconView();
        this.f1739J = adIconView;
        if (adIconView != null) {
            if (adIconView.getParent() != null && (this.f1739J.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.f1739J.getParent()).removeView(this.f1739J);
            }
            this.f1731B.removeAllViews();
            this.f1731B.addView(this.f1739J, new FrameLayout.LayoutParams(-1, -1));
        } else if (TextUtils.isEmpty(this.f1161c.m3237x()) || this.f1738I == null) {
            FrameLayout frameLayout = this.f1731B;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.f1731B.getLayoutParams();
            this.f1738I.setRadiusInDip(6);
            this.f1738I.setNeedRadiu(true);
            C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1161c.m3237x()), layoutParams2.width, layoutParams2.height, new C09431());
        }
        m1043a(this.f1733D, this.f1161c.m3233v());
        String strM3157A = this.f1161c.m3157A();
        m1043a(this.f1737H, strM3157A);
        if (TextUtils.isEmpty(strM3157A)) {
            SpreadAnimLayout spreadAnimLayout = this.f1735F;
            if (spreadAnimLayout != null) {
                spreadAnimLayout.setVisibility(8);
            }
        } else {
            SpreadAnimLayout spreadAnimLayout2 = this.f1735F;
            if (spreadAnimLayout2 != null) {
                spreadAnimLayout2.setRoundRadius(C1345i.m4153a(getContext(), 16.67f));
            }
        }
        m1043a(this.f1734E, this.f1161c.m3235w());
        View adLogoView = this.f1751z.getAdLogoView();
        if (adLogoView != null) {
            if (this.f1748S != null) {
                if (adLogoView.getParent() != null && (adLogoView.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) adLogoView.getParent()).removeView(adLogoView);
                }
                this.f1748S.removeAllViews();
                this.f1748S.addView(adLogoView);
                adLogoView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC09442(adLogoView));
            }
        } else if (this.f1736G != null) {
            String strM3241z = this.f1161c.m3241z();
            if (TextUtils.isEmpty(strM3241z)) {
                this.f1736G.setVisibility(8);
            } else {
                C1378b.m4482a(getContext()).m4495a(new C1381e(1, strM3241z), new C09453(strM3241z));
            }
        }
        if (this.f1730A != null) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 17;
            this.f1740K = this.f1751z.getAdMediaView(new Object[0]);
            String mainImageUrl = this.f1751z.getMainImageUrl();
            if (this.f1740K != null) {
                this.f1730A.setVisibility(0);
                if (this.f1740K.getParent() != null) {
                    ((ViewGroup) this.f1740K.getParent()).removeView(this.f1740K);
                }
                this.f1730A.addView(this.f1740K, layoutParams3);
            } else if (TextUtils.isEmpty(mainImageUrl)) {
                this.f1730A.setVisibility(8);
                SpreadAnimLayout spreadAnimLayout3 = this.f1735F;
                if (spreadAnimLayout3 != null && spreadAnimLayout3.getVisibility() == 0) {
                    this.f1735F.setRoundRadius(m1040a(24.0f));
                }
            } else {
                this.f1730A.setVisibility(0);
                RoundImageView roundImageView = new RoundImageView(getContext());
                this.f1730A.addView(roundImageView, layoutParams3);
                C1378b.m4482a(getContext()).m4495a(new C1381e(1, mainImageUrl), new C09464(mainImageUrl, roundImageView));
            }
        }
        TextView textView = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_publisher_name", "id"));
        TextView textView2 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_privacy_agreement", "id"));
        View viewFindViewById = findViewById(C1345i.m4154a(getContext(), "myoffer_banner_center_line", "id"));
        TextView textView3 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_permission_manage", "id"));
        TextView textView4 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_version_name", "id"));
        if (this.f1161c.m3176O()) {
            m1043a(textView, this.f1161c.m3171J());
            m1043a(textView4, this.f1161c.m3172K());
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setOnClickListener(new ViewOnClickListenerC09475());
            }
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
                textView3.setOnClickListener(new ViewOnClickListenerC09486());
            }
            if (textView != null && textView.getVisibility() == 0) {
                textView.setOnClickListener(new ViewOnClickListenerC09497());
            }
            if (textView4 != null && textView4.getVisibility() == 0) {
                textView4.setOnClickListener(new ViewOnClickListenerC09508());
            }
        }
        mo721c();
        C1207e c1207e = this.f1751z;
        if (this.f1750y != null) {
            Context context = getContext();
            int iM4153a = C1345i.m4153a(context, 320.0f);
            int iM4153a2 = C1345i.m4153a(context, 50.0f);
            ViewGroup customAdContainer = c1207e != null ? c1207e.getCustomAdContainer() : null;
            if (customAdContainer != null) {
                ViewGroup.LayoutParams layoutParams4 = customAdContainer.getLayoutParams();
                if (layoutParams4 == null) {
                    layoutParams4 = new ViewGroup.LayoutParams(iM4153a, iM4153a2);
                } else {
                    layoutParams4.width = iM4153a;
                    layoutParams4.height = iM4153a2;
                }
                customAdContainer.setLayoutParams(layoutParams4);
                removeAllViews();
                if (customAdContainer instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iM4153a, iM4153a2);
                    layoutParams5.gravity = 17;
                    layoutParams = layoutParams5;
                } else {
                    layoutParams = new ViewGroup.LayoutParams(iM4153a, iM4153a2);
                }
                this.f1750y.setLayoutParams(layoutParams);
                C1360x.m4265a(customAdContainer);
                customAdContainer.addView(this.f1750y);
                if (customAdContainer.getParent() != null) {
                    ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
                }
                addView(customAdContainer);
            }
            m1049b(this.f1750y);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m1054q() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_banner_native_ad_layout_320x50", "layout"), (ViewGroup) this, false);
        this.f1750y = viewGroup;
        addView(viewGroup);
    }

    /* JADX INFO: renamed from: r */
    private void m1055r() {
        this.f1730A = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_mediaview_container", "id"));
        this.f1731B = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_icon_container", "id"));
        this.f1732C = (LinearLayout) findViewById(C1345i.m4154a(getContext(), "ll_title_desc", "id"));
        this.f1738I = (RoundImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_icon", "id"));
        this.f1733D = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_ad_title", "id"));
        this.f1734E = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_desc", "id"));
        this.f1737H = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_ad_install_btn", "id"));
        this.f1735F = (SpreadAnimLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_spread_layout", "id"));
        this.f1736G = (ImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_self_ad_logo", "id"));
        this.f1748S = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_ad_choice_container", "id"));
        this.f1749T = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_ad_from", "id"));
        CloseImageView closeImageView = (CloseImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_close", "id"));
        this.f1212w = closeImageView;
        m1043a(this.f1749T, this.f1751z.getAdFrom());
        if (closeImageView != null) {
            if (this.f1744O) {
                closeImageView.setVisibility(0);
            } else {
                closeImageView.setVisibility(8);
            }
        }
        View adIconView = this.f1751z.getAdIconView();
        this.f1739J = adIconView;
        if (adIconView != null) {
            if (adIconView.getParent() != null && (this.f1739J.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.f1739J.getParent()).removeView(this.f1739J);
            }
            this.f1731B.removeAllViews();
            this.f1731B.addView(this.f1739J, new FrameLayout.LayoutParams(-1, -1));
        } else if (TextUtils.isEmpty(this.f1161c.m3237x()) || this.f1738I == null) {
            FrameLayout frameLayout = this.f1731B;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            ViewGroup.LayoutParams layoutParams = this.f1731B.getLayoutParams();
            this.f1738I.setRadiusInDip(6);
            this.f1738I.setNeedRadiu(true);
            C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1161c.m3237x()), layoutParams.width, layoutParams.height, new C09431());
        }
        m1043a(this.f1733D, this.f1161c.m3233v());
        String strM3157A = this.f1161c.m3157A();
        m1043a(this.f1737H, strM3157A);
        if (TextUtils.isEmpty(strM3157A)) {
            SpreadAnimLayout spreadAnimLayout = this.f1735F;
            if (spreadAnimLayout != null) {
                spreadAnimLayout.setVisibility(8);
            }
        } else {
            SpreadAnimLayout spreadAnimLayout2 = this.f1735F;
            if (spreadAnimLayout2 != null) {
                spreadAnimLayout2.setRoundRadius(C1345i.m4153a(getContext(), 16.67f));
            }
        }
        m1043a(this.f1734E, this.f1161c.m3235w());
        View adLogoView = this.f1751z.getAdLogoView();
        if (adLogoView != null) {
            if (this.f1748S != null) {
                if (adLogoView.getParent() != null && (adLogoView.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) adLogoView.getParent()).removeView(adLogoView);
                }
                this.f1748S.removeAllViews();
                this.f1748S.addView(adLogoView);
                adLogoView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC09442(adLogoView));
            }
        } else if (this.f1736G != null) {
            String strM3241z = this.f1161c.m3241z();
            if (TextUtils.isEmpty(strM3241z)) {
                this.f1736G.setVisibility(8);
            } else {
                C1378b.m4482a(getContext()).m4495a(new C1381e(1, strM3241z), new C09453(strM3241z));
            }
        }
        if (this.f1730A != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            this.f1740K = this.f1751z.getAdMediaView(new Object[0]);
            String mainImageUrl = this.f1751z.getMainImageUrl();
            if (this.f1740K != null) {
                this.f1730A.setVisibility(0);
                if (this.f1740K.getParent() != null) {
                    ((ViewGroup) this.f1740K.getParent()).removeView(this.f1740K);
                }
                this.f1730A.addView(this.f1740K, layoutParams2);
            } else if (TextUtils.isEmpty(mainImageUrl)) {
                this.f1730A.setVisibility(8);
                SpreadAnimLayout spreadAnimLayout3 = this.f1735F;
                if (spreadAnimLayout3 != null && spreadAnimLayout3.getVisibility() == 0) {
                    this.f1735F.setRoundRadius(m1040a(24.0f));
                }
            } else {
                this.f1730A.setVisibility(0);
                RoundImageView roundImageView = new RoundImageView(getContext());
                this.f1730A.addView(roundImageView, layoutParams2);
                C1378b.m4482a(getContext()).m4495a(new C1381e(1, mainImageUrl), new C09464(mainImageUrl, roundImageView));
            }
        }
        TextView textView = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_publisher_name", "id"));
        TextView textView2 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_privacy_agreement", "id"));
        View viewFindViewById = findViewById(C1345i.m4154a(getContext(), "myoffer_banner_center_line", "id"));
        TextView textView3 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_permission_manage", "id"));
        TextView textView4 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_version_name", "id"));
        if (this.f1161c.m3176O()) {
            m1043a(textView, this.f1161c.m3171J());
            m1043a(textView4, this.f1161c.m3172K());
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setOnClickListener(new ViewOnClickListenerC09475());
            }
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
                textView3.setOnClickListener(new ViewOnClickListenerC09486());
            }
            if (textView != null && textView.getVisibility() == 0) {
                textView.setOnClickListener(new ViewOnClickListenerC09497());
            }
            if (textView4 == null || textView4.getVisibility() != 0) {
                return;
            }
            textView4.setOnClickListener(new ViewOnClickListenerC09508());
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo669a() {
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo701a(int i, Runnable runnable) {
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    public void destroy() {
        C1207e c1207e = this.f1751z;
        if (c1207e != null) {
            c1207e.clear(this.f1750y);
            this.f1751z.destroy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    @Override // com.anythink.basead.p025ui.BaseATView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            android.view.ViewGroup r0 = r7.f1750y
            if (r0 == 0) goto La2
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto La2
            int r0 = r8.getAction()
            if (r0 == 0) goto L93
            r1 = 1
            if (r0 == r1) goto L15
            goto La2
        L15:
            r0 = 0
        L16:
            android.view.ViewGroup r2 = r7.f1750y
            int r2 = r2.getChildCount()
            if (r0 >= r2) goto La2
            android.view.ViewGroup r2 = r7.f1750y
            android.view.View r2 = r2.getChildAt(r0)
            float r3 = r7.f1742M
            float r4 = r7.f1743N
            boolean r3 = m1045a(r3, r4, r2)
            if (r3 == 0) goto L90
            float r0 = r7.f1742M
            float r3 = r7.f1743N
            java.util.List<java.lang.Integer> r4 = r7.f1741L
            r7.f1747R = r2
            com.anythink.core.common.f.a.e r5 = r7.f1751z
            if (r5 == 0) goto La2
            if (r4 == 0) goto La2
            int r5 = r4.size()
            if (r5 != 0) goto L43
            goto La2
        L43:
            android.widget.FrameLayout r5 = r7.f1730A
            if (r2 == r5) goto L86
            android.widget.FrameLayout r5 = r7.f1731B
            if (r2 != r5) goto L4c
            goto L86
        L4c:
            android.widget.LinearLayout r1 = r7.f1732C
            if (r2 != r1) goto L80
            float r1 = r2.getX()
            float r1 = r0 - r1
            float r5 = r2.getY()
            float r5 = r3 - r5
            android.widget.TextView r6 = r7.f1733D
            boolean r1 = m1045a(r1, r5, r6)
            if (r1 == 0) goto L6c
            r0 = 2
        L65:
            r7.f1746Q = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L8c
        L6c:
            float r1 = r2.getX()
            float r0 = r0 - r1
            float r1 = r2.getY()
            float r3 = r3 - r1
            android.widget.TextView r1 = r7.f1734E
            boolean r0 = m1045a(r0, r3, r1)
            if (r0 == 0) goto L80
            r0 = 3
            goto L65
        L80:
            com.anythink.basead.ui.SpreadAnimLayout r0 = r7.f1735F
            if (r2 != r0) goto La2
            r0 = 4
            goto L65
        L86:
            r7.f1746Q = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L8c:
            r4.contains(r0)
            goto La2
        L90:
            int r0 = r0 + 1
            goto L16
        L93:
            r0 = 0
            r7.f1747R = r0
            float r0 = r8.getX()
            r7.f1742M = r0
            float r0 = r8.getY()
            r7.f1743N = r0
        La2:
            boolean r8 = super.dispatchTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.ThirdPartyBannerATView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getClickedArea() {
        if (this.f1747R == null) {
            return 5;
        }
        return this.f1746Q;
    }

    @Override // com.anythink.basead.p025ui.BaseBannerATView, com.anythink.basead.p025ui.BaseATView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }
}
