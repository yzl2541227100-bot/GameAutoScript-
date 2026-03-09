package p285z2;

import android.content.Context;
import com.cyjh.elfin.base.AppContext;

/* JADX INFO: renamed from: z2.r8 */
/* JADX INFO: loaded from: classes.dex */
public class C4311r8 {
    private static C4311r8 OooO00o;

    private C4311r8() {
    }

    public static synchronized C4311r8 OooO00o() {
        if (OooO00o == null) {
            OooO00o = new C4311r8();
        }
        return OooO00o;
    }

    public void OooO0O0(Context context, String str) {
        if (C3900g4.OooO00o) {
            C3900g4.OooO0o(C3900g4.OooO0OO(context), str + "---currentPid1:" + AppContext.o00Ooo, null, true);
        }
    }
}
