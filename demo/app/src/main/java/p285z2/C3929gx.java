package p285z2;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.TlsVersion;

/* JADX INFO: renamed from: z2.gx */
/* JADX INFO: loaded from: classes2.dex */
public final class C3929gx {
    private final TlsVersion OooO00o;
    private final C4483vw OooO0O0;
    private final List<Certificate> OooO0OO;
    private final List<Certificate> OooO0Oo;

    private C3929gx(TlsVersion tlsVersion, C4483vw c4483vw, List<Certificate> list, List<Certificate> list2) {
        this.OooO00o = tlsVersion;
        this.OooO0O0 = c4483vw;
        this.OooO0OO = list;
        this.OooO0Oo = list2;
    }

    public static C3929gx OooO0O0(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        C4483vw c4483vwOooO00o = C4483vw.OooO00o(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        TlsVersion tlsVersionForJavaName = TlsVersion.forJavaName(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listOooOo0O = peerCertificates != null ? C4558xx.OooOo0O(peerCertificates) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new C3929gx(tlsVersionForJavaName, c4483vwOooO00o, listOooOo0O, localCertificates != null ? C4558xx.OooOo0O(localCertificates) : Collections.emptyList());
    }

    public static C3929gx OooO0OO(TlsVersion tlsVersion, C4483vw c4483vw, List<Certificate> list, List<Certificate> list2) {
        Objects.requireNonNull(tlsVersion, "tlsVersion == null");
        Objects.requireNonNull(c4483vw, "cipherSuite == null");
        return new C3929gx(tlsVersion, c4483vw, C4558xx.OooOo0(list), C4558xx.OooOo0(list2));
    }

    public C4483vw OooO00o() {
        return this.OooO0O0;
    }

    public List<Certificate> OooO0Oo() {
        return this.OooO0Oo;
    }

    public List<Certificate> OooO0o() {
        return this.OooO0OO;
    }

    @Nullable
    public Principal OooO0o0() {
        if (this.OooO0Oo.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.OooO0Oo.get(0)).getSubjectX500Principal();
    }

    @Nullable
    public Principal OooO0oO() {
        if (this.OooO0OO.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.OooO0OO.get(0)).getSubjectX500Principal();
    }

    public TlsVersion OooO0oo() {
        return this.OooO00o;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C3929gx)) {
            return false;
        }
        C3929gx c3929gx = (C3929gx) obj;
        return this.OooO00o.equals(c3929gx.OooO00o) && this.OooO0O0.equals(c3929gx.OooO0O0) && this.OooO0OO.equals(c3929gx.OooO0OO) && this.OooO0Oo.equals(c3929gx.OooO0Oo);
    }

    public int hashCode() {
        return ((((((527 + this.OooO00o.hashCode()) * 31) + this.OooO0O0.hashCode()) * 31) + this.OooO0OO.hashCode()) * 31) + this.OooO0Oo.hashCode();
    }
}
