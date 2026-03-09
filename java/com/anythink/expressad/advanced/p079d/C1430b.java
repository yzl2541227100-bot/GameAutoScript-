package com.anythink.expressad.advanced.p079d;

import com.anythink.expressad.advanced.p077b.InterfaceC1423a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.out.InterfaceC1940o;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.anythink.expressad.advanced.d.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1430b implements InterfaceC1423a {

    /* JADX INFO: renamed from: a */
    private InterfaceC1940o f6542a;

    /* JADX INFO: renamed from: b */
    private C1431c f6543b;

    public C1430b(C1431c c1431c) {
        this.f6543b = c1431c;
    }

    /* JADX INFO: renamed from: a */
    private static void m5514a() {
    }

    /* JADX INFO: renamed from: b */
    private void m5515b() {
        if (this.f6542a != null) {
            this.f6542a = null;
        }
        if (this.f6543b != null) {
            this.f6543b = null;
        }
    }

    @Override // com.anythink.expressad.advanced.p077b.InterfaceC1423a
    /* JADX INFO: renamed from: a */
    public final void mo5406a(C1781c c1781c, int i) {
        C1431c c1431c;
        C1431c c1431c2 = this.f6543b;
        if (c1431c2 == null || !c1431c2.m5542a() || c1781c == null) {
            return;
        }
        InterfaceC1940o interfaceC1940o = this.f6542a;
        if (interfaceC1940o != null && this.f6543b != null) {
            interfaceC1940o.mo383a();
        }
        this.f6543b.m5543b();
        new ArrayList().add(c1781c);
        if (i != 2 || (c1431c = this.f6543b) == null) {
            return;
        }
        c1431c.m5539a(c1781c, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m5516a(InterfaceC1940o interfaceC1940o) {
        this.f6542a = interfaceC1940o;
    }

    @Override // com.anythink.expressad.advanced.p077b.InterfaceC1423a
    /* JADX INFO: renamed from: a */
    public final void mo5407a(String str, int i) {
        StringBuilder sb = new StringBuilder("onLoadFailed: ");
        sb.append(i);
        sb.append(str);
        C1431c c1431c = this.f6543b;
        if (c1431c == null || !c1431c.m5542a()) {
            return;
        }
        InterfaceC1940o interfaceC1940o = this.f6542a;
        if (interfaceC1940o != null) {
            interfaceC1940o.mo385a(str);
        }
        this.f6543b.m5543b();
    }
}
