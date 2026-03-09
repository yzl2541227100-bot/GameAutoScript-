package com.p188b.p189a;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

/* JADX INFO: renamed from: com.b.a.aw */
/* JADX INFO: loaded from: classes.dex */
public final class C2546aw {

    /* JADX INFO: renamed from: a */
    public final C2426a f15597a;

    /* JADX INFO: renamed from: b */
    public final Proxy f15598b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f15599c;

    public C2546aw(C2426a c2426a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(c2426a, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f15597a = c2426a;
        this.f15598b = proxy;
        this.f15599c = inetSocketAddress;
    }

    /* JADX INFO: renamed from: a */
    public final C2426a m12911a() {
        return this.f15597a;
    }

    /* JADX INFO: renamed from: b */
    public final Proxy m12912b() {
        return this.f15598b;
    }

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress m12913c() {
        return this.f15599c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12914d() {
        return this.f15597a.f15084i != null && this.f15598b.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2546aw) {
            C2546aw c2546aw = (C2546aw) obj;
            if (this.f15597a.equals(c2546aw.f15597a) && this.f15598b.equals(c2546aw.f15598b) && this.f15599c.equals(c2546aw.f15599c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15597a.hashCode() + 527) * 31) + this.f15598b.hashCode()) * 31) + this.f15599c.hashCode();
    }

    public final String toString() {
        return "Route{" + this.f15599c + "}";
    }
}
