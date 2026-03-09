package com.anythink.expressad.exoplayer.p091b;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p092c.C1526d;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.g */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1507g {

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        @Nullable
        private final Handler f7548a;

        /* JADX INFO: renamed from: b */
        @Nullable
        private final InterfaceC1507g f7549b;

        public a(@Nullable Handler handler, @Nullable InterfaceC1507g interfaceC1507g) {
            this.f7548a = interfaceC1507g != null ? (Handler) C1711a.m8005a(handler) : null;
            this.f7549b = interfaceC1507g;
        }

        /* JADX INFO: renamed from: a */
        public final void m6433a(final int i) {
            if (this.f7549b != null) {
                this.f7548a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.b.g.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7549b.mo6163a(i);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m6434a(final int i, final long j, final long j2) {
            if (this.f7549b != null) {
                this.f7548a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.b.g.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7549b.mo6166a(i, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m6435a(final C1526d c1526d) {
            if (this.f7549b != null) {
                this.f7548a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.b.g.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7549b.mo6189c(c1526d);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m6436a(final C1753m c1753m) {
            if (this.f7549b != null) {
                this.f7548a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.b.g.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7549b.mo6184b(c1753m);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m6437a(final String str, final long j, final long j2) {
            if (this.f7549b != null) {
                this.f7548a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.b.g.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7549b.mo6185b(str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m6438b(final C1526d c1526d) {
            if (this.f7549b != null) {
                this.f7548a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.b.g.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7549b.mo6191d(c1526d);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo6163a(int i);

    /* JADX INFO: renamed from: a */
    void mo6166a(int i, long j, long j2);

    /* JADX INFO: renamed from: b */
    void mo6184b(C1753m c1753m);

    /* JADX INFO: renamed from: b */
    void mo6185b(String str, long j, long j2);

    /* JADX INFO: renamed from: c */
    void mo6189c(C1526d c1526d);

    /* JADX INFO: renamed from: d */
    void mo6191d(C1526d c1526d);
}
