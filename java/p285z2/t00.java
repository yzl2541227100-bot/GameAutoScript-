package p285z2;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class t00 implements c10 {
    private final j00 OoooOoO;
    private final Inflater OoooOoo;
    private int Ooooo00;
    private boolean Ooooo0o;

    public t00(c10 c10Var, Inflater inflater) {
        this(u00.OooO0Oo(c10Var), inflater);
    }

    public t00(j00 j00Var, Inflater inflater) {
        if (j00Var == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.OoooOoO = j00Var;
        this.OoooOoo = inflater;
    }

    private void OooooOo() throws IOException {
        int i = this.Ooooo00;
        if (i == 0) {
            return;
        }
        int remaining = i - this.OoooOoo.getRemaining();
        this.Ooooo00 -= remaining;
        this.OoooOoO.skip(remaining);
    }

    public final boolean OooOO0() throws IOException {
        if (!this.OoooOoo.needsInput()) {
            return false;
        }
        OooooOo();
        if (this.OoooOoo.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.OoooOoO.OooOOO()) {
            return true;
        }
        z00 z00Var = this.OoooOoO.OooO00o().OoooOoO;
        int i = z00Var.OooO0OO;
        int i2 = z00Var.OooO0O0;
        int i3 = i - i2;
        this.Ooooo00 = i3;
        this.OoooOoo.setInput(z00Var.OooO00o, i2, i3);
        return false;
    }

    @Override // p285z2.c10, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.Ooooo0o) {
            return;
        }
        this.OoooOoo.end();
        this.Ooooo0o = true;
        this.OoooOoO.close();
    }

    @Override // p285z2.c10
    public long read(h00 h00Var, long j) throws IOException {
        boolean zOooOO0;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.Ooooo0o) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        do {
            zOooOO0 = OooOO0();
            try {
                z00 z00VarO00000Oo = h00Var.o00000Oo(1);
                int iInflate = this.OoooOoo.inflate(z00VarO00000Oo.OooO00o, z00VarO00000Oo.OooO0OO, (int) Math.min(j, 8192 - z00VarO00000Oo.OooO0OO));
                if (iInflate > 0) {
                    z00VarO00000Oo.OooO0OO += iInflate;
                    long j2 = iInflate;
                    h00Var.OoooOoo += j2;
                    return j2;
                }
                if (!this.OoooOoo.finished() && !this.OoooOoo.needsDictionary()) {
                }
                OooooOo();
                if (z00VarO00000Oo.OooO0O0 != z00VarO00000Oo.OooO0OO) {
                    return -1L;
                }
                h00Var.OoooOoO = z00VarO00000Oo.OooO0O0();
                a10.OooO00o(z00VarO00000Oo);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!zOooOO0);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // p285z2.c10
    public d10 timeout() {
        return this.OoooOoO.timeout();
    }
}
