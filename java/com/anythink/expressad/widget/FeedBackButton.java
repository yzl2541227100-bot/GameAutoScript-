package com.anythink.expressad.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;

/* JADX INFO: loaded from: classes.dex */
public class FeedBackButton extends TextView {
    public static String FEEDBACK_BTN_BACKGROUND_COLOR_STR = "#60000000";

    public FeedBackButton(Context context) {
        super(context);
        m12116a();
    }

    public FeedBackButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12116a();
    }

    public FeedBackButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12116a();
    }

    public FeedBackButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m12116a();
    }

    /* JADX INFO: renamed from: a */
    private void m12116a() {
        setText(C1875i.m9684a(getContext(), "anythink_cm_feedback_btn_text", C1875i.f11532g));
        Context context = getContext();
        setPadding(C1886t.m9834b(context, 5.0f), C1886t.m9834b(context, 5.0f), C1886t.m9834b(context, 5.0f), C1886t.m9834b(context, 5.0f));
        setTextIsSelectable(false);
        setGravity(17);
        setBackgroundColor(Color.parseColor(FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C1886t.m9834b(context, 20.0f));
        gradientDrawable.setColor(Color.parseColor(FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        setBackground(gradientDrawable);
        setTextColor(-1);
    }
}
