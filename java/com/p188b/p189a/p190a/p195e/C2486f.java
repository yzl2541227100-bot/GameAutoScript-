package com.p188b.p189a.p190a.p195e;

import com.p188b.p199b.C2579f;
import java.util.Arrays;

/* JADX INFO: renamed from: com.b.a.a.e.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2486f {

    /* JADX INFO: renamed from: a */
    public int f15313a;

    /* JADX INFO: renamed from: b */
    public int f15314b;

    /* JADX INFO: renamed from: c */
    public C2483c[] f15315c;

    /* JADX INFO: renamed from: d */
    public int f15316d;

    /* JADX INFO: renamed from: e */
    public int f15317e;

    /* JADX INFO: renamed from: f */
    public int f15318f;

    /* JADX INFO: renamed from: g */
    private final C2579f f15319g;

    /* JADX INFO: renamed from: h */
    private final boolean f15320h;

    /* JADX INFO: renamed from: i */
    private int f15321i;

    /* JADX INFO: renamed from: j */
    private boolean f15322j;

    public C2486f(C2579f c2579f) {
        this(c2579f, (byte) 0);
    }

    private C2486f(C2579f c2579f, byte b) {
        this.f15321i = Integer.MAX_VALUE;
        C2483c[] c2483cArr = new C2483c[8];
        this.f15315c = c2483cArr;
        this.f15316d = c2483cArr.length - 1;
        this.f15317e = 0;
        this.f15318f = 0;
        this.f15313a = 4096;
        this.f15314b = 4096;
        this.f15320h = true;
        this.f15319g = c2579f;
    }

    /* JADX INFO: renamed from: a */
    private void m12711a() {
        Arrays.fill(this.f15315c, (Object) null);
        this.f15316d = this.f15315c.length - 1;
        this.f15317e = 0;
        this.f15318f = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m12712a(int i, int i2, int i3) {
        int i4;
        C2579f c2579f;
        if (i < i2) {
            c2579f = this.f15319g;
            i4 = i | i3;
        } else {
            this.f15319g.mo13028h(i3 | i2);
            i4 = i - i2;
            while (i4 >= 128) {
                this.f15319g.mo13028h(128 | (i4 & 127));
                i4 >>>= 7;
            }
            c2579f = this.f15319g;
        }
        c2579f.mo13028h(i4);
    }

    /* JADX INFO: renamed from: a */
    private void m12713a(C2483c c2483c) {
        int i = c2483c.f15302i;
        int i2 = this.f15314b;
        if (i > i2) {
            m12711a();
            return;
        }
        m12715b((this.f15318f + i) - i2);
        int i3 = this.f15317e + 1;
        C2483c[] c2483cArr = this.f15315c;
        if (i3 > c2483cArr.length) {
            C2483c[] c2483cArr2 = new C2483c[c2483cArr.length * 2];
            System.arraycopy(c2483cArr, 0, c2483cArr2, c2483cArr.length, c2483cArr.length);
            this.f15316d = this.f15315c.length - 1;
            this.f15315c = c2483cArr2;
        }
        int i4 = this.f15316d;
        this.f15316d = i4 - 1;
        this.f15315c[i4] = c2483c;
        this.f15317e++;
        this.f15318f += i;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m12714a(com.p188b.p199b.C2582i r4) {
        /*
            r3 = this;
            boolean r0 = r3.f15320h
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 == 0) goto L31
            com.p188b.p189a.p190a.p195e.C2475ag.m12678a()
            int r0 = com.p188b.p189a.p190a.p195e.C2475ag.m12677a(r4)
            int r2 = r4.mo13056g()
            if (r0 >= r2) goto L31
            com.b.b.f r0 = new com.b.b.f
            r0.<init>()
            com.p188b.p189a.p190a.p195e.C2475ag.m12678a()
            com.p188b.p189a.p190a.p195e.C2475ag.m12679a(r4, r0)
            com.b.b.i r4 = r0.m13034k()
            int r0 = r4.mo13056g()
            r2 = 128(0x80, float:1.8E-43)
        L28:
            r3.m12712a(r0, r1, r2)
            com.b.b.f r0 = r3.f15319g
            r0.m12998a(r4)
            return
        L31:
            int r0 = r4.mo13056g()
            r2 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.p190a.p195e.C2486f.m12714a(com.b.b.i):void");
    }

    /* JADX INFO: renamed from: b */
    private int m12715b(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f15315c.length;
            while (true) {
                length--;
                i2 = this.f15316d;
                if (length < i2 || i <= 0) {
                    break;
                }
                C2483c[] c2483cArr = this.f15315c;
                i -= c2483cArr[length].f15302i;
                this.f15318f -= c2483cArr[length].f15302i;
                this.f15317e--;
                i3++;
            }
            C2483c[] c2483cArr2 = this.f15315c;
            System.arraycopy(c2483cArr2, i2 + 1, c2483cArr2, i2 + 1 + i3, this.f15317e);
            C2483c[] c2483cArr3 = this.f15315c;
            int i4 = this.f15316d;
            Arrays.fill(c2483cArr3, i4 + 1, i4 + 1 + i3, (Object) null);
            this.f15316d += i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: a */
    public final void m12716a(int i) {
        this.f15313a = i;
        int iMin = Math.min(i, 16384);
        int i2 = this.f15314b;
        if (i2 == iMin) {
            return;
        }
        if (iMin < i2) {
            this.f15321i = Math.min(this.f15321i, iMin);
        }
        this.f15322j = true;
        this.f15314b = iMin;
        int i3 = this.f15318f;
        if (iMin < i3) {
            if (iMin == 0) {
                m12711a();
            } else {
                m12715b(i3 - iMin);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12717a(java.util.List<com.p188b.p189a.p190a.p195e.C2483c> r14) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.p190a.p195e.C2486f.m12717a(java.util.List):void");
    }
}
