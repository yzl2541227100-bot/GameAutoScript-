package p285z2;

import com.anythink.expressad.foundation.p116d.C1781c;
import java.io.IOException;
import java.net.ProtocolException;
import p285z2.C4299qx;
import p285z2.InterfaceC4040jx;

/* JADX INFO: renamed from: z2.py */
/* JADX INFO: loaded from: classes2.dex */
public final class C4263py implements InterfaceC4040jx {
    private final boolean OooO00o;

    /* JADX INFO: renamed from: z2.py$OooO00o */
    public static final class OooO00o extends l00 {
        public long OoooOoo;

        public OooO00o(b10 b10Var) {
            super(b10Var);
        }

        @Override // p285z2.l00, p285z2.b10
        public void OooOooO(h00 h00Var, long j) throws IOException {
            super.OooOooO(h00Var, j);
            this.OoooOoo += j;
        }
    }

    public C4263py(boolean z) {
        this.OooO00o = z;
    }

    @Override // p285z2.InterfaceC4040jx
    public C4299qx intercept(InterfaceC4040jx.OooO00o oooO00o) throws IOException {
        C4299qx.OooO00o oooO00oO00oO0o;
        AbstractC4336rx abstractC4336rxOooO0OO;
        C4448uy c4448uy = (C4448uy) oooO00o;
        InterfaceC4300qy interfaceC4300qyOooOO0 = c4448uy.OooOO0();
        C4189ny c4189nyOooOO0o = c4448uy.OooOO0o();
        C4078ky c4078ky = (C4078ky) c4448uy.OooO0o();
        C4225ox c4225oxRequest = c4448uy.request();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c4448uy.OooO().OooOOOO(c4448uy.call());
        interfaceC4300qyOooOO0.OooO0O0(c4225oxRequest);
        c4448uy.OooO().OooOOO(c4448uy.call(), c4225oxRequest);
        C4299qx.OooO00o oooO00oOooO0Oo = null;
        if (C4411ty.OooO0O0(c4225oxRequest.OooO0oO()) && c4225oxRequest.OooO00o() != null) {
            if ("100-continue".equalsIgnoreCase(c4225oxRequest.OooO0OO("Expect"))) {
                interfaceC4300qyOooOO0.OooO0o0();
                c4448uy.OooO().OooOOoo(c4448uy.call());
                oooO00oOooO0Oo = interfaceC4300qyOooOO0.OooO0Oo(true);
            }
            if (oooO00oOooO0Oo == null) {
                c4448uy.OooO().OooOOO0(c4448uy.call());
                OooO00o oooO00o2 = new OooO00o(interfaceC4300qyOooOO0.OooO0o(c4225oxRequest, c4225oxRequest.OooO00o().contentLength()));
                i00 i00VarOooO0OO = u00.OooO0OO(oooO00o2);
                c4225oxRequest.OooO00o().writeTo(i00VarOooO0OO);
                i00VarOooO0OO.close();
                c4448uy.OooO().OooOO0o(c4448uy.call(), oooO00o2.OoooOoo);
            } else if (!c4078ky.OooOOo0()) {
                c4189nyOooOO0o.OooOO0();
            }
        }
        interfaceC4300qyOooOO0.OooO00o();
        if (oooO00oOooO0Oo == null) {
            c4448uy.OooO().OooOOoo(c4448uy.call());
            oooO00oOooO0Oo = interfaceC4300qyOooOO0.OooO0Oo(false);
        }
        C4299qx c4299qxOooO0OO = oooO00oOooO0Oo.OooOOo0(c4225oxRequest).OooO0oo(c4189nyOooOO0o.OooO0Oo().OooO0OO()).OooOOo(jCurrentTimeMillis).OooOOOO(System.currentTimeMillis()).OooO0OO();
        int iOoooooO = c4299qxOooO0OO.OoooooO();
        if (iOoooooO == 100) {
            c4299qxOooO0OO = interfaceC4300qyOooOO0.OooO0Oo(false).OooOOo0(c4225oxRequest).OooO0oo(c4189nyOooOO0o.OooO0Oo().OooO0OO()).OooOOo(jCurrentTimeMillis).OooOOOO(System.currentTimeMillis()).OooO0OO();
            iOoooooO = c4299qxOooO0OO.OoooooO();
        }
        c4448uy.OooO().OooOOo(c4448uy.call(), c4299qxOooO0OO);
        if (this.OooO00o && iOoooooO == 101) {
            oooO00oO00oO0o = c4299qxOooO0OO.o00oO0o();
            abstractC4336rxOooO0OO = C4558xx.OooO0OO;
        } else {
            oooO00oO00oO0o = c4299qxOooO0OO.o00oO0o();
            abstractC4336rxOooO0OO = interfaceC4300qyOooOO0.OooO0OO(c4299qxOooO0OO);
        }
        C4299qx c4299qxOooO0OO2 = oooO00oO00oO0o.OooO0O0(abstractC4336rxOooO0OO).OooO0OO();
        if (C1781c.f10318cf.equalsIgnoreCase(c4299qxOooO0OO2.o0OOO0o().OooO0OO("Connection")) || C1781c.f10318cf.equalsIgnoreCase(c4299qxOooO0OO2.o0OoOo0("Connection"))) {
            c4189nyOooOO0o.OooOO0();
        }
        if ((iOoooooO != 204 && iOoooooO != 205) || c4299qxOooO0OO2.OooOO0().contentLength() <= 0) {
            return c4299qxOooO0OO2;
        }
        throw new ProtocolException("HTTP " + iOoooooO + " had non-zero Content-Length: " + c4299qxOooO0OO2.OooOO0().contentLength());
    }
}
