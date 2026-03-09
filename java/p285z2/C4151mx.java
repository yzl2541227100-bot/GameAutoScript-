package p285z2;

import com.umeng.commonsdk.proguard.C3471v;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p285z2.AbstractC3855ex;
import p285z2.C3966hx;
import p285z2.C4003ix;
import p285z2.C4299qx;
import p285z2.InterfaceC4335rw;
import p285z2.InterfaceC4410tx;

/* JADX INFO: renamed from: z2.mx */
/* JADX INFO: loaded from: classes2.dex */
public class C4151mx implements Cloneable, InterfaceC4335rw.OooO00o, InterfaceC4410tx.OooO00o {
    public final C3781cx OoooOoO;

    @Nullable
    public final Proxy OoooOoo;
    public final List<Protocol> Ooooo00;
    public final List<C4594yw> Ooooo0o;
    public final List<InterfaceC4040jx> OooooO0;
    public final List<InterfaceC4040jx> OooooOO;
    public final AbstractC3855ex.OooO0OO OooooOo;
    public final InterfaceC3707ax Oooooo;
    public final ProxySelector Oooooo0;

    @Nullable
    public final C4261pw OoooooO;

    @Nullable
    public final InterfaceC3893fy Ooooooo;
    public final AbstractC4523wz o00O0O;
    public final HostnameVerifier o00Oo0;
    public final C4409tw o00Ooo;
    public final InterfaceC4224ow o00o0O;
    public final boolean o00oO0O;
    public final InterfaceC3818dx o00oO0o;
    public final InterfaceC4224ow o00ooo;
    public final int o0OO00O;
    public final int o0OOO0o;
    public final int o0Oo0oo;
    public final SocketFactory o0OoOo0;
    public final boolean o0ooOO0;
    public final boolean o0ooOOo;
    public final int o0ooOoO;
    public final C4557xw oo000o;
    public final int oo0o0Oo;
    public final SSLSocketFactory ooOO;
    public static final List<Protocol> o0O0O00 = C4558xx.OooOo0O(Protocol.HTTP_2, Protocol.HTTP_1_1);
    public static final List<C4594yw> o000OOo = C4558xx.OooOo0O(C4594yw.OooO0oo, C4594yw.OooOO0);

    /* JADX INFO: renamed from: z2.mx$OooO00o */
    public class OooO00o extends AbstractC4484vx {
        @Override // p285z2.AbstractC4484vx
        public void OooO00o(C3966hx.OooO00o oooO00o, String str) {
            oooO00o.OooO0o0(str);
        }

        @Override // p285z2.AbstractC4484vx
        public void OooO0O0(C3966hx.OooO00o oooO00o, String str, String str2) {
            oooO00o.OooO0o(str, str2);
        }

        @Override // p285z2.AbstractC4484vx
        public void OooO0OO(C4594yw c4594yw, SSLSocket sSLSocket, boolean z) {
            c4594yw.OooO00o(sSLSocket, z);
        }

        @Override // p285z2.AbstractC4484vx
        public int OooO0Oo(C4299qx.OooO00o oooO00o) {
            return oooO00o.OooO0OO;
        }

        @Override // p285z2.AbstractC4484vx
        public Socket OooO0o(C4557xw c4557xw, C4187nw c4187nw, C4189ny c4189ny) {
            return c4557xw.OooO0Oo(c4187nw, c4189ny);
        }

        @Override // p285z2.AbstractC4484vx
        public boolean OooO0o0(C4557xw c4557xw, C4078ky c4078ky) {
            return c4557xw.OooO0O0(c4078ky);
        }

        @Override // p285z2.AbstractC4484vx
        public boolean OooO0oO(C4187nw c4187nw, C4187nw c4187nw2) {
            return c4187nw.OooO0Oo(c4187nw2);
        }

        @Override // p285z2.AbstractC4484vx
        public C4078ky OooO0oo(C4557xw c4557xw, C4187nw c4187nw, C4189ny c4189ny, C4373sx c4373sx) {
            return c4557xw.OooO0o(c4187nw, c4189ny, c4373sx);
        }

        @Override // p285z2.AbstractC4484vx
        public boolean OooOO0(IllegalArgumentException illegalArgumentException) {
            return illegalArgumentException.getMessage().startsWith(C4003ix.OooO00o.OooO);
        }

        @Override // p285z2.AbstractC4484vx
        public InterfaceC4335rw OooOO0O(C4151mx c4151mx, C4225ox c4225ox) {
            return C4188nx.OooO0o0(c4151mx, c4225ox, true);
        }

        @Override // p285z2.AbstractC4484vx
        public void OooOO0o(C4557xw c4557xw, C4078ky c4078ky) {
            c4557xw.OooO(c4078ky);
        }

        @Override // p285z2.AbstractC4484vx
        public void OooOOO(OooO0O0 oooO0O0, InterfaceC3893fy interfaceC3893fy) {
            oooO0O0.Oooo000(interfaceC3893fy);
        }

        @Override // p285z2.AbstractC4484vx
        public C4115ly OooOOO0(C4557xw c4557xw) {
            return c4557xw.OooO0o0;
        }

        @Override // p285z2.AbstractC4484vx
        public C4189ny OooOOOO(InterfaceC4335rw interfaceC4335rw) {
            return ((C4188nx) interfaceC4335rw).OooO0oO();
        }

        @Override // p285z2.AbstractC4484vx
        @Nullable
        public IOException OooOOOo(InterfaceC4335rw interfaceC4335rw, @Nullable IOException iOException) {
            return ((C4188nx) interfaceC4335rw).OooO0oo(iOException);
        }
    }

    /* JADX INFO: renamed from: z2.mx$OooO0O0 */
    public static final class OooO0O0 {
        public InterfaceC3707ax OooO;
        public C3781cx OooO00o;

        @Nullable
        public Proxy OooO0O0;
        public List<Protocol> OooO0OO;
        public List<C4594yw> OooO0Oo;
        public final List<InterfaceC4040jx> OooO0o;
        public final List<InterfaceC4040jx> OooO0o0;
        public AbstractC3855ex.OooO0OO OooO0oO;
        public ProxySelector OooO0oo;

        @Nullable
        public C4261pw OooOO0;

        @Nullable
        public InterfaceC3893fy OooOO0O;
        public SocketFactory OooOO0o;

        @Nullable
        public AbstractC4523wz OooOOO;

        @Nullable
        public SSLSocketFactory OooOOO0;
        public HostnameVerifier OooOOOO;
        public C4409tw OooOOOo;
        public InterfaceC4224ow OooOOo;
        public InterfaceC4224ow OooOOo0;
        public C4557xw OooOOoo;
        public int OooOo;
        public boolean OooOo0;
        public InterfaceC3818dx OooOo00;
        public boolean OooOo0O;
        public boolean OooOo0o;
        public int OooOoO;
        public int OooOoO0;
        public int OooOoOO;
        public int OooOoo0;

        public OooO0O0() {
            this.OooO0o0 = new ArrayList();
            this.OooO0o = new ArrayList();
            this.OooO00o = new C3781cx();
            this.OooO0OO = C4151mx.o0O0O00;
            this.OooO0Oo = C4151mx.o000OOo;
            this.OooO0oO = AbstractC3855ex.OooOO0O(AbstractC3855ex.OooO00o);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.OooO0oo = proxySelector;
            if (proxySelector == null) {
                this.OooO0oo = new C4412tz();
            }
            this.OooO = InterfaceC3707ax.OooO00o;
            this.OooOO0o = SocketFactory.getDefault();
            this.OooOOOO = C4597yz.OooO00o;
            this.OooOOOo = C4409tw.OooO0OO;
            InterfaceC4224ow interfaceC4224ow = InterfaceC4224ow.OooO00o;
            this.OooOOo0 = interfaceC4224ow;
            this.OooOOo = interfaceC4224ow;
            this.OooOOoo = new C4557xw();
            this.OooOo00 = InterfaceC3818dx.OooO00o;
            this.OooOo0 = true;
            this.OooOo0O = true;
            this.OooOo0o = true;
            this.OooOo = 0;
            this.OooOoO0 = 10000;
            this.OooOoO = 10000;
            this.OooOoOO = 10000;
            this.OooOoo0 = 0;
        }

        public OooO0O0(C4151mx c4151mx) {
            ArrayList arrayList = new ArrayList();
            this.OooO0o0 = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.OooO0o = arrayList2;
            this.OooO00o = c4151mx.OoooOoO;
            this.OooO0O0 = c4151mx.OoooOoo;
            this.OooO0OO = c4151mx.Ooooo00;
            this.OooO0Oo = c4151mx.Ooooo0o;
            arrayList.addAll(c4151mx.OooooO0);
            arrayList2.addAll(c4151mx.OooooOO);
            this.OooO0oO = c4151mx.OooooOo;
            this.OooO0oo = c4151mx.Oooooo0;
            this.OooO = c4151mx.Oooooo;
            this.OooOO0O = c4151mx.Ooooooo;
            this.OooOO0 = c4151mx.OoooooO;
            this.OooOO0o = c4151mx.o0OoOo0;
            this.OooOOO0 = c4151mx.ooOO;
            this.OooOOO = c4151mx.o00O0O;
            this.OooOOOO = c4151mx.o00Oo0;
            this.OooOOOo = c4151mx.o00Ooo;
            this.OooOOo0 = c4151mx.o00o0O;
            this.OooOOo = c4151mx.o00ooo;
            this.OooOOoo = c4151mx.oo000o;
            this.OooOo00 = c4151mx.o00oO0o;
            this.OooOo0 = c4151mx.o00oO0O;
            this.OooOo0O = c4151mx.o0ooOO0;
            this.OooOo0o = c4151mx.o0ooOOo;
            this.OooOo = c4151mx.o0ooOoO;
            this.OooOoO0 = c4151mx.o0OOO0o;
            this.OooOoO = c4151mx.o0Oo0oo;
            this.OooOoOO = c4151mx.o0OO00O;
            this.OooOoo0 = c4151mx.oo0o0Oo;
        }

        public OooO0O0 OooO(long j, TimeUnit timeUnit) {
            this.OooOoO0 = C4558xx.OooO0o0("timeout", j, timeUnit);
            return this;
        }

        public OooO0O0 OooO00o(InterfaceC4040jx interfaceC4040jx) {
            if (interfaceC4040jx == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.OooO0o0.add(interfaceC4040jx);
            return this;
        }

        public OooO0O0 OooO0O0(InterfaceC4040jx interfaceC4040jx) {
            if (interfaceC4040jx == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.OooO0o.add(interfaceC4040jx);
            return this;
        }

        public OooO0O0 OooO0OO(InterfaceC4224ow interfaceC4224ow) {
            Objects.requireNonNull(interfaceC4224ow, "authenticator == null");
            this.OooOOo = interfaceC4224ow;
            return this;
        }

        public C4151mx OooO0Oo() {
            return new C4151mx(this);
        }

        public OooO0O0 OooO0o(long j, TimeUnit timeUnit) {
            this.OooOo = C4558xx.OooO0o0("timeout", j, timeUnit);
            return this;
        }

        public OooO0O0 OooO0o0(@Nullable C4261pw c4261pw) {
            this.OooOO0 = c4261pw;
            this.OooOO0O = null;
            return this;
        }

        @IgnoreJRERequirement
        public OooO0O0 OooO0oO(Duration duration) {
            this.OooOo = C4558xx.OooO0o0("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public OooO0O0 OooO0oo(C4409tw c4409tw) {
            Objects.requireNonNull(c4409tw, "certificatePinner == null");
            this.OooOOOo = c4409tw;
            return this;
        }

        @IgnoreJRERequirement
        public OooO0O0 OooOO0(Duration duration) {
            this.OooOoO0 = C4558xx.OooO0o0("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public OooO0O0 OooOO0O(C4557xw c4557xw) {
            Objects.requireNonNull(c4557xw, "connectionPool == null");
            this.OooOOoo = c4557xw;
            return this;
        }

        public OooO0O0 OooOO0o(List<C4594yw> list) {
            this.OooO0Oo = C4558xx.OooOo0(list);
            return this;
        }

        public OooO0O0 OooOOO(C3781cx c3781cx) {
            if (c3781cx == null) {
                throw new IllegalArgumentException("dispatcher == null");
            }
            this.OooO00o = c3781cx;
            return this;
        }

        public OooO0O0 OooOOO0(InterfaceC3707ax interfaceC3707ax) {
            Objects.requireNonNull(interfaceC3707ax, "cookieJar == null");
            this.OooO = interfaceC3707ax;
            return this;
        }

        public OooO0O0 OooOOOO(InterfaceC3818dx interfaceC3818dx) {
            Objects.requireNonNull(interfaceC3818dx, "dns == null");
            this.OooOo00 = interfaceC3818dx;
            return this;
        }

        public OooO0O0 OooOOOo(AbstractC3855ex abstractC3855ex) {
            Objects.requireNonNull(abstractC3855ex, "eventListener == null");
            this.OooO0oO = AbstractC3855ex.OooOO0O(abstractC3855ex);
            return this;
        }

        public OooO0O0 OooOOo(boolean z) {
            this.OooOo0O = z;
            return this;
        }

        public OooO0O0 OooOOo0(AbstractC3855ex.OooO0OO oooO0OO) {
            Objects.requireNonNull(oooO0OO, "eventListenerFactory == null");
            this.OooO0oO = oooO0OO;
            return this;
        }

        public OooO0O0 OooOOoo(boolean z) {
            this.OooOo0 = z;
            return this;
        }

        @IgnoreJRERequirement
        public OooO0O0 OooOo(Duration duration) {
            this.OooOoo0 = C4558xx.OooO0o0("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public List<InterfaceC4040jx> OooOo0() {
            return this.OooO0o0;
        }

        public OooO0O0 OooOo00(HostnameVerifier hostnameVerifier) {
            Objects.requireNonNull(hostnameVerifier, "hostnameVerifier == null");
            this.OooOOOO = hostnameVerifier;
            return this;
        }

        public List<InterfaceC4040jx> OooOo0O() {
            return this.OooO0o;
        }

        public OooO0O0 OooOo0o(long j, TimeUnit timeUnit) {
            this.OooOoo0 = C4558xx.OooO0o0(C3471v.f18968av, j, timeUnit);
            return this;
        }

        public OooO0O0 OooOoO(@Nullable Proxy proxy) {
            this.OooO0O0 = proxy;
            return this;
        }

        public OooO0O0 OooOoO0(List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            }
            if (arrayList.contains(protocol) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            }
            if (arrayList.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
            }
            if (arrayList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayList.remove(Protocol.SPDY_3);
            this.OooO0OO = Collections.unmodifiableList(arrayList);
            return this;
        }

        public OooO0O0 OooOoOO(InterfaceC4224ow interfaceC4224ow) {
            Objects.requireNonNull(interfaceC4224ow, "proxyAuthenticator == null");
            this.OooOOo0 = interfaceC4224ow;
            return this;
        }

        public OooO0O0 OooOoo(long j, TimeUnit timeUnit) {
            this.OooOoO = C4558xx.OooO0o0("timeout", j, timeUnit);
            return this;
        }

        public OooO0O0 OooOoo0(ProxySelector proxySelector) {
            Objects.requireNonNull(proxySelector, "proxySelector == null");
            this.OooO0oo = proxySelector;
            return this;
        }

        @IgnoreJRERequirement
        public OooO0O0 OooOooO(Duration duration) {
            this.OooOoO = C4558xx.OooO0o0("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public OooO0O0 OooOooo(boolean z) {
            this.OooOo0o = z;
            return this;
        }

        public OooO0O0 Oooo0(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            Objects.requireNonNull(sSLSocketFactory, "sslSocketFactory == null");
            Objects.requireNonNull(x509TrustManager, "trustManager == null");
            this.OooOOO0 = sSLSocketFactory;
            this.OooOOO = AbstractC4523wz.OooO0O0(x509TrustManager);
            return this;
        }

        public void Oooo000(@Nullable InterfaceC3893fy interfaceC3893fy) {
            this.OooOO0O = interfaceC3893fy;
            this.OooOO0 = null;
        }

        public OooO0O0 Oooo00O(SocketFactory socketFactory) {
            Objects.requireNonNull(socketFactory, "socketFactory == null");
            this.OooOO0o = socketFactory;
            return this;
        }

        public OooO0O0 Oooo00o(SSLSocketFactory sSLSocketFactory) {
            Objects.requireNonNull(sSLSocketFactory, "sslSocketFactory == null");
            this.OooOOO0 = sSLSocketFactory;
            this.OooOOO = C4375sz.OooOO0O().OooO0OO(sSLSocketFactory);
            return this;
        }

        public OooO0O0 Oooo0O0(long j, TimeUnit timeUnit) {
            this.OooOoOO = C4558xx.OooO0o0("timeout", j, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        public OooO0O0 Oooo0OO(Duration duration) {
            this.OooOoOO = C4558xx.OooO0o0("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }
    }

    static {
        AbstractC4484vx.OooO00o = new OooO00o();
    }

    public C4151mx() {
        this(new OooO0O0());
    }

    public C4151mx(OooO0O0 oooO0O0) {
        boolean z;
        AbstractC4523wz abstractC4523wzOooO0O0;
        this.OoooOoO = oooO0O0.OooO00o;
        this.OoooOoo = oooO0O0.OooO0O0;
        this.Ooooo00 = oooO0O0.OooO0OO;
        List<C4594yw> list = oooO0O0.OooO0Oo;
        this.Ooooo0o = list;
        this.OooooO0 = C4558xx.OooOo0(oooO0O0.OooO0o0);
        this.OooooOO = C4558xx.OooOo0(oooO0O0.OooO0o);
        this.OooooOo = oooO0O0.OooO0oO;
        this.Oooooo0 = oooO0O0.OooO0oo;
        this.Oooooo = oooO0O0.OooO;
        this.OoooooO = oooO0O0.OooOO0;
        this.Ooooooo = oooO0O0.OooOO0O;
        this.o0OoOo0 = oooO0O0.OooOO0o;
        Iterator<C4594yw> it = list.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z = z || it.next().OooO0Oo();
            }
        }
        SSLSocketFactory sSLSocketFactory = oooO0O0.OooOOO0;
        if (sSLSocketFactory == null && z) {
            X509TrustManager x509TrustManagerOooOooO = C4558xx.OooOooO();
            this.ooOO = OooOo0O(x509TrustManagerOooOooO);
            abstractC4523wzOooO0O0 = AbstractC4523wz.OooO0O0(x509TrustManagerOooOooO);
        } else {
            this.ooOO = sSLSocketFactory;
            abstractC4523wzOooO0O0 = oooO0O0.OooOOO;
        }
        this.o00O0O = abstractC4523wzOooO0O0;
        if (this.ooOO != null) {
            C4375sz.OooOO0O().OooO0oO(this.ooOO);
        }
        this.o00Oo0 = oooO0O0.OooOOOO;
        this.o00Ooo = oooO0O0.OooOOOo.OooO0oO(this.o00O0O);
        this.o00o0O = oooO0O0.OooOOo0;
        this.o00ooo = oooO0O0.OooOOo;
        this.oo000o = oooO0O0.OooOOoo;
        this.o00oO0o = oooO0O0.OooOo00;
        this.o00oO0O = oooO0O0.OooOo0;
        this.o0ooOO0 = oooO0O0.OooOo0O;
        this.o0ooOOo = oooO0O0.OooOo0o;
        this.o0ooOoO = oooO0O0.OooOo;
        this.o0OOO0o = oooO0O0.OooOoO0;
        this.o0Oo0oo = oooO0O0.OooOoO;
        this.o0OO00O = oooO0O0.OooOoOO;
        this.oo0o0Oo = oooO0O0.OooOoo0;
        if (this.OooooO0.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.OooooO0);
        }
        if (this.OooooOO.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.OooooOO);
        }
    }

    private static SSLSocketFactory OooOo0O(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextOooOOO0 = C4375sz.OooOO0O().OooOOO0();
            sSLContextOooOOO0.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextOooOOO0.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw C4558xx.OooO0O0("No System TLS", e);
        }
    }

    public List<C4594yw> OooO() {
        return this.Ooooo0o;
    }

    @Override // p285z2.InterfaceC4335rw.OooO00o
    public InterfaceC4335rw OooO00o(C4225ox c4225ox) {
        return C4188nx.OooO0o0(this, c4225ox, false);
    }

    @Override // p285z2.InterfaceC4410tx.OooO00o
    public InterfaceC4410tx OooO0O0(C4225ox c4225ox, AbstractC4447ux abstractC4447ux) {
        a00 a00Var = new a00(c4225ox, abstractC4447ux, new Random(), this.oo0o0Oo);
        a00Var.OooOOO0(this);
        return a00Var;
    }

    public InterfaceC4224ow OooO0OO() {
        return this.o00ooo;
    }

    @Nullable
    public C4261pw OooO0Oo() {
        return this.OoooooO;
    }

    public C4409tw OooO0o() {
        return this.o00Ooo;
    }

    public int OooO0o0() {
        return this.o0ooOoO;
    }

    public int OooO0oO() {
        return this.o0OOO0o;
    }

    public C4557xw OooO0oo() {
        return this.oo000o;
    }

    public InterfaceC3707ax OooOO0O() {
        return this.Oooooo;
    }

    public C3781cx OooOO0o() {
        return this.OoooOoO;
    }

    public AbstractC3855ex.OooO0OO OooOOO() {
        return this.OooooOo;
    }

    public InterfaceC3818dx OooOOO0() {
        return this.o00oO0o;
    }

    public boolean OooOOOO() {
        return this.o0ooOO0;
    }

    public boolean OooOOOo() {
        return this.o00oO0O;
    }

    public List<InterfaceC4040jx> OooOOo() {
        return this.OooooO0;
    }

    public HostnameVerifier OooOOo0() {
        return this.o00Oo0;
    }

    public InterfaceC3893fy OooOOoo() {
        C4261pw c4261pw = this.OoooooO;
        return c4261pw != null ? c4261pw.OoooOoO : this.Ooooooo;
    }

    public List<Protocol> OooOo() {
        return this.Ooooo00;
    }

    public OooO0O0 OooOo0() {
        return new OooO0O0(this);
    }

    public List<InterfaceC4040jx> OooOo00() {
        return this.OooooOO;
    }

    public int OooOo0o() {
        return this.oo0o0Oo;
    }

    public InterfaceC4224ow OooOoO() {
        return this.o00o0O;
    }

    @Nullable
    public Proxy OooOoO0() {
        return this.OoooOoo;
    }

    public ProxySelector OooOoOO() {
        return this.Oooooo0;
    }

    public boolean OooOoo() {
        return this.o0ooOOo;
    }

    public int OooOoo0() {
        return this.o0Oo0oo;
    }

    public SocketFactory OooOooO() {
        return this.o0OoOo0;
    }

    public SSLSocketFactory OooOooo() {
        return this.ooOO;
    }

    public int Oooo000() {
        return this.o0OO00O;
    }
}
