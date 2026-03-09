package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
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
public class ShakeView extends BaseShakeView {

    /* JADX INFO: renamed from: k */
    public TextView f1690k;

    /* JADX INFO: renamed from: l */
    public String f1691l;

    /* JADX INFO: renamed from: m */
    private ImageView f1692m;

    /* JADX INFO: renamed from: n */
    private View f1693n;

    /* JADX INFO: renamed from: o */
    private Boolean f1694o;

    public ShakeView(Context context) {
        super(context);
        this.f1694o = Boolean.FALSE;
    }

    public ShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1694o = Boolean.FALSE;
    }

    public ShakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1694o = Boolean.FALSE;
    }

    @RequiresApi(api = 21)
    public ShakeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1694o = Boolean.FALSE;
    }

    /* JADX INFO: renamed from: a */
    private void m1029a(View view) {
        int iM4153a = C1345i.m4153a(getContext(), 115.0f);
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
        this.f1692m = new ImageView(getContext());
        this.f1692m.setLayoutParams(new LinearLayout.LayoutParams(C1345i.m4153a(getContext(), 115.0f), C1345i.m4153a(getContext(), 115.0f)));
        ImageView imageView = this.f1692m;
        int iM4153a = C1345i.m4153a(getContext(), 115.0f);
        int color = Color.parseColor("#99000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(iM4153a);
        imageView.setBackgroundDrawable(gradientDrawable);
        this.f1302a = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C1345i.m4153a(getContext(), 76.0f), C1345i.m4153a(getContext(), 76.0f));
        layoutParams.gravity = 17;
        this.f1302a.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout.setLayoutParams(layoutParams2);
        frameLayout.addView(this.f1692m);
        frameLayout.addView(this.f1302a);
        View viewInflate = LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_splash_shake_hint_text", "layout"), (ViewGroup) null);
        this.f1693n = viewInflate;
        viewInflate.setLayoutParams(layoutParams2);
        TextView textView = (TextView) this.f1693n.findViewById(C1345i.m4154a(C1175n.m2059a().m2148f(), "tv_splash_shake_hint_text", "id"));
        this.f1690k = textView;
        textView.setText(C1345i.m4154a(C1175n.m2059a().m2148f(), "myoffer_shake_full_title", C1875i.f11532g));
        this.f1303b = (ImageView) this.f1693n.findViewById(C1345i.m4154a(C1175n.m2059a().m2148f(), "tv_splash_shake_hint_icon", "id"));
        addView(frameLayout);
        addView(this.f1693n);
    }

    @Override // com.anythink.basead.p025ui.BaseShakeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.anythink.basead.p025ui.BaseShakeView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setNeedHideShakeIcon(boolean z) {
        this.f1694o = Boolean.valueOf(z);
        if (z) {
            ImageView imageView = this.f1303b;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f1692m;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            ImageView imageView3 = this.f1302a;
            if (imageView3 != null) {
                imageView3.setVisibility(4);
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        try {
            this.f1302a.setOnClickListener(onClickListener);
            this.f1692m.setOnClickListener(onClickListener);
            this.f1693n.setOnClickListener(onClickListener);
        } catch (Throwable unused) {
        }
    }

    public void setShakeHintText(String str) {
        this.f1691l = str;
        if (this.f1690k == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f1690k.setText(str);
    }

    @Override // com.anythink.basead.p025ui.BaseShakeView
    public void setShakeSetting(AbstractC1249n abstractC1249n) {
        super.setShakeSetting(abstractC1249n);
        if (this.f1307f == null || this.f1690k == null || !TextUtils.isEmpty(this.f1691l)) {
            return;
        }
        this.f1690k.setText(this.f1307f);
    }

    @Override // android.view.View
    public void startAnimation(Animation animation) {
        if (this.f1694o.booleanValue()) {
            return;
        }
        super.startAnimation(animation);
    }
}
