package com.anythink.expressad.atsignalcommon.communication;

import android.text.TextUtils;
import android.util.Base64;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import com.anythink.expressad.foundation.p138h.C1886t;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.communication.a */
/* JADX INFO: loaded from: classes.dex */
public class C1456a {

    /* JADX INFO: renamed from: a */
    public static final String f6705a = "a";

    /* JADX INFO: renamed from: b */
    public static int f6706b = 0;

    /* JADX INFO: renamed from: c */
    public static int f6707c = 1;

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.communication.a$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f6708a;

        public AnonymousClass1(C1781c c1781c) {
            this.f6708a = c1781c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                C1456a.m5644a(this.f6708a.m8803K(), this.f6708a);
            } catch (Throwable th) {
                String str = C1456a.f6705a;
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m5639a(float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C1801a.f11114cc, C1886t.m9821a(C1773a.m8548c().m8557e(), f));
            jSONObject2.put(C1801a.f11115cd, C1886t.m9821a(C1773a.m8548c().m8557e(), f2));
            jSONObject2.put(C1801a.f11117cf, 0);
            jSONObject2.put(C1801a.f11118cg, C1773a.m8548c().m8557e().getResources().getConfiguration().orientation);
            jSONObject2.put(C1801a.f11119ch, C1886t.m9841c(C1773a.m8548c().m8557e()));
            jSONObject.put(C1801a.f11116ce, jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m5640a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5641a(C1781c c1781c) {
        new Thread(new AnonymousClass1(c1781c)).start();
    }

    /* JADX INFO: renamed from: a */
    private static void m5642a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f6707c);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5643a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m5642a(obj, "data is empty");
                return;
            }
            C1781c c1781cM8703b = C1781c.m8703b(jSONObjectOptJSONObject);
            if (c1781cM8703b == null) {
                m5642a(obj, "data camapign is empty");
                return;
            }
            new Thread(new AnonymousClass1(c1781cM8703b)).start();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", f6706b);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("id", "");
                jSONObject2.put("data", jSONObject3);
                C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception e) {
                m5642a(obj, e.getMessage());
                e.getMessage();
            }
        } catch (Throwable th) {
            m5642a(obj, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5644a(String str, C1781c c1781c) {
        if (C1807f.f11190n == null || TextUtils.isEmpty(c1781c.m10146aZ())) {
            return;
        }
        C1807f.m9397a(str, c1781c, C1807f.f11181e);
    }

    /* JADX INFO: renamed from: b */
    private static void m5645b(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f6706b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            m5642a(obj, e.getMessage());
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m5646b(String str, C1781c c1781c) {
        if (C1807f.f11190n == null || TextUtils.isEmpty(c1781c.m10146aZ())) {
            return;
        }
        C1807f.m9397a(str, c1781c, C1807f.f11181e);
    }
}
