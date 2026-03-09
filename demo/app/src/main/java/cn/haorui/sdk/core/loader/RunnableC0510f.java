package cn.haorui.sdk.core.loader;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import cn.haorui.sdk.core.AdSdk;
import com.umeng.commonsdk.proguard.C3471v;

/* JADX INFO: renamed from: cn.haorui.sdk.core.loader.f */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0510f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0511g f123a;

    public RunnableC0510f(C0511g c0511g) {
        this.f123a = c0511g;
    }

    @Override // java.lang.Runnable
    public void run() {
        Sensor defaultSensor;
        if (this.f123a.f129e != null || AdSdk.getContext() == null) {
            return;
        }
        this.f123a.f129e = (SensorManager) AdSdk.getContext().getSystemService(C3471v.f18942W);
        C0511g c0511g = this.f123a;
        int i = c0511g.f126b;
        SensorManager sensorManager = c0511g.f129e;
        if (i == 2) {
            defaultSensor = sensorManager.getDefaultSensor(4);
        } else {
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
            C0511g c0511g2 = this.f123a;
            c0511g2.f129e.registerListener(c0511g2.f143s, defaultSensor2, 1);
            defaultSensor = this.f123a.f129e.getDefaultSensor(1);
        }
        C0511g c0511g3 = this.f123a;
        c0511g3.f129e.registerListener(c0511g3.f143s, defaultSensor, 2);
    }
}
