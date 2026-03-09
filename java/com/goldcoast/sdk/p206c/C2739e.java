package com.goldcoast.sdk.p206c;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.goldcoast.sdk.c.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C2739e {

    /* JADX INFO: renamed from: a */
    private static Method f16005a;

    /* JADX INFO: renamed from: b */
    private static final Pattern f16006b;

    static {
        try {
            Class<?> cls = Class.forName("android.os.FileUtils");
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("setPermissions", String.class, cls2, cls2, cls2);
            f16005a = method;
            method.setAccessible(true);
        } catch (Exception unused) {
        }
        f16006b = Pattern.compile("[\\w%+,./=_-]+");
    }

    /* JADX INFO: renamed from: a */
    public static int m13168a(File file) {
        try {
            return ((Integer) f16005a.invoke(null, file.getAbsolutePath(), 493, -1, -1)).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m13169a(String str, int i) {
        try {
            return ((Integer) f16005a.invoke(null, str, Integer.valueOf(i), -1, -1)).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m13170a(String[] strArr, File file) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            StringBuilder sb = new StringBuilder("#!/system/bin/sh\n");
            for (String str : strArr) {
                sb.append(String.format("%s\n", str));
            }
            fileWriter.write(sb.toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13171a(File file, File file2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                boolean zM13172a = m13172a(fileInputStream, file2);
                fileInputStream.close();
                return zM13172a;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m13172a(InputStream inputStream, File file) {
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i < 0) {
                        fileOutputStream2.flush();
                        fileOutputStream2.getFD().sync();
                        fileOutputStream2.close();
                        return true;
                    }
                    fileOutputStream2.write(bArr, 0, i);
                }
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                e.printStackTrace();
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                return false;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }
}
