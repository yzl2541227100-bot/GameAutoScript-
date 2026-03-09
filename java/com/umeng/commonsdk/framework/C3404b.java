package com.umeng.commonsdk.framework;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.proguard.C3454e;
import com.umeng.commonsdk.statistics.common.C3489e;
import com.umeng.commonsdk.statistics.internal.C3514a;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.umeng.commonsdk.framework.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3404b {

    /* JADX INFO: renamed from: a */
    private static final String f18609a = "last_successful_build_time";

    /* JADX INFO: renamed from: c */
    private static String f18611c = "envelope";

    /* JADX INFO: renamed from: d */
    private static String f18612d;

    /* JADX INFO: renamed from: b */
    private static Object f18610b = new Object();

    /* JADX INFO: renamed from: e */
    private static Object f18613e = new Object();

    /* JADX INFO: renamed from: com.umeng.commonsdk.framework.b$1 */
    public static class AnonymousClass1 implements Comparator<File> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f18614a;

        public AnonymousClass1(Context context) {
            context = context;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a */
        public int compare(File file, File file2) {
            String name = file.getName();
            String name2 = file2.getName();
            String strM15655c = C3404b.m15655c(name);
            String strM15655c2 = C3404b.m15655c(name2);
            if (!TextUtils.isEmpty(strM15655c) && !TextUtils.isEmpty(strM15655c2)) {
                try {
                    long jLongValue = Long.valueOf(strM15655c).longValue() - Long.valueOf(strM15655c2).longValue();
                    if (jLongValue > 0) {
                        return 1;
                    }
                    return jLongValue == 0 ? 0 : -1;
                } catch (NumberFormatException e) {
                    C3454e.m15904a(context, e);
                }
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.framework.b$2 */
    public static class AnonymousClass2 implements Comparator<File> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f18615a;

        public AnonymousClass2(Context context) {
            context = context;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a */
        public int compare(File file, File file2) {
            String name = file.getName();
            String name2 = file2.getName();
            String strM15655c = C3404b.m15655c(name);
            String strM15655c2 = C3404b.m15655c(name2);
            if (!TextUtils.isEmpty(strM15655c) && !TextUtils.isEmpty(strM15655c2)) {
                try {
                    long jLongValue = Long.valueOf(strM15655c).longValue() - Long.valueOf(strM15655c2).longValue();
                    if (jLongValue > 0) {
                        return 1;
                    }
                    return jLongValue == 0 ? 0 : -1;
                } catch (NumberFormatException e) {
                    C3454e.m15904a(context, e);
                }
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m15645a(Context context, String str, byte[] bArr) {
        if (bArr == null) {
            return 101;
        }
        File file = new File(m15660h(context) + "/" + str);
        synchronized (f18613e) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        fileOutputStream2.write(bArr);
                        fileOutputStream2.close();
                        if (C3514a.m16423a(context).m16427a(str)) {
                            m15662j(context);
                        }
                        return 0;
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        C3454e.m15904a(context, e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                C3454e.m15904a(context, th);
                            }
                        }
                        return 101;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                C3454e.m15904a(context, th3);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (IOException e2) {
                e = e2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static long m15646a(long j, long j2) {
        return (j < j2 ? j2 - j : j - j2) / 86400000;
    }

    /* JADX INFO: renamed from: a */
    public static String m15647a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            int iMyPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.size() <= 0) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        } catch (Throwable th) {
            C3454e.m15904a(context.getApplicationContext(), th);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15648a(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        File[] fileArrListFiles;
        String str = "a";
        if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_DPLUS) {
            str = "d";
        } else if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_INTERNAL) {
            str = "i";
        }
        File file = new File(m15660h(context));
        synchronized (f18613e) {
            try {
                fileArrListFiles = file.listFiles();
            } catch (Throwable th) {
                C3454e.m15904a(context, th);
            }
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.getName().startsWith(str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m15649a(Context context, String str) {
        boolean z = false;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                if (Build.VERSION.SDK_INT < 23 ? applicationContext.getPackageManager().checkPermission(str, applicationContext.getPackageName()) == 0 : ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0) {
                    z = true;
                }
            } catch (Throwable th) {
                C3454e.m15904a(applicationContext, th);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15650a(File file) {
        Context contextM15665a = C3405c.m15665a();
        synchronized (f18613e) {
            if (file != null) {
                try {
                    if (file.exists()) {
                        return file.delete();
                    }
                } catch (Throwable th) {
                    C3454e.m15904a(contextM15665a, th);
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m15651a(String str) throws IOException {
        byte[] bArr;
        Context contextM15665a = C3405c.m15665a();
        synchronized (f18613e) {
            FileChannel channel = null;
            try {
                try {
                    channel = new RandomAccessFile(str, C1781c.f10296bk).getChannel();
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size()).load();
                    System.out.println(mappedByteBufferLoad.isLoaded());
                    bArr = new byte[(int) channel.size()];
                    if (mappedByteBufferLoad.remaining() > 0) {
                        mappedByteBufferLoad.get(bArr, 0, mappedByteBufferLoad.remaining());
                    }
                } catch (IOException e) {
                    C3454e.m15904a(contextM15665a, e);
                    throw e;
                }
            } finally {
                try {
                    channel.close();
                } catch (Throwable th) {
                    C3454e.m15904a(contextM15665a, th);
                }
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15653b(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            if (!m15649a(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnectedOrConnecting();
        } catch (Throwable th) {
            C3454e.m15904a(context.getApplicationContext(), th);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m15654c(Context context) {
        String[] list;
        if (context != null) {
            try {
                File file = new File(m15660h(context));
                synchronized (f18613e) {
                    if (file.isDirectory() && (list = file.list()) != null) {
                        return list.length;
                    }
                }
            } catch (Throwable th) {
                C3454e.m15904a(context, th);
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static String m15655c(String str) {
        Context contextM15665a = C3405c.m15665a();
        if (!TextUtils.isEmpty(str)) {
            int iIndexOf = str.indexOf(95) + 1;
            try {
                return str.substring(iIndexOf, str.indexOf(95, iIndexOf));
            } catch (IndexOutOfBoundsException e) {
                C3454e.m15904a(contextM15665a, e);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: d */
    public static void m15656d(Context context) {
        File file = new File(m15660h(context));
        synchronized (f18613e) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 100) {
                Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.framework.b.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ Context f18614a;

                    public AnonymousClass1(Context context2) {
                        context = context2;
                    }

                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: a */
                    public int compare(File file2, File file22) {
                        String name = file2.getName();
                        String name2 = file22.getName();
                        String strM15655c = C3404b.m15655c(name);
                        String strM15655c2 = C3404b.m15655c(name2);
                        if (!TextUtils.isEmpty(strM15655c) && !TextUtils.isEmpty(strM15655c2)) {
                            try {
                                long jLongValue = Long.valueOf(strM15655c).longValue() - Long.valueOf(strM15655c2).longValue();
                                if (jLongValue > 0) {
                                    return 1;
                                }
                                return jLongValue == 0 ? 0 : -1;
                            } catch (NumberFormatException e) {
                                C3454e.m15904a(context, e);
                            }
                        }
                        return 1;
                    }
                });
                if (fileArrListFiles.length > 100) {
                    try {
                        C3489e.m16332b("--->>> biger than 10");
                        for (int i = 0; i < fileArrListFiles.length - 100; i++) {
                            if (!fileArrListFiles[i].delete()) {
                                C3489e.m16332b("--->>> remove [" + i + "] file fail.");
                            }
                        }
                    } catch (Throwable th) {
                        C3454e.m15904a(context2, th);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static File m15657e(Context context) {
        if (context == null) {
            return null;
        }
        File file = new File(m15660h(context));
        synchronized (f18613e) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.framework.b.2

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ Context f18615a;

                    public AnonymousClass2(Context context2) {
                        context = context2;
                    }

                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: a */
                    public int compare(File file2, File file22) {
                        String name = file2.getName();
                        String name2 = file22.getName();
                        String strM15655c = C3404b.m15655c(name);
                        String strM15655c2 = C3404b.m15655c(name2);
                        if (!TextUtils.isEmpty(strM15655c) && !TextUtils.isEmpty(strM15655c2)) {
                            try {
                                long jLongValue = Long.valueOf(strM15655c).longValue() - Long.valueOf(strM15655c2).longValue();
                                if (jLongValue > 0) {
                                    return 1;
                                }
                                return jLongValue == 0 ? 0 : -1;
                            } catch (NumberFormatException e) {
                                C3454e.m15904a(context, e);
                            }
                        }
                        return 1;
                    }
                });
                return fileArrListFiles[0];
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m15658f(Context context) {
        String strM15659g;
        if (context == null) {
            return;
        }
        try {
            strM15659g = m15659g(context);
        } catch (Throwable th) {
            C3454e.m15904a(context, th);
        }
        if (TextUtils.isEmpty(strM15659g) || strM15659g.equals(f18611c)) {
            return;
        }
        File file = new File(context.getFilesDir().getAbsolutePath() + "/." + strM15659g);
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                try {
                    if (file.isDirectory()) {
                        file.delete();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    C3454e.m15904a(context, th2);
                    return;
                }
            }
            try {
                String strM15660h = m15660h(context);
                for (int i = 0; i < fileArrListFiles.length; i++) {
                    fileArrListFiles[i].renameTo(new File(strM15660h + "/" + fileArrListFiles[i].getName()));
                }
                if (file.isDirectory()) {
                    file.delete();
                    return;
                }
                return;
            } catch (Throwable th3) {
                C3454e.m15904a(context, th3);
                return;
            }
            C3454e.m15904a(context, th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m15659g(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (activityManager != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                C3489e.m16332b("--->>> getEnvelopeDir: can't get process name, use default envelope directory.");
                return f18611c;
            }
            if (runningAppProcesses.size() == 0) {
                return f18611c;
            }
            try {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == Process.myPid()) {
                        String strReplace = runningAppProcessInfo.processName.replace(':', '_');
                        C3489e.m16332b("--->>> getEnvelopeDir: use current process name as envelope directory.");
                        return strReplace;
                    }
                }
            } catch (Throwable th) {
                C3454e.m15904a(context, th);
            }
        }
        return f18611c;
    }

    /* JADX INFO: renamed from: h */
    public static String m15660h(Context context) {
        String str;
        File file;
        synchronized (f18613e) {
            try {
                if (f18612d == null) {
                    f18612d = context.getFilesDir().getAbsolutePath() + "/." + f18611c;
                }
                file = new File(f18612d);
            } finally {
            }
            if (file.exists() || file.mkdir()) {
                str = f18612d;
            } else {
                C3489e.m16332b("--->>> Create Envelope Directory failed!!!");
                str = f18612d;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: i */
    public static long m15661i(Context context) {
        long j;
        synchronized (f18610b) {
            j = PreferenceWrapper.getDefault(context).getLong(f18609a, 0L);
        }
        return j;
    }

    /* JADX INFO: renamed from: j */
    private static void m15662j(Context context) {
        synchronized (f18610b) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong(f18609a, System.currentTimeMillis()).commit();
        }
    }
}
