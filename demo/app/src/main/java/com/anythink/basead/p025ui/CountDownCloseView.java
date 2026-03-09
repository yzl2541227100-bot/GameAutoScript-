package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class CountDownCloseView extends CloseImageView {

    /* JADX INFO: renamed from: a */
    private Paint f1371a;

    /* JADX INFO: renamed from: b */
    private Paint f1372b;

    /* JADX INFO: renamed from: c */
    private float f1373c;

    /* JADX INFO: renamed from: d */
    private int f1374d;

    /* JADX INFO: renamed from: e */
    private int f1375e;

    /* JADX INFO: renamed from: f */
    private int f1376f;

    /* JADX INFO: renamed from: g */
    private int f1377g;

    /* JADX INFO: renamed from: h */
    private int f1378h;

    /* JADX INFO: renamed from: i */
    private RectF f1379i;

    /* JADX INFO: renamed from: j */
    private float f1380j;

    /* JADX INFO: renamed from: k */
    private long f1381k;

    public CountDownCloseView(Context context) {
        this(context, null);
    }

    public CountDownCloseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1373c = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f1374d = Color.parseColor("#FF57575A");
        this.f1375e = -1;
        Paint paint = new Paint();
        this.f1371a = paint;
        paint.setAntiAlias(true);
        this.f1371a.setStrokeCap(Paint.Cap.ROUND);
        this.f1371a.setStyle(Paint.Style.STROKE);
        this.f1371a.setStrokeWidth(this.f1373c);
        Paint paint2 = new Paint();
        this.f1372b = paint2;
        paint2.setAntiAlias(true);
        this.f1372b.setColor(this.f1375e);
        this.f1379i = new RectF();
    }

    /* JADX INFO: renamed from: a */
    private void m853a() {
        float f = this.f1373c * 0.5f;
        float f2 = 0.0f + f;
        this.f1379i.set(f2, f2, this.f1376f - f, this.f1377g - f);
        this.f1378h = ((int) this.f1379i.width()) >> 1;
    }

    /* JADX INFO: renamed from: a */
    private void m854a(Context context) {
        this.f1373c = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f1374d = Color.parseColor("#FF57575A");
        this.f1375e = -1;
        Paint paint = new Paint();
        this.f1371a = paint;
        paint.setAntiAlias(true);
        this.f1371a.setStrokeCap(Paint.Cap.ROUND);
        this.f1371a.setStyle(Paint.Style.STROKE);
        this.f1371a.setStrokeWidth(this.f1373c);
        Paint paint2 = new Paint();
        this.f1372b = paint2;
        paint2.setAntiAlias(true);
        this.f1372b.setColor(this.f1375e);
        this.f1379i = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1380j < 360.0f) {
            this.f1371a.setColor(this.f1374d);
            canvas.drawArc(this.f1379i, 0.0f, 360.0f, false, this.f1371a);
            this.f1371a.setColor(this.f1375e);
            canvas.drawArc(this.f1379i, -90.0f, this.f1380j, false, this.f1371a);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f1376f = i;
        this.f1377g = i2;
        m853a();
    }

    public void refresh(long j) {
        long j2 = this.f1381k;
        if (j2 > 0) {
            this.f1380j = ((j * 1.0f) / j2) * 360.0f;
            postInvalidate();
        }
    }

    public void setDuration(long j) {
        this.f1381k = j;
    }

    public void setThickInPx(int i) {
        float f = i;
        this.f1373c = f;
        this.f1371a.setStrokeWidth(f);
        m853a();
    }

    public void setUnderRingColor(int i) {
        this.f1374d = i;
    }
}
