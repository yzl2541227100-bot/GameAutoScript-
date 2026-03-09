package com.anythink.expressad.exoplayer;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p101h.p102a.C1612a;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.ae */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1499ae {

    /* JADX INFO: renamed from: a */
    public static final AbstractC1499ae f7359a = new AbstractC1499ae() { // from class: com.anythink.expressad.exoplayer.ae.1
        @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: a */
        public final int mo6358a(Object obj) {
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: a */
        public final a mo6362a(int i, a aVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: a */
        public final b mo6364a(int i, b bVar, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: b */
        public final int mo6366b() {
            return 0;
        }

        @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: c */
        public final int mo6370c() {
            return 0;
        }
    };

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.ae$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public Object f7360a;

        /* JADX INFO: renamed from: b */
        public Object f7361b;

        /* JADX INFO: renamed from: c */
        public int f7362c;

        /* JADX INFO: renamed from: d */
        public long f7363d;

        /* JADX INFO: renamed from: e */
        private long f7364e;

        /* JADX INFO: renamed from: f */
        private C1612a f7365f;

        /* JADX INFO: renamed from: e */
        private long m6371e() {
            return C1500b.m6396a(this.f7363d);
        }

        /* JADX INFO: renamed from: f */
        private long m6372f() {
            return this.f7363d;
        }

        /* JADX INFO: renamed from: a */
        public final int m6373a(int i, int i2) {
            return this.f7365f.f8646i[i].m7197a(i2);
        }

        /* JADX INFO: renamed from: a */
        public final int m6374a(long j) {
            C1612a c1612a = this.f7365f;
            int length = c1612a.f8645h.length - 1;
            while (length >= 0) {
                long[] jArr = c1612a.f8645h;
                if (jArr[length] != Long.MIN_VALUE && jArr[length] <= j) {
                    break;
                }
                length--;
            }
            if (length < 0 || !c1612a.f8646i[length].m7201a()) {
                return -1;
            }
            return length;
        }

        /* JADX INFO: renamed from: a */
        public final long m6375a() {
            return C1500b.m6396a(this.f7364e);
        }

        /* JADX INFO: renamed from: a */
        public final long m6376a(int i) {
            return this.f7365f.f8645h[i];
        }

        /* JADX INFO: renamed from: a */
        public final a m6377a(Object obj, Object obj2, int i, long j, long j2, C1612a c1612a) {
            this.f7360a = obj;
            this.f7361b = obj2;
            this.f7362c = i;
            this.f7363d = j;
            this.f7364e = j2;
            this.f7365f = c1612a;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m6378a(Object obj, Object obj2, long j, long j2) {
            return m6377a(obj, obj2, 0, j, j2, C1612a.f8643f);
        }

        /* JADX INFO: renamed from: b */
        public final int m6379b(int i) {
            return this.f7365f.f8646i[i].m7197a(-1);
        }

        /* JADX INFO: renamed from: b */
        public final int m6380b(long j) {
            C1612a c1612a = this.f7365f;
            int i = 0;
            while (true) {
                long[] jArr = c1612a.f8645h;
                if (i >= jArr.length || jArr[i] == Long.MIN_VALUE || (j < jArr[i] && c1612a.f8646i[i].m7201a())) {
                    break;
                }
                i++;
            }
            if (i < c1612a.f8645h.length) {
                return i;
            }
            return -1;
        }

        /* JADX INFO: renamed from: b */
        public final long m6381b() {
            return this.f7364e;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m6382b(int i, int i2) {
            C1612a.a aVar = this.f7365f.f8646i[i];
            return (aVar.f8649a == -1 || aVar.f8651c[i2] == 0) ? false : true;
        }

        /* JADX INFO: renamed from: c */
        public final int m6383c() {
            return this.f7365f.f8644g;
        }

        /* JADX INFO: renamed from: c */
        public final long m6384c(int i, int i2) {
            C1612a.a aVar = this.f7365f.f8646i[i];
            return aVar.f8649a != -1 ? aVar.f8652d[i2] : C1500b.f7455b;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m6385c(int i) {
            return !this.f7365f.f8646i[i].m7201a();
        }

        /* JADX INFO: renamed from: d */
        public final int m6386d(int i) {
            return this.f7365f.f8646i[i].f8649a;
        }

        /* JADX INFO: renamed from: d */
        public final long m6387d() {
            return this.f7365f.f8647j;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.ae$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public Object f7366a;

        /* JADX INFO: renamed from: b */
        public long f7367b;

        /* JADX INFO: renamed from: c */
        public long f7368c;

        /* JADX INFO: renamed from: d */
        public boolean f7369d;

        /* JADX INFO: renamed from: e */
        public boolean f7370e;

        /* JADX INFO: renamed from: f */
        public int f7371f;

        /* JADX INFO: renamed from: g */
        public int f7372g;

        /* JADX INFO: renamed from: h */
        public long f7373h;

        /* JADX INFO: renamed from: i */
        public long f7374i;

        /* JADX INFO: renamed from: j */
        public long f7375j;

        /* JADX INFO: renamed from: a */
        private long m6388a() {
            return C1500b.m6396a(this.f7373h);
        }

        /* JADX INFO: renamed from: b */
        private long m6389b() {
            return this.f7373h;
        }

        /* JADX INFO: renamed from: c */
        private long m6390c() {
            return C1500b.m6396a(this.f7374i);
        }

        /* JADX INFO: renamed from: d */
        private long m6391d() {
            return this.f7374i;
        }

        /* JADX INFO: renamed from: e */
        private long m6392e() {
            return C1500b.m6396a(this.f7375j);
        }

        /* JADX INFO: renamed from: f */
        private long m6393f() {
            return this.f7375j;
        }

        /* JADX INFO: renamed from: a */
        public final b m6394a(@Nullable Object obj, long j, long j2, boolean z, boolean z3, long j3, long j4, long j5) {
            this.f7366a = obj;
            this.f7367b = j;
            this.f7368c = j2;
            this.f7369d = z;
            this.f7370e = z3;
            this.f7373h = j3;
            this.f7374i = j4;
            this.f7371f = 0;
            this.f7372g = 0;
            this.f7375j = j5;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    private a m6354a(int i, a aVar) {
        return mo6362a(i, aVar, false);
    }

    /* JADX INFO: renamed from: a */
    private b m6355a(int i, b bVar) {
        return m6363a(i, bVar, false);
    }

    /* JADX INFO: renamed from: a */
    public int mo6356a(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo6359a(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo6359a(z) ? mo6368b(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: a */
    public final int m6357a(int i, a aVar, b bVar, int i2, boolean z) {
        int i3 = mo6362a(i, aVar, false).f7362c;
        if (m6363a(i3, bVar, false).f7372g != i) {
            return i + 1;
        }
        int iMo6356a = mo6356a(i3, i2, z);
        if (iMo6356a == -1) {
            return -1;
        }
        return m6363a(iMo6356a, bVar, false).f7371f;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo6358a(Object obj);

    /* JADX INFO: renamed from: a */
    public int mo6359a(boolean z) {
        if (m6365a()) {
            return -1;
        }
        return mo6366b() - 1;
    }

    /* JADX INFO: renamed from: a */
    public final Pair<Integer, Long> m6360a(b bVar, a aVar, int i, long j) {
        return m6361a(bVar, aVar, i, j, 0L);
    }

    /* JADX INFO: renamed from: a */
    public final Pair<Integer, Long> m6361a(b bVar, a aVar, int i, long j, long j2) {
        C1711a.m8004a(i, mo6366b());
        mo6364a(i, bVar, false, j2);
        if (j == C1500b.f7455b) {
            j = bVar.f7373h;
            if (j == C1500b.f7455b) {
                return null;
            }
        }
        int i2 = bVar.f7371f;
        long j3 = bVar.f7375j + j;
        while (true) {
            long j4 = mo6362a(i2, aVar, false).f7363d;
            if (j4 == C1500b.f7455b || j3 < j4 || i2 >= bVar.f7372g) {
                break;
            }
            j3 -= j4;
            i2++;
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(j3));
    }

    /* JADX INFO: renamed from: a */
    public abstract a mo6362a(int i, a aVar, boolean z);

    /* JADX INFO: renamed from: a */
    public final b m6363a(int i, b bVar, boolean z) {
        return mo6364a(i, bVar, z, 0L);
    }

    /* JADX INFO: renamed from: a */
    public abstract b mo6364a(int i, b bVar, boolean z, long j);

    /* JADX INFO: renamed from: a */
    public final boolean m6365a() {
        return mo6366b() == 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo6366b();

    /* JADX INFO: renamed from: b */
    public int mo6367b(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo6368b(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo6368b(z) ? mo6359a(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: b */
    public int mo6368b(boolean z) {
        return m6365a() ? -1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6369b(int i, a aVar, b bVar, int i2, boolean z) {
        return m6357a(i, aVar, bVar, i2, z) == -1;
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo6370c();
}
