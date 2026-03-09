package com.anythink.expressad.videocommon.p179c;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.c.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2332b {

    /* JADX INFO: renamed from: a */
    private int f14503a;

    /* JADX INFO: renamed from: b */
    private int f14504b;

    /* JADX INFO: renamed from: c */
    private C2331a f14505c;

    public C2332b(int i, int i2, C2331a c2331a) {
        this.f14503a = i;
        this.f14504b = i2;
        this.f14505c = c2331a;
    }

    /* JADX INFO: renamed from: a */
    public static List<C2332b> m11958a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    int iOptInt = jSONObjectOptJSONObject.optInt("id");
                    int iOptInt2 = jSONObjectOptJSONObject.optInt("timeout");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("params");
                    arrayList.add(new C2332b(iOptInt, iOptInt2, jSONObjectOptJSONObject2 != null ? C2331a.m11953a(jSONObjectOptJSONObject2) : null));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return arrayList;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m11959a(int i) {
        this.f14503a = i;
    }

    /* JADX INFO: renamed from: a */
    private void m11960a(C2331a c2331a) {
        this.f14505c = c2331a;
    }

    /* JADX INFO: renamed from: b */
    private void m11961b(int i) {
        this.f14504b = i;
    }

    /* JADX INFO: renamed from: c */
    private C2331a m11962c() {
        return this.f14505c;
    }

    /* JADX INFO: renamed from: a */
    public final int m11963a() {
        return this.f14503a;
    }

    /* JADX INFO: renamed from: b */
    public final int m11964b() {
        return this.f14504b;
    }
}
