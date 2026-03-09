package p285z2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: z2.fx */
/* JADX INFO: loaded from: classes2.dex */
public final class C3892fx extends AbstractC4262px {
    private static final C4077kx OooO0OO = C4077kx.OooO0OO("application/x-www-form-urlencoded");
    private final List<String> OooO00o;
    private final List<String> OooO0O0;

    /* JADX INFO: renamed from: z2.fx$OooO00o */
    public static final class OooO00o {
        private final List<String> OooO00o;
        private final List<String> OooO0O0;
        private final Charset OooO0OO;

        public OooO00o() {
            this(null);
        }

        public OooO00o(Charset charset) {
            this.OooO00o = new ArrayList();
            this.OooO0O0 = new ArrayList();
            this.OooO0OO = charset;
        }

        public OooO00o OooO00o(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.OooO00o.add(C4003ix.OooO0OO(str, C4003ix.OooOOoo, false, false, true, true, this.OooO0OO));
            this.OooO0O0.add(C4003ix.OooO0OO(str2, C4003ix.OooOOoo, false, false, true, true, this.OooO0OO));
            return this;
        }

        public OooO00o OooO0O0(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.OooO00o.add(C4003ix.OooO0OO(str, C4003ix.OooOOoo, true, false, true, true, this.OooO0OO));
            this.OooO0O0.add(C4003ix.OooO0OO(str2, C4003ix.OooOOoo, true, false, true, true, this.OooO0OO));
            return this;
        }

        public C3892fx OooO0OO() {
            return new C3892fx(this.OooO00o, this.OooO0O0);
        }
    }

    public C3892fx(List<String> list, List<String> list2) {
        this.OooO00o = C4558xx.OooOo0(list);
        this.OooO0O0 = C4558xx.OooOo0(list2);
    }

    private long OooO0o(@Nullable i00 i00Var, boolean z) {
        h00 h00Var = z ? new h00() : i00Var.OooO00o();
        int size = this.OooO00o.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                h00Var.OooOOOO(38);
            }
            h00Var.OooOoO0(this.OooO00o.get(i));
            h00Var.OooOOOO(61);
            h00Var.OooOoO0(this.OooO0O0.get(i));
        }
        if (!z) {
            return 0L;
        }
        long jO00000O0 = h00Var.o00000O0();
        h00Var.OooooOo();
        return jO00000O0;
    }

    public String OooO00o(int i) {
        return this.OooO00o.get(i);
    }

    public String OooO0O0(int i) {
        return this.OooO0O0.get(i);
    }

    public String OooO0OO(int i) {
        return C4003ix.OooOoOO(OooO00o(i), true);
    }

    public int OooO0Oo() {
        return this.OooO00o.size();
    }

    public String OooO0o0(int i) {
        return C4003ix.OooOoOO(OooO0O0(i), true);
    }

    @Override // p285z2.AbstractC4262px
    public long contentLength() {
        return OooO0o(null, true);
    }

    @Override // p285z2.AbstractC4262px
    public C4077kx contentType() {
        return OooO0OO;
    }

    @Override // p285z2.AbstractC4262px
    public void writeTo(i00 i00Var) throws IOException {
        OooO0o(i00Var, false);
    }
}
