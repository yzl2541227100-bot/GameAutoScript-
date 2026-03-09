package com.anythink.expressad.exoplayer;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p101h.C1621af;
import com.anythink.expressad.exoplayer.p104i.C1665g;
import com.anythink.expressad.exoplayer.p108l.InterfaceC1751g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.w */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1766w {

    /* JADX INFO: renamed from: h */
    public static final int f10074h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f10075i = 2;

    /* JADX INFO: renamed from: j */
    public static final int f10076j = 3;

    /* JADX INFO: renamed from: k */
    public static final int f10077k = 4;

    /* JADX INFO: renamed from: l */
    public static final int f10078l = 0;

    /* JADX INFO: renamed from: m */
    public static final int f10079m = 1;

    /* JADX INFO: renamed from: n */
    public static final int f10080n = 2;

    /* JADX INFO: renamed from: o */
    public static final int f10081o = 0;

    /* JADX INFO: renamed from: p */
    public static final int f10082p = 1;

    /* JADX INFO: renamed from: q */
    public static final int f10083q = 2;

    /* JADX INFO: renamed from: r */
    public static final int f10084r = 3;

    /* JADX INFO: renamed from: s */
    public static final int f10085s = 4;

    /* JADX INFO: renamed from: t */
    public static final int f10086t = 0;

    /* JADX INFO: renamed from: u */
    public static final int f10087u = 1;

    /* JADX INFO: renamed from: v */
    public static final int f10088v = 2;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.w$a */
    public static abstract class a implements c {
        @Deprecated
        /* JADX INFO: renamed from: a */
        private static void m8507a() {
        }

        @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
        public void onLoadingChanged(boolean z) {
        }

        @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
        public void onPlaybackParametersChanged(C1765v c1765v) {
        }

        @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
        public void onPlayerError(C1581g c1581g) {
        }

        @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
        public void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
        public void onPositionDiscontinuity(int i) {
        }

        @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
        public void onRepeatModeChanged(int i) {
        }

        @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
        public void onSeekProcessed() {
        }

        @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
        public void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
        public void onTimelineChanged(AbstractC1499ae abstractC1499ae, @Nullable Object obj, int i) {
        }

        @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
        public void onTracksChanged(C1621af c1621af, C1665g c1665g) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.w$b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.w$c */
    public interface c {
        void onLoadingChanged(boolean z);

        void onPlaybackParametersChanged(C1765v c1765v);

        void onPlayerError(C1581g c1581g);

        void onPlayerStateChanged(boolean z, int i);

        void onPositionDiscontinuity(int i);

        void onRepeatModeChanged(int i);

        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean z);

        void onTimelineChanged(AbstractC1499ae abstractC1499ae, @Nullable Object obj, int i);

        void onTracksChanged(C1621af c1621af, C1665g c1665g);
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.w$d */
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.w$e */
    public interface e {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.w$f */
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.w$g */
    public interface g {
        /* JADX INFO: renamed from: H */
        int mo6296H();

        /* JADX INFO: renamed from: I */
        void mo6297I();

        /* JADX INFO: renamed from: a */
        void mo6305a(Surface surface);

        /* JADX INFO: renamed from: a */
        void mo6306a(SurfaceHolder surfaceHolder);

        /* JADX INFO: renamed from: a */
        void mo6307a(SurfaceView surfaceView);

        /* JADX INFO: renamed from: a */
        void mo6308a(TextureView textureView);

        /* JADX INFO: renamed from: a */
        void mo6312a(InterfaceC1751g interfaceC1751g);

        /* JADX INFO: renamed from: b */
        void mo6319b(Surface surface);

        /* JADX INFO: renamed from: b */
        void mo6320b(SurfaceHolder surfaceHolder);

        /* JADX INFO: renamed from: b */
        void mo6321b(SurfaceView surfaceView);

        /* JADX INFO: renamed from: b */
        void mo6322b(TextureView textureView);

        /* JADX INFO: renamed from: b */
        void mo6323b(InterfaceC1751g interfaceC1751g);

        /* JADX INFO: renamed from: d */
        void mo6331d(int i);
    }

    /* JADX INFO: renamed from: A */
    int mo6289A();

    /* JADX INFO: renamed from: B */
    long mo6290B();

    /* JADX INFO: renamed from: C */
    int mo6291C();

    /* JADX INFO: renamed from: D */
    C1621af mo6292D();

    /* JADX INFO: renamed from: E */
    C1665g mo6293E();

    /* JADX INFO: renamed from: F */
    AbstractC1499ae mo6294F();

    @Nullable
    /* JADX INFO: renamed from: G */
    Object mo6295G();

    /* JADX INFO: renamed from: a */
    void mo6302a(int i);

    /* JADX INFO: renamed from: a */
    void mo6303a(int i, long j);

    /* JADX INFO: renamed from: a */
    void mo6304a(long j);

    /* JADX INFO: renamed from: a */
    void mo6313a(@Nullable C1765v c1765v);

    /* JADX INFO: renamed from: a */
    void mo6314a(c cVar);

    /* JADX INFO: renamed from: a */
    void mo6315a(boolean z);

    @Nullable
    /* JADX INFO: renamed from: b */
    g mo6317b();

    /* JADX INFO: renamed from: b */
    void mo6318b(int i);

    /* JADX INFO: renamed from: b */
    void mo6324b(c cVar);

    /* JADX INFO: renamed from: b */
    void mo6325b(boolean z);

    /* JADX INFO: renamed from: c */
    int mo6327c(int i);

    @Nullable
    /* JADX INFO: renamed from: c */
    e mo6328c();

    /* JADX INFO: renamed from: c */
    void mo6329c(boolean z);

    /* JADX INFO: renamed from: d */
    int mo6330d();

    @Nullable
    /* JADX INFO: renamed from: e */
    C1581g mo6332e();

    /* JADX INFO: renamed from: f */
    boolean mo6333f();

    /* JADX INFO: renamed from: g */
    int mo6334g();

    /* JADX INFO: renamed from: h */
    boolean mo6335h();

    /* JADX INFO: renamed from: i */
    boolean mo6336i();

    /* JADX INFO: renamed from: j */
    void mo6337j();

    /* JADX INFO: renamed from: k */
    C1765v mo6338k();

    @Nullable
    /* JADX INFO: renamed from: l */
    Object mo6339l();

    /* JADX INFO: renamed from: m */
    void mo6340m();

    /* JADX INFO: renamed from: n */
    void mo6341n();

    /* JADX INFO: renamed from: o */
    int mo6342o();

    /* JADX INFO: renamed from: p */
    int mo6343p();

    /* JADX INFO: renamed from: q */
    int mo6344q();

    /* JADX INFO: renamed from: r */
    int mo6345r();

    /* JADX INFO: renamed from: s */
    long mo6346s();

    /* JADX INFO: renamed from: t */
    long mo6347t();

    /* JADX INFO: renamed from: u */
    long mo6348u();

    /* JADX INFO: renamed from: v */
    int mo6349v();

    /* JADX INFO: renamed from: w */
    boolean mo6350w();

    /* JADX INFO: renamed from: x */
    boolean mo6351x();

    /* JADX INFO: renamed from: y */
    boolean mo6352y();

    /* JADX INFO: renamed from: z */
    int mo6353z();
}
