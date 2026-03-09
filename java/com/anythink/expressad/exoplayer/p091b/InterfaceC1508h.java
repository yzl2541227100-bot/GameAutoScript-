package com.anythink.expressad.exoplayer.p091b;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1765v;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.h */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1508h {

    /* JADX INFO: renamed from: a */
    public static final long f7566a = Long.MIN_VALUE;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.h$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.h$b */
    public static final class b extends Exception {

        /* JADX INFO: renamed from: a */
        public final int f7567a;

        public b(int i, int i2, int i3, int i4) {
            super("AudioTrack init failed: " + i + ", Config(" + i2 + ", " + i3 + ", " + i4 + ")");
            this.f7567a = i;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.h$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo6459a();

        /* JADX INFO: renamed from: a */
        void mo6460a(int i);

        /* JADX INFO: renamed from: a */
        void mo6461a(int i, long j, long j2);
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.h$d */
    public static final class d extends Exception {

        /* JADX INFO: renamed from: a */
        public final int f7568a;

        public d(int i) {
            super("AudioTrack write failed: ".concat(String.valueOf(i)));
            this.f7568a = i;
        }
    }

    /* JADX INFO: renamed from: a */
    long mo6439a(boolean z);

    /* JADX INFO: renamed from: a */
    C1765v mo6440a(C1765v c1765v);

    /* JADX INFO: renamed from: a */
    void mo6441a();

    /* JADX INFO: renamed from: a */
    void mo6442a(float f);

    /* JADX INFO: renamed from: a */
    void mo6443a(int i, int i2, int i3, @Nullable int[] iArr, int i4, int i5);

    /* JADX INFO: renamed from: a */
    void mo6444a(C1502b c1502b);

    /* JADX INFO: renamed from: a */
    void mo6445a(c cVar);

    /* JADX INFO: renamed from: a */
    boolean mo6446a(int i);

    /* JADX INFO: renamed from: a */
    boolean mo6447a(ByteBuffer byteBuffer, long j);

    /* JADX INFO: renamed from: b */
    void mo6448b();

    /* JADX INFO: renamed from: b */
    void mo6449b(int i);

    /* JADX INFO: renamed from: c */
    void mo6450c();

    /* JADX INFO: renamed from: c */
    void mo6451c(int i);

    /* JADX INFO: renamed from: d */
    boolean mo6452d();

    /* JADX INFO: renamed from: e */
    boolean mo6453e();

    /* JADX INFO: renamed from: f */
    C1765v mo6454f();

    /* JADX INFO: renamed from: g */
    void mo6455g();

    /* JADX INFO: renamed from: h */
    void mo6456h();

    /* JADX INFO: renamed from: i */
    void mo6457i();

    /* JADX INFO: renamed from: j */
    void mo6458j();
}
