package com.anythink.expressad.exoplayer.p105j;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1702s;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.InterfaceC1738u;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1699p implements InterfaceC1702s {

    /* JADX INFO: renamed from: a */
    public static final int f9452a = 8000;

    /* JADX INFO: renamed from: b */
    public static final int f9453b = 8000;

    /* JADX INFO: renamed from: d */
    private static final String f9454d = "DefaultHttpDataSource";

    /* JADX INFO: renamed from: e */
    private static final int f9455e = 20;

    /* JADX INFO: renamed from: f */
    private static final long f9456f = 2048;

    /* JADX INFO: renamed from: g */
    private static final Pattern f9457g = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: h */
    private static final AtomicReference<byte[]> f9458h = new AtomicReference<>();

    /* JADX INFO: renamed from: i */
    private final boolean f9459i;

    /* JADX INFO: renamed from: j */
    private final int f9460j;

    /* JADX INFO: renamed from: k */
    private final int f9461k;

    /* JADX INFO: renamed from: l */
    private final String f9462l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC1738u<String> f9463m;

    /* JADX INFO: renamed from: n */
    private final InterfaceC1702s.f f9464n;

    /* JADX INFO: renamed from: o */
    private final InterfaceC1702s.f f9465o;

    /* JADX INFO: renamed from: p */
    private final InterfaceC1684aa<? super C1699p> f9466p;

    /* JADX INFO: renamed from: q */
    private C1694k f9467q;

    /* JADX INFO: renamed from: r */
    private HttpURLConnection f9468r;

    /* JADX INFO: renamed from: s */
    private InputStream f9469s;

    /* JADX INFO: renamed from: t */
    private boolean f9470t;

    /* JADX INFO: renamed from: u */
    private long f9471u;

    /* JADX INFO: renamed from: v */
    private long f9472v;

    /* JADX INFO: renamed from: w */
    private long f9473w;

    /* JADX INFO: renamed from: x */
    private long f9474x;

    private C1699p(String str, InterfaceC1738u<String> interfaceC1738u) {
        this(str, interfaceC1738u, null);
    }

    private C1699p(String str, InterfaceC1738u<String> interfaceC1738u, InterfaceC1684aa<? super C1699p> interfaceC1684aa) {
        this(str, interfaceC1738u, interfaceC1684aa, (byte) 0);
    }

    private C1699p(String str, InterfaceC1738u<String> interfaceC1738u, InterfaceC1684aa<? super C1699p> interfaceC1684aa, byte b) {
        this(str, interfaceC1738u, interfaceC1684aa, 8000, 8000, false, null);
    }

    public C1699p(String str, InterfaceC1738u<String> interfaceC1738u, InterfaceC1684aa<? super C1699p> interfaceC1684aa, int i, int i2, boolean z, InterfaceC1702s.f fVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f9462l = str;
        this.f9463m = interfaceC1738u;
        this.f9466p = interfaceC1684aa;
        this.f9465o = new InterfaceC1702s.f();
        this.f9460j = i;
        this.f9461k = i2;
        this.f9459i = z;
        this.f9464n = fVar;
    }

    /* JADX INFO: renamed from: a */
    private static long m7875a(HttpURLConnection httpURLConnection) {
        long j;
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (TextUtils.isEmpty(headerField)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                Log.e(f9454d, "Unexpected Content-Length [" + headerField + "]");
                j = -1;
            }
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField2)) {
            return j;
        }
        Matcher matcher = f9457g.matcher(headerField2);
        if (!matcher.find()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            Log.w(f9454d, "Inconsistent headers [" + headerField + "] [" + headerField2 + "]");
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            Log.e(f9454d, "Unexpected Content-Range [" + headerField2 + "]");
            return j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.HttpURLConnection m7876a(java.net.URL r6, byte[] r7, long r8, long r10, boolean r12, boolean r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p105j.C1699p.m7876a(java.net.URL, byte[], long, long, boolean, boolean):java.net.HttpURLConnection");
    }

    /* JADX INFO: renamed from: a */
    private static URL m7877a(URL url, String str) throws ProtocolException {
        if (str == null) {
            throw new ProtocolException("Null location redirect");
        }
        URL url2 = new URL(url, str);
        String protocol = url2.getProtocol();
        if ("https".equals(protocol) || "http".equals(protocol)) {
            return url2;
        }
        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
    }

    /* JADX INFO: renamed from: a */
    private static void m7878a(HttpURLConnection httpURLConnection, long j) {
        int i = C1717af.f9627a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private int m7879b(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9472v;
        if (j != -1) {
            long j2 = j - this.f9474x;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = this.f9469s.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.f9472v == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.f9474x += (long) i3;
        InterfaceC1684aa<? super C1699p> interfaceC1684aa = this.f9466p;
        if (interfaceC1684aa != null) {
            interfaceC1684aa.mo7840a(i3);
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        return r0;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.HttpURLConnection m7880b(com.anythink.expressad.exoplayer.p105j.C1694k r19) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r19
            java.net.URL r1 = new java.net.URL
            android.net.Uri r2 = r0.f9395c
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            byte[] r2 = r0.f9396d
            long r12 = r0.f9398f
            long r14 = r0.f9399g
            r3 = 1
            boolean r16 = r0.m7858a(r3)
            r11 = r18
            boolean r0 = r11.f9459i
            if (r0 != 0) goto L2a
            r8 = 1
            r0 = r18
            r3 = r12
            r5 = r14
            r7 = r16
            java.net.HttpURLConnection r0 = r0.m7876a(r1, r2, r3, r5, r7, r8)
            return r0
        L2a:
            r0 = 0
        L2b:
            int r17 = r0 + 1
            r3 = 20
            if (r0 > r3) goto La3
            r0 = 0
            r3 = r18
            r4 = r1
            r5 = r2
            r6 = r12
            r8 = r14
            r10 = r16
            r11 = r0
            java.net.HttpURLConnection r0 = r3.m7876a(r4, r5, r6, r8, r10, r11)
            int r3 = r0.getResponseCode()
            r4 = 300(0x12c, float:4.2E-43)
            if (r3 == r4) goto L5f
            r4 = 301(0x12d, float:4.22E-43)
            if (r3 == r4) goto L5f
            r4 = 302(0x12e, float:4.23E-43)
            if (r3 == r4) goto L5f
            r4 = 303(0x12f, float:4.25E-43)
            if (r3 == r4) goto L5f
            if (r2 != 0) goto L5e
            r2 = 307(0x133, float:4.3E-43)
            if (r3 == r2) goto L5f
            r2 = 308(0x134, float:4.32E-43)
            if (r3 != r2) goto L5e
            goto L5f
        L5e:
            return r0
        L5f:
            r2 = 0
            java.lang.String r3 = "Location"
            java.lang.String r3 = r0.getHeaderField(r3)
            r0.disconnect()
            if (r3 == 0) goto L9b
            java.net.URL r0 = new java.net.URL
            r0.<init>(r1, r3)
            java.lang.String r1 = r0.getProtocol()
            java.lang.String r3 = "https"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L95
            java.lang.String r3 = "http"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L85
            goto L95
        L85:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Unsupported protocol redirect: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L95:
            r11 = r18
            r1 = r0
            r0 = r17
            goto L2b
        L9b:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Null location redirect"
            r0.<init>(r1)
            throw r0
        La3:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException
            java.lang.String r1 = java.lang.String.valueOf(r17)
            java.lang.String r2 = "Too many redirects: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p105j.C1699p.m7880b(com.anythink.expressad.exoplayer.j.k):java.net.HttpURLConnection");
    }

    /* JADX INFO: renamed from: e */
    private HttpURLConnection m7881e() {
        return this.f9468r;
    }

    /* JADX INFO: renamed from: f */
    private long m7882f() {
        return this.f9473w;
    }

    /* JADX INFO: renamed from: g */
    private long m7883g() {
        return this.f9474x;
    }

    /* JADX INFO: renamed from: h */
    private long m7884h() {
        long j = this.f9472v;
        return j == -1 ? j : j - this.f9474x;
    }

    /* JADX INFO: renamed from: i */
    private void m7885i() throws IOException {
        if (this.f9473w == this.f9471u) {
            return;
        }
        byte[] andSet = f9458h.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j = this.f9473w;
            long j2 = this.f9471u;
            if (j == j2) {
                f9458h.set(andSet);
                return;
            }
            int i = this.f9469s.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (i == -1) {
                throw new EOFException();
            }
            this.f9473w += (long) i;
            InterfaceC1684aa<? super C1699p> interfaceC1684aa = this.f9466p;
            if (interfaceC1684aa != null) {
                interfaceC1684aa.mo7840a(i);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private void m7886j() {
        HttpURLConnection httpURLConnection = this.f9468r;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e(f9454d, "Unexpected error while disconnecting", e);
            }
            this.f9468r = null;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1702s, com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final int mo7741a(byte[] bArr, int i, int i2) throws InterfaceC1702s.c {
        try {
            if (this.f9473w != this.f9471u) {
                byte[] andSet = f9458h.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j = this.f9473w;
                    long j2 = this.f9471u;
                    if (j == j2) {
                        f9458h.set(andSet);
                        break;
                    }
                    int i3 = this.f9469s.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i3 == -1) {
                        throw new EOFException();
                    }
                    this.f9473w += (long) i3;
                    InterfaceC1684aa<? super C1699p> interfaceC1684aa = this.f9466p;
                    if (interfaceC1684aa != null) {
                        interfaceC1684aa.mo7840a(i3);
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f9472v;
            if (j3 != -1) {
                long j4 = j3 - this.f9474x;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j4);
            }
            int i4 = this.f9469s.read(bArr, i, i2);
            if (i4 == -1) {
                if (this.f9472v == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f9474x += (long) i4;
            InterfaceC1684aa<? super C1699p> interfaceC1684aa2 = this.f9466p;
            if (interfaceC1684aa2 != null) {
                interfaceC1684aa2.mo7840a(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new InterfaceC1702s.c(e, this.f9467q, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00db  */
    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1702s, com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo7742a(com.anythink.expressad.exoplayer.p105j.C1694k r25) throws com.anythink.expressad.exoplayer.p105j.InterfaceC1702s.c {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p105j.C1699p.mo7742a(com.anythink.expressad.exoplayer.j.k):long");
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final Uri mo7743a() {
        HttpURLConnection httpURLConnection = this.f9468r;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1702s
    /* JADX INFO: renamed from: a */
    public final void mo7887a(String str) {
        C1711a.m8005a(str);
        this.f9465o.m7902a(str);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1702s
    /* JADX INFO: renamed from: a */
    public final void mo7888a(String str, String str2) {
        C1711a.m8005a(str);
        C1711a.m8005a(str2);
        this.f9465o.m7903a(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034 A[Catch: Exception -> 0x0065, all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:3:0x0002, B:5:0x0006, B:9:0x0014, B:26:0x0065, B:29:0x006c, B:30:0x0074, B:14:0x001e, B:16:0x0026, B:21:0x0034, B:23:0x0044, B:25:0x004c, B:8:0x0011), top: B:45:0x0002, inners: #2 }] */
    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1702s, com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo7744b() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f9469s     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L75
            java.net.HttpURLConnection r2 = r9.f9468r     // Catch: java.lang.Throwable -> L88
            long r3 = r9.f9472v     // Catch: java.lang.Throwable -> L88
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L11
            goto L14
        L11:
            long r7 = r9.f9474x     // Catch: java.lang.Throwable -> L88
            long r3 = r3 - r7
        L14:
            int r7 = com.anythink.expressad.exoplayer.p107k.C1717af.f9627a     // Catch: java.lang.Throwable -> L88
            r8 = 19
            if (r7 == r8) goto L1e
            r8 = 20
            if (r7 != r8) goto L65
        L1e:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L2e
            int r3 = r2.read()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            r4 = -1
            if (r3 != r4) goto L34
            goto L65
        L2e:
            r5 = 2048(0x800, double:1.012E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L65
        L34:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            if (r4 != 0) goto L4c
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            if (r3 == 0) goto L65
        L4c:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
        L65:
            java.io.InputStream r2 = r9.f9469s     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L88
            r2.close()     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L88
            goto L75
        L6b:
            r2 = move-exception
            com.anythink.expressad.exoplayer.j.s$c r3 = new com.anythink.expressad.exoplayer.j.s$c     // Catch: java.lang.Throwable -> L88
            com.anythink.expressad.exoplayer.j.k r4 = r9.f9467q     // Catch: java.lang.Throwable -> L88
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L88
            throw r3     // Catch: java.lang.Throwable -> L88
        L75:
            r9.f9469s = r0
            r9.m7886j()
            boolean r0 = r9.f9470t
            if (r0 == 0) goto L87
            r9.f9470t = r1
            com.anythink.expressad.exoplayer.j.aa<? super com.anythink.expressad.exoplayer.j.p> r0 = r9.f9466p
            if (r0 == 0) goto L87
            r0.mo7842c()
        L87:
            return
        L88:
            r2 = move-exception
            r9.f9469s = r0
            r9.m7886j()
            boolean r0 = r9.f9470t
            if (r0 == 0) goto L9b
            r9.f9470t = r1
            com.anythink.expressad.exoplayer.j.aa<? super com.anythink.expressad.exoplayer.j.p> r0 = r9.f9466p
            if (r0 == 0) goto L9b
            r0.mo7842c()
        L9b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p105j.C1699p.mo7744b():void");
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1702s
    /* JADX INFO: renamed from: c */
    public final Map<String, List<String>> mo7889c() {
        HttpURLConnection httpURLConnection = this.f9468r;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1702s
    /* JADX INFO: renamed from: d */
    public final void mo7890d() {
        this.f9465o.m7901a();
    }
}
