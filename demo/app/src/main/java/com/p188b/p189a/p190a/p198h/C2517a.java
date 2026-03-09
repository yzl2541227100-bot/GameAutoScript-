package com.p188b.p189a.p190a.p198h;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: com.b.a.a.h.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2517a extends AbstractC2518b {

    /* JADX INFO: renamed from: a */
    private final AbstractC2521e f15443a;

    public C2517a(AbstractC2521e abstractC2521e) {
        this.f15443a = abstractC2521e;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m12774a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.p188b.p189a.p190a.p198h.AbstractC2518b
    /* JADX INFO: renamed from: a */
    public final List<Certificate> mo12758a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate x509CertificateMo12786a = this.f15443a.mo12786a(x509Certificate);
            if (x509CertificateMo12786a == null) {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (m12774a(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed ".concat(String.valueOf(x509Certificate)));
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo12786a)) {
                arrayList.add(x509CertificateMo12786a);
            }
            if (m12774a(x509CertificateMo12786a, x509CertificateMo12786a)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: ".concat(String.valueOf(arrayList)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C2517a) && ((C2517a) obj).f15443a.equals(this.f15443a);
    }

    public final int hashCode() {
        return this.f15443a.hashCode();
    }
}
