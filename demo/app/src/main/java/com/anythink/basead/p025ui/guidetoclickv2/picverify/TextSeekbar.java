package com.anythink.basead.p025ui.guidetoclickv2.picverify;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class TextSeekbar extends SeekBar {

    /* JADX INFO: renamed from: a */
    public String f2199a;

    /* JADX INFO: renamed from: b */
    public RectF f2200b;

    /* JADX INFO: renamed from: c */
    public float f2201c;

    /* JADX INFO: renamed from: d */
    public Paint.FontMetrics f2202d;

    /* JADX INFO: renamed from: e */
    private Paint f2203e;

    /* JADX INFO: renamed from: f */
    private Paint f2204f;

    public TextSeekbar(Context context) {
        super(context);
    }

    public TextSeekbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextSeekbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f2203e = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        this.f2203e.setTextSize(C1345i.m4153a(context, 12.0f));
        this.f2203e.setAntiAlias(true);
        this.f2203e.setColor(Color.parseColor("#FFFFFF"));
        this.f2199a = getContext().getString(C1345i.m4154a(C1175n.m2059a().m2148f(), "myoffer_g2c_seek_to_click", C1875i.f11532g));
        Paint paint2 = new Paint();
        this.f2204f = paint2;
        paint2.setColor(Color.parseColor("#80000000"));
        this.f2201c = C1345i.m4153a(getContext(), 12.0f);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f2200b == null) {
            this.f2200b = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
        RectF rectF = this.f2200b;
        float f = this.f2201c;
        canvas.drawRoundRect(rectF, f, f, this.f2204f);
        if (this.f2202d == null) {
            this.f2202d = this.f2203e.getFontMetrics();
        }
        Paint.FontMetrics fontMetrics = this.f2202d;
        canvas.drawText(this.f2199a, getWidth() / 2, (int) (((getHeight() / 2) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f)), this.f2203e);
        super.onDraw(canvas);
    }
}
