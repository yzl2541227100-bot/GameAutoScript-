package com.iflytek.voiceads.utils;

import android.content.Context;
import android.os.Environment;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: renamed from: com.iflytek.voiceads.utils.f */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2988f {

    /* JADX INFO: renamed from: a */
    private static Context f16462a;

    /* JADX INFO: renamed from: b */
    private static C2988f f16463b;

    /* JADX INFO: renamed from: c */
    private static File f16464c;

    /* JADX INFO: renamed from: d */
    private static SimpleDateFormat f16465d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);

    /* JADX INFO: renamed from: a */
    private static long m13549a(File file) {
        if (!file.exists()) {
            return 0L;
        }
        try {
            return new FileInputStream(file).available();
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "getFileSize:" + e.getMessage());
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m13550a() {
        File file = new File(f16464c.getParent() + "/ifly_ad_lastLog.txt");
        if (file.exists()) {
            file.delete();
        }
        f16464c.renameTo(file);
        try {
            f16464c.createNewFile();
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "resetLogFile:" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m13551a(Context context) {
        if (f16462a == null || f16463b == null || f16464c == null || !f16464c.exists()) {
            f16462a = context;
            f16463b = new C2988f();
            f16464c = m13553b();
            if (52428800 < m13549a(f16464c)) {
                m13550a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m13552a(Object obj) {
        if (f16462a == null || f16463b == null || f16464c == null || !f16464c.exists()) {
            return;
        }
        String str = m13554c() + " - " + obj.toString();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f16464c, true));
            bufferedWriter.write(str);
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_WINDOWS);
            bufferedWriter.flush();
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "write:" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private static File m13553b() {
        File file = new File(Environment.getExternalStorageDirectory().getPath() + File.separator + "IFlyAdDownload" + File.separator);
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file.getPath() + "/ifly_ad_logs.txt");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (Exception e) {
                C2989g.m13557b("IFLY_AD_SDK", "getLogFile:" + e.getMessage());
            }
        }
        return file2;
    }

    /* JADX INFO: renamed from: c */
    private static String m13554c() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(f16463b.getClass().getName())) {
                return "[" + f16465d.format(new Date()) + "]";
            }
        }
        return null;
    }
}
