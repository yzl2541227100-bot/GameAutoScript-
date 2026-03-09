package com.anythink.basead.p010a.p012b;

import com.anythink.basead.p010a.C0717a;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p015c.C0751i;
import com.anythink.core.common.p050a.C1160l;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.res.p070a.C1375a;
import com.anythink.core.common.res.p070a.C1376b;
import com.anythink.core.common.res.p070a.C1377c;

/* JADX INFO: renamed from: com.anythink.basead.a.b.f */
/* JADX INFO: loaded from: classes.dex */
public class C0727f {

    /* JADX INFO: renamed from: a */
    public final String f541a = C0727f.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private String f542b;

    /* JADX INFO: renamed from: c */
    private String f543c;

    /* JADX INFO: renamed from: d */
    private String f544d;

    /* JADX INFO: renamed from: e */
    private int f545e;

    /* JADX INFO: renamed from: f */
    private AbstractC1247l f546f;

    /* JADX INFO: renamed from: g */
    private AbstractC1249n f547g;

    /* JADX INFO: renamed from: h */
    private C1375a f548h;

    public C0727f(String str, final AbstractC1247l abstractC1247l, AbstractC1249n abstractC1249n) {
        this.f542b = abstractC1247l.m3159B();
        this.f546f = abstractC1247l;
        this.f547g = abstractC1249n;
        this.f543c = str;
        this.f544d = abstractC1247l.m3229t();
        this.f545e = abstractC1247l.mo2426d();
        C1375a c1375aM4479a = C1377c.m4478a().m4479a(this.f542b);
        this.f548h = c1375aM4479a;
        c1375aM4479a.m4475a(new C1376b(this.f547g.m3289W(), this.f547g.m3293Y()));
        this.f548h.m4474a(new C1375a.a() { // from class: com.anythink.basead.a.b.f.1
            @Override // com.anythink.core.common.res.p070a.C1375a.a
            /* JADX INFO: renamed from: a */
            public final void mo223a(String str2, String str3) {
            }

            @Override // com.anythink.core.common.res.p070a.C1375a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo224a(int i, long j, long j2) {
                if (i < C0727f.this.f547g.m3289W()) {
                    return false;
                }
                C0725d.m205a().m207a(C0727f.this.f542b, i);
                return true;
            }
        });
        this.f548h.f5516k = new C1375a.b() { // from class: com.anythink.basead.a.b.f.2
            @Override // com.anythink.core.common.res.p070a.C1375a.b
            /* JADX INFO: renamed from: a */
            public final void mo225a(long j, long j2, long j3, long j4, long j5) {
                C0717a.m126a(30, abstractC1247l, new C0751i("", ""));
                C1322e.m3917a(C0727f.this.f543c, C0727f.this.f544d, C0727f.this.f542b, "1", j, (String) null, j2, j3, C0727f.this.f545e, j5 - j4);
            }

            @Override // com.anythink.core.common.res.p070a.C1375a.b
            /* JADX INFO: renamed from: a */
            public final void mo226a(String str2, String str3, long j, long j2, long j3, long j4) {
                C1322e.m3917a(C0727f.this.f543c, C0727f.this.f544d, C0727f.this.f542b, "0", j, str3, j2, 0L, C0727f.this.f545e, j4 - j3);
                C0725d.m205a().m208a(C0727f.this.f542b, C0748f.m310a(str2, str3));
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public final void m221a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f544d);
        sb.append(",");
        sb.append(this.f542b);
        sb.append(" startRequest");
        this.f548h.m4476e();
    }

    /* JADX INFO: renamed from: b */
    public final void m222b() {
        int iM2005b = C1160l.m1996a().m2005b(this.f542b);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f544d);
        sb.append(",");
        sb.append(this.f542b);
        sb.append(" resumeRequest: readyRate:");
        sb.append(iM2005b);
        sb.append(",cdRate:");
        sb.append(this.f547g.m3291X());
        if (iM2005b == 100) {
            return;
        }
        this.f548h.m4477f();
    }
}
