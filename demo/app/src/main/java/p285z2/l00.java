package p285z2;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l00 implements b10 {
    private final b10 OoooOoO;

    public l00(b10 b10Var) {
        if (b10Var == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.OoooOoO = b10Var;
    }

    public final b10 OooOO0() {
        return this.OoooOoO;
    }

    @Override // p285z2.b10
    public void OooOooO(h00 h00Var, long j) throws IOException {
        this.OoooOoO.OooOooO(h00Var, j);
    }

    @Override // p285z2.b10, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.OoooOoO.close();
    }

    @Override // p285z2.b10, java.io.Flushable
    public void flush() throws IOException {
        this.OoooOoO.flush();
    }

    @Override // p285z2.b10
    public d10 timeout() {
        return this.OoooOoO.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.OoooOoO.toString() + ")";
    }
}
