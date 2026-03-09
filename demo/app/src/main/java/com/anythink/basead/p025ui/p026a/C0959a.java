package com.anythink.basead.p025ui.p026a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.anythink.basead.ui.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0959a extends Drawable {

    /* JADX INFO: renamed from: a */
    public Paint f1784a = new Paint();

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        int iMax = Math.max(canvas.getHeight(), canvas.getWidth());
        canvas.drawColor(-13750739);
        float f = iMax / 2;
        this.f1784a.setShader(new RadialGradient(canvas.getWidth() / 2, canvas.getHeight() / 2, f, -1, 0, Shader.TileMode.CLAMP));
        canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, f, this.f1784a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
