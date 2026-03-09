package com.anythink.expressad.exoplayer;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1649r;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p104i.AbstractC1666h;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1685b;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1759s {

    /* JADX INFO: renamed from: a */
    private static final int f10017a = 100;

    /* JADX INFO: renamed from: b */
    private final AbstractC1499ae.a f10018b = new AbstractC1499ae.a();

    /* JADX INFO: renamed from: c */
    private final AbstractC1499ae.b f10019c = new AbstractC1499ae.b();

    /* JADX INFO: renamed from: d */
    private long f10020d;

    /* JADX INFO: renamed from: e */
    private AbstractC1499ae f10021e;

    /* JADX INFO: renamed from: f */
    private int f10022f;

    /* JADX INFO: renamed from: g */
    private boolean f10023g;

    /* JADX INFO: renamed from: h */
    private C1757q f10024h;

    /* JADX INFO: renamed from: i */
    private C1757q f10025i;

    /* JADX INFO: renamed from: j */
    private C1757q f10026j;

    /* JADX INFO: renamed from: k */
    private int f10027k;

    /* JADX INFO: renamed from: l */
    private Object f10028l;

    /* JADX INFO: renamed from: m */
    private long f10029m;

    /* JADX INFO: renamed from: a */
    private InterfaceC1650s.a m8440a(int i, long j, long j2) {
        this.f10021e.mo6362a(i, this.f10018b, false);
        int iM6374a = this.f10018b.m6374a(j);
        return iM6374a == -1 ? new InterfaceC1650s.a(i, j2) : new InterfaceC1650s.a(i, iM6374a, this.f10018b.m6379b(iM6374a), j2);
    }

    /* JADX INFO: renamed from: a */
    private C1758r m8441a(int i, int i2, int i3, long j, long j2) {
        InterfaceC1650s.a aVar = new InterfaceC1650s.a(i, i2, i3, j2);
        boolean zM8450b = m8450b(aVar, Long.MIN_VALUE);
        boolean zM8446a = m8446a(aVar, zM8450b);
        return new C1758r(aVar, i3 == this.f10018b.m6379b(i2) ? this.f10018b.m6387d() : 0L, Long.MIN_VALUE, j, this.f10021e.mo6362a(aVar.f9012a, this.f10018b, false).m6384c(aVar.f9013b, aVar.f9014c), zM8450b, zM8446a);
    }

    /* JADX INFO: renamed from: a */
    private C1758r m8442a(InterfaceC1650s.a aVar, long j, long j2) {
        this.f10021e.mo6362a(aVar.f9012a, this.f10018b, false);
        if (!aVar.m7464a()) {
            return m8449b(aVar.f9012a, j2, aVar.f9015d);
        }
        if (this.f10018b.m6382b(aVar.f9013b, aVar.f9014c)) {
            return m8441a(aVar.f9012a, aVar.f9013b, aVar.f9014c, j, aVar.f9015d);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    private C1758r m8443a(C1757q c1757q, long j) {
        int i;
        long j2;
        long j3;
        C1758r c1758r = c1757q.f10002h;
        if (c1758r.f10015f) {
            int iM6357a = this.f10021e.m6357a(c1758r.f10010a.f9012a, this.f10018b, this.f10019c, this.f10022f, this.f10023g);
            if (iM6357a == -1) {
                return null;
            }
            int i2 = this.f10021e.mo6362a(iM6357a, this.f10018b, true).f7362c;
            Object obj = this.f10018b.f7361b;
            long j4 = c1758r.f10010a.f9015d;
            long j5 = 0;
            if (this.f10021e.m6363a(i2, this.f10019c, false).f7371f == iM6357a) {
                Pair<Integer, Long> pairM6361a = this.f10021e.m6361a(this.f10019c, this.f10018b, i2, C1500b.f7455b, Math.max(0L, (c1757q.f9999e + c1758r.f10014e) - j));
                if (pairM6361a == null) {
                    return null;
                }
                int iIntValue = ((Integer) pairM6361a.first).intValue();
                long jLongValue = ((Long) pairM6361a.second).longValue();
                C1757q c1757q2 = c1757q.f10003i;
                if (c1757q2 == null || !c1757q2.f9996b.equals(obj)) {
                    j3 = this.f10020d;
                    this.f10020d = 1 + j3;
                } else {
                    j3 = c1757q.f10003i.f10002h.f10010a.f9015d;
                }
                j5 = jLongValue;
                j2 = j3;
                i = iIntValue;
            } else {
                i = iM6357a;
                j2 = j4;
            }
            long j6 = j5;
            return m8442a(m8440a(i, j6, j2), j6, j5);
        }
        InterfaceC1650s.a aVar = c1758r.f10010a;
        this.f10021e.mo6362a(aVar.f9012a, this.f10018b, false);
        if (aVar.m7464a()) {
            int i3 = aVar.f9013b;
            int iM6386d = this.f10018b.m6386d(i3);
            if (iM6386d == -1) {
                return null;
            }
            int iM6373a = this.f10018b.m6373a(i3, aVar.f9014c);
            if (iM6373a >= iM6386d) {
                return m8449b(aVar.f9012a, c1758r.f10013d, aVar.f9015d);
            }
            if (this.f10018b.m6382b(i3, iM6373a)) {
                return m8441a(aVar.f9012a, i3, iM6373a, c1758r.f10013d, aVar.f9015d);
            }
            return null;
        }
        long j7 = c1758r.f10012c;
        if (j7 != Long.MIN_VALUE) {
            int iM6374a = this.f10018b.m6374a(j7);
            if (iM6374a == -1) {
                return m8449b(aVar.f9012a, c1758r.f10012c, aVar.f9015d);
            }
            int iM6379b = this.f10018b.m6379b(iM6374a);
            if (this.f10018b.m6382b(iM6374a, iM6379b)) {
                return m8441a(aVar.f9012a, iM6374a, iM6379b, c1758r.f10012c, aVar.f9015d);
            }
            return null;
        }
        int iM6383c = this.f10018b.m6383c();
        if (iM6383c == 0) {
            return null;
        }
        int i4 = iM6383c - 1;
        if (this.f10018b.m6376a(i4) != Long.MIN_VALUE || this.f10018b.m6385c(i4)) {
            return null;
        }
        int iM6379b2 = this.f10018b.m6379b(i4);
        if (!this.f10018b.m6382b(i4, iM6379b2)) {
            return null;
        }
        return m8441a(aVar.f9012a, i4, iM6379b2, this.f10018b.f7363d, aVar.f9015d);
    }

    /* JADX INFO: renamed from: a */
    private C1758r m8444a(C1758r c1758r, InterfaceC1650s.a aVar) {
        long j;
        long jM6384c;
        long j2 = c1758r.f10011b;
        long j3 = c1758r.f10012c;
        boolean zM8450b = m8450b(aVar, j3);
        boolean zM8446a = m8446a(aVar, zM8450b);
        this.f10021e.mo6362a(aVar.f9012a, this.f10018b, false);
        if (aVar.m7464a()) {
            jM6384c = this.f10018b.m6384c(aVar.f9013b, aVar.f9014c);
        } else {
            if (j3 != Long.MIN_VALUE) {
                j = j3;
                return new C1758r(aVar, j2, j3, c1758r.f10013d, j, zM8450b, zM8446a);
            }
            jM6384c = this.f10018b.f7363d;
        }
        j = jM6384c;
        return new C1758r(aVar, j2, j3, c1758r.f10013d, j, zM8450b, zM8446a);
    }

    /* JADX INFO: renamed from: a */
    private C1758r m8445a(C1764u c1764u) {
        return m8442a(c1764u.f10060c, c1764u.f10062e, c1764u.f10061d);
    }

    /* JADX INFO: renamed from: a */
    private boolean m8446a(InterfaceC1650s.a aVar, boolean z) {
        return !this.f10021e.m6363a(this.f10021e.mo6362a(aVar.f9012a, this.f10018b, false).f7362c, this.f10019c, false).f7370e && this.f10021e.m6369b(aVar.f9012a, this.f10018b, this.f10019c, this.f10022f, this.f10023g) && z;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m8447a(C1757q c1757q, C1758r c1758r) {
        C1758r c1758r2 = c1757q.f10002h;
        return c1758r2.f10011b == c1758r.f10011b && c1758r2.f10012c == c1758r.f10012c && c1758r2.f10010a.equals(c1758r.f10010a);
    }

    /* JADX INFO: renamed from: b */
    private long m8448b(int i) {
        int iMo6358a;
        Object obj = this.f10021e.mo6362a(i, this.f10018b, true).f7361b;
        int i2 = this.f10018b.f7362c;
        Object obj2 = this.f10028l;
        if (obj2 != null && (iMo6358a = this.f10021e.mo6358a(obj2)) != -1 && this.f10021e.mo6362a(iMo6358a, this.f10018b, false).f7362c == i2) {
            return this.f10029m;
        }
        for (C1757q c1757qM8468e = m8468e(); c1757qM8468e != null; c1757qM8468e = c1757qM8468e.f10003i) {
            if (c1757qM8468e.f9996b.equals(obj)) {
                return c1757qM8468e.f10002h.f10010a.f9015d;
            }
        }
        for (C1757q c1757qM8468e2 = m8468e(); c1757qM8468e2 != null; c1757qM8468e2 = c1757qM8468e2.f10003i) {
            int iMo6358a2 = this.f10021e.mo6358a(c1757qM8468e2.f9996b);
            if (iMo6358a2 != -1 && this.f10021e.mo6362a(iMo6358a2, this.f10018b, false).f7362c == i2) {
                return c1757qM8468e2.f10002h.f10010a.f9015d;
            }
        }
        long j = this.f10020d;
        this.f10020d = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: b */
    private C1758r m8449b(int i, long j, long j2) {
        InterfaceC1650s.a aVar = new InterfaceC1650s.a(i, j2);
        this.f10021e.mo6362a(aVar.f9012a, this.f10018b, false);
        int iM6380b = this.f10018b.m6380b(j);
        long jM6376a = iM6380b == -1 ? Long.MIN_VALUE : this.f10018b.m6376a(iM6380b);
        boolean zM8450b = m8450b(aVar, jM6376a);
        return new C1758r(aVar, j, jM6376a, C1500b.f7455b, jM6376a == Long.MIN_VALUE ? this.f10018b.f7363d : jM6376a, zM8450b, m8446a(aVar, zM8450b));
    }

    /* JADX INFO: renamed from: b */
    private boolean m8450b(InterfaceC1650s.a aVar, long j) {
        int iM6383c = this.f10021e.mo6362a(aVar.f9012a, this.f10018b, false).m6383c();
        if (iM6383c == 0) {
            return true;
        }
        int i = iM6383c - 1;
        boolean zM7464a = aVar.m7464a();
        if (this.f10018b.m6376a(i) != Long.MIN_VALUE) {
            return !zM7464a && j == Long.MIN_VALUE;
        }
        int iM6386d = this.f10018b.m6386d(i);
        if (iM6386d == -1) {
            return false;
        }
        return (zM7464a && aVar.f9013b == i && aVar.f9014c == iM6386d + (-1)) || (!zM7464a && this.f10018b.m6379b(i) == iM6386d);
    }

    /* JADX INFO: renamed from: i */
    private boolean m8451i() {
        C1757q c1757q;
        C1757q c1757qM8468e = m8468e();
        if (c1757qM8468e == null) {
            return true;
        }
        while (true) {
            int iM6357a = this.f10021e.m6357a(c1757qM8468e.f10002h.f10010a.f9012a, this.f10018b, this.f10019c, this.f10022f, this.f10023g);
            while (true) {
                c1757q = c1757qM8468e.f10003i;
                if (c1757q == null || c1757qM8468e.f10002h.f10015f) {
                    break;
                }
                c1757qM8468e = c1757q;
            }
            if (iM6357a == -1 || c1757q == null || c1757q.f10002h.f10010a.f9012a != iM6357a) {
                break;
            }
            c1757qM8468e = c1757q;
        }
        boolean zM8462a = m8462a(c1757qM8468e);
        C1758r c1758r = c1757qM8468e.f10002h;
        c1757qM8468e.f10002h = m8444a(c1758r, c1758r.f10010a);
        return (zM8462a && m8469f()) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1649r m8452a(InterfaceC1769z[] interfaceC1769zArr, AbstractC1666h abstractC1666h, InterfaceC1685b interfaceC1685b, InterfaceC1650s interfaceC1650s, Object obj, C1758r c1758r) {
        C1757q c1757q = this.f10026j;
        C1757q c1757q2 = new C1757q(interfaceC1769zArr, c1757q == null ? c1758r.f10011b : c1757q.f9999e + c1757q.f10002h.f10014e, abstractC1666h, interfaceC1685b, interfaceC1650s, obj, c1758r);
        if (this.f10026j != null) {
            C1711a.m8012b(m8469f());
            this.f10026j.f10003i = c1757q2;
        }
        this.f10028l = null;
        this.f10026j = c1757q2;
        this.f10027k++;
        return c1757q2.f9995a;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1650s.a m8453a(int i, long j) {
        long j2;
        C1758r c1758r;
        int iMo6358a;
        Object obj = this.f10021e.mo6362a(i, this.f10018b, true).f7361b;
        int i2 = this.f10018b.f7362c;
        Object obj2 = this.f10028l;
        if (obj2 == null || (iMo6358a = this.f10021e.mo6358a(obj2)) == -1 || this.f10021e.mo6362a(iMo6358a, this.f10018b, false).f7362c != i2) {
            C1757q c1757qM8468e = m8468e();
            while (true) {
                if (c1757qM8468e == null) {
                    for (C1757q c1757qM8468e2 = m8468e(); c1757qM8468e2 != null; c1757qM8468e2 = c1757qM8468e2.f10003i) {
                        int iMo6358a2 = this.f10021e.mo6358a(c1757qM8468e2.f9996b);
                        if (iMo6358a2 != -1 && this.f10021e.mo6362a(iMo6358a2, this.f10018b, false).f7362c == i2) {
                            c1758r = c1757qM8468e2.f10002h;
                        }
                    }
                    j2 = this.f10020d;
                    this.f10020d = 1 + j2;
                } else {
                    if (c1757qM8468e.f9996b.equals(obj)) {
                        c1758r = c1757qM8468e.f10002h;
                        break;
                    }
                    c1757qM8468e = c1757qM8468e.f10003i;
                }
            }
            j2 = c1758r.f10010a.f9015d;
        } else {
            j2 = this.f10029m;
        }
        return m8440a(i, j, j2);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final C1758r m8454a(long j, C1764u c1764u) {
        C1757q c1757q = this.f10026j;
        return c1757q == null ? m8442a(c1764u.f10060c, c1764u.f10062e, c1764u.f10061d) : m8443a(c1757q, j);
    }

    /* JADX INFO: renamed from: a */
    public final C1758r m8455a(C1758r c1758r, int i) {
        return m8444a(c1758r, c1758r.f10010a.m7463a(i));
    }

    /* JADX INFO: renamed from: a */
    public final void m8456a(long j) {
        C1757q c1757q = this.f10026j;
        if (c1757q == null || !c1757q.f10000f) {
            return;
        }
        c1757q.f9995a.mo7268a_(j - c1757q.f9999e);
    }

    /* JADX INFO: renamed from: a */
    public final void m8457a(AbstractC1499ae abstractC1499ae) {
        this.f10021e = abstractC1499ae;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8458a() {
        C1757q c1757q = this.f10026j;
        if (c1757q != null) {
            return !c1757q.f10002h.f10016g && c1757q.m8433a() && this.f10026j.f10002h.f10014e != C1500b.f7455b && this.f10027k < 100;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8459a(int i) {
        this.f10022f = i;
        return m8451i();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8460a(InterfaceC1649r interfaceC1649r) {
        C1757q c1757q = this.f10026j;
        return c1757q != null && c1757q.f9995a == interfaceC1649r;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8461a(InterfaceC1650s.a aVar, long j) {
        int i = aVar.f9012a;
        C1757q c1757q = null;
        int iM6357a = i;
        for (C1757q c1757qM8468e = m8468e(); c1757qM8468e != null; c1757qM8468e = c1757qM8468e.f10003i) {
            if (c1757q == null) {
                c1757qM8468e.f10002h = m8455a(c1757qM8468e.f10002h, iM6357a);
            } else {
                if (iM6357a == -1 || !c1757qM8468e.f9996b.equals(this.f10021e.mo6362a(iM6357a, this.f10018b, true).f7361b)) {
                    return !m8462a(c1757q);
                }
                C1758r c1758rM8443a = m8443a(c1757q, j);
                if (c1758rM8443a == null) {
                    return !m8462a(c1757q);
                }
                C1758r c1758rM8455a = m8455a(c1757qM8468e.f10002h, iM6357a);
                c1757qM8468e.f10002h = c1758rM8455a;
                if (!(c1758rM8455a.f10011b == c1758rM8443a.f10011b && c1758rM8455a.f10012c == c1758rM8443a.f10012c && c1758rM8455a.f10010a.equals(c1758rM8443a.f10010a))) {
                    return !m8462a(c1757q);
                }
            }
            if (c1757qM8468e.f10002h.f10015f) {
                iM6357a = this.f10021e.m6357a(iM6357a, this.f10018b, this.f10019c, this.f10022f, this.f10023g);
            }
            c1757q = c1757qM8468e;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8462a(C1757q c1757q) {
        boolean z = false;
        C1711a.m8012b(c1757q != null);
        this.f10026j = c1757q;
        while (true) {
            c1757q = c1757q.f10003i;
            if (c1757q == null) {
                this.f10026j.f10003i = null;
                return z;
            }
            if (c1757q == this.f10025i) {
                this.f10025i = this.f10024h;
                z = true;
            }
            c1757q.m8437c();
            this.f10027k--;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8463a(boolean z) {
        this.f10023g = z;
        return m8451i();
    }

    /* JADX INFO: renamed from: b */
    public final C1757q m8464b() {
        return this.f10026j;
    }

    /* JADX INFO: renamed from: b */
    public final void m8465b(boolean z) {
        C1757q c1757qM8468e = m8468e();
        if (c1757qM8468e != null) {
            this.f10028l = z ? c1757qM8468e.f9996b : null;
            this.f10029m = c1757qM8468e.f10002h.f10010a.f9015d;
            c1757qM8468e.m8437c();
            m8462a(c1757qM8468e);
        } else if (!z) {
            this.f10028l = null;
        }
        this.f10024h = null;
        this.f10026j = null;
        this.f10025i = null;
        this.f10027k = 0;
    }

    /* JADX INFO: renamed from: c */
    public final C1757q m8466c() {
        return this.f10024h;
    }

    /* JADX INFO: renamed from: d */
    public final C1757q m8467d() {
        return this.f10025i;
    }

    /* JADX INFO: renamed from: e */
    public final C1757q m8468e() {
        return m8469f() ? this.f10024h : this.f10026j;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m8469f() {
        return this.f10024h != null;
    }

    /* JADX INFO: renamed from: g */
    public final C1757q m8470g() {
        C1757q c1757q = this.f10025i;
        C1711a.m8012b((c1757q == null || c1757q.f10003i == null) ? false : true);
        C1757q c1757q2 = this.f10025i.f10003i;
        this.f10025i = c1757q2;
        return c1757q2;
    }

    /* JADX INFO: renamed from: h */
    public final C1757q m8471h() {
        C1757q c1757q = this.f10024h;
        if (c1757q != null) {
            if (c1757q == this.f10025i) {
                this.f10025i = c1757q.f10003i;
            }
            c1757q.m8437c();
            int i = this.f10027k - 1;
            this.f10027k = i;
            if (i == 0) {
                this.f10026j = null;
                C1757q c1757q2 = this.f10024h;
                this.f10028l = c1757q2.f9996b;
                this.f10029m = c1757q2.f10002h.f10010a.f9015d;
            }
            this.f10024h = this.f10024h.f10003i;
        } else {
            C1757q c1757q3 = this.f10026j;
            this.f10024h = c1757q3;
            this.f10025i = c1757q3;
        }
        return this.f10024h;
    }
}
