package p285z2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okio.ByteString;

/* JADX INFO: renamed from: z2.hy */
/* JADX INFO: loaded from: classes2.dex */
public final class C3967hy {
    private static final int OooOO0O = 1;
    private static final int OooOO0o = 2;
    private static final long OooOOOO = 32;
    public final long OooO;
    public RandomAccessFile OooO00o;
    public Thread OooO0O0;
    public c10 OooO0OO;
    public boolean OooO0o;
    public long OooO0o0;
    private final ByteString OooO0oO;
    public int OooOO0;
    public static final ByteString OooOOO0 = ByteString.encodeUtf8("OkHttp cache v1\n");
    public static final ByteString OooOOO = ByteString.encodeUtf8("OkHttp DIRTY :(\n");
    public final h00 OooO0Oo = new h00();
    public final h00 OooO0oo = new h00();

    /* JADX INFO: renamed from: z2.hy$OooO00o */
    public class OooO00o implements c10 {
        private final d10 OoooOoO = new d10();
        private C3930gy OoooOoo;
        private long Ooooo00;

        public OooO00o() {
            this.OoooOoo = new C3930gy(C3967hy.this.OooO00o.getChannel());
        }

        @Override // p285z2.c10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.OoooOoo == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.OoooOoo = null;
            synchronized (C3967hy.this) {
                C3967hy c3967hy = C3967hy.this;
                int i = c3967hy.OooOO0 - 1;
                c3967hy.OooOO0 = i;
                if (i == 0) {
                    RandomAccessFile randomAccessFile2 = c3967hy.OooO00o;
                    c3967hy.OooO00o = null;
                    randomAccessFile = randomAccessFile2;
                }
            }
            if (randomAccessFile != null) {
                C4558xx.OooO0oO(randomAccessFile);
            }
        }

        @Override // p285z2.c10
        public long read(h00 h00Var, long j) throws IOException {
            long j2;
            char c;
            C3967hy c3967hy;
            if (this.OoooOoo == null) {
                throw new IllegalStateException("closed");
            }
            synchronized (C3967hy.this) {
                while (true) {
                    long j3 = this.Ooooo00;
                    C3967hy c3967hy2 = C3967hy.this;
                    j2 = c3967hy2.OooO0o0;
                    if (j3 != j2) {
                        long jO00000O0 = j2 - c3967hy2.OooO0oo.o00000O0();
                        long j4 = this.Ooooo00;
                        if (j4 >= jO00000O0) {
                            long jMin = Math.min(j, j2 - j4);
                            C3967hy.this.OooO0oo.o0OoOo0(h00Var, this.Ooooo00 - jO00000O0, jMin);
                            this.Ooooo00 += jMin;
                            return jMin;
                        }
                        c = 2;
                    } else if (!c3967hy2.OooO0o) {
                        if (c3967hy2.OooO0O0 == null) {
                            c3967hy2.OooO0O0 = Thread.currentThread();
                            c = 1;
                            break;
                        }
                        this.OoooOoO.OooOO0(c3967hy2);
                    } else {
                        return -1L;
                    }
                }
                if (c == 2) {
                    long jMin2 = Math.min(j, j2 - this.Ooooo00);
                    this.OoooOoo.OooO00o(this.Ooooo00 + 32, h00Var, jMin2);
                    this.Ooooo00 += jMin2;
                    return jMin2;
                }
                try {
                    C3967hy c3967hy3 = C3967hy.this;
                    long j5 = c3967hy3.OooO0OO.read(c3967hy3.OooO0Oo, c3967hy3.OooO);
                    if (j5 == -1) {
                        C3967hy.this.OooO00o(j2);
                        synchronized (C3967hy.this) {
                            C3967hy c3967hy4 = C3967hy.this;
                            c3967hy4.OooO0O0 = null;
                            c3967hy4.notifyAll();
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(j5, j);
                    C3967hy.this.OooO0Oo.o0OoOo0(h00Var, 0L, jMin3);
                    this.Ooooo00 += jMin3;
                    this.OoooOoo.OooO0O0(j2 + 32, C3967hy.this.OooO0Oo.clone(), j5);
                    synchronized (C3967hy.this) {
                        C3967hy c3967hy5 = C3967hy.this;
                        c3967hy5.OooO0oo.OooOooO(c3967hy5.OooO0Oo, j5);
                        long jO00000O02 = C3967hy.this.OooO0oo.o00000O0();
                        C3967hy c3967hy6 = C3967hy.this;
                        if (jO00000O02 > c3967hy6.OooO) {
                            h00 h00Var2 = c3967hy6.OooO0oo;
                            h00Var2.skip(h00Var2.o00000O0() - C3967hy.this.OooO);
                        }
                        c3967hy = C3967hy.this;
                        c3967hy.OooO0o0 += j5;
                    }
                    synchronized (c3967hy) {
                        C3967hy c3967hy7 = C3967hy.this;
                        c3967hy7.OooO0O0 = null;
                        c3967hy7.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th) {
                    synchronized (C3967hy.this) {
                        C3967hy c3967hy8 = C3967hy.this;
                        c3967hy8.OooO0O0 = null;
                        c3967hy8.notifyAll();
                        throw th;
                    }
                }
            }
        }

        @Override // p285z2.c10
        public d10 timeout() {
            return this.OoooOoO;
        }
    }

    private C3967hy(RandomAccessFile randomAccessFile, c10 c10Var, long j, ByteString byteString, long j2) {
        this.OooO00o = randomAccessFile;
        this.OooO0OO = c10Var;
        this.OooO0o = c10Var == null;
        this.OooO0o0 = j;
        this.OooO0oO = byteString;
        this.OooO = j2;
    }

    public static C3967hy OooO0O0(File file, c10 c10Var, ByteString byteString, long j) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        C3967hy c3967hy = new C3967hy(randomAccessFile, c10Var, 0L, byteString, j);
        randomAccessFile.setLength(0L);
        c3967hy.OooO0oO(OooOOO, -1L, -1L);
        return c3967hy;
    }

    public static C3967hy OooO0o(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        C3930gy c3930gy = new C3930gy(randomAccessFile.getChannel());
        h00 h00Var = new h00();
        c3930gy.OooO00o(0L, h00Var, 32L);
        if (!h00Var.OooO0Oo(r2.size()).equals(OooOOO0)) {
            throw new IOException("unreadable cache file");
        }
        long j = h00Var.readLong();
        long j2 = h00Var.readLong();
        h00 h00Var2 = new h00();
        c3930gy.OooO00o(j + 32, h00Var2, j2);
        return new C3967hy(randomAccessFile, null, j, h00Var2.Oooo00o(), 0L);
    }

    private void OooO0oO(ByteString byteString, long j, long j2) throws IOException {
        h00 h00Var = new h00();
        h00Var.OoooO0(byteString);
        h00Var.OoooOOo(j);
        h00Var.OoooOOo(j2);
        if (h00Var.o00000O0() != 32) {
            throw new IllegalArgumentException();
        }
        new C3930gy(this.OooO00o.getChannel()).OooO0O0(0L, h00Var, 32L);
    }

    private void OooO0oo(long j) throws IOException {
        h00 h00Var = new h00();
        h00Var.OoooO0(this.OooO0oO);
        new C3930gy(this.OooO00o.getChannel()).OooO0O0(32 + j, h00Var, this.OooO0oO.size());
    }

    public void OooO00o(long j) throws IOException {
        OooO0oo(j);
        this.OooO00o.getChannel().force(false);
        OooO0oO(OooOOO0, j, this.OooO0oO.size());
        this.OooO00o.getChannel().force(false);
        synchronized (this) {
            this.OooO0o = true;
        }
        C4558xx.OooO0oO(this.OooO0OO);
        this.OooO0OO = null;
    }

    public boolean OooO0OO() {
        return this.OooO00o == null;
    }

    public ByteString OooO0Oo() {
        return this.OooO0oO;
    }

    public c10 OooO0o0() {
        synchronized (this) {
            if (this.OooO00o == null) {
                return null;
            }
            this.OooOO0++;
            return new OooO00o();
        }
    }
}
