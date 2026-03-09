package com.anythink.expressad.foundation.p120g.p126f.p131e;

import android.text.TextUtils;
import com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i;
import com.anythink.expressad.foundation.p120g.p126f.p129c.C1829a;
import com.anythink.expressad.foundation.p120g.p126f.p129c.C1831c;
import com.anythink.expressad.foundation.p120g.p126f.p130d.C1838f;
import com.github.kevinsawicki.http.HttpRequest;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p285z2.o000000O;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.e.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1842b implements InterfaceC1841a {

    /* JADX INFO: renamed from: a */
    private static final int f11367a = 100;

    /* JADX INFO: renamed from: b */
    private C1829a f11368b;

    /* JADX INFO: renamed from: c */
    private SSLSocketFactory f11369c;

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.e.b$a */
    public static class a extends FilterInputStream {

        /* JADX INFO: renamed from: a */
        private final HttpURLConnection f11370a;

        public a(HttpURLConnection httpURLConnection) {
            super(C1842b.m9554b(httpURLConnection));
            this.f11370a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.f11370a.disconnect();
        }
    }

    public C1842b(SSLSocketFactory sSLSocketFactory, C1829a c1829a) {
        this.f11369c = sSLSocketFactory;
        this.f11368b = c1829a;
    }

    /* JADX INFO: renamed from: a */
    private HttpURLConnection m9549a(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection;
        C1829a c1829a = this.f11368b;
        if (c1829a == null || TextUtils.isEmpty(c1829a.f11304b) || TextUtils.isEmpty(this.f11368b.f11305c)) {
            uRLConnectionOpenConnection = url.openConnection();
        } else {
            Proxy.Type type = Proxy.Type.HTTP;
            C1829a c1829a2 = this.f11368b;
            uRLConnectionOpenConnection = url.openConnection(new Proxy(type, new InetSocketAddress(c1829a2.f11304b, Integer.valueOf(c1829a2.f11305c).intValue())));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: a */
    private HttpURLConnection m9550a(URL url, AbstractC1856i<?> abstractC1856i) throws IOException {
        URLConnection uRLConnectionOpenConnection;
        SSLSocketFactory sSLSocketFactory;
        C1829a c1829a = this.f11368b;
        if (c1829a == null || TextUtils.isEmpty(c1829a.f11304b) || TextUtils.isEmpty(this.f11368b.f11305c)) {
            uRLConnectionOpenConnection = url.openConnection();
        } else {
            Proxy.Type type = Proxy.Type.HTTP;
            C1829a c1829a2 = this.f11368b;
            uRLConnectionOpenConnection = url.openConnection(new Proxy(type, new InetSocketAddress(c1829a2.f11304b, Integer.valueOf(c1829a2.f11305c).intValue())));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
        int iM9621k = abstractC1856i.m9621k();
        httpURLConnection.setConnectTimeout(iM9621k);
        httpURLConnection.setReadTimeout(iM9621k);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f11369c) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: a */
    private static List<C1831c> m9551a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new C1831c(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static void m9552a(HttpURLConnection httpURLConnection, AbstractC1856i<?> abstractC1856i) throws ProtocolException {
        switch (abstractC1856i.m9605a()) {
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m9555b(httpURLConnection, abstractC1856i);
                return;
            case 2:
                httpURLConnection.setRequestMethod(HttpRequest.METHOD_PUT);
                m9555b(httpURLConnection, abstractC1856i);
                return;
            case 3:
                httpURLConnection.setRequestMethod(HttpRequest.METHOD_DELETE);
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod(HttpRequest.METHOD_OPTIONS);
                return;
            case 6:
                httpURLConnection.setRequestMethod(HttpRequest.METHOD_TRACE);
                return;
            case 7:
                m9555b(httpURLConnection, abstractC1856i);
                httpURLConnection.setRequestMethod(o000000O.OooO00o.OooO00o);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m9553a(int i, int i2) {
        if (i != 4) {
            return ((100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static InputStream m9554b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m9555b(HttpURLConnection httpURLConnection, AbstractC1856i<?> abstractC1856i) {
        byte[] bArrMo9542h = abstractC1856i.mo9542h();
        if (bArrMo9542h != null) {
            boolean z = abstractC1856i instanceof C1838f;
            if (z) {
                httpURLConnection.setChunkedStreamingMode(2048);
            }
            httpURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(bArrMo9542h);
            if (z) {
                abstractC1856i.mo9543a((OutputStream) dataOutputStream);
            }
            dataOutputStream.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0 A[Catch: all -> 0x0121, TryCatch #1 {all -> 0x0121, blocks: (B:15:0x006f, B:16:0x007b, B:18:0x0081, B:19:0x0097, B:20:0x009b, B:21:0x009e, B:56:0x011b, B:57:0x0120, B:22:0x00a2, B:23:0x00a7, B:32:0x00c9, B:34:0x00d0, B:47:0x00ec, B:54:0x0113, B:55:0x011a, B:28:0x00b7, B:29:0x00bc, B:30:0x00c0), top: B:64:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113 A[Catch: all -> 0x0121, TRY_ENTER, TryCatch #1 {all -> 0x0121, blocks: (B:15:0x006f, B:16:0x007b, B:18:0x0081, B:19:0x0097, B:20:0x009b, B:21:0x009e, B:56:0x011b, B:57:0x0120, B:22:0x00a2, B:23:0x00a7, B:32:0x00c9, B:34:0x00d0, B:47:0x00ec, B:54:0x0113, B:55:0x011a, B:28:0x00b7, B:29:0x00bc, B:30:0x00c0), top: B:64:0x006f }] */
    @Override // com.anythink.expressad.foundation.p120g.p126f.p131e.InterfaceC1841a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.anythink.expressad.foundation.p120g.p126f.p132f.C1845b mo9547a(com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i<?> r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p120g.p126f.p131e.C1842b.mo9547a(com.anythink.expressad.foundation.g.f.i):com.anythink.expressad.foundation.g.f.f.b");
    }
}
