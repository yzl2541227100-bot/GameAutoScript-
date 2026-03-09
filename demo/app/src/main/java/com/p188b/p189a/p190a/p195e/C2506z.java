package com.p188b.p189a.p190a.p195e;

import com.p188b.p199b.C2579f;
import com.p188b.p199b.C2598y;
import com.p188b.p199b.InterfaceC2581h;
import com.p188b.p199b.InterfaceC2597x;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.b.a.a.e.z */
/* JADX INFO: loaded from: classes.dex */
public final class C2506z implements InterfaceC2597x {

    /* JADX INFO: renamed from: a */
    public int f15410a;

    /* JADX INFO: renamed from: b */
    public byte f15411b;

    /* JADX INFO: renamed from: c */
    public int f15412c;

    /* JADX INFO: renamed from: d */
    public int f15413d;

    /* JADX INFO: renamed from: e */
    public short f15414e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC2581h f15415f;

    public C2506z(InterfaceC2581h interfaceC2581h) {
        this.f15415f = interfaceC2581h;
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final long mo12513a(C2579f c2579f, long j) throws IOException {
        int i;
        int iMo13024g;
        do {
            int i2 = this.f15413d;
            if (i2 != 0) {
                long jMo12513a = this.f15415f.mo12513a(c2579f, Math.min(j, i2));
                if (jMo12513a == -1) {
                    return -1L;
                }
                this.f15413d = (int) (((long) this.f15413d) - jMo12513a);
                return jMo12513a;
            }
            this.f15415f.mo13023f(this.f15414e);
            this.f15414e = (short) 0;
            if ((this.f15411b & 4) != 0) {
                return -1L;
            }
            i = this.f15412c;
            int iM12743a = C2505y.m12743a(this.f15415f);
            this.f15413d = iM12743a;
            this.f15410a = iM12743a;
            byte bMo13018e = (byte) (this.f15415f.mo13018e() & 255);
            this.f15411b = (byte) (this.f15415f.mo13018e() & 255);
            Logger logger = C2505y.f15405a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C2487g.m12719a(true, this.f15412c, this.f15410a, bMo13018e, this.f15411b));
            }
            iMo13024g = this.f15415f.mo13024g() & Integer.MAX_VALUE;
            this.f15412c = iMo13024g;
            if (bMo13018e != 9) {
                throw C2487g.m12720b("%s != TYPE_CONTINUATION", Byte.valueOf(bMo13018e));
            }
        } while (iMo13024g == i);
        throw C2487g.m12720b("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final C2598y mo12514a() {
        return this.f15415f.mo12514a();
    }

    @Override // com.p188b.p199b.InterfaceC2597x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
