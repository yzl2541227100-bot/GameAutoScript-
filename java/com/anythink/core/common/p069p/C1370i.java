package com.anythink.core.common.p069p;

import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p066o.C1344h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.p.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1370i {

    /* JADX INFO: renamed from: a */
    private List<C1229av> f5450a;

    public C1370i(List<C1229av> list) {
        ArrayList arrayList = new ArrayList();
        this.f5450a = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4373a(int i, List<C1229av> list) {
        if (list != null && i < list.size()) {
            while (i < list.size()) {
                C1229av c1229av = list.get(i);
                if (c1229av != null) {
                    c1229av.m2703C(i);
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4374a(C1229av c1229av, int i, C1229av c1229av2) {
        C1252q c1252qM2719M;
        C1252q c1252qM2719M2;
        if (c1229av.m2821k() && (c1252qM2719M2 = c1229av.m2719M()) != null) {
            c1252qM2719M2.f4448q = c1229av2 != null ? C1344h.m4129a(c1229av2) : C1344h.m4129a(c1229av);
        }
        if (i > 0) {
            C1229av c1229av3 = this.f5450a.get(i - 1);
            if (!c1229av3.m2821k() || (c1252qM2719M = c1229av3.m2719M()) == null) {
                return;
            }
            c1252qM2719M.f4448q = C1344h.m4129a(c1229av);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized List<C1229av> m4375a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f5450a);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4376a(C1229av c1229av) {
        List<C1229av> list = this.f5450a;
        if (list != null) {
            if (list.size() == 0) {
                c1229av.m2703C(0);
                this.f5450a.add(c1229av);
                m4374a(c1229av, 0, null);
                return;
            }
            for (int i = 0; i < this.f5450a.size(); i++) {
                C1229av c1229av2 = this.f5450a.get(i);
                if (C1344h.m4129a(c1229av) > C1344h.m4129a(c1229av2)) {
                    c1229av.m2703C(i);
                    this.f5450a.add(i, c1229av);
                    m4374a(c1229av, i, c1229av2);
                    int i2 = i + 1;
                    List<C1229av> list2 = this.f5450a;
                    if (list2 != null && i2 < list2.size()) {
                        while (i2 < list2.size()) {
                            C1229av c1229av3 = list2.get(i2);
                            if (c1229av3 != null) {
                                c1229av3.m2703C(i2);
                            }
                            i2++;
                        }
                    }
                    return;
                }
            }
            c1229av.m2703C(this.f5450a.size());
            this.f5450a.add(c1229av);
            m4374a(c1229av, this.f5450a.size() - 1, null);
        }
    }
}
