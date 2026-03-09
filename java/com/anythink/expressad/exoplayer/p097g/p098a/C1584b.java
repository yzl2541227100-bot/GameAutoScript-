package com.anythink.expressad.exoplayer.p097g.p098a;

import com.anythink.expressad.exoplayer.p097g.C1582a;
import com.anythink.expressad.exoplayer.p097g.C1607e;
import com.anythink.expressad.exoplayer.p097g.InterfaceC1585b;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1584b implements InterfaceC1585b {
    @Override // com.anythink.expressad.exoplayer.p097g.InterfaceC1585b
    /* JADX INFO: renamed from: a */
    public final C1582a mo7091a(C1607e c1607e) {
        ByteBuffer byteBuffer = c1607e.f7879e;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C1736s c1736s = new C1736s(bArrArray, iLimit);
        String strM8287p = c1736s.m8287p();
        String strM8287p2 = c1736s.m8287p();
        long jM8279h = c1736s.m8279h();
        return new C1582a(new C1583a(strM8287p, strM8287p2, C1717af.m8059a(c1736s.m8279h(), 1000L, jM8279h), c1736s.m8279h(), Arrays.copyOfRange(bArrArray, c1736s.m8271c(), iLimit), C1717af.m8059a(c1736s.m8279h(), 1000000L, jM8279h)));
    }
}
