package com.p188b.p189a.p190a.p197g;

import android.util.Log;
import com.p188b.p189a.EnumC2535al;
import com.p188b.p189a.p190a.C2446c;
import com.p188b.p189a.p190a.p198h.AbstractC2518b;
import com.p188b.p199b.C2579f;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p285z2.InterfaceC4236p7;

/* JADX INFO: renamed from: com.b.a.a.g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2509a extends C2516h {

    /* JADX INFO: renamed from: a */
    private final Class<?> f15417a;

    /* JADX INFO: renamed from: b */
    private final C2515g<Socket> f15418b;

    /* JADX INFO: renamed from: c */
    private final C2515g<Socket> f15419c;

    /* JADX INFO: renamed from: d */
    private final C2515g<Socket> f15420d;

    /* JADX INFO: renamed from: e */
    private final C2515g<Socket> f15421e;

    /* JADX INFO: renamed from: f */
    private final C2511c f15422f = C2511c.m12759a();

    private C2509a(Class<?> cls, C2515g<Socket> c2515g, C2515g<Socket> c2515g2, C2515g<Socket> c2515g3, C2515g<Socket> c2515g4) {
        this.f15417a = cls;
        this.f15418b = c2515g;
        this.f15419c = c2515g2;
        this.f15420d = c2515g3;
        this.f15421e = c2515g4;
    }

    /* JADX INFO: renamed from: a */
    public static C2516h m12749a() {
        Class<?> cls;
        C2515g c2515g;
        C2515g c2515g2;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            C2515g c2515g3 = new C2515g(null, "setUseSessionTickets", Boolean.TYPE);
            C2515g c2515g4 = new C2515g(null, "setHostname", String.class);
            try {
                Class.forName("android.net.Network");
                c2515g = new C2515g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                try {
                    c2515g2 = new C2515g(null, "setAlpnProtocols", byte[].class);
                } catch (ClassNotFoundException unused2) {
                    c2515g2 = null;
                }
            } catch (ClassNotFoundException unused3) {
                c2515g = null;
            }
            return new C2509a(cls2, c2515g3, c2515g4, c2515g, c2515g2);
        } catch (ClassNotFoundException unused4) {
            return null;
        }
    }

    @Override // com.p188b.p189a.p190a.p197g.C2516h
    /* JADX INFO: renamed from: a */
    public final AbstractC2518b mo12750a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C2510b(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.mo12750a(x509TrustManager);
        }
    }

    @Override // com.p188b.p189a.p190a.p197g.C2516h
    /* JADX INFO: renamed from: a */
    public final Object mo12751a(String str) {
        return this.f15422f.m12760a(str);
    }

    @Override // com.p188b.p189a.p190a.p197g.C2516h
    /* JADX INFO: renamed from: a */
    public final String mo12752a(SSLSocket sSLSocket) {
        byte[] bArr;
        C2515g<Socket> c2515g = this.f15420d;
        if (c2515g == null || !c2515g.m12770a(sSLSocket) || (bArr = (byte[]) this.f15420d.m12771b(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, C2446c.f15179e);
    }

    @Override // com.p188b.p189a.p190a.p197g.C2516h
    /* JADX INFO: renamed from: a */
    public final void mo12753a(int i, String str, Throwable th) {
        int iMin;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int iIndexOf = str.indexOf(10, i3);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i3 + InterfaceC4236p7.OooO0OO);
                Log.println(i2, "OkHttp", str.substring(i3, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i3 = iMin;
                }
            }
            i3 = iMin + 1;
        }
    }

    @Override // com.p188b.p189a.p190a.p197g.C2516h
    /* JADX INFO: renamed from: a */
    public final void mo12754a(String str, Object obj) {
        if (this.f15422f.m12761a(obj)) {
            return;
        }
        mo12753a(5, str, (Throwable) null);
    }

    @Override // com.p188b.p189a.p190a.p197g.C2516h
    /* JADX INFO: renamed from: a */
    public final void mo12755a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!C2446c.m12586a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // com.p188b.p189a.p190a.p197g.C2516h
    /* JADX INFO: renamed from: a */
    public final void mo12756a(SSLSocket sSLSocket, String str, List<EnumC2535al> list) {
        if (str != null) {
            this.f15418b.m12769a(sSLSocket, Boolean.TRUE);
            this.f15419c.m12769a(sSLSocket, str);
        }
        C2515g<Socket> c2515g = this.f15421e;
        if (c2515g == null || !c2515g.m12770a(sSLSocket)) {
            return;
        }
        Object[] objArr = new Object[1];
        C2579f c2579f = new C2579f();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC2535al enumC2535al = list.get(i);
            if (enumC2535al != EnumC2535al.HTTP_1_0) {
                c2579f.mo13028h(enumC2535al.toString().length());
                c2579f.mo13008b(enumC2535al.toString());
            }
        }
        objArr[0] = c2579f.m13037n();
        this.f15421e.m12771b(sSLSocket, objArr);
    }

    @Override // com.p188b.p189a.p190a.p197g.C2516h
    /* JADX INFO: renamed from: b */
    public final boolean mo12757b(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), str)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo12757b(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }
}
