package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class WaveAnimImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    public int f1777a;

    /* JADX INFO: renamed from: b */
    public int f1778b;

    /* JADX INFO: renamed from: c */
    private Paint f1779c;

    /* JADX INFO: renamed from: d */
    private C0957a f1780d;

    /* JADX INFO: renamed from: com.anythink.basead.ui.WaveAnimImageView$a */
    public static class C0957a {

        /* JADX INFO: renamed from: a */
        public float f1781a;

        /* JADX INFO: renamed from: b */
        public float f1782b;

        /* JADX INFO: renamed from: c */
        public float f1783c;

        public C0957a(float f, float f2, float f3) {
            this.f1781a = f;
            this.f1782b = f2;
            this.f1783c = f3;
        }
    }

    public WaveAnimImageView(Context context) {
        super(context);
        m1071a();
    }

    public WaveAnimImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1071a();
    }

    public WaveAnimImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1071a();
    }

    /* JADX INFO: renamed from: a */
    private void m1071a() {
        Paint paint = new Paint();
        this.f1779c = paint;
        paint.setAntiAlias(true);
        this.f1779c.setStyle(Paint.Style.STROKE);
        this.f1779c.setColor(Color.parseColor("#FFFFFF"));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0957a c0957a = this.f1780d;
        if (c0957a != null) {
            this.f1779c.setAlpha((int) (c0957a.f1783c * 255.0f));
            this.f1779c.setStrokeWidth(this.f1780d.f1782b);
            canvas.drawCircle(this.f1777a, this.f1778b, this.f1780d.f1781a, this.f1779c);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1777a = getWidth() / 2;
        this.f1778b = getHeight() / 2;
    }

    public void setWaveAnimParams(C0957a c0957a) {
        this.f1780d = c0957a;
        postInvalidate();
    }
}
