package p285z2;

/* JADX INFO: renamed from: z2.qf */
/* JADX INFO: loaded from: classes2.dex */
public class C4281qf {
    public static final int OooO = 7;
    public static final String OooO00o = "qf";
    public static final int OooO0O0 = 0;
    public static final int OooO0OO = 1;
    public static final int OooO0Oo = 2;
    public static final int OooO0o = 4;
    public static final int OooO0o0 = 3;
    public static final int OooO0oO = 5;
    public static final int OooO0oo = 6;

    private static String OooO00o(int i) {
        return C4281qf.class.getFields()[i].getName();
    }

    private static void OooO0O0(int i) {
        StringBuilder sb = new StringBuilder("errno=");
        sb.append(i);
        sb.append("; ");
        sb.append(C4281qf.class.getFields()[i].getName());
    }
}
