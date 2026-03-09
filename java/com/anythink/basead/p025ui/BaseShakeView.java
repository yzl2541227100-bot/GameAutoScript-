package com.anythink.basead.p025ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.anythink.basead.p015c.AbstractC0750h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.shake.C1974a;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseShakeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f1302a;

    /* JADX INFO: renamed from: b */
    public ImageView f1303b;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f1304c;

    /* JADX INFO: renamed from: d */
    public int f1305d;

    /* JADX INFO: renamed from: e */
    public String f1306e;

    /* JADX INFO: renamed from: f */
    public String f1307f;

    /* JADX INFO: renamed from: g */
    public String f1308g;

    /* JADX INFO: renamed from: h */
    public String f1309h;

    /* JADX INFO: renamed from: i */
    public Bitmap f1310i;

    /* JADX INFO: renamed from: j */
    public AbstractC0750h f1311j;

    /* JADX INFO: renamed from: k */
    private int f1312k;

    /* JADX INFO: renamed from: l */
    private InterfaceC0852a f1313l;

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseShakeView$1 */
    public class C08381 extends AbstractC0750h {
        public C08381() {
        }

        @Override // com.anythink.basead.p015c.AbstractC0750h
        /* JADX INFO: renamed from: a */
        public final boolean mo317a() {
            if (BaseShakeView.this.isShown() && BaseShakeView.this.f1313l != null) {
                return BaseShakeView.this.f1313l.mo827a();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseShakeView$10 */
    public class C083910 implements ValueAnimator.AnimatorUpdateListener {
        public C083910() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseShakeView.this.f1302a.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseShakeView$11 */
    public class C084011 extends AnimatorListenerAdapter {
        public C084011() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseShakeView.m820b(BaseShakeView.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseShakeView$12 */
    public class InterpolatorC084112 implements Interpolator {
        public InterpolatorC084112() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if ((BaseShakeView.this.f1312k / 2) % 3 == 0) {
                return 0.0f;
            }
            return f;
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseShakeView$13 */
    public class RunnableC084213 implements Runnable {
        public RunnableC084213() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int width = (int) (((double) BaseShakeView.this.f1302a.getWidth()) * 0.8d);
            int height = (int) (((double) BaseShakeView.this.f1302a.getHeight()) * 0.8d);
            BaseShakeView.this.f1302a.setPivotX(width);
            BaseShakeView.this.f1302a.setPivotY(height);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseShakeView$14 */
    public class C084314 implements ValueAnimator.AnimatorUpdateListener {
        public C084314() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseShakeView.this.f1302a.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseShakeView$2 */
    public class C08442 extends AnimatorListenerAdapter {
        public C08442() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseShakeView.m820b(BaseShakeView.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseShakeView$3 */
    public class InterpolatorC08453 implements Interpolator {
        public InterpolatorC08453() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if (BaseShakeView.this.f1312k % 3 == 2) {
                return 0.0f;
            }
            return f;
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseShakeView$4 */
    public class RunnableC08464 implements Runnable {
        public RunnableC08464() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int width = (int) (((double) BaseShakeView.this.f1302a.getWidth()) * 0.5d);
            int height = (int) (((double) BaseShakeView.this.f1302a.getHeight()) * 0.5d);
            BaseShakeView.this.f1302a.setPivotX(width);
            BaseShakeView.this.f1302a.setPivotY(height);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseShakeView$5 */
    public class RunnableC08475 implements Runnable {
        public RunnableC08475() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int iMin;
            try {
                iMin = Math.min(BaseShakeView.this.getResources().getDisplayMetrics().widthPixels, BaseShakeView.this.getResources().getDisplayMetrics().heightPixels) / 2;
            } catch (Throwable unused) {
                iMin = 0;
            }
            BaseShakeView baseShakeView = BaseShakeView.this;
            baseShakeView.f1310i = C1378b.m4482a(baseShakeView.getContext()).m4497b(new C1381e(3, BaseShakeView.this.f1306e), iMin, iMin);
            BaseShakeView.this.m823c();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseShakeView$6 */
    public class RunnableC08486 implements Runnable {
        public RunnableC08486() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseShakeView baseShakeView = BaseShakeView.this;
            ImageView imageView = baseShakeView.f1302a;
            if (imageView != null) {
                Bitmap bitmap = baseShakeView.f1310i;
                if (bitmap != null) {
                    imageView.setImageBitmap(bitmap);
                } else {
                    imageView.setImageResource(C1345i.m4154a(baseShakeView.getContext(), "myoffer_shake_icon", C1875i.f11528c));
                }
            }
            BaseShakeView baseShakeView2 = BaseShakeView.this;
            ImageView imageView2 = baseShakeView2.f1303b;
            if (imageView2 != null) {
                Bitmap bitmap2 = baseShakeView2.f1310i;
                if (bitmap2 != null) {
                    imageView2.setImageBitmap(bitmap2);
                } else {
                    imageView2.setImageResource(C1345i.m4154a(baseShakeView2.getContext(), "myoffer_shake_icon", C1875i.f11528c));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseShakeView$7 */
    public class C08497 implements ValueAnimator.AnimatorUpdateListener {
        public C08497() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseShakeView.this.f1302a.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseShakeView$8 */
    public class C08508 extends AnimatorListenerAdapter {
        public C08508() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseShakeView.m820b(BaseShakeView.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseShakeView$9 */
    public class InterpolatorC08519 implements Interpolator {
        public InterpolatorC08519() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if (BaseShakeView.this.f1312k % 3 == 2) {
                return 0.0f;
            }
            return f;
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseShakeView$a */
    public interface InterfaceC0852a {
        /* JADX INFO: renamed from: a */
        boolean mo827a();
    }

    public BaseShakeView(Context context) {
        super(context);
        this.f1312k = 0;
        this.f1311j = new AbstractC0750h() { // from class: com.anythink.basead.ui.BaseShakeView.1
            public C08381() {
            }

            @Override // com.anythink.basead.p015c.AbstractC0750h
            /* JADX INFO: renamed from: a */
            public final boolean mo317a() {
                if (BaseShakeView.this.isShown() && BaseShakeView.this.f1313l != null) {
                    return BaseShakeView.this.f1313l.mo827a();
                }
                return false;
            }
        };
        mo826a();
    }

    public BaseShakeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1312k = 0;
        this.f1311j = new AbstractC0750h() { // from class: com.anythink.basead.ui.BaseShakeView.1
            public C08381() {
            }

            @Override // com.anythink.basead.p015c.AbstractC0750h
            /* JADX INFO: renamed from: a */
            public final boolean mo317a() {
                if (BaseShakeView.this.isShown() && BaseShakeView.this.f1313l != null) {
                    return BaseShakeView.this.f1313l.mo827a();
                }
                return false;
            }
        };
        mo826a();
    }

    public BaseShakeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1312k = 0;
        this.f1311j = new AbstractC0750h() { // from class: com.anythink.basead.ui.BaseShakeView.1
            public C08381() {
            }

            @Override // com.anythink.basead.p015c.AbstractC0750h
            /* JADX INFO: renamed from: a */
            public final boolean mo317a() {
                if (BaseShakeView.this.isShown() && BaseShakeView.this.f1313l != null) {
                    return BaseShakeView.this.f1313l.mo827a();
                }
                return false;
            }
        };
        mo826a();
    }

    @RequiresApi(api = 21)
    public BaseShakeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1312k = 0;
        this.f1311j = new AbstractC0750h() { // from class: com.anythink.basead.ui.BaseShakeView.1
            public C08381() {
            }

            @Override // com.anythink.basead.p015c.AbstractC0750h
            /* JADX INFO: renamed from: a */
            public final boolean mo317a() {
                if (BaseShakeView.this.isShown() && BaseShakeView.this.f1313l != null) {
                    return BaseShakeView.this.f1313l.mo827a();
                }
                return false;
            }
        };
        mo826a();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m820b(BaseShakeView baseShakeView) {
        int i = baseShakeView.f1312k;
        baseShakeView.f1312k = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: b */
    private void m821b() {
        if (this.f1302a != null) {
            ValueAnimator valueAnimatorMo825a = mo825a(this.f1305d);
            this.f1304c = valueAnimatorMo825a;
            if (valueAnimatorMo825a != null) {
                valueAnimatorMo825a.start();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m823c() {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.basead.ui.BaseShakeView.6
            public RunnableC08486() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                BaseShakeView baseShakeView = BaseShakeView.this;
                ImageView imageView = baseShakeView.f1302a;
                if (imageView != null) {
                    Bitmap bitmap = baseShakeView.f1310i;
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    } else {
                        imageView.setImageResource(C1345i.m4154a(baseShakeView.getContext(), "myoffer_shake_icon", C1875i.f11528c));
                    }
                }
                BaseShakeView baseShakeView2 = BaseShakeView.this;
                ImageView imageView2 = baseShakeView2.f1303b;
                if (imageView2 != null) {
                    Bitmap bitmap2 = baseShakeView2.f1310i;
                    if (bitmap2 != null) {
                        imageView2.setImageBitmap(bitmap2);
                    } else {
                        imageView2.setImageResource(C1345i.m4154a(baseShakeView2.getContext(), "myoffer_shake_icon", C1875i.f11528c));
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public ValueAnimator mo825a(int i) {
        ValueAnimator valueAnimatorOfFloat;
        ImageView imageView;
        Runnable runnableC084213;
        if (i == 2) {
            int iM4153a = C1345i.m4153a(getContext(), 8.0f);
            float f = iM4153a;
            float f2 = -iM4153a;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, f, f2, f, f2, iM4153a / 2, r5 / 2, iM4153a / 4, r5 / 4, 0.0f);
            valueAnimatorOfFloat2.setDuration(1000L);
            valueAnimatorOfFloat2.setRepeatCount(-1);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.BaseShakeView.7
                public C08497() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BaseShakeView.this.f1302a.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.anythink.basead.ui.BaseShakeView.8
                public C08508() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    BaseShakeView.m820b(BaseShakeView.this);
                }
            });
            valueAnimatorOfFloat2.setInterpolator(new Interpolator() { // from class: com.anythink.basead.ui.BaseShakeView.9
                public InterpolatorC08519() {
                }

                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f3) {
                    if (BaseShakeView.this.f1312k % 3 == 2) {
                        return 0.0f;
                    }
                    return f3;
                }
            });
            return valueAnimatorOfFloat2;
        }
        if (i != 3) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -25.0f, 0.0f, 25.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(500L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.BaseShakeView.14
                public C084314() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BaseShakeView.this.f1302a.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.anythink.basead.ui.BaseShakeView.2
                public C08442() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    BaseShakeView.m820b(BaseShakeView.this);
                }
            });
            valueAnimatorOfFloat.setInterpolator(new Interpolator() { // from class: com.anythink.basead.ui.BaseShakeView.3
                public InterpolatorC08453() {
                }

                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f3) {
                    if (BaseShakeView.this.f1312k % 3 == 2) {
                        return 0.0f;
                    }
                    return f3;
                }
            });
            imageView = this.f1302a;
            runnableC084213 = new Runnable() { // from class: com.anythink.basead.ui.BaseShakeView.4
                public RunnableC08464() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int width = (int) (((double) BaseShakeView.this.f1302a.getWidth()) * 0.5d);
                    int height = (int) (((double) BaseShakeView.this.f1302a.getHeight()) * 0.5d);
                    BaseShakeView.this.f1302a.setPivotX(width);
                    BaseShakeView.this.f1302a.setPivotY(height);
                }
            };
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(-10.0f, 10.0f);
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.setRepeatMode(2);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.BaseShakeView.10
                public C083910() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BaseShakeView.this.f1302a.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.anythink.basead.ui.BaseShakeView.11
                public C084011() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    BaseShakeView.m820b(BaseShakeView.this);
                }
            });
            valueAnimatorOfFloat.setInterpolator(new Interpolator() { // from class: com.anythink.basead.ui.BaseShakeView.12
                public InterpolatorC084112() {
                }

                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f3) {
                    if ((BaseShakeView.this.f1312k / 2) % 3 == 0) {
                        return 0.0f;
                    }
                    return f3;
                }
            });
            imageView = this.f1302a;
            runnableC084213 = new Runnable() { // from class: com.anythink.basead.ui.BaseShakeView.13
                public RunnableC084213() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int width = (int) (((double) BaseShakeView.this.f1302a.getWidth()) * 0.8d);
                    int height = (int) (((double) BaseShakeView.this.f1302a.getHeight()) * 0.8d);
                    BaseShakeView.this.f1302a.setPivotX(width);
                    BaseShakeView.this.f1302a.setPivotY(height);
                }
            };
        }
        imageView.post(runnableC084213);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo826a();

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1302a != null) {
            ValueAnimator valueAnimatorMo825a = mo825a(this.f1305d);
            this.f1304c = valueAnimatorMo825a;
            if (valueAnimatorMo825a != null) {
                valueAnimatorMo825a.start();
            }
        }
        C1974a.m10477a().m10478a(this.f1311j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f1304c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C1974a.m10477a().m10479b(this.f1311j);
    }

    public void setOnShakeListener(InterfaceC0852a interfaceC0852a, AbstractC1249n abstractC1249n) {
        this.f1311j.m316a(abstractC1249n.m3279R(), abstractC1249n.m3281S());
        this.f1313l = interfaceC0852a;
    }

    public void setShakeSetting(AbstractC1249n abstractC1249n) {
        this.f1305d = abstractC1249n.m3295a();
        this.f1306e = abstractC1249n.m3319b();
        this.f1307f = abstractC1249n.m3324c();
        this.f1308g = abstractC1249n.m3329d();
        this.f1309h = abstractC1249n.m3334e();
        if (TextUtils.isEmpty(this.f1306e)) {
            m823c();
        } else {
            C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.basead.ui.BaseShakeView.5
                public RunnableC08475() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int iMin;
                    try {
                        iMin = Math.min(BaseShakeView.this.getResources().getDisplayMetrics().widthPixels, BaseShakeView.this.getResources().getDisplayMetrics().heightPixels) / 2;
                    } catch (Throwable unused) {
                        iMin = 0;
                    }
                    BaseShakeView baseShakeView = BaseShakeView.this;
                    baseShakeView.f1310i = C1378b.m4482a(baseShakeView.getContext()).m4497b(new C1381e(3, BaseShakeView.this.f1306e), iMin, iMin);
                    BaseShakeView.this.m823c();
                }
            }, 2, true);
        }
    }
}
