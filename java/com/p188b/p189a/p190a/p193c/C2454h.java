package com.p188b.p189a.p190a.p193c;

import com.p188b.p189a.C2526ac;
import com.p188b.p189a.C2538ao;
import com.p188b.p189a.C2542as;
import com.p188b.p189a.InterfaceC2529af;
import com.p188b.p189a.InterfaceC2530ag;
import com.p188b.p189a.InterfaceC2559m;
import com.p188b.p189a.p190a.p192b.C2444g;
import java.util.List;

/* JADX INFO: renamed from: com.b.a.a.c.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2454h implements InterfaceC2530ag {

    /* JADX INFO: renamed from: a */
    private final List<InterfaceC2529af> f15197a;

    /* JADX INFO: renamed from: b */
    private final C2444g f15198b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2449c f15199c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC2559m f15200d;

    /* JADX INFO: renamed from: e */
    private final int f15201e;

    /* JADX INFO: renamed from: f */
    private final C2538ao f15202f;

    /* JADX INFO: renamed from: g */
    private int f15203g;

    public C2454h(List<InterfaceC2529af> list, C2444g c2444g, InterfaceC2449c interfaceC2449c, InterfaceC2559m interfaceC2559m, int i, C2538ao c2538ao) {
        this.f15197a = list;
        this.f15200d = interfaceC2559m;
        this.f15198b = c2444g;
        this.f15199c = interfaceC2449c;
        this.f15201e = i;
        this.f15202f = c2538ao;
    }

    @Override // com.p188b.p189a.InterfaceC2530ag
    /* JADX INFO: renamed from: a */
    public final C2538ao mo12612a() {
        return this.f15202f;
    }

    @Override // com.p188b.p189a.InterfaceC2530ag
    /* JADX INFO: renamed from: a */
    public final C2542as mo12613a(C2538ao c2538ao) {
        return m12614a(c2538ao, this.f15198b, this.f15199c, this.f15200d);
    }

    /* JADX INFO: renamed from: a */
    public final C2542as m12614a(C2538ao c2538ao, C2444g c2444g, InterfaceC2449c interfaceC2449c, InterfaceC2559m interfaceC2559m) {
        if (this.f15201e >= this.f15197a.size()) {
            throw new AssertionError();
        }
        this.f15203g++;
        if (this.f15199c != null) {
            C2526ac c2526acM12864a = c2538ao.m12864a();
            if (!(c2526acM12864a.m12817f().equals(this.f15200d.mo12534a().m12911a().m12490a().m12817f()) && c2526acM12864a.m12818g() == this.f15200d.mo12534a().m12911a().m12490a().m12818g())) {
                throw new IllegalStateException("network interceptor " + this.f15197a.get(this.f15201e - 1) + " must retain the same host and port");
            }
        }
        if (this.f15199c != null && this.f15203g > 1) {
            throw new IllegalStateException("network interceptor " + this.f15197a.get(this.f15201e - 1) + " must call proceed() exactly once");
        }
        C2454h c2454h = new C2454h(this.f15197a, c2444g, interfaceC2449c, interfaceC2559m, this.f15201e + 1, c2538ao);
        InterfaceC2529af interfaceC2529af = this.f15197a.get(this.f15201e);
        C2542as c2542asMo12512a = interfaceC2529af.mo12512a(c2454h);
        if (interfaceC2449c != null && this.f15201e + 1 < this.f15197a.size() && c2454h.f15203g != 1) {
            throw new IllegalStateException("network interceptor " + interfaceC2529af + " must call proceed() exactly once");
        }
        if (c2542asMo12512a != null) {
            return c2542asMo12512a;
        }
        throw new NullPointerException("interceptor " + interfaceC2529af + " returned null");
    }

    /* JADX INFO: renamed from: b */
    public final C2444g m12615b() {
        return this.f15198b;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC2449c m12616c() {
        return this.f15199c;
    }
}
