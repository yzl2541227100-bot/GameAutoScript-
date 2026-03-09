package p285z2;

import android.content.Context;

/* JADX INFO: renamed from: z2.c4 */
/* JADX INFO: loaded from: classes.dex */
public class C3752c4 {
    public static int OooO00o(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int OooO0O0(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int OooO0OO(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int OooO0Oo(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
