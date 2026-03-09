package com.anythink.expressad.mbbanner.p139a.p142c;

import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.p086d.C1489c;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.c.e */
/* JADX INFO: loaded from: classes.dex */
public class C1912e implements InterfaceC1910c {

    /* JADX INFO: renamed from: a */
    private static final String f11766a = "e";

    /* JADX INFO: renamed from: b */
    private InterfaceC1910c f11767b;

    /* JADX INFO: renamed from: c */
    private C1489c f11768c;

    /* JADX INFO: renamed from: d */
    private boolean f11769d = false;

    public C1912e(InterfaceC1910c interfaceC1910c, C1489c c1489c) {
        this.f11768c = c1489c;
        this.f11767b = interfaceC1910c;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m9973a(C1489c c1489c, boolean z) {
        if (z || c1489c == null || c1489c.m6088a() == 1.0d) {
            return false;
        }
        return new Random().nextDouble() > c1489c.m6088a();
    }

    @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
    /* JADX INFO: renamed from: a */
    public final void mo9963a() {
        InterfaceC1910c interfaceC1910c = this.f11767b;
        if (interfaceC1910c != null) {
            interfaceC1910c.mo9963a();
        }
    }

    @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
    /* JADX INFO: renamed from: a */
    public final void mo9964a(C1781c c1781c) {
        InterfaceC1910c interfaceC1910c = this.f11767b;
        if (interfaceC1910c == null || this.f11769d) {
            return;
        }
        interfaceC1910c.mo9964a(c1781c);
    }

    @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
    /* JADX INFO: renamed from: a */
    public final void mo9965a(C1781c c1781c, boolean z) {
        InterfaceC1910c interfaceC1910c = this.f11767b;
        if (interfaceC1910c != null) {
            interfaceC1910c.mo9965a(c1781c, this.f11769d);
        }
    }

    @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
    /* JADX INFO: renamed from: a */
    public final void mo9966a(String str) {
        InterfaceC1910c interfaceC1910c = this.f11767b;
        if (interfaceC1910c != null) {
            interfaceC1910c.mo9966a(str);
        }
    }

    @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
    /* JADX INFO: renamed from: a */
    public final void mo9967a(List<C1781c> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    C1489c c1489c = this.f11768c;
                    boolean z = false;
                    if (!list.get(0).m8793A() && c1489c != null && c1489c.m6088a() != 1.0d) {
                        if (new Random().nextDouble() > c1489c.m6088a()) {
                            z = true;
                        }
                    }
                    this.f11769d = z;
                    new StringBuilder().append(this.f11769d);
                }
            } catch (Exception unused) {
            }
        }
        InterfaceC1910c interfaceC1910c = this.f11767b;
        if (interfaceC1910c != null) {
            interfaceC1910c.mo9967a(list);
        }
    }

    @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
    /* JADX INFO: renamed from: a */
    public final void mo9968a(boolean z) {
        InterfaceC1910c interfaceC1910c = this.f11767b;
        if (interfaceC1910c != null) {
            interfaceC1910c.mo9968a(z);
        }
    }

    @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
    /* JADX INFO: renamed from: b */
    public final void mo9969b() {
        InterfaceC1910c interfaceC1910c = this.f11767b;
        if (interfaceC1910c != null) {
            interfaceC1910c.mo9969b();
        }
    }

    @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
    /* JADX INFO: renamed from: c */
    public final void mo9970c() {
        InterfaceC1910c interfaceC1910c = this.f11767b;
        if (interfaceC1910c != null) {
            interfaceC1910c.mo9970c();
        }
    }

    @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
    /* JADX INFO: renamed from: d */
    public final void mo9971d() {
        InterfaceC1910c interfaceC1910c = this.f11767b;
        if (interfaceC1910c != null) {
            interfaceC1910c.mo9971d();
        }
    }
}
