package com.p188b.p189a.p190a.p194d;

import com.p188b.p189a.AbstractC2544au;
import com.p188b.p189a.C2524aa;
import com.p188b.p189a.C2525ab;
import com.p188b.p189a.C2526ac;
import com.p188b.p189a.C2532ai;
import com.p188b.p189a.C2538ao;
import com.p188b.p189a.C2542as;
import com.p188b.p189a.C2543at;
import com.p188b.p189a.p190a.AbstractC2427a;
import com.p188b.p189a.p190a.p192b.C2444g;
import com.p188b.p189a.p190a.p193c.C2452f;
import com.p188b.p189a.p190a.p193c.C2455i;
import com.p188b.p189a.p190a.p193c.C2456j;
import com.p188b.p189a.p190a.p193c.C2458l;
import com.p188b.p189a.p190a.p193c.InterfaceC2449c;
import com.p188b.p199b.C2584k;
import com.p188b.p199b.C2587n;
import com.p188b.p199b.C2598y;
import com.p188b.p199b.InterfaceC2580g;
import com.p188b.p199b.InterfaceC2581h;
import com.p188b.p199b.InterfaceC2596w;
import com.p188b.p199b.InterfaceC2597x;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: renamed from: com.b.a.a.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2461a implements InterfaceC2449c {

    /* JADX INFO: renamed from: a */
    public final C2532ai f15216a;

    /* JADX INFO: renamed from: b */
    public final C2444g f15217b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2581h f15218c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2580g f15219d;

    /* JADX INFO: renamed from: e */
    public int f15220e = 0;

    public C2461a(C2532ai c2532ai, C2444g c2444g, InterfaceC2581h interfaceC2581h, InterfaceC2580g interfaceC2580g) {
        this.f15216a = c2532ai;
        this.f15217b = c2444g;
        this.f15218c = interfaceC2581h;
        this.f15219d = interfaceC2580g;
    }

    /* JADX INFO: renamed from: a */
    public static void m12627a(C2584k c2584k) {
        C2598y c2598yM13059a = c2584k.m13059a();
        c2584k.m13058a(C2598y.f15860b);
        c2598yM13059a.mo13066e_();
        c2598yM13059a.mo13065d_();
    }

    @Override // com.p188b.p189a.p190a.p193c.InterfaceC2449c
    /* JADX INFO: renamed from: a */
    public final C2543at mo12594a(boolean z) throws IOException {
        int i = this.f15220e;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.f15220e);
        }
        try {
            C2458l c2458lM12626a = C2458l.m12626a(this.f15218c.mo13036m());
            C2543at c2543atM12898a = new C2543at().m12899a(c2458lM12626a.f15211a).m12896a(c2458lM12626a.f15212b).m12904a(c2458lM12626a.f15213c).m12898a(m12630c());
            if (z && c2458lM12626a.f15212b == 100) {
                return null;
            }
            this.f15220e = 4;
            return c2543atM12898a;
        } catch (EOFException e) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f15217b);
            iOException.initCause(e);
            throw iOException;
        }
    }

    @Override // com.p188b.p189a.p190a.p193c.InterfaceC2449c
    /* JADX INFO: renamed from: a */
    public final AbstractC2544au mo12595a(C2542as c2542as) {
        InterfaceC2597x c2467g;
        if (!C2452f.m12609b(c2542as)) {
            c2467g = m12628a(0L);
        } else if ("chunked".equalsIgnoreCase(c2542as.m12885a("Transfer-Encoding"))) {
            C2526ac c2526acM12864a = c2542as.m12884a().m12864a();
            if (this.f15220e != 4) {
                throw new IllegalStateException("state: " + this.f15220e);
            }
            this.f15220e = 5;
            c2467g = new C2464d(this, c2526acM12864a);
        } else {
            long jM12605a = C2452f.m12605a(c2542as);
            if (jM12605a != -1) {
                c2467g = m12628a(jM12605a);
            } else {
                if (this.f15220e != 4) {
                    throw new IllegalStateException("state: " + this.f15220e);
                }
                C2444g c2444g = this.f15217b;
                if (c2444g == null) {
                    throw new IllegalStateException("streamAllocation == null");
                }
                this.f15220e = 5;
                c2444g.m12568d();
                c2467g = new C2467g(this);
            }
        }
        return new C2455i(c2542as.m12888d(), C2587n.m13072a(c2467g));
    }

    @Override // com.p188b.p189a.p190a.p193c.InterfaceC2449c
    /* JADX INFO: renamed from: a */
    public final InterfaceC2596w mo12596a(C2538ao c2538ao, long j) {
        if ("chunked".equalsIgnoreCase(c2538ao.m12865a("Transfer-Encoding"))) {
            if (this.f15220e == 1) {
                this.f15220e = 2;
                return new C2463c(this);
            }
            throw new IllegalStateException("state: " + this.f15220e);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f15220e == 1) {
            this.f15220e = 2;
            return new C2465e(this, j);
        }
        throw new IllegalStateException("state: " + this.f15220e);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2597x m12628a(long j) {
        if (this.f15220e == 4) {
            this.f15220e = 5;
            return new C2466f(this, j);
        }
        throw new IllegalStateException("state: " + this.f15220e);
    }

    @Override // com.p188b.p189a.p190a.p193c.InterfaceC2449c
    /* JADX INFO: renamed from: a */
    public final void mo12597a() {
        this.f15219d.flush();
    }

    /* JADX INFO: renamed from: a */
    public final void m12629a(C2524aa c2524aa, String str) {
        if (this.f15220e != 0) {
            throw new IllegalStateException("state: " + this.f15220e);
        }
        this.f15219d.mo13008b(str).mo13008b(IOUtils.LINE_SEPARATOR_WINDOWS);
        int iM12787a = c2524aa.m12787a();
        for (int i = 0; i < iM12787a; i++) {
            this.f15219d.mo13008b(c2524aa.m12788a(i)).mo13008b(": ").mo13008b(c2524aa.m12791b(i)).mo13008b(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        this.f15219d.mo13008b(IOUtils.LINE_SEPARATOR_WINDOWS);
        this.f15220e = 1;
    }

    @Override // com.p188b.p189a.p190a.p193c.InterfaceC2449c
    /* JADX INFO: renamed from: a */
    public final void mo12598a(C2538ao c2538ao) {
        Proxy.Type type = this.f15217b.m12565b().mo12534a().m12912b().type();
        StringBuilder sb = new StringBuilder();
        sb.append(c2538ao.m12866b());
        sb.append(' ');
        if (!c2538ao.m12871g() && type == Proxy.Type.HTTP) {
            sb.append(c2538ao.m12864a());
        } else {
            sb.append(C2456j.m12620a(c2538ao.m12864a()));
        }
        sb.append(" HTTP/1.1");
        m12629a(c2538ao.m12867c(), sb.toString());
    }

    @Override // com.p188b.p189a.p190a.p193c.InterfaceC2449c
    /* JADX INFO: renamed from: b */
    public final void mo12599b() {
        this.f15219d.flush();
    }

    /* JADX INFO: renamed from: c */
    public final C2524aa m12630c() {
        C2525ab c2525ab = new C2525ab();
        while (true) {
            String strMo13036m = this.f15218c.mo13036m();
            if (strMo13036m.length() == 0) {
                return c2525ab.m12793a();
            }
            AbstractC2427a.f15087a.mo12504a(c2525ab, strMo13036m);
        }
    }
}
