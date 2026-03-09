package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import com.umeng.commonsdk.framework.C3404b;
import com.umeng.commonsdk.statistics.common.C3489e;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import p285z2.InterfaceC4236p7;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.r */
/* JADX INFO: loaded from: classes2.dex */
public class C3467r {

    /* JADX INFO: renamed from: a */
    private static final String f18884a = "info";

    /* JADX INFO: renamed from: b */
    private static final String f18885b = "stat";

    /* JADX INFO: renamed from: c */
    private static boolean f18886c = false;

    /* JADX INFO: renamed from: d */
    private static HandlerThread f18887d = null;

    /* JADX INFO: renamed from: e */
    private static Context f18888e = null;

    /* JADX INFO: renamed from: f */
    private static int f18889f = 0;

    /* JADX INFO: renamed from: g */
    private static int f18890g = 0;

    /* JADX INFO: renamed from: h */
    private static int f18891h = 0;

    /* JADX INFO: renamed from: i */
    private static int f18892i = 1;

    /* JADX INFO: renamed from: j */
    private static long f18893j = 0;

    /* JADX INFO: renamed from: k */
    private static long f18894k = 0;

    /* JADX INFO: renamed from: l */
    private static final int f18895l = 40;

    /* JADX INFO: renamed from: m */
    private static final int f18896m = 50000;

    /* JADX INFO: renamed from: n */
    private static SensorManager f18897n;

    /* JADX INFO: renamed from: o */
    private static ArrayList<float[]> f18898o = new ArrayList<>();

    /* JADX INFO: renamed from: p */
    private static SensorEventListener f18899p = new SensorEventListener() { // from class: com.umeng.commonsdk.proguard.r.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (C3467r.f18890g < 15) {
                C3467r.m16005c();
                return;
            }
            if (C3467r.f18889f < 20) {
                C3467r.m16009e();
                C3467r.f18898o.add(sensorEvent.values);
            }
            if (C3467r.f18889f == 20) {
                C3467r.m16009e();
                if (C3467r.f18892i == 1) {
                    long unused = C3467r.f18893j = System.currentTimeMillis();
                }
                if (C3467r.f18892i == 2) {
                    long unused2 = C3467r.f18894k = System.currentTimeMillis();
                }
                C3467r.m16014h();
                C3467r.m16018l();
            }
        }
    };

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.r$1 */
    public static class AnonymousClass1 implements SensorEventListener {
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (C3467r.f18890g < 15) {
                C3467r.m16005c();
                return;
            }
            if (C3467r.f18889f < 20) {
                C3467r.m16009e();
                C3467r.f18898o.add(sensorEvent.values);
            }
            if (C3467r.f18889f == 20) {
                C3467r.m16009e();
                if (C3467r.f18892i == 1) {
                    long unused = C3467r.f18893j = System.currentTimeMillis();
                }
                if (C3467r.f18892i == 2) {
                    long unused2 = C3467r.f18894k = System.currentTimeMillis();
                }
                C3467r.m16014h();
                C3467r.m16018l();
            }
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.r$2 */
    public static class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Sensor f18900a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Sensor f18901b;

        public AnonymousClass2(Sensor sensor, Sensor sensor2) {
            sensor = sensor;
            sensor = sensor2;
        }

        @Override // java.lang.Runnable
        public void run() {
            SensorManager sensorManager;
            SensorEventListener sensorEventListener;
            Sensor sensor;
            int unused = C3467r.f18889f = 0;
            if (sensor != null) {
                sensorManager = C3467r.f18897n;
                sensorEventListener = C3467r.f18899p;
                sensor = sensor;
            } else {
                if (sensor == null) {
                    return;
                }
                sensorManager = C3467r.f18897n;
                sensorEventListener = C3467r.f18899p;
                sensor = sensor;
            }
            sensorManager.registerListener(sensorEventListener, sensor, 50000);
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.r$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f18902a;

        /* JADX INFO: renamed from: b */
        public int f18903b;

        /* JADX INFO: renamed from: c */
        public long f18904c;
    }

    /* JADX INFO: renamed from: a */
    public static List<Sensor> m16000a(Context context) {
        if (context == null) {
            return null;
        }
        return ((SensorManager) context.getSystemService(C3471v.f18942W)).getSensorList(-1);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m16001a() {
        return f18886c;
    }

    /* JADX INFO: renamed from: b */
    public static void m16004b(Context context) {
        if (context == null || m16001a()) {
            return;
        }
        f18886c = true;
        f18888e = context.getApplicationContext();
        String strM15647a = C3404b.m15647a(context);
        String packageName = context.getPackageName();
        if (strM15647a == null || !strM15647a.equals(packageName)) {
            return;
        }
        SensorManager sensorManager = (SensorManager) context.getSystemService(C3471v.f18942W);
        f18897n = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(4);
        Sensor defaultSensor2 = f18897n.getDefaultSensor(1);
        if (defaultSensor != null) {
            f18891h = 4;
            f18897n.registerListener(f18899p, defaultSensor, 50000);
        } else if (defaultSensor2 != null) {
            f18891h = 1;
            f18897n.registerListener(f18899p, defaultSensor2, 50000);
        }
        int iNextInt = (new Random().nextInt(3) * 1000) + InterfaceC4236p7.OooO0OO;
        HandlerThread handlerThread = new HandlerThread("sensor_thread");
        f18887d = handlerThread;
        handlerThread.start();
        new Handler(f18887d.getLooper()).postDelayed(new Runnable() { // from class: com.umeng.commonsdk.proguard.r.2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Sensor f18900a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Sensor f18901b;

            public AnonymousClass2(Sensor defaultSensor3, Sensor defaultSensor22) {
                sensor = defaultSensor3;
                sensor = defaultSensor22;
            }

            @Override // java.lang.Runnable
            public void run() {
                SensorManager sensorManager2;
                SensorEventListener sensorEventListener;
                Sensor sensor;
                int unused = C3467r.f18889f = 0;
                if (sensor != null) {
                    sensorManager2 = C3467r.f18897n;
                    sensorEventListener = C3467r.f18899p;
                    sensor = sensor;
                } else {
                    if (sensor == null) {
                        return;
                    }
                    sensorManager2 = C3467r.f18897n;
                    sensorEventListener = C3467r.f18899p;
                    sensor = sensor;
                }
                sensorManager2.registerListener(sensorEventListener, sensor, 50000);
            }
        }, iNextInt);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m16005c() {
        int i = f18890g;
        f18890g = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static JSONArray m16006c(Context context) {
        String string;
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f18884a, 0);
        if (sharedPreferences == null || (string = sharedPreferences.getString(f18885b, null)) == null) {
            return null;
        }
        try {
            return new JSONArray(string);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m16008d(Context context) {
        if (context == null) {
            return;
        }
        context.getApplicationContext().getSharedPreferences(f18884a, 0).edit().remove(f18885b).commit();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m16009e() {
        int i = f18889f;
        f18889f = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: e */
    public static List<a> m16010e(Context context) {
        if (context == null || !DeviceConfig.checkPermission(context, "android.permission.CAMERA")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
                for (String str : cameraManager.getCameraIdList()) {
                    Size size = (Size) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
                    if (size != null) {
                        a aVar = new a();
                        aVar.f18902a = size.getWidth();
                        aVar.f18903b = size.getHeight();
                        aVar.f18904c = System.currentTimeMillis();
                        arrayList.add(aVar);
                    }
                }
            }
        } catch (Exception unused) {
            C3489e.m16338c("camera access exception");
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0073 A[Catch: Exception -> 0x0095, TRY_ENTER, TryCatch #0 {Exception -> 0x0095, blocks: (B:40:0x0003, B:43:0x000d, B:48:0x0024, B:49:0x005f, B:52:0x0066, B:58:0x0073, B:59:0x0075, B:61:0x007c, B:60:0x0079), top: B:66:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0079 A[Catch: Exception -> 0x0095, TryCatch #0 {Exception -> 0x0095, blocks: (B:40:0x0003, B:43:0x000d, B:48:0x0024, B:49:0x005f, B:52:0x0066, B:58:0x0073, B:59:0x0075, B:61:0x007c, B:60:0x0079), top: B:66:0x0003 }] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m16012f(android.content.Context r13) {
        /*
            if (r13 != 0) goto L3
            return
        L3:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L95
            r0.<init>()     // Catch: java.lang.Exception -> L95
            r1 = 0
            r2 = 0
        La:
            r3 = 2
            if (r2 >= r3) goto L99
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L95
            r4.<init>()     // Catch: java.lang.Exception -> L95
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Exception -> L95
            r5.<init>()     // Catch: java.lang.Exception -> L95
            r6 = 20
            r7 = 1
            if (r2 != r7) goto L1f
            r8 = 40
            goto L22
        L1f:
            r6 = 0
            r8 = 20
        L22:
            if (r6 >= r8) goto L5f
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> L95
            r9.<init>()     // Catch: java.lang.Exception -> L95
            java.lang.String r10 = "x"
            java.util.ArrayList<float[]> r11 = com.umeng.commonsdk.proguard.C3467r.f18898o     // Catch: java.lang.Exception -> L95
            java.lang.Object r11 = r11.get(r6)     // Catch: java.lang.Exception -> L95
            float[] r11 = (float[]) r11     // Catch: java.lang.Exception -> L95
            r11 = r11[r1]     // Catch: java.lang.Exception -> L95
            double r11 = (double) r11     // Catch: java.lang.Exception -> L95
            r9.put(r10, r11)     // Catch: java.lang.Exception -> L95
            java.lang.String r10 = "y"
            java.util.ArrayList<float[]> r11 = com.umeng.commonsdk.proguard.C3467r.f18898o     // Catch: java.lang.Exception -> L95
            java.lang.Object r11 = r11.get(r6)     // Catch: java.lang.Exception -> L95
            float[] r11 = (float[]) r11     // Catch: java.lang.Exception -> L95
            r11 = r11[r7]     // Catch: java.lang.Exception -> L95
            double r11 = (double) r11     // Catch: java.lang.Exception -> L95
            r9.put(r10, r11)     // Catch: java.lang.Exception -> L95
            java.lang.String r10 = "z"
            java.util.ArrayList<float[]> r11 = com.umeng.commonsdk.proguard.C3467r.f18898o     // Catch: java.lang.Exception -> L95
            java.lang.Object r11 = r11.get(r6)     // Catch: java.lang.Exception -> L95
            float[] r11 = (float[]) r11     // Catch: java.lang.Exception -> L95
            r11 = r11[r3]     // Catch: java.lang.Exception -> L95
            double r11 = (double) r11     // Catch: java.lang.Exception -> L95
            r9.put(r10, r11)     // Catch: java.lang.Exception -> L95
            r5.put(r9)     // Catch: java.lang.Exception -> L95
            int r6 = r6 + 1
            goto L22
        L5f:
            int r3 = com.umeng.commonsdk.proguard.C3467r.f18891h     // Catch: java.lang.Exception -> L95
            r6 = 4
            if (r3 != r6) goto L6a
            java.lang.String r3 = "g"
        L66:
            r4.put(r3, r5)     // Catch: java.lang.Exception -> L95
            goto L6f
        L6a:
            if (r3 != r7) goto L6f
            java.lang.String r3 = "a"
            goto L66
        L6f:
            java.lang.String r3 = "ts"
            if (r2 != 0) goto L79
            long r5 = com.umeng.commonsdk.proguard.C3467r.f18893j     // Catch: java.lang.Exception -> L95
        L75:
            r4.put(r3, r5)     // Catch: java.lang.Exception -> L95
            goto L7c
        L79:
            long r5 = com.umeng.commonsdk.proguard.C3467r.f18894k     // Catch: java.lang.Exception -> L95
            goto L75
        L7c:
            r0.put(r4)     // Catch: java.lang.Exception -> L95
            r3 = 32776(0x8008, float:4.5929E-41)
            com.umeng.commonsdk.proguard.b r4 = com.umeng.commonsdk.proguard.C3435b.m15851a(r13)     // Catch: java.lang.Exception -> L95
            com.umeng.commonsdk.proguard.c r4 = r4.m15852a()     // Catch: java.lang.Exception -> L95
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> L95
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r13, r3, r4, r5)     // Catch: java.lang.Exception -> L95
            int r2 = r2 + 1
            goto La
        L95:
            r0 = move-exception
            com.umeng.commonsdk.proguard.C3454e.m15904a(r13, r0)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.proguard.C3467r.m16012f(android.content.Context):void");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m16014h() {
        int i = f18892i;
        f18892i = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: l */
    public static void m16018l() {
        SensorManager sensorManager = f18897n;
        if (sensorManager != null) {
            sensorManager.unregisterListener(f18899p);
        }
        if (f18898o.size() == 40) {
            m16012f(f18888e);
            ArrayList<float[]> arrayList = f18898o;
            if (arrayList != null) {
                arrayList.clear();
            }
            HandlerThread handlerThread = f18887d;
            if (handlerThread != null) {
                handlerThread.quit();
                f18887d = null;
            }
            f18888e = null;
            f18886c = false;
        }
    }
}
