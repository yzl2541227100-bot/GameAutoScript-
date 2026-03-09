package cn.haorui.sdk.core.utils;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.core.HRConfig;
import cn.haorui.sdk.core.utils.PackageBean;
import com.anythink.china.common.C1082d;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.umeng.commonsdk.proguard.C3471v;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class PackConfigUtil {
    private static String PACKAGEKEY = "packageKey";
    private static final String TAG = "PackConfigUtil";
    private static String androidId;
    public static PackageBean.DClick dclk;
    private static String imei;
    private static String packageName;
    public static PckIdBean requirePck;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.PackConfigUtil$a */
    public static class C0577a implements HttpGetJsonCallback<OriginalResponse> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f275a;

        public C0577a(Context context) {
            this.f275a = context;
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetJsonCallback
        public void onFailure(@NotNull IOException iOException) {
            LogUtil.m87e(PackConfigUtil.TAG, iOException.toString());
            try {
                String string = AdSdk.getSharedPreferences().getString(PackConfigUtil.PACKAGEKEY, "");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                PackConfigUtil.checkPck(this.f275a, (PackageBean) new Gson().fromJson(string, PackageBean.class));
            } catch (JsonSyntaxException e) {
                e.printStackTrace();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0031 A[Catch: Exception -> 0x004a, TRY_LEAVE, TryCatch #0 {Exception -> 0x004a, blocks: (B:25:0x0002, B:28:0x000c, B:33:0x002b, B:35:0x0031, B:30:0x0016, B:32:0x001e), top: B:40:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        @Override // cn.haorui.sdk.core.utils.HttpGetJsonCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onResponse(cn.haorui.sdk.core.utils.OriginalResponse r4) {
            /*
                r3 = this;
                cn.haorui.sdk.core.utils.OriginalResponse r4 = (cn.haorui.sdk.core.utils.OriginalResponse) r4
                int r0 = r4.getCode()     // Catch: java.lang.Exception -> L4a
                r1 = 200(0xc8, float:2.8E-43)
                java.lang.String r2 = ""
                if (r0 != r1) goto L16
                java.lang.String r4 = r4.getBody()     // Catch: java.lang.Exception -> L4a
                java.lang.String r4 = cn.haorui.sdk.core.utils.SecurityHelper.decryptAES(r4)     // Catch: java.lang.Exception -> L4a
            L14:
                r2 = r4
                goto L2b
            L16:
                int r4 = r4.getCode()     // Catch: java.lang.Exception -> L4a
                r0 = 304(0x130, float:4.26E-43)
                if (r4 != r0) goto L2b
                android.content.SharedPreferences r4 = cn.haorui.sdk.core.AdSdk.getSharedPreferences()     // Catch: java.lang.Exception -> L4a
                java.lang.String r0 = cn.haorui.sdk.core.utils.PackConfigUtil.access$000()     // Catch: java.lang.Exception -> L4a
                java.lang.String r4 = r4.getString(r0, r2)     // Catch: java.lang.Exception -> L4a
                goto L14
            L2b:
                boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L4a
                if (r4 != 0) goto L4e
                com.google.gson.Gson r4 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L4a
                r4.<init>()     // Catch: java.lang.Exception -> L4a
                java.lang.Class<cn.haorui.sdk.core.utils.PackageBean> r0 = cn.haorui.sdk.core.utils.PackageBean.class
                java.lang.Object r4 = r4.fromJson(r2, r0)     // Catch: java.lang.Exception -> L4a
                cn.haorui.sdk.core.utils.PackageBean r4 = (cn.haorui.sdk.core.utils.PackageBean) r4     // Catch: java.lang.Exception -> L4a
                cn.haorui.sdk.core.utils.PackageBean$DClick r0 = r4.getDclk()     // Catch: java.lang.Exception -> L4a
                cn.haorui.sdk.core.utils.PackConfigUtil.dclk = r0     // Catch: java.lang.Exception -> L4a
                android.content.Context r0 = r3.f275a     // Catch: java.lang.Exception -> L4a
                cn.haorui.sdk.core.utils.PackConfigUtil.access$100(r0, r4)     // Catch: java.lang.Exception -> L4a
                goto L4e
            L4a:
                r4 = move-exception
                r4.printStackTrace()
            L4e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.core.utils.PackConfigUtil.C0577a.onResponse(java.lang.Object):void");
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.PackConfigUtil$b */
    public static class C0578b implements HttpGetJsonCallback<OriginalResponse> {
        @Override // cn.haorui.sdk.core.utils.HttpGetJsonCallback
        public void onFailure(@NotNull IOException iOException) {
            LogUtil.m87e(PackConfigUtil.TAG, iOException.toString());
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetJsonCallback
        public void onResponse(OriginalResponse originalResponse) {
            LogUtil.m87e(PackConfigUtil.TAG, originalResponse.getBody());
        }
    }

    private static void checkAndReportResult(Context context, List<PackageBean.AppBean.PackBean> list, List<PackageBean.AppBean.PackBean> list2, Integer num, String str, String str2) {
        try {
            requirePck = getPackBean(context, list, num.intValue());
            String strEncryptAES = SecurityHelper.encryptAES(generateData(context, getPackBean(context, list2, num.intValue()), str));
            HashMap map = new HashMap();
            map.put("data", strEncryptAES);
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            HttpUtil.asyncRequestJson(str2, null, map, null, new C0578b());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkPck(Context context, PackageBean packageBean) {
        if (packageBean != null) {
            String ver = packageBean.getVer();
            PackageBean.AppBean app = packageBean.getApp();
            if (app != null) {
                String url = app.getUrl();
                List<PackageBean.AppBean.PackBean> required = app.getRequired();
                List<PackageBean.AppBean.PackBean> others = app.getOthers();
                if (required.isEmpty() && others.isEmpty()) {
                    return;
                }
                checkAndReportResult(context, required, others, app.getTtl(), ver, url);
                try {
                    AdSdk.getSharedPreferences().edit().putString(PACKAGEKEY, new Gson().toJson(packageBean)).commit();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String generateData(android.content.Context r4, cn.haorui.sdk.core.utils.PckIdBean r5, java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.core.utils.PackConfigUtil.generateData(android.content.Context, cn.haorui.sdk.core.utils.PckIdBean, java.lang.String):java.lang.String");
    }

    public static String getAndroidId(Context context) {
        if (TextUtils.isEmpty(androidId)) {
            androidId = Settings.System.getString(context.getContentResolver(), "android_id");
        }
        return String.valueOf(androidId);
    }

    public static void getConfig(Context context) {
        PackageBean packageBean;
        String string = AdSdk.getSharedPreferences().getString(PACKAGEKEY, "");
        HashMap map = new HashMap();
        map.put("app_id", AdSdk.adConfig().appId());
        if (!TextUtils.isEmpty("1.4.6.8")) {
            map.put("sdk_version", "1.4.6.8");
            map.put("sdk_version_code", Long.toString(1040608L));
        }
        getPackageName(context);
        if (!TextUtils.isEmpty(packageName)) {
            map.put("app_package", packageName);
        }
        if (!TextUtils.isEmpty(AdSdk.getLocalOaid())) {
            map.put("device_oaid", AdSdk.getLocalOaid());
        }
        if (AdSdk.adConfig().customController() == null || !AdSdk.adConfig().customController().isCanUseAndroidId() || AdSdk.adConfig().customController().getAndroidId() == null) {
            getAndroidId(context);
        } else {
            androidId = AdSdk.adConfig().customController().getAndroidId();
        }
        if (!TextUtils.isEmpty(androidId)) {
            map.put("device_adid", androidId);
        }
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            map.put(C3471v.f18922C, str);
        }
        String str2 = Build.BRAND;
        if (!TextUtils.isEmpty(str2)) {
            map.put(C3471v.f18920A, str2);
        }
        String str3 = Build.MODEL;
        if (!TextUtils.isEmpty(str3)) {
            map.put("device_model", str3);
        }
        Locale locale = getLocale(context);
        if (locale != null) {
            map.put(C3471v.f18929J, locale.getCountry());
            map.put("language", locale.getLanguage());
        }
        map.put("init_uuid", HRConfig.initUUID());
        map.put("init_time", Long.toString(HRConfig.initTime()));
        Gson gson = new Gson();
        if (!TextUtils.isEmpty(string) && (packageBean = (PackageBean) gson.fromJson(string, PackageBean.class)) != null && !TextUtils.isEmpty(packageBean.getVer())) {
            map.put("ver", packageBean.getVer());
        }
        String json = gson.toJson(map);
        try {
            json = SecurityHelper.encryptAES(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        HashMap map2 = new HashMap();
        map2.put("message", json);
        HttpUtil.asyncRequestJson(AdSdk.adConfig().isTest() ? HRConstants.HR_DYNC_TEST : HRConstants.HR_DYNC_PROD, null, map2, null, new C0577a(context));
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

    private static Locale getLocale(Context context) {
        return context.getResources().getConfiguration().locale;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static cn.haorui.sdk.core.utils.PckIdBean getPackBean(android.content.Context r12, java.util.List<cn.haorui.sdk.core.utils.PackageBean.AppBean.PackBean> r13, int r14) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.core.utils.PackConfigUtil.getPackBean(android.content.Context, java.util.List, int):cn.haorui.sdk.core.utils.PckIdBean");
    }

    private static String getPackageName(Context context) {
        if (TextUtils.isEmpty(packageName)) {
            packageName = context.getPackageName();
        }
        return packageName;
    }
}
