package p285z2;

import android.content.Context;

/* JADX INFO: renamed from: z2.dc */
/* JADX INFO: loaded from: classes2.dex */
public class C3797dc {
    private static String OooO0O0 = "dc";
    private static C3797dc OooO0OO;
    private int OooO00o;

    private C3797dc() {
    }

    public static C3797dc OooO00o() {
        if (OooO0OO == null) {
            synchronized (C3797dc.class) {
                if (OooO0OO == null) {
                    OooO0OO = new C3797dc();
                }
            }
        }
        return OooO0OO;
    }

    public C3797dc OooO0O0(int i) {
        String str = "init --> redFingerSwitch=" + i;
        this.OooO00o = i;
        return this;
    }

    public boolean OooO0OO(Context context) {
        return C3688ae.OooOooo(context, InterfaceC4047k3.o0ooOoO) && this.OooO00o == 1;
    }
}
