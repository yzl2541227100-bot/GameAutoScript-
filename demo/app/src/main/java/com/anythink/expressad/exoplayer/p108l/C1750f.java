package com.anythink.expressad.exoplayer.p108l;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p107k.C1717af;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.l.f */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public final class C1750f {

    /* JADX INFO: renamed from: a */
    private static final long f9912a = 500;

    /* JADX INFO: renamed from: b */
    private static final long f9913b = 20000000;

    /* JADX INFO: renamed from: c */
    private static final long f9914c = 80;

    /* JADX INFO: renamed from: d */
    private static final int f9915d = 6;

    /* JADX INFO: renamed from: e */
    private final WindowManager f9916e;

    /* JADX INFO: renamed from: f */
    private final b f9917f;

    /* JADX INFO: renamed from: g */
    private final a f9918g;

    /* JADX INFO: renamed from: h */
    private long f9919h;

    /* JADX INFO: renamed from: i */
    private long f9920i;

    /* JADX INFO: renamed from: j */
    private long f9921j;

    /* JADX INFO: renamed from: k */
    private long f9922k;

    /* JADX INFO: renamed from: l */
    private long f9923l;

    /* JADX INFO: renamed from: m */
    private boolean f9924m;

    /* JADX INFO: renamed from: n */
    private long f9925n;

    /* JADX INFO: renamed from: o */
    private long f9926o;

    /* JADX INFO: renamed from: p */
    private long f9927p;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.l.f$a */
    @TargetApi(17)
    public final class a implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: b */
        private final DisplayManager f9929b;

        public a(DisplayManager displayManager) {
            this.f9929b = displayManager;
        }

        /* JADX INFO: renamed from: a */
        public final void m8371a() {
            this.f9929b.registerDisplayListener(this, null);
        }

        /* JADX INFO: renamed from: b */
        public final void m8372b() {
            this.f9929b.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            if (i == 0) {
                C1750f.this.m8367c();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.l.f$b */
    public static final class b implements Handler.Callback, Choreographer.FrameCallback {

        /* JADX INFO: renamed from: b */
        private static final int f9930b = 0;

        /* JADX INFO: renamed from: c */
        private static final int f9931c = 1;

        /* JADX INFO: renamed from: d */
        private static final int f9932d = 2;

        /* JADX INFO: renamed from: e */
        private static final b f9933e = new b();

        /* JADX INFO: renamed from: a */
        public volatile long f9934a = C1500b.f7455b;

        /* JADX INFO: renamed from: f */
        private final Handler f9935f;

        /* JADX INFO: renamed from: g */
        private final HandlerThread f9936g;

        /* JADX INFO: renamed from: h */
        private Choreographer f9937h;

        /* JADX INFO: renamed from: i */
        private int f9938i;

        private b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.f9936g = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f9935f = handler;
            handler.sendEmptyMessage(0);
        }

        /* JADX INFO: renamed from: a */
        public static b m8373a() {
            return f9933e;
        }

        /* JADX INFO: renamed from: d */
        private void m8374d() {
            this.f9937h = Choreographer.getInstance();
        }

        /* JADX INFO: renamed from: e */
        private void m8375e() {
            Choreographer choreographer = this.f9937h;
            if (choreographer != null) {
                int i = this.f9938i + 1;
                this.f9938i = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        private void m8376f() {
            Choreographer choreographer = this.f9937h;
            if (choreographer != null) {
                int i = this.f9938i - 1;
                this.f9938i = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f9934a = C1500b.f7455b;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m8377b() {
            this.f9935f.sendEmptyMessage(1);
        }

        /* JADX INFO: renamed from: c */
        public final void m8378c() {
            this.f9935f.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            if (this.f9937h != null) {
                this.f9934a = j;
                this.f9937h.postFrameCallbackDelayed(this, 500L);
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                try {
                    this.f9937h = Choreographer.getInstance();
                } catch (Throwable unused) {
                }
                return true;
            }
            if (i == 1) {
                Choreographer choreographer = this.f9937h;
                if (choreographer != null) {
                    int i2 = this.f9938i + 1;
                    this.f9938i = i2;
                    if (i2 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f9937h;
            if (choreographer2 != null) {
                int i3 = this.f9938i - 1;
                this.f9938i = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f9934a = C1500b.f7455b;
                }
            }
            return true;
        }
    }

    public C1750f() {
        this(null);
    }

    public C1750f(@Nullable Context context) {
        DisplayManager displayManager;
        a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f9916e = (WindowManager) context.getSystemService("window");
        } else {
            this.f9916e = null;
        }
        if (this.f9916e != null) {
            if (C1717af.f9627a >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                aVar = new a(displayManager);
            }
            this.f9918g = aVar;
            this.f9917f = b.m8373a();
        } else {
            this.f9918g = null;
            this.f9917f = null;
        }
        this.f9919h = C1500b.f7455b;
        this.f9920i = C1500b.f7455b;
    }

    /* JADX INFO: renamed from: a */
    private static long m8363a(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: a */
    private a m8364a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    /* JADX INFO: renamed from: b */
    private boolean m8366b(long j, long j2) {
        return Math.abs((j2 - this.f9925n) - (j - this.f9926o)) > f9913b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m8367c() {
        try {
            Display defaultDisplay = this.f9916e.getDefaultDisplay();
            if (defaultDisplay != null) {
                long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
                this.f9919h = refreshRate;
                this.f9920i = (refreshRate * f9914c) / 100;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m8368a(long j, long j2) {
        long j3;
        long j4;
        long j5;
        long j6 = 1000 * j;
        if (this.f9924m) {
            if (j != this.f9921j) {
                this.f9927p++;
                this.f9922k = this.f9923l;
            }
            long j7 = this.f9927p;
            if (j7 >= 6) {
                j4 = this.f9922k + ((j6 - this.f9926o) / j7);
                if (!m8366b(j4, j2)) {
                    j3 = (this.f9925n + j4) - this.f9926o;
                }
            } else {
                if (m8366b(j6, j2)) {
                }
                j3 = j2;
                j4 = j6;
            }
            this.f9924m = false;
            j3 = j2;
            j4 = j6;
        } else {
            j3 = j2;
            j4 = j6;
        }
        if (!this.f9924m) {
            this.f9926o = j6;
            this.f9925n = j2;
            this.f9927p = 0L;
            this.f9924m = true;
        }
        this.f9921j = j;
        this.f9923l = j4;
        b bVar = this.f9917f;
        if (bVar == null || this.f9919h == C1500b.f7455b) {
            return j3;
        }
        long j8 = bVar.f9934a;
        if (j8 == C1500b.f7455b) {
            return j3;
        }
        long j9 = this.f9919h;
        long j10 = j8 + (((j3 - j8) / j9) * j9);
        if (j3 <= j10) {
            j5 = j10 - j9;
        } else {
            j10 = j9 + j10;
            j5 = j10;
        }
        if (j10 - j3 >= j3 - j5) {
            j10 = j5;
        }
        return j10 - this.f9920i;
    }

    /* JADX INFO: renamed from: a */
    public final void m8369a() {
        this.f9924m = false;
        if (this.f9916e != null) {
            this.f9917f.m8377b();
            a aVar = this.f9918g;
            if (aVar != null) {
                aVar.m8371a();
            }
            m8367c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8370b() {
        if (this.f9916e != null) {
            a aVar = this.f9918g;
            if (aVar != null) {
                aVar.m8372b();
            }
            this.f9917f.m8378c();
        }
    }
}
