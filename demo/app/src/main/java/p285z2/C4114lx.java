package p285z2;

import com.umeng.commonsdk.proguard.C3442bg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;
import okio.ByteString;

/* JADX INFO: renamed from: z2.lx */
/* JADX INFO: loaded from: classes2.dex */
public final class C4114lx extends AbstractC4262px {
    private final ByteString OooO00o;
    private final C4077kx OooO0O0;
    private final C4077kx OooO0OO;
    private final List<OooO0O0> OooO0Oo;
    private long OooO0o0 = -1;
    public static final C4077kx OooO0o = C4077kx.OooO0OO("multipart/mixed");
    public static final C4077kx OooO0oO = C4077kx.OooO0OO("multipart/alternative");
    public static final C4077kx OooO0oo = C4077kx.OooO0OO("multipart/digest");
    public static final C4077kx OooO = C4077kx.OooO0OO("multipart/parallel");
    public static final C4077kx OooOO0 = C4077kx.OooO0OO("multipart/form-data");
    private static final byte[] OooOO0O = {58, 32};
    private static final byte[] OooOO0o = {C3442bg.f18781k, 10};
    private static final byte[] OooOOO0 = {45, 45};

    /* JADX INFO: renamed from: z2.lx$OooO00o */
    public static final class OooO00o {
        private final ByteString OooO00o;
        private C4077kx OooO0O0;
        private final List<OooO0O0> OooO0OO;

        public OooO00o() {
            this(UUID.randomUUID().toString());
        }

        public OooO00o(String str) {
            this.OooO0O0 = C4114lx.OooO0o;
            this.OooO0OO = new ArrayList();
            this.OooO00o = ByteString.encodeUtf8(str);
        }

        public OooO00o OooO00o(String str, String str2) {
            return OooO0Oo(OooO0O0.OooO0Oo(str, str2));
        }

        public OooO00o OooO0O0(String str, @Nullable String str2, AbstractC4262px abstractC4262px) {
            return OooO0Oo(OooO0O0.OooO0o0(str, str2, abstractC4262px));
        }

        public OooO00o OooO0OO(@Nullable C3966hx c3966hx, AbstractC4262px abstractC4262px) {
            return OooO0Oo(OooO0O0.OooO0O0(c3966hx, abstractC4262px));
        }

        public OooO00o OooO0Oo(OooO0O0 oooO0O0) {
            Objects.requireNonNull(oooO0O0, "part == null");
            this.OooO0OO.add(oooO0O0);
            return this;
        }

        public C4114lx OooO0o() {
            if (this.OooO0OO.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new C4114lx(this.OooO00o, this.OooO0O0, this.OooO0OO);
        }

        public OooO00o OooO0o0(AbstractC4262px abstractC4262px) {
            return OooO0Oo(OooO0O0.OooO0OO(abstractC4262px));
        }

        public OooO00o OooO0oO(C4077kx c4077kx) {
            Objects.requireNonNull(c4077kx, "type == null");
            if (c4077kx.OooO0o().equals("multipart")) {
                this.OooO0O0 = c4077kx;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + c4077kx);
        }
    }

    /* JADX INFO: renamed from: z2.lx$OooO0O0 */
    public static final class OooO0O0 {

        @Nullable
        public final C3966hx OooO00o;
        public final AbstractC4262px OooO0O0;

        private OooO0O0(@Nullable C3966hx c3966hx, AbstractC4262px abstractC4262px) {
            this.OooO00o = c3966hx;
            this.OooO0O0 = abstractC4262px;
        }

        public static OooO0O0 OooO0O0(@Nullable C3966hx c3966hx, AbstractC4262px abstractC4262px) {
            Objects.requireNonNull(abstractC4262px, "body == null");
            if (c3966hx != null && c3966hx.OooO0Oo("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (c3966hx == null || c3966hx.OooO0Oo("Content-Length") == null) {
                return new OooO0O0(c3966hx, abstractC4262px);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }

        public static OooO0O0 OooO0OO(AbstractC4262px abstractC4262px) {
            return OooO0O0(null, abstractC4262px);
        }

        public static OooO0O0 OooO0Oo(String str, String str2) {
            return OooO0o0(str, null, AbstractC4262px.create((C4077kx) null, str2));
        }

        public static OooO0O0 OooO0o0(String str, @Nullable String str2, AbstractC4262px abstractC4262px) {
            Objects.requireNonNull(str, "name == null");
            StringBuilder sb = new StringBuilder("form-data; name=");
            C4114lx.OooO00o(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                C4114lx.OooO00o(sb, str2);
            }
            return OooO0O0(C3966hx.OooOO0O("Content-Disposition", sb.toString()), abstractC4262px);
        }

        public AbstractC4262px OooO00o() {
            return this.OooO0O0;
        }

        @Nullable
        public C3966hx OooO0o() {
            return this.OooO00o;
        }
    }

    public C4114lx(ByteString byteString, C4077kx c4077kx, List<OooO0O0> list) {
        this.OooO00o = byteString;
        this.OooO0O0 = c4077kx;
        this.OooO0OO = C4077kx.OooO0OO(c4077kx + "; boundary=" + byteString.utf8());
        this.OooO0Oo = C4558xx.OooOo0(list);
    }

    public static StringBuilder OooO00o(StringBuilder sb, String str) {
        String str2;
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                str2 = "%0A";
            } else if (cCharAt == '\r') {
                str2 = "%0D";
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                str2 = "%22";
            }
            sb.append(str2);
        }
        sb.append('\"');
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long OooO0oO(@Nullable i00 i00Var, boolean z) throws IOException {
        h00 h00Var;
        if (z) {
            i00Var = new h00();
            h00Var = i00Var;
        } else {
            h00Var = 0;
        }
        int size = this.OooO0Oo.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            OooO0O0 oooO0O0 = this.OooO0Oo.get(i);
            C3966hx c3966hx = oooO0O0.OooO00o;
            AbstractC4262px abstractC4262px = oooO0O0.OooO0O0;
            i00Var.Oooo(OooOOO0);
            i00Var.OoooO0(this.OooO00o);
            i00Var.Oooo(OooOO0o);
            if (c3966hx != null) {
                int iOooOO0o = c3966hx.OooOO0o();
                for (int i2 = 0; i2 < iOooOO0o; i2++) {
                    i00Var.OooOoO0(c3966hx.OooO0oO(i2)).Oooo(OooOO0O).OooOoO0(c3966hx.OooOOO(i2)).Oooo(OooOO0o);
                }
            }
            C4077kx c4077kxContentType = abstractC4262px.contentType();
            if (c4077kxContentType != null) {
                i00Var.OooOoO0("Content-Type: ").OooOoO0(c4077kxContentType.toString()).Oooo(OooOO0o);
            }
            long jContentLength = abstractC4262px.contentLength();
            if (jContentLength != -1) {
                i00Var.OooOoO0("Content-Length: ").OoooOoO(jContentLength).Oooo(OooOO0o);
            } else if (z) {
                h00Var.OooooOo();
                return -1L;
            }
            byte[] bArr = OooOO0o;
            i00Var.Oooo(bArr);
            if (z) {
                j += jContentLength;
            } else {
                abstractC4262px.writeTo(i00Var);
            }
            i00Var.Oooo(bArr);
        }
        byte[] bArr2 = OooOOO0;
        i00Var.Oooo(bArr2);
        i00Var.OoooO0(this.OooO00o);
        i00Var.Oooo(bArr2);
        i00Var.Oooo(OooOO0o);
        if (!z) {
            return j;
        }
        long jO00000O0 = j + h00Var.o00000O0();
        h00Var.OooooOo();
        return jO00000O0;
    }

    public String OooO0O0() {
        return this.OooO00o.utf8();
    }

    public OooO0O0 OooO0OO(int i) {
        return this.OooO0Oo.get(i);
    }

    public List<OooO0O0> OooO0Oo() {
        return this.OooO0Oo;
    }

    public C4077kx OooO0o() {
        return this.OooO0O0;
    }

    public int OooO0o0() {
        return this.OooO0Oo.size();
    }

    @Override // p285z2.AbstractC4262px
    public long contentLength() throws IOException {
        long j = this.OooO0o0;
        if (j != -1) {
            return j;
        }
        long jOooO0oO = OooO0oO(null, true);
        this.OooO0o0 = jOooO0oO;
        return jOooO0oO;
    }

    @Override // p285z2.AbstractC4262px
    public C4077kx contentType() {
        return this.OooO0OO;
    }

    @Override // p285z2.AbstractC4262px
    public void writeTo(i00 i00Var) throws IOException {
        OooO0oO(i00Var, false);
    }
}
