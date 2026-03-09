package p285z2;

import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: renamed from: z2.fv */
/* JADX INFO: loaded from: classes2.dex */
public final class C3890fv implements Camera.AutoFocusCallback {
    private static final String OooO0OO = C3890fv.class.getSimpleName();
    private static final long OooO0Oo = 1500;
    private Handler OooO00o;
    private int OooO0O0;

    public void OooO00o(Handler handler, int i) {
        this.OooO00o = handler;
        this.OooO0O0 = i;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z, Camera camera) {
        Handler handler = this.OooO00o;
        if (handler != null) {
            this.OooO00o.sendMessageDelayed(handler.obtainMessage(this.OooO0O0, Boolean.valueOf(z)), OooO0Oo);
            this.OooO00o = null;
        }
    }
}
