package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.C2446c;
import com.p188b.p199b.C2579f;
import com.p188b.p199b.InterfaceC2580g;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.b.a.a.e.af */
/* JADX INFO: loaded from: classes.dex */
public final class C2474af implements Closeable {

    /* JADX INFO: renamed from: b */
    private static final Logger f15265b = Logger.getLogger(C2487g.class.getName());

    /* JADX INFO: renamed from: a */
    public final C2486f f15266a;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2580g f15267c;

    /* JADX INFO: renamed from: d */
    private final boolean f15268d;

    /* JADX INFO: renamed from: e */
    private final C2579f f15269e;

    /* JADX INFO: renamed from: f */
    private int f15270f;

    /* JADX INFO: renamed from: g */
    private boolean f15271g;

    public C2474af(InterfaceC2580g interfaceC2580g, boolean z) {
        this.f15267c = interfaceC2580g;
        this.f15268d = z;
        C2579f c2579f = new C2579f();
        this.f15269e = c2579f;
        this.f15266a = new C2486f(c2579f);
        this.f15270f = 16384;
    }

    /* JADX INFO: renamed from: a */
    private void m12664a(int i, int i2, byte b, byte b2) {
        Logger logger = f15265b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C2487g.m12719a(false, i, i2, b, b2));
        }
        int i3 = this.f15270f;
        if (i2 > i3) {
            throw C2487g.m12718a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw C2487g.m12718a("reserved bit set: %s", Integer.valueOf(i));
        }
        InterfaceC2580g interfaceC2580g = this.f15267c;
        interfaceC2580g.mo13028h((i2 >>> 16) & 255);
        interfaceC2580g.mo13028h((i2 >>> 8) & 255);
        interfaceC2580g.mo13028h(i2 & 255);
        this.f15267c.mo13028h(b & 255);
        this.f15267c.mo13028h(b2 & 255);
        this.f15267c.mo13021f(i & Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: b */
    private void m12665b(int i, long j) {
        while (j > 0) {
            int iMin = (int) Math.min(this.f15270f, j);
            long j2 = iMin;
            j -= j2;
            m12664a(i, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f15267c.mo12633a_(this.f15269e, j2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12666a() {
        if (this.f15271g) {
            throw new IOException("closed");
        }
        if (this.f15268d) {
            Logger logger = f15265b;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C2446c.m12576a(">> CONNECTION %s", C2487g.f15323a.mo13054e()));
            }
            this.f15267c.mo13009b(C2487g.f15323a.mo13057h());
            this.f15267c.flush();
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12667a(int i, long j) {
        if (this.f15271g) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw C2487g.m12718a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
        m12664a(i, 4, (byte) 8, (byte) 0);
        this.f15267c.mo13021f((int) j);
        this.f15267c.flush();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12668a(int i, EnumC2482b enumC2482b) {
        if (this.f15271g) {
            throw new IOException("closed");
        }
        if (enumC2482b.f15293g == -1) {
            throw new IllegalArgumentException();
        }
        m12664a(i, 4, (byte) 3, (byte) 0);
        this.f15267c.mo13021f(enumC2482b.f15293g);
        this.f15267c.flush();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12669a(int i, EnumC2482b enumC2482b, byte[] bArr) {
        if (this.f15271g) {
            throw new IOException("closed");
        }
        if (enumC2482b.f15293g == -1) {
            throw C2487g.m12718a("errorCode.httpCode == -1", new Object[0]);
        }
        m12664a(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f15267c.mo13021f(i);
        this.f15267c.mo13021f(enumC2482b.f15293g);
        if (bArr.length > 0) {
            this.f15267c.mo13009b(bArr);
        }
        this.f15267c.flush();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12670a(C2480al c2480al) {
        if (this.f15271g) {
            throw new IOException("closed");
        }
        this.f15270f = c2480al.m12695c(this.f15270f);
        if (c2480al.m12692b() != -1) {
            this.f15266a.m12716a(c2480al.m12692b());
        }
        m12664a(0, 0, (byte) 4, (byte) 1);
        this.f15267c.flush();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12671a(boolean z, int i, int i2) {
        if (this.f15271g) {
            throw new IOException("closed");
        }
        m12664a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f15267c.mo13021f(i);
        this.f15267c.mo13021f(i2);
        this.f15267c.flush();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12672a(boolean z, int i, C2579f c2579f, int i2) {
        if (this.f15271g) {
            throw new IOException("closed");
        }
        m12664a(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.f15267c.mo12633a_(c2579f, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12673a(boolean z, int i, List<C2483c> list) {
        boolean z3 = this.f15271g;
        if (z3) {
            throw new IOException("closed");
        }
        if (z3) {
            throw new IOException("closed");
        }
        this.f15266a.m12717a(list);
        long jM13006b = this.f15269e.m13006b();
        int iMin = (int) Math.min(this.f15270f, jM13006b);
        long j = iMin;
        byte b = jM13006b == j ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        m12664a(i, iMin, (byte) 1, b);
        this.f15267c.mo12633a_(this.f15269e, j);
        if (jM13006b > j) {
            m12665b(i, jM13006b - j);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m12674b() {
        if (this.f15271g) {
            throw new IOException("closed");
        }
        this.f15267c.flush();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m12675b(C2480al c2480al) {
        if (this.f15271g) {
            throw new IOException("closed");
        }
        int i = 0;
        m12664a(0, c2480al.m12689a() * 6, (byte) 4, (byte) 0);
        while (i < 10) {
            if (c2480al.m12691a(i)) {
                this.f15267c.mo13026g(i == 4 ? 3 : i == 7 ? 4 : i);
                this.f15267c.mo13021f(c2480al.m12693b(i));
            }
            i++;
        }
        this.f15267c.flush();
    }

    /* JADX INFO: renamed from: c */
    public final int m12676c() {
        return this.f15270f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f15271g = true;
        this.f15267c.close();
    }
}
