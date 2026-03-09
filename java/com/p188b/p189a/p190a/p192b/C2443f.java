package com.p188b.p189a.p190a.p192b;

import com.p188b.p189a.C2426a;
import com.p188b.p189a.C2526ac;
import com.p188b.p189a.C2546aw;
import com.p188b.p189a.p190a.C2446c;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.b.a.a.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2443f {

    /* JADX INFO: renamed from: a */
    private final C2426a f15154a;

    /* JADX INFO: renamed from: b */
    private final C2441d f15155b;

    /* JADX INFO: renamed from: c */
    private Proxy f15156c;

    /* JADX INFO: renamed from: d */
    private InetSocketAddress f15157d;

    /* JADX INFO: renamed from: e */
    private List<Proxy> f15158e;

    /* JADX INFO: renamed from: f */
    private int f15159f;

    /* JADX INFO: renamed from: h */
    private int f15161h;

    /* JADX INFO: renamed from: g */
    private List<InetSocketAddress> f15160g = Collections.emptyList();

    /* JADX INFO: renamed from: i */
    private final List<C2546aw> f15162i = new ArrayList();

    public C2443f(C2426a c2426a, C2441d c2441d) {
        List<Proxy> listM12579a;
        this.f15158e = Collections.emptyList();
        this.f15154a = c2426a;
        this.f15155b = c2441d;
        C2526ac c2526acM12490a = c2426a.m12490a();
        Proxy proxyM12497h = c2426a.m12497h();
        if (proxyM12497h != null) {
            listM12579a = Collections.singletonList(proxyM12497h);
        } else {
            List<Proxy> listSelect = c2426a.m12496g().select(c2526acM12490a.m12810a());
            listM12579a = (listSelect == null || listSelect.isEmpty()) ? C2446c.m12579a(Proxy.NO_PROXY) : C2446c.m12578a(listSelect);
        }
        this.f15158e = listM12579a;
        this.f15159f = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m12548a(Proxy proxy) throws SocketException {
        String strM12817f;
        int iM12818g;
        this.f15160g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strM12817f = this.f15154a.m12490a().m12817f();
            iM12818g = this.f15154a.m12490a().m12818g();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            InetAddress address = inetSocketAddress.getAddress();
            strM12817f = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
            iM12818g = inetSocketAddress.getPort();
        }
        if (iM12818g <= 0 || iM12818g > 65535) {
            throw new SocketException("No route to " + strM12817f + ":" + iM12818g + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f15160g.add(InetSocketAddress.createUnresolved(strM12817f, iM12818g));
        } else {
            List<InetAddress> listMo12967a = this.f15154a.m12491b().mo12967a(strM12817f);
            int size = listMo12967a.size();
            for (int i = 0; i < size; i++) {
                this.f15160g.add(new InetSocketAddress(listMo12967a.get(i), iM12818g));
            }
        }
        this.f15161h = 0;
    }

    /* JADX INFO: renamed from: c */
    private boolean m12549c() {
        return this.f15159f < this.f15158e.size();
    }

    /* JADX INFO: renamed from: d */
    private boolean m12550d() {
        return this.f15161h < this.f15160g.size();
    }

    /* JADX INFO: renamed from: e */
    private boolean m12551e() {
        return !this.f15162i.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public final void m12552a(C2546aw c2546aw, IOException iOException) {
        if (c2546aw.m12912b().type() != Proxy.Type.DIRECT && this.f15154a.m12496g() != null) {
            this.f15154a.m12496g().connectFailed(this.f15154a.m12490a().m12810a(), c2546aw.m12912b().address(), iOException);
        }
        this.f15155b.m12543a(c2546aw);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12553a() {
        return m12550d() || m12549c() || m12551e();
    }

    /* JADX INFO: renamed from: b */
    public final C2546aw m12554b() {
        while (true) {
            if (!m12550d()) {
                if (!m12549c()) {
                    if (m12551e()) {
                        return this.f15162i.remove(0);
                    }
                    throw new NoSuchElementException();
                }
                if (!m12549c()) {
                    throw new SocketException("No route to " + this.f15154a.m12490a().m12817f() + "; exhausted proxy configurations: " + this.f15158e);
                }
                List<Proxy> list = this.f15158e;
                int i = this.f15159f;
                this.f15159f = i + 1;
                Proxy proxy = list.get(i);
                m12548a(proxy);
                this.f15156c = proxy;
            }
            if (!m12550d()) {
                throw new SocketException("No route to " + this.f15154a.m12490a().m12817f() + "; exhausted inet socket addresses: " + this.f15160g);
            }
            List<InetSocketAddress> list2 = this.f15160g;
            int i2 = this.f15161h;
            this.f15161h = i2 + 1;
            InetSocketAddress inetSocketAddress = list2.get(i2);
            this.f15157d = inetSocketAddress;
            C2546aw c2546aw = new C2546aw(this.f15154a, this.f15156c, inetSocketAddress);
            if (!this.f15155b.m12545c(c2546aw)) {
                return c2546aw;
            }
            this.f15162i.add(c2546aw);
        }
    }
}
