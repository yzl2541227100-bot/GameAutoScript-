package com.p188b.p189a;

import com.p188b.p189a.p190a.AbstractC2427a;
import com.p188b.p189a.p190a.C2446c;
import com.p188b.p189a.p190a.p191a.InterfaceC2436i;
import com.p188b.p189a.p190a.p197g.C2516h;
import com.p188b.p189a.p190a.p198h.AbstractC2518b;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.b.a.ai */
/* JADX INFO: loaded from: classes.dex */
public class C2532ai implements Cloneable {

    /* JADX INFO: renamed from: a */
    public static final List<EnumC2535al> f15487a = C2446c.m12579a(EnumC2535al.HTTP_2, EnumC2535al.HTTP_1_1);

    /* JADX INFO: renamed from: b */
    public static final List<C2562p> f15488b = C2446c.m12579a(C2562p.f15762a, C2562p.f15763b, C2562p.f15764c);

    /* JADX INFO: renamed from: A */
    public final int f15489A;

    /* JADX INFO: renamed from: B */
    public final int f15490B;

    /* JADX INFO: renamed from: c */
    public final C2567u f15491c;

    /* JADX INFO: renamed from: d */
    public final Proxy f15492d;

    /* JADX INFO: renamed from: e */
    public final List<EnumC2535al> f15493e;

    /* JADX INFO: renamed from: f */
    public final List<C2562p> f15494f;

    /* JADX INFO: renamed from: g */
    public final List<InterfaceC2529af> f15495g;

    /* JADX INFO: renamed from: h */
    public final List<InterfaceC2529af> f15496h;

    /* JADX INFO: renamed from: i */
    public final ProxySelector f15497i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2565s f15498j;

    /* JADX INFO: renamed from: k */
    public final C2550d f15499k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC2436i f15500l;

    /* JADX INFO: renamed from: m */
    public final SocketFactory f15501m;

    /* JADX INFO: renamed from: n */
    public final SSLSocketFactory f15502n;

    /* JADX INFO: renamed from: o */
    public final AbstractC2518b f15503o;

    /* JADX INFO: renamed from: p */
    public final HostnameVerifier f15504p;

    /* JADX INFO: renamed from: q */
    public final C2555i f15505q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC2548b f15506r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC2548b f15507s;

    /* JADX INFO: renamed from: t */
    public final C2560n f15508t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC2568v f15509u;

    /* JADX INFO: renamed from: v */
    public final boolean f15510v;

    /* JADX INFO: renamed from: w */
    public final boolean f15511w;

    /* JADX INFO: renamed from: x */
    public final boolean f15512x;

    /* JADX INFO: renamed from: y */
    public final int f15513y;

    /* JADX INFO: renamed from: z */
    public final int f15514z;

    static {
        AbstractC2427a.f15087a = new C2533aj();
    }

    public C2532ai() {
        this(new C2534ak());
    }

    private C2532ai(C2534ak c2534ak) {
        boolean z;
        AbstractC2518b abstractC2518bMo12750a;
        this.f15491c = c2534ak.f15515a;
        this.f15492d = c2534ak.f15516b;
        this.f15493e = c2534ak.f15517c;
        List<C2562p> list = c2534ak.f15518d;
        this.f15494f = list;
        this.f15495g = C2446c.m12578a(c2534ak.f15519e);
        this.f15496h = C2446c.m12578a(c2534ak.f15520f);
        this.f15497i = c2534ak.f15521g;
        this.f15498j = c2534ak.f15522h;
        this.f15499k = c2534ak.f15523i;
        this.f15500l = c2534ak.f15524j;
        this.f15501m = c2534ak.f15525k;
        Iterator<C2562p> it = list.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z = z || it.next().f15766d;
            }
        }
        SSLSocketFactory sSLSocketFactory = c2534ak.f15526l;
        if (sSLSocketFactory == null && z) {
            X509TrustManager x509TrustManagerM12836t = m12836t();
            this.f15502n = m12835a(x509TrustManagerM12836t);
            abstractC2518bMo12750a = C2516h.m12773b().mo12750a(x509TrustManagerM12836t);
        } else {
            this.f15502n = sSLSocketFactory;
            abstractC2518bMo12750a = c2534ak.f15527m;
        }
        this.f15503o = abstractC2518bMo12750a;
        this.f15504p = c2534ak.f15528n;
        this.f15505q = c2534ak.f15529o.m12932a(this.f15503o);
        this.f15506r = c2534ak.f15530p;
        this.f15507s = c2534ak.f15531q;
        this.f15508t = c2534ak.f15532r;
        this.f15509u = c2534ak.f15533s;
        this.f15510v = c2534ak.f15534t;
        this.f15511w = c2534ak.f15535u;
        this.f15512x = c2534ak.f15536v;
        this.f15513y = c2534ak.f15537w;
        this.f15514z = c2534ak.f15538x;
        this.f15489A = c2534ak.f15539y;
        this.f15490B = c2534ak.f15540z;
    }

    /* JADX INFO: renamed from: a */
    private static SSLSocketFactory m12835a(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: t */
    private static X509TrustManager m12836t() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m12837a() {
        return this.f15513y;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2553g m12838a(C2538ao c2538ao) {
        return new C2536am(this, c2538ao, false);
    }

    /* JADX INFO: renamed from: b */
    public final int m12839b() {
        return this.f15514z;
    }

    /* JADX INFO: renamed from: c */
    public final int m12840c() {
        return this.f15489A;
    }

    /* JADX INFO: renamed from: d */
    public final Proxy m12841d() {
        return this.f15492d;
    }

    /* JADX INFO: renamed from: e */
    public final ProxySelector m12842e() {
        return this.f15497i;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC2565s m12843f() {
        return this.f15498j;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC2568v m12844g() {
        return this.f15509u;
    }

    /* JADX INFO: renamed from: h */
    public final SocketFactory m12845h() {
        return this.f15501m;
    }

    /* JADX INFO: renamed from: i */
    public final SSLSocketFactory m12846i() {
        return this.f15502n;
    }

    /* JADX INFO: renamed from: j */
    public final HostnameVerifier m12847j() {
        return this.f15504p;
    }

    /* JADX INFO: renamed from: k */
    public final C2555i m12848k() {
        return this.f15505q;
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC2548b m12849l() {
        return this.f15507s;
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC2548b m12850m() {
        return this.f15506r;
    }

    /* JADX INFO: renamed from: n */
    public final C2560n m12851n() {
        return this.f15508t;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12852o() {
        return this.f15510v;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m12853p() {
        return this.f15511w;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m12854q() {
        return this.f15512x;
    }

    /* JADX INFO: renamed from: r */
    public final List<EnumC2535al> m12855r() {
        return this.f15493e;
    }

    /* JADX INFO: renamed from: s */
    public final List<C2562p> m12856s() {
        return this.f15494f;
    }
}
