package com.anythink.expressad.exoplayer.p108l;

import com.anythink.expressad.exoplayer.C1763t;
import com.anythink.expressad.exoplayer.p107k.C1721d;
import com.anythink.expressad.exoplayer.p107k.C1733p;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.l.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1745a {

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f9835a;

    /* JADX INFO: renamed from: b */
    public final int f9836b;

    /* JADX INFO: renamed from: c */
    public final int f9837c;

    /* JADX INFO: renamed from: d */
    public final int f9838d;

    /* JADX INFO: renamed from: e */
    public final float f9839e;

    private C1745a(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f9835a = list;
        this.f9836b = i;
        this.f9837c = i2;
        this.f9838d = i3;
        this.f9839e = f;
    }

    /* JADX INFO: renamed from: a */
    public static C1745a m8319a(C1736s c1736s) throws C1763t {
        int i;
        int i2;
        float f;
        try {
            c1736s.m8274d(4);
            int iM8273d = (c1736s.m8273d() & 3) + 1;
            if (iM8273d == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM8273d2 = c1736s.m8273d() & 31;
            for (int i3 = 0; i3 < iM8273d2; i3++) {
                arrayList.add(m8320b(c1736s));
            }
            int iM8273d3 = c1736s.m8273d();
            for (int i4 = 0; i4 < iM8273d3; i4++) {
                arrayList.add(m8320b(c1736s));
            }
            if (iM8273d2 > 0) {
                C1733p.b bVarM8217a = C1733p.m8217a((byte[]) arrayList.get(0), iM8273d, ((byte[]) arrayList.get(0)).length);
                int i5 = bVarM8217a.f9773b;
                int i6 = bVarM8217a.f9774c;
                f = bVarM8217a.f9775d;
                i = i5;
                i2 = i6;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new C1745a(arrayList, iM8273d, i, i2, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C1763t("Error parsing AVC config", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m8320b(C1736s c1736s) {
        int iM8275e = c1736s.m8275e();
        int iM8271c = c1736s.m8271c();
        c1736s.m8274d(iM8275e);
        return C1721d.m8144a(c1736s.f9792a, iM8271c, iM8275e);
    }
}
