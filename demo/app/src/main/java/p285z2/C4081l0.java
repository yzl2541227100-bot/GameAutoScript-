package p285z2;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import p285z2.InterfaceC3970i0;

/* JADX INFO: renamed from: z2.l0 */
/* JADX INFO: loaded from: classes.dex */
public class C4081l0 implements InterfaceC4007j0 {
    private static final String OooO00o = "ConnectivityMonitor";
    private static final String OooO0O0 = "android.permission.ACCESS_NETWORK_STATE";

    @Override // p285z2.InterfaceC4007j0
    @NonNull
    public InterfaceC3970i0 OooO00o(@NonNull Context context, @NonNull InterfaceC3970i0.OooO00o oooO00o) {
        boolean z = ContextCompat.checkSelfPermission(context, OooO0O0) == 0;
        if (Log.isLoggable(OooO00o, 3)) {
            Log.d(OooO00o, z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z ? new C4044k0(context, oooO00o) : new C4266q0();
    }
}
