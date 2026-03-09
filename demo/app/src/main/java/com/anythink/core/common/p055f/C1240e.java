package com.anythink.core.common.p055f;

/* JADX INFO: renamed from: com.anythink.core.common.f.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1240e {

    /* JADX INFO: renamed from: a */
    private String f4111a;

    /* JADX INFO: renamed from: b */
    private String f4112b;

    /* JADX INFO: renamed from: c */
    private int f4113c;

    public C1240e(String str, String str2, int i) {
        this.f4111a = str;
        this.f4112b = str2;
        this.f4113c = i;
    }

    /* JADX INFO: renamed from: b */
    private String m2971b() {
        return this.f4111a;
    }

    /* JADX INFO: renamed from: c */
    private int m2972c() {
        return this.f4113c;
    }

    /* JADX INFO: renamed from: a */
    public final String m2973a() {
        return this.f4112b;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2974a(C1229av c1229av) {
        if (c1229av != null) {
            int i = c1229av.f3964a;
            return i != 2 ? i == 3 && c1229av.m2784d() == this.f4113c : c1229av.m2842u().equals(this.f4111a);
        }
        return false;
    }
}
