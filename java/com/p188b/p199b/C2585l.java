package com.p188b.p199b;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: com.b.b.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2585l implements InterfaceC2597x {

    /* JADX INFO: renamed from: b */
    private final InterfaceC2581h f15829b;

    /* JADX INFO: renamed from: c */
    private final Inflater f15830c;

    /* JADX INFO: renamed from: d */
    private final C2586m f15831d;

    /* JADX INFO: renamed from: a */
    private int f15828a = 0;

    /* JADX INFO: renamed from: e */
    private final CRC32 f15832e = new CRC32();

    public C2585l(InterfaceC2597x interfaceC2597x) {
        if (interfaceC2597x == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f15830c = inflater;
        InterfaceC2581h interfaceC2581hM13072a = C2587n.m13072a(interfaceC2597x);
        this.f15829b = interfaceC2581hM13072a;
        this.f15831d = new C2586m(interfaceC2581hM13072a, inflater);
    }

    /* JADX INFO: renamed from: a */
    private void m13068a(C2579f c2579f, long j, long j2) {
        C2593t c2593t = c2579f.f15819a;
        while (true) {
            int i = c2593t.f15851c;
            int i2 = c2593t.f15850b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c2593t = c2593t.f15854f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c2593t.f15850b) + j);
            int iMin = (int) Math.min(c2593t.f15851c - i3, j2);
            this.f15832e.update(c2593t.f15849a, i3, iMin);
            j2 -= (long) iMin;
            c2593t = c2593t.f15854f;
            j = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m13069a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final long mo12513a(C2579f c2579f, long j) throws IOException {
        long j2;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return 0L;
        }
        if (this.f15828a == 0) {
            this.f15829b.mo13004a(10L);
            byte bM13005b = this.f15829b.mo13012c().m13005b(3L);
            boolean z = ((bM13005b >> 1) & 1) == 1;
            if (z) {
                m13068a(this.f15829b.mo13012c(), 0L, 10L);
            }
            m13069a("ID1ID2", 8075, this.f15829b.mo13022f());
            this.f15829b.mo13023f(8L);
            if (((bM13005b >> 2) & 1) == 1) {
                this.f15829b.mo13004a(2L);
                if (z) {
                    m13068a(this.f15829b.mo13012c(), 0L, 2L);
                }
                long jMo13029h = this.f15829b.mo13012c().mo13029h();
                this.f15829b.mo13004a(jMo13029h);
                if (z) {
                    j2 = jMo13029h;
                    m13068a(this.f15829b.mo13012c(), 0L, jMo13029h);
                } else {
                    j2 = jMo13029h;
                }
                this.f15829b.mo13023f(j2);
            }
            if (((bM13005b >> 3) & 1) == 1) {
                long jMo12993a = this.f15829b.mo12993a((byte) 0);
                if (jMo12993a == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m13068a(this.f15829b.mo13012c(), 0L, jMo12993a + 1);
                }
                this.f15829b.mo13023f(jMo12993a + 1);
            }
            if (((bM13005b >> 4) & 1) == 1) {
                long jMo12993a2 = this.f15829b.mo12993a((byte) 0);
                if (jMo12993a2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m13068a(this.f15829b.mo13012c(), 0L, jMo12993a2 + 1);
                }
                this.f15829b.mo13023f(jMo12993a2 + 1);
            }
            if (z) {
                m13069a("FHCRC", this.f15829b.mo13029h(), (short) this.f15832e.getValue());
                this.f15832e.reset();
            }
            this.f15828a = 1;
        }
        if (this.f15828a == 1) {
            long j3 = c2579f.f15820b;
            long jMo12513a = this.f15831d.mo12513a(c2579f, j);
            if (jMo12513a != -1) {
                m13068a(c2579f, j3, jMo12513a);
                return jMo12513a;
            }
            this.f15828a = 2;
        }
        if (this.f15828a == 2) {
            m13069a("CRC", this.f15829b.mo13030i(), (int) this.f15832e.getValue());
            m13069a("ISIZE", this.f15829b.mo13030i(), (int) this.f15830c.getBytesWritten());
            this.f15828a = 3;
            if (!this.f15829b.mo13017d()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final C2598y mo12514a() {
        return this.f15829b.mo12514a();
    }

    @Override // com.p188b.p199b.InterfaceC2597x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15831d.close();
    }
}
