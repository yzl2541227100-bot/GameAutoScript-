package p285z2;

/* JADX INFO: renamed from: z2.ef */
/* JADX INFO: loaded from: classes2.dex */
public final class C3837ef {
    public static boolean OooO00o(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static boolean OooO0O0(Object[] objArr) {
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }
}
