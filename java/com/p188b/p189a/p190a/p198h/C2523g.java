package com.p188b.p189a.p190a.p198h;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: com.b.a.a.h.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2523g extends AbstractC2521e {

    /* JADX INFO: renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f15454a = new LinkedHashMap();

    public C2523g(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> linkedHashSet = this.f15454a.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>(1);
                this.f15454a.put(subjectX500Principal, linkedHashSet);
            }
            linkedHashSet.add(x509Certificate);
        }
    }

    @Override // com.p188b.p189a.p190a.p198h.AbstractC2521e
    /* JADX INFO: renamed from: a */
    public final X509Certificate mo12786a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f15454a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C2523g) && ((C2523g) obj).f15454a.equals(this.f15454a);
    }

    public final int hashCode() {
        return this.f15454a.hashCode();
    }
}
