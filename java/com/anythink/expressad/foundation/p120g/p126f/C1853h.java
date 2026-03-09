package com.anythink.expressad.foundation.p120g.p126f;

import android.os.Process;
import com.anythink.expressad.foundation.p120g.p126f.p127a.C1824a;
import com.anythink.expressad.foundation.p120g.p126f.p131e.C1842b;
import com.anythink.expressad.foundation.p120g.p126f.p131e.InterfaceC1841a;
import com.anythink.expressad.foundation.p120g.p126f.p132f.C1844a;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.h */
/* JADX INFO: loaded from: classes.dex */
public class C1853h {

    /* JADX INFO: renamed from: a */
    private static final String f11414a = "h";

    /* JADX INFO: renamed from: b */
    private InterfaceC1841a f11415b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1847g f11416c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1828c f11417d;

    public C1853h(SSLSocketFactory sSLSocketFactory, InterfaceC1828c interfaceC1828c) {
        this.f11415b = new C1842b(sSLSocketFactory, null);
        this.f11416c = new C1844a(this.f11415b, interfaceC1828c);
        this.f11417d = interfaceC1828c;
    }

    /* JADX INFO: renamed from: b */
    private void m9579b(AbstractC1856i abstractC1856i) {
        try {
            this.f11417d.mo9504c(abstractC1856i);
            if (abstractC1856i.m9619f()) {
                abstractC1856i.m9616c();
                this.f11417d.mo9503b(abstractC1856i);
                this.f11417d.mo9499a(abstractC1856i);
            } else {
                this.f11417d.mo9505d(abstractC1856i);
                this.f11417d.mo9502a((AbstractC1856i<?>) abstractC1856i, abstractC1856i.mo9519a(this.f11416c.mo9565a(abstractC1856i)));
            }
        } catch (C1824a e) {
            this.f11417d.mo9501a((AbstractC1856i<?>) abstractC1856i, AbstractC1856i.m9598a(e));
        } catch (Exception e2) {
            new StringBuilder("Unhandled exception ").append(e2.getMessage());
            this.f11417d.mo9501a((AbstractC1856i<?>) abstractC1856i, new C1824a(4, null));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9580a(AbstractC1856i abstractC1856i) {
        Process.setThreadPriority(10);
        try {
            this.f11417d.mo9504c(abstractC1856i);
            if (abstractC1856i.m9619f()) {
                abstractC1856i.m9616c();
                this.f11417d.mo9503b(abstractC1856i);
                this.f11417d.mo9499a(abstractC1856i);
            } else {
                this.f11417d.mo9505d(abstractC1856i);
                this.f11417d.mo9502a((AbstractC1856i<?>) abstractC1856i, abstractC1856i.mo9519a(this.f11416c.mo9565a(abstractC1856i)));
            }
        } catch (C1824a e) {
            this.f11417d.mo9501a((AbstractC1856i<?>) abstractC1856i, AbstractC1856i.m9598a(e));
        } catch (Exception e2) {
            new StringBuilder("Unhandled exception ").append(e2.getMessage());
            this.f11417d.mo9501a((AbstractC1856i<?>) abstractC1856i, new C1824a(4, null));
        }
    }
}
