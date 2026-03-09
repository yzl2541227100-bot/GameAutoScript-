package p285z2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import p285z2.InterfaceC3805dk;

/* JADX INFO: renamed from: z2.bk */
/* JADX INFO: loaded from: classes2.dex */
public final class C3731bk {

    /* JADX INFO: renamed from: z2.bk$OooO00o */
    public static class OooO00o extends AnimatorListenerAdapter {
        public final /* synthetic */ InterfaceC3805dk OooO00o;

        public OooO00o(InterfaceC3805dk interfaceC3805dk) {
            this.OooO00o = interfaceC3805dk;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.OooO00o.OooO0O0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.OooO00o.OooO00o();
        }
    }

    private C3731bk() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Animator OooO00o(InterfaceC3805dk interfaceC3805dk, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(interfaceC3805dk, (Property<InterfaceC3805dk, V>) InterfaceC3805dk.OooO0OO.OooO00o, (TypeEvaluator) InterfaceC3805dk.OooO0O0.OooO0O0, (Object[]) new InterfaceC3805dk.OooO[]{new InterfaceC3805dk.OooO(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return objectAnimatorOfObject;
        }
        InterfaceC3805dk.OooO revealInfo = interfaceC3805dk.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC3805dk, (int) f, (int) f2, revealInfo.OooO0OO, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Animator OooO0O0(InterfaceC3805dk interfaceC3805dk, float f, float f2, float f3, float f4) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(interfaceC3805dk, (Property<InterfaceC3805dk, V>) InterfaceC3805dk.OooO0OO.OooO00o, (TypeEvaluator) InterfaceC3805dk.OooO0O0.OooO0O0, (Object[]) new InterfaceC3805dk.OooO[]{new InterfaceC3805dk.OooO(f, f2, f3), new InterfaceC3805dk.OooO(f, f2, f4)});
        if (Build.VERSION.SDK_INT < 21) {
            return objectAnimatorOfObject;
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC3805dk, (int) f, (int) f2, f3, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    public static Animator.AnimatorListener OooO0OO(InterfaceC3805dk interfaceC3805dk) {
        return new OooO00o(interfaceC3805dk);
    }
}
