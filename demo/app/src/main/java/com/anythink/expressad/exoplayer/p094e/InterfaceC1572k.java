package com.anythink.expressad.exoplayer.p094e;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.k */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1572k {

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C1573l f8383a;

        /* JADX INFO: renamed from: b */
        public final C1573l f8384b;

        public a(C1573l c1573l) {
            this(c1573l, c1573l);
        }

        public a(C1573l c1573l, C1573l c1573l2) {
            this.f8383a = (C1573l) C1711a.m8005a(c1573l);
            this.f8384b = (C1573l) C1711a.m8005a(c1573l2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f8383a.equals(aVar.f8383a) && this.f8384b.equals(aVar.f8384b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f8383a.hashCode() * 31) + this.f8384b.hashCode();
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.f8383a);
            if (this.f8383a.equals(this.f8384b)) {
                str = "";
            } else {
                str = ", " + this.f8384b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.k$b */
    public static final class b implements InterfaceC1572k {

        /* JADX INFO: renamed from: a */
        private final long f8385a;

        /* JADX INFO: renamed from: b */
        private final a f8386b;

        private b(long j) {
            this(j, 0L);
        }

        public b(long j, long j2) {
            this.f8385a = j;
            this.f8386b = new a(j2 == 0 ? C1573l.f8387a : new C1573l(0L, j2));
        }

        @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1572k
        /* JADX INFO: renamed from: a */
        public final a mo6820a(long j) {
            return this.f8386b;
        }

        @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1572k
        /* JADX INFO: renamed from: a */
        public final boolean mo6821a() {
            return false;
        }

        @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1572k
        /* JADX INFO: renamed from: b */
        public final long mo6822b() {
            return this.f8385a;
        }
    }

    /* JADX INFO: renamed from: a */
    a mo6820a(long j);

    /* JADX INFO: renamed from: a */
    boolean mo6821a();

    /* JADX INFO: renamed from: b */
    long mo6822b();
}
