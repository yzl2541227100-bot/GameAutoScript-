package com.anythink.expressad.video.signal.p176a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import cn.haorui.sdk.core.HRConfig;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1786h;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p138h.C1869c;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1888v;
import com.anythink.expressad.out.C1927b;
import com.anythink.expressad.p073a.C1405a;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.anythink.expressad.video.signal.InterfaceC2209c;
import com.anythink.expressad.video.signal.p176a.C2195c;
import com.anythink.expressad.videocommon.p181e.C2337a;
import com.anythink.expressad.videocommon.p181e.C2339c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.a.j */
/* JADX INFO: loaded from: classes.dex */
public class C2202j extends C2195c {

    /* JADX INFO: renamed from: t */
    private static final String f13937t = "j";

    /* JADX INFO: renamed from: y */
    private static final String f13938y = "camp_position";

    /* JADX INFO: renamed from: A */
    private List<C1781c> f13939A;

    /* JADX INFO: renamed from: B */
    private int f13940B;

    /* JADX INFO: renamed from: C */
    private String f13941C = "";

    /* JADX INFO: renamed from: D */
    private String f13942D = "";

    /* JADX INFO: renamed from: E */
    private boolean f13943E = false;

    /* JADX INFO: renamed from: F */
    private boolean f13944F = false;

    /* JADX INFO: renamed from: G */
    private boolean f13945G = true;

    /* JADX INFO: renamed from: u */
    private Activity f13946u;

    /* JADX INFO: renamed from: v */
    private String f13947v;

    /* JADX INFO: renamed from: w */
    private String f13948w;

    /* JADX INFO: renamed from: x */
    private Context f13949x;

    /* JADX INFO: renamed from: z */
    private C1781c f13950z;

    public C2202j(Activity activity, C1781c c1781c) {
        this.f13946u = activity;
        this.f13950z = c1781c;
    }

    public C2202j(Activity activity, C1781c c1781c, List<C1781c> list) {
        this.f13946u = activity;
        this.f13950z = c1781c;
        this.f13939A = list;
    }

    /* JADX INFO: renamed from: A */
    private static JSONObject m11591A() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", new C1869c(C1175n.m2059a().m2148f()).mo9675a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: B */
    private JSONObject m11592B() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f13919s);
            jSONObject2.put("instanceId", this.f13941C);
            jSONObject.put("sdkSetting", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: C */
    private JSONObject m11593C() {
        JSONObject jSONObject = new JSONObject();
        C2340d c2340d = this.f13915o;
        return c2340d != null ? c2340d.m12073R() : jSONObject;
    }

    /* JADX INFO: renamed from: D */
    private static JSONObject m11594D() {
        JSONObject jSONObject = new JSONObject();
        C2337a c2337aM12002b = C2339c.m11994a().m12002b();
        return c2337aM12002b != null ? c2337aM12002b.m11993k() : jSONObject;
    }

    /* JADX INFO: renamed from: E */
    private static boolean m11595E() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    private C1781c m11596a(String str, C1781c c1781c) {
        if (TextUtils.isEmpty(str)) {
            return c1781c;
        }
        if (TextUtils.isEmpty(str) && c1781c == null) {
            return null;
        }
        try {
            if (str.contains("notice")) {
                JSONObject jSONObjectM8671a = C1781c.m8671a(c1781c);
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.opt(C1786h.f10675cv) == null) {
                    jSONObject.put(C1786h.f10675cv, "");
                }
                try {
                    if (!jSONObject.has(C1781c.f10196O)) {
                        jSONObjectM8671a.put(C1781c.f10196O, "");
                    }
                } catch (Exception unused) {
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectM8671a.put(next, jSONObject.getString(next));
                }
                C1781c c1781cM8703b = C1781c.m8703b(jSONObjectM8671a);
                m11598a(jSONObjectM8671a, c1781cM8703b);
                return c1781cM8703b;
            }
            try {
                JSONObject jSONObjectM8671a2 = C1781c.m8671a(c1781c);
                C1781c c1781cM8703b2 = C1781c.m8703b(jSONObjectM8671a2);
                if (c1781cM8703b2 == null) {
                    c1781cM8703b2 = c1781c;
                }
                if (!TextUtils.isEmpty(str)) {
                    m11598a(jSONObjectM8671a2, c1781cM8703b2);
                    JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(C1801a.f11116ce);
                    if (jSONObjectOptJSONObject != null) {
                        String.valueOf(C1886t.m9834b(this.f13946u, Integer.valueOf(jSONObjectOptJSONObject.getString(C1801a.f11114cc)).intValue()));
                        String.valueOf(C1886t.m9834b(this.f13946u, Integer.valueOf(jSONObjectOptJSONObject.getString(C1801a.f11115cd)).intValue()));
                    }
                    c1781cM8703b2.m8902p(c1781cM8703b2.m8835ad());
                    String strM8839ah = c1781cM8703b2.m8839ah();
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        StringBuilder sb = new StringBuilder();
                        while (itKeys2.hasNext()) {
                            sb.append("&");
                            String next2 = itKeys2.next();
                            String strOptString = jSONObjectOptJSONObject.optString(next2);
                            if (C1801a.f11114cc.equals(next2) || C1801a.f11115cd.equals(next2)) {
                                strOptString = String.valueOf(C1886t.m9834b(this.f13946u, Integer.valueOf(strOptString).intValue()));
                            }
                            sb.append(next2);
                            sb.append("=");
                            sb.append(strOptString);
                        }
                        c1781cM8703b2.m8904q(strM8839ah + ((Object) sb));
                    }
                }
                return c1781cM8703b2;
            } catch (Throwable th) {
                th.printStackTrace();
                return c1781c;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            return c1781c;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11597a(JSONObject jSONObject) {
        try {
            Context contextM8557e = C1773a.m8548c().m8557e();
            String string = C1888v.m9864b(contextM8557e, "Anythink_ConfirmTitle" + this.f13914n, "").toString();
            String string2 = C1888v.m9864b(contextM8557e, "Anythink_ConfirmContent" + this.f13914n, "").toString();
            String string3 = C1888v.m9864b(contextM8557e, "Anythink_CancelText" + this.f13914n, "").toString();
            String string4 = C1888v.m9864b(contextM8557e, "Anythink_ConfirmText" + this.f13914n, "").toString();
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put(C1485b.f7131ct, string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject.put(C1485b.f7132cu, string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                jSONObject.put(C1485b.f7133cv, string3);
            }
            if (!TextUtils.isEmpty(string4)) {
                jSONObject.put(C1485b.f7135cx, string4);
            }
            if (TextUtils.isEmpty(string4)) {
                return;
            }
            jSONObject.put(C1485b.f7134cw, string4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m11598a(JSONObject jSONObject, C1781c c1781c) {
        try {
            String strOptString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            c1781c.m8891l(strOptString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11599b(C1781c c1781c) {
        String queryParameter;
        try {
            queryParameter = Uri.parse(c1781c.m8839ah()).getQueryParameter(C1801a.f11117cf);
        } catch (Throwable unused) {
        }
        this.f13918r.mo10952a(c1781c, (!TextUtils.isEmpty(queryParameter) ? Integer.parseInt(queryParameter) : 0) == 2);
        m11605u().m5212a(this.f13918r);
        m11605u();
    }

    /* JADX INFO: renamed from: c */
    private void m11600c(boolean z) {
        this.f13945G = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0022  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m11601c(com.anythink.expressad.foundation.p116d.C1781c r7) {
        /*
            com.anythink.expressad.foundation.b.a r0 = com.anythink.expressad.foundation.p113b.C1773a.m8548c()     // Catch: java.lang.Exception -> L38
            java.lang.String r0 = r0.m8558f()     // Catch: java.lang.Exception -> L38
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L38
            r1 = 0
            if (r0 != 0) goto L22
            com.anythink.expressad.p086d.C1486b.m6002a()     // Catch: java.lang.Exception -> L38
            com.anythink.expressad.d.a r0 = com.anythink.expressad.p086d.C1486b.m6007b()     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L22
            long r3 = r0.m5969l()     // Catch: java.lang.Exception -> L38
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            goto L23
        L22:
            r3 = r1
        L23:
            com.anythink.expressad.videocommon.e.c r0 = com.anythink.expressad.videocommon.p181e.C2339c.m11994a()     // Catch: java.lang.Exception -> L38
            com.anythink.expressad.videocommon.e.a r0 = r0.m12002b()     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L31
            long r1 = r0.m11985c()     // Catch: java.lang.Exception -> L38
        L31:
            if (r7 == 0) goto L38
            boolean r7 = r7.m8825a(r1, r3)     // Catch: java.lang.Exception -> L38
            return r7
        L38:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.signal.p176a.C2202j.m11601c(com.anythink.expressad.foundation.d.c):boolean");
    }

    /* JADX INFO: renamed from: e */
    private void m11602e(String str) {
        List<C1781c> list;
        if (this.f13950z == null || (list = this.f13939A) == null || list.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(f13938y)) {
                this.f13950z = this.f13939A.get(jSONObject.getInt(f13938y));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: s */
    private boolean m11603s() {
        return this.f13945G;
    }

    /* JADX INFO: renamed from: t */
    private String m11604t() {
        JSONObject jSONObject = new JSONObject();
        C1869c c1869c = new C1869c(C1175n.m2059a().m2148f());
        try {
            jSONObject.put("unit_id", this.f13914n);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", this.f13941C);
            jSONObject2.put("rootViewInstanceId", this.f13942D);
            jSONObject2.put("isRootTemplateWebView", this.f13943E);
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, C1927b.f11909a + ",3.0.1");
            jSONObject2.put("playVideoMute", this.f13919s);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", c1869c.mo9675a());
            JSONArray jSONArray = new JSONArray();
            List<C1781c> list = this.f13939A;
            if (list == null || list.size() <= 0) {
                jSONArray.put(C1781c.m8671a(this.f13950z));
            } else {
                for (C1781c c1781c : this.f13939A) {
                    jSONArray.put(C1781c.m8672a(c1781c, c1781c.m8851at(), m11601c(c1781c)));
                }
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", m11593C());
            String strM8558f = C1773a.m8548c().m8558f();
            C1486b.m6002a();
            String strM6004a = C1486b.m6004a(strM8558f);
            if (!TextUtils.isEmpty(strM6004a)) {
                JSONObject jSONObject3 = new JSONObject(strM6004a);
                m11597a(jSONObject3);
                C1486b.m6002a();
                String strM6009b = C1486b.m6009b(this.f13914n);
                if (!TextUtils.isEmpty(strM6009b)) {
                    jSONObject3.put("ivreward", new JSONObject(strM6009b));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", m11594D());
            if (!TextUtils.isEmpty(this.f13914n)) {
                jSONObject.put("unit_id", this.f13914n);
            }
            jSONObject.put("rw_plus", this.f13944F ? "1" : "0");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: u */
    private C1405a m11605u() {
        if (this.f13917q == null) {
            this.f13917q = new C1405a(C1175n.m2059a().m2148f(), this.f13914n);
        }
        return this.f13917q;
    }

    /* JADX INFO: renamed from: v */
    private JSONObject m11606v() {
        JSONObject jSONObject = new JSONObject();
        C1869c c1869c = new C1869c(C1175n.m2059a().m2148f());
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f13919s);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", c1869c.mo9675a());
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(C1781c.m8671a(this.f13950z));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", m11593C());
            String strM8558f = C1773a.m8548c().m8558f();
            C1486b.m6002a();
            String strM6004a = C1486b.m6004a(strM8558f);
            if (!TextUtils.isEmpty(strM6004a)) {
                JSONObject jSONObject3 = new JSONObject(strM6004a);
                m11597a(jSONObject3);
                C1486b.m6002a();
                String strM6009b = C1486b.m6009b(this.f13914n);
                if (!TextUtils.isEmpty(strM6009b)) {
                    jSONObject3.put("ivreward", strM6009b);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", m11594D());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: w */
    private static JSONObject m11607w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, C1927b.f11909a + ",3.0.1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: x */
    private JSONObject m11608x() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f13914n)) {
                jSONObject.put("unit_id", this.f13914n);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: y */
    private static JSONObject m11609y() {
        JSONObject jSONObject = new JSONObject();
        try {
            String strM8558f = C1773a.m8548c().m8558f();
            C1486b.m6002a();
            String strM6004a = C1486b.m6004a(strM8558f);
            if (!TextUtils.isEmpty(strM6004a)) {
                jSONObject.put("appSetting", new JSONObject(strM6004a));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: z */
    private JSONObject m11610z() {
        JSONObject jSONObject = new JSONObject();
        try {
            C2340d c2340d = this.f13915o;
            if (c2340d != null) {
                jSONObject.put("unitSetting", c2340d.m12073R());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2195c, com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: a */
    public final void mo11551a(int i, String str) {
        super.mo11551a(i, str);
        if (i != 2) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("event", "event");
            String strOptString2 = jSONObject.optString("template", HRConfig.GENDER_UNKNOWN);
            String strOptString3 = jSONObject.optString("layout", HRConfig.GENDER_UNKNOWN);
            String strOptString4 = jSONObject.optString("unit_id", this.f13914n);
            this.f13946u.getApplication();
            int iM9690a = C1877k.m9690a();
            new C1796r(C1796r.f10871j, strOptString, strOptString2, strOptString3, strOptString4, this.f13950z.m10146aZ(), iM9690a, C1877k.m9692a(this.f13946u.getApplication(), iM9690a));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2195c, com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: a */
    public final void mo11552a(Activity activity) {
        this.f13946u = activity;
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2195c, com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: a */
    public final void mo11553a(Context context) {
        this.f13949x = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m11611a(C1781c c1781c) {
        this.f13950z = c1781c;
    }

    /* JADX INFO: renamed from: a */
    public final void m11612a(List<C1781c> list) {
        this.f13939A = list;
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2195c, com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: b */
    public final void mo11561b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13948w = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m11613b(boolean z) {
        this.f13944F = z;
    }

    /* JADX INFO: renamed from: c */
    public final void m11614c(String str) {
        this.f13941C = str;
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2195c, com.anythink.expressad.video.signal.InterfaceC2305d
    public void click(int i, String str) {
        String queryParameter;
        List<C1781c> list;
        int iM12098p;
        List<C1781c> list2;
        super.click(i, str);
        C1781c c1781c = this.f13950z;
        if (c1781c != null && c1781c.m8887k() == 5 && this.f13950z != null && (list2 = this.f13939A) != null && list2.size() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(f13938y)) {
                    this.f13950z = this.f13939A.get(jSONObject.getInt(f13938y));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        boolean z = true;
        try {
            if (i != 1) {
                if (i != 3) {
                    return;
                }
                C1781c c1781c2 = this.f13950z;
                if (c1781c2 == null || c1781c2.m8875g() <= -2) {
                    C2340d c2340d = this.f13915o;
                    iM12098p = c2340d != null ? c2340d.m12098p() : 1;
                } else {
                    iM12098p = this.f13950z.m8875g();
                }
                if (iM12098p == -1) {
                    mo11554a(new C2195c.b(this, this.f13918r));
                }
                click(1, str);
                return;
            }
            if (this.f13950z == null && (list = this.f13939A) != null && list.size() > 0) {
                this.f13950z = this.f13939A.get(0);
            }
            C1781c c1781c3 = this.f13950z;
            if (c1781c3 == null) {
                return;
            }
            C1781c c1781cM11596a = m11596a(str, c1781c3);
            try {
                queryParameter = Uri.parse(c1781cM11596a.m8839ah()).getQueryParameter(C1801a.f11117cf);
            } catch (Throwable unused) {
            }
            int i2 = !TextUtils.isEmpty(queryParameter) ? Integer.parseInt(queryParameter) : 0;
            InterfaceC2209c.a aVar = this.f13918r;
            if (i2 != 2) {
                z = false;
            }
            aVar.mo10952a(c1781cM11596a, z);
            m11605u().m5212a(this.f13918r);
            m11605u();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11615d(String str) {
        this.f13942D = str;
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2195c, com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: h */
    public final String mo11572h(int i) {
        JSONObject jSONObjectM11607w;
        switch (i) {
            case 1:
                jSONObjectM11607w = m11607w();
                break;
            case 2:
                jSONObjectM11607w = m11608x();
                break;
            case 3:
                jSONObjectM11607w = m11609y();
                break;
            case 4:
                jSONObjectM11607w = m11610z();
                break;
            case 5:
                jSONObjectM11607w = m11591A();
                break;
            case 6:
                jSONObjectM11607w = m11592B();
                break;
            default:
                jSONObjectM11607w = m11606v();
                break;
        }
        return jSONObjectM11607w.toString();
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2195c, com.anythink.expressad.video.signal.InterfaceC2305d
    public void handlerH5Exception(int i, String str) {
        super.handlerH5Exception(i, str);
        try {
            this.f13918r.mo10951a(i, str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2195c, com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: i */
    public final String mo11574i() {
        this.f13918r.mo10953c();
        this.f13905e = true;
        if (TextUtils.isEmpty(this.f13947v)) {
            this.f13947v = m11604t();
        }
        return this.f13947v;
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2195c, com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: j */
    public final void mo11576j() {
        super.mo11576j();
        try {
            Activity activity = this.f13946u;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m11616j(int i) {
        this.f13940B = i;
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2195c, com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: l */
    public final void mo11578l() {
        super.mo11578l();
        InterfaceC2209c.a aVar = this.f13918r;
        if (aVar != null) {
            aVar.mo10954d();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2195c, com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: o */
    public final String mo11581o() {
        return this.f13948w;
    }

    /* JADX INFO: renamed from: p */
    public final void m11617p() {
        this.f13943E = true;
    }

    /* JADX INFO: renamed from: q */
    public final void m11618q() {
        this.f13947v = "";
    }

    /* JADX INFO: renamed from: r */
    public final int m11619r() {
        return this.f13940B;
    }
}
