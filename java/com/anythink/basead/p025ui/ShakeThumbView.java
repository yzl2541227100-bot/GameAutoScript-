package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class ShakeThumbView extends BaseShakeView {

    /* JADX INFO: renamed from: k */
    private ImageView f1688k;

    /* JADX INFO: renamed from: l */
    private TextView f1689l;

    public ShakeThumbView(Context context) {
        super(context);
    }

    public ShakeThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @RequiresApi(api = 21)
    public ShakeThumbView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* JADX INFO: renamed from: a */
    private void m1028a(View view) {
        int iM4153a = C1345i.m4153a(getContext(), 88.0f);
        int color = Color.parseColor("#99000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(iM4153a);
        view.setBackgroundDrawable(gradientDrawable);
    }

    @Override // com.anythink.basead.p025ui.BaseShakeView
    /* JADX INFO: renamed from: a */
    public final void mo826a() {
        setOrientation(1);
        setGravity(1);
        this.f1688k = new ImageView(getContext());
        this.f1688k.setLayoutParams(new LinearLayout.LayoutParams(C1345i.m4153a(getContext(), 90.0f), C1345i.m4153a(getContext(), 90.0f)));
        ImageView imageView = this.f1688k;
        int iM4153a = C1345i.m4153a(getContext(), 88.0f);
        int color = Color.parseColor("#99000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(iM4153a);
        imageView.setBackgroundDrawable(gradientDrawable);
        this.f1302a = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C1345i.m4153a(getContext(), 40.0f), C1345i.m4153a(getContext(), 40.0f));
        layoutParams.gravity = 49;
        layoutParams.topMargin = C1345i.m4153a(getContext(), 12.0f);
        this.f1302a.setLayoutParams(layoutParams);
        this.f1689l = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        this.f1689l.setMaxWidth(C1345i.m4153a(getContext(), 62.0f));
        this.f1689l.setMaxLines(1);
        this.f1689l.setEllipsize(TextUtils.TruncateAt.END);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = C1345i.m4153a(getContext(), 14.0f);
        this.f1689l.setLayoutParams(layoutParams2);
        this.f1689l.setText(C1345i.m4154a(C1175n.m2059a().m2148f(), "myoffer_shake_simple_title", C1875i.f11532g));
        this.f1689l.setTextSize(1, 10.0f);
        this.f1689l.setTextColor(-1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        frameLayout.addView(this.f1688k);
        frameLayout.addView(this.f1302a);
        frameLayout.addView(this.f1689l);
        addView(frameLayout);
    }

    @Override // com.anythink.basead.p025ui.BaseShakeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.anythink.basead.p025ui.BaseShakeView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        try {
            this.f1302a.setOnClickListener(onClickListener);
            this.f1688k.setOnClickListener(onClickListener);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.basead.p025ui.BaseShakeView
    public void setShakeSetting(AbstractC1249n abstractC1249n) {
        TextView textView;
        super.setShakeSetting(abstractC1249n);
        String str = this.f1308g;
        if (str == null || (textView = this.f1689l) == null) {
            return;
        }
        textView.setText(str);
    }
}
