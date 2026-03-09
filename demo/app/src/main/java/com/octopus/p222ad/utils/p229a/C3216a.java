package com.octopus.p222ad.utils.p229a;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.media.MediaDrm;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.anythink.china.common.C1082d;
import com.octopus.p222ad.utils.p229a.p257b.C3238l;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.UUID;
import p285z2.InterfaceC4047k3;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3216a implements InterfaceC3244c {

    /* JADX INFO: renamed from: a */
    private Application f17815a;

    /* JADX INFO: renamed from: b */
    private String f17816b;

    /* JADX INFO: renamed from: c */
    private String f17817c;

    /* JADX INFO: renamed from: d */
    private String f17818d;

    /* JADX INFO: renamed from: com.octopus.ad.utils.a.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C3216a f17820a = new C3216a();
    }

    private C3216a() {
    }

    /* JADX INFO: renamed from: a */
    public static String m14831a() {
        String str = a.f17820a.f17816b;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: a */
    public static String m14832a(Context context) {
        String str;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            str = "IMEI/MEID not allowed on Android 10+";
        } else {
            if (context == null) {
                return "";
            }
            if (i < 23 || context.checkSelfPermission(C1082d.f2501a) == 0) {
                return m14846d(context);
            }
            str = "android.permission.READ_PHONE_STATE not granted";
        }
        C3247f.m14935a(str);
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static String m14834a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance(str2).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (Exception e) {
            C3247f.m14935a(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14835a(Application application) {
        if (application == null) {
            return;
        }
        C3216a c3216a = a.f17820a;
        c3216a.f17815a = application;
        m14836a(application, c3216a);
        m14840b(application, new InterfaceC3244c() { // from class: com.octopus.ad.utils.a.a.1
            @Override // com.octopus.p222ad.utils.p229a.InterfaceC3244c
            /* JADX INFO: renamed from: a */
            public void mo14853a(Exception exc) {
                C3247f.m14935a("onGAIDGetError: " + exc.getMessage());
                C3216a c3216a2 = C3216a.this;
                c3216a2.f17818d = C3216a.m14843c(c3216a2.f17815a);
            }

            @Override // com.octopus.p222ad.utils.p229a.InterfaceC3244c
            /* JADX INFO: renamed from: a */
            public void mo14854a(String str) {
                if (TextUtils.isEmpty(str)) {
                    mo14853a(new C3246e("GAID is empty"));
                } else {
                    C3216a.this.f17818d = str;
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m14836a(Context context, InterfaceC3244c interfaceC3244c) {
        C3238l.m14924a(context).mo14919a(interfaceC3244c);
    }

    /* JADX INFO: renamed from: a */
    private static void m14837a(Context context, String str) {
        if (context == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || Settings.System.canWrite(context)) {
            try {
                Settings.System.putString(context.getContentResolver(), "GUID_uuid", str);
                C3247f.m14935a("Save uuid to system settings: " + str);
                return;
            } catch (Exception e) {
                e = e;
            }
        } else {
            e = "android.permission.WRITE_SETTINGS not granted";
        }
        C3247f.m14935a(e);
    }

    /* JADX INFO: renamed from: b */
    public static String m14838b() {
        return m14834a(m14831a(), "MD5");
    }

    @SuppressLint({"HardwareIds"})
    /* JADX INFO: renamed from: b */
    public static String m14839b(Context context) {
        String string;
        return (context == null || (string = Settings.Secure.getString(context.getContentResolver(), "android_id")) == null) ? "" : string;
    }

    /* JADX INFO: renamed from: b */
    public static void m14840b(Context context, InterfaceC3244c interfaceC3244c) {
        C3238l.m14925b(context).mo14919a(interfaceC3244c);
    }

    /* JADX INFO: renamed from: b */
    private static void m14841b(Context context, String str) {
        if (context == null) {
            return;
        }
        File fileM14851g = m14851g(context);
        if (fileM14851g == null) {
            C3247f.m14935a("UUID file in external storage is null");
            return;
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileM14851g));
            try {
                if (!fileM14851g.exists()) {
                    fileM14851g.createNewFile();
                }
                bufferedWriter.write(str);
                bufferedWriter.flush();
                C3247f.m14935a("Save uuid to external storage: " + str);
                bufferedWriter.close();
            } finally {
            }
        } catch (Exception e) {
            C3247f.m14935a(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m14842c() {
        String str = a.f17820a.f17817c;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: c */
    public static String m14843c(Context context) {
        String strM14848e = m14848e(context);
        if (TextUtils.isEmpty(strM14848e)) {
            strM14848e = m14850f(context);
        }
        if (TextUtils.isEmpty(strM14848e)) {
            strM14848e = m14852h(context);
        }
        if (!TextUtils.isEmpty(strM14848e)) {
            return strM14848e;
        }
        String string = UUID.randomUUID().toString();
        C3247f.m14935a("Generate uuid by random: " + string);
        m14844c(context, string);
        m14837a(context, string);
        m14841b(context, string);
        return string;
    }

    /* JADX INFO: renamed from: c */
    private static void m14844c(Context context, String str) {
        if (context == null) {
            return;
        }
        context.getSharedPreferences("GUID", 0).edit().putString(InterfaceC4047k3.o00000, str).apply();
        C3247f.m14935a("Save uuid to shared preferences: " + str);
    }

    /* JADX INFO: renamed from: d */
    public static String m14845d() {
        String str = a.f17820a.f17818d;
        return str == null ? "" : str;
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    /* JADX INFO: renamed from: d */
    private static String m14846d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            String imei = telephonyManager.getImei();
            return TextUtils.isEmpty(imei) ? telephonyManager.getMeid() : imei;
        } catch (Error | Exception e) {
            C3247f.m14935a(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m14847e() {
        try {
            byte[] propertyByteArray = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L)).getPropertyByteArray("deviceUniqueId");
            if (propertyByteArray == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (byte b : propertyByteArray) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (Error | Exception e) {
            C3247f.m14935a(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    private static String m14848e(Context context) {
        if (context == null) {
            return "";
        }
        String string = Settings.System.getString(context.getContentResolver(), "GUID_uuid");
        C3247f.m14935a("Get uuid from system settings: " + string);
        return string;
    }

    /* JADX INFO: renamed from: f */
    public static String m14849f() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.BOARD.length() % 10);
        sb.append((Build.VERSION.SDK_INT >= 21 ? Arrays.deepToString(Build.SUPPORTED_ABIS) : Build.CPU_ABI).length() % 10);
        sb.append(Build.DEVICE.length() % 10);
        sb.append(Build.DISPLAY.length() % 10);
        sb.append(Build.HOST.length() % 10);
        sb.append(Build.ID.length() % 10);
        sb.append(Build.MANUFACTURER.length() % 10);
        sb.append(Build.BRAND.length() % 10);
        sb.append(Build.MODEL.length() % 10);
        sb.append(Build.PRODUCT.length() % 10);
        sb.append(Build.BOOTLOADER.length() % 10);
        sb.append(Build.HARDWARE.length() % 10);
        sb.append(Build.TAGS.length() % 10);
        sb.append(Build.TYPE.length() % 10);
        sb.append(Build.USER.length() % 10);
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    private static String m14850f(Context context) {
        String line = "";
        if (context == null) {
            return "";
        }
        File fileM14851g = m14851g(context);
        if (fileM14851g != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileM14851g));
                try {
                    line = bufferedReader.readLine();
                    bufferedReader.close();
                } finally {
                }
            } catch (Exception e) {
                C3247f.m14935a(e);
            }
        }
        C3247f.m14935a("Get uuid from external storage: " + line);
        return line;
    }

    /* JADX INFO: renamed from: g */
    private static File m14851g(Context context) {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i >= 23 && (i >= 30 || context == null || context.checkSelfPermission(C1082d.f2502b) != 0)) {
            z = false;
        }
        if (z && "mounted".equals(Environment.getExternalStorageState())) {
            return new File(Environment.getExternalStorageDirectory(), "Android/.GUID_uuid");
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    private static String m14852h(Context context) {
        if (context == null) {
            return "";
        }
        String string = context.getSharedPreferences("GUID", 0).getString(InterfaceC4047k3.o00000, "");
        C3247f.m14935a("Get uuid from shared preferences: " + string);
        return string;
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3244c
    /* JADX INFO: renamed from: a */
    public void mo14853a(Exception exc) {
        StringBuilder sb;
        String str;
        C3247f.m14935a("onOAIDGetError: " + exc.getMessage());
        String strM14839b = m14839b(this.f17815a);
        if (TextUtils.isEmpty(strM14839b)) {
            String strM14832a = m14832a((Context) this.f17815a);
            if (TextUtils.isEmpty(strM14832a)) {
                String strM14847e = m14847e();
                if (TextUtils.isEmpty(strM14847e)) {
                    String strM14849f = m14849f();
                    if (TextUtils.isEmpty(strM14849f)) {
                        this.f17816b = m14843c(this.f17815a);
                        this.f17817c = m14838b();
                        sb = new StringBuilder();
                        str = "Client id is GUID: ";
                    } else {
                        this.f17816b = strM14849f;
                        this.f17817c = m14838b();
                        sb = new StringBuilder();
                        str = "Client id is PseudoID: ";
                    }
                } else {
                    this.f17816b = strM14847e;
                    this.f17817c = m14838b();
                    sb = new StringBuilder();
                    str = "Client id is WidevineID: ";
                }
            } else {
                this.f17816b = strM14832a;
                this.f17817c = m14838b();
                sb = new StringBuilder();
                str = "Client id is IMEI/MEID: ";
            }
        } else {
            this.f17816b = strM14839b;
            this.f17817c = m14838b();
            sb = new StringBuilder();
            str = "Client id is AndroidID: ";
        }
        sb.append(str);
        sb.append(this.f17816b);
        C3247f.m14935a(sb.toString());
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3244c
    /* JADX INFO: renamed from: a */
    public void mo14854a(String str) {
        if (TextUtils.isEmpty(str)) {
            mo14853a(new C3246e("OAID is empty"));
            return;
        }
        this.f17816b = str;
        this.f17817c = str;
        C3247f.m14935a("Client id is OAID: " + this.f17816b);
    }
}
