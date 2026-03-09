package com.p188b.p189a;

import java.io.Closeable;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.b.a.as */
/* JADX INFO: loaded from: classes.dex */
public final class C2542as implements Closeable {

    /* JADX INFO: renamed from: a */
    public final C2538ao f15569a;

    /* JADX INFO: renamed from: b */
    public final EnumC2535al f15570b;

    /* JADX INFO: renamed from: c */
    public final int f15571c;

    /* JADX INFO: renamed from: d */
    public final String f15572d;

    /* JADX INFO: renamed from: e */
    public final C2572z f15573e;

    /* JADX INFO: renamed from: f */
    public final C2524aa f15574f;

    /* JADX INFO: renamed from: g */
    public final AbstractC2544au f15575g;

    /* JADX INFO: renamed from: h */
    public final C2542as f15576h;

    /* JADX INFO: renamed from: i */
    public final C2542as f15577i;

    /* JADX INFO: renamed from: j */
    public final C2542as f15578j;

    /* JADX INFO: renamed from: k */
    public final long f15579k;

    /* JADX INFO: renamed from: l */
    public final long f15580l;

    /* JADX INFO: renamed from: m */
    private volatile C2551e f15581m;

    public C2542as(C2543at c2543at) {
        this.f15569a = c2543at.f15582a;
        this.f15570b = c2543at.f15583b;
        this.f15571c = c2543at.f15584c;
        this.f15572d = c2543at.f15585d;
        this.f15573e = c2543at.f15586e;
        this.f15574f = c2543at.f15587f.m12793a();
        this.f15575g = c2543at.f15588g;
        this.f15576h = c2543at.f15589h;
        this.f15577i = c2543at.f15590i;
        this.f15578j = c2543at.f15591j;
        this.f15579k = c2543at.f15592k;
        this.f15580l = c2543at.f15593l;
    }

    /* JADX INFO: renamed from: a */
    public final C2538ao m12884a() {
        return this.f15569a;
    }

    /* JADX INFO: renamed from: a */
    public final String m12885a(String str) {
        String strM12789a = this.f15574f.m12789a(str);
        if (strM12789a != null) {
            return strM12789a;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final int m12886b() {
        return this.f15571c;
    }

    /* JADX INFO: renamed from: c */
    public final C2572z m12887c() {
        return this.f15573e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15575g.close();
    }

    /* JADX INFO: renamed from: d */
    public final C2524aa m12888d() {
        return this.f15574f;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC2544au m12889e() {
        return this.f15575g;
    }

    /* JADX INFO: renamed from: f */
    public final C2543at m12890f() {
        return new C2543at(this);
    }

    /* JADX INFO: renamed from: g */
    public final C2551e m12891g() {
        C2551e c2551e = this.f15581m;
        if (c2551e != null) {
            return c2551e;
        }
        C2551e c2551eM12917a = C2551e.m12917a(this.f15574f);
        this.f15581m = c2551eM12917a;
        return c2551eM12917a;
    }

    /* JADX INFO: renamed from: h */
    public final long m12892h() {
        return this.f15579k;
    }

    /* JADX INFO: renamed from: i */
    public final long m12893i() {
        return this.f15580l;
    }

    public final String toString() {
        return "Response{protocol=" + this.f15570b + ", code=" + this.f15571c + ", message=" + this.f15572d + ", url=" + this.f15569a.f15554a + MessageFormatter.DELIM_STOP;
    }
}
