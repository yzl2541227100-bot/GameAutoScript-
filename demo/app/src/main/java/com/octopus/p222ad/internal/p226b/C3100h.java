package com.octopus.p222ad.internal.p226b;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.octopus.p222ad.internal.p226b.p228b.C3094d;
import com.octopus.p222ad.internal.p226b.p228b.InterfaceC3093c;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.h */
/* JADX INFO: loaded from: classes2.dex */
public class C3100h implements InterfaceC3107o {

    /* JADX INFO: renamed from: a */
    private final InterfaceC3093c f17078a;

    /* JADX INFO: renamed from: b */
    private C3108p f17079b;

    /* JADX INFO: renamed from: c */
    private HttpURLConnection f17080c;

    /* JADX INFO: renamed from: d */
    private InputStream f17081d;

    public C3100h(C3100h c3100h) {
        this.f17079b = c3100h.f17079b;
        this.f17078a = c3100h.f17078a;
    }

    public C3100h(String str) {
        this(str, C3094d.m14274a());
    }

    public C3100h(String str, InterfaceC3093c interfaceC3093c) {
        this.f17078a = (InterfaceC3093c) C3103k.m14329a(interfaceC3093c);
        C3108p c3108pMo14272a = interfaceC3093c.mo14272a(str);
        this.f17079b = c3108pMo14272a == null ? new C3108p(str, Integer.MIN_VALUE, C3106n.m14348a(str)) : c3108pMo14272a;
    }

    /* JADX INFO: renamed from: a */
    private int m14313a(HttpURLConnection httpURLConnection, int i, int i2) throws IOException {
        int contentLength = httpURLConnection.getContentLength();
        return i2 == 200 ? contentLength : i2 == 206 ? contentLength + i : this.f17079b.f17096b;
    }

    /* JADX INFO: renamed from: a */
    private HttpURLConnection m14314a(int i, int i2) throws C3105m, IOException {
        String str;
        HttpURLConnection httpURLConnection;
        boolean z;
        String headerField = this.f17079b.f17095a;
        int i3 = 0;
        do {
            String str2 = HaoboLog.httpUrlSourceLogTag;
            StringBuilder sb = new StringBuilder();
            sb.append("Open connection ");
            if (i > 0) {
                str = " with offset " + i;
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" to ");
            sb.append(headerField);
            HaoboLog.m14607d(str2, sb.toString());
            httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
            if (i > 0) {
                httpURLConnection.setRequestProperty(HttpHeaders.RANGE, "bytes=" + i + "-");
            }
            if (i2 > 0) {
                httpURLConnection.setConnectTimeout(i2);
                httpURLConnection.setReadTimeout(i2);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z) {
                headerField = httpURLConnection.getHeaderField("Location");
                i3++;
                httpURLConnection.disconnect();
            }
            if (i3 > 5) {
                throw new C3105m("Too many redirects: " + i3);
            }
        } while (z);
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m14315e() throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = com.octopus.p222ad.internal.utilities.HaoboLog.httpUrlSourceLogTag
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Read content info failFrom "
            r1.append(r2)
            com.octopus.ad.internal.b.p r2 = r6.f17079b
            java.lang.String r2 = r2.f17095a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.octopus.p222ad.internal.utilities.HaoboLog.m14607d(r0, r1)
            r0 = 0
            r1 = 10000(0x2710, float:1.4013E-41)
            r2 = 0
            java.net.HttpURLConnection r0 = r6.m14314a(r0, r1)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L65
            int r1 = r0.getContentLength()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r3 = r0.getContentType()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.io.InputStream r2 = r0.getInputStream()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            com.octopus.ad.internal.b.p r4 = new com.octopus.ad.internal.b.p     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            com.octopus.ad.internal.b.p r5 = r6.f17079b     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r5 = r5.f17095a     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r4.<init>(r5, r1, r3)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r6.f17079b = r4     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            com.octopus.ad.internal.b.b.c r1 = r6.f17078a     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r3 = r4.f17095a     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r1.mo14273a(r3, r4)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r1 = com.octopus.p222ad.internal.utilities.HaoboLog.httpUrlSourceLogTag     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r3.<init>()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r4 = "Source info fetched: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            com.octopus.ad.internal.b.p r4 = r6.f17079b     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r3.append(r4)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            com.octopus.p222ad.internal.utilities.HaoboLog.m14607d(r1, r3)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            com.octopus.p222ad.internal.p226b.C3106n.m14350a(r2)
            if (r0 == 0) goto L89
            goto L86
        L5e:
            r1 = move-exception
            goto L8a
        L60:
            r1 = move-exception
            goto L67
        L62:
            r1 = move-exception
            r0 = r2
            goto L8a
        L65:
            r1 = move-exception
            r0 = r2
        L67:
            java.lang.String r3 = com.octopus.p222ad.internal.utilities.HaoboLog.httpUrlSourceLogTag     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r4.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = "Error fetching info failFrom "
            r4.append(r5)     // Catch: java.lang.Throwable -> L5e
            com.octopus.ad.internal.b.p r5 = r6.f17079b     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = r5.f17095a     // Catch: java.lang.Throwable -> L5e
            r4.append(r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5e
            com.octopus.p222ad.internal.utilities.HaoboLog.m14610e(r3, r4, r1)     // Catch: java.lang.Throwable -> L5e
            com.octopus.p222ad.internal.p226b.C3106n.m14350a(r2)
            if (r0 == 0) goto L89
        L86:
            r0.disconnect()
        L89:
            return
        L8a:
            com.octopus.p222ad.internal.p226b.C3106n.m14350a(r2)
            if (r0 == 0) goto L92
            r0.disconnect()
        L92:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.octopus.p222ad.internal.p226b.C3100h.m14315e():void");
    }

    @Override // com.octopus.p222ad.internal.p226b.InterfaceC3107o
    /* JADX INFO: renamed from: a */
    public synchronized int mo14316a() throws C3105m {
        if (this.f17079b.f17096b == Integer.MIN_VALUE) {
            m14315e();
        }
        return this.f17079b.f17096b;
    }

    @Override // com.octopus.p222ad.internal.p226b.InterfaceC3107o
    /* JADX INFO: renamed from: a */
    public int mo14317a(byte[] bArr) throws C3105m {
        InputStream inputStream = this.f17081d;
        if (inputStream == null) {
            throw new C3105m("Error reading data failFrom " + this.f17079b.f17095a + ": connection is absent!");
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e) {
            throw new C3101i("Reading source " + this.f17079b.f17095a + " is interrupted", e);
        } catch (IOException e2) {
            throw new C3105m("Error reading data failFrom " + this.f17079b.f17095a, e2);
        }
    }

    @Override // com.octopus.p222ad.internal.p226b.InterfaceC3107o
    /* JADX INFO: renamed from: a */
    public void mo14318a(int i) throws C3105m {
        try {
            HttpURLConnection httpURLConnectionM14314a = m14314a(i, -1);
            this.f17080c = httpURLConnectionM14314a;
            String contentType = httpURLConnectionM14314a.getContentType();
            this.f17081d = new BufferedInputStream(this.f17080c.getInputStream(), 8192);
            HttpURLConnection httpURLConnection = this.f17080c;
            C3108p c3108p = new C3108p(this.f17079b.f17095a, m14313a(httpURLConnection, i, httpURLConnection.getResponseCode()), contentType);
            this.f17079b = c3108p;
            this.f17078a.mo14273a(c3108p.f17095a, c3108p);
        } catch (IOException e) {
            throw new C3105m("Error opening connection for " + this.f17079b.f17095a + " with offset " + i, e);
        }
    }

    @Override // com.octopus.p222ad.internal.p226b.InterfaceC3107o
    /* JADX INFO: renamed from: b */
    public void mo14319b() throws C3105m {
        HttpURLConnection httpURLConnection = this.f17080c;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (IllegalArgumentException | NullPointerException e) {
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please,  create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized String m14320c() throws C3105m {
        if (TextUtils.isEmpty(this.f17079b.f17097c)) {
            m14315e();
        }
        return this.f17079b.f17097c;
    }

    /* JADX INFO: renamed from: d */
    public String m14321d() {
        return this.f17079b.f17095a;
    }

    public String toString() {
        return "HttpUrlSource{sourceInfo='" + this.f17079b + "}";
    }
}
