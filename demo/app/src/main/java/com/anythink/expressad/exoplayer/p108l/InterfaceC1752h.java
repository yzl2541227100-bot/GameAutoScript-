package com.anythink.expressad.exoplayer.p108l;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p092c.C1526d;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.l.h */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1752h {

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.l.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        @Nullable
        private final Handler f9939a;

        /* JADX INFO: renamed from: b */
        @Nullable
        private final InterfaceC1752h f9940b;

        public a(@Nullable Handler handler, @Nullable InterfaceC1752h interfaceC1752h) {
            this.f9939a = interfaceC1752h != null ? (Handler) C1711a.m8005a(handler) : null;
            this.f9940b = interfaceC1752h;
        }

        /* JADX INFO: renamed from: a */
        public final void m8380a(final int i, final int i2, final int i3, final float f) {
            if (this.f9940b != null) {
                this.f9939a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.l.h.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f9940b.mo6164a(i, i2, i3, f);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m8381a(final int i, final long j) {
            if (this.f9940b != null) {
                this.f9939a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.l.h.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f9940b.mo6165a(i, j);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m8382a(final Surface surface) {
            if (this.f9940b != null) {
                this.f9939a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.l.h.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f9940b.mo6171a(surface);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m8383a(final C1526d c1526d) {
            if (this.f9940b != null) {
                this.f9939a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.l.h.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f9940b.mo6173a(c1526d);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m8384a(final C1753m c1753m) {
            if (this.f9940b != null) {
                this.f9939a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.l.h.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f9940b.mo6175a(c1753m);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m8385a(final String str, final long j, final long j2) {
            if (this.f9940b != null) {
                this.f9939a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.l.h.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f9940b.mo6177a(str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m8386b(final C1526d c1526d) {
            if (this.f9940b != null) {
                this.f9939a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.l.h.a.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f9940b.mo6183b(c1526d);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo6164a(int i, int i2, int i3, float f);

    /* JADX INFO: renamed from: a */
    void mo6165a(int i, long j);

    /* JADX INFO: renamed from: a */
    void mo6171a(Surface surface);

    /* JADX INFO: renamed from: a */
    void mo6173a(C1526d c1526d);

    /* JADX INFO: renamed from: a */
    void mo6175a(C1753m c1753m);

    /* JADX INFO: renamed from: a */
    void mo6177a(String str, long j, long j2);

    /* JADX INFO: renamed from: b */
    void mo6183b(C1526d c1526d);
}
