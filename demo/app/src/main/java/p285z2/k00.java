package p285z2;

import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
public final class k00 implements b10 {
    private final i00 OoooOoO;
    private final Deflater OoooOoo;
    private boolean Ooooo00;

    public k00(b10 b10Var, Deflater deflater) {
        this(u00.OooO0OO(b10Var), deflater);
    }

    public k00(i00 i00Var, Deflater deflater) {
        if (i00Var == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.OoooOoO = i00Var;
        this.OoooOoo = deflater;
    }

    @IgnoreJRERequirement
    private void OooOO0(boolean z) throws IOException {
        z00 z00VarO00000Oo;
        h00 h00VarOooO00o = this.OoooOoO.OooO00o();
        while (true) {
            z00VarO00000Oo = h00VarOooO00o.o00000Oo(1);
            Deflater deflater = this.OoooOoo;
            byte[] bArr = z00VarO00000Oo.OooO00o;
            int i = z00VarO00000Oo.OooO0OO;
            int i2 = 8192 - i;
            int iDeflate = z ? deflater.deflate(bArr, i, i2, 2) : deflater.deflate(bArr, i, i2);
            if (iDeflate > 0) {
                z00VarO00000Oo.OooO0OO += iDeflate;
                h00VarOooO00o.OoooOoo += (long) iDeflate;
                this.OoooOoO.OooOo0();
            } else if (this.OoooOoo.needsInput()) {
                break;
            }
        }
        if (z00VarO00000Oo.OooO0O0 == z00VarO00000Oo.OooO0OO) {
            h00VarOooO00o.OoooOoO = z00VarO00000Oo.OooO0O0();
            a10.OooO00o(z00VarO00000Oo);
        }
    }

    @Override // p285z2.b10
    public void OooOooO(h00 h00Var, long j) throws IOException {
        f10.OooO0O0(h00Var.OoooOoo, 0L, j);
        while (j > 0) {
            z00 z00Var = h00Var.OoooOoO;
            int iMin = (int) Math.min(j, z00Var.OooO0OO - z00Var.OooO0O0);
            this.OoooOoo.setInput(z00Var.OooO00o, z00Var.OooO0O0, iMin);
            OooOO0(false);
            long j2 = iMin;
            h00Var.OoooOoo -= j2;
            int i = z00Var.OooO0O0 + iMin;
            z00Var.OooO0O0 = i;
            if (i == z00Var.OooO0OO) {
                h00Var.OoooOoO = z00Var.OooO0O0();
                a10.OooO00o(z00Var);
            }
            j -= j2;
        }
    }

    public void OooooOo() throws IOException {
        this.OoooOoo.finish();
        OooOO0(false);
    }

    @Override // p285z2.b10, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.Ooooo00) {
            return;
        }
        Throwable th = null;
        try {
            OooooOo();
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
        this.Ooooo00 = true;
        if (th != null) {
            f10.OooO0o(th);
        }
    }

    @Override // p285z2.b10, java.io.Flushable
    public void flush() throws IOException {
        OooOO0(true);
        this.OoooOoO.flush();
    }

    @Override // p285z2.b10
    public d10 timeout() {
        return this.OoooOoO.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.OoooOoO + ")";
    }
}
