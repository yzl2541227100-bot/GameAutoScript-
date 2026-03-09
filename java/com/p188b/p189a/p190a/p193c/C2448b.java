package com.p188b.p189a.p190a.p193c;

import com.anythink.expressad.foundation.p116d.C1781c;
import com.p188b.p189a.C2538ao;
import com.p188b.p189a.C2542as;
import com.p188b.p189a.C2543at;
import com.p188b.p189a.InterfaceC2529af;
import com.p188b.p189a.InterfaceC2530ag;
import com.p188b.p189a.p190a.C2446c;
import com.p188b.p189a.p190a.p192b.C2444g;
import com.p188b.p199b.C2587n;
import com.p188b.p199b.InterfaceC2580g;
import java.net.ProtocolException;

/* JADX INFO: renamed from: com.b.a.a.c.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2448b implements InterfaceC2529af {

    /* JADX INFO: renamed from: a */
    private final boolean f15192a;

    public C2448b(boolean z) {
        this.f15192a = z;
    }

    @Override // com.p188b.p189a.InterfaceC2529af
    /* JADX INFO: renamed from: a */
    public final C2542as mo12512a(InterfaceC2530ag interfaceC2530ag) throws ProtocolException {
        C2454h c2454h = (C2454h) interfaceC2530ag;
        InterfaceC2449c interfaceC2449cM12616c = c2454h.m12616c();
        C2444g c2444gM12615b = c2454h.m12615b();
        C2538ao c2538aoMo12612a = interfaceC2530ag.mo12612a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        interfaceC2449cM12616c.mo12598a(c2538aoMo12612a);
        C2543at c2543atMo12594a = null;
        if (C2453g.m12611b(c2538aoMo12612a.m12866b()) && c2538aoMo12612a.m12868d() != null) {
            if ("100-continue".equalsIgnoreCase(c2538aoMo12612a.m12865a("Expect"))) {
                interfaceC2449cM12616c.mo12597a();
                c2543atMo12594a = interfaceC2449cM12616c.mo12594a(true);
            }
            if (c2543atMo12594a == null) {
                InterfaceC2580g interfaceC2580gM13071a = C2587n.m13071a(interfaceC2449cM12616c.mo12596a(c2538aoMo12612a, c2538aoMo12612a.m12868d().mo12883b()));
                c2538aoMo12612a.m12868d().mo12882a(interfaceC2580gM13071a);
                interfaceC2580gM13071a.close();
            }
        }
        interfaceC2449cM12616c.mo12599b();
        if (c2543atMo12594a == null) {
            c2543atMo12594a = interfaceC2449cM12616c.mo12594a(false);
        }
        C2542as c2542asM12895a = c2543atMo12594a.m12900a(c2538aoMo12612a).m12903a(c2444gM12615b.m12565b().m12541c()).m12897a(jCurrentTimeMillis).m12906b(System.currentTimeMillis()).m12895a();
        int iM12886b = c2542asM12895a.m12886b();
        C2542as c2542asM12895a2 = ((this.f15192a && iM12886b == 101) ? c2542asM12895a.m12890f().m12902a(C2446c.f15177c) : c2542asM12895a.m12890f().m12902a(interfaceC2449cM12616c.mo12595a(c2542asM12895a))).m12895a();
        if (C1781c.f10318cf.equalsIgnoreCase(c2542asM12895a2.m12884a().m12865a("Connection")) || C1781c.f10318cf.equalsIgnoreCase(c2542asM12895a2.m12885a("Connection"))) {
            c2444gM12615b.m12568d();
        }
        if ((iM12886b != 204 && iM12886b != 205) || c2542asM12895a2.m12889e().mo12618b() <= 0) {
            return c2542asM12895a2;
        }
        throw new ProtocolException("HTTP " + iM12886b + " had non-zero Content-Length: " + c2542asM12895a2.m12889e().mo12618b());
    }
}
