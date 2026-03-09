package p285z2;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: z2.wz */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4523wz {
    public static AbstractC4523wz OooO0O0(X509TrustManager x509TrustManager) {
        return C4375sz.OooOO0O().OooO0Oo(x509TrustManager);
    }

    public static AbstractC4523wz OooO0OO(X509Certificate... x509CertificateArr) {
        return new C4449uz(new C4486vz(x509CertificateArr));
    }

    public abstract List<Certificate> OooO00o(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
