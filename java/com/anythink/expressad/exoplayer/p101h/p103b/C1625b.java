package com.anythink.expressad.exoplayer.p101h.p103b;

import android.util.Log;
import com.anythink.expressad.exoplayer.p094e.C1565d;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1574m;
import com.anythink.expressad.exoplayer.p101h.C1655x;
import com.anythink.expressad.exoplayer.p101h.p103b.C1627d;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1625b implements C1627d.b {

    /* JADX INFO: renamed from: a */
    private static final String f8761a = "BaseMediaChunkOutput";

    /* JADX INFO: renamed from: b */
    private final int[] f8762b;

    /* JADX INFO: renamed from: c */
    private final C1655x[] f8763c;

    public C1625b(int[] iArr, C1655x[] c1655xArr) {
        this.f8762b = iArr;
        this.f8763c = c1655xArr;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.p103b.C1627d.b
    /* JADX INFO: renamed from: a */
    public final InterfaceC1574m mo7305a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f8762b;
            if (i2 >= iArr.length) {
                Log.e(f8761a, "Unmatched track of type: ".concat(String.valueOf(i)));
                return new C1565d();
            }
            if (i == iArr[i2]) {
                return this.f8763c[i2];
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7306a(long j) {
        for (C1655x c1655x : this.f8763c) {
            if (c1655x != null) {
                c1655x.m7537a(j);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int[] m7307a() {
        int[] iArr = new int[this.f8763c.length];
        int i = 0;
        while (true) {
            C1655x[] c1655xArr = this.f8763c;
            if (i >= c1655xArr.length) {
                return iArr;
            }
            if (c1655xArr[i] != null) {
                iArr[i] = c1655xArr[i].m7540b();
            }
            i++;
        }
    }
}
