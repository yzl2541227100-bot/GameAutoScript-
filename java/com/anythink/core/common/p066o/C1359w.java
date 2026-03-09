package com.anythink.core.common.p066o;

import com.anythink.core.common.C1148a;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1230aw;
import com.anythink.core.common.p055f.C1233az;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.p038b.C1111f;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.o.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1359w {
    /* JADX INFO: renamed from: a */
    public static List<C1233az.a> m4259a(String str, C1229av c1229av) {
        C1230aw c1230awM1910a;
        if (c1229av == null || (c1230awM1910a = C1148a.m1904a().m1910a(str, c1229av)) == null) {
            return null;
        }
        List<C1233az.a> listM2980f = c1230awM1910a.m2856a((C1252q) null).m2980f();
        C1252q c1252qM1712a = C1111f.m1708a().m1712a(str, c1229av);
        if (c1252qM1712a != null && !c1252qM1712a.m3411a()) {
            if (listM2980f == null) {
                listM2980f = new ArrayList<>();
            }
            listM2980f.add(new C1233az.a(c1229av, c1252qM1712a));
        }
        return listM2980f;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4260a(C1229av c1229av) {
        return c1229av.m2784d() == 15 && !c1229av.m2821k();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4261a(List<C1229av> list) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1229av c1229av = list.get(i);
                if (c1229av != null && c1229av.m2748aa()) {
                    return true;
                }
            }
        }
        return false;
    }
}
