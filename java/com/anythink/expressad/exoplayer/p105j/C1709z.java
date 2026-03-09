package com.anythink.expressad.exoplayer.p105j;

import android.net.Uri;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1709z implements InterfaceC1691h {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1691h f9541a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1690g f9542b;

    /* JADX INFO: renamed from: c */
    private boolean f9543c;

    /* JADX INFO: renamed from: d */
    private long f9544d;

    public C1709z(InterfaceC1691h interfaceC1691h, InterfaceC1690g interfaceC1690g) {
        this.f9541a = (InterfaceC1691h) C1711a.m8005a(interfaceC1691h);
        this.f9542b = (InterfaceC1690g) C1711a.m8005a(interfaceC1690g);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final int mo7741a(byte[] bArr, int i, int i2) {
        if (this.f9544d == 0) {
            return -1;
        }
        int iMo7741a = this.f9541a.mo7741a(bArr, i, i2);
        if (iMo7741a > 0) {
            this.f9542b.mo7727a(bArr, i, iMo7741a);
            long j = this.f9544d;
            if (j != -1) {
                this.f9544d = j - ((long) iMo7741a);
            }
        }
        return iMo7741a;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final long mo7742a(C1694k c1694k) {
        long jMo7742a = this.f9541a.mo7742a(c1694k);
        this.f9544d = jMo7742a;
        if (jMo7742a == 0) {
            return 0L;
        }
        if (c1694k.f9399g == -1 && jMo7742a != -1) {
            c1694k = new C1694k(c1694k.f9395c, c1694k.f9397e, c1694k.f9398f, jMo7742a, c1694k.f9400h, c1694k.f9401i);
        }
        this.f9543c = true;
        this.f9542b.mo7726a(c1694k);
        return this.f9544d;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final Uri mo7743a() {
        return this.f9541a.mo7743a();
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: b */
    public final void mo7744b() {
        try {
            this.f9541a.mo7744b();
        } finally {
            if (this.f9543c) {
                this.f9543c = false;
                this.f9542b.mo7725a();
            }
        }
    }
}
