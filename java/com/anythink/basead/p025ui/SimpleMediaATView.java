package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p066o.C1339c;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;

/* JADX INFO: loaded from: classes.dex */
public class SimpleMediaATView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f1695a;

    /* JADX INFO: renamed from: b */
    public ImageView f1696b;

    /* JADX INFO: renamed from: c */
    private int f1697c;

    /* JADX INFO: renamed from: d */
    private int f1698d;

    /* JADX INFO: renamed from: e */
    private int f1699e;

    /* JADX INFO: renamed from: f */
    private Bitmap f1700f;

    /* JADX INFO: renamed from: com.anythink.basead.ui.SimpleMediaATView$1 */
    public class C09361 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f1701a;

        public C09361(String str) {
            this.f1701a = str;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, final Bitmap bitmap) {
            if (TextUtils.equals(str, this.f1701a)) {
                SimpleMediaATView.this.post(new Runnable() { // from class: com.anythink.basead.ui.SimpleMediaATView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SimpleMediaATView.this.f1700f = bitmap;
                        SimpleMediaATView.this.m1031a(bitmap);
                        SimpleMediaATView.this.f1695a.setImageBitmap(bitmap);
                        SimpleMediaATView.this.f1695a.setVisibility(0);
                        C1339c.m4025a(SimpleMediaATView.this.getContext(), bitmap, new C1339c.a() { // from class: com.anythink.basead.ui.SimpleMediaATView.1.1.1
                            @Override // com.anythink.core.common.p066o.C1339c.a
                            /* JADX INFO: renamed from: a */
                            public final void mo673a() {
                            }

                            @Override // com.anythink.core.common.p066o.C1339c.a
                            /* JADX INFO: renamed from: a */
                            public final void mo674a(Bitmap bitmap2) {
                                SimpleMediaATView.this.f1696b.setImageBitmap(bitmap2);
                                SimpleMediaATView.this.f1696b.setVisibility(0);
                            }
                        });
                    }
                });
            }
        }
    }

    public SimpleMediaATView(Context context) {
        this(context, null);
    }

    public SimpleMediaATView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleMediaATView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m1031a(Bitmap bitmap) {
        int[] iArrM4270a = C1360x.m4270a(this.f1697c, this.f1698d, bitmap.getWidth() / bitmap.getHeight());
        ViewGroup.LayoutParams layoutParams = this.f1695a.getLayoutParams();
        layoutParams.width = iArrM4270a[0];
        layoutParams.height = iArrM4270a[1];
        this.f1695a.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            int i = layoutParams2.width == -2 ? iArrM4270a[0] : this.f1697c;
            int i2 = layoutParams2.height == -2 ? iArrM4270a[1] : this.f1698d;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (!childAt.equals(this.f1695a)) {
                    if (childAt != null) {
                        ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                        layoutParams3.width = i;
                        childAt.setLayoutParams(layoutParams3);
                    }
                    if (childAt != null) {
                        ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                        layoutParams4.height = i2;
                        childAt.setLayoutParams(layoutParams4);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1032a(View view, int i) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m1033b(View view, int i) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public void initView(AbstractC1247l abstractC1247l) {
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_simple_media_ad_view", "layout"), this);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f1699e = iMax;
        this.f1697c = iMax;
        this.f1698d = iMax;
        this.f1696b = (ImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_simple_background", "id"));
        ImageView imageView = (ImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_simple_main_image", "id"));
        this.f1695a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        String strM3239y = abstractC1247l.m3239y();
        try {
            C1378b.m4482a(getContext()).m4495a(new C1381e(1, strM3239y), new C09361(strM3239y));
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Bitmap bitmap = this.f1700f;
        if (bitmap == null) {
            if (size != 0 && size < this.f1697c) {
                this.f1697c = size;
            }
            if (size2 == 0 || size2 >= this.f1698d) {
                return;
            }
            this.f1698d = size2;
            return;
        }
        boolean z = false;
        boolean z3 = true;
        if (size != 0 && size < this.f1697c) {
            this.f1697c = size;
            z = true;
        }
        if (size2 == 0 || size2 >= this.f1698d) {
            z3 = z;
        } else {
            this.f1698d = size2;
        }
        if (z3) {
            m1031a(bitmap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setLayoutParams(android.view.ViewGroup.LayoutParams r6) {
        /*
            r5 = this;
            super.setLayoutParams(r6)
            int r0 = r6.width
            r1 = 1
            r2 = -2
            r3 = -1
            if (r0 == r3) goto L15
            if (r0 != r2) goto Ld
            goto L15
        Ld:
            int r4 = r5.f1697c
            if (r4 == r0) goto L19
            r5.f1697c = r0
            r0 = 1
            goto L1a
        L15:
            int r0 = r5.f1699e
            r5.f1697c = r0
        L19:
            r0 = 0
        L1a:
            int r6 = r6.height
            if (r6 == r3) goto L28
            if (r6 != r2) goto L21
            goto L28
        L21:
            int r2 = r5.f1698d
            if (r2 == r6) goto L2c
            r5.f1698d = r6
            goto L2d
        L28:
            int r6 = r5.f1699e
            r5.f1698d = r6
        L2c:
            r1 = r0
        L2d:
            android.graphics.Bitmap r6 = r5.f1700f
            if (r6 == 0) goto L36
            if (r1 == 0) goto L36
            r5.m1031a(r6)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.SimpleMediaATView.setLayoutParams(android.view.ViewGroup$LayoutParams):void");
    }
}
