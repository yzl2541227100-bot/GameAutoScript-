package p285z2;

/* JADX INFO: renamed from: z2.zb */
/* JADX INFO: loaded from: classes2.dex */
public class C4610zb {
    private static String OooO00o = "zb";
    private static C4610zb OooO0O0;

    private C4610zb() {
    }

    public static C4610zb OooO00o() {
        if (OooO0O0 == null) {
            synchronized (C4610zb.class) {
                if (OooO0O0 == null) {
                    OooO0O0 = new C4610zb();
                }
            }
        }
        return OooO0O0;
    }

    public boolean OooO0O0() {
        String str = C4566y4.OooO0OO("getprop phone.id", false, 100).OooO0O0;
        return str != null && str.length() > 0;
    }
}
