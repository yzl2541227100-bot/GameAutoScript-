package com.anythink.expressad.shake;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;

/* JADX INFO: loaded from: classes.dex */
public class MBShakeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private static final String f12450a = "MBSplashShakeView";

    /* JADX INFO: renamed from: b */
    private ImageView f12451b;

    /* JADX INFO: renamed from: c */
    private Animation f12452c;

    public MBShakeView(Context context) {
        super(context);
    }

    public MBShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBShakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @RequiresApi(api = 21)
    public MBShakeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* JADX INFO: renamed from: a */
    private String m10474a(String str) {
        return TextUtils.isEmpty(str) ? getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_shake_view_view_other_app", C1875i.f11532g)) : str;
    }

    /* JADX INFO: renamed from: a */
    private void m10475a() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.5f, 1, 0.5f);
        this.f12452c = rotateAnimation;
        rotateAnimation.setDuration(100L);
        this.f12452c.setRepeatMode(2);
        this.f12452c.setRepeatCount(-1);
        this.f12451b.startAnimation(this.f12452c);
    }

    /* JADX INFO: renamed from: a */
    private static void m10476a(View view) {
        int color = Color.parseColor("#80000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(200.0f);
        view.setBackgroundDrawable(gradientDrawable);
    }

    public void initView(String str) {
        initView(str, false);
    }

    public void initView(String str, boolean z) {
        setOrientation(1);
        setGravity(1);
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(C1886t.m9834b(getContext(), z ? 60.0f : 80.0f), C1886t.m9834b(getContext(), z ? 60.0f : 80.0f)));
        int color = Color.parseColor("#80000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(200.0f);
        imageView.setBackgroundDrawable(gradientDrawable);
        this.f12451b = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C1886t.m9834b(getContext(), z ? 20.0f : 40.0f), C1886t.m9834b(getContext(), z ? 20.0f : 40.0f));
        layoutParams.gravity = 17;
        this.f12451b.setLayoutParams(layoutParams);
        this.f12451b.setImageResource(C1875i.m9684a(getContext(), "anythink_splash_btn_shake", C1875i.f11528c));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        frameLayout.addView(imageView);
        frameLayout.addView(this.f12451b);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = C1886t.m9834b(getContext(), 10.0f);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        getContext().getResources().getConfiguration().locale.getLanguage();
        textView.setText(getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_shake_view_hint_text", C1875i.f11532g)));
        textView.setTextSize(z ? 16.0f : 20.0f);
        textView.setTextColor(-1);
        textView.setShadowLayer(8.0f, 3.0f, 3.0f, -16777216);
        if (TextUtils.isEmpty(str)) {
            str = getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_shake_view_view_other_app", C1875i.f11532g));
        }
        TextView textView2 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = C1886t.m9834b(getContext(), 5.0f);
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        textView2.setText(str);
        textView2.setTextSize(z ? 12.0f : 16.0f);
        textView2.setTextColor(-1);
        textView2.setShadowLayer(8.0f, 3.0f, 3.0f, -16777216);
        addView(frameLayout);
        addView(textView);
        addView(textView2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.5f, 1, 0.5f);
        this.f12452c = rotateAnimation;
        rotateAnimation.setDuration(100L);
        this.f12452c.setRepeatMode(2);
        this.f12452c.setRepeatCount(-1);
        this.f12451b.startAnimation(this.f12452c);
    }
}
