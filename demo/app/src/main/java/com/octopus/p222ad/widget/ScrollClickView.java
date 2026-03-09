package com.octopus.p222ad.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.octopus.p222ad.utils.p258b.C3255f;

/* JADX INFO: loaded from: classes2.dex */
public class ScrollClickView extends LinearLayout {
    public static final String DIR_DOWN = "down";
    public static final String DIR_LEFT = "left";
    public static final String DIR_RIGHT = "right";
    public static final String DIR_UP = "up";

    /* JADX INFO: renamed from: a */
    public ImageView f17972a;

    /* JADX INFO: renamed from: b */
    public ImageView f17973b;

    /* JADX INFO: renamed from: c */
    public TextView f17974c;

    /* JADX INFO: renamed from: d */
    public TextView f17975d;

    /* JADX INFO: renamed from: e */
    private boolean f17976e;

    /* JADX INFO: renamed from: f */
    private String f17977f;

    /* JADX INFO: renamed from: g */
    private String f17978g;

    /* JADX INFO: renamed from: h */
    private int f17979h;

    /* JADX INFO: renamed from: i */
    private int f17980i;

    /* JADX INFO: renamed from: j */
    private String f17981j;

    /* JADX INFO: renamed from: k */
    private int f17982k;

    /* JADX INFO: renamed from: l */
    private int f17983l;

    /* JADX INFO: renamed from: m */
    private ValueAnimator f17984m;

    /* JADX INFO: renamed from: n */
    private Context f17985n;

    /* JADX INFO: renamed from: o */
    private FrameLayout f17986o;

    /* JADX INFO: renamed from: p */
    private FrameLayout f17987p;

    /* JADX INFO: renamed from: q */
    private LinearLayout f17988q;

    public ScrollClickView(Context context) {
        super(context);
        this.f17976e = false;
        this.f17981j = DIR_UP;
        this.f17982k = 45;
        this.f17983l = 180;
        this.f17988q = null;
        init(context);
    }

    public ScrollClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17976e = false;
        this.f17981j = DIR_UP;
        this.f17982k = 45;
        this.f17983l = 180;
        this.f17988q = null;
        init(context);
    }

    public ScrollClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17976e = false;
        this.f17981j = DIR_UP;
        this.f17982k = 45;
        this.f17983l = 180;
        this.f17988q = null;
        init(context);
    }

    /* JADX INFO: renamed from: a */
    private void m15105a() {
        this.f17972a.post(new Runnable() { // from class: com.octopus.ad.widget.ScrollClickView.1
            @Override // java.lang.Runnable
            public void run() {
                if (ScrollClickView.this.f17986o == null || ScrollClickView.this.f17987p == null) {
                    C3255f.m14982b("ScrollClickUtil", "scrollContainer or scrollBarContainer is null , please check !");
                    return;
                }
                if (ScrollClickView.this.f17972a.getLayoutParams() == null) {
                    return;
                }
                final int i = ScrollClickView.this.f17972a.getLayoutParams().height;
                ScrollClickView scrollClickView = ScrollClickView.this;
                scrollClickView.f17984m = ValueAnimator.ofInt(i, scrollClickView.f17983l);
                C3255f.m14982b("ScrollClickUtil", "handHeight = " + i + ",scrollbarHeight = " + ScrollClickView.this.f17983l);
                ViewGroup.LayoutParams layoutParams = ScrollClickView.this.f17973b.getLayoutParams();
                StringBuilder sb = new StringBuilder();
                sb.append("handHeight = ");
                sb.append(i);
                C3255f.m14982b("ScrollClickUtil", sb.toString());
                if (layoutParams != null) {
                    layoutParams.height = ScrollClickView.this.f17983l;
                }
                ScrollClickView.this.f17984m.setDuration(1000L);
                ScrollClickView.this.f17984m.setRepeatCount(-1);
                ScrollClickView.this.f17984m.setRepeatMode(1);
                ScrollClickView.this.f17984m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.octopus.ad.widget.ScrollClickView.1.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.LayoutParams layoutParams2 = ScrollClickView.this.f17972a.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).topMargin = ScrollClickView.this.f17983l - iIntValue;
                        }
                        ViewGroup.LayoutParams layoutParams3 = ScrollClickView.this.f17987p.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            layoutParams3.height = iIntValue - (i / 3);
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                            layoutParams4.topMargin = ScrollClickView.this.f17983l - layoutParams4.height;
                        }
                        ScrollClickView.this.f17986o.requestLayout();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private void m15107b() {
        this.f17972a.post(new Runnable() { // from class: com.octopus.ad.widget.ScrollClickView.2
            @Override // java.lang.Runnable
            public void run() {
                if (ScrollClickView.this.f17986o == null || ScrollClickView.this.f17987p == null) {
                    C3255f.m14982b("ScrollClickUtil", "scrollContainer or scrollBarContainer is null , please check !");
                    return;
                }
                if (ScrollClickView.this.f17972a.getLayoutParams() == null) {
                    return;
                }
                final int i = ScrollClickView.this.f17972a.getLayoutParams().height;
                ScrollClickView scrollClickView = ScrollClickView.this;
                scrollClickView.f17984m = ValueAnimator.ofInt(i, scrollClickView.f17983l);
                ViewGroup.LayoutParams layoutParams = ScrollClickView.this.f17973b.getLayoutParams();
                C3255f.m14982b("ScrollClickUtil", "handHeight = " + i);
                if (layoutParams != null) {
                    layoutParams.height = ScrollClickView.this.f17983l;
                }
                ScrollClickView.this.f17984m.setDuration(1000L);
                ScrollClickView.this.f17984m.setRepeatCount(-1);
                ScrollClickView.this.f17984m.setRepeatMode(1);
                ScrollClickView.this.f17984m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.octopus.ad.widget.ScrollClickView.2.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.LayoutParams layoutParams2 = ScrollClickView.this.f17986o.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.height = iIntValue;
                        }
                        ViewGroup.LayoutParams layoutParams3 = ScrollClickView.this.f17987p.getLayoutParams();
                        if (layoutParams3 != null) {
                            layoutParams3.height = iIntValue - (i / 3);
                        }
                        ScrollClickView.this.f17986o.requestLayout();
                    }
                });
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildRealView() {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.octopus.p222ad.widget.ScrollClickView.buildRealView():void");
    }

    public void init(Context context) {
        if (this.f17976e) {
            return;
        }
        this.f17985n = context;
        this.f17976e = true;
    }

    public void setDetailText(String str) {
        this.f17978g = str;
    }

    public void setDetailsFont(int i) {
        this.f17980i = i;
    }

    public void setHandWidth(int i) {
        this.f17982k = i;
    }

    public void setScrollDirection(String str) {
        this.f17981j = str;
    }

    public void setScrollbarHeight(int i) {
        this.f17983l = i;
    }

    public void setTitleFont(int i) {
        this.f17979h = i;
    }

    public void setTitleText(String str) {
        this.f17977f = str;
    }

    public void startAnim() {
        StringBuilder sb = new StringBuilder();
        sb.append("startAnim animator != null ? ");
        sb.append(this.f17984m != null);
        C3255f.m14982b("ScrollClickUtil", sb.toString());
        ValueAnimator valueAnimator = this.f17984m;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public void stopAnim() {
        ValueAnimator valueAnimator = this.f17984m;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f17984m.cancel();
        }
    }
}
