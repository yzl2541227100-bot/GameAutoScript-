package com.anythink.core.common.p060i;

import android.os.Process;
import android.os.SystemClock;
import com.anythink.core.common.p066o.C1340d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.anythink.core.common.i.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1289a {

    /* JADX INFO: renamed from: a */
    private static final int f4807a = 100;

    /* JADX INFO: renamed from: b */
    private static long f4808b;

    /* JADX INFO: renamed from: c */
    private static long f4809c = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: d */
    private static final File f4810d = new File(C1340d.m4030b("L3Byb2Mv") + Process.myPid() + C1340d.m4030b("L3N0YXQ="));

    /* JADX INFO: renamed from: a */
    public static int m3691a() {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Throwable th;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(f4810d);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        String[] strArrSplit = bufferedReader.readLine().split(C4196o4.OooO00o.OooO0Oo);
                        long j = Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]);
                        long j2 = j - f4808b;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        float f = ((jUptimeMillis - f4809c) / 1000.0f) * 100.0f;
                        f4808b = j;
                        f4809c = jUptimeMillis;
                        int iAvailableProcessors = (int) (((j2 / f) * 100.0f) / Runtime.getRuntime().availableProcessors());
                        try {
                            bufferedReader.close();
                            inputStreamReader.close();
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        return iAvailableProcessors;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            th.printStackTrace();
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused2) {
                                    return 0;
                                }
                            }
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused3) {
                                }
                            }
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    bufferedReader = null;
                    th = th3;
                }
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            inputStreamReader = null;
            bufferedReader = null;
            th = th5;
            fileInputStream = null;
        }
    }
}
