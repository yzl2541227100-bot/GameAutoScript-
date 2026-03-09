package com.anythink.basead.p025ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.anythink.core.common.p066o.C1360x;

/* JADX INFO: loaded from: classes.dex */
public class RoundFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f2020a;

    public RoundFrameLayout(Context context) {
        super(context);
        this.f2020a = dip2px(getContext(), 10.0f);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2020a = dip2px(getContext(), 10.0f);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2020a = dip2px(getContext(), 10.0f);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.dispatchDraw(canvas);
        C1360x.m4263a(canvas, getWidth(), getHeight(), this.f2020a);
        canvas.restoreToCount(iSaveLayer);
    }
}
