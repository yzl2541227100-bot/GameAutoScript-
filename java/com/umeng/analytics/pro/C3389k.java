package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.MLog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.pro.k */
/* JADX INFO: loaded from: classes2.dex */
public class C3389k {
    /* JADX INFO: renamed from: a */
    public static long m15571a(JSONArray jSONArray) {
        return jSONArray.toString().getBytes().length;
    }

    /* JADX INFO: renamed from: a */
    public static long m15572a(JSONObject jSONObject) {
        return jSONObject.toString().getBytes().length;
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m15573a(Context context, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            MLog.m16269e("splitAnalyticsData========");
            boolean z = true;
            jSONObject = C3387i.m15520a(context).m15551b(true);
            if (jSONObject != null && jSONObject.length() > 0 && m15572a(jSONObject) > j) {
                String string = null;
                if (jSONObject.has(C3380b.f18403n)) {
                    JSONObject jSONObject2 = jSONObject.getJSONArray(C3380b.f18403n).getJSONObject(0);
                    if (jSONObject2 != null) {
                        string = jSONObject2.getString("id");
                        jSONObject2.remove(C3380b.f18409t);
                        jSONObject2.remove(C3380b.f18408s);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(jSONObject2);
                        jSONObject.put(C3380b.f18403n, jSONArray);
                    }
                } else {
                    z = false;
                }
                if (jSONObject.has(C3380b.f18360N)) {
                    jSONObject.remove(C3380b.f18360N);
                }
                if (jSONObject.has(C3380b.f18361O)) {
                    jSONObject.remove(C3380b.f18361O);
                }
                if (jSONObject.has("error")) {
                    jSONObject.remove("error");
                }
                C3385g.m15485a(context).m15499a(z, string);
            }
        } catch (Throwable th) {
            MLog.m16273e(th);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m15574a(Context context, long j, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        try {
            C3385g.m15485a(context).m15495a();
            JSONObject jSONObject4 = new JSONObject();
            long jM15572a = 0;
            if (jSONObject.has("header")) {
                jSONObject4 = jSONObject.getJSONObject("header");
                if (jSONObject4 == null || jSONObject4.length() <= 0) {
                    jSONObject4 = null;
                } else {
                    jM15572a = j - m15572a(jSONObject4);
                }
            }
            if (jSONObject.has("content") && (jSONObject2 = jSONObject.getJSONObject("content")) != null && jSONObject2.length() > 0) {
                m15575a(context, jM15572a, jSONObject2, jSONObject3);
                if (jSONObject3.length() < 1) {
                    m15577b(context, jM15572a, jSONObject2, jSONObject3);
                }
                if (jSONObject3.length() > 0 && jSONObject4 != null) {
                    jSONObject3.put("header", jSONObject4);
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject3;
    }

    /* JADX INFO: renamed from: a */
    private static void m15575a(Context context, long j, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (jSONObject.has("dplus")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("dplus");
                if (jSONObject3 != null && jSONObject3.length() > 0 && m15572a(jSONObject3) > j) {
                    jSONObject3 = m15576b(context, j, jSONObject3);
                }
                if (jSONObject3.length() > 0) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("dplus", jSONObject3);
                    jSONObject2.put("content", jSONObject4);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private static JSONObject m15576b(Context context, long j, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (jSONObject.has(C3380b.f18376ac)) {
                JSONArray jSONArray = jSONObject.getJSONArray(C3380b.f18376ac);
                if (m15571a(jSONArray) > j) {
                    jSONObject.remove(C3380b.f18376ac);
                    C3385g.m15485a(context).m15496a(4);
                    return m15576b(context, j, jSONObject);
                }
                jSONObject2.put(C3380b.f18376ac, jSONArray);
            } else if (jSONObject.has(C3380b.f18371Y)) {
                JSONArray jSONArray2 = jSONObject.getJSONArray(C3380b.f18371Y);
                if (m15571a(jSONArray2) > j) {
                    jSONObject.remove(C3380b.f18371Y);
                    C3385g.m15485a(context).m15496a(0);
                    return m15576b(context, j, jSONObject);
                }
                jSONObject2.put(C3380b.f18371Y, jSONArray2);
            } else if (jSONObject.has(C3380b.f18381ah)) {
                JSONArray jSONArray3 = jSONObject.getJSONArray(C3380b.f18381ah);
                if (m15571a(jSONArray3) > j) {
                    jSONObject.remove(C3380b.f18381ah);
                    C3385g.m15485a(context).m15496a(1);
                    return m15576b(context, j, jSONObject);
                }
                jSONObject2.put(C3380b.f18381ah, jSONArray3);
            }
        } catch (Throwable unused) {
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: b */
    private static void m15577b(Context context, long j, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        try {
            if (!jSONObject.has("analytics") || (jSONObject3 = jSONObject.getJSONObject("analytics")) == null || jSONObject3.length() <= 0) {
                return;
            }
            if (m15572a(jSONObject3) > j) {
                jSONObject3 = m15573a(context, j);
            }
            if (jSONObject3.length() > 0) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("analytics", jSONObject3);
                jSONObject2.put("content", jSONObject4);
            }
        } catch (Throwable unused) {
        }
    }
}
