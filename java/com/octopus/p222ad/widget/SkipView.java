package com.octopus.p222ad.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.octopus.p222ad.internal.utilities.ViewUtil;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public class SkipView extends TextView {

    /* JADX INFO: renamed from: a */
    private int f18000a;

    /* JADX INFO: renamed from: b */
    private TextPaint f18001b;

    /* JADX INFO: renamed from: c */
    private float f18002c;

    /* JADX INFO: renamed from: d */
    private float f18003d;

    /* JADX INFO: renamed from: e */
    private boolean f18004e;

    /* JADX INFO: renamed from: f */
    private RectF f18005f;

    /* JADX INFO: renamed from: g */
    private RectF f18006g;

    /* JADX INFO: renamed from: h */
    private int f18007h;

    /* JADX INFO: renamed from: i */
    private boolean f18008i;

    /* JADX INFO: renamed from: j */
    private SparseIntArray f18009j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC3273a f18010k;

    /* JADX INFO: renamed from: com.octopus.ad.widget.SkipView$a */
    public interface InterfaceC3273a {
        /* JADX INFO: renamed from: a */
        int mo15117a(int i, RectF rectF);
    }

    public SkipView(Context context) {
        super(context);
        this.f18003d = 20.0f;
        this.f18005f = new RectF();
        this.f18008i = true;
        this.f18010k = new InterfaceC3273a() { // from class: com.octopus.ad.widget.SkipView.1
            @Override // com.octopus.p222ad.widget.SkipView.InterfaceC3273a
            @TargetApi(16)
            /* JADX INFO: renamed from: a */
            public int mo15117a(int i, RectF rectF) {
                SkipView.this.f18001b.setTextSize(i);
                String string = SkipView.this.getText().toString();
                SkipView.this.f18005f.bottom = SkipView.this.f18001b.getFontSpacing();
                SkipView.this.f18005f.right = SkipView.this.f18001b.measureText(string);
                SkipView.this.f18005f.offsetTo(0.0f, 0.0f);
                return rectF.contains(SkipView.this.f18005f) ? -1 : 1;
            }
        };
        init(context);
    }

    public SkipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18003d = 20.0f;
        this.f18005f = new RectF();
        this.f18008i = true;
        this.f18010k = new InterfaceC3273a() { // from class: com.octopus.ad.widget.SkipView.1
            @Override // com.octopus.p222ad.widget.SkipView.InterfaceC3273a
            @TargetApi(16)
            /* JADX INFO: renamed from: a */
            public int mo15117a(int i, RectF rectF) {
                SkipView.this.f18001b.setTextSize(i);
                String string = SkipView.this.getText().toString();
                SkipView.this.f18005f.bottom = SkipView.this.f18001b.getFontSpacing();
                SkipView.this.f18005f.right = SkipView.this.f18001b.measureText(string);
                SkipView.this.f18005f.offsetTo(0.0f, 0.0f);
                return rectF.contains(SkipView.this.f18005f) ? -1 : 1;
            }
        };
        init(context);
    }

    public SkipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18003d = 20.0f;
        this.f18005f = new RectF();
        this.f18008i = true;
        this.f18010k = new InterfaceC3273a() { // from class: com.octopus.ad.widget.SkipView.1
            @Override // com.octopus.p222ad.widget.SkipView.InterfaceC3273a
            @TargetApi(16)
            /* JADX INFO: renamed from: a */
            public int mo15117a(int i2, RectF rectF) {
                SkipView.this.f18001b.setTextSize(i2);
                String string = SkipView.this.getText().toString();
                SkipView.this.f18005f.bottom = SkipView.this.f18001b.getFontSpacing();
                SkipView.this.f18005f.right = SkipView.this.f18001b.measureText(string);
                SkipView.this.f18005f.offsetTo(0.0f, 0.0f);
                return rectF.contains(SkipView.this.f18005f) ? -1 : 1;
            }
        };
        init(context);
    }

    /* JADX INFO: renamed from: a */
    private int m15110a(int i, int i2, InterfaceC3273a interfaceC3273a, RectF rectF) {
        if (!this.f18008i) {
            return m15115b(i, i2, interfaceC3273a, rectF);
        }
        String string = getText().toString();
        int length = string == null ? 0 : string.length();
        int i3 = this.f18009j.get(length);
        if (i3 != 0) {
            return i3;
        }
        int iM15115b = m15115b(i, i2, interfaceC3273a, rectF);
        this.f18009j.put(length, iM15115b);
        return iM15115b;
    }

    /* JADX INFO: renamed from: a */
    private void m15112a() {
        m15114a(getText().toString());
    }

    /* JADX INFO: renamed from: a */
    private void m15113a(Context context, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#80000000"));
        if (i == 1) {
            gradientDrawable.setStroke(1, Color.parseColor("#C0C0C0"));
        }
        gradientDrawable.setCornerRadius(ViewUtil.dip2px(context, 45.0f));
        setBackgroundDrawable(gradientDrawable);
    }

    /* JADX INFO: renamed from: a */
    private void m15114a(String str) {
        if (this.f18004e) {
            int i = (int) this.f18003d;
            int measuredHeight = ((getMeasuredHeight() - getCompoundPaddingBottom()) - getCompoundPaddingTop()) - this.f18000a;
            int measuredWidth = ((getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - ViewUtil.dip2px(getContext(), 8.0f);
            this.f18007h = measuredWidth;
            RectF rectF = this.f18006g;
            rectF.right = measuredWidth;
            rectF.bottom = measuredHeight;
            super.setTextSize(0, m15110a(i, (int) this.f18002c, this.f18010k, rectF));
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m15115b(int i, int i2, InterfaceC3273a interfaceC3273a, RectF rectF) {
        int i3 = i2 - 1;
        int i4 = i;
        while (i <= i3) {
            i4 = (i + i3) >>> 1;
            int iMo15117a = interfaceC3273a.mo15117a(i4, rectF);
            if (iMo15117a >= 0) {
                if (iMo15117a <= 0) {
                    break;
                }
                i4--;
                i3 = i4;
            } else {
                int i5 = i4 + 1;
                i4 = i;
                i = i5;
            }
        }
        return i4;
    }

    public void init(Context context) {
        setGravity(17);
        setLines(1);
        setMaxLines(1);
        setTextColor(-1);
        m15113a(context, 0);
        TextPaint textPaint = new TextPaint();
        this.f18001b = textPaint;
        textPaint.set(getPaint());
        this.f18002c = getTextSize();
        this.f18006g = new RectF();
        this.f18009j = new SparseIntArray();
        this.f18004e = true;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 53));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        SparseIntArray sparseIntArray = this.f18009j;
        if (sparseIntArray != null) {
            sparseIntArray.clear();
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        m15112a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m15112a();
    }

    public void setData(int i, int i2) {
        m15113a(getContext(), i);
        this.f18000a = i2;
    }
}
