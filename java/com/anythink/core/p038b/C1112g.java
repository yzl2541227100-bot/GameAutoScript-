package com.anythink.core.p038b;

import com.anythink.core.common.p055f.C1202a;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.p038b.p039a.C1099a;
import com.anythink.core.p038b.p039a.C1100b;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1112g extends AbstractC1110e {
    public C1112g(C1202a c1202a) {
        super(c1202a);
    }

    @Override // com.anythink.core.p038b.AbstractC1110e
    /* JADX INFO: renamed from: a */
    public final void mo1636a(List<JSONObject> list, InterfaceC1283k interfaceC1283k) {
        C1100b c1100b = new C1100b();
        c1100b.f2594f = this.f2638f.f3690n.m2916a().m5062aD();
        C1099a c1099a = new C1099a(this.f2668p, this.f2667o, this.f2666n, list, 1, this.f2638f.f3690n.m2916a());
        c1099a.m1609a(c1100b);
        c1099a.mo3639a(0, interfaceC1283k);
    }

    @Override // com.anythink.core.p038b.AbstractC1110e
    /* JADX INFO: renamed from: b */
    public final String mo1638b() {
        return this.f2638f.f3692p;
    }
}
