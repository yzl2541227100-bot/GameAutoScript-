package com.anythink.basead.p025ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class ScanningAnimButton extends Button {

    /* JADX INFO: renamed from: a */
    public ValueAnimator f1651a;

    public ScanningAnimButton(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private static void m1017a() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAnimation();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimation();
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            startAnimation();
        } else {
            stopAnimation();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            startAnimation();
        } else {
            stopAnimation();
        }
    }

    public void startAnimation() {
        if (this.f1651a == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.95f);
            this.f1651a = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(500L);
            this.f1651a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.ScanningAnimButton.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    ScanningAnimButton.this.setScaleX(fFloatValue);
                    ScanningAnimButton.this.setScaleY(fFloatValue);
                }
            });
            this.f1651a.setRepeatMode(2);
            this.f1651a.setRepeatCount(-1);
        }
        if (this.f1651a.isStarted()) {
            return;
        }
        this.f1651a.start();
    }

    public void stopAnimation() {
        ValueAnimator valueAnimator = this.f1651a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
