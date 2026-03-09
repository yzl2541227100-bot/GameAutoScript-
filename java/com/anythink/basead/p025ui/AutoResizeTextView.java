package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class AutoResizeTextView extends TextView {

    /* JADX INFO: renamed from: a */
    private static final int f1122a = 1000;

    /* JADX INFO: renamed from: b */
    private static final int f1123b = 5;

    /* JADX INFO: renamed from: c */
    private TextPaint f1124c;

    /* JADX INFO: renamed from: d */
    private float f1125d;

    /* JADX INFO: renamed from: e */
    private float f1126e;

    /* JADX INFO: renamed from: f */
    private boolean f1127f;

    /* JADX INFO: renamed from: g */
    private boolean f1128g;

    public AutoResizeTextView(Context context) {
        super(context);
        this.f1125d = 1.0f;
        this.f1126e = 0.0f;
        this.f1127f = false;
        this.f1128g = false;
        m676a();
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1125d = 1.0f;
        this.f1126e = 0.0f;
        this.f1127f = false;
        this.f1128g = false;
        m676a();
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1125d = 1.0f;
        this.f1126e = 0.0f;
        this.f1127f = false;
        this.f1128g = false;
        m676a();
    }

    /* JADX INFO: renamed from: a */
    private int m675a(CharSequence charSequence, int i) {
        return new StaticLayout(charSequence, this.f1124c, i, Layout.Alignment.ALIGN_NORMAL, this.f1125d, this.f1126e, true).getHeight();
    }

    /* JADX INFO: renamed from: a */
    private void m676a() {
        this.f1124c = new TextPaint();
    }

    /* JADX INFO: renamed from: b */
    private void m677b() {
        CharSequence text = getText();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width == 0 || height == 0 || TextUtils.isEmpty(text)) {
            return;
        }
        this.f1128g = true;
        int textSize = (int) getTextSize();
        while (textSize >= 5) {
            this.f1124c.setTextSize(textSize);
            int iMeasureText = (int) this.f1124c.measureText(text, 0, text.length());
            int height2 = new StaticLayout(text, this.f1124c, width, Layout.Alignment.ALIGN_NORMAL, this.f1125d, this.f1126e, true).getHeight();
            if (iMeasureText < width && height2 < height) {
                break;
            } else {
                textSize--;
            }
        }
        setTextSize(0, textSize);
        this.f1128g = false;
        this.f1127f = false;
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f1128g) {
            return;
        }
        if (!this.f1127f) {
            super.onDraw(canvas);
            return;
        }
        CharSequence text = getText();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width == 0 || height == 0 || TextUtils.isEmpty(text)) {
            return;
        }
        this.f1128g = true;
        int textSize = (int) getTextSize();
        while (textSize >= 5) {
            this.f1124c.setTextSize(textSize);
            int iMeasureText = (int) this.f1124c.measureText(text, 0, text.length());
            int height2 = new StaticLayout(text, this.f1124c, width, Layout.Alignment.ALIGN_NORMAL, this.f1125d, this.f1126e, true).getHeight();
            if (iMeasureText < width && height2 < height) {
                break;
            } else {
                textSize--;
            }
        }
        setTextSize(0, textSize);
        this.f1128g = false;
        this.f1127f = false;
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f1127f = true;
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.f1127f = true;
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.f1125d = f2;
        this.f1126e = f;
    }
}
