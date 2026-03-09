package com.p188b.p189a.p190a.p193c;

import com.p188b.p189a.C2426a;
import com.p188b.p189a.C2526ac;
import com.p188b.p189a.C2532ai;
import com.p188b.p189a.C2538ao;
import com.p188b.p189a.C2542as;
import com.p188b.p189a.C2555i;
import com.p188b.p189a.InterfaceC2529af;
import com.p188b.p189a.p190a.p192b.C2444g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.b.a.a.c.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2457k implements InterfaceC2529af {

    /* JADX INFO: renamed from: a */
    private final C2532ai f15206a;

    /* JADX INFO: renamed from: b */
    private final boolean f15207b;

    /* JADX INFO: renamed from: c */
    private C2444g f15208c;

    /* JADX INFO: renamed from: d */
    private Object f15209d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f15210e;

    public C2457k(C2532ai c2532ai, boolean z) {
        this.f15206a = c2532ai;
        this.f15207b = z;
    }

    /* JADX INFO: renamed from: a */
    private C2426a m12621a(C2526ac c2526ac) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifierM12847j;
        C2555i c2555iM12848k;
        if (c2526ac.m12813c()) {
            SSLSocketFactory sSLSocketFactoryM12846i = this.f15206a.m12846i();
            hostnameVerifierM12847j = this.f15206a.m12847j();
            sSLSocketFactory = sSLSocketFactoryM12846i;
            c2555iM12848k = this.f15206a.m12848k();
        } else {
            sSLSocketFactory = null;
            hostnameVerifierM12847j = null;
            c2555iM12848k = null;
        }
        return new C2426a(c2526ac.m12817f(), c2526ac.m12818g(), this.f15206a.m12844g(), this.f15206a.m12845h(), sSLSocketFactory, hostnameVerifierM12847j, c2555iM12848k, this.f15206a.m12850m(), this.f15206a.m12841d(), this.f15206a.m12855r(), this.f15206a.m12856s(), this.f15206a.m12842e());
    }

    /* JADX INFO: renamed from: a */
    private static boolean m12622a(C2542as c2542as, C2526ac c2526ac) {
        C2526ac c2526acM12864a = c2542as.m12884a().m12864a();
        return c2526acM12864a.m12817f().equals(c2526ac.m12817f()) && c2526acM12864a.m12818g() == c2526ac.m12818g() && c2526acM12864a.m12811b().equals(c2526ac.m12811b());
    }

    /* JADX INFO: renamed from: a */
    private boolean m12623a(IOException iOException, boolean z, C2538ao c2538ao) {
        this.f15208c.m12563a(iOException);
        if (!this.f15206a.m12854q()) {
            return false;
        }
        if (z && (c2538ao.m12868d() instanceof InterfaceC2459m)) {
            return false;
        }
        return (!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z)) && this.f15208c.m12569e();
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0161 A[SYNTHETIC] */
    @Override // com.p188b.p189a.InterfaceC2529af
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.p188b.p189a.C2542as mo12512a(com.p188b.p189a.InterfaceC2530ag r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.p190a.p193c.C2457k.mo12512a(com.b.a.ag):com.b.a.as");
    }

    /* JADX INFO: renamed from: a */
    public final void m12624a(Object obj) {
        this.f15209d = obj;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12625a() {
        return this.f15210e;
    }
}
