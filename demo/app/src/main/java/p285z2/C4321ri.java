package p285z2;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: z2.ri */
/* JADX INFO: loaded from: classes2.dex */
public class C4321ri {
    public static InterfaceC4432ui OooO00o(Context context, String str, String str2, String str3) {
        File file = new File(str2);
        return (str2 == null || !file.exists() || file.length() <= 0) ? new C4358si(context, str, str3) : new C4395ti(context, str2, str3);
    }
}
