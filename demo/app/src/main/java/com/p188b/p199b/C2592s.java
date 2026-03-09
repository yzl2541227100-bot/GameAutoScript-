package com.p188b.p199b;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: renamed from: com.b.b.s */
/* JADX INFO: loaded from: classes.dex */
public final class C2592s implements InterfaceC2581h {

    /* JADX INFO: renamed from: a */
    public final C2579f f15846a = new C2579f();

    /* JADX INFO: renamed from: b */
    public final InterfaceC2597x f15847b;

    /* JADX INFO: renamed from: c */
    public boolean f15848c;

    public C2592s(InterfaceC2597x interfaceC2597x) {
        Objects.requireNonNull(interfaceC2597x, "source == null");
        this.f15847b = interfaceC2597x;
    }

    /* JADX INFO: renamed from: b */
    private boolean m13077b(long j) {
        C2579f c2579f;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (this.f15848c) {
            throw new IllegalStateException("closed");
        }
        do {
            c2579f = this.f15846a;
            if (c2579f.f15820b >= j) {
                return true;
            }
        } while (this.f15847b.mo12513a(c2579f, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: a */
    public final long mo12993a(byte b) {
        if (this.f15848c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            long jM12994a = this.f15846a.m12994a(b, jMax);
            if (jM12994a != -1) {
                return jM12994a;
            }
            C2579f c2579f = this.f15846a;
            long j = c2579f.f15820b;
            if (this.f15847b.mo12513a(c2579f, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final long mo12513a(C2579f c2579f, long j) {
        if (c2579f == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (this.f15848c) {
            throw new IllegalStateException("closed");
        }
        C2579f c2579f2 = this.f15846a;
        if (c2579f2.f15820b == 0 && this.f15847b.mo12513a(c2579f2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.f15846a.mo12513a(c2579f, Math.min(j, this.f15846a.f15820b));
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final C2598y mo12514a() {
        return this.f15847b.mo12514a();
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: a */
    public final String mo13003a(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.f15846a.m12995a(this.f15847b);
        return this.f15846a.mo13003a(charset);
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: a */
    public final void mo13004a(long j) throws EOFException {
        if (!m13077b(j)) {
            throw new EOFException();
        }
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: b */
    public final boolean mo13011b(C2582i c2582i) {
        int iMo13056g = c2582i.mo13056g();
        if (this.f15848c) {
            throw new IllegalStateException("closed");
        }
        if (iMo13056g < 0 || c2582i.mo13056g() - 0 < iMo13056g) {
            return false;
        }
        for (int i = 0; i < iMo13056g; i++) {
            long j = ((long) i) + 0;
            if (!m13077b(1 + j) || this.f15846a.m13005b(j) != c2582i.mo13045a(i + 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: c */
    public final C2579f mo13012c() {
        return this.f15846a;
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: c */
    public final C2582i mo13014c(long j) throws EOFException {
        mo13004a(j);
        return this.f15846a.mo13014c(j);
    }

    @Override // com.p188b.p199b.InterfaceC2597x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15848c) {
            return;
        }
        this.f15848c = true;
        this.f15847b.close();
        this.f15846a.m13038o();
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: d */
    public final boolean mo13017d() {
        if (this.f15848c) {
            throw new IllegalStateException("closed");
        }
        return this.f15846a.mo13017d() && this.f15847b.mo12513a(this.f15846a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: e */
    public final byte mo13018e() throws EOFException {
        mo13004a(1L);
        return this.f15846a.mo13018e();
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: e */
    public final byte[] mo13020e(long j) throws EOFException {
        mo13004a(j);
        return this.f15846a.mo13020e(j);
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: f */
    public final short mo13022f() throws EOFException {
        mo13004a(2L);
        return this.f15846a.mo13022f();
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: f */
    public final void mo13023f(long j) throws EOFException {
        if (this.f15848c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C2579f c2579f = this.f15846a;
            if (c2579f.f15820b == 0 && this.f15847b.mo12513a(c2579f, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.f15846a.f15820b);
            this.f15846a.mo13023f(jMin);
            j -= jMin;
        }
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: g */
    public final int mo13024g() throws EOFException {
        mo13004a(4L);
        return this.f15846a.mo13024g();
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: h */
    public final short mo13029h() throws EOFException {
        mo13004a(2L);
        return C2574aa.m12984a(this.f15846a.mo13022f());
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: i */
    public final int mo13030i() throws EOFException {
        mo13004a(4L);
        return C2574aa.m12983a(this.f15846a.mo13024g());
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: j */
    public final long mo13032j() throws EOFException {
        byte bM13005b;
        mo13004a(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!m13077b(i2)) {
                break;
            }
            bM13005b = this.f15846a.m13005b(i);
            if ((bM13005b < 48 || bM13005b > 57) && ((bM13005b < 97 || bM13005b > 102) && (bM13005b < 65 || bM13005b > 70))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bM13005b)));
        }
        return this.f15846a.mo13032j();
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: m */
    public final String mo13036m() throws EOFException {
        long jMo12993a = mo12993a((byte) 10);
        if (jMo12993a != -1) {
            return this.f15846a.m13016d(jMo12993a);
        }
        C2579f c2579f = new C2579f();
        C2579f c2579f2 = this.f15846a;
        c2579f2.m12997a(c2579f, 0L, Math.min(32L, c2579f2.f15820b));
        throw new EOFException("\\n not found: size=" + this.f15846a.f15820b + " content=" + c2579f.m13034k().mo13054e() + "…");
    }

    public final String toString() {
        return "buffer(" + this.f15847b + ")";
    }
}
