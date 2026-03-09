package com.anythink.basead.p025ui.animplayerview.viewpager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class CircleIndicatorView extends View {

    /* JADX INFO: renamed from: a */
    private boolean f1938a;

    /* JADX INFO: renamed from: b */
    private final Path f1939b;

    public CircleIndicatorView(Context context) {
        this(context, null);
    }

    public CircleIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1939b = new Path();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int iMin = Math.min(width, height);
        this.f1939b.reset();
        this.f1939b.addCircle(width, height, iMin, Path.Direction.CCW);
        canvas.clipPath(this.f1939b);
        canvas.drawColor(this.f1938a ? -7829368 : -1);
        canvas.restore();
    }

    public void setSelectStatus(boolean z) {
        this.f1938a = z;
        invalidate();
    }
}
