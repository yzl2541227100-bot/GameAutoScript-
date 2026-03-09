package com.anythink.expressad.foundation.p114c.p115a;

import com.anythink.expressad.foundation.p120g.p121a.C1805d;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.c.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1776a {

    /* JADX INFO: renamed from: a */
    private C1805d f10156a;

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.c.a.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static C1776a f10157a = new C1776a(0);

        private a() {
        }
    }

    private C1776a() {
        this.f10156a = new C1805d();
    }

    public /* synthetic */ C1776a(byte b) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C1776a m8572a() {
        return a.f10157a;
    }

    /* JADX INFO: renamed from: b */
    private JSONArray m8573b() {
        return new JSONArray((Collection) this.f10156a.mo5248a());
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m8574a(String str) {
        JSONObject jSONObjectMo5251b = this.f10156a.mo5251b(str);
        if (jSONObjectMo5251b != null) {
            return jSONObjectMo5251b;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m8575a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.f10156a.mo5250a(next, jSONObject.optJSONObject(next));
            }
        }
    }
}
