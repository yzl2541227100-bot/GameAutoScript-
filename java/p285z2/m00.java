package p285z2;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m00 implements c10 {
    private final c10 delegate;

    public m00(c10 c10Var) {
        if (c10Var == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = c10Var;
    }

    @Override // p285z2.c10, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final c10 delegate() {
        return this.delegate;
    }

    @Override // p285z2.c10
    public long read(h00 h00Var, long j) throws IOException {
        return this.delegate.read(h00Var, j);
    }

    @Override // p285z2.c10
    public d10 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }
}
