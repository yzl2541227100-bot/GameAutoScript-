package p285z2;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: z2.vz */
/* JADX INFO: loaded from: classes2.dex */
public final class C4486vz implements InterfaceC4634zz {
    private final Map<X500Principal, Set<X509Certificate>> OooO00o = new LinkedHashMap();

    public C4486vz(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> linkedHashSet = this.OooO00o.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>(1);
                this.OooO00o.put(subjectX500Principal, linkedHashSet);
            }
            linkedHashSet.add(x509Certificate);
        }
    }

    @Override // p285z2.InterfaceC4634zz
    public X509Certificate OooO00o(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.OooO00o.get(x509Certificate.getIssuerX500Principal());
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C4486vz) && ((C4486vz) obj).OooO00o.equals(this.OooO00o);
    }

    public int hashCode() {
        return this.OooO00o.hashCode();
    }
}
