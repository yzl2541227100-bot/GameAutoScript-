package com.anythink.expressad.videocommon.p179c;

import com.anythink.expressad.videocommon.p181e.C2338b;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2331a {

    /* JADX INFO: renamed from: a */
    private String f14501a;

    /* JADX INFO: renamed from: b */
    private String f14502b;

    private C2331a(String str, String str2) {
        this.f14501a = str;
        this.f14502b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C2331a m11953a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C2331a(jSONObject.optString(C2338b.f14609u), jSONObject.optString(C2338b.f14610v));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m11954a() {
        return this.f14501a;
    }

    /* JADX INFO: renamed from: a */
    private void m11955a(String str) {
        this.f14501a = str;
    }

    /* JADX INFO: renamed from: b */
    private String m11956b() {
        return this.f14502b;
    }

    /* JADX INFO: renamed from: b */
    private void m11957b(String str) {
        this.f14502b = str;
    }
}
