package com.p188b.p189a.p190a.p193c;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.anythink.expressad.foundation.p120g.p126f.p133g.C1849b;
import com.github.kevinsawicki.http.HttpRequest;
import com.p188b.p189a.AbstractC2540aq;
import com.p188b.p189a.C2524aa;
import com.p188b.p189a.C2531ah;
import com.p188b.p189a.C2538ao;
import com.p188b.p189a.C2539ap;
import com.p188b.p189a.C2542as;
import com.p188b.p189a.C2543at;
import com.p188b.p189a.C2564r;
import com.p188b.p189a.InterfaceC2529af;
import com.p188b.p189a.InterfaceC2530ag;
import com.p188b.p189a.InterfaceC2565s;
import com.p188b.p189a.p190a.C2446c;
import com.p188b.p199b.C2585l;
import com.p188b.p199b.C2587n;
import java.util.List;

/* JADX INFO: renamed from: com.b.a.a.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2447a implements InterfaceC2529af {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2565s f15191a;

    public C2447a(InterfaceC2565s interfaceC2565s) {
        this.f15191a = interfaceC2565s;
    }

    @Override // com.p188b.p189a.InterfaceC2529af
    /* JADX INFO: renamed from: a */
    public final C2542as mo12512a(InterfaceC2530ag interfaceC2530ag) {
        boolean z;
        C2538ao c2538aoMo12612a = interfaceC2530ag.mo12612a();
        C2539ap c2539apM12869e = c2538aoMo12612a.m12869e();
        AbstractC2540aq abstractC2540aqM12868d = c2538aoMo12612a.m12868d();
        if (abstractC2540aqM12868d != null) {
            C2531ah c2531ahMo12881a = abstractC2540aqM12868d.mo12881a();
            if (c2531ahMo12881a != null) {
                c2539apM12869e.m12878a("Content-Type", c2531ahMo12881a.toString());
            }
            long jMo12883b = abstractC2540aqM12868d.mo12883b();
            if (jMo12883b != -1) {
                c2539apM12869e.m12878a("Content-Length", Long.toString(jMo12883b));
                c2539apM12869e.m12879b("Transfer-Encoding");
            } else {
                c2539apM12869e.m12878a("Transfer-Encoding", "chunked");
                c2539apM12869e.m12879b("Content-Length");
            }
        }
        if (c2538aoMo12612a.m12865a(HttpHeaders.HOST) == null) {
            c2539apM12869e.m12878a(HttpHeaders.HOST, C2446c.m12574a(c2538aoMo12612a.m12864a(), false));
        }
        if (c2538aoMo12612a.m12865a("Connection") == null) {
            c2539apM12869e.m12878a("Connection", C1849b.f11404c);
        }
        if (c2538aoMo12612a.m12865a(HttpRequest.HEADER_ACCEPT_ENCODING) == null && c2538aoMo12612a.m12865a(HttpHeaders.RANGE) == null) {
            c2539apM12869e.m12878a(HttpRequest.HEADER_ACCEPT_ENCODING, "gzip");
            z = true;
        } else {
            z = false;
        }
        List<C2564r> listMo12957b = this.f15191a.mo12957b();
        if (!listMo12957b.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = listMo12957b.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C2564r c2564r = listMo12957b.get(i);
                sb.append(c2564r.m12954a());
                sb.append('=');
                sb.append(c2564r.m12955b());
            }
            c2539apM12869e.m12878a("Cookie", sb.toString());
        }
        if (c2538aoMo12612a.m12865a("User-Agent") == null) {
            c2539apM12869e.m12878a("User-Agent", "okhttp/3.6.0");
        }
        C2542as c2542asMo12613a = interfaceC2530ag.mo12613a(c2539apM12869e.m12872a());
        C2452f.m12607a(this.f15191a, c2538aoMo12612a.m12864a(), c2542asMo12613a.m12888d());
        C2543at c2543atM12900a = c2542asMo12613a.m12890f().m12900a(c2538aoMo12612a);
        if (z && "gzip".equalsIgnoreCase(c2542asMo12613a.m12885a("Content-Encoding")) && C2452f.m12609b(c2542asMo12613a)) {
            C2585l c2585l = new C2585l(c2542asMo12613a.m12889e().mo12619c());
            C2524aa c2524aaM12793a = c2542asMo12613a.m12888d().m12790b().m12794a("Content-Encoding").m12794a("Content-Length").m12793a();
            c2543atM12900a.m12898a(c2524aaM12793a);
            c2543atM12900a.m12902a(new C2455i(c2524aaM12793a, C2587n.m13072a(c2585l)));
        }
        return c2543atM12900a.m12895a();
    }
}
