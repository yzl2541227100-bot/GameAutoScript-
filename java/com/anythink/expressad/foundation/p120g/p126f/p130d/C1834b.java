package com.anythink.expressad.foundation.p120g.p126f.p130d;

import com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i;
import com.anythink.expressad.foundation.p120g.p126f.C1843f;
import com.anythink.expressad.foundation.p120g.p126f.C1857j;
import com.anythink.expressad.foundation.p120g.p126f.C1858k;
import com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e;
import com.anythink.expressad.foundation.p120g.p126f.p127a.C1824a;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.d.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1834b {

    /* JADX INFO: renamed from: a */
    private C1857j f11341a;

    /* JADX INFO: renamed from: c */
    private LinkedList<a> f11343c = new LinkedList<>();

    /* JADX INFO: renamed from: b */
    private int f11342b = 3;

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.d.b$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public static final int f11344a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f11345b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f11346c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f11347d = 3;

        /* JADX INFO: renamed from: e */
        public static final int f11348e = 4;

        /* JADX INFO: renamed from: g */
        private String f11350g;

        /* JADX INFO: renamed from: h */
        private File f11351h;

        /* JADX INFO: renamed from: i */
        private InterfaceC1840e<Void> f11352i;

        /* JADX INFO: renamed from: j */
        private C1833a f11353j;

        /* JADX INFO: renamed from: k */
        private int f11354k;

        /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.d.b$a$1 */
        public class AnonymousClass1 extends C1843f<Void> {

            /* JADX INFO: renamed from: a */
            public boolean f11355a;

            public AnonymousClass1() {
            }

            @Override // com.anythink.expressad.foundation.p120g.p126f.C1843f, com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e
            /* JADX INFO: renamed from: a */
            public final void mo9463a() {
                if (this.f11355a) {
                    return;
                }
                a.m9533c(a.this);
                a.this.f11352i.mo9463a();
                a aVar = a.this;
                C1834b.m9526a(C1834b.this, aVar);
            }

            @Override // com.anythink.expressad.foundation.p120g.p126f.C1843f, com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e
            /* JADX INFO: renamed from: a */
            public final void mo9464a(long j, long j2) {
                a.this.f11352i.mo9464a(j, j2);
            }

            @Override // com.anythink.expressad.foundation.p120g.p126f.C1843f, com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e
            /* JADX INFO: renamed from: a */
            public final void mo9465a(C1824a c1824a) {
                if (this.f11355a) {
                    return;
                }
                a.this.f11352i.mo9465a(c1824a);
            }

            @Override // com.anythink.expressad.foundation.p120g.p126f.C1843f, com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e
            /* JADX INFO: renamed from: a */
            public final void mo9466a(C1858k c1858k) {
                if (this.f11355a) {
                    return;
                }
                a.this.f11352i.mo9466a(c1858k);
            }

            @Override // com.anythink.expressad.foundation.p120g.p126f.C1843f, com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e
            /* JADX INFO: renamed from: b */
            public final void mo9540b() {
                a.this.f11352i.mo9540b();
            }

            @Override // com.anythink.expressad.foundation.p120g.p126f.C1843f, com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e
            /* JADX INFO: renamed from: c */
            public final void mo9541c() {
                a.this.f11352i.mo9541c();
                this.f11355a = true;
            }
        }

        private a(File file, String str, InterfaceC1840e<Void> interfaceC1840e) {
            this.f11351h = file;
            this.f11352i = interfaceC1840e;
            this.f11350g = str;
        }

        public /* synthetic */ a(C1834b c1834b, File file, String str, InterfaceC1840e interfaceC1840e, byte b) {
            this(file, str, (InterfaceC1840e<Void>) interfaceC1840e);
        }

        private a(C1834b c1834b, String str, String str2, InterfaceC1840e<Void> interfaceC1840e) {
            this(new File(str), str2, interfaceC1840e);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m9531a(a aVar) {
            if (aVar.f11354k != 0) {
                return false;
            }
            C1833a c1833a = new C1833a(aVar.f11351h, aVar.f11350g);
            aVar.f11353j = c1833a;
            c1833a.m9610a((InterfaceC1840e) aVar.new AnonymousClass1());
            aVar.f11354k = 1;
            C1834b.this.f11341a.m9631a((AbstractC1856i) aVar.f11353j);
            return true;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ int m9533c(a aVar) {
            aVar.f11354k = 3;
            return 3;
        }

        /* JADX INFO: renamed from: c */
        private boolean m9534c() {
            if (this.f11354k != 0) {
                return false;
            }
            C1833a c1833a = new C1833a(this.f11351h, this.f11350g);
            this.f11353j = c1833a;
            c1833a.m9610a((InterfaceC1840e) new AnonymousClass1());
            this.f11354k = 1;
            C1834b.this.f11341a.m9631a((AbstractC1856i) this.f11353j);
            return true;
        }

        /* JADX INFO: renamed from: d */
        private int m9535d() {
            return this.f11354k;
        }

        /* JADX INFO: renamed from: e */
        private boolean m9536e() {
            int i = this.f11354k;
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                this.f11353j.m9618e();
            }
            this.f11354k = 2;
            C1834b.this.m9527b();
            return true;
        }

        /* JADX INFO: renamed from: f */
        private boolean m9537f() {
            if (this.f11354k != 2) {
                return false;
            }
            this.f11354k = 0;
            C1834b.this.m9527b();
            return true;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m9538a() {
            return this.f11354k == 1;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m9539b() {
            int i = this.f11354k;
            if (i == 4 || i == 3) {
                return false;
            }
            if (i == 1) {
                this.f11353j.m9618e();
            }
            this.f11354k = 4;
            C1834b.m9526a(C1834b.this, this);
            return true;
        }
    }

    public C1834b(C1857j c1857j) {
        this.f11341a = c1857j;
    }

    /* JADX INFO: renamed from: a */
    private static C1833a m9522a(File file, String str) {
        return new C1833a(file, str);
    }

    /* JADX INFO: renamed from: a */
    private a m9523a(String str, String str2, InterfaceC1840e<Void> interfaceC1840e) {
        return m9529a(new File(str), str2, interfaceC1840e);
    }

    /* JADX INFO: renamed from: a */
    private void m9525a(a aVar) {
        synchronized (this) {
            this.f11343c.remove(aVar);
        }
        m9527b();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9526a(C1834b c1834b, a aVar) {
        synchronized (c1834b) {
            c1834b.f11343c.remove(aVar);
        }
        c1834b.m9527b();
    }

    /* JADX INFO: renamed from: b */
    public void m9527b() {
        synchronized (this) {
            int i = 0;
            Iterator<a> it = this.f11343c.iterator();
            while (it.hasNext()) {
                if (it.next().m9538a()) {
                    i++;
                }
            }
            if (i >= this.f11342b) {
                return;
            }
            Iterator<a> it2 = this.f11343c.iterator();
            while (it2.hasNext()) {
                if (a.m9531a(it2.next()) && (i = i + 1) == this.f11342b) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m9529a(File file, String str, InterfaceC1840e<Void> interfaceC1840e) {
        a aVar = new a(this, file, str, interfaceC1840e, (byte) 0);
        synchronized (this) {
            this.f11343c.add(aVar);
        }
        m9527b();
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m9530a() {
        synchronized (this) {
            while (!this.f11343c.isEmpty()) {
                this.f11343c.get(0).m9539b();
            }
        }
    }
}
