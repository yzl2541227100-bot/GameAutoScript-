package p285z2;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* JADX INFO: renamed from: z2.h6 */
/* JADX INFO: loaded from: classes.dex */
public class C3939h6 {
    private static final String OooO00o = "FileCfg";
    public static String OooO0O0;

    public static void OooO00o() {
        File file = new File(OooO0O0);
        String str = "logFile: " + file.getPath();
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void OooO0O0(Context context) {
        OooO0O0 = C4048k4.OooO(C4048k4.OooO(Environment.getExternalStorageDirectory().getAbsolutePath(), context.getPackageName()), "log");
    }
}
