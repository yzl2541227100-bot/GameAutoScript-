package com.alibaba.sdk.android.oss.network;

import java.io.IOException;
import java.io.InputStream;
import p285z2.C4151mx;
import p285z2.C4299qx;
import p285z2.InterfaceC4040jx;

/* JADX INFO: loaded from: classes.dex */
public class NetworkProgressHelper {
    public static ProgressTouchableRequestBody addProgressRequestBody(InputStream inputStream, long j, String str, ExecutionContext executionContext) {
        return new ProgressTouchableRequestBody(inputStream, j, str, executionContext);
    }

    public static C4151mx addProgressResponseListener(C4151mx c4151mx, final ExecutionContext executionContext) {
        return c4151mx.OooOo0().OooO0O0(new InterfaceC4040jx() { // from class: com.alibaba.sdk.android.oss.network.NetworkProgressHelper.1
            @Override // p285z2.InterfaceC4040jx
            public C4299qx intercept(InterfaceC4040jx.OooO00o oooO00o) throws IOException {
                C4299qx c4299qxOooO0o0 = oooO00o.OooO0o0(oooO00o.request());
                return c4299qxOooO0o0.o00oO0o().OooO0O0(new ProgressTouchableResponseBody(c4299qxOooO0o0.OooOO0(), executionContext)).OooO0OO();
            }
        }).OooO0Oo();
    }
}
