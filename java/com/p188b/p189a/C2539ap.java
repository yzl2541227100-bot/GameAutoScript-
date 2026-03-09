package com.p188b.p189a;

import com.p188b.p189a.p190a.p193c.C2453g;
import java.util.Objects;

/* JADX INFO: renamed from: com.b.a.ap */
/* JADX INFO: loaded from: classes.dex */
public final class C2539ap {

    /* JADX INFO: renamed from: a */
    public C2526ac f15560a;

    /* JADX INFO: renamed from: b */
    public String f15561b;

    /* JADX INFO: renamed from: c */
    public C2525ab f15562c;

    /* JADX INFO: renamed from: d */
    public AbstractC2540aq f15563d;

    /* JADX INFO: renamed from: e */
    public Object f15564e;

    public C2539ap() {
        this.f15561b = "GET";
        this.f15562c = new C2525ab();
    }

    public C2539ap(C2538ao c2538ao) {
        this.f15560a = c2538ao.f15554a;
        this.f15561b = c2538ao.f15555b;
        this.f15563d = c2538ao.f15557d;
        this.f15564e = c2538ao.f15558e;
        this.f15562c = c2538ao.f15556c.m12790b();
    }

    /* JADX INFO: renamed from: a */
    public final C2538ao m12872a() {
        if (this.f15560a != null) {
            return new C2538ao(this);
        }
        throw new IllegalStateException("url == null");
    }

    /* JADX INFO: renamed from: a */
    public final C2539ap m12873a(C2524aa c2524aa) {
        this.f15562c = c2524aa.m12790b();
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2539ap m12874a(C2526ac c2526ac) {
        Objects.requireNonNull(c2526ac, "url == null");
        this.f15560a = c2526ac;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2539ap m12875a(AbstractC2540aq abstractC2540aq) {
        return m12877a("POST", abstractC2540aq);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.p188b.p189a.C2539ap m12876a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "url == null"
            java.util.Objects.requireNonNull(r8, r0)
            r2 = 1
            r3 = 0
            r5 = 0
            r6 = 3
            java.lang.String r4 = "ws:"
            r1 = r8
            boolean r0 = r1.regionMatches(r2, r3, r4, r5, r6)
            if (r0 == 0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "http:"
            r0.<init>(r1)
            r1 = 3
        L1a:
            java.lang.String r8 = r8.substring(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            goto L3c
        L26:
            r1 = 1
            r2 = 0
            r4 = 0
            r5 = 4
            java.lang.String r3 = "wss:"
            r0 = r8
            boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https:"
            r0.<init>(r1)
            r1 = 4
            goto L1a
        L3c:
            com.b.a.ac r0 = com.p188b.p189a.C2526ac.m12809e(r8)
            if (r0 == 0) goto L47
            com.b.a.ap r8 = r7.m12874a(r0)
            return r8
        L47:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "unexpected url: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.C2539ap.m12876a(java.lang.String):com.b.a.ap");
    }

    /* JADX INFO: renamed from: a */
    public final C2539ap m12877a(String str, AbstractC2540aq abstractC2540aq) {
        Objects.requireNonNull(str, "method == null");
        if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        }
        if (abstractC2540aq != null && !C2453g.m12611b(str)) {
            throw new IllegalArgumentException("method " + str + " must not have a request body.");
        }
        if (abstractC2540aq != null || !C2453g.m12610a(str)) {
            this.f15561b = str;
            this.f15563d = abstractC2540aq;
            return this;
        }
        throw new IllegalArgumentException("method " + str + " must have a request body.");
    }

    /* JADX INFO: renamed from: a */
    public final C2539ap m12878a(String str, String str2) {
        this.f15562c.m12797c(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C2539ap m12879b(String str) {
        this.f15562c.m12794a(str);
        return this;
    }
}
