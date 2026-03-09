package com.anythink.core.common.p065n;

import android.content.Context;
import com.anythink.core.common.AbstractC1311m;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1246k;
import com.anythink.core.common.p058h.C1274b;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p058h.p059a.AbstractC1271c;
import com.anythink.core.common.p058h.p059a.C1269a;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.n.f */
/* JADX INFO: loaded from: classes.dex */
public class C1323f extends AbstractC1311m<C1246k> {

    /* JADX INFO: renamed from: g */
    private static volatile C1323f f5118g;

    private C1323f(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static C1323f m3938a(Context context) {
        if (f5118g == null) {
            synchronized (C1323f.class) {
                if (f5118g == null) {
                    f5118g = new C1323f(context);
                }
            }
        }
        return f5118g;
    }

    @Override // com.anythink.core.common.AbstractC1311m
    /* JADX INFO: renamed from: a */
    public final void mo3798a(List<C1246k> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<C1246k> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo3143a().toString());
        }
        C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
        if (c1391aM4865b == null) {
            C1274b c1274b = new C1274b(this.f5002d, 0, arrayList);
            c1274b.m3676p();
            c1274b.mo3639a(0, (InterfaceC1283k) null);
        } else if (c1391aM4865b.m4778w() != 1) {
            C1274b c1274b2 = new C1274b(this.f5002d, c1391aM4865b.m4778w(), arrayList);
            c1274b2.m3676p();
            c1274b2.mo3639a(0, (InterfaceC1283k) null);
        } else {
            C1269a c1269a = new C1269a(arrayList);
            c1269a.m3656a(1, c1391aM4865b.m4777v());
            c1269a.m3647a();
            c1269a.m3657a((AbstractC1271c.a) null);
        }
    }
}
