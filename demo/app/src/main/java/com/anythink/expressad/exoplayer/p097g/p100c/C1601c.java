package com.anythink.expressad.exoplayer.p097g.p100c;

import com.anythink.expressad.exoplayer.p097g.C1582a;
import com.anythink.expressad.exoplayer.p097g.C1607e;
import com.anythink.expressad.exoplayer.p097g.InterfaceC1585b;
import com.anythink.expressad.exoplayer.p107k.C1714ac;
import com.anythink.expressad.exoplayer.p107k.C1735r;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.c.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1601c implements InterfaceC1585b {

    /* JADX INFO: renamed from: a */
    private static final int f8570a = 0;

    /* JADX INFO: renamed from: b */
    private static final int f8571b = 4;

    /* JADX INFO: renamed from: c */
    private static final int f8572c = 5;

    /* JADX INFO: renamed from: d */
    private static final int f8573d = 6;

    /* JADX INFO: renamed from: e */
    private static final int f8574e = 255;

    /* JADX INFO: renamed from: f */
    private final C1736s f8575f = new C1736s();

    /* JADX INFO: renamed from: g */
    private final C1735r f8576g = new C1735r();

    /* JADX INFO: renamed from: h */
    private C1714ac f8577h;

    @Override // com.anythink.expressad.exoplayer.p097g.InterfaceC1585b
    /* JADX INFO: renamed from: a */
    public final C1582a mo7091a(C1607e c1607e) {
        C1714ac c1714ac = this.f8577h;
        if (c1714ac == null || c1607e.f8611g != c1714ac.m8036a()) {
            C1714ac c1714ac2 = new C1714ac(c1607e.f7880f);
            this.f8577h = c1714ac2;
            c1714ac2.m8038b(c1607e.f7880f - c1607e.f8611g);
        }
        ByteBuffer byteBuffer = c1607e.f7879e;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f8575f.m8267a(bArrArray, iLimit);
        this.f8576g.m8237a(bArrArray, iLimit);
        this.f8576g.m8239b(39);
        long jM8240c = (((long) this.f8576g.m8240c(1)) << 32) | ((long) this.f8576g.m8240c(32));
        this.f8576g.m8239b(20);
        int iM8240c = this.f8576g.m8240c(12);
        int iM8240c2 = this.f8576g.m8240c(8);
        C1582a.a c1603e = null;
        this.f8575f.m8274d(14);
        if (iM8240c2 == 0) {
            c1603e = new C1603e();
        } else if (iM8240c2 == 255) {
            c1603e = C1599a.m7142a(this.f8575f, iM8240c, jM8240c);
        } else if (iM8240c2 == 4) {
            c1603e = C1604f.m7152a(this.f8575f);
        } else if (iM8240c2 == 5) {
            c1603e = C1602d.m7145a(this.f8575f, jM8240c, this.f8577h);
        } else if (iM8240c2 == 6) {
            c1603e = C1605g.m7166a(this.f8575f, jM8240c, this.f8577h);
        }
        return c1603e == null ? new C1582a(new C1582a.a[0]) : new C1582a(c1603e);
    }
}
