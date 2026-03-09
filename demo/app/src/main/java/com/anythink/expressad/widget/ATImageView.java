package com.anythink.expressad.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;

/* JADX INFO: loaded from: classes.dex */
public class ATImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    private static final String f14717a = "at-widget-imageview";

    /* JADX INFO: renamed from: b */
    private Bitmap f14718b;

    /* JADX INFO: renamed from: c */
    private String f14719c;

    /* JADX INFO: renamed from: com.anythink.expressad.widget.ATImageView$1 */
    public class C23421 implements InterfaceC1819c {
        public C23421() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            ATImageView.this.setImageBitmap(bitmap);
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
        }
    }

    public ATImageView(Context context) {
        super(context);
        this.f14718b = null;
    }

    public ATImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14718b = null;
    }

    public ATImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14718b = null;
    }

    /* JADX INFO: renamed from: a */
    private void m12115a() {
        if (getContext() != null) {
            C1818b.m9427a(getContext()).m9443a(this.f14719c, new C23421());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            Bitmap bitmap = this.f14718b;
            if (bitmap == null || !bitmap.isRecycled()) {
                super.onDraw(canvas);
            } else if (getContext() != null) {
                C1818b.m9427a(getContext()).m9443a(this.f14719c, new C23421());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f14718b = bitmap;
        if (bitmap == null || !bitmap.isRecycled()) {
            super.setImageBitmap(bitmap);
        } else {
            this.f14718b = null;
            super.setImageBitmap(null);
        }
    }

    public void setImageUrl(String str) {
        this.f14719c = str;
    }
}
