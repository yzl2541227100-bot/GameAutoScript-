package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import p285z2.C3768ck;
import p285z2.InterfaceC3805dk;

/* JADX INFO: loaded from: classes2.dex */
public class CircularRevealRelativeLayout extends RelativeLayout implements InterfaceC3805dk {
    private final C3768ck OoooOoO;

    public CircularRevealRelativeLayout(Context context) {
        this(context, null);
    }

    public CircularRevealRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OoooOoO = new C3768ck(this);
    }

    @Override // p285z2.InterfaceC3805dk
    public void OooO00o() {
        this.OoooOoO.OooO00o();
    }

    @Override // p285z2.InterfaceC3805dk
    public void OooO0O0() {
        this.OoooOoO.OooO0O0();
    }

    @Override // p285z2.C3768ck.OooO00o
    public void OooO0OO(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p285z2.C3768ck.OooO00o
    public boolean OooO0Oo() {
        return super.isOpaque();
    }

    @Override // android.view.View, p285z2.InterfaceC3805dk
    public void draw(Canvas canvas) {
        C3768ck c3768ck = this.OoooOoO;
        if (c3768ck != null) {
            c3768ck.OooO0OO(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // p285z2.InterfaceC3805dk
    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.OoooOoO.OooO0oO();
    }

    @Override // p285z2.InterfaceC3805dk
    public int getCircularRevealScrimColor() {
        return this.OoooOoO.OooO0oo();
    }

    @Override // p285z2.InterfaceC3805dk
    @Nullable
    public InterfaceC3805dk.OooO getRevealInfo() {
        return this.OoooOoO.OooOO0();
    }

    @Override // android.view.View, p285z2.InterfaceC3805dk
    public boolean isOpaque() {
        C3768ck c3768ck = this.OoooOoO;
        return c3768ck != null ? c3768ck.OooOO0o() : super.isOpaque();
    }

    @Override // p285z2.InterfaceC3805dk
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.OoooOoO.OooOOO0(drawable);
    }

    @Override // p285z2.InterfaceC3805dk
    public void setCircularRevealScrimColor(@ColorInt int i) {
        this.OoooOoO.OooOOO(i);
    }

    @Override // p285z2.InterfaceC3805dk
    public void setRevealInfo(@Nullable InterfaceC3805dk.OooO oooO) {
        this.OoooOoO.OooOOOO(oooO);
    }
}
