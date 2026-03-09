package p285z2;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes2.dex */
public final class p00 implements b10 {
    private final i00 OoooOoO;
    private final Deflater OoooOoo;
    private final k00 Ooooo00;
    private boolean Ooooo0o;
    private final CRC32 OooooO0 = new CRC32();

    public p00(b10 b10Var) {
        if (b10Var == null) {
            throw new IllegalArgumentException("sink == null");
        }
        Deflater deflater = new Deflater(-1, true);
        this.OoooOoo = deflater;
        i00 i00VarOooO0OO = u00.OooO0OO(b10Var);
        this.OoooOoO = i00VarOooO0OO;
        this.Ooooo00 = new k00(i00VarOooO0OO, deflater);
        Oooooo();
    }

    private void OooooOo(h00 h00Var, long j) {
        z00 z00Var = h00Var.OoooOoO;
        while (j > 0) {
            int iMin = (int) Math.min(j, z00Var.OooO0OO - z00Var.OooO0O0);
            this.OooooO0.update(z00Var.OooO00o, z00Var.OooO0O0, iMin);
            j -= (long) iMin;
            z00Var = z00Var.OooO0o;
        }
    }

    private void Oooooo() {
        h00 h00VarOooO00o = this.OoooOoO.OooO00o();
        h00VarOooO00o.OooO0o(8075);
        h00VarOooO00o.OooOOOO(8);
        h00VarOooO00o.OooOOOO(0);
        h00VarOooO00o.OooO0oo(0);
        h00VarOooO00o.OooOOOO(0);
        h00VarOooO00o.OooOOOO(0);
    }

    private void Oooooo0() throws IOException {
        this.OoooOoO.OooOOO0((int) this.OooooO0.getValue());
        this.OoooOoO.OooOOO0((int) this.OoooOoo.getBytesRead());
    }

    public final Deflater OooOO0() {
        return this.OoooOoo;
    }

    @Override // p285z2.b10
    public void OooOooO(h00 h00Var, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (j == 0) {
            return;
        }
        OooooOo(h00Var, j);
        this.Ooooo00.OooOooO(h00Var, j);
    }

    @Override // p285z2.b10, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.Ooooo0o) {
            return;
        }
        Throwable th = null;
        try {
            this.Ooooo00.OooooOo();
            Oooooo0();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.OoooOoo.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.OoooOoO.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.Ooooo0o = true;
        if (th != null) {
            f10.OooO0o(th);
        }
    }

    @Override // p285z2.b10, java.io.Flushable
    public void flush() throws IOException {
        this.Ooooo00.flush();
    }

    @Override // p285z2.b10
    public d10 timeout() {
        return this.OoooOoO.timeout();
    }
}
