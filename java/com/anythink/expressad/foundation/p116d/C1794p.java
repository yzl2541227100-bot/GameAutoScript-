package com.anythink.expressad.foundation.p116d;

import android.text.TextUtils;
import com.anythink.expressad.p089e.InterfaceC1491b;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.d.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1794p implements InterfaceC1491b, Serializable {

    /* JADX INFO: renamed from: a */
    public static final String f10771a = "amount_max";

    /* JADX INFO: renamed from: b */
    public static final String f10772b = "callback_rule";

    /* JADX INFO: renamed from: c */
    public static final String f10773c = "virtual_currency";

    /* JADX INFO: renamed from: d */
    public static final String f10774d = "amount";

    /* JADX INFO: renamed from: e */
    public static final String f10775e = "icon";

    /* JADX INFO: renamed from: f */
    public static final String f10776f = "currency_id";

    /* JADX INFO: renamed from: g */
    public static final String f10777g = "name";

    /* JADX INFO: renamed from: h */
    private int f10778h = 0;

    /* JADX INFO: renamed from: i */
    private int f10779i = 1;

    /* JADX INFO: renamed from: j */
    private String f10780j = "";

    /* JADX INFO: renamed from: k */
    private int f10781k = 1;

    /* JADX INFO: renamed from: l */
    private String f10782l = "";

    /* JADX INFO: renamed from: m */
    private int f10783m = 1;

    /* JADX INFO: renamed from: n */
    private String f10784n = "Virtual Item";

    /* JADX INFO: renamed from: a */
    public static C1794p m9219a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            C1794p c1794p = new C1794p();
            c1794p.f10778h = jSONObject.optInt("amount_max", 0);
            c1794p.f10779i = jSONObject.optInt("callback_rule", 1);
            c1794p.f10780j = jSONObject.optString("virtual_currency", "");
            c1794p.f10782l = jSONObject.optString("icon", "");
            c1794p.f10783m = jSONObject.optInt("currency_id", 1);
            if (jSONObject.has("amount")) {
                c1794p.f10781k = jSONObject.optInt("amount", 1);
            }
            if (jSONObject.has("name")) {
                c1794p.f10784n = jSONObject.optString("name", "Virtual Item");
            }
            return c1794p;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static C1794p m9220a(JSONObject jSONObject) {
        C1794p c1794p = new C1794p();
        c1794p.f10778h = jSONObject.optInt("amount_max", 0);
        c1794p.f10779i = jSONObject.optInt("callback_rule", 1);
        c1794p.f10780j = jSONObject.optString("virtual_currency", "");
        c1794p.f10782l = jSONObject.optString("icon", "");
        c1794p.f10783m = jSONObject.optInt("currency_id", 1);
        if (jSONObject.has("amount")) {
            c1794p.f10781k = jSONObject.optInt("amount", 1);
        }
        if (jSONObject.has("name")) {
            c1794p.f10784n = jSONObject.optString("name", "Virtual Item");
        }
        return c1794p;
    }

    /* JADX INFO: renamed from: a */
    private void m9221a(int i) {
        this.f10778h = i;
    }

    /* JADX INFO: renamed from: b */
    private void m9222b(int i) {
        this.f10779i = i;
    }

    /* JADX INFO: renamed from: b */
    private void m9223b(String str) {
        this.f10780j = str;
    }

    /* JADX INFO: renamed from: c */
    private void m9224c(int i) {
        this.f10781k = i;
    }

    /* JADX INFO: renamed from: c */
    private void m9225c(String str) {
        this.f10782l = str;
    }

    /* JADX INFO: renamed from: d */
    private int m9226d() {
        return this.f10778h;
    }

    /* JADX INFO: renamed from: d */
    private void m9227d(int i) {
        this.f10783m = i;
    }

    /* JADX INFO: renamed from: d */
    private void m9228d(String str) {
        this.f10784n = str;
    }

    /* JADX INFO: renamed from: e */
    private int m9229e() {
        return this.f10779i;
    }

    /* JADX INFO: renamed from: f */
    private String m9230f() {
        return this.f10780j;
    }

    /* JADX INFO: renamed from: g */
    private String m9231g() {
        return this.f10782l;
    }

    /* JADX INFO: renamed from: h */
    private int m9232h() {
        return this.f10783m;
    }

    /* JADX INFO: renamed from: a */
    public final int m9233a() {
        return this.f10781k;
    }

    /* JADX INFO: renamed from: b */
    public final String m9234b() {
        return this.f10784n;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m9235c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("amount_max", this.f10778h);
            jSONObject.put("callback_rule", this.f10779i);
            jSONObject.put("virtual_currency", this.f10780j);
            jSONObject.put("amount", this.f10781k);
            jSONObject.put("icon", this.f10782l);
            jSONObject.put("currency_id", this.f10783m);
            jSONObject.put("name", this.f10784n);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
