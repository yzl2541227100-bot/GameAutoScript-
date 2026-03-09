package p285z2;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import okio.ByteString;
import p285z2.h00;

/* JADX INFO: loaded from: classes2.dex */
public final class d00 {
    private final byte[] OooO;
    public final boolean OooO00o;
    public final Random OooO0O0;
    public final i00 OooO0OO;
    public final h00 OooO0Oo;
    public boolean OooO0o0;
    public boolean OooO0oo;
    private final h00.OooO0OO OooOO0;
    public final h00 OooO0o = new h00();
    public final OooO00o OooO0oO = new OooO00o();

    public final class OooO00o implements b10 {
        public int OoooOoO;
        public long OoooOoo;
        public boolean Ooooo00;
        public boolean Ooooo0o;

        public OooO00o() {
        }

        @Override // p285z2.b10
        public void OooOooO(h00 h00Var, long j) throws IOException {
            if (this.Ooooo0o) {
                throw new IOException("closed");
            }
            d00.this.OooO0o.OooOooO(h00Var, j);
            boolean z = this.Ooooo00 && this.OoooOoo != -1 && d00.this.OooO0o.o00000O0() > this.OoooOoo - PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            long jOooooo = d00.this.OooO0o.Oooooo();
            if (jOooooo <= 0 || z) {
                return;
            }
            d00.this.OooO0Oo(this.OoooOoO, jOooooo, this.Ooooo00, false);
            this.Ooooo00 = false;
        }

        @Override // p285z2.b10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.Ooooo0o) {
                throw new IOException("closed");
            }
            d00 d00Var = d00.this;
            d00Var.OooO0Oo(this.OoooOoO, d00Var.OooO0o.o00000O0(), this.Ooooo00, true);
            this.Ooooo0o = true;
            d00.this.OooO0oo = false;
        }

        @Override // p285z2.b10, java.io.Flushable
        public void flush() throws IOException {
            if (this.Ooooo0o) {
                throw new IOException("closed");
            }
            d00 d00Var = d00.this;
            d00Var.OooO0Oo(this.OoooOoO, d00Var.OooO0o.o00000O0(), this.Ooooo00, false);
            this.Ooooo00 = false;
        }

        @Override // p285z2.b10
        public d10 timeout() {
            return d00.this.OooO0OO.timeout();
        }
    }

    public d00(boolean z, i00 i00Var, Random random) {
        Objects.requireNonNull(i00Var, "sink == null");
        Objects.requireNonNull(random, "random == null");
        this.OooO00o = z;
        this.OooO0OO = i00Var;
        this.OooO0Oo = i00Var.OooO00o();
        this.OooO0O0 = random;
        this.OooO = z ? new byte[4] : null;
        this.OooOO0 = z ? new h00.OooO0OO() : null;
    }

    private void OooO0OO(int i, ByteString byteString) throws IOException {
        if (this.OooO0o0) {
            throw new IOException("closed");
        }
        int size = byteString.size();
        if (size > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.OooO0Oo.OooOOOO(i | 128);
        if (this.OooO00o) {
            this.OooO0Oo.OooOOOO(size | 128);
            this.OooO0O0.nextBytes(this.OooO);
            this.OooO0Oo.Oooo(this.OooO);
            if (size > 0) {
                long jO00000O0 = this.OooO0Oo.o00000O0();
                this.OooO0Oo.OoooO0(byteString);
                this.OooO0Oo.o0ooOOo(this.OooOO0);
                this.OooOO0.Oooooo(jO00000O0);
                b00.OooO0OO(this.OooOO0, this.OooO);
                this.OooOO0.close();
            }
        } else {
            this.OooO0Oo.OooOOOO(size);
            this.OooO0Oo.OoooO0(byteString);
        }
        this.OooO0OO.flush();
    }

    public b10 OooO00o(int i, long j) {
        if (this.OooO0oo) {
            throw new IllegalStateException("Another message writer is active. Did you call close()?");
        }
        this.OooO0oo = true;
        OooO00o oooO00o = this.OooO0oO;
        oooO00o.OoooOoO = i;
        oooO00o.OoooOoo = j;
        oooO00o.Ooooo00 = true;
        oooO00o.Ooooo0o = false;
        return oooO00o;
    }

    public void OooO0O0(int i, ByteString byteString) throws IOException {
        ByteString byteStringOooo00o = ByteString.EMPTY;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                b00.OooO0Oo(i);
            }
            h00 h00Var = new h00();
            h00Var.OooO0o(i);
            if (byteString != null) {
                h00Var.OoooO0(byteString);
            }
            byteStringOooo00o = h00Var.Oooo00o();
        }
        try {
            OooO0OO(8, byteStringOooo00o);
        } finally {
            this.OooO0o0 = true;
        }
    }

    public void OooO0Oo(int i, long j, boolean z, boolean z3) throws IOException {
        if (this.OooO0o0) {
            throw new IOException("closed");
        }
        if (!z) {
            i = 0;
        }
        if (z3) {
            i |= 128;
        }
        this.OooO0Oo.OooOOOO(i);
        int i2 = this.OooO00o ? 128 : 0;
        if (j <= 125) {
            this.OooO0Oo.OooOOOO(((int) j) | i2);
        } else if (j <= b00.OooOOoo) {
            this.OooO0Oo.OooOOOO(i2 | 126);
            this.OooO0Oo.OooO0o((int) j);
        } else {
            this.OooO0Oo.OooOOOO(i2 | 127);
            this.OooO0Oo.OoooOOo(j);
        }
        if (this.OooO00o) {
            this.OooO0O0.nextBytes(this.OooO);
            this.OooO0Oo.Oooo(this.OooO);
            if (j > 0) {
                long jO00000O0 = this.OooO0Oo.o00000O0();
                this.OooO0Oo.OooOooO(this.OooO0o, j);
                this.OooO0Oo.o0ooOOo(this.OooOO0);
                this.OooOO0.Oooooo(jO00000O0);
                b00.OooO0OO(this.OooOO0, this.OooO);
                this.OooOO0.close();
            }
        } else {
            this.OooO0Oo.OooOooO(this.OooO0o, j);
        }
        this.OooO0OO.OooO0o0();
    }

    public void OooO0o(ByteString byteString) throws IOException {
        OooO0OO(10, byteString);
    }

    public void OooO0o0(ByteString byteString) throws IOException {
        OooO0OO(9, byteString);
    }
}
