package com.anythink.expressad.p073a.p074a;

import com.anythink.expressad.foundation.p116d.C1781c;
import java.util.HashSet;

/* JADX INFO: renamed from: com.anythink.expressad.a.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1407b {

    /* JADX INFO: renamed from: a */
    public static int f6283a = 0;

    /* JADX INFO: renamed from: b */
    public static int f6284b = 1;

    /* JADX INFO: renamed from: c */
    private String f6285c;

    /* JADX INFO: renamed from: d */
    private int f6286d;

    /* JADX INFO: renamed from: e */
    private HashSet<String> f6287e = new HashSet<>();

    /* JADX INFO: renamed from: f */
    private long f6288f = System.currentTimeMillis();

    /* JADX INFO: renamed from: g */
    private C1781c f6289g;

    /* JADX INFO: renamed from: h */
    private String f6290h;

    /* JADX INFO: renamed from: i */
    private int f6291i;

    /* JADX INFO: renamed from: j */
    private boolean f6292j;

    /* JADX INFO: renamed from: k */
    private boolean f6293k;

    /* JADX INFO: renamed from: l */
    private int f6294l;

    public C1407b(String str, String str2) {
        this.f6285c = str;
        m5237b(str2);
    }

    /* JADX INFO: renamed from: i */
    private String m5229i() {
        return this.f6285c;
    }

    /* JADX INFO: renamed from: j */
    private HashSet<String> m5230j() {
        return this.f6287e;
    }

    /* JADX INFO: renamed from: a */
    public final void m5231a(int i) {
        this.f6294l = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m5232a(C1781c c1781c) {
        this.f6289g = c1781c;
    }

    /* JADX INFO: renamed from: a */
    public final void m5233a(String str) {
        this.f6290h = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m5234a(boolean z) {
        this.f6292j = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5235a() {
        return this.f6292j;
    }

    /* JADX INFO: renamed from: b */
    public final void m5236b(int i) {
        this.f6291i = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m5237b(String str) {
        this.f6286d++;
        this.f6287e.add(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m5238b(boolean z) {
        this.f6293k = z;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5239b() {
        return this.f6293k;
    }

    /* JADX INFO: renamed from: c */
    public final int m5240c() {
        return this.f6294l;
    }

    /* JADX INFO: renamed from: d */
    public final int m5241d() {
        return this.f6291i;
    }

    /* JADX INFO: renamed from: e */
    public final String m5242e() {
        return this.f6290h;
    }

    /* JADX INFO: renamed from: f */
    public final C1781c m5243f() {
        return this.f6289g;
    }

    /* JADX INFO: renamed from: g */
    public final int m5244g() {
        return this.f6286d;
    }

    /* JADX INFO: renamed from: h */
    public final long m5245h() {
        return this.f6288f;
    }
}
