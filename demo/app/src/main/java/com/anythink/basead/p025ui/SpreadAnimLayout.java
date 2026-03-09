package com.anythink.basead.p025ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class SpreadAnimLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private Paint f1714a;

    /* JADX INFO: renamed from: b */
    private ValueAnimator f1715b;

    /* JADX INFO: renamed from: c */
    private C0942a f1716c;

    /* JADX INFO: renamed from: d */
    private RectF f1717d;

    /* JADX INFO: renamed from: e */
    private RectF f1718e;

    /* JADX INFO: renamed from: f */
    private int f1719f;

    /* JADX INFO: renamed from: g */
    private int f1720g;

    /* JADX INFO: renamed from: h */
    private int f1721h;

    /* JADX INFO: renamed from: i */
    private Paint f1722i;

    /* JADX INFO: renamed from: j */
    private boolean f1723j;

    /* JADX INFO: renamed from: k */
    private boolean f1724k;

    /* JADX INFO: renamed from: com.anythink.basead.ui.SpreadAnimLayout$a */
    public static class C0942a {

        /* JADX INFO: renamed from: a */
        public RectF f1727a;

        /* JADX INFO: renamed from: b */
        public int f1728b;
    }

    public SpreadAnimLayout(Context context) {
        this(context, null, 0);
    }

    public SpreadAnimLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpreadAnimLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1723j = true;
        setWillNotDraw(false);
        int color = getResources().getColor(C1345i.m4154a(context, "color_spread", C1875i.f11529d));
        this.f1720g = getResources().getDimensionPixelSize(C1345i.m4154a(getContext(), "myoffer_spread_max_distance_normal", "dimen"));
        this.f1719f = C1345i.m4153a(context, 4.0f);
        this.f1721h = 1000;
        Paint paint = new Paint();
        this.f1714a = paint;
        paint.setAntiAlias(true);
        this.f1714a.setAlpha(255);
        this.f1714a.setColor(color);
        Paint paint2 = new Paint(1);
        this.f1722i = paint2;
        paint2.setColor(-1);
        this.f1722i.setStyle(Paint.Style.FILL);
        this.f1722i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f1723j || !this.f1724k) {
            super.draw(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        this.f1714a.setAlpha(this.f1716c.f1728b);
        RectF rectF = this.f1716c.f1727a;
        int i = this.f1719f;
        canvas.drawRoundRect(rectF, i, i, this.f1714a);
        RectF rectF2 = this.f1717d;
        int i2 = this.f1719f;
        canvas.drawRoundRect(rectF2, i2, i2, this.f1722i);
        canvas.restoreToCount(iSaveLayer);
        super.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f1720g;
        setPadding(i3, i3, i3, i3);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f1723j) {
            if (i == 0) {
                post(new Runnable() { // from class: com.anythink.basead.ui.SpreadAnimLayout.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpreadAnimLayout.this.startSpreadAnimation();
                    }
                });
                return;
            }
            ValueAnimator valueAnimator = this.f1715b;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
        }
    }

    public void setMaxSpreadDistance(int i) {
        this.f1720g = i;
    }

    public void setRoundRadius(int i) {
        this.f1719f = i;
    }

    public void startSpreadAnimation() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.f1723j = true;
        if (!this.f1724k) {
            this.f1717d = new RectF(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            this.f1718e = new RectF(this.f1717d);
            C0942a c0942a = new C0942a();
            this.f1716c = c0942a;
            c0942a.f1728b = 255;
            c0942a.f1727a = this.f1718e;
            this.f1720g = Math.min(this.f1720g, Math.min((getWidth() - childAt.getWidth()) / 2, (getHeight() - childAt.getHeight()) / 2));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f1715b = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(this.f1721h);
            this.f1715b.setRepeatMode(1);
            this.f1715b.setRepeatCount(-1);
            this.f1715b.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f1715b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.SpreadAnimLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    SpreadAnimLayout.this.f1716c.f1728b = (int) ((1.0f - fFloatValue) * 255.0f);
                    SpreadAnimLayout.this.f1716c.f1727a.set(SpreadAnimLayout.this.f1717d);
                    float f = -((int) (SpreadAnimLayout.this.f1720g * fFloatValue));
                    SpreadAnimLayout.this.f1716c.f1727a.inset(f, f);
                    SpreadAnimLayout.this.postInvalidate();
                }
            });
            this.f1724k = true;
        }
        this.f1715b.start();
    }
}
