package p285z2;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.Protocol;
import org.slf4j.helpers.MessageFormatter;
import p285z2.C3966hx;

/* JADX INFO: renamed from: z2.qx */
/* JADX INFO: loaded from: classes2.dex */
public final class C4299qx implements Closeable {
    public final C4225ox OoooOoO;
    public final Protocol OoooOoo;
    public final int Ooooo00;
    public final String Ooooo0o;

    @Nullable
    public final C3929gx OooooO0;
    public final C3966hx OooooOO;

    @Nullable
    public final AbstractC4336rx OooooOo;

    @Nullable
    public final C4299qx Oooooo;

    @Nullable
    public final C4299qx Oooooo0;

    @Nullable
    public final C4299qx OoooooO;
    public final long Ooooooo;
    public final long o0OoOo0;

    @Nullable
    private volatile C4298qw ooOO;

    /* JADX INFO: renamed from: z2.qx$OooO00o */
    public static class OooO00o {

        @Nullable
        public C4299qx OooO;

        @Nullable
        public C4225ox OooO00o;

        @Nullable
        public Protocol OooO0O0;
        public int OooO0OO;
        public String OooO0Oo;
        public C3966hx.OooO00o OooO0o;

        @Nullable
        public C3929gx OooO0o0;

        @Nullable
        public AbstractC4336rx OooO0oO;

        @Nullable
        public C4299qx OooO0oo;

        @Nullable
        public C4299qx OooOO0;
        public long OooOO0O;
        public long OooOO0o;

        public OooO00o() {
            this.OooO0OO = -1;
            this.OooO0o = new C3966hx.OooO00o();
        }

        public OooO00o(C4299qx c4299qx) {
            this.OooO0OO = -1;
            this.OooO00o = c4299qx.OoooOoO;
            this.OooO0O0 = c4299qx.OoooOoo;
            this.OooO0OO = c4299qx.Ooooo00;
            this.OooO0Oo = c4299qx.Ooooo0o;
            this.OooO0o0 = c4299qx.OooooO0;
            this.OooO0o = c4299qx.OooooOO.OooO();
            this.OooO0oO = c4299qx.OooooOo;
            this.OooO0oo = c4299qx.Oooooo0;
            this.OooO = c4299qx.Oooooo;
            this.OooOO0 = c4299qx.OoooooO;
            this.OooOO0O = c4299qx.Ooooooo;
            this.OooOO0o = c4299qx.o0OoOo0;
        }

        private void OooO0o(String str, C4299qx c4299qx) {
            if (c4299qx.OooooOo != null) {
                throw new IllegalArgumentException(str + ".body != null");
            }
            if (c4299qx.Oooooo0 != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            if (c4299qx.Oooooo != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            }
            if (c4299qx.OoooooO == null) {
                return;
            }
            throw new IllegalArgumentException(str + ".priorResponse != null");
        }

        private void OooO0o0(C4299qx c4299qx) {
            if (c4299qx.OooooOo != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public OooO00o OooO(String str, String str2) {
            this.OooO0o.OooOO0O(str, str2);
            return this;
        }

        public OooO00o OooO00o(String str, String str2) {
            this.OooO0o.OooO0O0(str, str2);
            return this;
        }

        public OooO00o OooO0O0(@Nullable AbstractC4336rx abstractC4336rx) {
            this.OooO0oO = abstractC4336rx;
            return this;
        }

        public C4299qx OooO0OO() {
            if (this.OooO00o == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.OooO0O0 == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.OooO0OO >= 0) {
                if (this.OooO0Oo != null) {
                    return new C4299qx(this);
                }
                throw new IllegalStateException("message == null");
            }
            throw new IllegalStateException("code < 0: " + this.OooO0OO);
        }

        public OooO00o OooO0Oo(@Nullable C4299qx c4299qx) {
            if (c4299qx != null) {
                OooO0o("cacheResponse", c4299qx);
            }
            this.OooO = c4299qx;
            return this;
        }

        public OooO00o OooO0oO(int i) {
            this.OooO0OO = i;
            return this;
        }

        public OooO00o OooO0oo(@Nullable C3929gx c3929gx) {
            this.OooO0o0 = c3929gx;
            return this;
        }

        public OooO00o OooOO0(C3966hx c3966hx) {
            this.OooO0o = c3966hx.OooO();
            return this;
        }

        public OooO00o OooOO0O(String str) {
            this.OooO0Oo = str;
            return this;
        }

        public OooO00o OooOO0o(@Nullable C4299qx c4299qx) {
            if (c4299qx != null) {
                OooO0o("networkResponse", c4299qx);
            }
            this.OooO0oo = c4299qx;
            return this;
        }

        public OooO00o OooOOO(Protocol protocol) {
            this.OooO0O0 = protocol;
            return this;
        }

        public OooO00o OooOOO0(@Nullable C4299qx c4299qx) {
            if (c4299qx != null) {
                OooO0o0(c4299qx);
            }
            this.OooOO0 = c4299qx;
            return this;
        }

        public OooO00o OooOOOO(long j) {
            this.OooOO0o = j;
            return this;
        }

        public OooO00o OooOOOo(String str) {
            this.OooO0o.OooOO0(str);
            return this;
        }

        public OooO00o OooOOo(long j) {
            this.OooOO0O = j;
            return this;
        }

        public OooO00o OooOOo0(C4225ox c4225ox) {
            this.OooO00o = c4225ox;
            return this;
        }
    }

    public C4299qx(OooO00o oooO00o) {
        this.OoooOoO = oooO00o.OooO00o;
        this.OoooOoo = oooO00o.OooO0O0;
        this.Ooooo00 = oooO00o.OooO0OO;
        this.Ooooo0o = oooO00o.OooO0Oo;
        this.OooooO0 = oooO00o.OooO0o0;
        this.OooooOO = oooO00o.OooO0o.OooO0oo();
        this.OooooOo = oooO00o.OooO0oO;
        this.Oooooo0 = oooO00o.OooO0oo;
        this.Oooooo = oooO00o.OooO;
        this.OoooooO = oooO00o.OooOO0;
        this.Ooooooo = oooO00o.OooOO0O;
        this.o0OoOo0 = oooO00o.OooOO0o;
    }

    @Nullable
    public AbstractC4336rx OooOO0() {
        return this.OooooOo;
    }

    public C4298qw OooooOo() {
        C4298qw c4298qw = this.ooOO;
        if (c4298qw != null) {
            return c4298qw;
        }
        C4298qw c4298qwOooOOO0 = C4298qw.OooOOO0(this.OooooOO);
        this.ooOO = c4298qwOooOOO0;
        return c4298qwOooOOO0;
    }

    public List<C4446uw> Oooooo() {
        String str;
        int i = this.Ooooo00;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return Collections.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return C4374sy.OooO0oO(o00Oo0(), str);
    }

    @Nullable
    public C4299qx Oooooo0() {
        return this.Oooooo;
    }

    public int OoooooO() {
        return this.Ooooo00;
    }

    @Nullable
    public C3929gx Ooooooo() {
        return this.OooooO0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC4336rx abstractC4336rx = this.OooooOo;
        if (abstractC4336rx == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC4336rx.close();
    }

    public List<String> o00O0O(String str) {
        return this.OooooOO.OooOOOO(str);
    }

    public C3966hx o00Oo0() {
        return this.OooooOO;
    }

    public boolean o00Ooo() {
        int i = this.Ooooo00;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case SET_ENABLED_VALUE:
            case 302:
            case SET_TITLE_TEXT_VALUE:
                return true;
            default:
                return false;
        }
    }

    public boolean o00o0O() {
        int i = this.Ooooo00;
        return i >= 200 && i < 300;
    }

    public AbstractC4336rx o00oO0O(long j) throws IOException {
        j00 j00VarSource = this.OooooOo.source();
        j00VarSource.request(j);
        h00 h00VarClone = j00VarSource.OooO00o().clone();
        if (h00VarClone.o00000O0() > j) {
            h00 h00Var = new h00();
            h00Var.OooOooO(h00VarClone, j);
            h00VarClone.OooooOo();
            h00VarClone = h00Var;
        }
        return AbstractC4336rx.create(this.OooooOo.contentType(), h00VarClone.o00000O0(), h00VarClone);
    }

    public OooO00o o00oO0o() {
        return new OooO00o(this);
    }

    public String o00ooo() {
        return this.Ooooo0o;
    }

    public C4225ox o0OOO0o() {
        return this.OoooOoO;
    }

    public long o0Oo0oo() {
        return this.Ooooooo;
    }

    @Nullable
    public String o0OoOo0(String str) {
        return ooOO(str, null);
    }

    @Nullable
    public C4299qx o0ooOO0() {
        return this.OoooooO;
    }

    public Protocol o0ooOOo() {
        return this.OoooOoo;
    }

    public long o0ooOoO() {
        return this.o0OoOo0;
    }

    @Nullable
    public C4299qx oo000o() {
        return this.Oooooo0;
    }

    @Nullable
    public String ooOO(String str, @Nullable String str2) {
        String strOooO0Oo = this.OooooOO.OooO0Oo(str);
        return strOooO0Oo != null ? strOooO0Oo : str2;
    }

    public String toString() {
        return "Response{protocol=" + this.OoooOoo + ", code=" + this.Ooooo00 + ", message=" + this.Ooooo0o + ", url=" + this.OoooOoO.OooOO0O() + MessageFormatter.DELIM_STOP;
    }
}
