package com.anythink.basead.p025ui.animplayerview.scale;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.anythink.core.common.p066o.C1345i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AlbumScaleItemView01 extends BaseAlbumScaleItemView {

    /* JADX INFO: renamed from: f */
    private ImageView f1905f;

    /* JADX INFO: renamed from: g */
    private ImageView f1906g;

    /* JADX INFO: renamed from: h */
    private ImageView f1907h;

    /* JADX INFO: renamed from: i */
    private ImageView f1908i;

    public AlbumScaleItemView01(Context context) {
        this(context, null);
    }

    public AlbumScaleItemView01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumScaleItemView01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.anythink.basead.p025ui.animplayerview.scale.BaseAlbumScaleItemView
    /* JADX INFO: renamed from: a */
    public final int mo1145a(Context context) {
        return C1345i.m4154a(context, "myoffer_scale_first", "layout");
    }

    @Override // com.anythink.basead.p025ui.animplayerview.scale.BaseAlbumScaleItemView
    public void initView(View view) {
        super.initView(view);
        Context context = getContext();
        this.f1905f = (ImageView) view.findViewById(C1345i.m4154a(context, "iv_left_top", "id"));
        this.f1906g = (ImageView) view.findViewById(C1345i.m4154a(context, "iv_left_bottom", "id"));
        this.f1907h = (ImageView) view.findViewById(C1345i.m4154a(context, "iv_right_top", "id"));
        this.f1908i = (ImageView) view.findViewById(C1345i.m4154a(context, "iv_right_bottom", "id"));
    }

    @Override // com.anythink.basead.p025ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void setBitmapResources(List<Bitmap> list) {
        if (list == null || list.size() < 4) {
            return;
        }
        ImageView imageView = this.f1907h;
        if (imageView != null) {
            imageView.setImageBitmap(list.get(0));
        }
        ImageView imageView2 = this.f1908i;
        if (imageView2 != null) {
            imageView2.setImageBitmap(list.get(1));
        }
        ImageView imageView3 = this.f1906g;
        if (imageView3 != null) {
            imageView3.setImageBitmap(list.get(2));
        }
        ImageView imageView4 = this.f1905f;
        if (imageView4 != null) {
            imageView4.setImageBitmap(list.get(3));
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void start() {
        if (this.f1934b == null) {
            this.f1934b = new AnimatorSet();
            ImageView imageView = this.f1905f;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationX", 0.0f, -imageView.getX());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f1905f, "translationY", 0.0f, (float) (-Math.cos(r3.getY())));
            ImageView imageView2 = this.f1906g;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView2, "translationX", 0.0f, -imageView2.getX());
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f1906g, "translationY", 0.0f, (float) Math.cos(r10.getY()));
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f1907h, "translationX", 0.0f, m1151a() - this.f1907h.getX());
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f1907h, "translationY", 0.0f, -((float) Math.cos(r12.getY())));
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f1908i, "translationX", 0.0f, m1151a() - this.f1908i.getX());
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.f1908i, "translationY", 0.0f, (float) Math.cos(m1152b() - this.f1908i.getY()));
            ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 5.0f);
            ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 5.0f);
            this.f1934b.setDuration(2500L);
            this.f1934b.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f1934b.playTogether(objectAnimatorOfFloat9, objectAnimatorOfFloat10, objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat6, objectAnimatorOfFloat5, objectAnimatorOfFloat7, objectAnimatorOfFloat8);
            long j = this.f1937e;
            if (j > 0) {
                this.f1934b.setStartDelay(j);
            }
        }
        this.f1934b.start();
    }
}
