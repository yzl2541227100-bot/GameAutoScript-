package com.anythink.expressad.exoplayer.p108l;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.RunnableC1724g;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.l.c */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
public final class C1747c extends Surface {

    /* JADX INFO: renamed from: b */
    private static final String f9845b = "DummySurface";

    /* JADX INFO: renamed from: c */
    private static final String f9846c = "EGL_EXT_protected_content";

    /* JADX INFO: renamed from: d */
    private static final String f9847d = "EGL_KHR_surfaceless_context";

    /* JADX INFO: renamed from: e */
    private static int f9848e;

    /* JADX INFO: renamed from: f */
    private static boolean f9849f;

    /* JADX INFO: renamed from: a */
    public final boolean f9850a;

    /* JADX INFO: renamed from: g */
    private final a f9851g;

    /* JADX INFO: renamed from: h */
    private boolean f9852h;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.l.c$a */
    public static class a extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a */
        private static final int f9853a = 1;

        /* JADX INFO: renamed from: b */
        private static final int f9854b = 2;

        /* JADX INFO: renamed from: c */
        @Nullable
        private RunnableC1724g f9855c;

        /* JADX INFO: renamed from: d */
        @Nullable
        private Handler f9856d;

        /* JADX INFO: renamed from: e */
        @Nullable
        private Error f9857e;

        /* JADX INFO: renamed from: f */
        @Nullable
        private RuntimeException f9858f;

        /* JADX INFO: renamed from: g */
        @Nullable
        private C1747c f9859g;

        public a() {
            super("dummySurface");
        }

        /* JADX INFO: renamed from: b */
        private void m8327b() {
            C1711a.m8005a(this.f9855c);
            this.f9855c.m8164a();
        }

        /* JADX INFO: renamed from: b */
        private void m8328b(int i) {
            C1711a.m8005a(this.f9855c);
            this.f9855c.m8165a(i);
            this.f9859g = new C1747c(this, this.f9855c.m8166b(), i != 0, (byte) 0);
        }

        /* JADX INFO: renamed from: a */
        public final C1747c m8329a(int i) {
            boolean z;
            start();
            this.f9856d = new Handler(getLooper(), this);
            this.f9855c = new RunnableC1724g(this.f9856d);
            synchronized (this) {
                z = false;
                this.f9856d.obtainMessage(1, i, 0).sendToTarget();
                while (this.f9859g == null && this.f9858f == null && this.f9857e == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f9858f;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f9857e;
            if (error == null) {
                return (C1747c) C1711a.m8005a(this.f9859g);
            }
            throw error;
        }

        /* JADX INFO: renamed from: a */
        public final void m8330a() {
            C1711a.m8005a(this.f9856d);
            this.f9856d.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        C1711a.m8005a(this.f9855c);
                        this.f9855c.m8164a();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    int i2 = message.arg1;
                    C1711a.m8005a(this.f9855c);
                    this.f9855c.m8165a(i2);
                    this.f9859g = new C1747c(this, this.f9855c.m8166b(), i2 != 0, (byte) 0);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    Log.e(C1747c.f9845b, "Failed to initialize dummy surface", e);
                    this.f9857e = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    Log.e(C1747c.f9845b, "Failed to initialize dummy surface", e2);
                    this.f9858f = e2;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    private C1747c(a aVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f9851g = aVar;
        this.f9850a = z;
    }

    public /* synthetic */ C1747c(a aVar, SurfaceTexture surfaceTexture, boolean z, byte b) {
        this(aVar, surfaceTexture, z);
    }

    /* JADX INFO: renamed from: a */
    public static C1747c m8323a(Context context, boolean z) {
        if (C1717af.f9627a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
        C1711a.m8012b(!z || m8325a(context));
        return new a().m8329a(z ? f9848e : 0);
    }

    /* JADX INFO: renamed from: a */
    private static void m8324a() {
        if (C1717af.f9627a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m8325a(Context context) {
        String strEglQueryString;
        if (!f9849f) {
            int i = C1717af.f9627a;
            f9848e = (i >= 24 && (i >= 26 || !("samsung".equals(C1717af.f9629c) || "XT1650".equals(C1717af.f9630d))) && ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(f9846c))) ? strEglQueryString.contains(f9847d) ? 1 : 2 : 0;
            f9849f = true;
        }
        return f9848e != 0;
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: b */
    private static int m8326b(Context context) {
        String strEglQueryString;
        int i = C1717af.f9627a;
        if (i < 26 && ("samsung".equals(C1717af.f9629c) || "XT1650".equals(C1717af.f9630d))) {
            return 0;
        }
        if ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(f9846c)) {
            return strEglQueryString.contains(f9847d) ? 1 : 2;
        }
        return 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f9851g) {
            if (!this.f9852h) {
                this.f9851g.m8330a();
                this.f9852h = true;
            }
        }
    }
}
