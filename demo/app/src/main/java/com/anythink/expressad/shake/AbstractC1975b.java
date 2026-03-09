package com.anythink.expressad.shake;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* JADX INFO: renamed from: com.anythink.expressad.shake.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1975b implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public static final int f12456a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f12457b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f12458c = 2;

    /* JADX INFO: renamed from: d */
    public float f12459d = 0.0f;

    /* JADX INFO: renamed from: e */
    public float f12460e = 0.0f;

    /* JADX INFO: renamed from: f */
    public float f12461f = 0.0f;

    /* JADX INFO: renamed from: g */
    public long f12462g = 0;

    /* JADX INFO: renamed from: h */
    private int f12463h;

    /* JADX INFO: renamed from: i */
    private int f12464i;

    public AbstractC1975b(int i, int i2) {
        this.f12463h = 0;
        this.f12464i = 0;
        this.f12463h = i;
        this.f12464i = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo10481a();

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
            float r2 = r9.f12459d
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L22
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r9.f12463h
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L48
        L22:
            float r2 = r9.f12460e
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L35
            float r2 = r1 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r9.f12463h
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L48
        L35:
            float r2 = r9.f12461f
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L5c
            float r2 = r10 - r2
            float r2 = java.lang.Math.abs(r2)
            int r3 = r9.f12463h
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5c
        L48:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r9.f12462g
            long r4 = r2 - r4
            int r6 = r9.f12464i
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L5c
            r9.f12462g = r2
            r9.mo10481a()
        L5c:
            r9.f12459d = r0
            r9.f12460e = r1
            r9.f12461f = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.shake.AbstractC1975b.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
