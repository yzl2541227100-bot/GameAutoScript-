package p285z2;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class w00 {
    public final long OooO00o;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public final h00 OooO0O0 = new h00();
    private final b10 OooO0o0 = new OooO00o();
    private final c10 OooO0o = new OooO0O0();

    public final class OooO00o implements b10 {
        public final d10 OoooOoO = new d10();

        public OooO00o() {
        }

        @Override // p285z2.b10
        public void OooOooO(h00 h00Var, long j) throws IOException {
            synchronized (w00.this.OooO0O0) {
                if (w00.this.OooO0OO) {
                    throw new IllegalStateException("closed");
                }
                while (j > 0) {
                    w00 w00Var = w00.this;
                    if (w00Var.OooO0Oo) {
                        throw new IOException("source is closed");
                    }
                    long jO00000O0 = w00Var.OooO00o - w00Var.OooO0O0.o00000O0();
                    if (jO00000O0 == 0) {
                        this.OoooOoO.OooOO0(w00.this.OooO0O0);
                    } else {
                        long jMin = Math.min(jO00000O0, j);
                        w00.this.OooO0O0.OooOooO(h00Var, jMin);
                        j -= jMin;
                        w00.this.OooO0O0.notifyAll();
                    }
                }
            }
        }

        @Override // p285z2.b10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (w00.this.OooO0O0) {
                w00 w00Var = w00.this;
                if (w00Var.OooO0OO) {
                    return;
                }
                if (w00Var.OooO0Oo && w00Var.OooO0O0.o00000O0() > 0) {
                    throw new IOException("source is closed");
                }
                w00 w00Var2 = w00.this;
                w00Var2.OooO0OO = true;
                w00Var2.OooO0O0.notifyAll();
            }
        }

        @Override // p285z2.b10, java.io.Flushable
        public void flush() throws IOException {
            synchronized (w00.this.OooO0O0) {
                w00 w00Var = w00.this;
                if (w00Var.OooO0OO) {
                    throw new IllegalStateException("closed");
                }
                if (w00Var.OooO0Oo && w00Var.OooO0O0.o00000O0() > 0) {
                    throw new IOException("source is closed");
                }
            }
        }

        @Override // p285z2.b10
        public d10 timeout() {
            return this.OoooOoO;
        }
    }

    public final class OooO0O0 implements c10 {
        public final d10 OoooOoO = new d10();

        public OooO0O0() {
        }

        @Override // p285z2.c10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (w00.this.OooO0O0) {
                w00 w00Var = w00.this;
                w00Var.OooO0Oo = true;
                w00Var.OooO0O0.notifyAll();
            }
        }

        @Override // p285z2.c10
        public long read(h00 h00Var, long j) throws IOException {
            synchronized (w00.this.OooO0O0) {
                if (w00.this.OooO0Oo) {
                    throw new IllegalStateException("closed");
                }
                while (w00.this.OooO0O0.o00000O0() == 0) {
                    w00 w00Var = w00.this;
                    if (w00Var.OooO0OO) {
                        return -1L;
                    }
                    this.OoooOoO.OooOO0(w00Var.OooO0O0);
                }
                long j2 = w00.this.OooO0O0.read(h00Var, j);
                w00.this.OooO0O0.notifyAll();
                return j2;
            }
        }

        @Override // p285z2.c10
        public d10 timeout() {
            return this.OoooOoO;
        }
    }

    public w00(long j) {
        if (j >= 1) {
            this.OooO00o = j;
            return;
        }
        throw new IllegalArgumentException("maxBufferSize < 1: " + j);
    }

    public final b10 OooO00o() {
        return this.OooO0o0;
    }

    public final c10 OooO0O0() {
        return this.OooO0o;
    }
}
