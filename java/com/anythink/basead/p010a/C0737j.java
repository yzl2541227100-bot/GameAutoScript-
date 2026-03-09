package com.anythink.basead.p010a;

import android.content.Context;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.p067a.C1329c;
import com.anythink.core.common.p066o.p067a.C1332f;

/* JADX INFO: renamed from: com.anythink.basead.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0737j {

    /* JADX INFO: renamed from: a */
    private static volatile C0737j f602a;

    /* JADX INFO: renamed from: b */
    private Context f603b = C1175n.m2059a().m2148f();

    /* JADX INFO: renamed from: c */
    private C1329c f604c = new C1329c(50);

    /* JADX INFO: renamed from: d */
    private C1332f.b f605d = new C1332f.b();

    private C0737j() {
    }

    /* JADX INFO: renamed from: a */
    public static C0737j m274a() {
        if (f602a == null) {
            synchronized (C0734g.class) {
                if (f602a == null) {
                    f602a = new C0737j();
                }
            }
        }
        return f602a;
    }

    /* JADX INFO: renamed from: b */
    public final C1329c m275b() {
        return this.f604c;
    }

    /* JADX INFO: renamed from: c */
    public final C1332f.b m276c() {
        return this.f605d;
    }
}
