package com.anythink.basead.p010a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.anythink.basead.C0716a;
import com.anythink.basead.p015c.C0749g;
import com.anythink.core.common.C1161b;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p057g.InterfaceC1264b;
import com.anythink.core.common.p064m.C1314c;
import com.anythink.core.common.p065n.C1322e;

/* JADX INFO: renamed from: com.anythink.basead.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0735h implements InterfaceC1264b {

    /* JADX INFO: renamed from: a */
    public C1314c f594a;

    /* JADX INFO: renamed from: b */
    public Context f595b = C1175n.m2059a().m2148f();

    @Override // com.anythink.core.common.p057g.InterfaceC1264b
    /* JADX INFO: renamed from: a */
    public final void mo264a(final AbstractC1247l abstractC1247l, final String str, final String str2, boolean z) {
        if (z) {
            C0717a.m129a(this.f595b, abstractC1247l);
            return;
        }
        AbstractC1249n abstractC1249nM3220o = abstractC1247l.m3220o();
        if (abstractC1249nM3220o == null) {
            return;
        }
        int iM3267L = abstractC1249nM3220o.m3267L();
        int iM3269M = abstractC1249nM3220o.m3269M();
        if (iM3267L != 1) {
            if (iM3267L != 3) {
                return;
            }
            C1161b.m2009a().m2011a("1", new C0749g(abstractC1247l, str2, str));
        } else {
            final C0716a c0716a = new C0716a() { // from class: com.anythink.basead.a.h.1
                @Override // com.anythink.basead.C0716a, android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                    super.onActivityPaused(activity);
                    C1314c c1314c = C0735h.this.f594a;
                    if (c1314c != null) {
                        c1314c.m3803b();
                    }
                }

                @Override // com.anythink.basead.C0716a, android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    super.onActivityResumed(activity);
                    C1314c c1314c = C0735h.this.f594a;
                    if (c1314c != null) {
                        c1314c.m3802a();
                    }
                }
            };
            this.f594a = new C1314c(iM3269M, new Runnable() { // from class: com.anythink.basead.a.h.2
                @Override // java.lang.Runnable
                public final void run() {
                    ((Application) C0735h.this.f595b).unregisterActivityLifecycleCallbacks(c0716a);
                    if (C0717a.m129a(C0735h.this.f595b, abstractC1247l)) {
                        C1322e.m3914a(str, abstractC1247l.m3229t(), str2, 6, (String) null, 0L, 0L);
                    }
                }
            });
            try {
                ((Application) this.f595b).registerActivityLifecycleCallbacks(c0716a);
            } catch (Exception unused) {
                C1322e.m3913a("Error", "Error, cannot registerActivityLifecycleCallbacks here!", C1175n.m2059a().m2168q());
            }
        }
    }
}
