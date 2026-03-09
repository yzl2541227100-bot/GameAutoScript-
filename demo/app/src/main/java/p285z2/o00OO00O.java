package p285z2;

import com.anythink.expressad.foundation.p120g.C1801a;
import com.cyjh.mobileanjian.ipc.share.proto.Ipc;
import java.io.File;
import java.io.IOException;
import p285z2.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO00O implements oo0oOO0 {
    private int OooO0OO = 0;

    @Override // p285z2.oo0oOO0
    /* JADX INFO: renamed from: a */
    public final int mo17052a(String str) {
        File file;
        String strOooO00o = o00OO0O0.OooO00o(o00O0O00.OooO0O0);
        File file2 = new File(o00O0O00.OooO0Oo + "/so");
        if (!file2.exists()) {
            file2.mkdir();
        }
        File file3 = new File(o00O0O00.OooO0Oo + "/so/libquikreg.so");
        if ("x86".equals(strOooO00o)) {
            file = new File(str + "/x86/libquikreg.so");
        } else {
            file = new File(str + "/armeabi-v7a/libquikreg.so");
        }
        try {
            o00OO0OO.OooO00o(file, file3);
            return 0;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // p285z2.oo0oOO0
    /* JADX INFO: renamed from: a */
    public final void mo17053a() {
        this.OooO0OO = 1;
        String strOooO00o = o00OO0O0.OooO00o(o00O0O00.OooO0O0);
        o00O0O0.OooO0O0.OooO00o.OooO00o().OooO00o(Ipc.IpcMessage.newBuilder().setCmd(C4095le.o0000OO0).addArg1(1).addArg2(o00O0O00.OooO0OO + C1801a.f11059bQ + strOooO00o).build());
    }

    @Override // p285z2.oo0oOO0
    /* JADX INFO: renamed from: b */
    public final int mo17054b() {
        return this.OooO0OO;
    }
}
