package com.goldcoast.sdk.p204a;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.goldcoast.sdk.a.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C2727b extends AbstractC2728c<C2727b> {

    /* JADX INFO: renamed from: a */
    private String f15935a;

    /* JADX INFO: renamed from: b */
    private String f15936b;

    /* JADX INFO: renamed from: c */
    private C2726a f15937c;

    /* JADX INFO: renamed from: d */
    private C2730e f15938d;

    /* JADX INFO: renamed from: e */
    private String f15939e;

    /* JADX INFO: renamed from: f */
    private String f15940f;

    /* JADX INFO: renamed from: g */
    private String f15941g;

    /* JADX INFO: renamed from: h */
    private C2731f f15942h;

    /* JADX INFO: renamed from: i */
    private String f15943i;

    /* JADX INFO: renamed from: j */
    private String f15944j;

    /* JADX INFO: renamed from: a */
    public final JSONObject m13107a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cpuinfo", this.f15937c.m13106a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            jSONObject.put("prop", this.f15938d.m13127a());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        try {
            jSONObject.put("propInfo", this.f15942h.m13132b());
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        try {
            jSONObject.put("MemTotal", this.f15935a);
            jSONObject.put("linuxversion", this.f15936b);
            jSONObject.put("imei", this.f15939e);
            jSONObject.put("macAddr", this.f15940f);
            jSONObject.put("androidId", this.f15941g);
            jSONObject.put("currentTime", this.f15943i);
            jSONObject.put("cpuType", this.f15944j);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final void m13108a(C2726a c2726a) {
        this.f15937c = c2726a;
    }

    /* JADX INFO: renamed from: a */
    public final void m13109a(C2730e c2730e) {
        this.f15938d = c2730e;
    }

    /* JADX INFO: renamed from: a */
    public final void m13110a(C2731f c2731f) {
        this.f15942h = c2731f;
    }

    /* JADX INFO: renamed from: a */
    public final void m13111a(String str) {
        this.f15935a = str;
    }

    /* JADX INFO: renamed from: b */
    public final C2730e m13112b() {
        return this.f15938d;
    }

    /* JADX INFO: renamed from: b */
    public final void m13113b(String str) {
        this.f15936b = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m13114c(String str) {
        this.f15939e = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m13115d(String str) {
        this.f15940f = str;
    }

    /* JADX INFO: renamed from: e */
    public final void m13116e(String str) {
        this.f15941g = str;
    }

    /* JADX INFO: renamed from: f */
    public final void m13117f(String str) {
        this.f15943i = str;
    }

    /* JADX INFO: renamed from: g */
    public final void m13118g(String str) {
        this.f15944j = str;
    }
}
