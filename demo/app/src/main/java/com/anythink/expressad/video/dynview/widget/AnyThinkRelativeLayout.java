package com.anythink.expressad.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class AnyThinkRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private boolean f13432a;

    /* JADX INFO: renamed from: b */
    private AnimatorSet f13433b;

    /* JADX INFO: renamed from: c */
    private boolean f13434c;

    public AnyThinkRelativeLayout(Context context) {
        super(context);
    }

    public AnyThinkRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f13433b;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f13432a) {
            this.f13432a = true;
        }
        AnimatorSet animatorSet = this.f13433b;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f13433b = animatorSet;
    }
}
