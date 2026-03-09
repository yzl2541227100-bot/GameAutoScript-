package com.anythink.core.common.res;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1348l;
import com.anythink.core.common.res.C1374a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.res.d */
/* JADX INFO: loaded from: classes.dex */
public class C1380d {

    /* JADX INFO: renamed from: a */
    public static final String f5563a = "about:blank";

    /* JADX INFO: renamed from: e */
    private static final String f5564e = "anythink_internal_resouce";

    /* JADX INFO: renamed from: f */
    private static final String f5565f = "anythink_custom_resouce";

    /* JADX INFO: renamed from: g */
    private static final String f5566g = "anythink_internal_extra_resource";

    /* JADX INFO: renamed from: h */
    private static final String f5567h = "anythink_internal_video_resource";

    /* JADX INFO: renamed from: i */
    private static final String f5568i = "anythink_internal_html_resouce";

    /* JADX INFO: renamed from: j */
    private static volatile C1380d f5569j;

    /* JADX INFO: renamed from: k */
    private Context f5573k;

    /* JADX INFO: renamed from: l */
    private File f5574l;

    /* JADX INFO: renamed from: d */
    private final String f5572d = getClass().getSimpleName();

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<Integer, C1374a> f5570b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public final long f5571c = 172800000;

    private C1380d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f5573k = applicationContext;
        this.f5574l = C1348l.m4190a(applicationContext);
    }

    /* JADX INFO: renamed from: a */
    private synchronized C1374a m4519a(int i, File file) {
        C1374a c1374aM4402a;
        c1374aM4402a = this.f5570b.get(Integer.valueOf(i));
        if (c1374aM4402a == null) {
            try {
                c1374aM4402a = C1374a.m4402a(file, C1175n.m2059a().m2138c(i));
                this.f5570b.put(Integer.valueOf(i), c1374aM4402a);
            } catch (Throwable th) {
                if (C1175n.m2059a().m2095A()) {
                    Log.e(this.f5572d, "Create DiskCache error.");
                    th.printStackTrace();
                }
            }
        }
        return c1374aM4402a;
    }

    /* JADX INFO: renamed from: a */
    public static C1380d m4520a(Context context) {
        if (f5569j == null) {
            synchronized (C1380d.class) {
                if (f5569j == null) {
                    f5569j = new C1380d(context);
                }
            }
        }
        return f5569j;
    }

    /* JADX INFO: renamed from: c */
    public static void m4521c() {
        try {
            long jM2138c = C1175n.m2059a().m2138c(1);
            String strM4524a = m4520a(C1175n.m2059a().m2148f()).m4524a(1);
            long jM4189a = C1348l.m4189a(strM4524a);
            if (jM4189a <= 0 || jM4189a <= jM2138c * 1.5d) {
                return;
            }
            File[] fileArrListFiles = new File(strM4524a).listFiles();
            ArrayList arrayList = new ArrayList();
            if (fileArrListFiles != null) {
                Collections.addAll(arrayList, fileArrListFiles);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    File file = (File) arrayList.get(i);
                    if (jCurrentTimeMillis - file.lastModified() > 172800000) {
                        try {
                            file.delete();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m4522a(int i, String str) {
        InputStream inputStreamM4463a;
        if (i == 4) {
            try {
                return new FileInputStream(new File(m4532c(4, str)));
            } catch (Throwable unused) {
                return null;
            }
        }
        String strM4524a = m4524a(i);
        if (TextUtils.isEmpty(strM4524a)) {
            return null;
        }
        File file = new File(strM4524a);
        if (!file.exists()) {
            file.mkdirs();
        }
        C1374a c1374aM4519a = m4519a(i, file);
        if (c1374aM4519a != null) {
            try {
                C1374a.c cVarM4435a = c1374aM4519a.m4435a(str);
                if (cVarM4435a != null && (inputStreamM4463a = cVarM4435a.m4463a()) != null) {
                    return (FileInputStream) inputStreamM4463a;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m4523a() {
        return this.f5574l.getAbsolutePath();
    }

    /* JADX INFO: renamed from: a */
    public final String m4524a(int i) {
        return new File(this.f5574l, i != 1 ? i != 3 ? i != 4 ? f5565f : f5567h : f5566g : f5564e).getAbsolutePath();
    }

    /* JADX INFO: renamed from: a */
    public final String m4525a(String str, C1248m c1248m, AbstractC1247l abstractC1247l) {
        byte[] bytes;
        FileOutputStream fileOutputStream;
        File file = new File(this.f5574l, f5568i);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, c1248m.f4323d + "_" + abstractC1247l.m3229t() + ".html");
        FileOutputStream fileOutputStream2 = null;
        try {
            bytes = str.getBytes("utf-8");
            fileOutputStream = new FileOutputStream(file2);
        } catch (Throwable unused) {
        }
        try {
            fileOutputStream.write(bytes, 0, bytes.length);
            String string = file2.toURL().toString();
            try {
                fileOutputStream.close();
                return string;
            } catch (Throwable unused2) {
                return string;
            }
        } catch (Throwable unused3) {
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (Throwable unused4) {
                }
            }
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4526a(C1248m c1248m, AbstractC1247l abstractC1247l) {
        try {
            File file = new File(new File(this.f5574l, f5568i), c1248m.f4323d + "_" + abstractC1247l.m3229t() + ".html");
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4527a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            new File(m4524a(3) + File.separator + str + ".0").delete();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4528a(int r6, java.lang.String r7, java.io.InputStream r8) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L87
            if (r8 != 0) goto L7
            goto L87
        L7:
            java.lang.String r1 = r5.m4524a(r6)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L12
            return r0
        L12:
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r1 = r2.exists()
            if (r1 != 0) goto L20
            r2.mkdirs()
        L20:
            com.anythink.core.common.res.a r6 = r5.m4519a(r6, r2)
            if (r6 == 0) goto L87
            r1 = 0
            com.anythink.core.common.res.a$c r2 = r6.m4435a(r7)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            if (r2 != 0) goto L52
            com.anythink.core.common.res.a$a r6 = r6.m4436b(r7)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            if (r6 == 0) goto L59
            java.io.OutputStream r1 = r6.m4444a(r0)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L60
            r7 = 2048(0x800, float:2.87E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L60
        L3b:
            int r2 = r8.read(r7)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L60
            r3 = -1
            if (r2 == r3) goto L46
            r1.write(r7, r0, r2)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L60
            goto L3b
        L46:
            r6.m4445a()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L60
            r1.close()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L60
            goto L59
        L4d:
            r7 = move-exception
            r4 = r1
            r1 = r6
            r6 = r4
            goto L64
        L52:
            java.io.InputStream r6 = r2.m4463a()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r6.close()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
        L59:
            r0 = 1
            if (r1 == 0) goto L87
            r1.close()     // Catch: java.io.IOException -> L87
            goto L87
        L60:
            r6 = move-exception
            goto L81
        L62:
            r7 = move-exception
            r6 = r1
        L64:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = "writeToDiskLruCache - "
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L7e
            r8.append(r7)     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L78
            r1.m4446b()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L7e
            goto L78
        L74:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L7e
        L78:
            if (r6 == 0) goto L87
            r6.close()     // Catch: java.io.IOException -> L87
            goto L87
        L7e:
            r7 = move-exception
            r1 = r6
            r6 = r7
        L81:
            if (r1 == 0) goto L86
            r1.close()     // Catch: java.io.IOException -> L86
        L86:
            throw r6
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.res.C1380d.m4528a(int, java.lang.String, java.io.InputStream):boolean");
    }

    /* JADX INFO: renamed from: b */
    public final File m4529b(C1248m c1248m, AbstractC1247l abstractC1247l) {
        File file = new File(new File(this.f5574l, f5568i), c1248m.f4323d + "_" + abstractC1247l.m3229t() + ".html");
        if (file.exists()) {
            return file;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m4530b() {
        File[] fileArrListFiles;
        try {
            File file = new File(this.f5574l, f5568i);
            if (!file.exists() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length <= 0) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                try {
                    if (file2.isFile() && System.currentTimeMillis() - file2.lastModified() > 86400000) {
                        file2.delete();
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4531b(int i, String str) {
        File file;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (i != 4) {
            file = new File(m4524a(i) + File.separator + str + ".0");
        } else {
            file = new File(m4524a(i) + File.separator + str);
        }
        return file.exists();
    }

    /* JADX INFO: renamed from: c */
    public final String m4532c(int i, String str) {
        StringBuilder sb;
        if (i != 4) {
            sb = new StringBuilder();
            sb.append(m4524a(i));
            sb.append(File.separator);
            sb.append(str);
            sb.append(".0");
        } else {
            sb = new StringBuilder();
            sb.append(m4524a(i));
            sb.append(File.separator);
            sb.append(str);
        }
        return sb.toString();
    }
}
