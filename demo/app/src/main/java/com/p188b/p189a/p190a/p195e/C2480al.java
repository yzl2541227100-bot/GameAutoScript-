package com.p188b.p189a.p190a.p195e;

/* JADX INFO: renamed from: com.b.a.a.e.al */
/* JADX INFO: loaded from: classes.dex */
public final class C2480al {

    /* JADX INFO: renamed from: a */
    private int f15283a;

    /* JADX INFO: renamed from: b */
    private final int[] f15284b = new int[10];

    /* JADX INFO: renamed from: a */
    public final int m12689a() {
        return Integer.bitCount(this.f15283a);
    }

    /* JADX INFO: renamed from: a */
    public final C2480al m12690a(int i, int i2) {
        int[] iArr = this.f15284b;
        if (i >= iArr.length) {
            return this;
        }
        this.f15283a = (1 << i) | this.f15283a;
        iArr[i] = i2;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12691a(int i) {
        return ((1 << i) & this.f15283a) != 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m12692b() {
        if ((this.f15283a & 2) != 0) {
            return this.f15284b[1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final int m12693b(int i) {
        return this.f15284b[i];
    }

    /* JADX INFO: renamed from: c */
    public final int m12694c() {
        if ((this.f15283a & 16) != 0) {
            return this.f15284b[4];
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: c */
    public final int m12695c(int i) {
        return (this.f15283a & 32) != 0 ? this.f15284b[5] : i;
    }

    /* JADX INFO: renamed from: d */
    public final int m12696d() {
        if ((this.f15283a & 128) != 0) {
            return this.f15284b[7];
        }
        return 65535;
    }
}
