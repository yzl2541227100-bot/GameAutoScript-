package p285z2;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.anythink.expressad.foundation.p120g.p126f.p133g.C1849b;
import com.github.kevinsawicki.http.HttpRequest;
import java.io.IOException;
import java.util.List;
import p285z2.C4225ox;
import p285z2.C4299qx;
import p285z2.InterfaceC4040jx;

/* JADX INFO: renamed from: z2.oy */
/* JADX INFO: loaded from: classes2.dex */
public final class C4226oy implements InterfaceC4040jx {
    private final InterfaceC3707ax OooO00o;

    public C4226oy(InterfaceC3707ax interfaceC3707ax) {
        this.OooO00o = interfaceC3707ax;
    }

    private String OooO00o(List<C4631zw> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            C4631zw c4631zw = list.get(i);
            sb.append(c4631zw.OooO0oo());
            sb.append('=');
            sb.append(c4631zw.OooOo00());
        }
        return sb.toString();
    }

    @Override // p285z2.InterfaceC4040jx
    public C4299qx intercept(InterfaceC4040jx.OooO00o oooO00o) throws IOException {
        C4225ox c4225oxRequest = oooO00o.request();
        C4225ox.OooO00o oooO00oOooO0oo = c4225oxRequest.OooO0oo();
        AbstractC4262px abstractC4262pxOooO00o = c4225oxRequest.OooO00o();
        if (abstractC4262pxOooO00o != null) {
            C4077kx c4077kxContentType = abstractC4262pxOooO00o.contentType();
            if (c4077kxContentType != null) {
                oooO00oOooO0oo.OooO0oo("Content-Type", c4077kxContentType.toString());
            }
            long jContentLength = abstractC4262pxOooO00o.contentLength();
            if (jContentLength != -1) {
                oooO00oOooO0oo.OooO0oo("Content-Length", Long.toString(jContentLength));
                oooO00oOooO0oo.OooOOO("Transfer-Encoding");
            } else {
                oooO00oOooO0oo.OooO0oo("Transfer-Encoding", "chunked");
                oooO00oOooO0oo.OooOOO("Content-Length");
            }
        }
        boolean z = false;
        if (c4225oxRequest.OooO0OO(HttpHeaders.HOST) == null) {
            oooO00oOooO0oo.OooO0oo(HttpHeaders.HOST, C4558xx.OooOo00(c4225oxRequest.OooOO0O(), false));
        }
        if (c4225oxRequest.OooO0OO("Connection") == null) {
            oooO00oOooO0oo.OooO0oo("Connection", C1849b.f11404c);
        }
        if (c4225oxRequest.OooO0OO(HttpRequest.HEADER_ACCEPT_ENCODING) == null && c4225oxRequest.OooO0OO(HttpHeaders.RANGE) == null) {
            z = true;
            oooO00oOooO0oo.OooO0oo(HttpRequest.HEADER_ACCEPT_ENCODING, "gzip");
        }
        List<C4631zw> listOooO0O0 = this.OooO00o.OooO0O0(c4225oxRequest.OooOO0O());
        if (!listOooO0O0.isEmpty()) {
            oooO00oOooO0oo.OooO0oo("Cookie", OooO00o(listOooO0O0));
        }
        if (c4225oxRequest.OooO0OO("User-Agent") == null) {
            oooO00oOooO0oo.OooO0oo("User-Agent", C4595yx.OooO00o());
        }
        C4299qx c4299qxOooO0o0 = oooO00o.OooO0o0(oooO00oOooO0oo.OooO0O0());
        C4374sy.OooOO0O(this.OooO00o, c4225oxRequest.OooOO0O(), c4299qxOooO0o0.o00Oo0());
        C4299qx.OooO00o oooO00oOooOOo0 = c4299qxOooO0o0.o00oO0o().OooOOo0(c4225oxRequest);
        if (z && "gzip".equalsIgnoreCase(c4299qxOooO0o0.o0OoOo0("Content-Encoding")) && C4374sy.OooO0OO(c4299qxOooO0o0)) {
            q00 q00Var = new q00(c4299qxOooO0o0.OooOO0().source());
            oooO00oOooOOo0.OooOO0(c4299qxOooO0o0.o00Oo0().OooO().OooOO0("Content-Encoding").OooOO0("Content-Length").OooO0oo());
            oooO00oOooOOo0.OooO0O0(new C4485vy(c4299qxOooO0o0.o0OoOo0("Content-Type"), -1L, u00.OooO0Oo(q00Var)));
        }
        return oooO00oOooOOo0.OooO0OO();
    }
}
