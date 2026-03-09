package com.anythink.expressad.foundation.p120g.p126f.p129c;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.c.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1831c {

    /* JADX INFO: renamed from: a */
    private final String f11315a;

    /* JADX INFO: renamed from: b */
    private final String f11316b;

    public C1831c(String str, String str2) {
        this.f11315a = str;
        this.f11316b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m9517a() {
        return this.f11315a;
    }

    /* JADX INFO: renamed from: b */
    public final String m9518b() {
        return this.f11316b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1831c.class == obj.getClass()) {
            C1831c c1831c = (C1831c) obj;
            if (TextUtils.equals(this.f11315a, c1831c.f11315a) && TextUtils.equals(this.f11316b, c1831c.f11316b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11315a.hashCode() * 31) + this.f11316b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f11315a + ",value=" + this.f11316b + "]";
    }
}
