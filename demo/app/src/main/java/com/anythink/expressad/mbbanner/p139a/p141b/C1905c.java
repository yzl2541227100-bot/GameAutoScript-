package com.anythink.expressad.mbbanner.p139a.p141b;

import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p138h.C1877k;

/* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1905c {

    /* JADX INFO: renamed from: a */
    public static final String f11744a = "2000067";

    /* JADX INFO: renamed from: b */
    public static final String f11745b = "2000068";

    /* JADX INFO: renamed from: c */
    public static final String f11746c = "2000069";

    /* JADX INFO: renamed from: d */
    private String f11747d;

    /* JADX INFO: renamed from: e */
    private String f11748e;

    /* JADX INFO: renamed from: f */
    private String f11749f;

    /* JADX INFO: renamed from: g */
    private String f11750g;

    /* JADX INFO: renamed from: h */
    private String f11751h;

    /* JADX INFO: renamed from: i */
    private String f11752i;

    /* JADX INFO: renamed from: j */
    private String f11753j;

    /* JADX INFO: renamed from: k */
    private String f11754k;

    /* JADX INFO: renamed from: l */
    private int f11755l;

    /* JADX INFO: renamed from: m */
    private boolean f11756m;

    private C1905c() {
    }

    /* JADX INFO: renamed from: a */
    private static C1905c m9915a() {
        return new C1905c();
    }

    /* JADX INFO: renamed from: a */
    private C1905c m9916a(int i) {
        this.f11755l = i;
        return this;
    }

    /* JADX INFO: renamed from: a */
    private C1905c m9917a(String str) {
        this.f11747d = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    private C1905c m9918a(boolean z) {
        this.f11756m = z;
        return this;
    }

    /* JADX INFO: renamed from: b */
    private C1905c m9919b(String str) {
        this.f11748e = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    private String m9920b() {
        return this.f11747d;
    }

    /* JADX INFO: renamed from: c */
    private C1905c m9921c(String str) {
        this.f11749f = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    private String m9922c() {
        return this.f11748e;
    }

    /* JADX INFO: renamed from: d */
    private C1905c m9923d(String str) {
        this.f11750g = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    private String m9924d() {
        return this.f11749f;
    }

    /* JADX INFO: renamed from: e */
    private C1905c m9925e(String str) {
        this.f11751h = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    private String m9926e() {
        return this.f11750g;
    }

    /* JADX INFO: renamed from: f */
    private C1905c m9927f(String str) {
        this.f11752i = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    private String m9928f() {
        return this.f11751h;
    }

    /* JADX INFO: renamed from: g */
    private C1905c m9929g(String str) {
        this.f11753j = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    private String m9930g() {
        return this.f11752i;
    }

    /* JADX INFO: renamed from: h */
    private C1905c m9931h(String str) {
        this.f11754k = str;
        return this;
    }

    /* JADX INFO: renamed from: h */
    private String m9932h() {
        return this.f11753j;
    }

    /* JADX INFO: renamed from: i */
    private String m9933i() {
        return this.f11754k;
    }

    /* JADX INFO: renamed from: j */
    private int m9934j() {
        return this.f11755l;
    }

    /* JADX INFO: renamed from: k */
    private String m9935k() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f11748e)) {
            sb.append("unit_id=");
            sb.append(this.f11748e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f11750g)) {
            sb.append("cid=");
            sb.append(this.f11750g);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f11751h)) {
            sb.append("rid=");
            sb.append(this.f11751h);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f11752i)) {
            sb.append("rid_n=");
            sb.append(this.f11752i);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f11753j)) {
            sb.append("creative_id=");
            sb.append(this.f11753j);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f11754k)) {
            sb.append("reason=");
            sb.append(this.f11754k);
            sb.append("&");
        }
        if (this.f11755l != 0) {
            sb.append("result=");
            sb.append(this.f11755l);
            sb.append("&");
        }
        if (this.f11756m) {
            sb.append("hb=1&");
        }
        sb.append("network_type=");
        C1175n.m2059a().m2148f();
        sb.append(C1877k.m9690a());
        sb.append("&");
        if (!TextUtils.isEmpty(this.f11747d)) {
            sb.append("key=");
            sb.append(this.f11747d);
        }
        return sb.toString();
    }
}
