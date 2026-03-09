package p285z2;

import android.text.TextUtils;
import com.example.logcat.C2713R;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import p285z2.InterfaceC3693aj;

/* JADX INFO: renamed from: z2.xi */
/* JADX INFO: loaded from: classes2.dex */
public class C4543xi implements InterfaceC3693aj {
    @Override // p285z2.InterfaceC3693aj
    public void OooO00o(String str, InterfaceC3693aj.OooO00o oooO00o) {
        oooO00o.OooO00o(C2713R.string.status_opening, null);
        try {
            Process processExec = Runtime.getRuntime().exec("su");
            DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
            dataOutputStream.writeBytes(str + "\n");
            dataOutputStream.flush();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            oooO00o.OooO00o(C2713R.string.status_active, null);
            while (!oooO00o.isCancelled()) {
                ArrayList arrayList = new ArrayList();
                String line = bufferedReader.readLine();
                if (!TextUtils.isEmpty(line)) {
                    arrayList.add(line);
                }
                oooO00o.OooO00o(0, arrayList);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
