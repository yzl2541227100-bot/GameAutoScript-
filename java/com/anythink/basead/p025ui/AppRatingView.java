package com.anythink.basead.p025ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AppRatingView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private Context f1107a;

    /* JADX INFO: renamed from: b */
    private List<StarLevelView> f1108b;

    /* JADX INFO: renamed from: c */
    private int f1109c;

    /* JADX INFO: renamed from: d */
    private int f1110d;

    public AppRatingView(Context context) {
        this(context, null, 0);
    }

    public AppRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppRatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1107a = context;
        setStarSizeInDp(17);
        setStarMargin(8);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setRating(int i) {
        for (int i2 = 0; i2 < this.f1108b.size(); i2++) {
            StarLevelView starLevelView = this.f1108b.get(i2);
            if (i2 < i) {
                starLevelView.setState(true);
            } else {
                starLevelView.setState(false);
            }
        }
    }

    public void setStarMargin(int i) {
        this.f1110d = i;
    }

    public void setStarNum(int i) {
        if (this.f1108b == null) {
            this.f1108b = new ArrayList();
        }
        this.f1108b.clear();
        removeAllViews();
        setOrientation(0);
        for (int i2 = 0; i2 < i; i2++) {
            StarLevelView starLevelView = new StarLevelView(getContext());
            int i3 = this.f1109c;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
            if (i2 != i - 1) {
                layoutParams.setMargins(0, 0, dip2px(getContext(), this.f1110d), 0);
            }
            starLevelView.setLayoutParams(layoutParams);
            addView(starLevelView);
            this.f1108b.add(starLevelView);
        }
    }

    public void setStarSizeInDp(int i) {
        this.f1109c = dip2px(this.f1107a, i);
    }
}
