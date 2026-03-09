package com.anythink.expressad.exoplayer;

import android.util.Log;
import com.anythink.expressad.exoplayer.p101h.C1621af;
import com.anythink.expressad.exoplayer.p101h.C1635d;
import com.anythink.expressad.exoplayer.p101h.C1644m;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1649r;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1656y;
import com.anythink.expressad.exoplayer.p104i.AbstractC1666h;
import com.anythink.expressad.exoplayer.p104i.C1665g;
import com.anythink.expressad.exoplayer.p104i.C1667i;
import com.anythink.expressad.exoplayer.p104i.InterfaceC1664f;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1685b;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1757q {

    /* JADX INFO: renamed from: l */
    private static final String f9994l = "MediaPeriodHolder";

    /* JADX INFO: renamed from: a */
    public final InterfaceC1649r f9995a;

    /* JADX INFO: renamed from: b */
    public final Object f9996b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1656y[] f9997c;

    /* JADX INFO: renamed from: d */
    public final boolean[] f9998d;

    /* JADX INFO: renamed from: e */
    public long f9999e;

    /* JADX INFO: renamed from: f */
    public boolean f10000f;

    /* JADX INFO: renamed from: g */
    public boolean f10001g;

    /* JADX INFO: renamed from: h */
    public C1758r f10002h;

    /* JADX INFO: renamed from: i */
    public C1757q f10003i;

    /* JADX INFO: renamed from: j */
    public C1621af f10004j;

    /* JADX INFO: renamed from: k */
    public C1667i f10005k;

    /* JADX INFO: renamed from: m */
    private final InterfaceC1769z[] f10006m;

    /* JADX INFO: renamed from: n */
    private final AbstractC1666h f10007n;

    /* JADX INFO: renamed from: o */
    private final InterfaceC1650s f10008o;

    /* JADX INFO: renamed from: p */
    private C1667i f10009p;

    public C1757q(InterfaceC1769z[] interfaceC1769zArr, long j, AbstractC1666h abstractC1666h, InterfaceC1685b interfaceC1685b, InterfaceC1650s interfaceC1650s, Object obj, C1758r c1758r) {
        this.f10006m = interfaceC1769zArr;
        this.f9999e = j - c1758r.f10011b;
        this.f10007n = abstractC1666h;
        this.f10008o = interfaceC1650s;
        this.f9996b = C1711a.m8005a(obj);
        this.f10002h = c1758r;
        this.f9997c = new InterfaceC1656y[interfaceC1769zArr.length];
        this.f9998d = new boolean[interfaceC1769zArr.length];
        InterfaceC1649r interfaceC1649rMo7225a = interfaceC1650s.mo7225a(c1758r.f10010a, interfaceC1685b);
        long j2 = c1758r.f10012c;
        this.f9995a = j2 != Long.MIN_VALUE ? new C1635d(interfaceC1649rMo7225a, true, 0L, j2) : interfaceC1649rMo7225a;
    }

    /* JADX INFO: renamed from: a */
    private void m8419a(C1667i c1667i) {
        C1667i c1667i2 = this.f10009p;
        if (c1667i2 != null) {
            m8425c(c1667i2);
        }
        this.f10009p = c1667i;
        if (c1667i != null) {
            m8422b(c1667i);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m8420a(InterfaceC1656y[] interfaceC1656yArr) {
        int i = 0;
        while (true) {
            InterfaceC1769z[] interfaceC1769zArr = this.f10006m;
            if (i >= interfaceC1769zArr.length) {
                return;
            }
            if (interfaceC1769zArr[i].mo6122a() == 5) {
                interfaceC1656yArr[i] = null;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m8421b(float f) {
        this.f10000f = true;
        this.f10004j = this.f9995a.mo7270b();
        m8434a(f);
        long jM8436b = m8436b(this.f10002h.f10011b);
        long j = this.f9999e;
        C1758r c1758r = this.f10002h;
        this.f9999e = j + (c1758r.f10011b - jM8436b);
        this.f10002h = new C1758r(c1758r.f10010a, jM8436b, c1758r.f10012c, c1758r.f10013d, c1758r.f10014e, c1758r.f10015f, c1758r.f10016g);
    }

    /* JADX INFO: renamed from: b */
    private static void m8422b(C1667i c1667i) {
        for (int i = 0; i < c1667i.f9232a; i++) {
            boolean zM7692a = c1667i.m7692a(i);
            InterfaceC1664f interfaceC1664fM7687a = c1667i.f9234c.m7687a(i);
            if (zM7692a && interfaceC1664fM7687a != null) {
                interfaceC1664fM7687a.mo7569a();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m8423b(InterfaceC1656y[] interfaceC1656yArr) {
        int i = 0;
        while (true) {
            InterfaceC1769z[] interfaceC1769zArr = this.f10006m;
            if (i >= interfaceC1769zArr.length) {
                return;
            }
            if (interfaceC1769zArr[i].mo6122a() == 5 && this.f10005k.m7692a(i)) {
                interfaceC1656yArr[i] = new C1644m();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    private long m8424c(long j) {
        return j + this.f9999e;
    }

    /* JADX INFO: renamed from: c */
    private static void m8425c(C1667i c1667i) {
        for (int i = 0; i < c1667i.f9232a; i++) {
            c1667i.m7692a(i);
            c1667i.f9234c.m7687a(i);
        }
    }

    /* JADX INFO: renamed from: d */
    private long m8426d() {
        return this.f9999e;
    }

    /* JADX INFO: renamed from: d */
    private long m8427d(long j) {
        return j - this.f9999e;
    }

    /* JADX INFO: renamed from: e */
    private long m8428e() {
        return this.f10002h.f10014e;
    }

    /* JADX INFO: renamed from: e */
    private void m8429e(long j) {
        if (this.f10000f) {
            this.f9995a.mo7268a_(j - this.f9999e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m8430a(long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            C1667i c1667i = this.f10005k;
            boolean z3 = true;
            if (i >= c1667i.f9232a) {
                break;
            }
            boolean[] zArr2 = this.f9998d;
            if (z || !c1667i.m7694a(this.f10009p, i)) {
                z3 = false;
            }
            zArr2[i] = z3;
            i++;
        }
        m8420a(this.f9997c);
        m8419a(this.f10005k);
        C1665g c1665g = this.f10005k.f9234c;
        long jMo7262a = this.f9995a.mo7262a(c1665g.m7688a(), this.f9998d, this.f9997c, zArr, j);
        m8423b(this.f9997c);
        this.f10001g = false;
        int i2 = 0;
        while (true) {
            InterfaceC1656y[] interfaceC1656yArr = this.f9997c;
            if (i2 >= interfaceC1656yArr.length) {
                return jMo7262a;
            }
            if (interfaceC1656yArr[i2] != null) {
                C1711a.m8012b(this.f10005k.m7692a(i2));
                if (this.f10006m[i2].mo6122a() != 5) {
                    this.f10001g = true;
                }
            } else {
                C1711a.m8012b(c1665g.m7687a(i2) == null);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m8431a(boolean z) {
        if (!this.f10000f) {
            return this.f10002h.f10011b;
        }
        long jMo7273d = this.f9995a.mo7273d();
        return (jMo7273d == Long.MIN_VALUE && z) ? this.f10002h.f10014e : jMo7273d;
    }

    /* JADX INFO: renamed from: a */
    public final void m8432a(long j) {
        this.f9995a.mo7272c(j - this.f9999e);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8433a() {
        if (this.f10000f) {
            return !this.f10001g || this.f9995a.mo7273d() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8434a(float f) {
        C1667i c1667iMo7673a = this.f10007n.mo7673a(this.f10006m, this.f10004j);
        if (c1667iMo7673a.m7693a(this.f10009p)) {
            return false;
        }
        this.f10005k = c1667iMo7673a;
        for (InterfaceC1664f interfaceC1664f : c1667iMo7673a.f9234c.m7688a()) {
            if (interfaceC1664f != null) {
                interfaceC1664f.mo7570a(f);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final long m8435b() {
        if (this.f10000f) {
            return this.f9995a.mo7274e();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public final long m8436b(long j) {
        return m8430a(j, false, new boolean[this.f10006m.length]);
    }

    /* JADX INFO: renamed from: c */
    public final void m8437c() {
        m8419a((C1667i) null);
        try {
            if (this.f10002h.f10012c != Long.MIN_VALUE) {
                this.f10008o.mo7228a(((C1635d) this.f9995a).f8830a);
            } else {
                this.f10008o.mo7228a(this.f9995a);
            }
        } catch (RuntimeException e) {
            Log.e(f9994l, "Period release failed.", e);
        }
    }
}
