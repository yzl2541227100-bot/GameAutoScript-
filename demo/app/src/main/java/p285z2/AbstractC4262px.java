package p285z2;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import javax.annotation.Nullable;
import okio.ByteString;

/* JADX INFO: renamed from: z2.px */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4262px {

    /* JADX INFO: renamed from: z2.px$OooO00o */
    public class OooO00o extends AbstractC4262px {
        public final /* synthetic */ C4077kx OooO00o;
        public final /* synthetic */ ByteString OooO0O0;

        public OooO00o(C4077kx c4077kx, ByteString byteString) {
            this.OooO00o = c4077kx;
            this.OooO0O0 = byteString;
        }

        @Override // p285z2.AbstractC4262px
        public long contentLength() throws IOException {
            return this.OooO0O0.size();
        }

        @Override // p285z2.AbstractC4262px
        @Nullable
        public C4077kx contentType() {
            return this.OooO00o;
        }

        @Override // p285z2.AbstractC4262px
        public void writeTo(i00 i00Var) throws IOException {
            i00Var.OoooO0(this.OooO0O0);
        }
    }

    /* JADX INFO: renamed from: z2.px$OooO0O0 */
    public class OooO0O0 extends AbstractC4262px {
        public final /* synthetic */ C4077kx OooO00o;
        public final /* synthetic */ int OooO0O0;
        public final /* synthetic */ byte[] OooO0OO;
        public final /* synthetic */ int OooO0Oo;

        public OooO0O0(C4077kx c4077kx, int i, byte[] bArr, int i2) {
            this.OooO00o = c4077kx;
            this.OooO0O0 = i;
            this.OooO0OO = bArr;
            this.OooO0Oo = i2;
        }

        @Override // p285z2.AbstractC4262px
        public long contentLength() {
            return this.OooO0O0;
        }

        @Override // p285z2.AbstractC4262px
        @Nullable
        public C4077kx contentType() {
            return this.OooO00o;
        }

        @Override // p285z2.AbstractC4262px
        public void writeTo(i00 i00Var) throws IOException {
            i00Var.OooOoo0(this.OooO0OO, this.OooO0Oo, this.OooO0O0);
        }
    }

    /* JADX INFO: renamed from: z2.px$OooO0OO */
    public class OooO0OO extends AbstractC4262px {
        public final /* synthetic */ C4077kx OooO00o;
        public final /* synthetic */ File OooO0O0;

        public OooO0OO(C4077kx c4077kx, File file) {
            this.OooO00o = c4077kx;
            this.OooO0O0 = file;
        }

        @Override // p285z2.AbstractC4262px
        public long contentLength() {
            return this.OooO0O0.length();
        }

        @Override // p285z2.AbstractC4262px
        @Nullable
        public C4077kx contentType() {
            return this.OooO00o;
        }

        @Override // p285z2.AbstractC4262px
        public void writeTo(i00 i00Var) throws IOException {
            c10 c10VarOooOO0O = null;
            try {
                c10VarOooOO0O = u00.OooOO0O(this.OooO0O0);
                i00Var.Oooo000(c10VarOooOO0O);
            } finally {
                C4558xx.OooO0oO(c10VarOooOO0O);
            }
        }
    }

    public static AbstractC4262px create(@Nullable C4077kx c4077kx, File file) {
        Objects.requireNonNull(file, "file == null");
        return new OooO0OO(c4077kx, file);
    }

    public static AbstractC4262px create(@Nullable C4077kx c4077kx, String str) {
        Charset charset = C4558xx.OooOO0;
        if (c4077kx != null) {
            Charset charsetOooO00o = c4077kx.OooO00o();
            if (charsetOooO00o == null) {
                c4077kx = C4077kx.OooO0Oo(c4077kx + "; charset=utf-8");
            } else {
                charset = charsetOooO00o;
            }
        }
        return create(c4077kx, str.getBytes(charset));
    }

    public static AbstractC4262px create(@Nullable C4077kx c4077kx, ByteString byteString) {
        return new OooO00o(c4077kx, byteString);
    }

    public static AbstractC4262px create(@Nullable C4077kx c4077kx, byte[] bArr) {
        return create(c4077kx, bArr, 0, bArr.length);
    }

    public static AbstractC4262px create(@Nullable C4077kx c4077kx, byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "content == null");
        C4558xx.OooO0o(bArr.length, i, i2);
        return new OooO0O0(c4077kx, i2, bArr, i);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract C4077kx contentType();

    public abstract void writeTo(i00 i00Var) throws IOException;
}
