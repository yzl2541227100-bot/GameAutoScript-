package com.anythink.core.common.p071ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.anythink.core.common.p066o.C1360x;

/* JADX INFO: loaded from: classes.dex */
public class RoundRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public int f5623a;

    public RoundRelativeLayout(Context context) {
        this(context, null);
    }

    public RoundRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5623a = dip2px(context, 4.0f);
    }

    public RoundRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        this(context);
    }

    /* JADX INFO: renamed from: a */
    private void m4575a(Context context) {
        this.f5623a = dip2px(context, 4.0f);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.draw(canvas);
        C1360x.m4263a(canvas, getWidth(), getHeight(), this.f5623a);
        canvas.restoreToCount(iSaveLayer);
    }
}
