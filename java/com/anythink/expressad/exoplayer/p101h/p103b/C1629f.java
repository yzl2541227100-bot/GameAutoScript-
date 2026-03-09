package com.anythink.expressad.exoplayer.p101h.p103b;

import android.util.Log;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.C1754n;
import com.anythink.expressad.exoplayer.p092c.C1527e;
import com.anythink.expressad.exoplayer.p101h.C1655x;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1651t;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1656y;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1657z;
import com.anythink.expressad.exoplayer.p101h.p103b.InterfaceC1630g;
import com.anythink.expressad.exoplayer.p105j.C1703t;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1685b;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1629f<T extends InterfaceC1630g> implements InterfaceC1656y, InterfaceC1657z, C1703t.a<AbstractC1626c>, C1703t.d {

    /* JADX INFO: renamed from: d */
    private static final String f8787d = "ChunkSampleStream";

    /* JADX INFO: renamed from: a */
    public final int f8788a;

    /* JADX INFO: renamed from: b */
    public long f8789b;

    /* JADX INFO: renamed from: c */
    public boolean f8790c;

    /* JADX INFO: renamed from: e */
    private final int[] f8791e;

    /* JADX INFO: renamed from: f */
    private final C1753m[] f8792f;

    /* JADX INFO: renamed from: g */
    private final boolean[] f8793g;

    /* JADX INFO: renamed from: h */
    private final T f8794h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC1657z.a<C1629f<T>> f8795i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC1651t.a f8796j;

    /* JADX INFO: renamed from: k */
    private final int f8797k;

    /* JADX INFO: renamed from: l */
    private final C1703t f8798l = new C1703t("Loader:ChunkSampleStream");

    /* JADX INFO: renamed from: m */
    private final C1628e f8799m = new C1628e();

    /* JADX INFO: renamed from: n */
    private final ArrayList<AbstractC1624a> f8800n;

    /* JADX INFO: renamed from: o */
    private final List<AbstractC1624a> f8801o;

    /* JADX INFO: renamed from: p */
    private final C1655x f8802p;

    /* JADX INFO: renamed from: q */
    private final C1655x[] f8803q;

    /* JADX INFO: renamed from: r */
    private final C1625b f8804r;

    /* JADX INFO: renamed from: s */
    private C1753m f8805s;

    /* JADX INFO: renamed from: t */
    @Nullable
    private b<T> f8806t;

    /* JADX INFO: renamed from: u */
    private long f8807u;

    /* JADX INFO: renamed from: v */
    private long f8808v;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.b.f$a */
    public final class a implements InterfaceC1656y {

        /* JADX INFO: renamed from: a */
        public final C1629f<T> f8809a;

        /* JADX INFO: renamed from: c */
        private final C1655x f8811c;

        /* JADX INFO: renamed from: d */
        private final int f8812d;

        /* JADX INFO: renamed from: e */
        private boolean f8813e;

        public a(C1629f<T> c1629f, C1655x c1655x, int i) {
            this.f8809a = c1629f;
            this.f8811c = c1655x;
            this.f8812d = i;
        }

        /* JADX INFO: renamed from: a */
        private void m7340a() {
            C1711a.m8012b(C1629f.this.f8793g[this.f8812d]);
            C1629f.this.f8793g[this.f8812d] = false;
        }

        /* JADX INFO: renamed from: d */
        private void m7341d() {
            if (this.f8813e) {
                return;
            }
            C1629f.this.f8796j.m7473a(C1629f.this.f8791e[this.f8812d], C1629f.this.f8792f[this.f8812d], 0, (Object) null, C1629f.this.f8808v);
            this.f8813e = true;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: a */
        public final int mo7277a(long j) {
            int iM7533a;
            if (!C1629f.this.f8790c || j <= this.f8811c.m7546g()) {
                iM7533a = this.f8811c.m7533a(j, true);
                if (iM7533a == -1) {
                    iM7533a = 0;
                }
            } else {
                iM7533a = this.f8811c.m7550k();
            }
            if (iM7533a > 0) {
                m7341d();
            }
            return iM7533a;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: a */
        public final int mo7278a(C1754n c1754n, C1527e c1527e, boolean z) {
            if (C1629f.this.m7338a()) {
                return -3;
            }
            C1655x c1655x = this.f8811c;
            C1629f c1629f = C1629f.this;
            int iM7534a = c1655x.m7534a(c1754n, c1527e, z, c1629f.f8790c, c1629f.f8789b);
            if (iM7534a == -4) {
                m7341d();
            }
            return iM7534a;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: b */
        public final boolean mo7280b() {
            C1629f c1629f = C1629f.this;
            if (c1629f.f8790c) {
                return true;
            }
            return !c1629f.m7338a() && this.f8811c.m7542c();
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: c */
        public final void mo7281c() {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.b.f$b */
    public interface b<T extends InterfaceC1630g> {
        /* JADX INFO: renamed from: a */
        void m7342a();
    }

    private C1629f(int i, int[] iArr, C1753m[] c1753mArr, T t, InterfaceC1657z.a<C1629f<T>> aVar, InterfaceC1685b interfaceC1685b, long j, int i2, InterfaceC1651t.a aVar2) {
        this.f8788a = i;
        this.f8791e = iArr;
        this.f8792f = c1753mArr;
        this.f8794h = t;
        this.f8795i = aVar;
        this.f8796j = aVar2;
        this.f8797k = i2;
        ArrayList<AbstractC1624a> arrayList = new ArrayList<>();
        this.f8800n = arrayList;
        this.f8801o = Collections.unmodifiableList(arrayList);
        int i3 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.f8803q = new C1655x[length];
        this.f8793g = new boolean[length];
        int i4 = length + 1;
        int[] iArr2 = new int[i4];
        C1655x[] c1655xArr = new C1655x[i4];
        C1655x c1655x = new C1655x(interfaceC1685b);
        this.f8802p = c1655x;
        iArr2[0] = i;
        c1655xArr[0] = c1655x;
        while (i3 < length) {
            C1655x c1655x2 = new C1655x(interfaceC1685b);
            this.f8803q[i3] = c1655x2;
            int i5 = i3 + 1;
            c1655xArr[i5] = c1655x2;
            iArr2[i5] = iArr[i3];
            i3 = i5;
        }
        this.f8804r = new C1625b(iArr2, c1655xArr);
        this.f8807u = j;
        this.f8808v = j;
    }

    /* JADX INFO: renamed from: a */
    private int m7315a(AbstractC1626c abstractC1626c, long j, long j2, IOException iOException) {
        boolean z;
        long jMo7309d = abstractC1626c.mo7309d();
        boolean z3 = abstractC1626c instanceof AbstractC1624a;
        int size = this.f8800n.size() - 1;
        boolean z4 = (jMo7309d != 0 && z3 && m7322a(size)) ? false : true;
        if (!this.f8794h.m7348f()) {
            z = false;
        } else if (z4) {
            if (z3) {
                C1711a.m8012b(m7332d(size) == abstractC1626c);
                if (this.f8800n.isEmpty()) {
                    this.f8807u = this.f8808v;
                }
            }
            z = true;
        } else {
            Log.w(f8787d, "Ignoring attempt to cancel non-cancelable load.");
            z = false;
        }
        this.f8796j.m7481a(abstractC1626c.f8764b, abstractC1626c.f8765c, this.f8788a, abstractC1626c.f8766d, abstractC1626c.f8767e, abstractC1626c.f8768f, abstractC1626c.f8769g, abstractC1626c.f8770h, j, j2, jMo7309d, iOException, z);
        if (!z) {
            return 0;
        }
        this.f8795i.mo7364a(this);
        return 2;
    }

    /* JADX INFO: renamed from: a */
    private C1629f<T>.a m7316a(long j, int i) {
        for (int i2 = 0; i2 < this.f8803q.length; i2++) {
            if (this.f8791e[i2] == i) {
                C1711a.m8012b(!this.f8793g[i2]);
                this.f8793g[i2] = true;
                this.f8803q[i2].m7548i();
                this.f8803q[i2].m7533a(j, true);
                return new a(this, this.f8803q[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: a */
    private void m7317a(int i, int i2) {
        int iM7325b = m7325b(i - i2, 0);
        int iM7325b2 = i2 == 1 ? iM7325b : m7325b(i - 1, iM7325b);
        while (iM7325b <= iM7325b2) {
            m7329c(iM7325b);
            iM7325b++;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7318a(long j, boolean z) {
        int iM7543d = this.f8802p.m7543d();
        this.f8802p.m7538a(j, z, true);
        int iM7543d2 = this.f8802p.m7543d();
        if (iM7543d2 > iM7543d) {
            long jM7547h = this.f8802p.m7547h();
            int i = 0;
            while (true) {
                C1655x[] c1655xArr = this.f8803q;
                if (i >= c1655xArr.length) {
                    break;
                }
                c1655xArr[i].m7538a(jM7547h, z, this.f8793g[i]);
                i++;
            }
            int iM7325b = m7325b(iM7543d2, 0);
            if (iM7325b > 0) {
                C1717af.m8078a((List) this.f8800n, 0, iM7325b);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7319a(AbstractC1626c abstractC1626c, long j, long j2) {
        this.f8796j.m7480a(abstractC1626c.f8764b, abstractC1626c.f8765c, this.f8788a, abstractC1626c.f8766d, abstractC1626c.f8767e, abstractC1626c.f8768f, abstractC1626c.f8769g, abstractC1626c.f8770h, j, j2, abstractC1626c.mo7309d());
        this.f8795i.mo7364a(this);
    }

    /* JADX INFO: renamed from: a */
    private void m7320a(AbstractC1626c abstractC1626c, long j, long j2, boolean z) {
        this.f8796j.m7486b(abstractC1626c.f8764b, abstractC1626c.f8765c, this.f8788a, abstractC1626c.f8766d, abstractC1626c.f8767e, abstractC1626c.f8768f, abstractC1626c.f8769g, abstractC1626c.f8770h, j, j2, abstractC1626c.mo7309d());
        if (z) {
            return;
        }
        this.f8802p.m7535a();
        for (C1655x c1655x : this.f8803q) {
            c1655x.m7535a();
        }
        this.f8795i.mo7364a(this);
    }

    /* JADX INFO: renamed from: a */
    private void m7321a(@Nullable b<T> bVar) {
        this.f8806t = bVar;
        this.f8802p.m7549j();
        for (C1655x c1655x : this.f8803q) {
            c1655x.m7549j();
        }
        this.f8798l.m7912a(this);
    }

    /* JADX INFO: renamed from: a */
    private boolean m7322a(int i) {
        int iM7544e;
        AbstractC1624a abstractC1624a = this.f8800n.get(i);
        if (this.f8802p.m7544e() > abstractC1624a.m7302a(0)) {
            return true;
        }
        int i2 = 0;
        do {
            C1655x[] c1655xArr = this.f8803q;
            if (i2 >= c1655xArr.length) {
                return false;
            }
            iM7544e = c1655xArr[i2].m7544e();
            i2++;
        } while (iM7544e <= abstractC1624a.m7302a(i2));
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7323a(AbstractC1626c abstractC1626c) {
        return abstractC1626c instanceof AbstractC1624a;
    }

    /* JADX INFO: renamed from: b */
    private int m7325b(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f8800n.size()) {
                return this.f8800n.size() - 1;
            }
        } while (this.f8800n.get(i2).m7302a(0) <= i);
        return i2 - 1;
    }

    /* JADX INFO: renamed from: b */
    private void m7326b(int i) {
        int iM7325b = m7325b(i, 0);
        if (iM7325b > 0) {
            C1717af.m8078a((List) this.f8800n, 0, iM7325b);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7327b(long j) {
        boolean zM7541b;
        long j2;
        this.f8808v = j;
        this.f8802p.m7548i();
        if (m7338a()) {
            zM7541b = false;
        } else {
            AbstractC1624a abstractC1624a = null;
            int i = 0;
            while (true) {
                if (i >= this.f8800n.size()) {
                    break;
                }
                AbstractC1624a abstractC1624a2 = this.f8800n.get(i);
                long j3 = abstractC1624a2.f8769g;
                if (j3 == j && abstractC1624a2.f8758a == C1500b.f7455b) {
                    abstractC1624a = abstractC1624a2;
                    break;
                } else if (j3 > j) {
                    break;
                } else {
                    i++;
                }
            }
            if (abstractC1624a != null) {
                zM7541b = this.f8802p.m7541b(abstractC1624a.m7302a(0));
                j2 = Long.MIN_VALUE;
            } else {
                zM7541b = this.f8802p.m7533a(j, (j > mo7274e() ? 1 : (j == mo7274e() ? 0 : -1)) < 0) != -1;
                j2 = this.f8808v;
            }
            this.f8789b = j2;
        }
        if (zM7541b) {
            for (C1655x c1655x : this.f8803q) {
                c1655x.m7548i();
                c1655x.m7533a(j, false);
            }
            return;
        }
        this.f8807u = j;
        this.f8790c = false;
        this.f8800n.clear();
        if (this.f8798l.m7913a()) {
            this.f8798l.m7914b();
            return;
        }
        this.f8802p.m7535a();
        for (C1655x c1655x2 : this.f8803q) {
            c1655x2.m7535a();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m7329c(int i) {
        AbstractC1624a abstractC1624a = this.f8800n.get(i);
        C1753m c1753m = abstractC1624a.f8766d;
        if (!c1753m.equals(this.f8805s)) {
            this.f8796j.m7473a(this.f8788a, c1753m, abstractC1624a.f8767e, abstractC1624a.f8768f, abstractC1624a.f8769g);
        }
        this.f8805s = c1753m;
    }

    /* JADX INFO: renamed from: d */
    private AbstractC1624a m7332d(int i) {
        AbstractC1624a abstractC1624a = this.f8800n.get(i);
        ArrayList<AbstractC1624a> arrayList = this.f8800n;
        C1717af.m8078a((List) arrayList, i, arrayList.size());
        C1655x c1655x = this.f8802p;
        int i2 = 0;
        while (true) {
            c1655x.m7536a(abstractC1624a.m7302a(i2));
            C1655x[] c1655xArr = this.f8803q;
            if (i2 >= c1655xArr.length) {
                return abstractC1624a;
            }
            c1655x = c1655xArr[i2];
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    private T m7334f() {
        return this.f8794h;
    }

    /* JADX INFO: renamed from: h */
    private long m7335h() {
        return this.f8794h.m7343a();
    }

    /* JADX INFO: renamed from: i */
    private void m7336i() {
        this.f8806t = null;
        this.f8802p.m7549j();
        for (C1655x c1655x : this.f8803q) {
            c1655x.m7549j();
        }
        this.f8798l.m7912a(this);
    }

    /* JADX INFO: renamed from: j */
    private AbstractC1624a m7337j() {
        return this.f8800n.get(r0.size() - 1);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
    /* JADX INFO: renamed from: a */
    public final int mo7277a(long j) {
        int iM7550k = 0;
        if (m7338a()) {
            return 0;
        }
        if (!this.f8790c || j <= this.f8802p.m7546g()) {
            int iM7533a = this.f8802p.m7533a(j, true);
            if (iM7533a != -1) {
                iM7550k = iM7533a;
            }
        } else {
            iM7550k = this.f8802p.m7550k();
        }
        if (iM7550k > 0) {
            m7317a(this.f8802p.m7544e(), iM7550k);
        }
        return iM7550k;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo7260a(C1703t.c cVar, long j, long j2, IOException iOException) {
        boolean z;
        AbstractC1626c abstractC1626c = (AbstractC1626c) cVar;
        long jMo7309d = abstractC1626c.mo7309d();
        boolean z3 = abstractC1626c instanceof AbstractC1624a;
        int size = this.f8800n.size() - 1;
        boolean z4 = (jMo7309d != 0 && z3 && m7322a(size)) ? false : true;
        if (!this.f8794h.m7348f()) {
            z = false;
        } else if (z4) {
            if (z3) {
                C1711a.m8012b(m7332d(size) == abstractC1626c);
                if (this.f8800n.isEmpty()) {
                    this.f8807u = this.f8808v;
                }
            }
            z = true;
        } else {
            Log.w(f8787d, "Ignoring attempt to cancel non-cancelable load.");
            z = false;
        }
        this.f8796j.m7481a(abstractC1626c.f8764b, abstractC1626c.f8765c, this.f8788a, abstractC1626c.f8766d, abstractC1626c.f8767e, abstractC1626c.f8768f, abstractC1626c.f8769g, abstractC1626c.f8770h, j, j2, jMo7309d, iOException, z);
        if (!z) {
            return 0;
        }
        this.f8795i.mo7364a(this);
        return 2;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
    /* JADX INFO: renamed from: a */
    public final int mo7278a(C1754n c1754n, C1527e c1527e, boolean z) {
        if (m7338a()) {
            return -3;
        }
        int iM7534a = this.f8802p.m7534a(c1754n, c1527e, z, this.f8790c, this.f8789b);
        if (iM7534a == -4) {
            m7317a(this.f8802p.m7544e(), 1);
        }
        return iM7534a;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo7266a(C1703t.c cVar, long j, long j2) {
        AbstractC1626c abstractC1626c = (AbstractC1626c) cVar;
        this.f8796j.m7480a(abstractC1626c.f8764b, abstractC1626c.f8765c, this.f8788a, abstractC1626c.f8766d, abstractC1626c.f8767e, abstractC1626c.f8768f, abstractC1626c.f8769g, abstractC1626c.f8770h, j, j2, abstractC1626c.mo7309d());
        this.f8795i.mo7364a(this);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo7267a(C1703t.c cVar, long j, long j2, boolean z) {
        AbstractC1626c abstractC1626c = (AbstractC1626c) cVar;
        this.f8796j.m7486b(abstractC1626c.f8764b, abstractC1626c.f8765c, this.f8788a, abstractC1626c.f8766d, abstractC1626c.f8767e, abstractC1626c.f8768f, abstractC1626c.f8769g, abstractC1626c.f8770h, j, j2, abstractC1626c.mo7309d());
        if (z) {
            return;
        }
        this.f8802p.m7535a();
        for (C1655x c1655x : this.f8803q) {
            c1655x.m7535a();
        }
        this.f8795i.mo7364a(this);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7338a() {
        return this.f8807u != C1500b.f7455b;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: a_ */
    public final void mo7268a_(long j) {
        int size;
        int iM7345c;
        if (this.f8798l.m7913a() || m7338a() || (size = this.f8800n.size()) <= (iM7345c = this.f8794h.m7345c())) {
            return;
        }
        while (true) {
            if (iM7345c >= size) {
                iM7345c = size;
                break;
            } else if (!m7322a(iM7345c)) {
                break;
            } else {
                iM7345c++;
            }
        }
        if (iM7345c == size) {
            return;
        }
        long j2 = m7337j().f8770h;
        AbstractC1624a abstractC1624aM7332d = m7332d(iM7345c);
        if (this.f8800n.isEmpty()) {
            this.f8807u = this.f8808v;
        }
        this.f8790c = false;
        this.f8796j.m7472a(this.f8788a, abstractC1624aM7332d.f8769g, j2);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
    /* JADX INFO: renamed from: b */
    public final boolean mo7280b() {
        if (this.f8790c) {
            return true;
        }
        return !m7338a() && this.f8802p.m7542c();
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
    /* JADX INFO: renamed from: c */
    public final void mo7281c() throws IOException {
        this.f8798l.mo7915c();
        this.f8798l.m7913a();
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: c */
    public final boolean mo7272c(long j) {
        if (this.f8790c || this.f8798l.m7913a()) {
            return false;
        }
        boolean zM7338a = m7338a();
        if (!zM7338a) {
            m7337j();
        }
        C1628e c1628e = this.f8799m;
        boolean z = c1628e.f8786b;
        AbstractC1626c abstractC1626c = c1628e.f8785a;
        c1628e.f8785a = null;
        c1628e.f8786b = false;
        if (z) {
            this.f8807u = C1500b.f7455b;
            this.f8790c = true;
            return true;
        }
        if (abstractC1626c == null) {
            return false;
        }
        if (abstractC1626c instanceof AbstractC1624a) {
            AbstractC1624a abstractC1624a = (AbstractC1624a) abstractC1626c;
            if (zM7338a) {
                long j2 = abstractC1624a.f8769g;
                long j3 = this.f8807u;
                if (j2 == j3) {
                    j3 = Long.MIN_VALUE;
                }
                this.f8789b = j3;
                this.f8807u = C1500b.f7455b;
            }
            abstractC1624a.m7303a(this.f8804r);
            this.f8800n.add(abstractC1624a);
        }
        this.f8796j.m7479a(abstractC1626c.f8764b, abstractC1626c.f8765c, this.f8788a, abstractC1626c.f8766d, abstractC1626c.f8767e, abstractC1626c.f8768f, abstractC1626c.f8769g, abstractC1626c.f8770h, this.f8798l.m7910a(abstractC1626c, this, this.f8797k));
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: d */
    public final long mo7273d() {
        if (this.f8790c) {
            return Long.MIN_VALUE;
        }
        if (m7338a()) {
            return this.f8807u;
        }
        long jMax = this.f8808v;
        AbstractC1624a abstractC1624aM7337j = m7337j();
        if (!abstractC1624aM7337j.mo7350f()) {
            if (this.f8800n.size() > 1) {
                abstractC1624aM7337j = this.f8800n.get(r2.size() - 2);
            } else {
                abstractC1624aM7337j = null;
            }
        }
        if (abstractC1624aM7337j != null) {
            jMax = Math.max(jMax, abstractC1624aM7337j.f8770h);
        }
        return Math.max(jMax, this.f8802p.m7546g());
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: e */
    public final long mo7274e() {
        if (m7338a()) {
            return this.f8807u;
        }
        if (this.f8790c) {
            return Long.MIN_VALUE;
        }
        return m7337j().f8770h;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.d
    /* JADX INFO: renamed from: g */
    public final void mo7339g() {
        this.f8802p.m7535a();
        for (C1655x c1655x : this.f8803q) {
            c1655x.m7535a();
        }
    }
}
