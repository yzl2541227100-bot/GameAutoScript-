package com.anythink.expressad.exoplayer.p107k;

import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1730m {

    /* JADX INFO: renamed from: a */
    private static final int f9690a = 32;

    /* JADX INFO: renamed from: b */
    private int f9691b;

    /* JADX INFO: renamed from: c */
    private long[] f9692c;

    public C1730m() {
        this((byte) 0);
    }

    private C1730m(byte b) {
        this.f9692c = new long[32];
    }

    /* JADX INFO: renamed from: a */
    private int m8196a() {
        return this.f9691b;
    }

    /* JADX INFO: renamed from: a */
    private long m8197a(int i) {
        if (i >= 0 && i < this.f9691b) {
            return this.f9692c[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f9691b);
    }

    /* JADX INFO: renamed from: a */
    private void m8198a(long j) {
        int i = this.f9691b;
        long[] jArr = this.f9692c;
        if (i == jArr.length) {
            this.f9692c = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f9692c;
        int i2 = this.f9691b;
        this.f9691b = i2 + 1;
        jArr2[i2] = j;
    }

    /* JADX INFO: renamed from: b */
    private long[] m8199b() {
        return Arrays.copyOf(this.f9692c, this.f9691b);
    }
}
