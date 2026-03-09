package com.anythink.expressad.p073a;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.anythink.china.common.p033a.AbstractC1067a;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.p086d.C1483a;
import com.anythink.expressad.p086d.C1486b;
import com.github.kevinsawicki.http.HttpRequest;
import java.net.HttpURLConnection;
import java.net.URL;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.anythink.expressad.a.f */
/* JADX INFO: loaded from: classes.dex */
public class C1414f {

    /* JADX INFO: renamed from: a */
    private static final String f6341a = "f";

    /* JADX INFO: renamed from: b */
    private static final int f6342b = 60000;

    /* JADX INFO: renamed from: c */
    private C1483a f6343c;

    /* JADX INFO: renamed from: d */
    private String f6344d;

    /* JADX INFO: renamed from: e */
    private boolean f6345e = true;

    /* JADX INFO: renamed from: f */
    private final int f6346f = 3145728;

    /* JADX INFO: renamed from: g */
    private a f6347g;

    /* JADX INFO: renamed from: com.anythink.expressad.a.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f6348a;

        /* JADX INFO: renamed from: b */
        public String f6349b;

        /* JADX INFO: renamed from: c */
        public String f6350c;

        /* JADX INFO: renamed from: d */
        public String f6351d;

        /* JADX INFO: renamed from: e */
        public int f6352e;

        /* JADX INFO: renamed from: f */
        public int f6353f;

        /* JADX INFO: renamed from: g */
        public String f6354g;

        /* JADX INFO: renamed from: h */
        public String f6355h;

        /* JADX INFO: renamed from: a */
        public final String m5311a() {
            return "statusCode=" + this.f6353f + ", location=" + this.f6348a + ", contentType=" + this.f6349b + ", contentLength=" + this.f6352e + ", contentEncoding=" + this.f6350c + ", referer=" + this.f6351d;
        }

        public final String toString() {
            return "http header:...\nstatusCode=" + this.f6353f + ", location=" + this.f6348a + ", contentType=" + this.f6349b + ", contentLength=" + this.f6352e + ", contentEncoding=" + this.f6350c + ", referer=" + this.f6351d;
        }
    }

    public C1414f() {
        C1486b.m6002a();
        C1773a.m8548c().m8558f();
        C1483a c1483aM6007b = C1486b.m6007b();
        this.f6343c = c1483aM6007b;
        if (c1483aM6007b == null) {
            C1486b.m6002a();
            this.f6343c = C1486b.m6010c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[Catch: all -> 0x002c, TryCatch #5 {all -> 0x002c, blocks: (B:4:0x0008, B:5:0x000e, B:19:0x002f, B:21:0x0033, B:22:0x0040), top: B:36:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[Catch: Exception -> 0x0049, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0049, blocks: (B:10:0x0022, B:24:0x0045), top: B:39:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m5308a(java.io.InputStream r4, boolean r5) throws java.lang.Throwable {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            if (r5 == 0) goto Le
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r4 = r5
        Le:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
        L18:
            java.lang.String r4 = r5.readLine()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            if (r4 == 0) goto L22
            r0.append(r4)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            goto L18
        L22:
            r5.close()     // Catch: java.lang.Exception -> L49
            goto L4d
        L26:
            r4 = move-exception
            r1 = r5
            goto L52
        L29:
            r4 = move-exception
            r1 = r5
            goto L2f
        L2c:
            r4 = move-exception
            goto L52
        L2e:
            r4 = move-exception
        L2f:
            com.anythink.expressad.a.f$a r5 = r3.f6347g     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L40
            com.anythink.expressad.a.f$a r5 = new com.anythink.expressad.a.f$a     // Catch: java.lang.Throwable -> L2c
            r5.<init>()     // Catch: java.lang.Throwable -> L2c
            r3.f6347g = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> L2c
            r5.f6355h = r2     // Catch: java.lang.Throwable -> L2c
        L40:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.lang.Exception -> L49
            goto L4d
        L49:
            r4 = move-exception
            r4.printStackTrace()
        L4d:
            java.lang.String r4 = r0.toString()
            return r4
        L52:
            if (r1 == 0) goto L5c
            r1.close()     // Catch: java.lang.Exception -> L58
            goto L5c
        L58:
            r5 = move-exception
            r5.printStackTrace()
        L5c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.p073a.C1414f.m5308a(java.io.InputStream, boolean):java.lang.String");
    }

    /* JADX INFO: renamed from: a */
    private void m5309a(boolean z) {
        this.f6345e = z;
    }

    /* JADX INFO: renamed from: a */
    public final a m5310a(String str, boolean z, boolean z3, C1781c c1781c) {
        HttpURLConnection httpURLConnection;
        int i;
        byte[] bytes;
        HttpURLConnection httpURLConnection2 = null;
        if (!URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String strReplace = str.replace(C4196o4.OooO00o.OooO0Oo, "%20");
        URLUtil.isHttpsUrl(strReplace);
        this.f6347g = new a();
        try {
            httpURLConnection = (HttpURLConnection) new URL(strReplace).openConnection();
        } catch (Throwable th) {
            th = th;
        }
        try {
            httpURLConnection.setRequestMethod("GET");
            if ((!z && !z3) || c1781c == null) {
                httpURLConnection.setRequestProperty("User-Agent", C1341e.m4073i());
            }
            if (z && c1781c != null && c1781c.m8797E() == 1) {
                httpURLConnection.setRequestProperty("User-Agent", C1341e.m4073i());
            }
            if (z3 && c1781c != null && c1781c.m8796D() == 1) {
                httpURLConnection.setRequestProperty("User-Agent", C1341e.m4073i());
            }
            httpURLConnection.setRequestProperty(HttpRequest.HEADER_ACCEPT_ENCODING, "gzip");
            if (this.f6343c.m5979v() && !TextUtils.isEmpty(this.f6344d)) {
                httpURLConnection.setRequestProperty(RequestParameters.SUBRESOURCE_REFERER, this.f6344d);
            }
            httpURLConnection.setConnectTimeout(f6342b);
            httpURLConnection.setReadTimeout(f6342b);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.connect();
            this.f6347g.f6348a = httpURLConnection.getHeaderField("Location");
            this.f6347g.f6351d = httpURLConnection.getHeaderField(HttpRequest.HEADER_REFERER);
            this.f6347g.f6353f = httpURLConnection.getResponseCode();
            this.f6347g.f6349b = httpURLConnection.getContentType();
            this.f6347g.f6352e = httpURLConnection.getContentLength();
            this.f6347g.f6350c = httpURLConnection.getContentEncoding();
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(this.f6347g.f6350c);
            a aVar = this.f6347g;
            if (aVar.f6353f == 200 && this.f6345e && (i = aVar.f6352e) > 0 && i < 3145728 && !TextUtils.isEmpty(strReplace) && !strReplace.endsWith(AbstractC1067a.f2406g)) {
                try {
                    String strM5308a = m5308a(httpURLConnection.getInputStream(), zEqualsIgnoreCase);
                    if (!TextUtils.isEmpty(strM5308a) && (bytes = strM5308a.getBytes()) != null && bytes.length > 0 && bytes.length < 3145728) {
                        this.f6347g.f6354g = strM5308a.trim();
                    }
                } catch (Throwable unused) {
                }
            }
            this.f6344d = strReplace;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return this.f6347g;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            try {
                this.f6347g.f6355h = th.getMessage();
                return this.f6347g;
            } finally {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        }
    }
}
