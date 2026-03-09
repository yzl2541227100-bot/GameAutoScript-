package com.anythink.core.common.p051b;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.anythink.core.api.ATCommonConfig;
import com.anythink.core.api.ATCustomAdapterConfig;
import com.anythink.core.api.ATDebuggerConfig;
import com.anythink.core.api.ATInitConfig;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.ATNetworkConfig;
import com.anythink.core.api.ATPrivacyConfig;
import com.anythink.core.api.ATSharedPlacementConfig;
import com.anythink.core.api.DeviceInfoCallback;
import com.anythink.core.api.IATAdFilter;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.C1193d;
import com.anythink.core.common.C1201f;
import com.anythink.core.common.C1325o;
import com.anythink.core.common.C1372q;
import com.anythink.core.common.C1385s;
import com.anythink.core.common.C1386t;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.C1389w;
import com.anythink.core.common.C1390x;
import com.anythink.core.common.p050a.C1160l;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p054e.C1200c;
import com.anythink.core.common.p055f.C1232ay;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p057g.InterfaceC1265c;
import com.anythink.core.common.p060i.C1293e;
import com.anythink.core.common.p062k.C1304d;
import com.anythink.core.common.p065n.C1321d;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.common.p066o.C1343g;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.res.C1380d;
import com.anythink.core.p037a.C1086a;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import com.anythink.core.p072d.C1398h;
import com.anythink.expressad.exoplayer.C1575f;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.b.n */
/* JADX INFO: loaded from: classes.dex */
public class C1175n {

    /* JADX INFO: renamed from: a */
    public static final int f3331a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f3332b = 1;

    /* JADX INFO: renamed from: j */
    private static volatile C1175n f3333j;

    /* JADX INFO: renamed from: A */
    private IExHandler f3334A;

    /* JADX INFO: renamed from: G */
    private String f3340G;

    /* JADX INFO: renamed from: H */
    private String f3341H;

    /* JADX INFO: renamed from: J */
    private boolean f3343J;

    /* JADX INFO: renamed from: L */
    private InterfaceC1265c f3345L;

    /* JADX INFO: renamed from: M */
    private Location f3346M;

    /* JADX INFO: renamed from: O */
    private JSONArray f3348O;

    /* JADX INFO: renamed from: P */
    private List<String> f3349P;

    /* JADX INFO: renamed from: R */
    private String f3351R;

    /* JADX INFO: renamed from: S */
    private ATDebuggerConfig f3352S;

    /* JADX INFO: renamed from: T */
    private boolean f3353T;

    /* JADX INFO: renamed from: X */
    private ConcurrentHashMap<String, IATAdFilter> f3357X;

    /* JADX INFO: renamed from: Z */
    private ATPrivacyConfig f3359Z;

    /* JADX INFO: renamed from: aa */
    private C1232ay f3360aa;

    /* JADX INFO: renamed from: ad */
    private String f3363ad;

    /* JADX INFO: renamed from: e */
    public WeakReference<Activity> f3366e;

    /* JADX INFO: renamed from: f */
    private int f3367f;

    /* JADX INFO: renamed from: k */
    private Context f3371k;

    /* JADX INFO: renamed from: l */
    private String f3372l;

    /* JADX INFO: renamed from: m */
    private String f3373m;

    /* JADX INFO: renamed from: o */
    private String f3375o;

    /* JADX INFO: renamed from: r */
    private ConcurrentHashMap<String, ATCustomAdapterConfig> f3378r;

    /* JADX INFO: renamed from: t */
    private String f3380t;

    /* JADX INFO: renamed from: w */
    private BroadcastReceiver f3383w;

    /* JADX INFO: renamed from: x */
    private String f3384x;

    /* JADX INFO: renamed from: y */
    private String f3385y;

    /* JADX INFO: renamed from: z */
    private String f3386z;

    /* JADX INFO: renamed from: g */
    private final String f3368g = "SDK.init";

    /* JADX INFO: renamed from: h */
    private final String f3369h = "com.anythink.pd.ExHandler";

    /* JADX INFO: renamed from: i */
    private boolean f3370i = false;

    /* JADX INFO: renamed from: v */
    private final Object f3382v = new Object();

    /* JADX INFO: renamed from: C */
    private boolean f3336C = false;

    /* JADX INFO: renamed from: D */
    private boolean f3337D = false;

    /* JADX INFO: renamed from: E */
    private long f3338E = 0;

    /* JADX INFO: renamed from: F */
    private long f3339F = 0;

    /* JADX INFO: renamed from: K */
    private boolean f3344K = false;

    /* JADX INFO: renamed from: N */
    private String f3347N = "";

    /* JADX INFO: renamed from: U */
    private int f3354U = 1;

    /* JADX INFO: renamed from: V */
    private boolean f3355V = false;

    /* JADX INFO: renamed from: W */
    private boolean f3356W = false;

    /* JADX INFO: renamed from: Y */
    private String f3358Y = "";

    /* JADX INFO: renamed from: ac */
    private final Object f3362ac = new Object();

    /* JADX INFO: renamed from: c */
    public volatile boolean f3364c = false;

    /* JADX INFO: renamed from: d */
    public long f3365d = 0;

    /* JADX INFO: renamed from: n */
    private Handler f3374n = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: q */
    private ConcurrentHashMap<String, Map<String, Object>> f3377q = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: p */
    private ConcurrentHashMap<String, Object> f3376p = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: B */
    private final String f3335B = File.separator + "anythink.test";

    /* JADX INFO: renamed from: I */
    private boolean f3342I = true;

    /* JADX INFO: renamed from: Q */
    private ConcurrentHashMap<String, List<String>> f3350Q = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: u */
    private JSONObject f3381u = new JSONObject();

    /* JADX INFO: renamed from: ab */
    private long f3361ab = System.currentTimeMillis();

    /* JADX INFO: renamed from: s */
    private final Map<String, Boolean> f3379s = new ConcurrentHashMap(2);

    /* JADX INFO: renamed from: com.anythink.core.common.b.n$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f3387a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f3388b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f3389c;

        public AnonymousClass1(Context context, String str, Context context2) {
            context = context;
            str = str;
            context = context2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                C1321d.m3855a().m3868a(context);
                C1175n.this.m2108a(context, str, 0);
                C1175n.m2064a(C1175n.this, context);
                C1170i.m2035a(context).m2043a();
                C1175n.m2063a(C1175n.this);
                C1175n.m2070b(C1175n.this, context);
                C1160l.m1996a().m2006b();
                C1380d.m4520a(C1175n.this.m2148f()).m4530b();
                C1380d.m4520a(C1175n.this.m2148f());
                C1380d.m4521c();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.n$10 */
    public class AnonymousClass10 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f3391a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f3392b;

        public AnonymousClass10(Context context, Context context2) {
            context = context;
            context = context2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1175n.this.m2132b();
            if (C1175n.this.f3334A != null) {
                C1175n.this.f3334A.initDeviceInfo(context);
            }
            C1398h.m5135a(context).m5141a();
            C1390x.m4629a(context);
            C1193d.m2290a().m2292a(context);
            String strM4094s = C1341e.m4094s(C1175n.this.f3371k);
            if (TextUtils.isEmpty(strM4094s)) {
                return;
            }
            C1175n.this.m2153h(strM4094s);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.n$11 */
    public class AnonymousClass11 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATNetworkConfig f3394a;

        public AnonymousClass11(ATNetworkConfig aTNetworkConfig) {
            aTNetworkConfig = aTNetworkConfig;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1175n c1175n = C1175n.this;
            C1175n.m2065a(c1175n, c1175n.f3371k, aTNetworkConfig);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.n$12 */
    public class AnonymousClass12 implements Runnable {
        public AnonymousClass12() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toast.makeText(C1175n.this.f3371k, "There is a problem with the integrated resources of AnyThink SDK, please check whether you have followed the steps of the integration document.", 1).show();
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.n$13 */
    public class AnonymousClass13 extends BroadcastReceiver {

        /* JADX INFO: renamed from: com.anythink.core.common.b.n$13$1 */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1386t.m4552a().m4555b();
                C1385s.m4541a().m4551b();
            }
        }

        public AnonymousClass13() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (C1345i.m4159a(context)) {
                C1175n.m2066a(new Runnable() { // from class: com.anythink.core.common.b.n.13.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1386t.m4552a().m4555b();
                        C1385s.m4541a().m4551b();
                    }
                });
                C1321d.m3855a().m3870b();
                C1175n c1175n = C1175n.this;
                c1175n.m2114a(context, c1175n.m2165o(), C1175n.this.m2167p());
            }
            if (TextUtils.equals(intent.getAction(), C1169h.f3042G)) {
                C1322e.m3901a(intent.getStringExtra(C1169h.f3043H));
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.n$14 */
    public class AnonymousClass14 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f3399a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f3400b;

        public AnonymousClass14(Context context, String str) {
            this.f3399a = context;
            this.f3400b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1391a c1391aM4865b = C1392b.m4845a(this.f3399a.getApplicationContext()).m4865b(this.f3400b);
            if (c1391aM4865b != null) {
                if (!c1391aM4865b.m4712I()) {
                    C1372q.m4390a(C1175n.this.f3371k).m4394a(c1391aM4865b);
                    C1389w.m4583a().m4622a(c1391aM4865b.m4753b());
                }
                if (!C1392b.m4845a(this.f3399a.getApplicationContext()).m4864a(this.f3400b)) {
                    C1392b.m4845a(this.f3399a.getApplicationContext());
                }
                C1293e.m3713a().m3718a(c1391aM4865b);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.n$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f3402a;

        public AnonymousClass2(Context context) {
            context = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            Object objInvoke;
            String strConcat;
            AnonymousClass2 anonymousClass2 = this;
            try {
                ArrayList arrayList = new ArrayList();
                Enumeration<String> enumerationEntries = new DexFile(context.getPackageCodePath()).entries();
                while (enumerationEntries.hasMoreElements()) {
                    String strNextElement = enumerationEntries.nextElement();
                    if (strNextElement.contains("com.anythink.network") && strNextElement.contains("InitManager") && !strNextElement.contains("$")) {
                        arrayList.add(strNextElement);
                    }
                }
                Log.i("anythink", "********************************** Network Integration Status *************************************");
                if (arrayList.size() != 0) {
                    Log.i("anythink", "----------------------------------------");
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        Class<?> cls = Class.forName((String) it.next());
                        z = false;
                        objInvoke = null;
                        try {
                            objInvoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                        } catch (Throwable unused) {
                            Log.e("anythink", "Cannot instantiate " + cls.getName() + ", please check if a third-party SDK is imported");
                            Log.i("anythink", "----------------------------------------");
                        }
                    } catch (Throwable unused2) {
                    }
                    if (objInvoke != null && (objInvoke instanceof ATInitMediation)) {
                        ATInitMediation aTInitMediation = (ATInitMediation) objInvoke;
                        String networkName = aTInitMediation.getNetworkName();
                        if (!TextUtils.isEmpty(networkName)) {
                            String networkVersion = aTInitMediation.getNetworkVersion();
                            if (TextUtils.isEmpty(networkVersion)) {
                                strConcat = "NetworkName: ".concat(String.valueOf(networkName));
                            } else {
                                strConcat = "NetworkName: " + networkName + "  (v" + networkVersion + ")";
                            }
                            Log.i("anythink", strConcat);
                            boolean zM2086i = C1175n.m2086i(aTInitMediation.getNetworkSDKClass());
                            boolean zM2073b = C1175n.m2073b(aTInitMediation.getPluginClassStatus());
                            boolean zM2067a = C1175n.m2067a(context, (List<String>) aTInitMediation.getActivityStatus());
                            boolean zM2072b = C1175n.m2072b(context, (List<String>) aTInitMediation.getServiceStatus());
                            boolean zM2077c = C1175n.m2077c(context, aTInitMediation.getProviderStatus());
                            boolean zM2080d = C1175n.m2080d(context, aTInitMediation.getMetaValutStatus());
                            boolean zM2083e = C1175n.m2083e(context, aTInitMediation.getPermissionStatus());
                            boolean zM2130a = C1175n.this.m2130a(context, aTInitMediation.getResourceStatus(), false);
                            boolean zM2088s = aTInitMediation.needCheckAdapterVersion() ? C1175n.m2088s(aTInitMediation.getAdapterVersion()) : true;
                            if (zM2086i && zM2073b && zM2067a && zM2072b && zM2077c && zM2080d && zM2083e && zM2130a && zM2088s) {
                                z = true;
                            }
                            if (z) {
                                Log.i("anythink", "Status: Success");
                            } else {
                                Log.e("anythink", "Status: Fail");
                            }
                            Log.i("anythink", "----------------------------------------");
                        }
                    }
                    anonymousClass2 = this;
                }
                Log.i("anythink", "********************************** Network Integration Status *************************************");
            } catch (Exception unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.n$3 */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f3404a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f3405b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f3406c;

        public AnonymousClass3(Context context, String str, String str2) {
            context = context;
            str = str;
            str = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1392b.m4845a(context).m4864a(str)) {
                C1392b.m4845a(context).m4863a(str, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.n$4 */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f3408a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DeviceInfoCallback f3409b;

        public AnonymousClass4(Context context, DeviceInfoCallback deviceInfoCallback) {
            context = context;
            deviceInfoCallback = deviceInfoCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1391a c1391aM4865b = C1392b.m4845a(context).m4865b(C1175n.m2059a().m2165o());
            String strM4711H = c1391aM4865b != null ? c1391aM4865b.m4711H() : "";
            boolean z = true;
            if (!TextUtils.isEmpty(strM4711H)) {
                try {
                    JSONObject jSONObject = new JSONObject(strM4711H);
                    if (!jSONObject.isNull("a")) {
                        if (jSONObject.optInt("a") != 1) {
                            z = false;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
                if (iExHandlerM2132b != null) {
                    iExHandlerM2132b.fillTestDeviceData(jSONObject2, c1391aM4865b);
                }
                jSONObject2.put("GAID", C1341e.m4094s(context));
                jSONObject2.put("AndroidID", z ? C1341e.m4060d(context) : "");
                jSONObject2.put("How to config TestMode", "Please visit the document center and learn more through: Integration(Basic) -> How To Test");
                C1352p.m4211a("testModeDeviceInfo", jSONObject2.toString());
                DeviceInfoCallback deviceInfoCallback = deviceInfoCallback;
                if (deviceInfoCallback != null) {
                    deviceInfoCallback.deviceInfo(jSONObject2.toString());
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.n$5 */
    public class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f3411a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1201f f3412b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f3413c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C1234b f3414d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Map f3415e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f3416f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f3417g;

        public AnonymousClass5(String str, C1201f c1201f, String str2, C1234b c1234b, Map map, boolean z, String str3) {
            str = str;
            c1201f = c1201f;
            str = str2;
            c1234b = c1234b;
            map = map;
            z = z;
            str = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x004b A[PHI: r1
  0x004b: PHI (r1v5 com.anythink.core.common.f.h) = (r1v3 com.anythink.core.common.f.h), (r1v7 com.anythink.core.common.f.h) binds: [B:56:0x008e, B:40:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r11 = this;
                com.anythink.core.common.b.n r0 = com.anythink.core.common.p051b.C1175n.this
                android.content.Context r0 = com.anythink.core.common.p051b.C1175n.m2068b(r0)
                com.anythink.core.d.h r0 = com.anythink.core.p072d.C1398h.m5135a(r0)
                java.lang.String r1 = r2
                com.anythink.core.d.f r0 = r0.m5139a(r1)
                com.anythink.core.common.f r1 = r3
                java.lang.String r1 = r1.m2404g()
                java.lang.String r2 = r4
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                java.lang.String r3 = ""
                if (r2 != 0) goto L2c
                java.lang.String r2 = r4
                boolean r2 = com.anythink.core.common.p066o.C1344h.m4150c(r2)
                if (r2 == 0) goto L2c
                java.lang.String r2 = r4
                r9 = r2
                goto L2d
            L2c:
                r9 = r3
            L2d:
                com.anythink.core.common.f.b r2 = r5
                r10 = 16
                if (r2 == 0) goto L5e
                com.anythink.core.common.f.h r1 = r2.m2908h()
                com.anythink.core.common.f.h r1 = r1.m3045V()
                r2 = 1
                r1.m3089g(r2)
                r1.f4134B = r9
                com.anythink.core.common.w r2 = com.anythink.core.common.C1389w.m4583a()
                boolean r2 = r2.m4625a(r0)
                if (r2 == 0) goto L50
            L4b:
                java.lang.String r2 = r2
                com.anythink.core.common.p066o.C1358v.m4257a(r2, r0, r1)
            L50:
                com.anythink.core.common.b.n r0 = com.anythink.core.common.p051b.C1175n.this
                android.content.Context r0 = com.anythink.core.common.p051b.C1175n.m2068b(r0)
                com.anythink.core.common.n.c r0 = com.anythink.core.common.p065n.C1320c.m3839a(r0)
                r0.m3851a(r10, r1)
                return
            L5e:
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 == 0) goto L66
                r2 = r3
                goto L67
            L66:
                r2 = r1
            L67:
                java.lang.String r3 = r2
                r5 = 0
                r6 = 0
                java.util.Map r7 = r6
                r8 = 0
                r4 = r0
                com.anythink.core.common.f.h r1 = com.anythink.core.common.p066o.C1358v.m4251a(r2, r3, r4, r5, r6, r7, r8)
                boolean r2 = r7
                if (r2 == 0) goto L79
                r2 = 3
                goto L7a
            L79:
                r2 = 2
            L7a:
                r1.m3089g(r2)
                if (r0 != 0) goto L84
                java.lang.String r2 = r8
                r1.m2687y(r2)
            L84:
                r1.f4134B = r9
                com.anythink.core.common.w r2 = com.anythink.core.common.C1389w.m4583a()
                boolean r2 = r2.m4625a(r0)
                if (r2 == 0) goto L50
                goto L4b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p051b.C1175n.AnonymousClass5.run():void");
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.n$6 */
    public class AnonymousClass6 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATInitConfig f3419a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f3420b;

        public AnonymousClass6(ATInitConfig aTInitConfig, Context context) {
            this.f3419a = aTInitConfig;
            this.f3420b = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x009c A[Catch: all -> 0x00db, TryCatch #1 {all -> 0x00db, blocks: (B:48:0x0000, B:50:0x0008, B:52:0x0020, B:67:0x0057, B:71:0x0074, B:75:0x008b, B:77:0x009c, B:78:0x00d0, B:66:0x0054, B:53:0x0025), top: B:85:0x0000 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p051b.C1175n.AnonymousClass6.run():void");
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.n$7 */
    public class AnonymousClass7 implements Runnable {
        public AnonymousClass7() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1175n.this.m2173t();
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.n$8 */
    public class AnonymousClass8 implements Runnable {
        public AnonymousClass8() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1325o.m3942a().m3949a(C1175n.this.f3371k);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.n$9 */
    public class AnonymousClass9 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f3424a;

        public AnonymousClass9(Context context) {
            context = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1341e.m4090q(context);
        }
    }

    private C1175n() {
    }

    /* JADX INFO: renamed from: N */
    private void m2054N() {
        try {
            BroadcastReceiver broadcastReceiver = this.f3383w;
            if (broadcastReceiver != null) {
                this.f3371k.unregisterReceiver(broadcastReceiver);
                C1172k.m2050a(this.f3371k).m2051a(this.f3383w);
            }
            this.f3383w = null;
        } catch (Throwable unused) {
        }
        try {
            this.f3383w = new AnonymousClass13();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction(C1169h.f3042G);
            this.f3371k.registerReceiver(this.f3383w, intentFilter);
            C1172k.m2050a(this.f3371k).m2052a(this.f3383w, intentFilter);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: O */
    private void m2055O() {
        Throwable th;
        boolean zExists;
        boolean z = false;
        if (this.f3371k != null) {
            try {
                zExists = new File(this.f3371k.getExternalFilesDir(null), this.f3335B).exists();
                if (!zExists) {
                    try {
                        zExists = new File(this.f3371k.getFilesDir(), this.f3335B).exists();
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                zExists = false;
            }
            z = zExists;
        }
        this.f3336C = z;
    }

    /* JADX INFO: renamed from: P */
    private boolean m2056P() {
        return this.f3342I;
    }

    /* JADX INFO: renamed from: Q */
    private long m2057Q() {
        return this.f3361ab;
    }

    /* JADX INFO: renamed from: a */
    private static long m2058a(long j) {
        Date date = new Date(j);
        return new Date(date.getYear(), date.getMonth(), date.getDate()).getTime();
    }

    /* JADX INFO: renamed from: a */
    public static C1175n m2059a() {
        if (f3333j == null) {
            synchronized (C1175n.class) {
                if (f3333j == null) {
                    f3333j = new C1175n();
                }
            }
        }
        return f3333j;
    }

    /* JADX INFO: renamed from: a */
    private void m2060a(Context context, ATNetworkConfig aTNetworkConfig) {
        if (aTNetworkConfig == null) {
            aTNetworkConfig = new ATNetworkConfig();
        }
        List<ATInitConfig> aTInitConfigList = aTNetworkConfig.getATInitConfigList();
        if (aTInitConfigList == null) {
            aTInitConfigList = new ArrayList<>(2);
        }
        try {
            if (m2175v()) {
                aTInitConfigList.clear();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            aTInitConfigList = new ArrayList<>(2);
        }
        boolean z = false;
        this.f3344K = aTInitConfigList.size() > 0;
        ATInitConfig aTInitConfig = null;
        if (Build.VERSION.SDK_INT != 29) {
            try {
                Constructor declaredConstructor = Class.forName("com.anythink.network.facebook.FacebookATInitConfig").asSubclass(ATInitConfig.class).getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                ATInitConfig aTInitConfig2 = (ATInitConfig) declaredConstructor.newInstance(new Object[0]);
                try {
                    aTInitConfigList.add(0, aTInitConfig2);
                } catch (Throwable unused) {
                }
                aTInitConfig = aTInitConfig2;
            } catch (Throwable unused2) {
            }
        }
        for (ATInitConfig aTInitConfig3 : aTInitConfigList) {
            if (aTInitConfig3 != null) {
                if (aTInitConfig != null && TextUtils.equals(aTInitConfig.getClass().getSimpleName(), aTInitConfig3.getClass().getSimpleName())) {
                    if (!z) {
                        z = true;
                    }
                }
                m2066a(new AnonymousClass6(aTInitConfig3, context));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2061a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            Log.e("SDK.init", "setPrePlacementStrategy failed: path is null or empty.");
        } else {
            C1398h.m5135a(context.getApplicationContext()).m5153h(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2062a(ATSharedPlacementConfig aTSharedPlacementConfig) {
        C1389w.m4583a().m4621a(aTSharedPlacementConfig);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2063a(C1175n c1175n) {
        Throwable th;
        boolean zExists;
        boolean z = false;
        if (c1175n.f3371k != null) {
            try {
                zExists = new File(c1175n.f3371k.getExternalFilesDir(null), c1175n.f3335B).exists();
                if (!zExists) {
                    try {
                        zExists = new File(c1175n.f3371k.getFilesDir(), c1175n.f3335B).exists();
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                zExists = false;
            }
            z = zExists;
        }
        c1175n.f3336C = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2064a(C1175n c1175n, Context context) {
        long jCurrentTimeMillis = c1175n.f3365d;
        try {
            String strM4239b = C1355s.m4239b(m2059a().f3371k, C1169h.f3065p, m2059a().m2165o() + "playRecord", "");
            if (!TextUtils.isEmpty(strM4239b)) {
                JSONObject jSONObject = new JSONObject(strM4239b);
                long jOptLong = jSONObject.optLong("start_time");
                long jOptLong2 = jSONObject.optLong("end_time");
                String strOptString = jSONObject.optString(C1166e.f3017c);
                int iOptInt = jSONObject.optInt(C1166e.f3018d);
                if (jCurrentTimeMillis != 0) {
                    C1322e.m3873a(iOptInt == 1 ? 4 : 2, jOptLong, jOptLong2, strOptString);
                    new StringBuilder("Create new psid, SDKContext.init to send playTime:").append((jOptLong2 - jOptLong) / 1000);
                } else {
                    try {
                        new StringBuilder("Psid is old, use pervioud statime,close before:").append((jOptLong2 - jOptLong) / 1000);
                        jCurrentTimeMillis = jOptLong;
                    } catch (Exception unused) {
                        jCurrentTimeMillis = jOptLong;
                        C1355s.m4237a(m2059a().f3371k, C1169h.f3065p, m2059a().m2165o() + "playRecord", "");
                    }
                }
                C1355s.m4237a(m2059a().f3371k, C1169h.f3065p, m2059a().m2165o() + "playRecord", "");
            }
        } catch (Exception unused2) {
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = C1355s.m4232a(context, C1169h.f3065p, C1169h.v.f3272j, (Long) 0L).longValue();
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1166e(jCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2065a(C1175n c1175n, Context context, ATNetworkConfig aTNetworkConfig) {
        if (aTNetworkConfig == null) {
            aTNetworkConfig = new ATNetworkConfig();
        }
        List<ATInitConfig> aTInitConfigList = aTNetworkConfig.getATInitConfigList();
        if (aTInitConfigList == null) {
            aTInitConfigList = new ArrayList<>(2);
        }
        try {
            if (c1175n.m2175v()) {
                aTInitConfigList.clear();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            aTInitConfigList = new ArrayList<>(2);
        }
        boolean z = false;
        c1175n.f3344K = aTInitConfigList.size() > 0;
        ATInitConfig aTInitConfig = null;
        if (Build.VERSION.SDK_INT != 29) {
            try {
                Constructor declaredConstructor = Class.forName("com.anythink.network.facebook.FacebookATInitConfig").asSubclass(ATInitConfig.class).getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                ATInitConfig aTInitConfig2 = (ATInitConfig) declaredConstructor.newInstance(new Object[0]);
                try {
                    aTInitConfigList.add(0, aTInitConfig2);
                } catch (Throwable unused) {
                }
                aTInitConfig = aTInitConfig2;
            } catch (Throwable unused2) {
            }
        }
        for (ATInitConfig aTInitConfig3 : aTInitConfigList) {
            if (aTInitConfig3 != null) {
                if (aTInitConfig != null && TextUtils.equals(aTInitConfig.getClass().getSimpleName(), aTInitConfig3.getClass().getSimpleName())) {
                    if (!z) {
                        z = true;
                    }
                }
                m2066a(c1175n.new AnonymousClass6(aTInitConfig3, context));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2066a(Runnable runnable) {
        C1335b.m3998a().m4007a(runnable, 7, true);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2067a(Context context, List<String> list) {
        boolean z = true;
        if (list == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            try {
            } catch (Throwable th) {
                sb.append(", error: ");
                sb.append(th.getMessage());
            }
            if (context.getPackageManager().queryIntentActivities(new Intent(context, Class.forName(str)), 131072).size() <= 0) {
                sb.append(", ");
                sb.append(str);
                z = false;
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (z) {
            Log.i("anythink", "Activities : VERIFIED");
        } else {
            Log.e("anythink", "Activities : Missing " + sb.toString() + " declare in AndroidManifest");
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    private void m2069b(Context context, String str, String str2) {
        m2114a(context.getApplicationContext(), str, str2);
        m2066a(new AnonymousClass14(context, str));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2070b(C1175n c1175n, Context context) {
        try {
            Class<?> cls = Class.forName("com.anythink.network.adx.AdxATInitManager");
            Object objInvoke = null;
            try {
                objInvoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused) {
                Log.e("anythink", "Cannot instantiate " + cls.getName() + ", please check if SDK is imported");
            }
            if (objInvoke == null || !(objInvoke instanceof ATInitMediation) || c1175n.m2130a(context, (List<String>) ((ATInitMediation) objInvoke).getResourceStatus(), true) || !ATCommonConfig.isShowInitErrorTips) {
                return;
            }
            c1175n.m2118a(c1175n.new AnonymousClass12(), 500L);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2071b(Runnable runnable, long j) {
        C1335b.m3998a().m4008a(runnable, j);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2072b(Context context, List<String> list) {
        boolean z = true;
        if (list == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        PackageManager packageManager = context.getPackageManager();
        for (String str : list) {
            try {
            } catch (Throwable th) {
                sb.append(", error: ");
                sb.append(th.getMessage());
            }
            if (packageManager.queryIntentServices(new Intent(context, Class.forName(str)), 131072).size() <= 0) {
                sb.append(", ");
                sb.append(str);
                z = false;
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (z) {
            Log.i("anythink", "Services : VERIFIED");
        } else {
            Log.e("anythink", "Services : Missing " + sb.toString() + " declare in AndroidManifest");
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2073b(Map<String, Boolean> map) {
        boolean z = true;
        if (map == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            if (!map.get(str).booleanValue()) {
                sb.append(", ");
                sb.append(str);
                z = false;
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (z) {
            Log.i("anythink", "Dependence Plugin: VERIFIED");
        } else {
            Log.e("anythink", "Dependence Plugin: Missing ".concat(String.valueOf(sb)));
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    private void m2075c(Context context) {
        try {
            Class<?> cls = Class.forName("com.anythink.network.adx.AdxATInitManager");
            Object objInvoke = null;
            try {
                objInvoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused) {
                Log.e("anythink", "Cannot instantiate " + cls.getName() + ", please check if SDK is imported");
            }
            if (objInvoke == null || !(objInvoke instanceof ATInitMediation) || m2130a(context, (List<String>) ((ATInitMediation) objInvoke).getResourceStatus(), true) || !ATCommonConfig.isShowInitErrorTips) {
                return;
            }
            m2118a(new AnonymousClass12(), 500L);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2076c(Runnable runnable) {
        C1335b.m3998a().m4007a(runnable, 2, true);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2077c(Context context, List<String> list) {
        boolean z;
        boolean z3;
        if (list == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        PackageInfo packageInfo = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 8);
            z = true;
        } catch (Throwable th) {
            sb.append(", error: ");
            sb.append(th.getMessage());
            z = false;
        }
        if (packageInfo == null) {
            return false;
        }
        ProviderInfo[] providerInfoArr = packageInfo.providers;
        for (String str : list) {
            int length = providerInfoArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z3 = false;
                    break;
                }
                if (TextUtils.equals(providerInfoArr[i].name, str)) {
                    z3 = true;
                    break;
                }
                i++;
            }
            if (!z3) {
                sb.append(", ");
                sb.append(str);
                z = false;
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (z) {
            Log.i("anythink", "Providers : VERIFIED");
        } else {
            Log.e("anythink", "Providers : Missing " + sb.toString() + " declare in AndroidManifest");
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x002d, code lost:
    
        if (r2.importance != 100) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002f, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m2079d(android.content.Context r5) {
        /*
            r0 = 0
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r5.getSystemService(r1)     // Catch: java.lang.Throwable -> L32
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> L32
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L32
        L11:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L32
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = r2.processName     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = r5.getPackageName()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L11
            int r5 = r2.importance     // Catch: java.lang.Throwable -> L32
            r1 = 100
            if (r5 != r1) goto L31
            r5 = 1
            return r5
        L31:
            return r0
        L32:
            r5 = move-exception
            r5.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p051b.C1175n.m2079d(android.content.Context):boolean");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2080d(Context context, List<String> list) {
        boolean z = true;
        if (list == null || list.size() == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        boolean z3 = false;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = list.get(i);
                if (TextUtils.isEmpty(applicationInfo.metaData.getString(str))) {
                    sb.append(", \"");
                    sb.append(str);
                    sb.append("\"");
                    z = false;
                }
            }
            if (sb.length() > 2) {
                sb.delete(0, 2);
            }
            z3 = z;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (z3) {
            Log.i("anythink", "meta-data: VERIFIED");
        } else {
            Log.e("anythink", "meta-data: Missing " + sb.toString() + " declare in AndroidManifest");
        }
        return z3;
    }

    /* JADX INFO: renamed from: e */
    private void m2081e(boolean z) {
        this.f3355V = z;
    }

    /* JADX INFO: renamed from: e */
    private boolean m2082e(Context context) {
        String strM4060d = C1341e.m4060d(context);
        if (!TextUtils.isEmpty(strM4060d) && strM4060d.equals(this.f3351R)) {
            return true;
        }
        String strM4065f = C1341e.m4065f();
        if (!TextUtils.isEmpty(strM4065f) && strM4065f.equals(this.f3351R)) {
            return true;
        }
        IExHandler iExHandlerM2132b = m2059a().m2132b();
        return iExHandlerM2132b != null && iExHandlerM2132b.checkDebuggerDevice(context, this.f3351R);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2083e(Context context, List<String> list) {
        int size;
        boolean z;
        if (list == null || (size = list.size()) == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        boolean z3 = false;
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                boolean z4 = true;
                for (int i = 0; i < size; i++) {
                    String str = list.get(i);
                    int length = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = false;
                            break;
                        }
                        if (TextUtils.equals(str, strArr[i2])) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    if (!z) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        z4 = false;
                    }
                }
                z3 = z4;
            } else {
                for (int i3 = 0; i3 < size; i3++) {
                    String str2 = list.get(i3);
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(str2);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (z3) {
            Log.i("anythink", "Permission: VERIFIED");
        } else {
            Log.e("anythink", "Permission: Missing " + sb.toString() + " declare in AndroidManifest");
        }
        return z3;
    }

    /* JADX INFO: renamed from: f */
    private void m2084f(Context context) {
        long jCurrentTimeMillis = this.f3365d;
        try {
            String strM4239b = C1355s.m4239b(m2059a().f3371k, C1169h.f3065p, m2059a().m2165o() + "playRecord", "");
            if (!TextUtils.isEmpty(strM4239b)) {
                JSONObject jSONObject = new JSONObject(strM4239b);
                long jOptLong = jSONObject.optLong("start_time");
                long jOptLong2 = jSONObject.optLong("end_time");
                String strOptString = jSONObject.optString(C1166e.f3017c);
                int iOptInt = jSONObject.optInt(C1166e.f3018d);
                if (jCurrentTimeMillis != 0) {
                    C1322e.m3873a(iOptInt == 1 ? 4 : 2, jOptLong, jOptLong2, strOptString);
                    new StringBuilder("Create new psid, SDKContext.init to send playTime:").append((jOptLong2 - jOptLong) / 1000);
                } else {
                    try {
                        new StringBuilder("Psid is old, use pervioud statime,close before:").append((jOptLong2 - jOptLong) / 1000);
                        jCurrentTimeMillis = jOptLong;
                    } catch (Exception unused) {
                        jCurrentTimeMillis = jOptLong;
                        C1355s.m4237a(m2059a().f3371k, C1169h.f3065p, m2059a().m2165o() + "playRecord", "");
                    }
                }
                C1355s.m4237a(m2059a().f3371k, C1169h.f3065p, m2059a().m2165o() + "playRecord", "");
            }
        } catch (Exception unused2) {
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = C1355s.m4232a(context, C1169h.f3065p, C1169h.v.f3272j, (Long) 0L).longValue();
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1166e(jCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: g */
    private static void m2085g(Context context) {
        C1200c.m2314a().m2334a(context);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2086i(String str) {
        try {
            Class.forName(str);
            Log.i("anythink", "SDK: VERIFIED");
            return true;
        } catch (Throwable unused) {
            Log.i("anythink", "SDK: NOT VERIFIED");
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m2087o(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "AdSourceId is empty";
        } else {
            try {
                if (Long.parseLong(str) == 0) {
                    Log.e("anythink", "AdSourceId can't set 0");
                    return;
                }
                return;
            } catch (Exception unused) {
                str2 = "AdSourceId '" + str + "' is not compliant";
            }
        }
        Log.e("anythink", str2);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ boolean m2088s(String str) {
        String strM4131a = C1344h.m4131a();
        boolean z = !TextUtils.isEmpty(str) && str.startsWith(strM4131a);
        if (z) {
            Log.i("anythink", "Adapter Version: VERIFIED");
        } else {
            Log.e("anythink", String.format("Adapter Version: The current Adapter version(%s) does not apply to the SDK version(%s).", str, strM4131a));
        }
        return z;
    }

    /* JADX INFO: renamed from: t */
    private Map<String, Object> m2089t(String str) {
        if (this.f3377q == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f3377q.get(str);
    }

    /* JADX INFO: renamed from: u */
    private void m2090u(String str) {
        this.f3372l = str;
        C1355s.m4237a(this.f3371k, C1169h.f3065p, C1169h.f3066q, str);
    }

    /* JADX INFO: renamed from: v */
    private void m2091v(String str) {
        this.f3373m = str;
        C1355s.m4237a(this.f3371k, C1169h.f3065p, C1169h.f3067r, str);
    }

    @Deprecated
    /* JADX INFO: renamed from: w */
    private void m2092w(String str) {
        this.f3351R = str;
    }

    /* JADX INFO: renamed from: x */
    private String m2093x(String str) {
        synchronized (this.f3382v) {
            String strOptString = this.f3381u.optString(str);
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": sessionid is empty.");
            String strM2177x = m2177x();
            String string = "";
            if (TextUtils.isEmpty(strM2177x)) {
                strM2177x = C1341e.m4060d(this.f3371k) + C1341e.m4065f();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(new Random().nextInt(10000000));
                string = sb2.toString();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strM4123a = C1343g.m4123a(strM2177x + str + string + jCurrentTimeMillis);
            try {
                this.f3381u.put(str, strM4123a);
            } catch (Exception unused) {
            }
            C1355s.m4237a(this.f3371k, C1169h.f3065p, C1169h.v.f3271i, this.f3381u.toString());
            if (!TextUtils.isEmpty(m2177x())) {
                string = null;
            }
            C1322e.m3915a(str, "2", string, String.valueOf(jCurrentTimeMillis));
            return strM4123a;
        }
    }

    /* JADX INFO: renamed from: y */
    private static boolean m2094y(String str) {
        String strM4131a = C1344h.m4131a();
        boolean z = !TextUtils.isEmpty(str) && str.startsWith(strM4131a);
        if (z) {
            Log.i("anythink", "Adapter Version: VERIFIED");
        } else {
            Log.e("anythink", String.format("Adapter Version: The current Adapter version(%s) does not apply to the SDK version(%s).", str, strM4131a));
        }
        return z;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m2095A() {
        return this.f3336C || this.f3337D;
    }

    /* JADX INFO: renamed from: B */
    public final InterfaceC1265c m2096B() {
        if (this.f3345L == null) {
            this.f3345L = new C1304d();
        }
        return this.f3345L;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m2097C() {
        return this.f3355V;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m2098D() {
        return this.f3356W;
    }

    /* JADX INFO: renamed from: E */
    public final Context m2099E() {
        WeakReference<Activity> weakReference = this.f3366e;
        return (weakReference == null || weakReference.get() == null) ? this.f3371k : this.f3366e.get();
    }

    /* JADX INFO: renamed from: F */
    public final Activity m2100F() {
        WeakReference<Activity> weakReference = this.f3366e;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f3366e.get();
    }

    /* JADX INFO: renamed from: G */
    public final String m2101G() {
        return this.f3358Y;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m2102H() {
        return this.f3344K;
    }

    /* JADX INFO: renamed from: I */
    public final ATPrivacyConfig m2103I() {
        return this.f3359Z;
    }

    /* JADX INFO: renamed from: J */
    public final C1232ay m2104J() {
        if (this.f3360aa == null) {
            this.f3360aa = new C1232ay();
        }
        try {
            this.f3360aa.m2864a(C1341e.m4095t(m2059a().f3371k));
            this.f3360aa.m2866b(C1341e.m4077k());
            this.f3360aa.m2868c(C1341e.m4081m());
            this.f3360aa.m2870d(C1341e.m4053b(C1341e.m4079l()));
        } catch (Throwable unused) {
        }
        return this.f3360aa;
    }

    /* JADX INFO: renamed from: K */
    public final void m2105K() {
        this.f3361ab = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: L */
    public final String m2106L() {
        return this.f3363ad;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m2107M() {
        return this.f3343J;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m2108a(Context context, String str, int i) {
        C1391a c1391aM4865b = C1392b.m4845a(context).m4865b(str);
        String strM4239b = C1355s.m4239b(context, C1169h.f3065p, C1169h.v.f3270h, "");
        String strM4239b2 = C1355s.m4239b(context, C1169h.f3065p, C1169h.v.f3271i, "");
        long jLongValue = C1355s.m4232a(context, C1169h.f3065p, C1169h.v.f3272j, (Long) 0L).longValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jLongValue < 0) {
            jLongValue = 0;
        }
        if (jCurrentTimeMillis - jLongValue <= (i == 0 ? c1391aM4865b.m4721R() : c1391aM4865b.m4707D())) {
            new StringBuilder("psid updataTime<=").append(c1391aM4865b.m4721R());
            this.f3380t = strM4239b;
            if (!TextUtils.isEmpty(strM4239b2)) {
                synchronized (this.f3382v) {
                    this.f3381u = new JSONObject(strM4239b2);
                }
            }
            new StringBuilder("psid :").append(this.f3380t);
            return 0L;
        }
        new StringBuilder("psid updataTime>").append(c1391aM4865b.m4721R());
        String strM2177x = m2177x();
        String strValueOf = "";
        if (TextUtils.isEmpty(strM2177x)) {
            strM2177x = C1341e.m4060d(context) + C1341e.m4065f();
            strValueOf = String.valueOf(new Random().nextInt(10000000));
        }
        this.f3380t = C1343g.m4123a(strM2177x + str + strValueOf + jCurrentTimeMillis);
        synchronized (this.f3382v) {
            this.f3381u = new JSONObject();
        }
        C1355s.m4237a(context, C1169h.f3065p, C1169h.v.f3270h, this.f3380t);
        C1355s.m4237a(context, C1169h.f3065p, C1169h.v.f3271i, "");
        C1355s.m4236a(context, C1169h.f3065p, C1169h.v.f3272j, jCurrentTimeMillis);
        new StringBuilder("psid :").append(this.f3380t);
        C1322e.m3915a((String) null, "1", strValueOf, String.valueOf(jCurrentTimeMillis));
        if (i == 0) {
            this.f3365d = jCurrentTimeMillis;
        }
        return jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: a */
    public final void m2109a(int i) {
        if (i == 2) {
            this.f3354U = 2;
        } else {
            this.f3354U = 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2110a(Activity activity) {
        WeakReference<Activity> weakReference = this.f3366e;
        if (weakReference == null || weakReference.get() == null) {
            this.f3366e = new WeakReference<>(activity);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2111a(Context context) {
        if (context == null) {
            Log.w("SDK.init", "ATSDK.setContext() is null!");
        } else {
            this.f3371k = context;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2112a(Context context, DeviceInfoCallback deviceInfoCallback) {
        if (this.f3343J) {
            C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.core.common.b.n.4

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f3408a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ DeviceInfoCallback f3409b;

                public AnonymousClass4(Context context2, DeviceInfoCallback deviceInfoCallback2) {
                    context = context2;
                    deviceInfoCallback = deviceInfoCallback2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1391a c1391aM4865b = C1392b.m4845a(context).m4865b(C1175n.m2059a().m2165o());
                    String strM4711H = c1391aM4865b != null ? c1391aM4865b.m4711H() : "";
                    boolean z = true;
                    if (!TextUtils.isEmpty(strM4711H)) {
                        try {
                            JSONObject jSONObject = new JSONObject(strM4711H);
                            if (!jSONObject.isNull("a")) {
                                if (jSONObject.optInt("a") != 1) {
                                    z = false;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
                        if (iExHandlerM2132b != null) {
                            iExHandlerM2132b.fillTestDeviceData(jSONObject2, c1391aM4865b);
                        }
                        jSONObject2.put("GAID", C1341e.m4094s(context));
                        jSONObject2.put("AndroidID", z ? C1341e.m4060d(context) : "");
                        jSONObject2.put("How to config TestMode", "Please visit the document center and learn more through: Integration(Basic) -> How To Test");
                        C1352p.m4211a("testModeDeviceInfo", jSONObject2.toString());
                        DeviceInfoCallback deviceInfoCallback2 = deviceInfoCallback;
                        if (deviceInfoCallback2 != null) {
                            deviceInfoCallback2.deviceInfo(jSONObject2.toString());
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }, 2, true);
            return;
        }
        Log.e("anythink", "You should init SDK first.");
        if (deviceInfoCallback2 != null) {
            deviceInfoCallback2.deviceInfo("You should init SDK first.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2113a(Context context, String str, ATDebuggerConfig aTDebuggerConfig) {
        IExHandler iExHandlerM2132b;
        if (context == null) {
            if (m2095A()) {
                Log.e("SDK.init", "setDebuggerConfig fail, because context is null.");
                return;
            }
            return;
        }
        if (m2059a().f3371k == null) {
            m2059a().m2111a(context.getApplicationContext());
        }
        this.f3351R = str;
        this.f3352S = aTDebuggerConfig;
        String strM4060d = C1341e.m4060d(context);
        boolean z = true;
        if (TextUtils.isEmpty(strM4060d) || !strM4060d.equals(this.f3351R)) {
            String strM4065f = C1341e.m4065f();
            if ((TextUtils.isEmpty(strM4065f) || !strM4065f.equals(this.f3351R)) && ((iExHandlerM2132b = m2059a().m2132b()) == null || !iExHandlerM2132b.checkDebuggerDevice(context, this.f3351R))) {
                z = false;
            }
        }
        this.f3353T = z;
        if (TextUtils.isEmpty(this.f3351R)) {
            if (m2095A()) {
                Log.e("SDK.init", "Setting Debugger's device fail, because deviceId is empty.");
            }
            this.f3353T = false;
        } else if (!this.f3353T) {
            if (m2095A()) {
                Log.e("SDK.init", "The incoming device id does not match the current device id, and the debugger mode cannot take effect.");
            }
        } else {
            if (m2095A()) {
                Log.i("SDK.init", "Setting Debugger's device success.");
            }
            if (this.f3352S == null || !m2095A()) {
                return;
            }
            Log.i("SDK.init", "Debugger config is in effect now.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2114a(Context context, String str, String str2) {
        C1335b.m3998a().m4006a((Runnable) new Runnable() { // from class: com.anythink.core.common.b.n.3

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f3404a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f3405b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f3406c;

            public AnonymousClass3(Context context2, String str3, String str22) {
                context = context2;
                str = str3;
                str = str22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (C1392b.m4845a(context).m4864a(str)) {
                    C1392b.m4845a(context).m4863a(str, str);
                }
            }
        }, 13);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2115a(Context context, String str, String str2, ATNetworkConfig aTNetworkConfig) {
        if (context == null) {
            return;
        }
        this.f3371k = context.getApplicationContext();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (this.f3343J) {
                return;
            }
            this.f3343J = true;
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = C1355s.m4232a(context, C1169h.f3065p, C1169h.v.f3275m, (Long) 0L).longValue();
                this.f3338E = jLongValue;
                if (jLongValue == 0) {
                    this.f3338E = jCurrentTimeMillis;
                    C1355s.m4236a(context, C1169h.f3065p, C1169h.v.f3275m, jCurrentTimeMillis);
                }
                this.f3339F = ((m2058a(jCurrentTimeMillis) - m2058a(this.f3338E)) / 86400000) + 1;
                this.f3365d = 0L;
                C1086a.m1566a(context.getApplicationContext()).m1569a();
                Context applicationContext = context.getApplicationContext();
                m2111a(applicationContext);
                this.f3372l = str;
                C1355s.m4237a(this.f3371k, C1169h.f3065p, C1169h.f3066q, str);
                this.f3373m = str2;
                C1355s.m4237a(this.f3371k, C1169h.f3065p, C1169h.f3067r, str2);
                this.f3355V = C1345i.m4158a();
                C1200c.m2314a().m2334a(context);
                try {
                    BroadcastReceiver broadcastReceiver = this.f3383w;
                    if (broadcastReceiver != null) {
                        this.f3371k.unregisterReceiver(broadcastReceiver);
                        C1172k.m2050a(this.f3371k).m2051a(this.f3383w);
                    }
                    this.f3383w = null;
                } catch (Throwable unused) {
                }
                try {
                    this.f3383w = new AnonymousClass13();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    intentFilter.addAction(C1169h.f3042G);
                    this.f3371k.registerReceiver(this.f3383w, intentFilter);
                    C1172k.m2050a(this.f3371k).m2052a(this.f3383w, intentFilter);
                } catch (Throwable unused2) {
                }
                m2066a(new Runnable() { // from class: com.anythink.core.common.b.n.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ Context f3387a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ String f3388b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ Context f3389c;

                    public AnonymousClass1(Context applicationContext2, String str3, Context context2) {
                        context = applicationContext2;
                        str = str3;
                        context = context2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            C1321d.m3855a().m3868a(context);
                            C1175n.this.m2108a(context, str, 0);
                            C1175n.m2064a(C1175n.this, context);
                            C1170i.m2035a(context).m2043a();
                            C1175n.m2063a(C1175n.this);
                            C1175n.m2070b(C1175n.this, context);
                            C1160l.m1996a().m2006b();
                            C1380d.m4520a(C1175n.this.m2148f()).m4530b();
                            C1380d.m4520a(C1175n.this.m2148f());
                            C1380d.m4521c();
                        } catch (Exception unused3) {
                        }
                    }
                });
                m2066a(new Runnable() { // from class: com.anythink.core.common.b.n.7
                    public AnonymousClass7() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1175n.this.m2173t();
                    }
                });
                m2066a(new Runnable() { // from class: com.anythink.core.common.b.n.8
                    public AnonymousClass8() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1325o.m3942a().m3949a(C1175n.this.f3371k);
                    }
                });
                ((Application) this.f3371k).registerActivityLifecycleCallbacks(new C1167f(m2079d(this.f3371k)));
                m2118a(new Runnable() { // from class: com.anythink.core.common.b.n.9

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ Context f3424a;

                    public AnonymousClass9(Context applicationContext2) {
                        context = applicationContext2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1341e.m4090q(context);
                    }
                }, C1575f.f8394a);
                m2066a(new Runnable() { // from class: com.anythink.core.common.b.n.10

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ Context f3391a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ Context f3392b;

                    public AnonymousClass10(Context context2, Context applicationContext2) {
                        context = context2;
                        context = applicationContext2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1175n.this.m2132b();
                        if (C1175n.this.f3334A != null) {
                            C1175n.this.f3334A.initDeviceInfo(context);
                        }
                        C1398h.m5135a(context).m5141a();
                        C1390x.m4629a(context);
                        C1193d.m2290a().m2292a(context);
                        String strM4094s = C1341e.m4094s(C1175n.this.f3371k);
                        if (TextUtils.isEmpty(strM4094s)) {
                            return;
                        }
                        C1175n.this.m2153h(strM4094s);
                    }
                });
                m2066a(new Runnable() { // from class: com.anythink.core.common.b.n.11

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ ATNetworkConfig f3394a;

                    public AnonymousClass11(ATNetworkConfig aTNetworkConfig2) {
                        aTNetworkConfig = aTNetworkConfig2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1175n c1175n = C1175n.this;
                        C1175n.m2065a(c1175n, c1175n.f3371k, aTNetworkConfig);
                    }
                });
                m2114a(context2.getApplicationContext(), str3, str2);
                m2066a(new AnonymousClass14(context2, str3));
            } catch (Exception e) {
                Log.e("SDK.init", "init failed: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2116a(Location location) {
        this.f3346M = location;
    }

    /* JADX INFO: renamed from: a */
    public final void m2117a(ATPrivacyConfig aTPrivacyConfig) {
        this.f3359Z = aTPrivacyConfig;
    }

    /* JADX INFO: renamed from: a */
    public final void m2118a(Runnable runnable, long j) {
        if (j > 0 || Looper.getMainLooper() != Looper.myLooper()) {
            this.f3374n.postDelayed(runnable, j);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2119a(String str) {
        this.f3375o = str;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2120a(String str, ATCustomAdapterConfig aTCustomAdapterConfig) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f3378r == null) {
            this.f3378r = new ConcurrentHashMap<>();
        }
        if (aTCustomAdapterConfig == null) {
            this.f3378r.remove(str);
        } else {
            this.f3378r.put(str, aTCustomAdapterConfig);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2121a(String str, String str2, String str3, Map<String, Object> map) {
        if (!this.f3343J) {
            Log.e("SDK.init", "SDK should be inited first!");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e("SDK.init", "Please put placementId!");
            return;
        }
        C1201f c1201fM4559a = C1387u.m4556a().m4559a(str, str3);
        if (c1201fM4559a != null) {
            C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.core.common.b.n.5

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f3411a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1201f f3412b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f3413c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C1234b f3414d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Map f3415e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ boolean f3416f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ String f3417g;

                public AnonymousClass5(String str4, C1201f c1201fM4559a2, String str22, C1234b c1234b, Map map2, boolean z, String str32) {
                    str = str4;
                    c1201f = c1201fM4559a2;
                    str = str22;
                    c1234b = c1234b;
                    map = map2;
                    z = z;
                    str = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        this = this;
                        com.anythink.core.common.b.n r0 = com.anythink.core.common.p051b.C1175n.this
                        android.content.Context r0 = com.anythink.core.common.p051b.C1175n.m2068b(r0)
                        com.anythink.core.d.h r0 = com.anythink.core.p072d.C1398h.m5135a(r0)
                        java.lang.String r1 = r2
                        com.anythink.core.d.f r0 = r0.m5139a(r1)
                        com.anythink.core.common.f r1 = r3
                        java.lang.String r1 = r1.m2404g()
                        java.lang.String r2 = r4
                        boolean r2 = android.text.TextUtils.isEmpty(r2)
                        java.lang.String r3 = ""
                        if (r2 != 0) goto L2c
                        java.lang.String r2 = r4
                        boolean r2 = com.anythink.core.common.p066o.C1344h.m4150c(r2)
                        if (r2 == 0) goto L2c
                        java.lang.String r2 = r4
                        r9 = r2
                        goto L2d
                    L2c:
                        r9 = r3
                    L2d:
                        com.anythink.core.common.f.b r2 = r5
                        r10 = 16
                        if (r2 == 0) goto L5e
                        com.anythink.core.common.f.h r1 = r2.m2908h()
                        com.anythink.core.common.f.h r1 = r1.m3045V()
                        r2 = 1
                        r1.m3089g(r2)
                        r1.f4134B = r9
                        com.anythink.core.common.w r2 = com.anythink.core.common.C1389w.m4583a()
                        boolean r2 = r2.m4625a(r0)
                        if (r2 == 0) goto L50
                    L4b:
                        java.lang.String r2 = r2
                        com.anythink.core.common.p066o.C1358v.m4257a(r2, r0, r1)
                    L50:
                        com.anythink.core.common.b.n r0 = com.anythink.core.common.p051b.C1175n.this
                        android.content.Context r0 = com.anythink.core.common.p051b.C1175n.m2068b(r0)
                        com.anythink.core.common.n.c r0 = com.anythink.core.common.p065n.C1320c.m3839a(r0)
                        r0.m3851a(r10, r1)
                        return
                    L5e:
                        boolean r2 = android.text.TextUtils.isEmpty(r1)
                        if (r2 == 0) goto L66
                        r2 = r3
                        goto L67
                    L66:
                        r2 = r1
                    L67:
                        java.lang.String r3 = r2
                        r5 = 0
                        r6 = 0
                        java.util.Map r7 = r6
                        r8 = 0
                        r4 = r0
                        com.anythink.core.common.f.h r1 = com.anythink.core.common.p066o.C1358v.m4251a(r2, r3, r4, r5, r6, r7, r8)
                        boolean r2 = r7
                        if (r2 == 0) goto L79
                        r2 = 3
                        goto L7a
                    L79:
                        r2 = 2
                    L7a:
                        r1.m3089g(r2)
                        if (r0 != 0) goto L84
                        java.lang.String r2 = r8
                        r1.m2687y(r2)
                    L84:
                        r1.f4134B = r9
                        com.anythink.core.common.w r2 = com.anythink.core.common.C1389w.m4583a()
                        boolean r2 = r2.m4625a(r0)
                        if (r2 == 0) goto L50
                        goto L4b
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p051b.C1175n.AnonymousClass5.run():void");
                }
            }, 2, true);
        } else {
            Log.e("SDK.init", "The \"" + str4 + "\" object has not been created yet!");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2122a(String str, List<String> list) {
        this.f3350Q.put(str, list);
    }

    /* JADX INFO: renamed from: a */
    public final void m2123a(String str, Map<String, Object> map) {
        if (map != null) {
            this.f3377q.put(str, map);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2124a(String str, Map<String, Object> map, String... strArr) {
        C1243h c1243h;
        if (map == null || map.containsKey(ATInitMediation.KEY_LOCAL)) {
            return;
        }
        try {
            c1243h = (C1243h) map.get(C1169h.p.f3229h);
        } catch (Throwable unused) {
            c1243h = null;
        }
        map.remove(C1169h.p.f3229h);
        String string = new JSONObject(map).toString();
        Log.e("anythink", "Mismatched initialization parameters! server params: [" + str + "], " + string);
        C1355s.m4237a(this.f3371k, C1169h.f3037B, str, string);
        if (c1243h == null || strArr == null) {
            return;
        }
        try {
            C1322e.m3887a(c1243h, strArr[0], strArr.length > 1 ? strArr[1] : null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2125a(List<String> list) {
        try {
            this.f3349P = list;
            if (list == null || list.isEmpty()) {
                this.f3348O = null;
            } else {
                this.f3348O = new JSONArray((Collection) list);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2126a(Map<String, Object> map) {
        if (map != null && map.containsKey("channel")) {
            Object obj = map.get("channel");
            String string = obj != null ? obj.toString() : "";
            this.f3340G = string;
            if (!C1344h.m4142a(string)) {
                this.f3340G = null;
                map.remove("channel");
            }
        }
        if (map != null && map.containsKey("sub_channel")) {
            Object obj2 = map.get("sub_channel");
            String string2 = obj2 != null ? obj2.toString() : "";
            this.f3341H = string2;
            if (!C1344h.m4147b(string2)) {
                this.f3341H = null;
                map.remove("sub_channel");
            }
        }
        this.f3376p.clear();
        if (map != null) {
            this.f3376p.putAll(map);
        }
        if (!TextUtils.isEmpty(this.f3340G)) {
            this.f3376p.put("channel", this.f3340G);
        }
        if (TextUtils.isEmpty(this.f3341H)) {
            return;
        }
        this.f3376p.put("sub_channel", this.f3341H);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2127a(boolean z) {
        this.f3347N = z ? "1" : "2";
    }

    /* JADX INFO: renamed from: a */
    public final void m2128a(String... strArr) {
        synchronized (this.f3379s) {
            if (strArr != null) {
                for (String str : strArr) {
                    this.f3379s.put(str, Boolean.TRUE);
                }
            } else {
                this.f3379s.clear();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2129a(String[] strArr, IATAdFilter iATAdFilter) {
        ConcurrentHashMap<String, IATAdFilter> concurrentHashMap = this.f3357X;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        if (this.f3357X == null) {
            this.f3357X = new ConcurrentHashMap<>();
        }
        for (String str : strArr) {
            this.f3357X.put(str, iATAdFilter);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2130a(Context context, List<String> list, boolean z) {
        if (list == null || list.size() == 0) {
            return true;
        }
        String str = "";
        boolean z3 = false;
        try {
            int size = list.size();
            int i = 0;
            boolean z4 = true;
            while (true) {
                if (i >= size) {
                    z3 = z4;
                    break;
                }
                String str2 = list.get(i);
                try {
                    if (TextUtils.isEmpty(str)) {
                        str = str2.split("_")[0] + "_*";
                    }
                    int identifier = TextUtils.isEmpty(this.f3363ad) ? -1 : context.getResources().getIdentifier(str2, "layout", this.f3363ad);
                    if (identifier <= 0) {
                        identifier = context.getResources().getIdentifier(str2, "layout", context.getPackageName());
                    }
                    if (identifier <= 0) {
                        break;
                    }
                    XmlResourceParser layout = null;
                    try {
                        layout = context.getResources().getLayout(identifier);
                    } finally {
                        try {
                            i++;
                        } finally {
                        }
                    }
                    while (true) {
                        int next = layout.next();
                        if (next == 1) {
                            break;
                        }
                        if (next == 2) {
                            if ("x".equalsIgnoreCase(layout.getName())) {
                                if (layout.getAttributeCount() == 0) {
                                    z4 = false;
                                    break;
                                }
                            } else if (layout.getAttributeCount() >= 0) {
                                break;
                            }
                            i++;
                        }
                    }
                    if (layout != null) {
                        layout.close();
                    }
                    i++;
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!z3) {
            Log.e("anythink", "Resource: The " + str + " resources are missing. If shrinkResources is enabled, the " + str + " resources must be added to the whitelist (keep.xml)");
        } else if (!z) {
            Log.i("anythink", "Resource: VERIFIED");
        }
        return z3;
    }

    /* JADX INFO: renamed from: b */
    public final ATCustomAdapterConfig m2131b(String str) {
        if (this.f3378r == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f3378r.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final IExHandler m2132b() {
        if (this.f3370i) {
            return this.f3334A;
        }
        synchronized (this.f3362ac) {
            if (this.f3370i) {
                return this.f3334A;
            }
            try {
                Constructor declaredConstructor = Class.forName("com.anythink.pd.ExHandler").asSubclass(IExHandler.class).getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                this.f3334A = (IExHandler) declaredConstructor.newInstance(new Object[0]);
            } catch (Exception unused) {
            }
            this.f3370i = true;
            return this.f3334A;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2133b(int i) {
        this.f3367f = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m2134b(Context context) {
        if (m2095A()) {
            C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.core.common.b.n.2

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f3402a;

                public AnonymousClass2(Context context2) {
                    context = context2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    Object objInvoke;
                    String strConcat;
                    AnonymousClass2 anonymousClass2 = this;
                    try {
                        ArrayList arrayList = new ArrayList();
                        Enumeration<String> enumerationEntries = new DexFile(context.getPackageCodePath()).entries();
                        while (enumerationEntries.hasMoreElements()) {
                            String strNextElement = enumerationEntries.nextElement();
                            if (strNextElement.contains("com.anythink.network") && strNextElement.contains("InitManager") && !strNextElement.contains("$")) {
                                arrayList.add(strNextElement);
                            }
                        }
                        Log.i("anythink", "********************************** Network Integration Status *************************************");
                        if (arrayList.size() != 0) {
                            Log.i("anythink", "----------------------------------------");
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            try {
                                Class<?> cls = Class.forName((String) it.next());
                                z = false;
                                objInvoke = null;
                                try {
                                    objInvoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                                } catch (Throwable unused) {
                                    Log.e("anythink", "Cannot instantiate " + cls.getName() + ", please check if a third-party SDK is imported");
                                    Log.i("anythink", "----------------------------------------");
                                }
                            } catch (Throwable unused2) {
                            }
                            if (objInvoke != null && (objInvoke instanceof ATInitMediation)) {
                                ATInitMediation aTInitMediation = (ATInitMediation) objInvoke;
                                String networkName = aTInitMediation.getNetworkName();
                                if (!TextUtils.isEmpty(networkName)) {
                                    String networkVersion = aTInitMediation.getNetworkVersion();
                                    if (TextUtils.isEmpty(networkVersion)) {
                                        strConcat = "NetworkName: ".concat(String.valueOf(networkName));
                                    } else {
                                        strConcat = "NetworkName: " + networkName + "  (v" + networkVersion + ")";
                                    }
                                    Log.i("anythink", strConcat);
                                    boolean zM2086i = C1175n.m2086i(aTInitMediation.getNetworkSDKClass());
                                    boolean zM2073b = C1175n.m2073b(aTInitMediation.getPluginClassStatus());
                                    boolean zM2067a = C1175n.m2067a(context, (List<String>) aTInitMediation.getActivityStatus());
                                    boolean zM2072b = C1175n.m2072b(context, (List<String>) aTInitMediation.getServiceStatus());
                                    boolean zM2077c = C1175n.m2077c(context, aTInitMediation.getProviderStatus());
                                    boolean zM2080d = C1175n.m2080d(context, aTInitMediation.getMetaValutStatus());
                                    boolean zM2083e = C1175n.m2083e(context, aTInitMediation.getPermissionStatus());
                                    boolean zM2130a = C1175n.this.m2130a(context, aTInitMediation.getResourceStatus(), false);
                                    boolean zM2088s = aTInitMediation.needCheckAdapterVersion() ? C1175n.m2088s(aTInitMediation.getAdapterVersion()) : true;
                                    if (zM2086i && zM2073b && zM2067a && zM2072b && zM2077c && zM2080d && zM2083e && zM2130a && zM2088s) {
                                        z = true;
                                    }
                                    if (z) {
                                        Log.i("anythink", "Status: Success");
                                    } else {
                                        Log.e("anythink", "Status: Fail");
                                    }
                                    Log.i("anythink", "----------------------------------------");
                                }
                            }
                            anonymousClass2 = this;
                        }
                        Log.i("anythink", "********************************** Network Integration Status *************************************");
                    } catch (Exception unused3) {
                    }
                }
            }, 2, true);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2135b(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f3374n.post(runnable);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2136b(String str, List<String> list) {
        this.f3350Q.put(str + "_network_firm", list);
    }

    /* JADX INFO: renamed from: b */
    public final void m2137b(boolean z) {
        this.f3337D = z;
    }

    /* JADX INFO: renamed from: c */
    public final long m2138c(int i) {
        if (i != 1 && i != 4) {
            return 26214400L;
        }
        C1392b.m4845a(this.f3371k);
        return C1392b.m4842a() * 1024;
    }

    /* JADX INFO: renamed from: c */
    public final String m2139c() {
        return this.f3375o;
    }

    /* JADX INFO: renamed from: c */
    public final void m2140c(boolean z) {
        this.f3342I = z;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2141c(String str) {
        boolean zContainsKey;
        synchronized (this.f3379s) {
            zContainsKey = this.f3379s.containsKey(str);
        }
        return zContainsKey;
    }

    /* JADX INFO: renamed from: d */
    public final int m2142d() {
        return this.f3354U;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, Object> m2143d(String str) {
        HashMap map = new HashMap();
        Map<String, Object> map2 = this.f3377q.get(str);
        ConcurrentHashMap<String, Object> concurrentHashMap = this.f3376p;
        if (concurrentHashMap != null) {
            map.putAll(concurrentHashMap);
        }
        if (map2 != null) {
            map.putAll(map2);
        }
        map.remove("channel");
        map.remove("sub_channel");
        Object obj = this.f3376p.get("channel");
        Object obj2 = this.f3376p.get("sub_channel");
        if (obj != null) {
            map.put("channel", obj);
        }
        if (obj2 != null) {
            map.put("sub_channel", obj2);
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    public final void m2144d(Runnable runnable) {
        this.f3374n.removeCallbacks(runnable);
    }

    /* JADX INFO: renamed from: d */
    public final void m2145d(boolean z) {
        this.f3356W = z;
    }

    /* JADX INFO: renamed from: e */
    public final void m2146e(String str) {
        this.f3340G = str;
        this.f3376p.put("channel", str);
    }

    /* JADX INFO: renamed from: e */
    public final String[] m2147e() {
        synchronized (this.f3379s) {
            Set<String> setKeySet = this.f3379s.keySet();
            int size = setKeySet.size();
            if (size <= 0) {
                return null;
            }
            String[] strArr = new String[size];
            setKeySet.toArray(strArr);
            return strArr;
        }
    }

    /* JADX INFO: renamed from: f */
    public final Context m2148f() {
        return this.f3371k;
    }

    /* JADX INFO: renamed from: f */
    public final void m2149f(String str) {
        this.f3341H = str;
        this.f3376p.put("sub_channel", str);
    }

    /* JADX INFO: renamed from: g */
    public final long m2150g() {
        return this.f3338E;
    }

    /* JADX INFO: renamed from: g */
    public final String m2151g(String str) {
        String strOptString;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        synchronized (this.f3382v) {
            strOptString = this.f3381u.optString(str);
        }
        if (TextUtils.isEmpty(strOptString)) {
            return m2093x(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": sessionid exists.");
        return strOptString;
    }

    /* JADX INFO: renamed from: h */
    public final long m2152h() {
        return this.f3339F;
    }

    /* JADX INFO: renamed from: h */
    public final void m2153h(String str) {
        if (TextUtils.isEmpty(this.f3351R)) {
            return;
        }
        if (TextUtils.equals(str, this.f3351R)) {
            this.f3353T = true;
        }
        if (this.f3353T && m2095A()) {
            Log.i("SDK.init", "Update Setting Debugger's device success.");
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m2154i() {
        return this.f3367f;
    }

    /* JADX INFO: renamed from: j */
    public final List<String> m2155j() {
        return this.f3349P;
    }

    /* JADX INFO: renamed from: j */
    public final void m2156j(String str) {
        this.f3385y = str;
        C1355s.m4237a(this.f3371k, C1169h.f3036A, C1169h.v.f3276n, str);
    }

    /* JADX INFO: renamed from: k */
    public final JSONArray m2157k() {
        return this.f3348O;
    }

    /* JADX INFO: renamed from: k */
    public final void m2158k(String str) {
        this.f3386z = str;
        C1355s.m4237a(this.f3371k, C1169h.f3036A, C1169h.v.f3277o, str);
    }

    /* JADX INFO: renamed from: l */
    public final Map<String, Object> m2159l() {
        return this.f3376p;
    }

    /* JADX INFO: renamed from: l */
    public final void m2160l(String str) {
        C1355s.m4237a(this.f3371k, C1169h.f3065p, C1169h.v.f3273k, str);
        this.f3384x = str;
    }

    /* JADX INFO: renamed from: m */
    public final String m2161m() {
        Object obj = this.f3376p.get("channel");
        return obj != null ? obj.toString() : "";
    }

    /* JADX INFO: renamed from: m */
    public final List<String> m2162m(String str) {
        return this.f3350Q.get(str);
    }

    /* JADX INFO: renamed from: n */
    public final String m2163n() {
        Object obj = this.f3376p.get("sub_channel");
        return obj != null ? obj.toString() : "";
    }

    /* JADX INFO: renamed from: n */
    public final List<String> m2164n(String str) {
        return this.f3350Q.get(str + "_network_firm");
    }

    /* JADX INFO: renamed from: o */
    public final String m2165o() {
        if (TextUtils.isEmpty(this.f3372l)) {
            this.f3372l = C1355s.m4239b(this.f3371k, C1169h.f3065p, C1169h.f3066q, "");
        }
        return this.f3372l;
    }

    /* JADX INFO: renamed from: p */
    public final IATAdFilter m2166p(String str) {
        ConcurrentHashMap<String, IATAdFilter> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f3357X) == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    /* JADX INFO: renamed from: p */
    public final String m2167p() {
        if (TextUtils.isEmpty(this.f3373m)) {
            this.f3373m = C1355s.m4239b(this.f3371k, C1169h.f3065p, C1169h.f3067r, "");
        }
        return this.f3373m;
    }

    /* JADX INFO: renamed from: q */
    public final String m2168q() {
        try {
            if (TextUtils.isEmpty(this.f3380t)) {
                m2108a(this.f3371k, m2165o(), 0);
            }
        } catch (Exception unused) {
        }
        return this.f3380t;
    }

    /* JADX INFO: renamed from: q */
    public final void m2169q(String str) {
        this.f3358Y = str;
    }

    /* JADX INFO: renamed from: r */
    public final Location m2170r() {
        return this.f3346M;
    }

    /* JADX INFO: renamed from: r */
    public final void m2171r(String str) {
        if (m2095A()) {
            Log.i("anythink", "setBundleName: ".concat(String.valueOf(str)));
        }
        this.f3363ad = str;
    }

    /* JADX INFO: renamed from: s */
    public final String m2172s() {
        return this.f3347N;
    }

    /* JADX INFO: renamed from: t */
    public final void m2173t() {
        try {
            C1341e.m4051a(this.f3371k);
            C1341e.m4092r(this.f3371k);
        } catch (Exception unused) {
        }
        if (m2095A()) {
            String strM4060d = C1341e.m4060d(this.f3371k);
            Log.i("anythink", "********************************** " + C1344h.m4131a() + " *************************************");
            Log.i("anythink", "GAID(ADID): " + C1341e.m4065f() + " , AndroidID: " + strM4060d);
            StringBuilder sb = new StringBuilder("********************************** ");
            sb.append(C1344h.m4131a());
            sb.append(" *************************************");
            Log.i("anythink", sb.toString());
            if (TextUtils.isEmpty(strM4060d)) {
                return;
            }
            Log.i("anythink", "You can use \"ATSDK.setDebuggerConfig(context, \"" + strM4060d + "\",new ATDebuggerConfig.Builder(the NetworkFirmId you want to test).build());\" to open the debugger mode.");
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2174u() {
        return this.f3353T;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m2175v() {
        return this.f3353T && this.f3352S != null;
    }

    /* JADX INFO: renamed from: w */
    public final ATDebuggerConfig m2176w() {
        return this.f3352S;
    }

    /* JADX INFO: renamed from: x */
    public final String m2177x() {
        if (TextUtils.isEmpty(this.f3384x)) {
            this.f3384x = C1355s.m4239b(this.f3371k, C1169h.f3065p, C1169h.v.f3273k, "");
        }
        return this.f3384x;
    }

    /* JADX INFO: renamed from: y */
    public final String m2178y() {
        if (TextUtils.isEmpty(this.f3385y)) {
            this.f3385y = C1355s.m4239b(this.f3371k, C1169h.f3036A, C1169h.v.f3276n, "");
        }
        return this.f3385y;
    }

    /* JADX INFO: renamed from: z */
    public final String m2179z() {
        if (TextUtils.isEmpty(this.f3386z)) {
            this.f3386z = C1355s.m4239b(this.f3371k, C1169h.f3036A, C1169h.v.f3277o, "");
        }
        return this.f3386z;
    }
}
