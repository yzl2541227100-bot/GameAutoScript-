package com.p188b.p189a;

import com.p188b.p189a.p190a.C2446c;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.b.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2426a {

    /* JADX INFO: renamed from: a */
    public final C2526ac f15076a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2568v f15077b;

    /* JADX INFO: renamed from: c */
    public final SocketFactory f15078c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2548b f15079d;

    /* JADX INFO: renamed from: e */
    public final List<EnumC2535al> f15080e;

    /* JADX INFO: renamed from: f */
    public final List<C2562p> f15081f;

    /* JADX INFO: renamed from: g */
    public final ProxySelector f15082g;

    /* JADX INFO: renamed from: h */
    public final Proxy f15083h;

    /* JADX INFO: renamed from: i */
    public final SSLSocketFactory f15084i;

    /* JADX INFO: renamed from: j */
    public final HostnameVerifier f15085j;

    /* JADX INFO: renamed from: k */
    public final C2555i f15086k;

    public C2426a(String str, int i, InterfaceC2568v interfaceC2568v, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C2555i c2555i, InterfaceC2548b interfaceC2548b, Proxy proxy, List<EnumC2535al> list, List<C2562p> list2, ProxySelector proxySelector) {
        C2527ad c2527ad = new C2527ad();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c2527ad.f15467a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c2527ad.f15467a = "https";
        }
        C2527ad c2527adM12830a = c2527ad.m12830a(str);
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i)));
        }
        c2527adM12830a.f15471e = i;
        this.f15076a = c2527adM12830a.m12831b();
        Objects.requireNonNull(interfaceC2568v, "dns == null");
        this.f15077b = interfaceC2568v;
        Objects.requireNonNull(socketFactory, "socketFactory == null");
        this.f15078c = socketFactory;
        Objects.requireNonNull(interfaceC2548b, "proxyAuthenticator == null");
        this.f15079d = interfaceC2548b;
        Objects.requireNonNull(list, "protocols == null");
        this.f15080e = C2446c.m12578a(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.f15081f = C2446c.m12578a(list2);
        Objects.requireNonNull(proxySelector, "proxySelector == null");
        this.f15082g = proxySelector;
        this.f15083h = proxy;
        this.f15084i = sSLSocketFactory;
        this.f15085j = hostnameVerifier;
        this.f15086k = c2555i;
    }

    /* JADX INFO: renamed from: a */
    public final C2526ac m12490a() {
        return this.f15076a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2568v m12491b() {
        return this.f15077b;
    }

    /* JADX INFO: renamed from: c */
    public final SocketFactory m12492c() {
        return this.f15078c;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC2548b m12493d() {
        return this.f15079d;
    }

    /* JADX INFO: renamed from: e */
    public final List<EnumC2535al> m12494e() {
        return this.f15080e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2426a) {
            C2426a c2426a = (C2426a) obj;
            if (this.f15076a.equals(c2426a.f15076a) && this.f15077b.equals(c2426a.f15077b) && this.f15079d.equals(c2426a.f15079d) && this.f15080e.equals(c2426a.f15080e) && this.f15081f.equals(c2426a.f15081f) && this.f15082g.equals(c2426a.f15082g) && C2446c.m12587a(this.f15083h, c2426a.f15083h) && C2446c.m12587a(this.f15084i, c2426a.f15084i) && C2446c.m12587a(this.f15085j, c2426a.f15085j) && C2446c.m12587a(this.f15086k, c2426a.f15086k)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final List<C2562p> m12495f() {
        return this.f15081f;
    }

    /* JADX INFO: renamed from: g */
    public final ProxySelector m12496g() {
        return this.f15082g;
    }

    /* JADX INFO: renamed from: h */
    public final Proxy m12497h() {
        return this.f15083h;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.f15076a.hashCode() + 527) * 31) + this.f15077b.hashCode()) * 31) + this.f15079d.hashCode()) * 31) + this.f15080e.hashCode()) * 31) + this.f15081f.hashCode()) * 31) + this.f15082g.hashCode()) * 31;
        Proxy proxy = this.f15083h;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f15084i;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f15085j;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C2555i c2555i = this.f15086k;
        return iHashCode4 + (c2555i != null ? c2555i.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final SSLSocketFactory m12498i() {
        return this.f15084i;
    }

    /* JADX INFO: renamed from: j */
    public final HostnameVerifier m12499j() {
        return this.f15085j;
    }

    /* JADX INFO: renamed from: k */
    public final C2555i m12500k() {
        return this.f15086k;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f15076a.f15459b);
        sb.append(":");
        sb.append(this.f15076a.f15460c);
        if (this.f15083h != null) {
            sb.append(", proxy=");
            obj = this.f15083h;
        } else {
            sb.append(", proxySelector=");
            obj = this.f15082g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
