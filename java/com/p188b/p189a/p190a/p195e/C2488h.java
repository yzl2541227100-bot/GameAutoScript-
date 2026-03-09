package com.p188b.p189a.p190a.p195e;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.p188b.p189a.AbstractC2544au;
import com.p188b.p189a.C2524aa;
import com.p188b.p189a.C2525ab;
import com.p188b.p189a.C2532ai;
import com.p188b.p189a.C2538ao;
import com.p188b.p189a.C2542as;
import com.p188b.p189a.C2543at;
import com.p188b.p189a.EnumC2535al;
import com.p188b.p189a.p190a.AbstractC2427a;
import com.p188b.p189a.p190a.C2446c;
import com.p188b.p189a.p190a.p192b.C2444g;
import com.p188b.p189a.p190a.p193c.C2455i;
import com.p188b.p189a.p190a.p193c.C2456j;
import com.p188b.p189a.p190a.p193c.C2458l;
import com.p188b.p189a.p190a.p193c.InterfaceC2449c;
import com.p188b.p199b.C2582i;
import com.p188b.p199b.C2587n;
import com.p188b.p199b.InterfaceC2596w;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.b.a.a.e.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2488h implements InterfaceC2449c {

    /* JADX INFO: renamed from: b */
    private static final C2582i f15327b;

    /* JADX INFO: renamed from: c */
    private static final C2582i f15328c;

    /* JADX INFO: renamed from: d */
    private static final C2582i f15329d;

    /* JADX INFO: renamed from: e */
    private static final C2582i f15330e;

    /* JADX INFO: renamed from: f */
    private static final C2582i f15331f;

    /* JADX INFO: renamed from: g */
    private static final C2582i f15332g;

    /* JADX INFO: renamed from: h */
    private static final C2582i f15333h;

    /* JADX INFO: renamed from: i */
    private static final C2582i f15334i;

    /* JADX INFO: renamed from: j */
    private static final List<C2582i> f15335j;

    /* JADX INFO: renamed from: k */
    private static final List<C2582i> f15336k;

    /* JADX INFO: renamed from: a */
    public final C2444g f15337a;

    /* JADX INFO: renamed from: l */
    private final C2532ai f15338l;

    /* JADX INFO: renamed from: m */
    private final C2490j f15339m;

    /* JADX INFO: renamed from: n */
    private C2470ab f15340n;

    static {
        C2582i c2582iM13041a = C2582i.m13041a("connection");
        f15327b = c2582iM13041a;
        C2582i c2582iM13041a2 = C2582i.m13041a("host");
        f15328c = c2582iM13041a2;
        C2582i c2582iM13041a3 = C2582i.m13041a("keep-alive");
        f15329d = c2582iM13041a3;
        C2582i c2582iM13041a4 = C2582i.m13041a("proxy-connection");
        f15330e = c2582iM13041a4;
        C2582i c2582iM13041a5 = C2582i.m13041a("transfer-encoding");
        f15331f = c2582iM13041a5;
        C2582i c2582iM13041a6 = C2582i.m13041a("te");
        f15332g = c2582iM13041a6;
        C2582i c2582iM13041a7 = C2582i.m13041a("encoding");
        f15333h = c2582iM13041a7;
        C2582i c2582iM13041a8 = C2582i.m13041a("upgrade");
        f15334i = c2582iM13041a8;
        f15335j = C2446c.m12579a(c2582iM13041a, c2582iM13041a2, c2582iM13041a3, c2582iM13041a4, c2582iM13041a6, c2582iM13041a5, c2582iM13041a7, c2582iM13041a8, C2483c.f15296c, C2483c.f15297d, C2483c.f15298e, C2483c.f15299f);
        f15336k = C2446c.m12579a(c2582iM13041a, c2582iM13041a2, c2582iM13041a3, c2582iM13041a4, c2582iM13041a6, c2582iM13041a5, c2582iM13041a7, c2582iM13041a8);
    }

    public C2488h(C2532ai c2532ai, C2444g c2444g, C2490j c2490j) {
        this.f15338l = c2532ai;
        this.f15337a = c2444g;
        this.f15339m = c2490j;
    }

    @Override // com.p188b.p189a.p190a.p193c.InterfaceC2449c
    /* JADX INFO: renamed from: a */
    public final C2543at mo12594a(boolean z) throws ProtocolException {
        List<C2483c> listM12650c = this.f15340n.m12650c();
        C2525ab c2525ab = new C2525ab();
        int size = listM12650c.size();
        C2458l c2458lM12626a = null;
        for (int i = 0; i < size; i++) {
            C2483c c2483c = listM12650c.get(i);
            if (c2483c != null) {
                C2582i c2582i = c2483c.f15300g;
                String strMo13047a = c2483c.f15301h.mo13047a();
                if (c2582i.equals(C2483c.f15295b)) {
                    c2458lM12626a = C2458l.m12626a("HTTP/1.1 ".concat(String.valueOf(strMo13047a)));
                } else if (!f15336k.contains(c2582i)) {
                    AbstractC2427a.f15087a.mo12505a(c2525ab, c2582i.mo13047a(), strMo13047a);
                }
            } else if (c2458lM12626a != null && c2458lM12626a.f15212b == 100) {
                c2525ab = new C2525ab();
                c2458lM12626a = null;
            }
        }
        if (c2458lM12626a == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C2543at c2543atM12898a = new C2543at().m12899a(EnumC2535al.HTTP_2).m12896a(c2458lM12626a.f15212b).m12904a(c2458lM12626a.f15213c).m12898a(c2525ab.m12793a());
        if (z && AbstractC2427a.f15087a.mo12501a(c2543atM12898a) == 100) {
            return null;
        }
        return c2543atM12898a;
    }

    @Override // com.p188b.p189a.p190a.p193c.InterfaceC2449c
    /* JADX INFO: renamed from: a */
    public final AbstractC2544au mo12595a(C2542as c2542as) {
        return new C2455i(c2542as.m12888d(), C2587n.m13072a(new C2489i(this, this.f15340n.m12652d())));
    }

    @Override // com.p188b.p189a.p190a.p193c.InterfaceC2449c
    /* JADX INFO: renamed from: a */
    public final InterfaceC2596w mo12596a(C2538ao c2538ao, long j) {
        return this.f15340n.m12653e();
    }

    @Override // com.p188b.p189a.p190a.p193c.InterfaceC2449c
    /* JADX INFO: renamed from: a */
    public final void mo12597a() {
        this.f15339m.f15358p.m12674b();
    }

    @Override // com.p188b.p189a.p190a.p193c.InterfaceC2449c
    /* JADX INFO: renamed from: a */
    public final void mo12598a(C2538ao c2538ao) {
        if (this.f15340n != null) {
            return;
        }
        boolean z = c2538ao.m12868d() != null;
        C2524aa c2524aaM12867c = c2538ao.m12867c();
        ArrayList arrayList = new ArrayList(c2524aaM12867c.m12787a() + 4);
        arrayList.add(new C2483c(C2483c.f15296c, c2538ao.m12866b()));
        arrayList.add(new C2483c(C2483c.f15297d, C2456j.m12620a(c2538ao.m12864a())));
        String strM12865a = c2538ao.m12865a(HttpHeaders.HOST);
        if (strM12865a != null) {
            arrayList.add(new C2483c(C2483c.f15299f, strM12865a));
        }
        arrayList.add(new C2483c(C2483c.f15298e, c2538ao.m12864a().m12811b()));
        int iM12787a = c2524aaM12867c.m12787a();
        for (int i = 0; i < iM12787a; i++) {
            C2582i c2582iM13041a = C2582i.m13041a(c2524aaM12867c.m12788a(i).toLowerCase(Locale.US));
            if (!f15335j.contains(c2582iM13041a)) {
                arrayList.add(new C2483c(c2582iM13041a, c2524aaM12867c.m12791b(i)));
            }
        }
        C2470ab c2470abM12725a = this.f15339m.m12725a(arrayList, z);
        this.f15340n = c2470abM12725a;
        C2473ae c2473ae = c2470abM12725a.f15245f;
        long jM12839b = this.f15338l.m12839b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c2473ae.mo13061a(jM12839b, timeUnit);
        this.f15340n.f15246g.mo13061a(this.f15338l.m12840c(), timeUnit);
    }

    @Override // com.p188b.p189a.p190a.p193c.InterfaceC2449c
    /* JADX INFO: renamed from: b */
    public final void mo12599b() {
        this.f15340n.m12653e().close();
    }
}
