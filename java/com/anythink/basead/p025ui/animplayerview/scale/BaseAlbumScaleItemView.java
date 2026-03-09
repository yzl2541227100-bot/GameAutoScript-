package com.anythink.basead.p025ui.animplayerview.scale;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.basead.p025ui.WrapRoundImageView;
import com.anythink.basead.p025ui.animplayerview.InterfaceC0974b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAlbumScaleItemView extends FrameLayout implements InterfaceC0974b {

    /* JADX INFO: renamed from: a */
    public List<Bitmap> f1933a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f1934b;

    /* JADX INFO: renamed from: c */
    public float f1935c;

    /* JADX INFO: renamed from: d */
    public boolean f1936d;

    /* JADX INFO: renamed from: e */
    public long f1937e;

    public BaseAlbumScaleItemView(Context context) {
        this(context, null);
    }

    public BaseAlbumScaleItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseAlbumScaleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = LayoutInflater.from(context).inflate(mo1145a(context), (ViewGroup) this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(viewInflate, layoutParams);
        initView(viewInflate);
    }

    /* JADX INFO: renamed from: a */
    public final int m1151a() {
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo1145a(Context context);

    /* JADX INFO: renamed from: b */
    public final int m1152b() {
        return getContext().getResources().getDisplayMetrics().heightPixels;
    }

    public float dip2px(float f) {
        return (f * getContext().getResources().getDisplayMetrics().density) + 0.5f;
    }

    public List<Animator> getAnimatorList(View view, float f, float f2, int i) {
        ArrayList arrayList = new ArrayList();
        if (f > 0.0f || f2 > 0.0f) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationX", 0.0f, f2);
            arrayList.add(objectAnimatorOfFloat);
            arrayList.add(objectAnimatorOfFloat2);
        }
        if (i > 0) {
            float f3 = i;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, f3);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, f3);
            arrayList.add(objectAnimatorOfFloat3);
            arrayList.add(objectAnimatorOfFloat4);
        }
        return arrayList;
    }

    public void initView(View view) {
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void pause() {
        AnimatorSet animatorSet = this.f1934b;
        if (animatorSet != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                animatorSet.pause();
            } else {
                stop();
            }
        }
    }

    public void release() {
        stop();
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void resume() {
        AnimatorSet animatorSet = this.f1934b;
        if (animatorSet != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                animatorSet.resume();
            } else {
                start();
            }
        }
    }

    public void setBitmapResources(List<Bitmap> list) {
        ViewGroup viewGroup = (ViewGroup) getChildAt(0);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            Log.d("AlbumScaleItemView03", "view: ".concat(String.valueOf(childAt)));
            if (childAt instanceof WrapRoundImageView) {
                ((WrapRoundImageView) childAt).setImageBitmap(list.get(i % 4));
            }
        }
    }

    public void setMainViewScale(float f) {
        this.f1935c = f;
    }

    public void setOrientation(boolean z) {
        this.f1936d = z;
    }

    public void setStartDelay(long j) {
        this.f1937e = j;
    }

    public void start() {
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void stop() {
        AnimatorSet animatorSet = this.f1934b;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f1934b = null;
        }
    }
}
