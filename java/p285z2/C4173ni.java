package p285z2;

import android.content.Context;

/* JADX INFO: renamed from: z2.ni */
/* JADX INFO: loaded from: classes2.dex */
public class C4173ni implements InterfaceC4099li {
    private InterfaceC4099li OooO00o;

    /* JADX INFO: renamed from: z2.ni$OooO0O0 */
    public static class OooO0O0 {
        private static final C4173ni OooO00o = new C4173ni();

        private OooO0O0() {
        }
    }

    private C4173ni() {
        try {
            this.OooO00o = (InterfaceC4099li) Class.forName("z2.xg").newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        }
    }

    public static C4173ni OooO0o() {
        return OooO0O0.OooO00o;
    }

    @Override // p285z2.InterfaceC4099li
    public void OooO00o(InterfaceC4306r3<String> interfaceC4306r3) {
        this.OooO00o.OooO00o(interfaceC4306r3);
    }

    @Override // p285z2.InterfaceC4099li
    public void OooO0O0(Context context, String str, Class cls, int i) {
        this.OooO00o.OooO0O0(context, str, cls, i);
    }

    @Override // p285z2.InterfaceC4099li
    public InterfaceC4136mi OooO0OO() {
        return this.OooO00o.OooO0OO();
    }

    @Override // p285z2.InterfaceC4099li
    public void OooO0Oo(Context context) {
        this.OooO00o.OooO0Oo(context);
    }

    @Override // p285z2.InterfaceC4099li
    public void OooO0o0(String str, int i) {
        this.OooO00o.OooO0o0(str, i);
    }

    @Override // p285z2.InterfaceC4099li
    public Context getContext() {
        return this.OooO00o.getContext();
    }
}
