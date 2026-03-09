package com.octopus.p222ad.internal.utilities;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.octopus.p222ad.ADBidEvent;
import com.octopus.p222ad.p224b.C3072e;
import com.octopus.p222ad.utils.p258b.C3253d;
import com.octopus.p222ad.utils.p258b.C3261l;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceInfoUtil {
    public static String ETHERNET_SERVICE = "ethernet";
    public static int SCREEN_DECIMAL_DIGITS = 2;

    private static void getIdentifiersAndDevType(Context context, DeviceInfo deviceInfo) {
        try {
            deviceInfo.devType = ((TelephonyManager) context.getApplicationContext().getSystemService("phone")).getPhoneType() != 0 ? C3072e.b.DEVICE_PHONE : C3072e.b.DEVICE_FLAT;
        } catch (SecurityException unused) {
            HaoboLog.m14609e(HaoboLog.baseLogTag, "No permission to access imei");
            int i = context.getResources().getConfiguration().screenLayout & 15;
            deviceInfo.devType = (i == 4 || i == 3) ? C3072e.b.DEVICE_FLAT : C3072e.b.DEVICE_PHONE;
        }
        deviceInfo.root = C3261l.m14999a();
    }

    private static void getScreenInformations(Context context, DeviceInfo deviceInfo) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        deviceInfo.resolution = displayMetrics.widthPixels + "_" + displayMetrics.heightPixels;
        float f = ((float) displayMetrics.heightPixels) / displayMetrics.ydpi;
        float f2 = ((float) displayMetrics.widthPixels) / displayMetrics.xdpi;
        double dSqrt = Math.sqrt((double) ((f2 * f2) + (f * f)));
        deviceInfo.screenSize = String.format("%.2f", Double.valueOf(Math.round(dSqrt * r2) / Math.pow(10.0d, (double) SCREEN_DECIMAL_DIGITS)));
    }

    private static void getSdkUID(Context context, DeviceInfo deviceInfo) {
        String str = (String) SPUtils.get(context, DeviceInfo.SDK_UID_KEY_NEW, "");
        deviceInfo.sdkUID = str;
        if (TextUtils.isEmpty(str)) {
            deviceInfo.generateSdkUID(context);
        }
    }

    public static void retrieveDeviceInfo(Context context) {
        DeviceInfo deviceInfo = DeviceInfo.getInstance();
        if (TextUtils.isEmpty(deviceInfo.sdkUID)) {
            try {
                getIdentifiersAndDevType(context, deviceInfo);
                getScreenInformations(context, deviceInfo);
                getSdkUID(context, deviceInfo);
                deviceInfo.getMarks(context);
                if (!TextUtils.isEmpty(deviceInfo.manufacturer) && (deviceInfo.manufacturer.equalsIgnoreCase(ADBidEvent.HUAWEI) || deviceInfo.manufacturer.equalsIgnoreCase("HONOR"))) {
                    deviceInfo.agVercode = C3261l.m15015k(context);
                    deviceInfo.hmsVercode = C3261l.m15016l(context);
                }
                deviceInfo.wxInstalled = C3253d.m14975a(context, C1801a.f11045bC);
                deviceInfo.appList = C3261l.m15004b(context);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
