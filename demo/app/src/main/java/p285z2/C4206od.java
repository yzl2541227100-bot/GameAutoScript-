package p285z2;

import android.content.Context;
import com.android.volley.VolleyError;
import java.util.Map;

/* JADX INFO: renamed from: z2.od */
/* JADX INFO: loaded from: classes2.dex */
public class C4206od extends AbstractC4242pd {
    private InterfaceC4168nd OoooOoO;
    private InterfaceC4131md OoooOoo;
    public String Ooooo00;

    public C4206od(InterfaceC4168nd interfaceC4168nd) {
        this.OoooOoO = interfaceC4168nd;
    }

    public C4206od(InterfaceC4168nd interfaceC4168nd, InterfaceC4131md interfaceC4131md) {
        this.OoooOoO = interfaceC4168nd;
        this.OoooOoo = interfaceC4131md;
    }

    public void OooO(Object obj, String str) {
        OooO0oO(null, obj, str);
    }

    @Override // z2.oo000o.OooO00o
    public void OooO0O0(VolleyError volleyError) {
        InterfaceC4168nd interfaceC4168nd = this.OoooOoO;
        if (interfaceC4168nd != null) {
            interfaceC4168nd.OooO0o0(volleyError);
        }
    }

    public void OooO0oO(Context context, Object obj, String str) {
        this.Ooooo00 = str;
        super.OooO0o0(context, obj, str, this.OoooOoo);
    }

    public void OooO0oo(Context context, String str) {
        OooO0oO(context, this, str);
    }

    public void OooOO0(Context context, Object obj, String str, Map<String, String> map) {
        this.Ooooo00 = str;
        String str2 = "url:" + str;
        super.OooO0o(context, obj, str, map, this.OoooOoo);
    }

    public void OooOO0O(Context context, String str, Map<String, String> map) {
        OooOO0(context, this, str, map);
    }

    public void OooOO0o(Object obj, String str, Map<String, String> map) {
        OooOO0(null, obj, str, map);
    }

    public void OooOOO(Object obj) {
        C4279qd.OooO0OO().OooO0o(obj);
    }

    public void OooOOO0() {
        OooOOO(this);
    }

    @Override // z2.oo000o.OooO0O0
    public void onResponse(Object obj) {
        InterfaceC4168nd interfaceC4168nd = this.OoooOoO;
        if (interfaceC4168nd != null) {
            interfaceC4168nd.OooO00o(obj);
        }
    }
}
