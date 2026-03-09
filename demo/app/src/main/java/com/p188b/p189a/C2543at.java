package com.p188b.p189a;

/* JADX INFO: renamed from: com.b.a.at */
/* JADX INFO: loaded from: classes.dex */
public final class C2543at {

    /* JADX INFO: renamed from: a */
    public C2538ao f15582a;

    /* JADX INFO: renamed from: b */
    public EnumC2535al f15583b;

    /* JADX INFO: renamed from: c */
    public int f15584c;

    /* JADX INFO: renamed from: d */
    public String f15585d;

    /* JADX INFO: renamed from: e */
    public C2572z f15586e;

    /* JADX INFO: renamed from: f */
    public C2525ab f15587f;

    /* JADX INFO: renamed from: g */
    public AbstractC2544au f15588g;

    /* JADX INFO: renamed from: h */
    public C2542as f15589h;

    /* JADX INFO: renamed from: i */
    public C2542as f15590i;

    /* JADX INFO: renamed from: j */
    public C2542as f15591j;

    /* JADX INFO: renamed from: k */
    public long f15592k;

    /* JADX INFO: renamed from: l */
    public long f15593l;

    public C2543at() {
        this.f15584c = -1;
        this.f15587f = new C2525ab();
    }

    public C2543at(C2542as c2542as) {
        this.f15584c = -1;
        this.f15582a = c2542as.f15569a;
        this.f15583b = c2542as.f15570b;
        this.f15584c = c2542as.f15571c;
        this.f15585d = c2542as.f15572d;
        this.f15586e = c2542as.f15573e;
        this.f15587f = c2542as.f15574f.m12790b();
        this.f15588g = c2542as.f15575g;
        this.f15589h = c2542as.f15576h;
        this.f15590i = c2542as.f15577i;
        this.f15591j = c2542as.f15578j;
        this.f15592k = c2542as.f15579k;
        this.f15593l = c2542as.f15580l;
    }

    /* JADX INFO: renamed from: a */
    private static void m12894a(String str, C2542as c2542as) {
        if (c2542as.f15575g != null) {
            throw new IllegalArgumentException(str + ".body != null");
        }
        if (c2542as.f15576h != null) {
            throw new IllegalArgumentException(str + ".networkResponse != null");
        }
        if (c2542as.f15577i != null) {
            throw new IllegalArgumentException(str + ".cacheResponse != null");
        }
        if (c2542as.f15578j == null) {
            return;
        }
        throw new IllegalArgumentException(str + ".priorResponse != null");
    }

    /* JADX INFO: renamed from: a */
    public final C2542as m12895a() {
        if (this.f15582a == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.f15583b == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.f15584c >= 0) {
            return new C2542as(this);
        }
        throw new IllegalStateException("code < 0: " + this.f15584c);
    }

    /* JADX INFO: renamed from: a */
    public final C2543at m12896a(int i) {
        this.f15584c = i;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2543at m12897a(long j) {
        this.f15592k = j;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2543at m12898a(C2524aa c2524aa) {
        this.f15587f = c2524aa.m12790b();
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2543at m12899a(EnumC2535al enumC2535al) {
        this.f15583b = enumC2535al;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2543at m12900a(C2538ao c2538ao) {
        this.f15582a = c2538ao;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2543at m12901a(C2542as c2542as) {
        if (c2542as != null) {
            m12894a("networkResponse", c2542as);
        }
        this.f15589h = c2542as;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2543at m12902a(AbstractC2544au abstractC2544au) {
        this.f15588g = abstractC2544au;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2543at m12903a(C2572z c2572z) {
        this.f15586e = c2572z;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2543at m12904a(String str) {
        this.f15585d = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2543at m12905a(String str, String str2) {
        this.f15587f.m12795a(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C2543at m12906b(long j) {
        this.f15593l = j;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C2543at m12907b(C2542as c2542as) {
        if (c2542as != null) {
            m12894a("cacheResponse", c2542as);
        }
        this.f15590i = c2542as;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final C2543at m12908c(C2542as c2542as) {
        if (c2542as != null && c2542as.f15575g != null) {
            throw new IllegalArgumentException("priorResponse.body != null");
        }
        this.f15591j = c2542as;
        return this;
    }
}
