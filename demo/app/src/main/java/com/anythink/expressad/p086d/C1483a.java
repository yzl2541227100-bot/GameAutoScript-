package com.anythink.expressad.p086d;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1780b;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p138h.C1874h;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1876j;
import com.anythink.expressad.foundation.p138h.C1889w;
import com.anythink.expressad.p086d.p087a.C1485b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1483a {

    /* JADX INFO: renamed from: A */
    private int f6819A;

    /* JADX INFO: renamed from: B */
    private String f6820B;

    /* JADX INFO: renamed from: C */
    private long f6821C;

    /* JADX INFO: renamed from: D */
    private int f6822D;

    /* JADX INFO: renamed from: E */
    private long f6823E;

    /* JADX INFO: renamed from: F */
    private long f6824F;

    /* JADX INFO: renamed from: G */
    private int f6825G;

    /* JADX INFO: renamed from: H */
    private int f6826H;

    /* JADX INFO: renamed from: I */
    private int f6827I;

    /* JADX INFO: renamed from: J */
    private String f6828J;

    /* JADX INFO: renamed from: K */
    private String f6829K;

    /* JADX INFO: renamed from: L */
    private int f6830L;

    /* JADX INFO: renamed from: M */
    private List<C1781c> f6831M;

    /* JADX INFO: renamed from: N */
    private List<C1780b> f6832N;

    /* JADX INFO: renamed from: R */
    private int f6836R;

    /* JADX INFO: renamed from: S */
    private LinkedList<String> f6837S;

    /* JADX INFO: renamed from: Y */
    private int f6843Y;

    /* JADX INFO: renamed from: Z */
    private List<String> f6844Z;

    /* JADX INFO: renamed from: aE */
    private int f6850aE;

    /* JADX INFO: renamed from: aG */
    private long f6852aG;

    /* JADX INFO: renamed from: aH */
    private long f6853aH;

    /* JADX INFO: renamed from: aI */
    private int f6854aI;

    /* JADX INFO: renamed from: aJ */
    private int f6855aJ;

    /* JADX INFO: renamed from: aK */
    private long f6856aK;

    /* JADX INFO: renamed from: aM */
    private int f6858aM;

    /* JADX INFO: renamed from: aa */
    private int f6872aa;

    /* JADX INFO: renamed from: ab */
    private int f6873ab;

    /* JADX INFO: renamed from: ac */
    private int f6874ac;

    /* JADX INFO: renamed from: ad */
    private int f6875ad;

    /* JADX INFO: renamed from: ae */
    private String f6876ae;

    /* JADX INFO: renamed from: af */
    private String f6877af;

    /* JADX INFO: renamed from: ao */
    private String f6886ao;

    /* JADX INFO: renamed from: b */
    private String f6898b;

    /* JADX INFO: renamed from: be */
    private Map<String, a> f6903be;

    /* JADX INFO: renamed from: bg */
    private b f6905bg;

    /* JADX INFO: renamed from: bl */
    private String f6910bl;

    /* JADX INFO: renamed from: bm */
    private String f6911bm;

    /* JADX INFO: renamed from: c */
    private long f6921c;

    /* JADX INFO: renamed from: d */
    private int f6922d;

    /* JADX INFO: renamed from: f */
    private int f6924f;

    /* JADX INFO: renamed from: g */
    private boolean f6925g;

    /* JADX INFO: renamed from: h */
    private Map<String, String> f6926h;

    /* JADX INFO: renamed from: i */
    private boolean f6927i;

    /* JADX INFO: renamed from: j */
    private long f6928j;

    /* JADX INFO: renamed from: l */
    private List<C1489c> f6930l;

    /* JADX INFO: renamed from: m */
    private boolean f6931m;

    /* JADX INFO: renamed from: n */
    private long f6932n;

    /* JADX INFO: renamed from: o */
    private long f6933o;

    /* JADX INFO: renamed from: p */
    private long f6934p;

    /* JADX INFO: renamed from: q */
    private boolean f6935q;

    /* JADX INFO: renamed from: r */
    private int f6936r;

    /* JADX INFO: renamed from: s */
    private int f6937s;

    /* JADX INFO: renamed from: t */
    private int f6938t;

    /* JADX INFO: renamed from: u */
    private long f6939u;

    /* JADX INFO: renamed from: v */
    private List<String> f6940v;

    /* JADX INFO: renamed from: w */
    private int f6941w;

    /* JADX INFO: renamed from: x */
    private int f6942x;

    /* JADX INFO: renamed from: y */
    private int f6943y;

    /* JADX INFO: renamed from: z */
    private int f6944z;

    /* JADX INFO: renamed from: a */
    private int f6845a = 0;

    /* JADX INFO: renamed from: e */
    private long f6923e = C1485b.f6999aT;

    /* JADX INFO: renamed from: k */
    private String f6929k = "";

    /* JADX INFO: renamed from: O */
    private boolean f6833O = false;

    /* JADX INFO: renamed from: P */
    private int f6834P = 3;

    /* JADX INFO: renamed from: Q */
    private boolean f6835Q = true;

    /* JADX INFO: renamed from: T */
    private int f6838T = 0;

    /* JADX INFO: renamed from: U */
    private int f6839U = C1485b.f7122ck;

    /* JADX INFO: renamed from: V */
    private int f6840V = 10;

    /* JADX INFO: renamed from: W */
    private int f6841W = 120;

    /* JADX INFO: renamed from: X */
    private String f6842X = "";

    /* JADX INFO: renamed from: ag */
    private int f6878ag = 1;

    /* JADX INFO: renamed from: ah */
    private int f6879ah = 1;

    /* JADX INFO: renamed from: ai */
    private int f6880ai = 1;

    /* JADX INFO: renamed from: aj */
    private int f6881aj = 0;

    /* JADX INFO: renamed from: ak */
    private int f6882ak = 1;

    /* JADX INFO: renamed from: al */
    private String f6883al = "";

    /* JADX INFO: renamed from: am */
    private int f6884am = 0;

    /* JADX INFO: renamed from: an */
    private int f6885an = 2;

    /* JADX INFO: renamed from: ap */
    private int f6887ap = 86400;

    /* JADX INFO: renamed from: aq */
    private String f6888aq = "LdxThdi1WBK\\/WgfPhbxQYkeXHBPwHZKAJ7eXHM==";

    /* JADX INFO: renamed from: ar */
    private String f6889ar = "LdxThdi1WBK\\/WgfPhbxQYkeXHBPwHZKsYFh=";

    /* JADX INFO: renamed from: as */
    private int f6890as = 1;

    /* JADX INFO: renamed from: at */
    private int f6891at = 30;

    /* JADX INFO: renamed from: au */
    private int f6892au = 5;

    /* JADX INFO: renamed from: av */
    private int f6893av = 0;

    /* JADX INFO: renamed from: aw */
    private int f6894aw = 0;

    /* JADX INFO: renamed from: ax */
    private int f6895ax = 9377;

    /* JADX INFO: renamed from: ay */
    private int f6896ay = 0;

    /* JADX INFO: renamed from: az */
    private int f6897az = 0;

    /* JADX INFO: renamed from: aA */
    private int f6846aA = 0;

    /* JADX INFO: renamed from: aB */
    private int f6847aB = 2;

    /* JADX INFO: renamed from: aC */
    private int f6848aC = 10;

    /* JADX INFO: renamed from: aD */
    private List<Integer> f6849aD = new ArrayList();

    /* JADX INFO: renamed from: aF */
    private int f6851aF = 1;

    /* JADX INFO: renamed from: aL */
    private int f6857aL = 3;

    /* JADX INFO: renamed from: aN */
    private String f6859aN = "";

    /* JADX INFO: renamed from: aO */
    private String f6860aO = "";

    /* JADX INFO: renamed from: aP */
    private String f6861aP = "";

    /* JADX INFO: renamed from: aQ */
    private String f6862aQ = "";

    /* JADX INFO: renamed from: aR */
    private String f6863aR = "";

    /* JADX INFO: renamed from: aS */
    private int f6864aS = 0;

    /* JADX INFO: renamed from: aT */
    private int f6865aT = 21600;

    /* JADX INFO: renamed from: aU */
    private int f6866aU = 2;

    /* JADX INFO: renamed from: aV */
    private int f6867aV = 0;

    /* JADX INFO: renamed from: aW */
    private int f6868aW = 0;

    /* JADX INFO: renamed from: aX */
    private int f6869aX = 604800;

    /* JADX INFO: renamed from: aY */
    private int f6870aY = 0;

    /* JADX INFO: renamed from: aZ */
    private String f6871aZ = "";

    /* JADX INFO: renamed from: ba */
    private String f6899ba = "";

    /* JADX INFO: renamed from: bb */
    private String f6900bb = "";

    /* JADX INFO: renamed from: bc */
    private String f6901bc = "";

    /* JADX INFO: renamed from: bd */
    private String f6902bd = "";

    /* JADX INFO: renamed from: bf */
    private int f6904bf = 0;

    /* JADX INFO: renamed from: bh */
    private int f6906bh = 0;

    /* JADX INFO: renamed from: bi */
    private String f6907bi = "";

    /* JADX INFO: renamed from: bj */
    private int f6908bj = 2;

    /* JADX INFO: renamed from: bk */
    private int f6909bk = 7200;

    /* JADX INFO: renamed from: bn */
    private int f6912bn = 0;

    /* JADX INFO: renamed from: bo */
    private boolean f6913bo = false;

    /* JADX INFO: renamed from: bp */
    private int f6914bp = 1;

    /* JADX INFO: renamed from: bq */
    private int f6915bq = 0;

    /* JADX INFO: renamed from: br */
    private int f6916br = 0;

    /* JADX INFO: renamed from: bs */
    private int f6917bs = 0;

    /* JADX INFO: renamed from: bt */
    private int f6918bt = 3;

    /* JADX INFO: renamed from: bu */
    private int f6919bu = 600;

    /* JADX INFO: renamed from: bv */
    private int f6920bv = 10;

    /* JADX INFO: renamed from: com.anythink.expressad.d.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private List<String> f6945a;

        /* JADX INFO: renamed from: b */
        private List<String> f6946b;

        /* JADX INFO: renamed from: c */
        private List<String> f6947c;

        /* JADX INFO: renamed from: d */
        private List<String> f6948d;

        /* JADX INFO: renamed from: a */
        private List<String> m5984a() {
            return this.f6945a;
        }

        /* JADX INFO: renamed from: a */
        private void m5985a(List<String> list) {
            this.f6945a = list;
        }

        /* JADX INFO: renamed from: b */
        private List<String> m5986b() {
            return this.f6946b;
        }

        /* JADX INFO: renamed from: b */
        private void m5987b(List<String> list) {
            this.f6946b = list;
        }

        /* JADX INFO: renamed from: c */
        private List<String> m5988c() {
            return this.f6947c;
        }

        /* JADX INFO: renamed from: c */
        private void m5989c(List<String> list) {
            this.f6947c = list;
        }

        /* JADX INFO: renamed from: d */
        private List<String> m5990d() {
            return this.f6948d;
        }

        /* JADX INFO: renamed from: d */
        private void m5991d(List<String> list) {
            this.f6948d = list;
        }

        /* JADX INFO: renamed from: a */
        public final void m5992a(JSONObject jSONObject) {
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("x");
                if (jSONArrayOptJSONArray != null) {
                    this.f6945a = C1874h.m9683a(jSONArrayOptJSONArray);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("y");
                if (jSONArrayOptJSONArray2 != null) {
                    this.f6946b = C1874h.m9683a(jSONArrayOptJSONArray2);
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("width");
                if (jSONArrayOptJSONArray3 != null) {
                    this.f6947c = C1874h.m9683a(jSONArrayOptJSONArray3);
                }
                JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("height");
                if (jSONArrayOptJSONArray4 != null) {
                    this.f6948d = C1874h.m9683a(jSONArrayOptJSONArray4);
                }
            } catch (Exception e) {
                if (C1404a.f6209a) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.d.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private String f6949a;

        /* JADX INFO: renamed from: b */
        private String f6950b;

        /* JADX INFO: renamed from: c */
        private String f6951c;

        /* JADX INFO: renamed from: d */
        private JSONArray f6952d;

        /* JADX INFO: renamed from: a */
        public static b m5993a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            b bVar = new b();
            Context contextM2148f = C1175n.m2059a().m2148f();
            bVar.f6949a = jSONObject.optString("title", contextM2148f.getString(C1875i.m9684a(contextM2148f, "anythink_cm_feedback_dialog_title", C1875i.f11532g)));
            bVar.f6950b = jSONObject.optString(C1485b.f7153dO, contextM2148f.getString(C1875i.m9684a(contextM2148f, "anythink_cm_feedback_dialog_close_close", C1875i.f11532g)));
            bVar.f6951c = jSONObject.optString(C1485b.f7154dP, contextM2148f.getString(C1875i.m9684a(contextM2148f, "anythink_cm_feedback_dialog_close_submit", C1875i.f11532g)));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("content");
            bVar.f6952d = jSONArrayOptJSONArray;
            if (jSONArrayOptJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                bVar.f6952d = jSONArray;
                jSONArray.put(contextM2148f.getString(C1875i.m9684a(contextM2148f, "anythink_cm_feedback_dialog_content_stuck", C1875i.f11532g)));
                bVar.f6952d.put(contextM2148f.getString(C1875i.m9684a(contextM2148f, "anythink_cm_feedback_dialog_content_cnr", C1875i.f11532g)));
                bVar.f6952d.put(contextM2148f.getString(C1875i.m9684a(contextM2148f, "anythink_cm_feedback_dialog_content_balck_screen", C1875i.f11532g)));
                bVar.f6952d.put(contextM2148f.getString(C1875i.m9684a(contextM2148f, "anythink_cm_feedback_dialog_content_other", C1875i.f11532g)));
            }
            return bVar;
        }

        /* JADX INFO: renamed from: a */
        private void m5994a(String str) {
            this.f6949a = str;
        }

        /* JADX INFO: renamed from: a */
        private void m5995a(JSONArray jSONArray) {
            this.f6952d = jSONArray;
        }

        /* JADX INFO: renamed from: b */
        private void m5996b(String str) {
            this.f6950b = str;
        }

        /* JADX INFO: renamed from: c */
        private void m5997c(String str) {
            this.f6951c = str;
        }

        /* JADX INFO: renamed from: a */
        public final String m5998a() {
            return this.f6949a;
        }

        /* JADX INFO: renamed from: b */
        public final String m5999b() {
            return this.f6950b;
        }

        /* JADX INFO: renamed from: c */
        public final String m6000c() {
            return this.f6951c;
        }

        /* JADX INFO: renamed from: d */
        public final JSONArray m6001d() {
            return this.f6952d;
        }
    }

    /* JADX INFO: renamed from: A */
    private void m5727A(int i) {
        this.f6938t = i;
    }

    /* JADX INFO: renamed from: A */
    private void m5728A(String str) {
        this.f6911bm = str;
    }

    /* JADX INFO: renamed from: B */
    private void m5729B(int i) {
        this.f6819A = i;
    }

    /* JADX INFO: renamed from: C */
    private void m5730C(int i) {
        this.f6942x = i;
    }

    /* JADX INFO: renamed from: D */
    private void m5731D(int i) {
        this.f6943y = i;
    }

    /* JADX INFO: renamed from: E */
    private void m5732E(int i) {
        this.f6944z = i;
    }

    /* JADX INFO: renamed from: F */
    private void m5733F(int i) {
        this.f6857aL = i;
    }

    /* JADX INFO: renamed from: G */
    private void m5734G(int i) {
        this.f6854aI = i;
    }

    /* JADX INFO: renamed from: H */
    private void m5735H(int i) {
        this.f6855aJ = i;
    }

    /* JADX INFO: renamed from: I */
    private void m5736I(int i) {
        this.f6924f = i;
    }

    /* JADX INFO: renamed from: J */
    private void m5737J(int i) {
        this.f6936r = i;
    }

    /* JADX INFO: renamed from: K */
    private void m5738K(int i) {
        this.f6937s = i;
    }

    /* JADX INFO: renamed from: L */
    private void m5739L(int i) {
        this.f6870aY = i;
    }

    /* JADX INFO: renamed from: M */
    private void m5740M(int i) {
        this.f6864aS = i;
    }

    /* JADX INFO: renamed from: N */
    private void m5741N(int i) {
        this.f6865aT = i;
    }

    /* JADX INFO: renamed from: O */
    private void m5742O(int i) {
        this.f6866aU = i;
    }

    /* JADX INFO: renamed from: P */
    private void m5743P(int i) {
        this.f6867aV = i;
    }

    /* JADX INFO: renamed from: Q */
    private void m5744Q(int i) {
        this.f6868aW = i;
    }

    /* JADX INFO: renamed from: R */
    private void m5745R(int i) {
        this.f6869aX = i;
    }

    /* JADX INFO: renamed from: S */
    private void m5746S(int i) {
        this.f6891at = i;
    }

    /* JADX INFO: renamed from: T */
    private void m5747T(int i) {
        this.f6892au = i;
    }

    /* JADX INFO: renamed from: U */
    private void m5748U(int i) {
        this.f6893av = i;
    }

    /* JADX INFO: renamed from: V */
    private void m5749V(int i) {
        this.f6894aw = i;
    }

    /* JADX INFO: renamed from: W */
    private void m5750W(int i) {
        this.f6895ax = i;
    }

    /* JADX INFO: renamed from: X */
    private int m5751X() {
        return this.f6836R;
    }

    /* JADX INFO: renamed from: X */
    private void m5752X(int i) {
        this.f6834P = i;
    }

    /* JADX INFO: renamed from: Y */
    private List<C1780b> m5753Y() {
        return this.f6832N;
    }

    /* JADX INFO: renamed from: Y */
    private void m5754Y(int i) {
        this.f6904bf = i;
    }

    /* JADX INFO: renamed from: Z */
    private String m5755Z() {
        return this.f6842X;
    }

    /* JADX INFO: renamed from: Z */
    private void m5756Z(int i) {
        this.f6906bh = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x008f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m5757a(android.content.Context r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "{android_id_md5_upper}"
            java.lang.String r1 = "{android_id}"
            java.lang.String r2 = ""
            com.anythink.expressad.p086d.C1486b.m6002a()     // Catch: java.lang.Throwable -> L90
            com.anythink.expressad.foundation.b.a r3 = com.anythink.expressad.foundation.p113b.C1773a.m8548c()     // Catch: java.lang.Throwable -> L90
            r3.m8558f()     // Catch: java.lang.Throwable -> L90
            com.anythink.expressad.d.a r3 = com.anythink.expressad.p086d.C1486b.m6007b()     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L90
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.f6926h     // Catch: java.lang.Throwable -> L90
            if (r4 != 0) goto L1c
            goto L90
        L1c:
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L90
            java.lang.String r8 = r8.getHost()     // Catch: java.lang.Throwable -> L90
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.f6926h     // Catch: java.lang.Throwable -> L90
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L90
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L90
        L2e:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L90
            if (r5 == 0) goto L90
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L90
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L90
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L90
            boolean r6 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L90
            if (r6 != 0) goto L2e
            boolean r6 = r8.contains(r5)     // Catch: java.lang.Throwable -> L90
            if (r6 == 0) goto L2e
            java.util.Map<java.lang.String, java.lang.String> r8 = r3.f6926h     // Catch: java.lang.Throwable -> L90
            java.lang.Object r8 = r8.get(r5)     // Catch: java.lang.Throwable -> L90
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L90
            boolean r3 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L5b
            return r2
        L5b:
            java.lang.String r3 = "{gaid}"
            java.lang.String r4 = com.anythink.core.common.p066o.C1341e.m4065f()     // Catch: java.lang.Throwable -> L90
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Throwable -> L90
            boolean r3 = r8.contains(r1)     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L7a
            java.lang.String r0 = com.anythink.core.common.p066o.C1341e.m4060d(r7)     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L8f
            java.lang.String r7 = com.anythink.core.common.p066o.C1341e.m4060d(r7)     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = r8.replace(r1, r7)     // Catch: java.lang.Throwable -> L90
            goto L90
        L7a:
            boolean r1 = r8.contains(r0)     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L8f
            java.lang.String r1 = com.anythink.core.common.p066o.C1341e.m4063e(r7)     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L8f
            java.lang.String r7 = com.anythink.core.common.p066o.C1341e.m4063e(r7)     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = r8.replace(r0, r7)     // Catch: java.lang.Throwable -> L90
            goto L90
        L8f:
            r2 = r8
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.p086d.C1483a.m5757a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: a */
    private void m5758a(long j) {
        this.f6823E = j;
    }

    /* JADX INFO: renamed from: a */
    private void m5759a(b bVar) {
        this.f6905bg = bVar;
    }

    /* JADX INFO: renamed from: a */
    private void m5760a(LinkedList<String> linkedList) {
        this.f6837S = linkedList;
    }

    /* JADX INFO: renamed from: a */
    private void m5761a(List<C1780b> list) {
        this.f6832N = list;
    }

    /* JADX INFO: renamed from: a */
    private void m5762a(Map<String, String> map) {
        this.f6926h = map;
    }

    /* JADX INFO: renamed from: a */
    private void m5763a(boolean z) {
        this.f6925g = z;
    }

    /* JADX INFO: renamed from: aA */
    private int m5764aA() {
        return this.f6850aE;
    }

    /* JADX INFO: renamed from: aB */
    private int m5765aB() {
        return this.f6843Y;
    }

    /* JADX INFO: renamed from: aC */
    private List<String> m5766aC() {
        return this.f6844Z;
    }

    /* JADX INFO: renamed from: aD */
    private int m5767aD() {
        return this.f6872aa;
    }

    /* JADX INFO: renamed from: aE */
    private int m5768aE() {
        return this.f6873ab;
    }

    /* JADX INFO: renamed from: aF */
    private int m5769aF() {
        return this.f6874ac;
    }

    /* JADX INFO: renamed from: aG */
    private int m5770aG() {
        return this.f6875ad;
    }

    /* JADX INFO: renamed from: aH */
    private String m5771aH() {
        return this.f6876ae;
    }

    /* JADX INFO: renamed from: aI */
    private int m5772aI() {
        return this.f6825G;
    }

    /* JADX INFO: renamed from: aJ */
    private int m5773aJ() {
        return this.f6826H;
    }

    /* JADX INFO: renamed from: aK */
    private List<C1781c> m5774aK() {
        return this.f6831M;
    }

    /* JADX INFO: renamed from: aL */
    private int m5775aL() {
        return this.f6827I;
    }

    /* JADX INFO: renamed from: aM */
    private String m5776aM() {
        return this.f6828J;
    }

    /* JADX INFO: renamed from: aN */
    private int m5777aN() {
        return this.f6822D;
    }

    /* JADX INFO: renamed from: aO */
    private long m5778aO() {
        return this.f6823E;
    }

    /* JADX INFO: renamed from: aP */
    private long m5779aP() {
        return this.f6824F;
    }

    /* JADX INFO: renamed from: aQ */
    private long m5780aQ() {
        return this.f6821C * 1000;
    }

    /* JADX INFO: renamed from: aR */
    private int m5781aR() {
        return this.f6938t;
    }

    /* JADX INFO: renamed from: aS */
    private String m5782aS() {
        return this.f6820B;
    }

    /* JADX INFO: renamed from: aT */
    private int m5783aT() {
        return this.f6942x;
    }

    /* JADX INFO: renamed from: aU */
    private int m5784aU() {
        return this.f6943y;
    }

    /* JADX INFO: renamed from: aV */
    private int m5785aV() {
        return this.f6944z;
    }

    /* JADX INFO: renamed from: aW */
    private int m5786aW() {
        return this.f6857aL;
    }

    /* JADX INFO: renamed from: aX */
    private long m5787aX() {
        return this.f6856aK;
    }

    /* JADX INFO: renamed from: aY */
    private int m5788aY() {
        return this.f6854aI;
    }

    /* JADX INFO: renamed from: aZ */
    private int m5789aZ() {
        return this.f6855aJ;
    }

    /* JADX INFO: renamed from: aa */
    private int m5790aa() {
        return this.f6840V;
    }

    /* JADX INFO: renamed from: aa */
    private void m5791aa(int i) {
        this.f6908bj = i;
    }

    /* JADX INFO: renamed from: ab */
    private LinkedList<String> m5792ab() {
        return this.f6837S;
    }

    /* JADX INFO: renamed from: ab */
    private void m5793ab(int i) {
        this.f6909bk = i;
    }

    /* JADX INFO: renamed from: ac */
    private int m5794ac() {
        return this.f6845a;
    }

    /* JADX INFO: renamed from: ac */
    private void m5795ac(int i) {
        this.f6914bp = i;
    }

    /* JADX INFO: renamed from: ad */
    private int m5796ad() {
        return this.f6838T;
    }

    /* JADX INFO: renamed from: ad */
    private void m5797ad(int i) {
        this.f6916br = i;
    }

    /* JADX INFO: renamed from: ae */
    private int m5798ae() {
        return this.f6839U * 1000;
    }

    /* JADX INFO: renamed from: ae */
    private void m5799ae(int i) {
        this.f6917bs = i;
    }

    /* JADX INFO: renamed from: af */
    private int m5800af() {
        return this.f6848aC;
    }

    /* JADX INFO: renamed from: af */
    private void m5801af(int i) {
        this.f6918bt = i;
    }

    /* JADX INFO: renamed from: ag */
    private int m5802ag() {
        return this.f6896ay;
    }

    /* JADX INFO: renamed from: ag */
    private void m5803ag(int i) {
        this.f6919bu = i;
    }

    /* JADX INFO: renamed from: ah */
    private int m5804ah() {
        return this.f6897az;
    }

    /* JADX INFO: renamed from: ah */
    private void m5805ah(int i) {
        this.f6920bv = i;
    }

    /* JADX INFO: renamed from: ai */
    private int m5806ai() {
        return this.f6846aA;
    }

    /* JADX INFO: renamed from: aj */
    private int m5807aj() {
        return this.f6847aB;
    }

    /* JADX INFO: renamed from: ak */
    private int m5808ak() {
        return this.f6890as;
    }

    /* JADX INFO: renamed from: al */
    private String m5809al() {
        return this.f6888aq;
    }

    /* JADX INFO: renamed from: am */
    private String m5810am() {
        return this.f6889ar;
    }

    /* JADX INFO: renamed from: an */
    private int m5811an() {
        return this.f6887ap;
    }

    /* JADX INFO: renamed from: ao */
    private int m5812ao() {
        return this.f6885an;
    }

    /* JADX INFO: renamed from: ap */
    private String m5813ap() {
        return this.f6886ao;
    }

    /* JADX INFO: renamed from: aq */
    private int m5814aq() {
        return this.f6878ag;
    }

    /* JADX INFO: renamed from: ar */
    private int m5815ar() {
        return this.f6879ah;
    }

    /* JADX INFO: renamed from: as */
    private int m5816as() {
        return this.f6880ai;
    }

    /* JADX INFO: renamed from: at */
    private int m5817at() {
        return this.f6881aj;
    }

    /* JADX INFO: renamed from: au */
    private int m5818au() {
        return this.f6882ak;
    }

    /* JADX INFO: renamed from: av */
    private String m5819av() {
        return this.f6883al;
    }

    /* JADX INFO: renamed from: aw */
    private int m5820aw() {
        return this.f6884am;
    }

    /* JADX INFO: renamed from: ax */
    private int m5821ax() {
        return this.f6830L;
    }

    /* JADX INFO: renamed from: ay */
    private String m5822ay() {
        return this.f6829K;
    }

    /* JADX INFO: renamed from: az */
    private int m5823az() {
        return this.f6851aF;
    }

    /* JADX INFO: renamed from: b */
    public static C1483a m5824b(String str) {
        ArrayList arrayList;
        C1483a c1483a = null;
        arrayList = null;
        ArrayList arrayList2 = null;
        c1483a = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                C1483a c1483a2 = new C1483a();
                try {
                    c1483a2.f6898b = jSONObject.optString(C1485b.f7208h);
                    c1483a2.f6829K = jSONObject.optString(C1485b.f7210j, "anythink");
                    c1483a2.f6921c = jSONObject.optLong(C1485b.f7212l);
                    c1483a2.f6922d = jSONObject.optInt(C1485b.f7213m);
                    c1483a2.f6923e = jSONObject.optLong("getpf");
                    c1483a2.f6924f = jSONObject.optInt(C1485b.f7216p);
                    c1483a2.f6925g = jSONObject.optBoolean(C1485b.f7223w);
                    c1483a2.f6928j = jSONObject.optLong("current_time");
                    c1483a2.f6927i = jSONObject.optBoolean(C1485b.f7215o);
                    c1483a2.f6933o = jSONObject.optLong(C1485b.f6954B);
                    c1483a2.f6932n = jSONObject.optLong("plct") == 0 ? C1485b.f6968P : jSONObject.optLong("plct");
                    c1483a2.f6931m = jSONObject.optBoolean(C1485b.f6955C);
                    c1483a2.f6934p = jSONObject.optLong(C1485b.f6958F);
                    c1483a2.f6935q = jSONObject.optBoolean(C1485b.f6959G);
                    c1483a2.f6936r = jSONObject.optInt(C1485b.f6976X);
                    c1483a2.f6937s = jSONObject.optInt(C1485b.f6977Y);
                    c1483a2.f6830L = jSONObject.optInt(C1485b.f7211k);
                    c1483a2.f6938t = jSONObject.optInt(C1485b.f6978Z, 1800);
                    c1483a2.f6942x = jSONObject.optInt(C1485b.f7006aa);
                    c1483a2.f6939u = jSONObject.optLong("plctb") == 0 ? C1485b.f6969Q : jSONObject.optLong("plctb");
                    c1483a2.f6854aI = jSONObject.optInt(C1485b.f7009ad);
                    c1483a2.f6855aJ = jSONObject.optInt(C1485b.f7010ae);
                    c1483a2.f6942x = jSONObject.optInt(C1485b.f7006aa, 100);
                    c1483a2.f6943y = jSONObject.optInt(C1485b.f7011af, 2);
                    c1483a2.f6944z = jSONObject.optInt(C1485b.f7012ag, 2);
                    boolean z = true;
                    c1483a2.f6819A = jSONObject.optInt(C1485b.f7013ah, 1);
                    c1483a2.f6856aK = jSONObject.optLong(C1485b.f7014ai, C1485b.f6982aC);
                    c1483a2.f6820B = jSONObject.optString(C1485b.f7015aj);
                    c1483a2.f6821C = jSONObject.optLong(C1485b.f7016ak, C1485b.f6983aD);
                    c1483a2.f6822D = jSONObject.optInt(C1485b.f6984aE, 1);
                    c1483a2.f6823E = jSONObject.optInt(C1485b.f6985aF, 604800);
                    c1483a2.f6824F = jSONObject.optInt(C1485b.f6986aG, C1485b.f6990aK);
                    c1483a2.f6857aL = jSONObject.optInt(C1485b.f7072bn, 3);
                    c1483a2.f6851aF = jSONObject.optInt(C1485b.f7080bv, 1);
                    c1483a2.f6877af = jSONObject.optString(C1485b.f6987aH, "");
                    c1483a2.f6850aE = jSONObject.optInt(C1485b.f7017al, 1);
                    c1483a2.f6879ah = jSONObject.optInt(C1485b.f7037bE, 1);
                    c1483a2.f6878ag = jSONObject.optInt(C1485b.f7038bF, 1);
                    c1483a2.f6880ai = jSONObject.optInt(C1485b.f7039bG, 1);
                    int i = 0;
                    c1483a2.f6881aj = jSONObject.optInt(C1485b.f7040bH, 0);
                    c1483a2.f6882ak = jSONObject.optInt(C1485b.f7041bI, 1);
                    c1483a2.f6884am = jSONObject.optInt(C1485b.f7043bK, -1);
                    c1483a2.f6885an = jSONObject.optInt(C1485b.f7054bV, 2);
                    c1483a2.f6887ap = jSONObject.optInt(C1485b.f7057bY, 86400);
                    c1483a2.f6886ao = jSONObject.optString(C1485b.f7055bW);
                    c1483a2.f6889ar = jSONObject.optString(C1485b.f7092cG);
                    c1483a2.f6888aq = jSONObject.optString(C1485b.f7091cF);
                    c1483a2.f6890as = jSONObject.optInt(C1485b.f7099cN);
                    c1483a2.f6839U = jSONObject.optInt(C1485b.f7120ci, C1485b.f7122ck);
                    c1483a2.f6838T = jSONObject.optInt(C1485b.f7119ch, 0);
                    try {
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C1485b.f7118cg);
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            LinkedList<String> linkedList = new LinkedList<>();
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                linkedList.add(jSONArrayOptJSONArray.optString(i2));
                            }
                            c1483a2.f6837S = linkedList;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    long jOptLong = jSONObject.optLong(C1485b.f7007ab);
                    if (jOptLong == 0) {
                        c1483a2.f6852aG = 20L;
                    } else {
                        c1483a2.f6852aG = jOptLong;
                    }
                    long jOptLong2 = jSONObject.optLong(C1485b.f7008ac);
                    if (jOptLong2 == 0) {
                        c1483a2.f6853aH = 10L;
                    } else {
                        c1483a2.f6853aH = jOptLong2;
                        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(C1485b.f7222v);
                        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                            HashMap map = new HashMap();
                            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i3);
                                map.put(jSONObjectOptJSONObject.optString("domain"), jSONObjectOptJSONObject.optString("format"));
                            }
                            c1483a2.f6926h = map;
                        }
                    }
                    c1483a2.f6825G = jSONObject.optInt(C1485b.f7020ao, 3);
                    c1483a2.f6826H = jSONObject.optInt(C1485b.f7021ap, 86400);
                    c1483a2.f6827I = jSONObject.optInt("iex", 1);
                    JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(C1485b.f7023ar);
                    if (jSONArrayOptJSONArray3 == null || jSONArrayOptJSONArray3.length() <= 0) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                            String strOptString = jSONArrayOptJSONArray3.optString(i4);
                            if (C1889w.m9868b(strOptString)) {
                                arrayList.add(C1781c.m8667a(new JSONObject(strOptString)));
                            }
                        }
                    }
                    if (arrayList != null) {
                        c1483a2.f6831M = arrayList;
                    }
                    try {
                        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray(C1485b.f7024as);
                        if (jSONArrayOptJSONArray4 != null && jSONArrayOptJSONArray4.length() > 0) {
                            arrayList2 = new ArrayList();
                            for (int i5 = 0; i5 < jSONArrayOptJSONArray4.length(); i5++) {
                                String strOptString2 = jSONArrayOptJSONArray4.optString(i5);
                                if (C1889w.m9868b(strOptString2)) {
                                    JSONObject jSONObject2 = new JSONObject(strOptString2);
                                    arrayList2.add(new C1780b(jSONObject2.optInt("adtype"), jSONObject2.optString("unitid")));
                                }
                            }
                        }
                        if (arrayList2 != null) {
                            c1483a2.f6832N = arrayList2;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    c1483a2.f6858aM = jSONObject.optInt(C1485b.f7025at, C1485b.f7082bx);
                    c1483a2.f6843Y = jSONObject.optInt("pf", C1485b.f7083by);
                    c1483a2.f6872aa = jSONObject.optInt(C1485b.f6980aA, 20);
                    c1483a2.f6876ae = jSONObject.optString(C1485b.f6981aB);
                    JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray(C1485b.f7027av);
                    if (jSONArrayOptJSONArray5 != null && jSONArrayOptJSONArray5.length() > 0) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i6 = 0; i6 < jSONArrayOptJSONArray5.length(); i6++) {
                            arrayList3.add(jSONArrayOptJSONArray5.optString(i6));
                        }
                        c1483a2.f6844Z = arrayList3;
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(C1485b.f7028aw);
                    if (jSONObjectOptJSONObject2 != null) {
                        c1483a2.f6873ab = jSONObjectOptJSONObject2.optInt(C1485b.f7029ax, 1);
                        c1483a2.f6874ac = jSONObjectOptJSONObject2.optInt(C1485b.f7030ay, 1);
                        c1483a2.f6875ad = jSONObjectOptJSONObject2.optInt("delete", 1);
                    }
                    c1483a2.f6859aN = jSONObject.optString(C1485b.f7131ct, "");
                    c1483a2.f6860aO = jSONObject.optString(C1485b.f7132cu, "");
                    c1483a2.f6861aP = jSONObject.optString(C1485b.f7133cv, "");
                    c1483a2.f6862aQ = jSONObject.optString(C1485b.f7134cw, "");
                    c1483a2.f6863aR = jSONObject.optString(C1485b.f7135cx, "");
                    c1483a2.f6864aS = jSONObject.optInt(C1485b.f7136cy, 0);
                    c1483a2.f6865aT = jSONObject.optInt(C1485b.f7137cz, 21600);
                    c1483a2.f6866aU = jSONObject.optInt(C1485b.f7086cA, 2);
                    c1483a2.f6867aV = jSONObject.optInt(C1485b.f7087cB, 0);
                    c1483a2.f6868aW = jSONObject.optInt(C1485b.f7088cC, 0);
                    c1483a2.f6869aX = jSONObject.optInt(C1485b.f7089cD, 604800);
                    c1483a2.f6870aY = jSONObject.optInt(C1485b.f7090cE, 0);
                    c1483a2.f6871aZ = jSONObject.optString("adchoice_icon", "");
                    c1483a2.f6900bb = jSONObject.optString("adchoice_link", "");
                    c1483a2.f6899ba = jSONObject.optString("adchoice_size", "");
                    c1483a2.f6902bd = jSONObject.optString("platform_logo", "");
                    c1483a2.f6901bc = jSONObject.optString("platform_name", "");
                    c1483a2.f6903be = m5923y(jSONObject.optString(C1485b.f7098cM, ""));
                    c1483a2.f6845a = jSONObject.optInt(C1485b.f7100cO, 0);
                    c1483a2.f6906bh = jSONObject.optInt(C1485b.f7102cQ, 0);
                    c1483a2.f6841W = jSONObject.optInt(C1485b.f7173di, 120);
                    c1483a2.f6840V = jSONObject.optInt(C1485b.f7171dg, 10);
                    c1483a2.f6842X = jSONObject.optString(C1485b.f7147dI, "");
                    c1483a2.f6907bi = jSONObject.optString(C1485b.f7105cT, "");
                    c1483a2.f6908bj = jSONObject.optInt(C1485b.f7106cU, 2);
                    c1483a2.f6909bk = jSONObject.optInt(C1485b.f7107cV, 7200);
                    c1483a2.f6911bm = jSONObject.optString(C1485b.f7183ds);
                    c1483a2.f6910bl = jSONObject.optString(C1485b.f7139dA);
                    int iOptInt = jSONObject.optInt(C1485b.f7184dt, 0);
                    if (iOptInt > 2 || iOptInt < 0) {
                        iOptInt = 0;
                    }
                    c1483a2.f6912bn = iOptInt;
                    c1483a2.f6913bo = jSONObject.optBoolean(C1485b.f7187dw, false);
                    JSONArray jSONArrayOptJSONArray6 = jSONObject.optJSONArray(C1485b.f7182dr);
                    if (jSONArrayOptJSONArray6 != null && jSONArrayOptJSONArray6.length() > 0) {
                        for (int i7 = 0; i7 < jSONArrayOptJSONArray6.length(); i7++) {
                            JSONObject jSONObject3 = jSONArrayOptJSONArray6.getJSONObject(i7);
                            Iterator<String> itKeys = jSONObject3.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (!TextUtils.isEmpty(next) && jSONObject3.getBoolean(next)) {
                                    c1483a2.f6849aD.add(Integer.valueOf(Integer.parseInt(next)));
                                }
                            }
                        }
                    }
                    try {
                        int iOptInt2 = jSONObject.optInt("lqcnt", 30);
                        int iOptInt3 = jSONObject.optInt("lqto", 5);
                        int iOptInt4 = jSONObject.optInt("lqswt", 0);
                        int iOptInt5 = jSONObject.optInt("lqtype", 0);
                        c1483a2.f6892au = iOptInt3;
                        c1483a2.f6891at = iOptInt2;
                        c1483a2.f6893av = iOptInt4;
                        c1483a2.f6894aw = iOptInt5;
                        int i8 = Integer.parseInt(C1876j.m9688b(jSONObject.optString("lqpt")));
                        if (i8 > 0 && i8 < 65535) {
                            c1483a2.f6895ax = i8;
                        }
                    } catch (Exception unused) {
                    }
                    c1483a2.f6914bp = jSONObject.optInt(C1485b.f7140dB, 0);
                    try {
                        int iOptInt6 = jSONObject.optInt("l", 3);
                        boolean z3 = jSONObject.optInt("k", 0) == 1;
                        if (jSONObject.optInt(C1485b.f7146dH, 1) != 1) {
                            z = false;
                        }
                        c1483a2.f6834P = iOptInt6;
                        c1483a2.f6833O = z3;
                        c1483a2.f6835Q = z;
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                    c1483a2.f6904bf = jSONObject.optInt(C1485b.f7149dK, 0);
                    c1483a2.f6905bg = b.m5993a(jSONObject.optJSONObject(C1485b.f7150dL));
                    try {
                        int iOptInt7 = jSONObject.optInt(C1485b.f7155dQ, C1801a.f11103cH);
                        int iOptInt8 = jSONObject.optInt(C1485b.f7156dR, C1801a.f11104cI);
                        int iOptInt9 = jSONObject.optInt(C1485b.f7157dS, C1801a.f11105cJ);
                        int iOptInt10 = jSONObject.optInt(C1485b.f7159dU, C1801a.f11110cO);
                        if (iOptInt7 <= 0) {
                            iOptInt7 = C1801a.f11103cH;
                        }
                        if (iOptInt8 <= 0) {
                            iOptInt8 = C1801a.f11104cI;
                        }
                        if (iOptInt9 <= 0) {
                            iOptInt9 = C1801a.f11105cJ;
                        }
                        if (iOptInt10 < 0) {
                            iOptInt10 = C1801a.f11110cO;
                        }
                        c1483a2.f6846aA = iOptInt7;
                        c1483a2.f6896ay = iOptInt8;
                        c1483a2.f6897az = iOptInt9;
                        c1483a2.f6847aB = iOptInt10;
                        int iOptInt11 = jSONObject.optInt(C1485b.f7158dT, 0);
                        if (iOptInt11 >= 0) {
                            i = iOptInt11;
                        }
                        c1483a2.f6836R = i;
                        c1483a2.m5954b(jSONObject.optInt(C1485b.f7160dV, 10));
                        return c1483a2;
                    } catch (Exception unused2) {
                        c1483a = c1483a2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    c1483a = c1483a2;
                    e.printStackTrace();
                }
            }
        } catch (Exception e4) {
            e = e4;
        }
        return c1483a;
    }

    /* JADX INFO: renamed from: b */
    private void m5825b(long j) {
        this.f6821C = j;
    }

    /* JADX INFO: renamed from: b */
    private void m5826b(List<String> list) {
        this.f6844Z = list;
    }

    /* JADX INFO: renamed from: b */
    private void m5827b(Map<String, a> map) {
        this.f6903be = map;
    }

    /* JADX INFO: renamed from: b */
    private void m5828b(boolean z) {
        this.f6833O = z;
    }

    /* JADX INFO: renamed from: bA */
    private int m5829bA() {
        return this.f6869aX;
    }

    /* JADX INFO: renamed from: bB */
    private String m5830bB() {
        return this.f6901bc;
    }

    /* JADX INFO: renamed from: bC */
    private String m5831bC() {
        return this.f6902bd;
    }

    /* JADX INFO: renamed from: bD */
    private Map<String, a> m5832bD() {
        return this.f6903be;
    }

    /* JADX INFO: renamed from: bE */
    private boolean m5833bE() {
        return (TextUtils.isEmpty(this.f6871aZ) || TextUtils.isEmpty(this.f6900bb) || TextUtils.isEmpty(this.f6899ba)) ? false : true;
    }

    /* JADX INFO: renamed from: bF */
    private int m5834bF() {
        return this.f6891at;
    }

    /* JADX INFO: renamed from: bG */
    private int m5835bG() {
        return this.f6892au;
    }

    /* JADX INFO: renamed from: bH */
    private int m5836bH() {
        return this.f6893av;
    }

    /* JADX INFO: renamed from: bI */
    private int m5837bI() {
        return this.f6894aw;
    }

    /* JADX INFO: renamed from: bJ */
    private int m5838bJ() {
        return this.f6895ax;
    }

    /* JADX INFO: renamed from: bK */
    private boolean m5839bK() {
        return this.f6833O;
    }

    /* JADX INFO: renamed from: bL */
    private int m5840bL() {
        return this.f6834P;
    }

    /* JADX INFO: renamed from: bM */
    private boolean m5841bM() {
        return this.f6835Q;
    }

    /* JADX INFO: renamed from: bN */
    private int m5842bN() {
        return this.f6906bh;
    }

    /* JADX INFO: renamed from: bO */
    private String m5843bO() {
        return this.f6907bi;
    }

    /* JADX INFO: renamed from: bP */
    private int m5844bP() {
        return this.f6908bj;
    }

    /* JADX INFO: renamed from: bQ */
    private int m5845bQ() {
        return this.f6909bk;
    }

    /* JADX INFO: renamed from: bR */
    private String m5846bR() {
        return this.f6911bm;
    }

    /* JADX INFO: renamed from: bS */
    private int m5847bS() {
        return this.f6912bn;
    }

    /* JADX INFO: renamed from: bT */
    private boolean m5848bT() {
        return this.f6913bo;
    }

    /* JADX INFO: renamed from: bU */
    private int m5849bU() {
        return this.f6915bq;
    }

    /* JADX INFO: renamed from: ba */
    private long m5850ba() {
        return this.f6934p;
    }

    /* JADX INFO: renamed from: bb */
    private long m5851bb() {
        return this.f6933o;
    }

    /* JADX INFO: renamed from: bc */
    private String m5852bc() {
        return this.f6898b;
    }

    /* JADX INFO: renamed from: bd */
    private long m5853bd() {
        return this.f6921c;
    }

    /* JADX INFO: renamed from: be */
    private int m5854be() {
        return this.f6922d;
    }

    /* JADX INFO: renamed from: bf */
    private long m5855bf() {
        return this.f6923e;
    }

    /* JADX INFO: renamed from: bg */
    private int m5856bg() {
        return this.f6924f;
    }

    /* JADX INFO: renamed from: bh */
    private List<C1489c> m5857bh() {
        return this.f6930l;
    }

    /* JADX INFO: renamed from: bi */
    private String m5858bi() {
        return this.f6877af;
    }

    /* JADX INFO: renamed from: bj */
    private String m5859bj() {
        return this.f6929k;
    }

    /* JADX INFO: renamed from: bk */
    private long m5860bk() {
        return this.f6928j;
    }

    /* JADX INFO: renamed from: bl */
    private Map<String, String> m5861bl() {
        return this.f6926h;
    }

    /* JADX INFO: renamed from: bm */
    private boolean m5862bm() {
        return this.f6925g;
    }

    /* JADX INFO: renamed from: bn */
    private boolean m5863bn() {
        return this.f6927i;
    }

    /* JADX INFO: renamed from: bo */
    private int m5864bo() {
        return this.f6936r;
    }

    /* JADX INFO: renamed from: bp */
    private int m5865bp() {
        return this.f6937s;
    }

    /* JADX INFO: renamed from: bq */
    private static boolean m5866bq() {
        try {
            C1486b.m6002a();
            C1773a.m8548c().m8558f();
            C1483a c1483aM6007b = C1486b.m6007b();
            if (c1483aM6007b != null) {
                return c1483aM6007b.f6925g;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: renamed from: br */
    private String m5867br() {
        return this.f6862aQ;
    }

    /* JADX INFO: renamed from: bs */
    private boolean m5868bs() {
        return (TextUtils.isEmpty(this.f6859aN) || TextUtils.isEmpty(this.f6860aO) || TextUtils.isEmpty(this.f6861aP) || TextUtils.isEmpty(this.f6862aQ)) ? false : true;
    }

    /* JADX INFO: renamed from: bt */
    private boolean m5869bt() {
        return (TextUtils.isEmpty(this.f6859aN) || TextUtils.isEmpty(this.f6860aO) || TextUtils.isEmpty(this.f6861aP) || TextUtils.isEmpty(this.f6863aR)) ? false : true;
    }

    /* JADX INFO: renamed from: bu */
    private int m5870bu() {
        return this.f6870aY;
    }

    /* JADX INFO: renamed from: bv */
    private int m5871bv() {
        return this.f6864aS;
    }

    /* JADX INFO: renamed from: bw */
    private int m5872bw() {
        return this.f6865aT;
    }

    /* JADX INFO: renamed from: bx */
    private int m5873bx() {
        return this.f6866aU;
    }

    /* JADX INFO: renamed from: by */
    private int m5874by() {
        return this.f6867aV;
    }

    /* JADX INFO: renamed from: bz */
    private int m5875bz() {
        return this.f6868aW;
    }

    /* JADX INFO: renamed from: c */
    private void m5876c(long j) {
        this.f6852aG = j;
    }

    /* JADX INFO: renamed from: c */
    private void m5877c(List<C1781c> list) {
        this.f6831M = list;
    }

    /* JADX INFO: renamed from: c */
    private void m5878c(boolean z) {
        this.f6835Q = z;
    }

    /* JADX INFO: renamed from: d */
    private void m5879d(long j) {
        this.f6934p = j;
    }

    /* JADX INFO: renamed from: d */
    private void m5880d(String str) {
        this.f6842X = str;
    }

    /* JADX INFO: renamed from: d */
    private void m5881d(List<C1489c> list) {
        this.f6930l = list;
    }

    /* JADX INFO: renamed from: e */
    private void m5882e(long j) {
        this.f6921c = j;
    }

    /* JADX INFO: renamed from: e */
    private void m5883e(String str) {
        this.f6888aq = str;
    }

    /* JADX INFO: renamed from: f */
    private void m5884f(long j) {
        this.f6923e = j;
    }

    /* JADX INFO: renamed from: f */
    private void m5885f(String str) {
        this.f6889ar = str;
    }

    /* JADX INFO: renamed from: g */
    private void m5886g(int i) {
        this.f6840V = i;
    }

    /* JADX INFO: renamed from: g */
    private void m5887g(long j) {
        this.f6928j = j;
    }

    /* JADX INFO: renamed from: g */
    private void m5888g(String str) {
        this.f6886ao = str;
    }

    /* JADX INFO: renamed from: h */
    private void m5889h(int i) {
        this.f6838T = i;
    }

    /* JADX INFO: renamed from: h */
    private void m5890h(String str) {
        this.f6883al = str;
    }

    /* JADX INFO: renamed from: i */
    private void m5891i(int i) {
        this.f6839U = i;
    }

    /* JADX INFO: renamed from: i */
    private void m5892i(String str) {
        this.f6876ae = str;
    }

    /* JADX INFO: renamed from: j */
    private void m5893j(int i) {
        this.f6849aD.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: j */
    private void m5894j(String str) {
        this.f6828J = str;
    }

    /* JADX INFO: renamed from: k */
    private void m5895k(String str) {
        this.f6820B = str;
    }

    /* JADX INFO: renamed from: k */
    private boolean m5896k(int i) {
        return this.f6849aD.contains(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: l */
    private void m5897l(int i) {
        this.f6890as = i;
    }

    /* JADX INFO: renamed from: l */
    private void m5898l(String str) {
        this.f6898b = str;
    }

    /* JADX INFO: renamed from: m */
    private void m5899m(int i) {
        this.f6887ap = i;
    }

    /* JADX INFO: renamed from: m */
    private void m5900m(String str) {
        this.f6877af = str;
    }

    /* JADX INFO: renamed from: n */
    private void m5901n(int i) {
        this.f6885an = i;
    }

    /* JADX INFO: renamed from: n */
    private void m5902n(String str) {
        this.f6929k = str;
    }

    /* JADX INFO: renamed from: o */
    private void m5903o(int i) {
        this.f6851aF = i;
    }

    /* JADX INFO: renamed from: o */
    private void m5904o(String str) {
        this.f6859aN = str;
    }

    /* JADX INFO: renamed from: p */
    private void m5905p(int i) {
        this.f6850aE = i;
    }

    /* JADX INFO: renamed from: p */
    private void m5906p(String str) {
        this.f6860aO = str;
    }

    /* JADX INFO: renamed from: q */
    private void m5907q(int i) {
        this.f6843Y = i;
    }

    /* JADX INFO: renamed from: q */
    private void m5908q(String str) {
        this.f6861aP = str;
    }

    /* JADX INFO: renamed from: r */
    private void m5909r(int i) {
        this.f6872aa = i;
    }

    /* JADX INFO: renamed from: r */
    private void m5910r(String str) {
        this.f6862aQ = str;
    }

    /* JADX INFO: renamed from: s */
    private void m5911s(int i) {
        this.f6873ab = i;
    }

    /* JADX INFO: renamed from: s */
    private void m5912s(String str) {
        this.f6863aR = str;
    }

    /* JADX INFO: renamed from: t */
    private void m5913t(int i) {
        this.f6874ac = i;
    }

    /* JADX INFO: renamed from: t */
    private void m5914t(String str) {
        this.f6871aZ = str;
    }

    /* JADX INFO: renamed from: u */
    private void m5915u(int i) {
        this.f6875ad = i;
    }

    /* JADX INFO: renamed from: u */
    private void m5916u(String str) {
        this.f6899ba = str;
    }

    /* JADX INFO: renamed from: v */
    private void m5917v(int i) {
        this.f6825G = i;
    }

    /* JADX INFO: renamed from: v */
    private void m5918v(String str) {
        this.f6900bb = str;
    }

    /* JADX INFO: renamed from: w */
    private void m5919w(int i) {
        this.f6826H = i;
    }

    /* JADX INFO: renamed from: w */
    private void m5920w(String str) {
        this.f6901bc = str;
    }

    /* JADX INFO: renamed from: x */
    private void m5921x(int i) {
        this.f6827I = i;
    }

    /* JADX INFO: renamed from: x */
    private void m5922x(String str) {
        this.f6902bd = str;
    }

    /* JADX INFO: renamed from: y */
    private static Map<String, a> m5923y(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                a aVar = new a();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    aVar.m5992a(jSONObjectOptJSONObject);
                }
                map.put(next, aVar);
            }
            return map;
        } catch (JSONException e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
            return null;
        } catch (Exception e2) {
            if (C1404a.f6209a) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    private void m5924y(int i) {
        this.f6822D = i;
    }

    /* JADX INFO: renamed from: z */
    private void m5925z(int i) {
        this.f6824F = i;
    }

    /* JADX INFO: renamed from: z */
    private void m5926z(String str) {
        this.f6910bl = str;
    }

    /* JADX INFO: renamed from: A */
    public final void m5927A() {
        this.f6922d = 1;
    }

    /* JADX INFO: renamed from: B */
    public final void m5928B() {
        this.f6927i = true;
    }

    /* JADX INFO: renamed from: C */
    public final String m5929C() {
        return this.f6859aN;
    }

    /* JADX INFO: renamed from: D */
    public final String m5930D() {
        return this.f6860aO;
    }

    /* JADX INFO: renamed from: E */
    public final String m5931E() {
        return this.f6861aP;
    }

    /* JADX INFO: renamed from: F */
    public final String m5932F() {
        return this.f6863aR;
    }

    /* JADX INFO: renamed from: G */
    public final void m5933G() {
        Locale.getDefault().getLanguage();
        if (!((TextUtils.isEmpty(this.f6859aN) || TextUtils.isEmpty(this.f6860aO) || TextUtils.isEmpty(this.f6861aP) || TextUtils.isEmpty(this.f6862aQ)) ? false : true)) {
            this.f6859aN = "Confirm to close? ";
            this.f6860aO = "You will not be rewarded after closing the window";
            this.f6861aP = "Close it";
            this.f6862aQ = "Continue";
        }
        if ((TextUtils.isEmpty(this.f6859aN) || TextUtils.isEmpty(this.f6860aO) || TextUtils.isEmpty(this.f6861aP) || TextUtils.isEmpty(this.f6863aR)) ? false : true) {
            return;
        }
        this.f6859aN = "Confirm to close? ";
        this.f6860aO = "You will not be rewarded after closing the window";
        this.f6861aP = "Close it";
        this.f6863aR = "Continue";
    }

    /* JADX INFO: renamed from: H */
    public final String m5934H() {
        return this.f6871aZ;
    }

    /* JADX INFO: renamed from: I */
    public final String m5935I() {
        return this.f6899ba;
    }

    /* JADX INFO: renamed from: J */
    public final String m5936J() {
        return this.f6900bb;
    }

    /* JADX INFO: renamed from: K */
    public final int m5937K() {
        return this.f6904bf;
    }

    /* JADX INFO: renamed from: L */
    public final b m5938L() {
        return this.f6905bg;
    }

    /* JADX INFO: renamed from: M */
    public final String m5939M() {
        return this.f6910bl;
    }

    /* JADX INFO: renamed from: N */
    public final void m5940N() {
        this.f6912bn = 0;
    }

    /* JADX INFO: renamed from: O */
    public final void m5941O() {
        this.f6913bo = false;
    }

    /* JADX INFO: renamed from: P */
    public final int m5942P() {
        return this.f6914bp;
    }

    /* JADX INFO: renamed from: Q */
    public final void m5943Q() {
        this.f6915bq = 1;
    }

    /* JADX INFO: renamed from: R */
    public final String m5944R() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C1485b.f7208h, this.f6898b);
            jSONObject.put(C1485b.f7212l, this.f6921c);
            jSONObject.put(C1485b.f7213m, this.f6922d);
            jSONObject.put(C1485b.f7216p, this.f6924f);
            jSONObject.put(C1485b.f7223w, this.f6925g);
            jSONObject.put(C1485b.f7215o, this.f6927i);
            jSONObject.put("plct", this.f6932n);
            jSONObject.put(C1485b.f6954B, this.f6933o);
            jSONObject.put(C1485b.f6955C, this.f6931m);
            jSONObject.put(C1485b.f6959G, this.f6935q);
            jSONObject.put("plctb", this.f6939u);
            jSONObject.put(C1485b.f7007ab, this.f6852aG);
            jSONObject.put(C1485b.f7008ac, this.f6853aH);
            jSONObject.put(C1485b.f7011af, this.f6943y);
            jSONObject.put(C1485b.f7012ag, this.f6944z);
            jSONObject.put(C1485b.f7209i, this.f6828J);
            jSONObject.put(C1485b.f7210j, this.f6829K);
            jSONObject.put(C1485b.f7211k, this.f6830L);
            jSONObject.put(C1485b.f7014ai, this.f6856aK);
            jSONObject.put(C1485b.f7006aa, this.f6942x);
            jSONObject.put(C1485b.f6986aG, this.f6824F);
            jSONObject.put(C1485b.f6984aE, this.f6822D);
            jSONObject.put(C1485b.f6985aF, this.f6823E);
            jSONObject.put(C1485b.f7010ae, this.f6855aJ);
            jSONObject.put(C1485b.f7072bn, this.f6857aL);
            jSONObject.put(C1485b.f7080bv, this.f6851aF);
            jSONObject.put("iex", this.f6827I);
            jSONObject.put(C1485b.f7020ao, this.f6825G);
            jSONObject.put(C1485b.f7021ap, this.f6826H);
            jSONObject.put(C1485b.f7025at, this.f6858aM);
            jSONObject.put(C1485b.f7017al, this.f6850aE);
            jSONObject.put("pf", this.f6843Y);
            jSONObject.put(C1485b.f6980aA, this.f6872aa);
            jSONObject.put(C1485b.f6981aB, this.f6876ae);
            jSONObject.put(C1485b.f7029ax, this.f6873ab);
            jSONObject.put(C1485b.f7030ay, this.f6874ac);
            jSONObject.put("delete", this.f6875ad);
            jSONObject.put(C1485b.f7009ad, this.f6854aI);
            jSONObject.put(C1485b.f7037bE, this.f6879ah);
            jSONObject.put(C1485b.f7038bF, this.f6878ag);
            jSONObject.put(C1485b.f7039bG, this.f6880ai);
            jSONObject.put(C1485b.f7040bH, this.f6881aj);
            jSONObject.put(C1485b.f7041bI, this.f6882ak);
            jSONObject.put(C1485b.f7043bK, this.f6884am);
            jSONObject.put(C1485b.f7042bJ, this.f6883al);
            jSONObject.put(C1485b.f7054bV, this.f6885an);
            jSONObject.put(C1485b.f7057bY, this.f6887ap);
            jSONObject.put(C1485b.f7100cO, this.f6845a);
            jSONObject.put(C1485b.f7105cT, this.f6907bi);
            jSONObject.put(C1485b.f7173di, this.f6841W);
            jSONObject.put(C1485b.f7171dg, this.f6840V);
            jSONObject.put(C1485b.f7187dw, this.f6913bo);
            jSONObject.put(C1485b.f7184dt, this.f6912bn);
            jSONObject.put("isDefault", this.f6915bq);
            return jSONObject.toString();
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: S */
    public final int m5945S() {
        return this.f6916br;
    }

    /* JADX INFO: renamed from: T */
    public final int m5946T() {
        return this.f6917bs;
    }

    /* JADX INFO: renamed from: U */
    public final int m5947U() {
        return this.f6918bt;
    }

    /* JADX INFO: renamed from: V */
    public final int m5948V() {
        return this.f6919bu;
    }

    /* JADX INFO: renamed from: W */
    public final int m5949W() {
        return this.f6920bv;
    }

    /* JADX INFO: renamed from: a */
    public final void m5950a() {
        this.f6836R = 10;
    }

    /* JADX INFO: renamed from: a */
    public final void m5951a(int i) {
        this.f6841W = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m5952a(String str) {
        this.f6829K = str;
    }

    /* JADX INFO: renamed from: b */
    public final int m5953b() {
        return this.f6841W;
    }

    /* JADX INFO: renamed from: b */
    public final void m5954b(int i) {
        if (i > 0) {
            this.f6848aC = i;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5955c() {
        this.f6845a = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m5956c(int i) {
        this.f6896ay = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m5957c(String str) {
        this.f6907bi = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m5958d() {
        this.f6878ag = 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m5959d(int i) {
        this.f6897az = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m5960e() {
        this.f6879ah = 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m5961e(int i) {
        this.f6846aA = i;
    }

    /* JADX INFO: renamed from: f */
    public final void m5962f() {
        this.f6880ai = 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m5963f(int i) {
        this.f6847aB = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m5964g() {
        this.f6881aj = 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m5965h() {
        this.f6882ak = 1;
    }

    /* JADX INFO: renamed from: i */
    public final void m5966i() {
        this.f6884am = -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m5967j() {
        this.f6830L = 1;
    }

    /* JADX INFO: renamed from: k */
    public final int m5968k() {
        return this.f6819A;
    }

    /* JADX INFO: renamed from: l */
    public final long m5969l() {
        if (this.f6939u <= 0) {
            this.f6939u = C1485b.f6969Q;
        }
        return this.f6939u;
    }

    /* JADX INFO: renamed from: m */
    public final void m5970m() {
        this.f6939u = C1485b.f6969Q;
    }

    /* JADX INFO: renamed from: n */
    public final int m5971n() {
        return this.f6858aM;
    }

    /* JADX INFO: renamed from: o */
    public final void m5972o() {
        this.f6858aM = C1485b.f7082bx;
    }

    /* JADX INFO: renamed from: p */
    public final void m5973p() {
        this.f6856aK = C1485b.f6982aC;
    }

    /* JADX INFO: renamed from: q */
    public final long m5974q() {
        return this.f6852aG * 1000;
    }

    /* JADX INFO: renamed from: r */
    public final long m5975r() {
        return this.f6853aH * 1000;
    }

    /* JADX INFO: renamed from: s */
    public final void m5976s() {
        this.f6853aH = 10L;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5977t() {
        return this.f6935q;
    }

    public final String toString() {
        return "cc=" + this.f6898b + " upal=" + this.f6921c + " cfc=" + this.f6922d + " getpf=" + this.f6923e + " uplc=" + this.f6924f + " rurl=" + this.f6931m;
    }

    /* JADX INFO: renamed from: u */
    public final void m5978u() {
        this.f6935q = false;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5979v() {
        return this.f6931m;
    }

    /* JADX INFO: renamed from: w */
    public final void m5980w() {
        this.f6931m = false;
    }

    /* JADX INFO: renamed from: x */
    public final long m5981x() {
        return this.f6932n;
    }

    /* JADX INFO: renamed from: y */
    public final void m5982y() {
        this.f6932n = C1485b.f6968P;
    }

    /* JADX INFO: renamed from: z */
    public final void m5983z() {
        this.f6933o = 0L;
    }
}
