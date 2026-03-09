package p285z2;

import com.cyjh.http.bean.SignaClass;
import com.cyjh.http.bean.response.BaseInfo;

/* JADX INFO: renamed from: z2.fc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3871fc implements InterfaceC4131md, InterfaceC4168nd {
    public C4206od OooO00o = new C4206od(this, this);

    public abstract void OooO0O0(String str);

    @Override // p285z2.InterfaceC4131md
    public Object OooO0Oo(String str) {
        try {
            BaseInfo baseInfo = (BaseInfo) C4159n4.OooO0o0(str, BaseInfo.class);
            SignaClass signaClass = (SignaClass) C4159n4.OooO0o0(C3762ce.OooO00o(this.OooO00o.Ooooo00, baseInfo.Data, baseInfo.f15898R), SignaClass.class);
            if (signaClass == null || !C3762ce.OooO0o0(signaClass.SignContent, signaClass.Signature)) {
                return null;
            }
            return signaClass.SignContent;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0076  */
    @Override // p285z2.InterfaceC4168nd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooO0o0(com.android.volley.VolleyError r5) {
        /*
            r4 = this;
            z2.ec r0 = p285z2.C3834ec.OooO0OO()
            android.content.Context r0 = r0.OooO0O0()
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L7f
            boolean r1 = r5 instanceof com.android.volley.ServerError
            if (r1 == 0) goto L19
            int r1 = com.cyjh.http.C2619R.string.network_server_error
        L14:
            java.lang.String r1 = r0.getString(r1)
            goto L3d
        L19:
            boolean r1 = r5 instanceof com.android.volley.NoConnectionError
            if (r1 == 0) goto L20
            int r1 = com.cyjh.http.C2619R.string.network_no_connection_error
            goto L14
        L20:
            boolean r1 = r5 instanceof com.android.volley.NetworkError
            if (r1 == 0) goto L27
            int r1 = com.cyjh.http.C2619R.string.network_network_error
            goto L14
        L27:
            boolean r1 = r5 instanceof com.android.volley.ParseError
            if (r1 == 0) goto L2e
            int r1 = com.cyjh.http.C2619R.string.network_parse_error
            goto L14
        L2e:
            boolean r1 = r5 instanceof com.android.volley.AuthFailureError
            if (r1 == 0) goto L35
            int r1 = com.cyjh.http.C2619R.string.network_auth_failure_error
            goto L14
        L35:
            boolean r1 = r5 instanceof com.android.volley.TimeoutError
            if (r1 == 0) goto L3c
            int r1 = com.cyjh.http.C2619R.string.network_timeout_error
            goto L14
        L3c:
            r1 = 0
        L3d:
            z2.o00Oo0 r2 = r5.networkResponse
            if (r2 == 0) goto L74
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            z2.o00Oo0 r3 = r5.networkResponse
            int r3 = r3.OooO00o
            r2.append(r3)
            java.lang.String r3 = ""
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L74
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            z2.o00Oo0 r5 = r5.networkResponse
            int r5 = r5.OooO00o
            r2.append(r5)
            java.lang.String r5 = "\t\t"
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L74:
            if (r1 != 0) goto L7c
            int r5 = com.cyjh.http.C2619R.string.network_again_error
            java.lang.String r1 = r0.getString(r5)
        L7c:
            r4.OooO0O0(r1)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.AbstractC3871fc.OooO0o0(com.android.volley.VolleyError):void");
    }
}
