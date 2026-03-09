package com.tramini.plugin.p261a.p265d;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.d.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3334b {

    /* JADX INFO: renamed from: a */
    public static final int f18104a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f18105b = 2;

    /* JADX INFO: renamed from: c */
    public String f18106c;

    /* JADX INFO: renamed from: d */
    public int f18107d;

    /* JADX INFO: renamed from: e */
    public String f18108e;

    /* JADX INFO: renamed from: a */
    public final JSONObject m15179a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("att_pl", this.f18107d);
            jSONObject.put("att_ver", this.f18106c);
            jSONObject.put("att_inf", this.f18108e);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
