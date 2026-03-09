package cn.haorui.sdk.core.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.core.C0479a;
import cn.haorui.sdk.core.HRConfig;
import cn.haorui.sdk.core.p002ad.AdType;
import com.anythink.china.common.C1082d;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATCustomRuleKeys;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.umeng.commonsdk.proguard.C3471v;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class RequestUtil {
    private static final String NETWORK_2G = "4";
    private static final String NETWORK_3G = "3";
    private static final String NETWORK_4G = "2";
    private static final String NETWORK_5G = "6";
    private static final String NETWORK_UNKNOWN = "-1";
    private static final String NETWORK_WIFI = "1";
    private static final String TAG = "RequestUtil";
    private static String androidId;
    private static String appName;
    private static String boot_id;
    private static String cpuInfo;
    private static String deviceType;
    private static String device_appstore_ver;
    private static String device_available;
    private static String device_cupname;
    private static String device_hmscore;
    private static String device_sysfont;
    private static String device_totalSize;
    private static DisplayMetrics displayMetrics;
    private static String h5AppType;
    private static String imei;
    private static String imsi;
    private static String install_time;
    private static String mac;
    private static String orientation;
    private static String packageName;
    private static String performance;
    private static String publicKeySha1;
    private static String romVersion;
    private static Map<String, String> shakeMap = new HashMap();
    private static String ssid;
    private static String syscmpTime;
    private static String update_time;
    private static String userAgent;
    private static String versionName;
    private static String wifiMac;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.RequestUtil$a */
    public static class C0579a implements SensorEventListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f277a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SensorManager f278b;

        public C0579a(String str, SensorManager sensorManager) {
            this.f277a = str;
            this.f278b = sensorManager;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (RequestUtil.shakeMap.containsKey(this.f277a)) {
                return;
            }
            float[] fArr = sensorEvent.values;
            RequestUtil.shakeMap.put(this.f277a, fArr[0] + "," + fArr[1] + "," + fArr[2]);
            SensorManager sensorManager = this.f278b;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        }
    }

    private static String execCmd(String str) {
        try {
            byte[] bArr = new byte[1024];
            return new String(bArr, 0, Runtime.getRuntime().exec(str).getInputStream().read(bArr), "utf-8").trim();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getAndroidId(Context context) {
        if (TextUtils.isEmpty(androidId)) {
            androidId = Settings.System.getString(context.getContentResolver(), "android_id");
        }
        return androidId;
    }

    public static String getAppName(Context context) {
        if (TextUtils.isEmpty(appName)) {
            try {
                appName = ((Object) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).loadLabel(context.getPackageManager())) + "";
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return appName;
    }

    public static String getAppStoreName(Context context) {
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        lowerCase.hashCode();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "oneplus":
                return "com.oneplus.market";
            case "huawei":
                return "com.huawei.appmarket";
            case "xiaomi":
                return "com.xiaomi.market";
            case "oppo":
                try {
                    if (context.getPackageManager().getPackageInfo("com.heytap.market", 0) != null) {
                        return "com.heytap.market";
                    }
                } catch (Exception unused) {
                }
                return "com.oppo.market";
            case "vivo":
                return "com.bbk.appstore";
            case "meizu":
                return "com.meizu.mstore";
            case "samsung":
                return "com.sec.android.app.samsungapps";
            default:
                return null;
        }
    }

    public static String getAppStoreVersionCode(Context context) {
        if (device_appstore_ver == null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(getAppStoreName(context), 0);
                if (packageInfo != null) {
                    device_appstore_ver = String.valueOf(packageInfo.versionCode);
                }
            } catch (Exception unused) {
                device_appstore_ver = null;
            }
        }
        return device_appstore_ver;
    }

    public static void getAvailableInternalMemorySize() {
        if (TextUtils.isEmpty(device_available)) {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            device_available = decimalFormat.format((((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / 1048576);
        }
    }

    private static Integer getBatteryPercentage(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Integer.valueOf(((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4));
        }
        return null;
    }

    private static void getBoot() {
        if (TextUtils.isEmpty(boot_id)) {
            try {
                char[] cArr = new char[36];
                if (36 == new FileReader("/proc/sys/kernel/random/boot_id").read(cArr)) {
                    boot_id = String.valueOf(cArr);
                }
            } catch (Exception unused) {
            }
        }
    }

    private static String getCpuInfo() {
        if (cpuInfo == null) {
            cpuInfo = execCmd("getprop ro.config.cpu_info_display");
        }
        return cpuInfo;
    }

    public static void getCpuName() {
        if (!TextUtils.isEmpty(device_cupname)) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return;
                } else if (line.contains("Hardware")) {
                    String str = line.split(":")[1];
                    device_cupname = str;
                    if (!TextUtils.isEmpty(str)) {
                        device_cupname = device_cupname.trim();
                    }
                }
            }
        } catch (IOException unused) {
        }
    }

    private static void getDeviceInfo(Context context, Map<String, String> map) {
        if (AdSdk.adConfig().customController() == null || AdSdk.adConfig().customController().isCanUseImei()) {
            getImei(context);
        } else if (AdSdk.adConfig().customController().getImei() != null) {
            imei = AdSdk.adConfig().customController().getImei();
        }
        if (!TextUtils.isEmpty(imei)) {
            map.put("device_imei", imei);
        }
        if (!TextUtils.isEmpty(AdSdk.getLocalOaid()) && !"unknown".equals(AdSdk.getLocalOaid())) {
            map.put("device_oaid", AdSdk.getLocalOaid());
        }
        if (!TextUtils.isEmpty(AdSdk.getLocalOaid())) {
            map.put("m_oaid", AdSdk.getLocalOaid());
        }
        if (AdSdk.adConfig().customController() == null || AdSdk.adConfig().customController().isCanUseAndroidId()) {
            getAndroidId(context);
        } else if (AdSdk.adConfig().customController().getAndroidId() != null) {
            androidId = AdSdk.adConfig().customController().getAndroidId();
        }
        if (!TextUtils.isEmpty(androidId)) {
            map.put("device_adid", androidId);
        }
        if (AdSdk.adConfig().customController() == null || AdSdk.adConfig().customController().canUseMacAddress()) {
            getMac(context);
            getSsidAndWifiMac(context);
        } else if (AdSdk.adConfig().customController().getMacAddress() != null) {
            mac = AdSdk.adConfig().customController().getMacAddress();
        }
        if (!TextUtils.isEmpty(mac)) {
            map.put("device_mac", mac);
        }
        if (!TextUtils.isEmpty(AdSdk.adConfig().userId())) {
            map.put("user_id", AdSdk.adConfig().userId());
        }
        String imsi2 = getIMSI(context);
        imsi = imsi2;
        if (!TextUtils.isEmpty(imsi2)) {
            map.put("device_imsi", imsi);
        }
        if (!TextUtils.isEmpty(ssid)) {
            map.put("device_ssid", ssid);
        }
        if (TextUtils.isEmpty(wifiMac)) {
            return;
        }
        map.put("device_wifi_mac", wifiMac);
    }

    private static String getDeviceType(Context context) {
        if (deviceType == null) {
            deviceType = (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? "1" : "0";
        }
        return deviceType;
    }

    private static DisplayMetrics getDisplayMetrics(Context context) {
        if (displayMetrics == null) {
            displayMetrics = context.getResources().getDisplayMetrics();
        }
        return displayMetrics;
    }

    public static void getFontSize() {
        if (TextUtils.isEmpty(device_sysfont)) {
            try {
                Configuration configuration = new Configuration();
                Class<?> cls = Class.forName("android.app.ActivityManagerNative");
                Object objInvoke = cls.getMethod("getDefault", new Class[0]).invoke(cls, new Object[0]);
                configuration.updateFrom((Configuration) objInvoke.getClass().getMethod("getConfiguration", new Class[0]).invoke(objInvoke, new Object[0]));
                device_sysfont = configuration.fontScale + "";
            } catch (Exception unused) {
            }
        }
    }

    private static String getH5AppType(Context context) {
        if (h5AppType == null) {
            try {
                h5AppType = Intent.parseUri("hap://app/", 0).resolveActivity(context.getPackageManager()) != null ? "1" : "";
            } catch (Throwable unused) {
            }
        }
        return h5AppType;
    }

    private static void getHMS_VersionCode(Context context) {
        String str;
        try {
            PackageInfo packageInfo = getPackageInfo(context, "com.huawei.hwid");
            if (packageInfo != null) {
                if (packageInfo.versionCode >= 0) {
                    str = packageInfo.versionCode + "";
                } else {
                    str = null;
                }
                device_hmscore = str;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[Catch: Exception -> 0x0065, TryCatch #3 {Exception -> 0x0065, blocks: (B:4:0x0008, B:19:0x0049, B:21:0x0051, B:23:0x005a, B:25:0x0062, B:18:0x0045), top: B:39:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getIMSI(android.content.Context r3) {
        /*
            java.lang.String r0 = cn.haorui.sdk.core.utils.RequestUtil.imsi
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L65
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch: java.lang.Exception -> L65
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Exception -> L65
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L2b
            r2 = 28
            if (r1 > r2) goto L2b
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            int r3 = androidx.core.content.ContextCompat.checkSelfPermission(r3, r1)     // Catch: java.lang.Exception -> L2b
            if (r3 != 0) goto L2b
            java.lang.String r3 = r0.getSubscriberId()     // Catch: java.lang.Exception -> L2b
            cn.haorui.sdk.core.utils.RequestUtil.imsi = r3     // Catch: java.lang.Exception -> L2b
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2b
            if (r3 != 0) goto L2b
            goto L49
        L2b:
            java.lang.String r3 = r0.getSimOperator()     // Catch: java.lang.Exception -> L38
            cn.haorui.sdk.core.utils.RequestUtil.imsi = r3     // Catch: java.lang.Exception -> L38
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L38
            if (r3 != 0) goto L38
            goto L49
        L38:
            java.lang.String r3 = r0.getNetworkOperator()     // Catch: java.lang.Exception -> L45
            cn.haorui.sdk.core.utils.RequestUtil.imsi = r3     // Catch: java.lang.Exception -> L45
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L45
            if (r3 != 0) goto L45
            goto L49
        L45:
            java.lang.String r3 = ""
            cn.haorui.sdk.core.utils.RequestUtil.imsi = r3     // Catch: java.lang.Exception -> L65
        L49:
            java.lang.String r3 = cn.haorui.sdk.core.utils.RequestUtil.imsi     // Catch: java.lang.Exception -> L65
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L65
            if (r3 != 0) goto L65
            java.lang.String r3 = cn.haorui.sdk.core.utils.RequestUtil.imsi     // Catch: java.lang.Exception -> L65
            int r3 = r3.length()     // Catch: java.lang.Exception -> L65
            r0 = 5
            if (r3 <= r0) goto L62
            java.lang.String r3 = cn.haorui.sdk.core.utils.RequestUtil.imsi     // Catch: java.lang.Exception -> L65
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)     // Catch: java.lang.Exception -> L65
            return r3
        L62:
            java.lang.String r3 = cn.haorui.sdk.core.utils.RequestUtil.imsi     // Catch: java.lang.Exception -> L65
            return r3
        L65:
            java.lang.String r3 = cn.haorui.sdk.core.utils.RequestUtil.imsi
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.core.utils.RequestUtil.getIMSI(android.content.Context):java.lang.String");
    }

    public static String getImei(Context context) {
        try {
            if (TextUtils.isEmpty(imei)) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (ContextCompat.checkSelfPermission(context, C1082d.f2501a) == 0) {
                    int i = Build.VERSION.SDK_INT;
                    imei = i >= 29 ? null : i >= 26 ? telephonyManager.getImei() : telephonyManager.getDeviceId();
                }
            }
        } catch (Exception unused) {
        }
        return imei;
    }

    private static String getLanguageCountry(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    private static Locale getLocale(Context context) {
        return context.getResources().getConfiguration().locale;
    }

    private static String getMac(Context context) {
        if (TextUtils.isEmpty(mac)) {
            mac = AddressUtils.getMac(context);
        }
        return mac;
    }

    public static String getNetworkType(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "-1";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "1";
        }
        if (activeNetworkInfo.getType() != 0) {
            return "-1";
        }
        switch (activeNetworkInfo.getSubtype()) {
        }
        return "-1";
    }

    private static PackageInfo getPackageInfo(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String getPackageName(Context context) {
        if (TextUtils.isEmpty(packageName)) {
            packageName = context.getPackageName();
        }
        return packageName;
    }

    public static Map<String, String> getParams(@NonNull Context context, String str, AdType adType, long j, long j2) throws Throwable {
        Location location;
        HRConfig hRConfigAdConfig = AdSdk.adConfig();
        HashMap map = new HashMap();
        map.put("version", "20230916");
        if (!TextUtils.isEmpty(str)) {
            map.put(C1485b.f6981aB, str);
        }
        if (CacheUtil.getInstance().getTemplateCache(context) != null) {
            map.put("fel_mtime", CacheUtil.getInstance().getTemplateCache(context).getMtime() + "");
        }
        map.put("is_mobile", "1");
        map.put("msec", System.currentTimeMillis() + "");
        map.put("init_uuid", HRConfig.initUUID());
        map.put("init_time", Long.toString(HRConfig.initTime()));
        map.put("all_times", Long.toString(j));
        map.put("type_times", Long.toString(j2));
        if (TextUtils.isEmpty(install_time)) {
            install_time = AdSdk.getSharedPreferences().getString("install_time", "");
        }
        int wxApi = getWxApi(context);
        if (wxApi != -1) {
            map.put("wxapi", String.valueOf(wxApi));
        }
        map.put("install_time", install_time);
        map.put("secure", String.valueOf(hRConfigAdConfig.secure()));
        if (!TextUtils.isEmpty(hRConfigAdConfig.userGender())) {
            map.put(ATCustomRuleKeys.GENDER, hRConfigAdConfig.userGender());
        }
        if (hRConfigAdConfig.userAge() != null) {
            map.put("yob", String.valueOf(Calendar.getInstance().get(1) - hRConfigAdConfig.userAge().intValue()));
        }
        if (!TextUtils.isEmpty(hRConfigAdConfig.userKeywords())) {
            map.put("keywords", hRConfigAdConfig.userKeywords());
        }
        if (!TextUtils.isEmpty(hRConfigAdConfig.userExt())) {
            map.put("ext", hRConfigAdConfig.userExt());
        }
        if (!TextUtils.isEmpty("")) {
            map.put("third_party_sdk", "");
        }
        if (hRConfigAdConfig.userType() != null) {
            map.put("user_type", hRConfigAdConfig.userType().toString());
        }
        getPackageName(context);
        if (!TextUtils.isEmpty(packageName)) {
            map.put("app_package", packageName);
        }
        map.put("app_id", C0479a.m18a(HRConstants.PLATFORM_HR).config().getAppId());
        if (!TextUtils.isEmpty(hRConfigAdConfig.userDenyCats())) {
            map.put("deny_cats", hRConfigAdConfig.userDenyCats());
        }
        if (!TextUtils.isEmpty(hRConfigAdConfig.userDenyCids())) {
            map.put("deny_cids", hRConfigAdConfig.userDenyCids());
        }
        if (!TextUtils.isEmpty(hRConfigAdConfig.userDenyAderIds())) {
            map.put("deny_ader_ids", hRConfigAdConfig.userDenyAderIds());
        }
        getH5AppType(context);
        if (!TextUtils.isEmpty(h5AppType)) {
            map.put("h5_app_type", h5AppType);
        }
        getAppName(context);
        if (!TextUtils.isEmpty(appName)) {
            map.put(ATAdConst.KEY.APP_NAME, appName);
        }
        getVersionName(context);
        if (!TextUtils.isEmpty(versionName)) {
            map.put("app_ver", versionName);
        }
        getAppStoreVersionCode(context);
        if (!TextUtils.isEmpty(device_appstore_ver)) {
            map.put("device_appstore_ver", device_appstore_ver);
        }
        if (AdSdk.adConfig().customController() == null ? (location = new GPSUtils(context).getLocation()) != null : !(!AdSdk.adConfig().customController().isCanUseLocation() || (location = new GPSUtils(context).getLocation()) == null)) {
            map.put("device_geo_lat", Double.valueOf(location.getLatitude()).toString());
            map.put("device_geo_lon", Double.valueOf(location.getLongitude()).toString());
        }
        if (AdSdk.adConfig().customController() == null || AdSdk.adConfig().customController().enablePersonalRecommend()) {
            getDeviceInfo(context, map);
        } else {
            if (!TextUtils.isEmpty(AdSdk.getLocalOaid()) && !"unknown".equals(AdSdk.getLocalOaid())) {
                map.put("device_oaid", AdSdk.getLocalOaid());
            }
            if (!TextUtils.isEmpty(AdSdk.getLocalOaid())) {
                map.put("m_oaid", AdSdk.getLocalOaid());
            }
        }
        int oaid_errno = AdSdk.getOaid_errno();
        if (oaid_errno != -1) {
            AdSdk.setOaid_errno(-1);
            map.put("oaid_errno", oaid_errno + "");
        }
        getHMS_VersionCode(context);
        if (!TextUtils.isEmpty(device_hmscore)) {
            map.put("device_hmscore", device_hmscore);
        }
        getDisplayMetrics(context);
        DisplayMetrics displayMetrics2 = displayMetrics;
        if (displayMetrics2 != null) {
            map.put("device_ppi", String.valueOf(displayMetrics2.densityDpi));
            map.put("device_width", String.valueOf(displayMetrics.widthPixels));
            map.put("device_height", String.valueOf(displayMetrics.heightPixels));
            map.put("device_density", String.valueOf(displayMetrics.density));
        }
        String str2 = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str2)) {
            map.put("device_type_os", str2);
        }
        int i = Build.VERSION.SDK_INT;
        if (i != 0) {
            map.put("device_apiLevel", String.valueOf(i));
            map.put("device_api_level", String.valueOf(i));
        }
        Integer batteryPercentage = getBatteryPercentage(context);
        if (batteryPercentage != null) {
            map.put("device_battery_level", String.valueOf(batteryPercentage));
        }
        getDeviceType(context);
        if (!TextUtils.isEmpty(deviceType)) {
            map.put(C3471v.f18948ab, deviceType);
        }
        String str3 = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str3)) {
            map.put(C3471v.f18922C, str3);
        }
        String str4 = Build.BRAND;
        if (!TextUtils.isEmpty(str4)) {
            map.put(C3471v.f18920A, str4);
        }
        String str5 = Build.MODEL;
        if (!TextUtils.isEmpty(str5)) {
            map.put("device_model", str5);
        }
        String networkType = getNetworkType(context);
        if (!TextUtils.isEmpty(networkType)) {
            map.put("device_network", networkType);
        }
        map.put("device_os", "Android");
        if (TextUtils.isEmpty(userAgent)) {
            getUserAgent(context);
        }
        if (!TextUtils.isEmpty(userAgent)) {
            map.put("device_ua", userAgent);
        }
        getScreenOrientation(context);
        if (!TextUtils.isEmpty(orientation)) {
            map.put("device_orientation", orientation);
        }
        Locale locale = getLocale(context);
        if (locale != null) {
            map.put(C3471v.f18929J, locale.getCountry());
            map.put("language", locale.getLanguage());
        }
        getPublicKeySha1(context);
        if (!TextUtils.isEmpty(publicKeySha1)) {
            map.put(C3471v.f18978k, publicKeySha1);
        }
        if (!TextUtils.isEmpty("1.4.6.8")) {
            map.put("sdk_version", "1.4.6.8");
            map.put("sdk_version_code", Long.toString(1040608L));
        }
        if (adType != null) {
            map.put("accept_ad_type", String.valueOf(adType.value()));
        }
        getPerformance(context);
        if (!TextUtils.isEmpty(performance)) {
            map.put("device_performance", performance);
        }
        getRomVersion();
        if (!TextUtils.isEmpty(romVersion)) {
            map.put("device_rom_version", romVersion);
        }
        getSyscmpTime();
        if (!TextUtils.isEmpty(syscmpTime)) {
            map.put("device_syscmp_time", syscmpTime);
        }
        getTotalInternalMemorySize();
        if (!TextUtils.isEmpty(device_totalSize)) {
            map.put("device_disk_total", device_totalSize);
        }
        getAvailableInternalMemorySize();
        if (!TextUtils.isEmpty(device_available)) {
            map.put("device_disk_free", device_available);
        }
        getFontSize();
        if (!TextUtils.isEmpty(device_sysfont)) {
            map.put("device_font_size", device_sysfont);
        }
        getCpuName();
        if (!TextUtils.isEmpty(device_cupname)) {
            map.put("device_cpu_model", device_cupname);
        }
        getShakeData(context, str);
        if (shakeMap.containsKey(str)) {
            map.put("device_acceleration", shakeMap.get(str));
        }
        getUpdate();
        if (!TextUtils.isEmpty(update_time)) {
            map.put("device_update_mark", update_time);
        }
        getBoot();
        if (!TextUtils.isEmpty(boot_id)) {
            map.put("device_boot_mark", boot_id);
        }
        if (PackConfigUtil.dclk != null) {
            map.put("dclk_s", PackConfigUtil.dclk.getStatus() + "");
        }
        String singleClick = RecordUtil.getSingleClick(str);
        if (singleClick != null) {
            map.put("dclk_p", singleClick);
        }
        String allClick = RecordUtil.getAllClick();
        if (allClick != null) {
            map.put("dclk_a", allClick);
        }
        PckIdBean pckIdBean = PackConfigUtil.requirePck;
        if (pckIdBean != null) {
            String app_y = pckIdBean.getApp_y();
            String app_n = PackConfigUtil.requirePck.getApp_n();
            if (!TextUtils.isEmpty(app_y)) {
                if (app_y.startsWith(".")) {
                    app_y = app_y.substring(1);
                }
                map.put("app_y", app_y);
            }
            if (!TextUtils.isEmpty(app_n)) {
                if (app_n.startsWith(".")) {
                    app_n = app_n.substring(1);
                }
                map.put("app_n", app_n);
            }
        }
        return map;
    }

    private static String getPerformance(Context context) throws Throwable {
        FileReader fileReader;
        if (performance == null) {
            String[] strArr = {"-1", "-1", "-1"};
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader("/proc/meminfo");
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(fileReader, 8192);
                    try {
                        strArr[1] = Integer.toString(Math.round(Integer.valueOf(bufferedReader2.readLine().split("\\s+")[1]).intValue() / 1024));
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused) {
                        }
                    } catch (IOException unused2) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (fileReader != null) {
                        }
                        strArr[2] = Integer.toString(0);
                        performance = TextUtils.join(C1801a.f11059bQ, strArr);
                        return performance;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (fileReader == null) {
                            throw th;
                        }
                        try {
                            fileReader.close();
                            throw th;
                        } catch (IOException unused5) {
                            throw th;
                        }
                    }
                } catch (IOException unused6) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused7) {
                fileReader = null;
            } catch (Throwable th3) {
                th = th3;
                fileReader = null;
            }
            try {
                fileReader.close();
            } catch (IOException unused8) {
            }
            strArr[2] = Integer.toString(0);
            performance = TextUtils.join(C1801a.f11059bQ, strArr);
        }
        return performance;
    }

    private static String getPublicKeySha1(Context context) {
        if (publicKeySha1 == null) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatureArr.length > 0) {
                    publicKeySha1 = sha1(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded());
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            } catch (CertificateException e2) {
                e2.printStackTrace();
            }
        }
        return publicKeySha1;
    }

    public static String getRomVersion() {
        String str;
        if (romVersion == null) {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            lowerCase.hashCode();
            lowerCase.hashCode();
            switch (lowerCase) {
                case "smartisan":
                    str = "getprop ro.smartisan.version";
                    break;
                case "huawei":
                case "xiaomi":
                    str = "getprop ro.build.version.incremental";
                    break;
                case "oppo":
                    str = "getprop ro.build.version.ota";
                    break;
                case "vivo":
                    str = "getprop ro.vivo.product.version";
                    break;
                case "meizu":
                    str = "getprop ro.build.display.id";
                    break;
                case "lemobile":
                    str = "getprop ro.letv.release.version";
                    break;
                default:
                    str = "getprop ro.build.version.release";
                    break;
            }
            romVersion = execCmd(str);
        }
        return romVersion;
    }

    private static String getScreenOrientation(Context context) {
        if (TextUtils.isEmpty(orientation)) {
            int i = context.getResources().getConfiguration().orientation;
            orientation = i != 1 ? i != 2 ? "-1" : "1" : "0";
        }
        return orientation;
    }

    public static void getShakeData(Context context, String str) {
        if (shakeMap.containsKey(str)) {
            return;
        }
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService(C3471v.f18942W);
        sensorManager.registerListener(new C0579a(str, sensorManager), sensorManager.getDefaultSensor(1), 3);
    }

    private static void getSsidAndWifiMac(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null || wifiManager.getConnectionInfo() == null) {
                ssid = null;
                wifiMac = null;
            } else {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                wifiMac = connectionInfo.getBSSID();
                ssid = connectionInfo.getSSID().replace("\"", "");
            }
        } catch (Exception unused) {
            ssid = null;
            wifiMac = null;
        }
    }

    private static String getSyscmpTime() {
        if (syscmpTime == null) {
            syscmpTime = execCmd("getprop ro.vendor.build.date.utc");
        }
        return syscmpTime;
    }

    public static void getTotalInternalMemorySize() {
        if (TextUtils.isEmpty(device_totalSize)) {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            device_totalSize = decimalFormat.format((((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1048576);
        }
    }

    private static void getUpdate() {
        if (TextUtils.isEmpty(update_time)) {
            try {
                byte[] bArr = new byte[256];
                String[] strArrSplit = new String(bArr, 0, Runtime.getRuntime().exec("stat -c %X.%x /data/data").getInputStream().read(bArr), "utf-8").trim().split("[ \\|.]");
                if (strArrSplit != null) {
                    update_time = String.format("%d.%09d", Integer.valueOf(strArrSplit.length > 0 ? Integer.valueOf(strArrSplit[0]).intValue() : 0), Long.valueOf(strArrSplit.length > 3 ? Long.valueOf(strArrSplit[3]).longValue() : 0L));
                }
            } catch (Exception unused) {
            }
        }
    }

    private static String getUserAgent(Context context) {
        try {
            if (userAgent == null) {
                userAgent = WebSettings.getDefaultUserAgent(context);
            }
        } catch (Throwable unused) {
        }
        return userAgent;
    }

    private static String getVersionName(Context context) {
        if (versionName == null) {
            try {
                versionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return versionName;
    }

    private static int getWxApi(Context context) {
        try {
            String wxAppid = AdSdk.adConfig().getWxAppid();
            if (TextUtils.isEmpty(wxAppid)) {
                return -1;
            }
            Class<?> cls = Class.forName("com.tencent.mm.opensdk.openapi.BaseWXApiImplV10");
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(Context.class, String.class, Boolean.TYPE, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((Integer) cls.getDeclaredMethod("getWXAppSupportAPI", new Class[0]).invoke(declaredConstructor.newInstance(context, wxAppid, Boolean.TRUE, 2), new Object[0])).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void setRomVersion(String str) {
        romVersion = str;
    }

    public static void setUserAgent(String str) {
        userAgent = str;
    }

    public static String sha1(byte[] bArr) {
        try {
            return StringUtils.byte2hex(MessageDigest.getInstance("SHA1").digest(bArr)).toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Map<String, String> wrapParams(@NonNull Context context, @NonNull String str, @NonNull AdType adType, long j, long j2) {
        String appId = C0479a.m18a(HRConstants.PLATFORM_HR).config().getAppId();
        if (TextUtils.isEmpty(appId) || TextUtils.isEmpty(str) || adType == null) {
            LogUtil.m87e(TAG, String.format(Locale.US, "wrapParams pid or appId or ad Type is empty: %s %s %s", appId, str, String.valueOf(adType)));
        }
        return getParams(context, str, adType, j, j2);
    }
}
