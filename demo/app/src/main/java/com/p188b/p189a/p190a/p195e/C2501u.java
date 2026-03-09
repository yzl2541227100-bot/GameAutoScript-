package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.AbstractRunnableC2437b;
import com.p188b.p189a.p190a.C2446c;
import com.p188b.p199b.C2582i;
import com.p188b.p199b.InterfaceC2581h;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.b.a.a.e.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2501u extends AbstractRunnableC2437b implements InterfaceC2469aa {

    /* JADX INFO: renamed from: a */
    public final C2505y f15398a;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2490j f15399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2501u(C2490j c2490j, C2505y c2505y) {
        super("OkHttp %s", c2490j.f15347e);
        this.f15399c = c2490j;
        this.f15398a = c2505y;
    }

    @Override // com.p188b.p189a.p190a.p195e.InterfaceC2469aa
    /* JADX INFO: renamed from: a */
    public final void mo12634a(int i, long j) {
        C2490j c2490j = this.f15399c;
        if (i == 0) {
            synchronized (c2490j) {
                C2490j c2490j2 = this.f15399c;
                c2490j2.f15353k += j;
                c2490j2.notifyAll();
            }
            return;
        }
        C2470ab c2470abM12724a = c2490j.m12724a(i);
        if (c2470abM12724a != null) {
            synchronized (c2470abM12724a) {
                c2470abM12724a.m12643a(j);
            }
        }
    }

    @Override // com.p188b.p189a.p190a.p195e.InterfaceC2469aa
    /* JADX INFO: renamed from: a */
    public final void mo12635a(int i, EnumC2482b enumC2482b) {
        if (C2490j.m12722d(i)) {
            this.f15399c.m12737c(i, enumC2482b);
            return;
        }
        C2470ab c2470abM12733b = this.f15399c.m12733b(i);
        if (c2470abM12733b != null) {
            c2470abM12733b.m12651c(enumC2482b);
        }
    }

    @Override // com.p188b.p189a.p190a.p195e.InterfaceC2469aa
    /* JADX INFO: renamed from: a */
    public final void mo12636a(int i, C2582i c2582i) {
        C2470ab[] c2470abArr;
        c2582i.mo13056g();
        synchronized (this.f15399c) {
            c2470abArr = (C2470ab[]) this.f15399c.f15346d.values().toArray(new C2470ab[this.f15399c.f15346d.size()]);
            this.f15399c.f15350h = true;
        }
        for (C2470ab c2470ab : c2470abArr) {
            if (c2470ab.f15242c > i && c2470ab.m12649b()) {
                c2470ab.m12651c(EnumC2482b.REFUSED_STREAM);
                this.f15399c.m12733b(c2470ab.f15242c);
            }
        }
    }

    @Override // com.p188b.p189a.p190a.p195e.InterfaceC2469aa
    /* JADX INFO: renamed from: a */
    public final void mo12637a(int i, List<C2483c> list) {
        this.f15399c.m12729a(i, list);
    }

    @Override // com.p188b.p189a.p190a.p195e.InterfaceC2469aa
    /* JADX INFO: renamed from: a */
    public final void mo12638a(C2480al c2480al) {
        int i;
        C2470ab[] c2470abArr;
        long j;
        synchronized (this.f15399c) {
            int iM12696d = this.f15399c.f15355m.m12696d();
            C2480al c2480al2 = this.f15399c.f15355m;
            for (int i2 = 0; i2 < 10; i2++) {
                if (c2480al.m12691a(i2)) {
                    c2480al2.m12690a(i2, c2480al.m12693b(i2));
                }
            }
            ExecutorService executorService = C2490j.f15342a;
            executorService.execute(new C2504x(this, "OkHttp %s ACK Settings", new Object[]{this.f15399c.f15347e}, c2480al));
            int iM12696d2 = this.f15399c.f15355m.m12696d();
            c2470abArr = null;
            if (iM12696d2 == -1 || iM12696d2 == iM12696d) {
                j = 0;
            } else {
                j = iM12696d2 - iM12696d;
                C2490j c2490j = this.f15399c;
                if (!c2490j.f15356n) {
                    c2490j.f15353k += j;
                    if (j > 0) {
                        c2490j.notifyAll();
                    }
                    this.f15399c.f15356n = true;
                }
                if (!this.f15399c.f15346d.isEmpty()) {
                    c2470abArr = (C2470ab[]) this.f15399c.f15346d.values().toArray(new C2470ab[this.f15399c.f15346d.size()]);
                }
            }
            executorService.execute(new C2503w(this, "OkHttp %s settings", this.f15399c.f15347e));
        }
        if (c2470abArr == null || j == 0) {
            return;
        }
        for (C2470ab c2470ab : c2470abArr) {
            synchronized (c2470ab) {
                c2470ab.m12643a(j);
            }
        }
    }

    @Override // com.p188b.p189a.p190a.p195e.InterfaceC2469aa
    /* JADX INFO: renamed from: a */
    public final void mo12639a(boolean z, int i, int i2) {
        if (!z) {
            C2490j c2490j = this.f15399c;
            C2490j.f15342a.execute(new C2493m(c2490j, "OkHttp %s ping %08x%08x", new Object[]{c2490j.f15347e, Integer.valueOf(i), Integer.valueOf(i2)}, i, i2));
        } else {
            C2477ai c2477aiM12736c = this.f15399c.m12736c(i);
            if (c2477aiM12736c != null) {
                c2477aiM12736c.m12683b();
            }
        }
    }

    @Override // com.p188b.p189a.p190a.p195e.InterfaceC2469aa
    /* JADX INFO: renamed from: a */
    public final void mo12640a(boolean z, int i, InterfaceC2581h interfaceC2581h, int i2) throws IOException {
        if (C2490j.m12722d(i)) {
            this.f15399c.m12728a(i, interfaceC2581h, i2, z);
            return;
        }
        C2470ab c2470abM12724a = this.f15399c.m12724a(i);
        if (c2470abM12724a == null) {
            this.f15399c.m12727a(i, EnumC2482b.PROTOCOL_ERROR);
            interfaceC2581h.mo13023f(i2);
        } else {
            c2470abM12724a.m12645a(interfaceC2581h, i2);
            if (z) {
                c2470abM12724a.m12654f();
            }
        }
    }

    @Override // com.p188b.p189a.p190a.p195e.InterfaceC2469aa
    /* JADX INFO: renamed from: a */
    public final void mo12641a(boolean z, int i, List<C2483c> list) {
        if (C2490j.m12722d(i)) {
            this.f15399c.m12730a(i, list, z);
            return;
        }
        synchronized (this.f15399c) {
            C2490j c2490j = this.f15399c;
            if (c2490j.f15350h) {
                return;
            }
            C2470ab c2470abM12724a = c2490j.m12724a(i);
            if (c2470abM12724a != null) {
                c2470abM12724a.m12646a(list);
                if (z) {
                    c2470abM12724a.m12654f();
                    return;
                }
                return;
            }
            C2490j c2490j2 = this.f15399c;
            if (i <= c2490j2.f15348f) {
                return;
            }
            if (i % 2 == c2490j2.f15349g % 2) {
                return;
            }
            C2470ab c2470ab = new C2470ab(i, this.f15399c, false, z, list);
            C2490j c2490j3 = this.f15399c;
            c2490j3.f15348f = i;
            c2490j3.f15346d.put(Integer.valueOf(i), c2470ab);
            C2490j.f15342a.execute(new C2502v(this, "OkHttp %s stream %d", new Object[]{this.f15399c.f15347e, Integer.valueOf(i)}, c2470ab));
        }
    }

    @Override // com.p188b.p189a.p190a.AbstractRunnableC2437b
    /* JADX INFO: renamed from: b */
    public final void mo12528b() throws Throwable {
        EnumC2482b enumC2482b;
        EnumC2482b enumC2482b2 = EnumC2482b.INTERNAL_ERROR;
        try {
            try {
                this.f15398a.m12746a(this);
                while (this.f15398a.m12747a(false, this)) {
                }
                enumC2482b = EnumC2482b.NO_ERROR;
            } catch (IOException unused) {
                enumC2482b = enumC2482b2;
            } catch (Throwable th) {
                th = th;
                enumC2482b = enumC2482b2;
                try {
                    this.f15399c.m12732a(enumC2482b, enumC2482b2);
                } catch (IOException unused2) {
                }
                C2446c.m12582a(this.f15398a);
                throw th;
            }
            try {
                try {
                    this.f15399c.m12732a(enumC2482b, EnumC2482b.CANCEL);
                } catch (Throwable th2) {
                    th = th2;
                    this.f15399c.m12732a(enumC2482b, enumC2482b2);
                    C2446c.m12582a(this.f15398a);
                    throw th;
                }
            } catch (IOException unused3) {
                EnumC2482b enumC2482b3 = EnumC2482b.PROTOCOL_ERROR;
                this.f15399c.m12732a(enumC2482b3, enumC2482b3);
            }
        } catch (IOException unused4) {
        }
        C2446c.m12582a(this.f15398a);
    }
}
