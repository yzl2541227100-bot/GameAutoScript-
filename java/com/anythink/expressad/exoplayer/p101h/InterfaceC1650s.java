package com.anythink.expressad.exoplayer.p101h;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.InterfaceC1610h;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1685b;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.s */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1650s {

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.s$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f9012a;

        /* JADX INFO: renamed from: b */
        public final int f9013b;

        /* JADX INFO: renamed from: c */
        public final int f9014c;

        /* JADX INFO: renamed from: d */
        public final long f9015d;

        public a(int i) {
            this(i, -1L);
        }

        public a(int i, int i2, int i3, long j) {
            this.f9012a = i;
            this.f9013b = i2;
            this.f9014c = i3;
            this.f9015d = j;
        }

        public a(int i, long j) {
            this(i, -1, -1, j);
        }

        /* JADX INFO: renamed from: a */
        public final a m7463a(int i) {
            return this.f9012a == i ? this : new a(i, this.f9013b, this.f9014c, this.f9015d);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m7464a() {
            return this.f9013b != -1;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f9012a == aVar.f9012a && this.f9013b == aVar.f9013b && this.f9014c == aVar.f9014c && this.f9015d == aVar.f9015d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((((this.f9012a + 527) * 31) + this.f9013b) * 31) + this.f9014c) * 31) + ((int) this.f9015d);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.s$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo7375a(InterfaceC1650s interfaceC1650s, AbstractC1499ae abstractC1499ae, @Nullable Object obj);
    }

    /* JADX INFO: renamed from: a */
    InterfaceC1649r mo7225a(a aVar, InterfaceC1685b interfaceC1685b);

    /* JADX INFO: renamed from: a */
    void mo7354a(Handler handler, InterfaceC1651t interfaceC1651t);

    /* JADX INFO: renamed from: a */
    void mo7228a(InterfaceC1649r interfaceC1649r);

    /* JADX INFO: renamed from: a */
    void mo7356a(b bVar);

    /* JADX INFO: renamed from: a */
    void mo7357a(InterfaceC1651t interfaceC1651t);

    /* JADX INFO: renamed from: a */
    void mo7358a(InterfaceC1610h interfaceC1610h, boolean z, b bVar);

    /* JADX INFO: renamed from: b */
    void mo7286b();
}
