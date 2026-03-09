package com.anythink.expressad.foundation.p138h;

import android.text.TextUtils;
import androidx.multidex.MultiDexExtractor;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p120g.p123c.C1814d;
import com.anythink.expressad.foundation.p120g.p123c.EnumC1811a;
import com.anythink.expressad.foundation.p120g.p124d.C1821e;
import com.anythink.expressad.p086d.C1483a;
import com.anythink.expressad.p086d.C1486b;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.apache.commons.p284io.FileUtils;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1879m extends C1871e {

    /* JADX INFO: renamed from: a */
    public static final int f11562a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f11563b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f11564c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f11565d = 4;

    /* JADX INFO: renamed from: e */
    public static final String f11566e = "/download/.at";

    /* JADX INFO: renamed from: f */
    public static final String f11567f = "/atdownload";

    /* JADX INFO: renamed from: g */
    private static final String f11568g = "SameFileTool";

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.h.m$1 */
    public class AnonymousClass1 implements Runnable {
        /* JADX WARN: Removed duplicated region for block: B:62:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r5 = this;
                com.anythink.expressad.foundation.b.a r0 = com.anythink.expressad.foundation.p113b.C1773a.m8548c()     // Catch: java.lang.Exception -> L43
                android.content.Context r0 = r0.m8557e()     // Catch: java.lang.Exception -> L43
                if (r0 == 0) goto L42
                com.anythink.expressad.foundation.g.c.a r0 = com.anythink.expressad.foundation.p120g.p123c.EnumC1811a.ANYTHINK_VC     // Catch: java.lang.Exception -> L43
                java.lang.String r0 = com.anythink.expressad.foundation.p120g.p123c.C1814d.m9407b(r0)     // Catch: java.lang.Exception -> L43
                java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L3e
                r1.<init>(r0)     // Catch: java.lang.Exception -> L3e
                boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L3e
                if (r2 == 0) goto L3d
                boolean r1 = r1.isDirectory()     // Catch: java.lang.Exception -> L3e
                if (r1 == 0) goto L3d
                java.io.File[] r0 = com.anythink.expressad.foundation.p138h.C1879m.m9742b(r0)     // Catch: java.lang.Exception -> L3e
                int r1 = r0.length     // Catch: java.lang.Exception -> L3e
                r2 = 0
            L27:
                if (r2 >= r1) goto L3d
                r3 = r0[r2]     // Catch: java.lang.Exception -> L3e
                boolean r4 = r3.exists()     // Catch: java.lang.Exception -> L3e
                if (r4 == 0) goto L3a
                boolean r4 = r3.isFile()     // Catch: java.lang.Exception -> L3e
                if (r4 == 0) goto L3a
                r3.delete()     // Catch: java.lang.Exception -> L3e
            L3a:
                int r2 = r2 + 1
                goto L27
            L3d:
                return
            L3e:
                r0 = move-exception
                r0.printStackTrace()     // Catch: java.lang.Exception -> L43
            L42:
                return
            L43:
                r0 = move-exception
                boolean r1 = com.anythink.expressad.C1404a.f6209a
                if (r1 == 0) goto L4b
                r0.printStackTrace()
            L4b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p138h.C1879m.AnonymousClass1.run():void");
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.h.m$2 */
    public class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                C1486b.m6002a();
                C1773a.m8548c().m8558f();
                C1483a c1483aM6007b = C1486b.m6007b();
                if (c1483aM6007b == null) {
                    C1486b.m6002a();
                    c1483aM6007b = C1486b.m6010c();
                }
                C1879m.m9733a(C1814d.m9407b(EnumC1811a.ANYTHINK_RES_MANAGER_DIR), c1483aM6007b.m5953b());
                C1879m.m9732a(System.currentTimeMillis() - ((long) (c1483aM6007b.m5971n() * 1000)));
            } catch (Exception e) {
                if (C1404a.f6209a) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.h.m$3 */
    public class AnonymousClass3 implements FileFilter {
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return !file.isHidden() || file.isDirectory();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.h.m$4 */
    public class AnonymousClass4 implements Comparator<File> {
        /* JADX INFO: renamed from: a */
        private static int m9754a(File file, File file2) {
            long jLastModified = file.lastModified() - file2.lastModified();
            if (jLastModified > 0) {
                return 1;
            }
            return jLastModified == 0 ? 0 : -1;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            long jLastModified = file.lastModified() - file2.lastModified();
            if (jLastModified > 0) {
                return 1;
            }
            return jLastModified == 0 ? 0 : -1;
        }

        @Override // java.util.Comparator
        public final boolean equals(Object obj) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.h.m$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final int f11569a = 448;

        /* JADX INFO: renamed from: b */
        public static final int f11570b = 256;

        /* JADX INFO: renamed from: c */
        public static final int f11571c = 128;

        /* JADX INFO: renamed from: d */
        public static final int f11572d = 64;

        /* JADX INFO: renamed from: e */
        public static final int f11573e = 56;

        /* JADX INFO: renamed from: f */
        public static final int f11574f = 32;

        /* JADX INFO: renamed from: g */
        public static final int f11575g = 16;

        /* JADX INFO: renamed from: h */
        public static final int f11576h = 8;

        /* JADX INFO: renamed from: i */
        public static final int f11577i = 7;

        /* JADX INFO: renamed from: j */
        public static final int f11578j = 4;

        /* JADX INFO: renamed from: k */
        public static final int f11579k = 2;

        /* JADX INFO: renamed from: l */
        public static final int f11580l = 1;
    }

    /* JADX INFO: renamed from: a */
    private static double m9728a(long j, int i) {
        double d;
        double d2;
        double d3;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (i != 1) {
            if (i == 2) {
                d2 = j;
                d3 = 1024.0d;
            } else if (i == 3) {
                d2 = j;
                d3 = 1048576.0d;
            } else {
                if (i != 4) {
                    return 0.0d;
                }
                d2 = j;
                d3 = 1.073741824E9d;
            }
            d = d2 / d3;
        } else {
            d = j;
        }
        return Double.valueOf(decimalFormat.format(d)).doubleValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(2:(3:79|49|(1:51)(0))|82) */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m9729a(java.io.File r4) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L49
            r4.<init>()     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L49
        L10:
            java.lang.String r2 = r1.readLine()     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L49
            if (r2 == 0) goto L2b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L49
            r3.<init>()     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L49
            r3.append(r2)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L49
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L49
            java.lang.String r2 = r3.toString()     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L49
            r4.append(r2)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L49
            goto L10
        L2b:
            r1.close()     // Catch: java.io.IOException -> L2f
            goto L41
        L2f:
            goto L41
        L31:
            r2 = move-exception
            goto L3b
        L33:
            r2 = move-exception
            r4 = r0
            goto L3b
        L36:
            r4 = move-exception
            goto L4b
        L38:
            r2 = move-exception
            r4 = r0
            r1 = r4
        L3b:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L41
            goto L2b
        L41:
            if (r4 == 0) goto L48
            java.lang.String r4 = r4.toString()
            return r4
        L48:
            return r0
        L49:
            r4 = move-exception
            r0 = r1
        L4b:
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.io.IOException -> L50
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p138h.C1879m.m9729a(java.io.File):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x00e7, code lost:
    
        if (r9 == null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x00e9, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x00ed, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x00ee, code lost:
    
        r9.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0103, code lost:
    
        throw new java.lang.Exception("zipEntry's name is unsafe!");
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m9730a(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p138h.C1879m.m9730a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: a */
    public static void m9731a() {
        new Thread(new Runnable() { // from class: com.anythink.expressad.foundation.h.m.1
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    this = this;
                    com.anythink.expressad.foundation.b.a r0 = com.anythink.expressad.foundation.p113b.C1773a.m8548c()     // Catch: java.lang.Exception -> L43
                    android.content.Context r0 = r0.m8557e()     // Catch: java.lang.Exception -> L43
                    if (r0 == 0) goto L42
                    com.anythink.expressad.foundation.g.c.a r0 = com.anythink.expressad.foundation.p120g.p123c.EnumC1811a.ANYTHINK_VC     // Catch: java.lang.Exception -> L43
                    java.lang.String r0 = com.anythink.expressad.foundation.p120g.p123c.C1814d.m9407b(r0)     // Catch: java.lang.Exception -> L43
                    java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L3e
                    r1.<init>(r0)     // Catch: java.lang.Exception -> L3e
                    boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L3e
                    if (r2 == 0) goto L3d
                    boolean r1 = r1.isDirectory()     // Catch: java.lang.Exception -> L3e
                    if (r1 == 0) goto L3d
                    java.io.File[] r0 = com.anythink.expressad.foundation.p138h.C1879m.m9742b(r0)     // Catch: java.lang.Exception -> L3e
                    int r1 = r0.length     // Catch: java.lang.Exception -> L3e
                    r2 = 0
                L27:
                    if (r2 >= r1) goto L3d
                    r3 = r0[r2]     // Catch: java.lang.Exception -> L3e
                    boolean r4 = r3.exists()     // Catch: java.lang.Exception -> L3e
                    if (r4 == 0) goto L3a
                    boolean r4 = r3.isFile()     // Catch: java.lang.Exception -> L3e
                    if (r4 == 0) goto L3a
                    r3.delete()     // Catch: java.lang.Exception -> L3e
                L3a:
                    int r2 = r2 + 1
                    goto L27
                L3d:
                    return
                L3e:
                    r0 = move-exception
                    r0.printStackTrace()     // Catch: java.lang.Exception -> L43
                L42:
                    return
                L43:
                    r0 = move-exception
                    boolean r1 = com.anythink.expressad.C1404a.f6209a
                    if (r1 == 0) goto L4b
                    r0.printStackTrace()
                L4b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p138h.C1879m.AnonymousClass1.run():void");
            }
        }).start();
    }

    /* JADX INFO: renamed from: a */
    public static void m9732a(long j) {
        try {
            for (File file : m9751e(new File(C1814d.m9407b(EnumC1811a.ANYTHINK_RES_MANAGER_DIR)))) {
                if (file.lastModified() < j && file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9733a(String str, int i) {
        try {
            if (m9747d(new File(str)) > i * 1048576) {
                m9752f(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9734a(String str) {
        if (C1821e.m9469a(str)) {
            return false;
        }
        File file = new File(str);
        return file.length() > 0 && file.isFile();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m9735a(String str, String str2, String str3) throws Throwable {
        try {
            if (C1884r.m9790b()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String str4 = File.separator;
                sb.append(str4);
                sb.append(str3);
                String string = sb.toString();
                File file = new File(string);
                if (file.exists() && file.isFile() && C1884r.m9788a(file.length())) {
                    File file2 = new File(str2);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    int iM9738b = m9738b(string, str2 + str4 + str3);
                    if (file.exists() && iM9738b == 0) {
                        file.delete();
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9736a(byte[] bArr, File file) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bArr);
                    try {
                        fileOutputStream2.close();
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return true;
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream == null) {
                        return false;
                    }
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    /* JADX INFO: renamed from: b */
    private static double m9737b(String str, int i) {
        long jM9747d;
        double d;
        double d2;
        double d3;
        File file = new File(str);
        try {
            jM9747d = file.isDirectory() ? m9747d(file) : m9743c(file);
        } catch (Exception e) {
            e.printStackTrace();
            jM9747d = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (i != 1) {
            if (i == 2) {
                d2 = jM9747d;
                d3 = 1024.0d;
            } else if (i == 3) {
                d2 = jM9747d;
                d3 = 1048576.0d;
            } else {
                if (i != 4) {
                    return 0.0d;
                }
                d2 = jM9747d;
                d3 = 1.073741824E9d;
            }
            d = d2 / d3;
        } else {
            d = jM9747d;
        }
        return Double.valueOf(decimalFormat.format(d)).doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m9738b(java.lang.String r5, java.lang.String r6) throws java.lang.Throwable {
        /*
            r0 = 0
            r1 = -1
            boolean r2 = com.anythink.expressad.foundation.p138h.C1884r.f11598a     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L74
            if (r2 != 0) goto L7
            return r1
        L7:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L74
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L74
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L5a
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L5a
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
        L15:
            int r3 = r2.read(r0)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
            r4 = 0
            if (r3 <= 0) goto L20
            r5.write(r0, r4, r3)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
            goto L15
        L20:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
            boolean r6 = r0.exists()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
            if (r6 == 0) goto L43
            boolean r6 = r0.isFile()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
            if (r6 != 0) goto L32
            goto L43
        L32:
            r2.close()     // Catch: java.io.IOException -> L36
            goto L3a
        L36:
            r6 = move-exception
            r6.printStackTrace()
        L3a:
            r5.close()     // Catch: java.io.IOException -> L3e
            goto L42
        L3e:
            r5 = move-exception
            r5.printStackTrace()
        L42:
            return r4
        L43:
            r2.close()     // Catch: java.io.IOException -> L47
            goto L4b
        L47:
            r6 = move-exception
            r6.printStackTrace()
        L4b:
            r5.close()     // Catch: java.io.IOException -> L4f
            goto L53
        L4f:
            r5 = move-exception
            r5.printStackTrace()
        L53:
            return r1
        L54:
            r6 = move-exception
            goto L58
        L56:
            r6 = move-exception
            r5 = r0
        L58:
            r0 = r2
            goto L5f
        L5a:
            r5 = r0
        L5b:
            r0 = r2
            goto L75
        L5d:
            r6 = move-exception
            r5 = r0
        L5f:
            if (r0 == 0) goto L69
            r0.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r0 = move-exception
            r0.printStackTrace()
        L69:
            if (r5 == 0) goto L73
            r5.close()     // Catch: java.io.IOException -> L6f
            goto L73
        L6f:
            r5 = move-exception
            r5.printStackTrace()
        L73:
            throw r6
        L74:
            r5 = r0
        L75:
            if (r0 == 0) goto L7f
            r0.close()     // Catch: java.io.IOException -> L7b
            goto L7f
        L7b:
            r6 = move-exception
            r6.printStackTrace()
        L7f:
            if (r5 == 0) goto L89
            r5.close()     // Catch: java.io.IOException -> L85
            goto L89
        L85:
            r5 = move-exception
            r5.printStackTrace()
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p138h.C1879m.m9738b(java.lang.String, java.lang.String):int");
    }

    /* JADX INFO: renamed from: b */
    private static String m9739b(long j) {
        StringBuilder sb;
        String str;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j == 0) {
            return "0B";
        }
        if (j < 1024) {
            sb = new StringBuilder();
            sb.append(decimalFormat.format(j));
            str = "B";
        } else if (j < 1048576) {
            sb = new StringBuilder();
            sb.append(decimalFormat.format(j / 1024.0d));
            str = "KB";
        } else if (j < FileUtils.ONE_GB) {
            sb = new StringBuilder();
            sb.append(decimalFormat.format(j / 1048576.0d));
            str = "AT";
        } else {
            sb = new StringBuilder();
            sb.append(decimalFormat.format(j / 1.073741824E9d));
            str = "GB";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m9740b(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return "";
            }
            if (!file.isDirectory()) {
                return "";
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    m9740b(file2);
                }
                file.delete();
                return "";
            }
            file.delete();
            return "";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9741b() {
        C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.expressad.foundation.h.m.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C1486b.m6002a();
                    C1773a.m8548c().m8558f();
                    C1483a c1483aM6007b = C1486b.m6007b();
                    if (c1483aM6007b == null) {
                        C1486b.m6002a();
                        c1483aM6007b = C1486b.m6010c();
                    }
                    C1879m.m9733a(C1814d.m9407b(EnumC1811a.ANYTHINK_RES_MANAGER_DIR), c1483aM6007b.m5953b());
                    C1879m.m9732a(System.currentTimeMillis() - ((long) (c1483aM6007b.m5971n() * 1000)));
                } catch (Exception e) {
                    if (C1404a.f6209a) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static File[] m9742b(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.listFiles();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static long m9743c(File file) throws Throwable {
        long jAvailable = 0;
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            jAvailable = fileInputStream2.available();
                            fileInputStream = fileInputStream2;
                        } catch (Exception e) {
                            e = e;
                            fileInputStream = fileInputStream2;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return jAvailable;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        file.createNewFile();
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } catch (Exception e4) {
                e = e4;
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return jAvailable;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m9744c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - 1440000;
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.lastModified() + jCurrentTimeMillis < jCurrentTimeMillis2) {
                            m9740b(file2);
                            try {
                                File file3 = new File(str + MultiDexExtractor.EXTRACTED_SUFFIX);
                                if (file3.exists() && file3.isFile()) {
                                    m9740b(file3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m9745c(String str, int i) {
        try {
            if (m9747d(new File(str)) > i * 1048576) {
                m9752f(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m9746c(String str, String str2) {
        File[] fileArrListFiles;
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str) && str2 != null && !TextUtils.isEmpty(str2)) {
                    File file = new File(str);
                    if (file.isDirectory() && file.listFiles() != null && file.listFiles().length > 0 && (fileArrListFiles = file.listFiles()) != null) {
                        for (File file2 : fileArrListFiles) {
                            if (!file2.isFile()) {
                                m9746c(file2.getAbsolutePath(), str2);
                            } else if (str2.equals(file2.getName())) {
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private static long m9747d(File file) {
        File[] fileArrListFiles = file.listFiles();
        long jM9747d = 0;
        if (fileArrListFiles != null) {
            for (int i = 0; i < fileArrListFiles.length; i++) {
                jM9747d += fileArrListFiles[i].isDirectory() ? m9747d(fileArrListFiles[i]) : m9743c(fileArrListFiles[i]);
            }
        }
        return jM9747d;
    }

    /* JADX INFO: renamed from: d */
    public static String m9748d(String str) {
        return !TextUtils.isEmpty(str) ? C1882p.m9771a(C1890x.m9869a(str.trim())) : "";
    }

    /* JADX INFO: renamed from: d */
    private static boolean m9749d(String str, int i) {
        try {
            Class<?> cls = Class.forName("android.os.FileUtils");
            Class<?> cls2 = Integer.TYPE;
            cls.getMethod("setPermissions", String.class, cls2, cls2, cls2).invoke(null, str, Integer.valueOf(i), -1, -1);
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    private static String m9750e(String str) {
        long jM9747d;
        StringBuilder sb;
        String str2;
        File file = new File(str);
        try {
            jM9747d = file.isDirectory() ? m9747d(file) : m9743c(file);
        } catch (Exception e) {
            e.printStackTrace();
            jM9747d = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (jM9747d == 0) {
            return "0B";
        }
        if (jM9747d < 1024) {
            sb = new StringBuilder();
            sb.append(decimalFormat.format(jM9747d));
            str2 = "B";
        } else if (jM9747d < 1048576) {
            sb = new StringBuilder();
            sb.append(decimalFormat.format(jM9747d / 1024.0d));
            str2 = "KB";
        } else if (jM9747d < FileUtils.ONE_GB) {
            sb = new StringBuilder();
            sb.append(decimalFormat.format(jM9747d / 1048576.0d));
            str2 = "AT";
        } else {
            sb = new StringBuilder();
            sb.append(decimalFormat.format(jM9747d / 1.073741824E9d));
            str2 = "GB";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    private static ArrayList<File> m9751e(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles(new FileFilter() { // from class: com.anythink.expressad.foundation.h.m.3
            @Override // java.io.FileFilter
            public final boolean accept(File file3) {
                return !file3.isHidden() || file3.isDirectory();
            }
        })) {
            if (file2.isDirectory()) {
                arrayList.addAll(m9751e(file2));
            } else {
                arrayList.add(file2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    private static void m9752f(String str) {
        try {
            ArrayList<File> arrayListM9751e = m9751e(new File(str));
            Collections.sort(arrayListM9751e, new Comparator<File>() { // from class: com.anythink.expressad.foundation.h.m.4
                /* JADX INFO: renamed from: a */
                private static int m9754a(File file, File file2) {
                    long jLastModified = file.lastModified() - file2.lastModified();
                    if (jLastModified > 0) {
                        return 1;
                    }
                    return jLastModified == 0 ? 0 : -1;
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file, File file2) {
                    long jLastModified = file.lastModified() - file2.lastModified();
                    if (jLastModified > 0) {
                        return 1;
                    }
                    return jLastModified == 0 ? 0 : -1;
                }

                @Override // java.util.Comparator
                public final boolean equals(Object obj) {
                    return true;
                }
            });
            int size = (arrayListM9751e.size() - 1) / 2;
            for (int i = 0; i < size; i++) {
                File file = arrayListM9751e.get(i);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m9753g(String str) {
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                for (File file2 : m9742b(str)) {
                    if (file2.exists() && file2.isFile()) {
                        file2.delete();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
