package com.cyjh.mobileanjian.ipc.rpc;

import android.app.ActivityManager;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserModel;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import org.apache.commons.p284io.FilenameUtils;
import p285z2.C4196o4;

/* JADX INFO: loaded from: classes2.dex */
public class AndroidHelper {
    private static Context OooO00o = null;
    private static ClipboardManager OooO0O0 = null;
    private static int OooO0OO = 100;
    private static boolean OooO0Oo;

    public class OooO00o extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            context.unregisterReceiver(this);
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 > 0) {
                int unused = AndroidHelper.OooO0OO = (intExtra * 100) / intExtra2;
            }
            AndroidHelper.OooO0O0();
        }
    }

    public static /* synthetic */ boolean OooO0O0() {
        OooO0Oo = true;
        return true;
    }

    public static String batteryLevel() {
        OooO0Oo = false;
        OooO00o.registerReceiver(new OooO00o(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        while (!OooO0Oo) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return String.valueOf(OooO0OO);
    }

    public static String getAppDataPath(String str) {
        try {
            return OooO00o.getPackageManager().getApplicationInfo(str, 0).dataDir;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getAppVersionName() {
        try {
            return OooO00o.getPackageManager().getPackageInfo(OooO00o.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getBacklightLevel() {
        try {
            return String.valueOf((int) (((double) (Settings.System.getInt(OooO00o.getContentResolver(), "screen_brightness") * 100)) / 255.0d));
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return String.valueOf(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getClipboardText() throws java.lang.Throwable {
        /*
            boolean r0 = p285z2.C3874ff.OooO0O0()
            r1 = 0
            if (r0 == 0) goto L1b
            com.ime.input.a r0 = com.ime.input.C3026a.m13734a()     // Catch: java.lang.InterruptedException -> L14
            r0.m13741a(r1)     // Catch: java.lang.InterruptedException -> L14
            r2 = 300(0x12c, double:1.48E-321)
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L14
            goto L1b
        L14:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "AndroidHelper -> getClipboardText --1 -> "
            r0.<init>(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "AndroidHelper -> getClipboardText --2 -> "
            r0.<init>(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            android.content.ClipboardManager r0 = com.cyjh.mobileanjian.ipc.rpc.AndroidHelper.OooO0O0
            boolean r0 = r0.hasPrimaryClip()
            if (r0 == 0) goto L70
            android.content.ClipboardManager r0 = com.cyjh.mobileanjian.ipc.rpc.AndroidHelper.OooO0O0
            android.content.ClipData r0 = r0.getPrimaryClip()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "AndroidHelper -> getClipboardText --3 -> "
            r2.<init>(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            if (r0 == 0) goto L70
            android.content.ClipData$Item r0 = r0.getItemAt(r1)
            if (r0 == 0) goto L70
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            goto L72
        L70:
            java.lang.String r0 = ""
        L72:
            boolean r1 = p285z2.C3874ff.OooO0O0()
            if (r1 == 0) goto L80
            com.ime.input.a r1 = com.ime.input.C3026a.m13734a()
            r2 = 1
            r1.m13741a(r2)
        L80:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "AndroidHelper -> getClipboardText --4 -> "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = "--"
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyjh.mobileanjian.ipc.rpc.AndroidHelper.getClipboardText():java.lang.String");
    }

    public static String getForegroundPackage() {
        UsageStats usageStats = null;
        if (Build.VERSION.SDK_INT <= 21) {
            ComponentName componentName = ((ActivityManager) OooO00o.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningTasks(1).get(0).topActivity;
            if (componentName != null) {
                return componentName.getPackageName();
            }
            return null;
        }
        OooO00o.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<UsageStats> listQueryUsageStats = ((UsageStatsManager) OooO00o.getSystemService("usagestats")).queryUsageStats(4, jCurrentTimeMillis - C1659a.f9130f, jCurrentTimeMillis);
        if (listQueryUsageStats == null || listQueryUsageStats.isEmpty()) {
            return null;
        }
        for (UsageStats usageStats2 : listQueryUsageStats) {
            if (usageStats == null || usageStats.getLastTimeUsed() < usageStats2.getLastTimeUsed()) {
                usageStats = usageStats2;
            }
        }
        return usageStats.getPackageName();
    }

    public static String getIccid() {
        return ((TelephonyManager) OooO00o.getSystemService("phone")).getSimSerialNumber();
    }

    public static String getImsi() {
        return ((TelephonyManager) OooO00o.getSystemService("phone")).getSubscriberId();
    }

    public static String getIp() {
        if (((ConnectivityManager) OooO00o.getSystemService("connectivity")).getNetworkInfo(1).isConnected()) {
            WifiManager wifiManager = (WifiManager) OooO00o.getSystemService("wifi");
            if (wifiManager.isWifiEnabled()) {
                int ipAddress = wifiManager.getConnectionInfo().getIpAddress();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(ipAddress & 255);
                stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                int i = ipAddress >>> 8;
                stringBuffer.append(i & 255);
                stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                int i2 = i >>> 8;
                stringBuffer.append(i2 & 255);
                stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                stringBuffer.append((i2 >>> 8) & 255);
                return stringBuffer.toString();
            }
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        return inetAddressNextElement.getHostAddress().toString();
                    }
                }
            }
            return null;
        } catch (SocketException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getModel() {
        return Build.BRAND + C4196o4.OooO00o.OooO0Oo + Build.MODEL;
    }

    public static String getNetworkTime() {
        try {
            URLConnection uRLConnectionOpenConnection = new URL("http://www.baidu.com").openConnection();
            uRLConnectionOpenConnection.setReadTimeout(5000);
            uRLConnectionOpenConnection.setConnectTimeout(5000);
            uRLConnectionOpenConnection.connect();
            Date date = new Date(uRLConnectionOpenConnection.getDate());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
            Log.e("tag", "getNetworkTime: by baidu url:" + simpleDateFormat.format(date));
            return simpleDateFormat.format(date);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            try {
                URLConnection uRLConnectionOpenConnection2 = new URL("http://www.taobao.com").openConnection();
                uRLConnectionOpenConnection2.setReadTimeout(5000);
                uRLConnectionOpenConnection2.setConnectTimeout(5000);
                uRLConnectionOpenConnection2.connect();
                Date date2 = new Date(uRLConnectionOpenConnection2.getDate());
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
                Log.e("tag", "getNetworkTime: by a li url:" + simpleDateFormat2.format(date2));
                return simpleDateFormat2.format(date2);
            } catch (MalformedURLException e2) {
                e2.printStackTrace();
                return null;
            } catch (IOException e3) {
                e3.printStackTrace();
                return null;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
            URLConnection uRLConnectionOpenConnection22 = new URL("http://www.taobao.com").openConnection();
            uRLConnectionOpenConnection22.setReadTimeout(5000);
            uRLConnectionOpenConnection22.setConnectTimeout(5000);
            uRLConnectionOpenConnection22.connect();
            Date date22 = new Date(uRLConnectionOpenConnection22.getDate());
            SimpleDateFormat simpleDateFormat22 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
            Log.e("tag", "getNetworkTime: by a li url:" + simpleDateFormat22.format(date22));
            return simpleDateFormat22.format(date22);
        }
    }

    public static void init(Context context) {
        Log.e("AndroidHelper", "AndroidHelper --- init");
        new StringBuilder("AndroidHelper -> init--1 -> ").append(Thread.currentThread().getName());
        new StringBuilder("AndroidHelper -> init--2 -> ").append(Thread.currentThread().getName());
        OooO00o = context;
        new StringBuilder("AndroidHelper -> init--3 -> ").append(Thread.currentThread().getName());
        Telephony.init(context);
        OooO0O0 = (ClipboardManager) OooO00o.getSystemService("clipboard");
        new StringBuilder("AndroidHelper -> init--4 -> ").append(Thread.currentThread().getName());
    }

    public static boolean isAppForeground(String str) {
        return str.equals(getForegroundPackage());
    }

    public static String isScreenOn() {
        return ((PowerManager) OooO00o.getSystemService("power")).isScreenOn() ? "true" : "false";
    }

    public static void setClipboardText(String str) {
        new StringBuilder("AndroidHelper -> setClipboardText --1 -> ").append(Thread.currentThread().getName());
        OooO0O0.setPrimaryClip(ClipData.newPlainText("", str));
    }
}
