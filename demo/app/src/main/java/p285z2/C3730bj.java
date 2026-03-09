package p285z2;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.example.logcat.C2713R;
import java.io.IOException;
import java.net.Socket;
import java.security.KeyPair;
import java.util.ArrayList;
import p285z2.InterfaceC3693aj;

/* JADX INFO: renamed from: z2.bj */
/* JADX INFO: loaded from: classes2.dex */
public class C3730bj implements InterfaceC3693aj {
    private KeyPair OooO00o;

    /* JADX INFO: renamed from: z2.bj$OooO00o */
    public class OooO00o implements InterfaceC4333ru {
        public OooO00o() {
        }

        @Override // p285z2.InterfaceC4333ru
        @SuppressLint({"NewApi"})
        public String OooO00o(byte[] bArr) {
            return Base64.encodeToString(bArr, 2);
        }
    }

    public C3730bj(KeyPair keyPair) {
        this.OooO00o = keyPair;
    }

    @Override // p285z2.InterfaceC3693aj
    public void OooO00o(String str, InterfaceC3693aj.OooO00o oooO00o) {
        C4370su c4370suOo000o;
        C4370su c4370su = null;
        try {
            try {
                oooO00o.OooO00o(C2713R.string.status_connecting, null);
                c4370suOo000o = C4370su.oo000o(new Socket("localhost", 5555), C4407tu.OooO0o0(new OooO00o(), this.OooO00o));
            } catch (InterruptedException unused) {
            }
            try {
                c4370suOo000o.o00ooo();
                oooO00o.OooO00o(C2713R.string.status_opening, null);
                C4481vu c4481vuO0ooOO0 = c4370suOo000o.o0ooOO0("shell:" + str);
                oooO00o.OooO00o(C2713R.string.status_active, null);
                while (!oooO00o.isCancelled()) {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : new String(c4481vuO0ooOO0.Oooooo()).split("\\r?\\n")) {
                        if (!TextUtils.isEmpty(str2)) {
                            arrayList.add(str2);
                        }
                    }
                    oooO00o.OooO00o(0, arrayList);
                }
            } catch (InterruptedException unused2) {
                c4370su = c4370suOo000o;
                c4370su.close();
            }
        } catch (IOException e) {
            Log.w("TAG", e);
        }
    }
}
