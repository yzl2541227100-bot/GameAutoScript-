package com.anythink.expressad.exoplayer.p108l;

import com.anythink.expressad.exoplayer.C1763t;
import com.anythink.expressad.exoplayer.p107k.C1733p;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.l.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1748d {

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f9860a;

    /* JADX INFO: renamed from: b */
    public final int f9861b;

    private C1748d(List<byte[]> list, int i) {
        this.f9860a = list;
        this.f9861b = i;
    }

    /* JADX INFO: renamed from: a */
    public static C1748d m8331a(C1736s c1736s) throws C1763t {
        try {
            c1736s.m8274d(21);
            int iM8273d = c1736s.m8273d() & 3;
            int iM8273d2 = c1736s.m8273d();
            int iM8271c = c1736s.m8271c();
            int i = 0;
            for (int i2 = 0; i2 < iM8273d2; i2++) {
                c1736s.m8274d(1);
                int iM8275e = c1736s.m8275e();
                for (int i3 = 0; i3 < iM8275e; i3++) {
                    int iM8275e2 = c1736s.m8275e();
                    i += iM8275e2 + 4;
                    c1736s.m8274d(iM8275e2);
                }
            }
            c1736s.m8272c(iM8271c);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < iM8273d2; i5++) {
                c1736s.m8274d(1);
                int iM8275e3 = c1736s.m8275e();
                for (int i6 = 0; i6 < iM8275e3; i6++) {
                    int iM8275e4 = c1736s.m8275e();
                    byte[] bArr2 = C1733p.f9760a;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    System.arraycopy(c1736s.f9792a, c1736s.m8271c(), bArr, length, iM8275e4);
                    i4 = length + iM8275e4;
                    c1736s.m8274d(iM8275e4);
                }
            }
            return new C1748d(i == 0 ? null : Collections.singletonList(bArr), iM8273d + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C1763t("Error parsing HEVC config", e);
        }
    }
}
