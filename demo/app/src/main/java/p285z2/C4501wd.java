package p285z2;

import android.content.Context;
import java.util.Map;

/* JADX INFO: renamed from: z2.wd */
/* JADX INFO: loaded from: classes2.dex */
public class C4501wd extends AbstractC4464vd implements InterfaceC4390td {
    private InterfaceC4353sd OooO0O0;

    public C4501wd(InterfaceC4353sd interfaceC4353sd) {
        this.OooO0O0 = interfaceC4353sd;
    }

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        InterfaceC4353sd interfaceC4353sd = this.OooO0O0;
        if (interfaceC4353sd != null) {
            interfaceC4353sd.OooO00o(obj);
        }
    }

    @Override // p285z2.InterfaceC4390td
    public void OooO0O0(Context context, String str, Map<String, String> map) {
        this.OooO00o.OooOO0(context, getClass().getCanonicalName(), str, map);
    }

    @Override // p285z2.InterfaceC4390td
    public void OooO0OO() {
        C4206od c4206od = this.OooO00o;
        if (c4206od != null) {
            c4206od.OooOOO(getClass().getCanonicalName());
        }
    }

    @Override // p285z2.AbstractC4464vd
    public void OooO0o(String str) {
        InterfaceC4353sd interfaceC4353sd = this.OooO0O0;
        if (interfaceC4353sd != null) {
            interfaceC4353sd.OooO0O0(str);
        }
    }
}
