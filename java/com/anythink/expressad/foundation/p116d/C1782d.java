package com.anythink.expressad.foundation.p116d;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p114c.p115a.C1776a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.out.C1927b;
import com.anythink.expressad.out.C1937l;
import com.anythink.expressad.p089e.InterfaceC1491b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.d.d */
/* JADX INFO: loaded from: classes.dex */
public class C1782d implements InterfaceC1491b, Serializable {

    /* JADX INFO: renamed from: A */
    public static final String f10535A = "cam_tpl_url";

    /* JADX INFO: renamed from: B */
    public static final String f10536B = "cam_html";

    /* JADX INFO: renamed from: C */
    public static final String f10537C = "cam_tpl_url";

    /* JADX INFO: renamed from: D */
    public static final String f10538D = "cam_html";

    /* JADX INFO: renamed from: E */
    public static final String f10539E = "nscpt";

    /* JADX INFO: renamed from: F */
    public static final String f10540F = "mof_template_url";

    /* JADX INFO: renamed from: G */
    public static final String f10541G = "mof_tplid";

    /* JADX INFO: renamed from: H */
    public static final String f10542H = "req_ext_data";

    /* JADX INFO: renamed from: I */
    public static final String f10543I = "replace_tmp";

    /* JADX INFO: renamed from: K */
    private static final String f10544K = C1782d.class.getSimpleName();

    /* JADX INFO: renamed from: L */
    private static final long f10545L = 1;

    /* JADX INFO: renamed from: a */
    public static final String f10546a = "a";

    /* JADX INFO: renamed from: b */
    public static final String f10547b = "pv_urls";

    /* JADX INFO: renamed from: c */
    public static final String f10548c = "parent_session_id";

    /* JADX INFO: renamed from: d */
    public static final String f10549d = "ad_type";

    /* JADX INFO: renamed from: e */
    public static final String f10550e = "unit_size";

    /* JADX INFO: renamed from: f */
    public static final String f10551f = "html_url";

    /* JADX INFO: renamed from: g */
    public static final String f10552g = "only_impression_url";

    /* JADX INFO: renamed from: h */
    public static final String f10553h = "ads";

    /* JADX INFO: renamed from: i */
    public static final String f10554i = "template";

    /* JADX INFO: renamed from: j */
    public static final String f10555j = "frames";

    /* JADX INFO: renamed from: k */
    public static final String f10556k = "end_screen_url";

    /* JADX INFO: renamed from: l */
    public static final String f10557l = "jm_do";

    /* JADX INFO: renamed from: m */
    public static final String f10558m = "rks";

    /* JADX INFO: renamed from: n */
    public static final String f10559n = "vcn";

    /* JADX INFO: renamed from: o */
    public static final String f10560o = "token_r";

    /* JADX INFO: renamed from: p */
    public static final String f10561p = "encrypt_p";

    /* JADX INFO: renamed from: q */
    public static final String f10562q = "irlfa";

    /* JADX INFO: renamed from: r */
    public static final String f10563r = "csp";

    /* JADX INFO: renamed from: s */
    public static final String f10564s = "do";

    /* JADX INFO: renamed from: t */
    public static final String f10565t = "sh";

    /* JADX INFO: renamed from: u */
    public static final String f10566u = "ia_icon";

    /* JADX INFO: renamed from: v */
    public static final String f10567v = "ia_rst";

    /* JADX INFO: renamed from: w */
    public static final String f10568w = "ia_url";

    /* JADX INFO: renamed from: x */
    public static final String f10569x = "ia_ori";

    /* JADX INFO: renamed from: y */
    public static final String f10570y = "ia_all_ext1";

    /* JADX INFO: renamed from: z */
    public static final String f10571z = "ia_all_ext2";

    /* JADX INFO: renamed from: J */
    public ArrayList<C1781c> f10572J;

    /* JADX INFO: renamed from: N */
    private String f10574N;

    /* JADX INFO: renamed from: O */
    private String f10575O;

    /* JADX INFO: renamed from: P */
    private String f10576P;

    /* JADX INFO: renamed from: Q */
    private String f10577Q;

    /* JADX INFO: renamed from: R */
    private String f10578R;

    /* JADX INFO: renamed from: S */
    private int f10579S;

    /* JADX INFO: renamed from: T */
    private String f10580T;

    /* JADX INFO: renamed from: U */
    private int f10581U;

    /* JADX INFO: renamed from: V */
    private String f10582V;

    /* JADX INFO: renamed from: W */
    private String f10583W;

    /* JADX INFO: renamed from: X */
    private String f10584X;

    /* JADX INFO: renamed from: Y */
    private String f10585Y;

    /* JADX INFO: renamed from: Z */
    private int f10586Z;

    /* JADX INFO: renamed from: aa */
    private String f10587aa;

    /* JADX INFO: renamed from: ab */
    private String f10588ab;

    /* JADX INFO: renamed from: ac */
    private String f10589ac;

    /* JADX INFO: renamed from: ad */
    private int f10590ad;

    /* JADX INFO: renamed from: ae */
    private List<C1937l> f10591ae;

    /* JADX INFO: renamed from: ag */
    private HashMap<String, String> f10593ag;

    /* JADX INFO: renamed from: ah */
    private HashMap<String, String> f10594ah;

    /* JADX INFO: renamed from: ai */
    private String f10595ai;

    /* JADX INFO: renamed from: aj */
    private String f10596aj;

    /* JADX INFO: renamed from: ak */
    private String f10597ak;

    /* JADX INFO: renamed from: al */
    private int f10598al;

    /* JADX INFO: renamed from: am */
    private int f10599am;

    /* JADX INFO: renamed from: ao */
    private int f10601ao;

    /* JADX INFO: renamed from: ap */
    private String f10602ap;

    /* JADX INFO: renamed from: M */
    private String f10573M = "";

    /* JADX INFO: renamed from: af */
    private StringBuffer f10592af = new StringBuffer();

    /* JADX INFO: renamed from: an */
    private String f10600an = "";

    /* JADX INFO: renamed from: A */
    private String m8959A() {
        return this.f10587aa;
    }

    /* JADX INFO: renamed from: B */
    private String m8960B() {
        return this.f10588ab;
    }

    /* JADX INFO: renamed from: C */
    private String m8961C() {
        return this.f10589ac;
    }

    /* JADX INFO: renamed from: D */
    private ArrayList<C1781c> m8962D() {
        return this.f10572J;
    }

    /* JADX INFO: renamed from: E */
    private int m8963E() {
        return this.f10590ad;
    }

    /* JADX INFO: renamed from: a */
    public static C1782d m8964a(String str) {
        try {
            return m8973b(new JSONObject(str), "");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static C1782d m8965a(JSONObject jSONObject) {
        return m8973b(jSONObject, "");
    }

    /* JADX INFO: renamed from: a */
    private static C1782d m8966a(JSONObject jSONObject, String str) {
        return m8973b(jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    private static Object m8967a(Object obj) {
        return obj == null ? "" : obj;
    }

    /* JADX INFO: renamed from: a */
    private void m8968a(int i) {
        this.f10579S = i;
    }

    /* JADX INFO: renamed from: a */
    private void m8969a(ArrayList<C1781c> arrayList) {
        this.f10572J = arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m8970a(HashMap<String, String> map) {
        this.f10593ag = map;
    }

    /* JADX INFO: renamed from: a */
    private void m8971a(List<C1937l> list) {
        this.f10591ae = list;
    }

    /* JADX INFO: renamed from: b */
    private static C1782d m8972b(JSONObject jSONObject) {
        return m8973b(jSONObject, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r15v16, types: [com.anythink.expressad.foundation.d.d] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.anythink.expressad.foundation.d.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX INFO: renamed from: b */
    private static C1782d m8973b(JSONObject jSONObject, String str) {
        ?? r8;
        String str2;
        int i;
        ArrayList arrayList;
        String str3;
        String str4;
        int i2;
        String str5;
        ?? r0 = jSONObject;
        String str6 = f10553h;
        String str7 = "template";
        ?? r5 = "a";
        String str8 = f10552g;
        String str9 = f10551f;
        if (r0 != 0) {
            try {
                C1782d c1782d = new C1782d();
                try {
                    String strOptString = r0.optString(f10558m);
                    if (!TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject2 = new JSONObject(strOptString);
                        Iterator<String> itKeys = jSONObject2.keys();
                        HashMap<String, String> map = new HashMap<>();
                        while (itKeys != null && itKeys.hasNext()) {
                            String next = itKeys.next();
                            map.put(next, jSONObject2.optString(next));
                        }
                        c1782d.f10593ag = map;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        HashMap<String, String> map2 = new HashMap<>();
                        map2.put("encrypt_p", "");
                        map2.put(f10562q, "");
                        c1782d.f10594ah = map2;
                    }
                    JSONObject jSONObjectOptJSONObject = r0.optJSONObject(f10542H);
                    int iOptInt = r0.optInt(f10539E, 1);
                    String strOptString2 = r0.optString(f10540F, "");
                    int iOptInt2 = r0.optInt(f10541G, 0);
                    String string = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : "";
                    new JSONArray();
                    JSONArray jSONArrayOptJSONArray = r0.optJSONArray("pv_urls");
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                        str2 = string;
                        i = iOptInt2;
                        arrayList = null;
                    } else {
                        str2 = string;
                        arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                        i = iOptInt2;
                        for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                            arrayList.add(jSONArrayOptJSONArray.getString(i3));
                        }
                    }
                    C1776a.m8572a().m8575a(r0.optJSONObject(f10543I));
                    c1782d.f10584X = r0.optString("a");
                    c1782d.f10585Y = r0.optString("parent_session_id");
                    c1782d.f10586Z = r0.optInt("ad_type");
                    c1782d.f10587aa = r0.optString(f10550e);
                    c1782d.f10588ab = r0.optString(f10551f);
                    c1782d.f10589ac = r0.optString(f10552g);
                    c1782d.f10590ad = r0.optInt("template");
                    c1782d.f10601ao = r0.optInt(f10557l);
                    c1782d.f10578R = r0.optString("ia_icon");
                    c1782d.f10579S = r0.optInt("ia_rst");
                    c1782d.f10580T = r0.optString("ia_url");
                    c1782d.f10581U = r0.optInt("ia_ori");
                    c1782d.f10582V = r0.optString(f10570y);
                    c1782d.f10583W = r0.optString(f10571z);
                    c1782d.f10598al = r0.optInt("vcn");
                    c1782d.f10599am = r0.optInt("token_r");
                    c1782d.f10600an = r0.optString("encrypt_p");
                    JSONArray jSONArrayOptJSONArray2 = r0.optJSONArray(f10553h);
                    JSONArray jSONArrayOptJSONArray3 = r0.optJSONArray(f10555j);
                    String str10 = f10556k;
                    try {
                        if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                            ArrayList arrayList2 = new ArrayList();
                            String str11 = "parse campaign error ,campaign is null";
                            String str12 = strOptString2;
                            int i4 = 0;
                            ?? r52 = r5;
                            while (i4 < jSONArrayOptJSONArray3.length()) {
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray3.optJSONObject(i4);
                                int i5 = i4;
                                JSONArray jSONArray = jSONObjectOptJSONObject2.getJSONArray(str6);
                                String str13 = str6;
                                ArrayList arrayList3 = new ArrayList();
                                String str14 = str7;
                                JSONObject jSONObject3 = jSONObjectOptJSONObject2;
                                int i6 = 0;
                                ?? r53 = r52;
                                while (i6 < jSONArray.length()) {
                                    JSONObject jSONObjectOptJSONObject3 = jSONArray.optJSONObject(i6);
                                    String strOptString3 = r0.optString(str8);
                                    String strOptString4 = r0.optString(str9);
                                    String str15 = str10;
                                    String str16 = str11;
                                    JSONObject jSONObject4 = jSONObject3;
                                    JSONArray jSONArray2 = jSONArrayOptJSONArray3;
                                    String str17 = str2;
                                    String str18 = str9;
                                    int i7 = i;
                                    String str19 = str8;
                                    ArrayList arrayList4 = arrayList2;
                                    String str20 = str12;
                                    int i8 = i5;
                                    JSONArray jSONArray3 = jSONArray;
                                    int i9 = iOptInt;
                                    ?? r25 = r53;
                                    C1782d c1782d2 = c1782d;
                                    C1781c c1781cM8669a = C1781c.m8669a(jSONObjectOptJSONObject3, strOptString3, strOptString4, r0.optString(str10), false, c1782d, str);
                                    if (c1781cM8669a != null) {
                                        c1781cM8669a.m8883i(c1782d2.f10580T);
                                        c1781cM8669a.m8879h(c1782d2.f10581U);
                                        c1781cM8669a.m8876g(c1782d2.f10579S);
                                        c1781cM8669a.m8880h(c1782d2.f10578R);
                                        c1781cM8669a.m8873f(r0.optInt("ad_type"));
                                        c1781cM8669a.m8874f(r0.optString(C1781c.f10226aS));
                                        c1781cM8669a.m8877g(r0.optString(C1781c.f10227aT));
                                        c1781cM8669a.m8867d(c1782d2.m9010s());
                                        c1781cM8669a.m8863c(c1782d2.m9012t());
                                        c1781cM8669a.m8864c(c1782d2.f10600an);
                                        c1781cM8669a.m8888k(i7);
                                        c1781cM8669a.m8906r(str20);
                                        i2 = i9;
                                        c1781cM8669a.m8884j(i2);
                                        c1781cM8669a.m8823a((List<String>) arrayList);
                                        str4 = str17;
                                        c1781cM8669a.m8907s(str4);
                                        arrayList3.add(c1781cM8669a);
                                        str5 = str16;
                                    } else {
                                        str4 = str17;
                                        i2 = i9;
                                        str5 = str16;
                                        c1782d2.f10573M = str5;
                                    }
                                    i6++;
                                    jSONArrayOptJSONArray3 = jSONArray2;
                                    arrayList2 = arrayList4;
                                    str10 = str15;
                                    jSONObject3 = jSONObject4;
                                    str11 = str5;
                                    jSONArray = jSONArray3;
                                    i5 = i8;
                                    str12 = str20;
                                    str8 = str19;
                                    i = i7;
                                    str9 = str18;
                                    str2 = str4;
                                    iOptInt = i2;
                                    c1782d = c1782d2;
                                    r53 = r25;
                                }
                                ?? r252 = r53;
                                C1782d c1782d3 = c1782d;
                                JSONObject jSONObject5 = jSONObject3;
                                ArrayList arrayList5 = arrayList2;
                                int i10 = iOptInt;
                                String str21 = str2;
                                String str22 = str9;
                                int i11 = i;
                                C1937l c1937l = new C1937l();
                                c1937l.m10175b(r0.optString("parent_session_id"));
                                c1937l.m10173a(r0.optString(r252));
                                c1937l.m10174a(arrayList3);
                                c1937l.m10172a(jSONObject5.optInt(str14));
                                arrayList5.add(c1937l);
                                arrayList2 = arrayList5;
                                str12 = str12;
                                jSONArrayOptJSONArray3 = jSONArrayOptJSONArray3;
                                str8 = str8;
                                str6 = str13;
                                i = i11;
                                str11 = str11;
                                str9 = str22;
                                i4 = i5 + 1;
                                str7 = str14;
                                str2 = str21;
                                iOptInt = i10;
                                c1782d = c1782d3;
                                r52 = r252;
                                str10 = str10;
                            }
                            C1782d c1782d4 = c1782d;
                            c1782d4.f10591ae = arrayList2;
                            return c1782d4;
                        }
                        String str23 = f10556k;
                        r5 = c1782d;
                        int i12 = iOptInt;
                        String str24 = str2;
                        String str25 = f10551f;
                        int i13 = i;
                        String str26 = f10552g;
                        String str27 = "parse campaign error ,campaign is null";
                        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                            ArrayList<C1781c> arrayList6 = new ArrayList<>();
                            int i14 = 0;
                            ?? r02 = r0;
                            while (i14 < jSONArrayOptJSONArray2.length()) {
                                String str28 = str26;
                                String str29 = str25;
                                String str30 = str27;
                                String str31 = str23;
                                JSONArray jSONArray4 = jSONArrayOptJSONArray2;
                                String str32 = str24;
                                str26 = str28;
                                int i15 = i12;
                                C1781c c1781cM8669a2 = C1781c.m8669a(jSONArrayOptJSONArray2.optJSONObject(i14), r02.optString(str28), r02.optString(str29), r02.optString(str31), false, r5, str);
                                if (c1781cM8669a2 != null) {
                                    c1781cM8669a2.m8888k(i13);
                                    c1781cM8669a2.m8906r(strOptString2);
                                    c1781cM8669a2.m8884j(i15);
                                    c1781cM8669a2.m8823a((List<String>) arrayList);
                                    str3 = str32;
                                    c1781cM8669a2.m8907s(str3);
                                    c1781cM8669a2.m8867d(r5.m9010s());
                                    c1781cM8669a2.m8863c(r5.m9012t());
                                    c1781cM8669a2.m8864c(((C1782d) r5).f10600an);
                                    arrayList6.add(c1781cM8669a2);
                                } else {
                                    str3 = str32;
                                    ((C1782d) r5).f10573M = str30;
                                }
                                i14++;
                                str27 = str30;
                                i12 = i15;
                                str24 = str3;
                                str23 = str31;
                                jSONArrayOptJSONArray2 = jSONArray4;
                                r02 = jSONObject;
                                str25 = str29;
                            }
                            r5.f10572J = arrayList6;
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    r5 = c1782d;
                }
                r8 = r5;
            } catch (Exception unused3) {
                r8 = 0;
            }
        } else {
            r8 = 0;
        }
        return r8;
    }

    /* JADX INFO: renamed from: b */
    private void m8974b(int i) {
        this.f10581U = i;
    }

    /* JADX INFO: renamed from: b */
    private void m8975b(String str) {
        this.f10573M = str;
    }

    /* JADX INFO: renamed from: b */
    private void m8976b(HashMap<String, String> map) {
        this.f10594ah = map;
    }

    /* JADX INFO: renamed from: c */
    private void m8977c(int i) {
        this.f10598al = i;
    }

    /* JADX INFO: renamed from: c */
    private void m8978c(String str) {
        this.f10574N = str;
    }

    /* JADX INFO: renamed from: d */
    private void m8979d(int i) {
        this.f10599am = i;
    }

    /* JADX INFO: renamed from: d */
    private void m8980d(String str) {
        this.f10575O = str;
    }

    /* JADX INFO: renamed from: e */
    private void m8981e(int i) {
        this.f10601ao = i;
    }

    /* JADX INFO: renamed from: e */
    private void m8982e(String str) {
        this.f10576P = str;
    }

    /* JADX INFO: renamed from: f */
    private void m8983f(int i) {
        this.f10586Z = i;
    }

    /* JADX INFO: renamed from: f */
    private void m8984f(String str) {
        this.f10577Q = str;
    }

    /* JADX INFO: renamed from: g */
    private String m8985g() {
        return this.f10573M;
    }

    /* JADX INFO: renamed from: g */
    private void m8986g(int i) {
        this.f10590ad = i;
    }

    /* JADX INFO: renamed from: g */
    private void m8987g(String str) {
        this.f10578R = str;
    }

    /* JADX INFO: renamed from: h */
    private String m8988h() {
        return this.f10574N;
    }

    /* JADX INFO: renamed from: h */
    private void m8989h(String str) {
        this.f10580T = str;
    }

    /* JADX INFO: renamed from: i */
    private String m8990i() {
        return this.f10575O;
    }

    /* JADX INFO: renamed from: i */
    private void m8991i(String str) {
        this.f10582V = str;
    }

    /* JADX INFO: renamed from: j */
    private String m8992j() {
        return this.f10576P;
    }

    /* JADX INFO: renamed from: j */
    private void m8993j(String str) {
        this.f10583W = str;
    }

    /* JADX INFO: renamed from: k */
    private String m8994k() {
        return this.f10577Q;
    }

    /* JADX INFO: renamed from: k */
    private void m8995k(String str) {
        this.f10600an = str;
    }

    /* JADX INFO: renamed from: l */
    private String m8996l() {
        return this.f10578R;
    }

    /* JADX INFO: renamed from: l */
    private void m8997l(String str) {
        this.f10595ai = str;
    }

    /* JADX INFO: renamed from: m */
    private int m8998m() {
        return this.f10579S;
    }

    /* JADX INFO: renamed from: m */
    private void m8999m(String str) {
        this.f10596aj = str;
    }

    /* JADX INFO: renamed from: n */
    private String m9000n() {
        return this.f10580T;
    }

    /* JADX INFO: renamed from: n */
    private void m9001n(String str) {
        this.f10597ak = str;
    }

    /* JADX INFO: renamed from: o */
    private int m9002o() {
        return this.f10581U;
    }

    /* JADX INFO: renamed from: o */
    private void m9003o(String str) {
        this.f10584X = str;
    }

    /* JADX INFO: renamed from: p */
    private String m9004p() {
        return this.f10582V;
    }

    /* JADX INFO: renamed from: p */
    private void m9005p(String str) {
        this.f10585Y = str;
    }

    /* JADX INFO: renamed from: q */
    private String m9006q() {
        return this.f10583W;
    }

    /* JADX INFO: renamed from: q */
    private void m9007q(String str) {
        this.f10587aa = str;
    }

    /* JADX INFO: renamed from: r */
    private String m9008r() {
        return this.f10600an;
    }

    /* JADX INFO: renamed from: r */
    private void m9009r(String str) {
        this.f10588ab = str;
    }

    /* JADX INFO: renamed from: s */
    private int m9010s() {
        int i = this.f10598al;
        if (i > 1) {
            return i;
        }
        return 1;
    }

    /* JADX INFO: renamed from: s */
    private void m9011s(String str) {
        this.f10589ac = str;
    }

    /* JADX INFO: renamed from: t */
    private int m9012t() {
        int i = this.f10599am;
        if (i == 1) {
            return i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: u */
    private String m9013u() {
        return this.f10595ai;
    }

    /* JADX INFO: renamed from: v */
    private String m9014v() {
        return this.f10596aj;
    }

    /* JADX INFO: renamed from: w */
    private String m9015w() {
        return this.f10597ak;
    }

    /* JADX INFO: renamed from: x */
    private int m9016x() {
        return this.f10601ao;
    }

    /* JADX INFO: renamed from: y */
    private List<C1937l> m9017y() {
        return this.f10591ae;
    }

    /* JADX INFO: renamed from: z */
    private String m9018z() {
        return this.f10585Y;
    }

    /* JADX INFO: renamed from: a */
    public final HashMap<String, String> m9019a() {
        return this.f10593ag;
    }

    /* JADX INFO: renamed from: b */
    public final HashMap<String, String> m9020b() {
        return this.f10594ah;
    }

    /* JADX INFO: renamed from: c */
    public final String m9021c() {
        return this.f10584X;
    }

    /* JADX INFO: renamed from: d */
    public final int m9022d() {
        return this.f10586Z;
    }

    /* JADX INFO: renamed from: e */
    public final String m9023e() {
        StringBuffer stringBuffer = this.f10592af;
        if (stringBuffer != null && stringBuffer.length() > 0) {
            return this.f10592af.toString();
        }
        try {
            String strM4065f = C1341e.m4065f();
            String strM4058c = C1341e.m4058c(C1175n.m2059a().m2148f());
            String strM4055b = C1341e.m4055b(C1175n.m2059a().m2148f());
            C1175n.m2059a().m2148f();
            String strValueOf = String.valueOf(C1877k.m9690a());
            String str = C1877k.m9702e(C1175n.m2059a().m2148f()) + "x" + C1877k.m9705f(C1175n.m2059a().m2148f());
            StringBuffer stringBuffer2 = this.f10592af;
            stringBuffer2.append(this.f10586Z);
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) "1"));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) Build.VERSION.RELEASE));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) C1927b.f11909a));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) C1341e.m4048a()));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) str));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a(Integer.valueOf(C1877k.m9696b(C1773a.m8548c().m8557e()))));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) C1341e.m4066f(C1773a.m8548c().m8557e())));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) strValueOf));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) strM4055b));
            stringBuffer2.append(m8967a((Object) strM4058c));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) "at_device1"));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) "at_device2"));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) C1341e.m4060d(C1175n.m2059a().m2148f())));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) strM4065f));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) ""));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) C1341e.m4054b()));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) ""));
            stringBuffer2.append("||");
            stringBuffer2.append(m8967a((Object) ""));
            stringBuffer2.append(C1801a.f11059bQ);
            stringBuffer2.append(m8967a((Object) (C1175n.m2059a().m2178y() + "," + C1175n.m2059a().m2179z())));
            stringBuffer2.append(C1801a.f11059bQ);
            this.f10592af = stringBuffer2;
            IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
            if (iExHandlerM2132b != null) {
                return iExHandlerM2132b.fillCDataParam(this.f10592af.toString());
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        String string = this.f10592af.toString();
        string.replaceAll("at_device1", "");
        string.replaceAll("at_device2", "");
        return string;
    }

    /* JADX INFO: renamed from: f */
    public final String m9024f() {
        try {
            if (!TextUtils.isEmpty(this.f10602ap)) {
                return this.f10602ap;
            }
            if (TextUtils.isEmpty(this.f10589ac)) {
                return "";
            }
            Uri uri = Uri.parse(this.f10589ac);
            if (uri != null) {
                this.f10602ap = uri.getQueryParameter("k");
            }
            return this.f10602ap;
        } catch (Exception unused) {
            return "";
        }
    }
}
