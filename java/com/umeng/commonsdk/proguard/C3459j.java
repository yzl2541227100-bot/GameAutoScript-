package com.umeng.commonsdk.proguard;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.widget.ActivityChooserModel;
import com.anythink.china.common.C1082d;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.common.C3489e;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p285z2.C3902g6;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.j */
/* JADX INFO: loaded from: classes2.dex */
public class C3459j {

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f18823a;

        /* JADX INFO: renamed from: b */
        public String f18824b;
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.j$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public String f18825a = null;

        /* JADX INFO: renamed from: b */
        public int f18826b = -1;

        /* JADX INFO: renamed from: c */
        public String f18827c = null;
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.j$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public int f18828a;

        /* JADX INFO: renamed from: b */
        public String f18829b;

        /* JADX INFO: renamed from: c */
        public String f18830c;

        /* JADX INFO: renamed from: d */
        public int f18831d;

        /* JADX INFO: renamed from: e */
        public int f18832e;

        /* JADX INFO: renamed from: f */
        public int f18833f;

        /* JADX INFO: renamed from: g */
        public int f18834g;

        /* JADX INFO: renamed from: h */
        public String f18835h;

        /* JADX INFO: renamed from: i */
        public int f18836i;

        /* JADX INFO: renamed from: j */
        public int f18837j;

        /* JADX INFO: renamed from: k */
        public int f18838k;

        /* JADX INFO: renamed from: l */
        public long f18839l;
    }

    /* JADX INFO: renamed from: a */
    public static float m15917a(Context context) {
        if (context == null) {
            return 0.0f;
        }
        Configuration configuration = new Configuration();
        try {
            configuration.updateFrom(context.getResources().getConfiguration());
            return configuration.fontScale;
        } catch (Exception e) {
            C3489e.m16350e("getFontSize:" + e.getMessage());
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m15918a(Context context, String str) {
        if (context == null) {
            return 0L;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            C3454e.m15904a(context, e);
            C3489e.m16350e("getAppFirstInstallTime" + e.getMessage());
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m15919a(BluetoothAdapter bluetoothAdapter) {
        if (bluetoothAdapter == null) {
            return null;
        }
        Class<?> cls = bluetoothAdapter.getClass();
        try {
            Class<?> cls2 = Class.forName("android.bluetooth.IBluetooth");
            Field declaredField = cls.getDeclaredField("mService");
            declaredField.setAccessible(true);
            Method method = cls2.getMethod("getAddress", new Class[0]);
            method.setAccessible(true);
            return (String) method.invoke(declaredField.get(bluetoothAdapter), new Object[0]);
        } catch (Exception unused) {
            return bluetoothAdapter.getAddress();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15920a() {
        return new C3465p().m15984a();
    }

    /* JADX INFO: renamed from: b */
    public static long m15921b(Context context, String str) {
        if (context == null) {
            return 0L;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            C3454e.m15904a(context, e);
            C3489e.m16350e("getAppLastUpdateTime:" + e.getMessage());
            return 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m15922b() {
        return new SimpleDateFormat().format(new Date());
    }

    /* JADX INFO: renamed from: b */
    public static List<ScanResult> m15923b(Context context) {
        WifiManager wifiManager;
        List<ScanResult> scanResults = null;
        if (context == null || (wifiManager = (WifiManager) context.getSystemService("wifi")) == null) {
            return null;
        }
        if (!DeviceConfig.checkPermission(context, "android.permission.ACCESS_WIFI_STATE") || (scanResults = wifiManager.getScanResults()) == null || scanResults.size() == 0) {
        }
        return scanResults;
    }

    /* JADX INFO: renamed from: c */
    public static long m15924c() {
        if (!m15938h() || Build.VERSION.SDK_INT < 9) {
            return 0L;
        }
        return Environment.getExternalStorageDirectory().getFreeSpace();
    }

    /* JADX INFO: renamed from: c */
    public static WifiInfo m15925c(Context context) {
        WifiManager wifiManager;
        if (context == null || !DeviceConfig.checkPermission(context, "android.permission.ACCESS_WIFI_STATE") || (wifiManager = (WifiManager) context.getSystemService("wifi")) == null) {
            return null;
        }
        return wifiManager.getConnectionInfo();
    }

    /* JADX INFO: renamed from: c */
    public static String m15926c(Context context, String str) {
        try {
            return context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception e) {
            C3454e.m15904a(context, e);
            C3489e.m16350e("getAppInstaller:" + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m15927d(Context context, String str) {
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(str, 0).applicationInfo;
            if (applicationInfo != null) {
                return applicationInfo.uid;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException e) {
            C3454e.m15904a(context, e);
            C3489e.m16350e("getAppUid:" + e.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m15928d() {
        if (!m15938h() || Build.VERSION.SDK_INT < 9) {
            return 0L;
        }
        return Environment.getExternalStorageDirectory().getTotalSpace();
    }

    /* JADX INFO: renamed from: d */
    public static void m15929d(Context context) {
        if (context == null) {
            return;
        }
        UMWorkDispatch.sendEvent(context, C3408a.f18662j, C3435b.m15851a(context).m15852a(), null);
    }

    /* JADX INFO: renamed from: e */
    public static String m15930e() {
        return C3464o.m15975a("df");
    }

    /* JADX INFO: renamed from: e */
    private static String m15931e(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                return (String) applicationInfo.loadLabel(context.getPackageManager());
            }
            return null;
        } catch (Exception e) {
            C3489e.m16350e("getLabel:" + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static JSONArray m15932e(Context context) {
        if (context == null) {
            return null;
        }
        return C3463n.m15972b(context);
    }

    /* JADX INFO: renamed from: f */
    public static long m15933f() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: f */
    public static void m15934f(Context context) {
        if (context == null) {
            return;
        }
        C3463n.m15973c(context);
    }

    /* JADX INFO: renamed from: g */
    public static int m15935g(Context context) {
        WifiManager wifiManager;
        if (context == null || !DeviceConfig.checkPermission(context, "android.permission.ACCESS_WIFI_STATE") || (wifiManager = (WifiManager) context.getSystemService("wifi")) == null) {
            return -1;
        }
        return wifiManager.getWifiState();
    }

    /* JADX INFO: renamed from: g */
    public static String m15936g() {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            String string = declaredMethod.invoke(null, "net.hostname").toString();
            return (string == null || string.endsWith("")) ? string : HelperUtils.getUmengMD5(string);
        } catch (Exception e) {
            C3489e.m16350e("getHostName:" + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m15937h(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", C3902g6.OooO0O0));
    }

    /* JADX INFO: renamed from: h */
    private static boolean m15938h() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    /* JADX INFO: renamed from: i */
    public static int m15939i(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", C3902g6.OooO0O0));
    }

    /* JADX INFO: renamed from: j */
    public static DisplayMetrics m15940j(Context context) {
        if (context == null) {
            return null;
        }
        return context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: k */
    public static String m15941k(Context context) {
        TelephonyManager telephonyManager;
        if (context == null || !DeviceConfig.checkPermission(context, C1082d.f2501a) || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            return null;
        }
        return telephonyManager.getSubscriberId();
    }

    /* JADX INFO: renamed from: l */
    public static String m15942l(Context context) {
        if (context == null) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (!DeviceConfig.checkPermission(context, C1082d.f2501a) || telephonyManager == null) {
            return null;
        }
        return Build.VERSION.SDK_INT < 26 ? telephonyManager.getDeviceId() : m15950t(context);
    }

    /* JADX INFO: renamed from: m */
    public static List<InputMethodInfo> m15943m(Context context) {
        if (context == null) {
            return null;
        }
        return ((InputMethodManager) context.getSystemService("input_method")).getInputMethodList();
    }

    /* JADX INFO: renamed from: n */
    public static void m15944n(Context context) {
        if (context == null) {
            return;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            b bVar = new b();
            if (DeviceConfig.checkPermission(context, "android.permission.BLUETOOTH") && defaultAdapter.isEnabled()) {
                bVar.f18826b = defaultAdapter.getState();
                bVar.f18825a = Build.VERSION.SDK_INT < 23 ? defaultAdapter.getAddress() : m15919a(defaultAdapter);
                bVar.f18827c = defaultAdapter.getName();
                UMWorkDispatch.sendEvent(context, C3408a.f18661i, C3435b.m15851a(context).m15852a(), bVar);
            }
        } catch (Exception e) {
            C3489e.m16350e("startBluethInfo:" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: o */
    public static JSONObject m15945o(Context context) {
        if (context == null) {
            return null;
        }
        return C3463n.m15968a(context);
    }

    /* JADX INFO: renamed from: p */
    public static List<a> m15946p(Context context) {
        String[] list;
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(Environment.getExternalStorageDirectory() + "/Android/data/");
            if (file.isDirectory() && (list = file.list()) != null && list.length > 0) {
                for (String str : list) {
                    if (str != null && !str.startsWith(".")) {
                        a aVar = new a();
                        aVar.f18823a = str;
                        aVar.f18824b = m15931e(context, str);
                        arrayList.add(aVar);
                    }
                }
            }
        } catch (Exception e) {
            C3489e.m16350e("getAppList:" + e.getMessage());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static ActivityManager.MemoryInfo m15947q(Context context) {
        if (context == null) {
            return null;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    /* JADX INFO: renamed from: r */
    public static String m15948r(Context context) {
        StringBuilder sb;
        String string = null;
        if (context == null) {
            return null;
        }
        if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
            try {
                String property = System.getProperty("http.agent");
                if (Build.VERSION.SDK_INT >= 17) {
                    sb = new StringBuilder();
                    new WebView(context).getSettings();
                    sb.append(WebSettings.getDefaultUserAgent(context));
                    sb.append("__");
                    sb.append(property);
                } else {
                    sb = new StringBuilder();
                    sb.append(new WebView(context).getSettings().getUserAgentString());
                    sb.append("__");
                    sb.append(property);
                }
                string = sb.toString();
            } catch (Exception e) {
                C3489e.m16350e("getUA:" + e.getMessage());
            }
            UMWorkDispatch.sendEvent(context, C3408a.f18663k, C3435b.m15851a(context).m15852a(), string);
        }
        return string;
    }

    /* JADX INFO: renamed from: s */
    public static String m15949s(Context context) {
        if (context == null) {
            return null;
        }
        return C3463n.m15974d(context);
    }

    /* JADX INFO: renamed from: t */
    private static String m15950t(Context context) {
        if (context == null) {
            return null;
        }
        try {
            Object objInvoke = Class.forName("android.telephony.TelephonyManager").getMethod("getMeid", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null || !(objInvoke instanceof String)) {
                return null;
            }
            return (String) objInvoke;
        } catch (Exception e) {
            C3489e.m16350e("meid:" + e.getMessage());
            return null;
        }
    }
}
