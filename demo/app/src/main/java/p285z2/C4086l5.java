package p285z2;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: z2.l5 */
/* JADX INFO: loaded from: classes.dex */
public final class C4086l5 {
    private C4086l5() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static Intent OooO00o(Intent intent, boolean z) {
        return z ? intent.addFlags(268435456) : intent;
    }

    public static Intent OooO0O0(String str, boolean z) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + str));
        return OooO00o(intent, z);
    }

    public static Intent OooO0OO(String str) {
        String strOooOOOo = C4493w5.OooOOOo(str);
        if (C4493w5.OooOoo(strOooOOOo)) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setClassName(str, strOooOOOo);
        return intent.addFlags(268435456);
    }

    public static boolean OooO0Oo(Intent intent) {
        return C4419u5.OooO00o().getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }
}
