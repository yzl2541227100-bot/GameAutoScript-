package com.anythink.basead.p025ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class ScanningAnimTextView extends TextView {

    /* JADX INFO: renamed from: a */
    public ValueAnimator f1653a;

    public ScanningAnimTextView(Context context) {
        super(context);
    }

    public ScanningAnimTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private static void m1018a() {
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
        if (this.f1653a == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.95f);
            this.f1653a = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(500L);
            this.f1653a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.ScanningAnimTextView.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    ScanningAnimTextView.this.setScaleX(fFloatValue);
                    ScanningAnimTextView.this.setScaleY(fFloatValue);
                }
            });
            this.f1653a.setRepeatMode(2);
            this.f1653a.setRepeatCount(-1);
        }
        if (this.f1653a.isStarted()) {
            return;
        }
        this.f1653a.start();
    }

    public void stopAnimation() {
        ValueAnimator valueAnimator = this.f1653a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
