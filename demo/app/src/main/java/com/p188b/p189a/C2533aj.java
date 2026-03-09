package com.p188b.p189a;

import com.p188b.p189a.p190a.AbstractC2427a;
import com.p188b.p189a.p190a.C2446c;
import com.p188b.p189a.p190a.p192b.C2440c;
import com.p188b.p189a.p190a.p192b.C2441d;
import com.p188b.p189a.p190a.p192b.C2444g;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.b.a.aj */
/* JADX INFO: loaded from: classes.dex */
public final class C2533aj extends AbstractC2427a {
    @Override // com.p188b.p189a.p190a.AbstractC2427a
    /* JADX INFO: renamed from: a */
    public final int mo12501a(C2543at c2543at) {
        return c2543at.f15584c;
    }

    @Override // com.p188b.p189a.p190a.AbstractC2427a
    /* JADX INFO: renamed from: a */
    public final C2440c mo12502a(C2560n c2560n, C2426a c2426a, C2444g c2444g) {
        return c2560n.m12937a(c2426a, c2444g);
    }

    @Override // com.p188b.p189a.p190a.AbstractC2427a
    /* JADX INFO: renamed from: a */
    public final C2441d mo12503a(C2560n c2560n) {
        return c2560n.f15755a;
    }

    @Override // com.p188b.p189a.p190a.AbstractC2427a
    /* JADX INFO: renamed from: a */
    public final void mo12504a(C2525ab c2525ab, String str) {
        int iIndexOf = str.indexOf(":", 1);
        if (iIndexOf != -1) {
            c2525ab.m12796b(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
        } else if (str.startsWith(":")) {
            c2525ab.m12796b("", str.substring(1));
        } else {
            c2525ab.m12796b("", str);
        }
    }

    @Override // com.p188b.p189a.p190a.AbstractC2427a
    /* JADX INFO: renamed from: a */
    public final void mo12505a(C2525ab c2525ab, String str, String str2) {
        c2525ab.m12796b(str, str2);
    }

    @Override // com.p188b.p189a.p190a.AbstractC2427a
    /* JADX INFO: renamed from: a */
    public final void mo12506a(C2562p c2562p, SSLSocket sSLSocket, boolean z) {
        String[] strArr = c2562p.f15768f;
        String[] enabledCipherSuites = strArr != null ? (String[]) C2446c.m12588a(String.class, strArr, sSLSocket.getEnabledCipherSuites()) : sSLSocket.getEnabledCipherSuites();
        String[] strArr2 = c2562p.f15769g;
        String[] enabledProtocols = strArr2 != null ? (String[]) C2446c.m12588a(String.class, strArr2, sSLSocket.getEnabledProtocols()) : sSLSocket.getEnabledProtocols();
        if (z && C2446c.m12573a(sSLSocket.getSupportedCipherSuites(), "TLS_FALLBACK_SCSV") != -1) {
            enabledCipherSuites = C2446c.m12589a(enabledCipherSuites, "TLS_FALLBACK_SCSV");
        }
        C2562p c2562pM12948b = new C2563q(c2562p).m12947a(enabledCipherSuites).m12949b(enabledProtocols).m12948b();
        String[] strArr3 = c2562pM12948b.f15769g;
        if (strArr3 != null) {
            sSLSocket.setEnabledProtocols(strArr3);
        }
        String[] strArr4 = c2562pM12948b.f15768f;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
    }

    @Override // com.p188b.p189a.p190a.AbstractC2427a
    /* JADX INFO: renamed from: a */
    public final boolean mo12507a(C2560n c2560n, C2440c c2440c) {
        return c2560n.m12940b(c2440c);
    }

    @Override // com.p188b.p189a.p190a.AbstractC2427a
    /* JADX INFO: renamed from: b */
    public final Socket mo12508b(C2560n c2560n, C2426a c2426a, C2444g c2444g) {
        return c2560n.m12939b(c2426a, c2444g);
    }

    @Override // com.p188b.p189a.p190a.AbstractC2427a
    /* JADX INFO: renamed from: b */
    public final void mo12509b(C2560n c2560n, C2440c c2440c) {
        c2560n.m12938a(c2440c);
    }
}
