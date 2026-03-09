package p285z2;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import java.io.IOException;

/* JADX INFO: renamed from: z2.hv */
/* JADX INFO: loaded from: classes2.dex */
public class C3964hv {
    private static C3964hv OooO;
    public static final int OooOO0;
    private final C3927gv OooO00o;
    private Camera OooO0O0;
    private boolean OooO0OO;
    private boolean OooO0Oo;
    private final C4038jv OooO0o;
    private final boolean OooO0o0;
    private final C3890fv OooO0oO;
    private Camera.Parameters OooO0oo;

    static {
        int i;
        try {
            i = Build.VERSION.SDK_INT;
        } catch (NumberFormatException unused) {
            i = 10000;
        }
        OooOO0 = i;
    }

    private C3964hv(Context context) {
        C3927gv c3927gv = new C3927gv(context);
        this.OooO00o = c3927gv;
        boolean z = OooOO0 > 3;
        this.OooO0o0 = z;
        this.OooO0o = new C4038jv(c3927gv, z);
        this.OooO0oO = new C3890fv();
    }

    public static C3964hv OooO0O0() {
        return OooO;
    }

    public static void OooO0Oo(Context context) {
        if (OooO == null) {
            OooO = new C3964hv(context);
        }
    }

    public void OooO(Handler handler, int i) {
        if (this.OooO0O0 == null || !this.OooO0Oo) {
            return;
        }
        this.OooO0o.OooO00o(handler, i);
        if (this.OooO0o0) {
            this.OooO0O0.setOneShotPreviewCallback(this.OooO0o);
        } else {
            this.OooO0O0.setPreviewCallback(this.OooO0o);
        }
    }

    public void OooO00o() {
        if (this.OooO0O0 != null) {
            C4001iv.OooO00o();
            this.OooO0O0.release();
            this.OooO0O0 = null;
        }
    }

    public Point OooO0OO() {
        return this.OooO00o.OooO0OO();
    }

    public void OooO0o(SurfaceHolder surfaceHolder) throws IOException {
        if (this.OooO0O0 == null) {
            Camera cameraOpen = Camera.open();
            this.OooO0O0 = cameraOpen;
            if (cameraOpen == null) {
                throw new IOException();
            }
            cameraOpen.setPreviewDisplay(surfaceHolder);
            if (!this.OooO0OO) {
                this.OooO0OO = true;
                this.OooO00o.OooO0oo(this.OooO0O0);
            }
            this.OooO00o.OooO(this.OooO0O0);
            C4001iv.OooO0O0();
        }
    }

    public void OooO0o0() {
        Camera camera = this.OooO0O0;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            this.OooO0oo = parameters;
            parameters.setFlashMode("off");
            this.OooO0O0.setParameters(this.OooO0oo);
        }
    }

    public void OooO0oO() {
        Log.e("zzz", "openLight1");
        if (this.OooO0O0 != null) {
            Log.e("zzz", "openLight2");
            Camera.Parameters parameters = this.OooO0O0.getParameters();
            this.OooO0oo = parameters;
            parameters.setFlashMode("torch");
            this.OooO0O0.setParameters(this.OooO0oo);
        }
    }

    public void OooO0oo(Handler handler, int i) {
        if (this.OooO0O0 == null || !this.OooO0Oo) {
            return;
        }
        this.OooO0oO.OooO00o(handler, i);
        this.OooO0O0.autoFocus(this.OooO0oO);
    }

    public void OooOO0() {
        Camera camera = this.OooO0O0;
        if (camera == null || this.OooO0Oo) {
            return;
        }
        camera.startPreview();
        this.OooO0Oo = true;
    }

    public void OooOO0O() {
        Camera camera = this.OooO0O0;
        if (camera == null || !this.OooO0Oo) {
            return;
        }
        if (!this.OooO0o0) {
            camera.setPreviewCallback(null);
        }
        this.OooO0O0.stopPreview();
        this.OooO0o.OooO00o(null, 0);
        this.OooO0oO.OooO00o(null, 0);
        this.OooO0Oo = false;
    }
}
