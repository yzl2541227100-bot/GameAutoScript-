package com.p188b.p199b;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: com.b.b.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2586m implements InterfaceC2597x {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2581h f15833a;

    /* JADX INFO: renamed from: b */
    private final Inflater f15834b;

    /* JADX INFO: renamed from: c */
    private int f15835c;

    /* JADX INFO: renamed from: d */
    private boolean f15836d;

    public C2586m(InterfaceC2581h interfaceC2581h, Inflater inflater) {
        if (interfaceC2581h == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f15833a = interfaceC2581h;
        this.f15834b = inflater;
    }

    /* JADX INFO: renamed from: b */
    private void m13070b() {
        int i = this.f15835c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f15834b.getRemaining();
        this.f15835c -= remaining;
        this.f15833a.mo13023f(remaining);
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final long mo12513a(C2579f c2579f, long j) throws IOException {
        boolean z;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (this.f15836d) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        do {
            z = false;
            if (this.f15834b.needsInput()) {
                m13070b();
                if (this.f15834b.getRemaining() != 0) {
                    throw new IllegalStateException("?");
                }
                if (this.f15833a.mo13017d()) {
                    z = true;
                } else {
                    C2593t c2593t = this.f15833a.mo13012c().f15819a;
                    int i = c2593t.f15851c;
                    int i2 = c2593t.f15850b;
                    int i3 = i - i2;
                    this.f15835c = i3;
                    this.f15834b.setInput(c2593t.f15849a, i2, i3);
                }
            }
            try {
                C2593t c2593tM13019e = c2579f.m13019e(1);
                Inflater inflater = this.f15834b;
                byte[] bArr = c2593tM13019e.f15849a;
                int i4 = c2593tM13019e.f15851c;
                int iInflate = inflater.inflate(bArr, i4, 8192 - i4);
                if (iInflate > 0) {
                    c2593tM13019e.f15851c += iInflate;
                    long j2 = iInflate;
                    c2579f.f15820b += j2;
                    return j2;
                }
                if (!this.f15834b.finished() && !this.f15834b.needsDictionary()) {
                }
                m13070b();
                if (c2593tM13019e.f15850b != c2593tM13019e.f15851c) {
                    return -1L;
                }
                c2579f.f15819a = c2593tM13019e.m13078a();
                C2594u.m13082a(c2593tM13019e);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!z);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final C2598y mo12514a() {
        return this.f15833a.mo12514a();
    }

    @Override // com.p188b.p199b.InterfaceC2597x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15836d) {
            return;
        }
        this.f15834b.end();
        this.f15836d = true;
        this.f15833a.close();
    }
}
