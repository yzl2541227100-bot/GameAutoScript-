package com.goldcoast.sdk.p204a;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.goldcoast.sdk.a.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C2732g extends AbstractC2728c<C2732g> {

    /* JADX INFO: renamed from: a */
    private String f15981a;

    /* JADX INFO: renamed from: b */
    private int f15982b;

    /* JADX INFO: renamed from: c */
    private String f15983c;

    /* JADX INFO: renamed from: d */
    private long f15984d;

    /* JADX INFO: renamed from: e */
    private String f15985e;

    /* JADX INFO: renamed from: f */
    private String f15986f;

    /* JADX INFO: renamed from: g */
    private String f15987g;

    /* JADX INFO: renamed from: h */
    private String f15988h;

    /* JADX INFO: renamed from: i */
    private String f15989i;

    /* JADX INFO: renamed from: j */
    private String f15990j;

    /* JADX INFO: renamed from: k */
    private int f15991k;

    /* JADX INFO: renamed from: l */
    private C2731f f15992l;

    /* JADX INFO: renamed from: m */
    private String f15993m;

    /* JADX INFO: renamed from: n */
    private String f15994n;

    /* JADX INFO: renamed from: o */
    private String f15995o;

    /* JADX INFO: renamed from: a */
    public final JSONObject m13133a() {
        C2731f c2731f = this.f15992l;
        JSONObject jSONObjectM13132b = c2731f != null ? c2731f.m13132b() : new JSONObject();
        try {
            jSONObjectM13132b.put("rf_md5", this.f15981a);
            jSONObjectM13132b.put("status", this.f15982b);
            jSONObjectM13132b.put("msg", this.f15983c);
            jSONObjectM13132b.put("runTime", this.f15984d);
            jSONObjectM13132b.put("androidId", this.f15985e);
            jSONObjectM13132b.put("netOperator", this.f15986f);
            jSONObjectM13132b.put("simOperatorName", this.f15987g);
            jSONObjectM13132b.put("displayLanguage", this.f15988h);
            jSONObjectM13132b.put("displayCountry", this.f15989i);
            jSONObjectM13132b.put("token", this.f15990j);
            jSONObjectM13132b.put("category", this.f15991k);
            jSONObjectM13132b.put("sdkV", this.f15993m);
            jSONObjectM13132b.put("package_name", this.f15994n);
            jSONObjectM13132b.put("signature", this.f15995o);
        } catch (JSONException unused) {
        }
        return jSONObjectM13132b;
    }

    /* JADX INFO: renamed from: a */
    public final void m13134a(int i) {
        this.f15982b = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m13135a(long j) {
        this.f15984d = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m13136a(C2731f c2731f) {
        this.f15992l = c2731f;
    }

    /* JADX INFO: renamed from: a */
    public final void m13137a(String str) {
        this.f15981a = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m13138b(int i) {
        this.f15991k = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m13139b(String str) {
        this.f15983c = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m13140c(String str) {
        this.f15985e = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m13141d(String str) {
        this.f15986f = str;
    }

    /* JADX INFO: renamed from: e */
    public final void m13142e(String str) {
        this.f15987g = str;
    }

    /* JADX INFO: renamed from: f */
    public final void m13143f(String str) {
        this.f15988h = str;
    }

    /* JADX INFO: renamed from: g */
    public final void m13144g(String str) {
        this.f15989i = str;
    }

    /* JADX INFO: renamed from: h */
    public final void m13145h(String str) {
        this.f15990j = str;
    }

    /* JADX INFO: renamed from: i */
    public final void m13146i(String str) {
        this.f15993m = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m13147j(String str) {
        this.f15994n = str;
    }

    /* JADX INFO: renamed from: k */
    public final void m13148k(String str) {
        this.f15995o = str;
    }
}
