package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.p193c.InterfaceC2449c;
import com.p188b.p199b.AbstractC2583j;
import com.p188b.p199b.InterfaceC2597x;

/* JADX INFO: renamed from: com.b.a.a.e.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2489i extends AbstractC2583j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2488h f15341a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2489i(C2488h c2488h, InterfaceC2597x interfaceC2597x) {
        super(interfaceC2597x);
        this.f15341a = c2488h;
    }

    @Override // com.p188b.p199b.AbstractC2583j, com.p188b.p199b.InterfaceC2597x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C2488h c2488h = this.f15341a;
        c2488h.f15337a.m12564a(false, (InterfaceC2449c) c2488h);
        super.close();
    }
}
