package com.anythink.basead.p025ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1345i;

/* JADX INFO: loaded from: classes.dex */
public class ShakeTextHintWhiteView extends BaseShakeView {
    public ShakeTextHintWhiteView(Context context) {
        super(context);
    }

    public ShakeTextHintWhiteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeTextHintWhiteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @RequiresApi(api = 21)
    public ShakeTextHintWhiteView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // com.anythink.basead.p025ui.BaseShakeView
    /* JADX INFO: renamed from: a */
    public final ValueAnimator mo825a(int i) {
        return null;
    }

    @Override // com.anythink.basead.p025ui.BaseShakeView
    /* JADX INFO: renamed from: a */
    public final void mo826a() {
        setOrientation(0);
        setGravity(17);
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_shake_text_hint_white", "layout"), (ViewGroup) this, true);
        int iM4153a = C1345i.m4153a(getContext(), 4.0f);
        setPadding(iM4153a, iM4153a, iM4153a, iM4153a);
        this.f1302a = (ImageView) findViewById(C1345i.m4154a(C1175n.m2059a().m2148f(), "myoffer_shake_text_hint_img", "id"));
    }
}
