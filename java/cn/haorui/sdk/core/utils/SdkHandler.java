package cn.haorui.sdk.core.utils;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class SdkHandler {
    private Handler mHandler;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.SdkHandler$b */
    public static class C0581b {

        /* JADX INFO: renamed from: a */
        public static final SdkHandler f279a = new SdkHandler();
    }

    private SdkHandler() {
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public static SdkHandler getInstance() {
        return C0581b.f279a;
    }

    public void runOnUiThread(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }
}
