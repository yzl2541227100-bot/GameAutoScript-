package com.octopus.p222ad.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.octopus.p222ad.internal.utilities.ViewUtil;

/* JADX INFO: loaded from: classes2.dex */
public class RegionClickView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private boolean f17969a;

    /* JADX INFO: renamed from: b */
    private GradientDrawable f17970b;

    /* JADX INFO: renamed from: c */
    private TextView f17971c;

    public RegionClickView(Context context) {
        super(context);
        this.f17969a = false;
        init(context);
    }

    public RegionClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17969a = false;
        init(context);
    }

    public RegionClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17969a = false;
        init(context);
    }

    /* JADX INFO: renamed from: a */
    private void m15102a(Context context, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f17970b = gradientDrawable;
        gradientDrawable.setColor(Color.parseColor("#80000000"));
        if (i == 1) {
            this.f17970b.setStroke(1, Color.parseColor("#E8E8E8"));
        }
        this.f17970b.setCornerRadius(ViewUtil.dip2px(context, 30.0f));
        setBackgroundDrawable(this.f17970b);
    }

    public void init(Context context) {
        if (this.f17969a) {
            return;
        }
        this.f17969a = true;
        m15102a(context, 1);
        TextView textView = new TextView(context);
        this.f17971c = textView;
        textView.setLines(1);
        this.f17971c.setTextSize(2, 14.0f);
        this.f17971c.setTextColor(Color.parseColor("#949494"));
        this.f17971c.setText("点击跳转详情页或第三方应用     >");
        this.f17971c.setGravity(17);
        setGravity(17);
        setOrientation(1);
        addView(this.f17971c);
    }

    public void setBackGroundAlpha(double d) {
        GradientDrawable gradientDrawable = this.f17970b;
        if (gradientDrawable == null || d <= 0.0d) {
            return;
        }
        gradientDrawable.setAlpha((int) (d * 255.0d));
    }

    public void setBackgroundColor(String str) {
        GradientDrawable gradientDrawable = this.f17970b;
        if (gradientDrawable == null || str == null) {
            return;
        }
        try {
            gradientDrawable.setColor(Color.parseColor(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setRegionalClickViewBean() {
        setTitle("点击跳转详情页或第三方应用     >");
        setTitleColor("#FFFFFF");
        setTitleSize(14.0f);
        setBackGroundAlpha(0.7d);
        setBackgroundColor("#80000000");
    }

    public void setTitle(String str) {
        TextView textView = this.f17971c;
        if (textView == null || str == null) {
            return;
        }
        try {
            textView.setText(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setTitleColor(String str) {
        TextView textView = this.f17971c;
        if (textView == null || str == null) {
            return;
        }
        try {
            textView.setTextColor(Color.parseColor(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setTitleSize(float f) {
        TextView textView = this.f17971c;
        if (textView == null || f <= 0.0f) {
            return;
        }
        textView.setTextSize(2, f);
    }
}
