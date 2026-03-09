package p285z2;

/* JADX INFO: renamed from: z2.i4 */
/* JADX INFO: loaded from: classes.dex */
public class C3974i4 {
    private static long OooO00o = 0;
    private static int OooO0O0 = 500;
    private static C3974i4 OooO0OO;

    public static C3974i4 OooO00o() {
        if (OooO0OO == null) {
            OooO0OO = new C3974i4();
        }
        return OooO0OO;
    }

    public boolean OooO0O0() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - OooO00o;
        if (j > 0 && j < OooO0O0) {
            return true;
        }
        OooO00o = jCurrentTimeMillis;
        return false;
    }
}
