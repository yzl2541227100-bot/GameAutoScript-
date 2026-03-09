package p285z2;

/* JADX INFO: renamed from: z2.fu */
/* JADX INFO: loaded from: classes2.dex */
public class C3889fu {
    private static Object OooO00o = new Object();
    private static long OooO0O0;

    public static long OooO00o() {
        long j;
        synchronized (OooO00o) {
            j = OooO0O0 + 1;
            OooO0O0 = j;
        }
        return j;
    }
}
