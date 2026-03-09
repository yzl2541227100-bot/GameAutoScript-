package com.anythink.basead.p025ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.anythink.basead.p025ui.WaveAnimImageView;
import com.anythink.core.common.p066o.C1345i;

/* JADX INFO: loaded from: classes.dex */
public class GuideToClickView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public WaveAnimImageView f1424a;

    /* JADX INFO: renamed from: b */
    public WaveAnimImageView f1425b;

    /* JADX INFO: renamed from: c */
    public ImageView f1426c;

    /* JADX INFO: renamed from: d */
    public TextView f1427d;

    /* JADX INFO: renamed from: e */
    public float f1428e;

    /* JADX INFO: renamed from: f */
    public float f1429f;

    /* JADX INFO: renamed from: g */
    public float f1430g;

    /* JADX INFO: renamed from: h */
    public float f1431h;

    /* JADX INFO: renamed from: i */
    public float f1432i;

    /* JADX INFO: renamed from: j */
    public float f1433j;

    /* JADX INFO: renamed from: k */
    public final int f1434k;

    /* JADX INFO: renamed from: l */
    public final int f1435l;

    /* JADX INFO: renamed from: m */
    public final float f1436m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f1437n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f1438o;

    /* JADX INFO: renamed from: p */
    public ScaleAnimation f1439p;

    /* JADX INFO: renamed from: com.anythink.basead.ui.GuideToClickView$a */
    public static class C0870a {

        /* JADX INFO: renamed from: a */
        public static final int f1442a = 501;

        /* JADX INFO: renamed from: b */
        public static final int f1443b = 502;

        /* JADX INFO: renamed from: c */
        public static final int f1444c = 503;

        /* JADX INFO: renamed from: d */
        public static final int f1445d = 504;

        /* JADX INFO: renamed from: e */
        public static final int f1446e = 505;

        /* JADX INFO: renamed from: f */
        public static final int f1447f = 506;

        /* JADX INFO: renamed from: g */
        public static final int f1448g = 507;
    }

    public GuideToClickView(Context context) {
        super(context);
        this.f1434k = 1000;
        this.f1435l = 200;
        this.f1436m = 0.71428573f;
        m876a(context);
    }

    public GuideToClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1434k = 1000;
        this.f1435l = 200;
        this.f1436m = 0.71428573f;
        m876a(context);
    }

    public GuideToClickView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1434k = 1000;
        this.f1435l = 200;
        this.f1436m = 0.71428573f;
        m876a(context);
    }

    /* JADX INFO: renamed from: a */
    private void m875a() {
        startAnim(this.f1437n, this.f1424a, 0L);
        startAnim(this.f1438o, this.f1425b, 800L);
        this.f1426c.startAnimation(this.f1439p);
    }

    /* JADX INFO: renamed from: a */
    private void m876a(Context context) {
        LayoutInflater.from(context).inflate(C1345i.m4154a(context, "myoffer_guide_to_click", "layout"), this);
        setBackgroundColor(Color.parseColor("#66000000"));
        this.f1428e = 0.8f;
        this.f1429f = 0.05f;
        this.f1430g = C1345i.m4153a(context, 4.0f);
        this.f1431h = C1345i.m4153a(context, 18.0f);
        this.f1432i = C1345i.m4153a(context, 2.0f);
        this.f1433j = C1345i.m4153a(context, 40.0f);
        this.f1424a = (WaveAnimImageView) findViewById(C1345i.m4154a(context, "myoffer_wave_anim_image", "id"));
        this.f1425b = (WaveAnimImageView) findViewById(C1345i.m4154a(context, "myoffer_wave_anim_image2", "id"));
        this.f1437n = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1438o = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1426c = (ImageView) findViewById(C1345i.m4154a(context, "myoffer_guide_to_click_finger", "id"));
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f);
        this.f1439p = scaleAnimation;
        scaleAnimation.setRepeatMode(2);
        this.f1439p.setRepeatCount(-1);
        this.f1439p.setDuration(333L);
        this.f1427d = (TextView) findViewById(C1345i.m4154a(context, "myoffer_guide_to_click_hint", "id"));
    }

    /* JADX INFO: renamed from: b */
    private void m877b() {
        ValueAnimator valueAnimator = this.f1437n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f1438o;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ScaleAnimation scaleAnimation = this.f1439p;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAnim(this.f1437n, this.f1424a, 0L);
        startAnim(this.f1438o, this.f1425b, 800L);
        this.f1426c.startAnimation(this.f1439p);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f1437n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f1438o;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ScaleAnimation scaleAnimation = this.f1439p;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    public void setFingerImageResource(Bitmap bitmap) {
        ImageView imageView = this.f1426c;
        if (imageView == null || bitmap == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public void setFingerViewMode(int i) {
        int iM4153a;
        int iM4153a2;
        Context context;
        float f;
        setBackgroundColor(0);
        C1345i.m4153a(getContext(), 200.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1424a.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f1425b.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f1426c.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f1427d.getLayoutParams();
        switch (i) {
            case 501:
            case C0870a.f1448g /* 507 */:
                layoutParams.addRule(14);
                layoutParams.addRule(13, 0);
                this.f1424a.setLayoutParams(layoutParams);
                layoutParams2.addRule(14);
                layoutParams2.addRule(13, 0);
                this.f1425b.setLayoutParams(layoutParams2);
                break;
            case 502:
            case 503:
                if (i == 502) {
                    iM4153a = C1345i.m4153a(getContext(), 100.0f);
                    this.f1427d.setTextSize(1, 14.0f);
                    this.f1431h = C1345i.m4153a(getContext(), 12.0f);
                    this.f1433j = C1345i.m4153a(getContext(), 30.0f);
                } else {
                    iM4153a = C1345i.m4153a(getContext(), 160.0f);
                    this.f1427d.setTextSize(1, 16.0f);
                }
                layoutParams.width = iM4153a;
                layoutParams.height = iM4153a;
                layoutParams.addRule(14);
                layoutParams.addRule(13, 0);
                layoutParams2.width = iM4153a;
                layoutParams2.height = iM4153a;
                layoutParams2.addRule(14);
                layoutParams2.addRule(13, 0);
                int i2 = iM4153a / 2;
                layoutParams3.width = i2;
                layoutParams3.height = (int) ((((double) iM4153a) / 2.0d) * 1.1d);
                layoutParams3.setMargins(i2, i2, 0, 0);
                break;
            case 504:
            case C0870a.f1446e /* 505 */:
            case C0870a.f1447f /* 506 */:
                if (i == 505 || i == 504) {
                    iM4153a2 = C1345i.m4153a(getContext(), 50.0f);
                    this.f1431h = C1345i.m4153a(getContext(), 6.0f);
                    context = getContext();
                    f = 18.0f;
                } else {
                    iM4153a2 = C1345i.m4153a(getContext(), 120.0f);
                    this.f1431h = C1345i.m4153a(getContext(), 8.0f);
                    context = getContext();
                    f = 24.0f;
                }
                this.f1433j = C1345i.m4153a(context, f);
                layoutParams.width = iM4153a2;
                layoutParams.height = iM4153a2;
                layoutParams.addRule(15);
                layoutParams.addRule(13, 0);
                this.f1424a.setLayoutParams(layoutParams);
                layoutParams2.width = iM4153a2;
                layoutParams2.height = iM4153a2;
                layoutParams2.addRule(15);
                layoutParams2.addRule(13, 0);
                this.f1425b.setLayoutParams(layoutParams2);
                int i3 = iM4153a2 / 2;
                layoutParams3.width = i3;
                layoutParams3.height = (int) ((((double) iM4153a2) / 2.0d) * 1.1d);
                layoutParams3.setMargins(i3, i3, 0, 0);
                this.f1426c.setLayoutParams(layoutParams3);
                layoutParams4.addRule(14, 0);
                layoutParams4.addRule(3, 0);
                layoutParams4.addRule(15);
                layoutParams4.addRule(1, this.f1424a.getId());
                layoutParams4.setMargins(C1345i.m4153a(getContext(), 6.0f), 0, C1345i.m4153a(getContext(), 10.0f), 0);
                this.f1427d.setLayoutParams(layoutParams4);
                this.f1427d.setTextSize(1, 12.0f);
                break;
        }
    }

    public void startAnim(ValueAnimator valueAnimator, final WaveAnimImageView waveAnimImageView, long j) {
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setDuration(1400L);
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.GuideToClickView.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float f;
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    if (fFloatValue > 0.71428573f) {
                        waveAnimImageView.setVisibility(4);
                        return;
                    }
                    float f2 = fFloatValue / 0.71428573f;
                    GuideToClickView guideToClickView = GuideToClickView.this;
                    float f3 = guideToClickView.f1432i;
                    float f4 = ((guideToClickView.f1433j - f3) * f2) + f3;
                    float f5 = guideToClickView.f1430g + ((guideToClickView.f1431h - f3) * f2);
                    double d = f2;
                    if (d < 0.2d) {
                        float f6 = guideToClickView.f1428e;
                        f = (float) (((double) f6) + ((1.0d - (((double) (f2 * 1.0f)) / 0.2d)) * ((double) (guideToClickView.f1429f - f6))));
                    } else {
                        float f7 = guideToClickView.f1428e;
                        f = (float) (((double) f7) + ((((d - 0.2d) * 1.0d) / 0.8d) * ((double) (guideToClickView.f1429f - f7))));
                    }
                    try {
                        if (guideToClickView.getVisibility() == 0) {
                            waveAnimImageView.setWaveAnimParams(new WaveAnimImageView.C0957a(f4, f5, f));
                            if (waveAnimImageView.getVisibility() != 0) {
                                waveAnimImageView.setVisibility(0);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            valueAnimator.setStartDelay(j);
            valueAnimator.start();
        }
    }
}
