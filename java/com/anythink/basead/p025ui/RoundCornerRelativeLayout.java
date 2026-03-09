package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.RequiresApi;
import com.anythink.core.common.p066o.C1345i;

/* JADX INFO: loaded from: classes.dex */
public class RoundCornerRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private Path f1647a;

    /* JADX INFO: renamed from: b */
    private Paint f1648b;

    /* JADX INFO: renamed from: c */
    private RectF f1649c;

    /* JADX INFO: renamed from: d */
    private float f1650d;

    public RoundCornerRelativeLayout(Context context) {
        super(context);
        this.f1650d = 0.0f;
        m1015a();
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1650d = 0.0f;
        m1015a();
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1650d = 0.0f;
        m1015a();
    }

    @RequiresApi(api = 21)
    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1650d = 0.0f;
        m1015a();
    }

    /* JADX INFO: renamed from: a */
    private void m1015a() {
        this.f1650d = C1345i.m4153a(getContext(), 12.0f);
        this.f1647a = new Path();
        this.f1648b = new Paint(1);
        this.f1649c = new RectF();
        this.f1648b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    /* JADX INFO: renamed from: b */
    private Path m1016b() {
        this.f1647a.reset();
        Path path = this.f1647a;
        RectF rectF = this.f1649c;
        float f = this.f1650d;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        return this.f1647a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        this.f1647a.reset();
        Path path = this.f1647a;
        RectF rectF = this.f1649c;
        float f = this.f1650d;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(this.f1647a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f1649c.set(0.0f, 0.0f, i, i2);
    }
}
