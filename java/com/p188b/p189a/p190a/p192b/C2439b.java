package com.p188b.p189a.p190a.p192b;

import com.p188b.p189a.C2562p;
import com.p188b.p189a.p190a.AbstractC2427a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.b.a.a.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2439b {

    /* JADX INFO: renamed from: a */
    private final List<C2562p> f15133a;

    /* JADX INFO: renamed from: b */
    private int f15134b = 0;

    /* JADX INFO: renamed from: c */
    private boolean f15135c;

    /* JADX INFO: renamed from: d */
    private boolean f15136d;

    public C2439b(List<C2562p> list) {
        this.f15133a = list;
    }

    /* JADX INFO: renamed from: b */
    private boolean m12529b(SSLSocket sSLSocket) {
        for (int i = this.f15134b; i < this.f15133a.size(); i++) {
            if (this.f15133a.get(i).m12944a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final C2562p m12530a(SSLSocket sSLSocket) throws UnknownServiceException {
        C2562p c2562p;
        int i = this.f15134b;
        int size = this.f15133a.size();
        while (true) {
            if (i >= size) {
                c2562p = null;
                break;
            }
            c2562p = this.f15133a.get(i);
            i++;
            if (c2562p.m12944a(sSLSocket)) {
                this.f15134b = i;
                break;
            }
        }
        if (c2562p != null) {
            this.f15135c = m12529b(sSLSocket);
            AbstractC2427a.f15087a.mo12506a(c2562p, sSLSocket, this.f15136d);
            return c2562p;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f15136d + ", modes=" + this.f15133a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12531a(IOException iOException) {
        this.f15136d = true;
        if (!this.f15135c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException);
    }
}
