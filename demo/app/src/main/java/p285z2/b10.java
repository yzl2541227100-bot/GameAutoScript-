package p285z2;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface b10 extends Closeable, Flushable {
    void OooOooO(h00 h00Var, long j) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    d10 timeout();
}
