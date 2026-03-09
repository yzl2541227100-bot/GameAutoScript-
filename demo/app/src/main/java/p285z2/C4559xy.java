package p285z2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import p285z2.C4225ox;
import p285z2.InterfaceC4040jx;

/* JADX INFO: renamed from: z2.xy */
/* JADX INFO: loaded from: classes2.dex */
public final class C4559xy implements InterfaceC4040jx {
    private static final int OooO0o = 20;
    private final C4151mx OooO00o;
    private final boolean OooO0O0;
    private volatile C4189ny OooO0OO;
    private Object OooO0Oo;
    private volatile boolean OooO0o0;

    public C4559xy(C4151mx c4151mx, boolean z) {
        this.OooO00o = c4151mx;
        this.OooO0O0 = z;
    }

    private C4187nw OooO0O0(C4003ix c4003ix) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifierOooOOo0;
        C4409tw c4409twOooO0o;
        if (c4003ix.OooOOo0()) {
            SSLSocketFactory sSLSocketFactoryOooOooo = this.OooO00o.OooOooo();
            hostnameVerifierOooOOo0 = this.OooO00o.OooOOo0();
            sSLSocketFactory = sSLSocketFactoryOooOooo;
            c4409twOooO0o = this.OooO00o.OooO0o();
        } else {
            sSLSocketFactory = null;
            hostnameVerifierOooOOo0 = null;
            c4409twOooO0o = null;
        }
        return new C4187nw(c4003ix.OooOOOo(), c4003ix.OooOooo(), this.OooO00o.OooOOO0(), this.OooO00o.OooOooO(), sSLSocketFactory, hostnameVerifierOooOOo0, c4409twOooO0o, this.OooO00o.OooOoO(), this.OooO00o.OooOoO0(), this.OooO00o.OooOo(), this.OooO00o.OooO(), this.OooO00o.OooOoOO());
    }

    private C4225ox OooO0OO(C4299qx c4299qx, C4373sx c4373sx) throws IOException {
        String strO0OoOo0;
        C4003ix c4003ixOooo0oo;
        if (c4299qx == null) {
            throw new IllegalStateException();
        }
        int iOoooooO = c4299qx.OoooooO();
        String strOooO0oO = c4299qx.o0OOO0o().OooO0oO();
        if (iOoooooO == 307 || iOoooooO == 308) {
            if (!strOooO0oO.equals("GET") && !strOooO0oO.equals("HEAD")) {
                return null;
            }
        } else {
            if (iOoooooO == 401) {
                return this.OooO00o.OooO0OO().OooO00o(c4373sx, c4299qx);
            }
            if (iOoooooO == 503) {
                if ((c4299qx.o0ooOO0() == null || c4299qx.o0ooOO0().OoooooO() != 503) && OooO0oO(c4299qx, Integer.MAX_VALUE) == 0) {
                    return c4299qx.o0OOO0o();
                }
                return null;
            }
            if (iOoooooO == 407) {
                if ((c4373sx != null ? c4373sx.OooO0O0() : this.OooO00o.OooOoO0()).type() == Proxy.Type.HTTP) {
                    return this.OooO00o.OooOoO().OooO00o(c4373sx, c4299qx);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iOoooooO == 408) {
                if (!this.OooO00o.OooOoo() || (c4299qx.o0OOO0o().OooO00o() instanceof InterfaceC4633zy)) {
                    return null;
                }
                if ((c4299qx.o0ooOO0() == null || c4299qx.o0ooOO0().OoooooO() != 408) && OooO0oO(c4299qx, 0) <= 0) {
                    return c4299qx.o0OOO0o();
                }
                return null;
            }
            switch (iOoooooO) {
                case 300:
                case SET_ENABLED_VALUE:
                case 302:
                case SET_TITLE_TEXT_VALUE:
                    break;
                default:
                    return null;
            }
        }
        if (!this.OooO00o.OooOOOO() || (strO0OoOo0 = c4299qx.o0OoOo0("Location")) == null || (c4003ixOooo0oo = c4299qx.o0OOO0o().OooOO0O().Oooo0oo(strO0OoOo0)) == null) {
            return null;
        }
        if (!c4003ixOooo0oo.Oooo().equals(c4299qx.o0OOO0o().OooOO0O().Oooo()) && !this.OooO00o.OooOOOo()) {
            return null;
        }
        C4225ox.OooO00o oooO00oOooO0oo = c4299qx.o0OOO0o().OooO0oo();
        if (C4411ty.OooO0O0(strOooO0oO)) {
            boolean zOooO0Oo = C4411ty.OooO0Oo(strOooO0oO);
            if (C4411ty.OooO0OO(strOooO0oO)) {
                oooO00oOooO0oo.OooOO0("GET", null);
            } else {
                oooO00oOooO0oo.OooOO0(strOooO0oO, zOooO0Oo ? c4299qx.o0OOO0o().OooO00o() : null);
            }
            if (!zOooO0Oo) {
                oooO00oOooO0oo.OooOOO("Transfer-Encoding");
                oooO00oOooO0oo.OooOOO("Content-Length");
                oooO00oOooO0oo.OooOOO("Content-Type");
            }
        }
        if (!OooO0oo(c4299qx, c4003ixOooo0oo)) {
            oooO00oOooO0oo.OooOOO("Authorization");
        }
        return oooO00oOooO0oo.OooOOoo(c4003ixOooo0oo).OooO0O0();
    }

    private boolean OooO0o(IOException iOException, C4189ny c4189ny, boolean z, C4225ox c4225ox) {
        c4189ny.OooOOo0(iOException);
        if (this.OooO00o.OooOoo()) {
            return !(z && (c4225ox.OooO00o() instanceof InterfaceC4633zy)) && OooO0o0(iOException, z) && c4189ny.OooO0oo();
        }
        return false;
    }

    private boolean OooO0o0(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private int OooO0oO(C4299qx c4299qx, int i) {
        String strO0OoOo0 = c4299qx.o0OoOo0("Retry-After");
        if (strO0OoOo0 == null) {
            return i;
        }
        if (strO0OoOo0.matches("\\d+")) {
            return Integer.valueOf(strO0OoOo0).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean OooO0oo(C4299qx c4299qx, C4003ix c4003ix) {
        C4003ix c4003ixOooOO0O = c4299qx.o0OOO0o().OooOO0O();
        return c4003ixOooOO0O.OooOOOo().equals(c4003ix.OooOOOo()) && c4003ixOooOO0O.OooOooo() == c4003ix.OooOooo() && c4003ixOooOO0O.Oooo().equals(c4003ix.Oooo());
    }

    public void OooO(Object obj) {
        this.OooO0Oo = obj;
    }

    public void OooO00o() {
        this.OooO0o0 = true;
        C4189ny c4189ny = this.OooO0OO;
        if (c4189ny != null) {
            c4189ny.OooO0O0();
        }
    }

    public boolean OooO0Oo() {
        return this.OooO0o0;
    }

    public C4189ny OooOO0() {
        return this.OooO0OO;
    }

    @Override // p285z2.InterfaceC4040jx
    public C4299qx intercept(InterfaceC4040jx.OooO00o oooO00o) throws IOException {
        C4299qx c4299qxOooOO0O;
        C4225ox c4225oxRequest = oooO00o.request();
        C4448uy c4448uy = (C4448uy) oooO00o;
        InterfaceC4335rw interfaceC4335rwCall = c4448uy.call();
        AbstractC3855ex abstractC3855exOooO = c4448uy.OooO();
        C4189ny c4189ny = new C4189ny(this.OooO00o.OooO0oo(), OooO0O0(c4225oxRequest.OooOO0O()), interfaceC4335rwCall, abstractC3855exOooO, this.OooO0Oo);
        this.OooO0OO = c4189ny;
        C4299qx c4299qx = null;
        int i = 0;
        while (!this.OooO0o0) {
            try {
                try {
                    c4299qxOooOO0O = c4448uy.OooOO0O(c4225oxRequest, c4189ny, null, null);
                    if (c4299qx != null) {
                        c4299qxOooOO0O = c4299qxOooOO0O.o00oO0o().OooOOO0(c4299qx.o00oO0o().OooO0O0(null).OooO0OO()).OooO0OO();
                    }
                } catch (IOException e) {
                    if (!OooO0o(e, c4189ny, !(e instanceof ConnectionShutdownException), c4225oxRequest)) {
                        throw e;
                    }
                } catch (RouteException e2) {
                    if (!OooO0o(e2.getLastConnectException(), c4189ny, false, c4225oxRequest)) {
                        throw e2.getFirstConnectException();
                    }
                }
                try {
                    C4225ox c4225oxOooO0OO = OooO0OO(c4299qxOooOO0O, c4189ny.OooOOOO());
                    if (c4225oxOooO0OO == null) {
                        c4189ny.OooOO0O();
                        return c4299qxOooOO0O;
                    }
                    C4558xx.OooO0oO(c4299qxOooOO0O.OooOO0());
                    int i2 = i + 1;
                    if (i2 > 20) {
                        c4189ny.OooOO0O();
                        throw new ProtocolException("Too many follow-up requests: " + i2);
                    }
                    if (c4225oxOooO0OO.OooO00o() instanceof InterfaceC4633zy) {
                        c4189ny.OooOO0O();
                        throw new HttpRetryException("Cannot retry streamed HTTP body", c4299qxOooOO0O.OoooooO());
                    }
                    if (!OooO0oo(c4299qxOooOO0O, c4225oxOooO0OO.OooOO0O())) {
                        c4189ny.OooOO0O();
                        c4189ny = new C4189ny(this.OooO00o.OooO0oo(), OooO0O0(c4225oxOooO0OO.OooOO0O()), interfaceC4335rwCall, abstractC3855exOooO, this.OooO0Oo);
                        this.OooO0OO = c4189ny;
                    } else if (c4189ny.OooO0OO() != null) {
                        throw new IllegalStateException("Closing the body of " + c4299qxOooOO0O + " didn't close its backing stream. Bad interceptor?");
                    }
                    c4299qx = c4299qxOooOO0O;
                    c4225oxRequest = c4225oxOooO0OO;
                    i = i2;
                } catch (IOException e3) {
                    c4189ny.OooOO0O();
                    throw e3;
                }
            } catch (Throwable th) {
                c4189ny.OooOOo0(null);
                c4189ny.OooOO0O();
                throw th;
            }
        }
        c4189ny.OooOO0O();
        throw new IOException("Canceled");
    }
}
