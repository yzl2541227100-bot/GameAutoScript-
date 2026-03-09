package com.anythink.basead.p025ui.animplayerview.redpacket;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Random;

/* JADX INFO: renamed from: com.anythink.basead.ui.animplayerview.redpacket.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0977a {

    /* JADX INFO: renamed from: a */
    public float f1891a;

    /* JADX INFO: renamed from: b */
    public float f1892b;

    /* JADX INFO: renamed from: c */
    private Bitmap f1893c;

    /* JADX INFO: renamed from: d */
    private int f1894d;

    /* JADX INFO: renamed from: e */
    private int f1895e;

    /* JADX INFO: renamed from: f */
    private float f1896f;

    /* JADX INFO: renamed from: g */
    private float f1897g;

    public C0977a(Context context, Bitmap bitmap, int i) {
        i = i == 0 ? Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) : i;
        double dNextInt = (((double) new Random().nextInt(6)) + 15.0d) / 100.0d;
        dNextInt = (dNextInt < 0.15d || dNextInt > 0.2d) ? 0.2d : dNextInt;
        Log.d("RedPacketBean", "widthScale: ".concat(String.valueOf(dNextInt)));
        int i2 = (int) (((double) i) * dNextInt);
        this.f1894d = i2;
        int height = (i2 * bitmap.getHeight()) / bitmap.getWidth();
        this.f1895e = height;
        try {
            this.f1893c = Bitmap.createScaledBitmap(bitmap, this.f1894d, height, true);
        } catch (Exception e) {
            Log.e("RedPacketBean", "createScaledBitmap failed: " + e.getMessage());
        }
        this.f1896f = 400.0f;
        this.f1897g = (new Random().nextFloat() * 30.0f) - 15.0f;
    }

    /* JADX INFO: renamed from: f */
    private float m1127f() {
        return this.f1896f;
    }

    /* JADX INFO: renamed from: a */
    public final int m1128a() {
        return this.f1895e;
    }

    /* JADX INFO: renamed from: b */
    public final int m1129b() {
        return this.f1894d;
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m1130c() {
        return this.f1893c;
    }

    /* JADX INFO: renamed from: d */
    public final void m1131d() {
        Bitmap bitmap = this.f1893c;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f1893c.recycle();
        this.f1893c = null;
    }

    /* JADX INFO: renamed from: e */
    public final float m1132e() {
        return this.f1897g;
    }
}
