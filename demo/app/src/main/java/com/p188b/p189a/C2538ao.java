package com.p188b.p189a;

import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.b.a.ao */
/* JADX INFO: loaded from: classes.dex */
public final class C2538ao {

    /* JADX INFO: renamed from: a */
    public final C2526ac f15554a;

    /* JADX INFO: renamed from: b */
    public final String f15555b;

    /* JADX INFO: renamed from: c */
    public final C2524aa f15556c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2540aq f15557d;

    /* JADX INFO: renamed from: e */
    public final Object f15558e;

    /* JADX INFO: renamed from: f */
    private volatile C2551e f15559f;

    public C2538ao(C2539ap c2539ap) {
        this.f15554a = c2539ap.f15560a;
        this.f15555b = c2539ap.f15561b;
        this.f15556c = c2539ap.f15562c.m12793a();
        this.f15557d = c2539ap.f15563d;
        Object obj = c2539ap.f15564e;
        this.f15558e = obj == null ? this : obj;
    }

    /* JADX INFO: renamed from: a */
    public final C2526ac m12864a() {
        return this.f15554a;
    }

    /* JADX INFO: renamed from: a */
    public final String m12865a(String str) {
        return this.f15556c.m12789a(str);
    }

    /* JADX INFO: renamed from: b */
    public final String m12866b() {
        return this.f15555b;
    }

    /* JADX INFO: renamed from: c */
    public final C2524aa m12867c() {
        return this.f15556c;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC2540aq m12868d() {
        return this.f15557d;
    }

    /* JADX INFO: renamed from: e */
    public final C2539ap m12869e() {
        return new C2539ap(this);
    }

    /* JADX INFO: renamed from: f */
    public final C2551e m12870f() {
        C2551e c2551e = this.f15559f;
        if (c2551e != null) {
            return c2551e;
        }
        C2551e c2551eM12917a = C2551e.m12917a(this.f15556c);
        this.f15559f = c2551eM12917a;
        return c2551eM12917a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m12871g() {
        return this.f15554a.m12813c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f15555b);
        sb.append(", url=");
        sb.append(this.f15554a);
        sb.append(", tag=");
        Object obj = this.f15558e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append(MessageFormatter.DELIM_STOP);
        return sb.toString();
    }
}
