package com.anythink.basead.p025ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class StarLevelView extends ImageView {

    /* JADX INFO: renamed from: a */
    public Context f1729a;

    public StarLevelView(Context context) {
        this(context, null);
        this.f1729a = context;
    }

    public StarLevelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f1729a = context;
    }

    public StarLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1729a = context;
    }

    public void setState(boolean z) {
        Context context;
        String str;
        if (z) {
            context = getContext();
            str = "myoffer_splash_star";
        } else {
            context = getContext();
            str = "myoffer_splash_star_gray";
        }
        setImageResource(C1345i.m4154a(context, str, C1875i.f11528c));
    }
}
