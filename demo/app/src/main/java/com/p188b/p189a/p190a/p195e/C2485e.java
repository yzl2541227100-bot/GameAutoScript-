package com.p188b.p189a.p190a.p195e;

import com.p188b.p199b.C2582i;
import com.p188b.p199b.C2587n;
import com.p188b.p199b.InterfaceC2581h;
import com.p188b.p199b.InterfaceC2597x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.b.a.a.e.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2485e {

    /* JADX INFO: renamed from: a */
    public C2483c[] f15305a;

    /* JADX INFO: renamed from: b */
    public int f15306b;

    /* JADX INFO: renamed from: c */
    public int f15307c;

    /* JADX INFO: renamed from: d */
    public int f15308d;

    /* JADX INFO: renamed from: e */
    private final List<C2483c> f15309e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC2581h f15310f;

    /* JADX INFO: renamed from: g */
    private final int f15311g;

    /* JADX INFO: renamed from: h */
    private int f15312h;

    public C2485e(InterfaceC2597x interfaceC2597x) {
        this(interfaceC2597x, (byte) 0);
    }

    private C2485e(InterfaceC2597x interfaceC2597x, byte b) {
        this.f15309e = new ArrayList();
        this.f15305a = new C2483c[8];
        this.f15306b = r2.length - 1;
        this.f15307c = 0;
        this.f15308d = 0;
        this.f15311g = 4096;
        this.f15312h = 4096;
        this.f15310f = C2587n.m13072a(interfaceC2597x);
    }

    /* JADX INFO: renamed from: a */
    private int m12699a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f15305a.length;
            while (true) {
                length--;
                i2 = this.f15306b;
                if (length < i2 || i <= 0) {
                    break;
                }
                C2483c[] c2483cArr = this.f15305a;
                i -= c2483cArr[length].f15302i;
                this.f15308d -= c2483cArr[length].f15302i;
                this.f15307c--;
                i3++;
            }
            C2483c[] c2483cArr2 = this.f15305a;
            System.arraycopy(c2483cArr2, i2 + 1, c2483cArr2, i2 + 1 + i3, this.f15307c);
            this.f15306b += i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: a */
    private int m12700a(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int iM12707e = m12707e();
            if ((iM12707e & 128) == 0) {
                return i2 + (iM12707e << i4);
            }
            i2 += (iM12707e & 127) << i4;
            i4 += 7;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m12701a(C2483c c2483c) {
        this.f15309e.add(c2483c);
        int i = c2483c.f15302i;
        int i2 = this.f15312h;
        if (i > i2) {
            m12705d();
            return;
        }
        m12699a((this.f15308d + i) - i2);
        int i3 = this.f15307c + 1;
        C2483c[] c2483cArr = this.f15305a;
        if (i3 > c2483cArr.length) {
            C2483c[] c2483cArr2 = new C2483c[c2483cArr.length * 2];
            System.arraycopy(c2483cArr, 0, c2483cArr2, c2483cArr.length, c2483cArr.length);
            this.f15306b = this.f15305a.length - 1;
            this.f15305a = c2483cArr2;
        }
        int i4 = this.f15306b;
        this.f15306b = i4 - 1;
        this.f15305a[i4] = c2483c;
        this.f15307c++;
        this.f15308d += i;
    }

    /* JADX INFO: renamed from: b */
    private int m12702b(int i) {
        return this.f15306b + 1 + i;
    }

    /* JADX INFO: renamed from: c */
    private C2582i m12703c(int i) {
        return (m12706d(i) ? C2484d.f15303a[i] : this.f15305a[m12702b(i - C2484d.f15303a.length)]).f15300g;
    }

    /* JADX INFO: renamed from: c */
    private void m12704c() {
        int i = this.f15312h;
        int i2 = this.f15308d;
        if (i < i2) {
            if (i == 0) {
                m12705d();
            } else {
                m12699a(i2 - i);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m12705d() {
        Arrays.fill(this.f15305a, (Object) null);
        this.f15306b = this.f15305a.length - 1;
        this.f15307c = 0;
        this.f15308d = 0;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m12706d(int i) {
        return i >= 0 && i <= C2484d.f15303a.length - 1;
    }

    /* JADX INFO: renamed from: e */
    private int m12707e() {
        return this.f15310f.mo13018e() & 255;
    }

    /* JADX INFO: renamed from: f */
    private C2582i m12708f() {
        int iM12707e = m12707e();
        boolean z = (iM12707e & 128) == 128;
        int iM12700a = m12700a(iM12707e, 127);
        return z ? C2582i.m13042a(C2475ag.m12678a().m12681a(this.f15310f.mo13020e(iM12700a))) : this.f15310f.mo13014c(iM12700a);
    }

    /* JADX INFO: renamed from: a */
    public final void m12709a() throws IOException {
        C2483c c2483c;
        List<C2483c> list;
        C2483c c2483c2;
        while (!this.f15310f.mo13017d()) {
            int iMo13018e = this.f15310f.mo13018e() & 255;
            if (iMo13018e == 128) {
                throw new IOException("index == 0");
            }
            if ((iMo13018e & 128) == 128) {
                int iM12700a = m12700a(iMo13018e, 127) - 1;
                if (!m12706d(iM12700a)) {
                    int iM12702b = m12702b(iM12700a - C2484d.f15303a.length);
                    if (iM12702b >= 0) {
                        C2483c[] c2483cArr = this.f15305a;
                        if (iM12702b <= c2483cArr.length - 1) {
                            this.f15309e.add(c2483cArr[iM12702b]);
                        }
                    }
                    throw new IOException("Header index too large " + (iM12700a + 1));
                }
                this.f15309e.add(C2484d.f15303a[iM12700a]);
            } else {
                if (iMo13018e == 64) {
                    c2483c = new C2483c(C2484d.m12698a(m12708f()), m12708f());
                } else if ((iMo13018e & 64) == 64) {
                    c2483c = new C2483c(m12703c(m12700a(iMo13018e, 63) - 1), m12708f());
                } else if ((iMo13018e & 32) == 32) {
                    int iM12700a2 = m12700a(iMo13018e, 31);
                    this.f15312h = iM12700a2;
                    if (iM12700a2 < 0 || iM12700a2 > this.f15311g) {
                        throw new IOException("Invalid dynamic table size update " + this.f15312h);
                    }
                    m12704c();
                } else {
                    if (iMo13018e == 16 || iMo13018e == 0) {
                        C2582i c2582iM12698a = C2484d.m12698a(m12708f());
                        C2582i c2582iM12708f = m12708f();
                        list = this.f15309e;
                        c2483c2 = new C2483c(c2582iM12698a, c2582iM12708f);
                    } else {
                        C2582i c2582iM12703c = m12703c(m12700a(iMo13018e, 15) - 1);
                        C2582i c2582iM12708f2 = m12708f();
                        list = this.f15309e;
                        c2483c2 = new C2483c(c2582iM12703c, c2582iM12708f2);
                    }
                    list.add(c2483c2);
                }
                m12701a(c2483c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final List<C2483c> m12710b() {
        ArrayList arrayList = new ArrayList(this.f15309e);
        this.f15309e.clear();
        return arrayList;
    }
}
