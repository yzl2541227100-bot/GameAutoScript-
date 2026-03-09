package com.anythink.expressad.advanced.p079d;

import com.anythink.expressad.advanced.p077b.InterfaceC1424b;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.out.InterfaceC1940o;
import com.anythink.expressad.p086d.C1483a;
import com.anythink.expressad.p086d.C1486b;
import java.util.Random;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.anythink.expressad.advanced.d.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1432d implements InterfaceC1424b {

    /* JADX INFO: renamed from: a */
    private static final String f6584a = "NativeAdvancedShowListenerImpl";

    /* JADX INFO: renamed from: b */
    private InterfaceC1940o f6585b;

    /* JADX INFO: renamed from: c */
    private C1781c f6586c;

    /* JADX INFO: renamed from: d */
    private boolean f6587d;

    /* JADX INFO: renamed from: e */
    private C1431c f6588e;

    public C1432d(C1431c c1431c, InterfaceC1940o interfaceC1940o, double d, C1781c c1781c) {
        this.f6588e = c1431c;
        this.f6585b = interfaceC1940o;
        this.f6586c = c1781c;
        this.f6587d = m5552a(d, c1781c);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m5552a(double d, C1781c c1781c) {
        try {
            C1486b.m6002a();
            C1483a c1483aM6010c = C1486b.m6010c();
            long jM5969l = c1483aM6010c.m5969l() * 1000;
            long jM5981x = c1483aM6010c.m5981x() * 1000;
            StringBuilder sb = new StringBuilder("cbp : ");
            sb.append(d);
            sb.append(" plct : ");
            sb.append(jM5981x);
            sb.append(" plctb : ");
            sb.append(jM5969l);
            if (c1781c != null) {
                if (c1781c.m8825a(jM5981x, jM5969l)) {
                    c1781c.m8870e(1);
                    return true;
                }
                c1781c.m8870e(0);
            }
        } catch (Exception unused) {
        }
        if (c1781c == null || c1781c.m8793A() || d == 1.0d) {
            return false;
        }
        double dNextDouble = new Random().nextDouble();
        StringBuilder sb2 = new StringBuilder("hit : ");
        sb2.append(dNextDouble);
        sb2.append(C4196o4.OooO00o.OooO0Oo);
        sb2.append(dNextDouble > d);
        return dNextDouble > d;
    }

    /* JADX INFO: renamed from: g */
    private void m5553g() {
        if (this.f6585b != null) {
            this.f6585b = null;
        }
    }

    @Override // com.anythink.expressad.advanced.p077b.InterfaceC1424b
    /* JADX INFO: renamed from: a */
    public final void mo5408a() {
        C1431c c1431c = this.f6588e;
        if (c1431c != null) {
            c1431c.f6558d = true;
        }
        StringBuffer stringBuffer = new StringBuffer("load_to=0&allow_skip=");
        stringBuffer.append(this.f6588e.m5547d());
        stringBuffer.append("&");
        InterfaceC1940o interfaceC1940o = this.f6585b;
        if (interfaceC1940o == null || this.f6587d) {
            return;
        }
        interfaceC1940o.mo386b();
    }

    @Override // com.anythink.expressad.advanced.p077b.InterfaceC1424b
    /* JADX INFO: renamed from: a */
    public final void mo5409a(C1781c c1781c) {
        InterfaceC1940o interfaceC1940o = this.f6585b;
        if (interfaceC1940o == null || this.f6587d) {
            return;
        }
        interfaceC1940o.mo384a(c1781c);
    }

    @Override // com.anythink.expressad.advanced.p077b.InterfaceC1424b
    /* JADX INFO: renamed from: b */
    public final void mo5410b() {
    }

    @Override // com.anythink.expressad.advanced.p077b.InterfaceC1424b
    /* JADX INFO: renamed from: c */
    public final void mo5411c() {
        InterfaceC1940o interfaceC1940o = this.f6585b;
        if (interfaceC1940o != null) {
            interfaceC1940o.mo390f();
            C1431c c1431c = this.f6588e;
            if (c1431c != null) {
                c1431c.f6558d = false;
            }
        }
    }

    @Override // com.anythink.expressad.advanced.p077b.InterfaceC1424b
    /* JADX INFO: renamed from: d */
    public final void mo5412d() {
    }

    @Override // com.anythink.expressad.advanced.p077b.InterfaceC1424b
    /* JADX INFO: renamed from: e */
    public final void mo5413e() {
    }

    @Override // com.anythink.expressad.advanced.p077b.InterfaceC1424b
    /* JADX INFO: renamed from: f */
    public final void mo5414f() {
    }
}
