package com.anythink.expressad.exoplayer.p105j;

import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1695l implements InterfaceC1685b {

    /* JADX INFO: renamed from: a */
    private static final int f9402a = 100;

    /* JADX INFO: renamed from: b */
    private final boolean f9403b;

    /* JADX INFO: renamed from: c */
    private final int f9404c;

    /* JADX INFO: renamed from: d */
    private final byte[] f9405d;

    /* JADX INFO: renamed from: e */
    private final C1669a[] f9406e;

    /* JADX INFO: renamed from: f */
    private int f9407f;

    /* JADX INFO: renamed from: g */
    private int f9408g;

    /* JADX INFO: renamed from: h */
    private int f9409h;

    /* JADX INFO: renamed from: i */
    private C1669a[] f9410i;

    private C1695l() {
        C1711a.m8010a(true);
        C1711a.m8010a(true);
        this.f9403b = true;
        this.f9404c = 65536;
        this.f9409h = 0;
        this.f9410i = new C1669a[100];
        this.f9405d = null;
        this.f9406e = new C1669a[1];
    }

    public C1695l(byte b) {
        this();
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1685b
    /* JADX INFO: renamed from: a */
    public final synchronized C1669a mo7843a() {
        C1669a c1669a;
        this.f9408g++;
        int i = this.f9409h;
        if (i > 0) {
            C1669a[] c1669aArr = this.f9410i;
            int i2 = i - 1;
            this.f9409h = i2;
            c1669a = c1669aArr[i2];
            c1669aArr[i2] = null;
        } else {
            c1669a = new C1669a(new byte[this.f9404c]);
        }
        return c1669a;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7859a(int i) {
        boolean z = i < this.f9407f;
        this.f9407f = i;
        if (z) {
            mo7846b();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1685b
    /* JADX INFO: renamed from: a */
    public final synchronized void mo7844a(C1669a c1669a) {
        C1669a[] c1669aArr = this.f9406e;
        c1669aArr[0] = c1669a;
        mo7845a(c1669aArr);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1685b
    /* JADX INFO: renamed from: a */
    public final synchronized void mo7845a(C1669a[] c1669aArr) {
        int i = this.f9409h;
        int length = c1669aArr.length + i;
        C1669a[] c1669aArr2 = this.f9410i;
        if (length >= c1669aArr2.length) {
            this.f9410i = (C1669a[]) Arrays.copyOf(c1669aArr2, Math.max(c1669aArr2.length * 2, i + c1669aArr.length));
        }
        for (C1669a c1669a : c1669aArr) {
            byte[] bArr = c1669a.f9272a;
            if (bArr != this.f9405d && bArr.length != this.f9404c) {
                throw new IllegalArgumentException("Unexpected allocation: " + System.identityHashCode(c1669a.f9272a) + ", " + System.identityHashCode(this.f9405d) + ", " + c1669a.f9272a.length + ", " + this.f9404c);
            }
            C1669a[] c1669aArr3 = this.f9410i;
            int i2 = this.f9409h;
            this.f9409h = i2 + 1;
            c1669aArr3[i2] = c1669a;
        }
        this.f9408g -= c1669aArr.length;
        notifyAll();
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1685b
    /* JADX INFO: renamed from: b */
    public final synchronized void mo7846b() {
        int i = 0;
        int iMax = Math.max(0, C1717af.m8049a(this.f9407f, this.f9404c) - this.f9408g);
        int i2 = this.f9409h;
        if (iMax >= i2) {
            return;
        }
        if (this.f9405d != null) {
            int i3 = i2 - 1;
            while (i <= i3) {
                C1669a[] c1669aArr = this.f9410i;
                C1669a c1669a = c1669aArr[i];
                byte[] bArr = c1669a.f9272a;
                byte[] bArr2 = this.f9405d;
                if (bArr == bArr2) {
                    i++;
                } else {
                    C1669a c1669a2 = c1669aArr[i3];
                    if (c1669a2.f9272a != bArr2) {
                        i3--;
                    } else {
                        c1669aArr[i] = c1669a2;
                        c1669aArr[i3] = c1669a;
                        i3--;
                        i++;
                    }
                }
            }
            iMax = Math.max(iMax, i);
            if (iMax >= this.f9409h) {
                return;
            }
        }
        Arrays.fill(this.f9410i, iMax, this.f9409h, (Object) null);
        this.f9409h = iMax;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1685b
    /* JADX INFO: renamed from: c */
    public final synchronized int mo7847c() {
        return this.f9408g * this.f9404c;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1685b
    /* JADX INFO: renamed from: d */
    public final int mo7848d() {
        return this.f9404c;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m7860e() {
        if (this.f9403b) {
            m7859a(0);
        }
    }
}
