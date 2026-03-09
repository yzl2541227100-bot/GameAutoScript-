package p285z2;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.p284io.IOUtils;
import p285z2.C3966hx;
import p285z2.C4299qx;

/* JADX INFO: renamed from: z2.az */
/* JADX INFO: loaded from: classes2.dex */
public final class C3709az implements InterfaceC4300qy {
    private static final int OooO = 1;
    private static final int OooO0oo = 0;
    private static final int OooOO0 = 2;
    private static final int OooOO0O = 3;
    private static final int OooOO0o = 4;
    private static final int OooOOO = 6;
    private static final int OooOOO0 = 5;
    private static final int OooOOOO = 262144;
    public final C4151mx OooO0O0;
    public final C4189ny OooO0OO;
    public final j00 OooO0Oo;
    public final i00 OooO0o0;
    public int OooO0o = 0;
    private long OooO0oO = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    /* JADX INFO: renamed from: z2.az$OooO */
    public final class OooO implements b10 {
        private final n00 OoooOoO;
        private boolean OoooOoo;
        private long Ooooo00;

        public OooO(long j) {
            this.OoooOoO = new n00(C3709az.this.OooO0o0.timeout());
            this.Ooooo00 = j;
        }

        @Override // p285z2.b10
        public void OooOooO(h00 h00Var, long j) throws IOException {
            if (this.OoooOoo) {
                throw new IllegalStateException("closed");
            }
            C4558xx.OooO0o(h00Var.o00000O0(), 0L, j);
            if (j <= this.Ooooo00) {
                C3709az.this.OooO0o0.OooOooO(h00Var, j);
                this.Ooooo00 -= j;
                return;
            }
            throw new ProtocolException("expected " + this.Ooooo00 + " bytes but received " + j);
        }

        @Override // p285z2.b10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.OoooOoo) {
                return;
            }
            this.OoooOoo = true;
            if (this.Ooooo00 > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            C3709az.this.OooO0oO(this.OoooOoO);
            C3709az.this.OooO0o = 3;
        }

        @Override // p285z2.b10, java.io.Flushable
        public void flush() throws IOException {
            if (this.OoooOoo) {
                return;
            }
            C3709az.this.OooO0o0.flush();
        }

        @Override // p285z2.b10
        public d10 timeout() {
            return this.OoooOoO;
        }
    }

    /* JADX INFO: renamed from: z2.az$OooO0O0 */
    public abstract class OooO0O0 implements c10 {
        public final n00 OoooOoO;
        public boolean OoooOoo;
        public long Ooooo00;

        private OooO0O0() {
            this.OoooOoO = new n00(C3709az.this.OooO0Oo.timeout());
            this.Ooooo00 = 0L;
        }

        public final void OooOO0(boolean z, IOException iOException) throws IOException {
            C3709az c3709az = C3709az.this;
            int i = c3709az.OooO0o;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException("state: " + C3709az.this.OooO0o);
            }
            c3709az.OooO0oO(this.OoooOoO);
            C3709az c3709az2 = C3709az.this;
            c3709az2.OooO0o = 6;
            C4189ny c4189ny = c3709az2.OooO0OO;
            if (c4189ny != null) {
                c4189ny.OooOOo(!z, c3709az2, this.Ooooo00, iOException);
            }
        }

        @Override // p285z2.c10
        public long read(h00 h00Var, long j) throws IOException {
            try {
                long j2 = C3709az.this.OooO0Oo.read(h00Var, j);
                if (j2 > 0) {
                    this.Ooooo00 += j2;
                }
                return j2;
            } catch (IOException e) {
                OooOO0(false, e);
                throw e;
            }
        }

        @Override // p285z2.c10
        public d10 timeout() {
            return this.OoooOoO;
        }
    }

    /* JADX INFO: renamed from: z2.az$OooO0OO */
    public final class OooO0OO implements b10 {
        private final n00 OoooOoO;
        private boolean OoooOoo;

        public OooO0OO() {
            this.OoooOoO = new n00(C3709az.this.OooO0o0.timeout());
        }

        @Override // p285z2.b10
        public void OooOooO(h00 h00Var, long j) throws IOException {
            if (this.OoooOoo) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            C3709az.this.OooO0o0.Oooo00O(j);
            C3709az.this.OooO0o0.OooOoO0(IOUtils.LINE_SEPARATOR_WINDOWS);
            C3709az.this.OooO0o0.OooOooO(h00Var, j);
            C3709az.this.OooO0o0.OooOoO0(IOUtils.LINE_SEPARATOR_WINDOWS);
        }

        @Override // p285z2.b10, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.OoooOoo) {
                return;
            }
            this.OoooOoo = true;
            C3709az.this.OooO0o0.OooOoO0("0\r\n\r\n");
            C3709az.this.OooO0oO(this.OoooOoO);
            C3709az.this.OooO0o = 3;
        }

        @Override // p285z2.b10, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.OoooOoo) {
                return;
            }
            C3709az.this.OooO0o0.flush();
        }

        @Override // p285z2.b10
        public d10 timeout() {
            return this.OoooOoO;
        }
    }

    /* JADX INFO: renamed from: z2.az$OooO0o */
    public class OooO0o extends OooO0O0 {
        private static final long Oooooo = -1;
        private final C4003ix OooooO0;
        private long OooooOO;
        private boolean OooooOo;

        public OooO0o(C4003ix c4003ix) {
            super();
            this.OooooOO = -1L;
            this.OooooOo = true;
            this.OooooO0 = c4003ix;
        }

        private void OooooOo() throws IOException {
            if (this.OooooOO != -1) {
                C3709az.this.OooO0Oo.Oooo0OO();
            }
            try {
                this.OooooOO = C3709az.this.OooO0Oo.Ooooo0o();
                String strTrim = C3709az.this.OooO0Oo.Oooo0OO().trim();
                if (this.OooooOO < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.OooooOO + strTrim + "\"");
                }
                if (this.OooooOO == 0) {
                    this.OooooOo = false;
                    C4374sy.OooOO0O(C3709az.this.OooO0O0.OooOO0O(), this.OooooO0, C3709az.this.OooOOOO());
                    OooOO0(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // p285z2.c10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.OoooOoo) {
                return;
            }
            if (this.OooooOo && !C4558xx.OooOOo0(this, 100, TimeUnit.MILLISECONDS)) {
                OooOO0(false, null);
            }
            this.OoooOoo = true;
        }

        @Override // p285z2.C3709az.OooO0O0, p285z2.c10
        public long read(h00 h00Var, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.OoooOoo) {
                throw new IllegalStateException("closed");
            }
            if (!this.OooooOo) {
                return -1L;
            }
            long j2 = this.OooooOO;
            if (j2 == 0 || j2 == -1) {
                OooooOo();
                if (!this.OooooOo) {
                    return -1L;
                }
            }
            long j3 = super.read(h00Var, Math.min(j, this.OooooOO));
            if (j3 != -1) {
                this.OooooOO -= j3;
                return j3;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            OooOO0(false, protocolException);
            throw protocolException;
        }
    }

    /* JADX INFO: renamed from: z2.az$OooOO0 */
    public class OooOO0 extends OooO0O0 {
        private long OooooO0;

        public OooOO0(long j) throws IOException {
            super();
            this.OooooO0 = j;
            if (j == 0) {
                OooOO0(true, null);
            }
        }

        @Override // p285z2.c10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.OoooOoo) {
                return;
            }
            if (this.OooooO0 != 0 && !C4558xx.OooOOo0(this, 100, TimeUnit.MILLISECONDS)) {
                OooOO0(false, null);
            }
            this.OoooOoo = true;
        }

        @Override // p285z2.C3709az.OooO0O0, p285z2.c10
        public long read(h00 h00Var, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.OoooOoo) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.OooooO0;
            if (j2 == 0) {
                return -1L;
            }
            long j3 = super.read(h00Var, Math.min(j2, j));
            if (j3 == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                OooOO0(false, protocolException);
                throw protocolException;
            }
            long j4 = this.OooooO0 - j3;
            this.OooooO0 = j4;
            if (j4 == 0) {
                OooOO0(true, null);
            }
            return j3;
        }
    }

    /* JADX INFO: renamed from: z2.az$OooOO0O */
    public class OooOO0O extends OooO0O0 {
        private boolean OooooO0;

        public OooOO0O() {
            super();
        }

        @Override // p285z2.c10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.OoooOoo) {
                return;
            }
            if (!this.OooooO0) {
                OooOO0(false, null);
            }
            this.OoooOoo = true;
        }

        @Override // p285z2.C3709az.OooO0O0, p285z2.c10
        public long read(h00 h00Var, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.OoooOoo) {
                throw new IllegalStateException("closed");
            }
            if (this.OooooO0) {
                return -1L;
            }
            long j2 = super.read(h00Var, j);
            if (j2 != -1) {
                return j2;
            }
            this.OooooO0 = true;
            OooOO0(true, null);
            return -1L;
        }
    }

    public C3709az(C4151mx c4151mx, C4189ny c4189ny, j00 j00Var, i00 i00Var) {
        this.OooO0O0 = c4151mx;
        this.OooO0OO = c4189ny;
        this.OooO0Oo = j00Var;
        this.OooO0o0 = i00Var;
    }

    private String OooOOO() throws IOException {
        String strOooOo0o = this.OooO0Oo.OooOo0o(this.OooO0oO);
        this.OooO0oO -= (long) strOooOo0o.length();
        return strOooOo0o;
    }

    public b10 OooO() {
        if (this.OooO0o == 1) {
            this.OooO0o = 2;
            return new OooO0OO();
        }
        throw new IllegalStateException("state: " + this.OooO0o);
    }

    @Override // p285z2.InterfaceC4300qy
    public void OooO00o() throws IOException {
        this.OooO0o0.flush();
    }

    @Override // p285z2.InterfaceC4300qy
    public void OooO0O0(C4225ox c4225ox) throws IOException {
        OooOOOo(c4225ox.OooO0o0(), C4522wy.OooO00o(c4225ox, this.OooO0OO.OooO0Oo().OooO0O0().OooO0O0().type()));
    }

    @Override // p285z2.InterfaceC4300qy
    public AbstractC4336rx OooO0OO(C4299qx c4299qx) throws IOException {
        C4189ny c4189ny = this.OooO0OO;
        c4189ny.OooO0o.OooOOo0(c4189ny.OooO0o0);
        String strO0OoOo0 = c4299qx.o0OoOo0("Content-Type");
        if (!C4374sy.OooO0OO(c4299qx)) {
            return new C4485vy(strO0OoOo0, 0L, u00.OooO0Oo(OooOO0o(0L)));
        }
        if ("chunked".equalsIgnoreCase(c4299qx.o0OoOo0("Transfer-Encoding"))) {
            return new C4485vy(strO0OoOo0, -1L, u00.OooO0Oo(OooOO0(c4299qx.o0OOO0o().OooOO0O())));
        }
        long jOooO0O0 = C4374sy.OooO0O0(c4299qx);
        return jOooO0O0 != -1 ? new C4485vy(strO0OoOo0, jOooO0O0, u00.OooO0Oo(OooOO0o(jOooO0O0))) : new C4485vy(strO0OoOo0, -1L, u00.OooO0Oo(OooOOO0()));
    }

    @Override // p285z2.InterfaceC4300qy
    public C4299qx.OooO00o OooO0Oo(boolean z) throws IOException {
        int i = this.OooO0o;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.OooO0o);
        }
        try {
            C4596yy c4596yyOooO0O0 = C4596yy.OooO0O0(OooOOO());
            C4299qx.OooO00o oooO00oOooOO0 = new C4299qx.OooO00o().OooOOO(c4596yyOooO0O0.OooO00o).OooO0oO(c4596yyOooO0O0.OooO0O0).OooOO0O(c4596yyOooO0O0.OooO0OO).OooOO0(OooOOOO());
            if (z && c4596yyOooO0O0.OooO0O0 == 100) {
                return null;
            }
            if (c4596yyOooO0O0.OooO0O0 == 100) {
                this.OooO0o = 3;
                return oooO00oOooOO0;
            }
            this.OooO0o = 4;
            return oooO00oOooOO0;
        } catch (EOFException e) {
            IOException iOException = new IOException("unexpected end of stream on " + this.OooO0OO);
            iOException.initCause(e);
            throw iOException;
        }
    }

    @Override // p285z2.InterfaceC4300qy
    public b10 OooO0o(C4225ox c4225ox, long j) {
        if ("chunked".equalsIgnoreCase(c4225ox.OooO0OO("Transfer-Encoding"))) {
            return OooO();
        }
        if (j != -1) {
            return OooOO0O(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // p285z2.InterfaceC4300qy
    public void OooO0o0() throws IOException {
        this.OooO0o0.flush();
    }

    public void OooO0oO(n00 n00Var) {
        d10 d10VarOooOO0O = n00Var.OooOO0O();
        n00Var.OooOO0o(d10.OooO0Oo);
        d10VarOooOO0O.OooO00o();
        d10VarOooOO0O.OooO0O0();
    }

    public boolean OooO0oo() {
        return this.OooO0o == 6;
    }

    public c10 OooOO0(C4003ix c4003ix) throws IOException {
        if (this.OooO0o == 4) {
            this.OooO0o = 5;
            return new OooO0o(c4003ix);
        }
        throw new IllegalStateException("state: " + this.OooO0o);
    }

    public b10 OooOO0O(long j) {
        if (this.OooO0o == 1) {
            this.OooO0o = 2;
            return new OooO(j);
        }
        throw new IllegalStateException("state: " + this.OooO0o);
    }

    public c10 OooOO0o(long j) throws IOException {
        if (this.OooO0o == 4) {
            this.OooO0o = 5;
            return new OooOO0(j);
        }
        throw new IllegalStateException("state: " + this.OooO0o);
    }

    public c10 OooOOO0() throws IOException {
        if (this.OooO0o != 4) {
            throw new IllegalStateException("state: " + this.OooO0o);
        }
        C4189ny c4189ny = this.OooO0OO;
        if (c4189ny == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.OooO0o = 5;
        c4189ny.OooOO0();
        return new OooOO0O();
    }

    public C3966hx OooOOOO() throws IOException {
        C3966hx.OooO00o oooO00o = new C3966hx.OooO00o();
        while (true) {
            String strOooOOO = OooOOO();
            if (strOooOOO.length() == 0) {
                return oooO00o.OooO0oo();
            }
            AbstractC4484vx.OooO00o.OooO00o(oooO00o, strOooOOO);
        }
    }

    public void OooOOOo(C3966hx c3966hx, String str) throws IOException {
        if (this.OooO0o != 0) {
            throw new IllegalStateException("state: " + this.OooO0o);
        }
        this.OooO0o0.OooOoO0(str).OooOoO0(IOUtils.LINE_SEPARATOR_WINDOWS);
        int iOooOO0o = c3966hx.OooOO0o();
        for (int i = 0; i < iOooOO0o; i++) {
            this.OooO0o0.OooOoO0(c3966hx.OooO0oO(i)).OooOoO0(": ").OooOoO0(c3966hx.OooOOO(i)).OooOoO0(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        this.OooO0o0.OooOoO0(IOUtils.LINE_SEPARATOR_WINDOWS);
        this.OooO0o = 1;
    }

    @Override // p285z2.InterfaceC4300qy
    public void cancel() {
        C4078ky c4078kyOooO0Oo = this.OooO0OO.OooO0Oo();
        if (c4078kyOooO0Oo != null) {
            c4078kyOooO0Oo.OooO0oO();
        }
    }
}
