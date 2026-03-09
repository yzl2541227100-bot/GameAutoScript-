package com.anythink.china.common.p033a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.anythink.china.common.p033a.p034a.C1068a;
import com.anythink.china.common.p036c.C1081b;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d;
import com.anythink.expressad.foundation.p120g.C1801a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: renamed from: com.anythink.china.common.a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1067a {

    /* JADX INFO: renamed from: e */
    public static final String f2404e = ".temp";

    /* JADX INFO: renamed from: f */
    public static final String f2405f = ".log";

    /* JADX INFO: renamed from: g */
    public static final String f2406g = ".apk";

    /* JADX INFO: renamed from: h */
    public static final int f2407h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f2408i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f2409j = 2;

    /* JADX INFO: renamed from: k */
    public static final int f2410k = 3;

    /* JADX INFO: renamed from: l */
    public static final int f2411l = 4;

    /* JADX INFO: renamed from: u */
    private static final String f2412u = "a";

    /* JADX INFO: renamed from: a */
    public String f2413a;

    /* JADX INFO: renamed from: b */
    public String f2414b;

    /* JADX INFO: renamed from: c */
    public boolean f2415c;

    /* JADX INFO: renamed from: d */
    public boolean f2416d;

    /* JADX INFO: renamed from: m */
    public int f2417m = 0;

    /* JADX INFO: renamed from: n */
    public long f2418n;

    /* JADX INFO: renamed from: o */
    public long f2419o;

    /* JADX INFO: renamed from: p */
    public long f2420p;

    /* JADX INFO: renamed from: q */
    public long f2421q;

    /* JADX INFO: renamed from: r */
    public long f2422r;

    /* JADX INFO: renamed from: s */
    public long f2423s;

    /* JADX INFO: renamed from: t */
    public long f2424t;

    /* JADX INFO: renamed from: v */
    private RandomAccessFile f2425v;

    /* JADX INFO: renamed from: w */
    private a f2426w;

    /* JADX INFO: renamed from: x */
    private C1072e f2427x;

    /* JADX INFO: renamed from: y */
    private String f2428y;

    /* JADX INFO: renamed from: com.anythink.china.common.a.a$1, reason: invalid class name */
    public class AnonymousClass1 extends AbstractRunnableC1337d {
        public AnonymousClass1() {
        }

        /* JADX INFO: renamed from: b */
        private void m1491b(String str) throws Throwable {
            AbstractC1067a.this.f2419o = System.currentTimeMillis();
            AbstractC1067a.this.f2420p = SystemClock.elapsedRealtime();
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    String unused = AbstractC1067a.f2412u;
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        httpURLConnection2.setInstanceFollowRedirects(false);
                        if (AbstractC1067a.this.f2427x.f2459o) {
                            String strM4073i = C1341e.m4073i();
                            if (!TextUtils.isEmpty(strM4073i)) {
                                httpURLConnection2.addRequestProperty("User-Agent", strM4073i);
                            }
                        }
                        AbstractC1067a abstractC1067a = AbstractC1067a.this;
                        if (abstractC1067a.f2418n > 0) {
                            String unused2 = AbstractC1067a.f2412u;
                            StringBuilder sb = new StringBuilder("Range: startPos -> ");
                            sb.append(AbstractC1067a.this.f2418n);
                            sb.append("  ,  endPos -> ");
                            sb.append(AbstractC1067a.this.f2423s);
                            httpURLConnection2.setRequestProperty(HttpHeaders.RANGE, "bytes=" + AbstractC1067a.this.f2418n + "-");
                        } else {
                            abstractC1067a.f2423s = httpURLConnection2.getContentLength();
                        }
                        AbstractC1067a abstractC1067a2 = AbstractC1067a.this;
                        if (abstractC1067a2.f2423s <= 0) {
                            String unused3 = AbstractC1067a.f2412u;
                            AbstractC1067a.this.m1484a(C1070c.m1503a("10000", "downloadSize <= 0"));
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                                return;
                            }
                            return;
                        }
                        if (abstractC1067a2.f2415c) {
                            if (abstractC1067a2.f2427x != null) {
                                AbstractC1067a.this.f2427x.m1514j();
                            }
                            AbstractC1067a abstractC1067a3 = AbstractC1067a.this;
                            abstractC1067a3.f2417m = 3;
                            abstractC1067a3.m1489d();
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                                return;
                            }
                            return;
                        }
                        httpURLConnection2.setConnectTimeout(60000);
                        httpURLConnection2.connect();
                        int responseCode = httpURLConnection2.getResponseCode();
                        if (responseCode != 200 && responseCode != 206) {
                            String unused4 = AbstractC1067a.f2412u;
                            StringBuilder sb2 = new StringBuilder("http respond status code is ");
                            sb2.append(responseCode);
                            sb2.append(" ! url=");
                            sb2.append(str);
                            AbstractC1067a.this.m1484a(C1070c.m1503a("10001", httpURLConnection2.getResponseMessage()));
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                                return;
                            }
                            return;
                        }
                        AbstractC1067a abstractC1067a4 = AbstractC1067a.this;
                        if (abstractC1067a4.f2415c) {
                            if (abstractC1067a4.f2427x != null) {
                                AbstractC1067a.this.f2427x.m1514j();
                            }
                            AbstractC1067a abstractC1067a5 = AbstractC1067a.this;
                            abstractC1067a5.f2417m = 3;
                            abstractC1067a5.m1489d();
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                                return;
                            }
                            return;
                        }
                        InputStream inputStream = httpURLConnection2.getInputStream();
                        if (AbstractC1067a.this.f2427x != null) {
                            AbstractC1067a.this.f2427x.m1513i();
                        }
                        C1072e c1072e = AbstractC1067a.this.f2427x;
                        AbstractC1067a abstractC1067a6 = AbstractC1067a.this;
                        c1072e.f2452h = abstractC1067a6.f2423s;
                        if (abstractC1067a6.f2426w != null) {
                            a aVar = AbstractC1067a.this.f2426w;
                            C1072e c1072e2 = AbstractC1067a.this.f2427x;
                            AbstractC1067a abstractC1067a7 = AbstractC1067a.this;
                            aVar.mo1465a(c1072e2, abstractC1067a7.f2418n, abstractC1067a7.f2423s);
                        }
                        AbstractC1067a abstractC1067a8 = AbstractC1067a.this;
                        int iM1471a = abstractC1067a8.m1471a(abstractC1067a8.f2414b, inputStream);
                        AbstractC1067a.this.f2417m = iM1471a;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        AbstractC1067a.this.f2421q = System.currentTimeMillis();
                        AbstractC1067a.this.f2422r = SystemClock.elapsedRealtime();
                        C1072e c1072e3 = AbstractC1067a.this.f2427x;
                        AbstractC1067a abstractC1067a9 = AbstractC1067a.this;
                        c1072e3.f2453i = abstractC1067a9.f2422r - abstractC1067a9.f2420p;
                        if (iM1471a == 1) {
                            String unused5 = AbstractC1067a.f2412u;
                            new StringBuilder("download success --> ").append(AbstractC1067a.this.f2413a);
                            AbstractC1067a.this.m1490e();
                        } else if (iM1471a == 2 || iM1471a == 3) {
                            abstractC1067a9.m1489d();
                        } else {
                            String unused6 = AbstractC1067a.f2412u;
                            new StringBuilder("download fail --> ").append(AbstractC1067a.this.f2413a);
                            AbstractC1067a.this.m1487b(C1070c.m1503a("10000", "Save fail!(" + AbstractC1067a.this.f2428y + ")"));
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                    } catch (StackOverflowError e) {
                        e = e;
                        httpURLConnection = httpURLConnection2;
                        System.gc();
                        String unused7 = AbstractC1067a.f2412u;
                        e.getMessage();
                        AbstractC1067a.this.m1484a(C1070c.m1503a("10000", e.getMessage() != null ? e.getMessage() : "Http connect error!"));
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (SocketTimeoutException e2) {
                        e = e2;
                        httpURLConnection = httpURLConnection2;
                        AbstractC1067a.this.m1484a(C1070c.m1503a("20001", e.getMessage()));
                        String unused8 = AbstractC1067a.f2412u;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Exception e3) {
                        e = e3;
                        httpURLConnection = httpURLConnection2;
                        String unused9 = AbstractC1067a.f2412u;
                        e.getMessage();
                        AbstractC1067a.this.m1484a(C1070c.m1503a("10000", e.getMessage() != null ? e.getMessage() : "Http connect error!"));
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (OutOfMemoryError e4) {
                        e = e4;
                        httpURLConnection = httpURLConnection2;
                        System.gc();
                        String unused10 = AbstractC1067a.f2412u;
                        e.getMessage();
                        AbstractC1067a.this.m1484a(C1070c.m1503a("10000", e.getMessage() != null ? e.getMessage() : "Http connect error!"));
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Error e5) {
                        e = e5;
                        httpURLConnection = httpURLConnection2;
                        System.gc();
                        String unused11 = AbstractC1067a.f2412u;
                        e.getMessage();
                        AbstractC1067a.this.m1484a(C1070c.m1503a("10000", e.getMessage() != null ? e.getMessage() : "Http connect error!"));
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (ConnectTimeoutException e6) {
                        e = e6;
                        httpURLConnection = httpURLConnection2;
                        AbstractC1067a.this.m1485a(e);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (StackOverflowError e7) {
                    e = e7;
                } catch (Error e8) {
                    e = e8;
                } catch (SocketTimeoutException e9) {
                    e = e9;
                } catch (ConnectTimeoutException e10) {
                    e = e10;
                } catch (Exception e11) {
                    e = e11;
                } catch (OutOfMemoryError e12) {
                    e = e12;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:137:0x02e2 A[Catch: Exception -> 0x02e6, StackOverflowError -> 0x0301, OutOfMemoryError -> 0x0303, TryCatch #9 {Exception -> 0x02e6, OutOfMemoryError -> 0x0303, StackOverflowError -> 0x0301, blocks: (B:3:0x0015, B:20:0x00bb, B:29:0x00dc, B:38:0x011b, B:47:0x013d, B:67:0x0205, B:91:0x023d, B:101:0x0264, B:111:0x028b, B:121:0x02b2, B:127:0x02c0, B:133:0x02db, B:137:0x02e2, B:138:0x02e5), top: B:152:0x0015 }] */
        /* JADX WARN: Removed duplicated region for block: B:150:0x0313  */
        /* JADX WARN: Type inference failed for: r4v1, types: [long] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v9, types: [java.net.HttpURLConnection] */
        @Override // com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo1492a() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 792
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.china.common.p033a.AbstractC1067a.AnonymousClass1.mo1492a():void");
        }
    }

    /* JADX INFO: renamed from: com.anythink.china.common.a.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1464a(C1072e c1072e, long j);

        /* JADX INFO: renamed from: a */
        void mo1465a(C1072e c1072e, long j, long j2);

        /* JADX INFO: renamed from: a */
        void mo1466a(C1072e c1072e, long j, long j2, int i);

        /* JADX INFO: renamed from: a */
        void mo1467a(C1072e c1072e, String str);

        /* JADX INFO: renamed from: b */
        void mo1468b(C1072e c1072e, long j, long j2);
    }

    public AbstractC1067a(C1072e c1072e) {
        this.f2427x = c1072e;
        this.f2413a = c1072e.f2446b;
        this.f2414b = c1072e.f2458n;
    }

    /* JADX INFO: renamed from: a */
    private int m1470a(InputStream inputStream, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        try {
            if (this.f2418n > 0) {
                Log.i(f2412u, "(" + this.f2427x.f2447c + ")  seek to -> " + this.f2418n);
                randomAccessFile.seek(this.f2418n);
            } else {
                Log.i(f2412u, "(" + this.f2427x.f2447c + ")  set temp file size -> " + this.f2423s);
                randomAccessFile.setLength(this.f2423s);
            }
            byte[] bArr = new byte[1048576];
            this.f2424t = this.f2418n;
            while (true) {
                int i = inputStream.read(bArr);
                if (-1 == i) {
                    return 1;
                }
                if (this.f2416d) {
                    return 2;
                }
                if (this.f2415c) {
                    return 3;
                }
                randomAccessFile.write(bArr, 0, i);
                long j = this.f2424t + ((long) i);
                this.f2424t = j;
                C1072e c1072e = this.f2427x;
                if (c1072e != null) {
                    c1072e.f2451g = j;
                }
                randomAccessFile2.setLength(0L);
                randomAccessFile2.write(C1081b.m1544a(this.f2424t, this.f2423s, this.f2427x.m1505a()).getBytes());
                a aVar = this.f2426w;
                if (aVar != null) {
                    aVar.mo1468b(this.f2427x, this.f2424t, this.f2423s);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            this.f2428y = th.getMessage();
            return 4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public int m1471a(String str, InputStream inputStream) {
        RandomAccessFile randomAccessFile;
        C1072e c1072e;
        String strM1546a = C1081b.m1546a(str);
        if (TextUtils.isEmpty(strM1546a)) {
            return 4;
        }
        File file = new File(strM1546a + f2404e);
        File file2 = new File(strM1546a + ".log");
        RandomAccessFile randomAccessFile2 = null;
        this.f2425v = null;
        try {
            if (!file.exists()) {
                boolean zCreateNewFile = file.createNewFile();
                boolean zCreateNewFile2 = file2.createNewFile();
                if (!zCreateNewFile || !zCreateNewFile2) {
                    return 4;
                }
            }
            randomAccessFile = new RandomAccessFile(file, "rws");
        } catch (Throwable th) {
            th = th;
        }
        try {
            RandomAccessFile randomAccessFile3 = new RandomAccessFile(file2, "rws");
            this.f2425v = randomAccessFile3;
            int iM1470a = m1470a(inputStream, randomAccessFile, randomAccessFile3);
            if (iM1470a == 1) {
                file.renameTo(new File(strM1546a + f2406g));
                if (file2.exists()) {
                    file2.delete();
                }
                C1072e c1072e2 = this.f2427x;
                if (c1072e2 != null) {
                    c1072e2.m1516l();
                }
            } else if (iM1470a == 2) {
                C1072e c1072e3 = this.f2427x;
                if (c1072e3 != null) {
                    c1072e3.m1515k();
                }
            } else if (iM1470a == 3) {
                C1072e c1072e4 = this.f2427x;
                if (c1072e4 != null) {
                    c1072e4.m1514j();
                }
            } else if (iM1470a == 4 && (c1072e = this.f2427x) != null) {
                c1072e.m1518n();
            }
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return iM1470a;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            try {
                th.printStackTrace();
                String str2 = this.f2428y;
                if (str2 != null) {
                    str2 = this.f2428y + C1801a.f11059bQ + th.getMessage();
                }
                this.f2428y = str2;
                return 4;
            } finally {
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1472a(AbstractC1067a abstractC1067a) {
        File file = new File(C1081b.m1546a(abstractC1067a.f2414b) + ".log");
        File file2 = new File(C1081b.m1546a(abstractC1067a.f2414b) + f2404e);
        if (!file.exists() || !file2.exists()) {
            try {
                file.delete();
                file2.delete();
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        try {
            String strM1545a = C1081b.m1545a(file);
            StringBuilder sb = new StringBuilder("apkLogFileContent: ");
            sb.append(strM1545a);
            sb.append(", url: ");
            sb.append(abstractC1067a.f2413a);
            if (TextUtils.isEmpty(strM1545a)) {
                return;
            }
            String[] strArrSplit = strM1545a.split("\\|");
            abstractC1067a.f2418n = strArrSplit.length == 1 ? Long.parseLong(strM1545a) : Long.parseLong(strArrSplit[0]);
            if (abstractC1067a.f2418n > file2.length()) {
                abstractC1067a.f2418n = 0L;
            } else {
                abstractC1067a.f2423s = file2.length();
            }
            StringBuilder sb2 = new StringBuilder("readLogFile: startPost -> ");
            sb2.append(abstractC1067a.f2418n);
            sb2.append(", downloadSize -> ");
            sb2.append(abstractC1067a.f2423s);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    private void m1477g() {
        C1068a.m1493a().m1499a((AbstractRunnableC1337d) new AnonymousClass1());
    }

    /* JADX INFO: renamed from: h */
    private void m1478h() {
        try {
            RandomAccessFile randomAccessFile = this.f2425v;
            if (randomAccessFile != null) {
                randomAccessFile.setLength(0L);
                this.f2425v.write(C1081b.m1544a(this.f2424t, this.f2423s, this.f2427x.m1505a()).getBytes());
            }
            try {
                RandomAccessFile randomAccessFile2 = this.f2425v;
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                try {
                    RandomAccessFile randomAccessFile3 = this.f2425v;
                    if (randomAccessFile3 != null) {
                        randomAccessFile3.close();
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (Throwable th2) {
                try {
                    if (this.f2425v != null) {
                        this.f2425v.close();
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private void m1479i() {
        File file = new File(C1081b.m1546a(this.f2414b) + ".log");
        File file2 = new File(C1081b.m1546a(this.f2414b) + f2404e);
        if (!file.exists() || !file2.exists()) {
            try {
                file.delete();
                file2.delete();
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        try {
            String strM1545a = C1081b.m1545a(file);
            StringBuilder sb = new StringBuilder("apkLogFileContent: ");
            sb.append(strM1545a);
            sb.append(", url: ");
            sb.append(this.f2413a);
            if (TextUtils.isEmpty(strM1545a)) {
                return;
            }
            String[] strArrSplit = strM1545a.split("\\|");
            this.f2418n = strArrSplit.length == 1 ? Long.parseLong(strM1545a) : Long.parseLong(strArrSplit[0]);
            if (this.f2418n > file2.length()) {
                this.f2418n = 0L;
            } else {
                this.f2423s = file2.length();
            }
            StringBuilder sb2 = new StringBuilder("readLogFile: startPost -> ");
            sb2.append(this.f2418n);
            sb2.append(", downloadSize -> ");
            sb2.append(this.f2423s);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: j */
    private static int m1480j() {
        return 60000;
    }

    /* JADX INFO: renamed from: k */
    private static int m1481k() {
        return 20000;
    }

    /* JADX INFO: renamed from: a */
    public final void m1482a() {
        this.f2415c = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m1483a(a aVar) {
        this.f2426w = aVar;
        this.f2415c = false;
        C1068a.m1493a().m1499a((AbstractRunnableC1337d) new AnonymousClass1());
    }

    /* JADX INFO: renamed from: a */
    public final void m1484a(C1069b c1069b) {
        new StringBuilder("url: ").append(this.f2413a);
        m1487b(c1069b);
    }

    /* JADX INFO: renamed from: a */
    public final void m1485a(ConnectTimeoutException connectTimeoutException) {
        m1487b(C1070c.m1503a("10000", connectTimeoutException.getMessage()));
    }

    /* JADX INFO: renamed from: b */
    public final void m1486b() {
        this.f2416d = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m1487b(C1069b c1069b) {
        m1478h();
        StringBuilder sb = new StringBuilder("download failed --> ");
        sb.append(this.f2413a);
        sb.append("(");
        sb.append(c1069b.m1501a());
        sb.append(")");
        this.f2427x.m1518n();
        a aVar = this.f2426w;
        if (aVar != null) {
            aVar.mo1467a(this.f2427x, c1069b.m1502b());
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean mo1488c() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m1489d() {
        m1478h();
        new StringBuilder("url: ").append(this.f2413a);
        a aVar = this.f2426w;
        if (aVar != null) {
            aVar.mo1466a(this.f2427x, this.f2424t, this.f2423s, this.f2417m);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1490e() {
        new StringBuilder("url: ").append(this.f2413a);
        a aVar = this.f2426w;
        if (aVar != null) {
            C1072e c1072e = this.f2427x;
            aVar.mo1464a(c1072e, c1072e.f2453i);
        }
    }
}
