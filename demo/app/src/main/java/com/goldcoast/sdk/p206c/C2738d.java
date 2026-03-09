package com.goldcoast.sdk.p206c;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.goldcoast.sdk.p204a.C2726a;
import com.goldcoast.sdk.p204a.C2727b;
import com.goldcoast.sdk.p204a.C2730e;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.goldcoast.sdk.c.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C2738d {

    /* JADX INFO: renamed from: a */
    private static C2738d f16003a;

    /* JADX INFO: renamed from: b */
    private static Context f16004b;

    private C2738d() {
    }

    /* JADX INFO: renamed from: a */
    public static C2727b m13162a() {
        String str;
        String str2 = "";
        C2727b c2727b = new C2727b();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        C2730e c2730eM13165c = m13165c();
        try {
            map2.put("MemTotal", "");
            C2740f.m13173a(new FileInputStream("/proc/meminfo"), map2);
            str = (String) map2.get("MemTotal");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            str = "";
        }
        C2726a c2726a = null;
        try {
            str2 = C2740f.m13173a(new FileInputStream("/proc/version"), null).split(C4196o4.OooO00o.OooO0Oo)[2];
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }
        try {
            C2740f.m13173a(new FileInputStream("/proc/cpuinfo"), map);
            c2726a = new C2726a(map);
        } catch (FileNotFoundException e3) {
            e3.printStackTrace();
        }
        c2727b.m13108a(c2726a);
        c2727b.m13109a(c2730eM13165c);
        c2727b.m13113b(str2);
        c2727b.m13111a(str);
        c2727b.m13114c(m13166d());
        c2727b.m13116e(m13164b());
        c2727b.m13115d(m13167e());
        c2727b.m13118g(C2736b.m13153a());
        c2727b.m13117f(String.valueOf(System.currentTimeMillis()));
        return c2727b;
    }

    /* JADX INFO: renamed from: a */
    public static C2738d m13163a(Context context) {
        f16004b = context;
        if (f16003a == null) {
            f16003a = new C2738d();
        }
        return f16003a;
    }

    /* JADX INFO: renamed from: b */
    public static String m13164b() {
        try {
            return Settings.Secure.getString(f16004b.getContentResolver(), "android_id");
        } catch (Exception e) {
            e.printStackTrace();
            return "0";
        }
    }

    /* JADX INFO: renamed from: c */
    public static C2730e m13165c() {
        HashMap map = new HashMap();
        String[] strArr = {"ro.product.brand", "ro.product.name", "ro.product.model", "ro.build.fingerprint", "ro.build.version.sdk", "ro.build.version.release", "ro.build.date", "ro.build.date.utc", "ro.boot.cpuid", "ro.btconfig.vendor", "persist.sys.timezone", "persist.sys.country", "persist.sys.language", "persist.sys.dalvik.vm.lib", "ro.build.description", "ro.runtime.firstboot", "ro.serialno", "ro.hardware", "ro.product.board", "ro.product.locale.language", "ro.product.locale.region", "ro.product.cpu.abi", "ro.board.platform", "ro.build.selinux", "ro.build.selinux.enforce"};
        for (int i = 0; i < 25; i++) {
            map.put(strArr[i], "");
        }
        for (Map.Entry entry : map.entrySet()) {
            map.put(entry.getKey(), C2743i.m13183a((String) entry.getKey()));
        }
        return new C2730e(map);
    }

    /* JADX INFO: renamed from: d */
    private static String m13166d() {
        try {
            return ((TelephonyManager) f16004b.getSystemService("phone")).getDeviceId();
        } catch (Exception e) {
            e.printStackTrace();
            return "0";
        }
    }

    /* JADX INFO: renamed from: e */
    private static String m13167e() {
        try {
            return ((WifiManager) f16004b.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        } catch (Exception e) {
            e.printStackTrace();
            return "0";
        }
    }
}
