package com.anythink.core.basead.p045ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class WebProgressBarView extends View {

    /* JADX INFO: renamed from: a */
    public int f2815a;

    /* JADX INFO: renamed from: b */
    public int f2816b;

    /* JADX INFO: renamed from: c */
    public Paint f2817c;

    public WebProgressBarView(Context context) {
        super(context);
        m1803a();
    }

    public WebProgressBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1803a();
    }

    public WebProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1803a();
    }

    /* JADX INFO: renamed from: a */
    private void m1803a() {
        this.f2816b = -14575885;
        Paint paint = new Paint();
        this.f2817c = paint;
        paint.setColor(this.f2816b);
        this.f2817c.setAntiAlias(true);
        this.f2817c.setDither(true);
        this.f2815a = 0;
        setBackgroundColor(ViewCompat.MEASURED_SIZE_MASK);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, (getWidth() * this.f2815a) / 100, getHeight(), this.f2817c);
        canvas.restore();
    }

    public void setProgress(int i) {
        this.f2815a = i;
        postInvalidate();
    }
}
