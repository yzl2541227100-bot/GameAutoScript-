package com.p188b.p199b;

/* JADX INFO: renamed from: com.b.b.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2593t {

    /* JADX INFO: renamed from: a */
    public final byte[] f15849a;

    /* JADX INFO: renamed from: b */
    public int f15850b;

    /* JADX INFO: renamed from: c */
    public int f15851c;

    /* JADX INFO: renamed from: d */
    public boolean f15852d;

    /* JADX INFO: renamed from: e */
    public boolean f15853e;

    /* JADX INFO: renamed from: f */
    public C2593t f15854f;

    /* JADX INFO: renamed from: g */
    public C2593t f15855g;

    public C2593t() {
        this.f15849a = new byte[8192];
        this.f15853e = true;
        this.f15852d = false;
    }

    public C2593t(C2593t c2593t) {
        this(c2593t.f15849a, c2593t.f15850b, c2593t.f15851c);
        c2593t.f15852d = true;
    }

    public C2593t(byte[] bArr, int i, int i2) {
        this.f15849a = bArr;
        this.f15850b = i;
        this.f15851c = i2;
        this.f15853e = false;
        this.f15852d = true;
    }

    /* JADX INFO: renamed from: a */
    public final C2593t m13078a() {
        C2593t c2593t = this.f15854f;
        C2593t c2593t2 = c2593t != this ? c2593t : null;
        C2593t c2593t3 = this.f15855g;
        c2593t3.f15854f = c2593t;
        this.f15854f.f15855g = c2593t3;
        this.f15854f = null;
        this.f15855g = null;
        return c2593t2;
    }

    /* JADX INFO: renamed from: a */
    public final C2593t m13079a(C2593t c2593t) {
        c2593t.f15855g = this;
        c2593t.f15854f = this.f15854f;
        this.f15854f.f15855g = c2593t;
        this.f15854f = c2593t;
        return c2593t;
    }

    /* JADX INFO: renamed from: a */
    public final void m13080a(C2593t c2593t, int i) {
        if (!c2593t.f15853e) {
            throw new IllegalArgumentException();
        }
        int i2 = c2593t.f15851c;
        if (i2 + i > 8192) {
            if (c2593t.f15852d) {
                throw new IllegalArgumentException();
            }
            int i3 = c2593t.f15850b;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c2593t.f15849a;
            System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
            c2593t.f15851c -= c2593t.f15850b;
            c2593t.f15850b = 0;
        }
        System.arraycopy(this.f15849a, this.f15850b, c2593t.f15849a, c2593t.f15851c, i);
        c2593t.f15851c += i;
        this.f15850b += i;
    }
}
