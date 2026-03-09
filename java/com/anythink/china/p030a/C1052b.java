package com.anythink.china.p030a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.anythink.china.api.ATChinaSDKHandler;
import com.anythink.china.api.OaidSDKCallbackListener;
import com.anythink.china.p030a.p031a.C1035b;
import com.anythink.china.p030a.p031a.C1037d;
import com.anythink.china.p030a.p031a.C1041h;
import com.anythink.china.p030a.p031a.C1043j;
import com.anythink.china.p030a.p031a.C1044k;
import com.anythink.china.p030a.p031a.C1045l;
import com.anythink.china.p030a.p031a.C1048o;
import com.anythink.china.p030a.p031a.C1049p;
import com.anythink.china.p030a.p031a.C1051r;
import com.anythink.china.p030a.p031a.ServiceConnectionC1036c;
import com.anythink.china.p030a.p031a.ServiceConnectionC1039f;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.bun.miitmdid.interfaces.IdSupplier;
import com.octopus.p222ad.ADBidEvent;
import com.umeng.commonsdk.proguard.C3442bg;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.china.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1052b {

    /* JADX INFO: renamed from: com.anythink.china.a.b$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1033a f2294a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f2295b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f2296c;

        public AnonymousClass1(InterfaceC1033a interfaceC1033a, Context context, String str) {
            this.f2294a = interfaceC1033a;
            this.f2295b = context;
            this.f2296c = str;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC1033a interfaceC1033a = new InterfaceC1033a() { // from class: com.anythink.china.a.b.1.1
                @Override // com.anythink.china.p030a.InterfaceC1033a
                /* JADX INFO: renamed from: a */
                public final void mo1322a() {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    C1052b.m1382c(anonymousClass1.f2295b, anonymousClass1.f2294a);
                }

                @Override // com.anythink.china.p030a.InterfaceC1033a
                /* JADX INFO: renamed from: a */
                public final void mo1323a(String str, boolean z) {
                    InterfaceC1033a interfaceC1033a2 = AnonymousClass1.this.f2294a;
                    if (interfaceC1033a2 != null) {
                        interfaceC1033a2.mo1323a(str, z);
                    }
                }
            };
            try {
                String str = this.f2296c;
                byte b = -1;
                switch (str.hashCode()) {
                    case -2053026509:
                        if (str.equals("LENOVO")) {
                            b = 8;
                        }
                        break;
                    case -1712043046:
                        if (str.equals("SAMSUNG")) {
                            b = 7;
                        }
                        break;
                    case -602397472:
                        if (str.equals("ONEPLUS")) {
                            b = 2;
                        }
                        break;
                    case 89163:
                        if (str.equals("ZTE")) {
                            b = 3;
                        }
                        break;
                    case 2018896:
                        if (str.equals("ASUS")) {
                            b = 0;
                        }
                        break;
                    case 2432928:
                        if (str.equals("OPPO")) {
                            b = 1;
                        }
                        break;
                    case 2555124:
                        if (str.equals("SSUI")) {
                            b = 5;
                        }
                        break;
                    case 73239724:
                        if (str.equals("MEIZU")) {
                            b = 10;
                        }
                        break;
                    case 630905871:
                        if (str.equals("MOTOLORA")) {
                            b = 9;
                        }
                        break;
                    case 976565563:
                        if (str.equals("FERRMEOS")) {
                            b = 4;
                        }
                        break;
                    case 1670208650:
                        if (str.equals("COOLPAD")) {
                            b = 12;
                        }
                        break;
                    case 1670211654:
                        if (str.equals("COOLSEA")) {
                            b = C3442bg.f18781k;
                        }
                        break;
                    case 2081893636:
                        if (str.equals("FREEME")) {
                            b = 11;
                        }
                        break;
                    case 2141820391:
                        if (str.equals(ADBidEvent.HUAWEI)) {
                            b = 6;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        new C1035b(this.f2295b).m1325a(interfaceC1033a);
                        break;
                    case 1:
                    case 2:
                        new C1045l(this.f2295b).m1363a(interfaceC1033a);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        C1052b.m1382c(this.f2295b, this.f2294a);
                        break;
                    case 6:
                        new C1041h(this.f2295b).m1348a(interfaceC1033a);
                        break;
                    case 7:
                        new C1048o(this.f2295b).m1367a(interfaceC1033a);
                        break;
                    case 8:
                    case 9:
                        new C1051r(this.f2295b).m1371a(interfaceC1033a);
                        break;
                    case 10:
                        new C1043j(this.f2295b).m1360a(interfaceC1033a);
                        break;
                    case 11:
                        new ServiceConnectionC1039f(this.f2295b).m1337a(interfaceC1033a);
                        break;
                    case 12:
                        new ServiceConnectionC1036c(this.f2295b).m1326a(interfaceC1033a);
                        break;
                    case 13:
                        new C1037d(this.f2295b).m1327a(interfaceC1033a);
                        break;
                    default:
                        C1052b.m1382c(this.f2295b, this.f2294a);
                        break;
                }
            } catch (Throwable th) {
                InterfaceC1033a interfaceC1033a2 = this.f2294a;
                if (interfaceC1033a2 != null) {
                    th.getMessage();
                    interfaceC1033a2.mo1322a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.china.a.b$a */
    @SuppressLint({"PrivateApi"})
    public static final class a {

        /* JADX INFO: renamed from: e */
        private static Object f2301e;

        /* JADX INFO: renamed from: f */
        private static Class<?> f2302f;

        /* JADX INFO: renamed from: g */
        private static Method f2303g;

        /* JADX INFO: renamed from: h */
        private static Method f2304h;

        /* JADX INFO: renamed from: i */
        private static Method f2305i;

        /* JADX INFO: renamed from: j */
        private static Method f2306j;

        /* JADX INFO: renamed from: a */
        public final String f2307a;

        /* JADX INFO: renamed from: b */
        public final String f2308b;

        /* JADX INFO: renamed from: c */
        public final String f2309c;

        /* JADX INFO: renamed from: d */
        public final String f2310d;

        static {
            try {
                Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
                f2302f = cls;
                f2301e = cls.newInstance();
                f2303g = f2302f.getMethod("getUDID", Context.class);
                f2304h = f2302f.getMethod("getOAID", Context.class);
                f2305i = f2302f.getMethod("getVAID", Context.class);
                f2306j = f2302f.getMethod("getAAID", Context.class);
            } catch (Throwable unused) {
            }
        }

        public a(Context context) {
            this.f2307a = m1385a(context, f2303g);
            this.f2308b = m1385a(context, f2304h);
            this.f2309c = m1385a(context, f2305i);
            this.f2310d = m1385a(context, f2306j);
        }

        /* JADX INFO: renamed from: a */
        private static String m1385a(Context context, Method method) {
            Object obj = f2301e;
            if (obj == null || method == null) {
                return null;
            }
            try {
                Object objInvoke = method.invoke(obj, context);
                if (objInvoke != null) {
                    return (String) objInvoke;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        private static boolean m1386a() {
            return (f2302f == null || f2301e == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m1372a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1373a(Context context, InterfaceC1033a interfaceC1033a) {
        String strM1378b;
        try {
            strM1378b = m1378b(context);
        } catch (Throwable unused) {
            strM1378b = "";
        }
        if (!TextUtils.isEmpty(strM1378b)) {
            interfaceC1033a.mo1323a(strM1378b, false);
            return;
        }
        String str = Build.MANUFACTURER;
        String strM1372a = m1372a("ro.build.freeme.label");
        if (!TextUtils.isEmpty(strM1372a) && strM1372a.equalsIgnoreCase("FREEMEOS")) {
            str = "FERRMEOS";
        } else {
            String strM1372a2 = m1372a("ro.ssui.product");
            if ((TextUtils.isEmpty(strM1372a2) || strM1372a2.equalsIgnoreCase("unknown")) ? false : true) {
                str = "SSUI";
            } else {
                String strM1372a3 = m1372a("ro.build.freeme.label");
                if ((TextUtils.isEmpty(strM1372a3) || strM1372a3.equalsIgnoreCase("unknown")) ? false : true) {
                    str = "FREEME";
                } else if (m1377a(context)) {
                    str = "COOLPAD";
                } else if (m1372a("ro.odm.manufacturer").equalsIgnoreCase("PRIZE")) {
                    str = "COOLSEA";
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            String upperCase = str.toUpperCase();
            if (Arrays.asList("ASUS", ADBidEvent.HUAWEI, "OPPO", "ONEPLUS", "ZTE", "FERRMEOS", "SSUI", "SAMSUNG", "MEIZU", "MOTOLORA", "LENOVO", "FREEME", "COOLPAD", "COOLSEA").contains(upperCase)) {
                C1335b.m3998a().m4007a((Runnable) new AnonymousClass1(interfaceC1033a, context, upperCase), 2, true);
            } else if ("VIVO".equals(upperCase)) {
                strM1378b = new C1049p(context).m1368a();
            } else if ("NUBIA".equals(upperCase)) {
                strM1378b = new C1044k(context).m1361a();
            } else {
                m1382c(context, interfaceC1033a);
            }
        }
        if (TextUtils.isEmpty(strM1378b)) {
            return;
        }
        interfaceC1033a.mo1323a(strM1378b, false);
    }

    /* JADX INFO: renamed from: a */
    private static void m1374a(Context context, String str, InterfaceC1033a interfaceC1033a) {
        C1335b.m3998a().m4007a((Runnable) new AnonymousClass1(interfaceC1033a, context, str), 2, true);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1375a(IdSupplier idSupplier, InterfaceC1033a interfaceC1033a) {
        String oaid = idSupplier != null ? idSupplier.getOAID() : "";
        if (TextUtils.isEmpty(oaid)) {
            if (interfaceC1033a != null) {
                interfaceC1033a.mo1322a();
            }
        } else if (interfaceC1033a != null) {
            interfaceC1033a.mo1323a(oaid, false);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1376a() {
        String strM1372a = m1372a("ro.build.freeme.label");
        return !TextUtils.isEmpty(strM1372a) && strM1372a.equalsIgnoreCase("FREEMEOS");
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1377a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.coolpad.deviceidsupport", 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m1378b(Context context) {
        try {
            return new a(context).f2308b;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m1380b(IdSupplier idSupplier, InterfaceC1033a interfaceC1033a) {
        String oaid = idSupplier != null ? idSupplier.getOAID() : "";
        if (TextUtils.isEmpty(oaid)) {
            if (interfaceC1033a != null) {
                interfaceC1033a.mo1322a();
            }
        } else if (interfaceC1033a != null) {
            interfaceC1033a.mo1323a(oaid, false);
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m1381b() {
        String strM1372a = m1372a("ro.ssui.product");
        return (TextUtils.isEmpty(strM1372a) || strM1372a.equalsIgnoreCase("unknown")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m1382c(final Context context, final InterfaceC1033a interfaceC1033a) {
        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.china.a.b.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    ATChinaSDKHandler.handleInitOaidSDK(context.getApplicationContext(), new OaidSDKCallbackListener() { // from class: com.anythink.china.a.b.2.1
                        @Override // com.anythink.china.api.OaidSDKCallbackListener
                        public final void OnSupport(boolean z, IdSupplier idSupplier) {
                            C1052b.m1375a(idSupplier, interfaceC1033a);
                        }

                        @Override // com.anythink.china.api.OaidSDKCallbackListener
                        public final void onSupport(IdSupplier idSupplier) {
                            C1052b.m1375a(idSupplier, interfaceC1033a);
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        }, 2, true);
    }

    /* JADX INFO: renamed from: c */
    private static boolean m1383c() {
        String strM1372a = m1372a("ro.build.freeme.label");
        return (TextUtils.isEmpty(strM1372a) || strM1372a.equalsIgnoreCase("unknown")) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m1384d() {
        return m1372a("ro.odm.manufacturer").equalsIgnoreCase("PRIZE");
    }
}
