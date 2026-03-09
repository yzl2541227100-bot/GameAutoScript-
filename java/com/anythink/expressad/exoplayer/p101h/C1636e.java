package com.anythink.expressad.exoplayer.p101h;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.InterfaceC1610h;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1685b;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1636e extends AbstractC1637f<Void> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1650s f8839a;

    /* JADX INFO: renamed from: b */
    private final long f8840b;

    /* JADX INFO: renamed from: c */
    private final long f8841c;

    /* JADX INFO: renamed from: d */
    private final boolean f8842d;

    /* JADX INFO: renamed from: e */
    private final boolean f8843e;

    /* JADX INFO: renamed from: f */
    private final boolean f8844f;

    /* JADX INFO: renamed from: g */
    private final ArrayList<C1635d> f8845g;

    /* JADX INFO: renamed from: h */
    private final AbstractC1499ae.b f8846h;

    /* JADX INFO: renamed from: i */
    @Nullable
    private Object f8847i;

    /* JADX INFO: renamed from: j */
    private a f8848j;

    /* JADX INFO: renamed from: k */
    private b f8849k;

    /* JADX INFO: renamed from: l */
    private long f8850l;

    /* JADX INFO: renamed from: m */
    private long f8851m;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.e$a */
    public static final class a extends AbstractC1647p {

        /* JADX INFO: renamed from: c */
        private final long f8852c;

        /* JADX INFO: renamed from: d */
        private final long f8853d;

        /* JADX INFO: renamed from: e */
        private final long f8854e;

        /* JADX INFO: renamed from: f */
        private final boolean f8855f;

        public a(AbstractC1499ae abstractC1499ae, long j, long j2) throws b {
            super(abstractC1499ae);
            boolean z = true;
            if (abstractC1499ae.mo6370c() != 1) {
                throw new b(0);
            }
            AbstractC1499ae.b bVarM6363a = abstractC1499ae.m6363a(0, new AbstractC1499ae.b(), false);
            long jMax = Math.max(0L, j);
            long jMax2 = j2 == Long.MIN_VALUE ? bVarM6363a.f7374i : Math.max(0L, j2);
            long j3 = bVarM6363a.f7374i;
            if (j3 != C1500b.f7455b) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax != 0 && !bVarM6363a.f7369d) {
                    throw new b(1);
                }
                if (jMax > jMax2) {
                    throw new b(2);
                }
            }
            this.f8852c = jMax;
            this.f8853d = jMax2;
            this.f8854e = jMax2 == C1500b.f7455b ? -9223372036854775807L : jMax2 - jMax;
            if (!bVarM6363a.f7370e || (jMax2 != C1500b.f7455b && (j3 == C1500b.f7455b || jMax2 != j3))) {
                z = false;
            }
            this.f8855f = z;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1647p, com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: a */
        public final AbstractC1499ae.a mo6362a(int i, AbstractC1499ae.a aVar, boolean z) {
            this.f9004b.mo6362a(0, aVar, z);
            long jM6381b = aVar.m6381b() - this.f8852c;
            long j = this.f8854e;
            return aVar.m6378a(aVar.f7360a, aVar.f7361b, j == C1500b.f7455b ? -9223372036854775807L : j - jM6381b, jM6381b);
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1647p, com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: a */
        public final AbstractC1499ae.b mo6364a(int i, AbstractC1499ae.b bVar, boolean z, long j) {
            this.f9004b.mo6364a(0, bVar, z, 0L);
            long j2 = bVar.f7375j;
            long j3 = this.f8852c;
            bVar.f7375j = j2 + j3;
            bVar.f7374i = this.f8854e;
            bVar.f7370e = this.f8855f;
            long j4 = bVar.f7373h;
            if (j4 != C1500b.f7455b) {
                long jMax = Math.max(j4, j3);
                bVar.f7373h = jMax;
                long j5 = this.f8853d;
                if (j5 != C1500b.f7455b) {
                    jMax = Math.min(jMax, j5);
                }
                bVar.f7373h = jMax;
                bVar.f7373h = jMax - this.f8852c;
            }
            long jM6396a = C1500b.m6396a(this.f8852c);
            long j6 = bVar.f7367b;
            if (j6 != C1500b.f7455b) {
                bVar.f7367b = j6 + jM6396a;
            }
            long j7 = bVar.f7368c;
            if (j7 != C1500b.f7455b) {
                bVar.f7368c = j7 + jM6396a;
            }
            return bVar;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.e$b */
    public static final class b extends IOException {

        /* JADX INFO: renamed from: a */
        public static final int f8856a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f8857b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f8858c = 2;

        /* JADX INFO: renamed from: d */
        public final int f8859d;

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.e$b$a */
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(int i) {
            StringBuilder sb = new StringBuilder("Illegal clipping: ");
            sb.append(i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count");
            super(sb.toString());
            this.f8859d = i;
        }

        /* JADX INFO: renamed from: a */
        private static String m7371a(int i) {
            return i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    private C1636e(InterfaceC1650s interfaceC1650s, long j) {
        this(interfaceC1650s, 0L, j, true, true);
    }

    private C1636e(InterfaceC1650s interfaceC1650s, long j, long j2) {
        this(interfaceC1650s, j, j2, true, false);
    }

    @Deprecated
    private C1636e(InterfaceC1650s interfaceC1650s, long j, long j2, boolean z) {
        this(interfaceC1650s, j, j2, z, false);
    }

    private C1636e(InterfaceC1650s interfaceC1650s, long j, long j2, boolean z, boolean z3) {
        C1711a.m8010a(j >= 0);
        this.f8839a = (InterfaceC1650s) C1711a.m8005a(interfaceC1650s);
        this.f8840b = j;
        this.f8841c = j2;
        this.f8842d = z;
        this.f8843e = false;
        this.f8844f = z3;
        this.f8845g = new ArrayList<>();
        this.f8846h = new AbstractC1499ae.b();
    }

    /* JADX INFO: renamed from: a */
    private void m7367a(AbstractC1499ae abstractC1499ae) {
        long j;
        long j2;
        long j3;
        abstractC1499ae.m6363a(0, this.f8846h, false);
        long j4 = this.f8846h.f7375j;
        if (this.f8848j == null || this.f8845g.isEmpty() || this.f8843e) {
            long j5 = this.f8840b;
            long j6 = this.f8841c;
            if (this.f8844f) {
                long j7 = this.f8846h.f7373h;
                j5 += j7;
                j = j7 + j6;
            } else {
                j = j6;
            }
            this.f8850l = j4 + j5;
            this.f8851m = j6 != Long.MIN_VALUE ? j4 + j : Long.MIN_VALUE;
            int size = this.f8845g.size();
            for (int i = 0; i < size; i++) {
                this.f8845g.get(i).m7362a(this.f8850l, this.f8851m);
            }
            j2 = j5;
            j3 = j;
        } else {
            long j8 = this.f8850l - j4;
            j3 = this.f8841c != Long.MIN_VALUE ? this.f8851m - j4 : Long.MIN_VALUE;
            j2 = j8;
        }
        try {
            a aVar = new a(abstractC1499ae, j2, j3);
            this.f8848j = aVar;
            m7355a(aVar, this.f8847i);
        } catch (b e) {
            this.f8849k = e;
        }
    }

    /* JADX INFO: renamed from: b */
    private long m7368b(long j) {
        if (j == C1500b.f7455b) {
            return C1500b.f7455b;
        }
        long jM6396a = C1500b.m6396a(this.f8840b);
        long jMax = Math.max(0L, j - jM6396a);
        long j2 = this.f8841c;
        return j2 != Long.MIN_VALUE ? Math.min(C1500b.m6396a(j2) - jM6396a, jMax) : jMax;
    }

    /* JADX INFO: renamed from: b */
    private void m7369b(AbstractC1499ae abstractC1499ae, @Nullable Object obj) {
        if (this.f8849k != null) {
            return;
        }
        this.f8847i = obj;
        m7367a(abstractC1499ae);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long mo7370a(long j) {
        if (j == C1500b.f7455b) {
            return C1500b.f7455b;
        }
        long jM6396a = C1500b.m6396a(this.f8840b);
        long jMax = Math.max(0L, j - jM6396a);
        long j2 = this.f8841c;
        return j2 != Long.MIN_VALUE ? Math.min(C1500b.m6396a(j2) - jM6396a, jMax) : jMax;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final InterfaceC1649r mo7225a(InterfaceC1650s.a aVar, InterfaceC1685b interfaceC1685b) {
        C1635d c1635d = new C1635d(this.f8839a.mo7225a(aVar, interfaceC1685b), this.f8842d, this.f8850l, this.f8851m);
        this.f8845g.add(c1635d);
        return c1635d;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f, com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    /* JADX INFO: renamed from: a */
    public final void mo7227a() {
        super.mo7227a();
        this.f8849k = null;
        this.f8848j = null;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final void mo7228a(InterfaceC1649r interfaceC1649r) {
        C1711a.m8012b(this.f8845g.remove(interfaceC1649r));
        this.f8839a.mo7228a(((C1635d) interfaceC1649r).f8830a);
        if (!this.f8845g.isEmpty() || this.f8843e) {
            return;
        }
        m7367a(this.f8848j.f9004b);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f, com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    /* JADX INFO: renamed from: a */
    public final void mo7229a(InterfaceC1610h interfaceC1610h, boolean z) {
        super.mo7229a(interfaceC1610h, z);
        m7374a((Object) null, this.f8839a);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7230a(Void r1, InterfaceC1650s interfaceC1650s, AbstractC1499ae abstractC1499ae, @Nullable Object obj) {
        if (this.f8849k == null) {
            this.f8847i = obj;
            m7367a(abstractC1499ae);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f, com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: b */
    public final void mo7286b() throws b {
        b bVar = this.f8849k;
        if (bVar != null) {
            throw bVar;
        }
        super.mo7286b();
    }
}
