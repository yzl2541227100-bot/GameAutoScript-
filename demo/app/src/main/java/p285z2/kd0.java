package p285z2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class kd0 extends Handler {
    public static final int OooO0O0 = -1;
    private final WeakReference<cd0> OooO00o;

    public kd0(cd0 cd0Var) {
        super(Looper.getMainLooper());
        this.OooO00o = new WeakReference<>(cd0Var);
    }

    @Override // android.os.Handler
    public void handleMessage(@NonNull Message message) {
        cd0 cd0Var = this.OooO00o.get();
        if (cd0Var == null) {
            return;
        }
        if (message.what == -1) {
            cd0Var.invalidateSelf();
            return;
        }
        Iterator<yc0> it = cd0Var.Oooooo0.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(message.what);
        }
    }
}
