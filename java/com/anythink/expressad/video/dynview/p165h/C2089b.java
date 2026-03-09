package com.anythink.expressad.video.dynview.p165h;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import com.anythink.expressad.video.dynview.C2074c;
import com.anythink.expressad.video.dynview.p166i.p167a.C2091a;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.h.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2089b {

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.h.b$1 */
    public class AnonymousClass1 implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f13244a;

        public AnonymousClass1(View view) {
            view = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            View view = view;
            if (view == null || !(view instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) view).removeAllViews();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = view;
            if (view == null || !(view instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) view).removeAllViews();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.h.b$2 */
    public class AnonymousClass2 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f13246a;

        public AnonymousClass2(View view) {
            view = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = view;
            if (view != null) {
                view.setPadding(0, 0, 0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                view.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.h.b$3 */
    public class AnonymousClass3 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f13248a;

        public AnonymousClass3(View view) {
            view = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = view;
            if (view != null) {
                view.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.h.b$4 */
    public class AnonymousClass4 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f13250a;

        public AnonymousClass4(View view) {
            view = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = view;
            if (view != null) {
                view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.requestLayout();
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.h.b$5 */
    public class AnonymousClass5 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f13252a;

        public AnonymousClass5(View view) {
            this.f13252a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f13252a.getLayoutParams();
            layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f13252a.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.h.b$6 */
    public class AnonymousClass6 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f13254a;

        public AnonymousClass6(View view) {
            this.f13254a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f13254a.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.f13254a.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public static ObjectAnimator m11163a(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, m11164a(View.SCALE_X), m11164a(View.SCALE_Y), m11165a(View.ROTATION_X, 5.0f)).setDuration(C1659a.f9130f);
        duration.setRepeatCount(-1);
        return duration;
    }

    /* JADX INFO: renamed from: a */
    private static PropertyValuesHolder m11164a(Property property) {
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.1f, 0.6f), Keyframe.ofFloat(0.2f, 0.8f), Keyframe.ofFloat(0.3f, 1.3f), Keyframe.ofFloat(0.4f, 0.8f), Keyframe.ofFloat(0.5f, 1.3f), Keyframe.ofFloat(0.6f, 0.9f), Keyframe.ofFloat(0.7f, 1.3f), Keyframe.ofFloat(0.8f, 1.0f), Keyframe.ofFloat(0.9f, 1.1f), Keyframe.ofFloat(1.0f, 1.0f));
    }

    /* JADX INFO: renamed from: a */
    private static PropertyValuesHolder m11165a(Property property, float f) {
        float f2 = (-2.0f) * f;
        float f3 = f * 2.0f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, f2), Keyframe.ofFloat(0.2f, f2), Keyframe.ofFloat(0.3f, f3), Keyframe.ofFloat(0.4f, f2), Keyframe.ofFloat(0.5f, f3), Keyframe.ofFloat(0.6f, f2), Keyframe.ofFloat(0.7f, f3), Keyframe.ofFloat(0.8f, f2), Keyframe.ofFloat(0.9f, f3), Keyframe.ofFloat(1.0f, 0.0f));
    }

    /* JADX INFO: renamed from: a */
    private void m11166a(View view, int i, int i2, int i3, int i4, long j) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.expressad.video.dynview.h.b.3

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f13248a;

            public AnonymousClass3(View view2) {
                view = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                if (view2 != null) {
                    view2.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.requestLayout();
                }
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i3, i4);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.expressad.video.dynview.h.b.4

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f13250a;

            public AnonymousClass4(View view2) {
                view = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                if (view2 != null) {
                    view2.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.requestLayout();
                    if (view.getVisibility() != 0) {
                        view.setVisibility(0);
                    }
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2);
        animatorSet.setDuration(j);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: a */
    private void m11167a(View view, int i, int i2, long j) {
        ValueAnimator duration = ValueAnimator.ofInt(i, i2).setDuration(j);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.expressad.video.dynview.h.b.2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f13246a;

            public AnonymousClass2(View view2) {
                view = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                if (view2 != null) {
                    view2.setPadding(0, 0, 0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    view.requestLayout();
                }
            }
        });
        duration.start();
    }

    /* JADX INFO: renamed from: a */
    private void m11168a(View view, int i, long j) {
        ValueAnimator valueAnimatorOfInt = view.getLayoutParams().width == 0 ? ValueAnimator.ofInt(0, i) : ValueAnimator.ofInt(i, 0);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addUpdateListener(new AnonymousClass5(view));
        ValueAnimator valueAnimatorOfFloat = view.getLayoutParams().width == 0 ? ValueAnimator.ofFloat(0.0f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AnonymousClass6(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfFloat);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: a */
    private void m11169a(View view, long j) {
        if (view == null) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = view.getLayoutParams().width == 0 ? ValueAnimator.ofInt(0, iM9847f) : ValueAnimator.ofInt(iM9847f, 0);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addUpdateListener(new AnonymousClass5(view));
        ValueAnimator valueAnimatorOfFloat = view.getLayoutParams().width == 0 ? ValueAnimator.ofFloat(0.0f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AnonymousClass6(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfFloat);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: a */
    private static void m11170a(Map map, C2074c c2074c, View view) {
        if (view != null) {
            C2091a.m11182a().m11184a(map, c2074c, view);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ObjectAnimator m11171b(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, m11172b(View.SCALE_X), m11172b(View.SCALE_Y)).setDuration(C1659a.f9130f);
        duration.setRepeatCount(-1);
        return duration;
    }

    /* JADX INFO: renamed from: b */
    private static PropertyValuesHolder m11172b(Property property) {
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.1f, 0.6f), Keyframe.ofFloat(0.2f, 0.6f), Keyframe.ofFloat(0.3f, 1.0f), Keyframe.ofFloat(0.4f, 1.0f), Keyframe.ofFloat(0.5f, 1.0f), Keyframe.ofFloat(0.6f, 1.0f), Keyframe.ofFloat(0.7f, 1.0f), Keyframe.ofFloat(0.8f, 1.0f), Keyframe.ofFloat(0.9f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f));
    }

    /* JADX INFO: renamed from: c */
    public static ObjectAnimator m11173c(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, m11165a(View.ROTATION, 2.0f)).setDuration(900L);
        duration.setRepeatCount(-1);
        return duration;
    }

    /* JADX INFO: renamed from: e */
    public static void m11174e(View view) {
        if (view != null) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(500L);
        }
    }

    /* JADX INFO: renamed from: f */
    private static TranslateAnimation m11175f(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(400L);
        view.setVisibility(0);
        return translateAnimation;
    }

    /* JADX INFO: renamed from: g */
    private static ObjectAnimator m11176g(View view) {
        return ObjectAnimator.ofPropertyValuesHolder(view, m11164a(View.SCALE_X), m11164a(View.SCALE_Y), m11165a(View.ROTATION_X, 5.0f)).setDuration(C1659a.f9130f);
    }

    /* JADX INFO: renamed from: h */
    private static ObjectAnimator m11177h(View view) {
        return ObjectAnimator.ofPropertyValuesHolder(view, m11172b(View.SCALE_X), m11172b(View.SCALE_Y)).setDuration(C1659a.f9130f);
    }

    /* JADX INFO: renamed from: i */
    private static ObjectAnimator m11178i(View view) {
        return ObjectAnimator.ofPropertyValuesHolder(view, m11165a(View.ROTATION, 2.0f)).setDuration(900L);
    }

    /* JADX INFO: renamed from: d */
    public final void m11179d(View view) {
        if (view != null) {
            view.setAlpha(1.0f);
            view.animate().alpha(0.0f).setDuration(500L).setListener(new Animator.AnimatorListener() { // from class: com.anythink.expressad.video.dynview.h.b.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f13244a;

                public AnonymousClass1(View view2) {
                    view = view2;
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    View view2 = view;
                    if (view2 == null || !(view2 instanceof ViewGroup)) {
                        return;
                    }
                    ((ViewGroup) view2).removeAllViews();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    View view2 = view;
                    if (view2 == null || !(view2 instanceof ViewGroup)) {
                        return;
                    }
                    ((ViewGroup) view2).removeAllViews();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            });
        }
    }
}
