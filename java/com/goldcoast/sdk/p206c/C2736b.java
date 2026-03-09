package com.goldcoast.sdk.p206c;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Locale;

/* JADX INFO: renamed from: com.goldcoast.sdk.c.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C2736b {

    /* JADX INFO: renamed from: a */
    private static boolean f15998a;

    /* JADX INFO: renamed from: a */
    public static String m13153a() {
        byte[] bArrM13155a;
        byte[] bArrM13155a2;
        if (m13154a("ro.product.cpu.abilist64", "").length() > 0 || m13156b()) {
            return "64";
        }
        File file = new File("/system/lib/libc.so");
        boolean z = true;
        if (!file.exists() || (bArrM13155a2 = m13155a(file)) == null || bArrM13155a2[4] != 2) {
            File file2 = new File("/system/lib64/libc.so");
            if (!file2.exists() || (bArrM13155a = m13155a(file2)) == null || bArrM13155a[4] != 2) {
                z = false;
            }
        }
        return z ? "64" : "32";
    }

    /* JADX INFO: renamed from: a */
    private static String m13154a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception unused) {
            return str2;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m13155a(File file) {
        FileInputStream fileInputStream;
        byte[] bArr;
        try {
            if (file.exists()) {
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (Throwable unused) {
                    fileInputStream = null;
                }
                try {
                    bArr = new byte[16];
                } catch (Throwable unused2) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                }
                if (fileInputStream.read(bArr, 0, 16) == 16) {
                    try {
                        fileInputStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return bArr;
                }
                fileInputStream.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x006b -> B:50:0x006e). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    private static boolean m13156b() {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        File file = new File("/proc/cpuinfo");
        if (!file.exists()) {
            return false;
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream), 512);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                fileInputStream = null;
            }
            try {
                String line = bufferedReader.readLine();
                if (line != null && line.length() > 0) {
                    if (line.toLowerCase(Locale.US).contains("arch64")) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        try {
                            fileInputStream.close();
                            return true;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return true;
                        }
                    }
                }
                try {
                    bufferedReader.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                fileInputStream.close();
            } catch (Throwable unused3) {
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
                if (fileInputStream == null) {
                    return false;
                }
                fileInputStream.close();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }
}
