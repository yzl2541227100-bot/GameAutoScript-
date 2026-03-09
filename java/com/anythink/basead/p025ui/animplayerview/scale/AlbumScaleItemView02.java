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
import com.anythink.expressad.exoplayer.p104i.C1659a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AlbumScaleItemView02 extends BaseAlbumScaleItemView {

    /* JADX INFO: renamed from: f */
    private ImageView f1909f;

    /* JADX INFO: renamed from: g */
    private ImageView f1910g;

    /* JADX INFO: renamed from: h */
    private ImageView f1911h;

    public AlbumScaleItemView02(Context context) {
        this(context, null);
    }

    public AlbumScaleItemView02(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumScaleItemView02(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.anythink.basead.p025ui.animplayerview.scale.BaseAlbumScaleItemView
    /* JADX INFO: renamed from: a */
    public final int mo1145a(Context context) {
        return C1345i.m4154a(context, "myoffer_scale_second", "layout");
    }

    @Override // com.anythink.basead.p025ui.animplayerview.scale.BaseAlbumScaleItemView
    public void initView(View view) {
        super.initView(view);
        Context context = getContext();
        this.f1909f = (ImageView) view.findViewById(C1345i.m4154a(context, "iv_left", "id"));
        this.f1910g = (ImageView) view.findViewById(C1345i.m4154a(context, "iv_right_top", "id"));
        this.f1911h = (ImageView) view.findViewById(C1345i.m4154a(context, "iv_right_bottom", "id"));
    }

    @Override // com.anythink.basead.p025ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void setBitmapResources(List<Bitmap> list) {
        if (list == null || list.size() < 4) {
            return;
        }
        ImageView imageView = this.f1910g;
        if (imageView != null) {
            imageView.setImageBitmap(list.get(0));
        }
        ImageView imageView2 = this.f1909f;
        if (imageView2 != null) {
            imageView2.setImageBitmap(list.get(1));
        }
        ImageView imageView3 = this.f1911h;
        if (imageView3 != null) {
            imageView3.setImageBitmap(list.get(3));
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void start() {
        if (this.f1934b == null) {
            this.f1934b = new AnimatorSet();
            ImageView imageView = this.f1909f;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationX", 0.0f, -(imageView.getX() + this.f1909f.getWidth()));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f1909f, "translationY", 0.0f, (float) (-Math.cos(r2.getY())));
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f1910g, "translationX", 0.0f, m1151a() - this.f1910g.getX());
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f1910g, "translationY", 0.0f, (float) (-Math.cos(r9.getY())));
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f1911h, "translationX", 0.0f, m1151a() - this.f1911h.getX());
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f1911h, "translationY", 0.0f, (float) Math.cos(m1152b() - this.f1911h.getY()));
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 5.0f);
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 5.0f);
            this.f1934b.setDuration(C1659a.f9130f);
            this.f1934b.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f1934b.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat6, objectAnimatorOfFloat5, objectAnimatorOfFloat7, objectAnimatorOfFloat8);
            long j = this.f1937e;
            if (j > 0) {
                this.f1934b.setStartDelay(j);
            }
        }
        this.f1934b.start();
    }
}
