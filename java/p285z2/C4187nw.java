package p285z2;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Protocol;
import p285z2.C4003ix;

/* JADX INFO: renamed from: z2.nw */
/* JADX INFO: loaded from: classes2.dex */
public final class C4187nw {

    @Nullable
    public final SSLSocketFactory OooO;
    public final C4003ix OooO00o;
    public final InterfaceC3818dx OooO0O0;
    public final SocketFactory OooO0OO;
    public final InterfaceC4224ow OooO0Oo;
    public final List<C4594yw> OooO0o;
    public final List<Protocol> OooO0o0;
    public final ProxySelector OooO0oO;

    @Nullable
    public final Proxy OooO0oo;

    @Nullable
    public final HostnameVerifier OooOO0;

    @Nullable
    public final C4409tw OooOO0O;

    public C4187nw(String str, int i, InterfaceC3818dx interfaceC3818dx, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable C4409tw c4409tw, InterfaceC4224ow interfaceC4224ow, @Nullable Proxy proxy, List<Protocol> list, List<C4594yw> list2, ProxySelector proxySelector) {
        this.OooO00o = new C4003ix.OooO00o().Oooo00o(sSLSocketFactory != null ? "https" : "http").OooOOo0(str).OooOo(i).OooO0oo();
        Objects.requireNonNull(interfaceC3818dx, "dns == null");
        this.OooO0O0 = interfaceC3818dx;
        Objects.requireNonNull(socketFactory, "socketFactory == null");
        this.OooO0OO = socketFactory;
        Objects.requireNonNull(interfaceC4224ow, "proxyAuthenticator == null");
        this.OooO0Oo = interfaceC4224ow;
        Objects.requireNonNull(list, "protocols == null");
        this.OooO0o0 = C4558xx.OooOo0(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.OooO0o = C4558xx.OooOo0(list2);
        Objects.requireNonNull(proxySelector, "proxySelector == null");
        this.OooO0oO = proxySelector;
        this.OooO0oo = proxy;
        this.OooO = sSLSocketFactory;
        this.OooOO0 = hostnameVerifier;
        this.OooOO0O = c4409tw;
    }

    public ProxySelector OooO() {
        return this.OooO0oO;
    }

    @Nullable
    public C4409tw OooO00o() {
        return this.OooOO0O;
    }

    public List<C4594yw> OooO0O0() {
        return this.OooO0o;
    }

    public InterfaceC3818dx OooO0OO() {
        return this.OooO0O0;
    }

    public boolean OooO0Oo(C4187nw c4187nw) {
        return this.OooO0O0.equals(c4187nw.OooO0O0) && this.OooO0Oo.equals(c4187nw.OooO0Oo) && this.OooO0o0.equals(c4187nw.OooO0o0) && this.OooO0o.equals(c4187nw.OooO0o) && this.OooO0oO.equals(c4187nw.OooO0oO) && C4558xx.OooOOo(this.OooO0oo, c4187nw.OooO0oo) && C4558xx.OooOOo(this.OooO, c4187nw.OooO) && C4558xx.OooOOo(this.OooOO0, c4187nw.OooOO0) && C4558xx.OooOOo(this.OooOO0O, c4187nw.OooOO0O) && OooOO0o().OooOooo() == c4187nw.OooOO0o().OooOooo();
    }

    public List<Protocol> OooO0o() {
        return this.OooO0o0;
    }

    @Nullable
    public HostnameVerifier OooO0o0() {
        return this.OooOO0;
    }

    @Nullable
    public Proxy OooO0oO() {
        return this.OooO0oo;
    }

    public InterfaceC4224ow OooO0oo() {
        return this.OooO0Oo;
    }

    public SocketFactory OooOO0() {
        return this.OooO0OO;
    }

    @Nullable
    public SSLSocketFactory OooOO0O() {
        return this.OooO;
    }

    public C4003ix OooOO0o() {
        return this.OooO00o;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C4187nw) {
            C4187nw c4187nw = (C4187nw) obj;
            if (this.OooO00o.equals(c4187nw.OooO00o) && OooO0Oo(c4187nw)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((((((527 + this.OooO00o.hashCode()) * 31) + this.OooO0O0.hashCode()) * 31) + this.OooO0Oo.hashCode()) * 31) + this.OooO0o0.hashCode()) * 31) + this.OooO0o.hashCode()) * 31) + this.OooO0oO.hashCode()) * 31;
        Proxy proxy = this.OooO0oo;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.OooO;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.OooOO0;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C4409tw c4409tw = this.OooOO0O;
        return iHashCode4 + (c4409tw != null ? c4409tw.hashCode() : 0);
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.OooO00o.OooOOOo());
        sb.append(":");
        sb.append(this.OooO00o.OooOooo());
        if (this.OooO0oo != null) {
            sb.append(", proxy=");
            obj = this.OooO0oo;
        } else {
            sb.append(", proxySelector=");
            obj = this.OooO0oO;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
