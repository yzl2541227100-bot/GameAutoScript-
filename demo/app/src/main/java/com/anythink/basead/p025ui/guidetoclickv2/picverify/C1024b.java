package com.anythink.basead.p025ui.guidetoclickv2.picverify;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.annotation.NonNull;
import com.anythink.core.common.p066o.C1345i;

/* JADX INFO: renamed from: com.anythink.basead.ui.guidetoclickv2.picverify.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1024b extends AbstractC1023a {
    public C1024b(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.picverify.AbstractC1023a
    /* JADX INFO: renamed from: a */
    public final Paint mo1303a() {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#000000"));
        paint.setAlpha(127);
        return paint;
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.picverify.AbstractC1023a
    /* JADX INFO: renamed from: a */
    public final Path mo1304a(int i) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        float f = i;
        path.rLineTo(f, 0.0f);
        path.rLineTo(0.0f, f);
        float f2 = -i;
        path.rLineTo(f2, 0.0f);
        path.rLineTo(0.0f, f2);
        path.close();
        return path;
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.picverify.AbstractC1023a
    @NonNull
    /* JADX INFO: renamed from: a */
    public final C1025c mo1305a(int i, int i2, int i3) {
        return new C1025c((i - i3) - ((int) (((double) i) * 0.15d)), (int) ((((double) i2) / 2.0d) - (((double) i3) * 1.5d)));
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.picverify.AbstractC1023a
    /* JADX INFO: renamed from: a */
    public final void mo1306a(Context context, Canvas canvas, Path path) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#FFFFFF"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C1345i.m4153a(context, 2.0f));
        paint.setPathEffect(new DashPathEffect(new float[]{20.0f, 20.0f}, 10.0f));
        canvas.drawPath(new Path(path), paint);
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.picverify.AbstractC1023a
    /* JADX INFO: renamed from: b */
    public final Paint mo1307b() {
        return new Paint();
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.picverify.AbstractC1023a
    @NonNull
    /* JADX INFO: renamed from: b */
    public final C1025c mo1308b(int i, int i2, int i3) {
        return new C1025c((int) (((double) i) * 0.15d), (int) ((((double) i2) / 2.0d) - (((double) i3) * 1.5d)));
    }
}
