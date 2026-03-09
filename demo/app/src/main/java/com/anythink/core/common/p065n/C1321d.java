package com.anythink.core.common.p065n;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p058h.C1274b;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p058h.p059a.AbstractC1271c;
import com.anythink.core.common.p058h.p059a.C1269a;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.anythink.core.common.n.d */
/* JADX INFO: loaded from: classes.dex */
public class C1321d {

    /* JADX INFO: renamed from: b */
    private static volatile C1321d f5042b;

    /* JADX INFO: renamed from: h */
    private Context f5049h;

    /* JADX INFO: renamed from: i */
    private File f5050i;

    /* JADX INFO: renamed from: j */
    private AtomicInteger f5051j;

    /* JADX INFO: renamed from: a */
    private final String f5043a = "Agent";

    /* JADX INFO: renamed from: c */
    private int f5044c = 5;

    /* JADX INFO: renamed from: d */
    private int f5045d = 10;

    /* JADX INFO: renamed from: e */
    private long f5046e = 1800000;

    /* JADX INFO: renamed from: f */
    private String f5047f = "";

    /* JADX INFO: renamed from: g */
    private String f5048g = "";

    /* JADX INFO: renamed from: k */
    private boolean f5052k = false;

    /* JADX INFO: renamed from: l */
    private String f5053l = "";

    /* JADX INFO: renamed from: m */
    private InterfaceC1283k f5054m = new InterfaceC1283k() { // from class: com.anythink.core.common.n.d.1
        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadCanceled(int i) {
            C1321d.this.f5052k = false;
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadError(int i, String str, AdError adError) {
            C1321d.this.f5052k = false;
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadFinish(int i, Object obj) {
            try {
                C1321d.this.m3856a(((Integer) obj).intValue());
                C1321d.this.f5052k = false;
                C1355s.m4236a(C1321d.this.f5049h, C1169h.f3065p, "LOG_SEND_TIME", System.currentTimeMillis());
            } catch (Throwable unused) {
                C1321d.this.f5052k = false;
            }
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadStart(int i) {
        }
    };

    /* JADX INFO: renamed from: n */
    private AbstractC1271c.a f5055n = new AbstractC1271c.a() { // from class: com.anythink.core.common.n.d.2
        @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c.a
        /* JADX INFO: renamed from: a */
        public final void mo3660a(Object obj) {
            if (obj instanceof C1269a) {
                C1321d.this.m3856a(((C1269a) obj).m3649b());
                C1321d.this.f5052k = false;
                C1355s.m4236a(C1321d.this.f5049h, C1169h.f3065p, "LOG_SEND_TIME", System.currentTimeMillis());
            }
        }

        @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c.a
        /* JADX INFO: renamed from: a */
        public final void mo3661a(Throwable th) {
            C1321d.this.f5052k = false;
        }
    };

    /* JADX INFO: renamed from: o */
    private Object f5056o = new Object();

    private C1321d() {
    }

    /* JADX INFO: renamed from: a */
    public static C1321d m3855a() {
        if (f5042b == null) {
            synchronized (C1321d.class) {
                if (f5042b == null) {
                    f5042b = new C1321d();
                }
            }
        }
        return f5042b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m3856a(int i) {
        BufferedReader bufferedReader = null;
        try {
            File file = new File(this.f5048g);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f5050i));
            try {
                FileWriter fileWriter = new FileWriter(file);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        break;
                    }
                    i3++;
                    if (i3 > i) {
                        fileWriter.append((CharSequence) line);
                        fileWriter.append((CharSequence) "\n");
                    }
                }
                fileWriter.flush();
                fileWriter.close();
                bufferedReader2.close();
                AtomicInteger atomicInteger = this.f5051j;
                if (atomicInteger.get() - i >= 0) {
                    i2 = this.f5051j.get() - i;
                }
                atomicInteger.set(i2);
                this.f5050i.delete();
                file.renameTo(this.f5050i);
                try {
                    bufferedReader2.close();
                } catch (IOException unused) {
                }
            } catch (Error unused2) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Exception unused4) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused5) {
                    }
                }
            } catch (OutOfMemoryError | StackOverflowError unused6) {
                bufferedReader = bufferedReader2;
                try {
                    System.gc();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused7) {
                        }
                    }
                } catch (Throwable th) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused8) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable unused9) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused10) {
                    }
                }
            }
        } catch (Exception unused11) {
        } catch (OutOfMemoryError | StackOverflowError unused12) {
        } catch (Error unused13) {
        } catch (Throwable unused14) {
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m3858a(boolean z) {
        C1274b c1274b;
        String line;
        AtomicInteger atomicInteger;
        if (this.f5049h == null) {
            return;
        }
        if (this.f5052k || (!z && ((atomicInteger = this.f5051j) == null || atomicInteger.get() < this.f5044c))) {
            return;
        }
        this.f5052k = true;
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f5050i));
                try {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < this.f5045d && (line = bufferedReader2.readLine()) != null; i++) {
                        arrayList.add(line);
                    }
                    C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
                    try {
                        if (c1391aM4865b == null) {
                            c1274b = new C1274b(this.f5049h, 0, arrayList);
                        } else {
                            if (c1391aM4865b.m4778w() == 1) {
                                C1269a c1269a = new C1269a(arrayList);
                                c1269a.m3656a(1, c1391aM4865b.m4777v());
                                c1269a.m3657a(this.f5055n);
                                bufferedReader2.close();
                                return;
                            }
                            c1274b = new C1274b(this.f5049h, c1391aM4865b.m4778w(), arrayList);
                        }
                        bufferedReader2.close();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                    c1274b.mo3639a(0, this.f5054m);
                } catch (Exception unused2) {
                    bufferedReader = bufferedReader2;
                    this.f5052k = false;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused3) {
                        }
                    }
                } catch (OutOfMemoryError | StackOverflowError unused4) {
                    bufferedReader = bufferedReader2;
                    this.f5052k = false;
                    System.gc();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused5) {
                        }
                    }
                } catch (Throwable unused6) {
                    bufferedReader = bufferedReader2;
                    this.f5052k = false;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused7) {
                        }
                    }
                }
            } catch (Exception unused8) {
            } catch (OutOfMemoryError | StackOverflowError unused9) {
            } catch (Throwable unused10) {
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    bufferedReader.close();
                } catch (Exception unused11) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5 A[Catch: all -> 0x013d, Error -> 0x013f, OutOfMemoryError | StackOverflowError -> 0x0149, OutOfMemoryError | StackOverflowError -> 0x0149, Exception -> 0x0162, TryCatch #3 {Error -> 0x013f, blocks: (B:10:0x001c, B:12:0x007a, B:14:0x008d, B:15:0x0096, B:17:0x009e, B:25:0x00da, B:37:0x00f1, B:39:0x00f5, B:40:0x00fc, B:42:0x010e, B:44:0x0115, B:46:0x0125, B:48:0x012c, B:47:0x012a, B:43:0x0113, B:33:0x00e8, B:34:0x00eb, B:36:0x00ee), top: B:81:0x001c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e A[Catch: all -> 0x013d, Error -> 0x013f, OutOfMemoryError | StackOverflowError -> 0x0149, OutOfMemoryError | StackOverflowError -> 0x0149, Exception -> 0x0162, TryCatch #3 {Error -> 0x013f, blocks: (B:10:0x001c, B:12:0x007a, B:14:0x008d, B:15:0x0096, B:17:0x009e, B:25:0x00da, B:37:0x00f1, B:39:0x00f5, B:40:0x00fc, B:42:0x010e, B:44:0x0115, B:46:0x0125, B:48:0x012c, B:47:0x012a, B:43:0x0113, B:33:0x00e8, B:34:0x00eb, B:36:0x00ee), top: B:81:0x001c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113 A[Catch: all -> 0x013d, Error -> 0x013f, OutOfMemoryError | StackOverflowError -> 0x0149, OutOfMemoryError | StackOverflowError -> 0x0149, Exception -> 0x0162, TryCatch #3 {Error -> 0x013f, blocks: (B:10:0x001c, B:12:0x007a, B:14:0x008d, B:15:0x0096, B:17:0x009e, B:25:0x00da, B:37:0x00f1, B:39:0x00f5, B:40:0x00fc, B:42:0x010e, B:44:0x0115, B:46:0x0125, B:48:0x012c, B:47:0x012a, B:43:0x0113, B:33:0x00e8, B:34:0x00eb, B:36:0x00ee), top: B:81:0x001c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125 A[Catch: all -> 0x013d, Error -> 0x013f, OutOfMemoryError | StackOverflowError -> 0x0149, OutOfMemoryError | StackOverflowError -> 0x0149, Exception -> 0x0162, TryCatch #3 {Error -> 0x013f, blocks: (B:10:0x001c, B:12:0x007a, B:14:0x008d, B:15:0x0096, B:17:0x009e, B:25:0x00da, B:37:0x00f1, B:39:0x00f5, B:40:0x00fc, B:42:0x010e, B:44:0x0115, B:46:0x0125, B:48:0x012c, B:47:0x012a, B:43:0x0113, B:33:0x00e8, B:34:0x00eb, B:36:0x00ee), top: B:81:0x001c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a A[Catch: all -> 0x013d, Error -> 0x013f, OutOfMemoryError | StackOverflowError -> 0x0149, OutOfMemoryError | StackOverflowError -> 0x0149, Exception -> 0x0162, TryCatch #3 {Error -> 0x013f, blocks: (B:10:0x001c, B:12:0x007a, B:14:0x008d, B:15:0x0096, B:17:0x009e, B:25:0x00da, B:37:0x00f1, B:39:0x00f5, B:40:0x00fc, B:42:0x010e, B:44:0x0115, B:46:0x0125, B:48:0x012c, B:47:0x012a, B:43:0x0113, B:33:0x00e8, B:34:0x00eb, B:36:0x00ee), top: B:81:0x001c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0135 A[Catch: all -> 0x0170, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x000b, B:49:0x0131, B:51:0x0135, B:52:0x013a, B:70:0x016c, B:63:0x0156, B:65:0x015a, B:66:0x0161, B:55:0x013f, B:57:0x0143, B:60:0x014c, B:62:0x0150, B:67:0x0162, B:69:0x0166, B:72:0x016e, B:10:0x001c, B:12:0x007a, B:14:0x008d, B:15:0x0096, B:17:0x009e, B:25:0x00da, B:37:0x00f1, B:39:0x00f5, B:40:0x00fc, B:42:0x010e, B:44:0x0115, B:46:0x0125, B:48:0x012c, B:47:0x012a, B:43:0x0113, B:33:0x00e8, B:34:0x00eb, B:36:0x00ee, B:59:0x0149), top: B:80:0x0003, inners: #3, #6, #7, #10 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3868a(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p065n.C1321d.m3868a(android.content.Context):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m3869a(com.anythink.core.common.p055f.C1246k r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.io.File r0 = r4.f5050i     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L9
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f5051j     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L14
        L9:
            com.anythink.core.common.b.n r0 = com.anythink.core.common.p051b.C1175n.m2059a()     // Catch: java.lang.Throwable -> L94
            android.content.Context r0 = r0.m2148f()     // Catch: java.lang.Throwable -> L94
            r4.m3868a(r0)     // Catch: java.lang.Throwable -> L94
        L14:
            java.io.File r0 = r4.f5050i     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L92
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f5051j     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L1e
            goto L92
        L1e:
            android.content.Context r0 = r4.f5049h     // Catch: java.lang.Throwable -> L94
            com.anythink.core.d.b r0 = com.anythink.core.p072d.C1392b.m4845a(r0)     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = r4.f5053l     // Catch: java.lang.Throwable -> L94
            com.anythink.core.d.a r0 = r0.m4865b(r1)     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L45
            int r1 = r0.m4741ah()     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L37
            int r1 = r0.m4741ah()     // Catch: java.lang.Throwable -> L94
            goto L39
        L37:
            int r1 = r4.f5044c     // Catch: java.lang.Throwable -> L94
        L39:
            r4.f5044c = r1     // Catch: java.lang.Throwable -> L94
            int r1 = r1 * 2
            r4.f5045d = r1     // Catch: java.lang.Throwable -> L94
            long r0 = r0.m4743aj()     // Catch: java.lang.Throwable -> L94
            r4.f5046e = r0     // Catch: java.lang.Throwable -> L94
        L45:
            r0 = 0
            org.json.JSONObject r5 = r5.mo3143a()     // Catch: java.lang.Throwable -> L76 java.lang.Error -> L78 java.lang.Throwable -> L7e java.lang.Exception -> L8a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L76 java.lang.Error -> L78 java.lang.Throwable -> L7e java.lang.Exception -> L8a
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L76 java.lang.Error -> L78 java.lang.Throwable -> L7e java.lang.Exception -> L8a
            java.io.File r2 = r4.f5050i     // Catch: java.lang.Throwable -> L76 java.lang.Error -> L78 java.lang.Throwable -> L7e java.lang.Exception -> L8a
            r3 = 1
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L76 java.lang.Error -> L78 java.lang.Throwable -> L7e java.lang.Exception -> L8a
            r1.append(r5)     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r5 = "\n"
            r1.append(r5)     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L72 java.lang.Exception -> L74
            r1.flush()     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L72 java.lang.Exception -> L74
            r1.close()     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f5051j     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L72 java.lang.Exception -> L74
            r5.incrementAndGet()     // Catch: java.lang.Throwable -> L6d java.lang.Error -> L70 java.lang.Throwable -> L72 java.lang.Exception -> L74
            r1.close()     // Catch: java.io.IOException -> L8d java.lang.Throwable -> L94
            goto L8d
        L6d:
            r5 = move-exception
            r0 = r1
            goto L84
        L70:
            r0 = r1
            goto L78
        L72:
            r0 = r1
            goto L7e
        L74:
            r0 = r1
            goto L8a
        L76:
            r5 = move-exception
            goto L84
        L78:
            if (r0 == 0) goto L8d
        L7a:
            r0.close()     // Catch: java.io.IOException -> L8d java.lang.Throwable -> L94
            goto L8d
        L7e:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L8d
            goto L7a
        L84:
            if (r0 == 0) goto L89
            r0.close()     // Catch: java.io.IOException -> L89 java.lang.Throwable -> L94
        L89:
            throw r5     // Catch: java.lang.Throwable -> L94
        L8a:
            if (r0 == 0) goto L8d
            goto L7a
        L8d:
            r4.m3858a(r6)     // Catch: java.lang.Throwable -> L94
            monitor-exit(r4)
            return
        L92:
            monitor-exit(r4)
            return
        L94:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p065n.C1321d.m3869a(com.anythink.core.common.f.k, boolean):void");
    }

    /* JADX INFO: renamed from: b */
    public final void m3870b() {
        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.core.common.n.d.3
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0121 A[PHI: r0
  0x0121: PHI (r0v23 ??) = (r0v58 ??), (r0v59 ??), (r0v60 ??) binds: [B:58:0x0135, B:52:0x011f, B:56:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Type inference failed for: r0v17 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v21 */
            /* JADX WARN: Type inference failed for: r0v22 */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.io.BufferedReader] */
            /* JADX WARN: Type inference failed for: r0v24 */
            /* JADX WARN: Type inference failed for: r0v25 */
            /* JADX WARN: Type inference failed for: r0v27 */
            /* JADX WARN: Type inference failed for: r0v28 */
            /* JADX WARN: Type inference failed for: r0v29 */
            /* JADX WARN: Type inference failed for: r0v46 */
            /* JADX WARN: Type inference failed for: r0v47 */
            /* JADX WARN: Type inference failed for: r0v48 */
            /* JADX WARN: Type inference failed for: r0v53 */
            /* JADX WARN: Type inference failed for: r0v54 */
            /* JADX WARN: Type inference failed for: r0v55 */
            /* JADX WARN: Type inference failed for: r0v56 */
            /* JADX WARN: Type inference failed for: r0v57 */
            /* JADX WARN: Type inference failed for: r0v58 */
            /* JADX WARN: Type inference failed for: r0v59 */
            /* JADX WARN: Type inference failed for: r0v60 */
            /* JADX WARN: Type inference failed for: r3v2 */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.io.BufferedReader] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.io.BufferedReader] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.io.IOException {
                /*
                    Method dump skipped, instruction units count: 323
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p065n.C1321d.AnonymousClass3.run():void");
            }
        }, 13, true);
    }
}
