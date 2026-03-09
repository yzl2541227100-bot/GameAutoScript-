package com.anythink.expressad.exoplayer.p107k;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.g */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
public final class RunnableC1724g implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: a */
    public static final int f9661a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f9662b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f9663c = 2;

    /* JADX INFO: renamed from: d */
    private static final int[] f9664d = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: e */
    private static final int f9665e = 12992;

    /* JADX INFO: renamed from: f */
    private final Handler f9666f;

    /* JADX INFO: renamed from: g */
    private final int[] f9667g = new int[1];

    /* JADX INFO: renamed from: h */
    @Nullable
    private EGLDisplay f9668h;

    /* JADX INFO: renamed from: i */
    @Nullable
    private EGLContext f9669i;

    /* JADX INFO: renamed from: j */
    @Nullable
    private EGLSurface f9670j;

    /* JADX INFO: renamed from: k */
    @Nullable
    private SurfaceTexture f9671k;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.g$a */
    public static final class a extends RuntimeException {
        private a(String str) {
            super(str);
        }

        public /* synthetic */ a(String str, byte b) {
            this(str);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.g$b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public RunnableC1724g(Handler handler) {
        this.f9666f = handler;
    }

    /* JADX INFO: renamed from: a */
    private static EGLConfig m8159a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f9664d, 0, eGLConfigArr, 0, 1, iArr, 0);
        byte b2 = 0;
        if (!zEglChooseConfig || iArr[0] <= 0 || eGLConfigArr[0] == null) {
            throw new a(C1717af.m8066a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]), b2);
        }
        return eGLConfigArr[0];
    }

    /* JADX INFO: renamed from: a */
    private static EGLContext m8160a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        byte b2 = 0;
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, f9665e, 1, 12344}, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new a("eglCreateContext failed", b2);
    }

    /* JADX INFO: renamed from: a */
    private static EGLSurface m8161a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        byte b2 = 0;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, f9665e, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new a("eglCreatePbufferSurface failed", b2);
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new a("eglMakeCurrent failed", b2);
    }

    /* JADX INFO: renamed from: a */
    private static void m8162a(int[] iArr) {
        byte b2 = 0;
        GLES20.glGenTextures(1, iArr, 0);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new a("glGenTextures failed. Error: " + Integer.toHexString(iGlGetError), b2);
    }

    /* JADX INFO: renamed from: c */
    private static EGLDisplay m8163c() {
        byte b2 = 0;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new a("eglGetDisplay failed", b2);
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new a("eglInitialize failed", b2);
    }

    /* JADX INFO: renamed from: a */
    public final void m8164a() {
        this.f9666f.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f9671k;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f9667g, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f9668h;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f9668h;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f9670j;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f9668h, this.f9670j);
            }
            EGLContext eGLContext = this.f9669i;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f9668h, eGLContext);
            }
            if (C1717af.f9627a >= 19) {
                EGL14.eglReleaseThread();
            }
            this.f9668h = null;
            this.f9669i = null;
            this.f9670j = null;
            this.f9671k = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8165a(int i) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        byte b2 = 0;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new a("eglGetDisplay failed", b2);
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            throw new a("eglInitialize failed", b2);
        }
        this.f9668h = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f9664d, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (!zEglChooseConfig || iArr2[0] <= 0 || eGLConfigArr[0] == null) {
            throw new a(C1717af.m8066a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), b2);
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f9668h, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, f9665e, 1, 12344}, 0);
        if (eGLContextEglCreateContext == null) {
            throw new a("eglCreateContext failed", b2);
        }
        this.f9669i = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = this.f9668h;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, f9665e, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new a("eglCreatePbufferSurface failed", b2);
            }
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
            throw new a("eglMakeCurrent failed", b2);
        }
        this.f9670j = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, this.f9667g, 0);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            throw new a("glGenTextures failed. Error: " + Integer.toHexString(iGlGetError), b2);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f9667g[0]);
        this.f9671k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX INFO: renamed from: b */
    public final SurfaceTexture m8166b() {
        return (SurfaceTexture) C1711a.m8005a(this.f9671k);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f9666f.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f9671k;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }
}
