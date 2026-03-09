package com.anythink.core.common;

import android.content.Context;
import android.os.Handler;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1259x;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1311m<T extends AbstractC1259x> {

    /* JADX INFO: renamed from: d */
    public Context f5002d;

    /* JADX INFO: renamed from: a */
    public final String f4999a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b */
    public ArrayList<T> f5000b = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public Runnable f5004f = new Runnable() { // from class: com.anythink.core.common.m.1
        @Override // java.lang.Runnable
        public final void run() {
            AbstractC1311m.this.m3796a(true);
        }
    };

    /* JADX INFO: renamed from: c */
    public String f5001c = C1175n.m2059a().m2165o();

    /* JADX INFO: renamed from: e */
    public Handler f5003e = C1335b.m3998a().m4003a(9);

    public AbstractC1311m(Context context) {
        this.f5002d = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m3796a(boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f5000b);
            if (arrayList.size() > 0) {
                mo3798a(arrayList);
            }
            this.f5000b.clear();
        } else {
            C1391a c1391aM4865b = C1392b.m4845a(this.f5002d).m4865b(this.f5001c);
            ArrayList arrayList2 = new ArrayList();
            if (this.f5000b.size() >= c1391aM4865b.m4736ac()) {
                for (int iM4736ac = c1391aM4865b.m4736ac() - 1; iM4736ac >= 0; iM4736ac--) {
                    arrayList2.add(this.f5000b.get(iM4736ac));
                    this.f5000b.remove(iM4736ac);
                }
                if (arrayList2.size() > 0) {
                    mo3798a(arrayList2);
                }
            }
        }
        if (this.f5000b.isEmpty()) {
            this.f5003e.removeCallbacks(this.f5004f);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3797a(T t, boolean z) {
        boolean z3 = true;
        if (z) {
            this.f5000b.add(t);
            m3796a(true);
            return;
        }
        C1391a c1391aM4865b = C1392b.m4845a(this.f5002d).m4865b(this.f5001c);
        if (!this.f5000b.isEmpty()) {
            z3 = false;
        } else if (c1391aM4865b.m4738ae() > 0) {
            this.f5003e.removeCallbacks(this.f5004f);
            this.f5003e.postDelayed(this.f5004f, c1391aM4865b.m4738ae());
            z3 = false;
        }
        this.f5000b.add(t);
        m3796a(z3);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3798a(List<T> list);
}
