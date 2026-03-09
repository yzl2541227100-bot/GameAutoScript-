package p285z2;

import java.io.IOException;
import p285z2.InterfaceC4040jx;

/* JADX INFO: renamed from: z2.iy */
/* JADX INFO: loaded from: classes2.dex */
public final class C4004iy implements InterfaceC4040jx {
    public final C4151mx OooO00o;

    public C4004iy(C4151mx c4151mx) {
        this.OooO00o = c4151mx;
    }

    @Override // p285z2.InterfaceC4040jx
    public C4299qx intercept(InterfaceC4040jx.OooO00o oooO00o) throws IOException {
        C4448uy c4448uy = (C4448uy) oooO00o;
        C4225ox c4225oxRequest = c4448uy.request();
        C4189ny c4189nyOooOO0o = c4448uy.OooOO0o();
        return c4448uy.OooOO0O(c4225oxRequest, c4189nyOooOO0o, c4189nyOooOO0o.OooO(this.OooO00o, oooO00o, !c4225oxRequest.OooO0oO().equals("GET")), c4189nyOooOO0o.OooO0Oo());
    }
}
