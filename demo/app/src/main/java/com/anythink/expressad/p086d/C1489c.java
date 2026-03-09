package com.anythink.expressad.p086d;

import android.text.TextUtils;
import com.anythink.expressad.p086d.p087a.C1485b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.d.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1489c {

    /* JADX INFO: renamed from: a */
    public static final int f7251a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f7252b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f7253c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f7254d = 3;

    /* JADX INFO: renamed from: A */
    private String f7255A;

    /* JADX INFO: renamed from: B */
    private int f7256B;

    /* JADX INFO: renamed from: C */
    private long f7257C;

    /* JADX INFO: renamed from: D */
    private long f7258D;

    /* JADX INFO: renamed from: F */
    private int f7260F;

    /* JADX INFO: renamed from: G */
    private int f7261G;

    /* JADX INFO: renamed from: H */
    private int f7262H;

    /* JADX INFO: renamed from: N */
    private int f7268N;

    /* JADX INFO: renamed from: P */
    private int f7270P;

    /* JADX INFO: renamed from: Q */
    private int f7271Q;

    /* JADX INFO: renamed from: e */
    private int f7272e;

    /* JADX INFO: renamed from: f */
    private int f7273f;

    /* JADX INFO: renamed from: g */
    private int f7274g;

    /* JADX INFO: renamed from: i */
    private String f7276i;

    /* JADX INFO: renamed from: j */
    private String f7277j;

    /* JADX INFO: renamed from: k */
    private List<Integer> f7278k;

    /* JADX INFO: renamed from: l */
    private long f7279l;

    /* JADX INFO: renamed from: n */
    private int f7281n;

    /* JADX INFO: renamed from: o */
    private List<Integer> f7282o;

    /* JADX INFO: renamed from: p */
    private int f7283p;

    /* JADX INFO: renamed from: q */
    private int f7284q;

    /* JADX INFO: renamed from: r */
    private int f7285r;

    /* JADX INFO: renamed from: s */
    private int f7286s;

    /* JADX INFO: renamed from: t */
    private String f7287t;

    /* JADX INFO: renamed from: u */
    private int f7288u;

    /* JADX INFO: renamed from: x */
    private int f7291x;

    /* JADX INFO: renamed from: y */
    private int f7292y;

    /* JADX INFO: renamed from: z */
    private long f7293z;

    /* JADX INFO: renamed from: h */
    private int f7275h = 30;

    /* JADX INFO: renamed from: m */
    private int f7280m = 1;

    /* JADX INFO: renamed from: v */
    private int f7289v = 1;

    /* JADX INFO: renamed from: w */
    private int f7290w = 5000;

    /* JADX INFO: renamed from: E */
    private int f7259E = 60;

    /* JADX INFO: renamed from: I */
    private String f7263I = "";

    /* JADX INFO: renamed from: J */
    private int f7264J = 10;

    /* JADX INFO: renamed from: K */
    private int f7265K = 60;

    /* JADX INFO: renamed from: L */
    private double f7266L = 1.0d;

    /* JADX INFO: renamed from: M */
    private int f7267M = 1;

    /* JADX INFO: renamed from: O */
    private int f7269O = 0;

    /* JADX INFO: renamed from: A */
    private int m6036A() {
        return this.f7262H;
    }

    /* JADX INFO: renamed from: B */
    private int m6037B() {
        return this.f7267M;
    }

    /* JADX INFO: renamed from: C */
    private int m6038C() {
        return this.f7271Q;
    }

    /* JADX INFO: renamed from: D */
    private String m6039D() {
        return this.f7287t;
    }

    /* JADX INFO: renamed from: E */
    private int m6040E() {
        return this.f7288u;
    }

    /* JADX INFO: renamed from: F */
    private int m6041F() {
        return this.f7270P;
    }

    /* JADX INFO: renamed from: G */
    private long m6042G() {
        return this.f7257C;
    }

    /* JADX INFO: renamed from: H */
    private long m6043H() {
        return this.f7258D;
    }

    /* JADX INFO: renamed from: I */
    private String m6044I() {
        return this.f7255A;
    }

    /* JADX INFO: renamed from: J */
    private int m6045J() {
        return this.f7256B;
    }

    /* JADX INFO: renamed from: K */
    private int m6046K() {
        return this.f7272e;
    }

    /* JADX INFO: renamed from: L */
    private int m6047L() {
        return this.f7273f;
    }

    /* JADX INFO: renamed from: M */
    private int m6048M() {
        return this.f7274g;
    }

    /* JADX INFO: renamed from: N */
    private int m6049N() {
        int i = this.f7275h;
        if (i <= 0 || i > 100) {
            this.f7275h = 30;
        }
        return this.f7275h;
    }

    /* JADX INFO: renamed from: O */
    private static C1489c m6050O() {
        return new C1489c();
    }

    /* JADX INFO: renamed from: P */
    private int m6051P() {
        return this.f7286s;
    }

    /* JADX INFO: renamed from: Q */
    private int m6052Q() {
        return this.f7289v;
    }

    /* JADX INFO: renamed from: R */
    private int m6053R() {
        return this.f7290w;
    }

    /* JADX INFO: renamed from: S */
    private int m6054S() {
        return this.f7283p;
    }

    /* JADX INFO: renamed from: T */
    private int m6055T() {
        return this.f7284q;
    }

    /* JADX INFO: renamed from: U */
    private int m6056U() {
        return this.f7285r;
    }

    /* JADX INFO: renamed from: V */
    private String m6057V() {
        return this.f7276i;
    }

    /* JADX INFO: renamed from: W */
    private List<Integer> m6058W() {
        return this.f7278k;
    }

    /* JADX INFO: renamed from: X */
    private List<Integer> m6059X() {
        return this.f7282o;
    }

    /* JADX INFO: renamed from: Y */
    private long m6060Y() {
        return this.f7279l;
    }

    /* JADX INFO: renamed from: Z */
    private int m6061Z() {
        return this.f7281n;
    }

    /* JADX INFO: renamed from: a */
    private void m6062a(double d) {
        this.f7266L = d;
    }

    /* JADX INFO: renamed from: a */
    private void m6063a(long j) {
        this.f7257C = j;
    }

    /* JADX INFO: renamed from: aa */
    private String m6064aa() {
        return this.f7263I;
    }

    /* JADX INFO: renamed from: ab */
    private int m6065ab() {
        return this.f7264J;
    }

    /* JADX INFO: renamed from: ac */
    private int m6066ac() {
        return this.f7265K;
    }

    /* JADX INFO: renamed from: b */
    public static C1489c m6067b(String str) {
        C1489c c1489c = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            C1489c c1489c2 = new C1489c();
            try {
                JSONObject jSONObject = new JSONObject(str);
                c1489c2.f7276i = jSONObject.optString("unitId");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("adSourceList");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i)));
                    }
                    c1489c2.f7278k = arrayList;
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.optInt(i2)));
                    }
                    c1489c2.f7282o = arrayList2;
                }
                c1489c2.f7283p = jSONObject.optInt(C1485b.f6962J);
                c1489c2.f7284q = jSONObject.optInt("aqn");
                c1489c2.f7285r = jSONObject.optInt("acn");
                c1489c2.f7286s = jSONObject.optInt(C1485b.f6970R);
                int i3 = 1;
                c1489c2.f7289v = jSONObject.optInt(C1485b.f6971S, 1);
                c1489c2.f7290w = jSONObject.optInt(C1485b.f6972T, 5000);
                c1489c2.f7279l = jSONObject.optLong("current_time");
                c1489c2.f7280m = jSONObject.optInt("offset");
                c1489c2.f7293z = jSONObject.optLong("dlct", C1485b.f6968P);
                c1489c2.f7291x = jSONObject.optInt(C1485b.f7003aX, 0);
                c1489c2.f7292y = jSONObject.optInt("dlnet", 2);
                c1489c2.f7255A = jSONObject.optString(C1485b.f6991aL);
                c1489c2.f7256B = jSONObject.optInt(C1485b.f6992aM);
                c1489c2.f7257C = jSONObject.optLong(C1485b.f6993aN, C1485b.f6999aT);
                c1489c2.f7258D = jSONObject.optLong(C1485b.f6994aO, 300L);
                c1489c2.m6096c(jSONObject.optInt("ready_rate", 100));
                c1489c2.m6098d(jSONObject.optInt("cd_rate", 0));
                c1489c2.f7270P = jSONObject.optInt("content", 1);
                c1489c2.f7271Q = jSONObject.optInt(C1485b.f7035bC, 0);
                c1489c2.f7288u = jSONObject.optInt(C1485b.f7117cf, 1);
                c1489c2.f7287t = jSONObject.optString(C1485b.f7115cd, "");
                c1489c2.f7272e = jSONObject.optInt("playclosebtn_tm", -1);
                c1489c2.f7273f = jSONObject.optInt("play_ctdown", 0);
                c1489c2.f7274g = jSONObject.optInt("close_alert", 0);
                c1489c2.f7275h = jSONObject.optInt(C1485b.f7129cr, 30);
                c1489c2.f7259E = jSONObject.optInt(C1485b.f7166db, 60);
                c1489c2.f7260F = jSONObject.optInt(C1485b.f7168dd, 0);
                int iOptInt = jSONObject.optInt("tmorl", 1);
                if (iOptInt <= 2 && iOptInt > 0) {
                    i3 = iOptInt;
                }
                c1489c2.f7267M = i3;
                c1489c2.f7263I = jSONObject.optString("placementid", "");
                c1489c2.f7264J = jSONObject.optInt("ltafemty", 10);
                c1489c2.f7265K = jSONObject.optInt("ltorwc", 60);
                return c1489c2;
            } catch (Exception e) {
                e = e;
                c1489c = c1489c2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        e.printStackTrace();
        return c1489c;
    }

    /* JADX INFO: renamed from: b */
    private void m6068b(long j) {
        this.f7258D = j;
    }

    /* JADX INFO: renamed from: c */
    public static C1489c m6069c(String str) {
        C1489c c1489c = new C1489c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        c1489c.f7280m = 1;
        c1489c.f7276i = str;
        c1489c.f7278k = arrayList;
        c1489c.f7282o = arrayList2;
        c1489c.f7283p = 1;
        c1489c.f7285r = -2;
        c1489c.f7284q = -2;
        c1489c.f7286s = 5;
        c1489c.f7293z = C1485b.f6968P;
        c1489c.f7292y = 2;
        c1489c.f7291x = 1;
        c1489c.m6096c(100);
        c1489c.m6098d(0);
        c1489c.f7270P = 1;
        c1489c.f7271Q = 0;
        c1489c.f7259E = 60;
        c1489c.f7264J = 10;
        c1489c.f7265K = 60;
        return c1489c;
    }

    /* JADX INFO: renamed from: c */
    private static Queue<Integer> m6070c(List<Integer> list) {
        LinkedList linkedList = new LinkedList();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (Integer num : list) {
                        if (num != null) {
                            linkedList.add(num);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: c */
    private void m6071c(long j) {
        this.f7279l = j;
    }

    /* JADX INFO: renamed from: d */
    public static C1489c m6072d(String str) {
        C1489c c1489c = new C1489c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            c1489c.f7278k = arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(30);
            c1489c.f7282o = arrayList2;
            c1489c.f7276i = str;
            c1489c.f7280m = 1;
            c1489c.f7283p = 1;
            c1489c.f7285r = -2;
            c1489c.f7284q = -2;
            c1489c.f7286s = 5;
            c1489c.f7293z = C1485b.f6968P;
            c1489c.f7292y = 2;
            c1489c.f7291x = 3;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c1489c;
    }

    /* JADX INFO: renamed from: d */
    private Queue<Integer> m6073d(List<Integer> list) {
        LinkedList linkedList = new LinkedList();
        try {
            List<Integer> list2 = this.f7278k;
            if (list2 != null && list2.size() > 0) {
                for (Integer num : list) {
                    if (num != null) {
                        linkedList.add(Integer.valueOf(num.intValue() * 1000));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: e */
    private void m6074e(int i) {
        this.f7267M = i;
    }

    /* JADX INFO: renamed from: f */
    private void m6075f(int i) {
        this.f7260F = i;
    }

    /* JADX INFO: renamed from: f */
    private void m6076f(String str) {
        this.f7287t = str;
    }

    /* JADX INFO: renamed from: g */
    private void m6077g(int i) {
        this.f7288u = i;
    }

    /* JADX INFO: renamed from: g */
    private void m6078g(String str) {
        this.f7255A = str;
    }

    /* JADX INFO: renamed from: h */
    private void m6079h(int i) {
        this.f7256B = i;
    }

    /* JADX INFO: renamed from: i */
    private void m6080i(int i) {
        this.f7272e = i;
    }

    /* JADX INFO: renamed from: j */
    private void m6081j(int i) {
        this.f7273f = i;
    }

    /* JADX INFO: renamed from: k */
    private void m6082k(int i) {
        this.f7274g = i;
    }

    /* JADX INFO: renamed from: l */
    private void m6083l(int i) {
        this.f7275h = i;
    }

    /* JADX INFO: renamed from: m */
    private void m6084m(int i) {
        this.f7289v = i;
    }

    /* JADX INFO: renamed from: n */
    private void m6085n(int i) {
        this.f7290w = i;
    }

    /* JADX INFO: renamed from: y */
    public static C1489c m6086y() {
        C1489c c1489c = new C1489c();
        c1489c.f7291x = 0;
        return c1489c;
    }

    /* JADX INFO: renamed from: z */
    private int m6087z() {
        return this.f7261G;
    }

    /* JADX INFO: renamed from: a */
    public final double m6088a() {
        return this.f7266L;
    }

    /* JADX INFO: renamed from: a */
    public final void m6089a(int i) {
        this.f7261G = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m6090a(String str) {
        this.f7276i = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m6091a(List<Integer> list) {
        this.f7278k = list;
    }

    /* JADX INFO: renamed from: b */
    public final int m6092b() {
        return this.f7259E;
    }

    /* JADX INFO: renamed from: b */
    public final void m6093b(int i) {
        this.f7262H = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m6094b(List<Integer> list) {
        this.f7282o = list;
    }

    /* JADX INFO: renamed from: c */
    public final void m6095c() {
        this.f7259E = 60;
    }

    /* JADX INFO: renamed from: c */
    public final void m6096c(int i) {
        try {
            this.f7268N = i;
        } catch (Exception unused) {
            this.f7268N = 100;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m6097d() {
        return this.f7260F;
    }

    /* JADX INFO: renamed from: d */
    public final void m6098d(int i) {
        try {
            this.f7269O = i;
        } catch (Exception unused) {
            this.f7269O = 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6099e() {
        this.f7271Q = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m6100e(String str) {
        this.f7263I = str;
    }

    /* JADX INFO: renamed from: f */
    public final int m6101f() {
        return this.f7268N;
    }

    /* JADX INFO: renamed from: g */
    public final int m6102g() {
        return this.f7269O;
    }

    /* JADX INFO: renamed from: h */
    public final void m6103h() {
        this.f7270P = 1;
    }

    /* JADX INFO: renamed from: i */
    public final long m6104i() {
        return this.f7293z;
    }

    /* JADX INFO: renamed from: j */
    public final void m6105j() {
        this.f7292y = 2;
    }

    /* JADX INFO: renamed from: k */
    public final int m6106k() {
        return this.f7291x;
    }

    /* JADX INFO: renamed from: l */
    public final void m6107l() {
        this.f7291x = 1;
    }

    /* JADX INFO: renamed from: m */
    public final int m6108m() {
        return this.f7292y;
    }

    /* JADX INFO: renamed from: n */
    public final void m6109n() {
        this.f7293z = C1485b.f6968P;
    }

    /* JADX INFO: renamed from: o */
    public final void m6110o() {
        this.f7286s = 5;
    }

    /* JADX INFO: renamed from: p */
    public final void m6111p() {
        this.f7283p = 1;
    }

    /* JADX INFO: renamed from: q */
    public final void m6112q() {
        this.f7284q = -2;
    }

    /* JADX INFO: renamed from: r */
    public final void m6113r() {
        this.f7285r = -2;
    }

    /* JADX INFO: renamed from: s */
    public final JSONObject m6114s() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> list = this.f7278k;
            if (list != null && list.size() > 0) {
                int size = this.f7278k.size();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(this.f7278k.get(i));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> list2 = this.f7282o;
            if (list2 != null && list2.size() > 0) {
                int size2 = this.f7282o.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < size2; i2++) {
                    jSONArray2.put(this.f7282o.get(i2));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put(C1485b.f6962J, this.f7283p);
            jSONObject.put("aqn", this.f7284q);
            jSONObject.put("acn", this.f7285r);
            jSONObject.put(C1485b.f6970R, this.f7286s);
            jSONObject.put("current_time", this.f7279l);
            jSONObject.put("offset", this.f7280m);
            jSONObject.put("dlct", this.f7293z);
            jSONObject.put(C1485b.f7003aX, this.f7291x);
            jSONObject.put("dlnet", this.f7292y);
            jSONObject.put(C1485b.f6991aL, this.f7255A);
            jSONObject.put(C1485b.f6992aM, this.f7256B);
            jSONObject.put(C1485b.f6993aN, this.f7257C);
            jSONObject.put(C1485b.f6994aO, this.f7258D);
            jSONObject.put("ready_rate", this.f7268N);
            jSONObject.put("content", this.f7270P);
            jSONObject.put(C1485b.f7035bC, this.f7271Q);
            jSONObject.put(C1485b.f7117cf, this.f7288u);
            jSONObject.put(C1485b.f7115cd, this.f7287t);
            jSONObject.put("playclosebtn_tm", this.f7272e);
            jSONObject.put("play_ctdown", this.f7273f);
            jSONObject.put("close_alert", this.f7274g);
            jSONObject.put(C1485b.f7168dd, this.f7260F);
            jSONObject.put(C1485b.f7166db, this.f7259E);
            jSONObject.put(C1485b.f7175dk, this.f7262H);
            jSONObject.put(C1485b.f7177dm, this.f7261G);
            jSONObject.put("tmorl", this.f7267M);
            jSONObject.put("unitId", this.f7276i);
            jSONObject.put("placementid", this.f7263I);
            jSONObject.put("ltafemty", this.f7264J);
            jSONObject.put("ltorwc", this.f7265K);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: t */
    public final int m6115t() {
        return this.f7280m;
    }

    public final String toString() {
        List<Integer> list = this.f7278k;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f7278k.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        return "offset = " + this.f7280m + " unitId = " + this.f7276i + " fbPlacementId = " + this.f7277j + str;
    }

    /* JADX INFO: renamed from: u */
    public final void m6116u() {
        this.f7280m = 1;
    }

    /* JADX INFO: renamed from: v */
    public final void m6117v() {
        this.f7281n = 2;
    }

    /* JADX INFO: renamed from: w */
    public final void m6118w() {
        this.f7264J = 10;
    }

    /* JADX INFO: renamed from: x */
    public final void m6119x() {
        this.f7265K = 60;
    }
}
