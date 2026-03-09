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
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AlbumScaleItemView03 extends BaseAlbumScaleItemView {

    /* JADX INFO: renamed from: f */
    private ImageView f1912f;

    /* JADX INFO: renamed from: g */
    private ImageView f1913g;

    /* JADX INFO: renamed from: h */
    private ImageView f1914h;

    /* JADX INFO: renamed from: i */
    private ImageView f1915i;

    /* JADX INFO: renamed from: j */
    private ImageView f1916j;

    /* JADX INFO: renamed from: k */
    private ImageView f1917k;

    /* JADX INFO: renamed from: l */
    private ImageView f1918l;

    public AlbumScaleItemView03(Context context) {
        this(context, null);
    }

    public AlbumScaleItemView03(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumScaleItemView03(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.anythink.basead.p025ui.animplayerview.scale.BaseAlbumScaleItemView
    /* JADX INFO: renamed from: a */
    public final int mo1145a(Context context) {
        return C1345i.m4154a(context, "myoffer_scale_third", "layout");
    }

    @Override // com.anythink.basead.p025ui.animplayerview.scale.BaseAlbumScaleItemView
    public void initView(View view) {
        super.initView(view);
        Context context = getContext();
        this.f1912f = (ImageView) view.findViewById(C1345i.m4154a(context, "iv_left_01", "id"));
        this.f1913g = (ImageView) view.findViewById(C1345i.m4154a(context, "iv_left_02", "id"));
        this.f1914h = (ImageView) view.findViewById(C1345i.m4154a(context, "iv_left_03", "id"));
        this.f1915i = (ImageView) view.findViewById(C1345i.m4154a(context, "iv_left_04", "id"));
        this.f1916j = (ImageView) view.findViewById(C1345i.m4154a(context, "iv_right_01", "id"));
        this.f1917k = (ImageView) view.findViewById(C1345i.m4154a(context, "iv_right_02", "id"));
        this.f1918l = (ImageView) view.findViewById(C1345i.m4154a(context, "iv_right_03", "id"));
    }

    @Override // com.anythink.basead.p025ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void setBitmapResources(List<Bitmap> list) {
        if (list == null || list.size() < 4) {
            return;
        }
        ImageView imageView = this.f1912f;
        if (imageView != null) {
            imageView.setImageBitmap(list.get(2));
        }
        ImageView imageView2 = this.f1913g;
        if (imageView2 != null) {
            imageView2.setImageBitmap(list.get(0));
        }
        ImageView imageView3 = this.f1914h;
        if (imageView3 != null) {
            imageView3.setImageBitmap(list.get(3));
        }
        ImageView imageView4 = this.f1915i;
        if (imageView4 != null) {
            imageView4.setImageBitmap(list.get(0));
        }
        ImageView imageView5 = this.f1916j;
        if (imageView5 != null) {
            imageView5.setImageBitmap(list.get(1));
        }
        ImageView imageView6 = this.f1917k;
        if (imageView6 != null) {
            imageView6.setImageBitmap(list.get(2));
        }
        ImageView imageView7 = this.f1918l;
        if (imageView7 != null) {
            imageView7.setImageBitmap(list.get(3));
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void start() {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        if (this.f1934b == null) {
            this.f1934b = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            if (this.f1936d) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f1914h, "translationX", 0.0f, -dip2px(20.0f));
                objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f1914h, "translationY", 0.0f, dip2px(15.0f));
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f1916j, "translationX", 0.0f, dip2px(15.0f));
                objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f1916j, "translationY", 0.0f, dip2px(15.0f));
            }
            arrayList.add(objectAnimatorOfFloat);
            arrayList.add(objectAnimatorOfFloat2);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, this.f1935c);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, this.f1935c);
            arrayList.add(objectAnimatorOfFloat3);
            arrayList.add(objectAnimatorOfFloat4);
            this.f1934b.setDuration(4000L);
            this.f1934b.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f1934b.playTogether(arrayList);
            long j = this.f1937e;
            if (j > 0) {
                this.f1934b.setStartDelay(j);
            }
        }
        this.f1934b.start();
    }
}
