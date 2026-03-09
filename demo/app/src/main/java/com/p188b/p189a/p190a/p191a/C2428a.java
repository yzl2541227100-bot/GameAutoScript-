package com.p188b.p189a.p190a.p191a;

import com.anythink.expressad.foundation.p120g.p126f.p133g.C1849b;
import com.github.kevinsawicki.http.HttpRequest;
import com.p188b.p189a.AbstractC2544au;
import com.p188b.p189a.C2524aa;
import com.p188b.p189a.C2525ab;
import com.p188b.p189a.C2538ao;
import com.p188b.p189a.C2542as;
import com.p188b.p189a.C2543at;
import com.p188b.p189a.EnumC2535al;
import com.p188b.p189a.InterfaceC2529af;
import com.p188b.p189a.InterfaceC2530ag;
import com.p188b.p189a.p190a.AbstractC2427a;
import com.p188b.p189a.p190a.C2446c;
import com.p188b.p189a.p190a.p193c.C2452f;
import com.p188b.p189a.p190a.p193c.C2455i;
import com.p188b.p199b.C2587n;
import com.p188b.p199b.InterfaceC2596w;
import p285z2.o000000O;

/* JADX INFO: renamed from: com.b.a.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2428a implements InterfaceC2529af {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2436i f15088a;

    public C2428a(InterfaceC2436i interfaceC2436i) {
        this.f15088a = interfaceC2436i;
    }

    /* JADX INFO: renamed from: a */
    private static C2542as m12510a(C2542as c2542as) {
        return (c2542as == null || c2542as.m12889e() == null) ? c2542as : c2542as.m12890f().m12902a((AbstractC2544au) null).m12895a();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m12511a(String str) {
        return ("Connection".equalsIgnoreCase(str) || C1849b.f11404c.equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || HttpRequest.HEADER_PROXY_AUTHORIZATION.equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    @Override // com.p188b.p189a.InterfaceC2529af
    /* JADX INFO: renamed from: a */
    public final C2542as mo12512a(InterfaceC2530ag interfaceC2530ag) {
        InterfaceC2596w interfaceC2596wM12515a;
        C2543at c2543atM12907b;
        InterfaceC2436i interfaceC2436i = this.f15088a;
        InterfaceC2430c interfaceC2430cM12527b = null;
        C2542as c2542asM12526a = interfaceC2436i != null ? interfaceC2436i.m12526a() : null;
        C2431d c2431dM12517a = new C2432e(System.currentTimeMillis(), interfaceC2530ag.mo12612a(), c2542asM12526a).m12517a();
        C2538ao c2538ao = c2431dM12517a.f15094a;
        C2542as c2542as = c2431dM12517a.f15095b;
        if (c2542asM12526a != null && c2542as == null) {
            C2446c.m12582a(c2542asM12526a.m12889e());
        }
        if (c2538ao == null && c2542as == null) {
            c2543atM12907b = new C2543at().m12900a(interfaceC2530ag.mo12612a()).m12899a(EnumC2535al.HTTP_1_1).m12896a(504).m12904a("Unsatisfiable Request (only-if-cached)").m12902a(C2446c.f15177c).m12897a(-1L).m12906b(System.currentTimeMillis());
        } else {
            if (c2538ao != null) {
                try {
                    C2542as c2542asMo12613a = interfaceC2530ag.mo12613a(c2538ao);
                    if (c2542asMo12613a == null && c2542asM12526a != null) {
                    }
                    if (c2542as != null) {
                        if (c2542asMo12613a.m12886b() == 304) {
                            C2543at c2543atM12890f = c2542as.m12890f();
                            C2524aa c2524aaM12888d = c2542as.m12888d();
                            C2524aa c2524aaM12888d2 = c2542asMo12613a.m12888d();
                            C2525ab c2525ab = new C2525ab();
                            int iM12787a = c2524aaM12888d.m12787a();
                            for (int i = 0; i < iM12787a; i++) {
                                String strM12788a = c2524aaM12888d.m12788a(i);
                                String strM12791b = c2524aaM12888d.m12791b(i);
                                if ((!"Warning".equalsIgnoreCase(strM12788a) || !strM12791b.startsWith("1")) && (!m12511a(strM12788a) || c2524aaM12888d2.m12789a(strM12788a) == null)) {
                                    AbstractC2427a.f15087a.mo12505a(c2525ab, strM12788a, strM12791b);
                                }
                            }
                            int iM12787a2 = c2524aaM12888d2.m12787a();
                            for (int i2 = 0; i2 < iM12787a2; i2++) {
                                String strM12788a2 = c2524aaM12888d2.m12788a(i2);
                                if (!"Content-Length".equalsIgnoreCase(strM12788a2) && m12511a(strM12788a2)) {
                                    AbstractC2427a.f15087a.mo12505a(c2525ab, strM12788a2, c2524aaM12888d2.m12791b(i2));
                                }
                            }
                            C2542as c2542asM12895a = c2543atM12890f.m12898a(c2525ab.m12793a()).m12897a(c2542asMo12613a.m12892h()).m12906b(c2542asMo12613a.m12893i()).m12907b(m12510a(c2542as)).m12901a(m12510a(c2542asMo12613a)).m12895a();
                            c2542asMo12613a.m12889e().close();
                            return c2542asM12895a;
                        }
                        C2446c.m12582a(c2542as.m12889e());
                    }
                    C2542as c2542asM12895a2 = c2542asMo12613a.m12890f().m12907b(m12510a(c2542as)).m12901a(m12510a(c2542asMo12613a)).m12895a();
                    if (!C2452f.m12609b(c2542asM12895a2)) {
                        return c2542asM12895a2;
                    }
                    C2538ao c2538aoM12884a = c2542asMo12613a.m12884a();
                    InterfaceC2436i interfaceC2436i2 = this.f15088a;
                    if (interfaceC2436i2 != null) {
                        if (C2431d.m12516a(c2542asM12895a2, c2538aoM12884a)) {
                            interfaceC2430cM12527b = interfaceC2436i2.m12527b();
                        } else {
                            String strM12866b = c2538aoM12884a.m12866b();
                            if (!strM12866b.equals("POST") && !strM12866b.equals(o000000O.OooO00o.OooO00o) && !strM12866b.equals(HttpRequest.METHOD_PUT) && !strM12866b.equals(HttpRequest.METHOD_DELETE)) {
                                strM12866b.equals("MOVE");
                            }
                        }
                    }
                    return (interfaceC2430cM12527b == null || (interfaceC2596wM12515a = interfaceC2430cM12527b.m12515a()) == null) ? c2542asM12895a2 : c2542asM12895a2.m12890f().m12902a(new C2455i(c2542asM12895a2.m12888d(), C2587n.m13072a(new C2429b(this, c2542asM12895a2.m12889e().mo12619c(), interfaceC2430cM12527b, C2587n.m13071a(interfaceC2596wM12515a))))).m12895a();
                } finally {
                    if (c2542asM12526a != null) {
                        C2446c.m12582a(c2542asM12526a.m12889e());
                    }
                }
            }
            c2543atM12907b = c2542as.m12890f().m12907b(m12510a(c2542as));
        }
        return c2543atM12907b.m12895a();
    }
}
