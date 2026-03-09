package com.octopus.p222ad.widget;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.octopus.p222ad.C3063R;

/* JADX INFO: loaded from: classes2.dex */
public class ShakeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f17995a;

    /* JADX INFO: renamed from: b */
    public TextView f17996b;

    /* JADX INFO: renamed from: c */
    private boolean f17997c;

    /* JADX INFO: renamed from: d */
    private String f17998d;

    /* JADX INFO: renamed from: e */
    private AnimationDrawable f17999e;

    public ShakeView(Context context) {
        super(context);
        this.f17997c = false;
        init(context);
    }

    public ShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17997c = false;
        init(context);
    }

    public ShakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17997c = false;
        init(context);
    }

    public void init(Context context) {
        if (this.f17997c) {
            return;
        }
        this.f17997c = true;
        ImageView imageView = new ImageView(context);
        this.f17995a = imageView;
        imageView.setBackgroundResource(C3063R.drawable.oct_anim_shake);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        setOrientation(1);
        addView(this.f17995a, layoutParams);
        this.f17999e = (AnimationDrawable) this.f17995a.getBackground();
    }

    public void setTitleText(String str) {
        this.f17998d = str;
        TextView textView = this.f17996b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void startShake() {
        AnimationDrawable animationDrawable = this.f17999e;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }

    public void stopShake() {
        AnimationDrawable animationDrawable = this.f17999e;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }
}
