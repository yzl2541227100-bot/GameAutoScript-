package com.anythink.core.activity.component;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class LoadingView extends ImageView {
    public LoadingView(Context context) {
        super(context);
        m1582a();
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1582a();
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1582a();
    }

    /* JADX INFO: renamed from: a */
    private void m1582a() {
        setImageDrawable(getResources().getDrawable(C1345i.m4154a(getContext(), "core_loading", C1875i.f11528c)));
        try {
            setLayerType(Build.VERSION.SDK_INT >= 19 ? 2 : 1, null);
        } catch (Exception unused) {
        }
        m1583a(this);
    }

    /* JADX INFO: renamed from: a */
    private static void m1583a(View view) {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(linearInterpolator);
        rotateAnimation.setDuration(1000L);
        view.startAnimation(rotateAnimation);
    }

    public void startAnimation() {
        m1583a(this);
    }
}
