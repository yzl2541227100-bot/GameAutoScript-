package p285z2;

import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: z2.es */
/* JADX INFO: loaded from: classes2.dex */
public final class C3850es {
    private final int OooO;
    private final C3772co OooO00o;
    private final C3807dm OooO0O0;
    private final C3807dm OooO0OO;
    private final C3807dm OooO0Oo;
    private final int OooO0o;
    private final C3807dm OooO0o0;
    private final int OooO0oO;
    private final int OooO0oo;

    public C3850es(C3772co c3772co, C3807dm c3807dm, C3807dm c3807dm2, C3807dm c3807dm3, C3807dm c3807dm4) throws NotFoundException {
        boolean z = c3807dm == null || c3807dm2 == null;
        boolean z3 = c3807dm3 == null || c3807dm4 == null;
        if (z && z3) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z) {
            c3807dm = new C3807dm(0.0f, c3807dm3.OooO0Oo());
            c3807dm2 = new C3807dm(0.0f, c3807dm4.OooO0Oo());
        } else if (z3) {
            c3807dm3 = new C3807dm(c3772co.OooOOO0() - 1, c3807dm.OooO0Oo());
            c3807dm4 = new C3807dm(c3772co.OooOOO0() - 1, c3807dm2.OooO0Oo());
        }
        this.OooO00o = c3772co;
        this.OooO0O0 = c3807dm;
        this.OooO0OO = c3807dm2;
        this.OooO0Oo = c3807dm3;
        this.OooO0o0 = c3807dm4;
        this.OooO0o = (int) Math.min(c3807dm.OooO0OO(), c3807dm2.OooO0OO());
        this.OooO0oO = (int) Math.max(c3807dm3.OooO0OO(), c3807dm4.OooO0OO());
        this.OooO0oo = (int) Math.min(c3807dm.OooO0Oo(), c3807dm3.OooO0Oo());
        this.OooO = (int) Math.max(c3807dm2.OooO0Oo(), c3807dm4.OooO0Oo());
    }

    public C3850es(C3850es c3850es) {
        this.OooO00o = c3850es.OooO00o;
        this.OooO0O0 = c3850es.OooO0oo();
        this.OooO0OO = c3850es.OooO0O0();
        this.OooO0Oo = c3850es.OooO();
        this.OooO0o0 = c3850es.OooO0OO();
        this.OooO0o = c3850es.OooO0o();
        this.OooO0oO = c3850es.OooO0Oo();
        this.OooO0oo = c3850es.OooO0oO();
        this.OooO = c3850es.OooO0o0();
    }

    public static C3850es OooOO0(C3850es c3850es, C3850es c3850es2) throws NotFoundException {
        return c3850es == null ? c3850es2 : c3850es2 == null ? c3850es : new C3850es(c3850es.OooO00o, c3850es.OooO0O0, c3850es.OooO0OO, c3850es2.OooO0Oo, c3850es2.OooO0o0);
    }

    public final C3807dm OooO() {
        return this.OooO0Oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p285z2.C3850es OooO00o(int r13, int r14, boolean r15) throws com.google.zxing.NotFoundException {
        /*
            r12 = this;
            z2.dm r0 = r12.OooO0O0
            z2.dm r1 = r12.OooO0OO
            z2.dm r2 = r12.OooO0Oo
            z2.dm r3 = r12.OooO0o0
            if (r13 <= 0) goto L29
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.OooO0Oo()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            z2.dm r13 = new z2.dm
            float r4 = r4.OooO0OO()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L26
            r8 = r13
            goto L2a
        L26:
            r10 = r13
            r8 = r0
            goto L2b
        L29:
            r8 = r0
        L2a:
            r10 = r2
        L2b:
            if (r14 <= 0) goto L5b
            if (r15 == 0) goto L32
            z2.dm r13 = r12.OooO0OO
            goto L34
        L32:
            z2.dm r13 = r12.OooO0o0
        L34:
            float r0 = r13.OooO0Oo()
            int r0 = (int) r0
            int r0 = r0 + r14
            z2.co r14 = r12.OooO00o
            int r14 = r14.OooO0oo()
            if (r0 < r14) goto L4a
            z2.co r14 = r12.OooO00o
            int r14 = r14.OooO0oo()
            int r0 = r14 + (-1)
        L4a:
            z2.dm r14 = new z2.dm
            float r13 = r13.OooO0OO()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L58
            r9 = r14
            goto L5c
        L58:
            r11 = r14
            r9 = r1
            goto L5d
        L5b:
            r9 = r1
        L5c:
            r11 = r3
        L5d:
            z2.es r13 = new z2.es
            z2.co r7 = r12.OooO00o
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3850es.OooO00o(int, int, boolean):z2.es");
    }

    public final C3807dm OooO0O0() {
        return this.OooO0OO;
    }

    public final C3807dm OooO0OO() {
        return this.OooO0o0;
    }

    public final int OooO0Oo() {
        return this.OooO0oO;
    }

    public final int OooO0o() {
        return this.OooO0o;
    }

    public final int OooO0o0() {
        return this.OooO;
    }

    public final int OooO0oO() {
        return this.OooO0oo;
    }

    public final C3807dm OooO0oo() {
        return this.OooO0O0;
    }
}
