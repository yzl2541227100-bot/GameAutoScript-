package p285z2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Objects;
import javax.annotation.Nullable;
import okio.ByteString;

/* JADX INFO: renamed from: z2.rx */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4336rx implements Closeable {

    @Nullable
    private Reader reader;

    /* JADX INFO: renamed from: z2.rx$OooO00o */
    public class OooO00o extends AbstractC4336rx {
        public final /* synthetic */ C4077kx OoooOoO;
        public final /* synthetic */ long OoooOoo;
        public final /* synthetic */ j00 Ooooo00;

        public OooO00o(C4077kx c4077kx, long j, j00 j00Var) {
            this.OoooOoO = c4077kx;
            this.OoooOoo = j;
            this.Ooooo00 = j00Var;
        }

        @Override // p285z2.AbstractC4336rx
        public long contentLength() {
            return this.OoooOoo;
        }

        @Override // p285z2.AbstractC4336rx
        @Nullable
        public C4077kx contentType() {
            return this.OoooOoO;
        }

        @Override // p285z2.AbstractC4336rx
        public j00 source() {
            return this.Ooooo00;
        }
    }

    /* JADX INFO: renamed from: z2.rx$OooO0O0 */
    public static final class OooO0O0 extends Reader {
        private final j00 OoooOoO;
        private final Charset OoooOoo;
        private boolean Ooooo00;

        @Nullable
        private Reader Ooooo0o;

        public OooO0O0(j00 j00Var, Charset charset) {
            this.OoooOoO = j00Var;
            this.OoooOoo = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.Ooooo00 = true;
            Reader reader = this.Ooooo0o;
            if (reader != null) {
                reader.close();
            } else {
                this.OoooOoO.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (this.Ooooo00) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.Ooooo0o;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.OoooOoO.OooooO0(), C4558xx.OooO0OO(this.OoooOoO, this.OoooOoo));
                this.Ooooo0o = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    private Charset charset() {
        C4077kx c4077kxContentType = contentType();
        return c4077kxContentType != null ? c4077kxContentType.OooO0O0(C4558xx.OooOO0) : C4558xx.OooOO0;
    }

    public static AbstractC4336rx create(@Nullable C4077kx c4077kx, long j, j00 j00Var) {
        Objects.requireNonNull(j00Var, "source == null");
        return new OooO00o(c4077kx, j, j00Var);
    }

    public static AbstractC4336rx create(@Nullable C4077kx c4077kx, String str) {
        Charset charset = C4558xx.OooOO0;
        if (c4077kx != null) {
            Charset charsetOooO00o = c4077kx.OooO00o();
            if (charsetOooO00o == null) {
                c4077kx = C4077kx.OooO0Oo(c4077kx + "; charset=utf-8");
            } else {
                charset = charsetOooO00o;
            }
        }
        h00 h00VarOooo0 = new h00().Oooo0(str, charset);
        return create(c4077kx, h00VarOooo0.o00000O0(), h00VarOooo0);
    }

    public static AbstractC4336rx create(@Nullable C4077kx c4077kx, ByteString byteString) {
        return create(c4077kx, byteString.size(), new h00().OoooO0(byteString));
    }

    public static AbstractC4336rx create(@Nullable C4077kx c4077kx, byte[] bArr) {
        return create(c4077kx, bArr.length, new h00().Oooo(bArr));
    }

    public final InputStream byteStream() {
        return source().OooooO0();
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        j00 j00VarSource = source();
        try {
            byte[] bArrOooOO0O = j00VarSource.OooOO0O();
            C4558xx.OooO0oO(j00VarSource);
            if (jContentLength == -1 || jContentLength == bArrOooOO0O.length) {
                return bArrOooOO0O;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + bArrOooOO0O.length + ") disagree");
        } catch (Throwable th) {
            C4558xx.OooO0oO(j00VarSource);
            throw th;
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        OooO0O0 oooO0O0 = new OooO0O0(source(), charset());
        this.reader = oooO0O0;
        return oooO0O0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C4558xx.OooO0oO(source());
    }

    public abstract long contentLength();

    @Nullable
    public abstract C4077kx contentType();

    public abstract j00 source();

    public final String string() throws IOException {
        j00 j00VarSource = source();
        try {
            return j00VarSource.OooOoOO(C4558xx.OooO0OO(j00VarSource, charset()));
        } finally {
            C4558xx.OooO0oO(j00VarSource);
        }
    }
}
