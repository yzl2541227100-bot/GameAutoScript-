package com.anythink.core.common.p055f;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.f.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1239d {

    /* JADX INFO: renamed from: a */
    public int f4109a;

    /* JADX INFO: renamed from: b */
    public long f4110b;

    /* JADX INFO: renamed from: a */
    public final void m2970a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4109a = jSONObject.optInt("number");
            this.f4110b = jSONObject.optLong("loadTime");
        } catch (Exception unused) {
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("number", this.f4109a);
            jSONObject.put("loadTime", this.f4110b);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }
}
