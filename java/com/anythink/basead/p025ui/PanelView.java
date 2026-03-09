package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.anythink.basead.p010a.C0731d;
import com.anythink.basead.p025ui.BaseShakeView;
import com.anythink.basead.p025ui.p028c.InterfaceC0995a;
import com.anythink.basead.p025ui.p029d.C0996a;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.core.common.p071ui.component.RoundImageView;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import com.anythink.expressad.foundation.p138h.C1875i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PanelView extends RelativeLayout {
    public static final int TYPE_FULL_SCREEN_BANNER = 0;
    public static final int TYPE_FULL_SCREEN_EMPTY_INFO = 8;
    public static final int TYPE_FULL_SCREEN_ENDCARD_HORIZONTAL_LANDSCAPE = 6;
    public static final int TYPE_FULL_SCREEN_ENDCARD_HORIZONTAL_PORTRAIT = 1;
    public static final int TYPE_FULL_SCREEN_ENDCARD_VERTICAL_LANDSCAPE = 2;
    public static final int TYPE_FULL_SCREEN_ENDCARD_VERTICAL_PORTRAIT = 5;
    public static final int TYPE_HALF_SCREEN_EMPTY_INFO = 7;
    public static final int TYPE_HALF_SCREEN_HORIZONTAL = 4;
    public static final int TYPE_HALF_SCREEN_VERTICAL = 3;
    public static final int TYPE_LETTER = 9;

    /* JADX INFO: renamed from: a */
    private View f1553a;

    /* JADX INFO: renamed from: b */
    private ImageView f1554b;

    /* JADX INFO: renamed from: c */
    private ImageView f1555c;

    /* JADX INFO: renamed from: d */
    private TextView f1556d;

    /* JADX INFO: renamed from: e */
    private TextView f1557e;

    /* JADX INFO: renamed from: f */
    private Button f1558f;

    /* JADX INFO: renamed from: g */
    private BaseShakeView f1559g;

    /* JADX INFO: renamed from: h */
    private InterfaceC0910a f1560h;

    /* JADX INFO: renamed from: i */
    private int f1561i;

    /* JADX INFO: renamed from: j */
    private AbstractC1249n f1562j;

    /* JADX INFO: renamed from: k */
    private C1248m f1563k;

    /* JADX INFO: renamed from: l */
    private AbstractC1247l f1564l;

    /* JADX INFO: renamed from: m */
    private int f1565m;

    /* JADX INFO: renamed from: n */
    private ViewGroup f1566n;

    /* JADX INFO: renamed from: o */
    private TextView f1567o;

    /* JADX INFO: renamed from: p */
    private TextView f1568p;

    /* JADX INFO: renamed from: q */
    private TextView f1569q;

    /* JADX INFO: renamed from: r */
    private TextView f1570r;

    /* JADX INFO: renamed from: s */
    private boolean f1571s;

    /* JADX INFO: renamed from: t */
    private boolean f1572t;

    /* JADX INFO: renamed from: u */
    private boolean f1573u;

    /* JADX INFO: renamed from: v */
    private List<View> f1574v;

    /* JADX INFO: renamed from: w */
    private C0996a f1575w;

    /* JADX INFO: renamed from: x */
    private final View.OnClickListener f1576x;

    /* JADX INFO: renamed from: com.anythink.basead.ui.PanelView$1 */
    public class C09011 implements InterfaceC0995a {
        public C09011() {
        }

        @Override // com.anythink.basead.p025ui.p028c.InterfaceC0995a
        /* JADX INFO: renamed from: a */
        public final void mo672a(int i, int i2) {
            if (PanelView.this.f1560h != null) {
                PanelView.this.f1560h.mo798a(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.PanelView$2 */
    public class C09022 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f1578a;

        public C09022(String str) {
            this.f1578a = str;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f1578a)) {
                PanelView.this.f1554b.setImageBitmap(bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.PanelView$3 */
    public class C09033 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f1580a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewGroup.LayoutParams f1581b;

        public C09033(String str, ViewGroup.LayoutParams layoutParams) {
            this.f1580a = str;
            this.f1581b = layoutParams;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
            PanelView.this.f1555c.setVisibility(8);
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f1580a)) {
                PanelView.this.f1555c.setImageBitmap(bitmap);
                ViewGroup.LayoutParams layoutParams = this.f1581b;
                int i = layoutParams.height;
                layoutParams.width = (int) (i * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                layoutParams.height = i;
                PanelView.this.f1555c.setLayoutParams(this.f1581b);
                PanelView.this.f1555c.setScaleType(ImageView.ScaleType.FIT_XY);
                PanelView.this.f1555c.setImageBitmap(bitmap);
                PanelView.this.f1555c.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.PanelView$8 */
    public class C09088 implements BaseShakeView.InterfaceC0852a {
        public C09088() {
        }

        @Override // com.anythink.basead.p025ui.BaseShakeView.InterfaceC0852a
        /* JADX INFO: renamed from: a */
        public final boolean mo827a() {
            return PanelView.this.f1560h.mo799a();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.PanelView$a */
    public interface InterfaceC0910a {
        /* JADX INFO: renamed from: a */
        void mo798a(int i, int i2);

        /* JADX INFO: renamed from: a */
        boolean mo799a();
    }

    public PanelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1565m = 0;
        this.f1571s = false;
        this.f1572t = false;
        this.f1573u = false;
        this.f1576x = new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PanelView.this.f1562j != null) {
                    if (PanelView.this.f1562j.m3251D() == 1) {
                        if ((view == PanelView.this.f1558f || (PanelView.this.f1559g != null && view == PanelView.this.f1559g)) && PanelView.this.f1560h != null) {
                            PanelView.this.f1560h.mo798a(1, view == PanelView.this.f1558f ? 1 : 11);
                            return;
                        }
                        return;
                    }
                    if (PanelView.this.f1560h != null) {
                        if (view == PanelView.this.f1558f) {
                            PanelView.this.f1560h.mo798a(1, 1);
                        } else if (PanelView.this.f1559g == null || view != PanelView.this.f1559g) {
                            PanelView.this.f1560h.mo798a(1, 2);
                        } else {
                            PanelView.this.f1560h.mo798a(1, 11);
                        }
                    }
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    private void m922a(AbstractC1247l abstractC1247l) {
        if (this.f1554b != null) {
            String strM3237x = abstractC1247l.m3237x();
            if (!TextUtils.isEmpty(strM3237x)) {
                ViewGroup.LayoutParams layoutParams = this.f1554b.getLayoutParams();
                C1378b.m4482a(getContext()).m4494a(new C1381e(1, strM3237x), layoutParams.width, layoutParams.height, new C09022(strM3237x));
            }
            if (TextUtils.isEmpty(abstractC1247l.m3237x())) {
                this.f1554b.setVisibility(8);
            }
        }
        if (this.f1555c != null) {
            String strM3241z = abstractC1247l.m3241z();
            if (TextUtils.isEmpty(strM3241z)) {
                this.f1555c.setVisibility(8);
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.f1555c.getLayoutParams();
                C1378b.m4482a(getContext()).m4494a(new C1381e(1, strM3241z), layoutParams2.width, layoutParams2.height, new C09033(strM3241z, layoutParams2));
            }
        }
        if (this.f1557e != null) {
            if (TextUtils.isEmpty(abstractC1247l.m3235w())) {
                this.f1557e.setVisibility(8);
            } else {
                this.f1557e.setText(abstractC1247l.m3235w());
            }
        }
        if (this.f1556d != null) {
            if (TextUtils.isEmpty(abstractC1247l.m3233v())) {
                this.f1556d.setVisibility(8);
            } else {
                this.f1556d.setText(abstractC1247l.m3233v());
            }
        }
        if (this.f1558f != null) {
            if (TextUtils.isEmpty(abstractC1247l.m3157A())) {
                this.f1558f.setText(C0731d.m243a(getContext(), this.f1564l));
            } else {
                this.f1558f.setText(abstractC1247l.m3157A());
            }
        }
        m926b(abstractC1247l);
    }

    /* JADX INFO: renamed from: a */
    private boolean m923a() {
        return this.f1571s && !this.f1572t;
    }

    /* JADX INFO: renamed from: b */
    private void m925b() {
        m930d();
        AbstractC1247l abstractC1247l = this.f1564l;
        if (this.f1554b != null) {
            String strM3237x = abstractC1247l.m3237x();
            if (!TextUtils.isEmpty(strM3237x)) {
                ViewGroup.LayoutParams layoutParams = this.f1554b.getLayoutParams();
                C1378b.m4482a(getContext()).m4494a(new C1381e(1, strM3237x), layoutParams.width, layoutParams.height, new C09022(strM3237x));
            }
            if (TextUtils.isEmpty(abstractC1247l.m3237x())) {
                this.f1554b.setVisibility(8);
            }
        }
        if (this.f1555c != null) {
            String strM3241z = abstractC1247l.m3241z();
            if (TextUtils.isEmpty(strM3241z)) {
                this.f1555c.setVisibility(8);
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.f1555c.getLayoutParams();
                C1378b.m4482a(getContext()).m4494a(new C1381e(1, strM3241z), layoutParams2.width, layoutParams2.height, new C09033(strM3241z, layoutParams2));
            }
        }
        if (this.f1557e != null) {
            if (TextUtils.isEmpty(abstractC1247l.m3235w())) {
                this.f1557e.setVisibility(8);
            } else {
                this.f1557e.setText(abstractC1247l.m3235w());
            }
        }
        if (this.f1556d != null) {
            if (TextUtils.isEmpty(abstractC1247l.m3233v())) {
                this.f1556d.setVisibility(8);
            } else {
                this.f1556d.setText(abstractC1247l.m3233v());
            }
        }
        if (this.f1558f != null) {
            if (TextUtils.isEmpty(abstractC1247l.m3157A())) {
                this.f1558f.setText(C0731d.m243a(getContext(), this.f1564l));
            } else {
                this.f1558f.setText(abstractC1247l.m3157A());
            }
        }
        m926b(abstractC1247l);
        ImageView imageView = this.f1554b;
        if (imageView != null) {
            imageView.setOnClickListener(this.f1576x);
            this.f1574v.add(this.f1554b);
        }
        TextView textView = this.f1556d;
        if (textView != null) {
            textView.setOnClickListener(this.f1576x);
            this.f1574v.add(this.f1556d);
        }
        TextView textView2 = this.f1557e;
        if (textView2 != null) {
            textView2.setOnClickListener(this.f1576x);
            this.f1574v.add(this.f1557e);
        }
        Button button = this.f1558f;
        if (button != null) {
            button.setOnClickListener(this.f1576x);
            this.f1574v.add(this.f1558f);
        }
        ImageView imageView2 = this.f1555c;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this.f1576x);
            this.f1574v.add(this.f1555c);
        }
        BaseShakeView baseShakeView = this.f1559g;
        if (baseShakeView != null && this.f1573u) {
            baseShakeView.setOnClickListener(this.f1576x);
            this.f1559g.setOnShakeListener(new C09088(), this.f1562j);
        }
        View viewFindViewById = this.f1553a.findViewById(C1345i.m4154a(getContext(), "myoffer_panel_view_blank", "id"));
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this.f1576x);
            this.f1574v.add(viewFindViewById);
        } else {
            this.f1553a.setOnClickListener(this.f1576x);
            this.f1574v.add(this.f1553a);
        }
        ImageView imageView3 = this.f1554b;
        if (imageView3 instanceof RoundImageView) {
            ((RoundImageView) imageView3).setNeedRadiu(true);
            int i = this.f1565m;
            if (i == 2 || i == 6) {
                ((RoundImageView) this.f1554b).setRadiusInDip(8);
            } else {
                ((RoundImageView) this.f1554b).setRadiusInDip(12);
            }
            this.f1554b.invalidate();
        }
        C0996a c0996a = this.f1575w;
        if (c0996a != null) {
            c0996a.m1207a(this.f1565m).m1208a(new C09011()).m1210a(getContext(), this.f1553a);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m926b(final AbstractC1247l abstractC1247l) {
        if (this.f1566n == null) {
            return;
        }
        if (!m923a()) {
            ViewGroup viewGroup = this.f1566n;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            TextView textView = this.f1567o;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = this.f1568p;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TextView textView3 = this.f1570r;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TextView textView4 = this.f1569q;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            try {
                View viewFindViewById = findViewById(C1345i.m4154a(getContext(), "myoffer_four_element_container_bg", "id"));
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundDrawable(null);
                    return;
                }
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        this.f1567o.setText(getContext().getResources().getString(C1345i.m4154a(getContext(), "myoffer_panel_version", C1875i.f11532g), abstractC1247l.m3172K()));
        this.f1568p.setText(abstractC1247l.m3171J());
        this.f1570r.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1350n.m4203a(C1175n.m2059a().m2148f(), abstractC1247l.m3173L());
            }
        });
        this.f1569q.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1350n.m4203a(C1175n.m2059a().m2148f(), abstractC1247l.m3174M());
            }
        });
        this.f1567o.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        this.f1568p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        ViewGroup viewGroup2 = this.f1566n;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        TextView textView5 = this.f1567o;
        if (textView5 != null) {
            textView5.setVisibility(0);
        }
        TextView textView6 = this.f1568p;
        if (textView6 != null) {
            textView6.setVisibility(0);
        }
        TextView textView7 = this.f1570r;
        if (textView7 != null) {
            textView7.setVisibility(0);
        }
        TextView textView8 = this.f1569q;
        if (textView8 != null) {
            textView8.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m928c() {
        RoundImageView roundImageView;
        int i;
        ImageView imageView = this.f1554b;
        if (imageView instanceof RoundImageView) {
            ((RoundImageView) imageView).setNeedRadiu(true);
            int i2 = this.f1565m;
            if (i2 == 2 || i2 == 6) {
                roundImageView = (RoundImageView) this.f1554b;
                i = 8;
            } else {
                roundImageView = (RoundImageView) this.f1554b;
                i = 12;
            }
            roundImageView.setRadiusInDip(i);
            this.f1554b.invalidate();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m930d() {
        this.f1574v.clear();
        this.f1554b = (ImageView) this.f1553a.findViewById(C1345i.m4154a(getContext(), "myoffer_iv_banner_icon", "id"));
        this.f1556d = (TextView) this.f1553a.findViewById(C1345i.m4154a(getContext(), "myoffer_tv_banner_title", "id"));
        this.f1557e = (TextView) this.f1553a.findViewById(C1345i.m4154a(getContext(), "myoffer_tv_banner_desc", "id"));
        this.f1558f = (Button) this.f1553a.findViewById(C1345i.m4154a(getContext(), "myoffer_btn_banner_cta", "id"));
        this.f1555c = (ImageView) this.f1553a.findViewById(C1345i.m4154a(getContext(), "myoffer_ad_logo", "id"));
        this.f1566n = (ViewGroup) this.f1553a.findViewById(C1345i.m4154a(getContext(), "myoffer_four_element_container", "id"));
        this.f1567o = (TextView) this.f1553a.findViewById(C1345i.m4154a(getContext(), "myoffer_version_name", "id"));
        this.f1568p = (TextView) this.f1553a.findViewById(C1345i.m4154a(getContext(), "myoffer_publisher_name", "id"));
        this.f1569q = (TextView) this.f1553a.findViewById(C1345i.m4154a(getContext(), "myoffer_permission_manage", "id"));
        this.f1570r = (TextView) this.f1553a.findViewById(C1345i.m4154a(getContext(), "myoffer_privacy_agreement", "id"));
        try {
            BaseShakeView baseShakeView = (BaseShakeView) this.f1553a.findViewById(C1345i.m4154a(getContext(), "myoffer_shake_hint_text", "id"));
            this.f1559g = baseShakeView;
            baseShakeView.setShakeSetting(this.f1563k.f4333n);
        } catch (Throwable unused) {
        }
        m932e();
    }

    /* JADX INFO: renamed from: e */
    private void m932e() {
        BaseShakeView baseShakeView;
        if (!this.f1573u || (baseShakeView = this.f1559g) == null || this.f1565m == 8) {
            return;
        }
        baseShakeView.setVisibility(0);
    }

    /* JADX INFO: renamed from: f */
    private void m934f() {
        ImageView imageView = this.f1554b;
        if (imageView != null) {
            imageView.setOnClickListener(this.f1576x);
            this.f1574v.add(this.f1554b);
        }
        TextView textView = this.f1556d;
        if (textView != null) {
            textView.setOnClickListener(this.f1576x);
            this.f1574v.add(this.f1556d);
        }
        TextView textView2 = this.f1557e;
        if (textView2 != null) {
            textView2.setOnClickListener(this.f1576x);
            this.f1574v.add(this.f1557e);
        }
        Button button = this.f1558f;
        if (button != null) {
            button.setOnClickListener(this.f1576x);
            this.f1574v.add(this.f1558f);
        }
        ImageView imageView2 = this.f1555c;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this.f1576x);
            this.f1574v.add(this.f1555c);
        }
        BaseShakeView baseShakeView = this.f1559g;
        if (baseShakeView != null && this.f1573u) {
            baseShakeView.setOnClickListener(this.f1576x);
            this.f1559g.setOnShakeListener(new C09088(), this.f1562j);
        }
        View viewFindViewById = this.f1553a.findViewById(C1345i.m4154a(getContext(), "myoffer_panel_view_blank", "id"));
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this.f1576x);
            this.f1574v.add(viewFindViewById);
        } else {
            this.f1553a.setOnClickListener(this.f1576x);
            this.f1574v.add(this.f1553a);
        }
    }

    public View getCTAButton() {
        return this.f1558f;
    }

    public List<View> getClickViews() {
        return this.f1574v;
    }

    public View getShakeView() {
        return this.f1559g;
    }

    public void init(AbstractC1247l abstractC1247l, C1248m c1248m, int i, boolean z, InterfaceC0910a interfaceC0910a) {
        this.f1560h = interfaceC0910a;
        this.f1561i = i;
        this.f1564l = abstractC1247l;
        this.f1563k = c1248m;
        this.f1562j = c1248m.f4333n;
        this.f1573u = z;
        this.f1571s = abstractC1247l.m3176O();
        this.f1572t = this.f1562j.m3377u() == 1;
        this.f1574v = new ArrayList();
        this.f1575w = new C0996a(abstractC1247l, this.f1562j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        if (android.text.TextUtils.isEmpty(r9.f1564l.m3237x()) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r10 = android.view.LayoutInflater.from(getContext());
        r0 = com.anythink.core.common.p066o.C1345i.m4154a(getContext(), "myoffer_panel_view_horizontal_without_icon", "layout");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        r10 = android.view.LayoutInflater.from(getContext());
        r0 = getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
    
        if (android.text.TextUtils.isEmpty(r9.f1564l.m3237x()) != false) goto L18;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setLayoutType(int r10) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.PanelView.setLayoutType(int):void");
    }
}
