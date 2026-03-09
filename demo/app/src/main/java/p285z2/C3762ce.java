package p285z2;

/* JADX INFO: renamed from: z2.ce */
/* JADX INFO: loaded from: classes2.dex */
public class C3762ce {
    public static String OooO00o(String str, String str2, int i) {
        try {
            return C3789d4.OooO0O0(str2, OooO0OO(str, i).getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String OooO0O0(String str, String str2, int i) throws Exception {
        return C3789d4.OooO0Oo(str2, OooO0OO(str, i).getBytes());
    }

    private static String OooO0OO(String str, int i) {
        return (str.startsWith(InterfaceC4047k3.OooO0O0) || str.startsWith(InterfaceC4047k3.OooO0Oo)) ? C4010j3.OooO00o[i] : str.startsWith("http://api") ? C4010j3.OooO0Oo[i] : C4010j3.OooO0OO[i];
    }

    public static String OooO0Oo(String str) {
        try {
            return C4455v4.OooO00o(str.getBytes("utf-8"), C4010j3.OooOO0O());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean OooO0o0(String str, String str2) {
        try {
            return C4455v4.OooO0O0(str.getBytes(), C4010j3.OooOO0(), str2);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
