package com.anythink.expressad.exoplayer.p094e;

import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1574m;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import java.io.EOFException;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1565d implements InterfaceC1574m {
    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1574m
    /* JADX INFO: renamed from: a */
    public final int mo6981a(InterfaceC1567f interfaceC1567f, int i, boolean z) throws EOFException {
        int iMo6964a = interfaceC1567f.mo6964a(i);
        if (iMo6964a != -1) {
            return iMo6964a;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1574m
    /* JADX INFO: renamed from: a */
    public final void mo6982a(long j, int i, int i2, int i3, InterfaceC1574m.a aVar) {
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1574m
    /* JADX INFO: renamed from: a */
    public final void mo6983a(C1736s c1736s, int i) {
        c1736s.m8274d(i);
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1574m
    /* JADX INFO: renamed from: a */
    public final void mo6984a(C1753m c1753m) {
    }
}
