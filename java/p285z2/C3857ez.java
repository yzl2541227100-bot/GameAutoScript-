package p285z2;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p285z2.C3966hx;
import p285z2.C4299qx;
import p285z2.InterfaceC4040jx;

/* JADX INFO: renamed from: z2.ez */
/* JADX INFO: loaded from: classes2.dex */
public final class C3857ez implements InterfaceC4300qy {
    private final InterfaceC4040jx.OooO00o OooO0O0;
    public final C4189ny OooO0OO;
    private final C3894fz OooO0Oo;
    private final Protocol OooO0o;
    private C3968hz OooO0o0;
    private static final String OooO0oO = "connection";
    private static final String OooO0oo = "host";
    private static final String OooO = "keep-alive";
    private static final String OooOO0 = "proxy-connection";
    private static final String OooOO0o = "te";
    private static final String OooOO0O = "transfer-encoding";
    private static final String OooOOO0 = "encoding";
    private static final String OooOOO = "upgrade";
    private static final List<String> OooOOOO = C4558xx.OooOo0O(OooO0oO, OooO0oo, OooO, OooOO0, OooOO0o, OooOO0O, OooOOO0, OooOOO, C3746bz.OooO0o, C3746bz.OooO0oO, C3746bz.OooO0oo, C3746bz.OooO);
    private static final List<String> OooOOOo = C4558xx.OooOo0O(OooO0oO, OooO0oo, OooO, OooOO0, OooOO0o, OooOO0O, OooOOO0, OooOOO);

    /* JADX INFO: renamed from: z2.ez$OooO00o */
    public class OooO00o extends m00 {
        public boolean OoooOoO;
        public long OoooOoo;

        public OooO00o(c10 c10Var) {
            super(c10Var);
            this.OoooOoO = false;
            this.OoooOoo = 0L;
        }

        private void OooOO0(IOException iOException) {
            if (this.OoooOoO) {
                return;
            }
            this.OoooOoO = true;
            C3857ez c3857ez = C3857ez.this;
            c3857ez.OooO0OO.OooOOo(false, c3857ez, this.OoooOoo, iOException);
        }

        @Override // p285z2.m00, p285z2.c10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            OooOO0(null);
        }

        @Override // p285z2.m00, p285z2.c10
        public long read(h00 h00Var, long j) throws IOException {
            try {
                long j2 = delegate().read(h00Var, j);
                if (j2 > 0) {
                    this.OoooOoo += j2;
                }
                return j2;
            } catch (IOException e) {
                OooOO0(e);
                throw e;
            }
        }
    }

    public C3857ez(C4151mx c4151mx, InterfaceC4040jx.OooO00o oooO00o, C4189ny c4189ny, C3894fz c3894fz) {
        this.OooO0O0 = oooO00o;
        this.OooO0OO = c4189ny;
        this.OooO0Oo = c3894fz;
        List<Protocol> listOooOo = c4151mx.OooOo();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.OooO0o = listOooOo.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    public static List<C3746bz> OooO0oO(C4225ox c4225ox) {
        C3966hx c3966hxOooO0o0 = c4225ox.OooO0o0();
        ArrayList arrayList = new ArrayList(c3966hxOooO0o0.OooOO0o() + 4);
        arrayList.add(new C3746bz(C3746bz.OooOO0O, c4225ox.OooO0oO()));
        arrayList.add(new C3746bz(C3746bz.OooOO0o, C4522wy.OooO0OO(c4225ox.OooOO0O())));
        String strOooO0OO = c4225ox.OooO0OO(HttpHeaders.HOST);
        if (strOooO0OO != null) {
            arrayList.add(new C3746bz(C3746bz.OooOOO, strOooO0OO));
        }
        arrayList.add(new C3746bz(C3746bz.OooOOO0, c4225ox.OooOO0O().Oooo()));
        int iOooOO0o = c3966hxOooO0o0.OooOO0o();
        for (int i = 0; i < iOooOO0o; i++) {
            ByteString byteStringEncodeUtf8 = ByteString.encodeUtf8(c3966hxOooO0o0.OooO0oO(i).toLowerCase(Locale.US));
            if (!OooOOOO.contains(byteStringEncodeUtf8.utf8())) {
                arrayList.add(new C3746bz(byteStringEncodeUtf8, c3966hxOooO0o0.OooOOO(i)));
            }
        }
        return arrayList;
    }

    public static C4299qx.OooO00o OooO0oo(C3966hx c3966hx, Protocol protocol) throws IOException {
        C3966hx.OooO00o oooO00o = new C3966hx.OooO00o();
        int iOooOO0o = c3966hx.OooOO0o();
        C4596yy c4596yyOooO0O0 = null;
        for (int i = 0; i < iOooOO0o; i++) {
            String strOooO0oO = c3966hx.OooO0oO(i);
            String strOooOOO = c3966hx.OooOOO(i);
            if (strOooO0oO.equals(C3746bz.OooO0o0)) {
                c4596yyOooO0O0 = C4596yy.OooO0O0("HTTP/1.1 " + strOooOOO);
            } else if (!OooOOOo.contains(strOooO0oO)) {
                AbstractC4484vx.OooO00o.OooO0O0(oooO00o, strOooO0oO, strOooOOO);
            }
        }
        if (c4596yyOooO0O0 != null) {
            return new C4299qx.OooO00o().OooOOO(protocol).OooO0oO(c4596yyOooO0O0.OooO0O0).OooOO0O(c4596yyOooO0O0.OooO0OO).OooOO0(oooO00o.OooO0oo());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // p285z2.InterfaceC4300qy
    public void OooO00o() throws IOException {
        this.OooO0o0.OooOO0o().close();
    }

    @Override // p285z2.InterfaceC4300qy
    public void OooO0O0(C4225ox c4225ox) throws IOException {
        if (this.OooO0o0 != null) {
            return;
        }
        C3968hz c3968hzO00ooo = this.OooO0Oo.o00ooo(OooO0oO(c4225ox), c4225ox.OooO00o() != null);
        this.OooO0o0 = c3968hzO00ooo;
        d10 d10VarOooOOOo = c3968hzO00ooo.OooOOOo();
        long jOooO0O0 = this.OooO0O0.OooO0O0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d10VarOooOOOo.OooO0oo(jOooO0O0, timeUnit);
        this.OooO0o0.OooOoO0().OooO0oo(this.OooO0O0.OooO0OO(), timeUnit);
    }

    @Override // p285z2.InterfaceC4300qy
    public AbstractC4336rx OooO0OO(C4299qx c4299qx) throws IOException {
        C4189ny c4189ny = this.OooO0OO;
        c4189ny.OooO0o.OooOOo0(c4189ny.OooO0o0);
        return new C4485vy(c4299qx.o0OoOo0("Content-Type"), C4374sy.OooO0O0(c4299qx), u00.OooO0Oo(new OooO00o(this.OooO0o0.OooOOO0())));
    }

    @Override // p285z2.InterfaceC4300qy
    public C4299qx.OooO00o OooO0Oo(boolean z) throws IOException {
        C4299qx.OooO00o oooO00oOooO0oo = OooO0oo(this.OooO0o0.OooOo0O(), this.OooO0o);
        if (z && AbstractC4484vx.OooO00o.OooO0Oo(oooO00oOooO0oo) == 100) {
            return null;
        }
        return oooO00oOooO0oo;
    }

    @Override // p285z2.InterfaceC4300qy
    public b10 OooO0o(C4225ox c4225ox, long j) {
        return this.OooO0o0.OooOO0o();
    }

    @Override // p285z2.InterfaceC4300qy
    public void OooO0o0() throws IOException {
        this.OooO0Oo.flush();
    }

    @Override // p285z2.InterfaceC4300qy
    public void cancel() {
        C3968hz c3968hz = this.OooO0o0;
        if (c3968hz != null) {
            c3968hz.OooO0oo(ErrorCode.CANCEL);
        }
    }
}
