package com.p188b.p189a;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.b.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2551e {

    /* JADX INFO: renamed from: a */
    public static final C2551e f15610a;

    /* JADX INFO: renamed from: b */
    public static final C2551e f15611b;

    /* JADX INFO: renamed from: c */
    public String f15612c;

    /* JADX INFO: renamed from: d */
    private final boolean f15613d;

    /* JADX INFO: renamed from: e */
    private final boolean f15614e;

    /* JADX INFO: renamed from: f */
    private final int f15615f;

    /* JADX INFO: renamed from: g */
    private final int f15616g;

    /* JADX INFO: renamed from: h */
    private final boolean f15617h;

    /* JADX INFO: renamed from: i */
    private final boolean f15618i;

    /* JADX INFO: renamed from: j */
    private final boolean f15619j;

    /* JADX INFO: renamed from: k */
    private final int f15620k;

    /* JADX INFO: renamed from: l */
    private final int f15621l;

    /* JADX INFO: renamed from: m */
    private final boolean f15622m;

    /* JADX INFO: renamed from: n */
    private final boolean f15623n;

    static {
        C2552f c2552f = new C2552f();
        c2552f.f15624a = true;
        f15610a = c2552f.m12927a();
        C2552f c2552f2 = new C2552f();
        c2552f2.f15629f = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        c2552f2.f15627d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        f15611b = c2552f2.m12927a();
    }

    public C2551e(C2552f c2552f) {
        this.f15613d = c2552f.f15624a;
        this.f15614e = c2552f.f15625b;
        this.f15615f = c2552f.f15626c;
        this.f15616g = -1;
        this.f15617h = false;
        this.f15618i = false;
        this.f15619j = false;
        this.f15620k = c2552f.f15627d;
        this.f15621l = c2552f.f15628e;
        this.f15622m = c2552f.f15629f;
        this.f15623n = c2552f.f15630g;
    }

    private C2551e(boolean z, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, int i4, boolean z7, boolean z8, String str) {
        this.f15613d = z;
        this.f15614e = z3;
        this.f15615f = i;
        this.f15616g = i2;
        this.f15617h = z4;
        this.f15618i = z5;
        this.f15619j = z6;
        this.f15620k = i3;
        this.f15621l = i4;
        this.f15622m = z7;
        this.f15623n = z8;
        this.f15612c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.p188b.p189a.C2551e m12917a(com.p188b.p189a.C2524aa r21) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.C2551e.m12917a(com.b.a.aa):com.b.a.e");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12918a() {
        return this.f15613d;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12919b() {
        return this.f15614e;
    }

    /* JADX INFO: renamed from: c */
    public final int m12920c() {
        return this.f15615f;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12921d() {
        return this.f15617h;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12922e() {
        return this.f15618i;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12923f() {
        return this.f15619j;
    }

    /* JADX INFO: renamed from: g */
    public final int m12924g() {
        return this.f15620k;
    }

    /* JADX INFO: renamed from: h */
    public final int m12925h() {
        return this.f15621l;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m12926i() {
        return this.f15622m;
    }

    public final String toString() {
        String string;
        String str = this.f15612c;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f15613d) {
            sb.append("no-cache, ");
        }
        if (this.f15614e) {
            sb.append("no-store, ");
        }
        if (this.f15615f != -1) {
            sb.append("max-age=");
            sb.append(this.f15615f);
            sb.append(", ");
        }
        if (this.f15616g != -1) {
            sb.append("s-maxage=");
            sb.append(this.f15616g);
            sb.append(", ");
        }
        if (this.f15617h) {
            sb.append("private, ");
        }
        if (this.f15618i) {
            sb.append("public, ");
        }
        if (this.f15619j) {
            sb.append("must-revalidate, ");
        }
        if (this.f15620k != -1) {
            sb.append("max-stale=");
            sb.append(this.f15620k);
            sb.append(", ");
        }
        if (this.f15621l != -1) {
            sb.append("min-fresh=");
            sb.append(this.f15621l);
            sb.append(", ");
        }
        if (this.f15622m) {
            sb.append("only-if-cached, ");
        }
        if (this.f15623n) {
            sb.append("no-transform, ");
        }
        if (sb.length() == 0) {
            string = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            string = sb.toString();
        }
        this.f15612c = string;
        return string;
    }
}
