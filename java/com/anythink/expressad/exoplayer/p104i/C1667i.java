package com.anythink.expressad.exoplayer.p104i;

import com.anythink.expressad.exoplayer.C1495aa;
import com.anythink.expressad.exoplayer.p107k.C1717af;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1667i {

    /* JADX INFO: renamed from: a */
    public final int f9232a;

    /* JADX INFO: renamed from: b */
    public final C1495aa[] f9233b;

    /* JADX INFO: renamed from: c */
    public final C1665g f9234c;

    /* JADX INFO: renamed from: d */
    public final Object f9235d;

    public C1667i(C1495aa[] c1495aaArr, InterfaceC1664f[] interfaceC1664fArr, Object obj) {
        this.f9233b = c1495aaArr;
        this.f9234c = new C1665g(interfaceC1664fArr);
        this.f9235d = obj;
        this.f9232a = c1495aaArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7692a(int i) {
        return this.f9233b[i] != null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7693a(C1667i c1667i) {
        if (c1667i == null || c1667i.f9234c.f9228a != this.f9234c.f9228a) {
            return false;
        }
        for (int i = 0; i < this.f9234c.f9228a; i++) {
            if (!m7694a(c1667i, i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7694a(C1667i c1667i, int i) {
        return c1667i != null && C1717af.m8085a(this.f9233b[i], c1667i.f9233b[i]) && C1717af.m8085a(this.f9234c.m7687a(i), c1667i.f9234c.m7687a(i));
    }
}
