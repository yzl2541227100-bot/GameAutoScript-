package com.octopus.p222ad.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.octopus.p222ad.internal.utilities.ViewUtil;
import com.octopus.p222ad.utils.p258b.C3255f;
import com.octopus.p222ad.widget.ScrollClickView;

/* JADX INFO: renamed from: com.octopus.ad.utils.i */
/* JADX INFO: loaded from: classes2.dex */
public class C3268i {

    /* JADX INFO: renamed from: a */
    public int f17932a;

    /* JADX INFO: renamed from: b */
    public int f17933b;

    /* JADX INFO: renamed from: c */
    private Context f17934c;

    /* JADX INFO: renamed from: d */
    private int f17935d;

    /* JADX INFO: renamed from: e */
    private int f17936e;

    /* JADX INFO: renamed from: f */
    private a f17937f = null;

    /* JADX INFO: renamed from: g */
    private boolean f17938g = false;

    /* JADX INFO: renamed from: h */
    private int f17939h = 200;

    /* JADX INFO: renamed from: i */
    private ScrollClickView f17940i;

    /* JADX INFO: renamed from: com.octopus.ad.utils.i$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo14768a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);
    }

    public C3268i(Context context) {
        this.f17934c = context;
    }

    /* JADX INFO: renamed from: c */
    public static Pair<Integer, Boolean> m15055c(int i) {
        int iRandom = (int) ((Math.random() * 100.0d) + 1.0d);
        return iRandom <= i ? new Pair<>(Integer.valueOf(iRandom), Boolean.TRUE) : new Pair<>(Integer.valueOf(iRandom), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d */
    private void m15056d() {
        if (((Boolean) m15055c(this.f17936e).second).booleanValue()) {
            C3262c.m15017a(new Runnable() { // from class: com.octopus.ad.utils.i.1
                @Override // java.lang.Runnable
                public void run() {
                    C3268i.this.m15061b();
                }
            }, this.f17935d + (((Integer) r0.first).intValue() * 10));
        }
    }

    /* JADX INFO: renamed from: a */
    public View m15057a(final int i, final int i2) {
        C3255f.m14981a("ScrollClickUtil", "enter getScrollClick");
        if (this.f17934c == null) {
            return null;
        }
        try {
            ScrollClickView scrollClickView = new ScrollClickView(this.f17934c);
            this.f17940i = scrollClickView;
            scrollClickView.setScrollDirection(ScrollClickView.DIR_UP);
            this.f17940i.setTitleText("向上滑动");
            this.f17940i.setTitleFont(15);
            this.f17940i.setDetailText("解锁更多有趣内容");
            this.f17940i.setDetailsFont(12);
            int i3 = Integer.parseInt("50");
            int i4 = Integer.parseInt("80");
            this.f17940i.setHandWidth(i3);
            this.f17940i.setScrollbarHeight(i4);
            this.f17940i.buildRealView();
            TextUtils.isEmpty("50%");
            TextUtils.isEmpty("50%");
            this.f17932a = "50%".endsWith("%") ? (Integer.parseInt("50%".substring(0, "50%".indexOf("%"))) * i) / 100 : Integer.parseInt("50%");
            this.f17933b = "50%".endsWith("%") ? (Integer.parseInt("50%".substring(0, "50%".indexOf("%"))) * i2) / 100 : Integer.parseInt("50%");
            this.f17932a = ViewUtil.dip2px(this.f17934c, this.f17932a);
            this.f17933b = ViewUtil.dip2px(this.f17934c, this.f17933b);
            final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            C3255f.m14981a("ScrollClickUtil", "topInt = " + this.f17933b + ",centerXInt = " + this.f17932a + ",adWidthDp = " + i + ",adHeightDp = " + i2);
            this.f17940i.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.octopus.ad.utils.i.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (C3268i.this.f17940i == null) {
                        return;
                    }
                    C3268i.this.f17940i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    int measuredWidth = C3268i.this.f17940i.getMeasuredWidth();
                    C3268i c3268i = C3268i.this;
                    if (c3268i.f17933b == 0) {
                        c3268i.f17933b = ViewUtil.dip2px(c3268i.f17934c, i2) / 2;
                    }
                    C3268i c3268i2 = C3268i.this;
                    if (c3268i2.f17932a == 0) {
                        c3268i2.f17932a = ViewUtil.dip2px(c3268i2.f17934c, i) / 2;
                    }
                    FrameLayout.LayoutParams layoutParams2 = layoutParams;
                    C3268i c3268i3 = C3268i.this;
                    layoutParams2.topMargin = c3268i3.f17933b;
                    layoutParams2.leftMargin = c3268i3.f17932a - (measuredWidth / 2);
                    c3268i3.f17940i.setLayoutParams(layoutParams);
                    C3255f.m14981a("ScrollClickUtil", "topMargin = " + layoutParams.topMargin + ",leftMargin = " + layoutParams.leftMargin + ",scrollViewWidthInt = " + measuredWidth);
                }
            });
            this.f17940i.setLayoutParams(layoutParams);
            this.f17940i.postDelayed(new Runnable() { // from class: com.octopus.ad.utils.i.3
                @Override // java.lang.Runnable
                public void run() {
                    C3268i.this.f17940i.startAnim();
                }
            }, 10L);
            return this.f17940i;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15058a() {
        m15059a(1000);
        m15062b(0);
    }

    /* JADX INFO: renamed from: a */
    public void m15059a(int i) {
        this.f17935d = i;
    }

    /* JADX INFO: renamed from: a */
    public void m15060a(a aVar) {
        this.f17937f = aVar;
    }

    /* JADX INFO: renamed from: b */
    public void m15061b() {
        StringBuilder sb = new StringBuilder();
        sb.append("enter callBackShakeHappened and mShakeStateListener != null ? ");
        sb.append(this.f17937f != null);
        sb.append(",!isCallBack = ");
        sb.append(!this.f17938g);
        C3255f.m14981a("ScrollClickUtil", sb.toString());
        if (this.f17937f == null || this.f17938g) {
            return;
        }
        C3255f.m14981a("ScrollClickUtil", "callback onShakeHappened()");
        this.f17937f.mo14768a("100", "200", "105", "206", "100", "200", "105", "206");
        this.f17938g = true;
        ScrollClickView scrollClickView = this.f17940i;
        if (scrollClickView != null) {
            scrollClickView.stopAnim();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15062b(int i) {
        this.f17936e = i;
        m15056d();
    }

    /* JADX INFO: renamed from: c */
    public void m15063c() {
        this.f17938g = false;
        ScrollClickView scrollClickView = this.f17940i;
        if (scrollClickView != null) {
            scrollClickView.stopAnim();
        }
        this.f17937f = null;
        this.f17934c = null;
        this.f17940i = null;
        this.f17939h = 200;
    }
}
