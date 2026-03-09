package p285z2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* JADX INFO: renamed from: z2.e5 */
/* JADX INFO: loaded from: classes.dex */
public class C3827e5 {
    private static final g40 OooO00o = new g40();
    private static final Handler OooO0O0 = new Handler(Looper.getMainLooper());

    public static g40 OooO00o() {
        return OooO00o;
    }

    public static int OooO0O0(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static void OooO0OO(Runnable runnable) {
        OooO0O0.post(runnable);
    }

    public static void OooO0Oo(long j, Runnable runnable) {
        OooO0O0.postDelayed(runnable, j);
    }

    public static void OooO0o0(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
