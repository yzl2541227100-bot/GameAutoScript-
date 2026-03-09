package com.iflytek.voiceads.videolib;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;

/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class JZTextureView extends TextureView {

    /* JADX INFO: renamed from: a */
    public int f16518a;

    /* JADX INFO: renamed from: b */
    public int f16519b;

    public JZTextureView(Context context) {
        super(context);
        this.f16518a = 0;
        this.f16519b = 0;
    }

    public JZTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16518a = 0;
        this.f16519b = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m13637a(int i, int i2) {
        if (this.f16518a == i && this.f16519b == i2) {
            return;
        }
        this.f16518a = i;
        this.f16519b = i2;
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x012c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.voiceads.videolib.JZTextureView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void setRotation(float f) {
        if (f != getRotation()) {
            super.setRotation(f);
            requestLayout();
        }
    }
}
