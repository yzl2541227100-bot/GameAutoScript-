package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class AnyThinkLevelLayoutView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private double f13410a;

    /* JADX INFO: renamed from: b */
    private int f13411b;

    /* JADX INFO: renamed from: c */
    private boolean f13412c;

    public AnyThinkLevelLayoutView(Context context) {
        super(context);
    }

    public AnyThinkLevelLayoutView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkLevelLayoutView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    private void m11288a() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (this.f13412c) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, dip2px(getContext(), 15.0f));
            layoutParams.setMargins(0, dip2px(getContext(), 2.0f), 0, 0);
            linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setLayoutParams(layoutParams);
        } else {
            linearLayout = null;
            linearLayout2 = null;
        }
        removeAllViews();
        if (linearLayout2 != null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, dip2px(getContext(), 15.0f));
            TextView textView = new TextView(getContext());
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setText("(");
            textView.setTextColor(Color.parseColor("#5f5f5f"));
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(Typeface.defaultFromStyle(1));
            textView2.setGravity(17);
            textView2.setTextColor(Color.parseColor("#5f5f5f"));
            Drawable drawable = getResources().getDrawable(C1875i.m9684a(getContext(), "anythink_reward_user", C1875i.f11528c));
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            textView2.setCompoundDrawables(drawable, null, null, null);
            textView2.setText(this.f13411b + " )");
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setLines(1);
            linearLayout2.addView(textView, layoutParams2);
            linearLayout2.addView(textView2, layoutParams2);
        }
        double d = this.f13410a;
        if (d == 0.0d) {
            d = 5.0d;
        }
        for (int i = 0; i < 5; i++) {
            ImageView imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(dip2px(getContext(), 15.0f), dip2px(getContext(), 15.0f));
            imageView.setImageResource(C1875i.m9684a(getContext(), ((double) i) < d ? "anythink_download_message_dialog_star_sel" : "anythink_download_message_dilaog_star_nor", C1875i.f11528c));
            layoutParams3.weight = 1.0f;
            layoutParams3.setMargins(dip2px(getContext(), 2.0f), 0, 0, 0);
            if (linearLayout != null) {
                linearLayout.addView(imageView, layoutParams3);
            } else {
                addView(imageView, layoutParams3);
            }
        }
        if (linearLayout == null || linearLayout == null) {
            return;
        }
        addView(linearLayout);
        addView(linearLayout2);
    }

    public static int dip2px(Context context, float f) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }

    public void setRating(int i) {
        this.f13410a = i;
        m11288a();
    }

    public void setRatingAndUser(double d, int i) {
        this.f13410a = d;
        if (i == 0) {
            i = (int) (((Math.random() * 9.0d) + 1.0d) * 10000.0d);
        }
        this.f13411b = i;
        this.f13412c = true;
        m11288a();
    }
}
