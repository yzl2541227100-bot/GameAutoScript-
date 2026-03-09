package com.anythink.basead.p025ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class AdTextView extends TextView {
    public AdTextView(Context context) {
        super(context);
        m666a(context);
    }

    public AdTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m666a(context);
    }

    public AdTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m666a(context);
    }

    /* JADX INFO: renamed from: a */
    private void m666a(Context context) {
        setBackgroundResource(C1345i.m4154a(context, "myoffer_bg_banner_ad_choice", C1875i.f11528c));
        setTextColor(-1);
        setText(context.getResources().getString(C1345i.m4154a(context, "basead_ad_text", C1875i.f11532g)));
        setTextSize(8.0f);
        setGravity(17);
        setPadding(C1345i.m4153a(context, 3.0f), 0, C1345i.m4153a(context, 3.0f), 0);
    }
}
