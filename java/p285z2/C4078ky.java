package p285z2;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p126f.p133g.C1849b;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import io.reactivex.annotations.SchedulerSupport;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;
import org.slf4j.helpers.MessageFormatter;
import p285z2.C3894fz;
import p285z2.C4225ox;
import p285z2.C4299qx;
import p285z2.InterfaceC4040jx;
import p285z2.a00;

/* JADX INFO: renamed from: z2.ky */
/* JADX INFO: loaded from: classes2.dex */
public final class C4078ky extends C3894fz.OooOOO0 implements InterfaceC4520ww {
    private static final String OooOOOo = "throw with null exception";
    private static final int OooOOo0 = 21;
    private j00 OooO;
    private final C4557xw OooO0O0;
    private final C4373sx OooO0OO;
    private Socket OooO0Oo;
    private C3929gx OooO0o;
    private Socket OooO0o0;
    private Protocol OooO0oO;
    private C3894fz OooO0oo;
    private i00 OooOO0;
    public boolean OooOO0O;
    public int OooOO0o;
    public int OooOOO0 = 1;
    public final List<Reference<C4189ny>> OooOOO = new ArrayList();
    public long OooOOOO = Long.MAX_VALUE;

    /* JADX INFO: renamed from: z2.ky$OooO00o */
    public class OooO00o extends a00.OooOO0O {
        public final /* synthetic */ C4189ny Ooooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, j00 j00Var, i00 i00Var, C4189ny c4189ny) {
            super(z, j00Var, i00Var);
            this.Ooooo0o = c4189ny;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C4189ny c4189ny = this.Ooooo0o;
            c4189ny.OooOOo(true, c4189ny.OooO0OO(), -1L, null);
        }
    }

    public C4078ky(C4557xw c4557xw, C4373sx c4373sx) {
        this.OooO0O0 = c4557xw;
        this.OooO0OO = c4373sx;
    }

    private void OooO(int i, int i2, InterfaceC4335rw interfaceC4335rw, AbstractC3855ex abstractC3855ex) throws IOException {
        Proxy proxyOooO0O0 = this.OooO0OO.OooO0O0();
        this.OooO0Oo = (proxyOooO0O0.type() == Proxy.Type.DIRECT || proxyOooO0O0.type() == Proxy.Type.HTTP) ? this.OooO0OO.OooO00o().OooOO0().createSocket() : new Socket(proxyOooO0O0);
        abstractC3855ex.OooO0o(interfaceC4335rw, this.OooO0OO.OooO0Oo(), proxyOooO0O0);
        this.OooO0Oo.setSoTimeout(i2);
        try {
            C4375sz.OooOO0O().OooO(this.OooO0Oo, this.OooO0OO.OooO0Oo(), i);
            try {
                this.OooO = u00.OooO0Oo(u00.OooOOO(this.OooO0Oo));
                this.OooOO0 = u00.OooO0OO(u00.OooO(this.OooO0Oo));
            } catch (NullPointerException e) {
                if (OooOOOo.equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.OooO0OO.OooO0Oo());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private void OooOO0(C4041jy c4041jy) throws Throwable {
        C4187nw c4187nwOooO00o = this.OooO0OO.OooO00o();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) c4187nwOooO00o.OooOO0O().createSocket(this.OooO0Oo, c4187nwOooO00o.OooOO0o().OooOOOo(), c4187nwOooO00o.OooOO0o().OooOooo(), true);
                try {
                    C4594yw c4594ywOooO00o = c4041jy.OooO00o(sSLSocket2);
                    if (c4594ywOooO00o.OooO0o()) {
                        C4375sz.OooOO0O().OooO0oo(sSLSocket2, c4187nwOooO00o.OooOO0o().OooOOOo(), c4187nwOooO00o.OooO0o());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    C3929gx c3929gxOooO0O0 = C3929gx.OooO0O0(session);
                    if (c4187nwOooO00o.OooO0o0().verify(c4187nwOooO00o.OooOO0o().OooOOOo(), session)) {
                        c4187nwOooO00o.OooO00o().OooO00o(c4187nwOooO00o.OooOO0o().OooOOOo(), c3929gxOooO0O0.OooO0o());
                        String strOooOOO = c4594ywOooO00o.OooO0o() ? C4375sz.OooOO0O().OooOOO(sSLSocket2) : null;
                        this.OooO0o0 = sSLSocket2;
                        this.OooO = u00.OooO0Oo(u00.OooOOO(sSLSocket2));
                        this.OooOO0 = u00.OooO0OO(u00.OooO(this.OooO0o0));
                        this.OooO0o = c3929gxOooO0O0;
                        this.OooO0oO = strOooOOO != null ? Protocol.get(strOooOOO) : Protocol.HTTP_1_1;
                        if (sSLSocket2 != null) {
                            C4375sz.OooOO0O().OooO00o(sSLSocket2);
                            return;
                        }
                        return;
                    }
                    X509Certificate x509Certificate = (X509Certificate) c3929gxOooO0O0.OooO0o().get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + c4187nwOooO00o.OooOO0o().OooOOOo() + " not verified:\n    certificate: " + C4409tw.OooO0Oo(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C4597yz.OooO00o(x509Certificate));
                } catch (AssertionError e) {
                    e = e;
                    if (!C4558xx.OooOoo0(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        C4375sz.OooOO0O().OooO00o(sSLSocket);
                    }
                    C4558xx.OooO(sSLSocket);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (AssertionError e2) {
            e = e2;
        }
    }

    private void OooOO0O(int i, int i2, int i3, InterfaceC4335rw interfaceC4335rw, AbstractC3855ex abstractC3855ex) throws IOException {
        C4225ox c4225oxOooOOO0 = OooOOO0();
        C4003ix c4003ixOooOO0O = c4225oxOooOOO0.OooOO0O();
        for (int i4 = 0; i4 < 21; i4++) {
            OooO(i, i2, interfaceC4335rw, abstractC3855ex);
            c4225oxOooOOO0 = OooOO0o(i2, i3, c4225oxOooOOO0, c4003ixOooOO0O);
            if (c4225oxOooOOO0 == null) {
                return;
            }
            C4558xx.OooO(this.OooO0Oo);
            this.OooO0Oo = null;
            this.OooOO0 = null;
            this.OooO = null;
            abstractC3855ex.OooO0Oo(interfaceC4335rw, this.OooO0OO.OooO0Oo(), this.OooO0OO.OooO0O0(), null);
        }
    }

    private C4225ox OooOO0o(int i, int i2, C4225ox c4225ox, C4003ix c4003ix) throws IOException {
        String str = "CONNECT " + C4558xx.OooOo00(c4003ix, true) + " HTTP/1.1";
        while (true) {
            C3709az c3709az = new C3709az(null, null, this.OooO, this.OooOO0);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.OooO.timeout().OooO0oo(i, timeUnit);
            this.OooOO0.timeout().OooO0oo(i2, timeUnit);
            c3709az.OooOOOo(c4225ox.OooO0o0(), str);
            c3709az.OooO00o();
            C4299qx c4299qxOooO0OO = c3709az.OooO0Oo(false).OooOOo0(c4225ox).OooO0OO();
            long jOooO0O0 = C4374sy.OooO0O0(c4299qxOooO0OO);
            if (jOooO0O0 == -1) {
                jOooO0O0 = 0;
            }
            c10 c10VarOooOO0o = c3709az.OooOO0o(jOooO0O0);
            C4558xx.OooOooo(c10VarOooOO0o, Integer.MAX_VALUE, timeUnit);
            c10VarOooOO0o.close();
            int iOoooooO = c4299qxOooO0OO.OoooooO();
            if (iOoooooO == 200) {
                if (this.OooO.OooO00o().OooOOO() && this.OooOO0.OooO00o().OooOOO()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iOoooooO != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c4299qxOooO0OO.OoooooO());
            }
            C4225ox c4225oxOooO00o = this.OooO0OO.OooO00o().OooO0oo().OooO00o(this.OooO0OO, c4299qxOooO0OO);
            if (c4225oxOooO00o == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (C1781c.f10318cf.equalsIgnoreCase(c4299qxOooO0OO.o0OoOo0("Connection"))) {
                return c4225oxOooO00o;
            }
            c4225ox = c4225oxOooO00o;
        }
    }

    private void OooOOO(C4041jy c4041jy, int i, InterfaceC4335rw interfaceC4335rw, AbstractC3855ex abstractC3855ex) throws Throwable {
        if (this.OooO0OO.OooO00o().OooOO0O() != null) {
            abstractC3855ex.OooOo0(interfaceC4335rw);
            OooOO0(c4041jy);
            abstractC3855ex.OooOo00(interfaceC4335rw, this.OooO0o);
            if (this.OooO0oO == Protocol.HTTP_2) {
                OooOo00(i);
                return;
            }
            return;
        }
        List<Protocol> listOooO0o = this.OooO0OO.OooO00o().OooO0o();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!listOooO0o.contains(protocol)) {
            this.OooO0o0 = this.OooO0Oo;
            this.OooO0oO = Protocol.HTTP_1_1;
        } else {
            this.OooO0o0 = this.OooO0Oo;
            this.OooO0oO = protocol;
            OooOo00(i);
        }
    }

    private C4225ox OooOOO0() throws IOException {
        C4225ox c4225oxOooO0O0 = new C4225ox.OooO00o().OooOOoo(this.OooO0OO.OooO00o().OooOO0o()).OooOO0("CONNECT", null).OooO0oo(HttpHeaders.HOST, C4558xx.OooOo00(this.OooO0OO.OooO00o().OooOO0o(), true)).OooO0oo("Proxy-Connection", C1849b.f11404c).OooO0oo("User-Agent", C4595yx.OooO00o()).OooO0O0();
        C4225ox c4225oxOooO00o = this.OooO0OO.OooO00o().OooO0oo().OooO00o(this.OooO0OO, new C4299qx.OooO00o().OooOOo0(c4225oxOooO0O0).OooOOO(Protocol.HTTP_1_1).OooO0oO(UiMessage.CommandToUi.Command_Type.GET_TEXTCOLOR_VALUE).OooOO0O("Preemptive Authenticate").OooO0O0(C4558xx.OooO0OO).OooOOo(-1L).OooOOOO(-1L).OooO("Proxy-Authenticate", "OkHttp-Preemptive").OooO0OO());
        return c4225oxOooO00o != null ? c4225oxOooO00o : c4225oxOooO0O0;
    }

    private void OooOo00(int i) throws IOException {
        this.OooO0o0.setSoTimeout(0);
        C3894fz c3894fzOooO00o = new C3894fz.OooOO0O(true).OooO0o(this.OooO0o0, this.OooO0OO.OooO00o().OooOO0o().OooOOOo(), this.OooO, this.OooOO0).OooO0O0(this).OooO0OO(i).OooO00o();
        this.OooO0oo = c3894fzOooO00o;
        c3894fzOooO00o.o000OOo();
    }

    public static C4078ky OooOo0O(C4557xw c4557xw, C4373sx c4373sx, Socket socket, long j) {
        C4078ky c4078ky = new C4078ky(c4557xw, c4373sx);
        c4078ky.OooO0o0 = socket;
        c4078ky.OooOOOO = j;
        return c4078ky;
    }

    @Override // p285z2.InterfaceC4520ww
    public Protocol OooO00o() {
        return this.OooO0oO;
    }

    @Override // p285z2.InterfaceC4520ww
    public C4373sx OooO0O0() {
        return this.OooO0OO;
    }

    @Override // p285z2.InterfaceC4520ww
    public C3929gx OooO0OO() {
        return this.OooO0o;
    }

    @Override // p285z2.InterfaceC4520ww
    public Socket OooO0Oo() {
        return this.OooO0o0;
    }

    @Override // p285z2.C3894fz.OooOOO0
    public void OooO0o(C3968hz c3968hz) throws IOException {
        c3968hz.OooO0o(ErrorCode.REFUSED_STREAM);
    }

    @Override // p285z2.C3894fz.OooOOO0
    public void OooO0o0(C3894fz c3894fz) {
        synchronized (this.OooO0O0) {
            this.OooOOO0 = c3894fz.o00Ooo();
        }
    }

    public void OooO0oO() {
        C4558xx.OooO(this.OooO0Oo);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0142 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooO0oo(int r17, int r18, int r19, int r20, boolean r21, p285z2.InterfaceC4335rw r22, p285z2.AbstractC3855ex r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4078ky.OooO0oo(int, int, int, int, boolean, z2.rw, z2.ex):void");
    }

    public boolean OooOOOO(C4187nw c4187nw, @Nullable C4373sx c4373sx) {
        if (this.OooOOO.size() >= this.OooOOO0 || this.OooOO0O || !AbstractC4484vx.OooO00o.OooO0oO(this.OooO0OO.OooO00o(), c4187nw)) {
            return false;
        }
        if (c4187nw.OooOO0o().OooOOOo().equals(OooO0O0().OooO00o().OooOO0o().OooOOOo())) {
            return true;
        }
        if (this.OooO0oo == null || c4373sx == null || c4373sx.OooO0O0().type() != Proxy.Type.DIRECT || this.OooO0OO.OooO0O0().type() != Proxy.Type.DIRECT || !this.OooO0OO.OooO0Oo().equals(c4373sx.OooO0Oo()) || c4373sx.OooO00o().OooO0o0() != C4597yz.OooO00o || !OooOo0(c4187nw.OooOO0o())) {
            return false;
        }
        try {
            c4187nw.OooO00o().OooO00o(c4187nw.OooOO0o().OooOOOo(), OooO0OO().OooO0o());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean OooOOOo(boolean z) {
        if (this.OooO0o0.isClosed() || this.OooO0o0.isInputShutdown() || this.OooO0o0.isOutputShutdown()) {
            return false;
        }
        if (this.OooO0oo != null) {
            return !r0.o00Oo0();
        }
        if (z) {
            try {
                int soTimeout = this.OooO0o0.getSoTimeout();
                try {
                    this.OooO0o0.setSoTimeout(1);
                    return !this.OooO.OooOOO();
                } finally {
                    this.OooO0o0.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public InterfaceC4300qy OooOOo(C4151mx c4151mx, InterfaceC4040jx.OooO00o oooO00o, C4189ny c4189ny) throws SocketException {
        if (this.OooO0oo != null) {
            return new C3857ez(c4151mx, oooO00o, c4189ny, this.OooO0oo);
        }
        this.OooO0o0.setSoTimeout(oooO00o.OooO0O0());
        d10 d10VarTimeout = this.OooO.timeout();
        long jOooO0O0 = oooO00o.OooO0O0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d10VarTimeout.OooO0oo(jOooO0O0, timeUnit);
        this.OooOO0.timeout().OooO0oo(oooO00o.OooO0OO(), timeUnit);
        return new C3709az(c4151mx, c4189ny, this.OooO, this.OooOO0);
    }

    public boolean OooOOo0() {
        return this.OooO0oo != null;
    }

    public a00.OooOO0O OooOOoo(C4189ny c4189ny) {
        return new OooO00o(true, this.OooO, this.OooOO0, c4189ny);
    }

    public boolean OooOo0(C4003ix c4003ix) {
        if (c4003ix.OooOooo() != this.OooO0OO.OooO00o().OooOO0o().OooOooo()) {
            return false;
        }
        if (c4003ix.OooOOOo().equals(this.OooO0OO.OooO00o().OooOO0o().OooOOOo())) {
            return true;
        }
        return this.OooO0o != null && C4597yz.OooO00o.OooO0OO(c4003ix.OooOOOo(), (X509Certificate) this.OooO0o.OooO0o().get(0));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.OooO0OO.OooO00o().OooOO0o().OooOOOo());
        sb.append(":");
        sb.append(this.OooO0OO.OooO00o().OooOO0o().OooOooo());
        sb.append(", proxy=");
        sb.append(this.OooO0OO.OooO0O0());
        sb.append(" hostAddress=");
        sb.append(this.OooO0OO.OooO0Oo());
        sb.append(" cipherSuite=");
        C3929gx c3929gx = this.OooO0o;
        sb.append(c3929gx != null ? c3929gx.OooO00o() : SchedulerSupport.NONE);
        sb.append(" protocol=");
        sb.append(this.OooO0oO);
        sb.append(MessageFormatter.DELIM_STOP);
        return sb.toString();
    }
}
