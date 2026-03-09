package com.anythink.expressad.exoplayer.p094e.p095a;

import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1562m {

    /* JADX INFO: renamed from: a */
    public final C1559j f8352a;

    /* JADX INFO: renamed from: b */
    public final int f8353b;

    /* JADX INFO: renamed from: c */
    public final long[] f8354c;

    /* JADX INFO: renamed from: d */
    public final int[] f8355d;

    /* JADX INFO: renamed from: e */
    public final int f8356e;

    /* JADX INFO: renamed from: f */
    public final long[] f8357f;

    /* JADX INFO: renamed from: g */
    public final int[] f8358g;

    /* JADX INFO: renamed from: h */
    public final long f8359h;

    public C1562m(C1559j c1559j, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        C1711a.m8010a(iArr.length == jArr2.length);
        C1711a.m8010a(jArr.length == jArr2.length);
        C1711a.m8010a(iArr2.length == jArr2.length);
        this.f8352a = c1559j;
        this.f8354c = jArr;
        this.f8355d = iArr;
        this.f8356e = i;
        this.f8357f = jArr2;
        this.f8358g = iArr2;
        this.f8359h = j;
        this.f8353b = jArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final int m6956a(long j) {
        for (int iM8055a = C1717af.m8055a(this.f8357f, j, false); iM8055a >= 0; iM8055a--) {
            if ((this.f8358g[iM8055a] & 1) != 0) {
                return iM8055a;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final int m6957b(long j) {
        for (int iM8056a = C1717af.m8056a(this.f8357f, j, true, false); iM8056a < this.f8357f.length; iM8056a++) {
            if ((this.f8358g[iM8056a] & 1) != 0) {
                return iM8056a;
            }
        }
        return -1;
    }
}
