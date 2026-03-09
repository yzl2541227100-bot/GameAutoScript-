package p285z2;

import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: z2.f5 */
/* JADX INFO: loaded from: classes.dex */
public class C3864f5 {
    public static boolean OooO00o(Context context) {
        return Build.VERSION.SDK_INT >= 29 && context.getApplicationInfo().targetSdkVersion >= 29;
    }
}
