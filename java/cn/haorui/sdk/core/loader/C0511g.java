package cn.haorui.sdk.core.loader;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.core.domain.HRAdInfo;
import cn.haorui.sdk.core.utils.LogUtil;
import cn.haorui.sdk.core.utils.RecordUtil;
import cn.haorui.sdk.platform.p003hr.splash.ShakeBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: cn.haorui.sdk.core.loader.g */
/* JADX INFO: loaded from: classes.dex */
public class C0511g {

    /* JADX INFO: renamed from: z */
    public static double f124z = 20.0d;

    /* JADX INFO: renamed from: a */
    public int f125a;

    /* JADX INFO: renamed from: e */
    public SensorManager f129e;

    /* JADX INFO: renamed from: g */
    public float f131g;

    /* JADX INFO: renamed from: k */
    public String f135k;

    /* JADX INFO: renamed from: l */
    public long f136l;

    /* JADX INFO: renamed from: m */
    public HRAdInfo.DClickData f137m;

    /* JADX INFO: renamed from: n */
    public int f138n;

    /* JADX INFO: renamed from: o */
    public double f139o;

    /* JADX INFO: renamed from: p */
    public boolean f140p;

    /* JADX INFO: renamed from: r */
    public int f142r;

    /* JADX INFO: renamed from: b */
    public int f126b = 1;

    /* JADX INFO: renamed from: c */
    public int f127c = 1;

    /* JADX INFO: renamed from: d */
    public long f128d = 500;

    /* JADX INFO: renamed from: f */
    public boolean f130f = false;

    /* JADX INFO: renamed from: h */
    public float[] f132h = new float[3];

    /* JADX INFO: renamed from: i */
    public List<ShakeBean> f133i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public int f134j = 0;

    /* JADX INFO: renamed from: q */
    public long f141q = 0;

    /* JADX INFO: renamed from: s */
    public SensorEventListener f143s = new a();

    /* JADX INFO: renamed from: t */
    public float f144t = 0.0f;

    /* JADX INFO: renamed from: u */
    public float f145u = 0.0f;

    /* JADX INFO: renamed from: v */
    public float f146v = 0.0f;

    /* JADX INFO: renamed from: w */
    public float f147w = 0.0f;

    /* JADX INFO: renamed from: x */
    public float f148x = 0.0f;

    /* JADX INFO: renamed from: y */
    public float f149y = 0.0f;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.loader.g$a */
    public class a implements SensorEventListener {
        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            try {
                if (sensorEvent.sensor.getType() == 4) {
                    C0511g c0511g = C0511g.this;
                    c0511g.getClass();
                    float f = c0511g.f131g;
                    if (f != 0.0f && c0511g.f130f) {
                        float f2 = (sensorEvent.timestamp - f) * 1.0E-9f;
                        float[] fArr = c0511g.f132h;
                        float f3 = fArr[0];
                        float[] fArr2 = sensorEvent.values;
                        fArr[0] = f3 + (fArr2[0] * f2);
                        fArr[1] = fArr[1] + (fArr2[1] * f2);
                        fArr[2] = fArr[2] + (fArr2[2] * f2);
                        float degrees = (float) Math.toDegrees(fArr[0]);
                        float degrees2 = (float) Math.toDegrees(c0511g.f132h[1]);
                        float degrees3 = (float) Math.toDegrees(c0511g.f132h[2]);
                        if (Math.abs(degrees) >= C0511g.f124z || Math.abs(degrees2) >= C0511g.f124z || Math.abs(degrees3) >= C0511g.f124z) {
                            c0511g.m52e();
                        } else if (c0511g.m53f() && (Math.abs(degrees) >= c0511g.f139o || Math.abs(degrees2) >= c0511g.f139o || Math.abs(degrees3) >= c0511g.f139o)) {
                            c0511g.m50c();
                            c0511g.m52e();
                        }
                    }
                    c0511g.f131g = sensorEvent.timestamp;
                    return;
                }
                C0511g c0511g2 = C0511g.this;
                c0511g2.getClass();
                if (c0511g2.f130f) {
                    int type = sensorEvent.sensor.getType();
                    if (type != 1) {
                        if (type != 9) {
                            return;
                        }
                        float[] fArr3 = sensorEvent.values;
                        c0511g2.f147w = fArr3[0];
                        c0511g2.f148x = fArr3[1];
                        c0511g2.f149y = fArr3[2];
                        return;
                    }
                    float[] fArr4 = sensorEvent.values;
                    float f4 = fArr4[0];
                    c0511g2.f144t = f4;
                    float f5 = fArr4[1];
                    c0511g2.f145u = f5;
                    float f6 = fArr4[2];
                    c0511g2.f146v = f6;
                    float f7 = f4 - c0511g2.f147w;
                    float f8 = f5 - c0511g2.f148x;
                    float f9 = f6 - c0511g2.f149y;
                    double dSqrt = Math.sqrt((f7 * f7) + (f8 * f8) + (f9 * f9));
                    if (c0511g2.f147w == 0.0f && c0511g2.f148x == 0.0f && c0511g2.f149y == 0.0f) {
                        dSqrt -= 9.8d;
                    }
                    if (c0511g2.f144t == 0.0f && c0511g2.f145u == 0.0f && c0511g2.f146v == 0.0f) {
                        dSqrt -= 9.8d;
                    }
                    double dAtan = (dSqrt * 100.0d) / 30.0d;
                    if (80.0d < dAtan) {
                        dAtan = (((Math.atan((dAtan - 80.0d) / 30.0d) * 20.0d) * 2.0d) / 3.141592653589793d) + 80.0d;
                    }
                    if (dAtan >= c0511g2.f125a) {
                        int i = c0511g2.f134j + 1;
                        c0511g2.f134j = i;
                        if (i < c0511g2.f127c) {
                            return;
                        }
                    } else {
                        if (!c0511g2.m53f() || dAtan < c0511g2.f138n) {
                            return;
                        }
                        c0511g2.m50c();
                        int i2 = c0511g2.f134j + 1;
                        c0511g2.f134j = i2;
                        if (i2 < c0511g2.f127c) {
                            return;
                        }
                    }
                    c0511g2.m51d();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.loader.g$b */
    public class b implements Comparator<ShakeBean> {
        public b(C0511g c0511g) {
        }

        @Override // java.util.Comparator
        public int compare(ShakeBean shakeBean, ShakeBean shakeBean2) {
            return shakeBean2.getEcpm() - shakeBean.getEcpm();
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.loader.g$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static C0511g f151a = new C0511g();
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.loader.g$d */
    public interface d {
        void onShake();
    }

    /* JADX INFO: renamed from: a */
    public void m43a() {
        LogUtil.m86d("ShakeUtil", "destroy");
        this.f130f = false;
        this.f131g = 0.0f;
        SensorManager sensorManager = this.f129e;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f143s);
            this.f129e = null;
        }
        List<ShakeBean> list = this.f133i;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m44a(int i) {
        List<ShakeBean> list = this.f133i;
        if (list == null || list.size() == 0) {
            m43a();
            return;
        }
        Iterator<ShakeBean> it = this.f133i.iterator();
        while (it.hasNext()) {
            if (i == it.next().getShakeId()) {
                it.remove();
            }
        }
        List<ShakeBean> list2 = this.f133i;
        if (list2 == null || list2.size() <= 0) {
            m43a();
        } else {
            Collections.sort(this.f133i, new b(this));
            this.f133i.get(0).setStatus(ShakeBean.SHAKE_STATUS_USEABLE);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m45a(int i, int i2, long j, int i3, int i4, int i5, d dVar) {
        HRAdInfo.DClickData dClickData;
        this.f125a = i;
        this.f128d = j;
        this.f127c = i3;
        this.f140p = false;
        this.f126b = i2;
        ShakeBean shakeBean = new ShakeBean();
        shakeBean.setStatus(ShakeBean.SHAKE_STATUS_USEABLE);
        List<ShakeBean> list = this.f133i;
        if (list != null && list.size() > 0) {
            Iterator<ShakeBean> it = this.f133i.iterator();
            while (it.hasNext()) {
                if (it.next().getEcpm() > i5) {
                    shakeBean.setStatus(ShakeBean.SHAKE_STATUS_WAIT);
                }
            }
        }
        float[] fArr = this.f132h;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        this.f131g = 0.0f;
        this.f144t = 0.0f;
        this.f145u = 0.0f;
        this.f146v = 0.0f;
        this.f147w = 0.0f;
        this.f148x = 0.0f;
        this.f149y = 0.0f;
        shakeBean.setShakeId(i4);
        shakeBean.setEcpm(i5);
        shakeBean.setListener(dVar);
        shakeBean.setSensitivity_index(i);
        shakeBean.setTouch_type(this.f126b);
        shakeBean.setIsShowing(true);
        this.f133i.add(shakeBean);
        if (i < 1 || i > 100) {
            this.f125a = 50;
            f124z = 20.0d;
        } else {
            double d2 = (((double) i) * 90.0d) / 100.0d;
            f124z = d2;
            if (d2 < 2.0d) {
                f124z = 2.0d;
            }
        }
        try {
            RecordUtil.RecordClick recordClick = RecordUtil.recordClickMap.get(this.f135k + this.f136l);
            if ((recordClick == null || !recordClick.isClicked()) && (dClickData = this.f137m) != null) {
                int power = dClickData.getPower();
                int ptime = this.f137m.getPtime();
                if (ptime <= 0 || power >= this.f125a) {
                    return;
                }
                this.f142r = ptime;
                this.f140p = true;
                this.f141q = AdSdk.getSharedPreferences().getLong(RecordUtil.LAST_DYNAMIC_TIME, 0L);
                if (power < 1 || power > 100) {
                    return;
                }
                this.f138n = power;
                double d3 = (((double) power) * 45.0d) / 100.0d;
                this.f139o = d3;
                if (d3 < 2.0d) {
                    this.f139o = 2.0d;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m46a(int i, boolean z) {
        List<ShakeBean> list = this.f133i;
        if (list == null || list.size() == 0) {
            return;
        }
        for (ShakeBean shakeBean : this.f133i) {
            if (i == shakeBean.getShakeId()) {
                shakeBean.setIsShowing(z);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m47a(String str, long j, HRAdInfo.DClickData dClickData) {
        this.f135k = str;
        this.f136l = j;
        this.f137m = dClickData;
    }

    /* JADX INFO: renamed from: a */
    public void m48a(boolean z) {
        this.f130f = z;
        try {
            new Handler().postDelayed(new RunnableC0510f(this), this.f128d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public int m49b() {
        return (int) (((Math.random() * 9.0d) + 1.0d) * 1.0E7d);
    }

    /* JADX INFO: renamed from: c */
    public final void m50c() {
        RecordUtil.RecordClick recordClick = RecordUtil.recordClickMap.get(this.f135k + this.f136l);
        if (recordClick != null) {
            if (!recordClick.isClicked()) {
            }
            RecordUtil.recordClickMap.put(this.f135k + this.f136l, recordClick);
        }
        recordClick = new RecordUtil.RecordClick();
        recordClick.setDynamicClick(true);
        RecordUtil.saveAction(this.f135k, 5);
        RecordUtil.saveAction(this.f135k, 7);
        RecordUtil.recordClickMap.put(this.f135k + this.f136l, recordClick);
    }

    /* JADX INFO: renamed from: d */
    public final void m51d() {
        this.f130f = false;
        this.f144t = 0.0f;
        this.f145u = 0.0f;
        this.f146v = 0.0f;
        this.f147w = 0.0f;
        this.f148x = 0.0f;
        this.f149y = 0.0f;
        List<ShakeBean> list = this.f133i;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (ShakeBean shakeBean : this.f133i) {
            if (shakeBean.getIsShowing() && shakeBean.getStatus() == ShakeBean.SHAKE_STATUS_USEABLE && shakeBean.getListener() != null) {
                shakeBean.getListener().onShake();
                this.f133i.remove(shakeBean);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m52e() {
        this.f130f = false;
        float[] fArr = this.f132h;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        List<ShakeBean> list = this.f133i;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (ShakeBean shakeBean : this.f133i) {
            if (shakeBean.getIsShowing() && shakeBean.getStatus() == ShakeBean.SHAKE_STATUS_USEABLE && shakeBean.getListener() != null) {
                shakeBean.getListener().onShake();
                this.f133i.remove(shakeBean);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m53f() {
        return this.f140p && System.currentTimeMillis() - this.f141q > ((long) (this.f142r * 1000));
    }
}
