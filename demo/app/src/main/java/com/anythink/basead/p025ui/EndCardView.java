package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1339c;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p071ui.component.RoundImageView;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class EndCardView extends BaseEndCardView {

    /* JADX INFO: renamed from: e */
    private InterfaceC0864a f1400e;

    /* JADX INFO: renamed from: f */
    private int f1401f;

    /* JADX INFO: renamed from: g */
    private int f1402g;

    /* JADX INFO: renamed from: h */
    private ImageView f1403h;

    /* JADX INFO: renamed from: i */
    private ImageView f1404i;

    /* JADX INFO: renamed from: j */
    private TextView f1405j;

    /* JADX INFO: renamed from: k */
    private Bitmap f1406k;

    /* JADX INFO: renamed from: l */
    private final View.OnClickListener f1407l;

    /* JADX INFO: renamed from: com.anythink.basead.ui.EndCardView$2 */
    public class C08622 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC1247l f1409a;

        public C08622(AbstractC1247l abstractC1247l) {
            this.f1409a = abstractC1247l;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
            if (EndCardView.this.f1400e != null) {
                EndCardView.this.f1400e.mo797b();
            }
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f1409a.m3239y())) {
                EndCardView.this.f1403h.setImageBitmap(bitmap);
                C1339c.m4025a(EndCardView.this.getContext(), bitmap, new C1339c.a() { // from class: com.anythink.basead.ui.EndCardView.2.1
                    @Override // com.anythink.core.common.p066o.C1339c.a
                    /* JADX INFO: renamed from: a */
                    public final void mo673a() {
                        if (EndCardView.this.f1400e != null) {
                            EndCardView.this.f1400e.mo797b();
                        }
                    }

                    @Override // com.anythink.core.common.p066o.C1339c.a
                    /* JADX INFO: renamed from: a */
                    public final void mo674a(Bitmap bitmap2) {
                        EndCardView.this.f1406k = bitmap2;
                        EndCardView.this.setBackgroundDrawable(new BitmapDrawable(EndCardView.this.f1406k));
                        if (EndCardView.this.f1400e != null) {
                            EndCardView.this.f1400e.mo797b();
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.EndCardView$3 */
    public class C08633 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f1412a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f1413b;

        public C08633(String str, int i) {
            this.f1412a = str;
            this.f1413b = i;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f1412a)) {
                int i = this.f1413b;
                ViewGroup.LayoutParams layoutParams = EndCardView.this.f1404i.getLayoutParams();
                layoutParams.width = (int) (i * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                layoutParams.height = i;
                EndCardView.this.f1404i.setLayoutParams(layoutParams);
                EndCardView.this.f1404i.setScaleType(ImageView.ScaleType.FIT_XY);
                EndCardView.this.f1404i.setImageBitmap(bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.EndCardView$a */
    public interface InterfaceC0864a {
        /* JADX INFO: renamed from: a */
        void mo796a();

        /* JADX INFO: renamed from: b */
        void mo797b();
    }

    public EndCardView(Context context, AbstractC1247l abstractC1247l, C1248m c1248m) {
        super(context, abstractC1247l, c1248m);
        this.f1407l = new View.OnClickListener() { // from class: com.anythink.basead.ui.EndCardView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC1249n abstractC1249n = EndCardView.this.f1221d;
                if (abstractC1249n != null) {
                    if (abstractC1249n.m3251D() == 0) {
                        if (EndCardView.this.f1400e != null) {
                            EndCardView.this.f1400e.mo796a();
                        }
                    } else {
                        if (EndCardView.this.f1405j == null || view != EndCardView.this.f1405j || EndCardView.this.f1405j.getVisibility() != 0 || EndCardView.this.f1400e == null) {
                            return;
                        }
                        EndCardView.this.f1400e.mo796a();
                    }
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    private void m859a(AbstractC1247l abstractC1247l) {
        try {
            C1378b.m4482a(getContext()).m4494a(new C1381e(1, abstractC1247l.m3239y()), this.f1401f, this.f1402g, new C08622(abstractC1247l));
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m861b(AbstractC1247l abstractC1247l) {
        this.f1404i = new RoundImageView(getContext());
        int iM4153a = C1345i.m4153a(getContext(), 12.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, iM4153a);
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        addView(this.f1404i, layoutParams);
        String strM3241z = abstractC1247l.m3241z();
        if (TextUtils.isEmpty(strM3241z)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.f1404i.getLayoutParams();
        C1378b.m4482a(getContext()).m4494a(new C1381e(1, strM3241z), layoutParams2.width, layoutParams2.height, new C08633(strM3241z, iM4153a));
    }

    /* JADX INFO: renamed from: c */
    private void m863c() {
        ScanningAnimTextView scanningAnimTextView = new ScanningAnimTextView(getContext());
        this.f1405j = scanningAnimTextView;
        scanningAnimTextView.setText(C1345i.m4154a(getContext(), "myoffer_cta_learn_more", C1875i.f11532g));
        this.f1405j.setTextColor(Color.parseColor("#ffffffff"));
        this.f1405j.setTextSize(14.0f);
        this.f1405j.setGravity(17);
        this.f1405j.setBackgroundResource(C1345i.m4154a(getContext(), "myoffer_splash_bg_rectangle_btn_cta_asseblem", C1875i.f11528c));
        this.f1405j.setOnClickListener(this.f1407l);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C1345i.m4153a(getContext(), 48.0f));
        layoutParams.addRule(12);
        layoutParams.bottomMargin = C1345i.m4153a(getContext(), 96.0f);
        layoutParams.leftMargin = C1345i.m4153a(getContext(), 24.0f);
        layoutParams.rightMargin = C1345i.m4153a(getContext(), 24.0f);
        addView(this.f1405j, layoutParams);
    }

    @Override // com.anythink.basead.p025ui.BaseEndCardView
    /* JADX INFO: renamed from: a */
    public final void mo723a() {
    }

    @Override // com.anythink.basead.p025ui.BaseEndCardView
    /* JADX INFO: renamed from: b */
    public final Drawable mo724b() {
        Bitmap bitmap = this.f1406k;
        return (bitmap == null || bitmap.isRecycled()) ? super.mo724b() : new BitmapDrawable(this.f1406k);
    }

    public View getLearnMoreButton() {
        return this.f1405j;
    }

    public void init(boolean z, boolean z3, InterfaceC0864a interfaceC0864a) {
        setId(C1345i.m4154a(getContext(), "myoffer_end_card_id", "id"));
        this.f1400e = interfaceC0864a;
        this.f1403h = new RoundImageView(getContext());
        addView(this.f1403h, new RelativeLayout.LayoutParams(-1, -1));
        if (z) {
            AbstractC1247l abstractC1247l = this.f1219b;
            this.f1404i = new RoundImageView(getContext());
            int iM4153a = C1345i.m4153a(getContext(), 12.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, iM4153a);
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            addView(this.f1404i, layoutParams);
            String strM3241z = abstractC1247l.m3241z();
            if (!TextUtils.isEmpty(strM3241z)) {
                ViewGroup.LayoutParams layoutParams2 = this.f1404i.getLayoutParams();
                C1378b.m4482a(getContext()).m4494a(new C1381e(1, strM3241z), layoutParams2.width, layoutParams2.height, new C08633(strM3241z, iM4153a));
            }
        }
        if (z3) {
            ScanningAnimTextView scanningAnimTextView = new ScanningAnimTextView(getContext());
            this.f1405j = scanningAnimTextView;
            scanningAnimTextView.setText(C1345i.m4154a(getContext(), "myoffer_cta_learn_more", C1875i.f11532g));
            this.f1405j.setTextColor(Color.parseColor("#ffffffff"));
            this.f1405j.setTextSize(14.0f);
            this.f1405j.setGravity(17);
            this.f1405j.setBackgroundResource(C1345i.m4154a(getContext(), "myoffer_splash_bg_rectangle_btn_cta_asseblem", C1875i.f11528c));
            this.f1405j.setOnClickListener(this.f1407l);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, C1345i.m4153a(getContext(), 48.0f));
            layoutParams3.addRule(12);
            layoutParams3.bottomMargin = C1345i.m4153a(getContext(), 96.0f);
            layoutParams3.leftMargin = C1345i.m4153a(getContext(), 24.0f);
            layoutParams3.rightMargin = C1345i.m4153a(getContext(), 24.0f);
            addView(this.f1405j, layoutParams3);
        }
        setOnClickListener(this.f1407l);
    }

    public void load() {
        AbstractC1247l abstractC1247l = this.f1219b;
        try {
            C1378b.m4482a(getContext()).m4494a(new C1381e(1, abstractC1247l.m3239y()), this.f1401f, this.f1402g, new C08622(abstractC1247l));
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setSize(int i, int i2) {
        this.f1401f = i;
        this.f1402g = i2;
    }
}
