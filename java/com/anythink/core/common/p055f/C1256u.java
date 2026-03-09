package com.anythink.core.common.p055f;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.f.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1256u {

    /* JADX INFO: renamed from: h */
    public static final String f4470h = "business_type";

    /* JADX INFO: renamed from: i */
    public static final int f4471i = 1000;

    /* JADX INFO: renamed from: j */
    public static final int f4472j = 1001;

    /* JADX INFO: renamed from: a */
    public String f4473a;

    /* JADX INFO: renamed from: b */
    public int f4474b;

    /* JADX INFO: renamed from: c */
    public String f4475c;

    /* JADX INFO: renamed from: d */
    public String f4476d;

    /* JADX INFO: renamed from: e */
    public String f4477e;

    /* JADX INFO: renamed from: f */
    public long f4478f;

    /* JADX INFO: renamed from: g */
    public String f4479g;

    /* JADX INFO: renamed from: a */
    public static String m3442a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f4470h, i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: a */
    public final String m3443a() {
        return this.f4476d + "--extra: " + this.f4479g + "--requestType: " + this.f4474b + "--content:" + this.f4477e;
    }
}
