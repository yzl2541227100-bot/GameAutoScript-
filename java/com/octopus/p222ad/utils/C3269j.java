package com.octopus.p222ad.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.octopus.p222ad.internal.utilities.ViewUtil;
import com.octopus.p222ad.utils.p258b.C3255f;
import com.octopus.p222ad.widget.ShakeView;
import com.umeng.commonsdk.proguard.C3471v;

/* JADX INFO: renamed from: com.octopus.ad.utils.j */
/* JADX INFO: loaded from: classes2.dex */
public class C3269j {

    /* JADX INFO: renamed from: b */
    private static SensorManager f17947b;

    /* JADX INFO: renamed from: a */
    public ShakeView f17948a;

    /* JADX INFO: renamed from: c */
    private Context f17949c;

    /* JADX INFO: renamed from: d */
    private double f17950d;

    /* JADX INFO: renamed from: e */
    private double f17951e;

    /* JADX INFO: renamed from: f */
    private double f17952f;

    /* JADX INFO: renamed from: g */
    private int f17953g;

    /* JADX INFO: renamed from: h */
    private int f17954h;

    /* JADX INFO: renamed from: i */
    private int f17955i;

    /* JADX INFO: renamed from: j */
    private int f17956j;

    /* JADX INFO: renamed from: k */
    private int f17957k = 0;

    /* JADX INFO: renamed from: l */
    private int f17958l = 0;

    /* JADX INFO: renamed from: m */
    private float f17959m = -100.0f;

    /* JADX INFO: renamed from: n */
    private float f17960n = -100.0f;

    /* JADX INFO: renamed from: o */
    private float f17961o = -100.0f;

    /* JADX INFO: renamed from: p */
    private int f17962p = 0;

    /* JADX INFO: renamed from: q */
    private a f17963q = null;

    /* JADX INFO: renamed from: r */
    private boolean f17964r = false;

    /* JADX INFO: renamed from: s */
    private int f17965s = 200;

    /* JADX INFO: renamed from: t */
    private final SensorEventListener f17966t = new SensorEventListener() { // from class: com.octopus.ad.utils.j.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float f;
            float[] fArr = sensorEvent.values;
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[2];
            if (C3269j.this.f17959m == -100.0f) {
                C3269j.this.f17959m = f2;
            }
            if (C3269j.this.f17960n == -100.0f) {
                C3269j.this.f17960n = f3;
            }
            if (C3269j.this.f17961o == -100.0f) {
                C3269j.this.f17961o = f4;
            }
            C3255f.m14982b("ShakeUtil", "x = " + f2 + ",initialX = " + C3269j.this.f17959m + ",y = " + f3 + ",initialY = " + C3269j.this.f17960n + ",z = " + f4 + ",initialZ = " + C3269j.this.f17961o);
            double dAbs = ((double) Math.abs(f2 - C3269j.this.f17959m)) / 9.8d;
            double dAbs2 = ((double) Math.abs(f3 - C3269j.this.f17960n)) / 9.8d;
            double dAbs3 = ((double) Math.abs(f4 - C3269j.this.f17961o)) / 9.8d;
            StringBuilder sb = new StringBuilder();
            sb.append("rotateX = ");
            sb.append(dAbs);
            sb.append(",rotateY = ");
            sb.append(dAbs2);
            sb.append(",rotateZ = ");
            sb.append(dAbs3);
            sb.append(",rotateAmplitude = ");
            sb.append(C3269j.this.f17952f);
            C3255f.m14982b("ShakeUtil", sb.toString());
            if (dAbs > C3269j.this.f17952f) {
                C3269j.m15076e(C3269j.this);
                C3269j.this.f17959m = f2;
            }
            if (dAbs2 > C3269j.this.f17952f) {
                C3269j.m15076e(C3269j.this);
                f = f3;
                C3269j.this.f17960n = f;
            } else {
                f = f3;
            }
            if (dAbs3 > C3269j.this.f17952f) {
                C3269j.m15076e(C3269j.this);
                C3269j.this.f17961o = f4;
            }
            C3269j c3269j = C3269j.this;
            if (c3269j.m15067a(f2, f, f4, c3269j.f17950d)) {
                C3269j.this.f17962p = 1;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mShakeState = ");
            sb2.append(C3269j.this.f17962p);
            sb2.append(",isShakeStart = ");
            C3269j c3269j2 = C3269j.this;
            float f5 = f;
            sb2.append(c3269j2.m15067a(f2, f5, f4, c3269j2.f17950d));
            sb2.append(",isShakeEnd = ");
            C3269j c3269j3 = C3269j.this;
            sb2.append(c3269j3.m15071b(f2, f5, f4, c3269j3.f17951e));
            C3255f.m14982b("ShakeUtil", sb2.toString());
            if (C3269j.this.f17962p == 1) {
                C3269j c3269j4 = C3269j.this;
                if (c3269j4.m15071b(f2, f, f4, c3269j4.f17951e)) {
                    C3269j.this.f17962p = 2;
                    C3269j.m15082i(C3269j.this);
                }
            }
            C3255f.m14982b("ShakeUtil", "mShakeCount = " + C3269j.this.f17957k + ",dstShakeCount = " + C3269j.this.f17953g + ",mRotateCount = " + C3269j.this.f17958l + ",dstRotateCount = " + C3269j.this.f17954h);
            if ((C3269j.this.f17953g <= 0 || C3269j.this.f17957k < C3269j.this.f17953g) && (C3269j.this.f17954h <= 0 || C3269j.this.f17958l < C3269j.this.f17954h)) {
                return;
            }
            C3269j.this.m15088a();
        }
    };

    /* JADX INFO: renamed from: com.octopus.ad.utils.j$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo14767a();
    }

    public C3269j(Context context) {
        this.f17949c = context;
        f17947b = (SensorManager) context.getApplicationContext().getSystemService(C3471v.f18942W);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m15067a(float f, float f2, float f3, double d) {
        return Math.sqrt((Math.pow(((double) f) / 9.8d, 2.0d) + Math.pow(((double) f2) / 9.8d, 2.0d)) + Math.pow(((double) f3) / 9.8d, 2.0d)) > d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public boolean m15071b(float f, float f2, float f3, double d) {
        return Math.sqrt((Math.pow(((double) f) / 9.8d, 2.0d) + Math.pow(((double) f2) / 9.8d, 2.0d)) + Math.pow(((double) f3) / 9.8d, 2.0d)) > d;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m15076e(C3269j c3269j) {
        int i = c3269j.f17958l;
        c3269j.f17958l = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: e */
    public static Pair<Integer, Boolean> m15077e(int i) {
        int iRandom = (int) ((Math.random() * 100.0d) + 1.0d);
        return iRandom <= i ? new Pair<>(Integer.valueOf(iRandom), Boolean.TRUE) : new Pair<>(Integer.valueOf(iRandom), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: e */
    private void m15078e() {
        if (((Boolean) m15077e(this.f17956j).second).booleanValue()) {
            C3262c.m15017a(new Runnable() { // from class: com.octopus.ad.utils.j.2
                @Override // java.lang.Runnable
                public void run() {
                    C3269j.this.m15088a();
                }
            }, this.f17955i + (((Integer) r0.first).intValue() * 10));
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m15082i(C3269j c3269j) {
        int i = c3269j.f17957k;
        c3269j.f17957k = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: a */
    public View m15087a(int i, int i2) {
        int i3;
        C3255f.m14981a("OctopusAd", "enter getShakeView");
        if (this.f17949c == null) {
            return null;
        }
        if (this.f17954h == 0 && this.f17953g == 0 && this.f17956j == 0) {
            return null;
        }
        this.f17948a = new ShakeView(this.f17949c);
        TextUtils.isEmpty("50%");
        String str = TextUtils.isEmpty("70%") ? "50%" : "70%";
        String str2 = !TextUtils.isEmpty("140") ? "140" : "180";
        String str3 = TextUtils.isEmpty("140") ? "180" : "140";
        float screenWidthDp = ViewUtil.getScreenWidthDp(this.f17949c);
        int i4 = "50%".endsWith("%") ? (Integer.parseInt("50%".substring(0, "50%".indexOf("%"))) * i) / 100 : Integer.parseInt("50%");
        int i5 = str.endsWith("%") ? (Integer.parseInt(str.substring(0, str.indexOf("%"))) * i2) / 100 : Integer.parseInt(str);
        int i6 = 400;
        if (str2.endsWith("%")) {
            int i7 = Integer.parseInt(str2.substring(0, str2.indexOf("%")));
            if (screenWidthDp >= 400.0f) {
                i3 = (i7 * 400) / 100;
                i6 = i3;
            } else {
                i6 = (((int) screenWidthDp) * i7) / 100;
            }
        } else {
            i3 = Integer.parseInt(str2);
            if (i3 < 400) {
                i6 = i3;
            }
        }
        int i8 = str3.endsWith("%") ? (Integer.parseInt(str3.substring(0, str3.indexOf("%"))) * i6) / 100 : Integer.parseInt(str3);
        int iDip2px = ViewUtil.dip2px(this.f17949c, i6);
        int iDip2px2 = ViewUtil.dip2px(this.f17949c, i8);
        int iDip2px3 = ViewUtil.dip2px(this.f17949c, i4);
        int iDip2px4 = ViewUtil.dip2px(this.f17949c, i5);
        C3255f.m14981a("OctopusAd", "widthInt = " + iDip2px + ",heightInt = " + iDip2px2);
        if (iDip2px == 0) {
            iDip2px = 180;
        }
        if (iDip2px2 == 0) {
            iDip2px2 = iDip2px;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(iDip2px, iDip2px2);
        C3255f.m14981a("OctopusAd", "centerYInt = " + iDip2px4 + ",centerXInt = " + iDip2px3 + ",adWidthDp = " + i + ",adHeightDp = " + i2);
        if (iDip2px4 == 0) {
            iDip2px4 = ViewUtil.dip2px(this.f17949c, i2) / 2;
        }
        if (iDip2px3 == 0) {
            iDip2px3 = ViewUtil.dip2px(this.f17949c, i) / 2;
        }
        marginLayoutParams.topMargin = iDip2px4 - (iDip2px2 / 2);
        marginLayoutParams.leftMargin = iDip2px3 - (iDip2px / 2);
        this.f17948a.setLayoutParams(marginLayoutParams);
        C3255f.m14981a("OctopusAd", "topMargin = " + marginLayoutParams.topMargin + ",leftMargin = " + marginLayoutParams.leftMargin + ",widthInt = " + iDip2px + ",heightInt = " + iDip2px2);
        this.f17948a.startShake();
        m15092b();
        return this.f17948a;
    }

    /* JADX INFO: renamed from: a */
    public void m15088a() {
        StringBuilder sb = new StringBuilder();
        sb.append("enter callBackShakeHappened and mShakeStateListener != null ? ");
        sb.append(this.f17963q != null);
        sb.append(",!isCallBack = ");
        sb.append(!this.f17964r);
        C3255f.m14981a("OctopusAd", sb.toString());
        if (this.f17963q == null || this.f17964r) {
            return;
        }
        C3255f.m14981a("OctopusAd", "callback onShakeHappened()");
        this.f17963q.mo14767a();
        this.f17964r = true;
        ShakeView shakeView = this.f17948a;
        if (shakeView != null) {
            shakeView.stopShake();
            m15095c();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15089a(double d) {
        m15090a(1);
        m15093b(d);
        m15096c(d);
        m15099d(0.0d);
        m15100d(0);
        m15094b(1000);
        m15097c(0);
        m15101f(0);
    }

    /* JADX INFO: renamed from: a */
    public void m15090a(int i) {
        this.f17953g = i;
    }

    /* JADX INFO: renamed from: a */
    public void m15091a(a aVar) {
        this.f17963q = aVar;
    }

    /* JADX INFO: renamed from: b */
    public void m15092b() {
        SensorManager sensorManager = f17947b;
        if (sensorManager != null) {
            sensorManager.registerListener(this.f17966t, sensorManager.getDefaultSensor(1), 100000);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15093b(double d) {
        this.f17950d = d;
    }

    /* JADX INFO: renamed from: b */
    public void m15094b(int i) {
        this.f17955i = i;
    }

    /* JADX INFO: renamed from: c */
    public void m15095c() {
        C3255f.m14981a("OctopusAd", "enter unRegisterShakeListenerAndSetDefault");
        SensorManager sensorManager = f17947b;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f17966t);
        }
        m15098d();
        ShakeView shakeView = this.f17948a;
        if (shakeView != null) {
            shakeView.stopShake();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m15096c(double d) {
        this.f17951e = d;
    }

    /* JADX INFO: renamed from: c */
    public void m15097c(int i) {
        this.f17956j = i;
        m15078e();
    }

    /* JADX INFO: renamed from: d */
    public void m15098d() {
        this.f17964r = false;
        this.f17957k = 0;
        this.f17958l = 0;
        this.f17959m = -100.0f;
        this.f17960n = -100.0f;
        this.f17961o = -100.0f;
        this.f17962p = 0;
        this.f17963q = null;
        this.f17949c = null;
        this.f17948a = null;
        this.f17965s = 200;
    }

    /* JADX INFO: renamed from: d */
    public void m15099d(double d) {
        this.f17952f = d;
    }

    /* JADX INFO: renamed from: d */
    public void m15100d(int i) {
        this.f17954h = i;
    }

    /* JADX INFO: renamed from: f */
    public void m15101f(int i) {
        this.f17965s = i;
    }
}
