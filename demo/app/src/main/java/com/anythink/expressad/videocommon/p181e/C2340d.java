package com.anythink.expressad.videocommon.p181e;

import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p114c.C1778c;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.anythink.expressad.videocommon.p179c.C2332b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.e.d */
/* JADX INFO: loaded from: classes.dex */
public class C2340d {

    /* JADX INFO: renamed from: a */
    public static final int f14622a = 2;

    /* JADX INFO: renamed from: ak */
    private static C1778c f14623ak = null;

    /* JADX INFO: renamed from: b */
    public static final int f14624b = 4;

    /* JADX INFO: renamed from: c */
    public static final int f14625c = 5;

    /* JADX INFO: renamed from: d */
    public static final int f14626d = 6;

    /* JADX INFO: renamed from: e */
    public static final int f14627e = 7;

    /* JADX INFO: renamed from: f */
    public static final int f14628f = -2;

    /* JADX INFO: renamed from: g */
    public static final int f14629g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f14630h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f14631i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f14632j = 2;

    /* JADX INFO: renamed from: k */
    public static final int f14633k = 0;

    /* JADX INFO: renamed from: l */
    public static final int f14634l = -1;

    /* JADX INFO: renamed from: m */
    public static final int f14635m = 5;

    /* JADX INFO: renamed from: n */
    public static final int f14636n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f14637o = 2;

    /* JADX INFO: renamed from: p */
    public static final int f14638p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f14639q = -1;

    /* JADX INFO: renamed from: r */
    public static final int f14640r = -2;

    /* JADX INFO: renamed from: s */
    public static final int f14641s = -3;

    /* JADX INFO: renamed from: t */
    public static final int f14642t = 1;

    /* JADX INFO: renamed from: u */
    public static final int f14643u = -1;

    /* JADX INFO: renamed from: v */
    public static final int f14644v = 1;

    /* JADX INFO: renamed from: w */
    public static final int f14645w = 2;

    /* JADX INFO: renamed from: x */
    public static String f14646x;

    /* JADX INFO: renamed from: A */
    private List<C2332b> f14647A;

    /* JADX INFO: renamed from: B */
    private long f14648B;

    /* JADX INFO: renamed from: V */
    private ArrayList<Integer> f14668V;

    /* JADX INFO: renamed from: ai */
    private int f14681ai;

    /* JADX INFO: renamed from: al */
    private int f14683al;

    /* JADX INFO: renamed from: y */
    private String f14694y;

    /* JADX INFO: renamed from: z */
    private String f14695z;

    /* JADX INFO: renamed from: C */
    private int f14649C = -1;

    /* JADX INFO: renamed from: D */
    private int f14650D = 0;

    /* JADX INFO: renamed from: E */
    private int f14651E = 0;

    /* JADX INFO: renamed from: F */
    private int f14652F = 1;

    /* JADX INFO: renamed from: G */
    private int f14653G = 1;

    /* JADX INFO: renamed from: H */
    private int f14654H = 1;

    /* JADX INFO: renamed from: I */
    private int f14655I = 1;

    /* JADX INFO: renamed from: J */
    private double f14656J = 1.0d;

    /* JADX INFO: renamed from: K */
    private int f14657K = 2;

    /* JADX INFO: renamed from: L */
    private int f14658L = 5;

    /* JADX INFO: renamed from: M */
    private int f14659M = 1;

    /* JADX INFO: renamed from: N */
    private int f14660N = 3;

    /* JADX INFO: renamed from: O */
    private int f14661O = 80;

    /* JADX INFO: renamed from: P */
    private int f14662P = 100;

    /* JADX INFO: renamed from: Q */
    private int f14663Q = 0;

    /* JADX INFO: renamed from: R */
    private double f14664R = 1.0d;

    /* JADX INFO: renamed from: S */
    private int f14665S = -1;

    /* JADX INFO: renamed from: T */
    private int f14666T = 2;

    /* JADX INFO: renamed from: U */
    private double f14667U = 1.0d;

    /* JADX INFO: renamed from: W */
    private int f14669W = 3;

    /* JADX INFO: renamed from: X */
    private int f14670X = 1;

    /* JADX INFO: renamed from: Y */
    private int f14671Y = 0;

    /* JADX INFO: renamed from: Z */
    private int f14672Z = 10;

    /* JADX INFO: renamed from: aa */
    private int f14673aa = 60;

    /* JADX INFO: renamed from: ab */
    private String f14674ab = "";

    /* JADX INFO: renamed from: ac */
    private int f14675ac = 0;

    /* JADX INFO: renamed from: ad */
    private int f14676ad = 70;

    /* JADX INFO: renamed from: ae */
    private int f14677ae = 0;

    /* JADX INFO: renamed from: af */
    private int f14678af = -1;

    /* JADX INFO: renamed from: ag */
    private int f14679ag = -1;

    /* JADX INFO: renamed from: ah */
    private int f14680ah = -1;

    /* JADX INFO: renamed from: aj */
    private int f14682aj = 20;

    /* JADX INFO: renamed from: am */
    private int f14684am = 0;

    /* JADX INFO: renamed from: an */
    private int f14685an = 1;

    /* JADX INFO: renamed from: ao */
    private String f14686ao = "";

    /* JADX INFO: renamed from: ap */
    private int f14687ap = 1;

    /* JADX INFO: renamed from: aq */
    private String f14688aq = "";

    /* JADX INFO: renamed from: ar */
    private int f14689ar = 1;

    /* JADX INFO: renamed from: as */
    private String f14690as = "Virtual Item";

    /* JADX INFO: renamed from: at */
    private int f14691at = 0;

    /* JADX INFO: renamed from: au */
    private int f14692au = 1;

    /* JADX INFO: renamed from: av */
    private int f14693av = 60;

    /* JADX INFO: renamed from: J */
    public static String m12003J() {
        return f14646x;
    }

    /* JADX INFO: renamed from: W */
    private String m12004W() {
        return this.f14674ab;
    }

    /* JADX INFO: renamed from: X */
    private int m12005X() {
        return this.f14672Z;
    }

    /* JADX INFO: renamed from: Y */
    private int m12006Y() {
        return this.f14673aa;
    }

    /* JADX INFO: renamed from: Z */
    private ArrayList<Integer> m12007Z() {
        return this.f14668V;
    }

    /* JADX INFO: renamed from: a */
    public static C2340d m12008a(JSONObject jSONObject) {
        C2340d c2340d = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            C2340d c2340d2 = new C2340d();
            try {
                c2340d2.f14647A = C2332b.m11958a(jSONObject.optJSONArray("adSourceList"));
                c2340d2.f14652F = jSONObject.optInt(C2338b.f14595g);
                int iOptInt = jSONObject.optInt("aqn", 1);
                if (iOptInt <= 0) {
                    iOptInt = 1;
                }
                c2340d2.f14653G = iOptInt;
                int iOptInt2 = jSONObject.optInt("acn", 1);
                if (iOptInt2 < 0) {
                    iOptInt2 = 1;
                }
                c2340d2.f14654H = iOptInt2;
                c2340d2.f14655I = jSONObject.optInt("vcn", 5);
                c2340d2.f14656J = jSONObject.optDouble("cbp", 1.0d);
                c2340d2.f14657K = jSONObject.optInt("ttc_type", 2);
                c2340d2.f14658L = jSONObject.optInt("offset", 5);
                c2340d2.f14659M = jSONObject.optInt("dlnet", 2);
                c2340d2.f14683al = jSONObject.optInt("endscreen_type", 2);
                c2340d2.f14660N = jSONObject.optInt(C2338b.f14531J, 3);
                c2340d2.f14661O = jSONObject.optInt(C2338b.f14532K, 80);
                c2340d2.f14662P = jSONObject.optInt("ready_rate", 100);
                c2340d2.f14648B = jSONObject.optLong("current_time");
                c2340d2.f14675ac = jSONObject.optInt("orientation", 0);
                c2340d2.f14677ae = jSONObject.optInt(C2338b.f14536O, 0);
                c2340d2.f14678af = jSONObject.optInt(C2338b.f14537P, -1);
                c2340d2.f14679ag = jSONObject.optInt(C2338b.f14538Q, 2);
                c2340d2.f14680ah = jSONObject.optInt(C2338b.f14539R, -1);
                c2340d2.f14681ai = jSONObject.optInt(C2338b.f14540S, 1);
                c2340d2.f14649C = jSONObject.optInt("playclosebtn_tm", -1);
                c2340d2.f14650D = jSONObject.optInt("play_ctdown", 0);
                c2340d2.f14651E = jSONObject.optInt("close_alert", 0);
                c2340d2.f14682aj = jSONObject.optInt(C2338b.f14530I, 20);
                c2340d2.f14665S = jSONObject.optInt(C2338b.f14566ac, -1);
                c2340d2.f14664R = jSONObject.optDouble(C2338b.f14564aa, 1.0d);
                c2340d2.f14666T = jSONObject.optInt(C2338b.f14581ar, 2);
                c2340d2.f14667U = jSONObject.optDouble(C2338b.f14582as, 1.0d);
                c2340d2.f14676ad = jSONObject.optInt(C2338b.f14551aC, 70);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C2338b.f14578ao);
                ArrayList<Integer> arrayList = new ArrayList<>();
                try {
                    if (jSONArrayOptJSONArray != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(i)));
                        }
                    } else {
                        arrayList.add(4);
                        arrayList.add(6);
                    }
                    c2340d2.f14668V = arrayList;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                c2340d2.f14669W = jSONObject.optInt(C2338b.f14579ap, 3);
                int iOptInt3 = jSONObject.optInt("tmorl", 1);
                if (iOptInt3 > 2 || iOptInt3 <= 0) {
                    iOptInt3 = 1;
                }
                c2340d2.f14670X = iOptInt3;
                c2340d2.f14671Y = (c2340d2.f14656J != 1.0d && new Random().nextDouble() > c2340d2.f14656J) ? 1 : 0;
                c2340d2.f14695z = jSONObject.optString("placementid");
                c2340d2.f14672Z = jSONObject.optInt("ltafemty", 10);
                c2340d2.f14673aa = jSONObject.optInt("ltorwc", 60);
                c2340d2.f14674ab = jSONObject.optString(C1485b.f7147dI);
                c2340d2.f14684am = jSONObject.optInt("amount_max", 0);
                c2340d2.f14685an = jSONObject.optInt("callback_rule", 1);
                c2340d2.f14686ao = jSONObject.optString("virtual_currency", "");
                c2340d2.m12046i(jSONObject.optInt("amount", 1));
                c2340d2.f14688aq = jSONObject.optString("icon", "");
                c2340d2.f14689ar = jSONObject.optInt("currency_id", 1);
                c2340d2.m12043g(jSONObject.optString("name", "Virtual Item"));
                c2340d2.f14692au = jSONObject.optInt(C2338b.f14562aN, 1);
                c2340d2.f14693av = jSONObject.optInt(C2338b.f14563aO, 60);
                return c2340d2;
            } catch (Exception e2) {
                e = e2;
                c2340d = c2340d2;
                e.printStackTrace();
                return c2340d;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m12009a(double d) {
        this.f14656J = d;
    }

    /* JADX INFO: renamed from: a */
    private void m12010a(long j) {
        this.f14648B = j;
    }

    /* JADX INFO: renamed from: aa */
    private int m12011aa() {
        return this.f14677ae;
    }

    /* JADX INFO: renamed from: ab */
    private int m12012ab() {
        return this.f14650D;
    }

    /* JADX INFO: renamed from: ac */
    private int m12013ac() {
        return this.f14684am;
    }

    /* JADX INFO: renamed from: ad */
    private int m12014ad() {
        return this.f14685an;
    }

    /* JADX INFO: renamed from: ae */
    private String m12015ae() {
        return this.f14686ao;
    }

    /* JADX INFO: renamed from: af */
    private String m12016af() {
        return this.f14688aq;
    }

    /* JADX INFO: renamed from: ag */
    private int m12017ag() {
        return this.f14689ar;
    }

    /* JADX INFO: renamed from: ah */
    private int m12018ah() {
        return this.f14660N;
    }

    /* JADX INFO: renamed from: ai */
    private int m12019ai() {
        return this.f14661O;
    }

    /* JADX INFO: renamed from: aj */
    private int m12020aj() {
        return this.f14653G;
    }

    /* JADX INFO: renamed from: ak */
    private int m12021ak() {
        return this.f14655I;
    }

    /* JADX INFO: renamed from: al */
    private double m12022al() {
        return this.f14656J;
    }

    /* JADX INFO: renamed from: am */
    private int m12023am() {
        return this.f14657K;
    }

    /* JADX INFO: renamed from: an */
    private int m12024an() {
        return this.f14652F;
    }

    /* JADX INFO: renamed from: ao */
    private long m12025ao() {
        return this.f14648B;
    }

    /* JADX INFO: renamed from: ap */
    private String m12026ap() {
        return this.f14694y;
    }

    /* JADX INFO: renamed from: aq */
    private double m12027aq() {
        return this.f14664R;
    }

    /* JADX INFO: renamed from: ar */
    private int m12028ar() {
        return this.f14669W;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX INFO: renamed from: as */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Queue<java.lang.Integer> m12029as() {
        /*
            r4 = this;
            r0 = 0
            java.util.List<com.anythink.expressad.videocommon.c.b> r1 = r4.f14647A     // Catch: java.lang.Exception -> L31
            if (r1 == 0) goto L3d
            int r1 = r1.size()     // Catch: java.lang.Exception -> L31
            if (r1 <= 0) goto L3d
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch: java.lang.Exception -> L31
            r1.<init>()     // Catch: java.lang.Exception -> L31
            r0 = 0
        L11:
            java.util.List<com.anythink.expressad.videocommon.c.b> r2 = r4.f14647A     // Catch: java.lang.Exception -> L2f
            int r2 = r2.size()     // Catch: java.lang.Exception -> L2f
            if (r0 >= r2) goto L3c
            java.util.List<com.anythink.expressad.videocommon.c.b> r2 = r4.f14647A     // Catch: java.lang.Exception -> L2f
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Exception -> L2f
            com.anythink.expressad.videocommon.c.b r2 = (com.anythink.expressad.videocommon.p179c.C2332b) r2     // Catch: java.lang.Exception -> L2f
            int r2 = r2.m11963a()     // Catch: java.lang.Exception -> L2f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L2f
            r1.add(r2)     // Catch: java.lang.Exception -> L2f
            int r0 = r0 + 1
            goto L11
        L2f:
            r0 = move-exception
            goto L35
        L31:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L35:
            boolean r2 = com.anythink.expressad.C1404a.f6209a
            if (r2 == 0) goto L3c
            r0.printStackTrace()
        L3c:
            r0 = r1
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.p181e.C2340d.m12029as():java.util.Queue");
    }

    /* JADX INFO: renamed from: at */
    private int m12030at() {
        return this.f14691at;
    }

    /* JADX INFO: renamed from: b */
    private void m12031b(double d) {
        this.f14664R = d;
    }

    /* JADX INFO: renamed from: b */
    private void m12032b(int i) {
        this.f14672Z = i;
    }

    /* JADX INFO: renamed from: c */
    public static C2340d m12033c(String str) {
        JSONObject jSONObjectOptJSONObject;
        if (f14623ak == null) {
            f14623ak = C1778c.m8584a(C1175n.m2059a().m2148f());
        }
        C2340d c2340d = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unitSetting");
                if (jSONArrayOptJSONArray == null || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
                    return null;
                }
                String strOptString = jSONObjectOptJSONObject.optString("unitId");
                if (TextUtils.isEmpty(strOptString)) {
                    return null;
                }
                C2340d c2340d2 = new C2340d();
                try {
                    List<C2332b> listM11958a = C2332b.m11958a(jSONObjectOptJSONObject.optJSONArray("adSourceList"));
                    c2340d2.f14694y = strOptString;
                    c2340d2.f14647A = listM11958a;
                    c2340d2.f14652F = jSONObjectOptJSONObject.optInt(C2338b.f14595g);
                    int iOptInt = jSONObjectOptJSONObject.optInt("aqn", 1);
                    if (iOptInt <= 0) {
                        iOptInt = 1;
                    }
                    c2340d2.f14653G = iOptInt;
                    int iOptInt2 = jSONObjectOptJSONObject.optInt("acn", 1);
                    if (iOptInt2 < 0) {
                        iOptInt2 = 1;
                    }
                    c2340d2.f14654H = iOptInt2;
                    c2340d2.f14655I = jSONObjectOptJSONObject.optInt("vcn", 5);
                    c2340d2.f14656J = jSONObjectOptJSONObject.optDouble("cbp", 1.0d);
                    c2340d2.f14657K = jSONObjectOptJSONObject.optInt("ttc_type", 2);
                    c2340d2.f14658L = jSONObjectOptJSONObject.optInt("offset", 5);
                    c2340d2.f14659M = jSONObjectOptJSONObject.optInt("dlnet", 1);
                    c2340d2.f14683al = jSONObjectOptJSONObject.optInt("endscreen_type", 2);
                    c2340d2.f14660N = jSONObjectOptJSONObject.optInt(C2338b.f14531J, 3);
                    c2340d2.f14661O = jSONObjectOptJSONObject.optInt(C2338b.f14532K, 80);
                    c2340d2.f14662P = jSONObjectOptJSONObject.optInt("ready_rate", 100);
                    c2340d2.f14663Q = jSONObjectOptJSONObject.optInt("cd_rate", 0);
                    c2340d2.f14648B = jSONObject.optLong("current_time");
                    c2340d2.f14675ac = jSONObjectOptJSONObject.optInt("orientation", 0);
                    c2340d2.f14677ae = jSONObjectOptJSONObject.optInt(C2338b.f14536O, 0);
                    c2340d2.f14678af = jSONObjectOptJSONObject.optInt(C2338b.f14537P, -1);
                    c2340d2.f14679ag = jSONObjectOptJSONObject.optInt(C2338b.f14538Q, 2);
                    c2340d2.f14680ah = jSONObjectOptJSONObject.optInt(C2338b.f14539R, -1);
                    c2340d2.f14681ai = jSONObjectOptJSONObject.optInt(C2338b.f14540S, 1);
                    c2340d2.f14649C = jSONObjectOptJSONObject.optInt("playclosebtn_tm", -1);
                    c2340d2.f14650D = jSONObjectOptJSONObject.optInt("play_ctdown", 0);
                    c2340d2.f14651E = jSONObjectOptJSONObject.optInt("close_alert", 0);
                    c2340d2.f14682aj = jSONObjectOptJSONObject.optInt(C2338b.f14530I, 20);
                    c2340d2.f14676ad = jSONObjectOptJSONObject.optInt(C2338b.f14551aC, 70);
                    c2340d2.f14665S = jSONObjectOptJSONObject.optInt(C2338b.f14566ac, -1);
                    c2340d2.f14664R = jSONObjectOptJSONObject.optDouble(C2338b.f14564aa, 1.0d);
                    c2340d2.f14666T = jSONObjectOptJSONObject.optInt(C2338b.f14581ar, 2);
                    c2340d2.f14667U = jSONObjectOptJSONObject.optDouble(C2338b.f14582as, 1.0d);
                    f14646x = jSONObjectOptJSONObject.optString("atzu");
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(C2338b.f14578ao);
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    try {
                        if (jSONArrayOptJSONArray2 != null) {
                            for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray2.getInt(i)));
                            }
                        } else {
                            arrayList.add(4);
                            arrayList.add(6);
                        }
                        c2340d2.f14668V = arrayList;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    int iOptInt3 = jSONObjectOptJSONObject.optInt(C2338b.f14579ap, 0);
                    c2340d2.f14669W = iOptInt3 > 0 ? iOptInt3 : 3;
                    int iOptInt4 = jSONObjectOptJSONObject.optInt("tmorl", 1);
                    if (iOptInt4 > 2 || iOptInt4 <= 0) {
                        iOptInt4 = 1;
                    }
                    c2340d2.f14670X = iOptInt4;
                    c2340d2.f14671Y = (c2340d2.f14656J != 1.0d && new Random().nextDouble() > c2340d2.f14656J) ? 1 : 0;
                    c2340d2.f14695z = jSONObjectOptJSONObject.optString("placementid");
                    c2340d2.f14672Z = jSONObjectOptJSONObject.optInt("ltafemty", 10);
                    c2340d2.f14673aa = jSONObjectOptJSONObject.optInt("ltorwc", 60);
                    c2340d2.f14674ab = jSONObjectOptJSONObject.optString(C1485b.f7147dI);
                    c2340d2.f14684am = jSONObjectOptJSONObject.optInt("amount_max", 0);
                    c2340d2.f14685an = jSONObjectOptJSONObject.optInt("callback_rule", 1);
                    c2340d2.f14686ao = jSONObjectOptJSONObject.optString("virtual_currency", "");
                    c2340d2.m12046i(jSONObjectOptJSONObject.optInt("amount", 1));
                    c2340d2.f14688aq = jSONObjectOptJSONObject.optString("icon", "");
                    c2340d2.f14689ar = jSONObjectOptJSONObject.optInt("currency_id", 1);
                    c2340d2.m12043g(jSONObjectOptJSONObject.optString("name", "Virtual Item"));
                    c2340d2.f14692au = jSONObjectOptJSONObject.optInt(C2338b.f14562aN, 1);
                    c2340d2.f14693av = jSONObjectOptJSONObject.optInt(C2338b.f14563aO, 60);
                    return c2340d2;
                } catch (Exception e2) {
                    e = e2;
                    c2340d = c2340d2;
                }
            } catch (Exception e3) {
                e = e3;
            }
            e.printStackTrace();
        }
        return c2340d;
    }

    /* JADX INFO: renamed from: c */
    private void m12034c(double d) {
        this.f14667U = d;
    }

    /* JADX INFO: renamed from: c */
    private void m12035c(int i) {
        this.f14673aa = i;
    }

    /* JADX INFO: renamed from: d */
    private void m12036d(int i) {
        this.f14671Y = i;
    }

    /* JADX INFO: renamed from: d */
    private void m12037d(String str) {
        this.f14674ab = str;
    }

    /* JADX INFO: renamed from: e */
    private void m12038e(int i) {
        this.f14649C = i;
    }

    /* JADX INFO: renamed from: e */
    private void m12039e(String str) {
        this.f14686ao = str;
    }

    /* JADX INFO: renamed from: f */
    private void m12040f(int i) {
        this.f14650D = i;
    }

    /* JADX INFO: renamed from: f */
    private void m12041f(String str) {
        this.f14688aq = str;
    }

    /* JADX INFO: renamed from: g */
    private void m12042g(int i) {
        this.f14684am = i;
    }

    /* JADX INFO: renamed from: g */
    private void m12043g(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f14690as = this.f14686ao;
        } else {
            this.f14690as = str;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m12044h(int i) {
        this.f14685an = i;
    }

    /* JADX INFO: renamed from: h */
    private static void m12045h(String str) {
        f14646x = str;
    }

    /* JADX INFO: renamed from: i */
    private void m12046i(int i) {
        if (i <= 0) {
            this.f14687ap = 1;
        } else {
            this.f14687ap = i;
        }
    }

    /* JADX INFO: renamed from: j */
    private void m12047j(int i) {
        this.f14689ar = i;
    }

    /* JADX INFO: renamed from: k */
    private void m12048k(int i) {
        this.f14682aj = i;
    }

    /* JADX INFO: renamed from: l */
    private void m12049l(int i) {
        this.f14657K = i;
    }

    /* JADX INFO: renamed from: m */
    private int m12050m(int i) {
        int i2 = this.f14665S;
        if (i2 == -1) {
            if (i == 94) {
                return 2;
            }
            if (i == 287) {
                return 3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: n */
    private void m12051n(int i) {
        this.f14666T = i;
    }

    /* JADX INFO: renamed from: o */
    private boolean m12052o(int i) {
        ArrayList<Integer> arrayList = this.f14668V;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.f14668V.contains(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: p */
    private void m12053p(int i) {
        this.f14665S = i;
    }

    /* JADX INFO: renamed from: q */
    private void m12054q(int i) {
        this.f14691at = i;
    }

    /* JADX INFO: renamed from: r */
    private void m12055r(int i) {
        this.f14692au = i;
    }

    /* JADX INFO: renamed from: s */
    private void m12056s(int i) {
        this.f14693av = i;
    }

    /* JADX INFO: renamed from: A */
    public final int m12057A() {
        return this.f14654H;
    }

    /* JADX INFO: renamed from: B */
    public final void m12058B() {
        this.f14654H = 1;
    }

    /* JADX INFO: renamed from: C */
    public final void m12059C() {
        this.f14655I = 1;
    }

    /* JADX INFO: renamed from: D */
    public final int m12060D() {
        return this.f14658L;
    }

    /* JADX INFO: renamed from: E */
    public final void m12061E() {
        this.f14658L = 1;
    }

    /* JADX INFO: renamed from: F */
    public final int m12062F() {
        return this.f14659M;
    }

    /* JADX INFO: renamed from: G */
    public final void m12063G() {
        this.f14659M = 1;
    }

    /* JADX INFO: renamed from: H */
    public final void m12064H() {
        this.f14652F = 1;
    }

    /* JADX INFO: renamed from: I */
    public final List<C2332b> m12065I() {
        return this.f14647A;
    }

    /* JADX INFO: renamed from: K */
    public final int m12066K() {
        return this.f14666T;
    }

    /* JADX INFO: renamed from: L */
    public final double m12067L() {
        return this.f14667U;
    }

    /* JADX INFO: renamed from: M */
    public final int m12068M() {
        return this.f14670X;
    }

    /* JADX INFO: renamed from: N */
    public final void m12069N() {
        this.f14670X = 1;
    }

    /* JADX INFO: renamed from: O */
    public final String m12070O() {
        return this.f14695z;
    }

    /* JADX INFO: renamed from: P */
    public final void m12071P() {
        this.f14669W = 3;
    }

    /* JADX INFO: renamed from: Q */
    public final Queue<Integer> m12072Q() {
        LinkedList linkedList;
        Exception e;
        List<C2332b> list;
        try {
            list = this.f14647A;
        } catch (Exception e2) {
            linkedList = null;
            e = e2;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        linkedList = new LinkedList();
        for (int i = 0; i < this.f14647A.size(); i++) {
            try {
                linkedList.add(Integer.valueOf(this.f14647A.get(i).m11964b()));
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
            }
        }
        return linkedList;
        e.printStackTrace();
        return linkedList;
    }

    /* JADX INFO: renamed from: R */
    public final JSONObject m12073R() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("unitId", this.f14694y);
            jSONObject.put(C2338b.f14595g, this.f14652F);
            List<C2332b> list = this.f14647A;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (C2332b c2332b : this.f14647A) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", c2332b.m11963a());
                    jSONObject2.put("timeout", c2332b.m11964b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f14653G);
            jSONObject.put("acn", this.f14654H);
            jSONObject.put("vcn", this.f14655I);
            jSONObject.put("cbp", this.f14656J);
            jSONObject.put("ttc_type", this.f14657K);
            jSONObject.put("offset", this.f14658L);
            jSONObject.put("dlnet", this.f14659M);
            jSONObject.put(C2338b.f14531J, this.f14660N);
            jSONObject.put(C2338b.f14532K, this.f14661O);
            jSONObject.put("ready_rate", this.f14662P);
            jSONObject.put("endscreen_type", this.f14683al);
            jSONObject.put(C2338b.f14536O, this.f14677ae);
            jSONObject.put(C2338b.f14537P, this.f14678af);
            jSONObject.put(C2338b.f14538Q, this.f14679ag);
            jSONObject.put(C2338b.f14539R, this.f14680ah);
            jSONObject.put("orientation", this.f14675ac);
            jSONObject.put(C2338b.f14540S, this.f14681ai);
            jSONObject.put("playclosebtn_tm", this.f14649C);
            jSONObject.put("play_ctdown", this.f14650D);
            jSONObject.put("close_alert", this.f14651E);
            jSONObject.put(C2338b.f14566ac, this.f14665S);
            jSONObject.put(C2338b.f14564aa, this.f14664R);
            jSONObject.put(C2338b.f14581ar, this.f14666T);
            jSONObject.put(C2338b.f14582as, this.f14667U);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<Integer> arrayList = this.f14668V;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Iterator<Integer> it = this.f14668V.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put(C2338b.f14578ao, jSONArray2);
            }
            jSONObject.put(C2338b.f14579ap, this.f14669W);
            jSONObject.put("tmorl", this.f14670X);
            jSONObject.put(C2338b.f14587ax, this.f14671Y);
            jSONObject.put("placementid", this.f14695z);
            jSONObject.put("ltafemty", this.f14672Z);
            jSONObject.put("ltorwc", this.f14673aa);
            jSONObject.put("amount_max", this.f14684am);
            jSONObject.put("callback_rule", this.f14685an);
            jSONObject.put("virtual_currency", this.f14686ao);
            jSONObject.put("amount", this.f14687ap);
            jSONObject.put("icon", this.f14688aq);
            jSONObject.put("currency_id", this.f14689ar);
            jSONObject.put("name", this.f14690as);
            jSONObject.put("isDefault", this.f14691at);
            jSONObject.put(C2338b.f14562aN, this.f14692au);
            jSONObject.put(C2338b.f14563aO, this.f14693av);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: S */
    public final int m12074S() {
        return this.f14676ad;
    }

    /* JADX INFO: renamed from: T */
    public final void m12075T() {
        this.f14676ad = 70;
    }

    /* JADX INFO: renamed from: U */
    public final int m12076U() {
        return this.f14692au;
    }

    /* JADX INFO: renamed from: V */
    public final int m12077V() {
        return this.f14693av;
    }

    /* JADX INFO: renamed from: a */
    public final int m12078a() {
        return this.f14671Y;
    }

    /* JADX INFO: renamed from: a */
    public final void m12079a(int i) {
        this.f14678af = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m12080a(String str) {
        this.f14694y = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m12081a(ArrayList<Integer> arrayList) {
        this.f14668V = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m12082a(List<C2332b> list) {
        this.f14647A = list;
    }

    /* JADX INFO: renamed from: b */
    public final int m12083b() {
        return this.f14675ac;
    }

    /* JADX INFO: renamed from: b */
    public final void m12084b(String str) {
        this.f14695z = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m12085c() {
        this.f14675ac = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m12086d() {
        this.f14677ae = 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m12087e() {
        return this.f14678af;
    }

    /* JADX INFO: renamed from: f */
    public final int m12088f() {
        return this.f14679ag;
    }

    /* JADX INFO: renamed from: g */
    public final void m12089g() {
        this.f14679ag = 2;
    }

    /* JADX INFO: renamed from: h */
    public final int m12090h() {
        return this.f14680ah;
    }

    /* JADX INFO: renamed from: i */
    public final void m12091i() {
        this.f14680ah = -1;
    }

    /* JADX INFO: renamed from: j */
    public final int m12092j() {
        return this.f14649C;
    }

    /* JADX INFO: renamed from: k */
    public final int m12093k() {
        return this.f14651E;
    }

    /* JADX INFO: renamed from: l */
    public final void m12094l() {
        this.f14651E = 1;
    }

    /* JADX INFO: renamed from: m */
    public final int m12095m() {
        return this.f14687ap;
    }

    /* JADX INFO: renamed from: n */
    public final String m12096n() {
        return this.f14690as;
    }

    /* JADX INFO: renamed from: o */
    public final int m12097o() {
        return this.f14682aj;
    }

    /* JADX INFO: renamed from: p */
    public final int m12098p() {
        return this.f14681ai;
    }

    /* JADX INFO: renamed from: q */
    public final void m12099q() {
        this.f14681ai = 1;
    }

    /* JADX INFO: renamed from: r */
    public final int m12100r() {
        return this.f14683al;
    }

    /* JADX INFO: renamed from: s */
    public final void m12101s() {
        this.f14683al = 2;
    }

    /* JADX INFO: renamed from: t */
    public final void m12102t() {
        this.f14660N = 3;
    }

    /* JADX INFO: renamed from: u */
    public final void m12103u() {
        this.f14661O = 80;
    }

    /* JADX INFO: renamed from: v */
    public final int m12104v() {
        return this.f14662P;
    }

    /* JADX INFO: renamed from: w */
    public final void m12105w() {
        this.f14662P = 100;
    }

    /* JADX INFO: renamed from: x */
    public final int m12106x() {
        return this.f14663Q;
    }

    /* JADX INFO: renamed from: y */
    public final void m12107y() {
        this.f14663Q = 0;
    }

    /* JADX INFO: renamed from: z */
    public final void m12108z() {
        this.f14653G = 1;
    }
}
