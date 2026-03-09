package p285z2;

import com.anythink.expressad.foundation.p120g.p126f.p133g.C1849b;
import com.github.kevinsawicki.http.HttpRequest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import p285z2.C3782cy;
import p285z2.C3966hx;
import p285z2.C4299qx;
import p285z2.InterfaceC4040jx;

/* JADX INFO: renamed from: z2.ay */
/* JADX INFO: loaded from: classes2.dex */
public final class C3708ay implements InterfaceC4040jx {
    public final InterfaceC3893fy OooO00o;

    /* JADX INFO: renamed from: z2.ay$OooO00o */
    public class OooO00o implements c10 {
        public boolean OoooOoO;
        public final /* synthetic */ j00 OoooOoo;
        public final /* synthetic */ InterfaceC3745by Ooooo00;
        public final /* synthetic */ i00 Ooooo0o;

        public OooO00o(j00 j00Var, InterfaceC3745by interfaceC3745by, i00 i00Var) {
            this.OoooOoo = j00Var;
            this.Ooooo00 = interfaceC3745by;
            this.Ooooo0o = i00Var;
        }

        @Override // p285z2.c10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.OoooOoO && !C4558xx.OooOOo0(this, 100, TimeUnit.MILLISECONDS)) {
                this.OoooOoO = true;
                this.Ooooo00.abort();
            }
            this.OoooOoo.close();
        }

        @Override // p285z2.c10
        public long read(h00 h00Var, long j) throws IOException {
            try {
                long j2 = this.OoooOoo.read(h00Var, j);
                if (j2 != -1) {
                    h00Var.o0OoOo0(this.Ooooo0o.OooO00o(), h00Var.o00000O0() - j2, j2);
                    this.Ooooo0o.OooOo0();
                    return j2;
                }
                if (!this.OoooOoO) {
                    this.OoooOoO = true;
                    this.Ooooo0o.close();
                }
                return -1L;
            } catch (IOException e) {
                if (!this.OoooOoO) {
                    this.OoooOoO = true;
                    this.Ooooo00.abort();
                }
                throw e;
            }
        }

        @Override // p285z2.c10
        public d10 timeout() {
            return this.OoooOoo.timeout();
        }
    }

    public C3708ay(InterfaceC3893fy interfaceC3893fy) {
        this.OooO00o = interfaceC3893fy;
    }

    private C4299qx OooO00o(InterfaceC3745by interfaceC3745by, C4299qx c4299qx) throws IOException {
        b10 b10VarOooO00o;
        if (interfaceC3745by == null || (b10VarOooO00o = interfaceC3745by.OooO00o()) == null) {
            return c4299qx;
        }
        return c4299qx.o00oO0o().OooO0O0(new C4485vy(c4299qx.o0OoOo0("Content-Type"), c4299qx.OooOO0().contentLength(), u00.OooO0Oo(new OooO00o(c4299qx.OooOO0().source(), interfaceC3745by, u00.OooO0OO(b10VarOooO00o))))).OooO0OO();
    }

    private static C3966hx OooO0O0(C3966hx c3966hx, C3966hx c3966hx2) {
        C3966hx.OooO00o oooO00o = new C3966hx.OooO00o();
        int iOooOO0o = c3966hx.OooOO0o();
        for (int i = 0; i < iOooOO0o; i++) {
            String strOooO0oO = c3966hx.OooO0oO(i);
            String strOooOOO = c3966hx.OooOOO(i);
            if ((!"Warning".equalsIgnoreCase(strOooO0oO) || !strOooOOO.startsWith("1")) && (OooO0OO(strOooO0oO) || !OooO0Oo(strOooO0oO) || c3966hx2.OooO0Oo(strOooO0oO) == null)) {
                AbstractC4484vx.OooO00o.OooO0O0(oooO00o, strOooO0oO, strOooOOO);
            }
        }
        int iOooOO0o2 = c3966hx2.OooOO0o();
        for (int i2 = 0; i2 < iOooOO0o2; i2++) {
            String strOooO0oO2 = c3966hx2.OooO0oO(i2);
            if (!OooO0OO(strOooO0oO2) && OooO0Oo(strOooO0oO2)) {
                AbstractC4484vx.OooO00o.OooO0O0(oooO00o, strOooO0oO2, c3966hx2.OooOOO(i2));
            }
        }
        return oooO00o.OooO0oo();
    }

    public static boolean OooO0OO(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    public static boolean OooO0Oo(String str) {
        return ("Connection".equalsIgnoreCase(str) || C1849b.f11404c.equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || HttpRequest.HEADER_PROXY_AUTHORIZATION.equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    private static C4299qx OooO0o0(C4299qx c4299qx) {
        return (c4299qx == null || c4299qx.OooOO0() == null) ? c4299qx : c4299qx.o00oO0o().OooO0O0(null).OooO0OO();
    }

    @Override // p285z2.InterfaceC4040jx
    public C4299qx intercept(InterfaceC4040jx.OooO00o oooO00o) throws IOException {
        InterfaceC3893fy interfaceC3893fy = this.OooO00o;
        C4299qx c4299qxOooO0o0 = interfaceC3893fy != null ? interfaceC3893fy.OooO0o0(oooO00o.request()) : null;
        C3782cy c3782cyOooO0OO = new C3782cy.OooO00o(System.currentTimeMillis(), oooO00o.request(), c4299qxOooO0o0).OooO0OO();
        C4225ox c4225ox = c3782cyOooO0OO.OooO00o;
        C4299qx c4299qx = c3782cyOooO0OO.OooO0O0;
        InterfaceC3893fy interfaceC3893fy2 = this.OooO00o;
        if (interfaceC3893fy2 != null) {
            interfaceC3893fy2.OooO0O0(c3782cyOooO0OO);
        }
        if (c4299qxOooO0o0 != null && c4299qx == null) {
            C4558xx.OooO0oO(c4299qxOooO0o0.OooOO0());
        }
        if (c4225ox == null && c4299qx == null) {
            return new C4299qx.OooO00o().OooOOo0(oooO00o.request()).OooOOO(Protocol.HTTP_1_1).OooO0oO(504).OooOO0O("Unsatisfiable Request (only-if-cached)").OooO0O0(C4558xx.OooO0OO).OooOOo(-1L).OooOOOO(System.currentTimeMillis()).OooO0OO();
        }
        if (c4225ox == null) {
            return c4299qx.o00oO0o().OooO0Oo(OooO0o0(c4299qx)).OooO0OO();
        }
        try {
            C4299qx c4299qxOooO0o02 = oooO00o.OooO0o0(c4225ox);
            if (c4299qxOooO0o02 == null && c4299qxOooO0o0 != null) {
            }
            if (c4299qx != null) {
                if (c4299qxOooO0o02.OoooooO() == 304) {
                    C4299qx c4299qxOooO0OO = c4299qx.o00oO0o().OooOO0(OooO0O0(c4299qx.o00Oo0(), c4299qxOooO0o02.o00Oo0())).OooOOo(c4299qxOooO0o02.o0Oo0oo()).OooOOOO(c4299qxOooO0o02.o0ooOoO()).OooO0Oo(OooO0o0(c4299qx)).OooOO0o(OooO0o0(c4299qxOooO0o02)).OooO0OO();
                    c4299qxOooO0o02.OooOO0().close();
                    this.OooO00o.OooO00o();
                    this.OooO00o.OooO0o(c4299qx, c4299qxOooO0OO);
                    return c4299qxOooO0OO;
                }
                C4558xx.OooO0oO(c4299qx.OooOO0());
            }
            C4299qx c4299qxOooO0OO2 = c4299qxOooO0o02.o00oO0o().OooO0Oo(OooO0o0(c4299qx)).OooOO0o(OooO0o0(c4299qxOooO0o02)).OooO0OO();
            if (this.OooO00o != null) {
                if (C4374sy.OooO0OO(c4299qxOooO0OO2) && C3782cy.OooO00o(c4299qxOooO0OO2, c4225ox)) {
                    return OooO00o(this.OooO00o.OooO0Oo(c4299qxOooO0OO2), c4299qxOooO0OO2);
                }
                if (C4411ty.OooO00o(c4225ox.OooO0oO())) {
                    try {
                        this.OooO00o.OooO0OO(c4225ox);
                    } catch (IOException unused) {
                    }
                }
            }
            return c4299qxOooO0OO2;
        } finally {
            if (c4299qxOooO0o0 != null) {
                C4558xx.OooO0oO(c4299qxOooO0o0.OooOO0());
            }
        }
    }
}
