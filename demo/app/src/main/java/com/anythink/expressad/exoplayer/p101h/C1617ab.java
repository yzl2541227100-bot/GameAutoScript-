package com.anythink.expressad.exoplayer.p101h;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C1617ab extends AbstractC1499ae {

    /* JADX INFO: renamed from: b */
    private static final Object f8698b = new Object();

    /* JADX INFO: renamed from: c */
    private final long f8699c;

    /* JADX INFO: renamed from: d */
    private final long f8700d;

    /* JADX INFO: renamed from: e */
    private final long f8701e;

    /* JADX INFO: renamed from: f */
    private final long f8702f;

    /* JADX INFO: renamed from: g */
    private final long f8703g;

    /* JADX INFO: renamed from: h */
    private final long f8704h;

    /* JADX INFO: renamed from: i */
    private final boolean f8705i;

    /* JADX INFO: renamed from: j */
    private final boolean f8706j;

    /* JADX INFO: renamed from: k */
    @Nullable
    private final Object f8707k;

    private C1617ab(long j, long j2, boolean z, boolean z3, @Nullable Object obj) {
        this.f8699c = C1500b.f7455b;
        this.f8700d = C1500b.f7455b;
        this.f8701e = j;
        this.f8702f = j2;
        this.f8703g = 0L;
        this.f8704h = 0L;
        this.f8705i = z;
        this.f8706j = z3;
        this.f8707k = obj;
    }

    private C1617ab(long j, long j2, boolean z, boolean z3, @Nullable Object obj, byte b) {
        this(j, j2, z, z3, obj);
    }

    private C1617ab(long j, boolean z, boolean z3) {
        this(j, z, z3, null);
    }

    public C1617ab(long j, boolean z, boolean z3, @Nullable Object obj) {
        this(j, j, z, z3, obj, (byte) 0);
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
    /* JADX INFO: renamed from: a */
    public final int mo6358a(Object obj) {
        return f8698b.equals(obj) ? 0 : -1;
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
    /* JADX INFO: renamed from: a */
    public final AbstractC1499ae.a mo6362a(int i, AbstractC1499ae.a aVar, boolean z) {
        C1711a.m8004a(i, 1);
        return aVar.m6378a(null, z ? f8698b : null, this.f8701e, -this.f8703g);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[PHI: r1
  0x002f: PHI (r1v4 long) = (r1v3 long), (r1v3 long), (r1v6 long) binds: [B:7:0x0018, B:9:0x001e, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.anythink.expressad.exoplayer.AbstractC1499ae.b mo6364a(int r17, com.anythink.expressad.exoplayer.AbstractC1499ae.b r18, boolean r19, long r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            r2 = r17
            com.anythink.expressad.exoplayer.p107k.C1711a.m8004a(r2, r1)
            if (r19 == 0) goto Ld
            java.lang.Object r1 = r0.f8707k
            goto Le
        Ld:
            r1 = 0
        Le:
            r3 = r1
            long r1 = r0.f8704h
            boolean r9 = r0.f8706j
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 == 0) goto L2f
            r6 = 0
            int r8 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r8 == 0) goto L2f
            long r6 = r0.f8702f
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L28
        L26:
            r10 = r4
            goto L30
        L28:
            long r1 = r1 + r20
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 <= 0) goto L2f
            goto L26
        L2f:
            r10 = r1
        L30:
            long r4 = r0.f8699c
            long r6 = r0.f8700d
            boolean r8 = r0.f8705i
            long r12 = r0.f8702f
            long r14 = r0.f8703g
            r2 = r18
            com.anythink.expressad.exoplayer.ae$b r1 = r2.m6394a(r3, r4, r6, r8, r9, r10, r12, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p101h.C1617ab.mo6364a(int, com.anythink.expressad.exoplayer.ae$b, boolean, long):com.anythink.expressad.exoplayer.ae$b");
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
    /* JADX INFO: renamed from: b */
    public final int mo6366b() {
        return 1;
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
    /* JADX INFO: renamed from: c */
    public final int mo6370c() {
        return 1;
    }
}
