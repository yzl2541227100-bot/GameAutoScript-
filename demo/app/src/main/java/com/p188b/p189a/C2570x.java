package com.p188b.p189a;

import com.p188b.p189a.p190a.C2446c;
import com.p188b.p199b.C2579f;
import com.p188b.p199b.InterfaceC2580g;
import java.util.List;

/* JADX INFO: renamed from: com.b.a.x */
/* JADX INFO: loaded from: classes.dex */
public final class C2570x extends AbstractC2540aq {

    /* JADX INFO: renamed from: a */
    private static final C2531ah f15796a = C2531ah.m12833a("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: b */
    private final List<String> f15797b;

    /* JADX INFO: renamed from: c */
    private final List<String> f15798c;

    public C2570x(List<String> list, List<String> list2) {
        this.f15797b = C2446c.m12578a(list);
        this.f15798c = C2446c.m12578a(list2);
    }

    /* JADX INFO: renamed from: a */
    private long m12968a(InterfaceC2580g interfaceC2580g, boolean z) {
        C2579f c2579f = z ? new C2579f() : interfaceC2580g.mo13012c();
        int size = this.f15797b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c2579f.mo13028h(38);
            }
            c2579f.mo13008b(this.f15797b.get(i));
            c2579f.mo13028h(61);
            c2579f.mo13008b(this.f15798c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long jM13006b = c2579f.m13006b();
        c2579f.m13038o();
        return jM13006b;
    }

    @Override // com.p188b.p189a.AbstractC2540aq
    /* JADX INFO: renamed from: a */
    public final C2531ah mo12881a() {
        return f15796a;
    }

    @Override // com.p188b.p189a.AbstractC2540aq
    /* JADX INFO: renamed from: a */
    public final void mo12882a(InterfaceC2580g interfaceC2580g) {
        m12968a(interfaceC2580g, false);
    }

    @Override // com.p188b.p189a.AbstractC2540aq
    /* JADX INFO: renamed from: b */
    public final long mo12883b() {
        return m12968a(null, true);
    }
}
