package com.anythink.core.common.p050a;

import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p052c.C1182c;
import com.anythink.core.common.p052c.C1184e;
import com.anythink.core.common.p052c.C1185f;
import com.anythink.core.common.p055f.C1245j;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C1152d {

    /* JADX INFO: renamed from: b */
    private static volatile C1152d f2939b;

    /* JADX INFO: renamed from: a */
    public final String f2940a = C1152d.class.getName();

    /* JADX INFO: renamed from: c */
    private C1185f f2941c;

    /* JADX INFO: renamed from: d */
    private C1184e f2942d;

    private C1152d() {
        if (C1175n.m2059a().m2148f() != null) {
            this.f2941c = C1185f.m2232a(C1182c.m2210a(C1175n.m2059a().m2148f()));
            this.f2942d = C1184e.m2226a(C1182c.m2210a(C1175n.m2059a().m2148f()));
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1152d m1954a() {
        if (f2939b == null) {
            synchronized (C1152d.class) {
                if (f2939b == null) {
                    f2939b = new C1152d();
                }
            }
        }
        return f2939b;
    }

    /* JADX INFO: renamed from: a */
    public final List<C1154f> m1957a(int i) {
        return this.f2941c.m2235a(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m1958a(final C1245j c1245j) {
        new StringBuilder("insertDspOfferShowRecord dspOfferId:").append(c1245j.m2486ae());
        C1175n.m2059a();
        C1175n.m2076c(new Runnable() { // from class: com.anythink.core.common.a.d.1
            @Override // java.lang.Runnable
            public final void run() {
                C1156h c1156h = new C1156h();
                c1156h.f2950a = c1245j.m2485ad();
                c1156h.f2951b = c1245j.m2486ae();
                c1156h.f2953c = c1245j.m2487af();
                c1156h.f2954d = 0;
                C1152d.this.f2941c.m2234a(c1156h);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final List<C1154f> m1959b(int i) {
        return this.f2942d.m2230a(i);
    }

    /* JADX INFO: renamed from: b */
    public final void m1960b() {
        C1175n.m2059a();
        C1175n.m2076c(new Runnable() { // from class: com.anythink.core.common.a.d.3
            @Override // java.lang.Runnable
            public final void run() {
                C1152d.this.f2941c.m2237c();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m1961b(final C1245j c1245j) {
        new StringBuilder("updateDspOfferShowRecord dspOfferId:").append(c1245j.m2486ae());
        C1175n.m2059a();
        C1175n.m2076c(new Runnable() { // from class: com.anythink.core.common.a.d.2
            @Override // java.lang.Runnable
            public final void run() {
                C1156h c1156h = new C1156h();
                c1156h.f2950a = c1245j.m2485ad();
                c1156h.f2951b = c1245j.m2486ae();
                c1156h.f2953c = c1245j.m2487af();
                c1156h.f2954d = 1;
                C1152d.this.f2941c.m2236b(c1156h);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m1962c(final C1245j c1245j) {
        if (c1245j.m2488ag() != 1) {
            StringBuilder sb = new StringBuilder("adxOffer.getDspInstallIdUploadSwitch() = ");
            sb.append(c1245j.m2488ag());
            sb.append(",not need to record install");
        } else if (c1245j.m3169H() == 1 || c1245j.m3169H() == 4) {
            C1175n.m2059a();
            C1175n.m2076c(new Runnable() { // from class: com.anythink.core.common.a.d.4
                @Override // java.lang.Runnable
                public final void run() {
                    new StringBuilder("insertDspOfferInstallRecord dspOfferId:").append(c1245j.m2486ae());
                    C1155g c1155g = new C1155g();
                    c1155g.f2950a = c1245j.m2485ad();
                    c1155g.f2951b = c1245j.m2486ae();
                    c1155g.f2952c = c1245j.m3167F();
                    C1152d.this.f2942d.m2229a(c1155g);
                }
            });
        } else {
            StringBuilder sb2 = new StringBuilder("adxOffer.getClickType = ");
            sb2.append(c1245j.m3169H());
            sb2.append(",not need to record install");
        }
    }
}
