package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.p010a.C0731d;
import com.anythink.basead.p025ui.BaseMediaATView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1339c;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.core.common.p071ui.component.RoundImageView;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import com.anythink.expressad.foundation.p138h.C1875i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MediaATView extends BaseMediaATView {
    public static final String TAG = "anythink_" + MediaATView.class.getSimpleName();

    /* JADX INFO: renamed from: g */
    public RelativeLayout f1470g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f1471h;

    /* JADX INFO: renamed from: i */
    public TextView f1472i;

    /* JADX INFO: renamed from: j */
    public TextView f1473j;

    /* JADX INFO: renamed from: k */
    public TextView f1474k;

    /* JADX INFO: renamed from: l */
    public TextView f1475l;

    /* JADX INFO: renamed from: m */
    public final float f1476m;

    /* JADX INFO: renamed from: n */
    private TextView f1477n;

    /* JADX INFO: renamed from: o */
    private TextView f1478o;

    /* JADX INFO: renamed from: p */
    private ImageView f1479p;

    /* JADX INFO: renamed from: q */
    private ImageView f1480q;

    /* JADX INFO: renamed from: r */
    private ImageView f1481r;

    /* JADX INFO: renamed from: s */
    private RoundImageView f1482s;

    /* JADX INFO: renamed from: t */
    private TextView f1483t;

    public MediaATView(Context context, AbstractC1247l abstractC1247l, C1248m c1248m, boolean z, BaseMediaATView.InterfaceC0819a interfaceC0819a) {
        super(context, abstractC1247l, c1248m, z, interfaceC0819a);
        this.f1476m = 1.0f;
    }

    @Override // com.anythink.basead.p025ui.BaseMediaATView
    public List<View> getClickViews() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f1478o);
        if (this.f1224b.m3251D() == 1) {
            return arrayList;
        }
        arrayList.add(this.f1477n);
        arrayList.add(this.f1480q);
        arrayList.add(this.f1482s);
        arrayList.add(this.f1483t);
        AbstractC1249n abstractC1249n = this.f1224b;
        if (abstractC1249n != null && abstractC1249n.m3251D() == 0) {
            arrayList.add(this.f1479p);
            arrayList.add(this.f1470g);
        }
        return arrayList;
    }

    @Override // com.anythink.basead.p025ui.BaseMediaATView
    public View getMonitorClickView() {
        return this.f1478o;
    }

    @Override // com.anythink.basead.p025ui.BaseMediaATView
    public void init(int i, int i2) {
        View viewFindViewById;
        super.init(i, i2);
        View viewInflate = LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_media_ad_view", "layout"), (ViewGroup) null, false);
        FrameLayout frameLayout = this.f1228f;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f1228f.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f1477n = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_ad_title", "id"));
        this.f1478o = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_media_ad_cta", "id"));
        this.f1479p = (ImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_media_ad_bg_blur", "id"));
        this.f1480q = (ImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_media_ad_main_image", "id"));
        this.f1481r = (ImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_ad_logo", "id"));
        this.f1482s = (RoundImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_media_ad_icon", "id"));
        this.f1483t = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_ad_desc", "id"));
        this.f1470g = (RelativeLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_media_ad_container", "id"));
        this.f1471h = (RelativeLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_four_element_container", "id"));
        this.f1472i = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_publisher_name", "id"));
        this.f1473j = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_privacy_agreement", "id"));
        this.f1474k = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_permission_manage", "id"));
        this.f1475l = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_version_name", "id"));
        String strM3233v = this.f1223a.m3233v();
        if (TextUtils.isEmpty(strM3233v)) {
            this.f1477n.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.f1483t.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).topMargin = 0;
                this.f1483t.setLayoutParams(layoutParams);
            }
        } else {
            this.f1477n.setText(strM3233v);
        }
        String strM3157A = this.f1223a.m3157A();
        if (TextUtils.isEmpty(strM3157A)) {
            this.f1478o.setText(C1345i.m4154a(getContext(), "myoffer_cta_learn_more", C1875i.f11532g));
        } else {
            this.f1478o.setText(strM3157A);
        }
        this.f1480q.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1223a.m3239y()), i, i2, new C1378b.a() { // from class: com.anythink.basead.ui.MediaATView.1
            @Override // com.anythink.core.common.res.C1378b.a
            public final void onFail(String str, String str2) {
                Log.e(MediaATView.TAG, "load: image load fail:".concat(String.valueOf(str2)));
            }

            @Override // com.anythink.core.common.res.C1378b.a
            public final void onSuccess(String str, final Bitmap bitmap) {
                if (TextUtils.equals(MediaATView.this.f1223a.m3239y(), str)) {
                    MediaATView.this.f1480q.setImageBitmap(bitmap);
                    MediaATView.this.post(new Runnable() { // from class: com.anythink.basead.ui.MediaATView.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            int[] iArrM4270a = C1360x.m4270a(MediaATView.this.getWidth(), MediaATView.this.getHeight(), bitmap.getWidth() / bitmap.getHeight());
                            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) MediaATView.this.f1480q.getLayoutParams();
                            if (layoutParams2 != null) {
                                layoutParams2.width = iArrM4270a[0];
                                layoutParams2.height = iArrM4270a[1];
                                layoutParams2.addRule(13);
                                MediaATView.this.f1480q.setLayoutParams(layoutParams2);
                            }
                        }
                    });
                    C1339c.m4025a(MediaATView.this.getContext(), bitmap, new C1339c.a() { // from class: com.anythink.basead.ui.MediaATView.1.2
                        @Override // com.anythink.core.common.p066o.C1339c.a
                        /* JADX INFO: renamed from: a */
                        public final void mo673a() {
                        }

                        @Override // com.anythink.core.common.p066o.C1339c.a
                        /* JADX INFO: renamed from: a */
                        public final void mo674a(Bitmap bitmap2) {
                            MediaATView.this.f1479p.setScaleType(ImageView.ScaleType.FIT_XY);
                            MediaATView.this.f1479p.setImageBitmap(bitmap2);
                        }
                    });
                }
            }
        });
        if (TextUtils.isEmpty(this.f1223a.m3241z())) {
            this.f1481r.setVisibility(8);
        } else {
            C1378b.m4482a(getContext()).m4495a(new C1381e(1, this.f1223a.m3241z()), new C1378b.a() { // from class: com.anythink.basead.ui.MediaATView.2
                @Override // com.anythink.core.common.res.C1378b.a
                public final void onFail(String str, String str2) {
                    MediaATView.this.f1481r.setVisibility(8);
                }

                @Override // com.anythink.core.common.res.C1378b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(MediaATView.this.f1223a.m3241z(), str)) {
                        MediaATView.this.f1481r.setImageBitmap(bitmap);
                        ViewGroup.LayoutParams layoutParams2 = MediaATView.this.f1481r.getLayoutParams();
                        int i3 = layoutParams2.height;
                        layoutParams2.width = (int) (i3 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                        layoutParams2.height = i3;
                        MediaATView.this.f1481r.setLayoutParams(layoutParams2);
                        MediaATView.this.f1481r.setScaleType(ImageView.ScaleType.FIT_XY);
                        MediaATView.this.f1481r.setImageBitmap(bitmap);
                        MediaATView.this.f1481r.setVisibility(0);
                    }
                }
            });
        }
        String strM3235w = this.f1223a.m3235w();
        if (TextUtils.isEmpty(strM3235w)) {
            this.f1483t.setVisibility(8);
        } else {
            this.f1483t.setText(strM3235w);
        }
        if (TextUtils.isEmpty(this.f1223a.m3237x())) {
            this.f1482s.setVisibility(8);
        } else {
            this.f1482s.setRadiusInDip(6);
            this.f1482s.setNeedRadiu(true);
            ViewGroup.LayoutParams layoutParams2 = this.f1482s.getLayoutParams();
            C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1223a.m3237x()), layoutParams2.width, layoutParams2.height, new C1378b.a() { // from class: com.anythink.basead.ui.MediaATView.3
                @Override // com.anythink.core.common.res.C1378b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.C1378b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(MediaATView.this.f1223a.m3237x(), str)) {
                        MediaATView.this.f1482s.setImageBitmap(bitmap);
                    }
                }
            });
        }
        if (this.f1223a.m3176O()) {
            RelativeLayout relativeLayout = this.f1471h;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                this.f1471h.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaATView.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
            TextView textView = this.f1472i;
            if (textView != null) {
                textView.setVisibility(0);
                this.f1472i.setText(this.f1223a.m3171J());
                this.f1472i.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaATView.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
            TextView textView2 = this.f1473j;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.f1473j.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaATView.6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1350n.m4203a(C1175n.m2059a().m2148f(), MediaATView.this.f1223a.m3173L());
                    }
                });
            }
            TextView textView3 = this.f1474k;
            if (textView3 != null) {
                textView3.setVisibility(0);
                this.f1474k.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaATView.7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1350n.m4203a(C1175n.m2059a().m2148f(), MediaATView.this.f1223a.m3174M());
                    }
                });
            }
            TextView textView4 = this.f1475l;
            if (textView4 != null) {
                textView4.setVisibility(0);
                this.f1475l.setText(getContext().getResources().getString(C1345i.m4154a(getContext(), "myoffer_panel_version", C1875i.f11532g), this.f1223a.m3172K()));
                this.f1475l.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaATView.8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
        }
        if (C0731d.m244a(this.f1223a) || (viewFindViewById = findViewById(C1345i.m4154a(getContext(), "myoffer_media_ad_main_image_container", "id"))) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
        if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = C1345i.m4153a(getContext(), 84.0f);
            viewFindViewById.setLayoutParams(layoutParams3);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
