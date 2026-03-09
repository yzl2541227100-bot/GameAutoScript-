package com.anythink.basead.p015c;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import com.anythink.expressad.exoplayer.C1575f;

/* JADX INFO: renamed from: com.anythink.basead.c.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0750h implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public static final int f752a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f753b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f754c = 2;

    /* JADX INFO: renamed from: d */
    public float f755d = 0.0f;

    /* JADX INFO: renamed from: e */
    public float f756e = 0.0f;

    /* JADX INFO: renamed from: f */
    public float f757f = 0.0f;

    /* JADX INFO: renamed from: g */
    public long f758g = 0;

    /* JADX INFO: renamed from: h */
    private int f759h;

    /* JADX INFO: renamed from: i */
    private long f760i;

    public AbstractC0750h() {
        this.f759h = 0;
        this.f760i = 0L;
        this.f759h = 10;
        this.f760i = C1575f.f8394a;
    }

    /* JADX INFO: renamed from: a */
    public final void m316a(int i, long j) {
        this.f759h = i;
        this.f760i = j;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo317a();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSensorChanged(android.hardware.SensorEvent r10) {
        /*
            r9 = this;
            float[] r10 = r10.values
            r0 = 0
            r0 = r10[r0]
            float r0 = -r0
            r1 = 1
            r1 = r10[r1]
            float r1 = -r1
            r2 = 2
            r10 = r10[r2]
            float r10 = -r10
            float r2 = r9.f755d
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L22
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r9.f759h
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L48
        L22:
            float r2 = r9.f756e
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L35
            float r2 = r1 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r9.f759h
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L48
        L35:
            float r2 = r9.f757f
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L5e
            float r2 = r10 - r2
            float r2 = java.lang.Math.abs(r2)
            int r3 = r9.f759h
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5e
        L48:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r9.f758g
            long r4 = r2 - r4
            long r6 = r9.f760i
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L5e
            boolean r4 = r9.mo317a()
            if (r4 == 0) goto L5e
            r9.f758g = r2
        L5e:
            r9.f755d = r0
            r9.f756e = r1
            r9.f757f = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p015c.AbstractC0750h.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
