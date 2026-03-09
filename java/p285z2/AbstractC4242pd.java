package p285z2;

import android.content.Context;
import java.util.Map;
import p285z2.oo000o;

/* JADX INFO: renamed from: z2.pd */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4242pd implements oo000o.OooO0O0<Object>, oo000o.OooO00o {
    public C4316rd OooO0OO(String str, Map<String, String> map, InterfaceC4131md interfaceC4131md) {
        return new C4316rd(str, map, this, this, interfaceC4131md);
    }

    public C4316rd OooO0Oo(String str, InterfaceC4131md interfaceC4131md) {
        return new C4316rd(str, this, this, interfaceC4131md);
    }

    public void OooO0o(Context context, Object obj, String str, Map<String, String> map, InterfaceC4131md interfaceC4131md) {
        C4279qd.OooO0OO().OooO00o(context, obj, OooO0OO(str, map, interfaceC4131md));
    }

    public void OooO0o0(Context context, Object obj, String str, InterfaceC4131md interfaceC4131md) {
        C4279qd.OooO0OO().OooO00o(context, obj, OooO0Oo(str, interfaceC4131md));
    }
}
