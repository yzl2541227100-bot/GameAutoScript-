package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class CountDownView extends View {

    /* JADX INFO: renamed from: a */
    private Paint f1382a;

    /* JADX INFO: renamed from: b */
    private Paint f1383b;

    /* JADX INFO: renamed from: c */
    private Paint f1384c;

    /* JADX INFO: renamed from: d */
    private float f1385d;

    /* JADX INFO: renamed from: e */
    private float f1386e;

    /* JADX INFO: renamed from: f */
    private int f1387f;

    /* JADX INFO: renamed from: g */
    private int f1388g;

    /* JADX INFO: renamed from: h */
    private int f1389h;

    /* JADX INFO: renamed from: i */
    private int f1390i;

    /* JADX INFO: renamed from: j */
    private int f1391j;

    /* JADX INFO: renamed from: k */
    private int f1392k;

    /* JADX INFO: renamed from: l */
    private RectF f1393l;

    /* JADX INFO: renamed from: m */
    private float f1394m;

    /* JADX INFO: renamed from: n */
    private String f1395n;

    /* JADX INFO: renamed from: o */
    private Rect f1396o;

    /* JADX INFO: renamed from: p */
    private long f1397p;

    /* JADX INFO: renamed from: q */
    private float f1398q;

    /* JADX INFO: renamed from: r */
    private Paint.FontMetrics f1399r;

    public CountDownView(Context context) {
        this(context, null);
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1385d = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f1386e = TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        this.f1387f = Color.parseColor("#66000000");
        this.f1388g = Color.parseColor("#CC000000");
        this.f1389h = -1;
        Paint paint = new Paint();
        this.f1382a = paint;
        paint.setAntiAlias(true);
        this.f1382a.setStrokeCap(Paint.Cap.ROUND);
        this.f1382a.setStyle(Paint.Style.STROKE);
        this.f1382a.setStrokeWidth(this.f1385d);
        Paint paint2 = new Paint(this.f1382a);
        this.f1383b = paint2;
        paint2.setColor(this.f1387f);
        this.f1383b.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f1384c = paint3;
        paint3.setAntiAlias(true);
        this.f1384c.setTextSize(this.f1386e);
        this.f1384c.setColor(this.f1389h);
        this.f1393l = new RectF();
        this.f1396o = new Rect();
    }

    /* JADX INFO: renamed from: a */
    private void m855a() {
        float f = this.f1385d * 0.5f;
        float f2 = 0.0f + f;
        this.f1393l.set(f2, f2, this.f1390i - f, this.f1391j - f);
        this.f1392k = ((int) this.f1393l.width()) >> 1;
    }

    /* JADX INFO: renamed from: a */
    private void m856a(Context context) {
        this.f1385d = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f1386e = TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        this.f1387f = Color.parseColor("#66000000");
        this.f1388g = Color.parseColor("#CC000000");
        this.f1389h = -1;
        Paint paint = new Paint();
        this.f1382a = paint;
        paint.setAntiAlias(true);
        this.f1382a.setStrokeCap(Paint.Cap.ROUND);
        this.f1382a.setStyle(Paint.Style.STROKE);
        this.f1382a.setStrokeWidth(this.f1385d);
        Paint paint2 = new Paint(this.f1382a);
        this.f1383b = paint2;
        paint2.setColor(this.f1387f);
        this.f1383b.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f1384c = paint3;
        paint3.setAntiAlias(true);
        this.f1384c.setTextSize(this.f1386e);
        this.f1384c.setColor(this.f1389h);
        this.f1393l = new RectF();
        this.f1396o = new Rect();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f1393l.centerX(), this.f1393l.centerY(), this.f1392k, this.f1383b);
        this.f1382a.setColor(this.f1388g);
        canvas.drawArc(this.f1393l, 0.0f, 360.0f, false, this.f1382a);
        this.f1382a.setColor(this.f1389h);
        canvas.drawArc(this.f1393l, -90.0f, this.f1394m, false, this.f1382a);
        if (TextUtils.isEmpty(this.f1395n)) {
            return;
        }
        Paint paint = this.f1384c;
        String str = this.f1395n;
        paint.getTextBounds(str, 0, str.length(), this.f1396o);
        this.f1398q = this.f1384c.measureText(this.f1395n);
        this.f1399r = this.f1384c.getFontMetrics();
        String str2 = this.f1395n;
        float fCenterX = this.f1393l.centerX() - (this.f1398q / 2.0f);
        float fCenterY = this.f1393l.centerY();
        Paint.FontMetrics fontMetrics = this.f1399r;
        float f = fontMetrics.bottom;
        canvas.drawText(str2, fCenterX, fCenterY + (((f - fontMetrics.top) / 2.0f) - f), this.f1384c);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f1390i = i;
        this.f1391j = i2;
        m855a();
    }

    public void refresh(long j) {
        long j2 = this.f1397p;
        if (j2 > 0) {
            this.f1394m = ((j * 1.0f) / j2) * 360.0f;
            StringBuilder sb = new StringBuilder();
            sb.append((int) Math.ceil((this.f1397p - j) / 1000.0d));
            this.f1395n = sb.toString();
            postInvalidate();
        }
    }

    public void setBgColor(int i) {
        this.f1387f = i;
        this.f1383b.setColor(i);
    }

    public void setDuration(long j) {
        this.f1397p = j;
        StringBuilder sb = new StringBuilder();
        sb.append(j / 1000);
        this.f1395n = sb.toString();
    }

    public void setThickInPx(int i) {
        float f = i;
        this.f1385d = f;
        this.f1382a.setStrokeWidth(f);
        m855a();
    }

    public void setUnderRingColor(int i) {
        this.f1388g = i;
    }
}
