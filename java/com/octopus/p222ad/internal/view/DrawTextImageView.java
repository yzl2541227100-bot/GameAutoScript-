package com.octopus.p222ad.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes2.dex */
public class DrawTextImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: a */
    private String f17736a;

    /* JADX INFO: renamed from: b */
    private float f17737b;

    /* JADX INFO: renamed from: c */
    private float f17738c;

    /* JADX INFO: renamed from: d */
    private float f17739d;

    /* JADX INFO: renamed from: e */
    private int f17740e;

    /* JADX INFO: renamed from: f */
    private int f17741f;

    public DrawTextImageView(Context context) {
        super(context);
        this.f17736a = "";
        this.f17737b = 30.0f;
        this.f17738c = -1000.0f;
        this.f17739d = -1000.0f;
        this.f17740e = 0;
        this.f17741f = 3;
    }

    public DrawTextImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17736a = "";
        this.f17737b = 30.0f;
        this.f17738c = -1000.0f;
        this.f17739d = -1000.0f;
        this.f17740e = 0;
        this.f17741f = 3;
    }

    public DrawTextImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17736a = "";
        this.f17737b = 30.0f;
        this.f17738c = -1000.0f;
        this.f17739d = -1000.0f;
        this.f17740e = 0;
        this.f17741f = 3;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f17736a.equals("")) {
            return;
        }
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(this.f17740e));
        paint.setStrokeWidth(this.f17741f);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(this.f17737b);
        String str = this.f17736a;
        float width = this.f17738c;
        if (width == -1000.0f) {
            width = canvas.getWidth() - (this.f17737b * this.f17736a.length());
        }
        float height = this.f17739d;
        if (height == -1000.0f) {
            height = canvas.getHeight() - 50;
        }
        canvas.drawText(str, width, height, paint);
    }

    public void setDrawLocalXY(float f, float f2) {
        this.f17738c = f;
        this.f17739d = f2;
        drawableStateChanged();
    }

    public void setDrawText(String str) {
        this.f17736a = str;
        drawableStateChanged();
    }

    public void setDrawTextColorResourse(int i) {
        this.f17740e = i;
        drawableStateChanged();
    }

    public void setDrawTextSize(float f) {
        this.f17737b = f;
        drawableStateChanged();
    }

    public void setDrawTextStrokeWidth(int i) {
        this.f17741f = i;
        drawableStateChanged();
    }
}
