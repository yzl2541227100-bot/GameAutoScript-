package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1360x;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseEndCardView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public String f1218a;

    /* JADX INFO: renamed from: b */
    public AbstractC1247l f1219b;

    /* JADX INFO: renamed from: c */
    public C1248m f1220c;

    /* JADX INFO: renamed from: d */
    public AbstractC1249n f1221d;

    /* JADX INFO: renamed from: e */
    private boolean f1222e;

    public BaseEndCardView(Context context, AbstractC1247l abstractC1247l, C1248m c1248m) {
        super(context);
        this.f1218a = getClass().getSimpleName();
        super.setWillNotDraw(false);
        this.f1219b = abstractC1247l;
        this.f1220c = c1248m;
        this.f1221d = c1248m.f4333n;
    }

    /* JADX INFO: renamed from: a */
    private static RectF m722a(int i, int i2) {
        int i3 = i / 2;
        float f = i2;
        int i4 = (int) (1.0f * f);
        RectF rectF = new RectF();
        rectF.left = i3 - i4;
        rectF.top = i2 - (i4 * 2);
        rectF.right = i3 + i4;
        rectF.bottom = f;
        return rectF;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo723a();

    /* JADX INFO: renamed from: b */
    public Drawable mo724b() {
        return null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        try {
            if (this.f1222e) {
                int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                super.draw(canvas);
                int width = getWidth();
                int height = getHeight();
                int width2 = getWidth();
                int i = width2 / 2;
                float height2 = getHeight();
                int i2 = (int) (1.0f * height2);
                RectF rectF = new RectF();
                rectF.left = i - i2;
                rectF.top = r4 - (i2 * 2);
                rectF.right = i + i2;
                rectF.bottom = height2;
                C1360x.m4264a(canvas, width, height, rectF);
                canvas.restoreToCount(iSaveLayer);
                return;
            }
        } catch (Exception unused) {
        }
        super.draw(canvas);
    }

    public void setNeedArc(boolean z) {
        this.f1222e = z;
        postInvalidate();
    }
}
