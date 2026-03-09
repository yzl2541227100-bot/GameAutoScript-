package com.anythink.expressad.shake;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.anythink.core.common.p051b.C1175n;
import com.umeng.commonsdk.proguard.C3471v;

/* JADX INFO: renamed from: com.anythink.expressad.shake.a */
/* JADX INFO: loaded from: classes.dex */
public class C1974a {

    /* JADX INFO: renamed from: c */
    private static volatile C1974a f12453c;

    /* JADX INFO: renamed from: a */
    public Sensor f12454a;

    /* JADX INFO: renamed from: b */
    private SensorManager f12455b;

    private C1974a() {
        Context contextM2148f = C1175n.m2059a().m2148f();
        if (contextM2148f != null) {
            try {
                if (this.f12455b == null) {
                    this.f12455b = (SensorManager) contextM2148f.getSystemService(C3471v.f18942W);
                }
                if (this.f12454a == null) {
                    this.f12454a = this.f12455b.getDefaultSensor(1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1974a m10477a() {
        if (f12453c == null) {
            synchronized (C1974a.class) {
                if (f12453c == null) {
                    f12453c = new C1974a();
                }
            }
        }
        return f12453c;
    }

    /* JADX INFO: renamed from: a */
    public final void m10478a(SensorEventListener sensorEventListener) {
        try {
            this.f12455b.registerListener(sensorEventListener, this.f12454a, 2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10479b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f12455b;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10480b() {
        return this.f12454a != null;
    }
}
