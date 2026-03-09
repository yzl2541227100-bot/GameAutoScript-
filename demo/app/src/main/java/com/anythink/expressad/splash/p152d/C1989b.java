package com.anythink.expressad.splash.p152d;

import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.out.InterfaceC1929d;
import com.anythink.expressad.splash.p150b.InterfaceC1981c;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.anythink.expressad.splash.d.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1989b implements InterfaceC1981c {

    /* JADX INFO: renamed from: a */
    private InterfaceC1929d f12614a;

    /* JADX INFO: renamed from: b */
    private C1990c f12615b;

    /* JADX INFO: renamed from: c */
    private String f12616c;

    /* JADX INFO: renamed from: d */
    private String f12617d;

    public C1989b(C1990c c1990c) {
        this.f12615b = c1990c;
    }

    /* JADX INFO: renamed from: a */
    private void m10683a() {
        if (this.f12614a != null) {
            this.f12614a = null;
        }
    }

    @Override // com.anythink.expressad.splash.p150b.InterfaceC1981c
    /* JADX INFO: renamed from: a */
    public final void mo10539a(C1781c c1781c, int i) {
        C1990c c1990c;
        C1990c c1990c2 = this.f12615b;
        if (c1990c2 == null || !c1990c2.m10709a() || c1781c == null) {
            return;
        }
        InterfaceC1929d interfaceC1929d = this.f12614a;
        if (interfaceC1929d != null) {
            interfaceC1929d.mo370a();
            c1781c.m8909t();
        }
        this.f12615b.m10710b();
        new ArrayList().add(c1781c);
        if (i != 2 || (c1990c = this.f12615b) == null) {
            return;
        }
        c1990c.m10704a(c1781c, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m10684a(InterfaceC1929d interfaceC1929d) {
        this.f12614a = interfaceC1929d;
    }

    @Override // com.anythink.expressad.splash.p150b.InterfaceC1981c
    /* JADX INFO: renamed from: a */
    public final void mo10540a(String str) {
        C1990c c1990c = this.f12615b;
        if (c1990c == null || !c1990c.m10709a()) {
            return;
        }
        InterfaceC1929d interfaceC1929d = this.f12614a;
        if (interfaceC1929d != null) {
            interfaceC1929d.mo371a(str);
        }
        this.f12615b.m10710b();
    }

    /* JADX INFO: renamed from: b */
    public final void m10685b(String str) {
        this.f12617d = str;
    }
}
