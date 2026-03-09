package com.p188b.p189a;

/* JADX INFO: renamed from: com.b.a.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2563q {

    /* JADX INFO: renamed from: a */
    public boolean f15770a;

    /* JADX INFO: renamed from: b */
    public String[] f15771b;

    /* JADX INFO: renamed from: c */
    public String[] f15772c;

    /* JADX INFO: renamed from: d */
    public boolean f15773d;

    public C2563q(C2562p c2562p) {
        this.f15770a = c2562p.f15766d;
        this.f15771b = c2562p.f15768f;
        this.f15772c = c2562p.f15769g;
        this.f15773d = c2562p.f15767e;
    }

    public C2563q(boolean z) {
        this.f15770a = z;
    }

    /* JADX INFO: renamed from: a */
    public final C2563q m12945a() {
        if (!this.f15770a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        this.f15773d = true;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2563q m12946a(EnumC2547ax... enumC2547axArr) {
        if (!this.f15770a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[enumC2547axArr.length];
        for (int i = 0; i < enumC2547axArr.length; i++) {
            strArr[i] = enumC2547axArr[i].f15606f;
        }
        return m12949b(strArr);
    }

    /* JADX INFO: renamed from: a */
    public final C2563q m12947a(String... strArr) {
        if (!this.f15770a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f15771b = (String[]) strArr.clone();
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C2562p m12948b() {
        return new C2562p(this);
    }

    /* JADX INFO: renamed from: b */
    public final C2563q m12949b(String... strArr) {
        if (!this.f15770a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f15772c = (String[]) strArr.clone();
        return this;
    }
}
