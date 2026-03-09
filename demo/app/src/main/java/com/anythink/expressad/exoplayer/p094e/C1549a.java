package com.anythink.expressad.exoplayer.p094e;

import com.anythink.expressad.exoplayer.p094e.InterfaceC1572k;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1549a implements InterfaceC1572k {

    /* JADX INFO: renamed from: a */
    public final int f8031a;

    /* JADX INFO: renamed from: b */
    public final int[] f8032b;

    /* JADX INFO: renamed from: c */
    public final long[] f8033c;

    /* JADX INFO: renamed from: d */
    public final long[] f8034d;

    /* JADX INFO: renamed from: e */
    public final long[] f8035e;

    /* JADX INFO: renamed from: f */
    private final long f8036f;

    public C1549a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f8032b = iArr;
        this.f8033c = jArr;
        this.f8034d = jArr2;
        this.f8035e = jArr3;
        int length = iArr.length;
        this.f8031a = length;
        if (length > 0) {
            this.f8036f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f8036f = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    private int m6819b(long j) {
        return C1717af.m8055a(this.f8035e, j, true);
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1572k
    /* JADX INFO: renamed from: a */
    public final InterfaceC1572k.a mo6820a(long j) {
        int iM8055a = C1717af.m8055a(this.f8035e, j, true);
        C1573l c1573l = new C1573l(this.f8035e[iM8055a], this.f8033c[iM8055a]);
        if (c1573l.f8388b >= j || iM8055a == this.f8031a - 1) {
            return new InterfaceC1572k.a(c1573l);
        }
        int i = iM8055a + 1;
        return new InterfaceC1572k.a(c1573l, new C1573l(this.f8035e[i], this.f8033c[i]));
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1572k
    /* JADX INFO: renamed from: a */
    public final boolean mo6821a() {
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1572k
    /* JADX INFO: renamed from: b */
    public final long mo6822b() {
        return this.f8036f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f8031a + ", sizes=" + Arrays.toString(this.f8032b) + ", offsets=" + Arrays.toString(this.f8033c) + ", timeUs=" + Arrays.toString(this.f8035e) + ", durationsUs=" + Arrays.toString(this.f8034d) + ")";
    }
}
