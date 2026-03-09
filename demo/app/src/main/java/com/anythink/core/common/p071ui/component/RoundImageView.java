package com.anythink.core.common.p071ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.core.common.res.image.RecycleImageView;

/* JADX INFO: loaded from: classes.dex */
public class RoundImageView extends RecycleImageView {

    /* JADX INFO: renamed from: a */
    public int f5621a;

    /* JADX INFO: renamed from: b */
    public boolean f5622b;

    public RoundImageView(Context context) {
        super(context);
        this.f5621a = C1345i.m4153a(getContext(), 5.0f);
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5621a = C1345i.m4153a(getContext(), 5.0f);
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5621a = C1345i.m4153a(getContext(), 5.0f);
    }

    @Override // com.anythink.core.common.res.image.RecycleImageView, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            if (this.f5622b) {
                int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                super.dispatchDraw(canvas);
                canvas.translate(getPaddingLeft(), getPaddingTop());
                C1360x.m4263a(canvas, getWidth() - (getPaddingLeft() * 2), getHeight() - (getPaddingTop() * 2), this.f5621a);
                canvas.restoreToCount(iSaveLayer);
                return;
            }
        } catch (Exception unused) {
        }
        super.dispatchDraw(canvas);
    }

    @Override // com.anythink.core.common.res.image.RecycleImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            if (this.f5622b) {
                int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                super.onDraw(canvas);
                canvas.translate(getPaddingLeft(), getPaddingTop());
                C1360x.m4263a(canvas, getWidth() - (getPaddingLeft() * 2), getHeight() - (getPaddingTop() * 2), this.f5621a);
                canvas.restoreToCount(iSaveLayer);
                return;
            }
        } catch (Exception unused) {
        }
        super.onDraw(canvas);
    }

    public void setNeedRadiu(boolean z) {
        this.f5622b = z;
    }

    public void setRadiusInDip(int i) {
        this.f5621a = C1345i.m4153a(getContext(), i);
    }
}
