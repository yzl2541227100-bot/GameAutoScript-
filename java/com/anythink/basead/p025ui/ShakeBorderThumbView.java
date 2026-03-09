package com.anythink.basead.p025ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class ShakeBorderThumbView extends BaseShakeView {

    /* JADX INFO: renamed from: k */
    public TextView f1687k;

    public ShakeBorderThumbView(Context context) {
        super(context);
    }

    public ShakeBorderThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeBorderThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @RequiresApi(api = 21)
    public ShakeBorderThumbView(Context context, AttributeSet attributeSet, int i, int i2) {
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
        setBackgroundResource(C1345i.m4154a(C1175n.m2059a().m2148f(), "myoffer_bg_shake_border_thumb", C1875i.f11528c));
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_shake_border_thumb", "layout"), (ViewGroup) this, true);
        int iM4153a = C1345i.m4153a(getContext(), 10.0f);
        int iM4153a2 = C1345i.m4153a(getContext(), 12.0f);
        int iM4153a3 = C1345i.m4153a(getContext(), 6.0f);
        setPadding(iM4153a, iM4153a3, iM4153a2, iM4153a3);
        this.f1302a = (ImageView) findViewById(C1345i.m4154a(C1175n.m2059a().m2148f(), "myoffer_splash_shake_border_img", "id"));
        this.f1687k = (TextView) findViewById(C1345i.m4154a(C1175n.m2059a().m2148f(), "myoffer_splash_shake_hint_text", "id"));
    }

    @Override // com.anythink.basead.p025ui.BaseShakeView
    public void setShakeSetting(AbstractC1249n abstractC1249n) {
        TextView textView;
        super.setShakeSetting(abstractC1249n);
        String str = this.f1309h;
        if (str == null || (textView = this.f1687k) == null) {
            return;
        }
        textView.setText(str);
    }
}
