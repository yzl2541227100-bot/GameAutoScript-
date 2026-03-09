package p285z2;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class x00 implements i00 {
    public final h00 OoooOoO = new h00();
    public final b10 OoooOoo;
    public boolean Ooooo00;

    public class OooO00o extends OutputStream {
        public OooO00o() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            x00.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            x00 x00Var = x00.this;
            if (x00Var.Ooooo00) {
                return;
            }
            x00Var.flush();
        }

        public String toString() {
            return x00.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            x00 x00Var = x00.this;
            if (x00Var.Ooooo00) {
                throw new IOException("closed");
            }
            x00Var.OoooOoO.OooOOOO((byte) i);
            x00.this.OooOo0();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            x00 x00Var = x00.this;
            if (x00Var.Ooooo00) {
                throw new IOException("closed");
            }
            x00Var.OoooOoO.OooOoo0(bArr, i, i2);
            x00.this.OooOo0();
        }
    }

    public x00(b10 b10Var) {
        Objects.requireNonNull(b10Var, "sink == null");
        this.OoooOoo = b10Var;
    }

    @Override // p285z2.i00
    public i00 OooO(long j) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.OooO(j);
        return OooOo0();
    }

    @Override // p285z2.i00
    public h00 OooO00o() {
        return this.OoooOoO;
    }

    @Override // p285z2.i00
    public i00 OooO0o(int i) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.OooO0o(i);
        return OooOo0();
    }

    @Override // p285z2.i00
    public i00 OooO0o0() throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        long jO00000O0 = this.OoooOoO.o00000O0();
        if (jO00000O0 > 0) {
            this.OoooOoo.OooOooO(this.OoooOoO, jO00000O0);
        }
        return this;
    }

    @Override // p285z2.i00
    public i00 OooO0oO(int i) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.OooO0oO(i);
        return OooOo0();
    }

    @Override // p285z2.i00
    public i00 OooO0oo(int i) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.OooO0oo(i);
        return OooOo0();
    }

    @Override // p285z2.i00
    public i00 OooOOO0(int i) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.OooOOO0(i);
        return OooOo0();
    }

    @Override // p285z2.i00
    public i00 OooOOOO(int i) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.OooOOOO(i);
        return OooOo0();
    }

    @Override // p285z2.i00
    public i00 OooOo(int i) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.OooOo(i);
        return OooOo0();
    }

    @Override // p285z2.i00
    public i00 OooOo0() throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        long jOooooo = this.OoooOoO.Oooooo();
        if (jOooooo > 0) {
            this.OoooOoo.OooOooO(this.OoooOoO, jOooooo);
        }
        return this;
    }

    @Override // p285z2.i00
    public i00 OooOoO0(String str) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.OooOoO0(str);
        return OooOo0();
    }

    @Override // p285z2.i00
    public i00 OooOoo0(byte[] bArr, int i, int i2) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.OooOoo0(bArr, i, i2);
        return OooOo0();
    }

    @Override // p285z2.b10
    public void OooOooO(h00 h00Var, long j) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.OooOooO(h00Var, j);
        OooOo0();
    }

    @Override // p285z2.i00
    public i00 OooOooo(String str, int i, int i2) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.OooOooo(str, i, i2);
        return OooOo0();
    }

    @Override // p285z2.i00
    public i00 Oooo(byte[] bArr) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.Oooo(bArr);
        return OooOo0();
    }

    @Override // p285z2.i00
    public i00 Oooo0(String str, Charset charset) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.Oooo0(str, charset);
        return OooOo0();
    }

    @Override // p285z2.i00
    public long Oooo000(c10 c10Var) throws IOException {
        if (c10Var == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long j2 = c10Var.read(this.OoooOoO, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            OooOo0();
        }
    }

    @Override // p285z2.i00
    public i00 Oooo00O(long j) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.Oooo00O(j);
        return OooOo0();
    }

    @Override // p285z2.i00
    public i00 Oooo0O0(c10 c10Var, long j) throws IOException {
        while (j > 0) {
            long j2 = c10Var.read(this.OoooOoO, j);
            if (j2 == -1) {
                throw new EOFException();
            }
            j -= j2;
            OooOo0();
        }
        return this;
    }

    @Override // p285z2.i00
    public i00 OoooO0(ByteString byteString) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.OoooO0(byteString);
        return OooOo0();
    }

    @Override // p285z2.i00
    public i00 OoooOOo(long j) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.OoooOOo(j);
        return OooOo0();
    }

    @Override // p285z2.i00
    public i00 OoooOoO(long j) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.OoooOoO(j);
        return OooOo0();
    }

    @Override // p285z2.i00
    public OutputStream OoooOoo() {
        return new OooO00o();
    }

    @Override // p285z2.b10, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.Ooooo00) {
            return;
        }
        Throwable th = null;
        try {
            h00 h00Var = this.OoooOoO;
            long j = h00Var.OoooOoo;
            if (j > 0) {
                this.OoooOoo.OooOooO(h00Var, j);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.OoooOoo.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.Ooooo00 = true;
        if (th != null) {
            f10.OooO0o(th);
        }
    }

    @Override // p285z2.i00, p285z2.b10, java.io.Flushable
    public void flush() throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        h00 h00Var = this.OoooOoO;
        long j = h00Var.OoooOoo;
        if (j > 0) {
            this.OoooOoo.OooOooO(h00Var, j);
        }
        this.OoooOoo.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.Ooooo00;
    }

    @Override // p285z2.i00
    public i00 o000oOoO(String str, int i, int i2, Charset charset) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        this.OoooOoO.o000oOoO(str, i, i2, charset);
        return OooOo0();
    }

    @Override // p285z2.b10
    public d10 timeout() {
        return this.OoooOoo.timeout();
    }

    public String toString() {
        return "buffer(" + this.OoooOoo + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.OoooOoO.write(byteBuffer);
        OooOo0();
        return iWrite;
    }
}
