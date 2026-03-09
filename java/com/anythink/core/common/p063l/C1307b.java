package com.anythink.core.common.p063l;

import com.anythink.core.api.AdError;
import com.anythink.core.common.C1201f;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.InterfaceC1162a;
import com.anythink.core.common.p055f.C1257v;
import com.anythink.core.common.p064m.C1315d;
import com.anythink.core.common.p064m.InterfaceRunnableC1313b;

/* JADX INFO: renamed from: com.anythink.core.common.l.b */
/* JADX INFO: loaded from: classes.dex */
public class C1307b {

    /* JADX INFO: renamed from: l */
    private static final String f4974l = "b";

    /* JADX INFO: renamed from: a */
    public String f4975a;

    /* JADX INFO: renamed from: b */
    public C1310e f4976b;

    /* JADX INFO: renamed from: c */
    public int f4977c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1308c f4978d;

    /* JADX INFO: renamed from: e */
    public int f4979e;

    /* JADX INFO: renamed from: f */
    public boolean f4980f;

    /* JADX INFO: renamed from: g */
    public long f4981g;

    /* JADX INFO: renamed from: h */
    public String f4982h;

    /* JADX INFO: renamed from: i */
    public boolean f4983i;

    /* JADX INFO: renamed from: j */
    public Boolean f4984j;

    /* JADX INFO: renamed from: k */
    public InterfaceRunnableC1313b f4985k;

    /* JADX INFO: renamed from: com.anythink.core.common.l.b$1, reason: invalid class name */
    public class AnonymousClass1 implements InterfaceRunnableC1313b {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1307b.this.m3778k();
        }
    }

    public C1307b(String str) {
        this.f4975a = str;
        this.f4982h = str + "_" + hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m3768a(AdError adError) {
        new StringBuilder("onAdError, ").append(this.f4976b.toString());
        m3775h();
        InterfaceC1308c interfaceC1308c = this.f4978d;
        if (interfaceC1308c != null) {
            interfaceC1308c.mo3786a(this.f4982h, this.f4976b, adError);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3771a(Boolean bool) {
        this.f4984j = bool;
    }

    /* JADX INFO: renamed from: f */
    private Boolean m3773f() {
        return this.f4984j;
    }

    /* JADX INFO: renamed from: g */
    private void m3774g() {
        if (this.f4980f && this.f4981g != -1) {
            new StringBuilder("checkToStartShortTimeout, start timer for load timeout, load timeout time: ").append(this.f4981g);
            this.f4985k = new AnonymousClass1();
            C1315d.m3806a().mo3800a(this.f4985k, this.f4981g, false);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m3775h() {
        if (this.f4985k != null) {
            new StringBuilder("stopShortTimeout, ").append(this.f4976b.toString());
            C1315d.m3806a().mo3801b(this.f4985k);
        }
    }

    /* JADX INFO: renamed from: i */
    private C1201f m3776i() {
        return C1201f.m2340a(C1175n.m2059a().m2148f(), this.f4975a, String.valueOf(this.f4979e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public synchronized void m3777j() {
        new StringBuilder("onAdLoaded, ").append(this.f4976b.toString());
        m3775h();
        InterfaceC1308c interfaceC1308c = this.f4978d;
        if (interfaceC1308c != null) {
            interfaceC1308c.mo3785a(this.f4982h, this.f4976b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public synchronized void m3778k() {
        new StringBuilder("onAdTimeout, ").append(this.f4976b.toString());
        InterfaceC1308c interfaceC1308c = this.f4978d;
        if (interfaceC1308c != null) {
            interfaceC1308c.mo3787b(this.f4982h, this.f4976b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m3779a() {
        return this.f4982h;
    }

    /* JADX INFO: renamed from: a */
    public final void m3780a(C1306a c1306a) {
        C1310e c1310e = c1306a.f4969a;
        this.f4976b = c1310e;
        this.f4977c = c1306a.f4970b;
        this.f4979e = c1310e.f4994a;
        this.f4978d = c1306a.f4973e;
        this.f4980f = c1306a.f4971c;
        this.f4981g = c1306a.f4972d;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3781b() {
        return this.f4984j == null || !this.f4983i;
    }

    /* JADX INFO: renamed from: c */
    public final void m3782c() {
        StringBuilder sb = new StringBuilder("startLoad: ");
        C1310e c1310e = this.f4976b;
        sb.append(c1310e != null ? c1310e.toString() : "error");
        C1201f c1201fM2340a = C1201f.m2340a(C1175n.m2059a().m2148f(), this.f4975a, String.valueOf(this.f4979e));
        if (this.f4980f && this.f4981g != -1) {
            new StringBuilder("checkToStartShortTimeout, start timer for load timeout, load timeout time: ").append(this.f4981g);
            this.f4985k = new AnonymousClass1();
            C1315d.m3806a().mo3800a(this.f4985k, this.f4981g, false);
        }
        C1257v c1257v = new C1257v();
        c1257v.m3446a(C1175n.m2059a().m2099E());
        c1257v.f4483d = this.f4977c;
        c1201fM2340a.m2385a(C1175n.m2059a().m2148f(), String.valueOf(this.f4979e), this.f4975a, c1257v, new InterfaceC1162a() { // from class: com.anythink.core.common.l.b.2
            @Override // com.anythink.core.common.p051b.InterfaceC1162a
            public final void onAdLoadFail(AdError adError) {
                C1307b.this.m3768a(adError);
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1162a
            public final void onAdLoaded() {
                C1307b.this.m3777j();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final int m3783d() {
        return this.f4977c;
    }

    /* JADX INFO: renamed from: e */
    public final String m3784e() {
        return this.f4975a;
    }
}
