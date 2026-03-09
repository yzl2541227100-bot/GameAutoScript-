package p285z2;

import android.content.Context;

/* JADX INFO: renamed from: z2.xg */
/* JADX INFO: loaded from: classes2.dex */
public class C4541xg implements InterfaceC4099li {
    private Context OooO00o;
    private C4504wg OooO0O0 = new C4504wg();

    @Override // p285z2.InterfaceC4099li
    public void OooO00o(InterfaceC4306r3<String> interfaceC4306r3) {
        interfaceC4306r3.OooO00o("success");
    }

    @Override // p285z2.InterfaceC4099li
    public void OooO0O0(Context context, String str, Class cls, int i) {
    }

    @Override // p285z2.InterfaceC4099li
    public InterfaceC4136mi OooO0OO() {
        return this.OooO0O0;
    }

    @Override // p285z2.InterfaceC4099li
    public void OooO0Oo(Context context) {
        this.OooO00o = context;
    }

    @Override // p285z2.InterfaceC4099li
    public void OooO0o0(String str, int i) {
    }

    @Override // p285z2.InterfaceC4099li
    public Context getContext() {
        return this.OooO00o;
    }
}
