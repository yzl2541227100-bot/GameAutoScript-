package com.iflytek.voiceads.videolib;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.TextureView;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.videolib.c */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class TextureViewSurfaceTextureListenerC3001c implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a */
    public static JZTextureView f16544a;

    /* JADX INFO: renamed from: b */
    public static TextureViewSurfaceTextureListenerC3001c f16545b;

    /* JADX INFO: renamed from: c */
    public static SurfaceTexture f16546c;

    /* JADX INFO: renamed from: d */
    public static Surface f16547d;

    /* JADX INFO: renamed from: e */
    public AbstractC3000b f16548e;

    /* JADX INFO: renamed from: f */
    public int f16549f = -1;

    /* JADX INFO: renamed from: g */
    public int f16550g = 0;

    /* JADX INFO: renamed from: h */
    public int f16551h = 0;

    /* JADX INFO: renamed from: i */
    public HandlerThread f16552i = new HandlerThread("JZVideoPlayer");

    /* JADX INFO: renamed from: j */
    public a f16553j;

    /* JADX INFO: renamed from: k */
    public Handler f16554k;

    /* JADX INFO: renamed from: com.iflytek.voiceads.videolib.c$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 0:
                    TextureViewSurfaceTextureListenerC3001c.this.f16550g = 0;
                    TextureViewSurfaceTextureListenerC3001c.this.f16551h = 0;
                    TextureViewSurfaceTextureListenerC3001c.this.f16548e.mo13660b();
                    if (TextureViewSurfaceTextureListenerC3001c.f16547d != null) {
                        TextureViewSurfaceTextureListenerC3001c.f16547d.release();
                    }
                    TextureViewSurfaceTextureListenerC3001c.f16547d = new Surface(TextureViewSurfaceTextureListenerC3001c.f16546c);
                    TextureViewSurfaceTextureListenerC3001c.this.f16548e.mo13658a(TextureViewSurfaceTextureListenerC3001c.f16547d);
                    break;
                case 2:
                    TextureViewSurfaceTextureListenerC3001c.this.f16548e.mo13662d();
                    break;
            }
        }
    }

    public TextureViewSurfaceTextureListenerC3001c() {
        this.f16552i.start();
        this.f16553j = new a(this.f16552i.getLooper());
        this.f16554k = new Handler();
        if (this.f16548e == null) {
            this.f16548e = new C3002d();
        }
    }

    /* JADX INFO: renamed from: a */
    public static TextureViewSurfaceTextureListenerC3001c m13665a() {
        if (f16545b == null) {
            f16545b = new TextureViewSurfaceTextureListenerC3001c();
        }
        return f16545b;
    }

    /* JADX INFO: renamed from: a */
    public static void m13666a(long j) {
        m13665a().f16548e.mo13657a(j);
    }

    /* JADX INFO: renamed from: a */
    public static void m13667a(C2999a c2999a) {
        m13665a().f16548e.f16543a = c2999a;
    }

    /* JADX INFO: renamed from: a */
    public static void m13668a(boolean z) {
        m13665a().f16548e.mo13659a(z);
    }

    /* JADX INFO: renamed from: b */
    public static Object m13669b() {
        if (m13665a().f16548e.f16543a == null) {
            return null;
        }
        return m13665a().f16548e.f16543a.m13653a();
    }

    /* JADX INFO: renamed from: c */
    public static long m13670c() {
        return m13665a().f16548e.mo13663e();
    }

    /* JADX INFO: renamed from: d */
    public static long m13671d() {
        return m13665a().f16548e.mo13664f();
    }

    /* JADX INFO: renamed from: e */
    public static void m13672e() {
        m13665a().f16548e.mo13661c();
    }

    /* JADX INFO: renamed from: f */
    public static void m13673f() {
        m13665a().f16548e.mo13656a();
    }

    /* JADX INFO: renamed from: g */
    public void m13674g() {
        Message message = new Message();
        message.what = 2;
        this.f16553j.sendMessage(message);
    }

    /* JADX INFO: renamed from: h */
    public void m13675h() {
        m13674g();
        Message message = new Message();
        message.what = 0;
        this.f16553j.sendMessage(message);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (C3013o.m13684c() == null) {
            return;
        }
        C2989g.m13555a("JZVideoPlayer", "onSurfaceTextureAvailable");
        try {
            if (f16546c == null) {
                f16546c = surfaceTexture;
                m13675h();
            } else {
                f16544a.setSurfaceTexture(f16546c);
            }
        } catch (Exception e) {
            C2989g.m13557b("JZVideoPlayer", "onSurfaceTextureAvailable:" + e.getMessage());
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return f16546c == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
