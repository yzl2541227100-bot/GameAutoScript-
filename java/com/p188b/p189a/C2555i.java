package com.p188b.p189a;

import com.p188b.p189a.p190a.C2446c;
import com.p188b.p189a.p190a.p198h.AbstractC2518b;
import com.p188b.p199b.C2582i;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: com.b.a.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2555i {

    /* JADX INFO: renamed from: a */
    public static final C2555i f15631a = new C2556j().m12934a();

    /* JADX INFO: renamed from: b */
    private final Set<C2557k> f15632b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2518b f15633c;

    public C2555i(Set<C2557k> set, AbstractC2518b abstractC2518b) {
        this.f15632b = set;
        this.f15633c = abstractC2518b;
    }

    /* JADX INFO: renamed from: a */
    private static C2582i m12930a(X509Certificate x509Certificate) {
        return C2582i.m13042a(x509Certificate.getPublicKey().getEncoded()).mo13053d();
    }

    /* JADX INFO: renamed from: a */
    public static String m12931a(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + m12930a((X509Certificate) certificate).mo13051b();
    }

    /* JADX INFO: renamed from: a */
    public final C2555i m12932a(AbstractC2518b abstractC2518b) {
        return C2446c.m12587a(this.f15633c, abstractC2518b) ? this : new C2555i(this.f15632b, abstractC2518b);
    }

    /* JADX INFO: renamed from: a */
    public final void m12933a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        boolean zEquals;
        List listEmptyList = Collections.emptyList();
        for (C2557k c2557k : this.f15632b) {
            if (c2557k.f15635a.startsWith("*.")) {
                int iIndexOf = str.indexOf(46) + 1;
                String str2 = c2557k.f15636b;
                zEquals = str.regionMatches(false, iIndexOf, str2, 0, str2.length());
            } else {
                zEquals = str.equals(c2557k.f15636b);
            }
            if (zEquals) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList();
                }
                listEmptyList.add(c2557k);
            }
        }
        if (listEmptyList.isEmpty()) {
            return;
        }
        AbstractC2518b abstractC2518b = this.f15633c;
        if (abstractC2518b != null) {
            list = abstractC2518b.mo12758a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = listEmptyList.size();
            C2582i c2582iM12930a = null;
            C2582i c2582iMo13052c = null;
            for (int i2 = 0; i2 < size2; i2++) {
                C2557k c2557k2 = (C2557k) listEmptyList.get(i2);
                if (c2557k2.f15637c.equals("sha256/")) {
                    if (c2582iM12930a == null) {
                        c2582iM12930a = m12930a(x509Certificate);
                    }
                    if (c2557k2.f15638d.equals(c2582iM12930a)) {
                        return;
                    }
                } else {
                    if (!c2557k2.f15637c.equals("sha1/")) {
                        throw new AssertionError();
                    }
                    if (c2582iMo13052c == null) {
                        c2582iMo13052c = C2582i.m13042a(x509Certificate.getPublicKey().getEncoded()).mo13052c();
                    }
                    if (c2557k2.f15638d.equals(c2582iMo13052c)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(m12931a((Certificate) x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = listEmptyList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            C2557k c2557k3 = (C2557k) listEmptyList.get(i4);
            sb.append("\n    ");
            sb.append(c2557k3);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2555i)) {
            return false;
        }
        C2555i c2555i = (C2555i) obj;
        return C2446c.m12587a(this.f15633c, c2555i.f15633c) && this.f15632b.equals(c2555i.f15632b);
    }

    public final int hashCode() {
        AbstractC2518b abstractC2518b = this.f15633c;
        return ((abstractC2518b != null ? abstractC2518b.hashCode() : 0) * 31) + this.f15632b.hashCode();
    }
}
