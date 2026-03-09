package com.p188b.p189a;

import com.p188b.p189a.p190a.C2446c;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: com.b.a.z */
/* JADX INFO: loaded from: classes.dex */
public final class C2572z {

    /* JADX INFO: renamed from: a */
    private final EnumC2547ax f15801a;

    /* JADX INFO: renamed from: b */
    private final C2558l f15802b;

    /* JADX INFO: renamed from: c */
    private final List<Certificate> f15803c;

    /* JADX INFO: renamed from: d */
    private final List<Certificate> f15804d;

    private C2572z(EnumC2547ax enumC2547ax, C2558l c2558l, List<Certificate> list, List<Certificate> list2) {
        this.f15801a = enumC2547ax;
        this.f15802b = c2558l;
        this.f15803c = list;
        this.f15804d = list2;
    }

    /* JADX INFO: renamed from: a */
    public static C2572z m12971a(SSLSession sSLSession) {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        C2558l c2558lM12935a = C2558l.m12935a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        EnumC2547ax enumC2547axM12915a = EnumC2547ax.m12915a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listM12579a = peerCertificates != null ? C2446c.m12579a(peerCertificates) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new C2572z(enumC2547axM12915a, c2558lM12935a, listM12579a, localCertificates != null ? C2446c.m12579a(localCertificates) : Collections.emptyList());
    }

    /* JADX INFO: renamed from: a */
    public final C2558l m12972a() {
        return this.f15802b;
    }

    /* JADX INFO: renamed from: b */
    public final List<Certificate> m12973b() {
        return this.f15803c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2572z)) {
            return false;
        }
        C2572z c2572z = (C2572z) obj;
        return C2446c.m12587a(this.f15802b, c2572z.f15802b) && this.f15802b.equals(c2572z.f15802b) && this.f15803c.equals(c2572z.f15803c) && this.f15804d.equals(c2572z.f15804d);
    }

    public final int hashCode() {
        EnumC2547ax enumC2547ax = this.f15801a;
        return (((((((enumC2547ax != null ? enumC2547ax.hashCode() : 0) + 527) * 31) + this.f15802b.hashCode()) * 31) + this.f15803c.hashCode()) * 31) + this.f15804d.hashCode();
    }
}
