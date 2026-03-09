package com.anythink.core.common.p058h;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATPrivacyConfig;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.C1178q;
import com.anythink.core.common.p055f.C1232ay;
import com.anythink.core.common.p055f.C1254s;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.h.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1275c {

    /* JADX INFO: renamed from: A */
    public static final String f4637A = "it_src";

    /* JADX INFO: renamed from: B */
    public static final String f4638B = "lat";

    /* JADX INFO: renamed from: C */
    public static final String f4639C = "lon";

    /* JADX INFO: renamed from: D */
    public static final String f4640D = "inst_wx";

    /* JADX INFO: renamed from: E */
    public static final String f4641E = "mini_sdk";

    /* JADX INFO: renamed from: F */
    public static final String f4642F = "ms_type";

    /* JADX INFO: renamed from: G */
    public static final String f4643G = "device_set";

    /* JADX INFO: renamed from: H */
    public static final String f4644H = "gdpr_cs";

    /* JADX INFO: renamed from: I */
    public static final String f4645I = "abtest_id";

    /* JADX INFO: renamed from: J */
    public static final String f4646J = "first_init_time";

    /* JADX INFO: renamed from: K */
    public static final String f4647K = "days_from_first_init";

    /* JADX INFO: renamed from: L */
    public static final String f4648L = "cs_cl";

    /* JADX INFO: renamed from: M */
    public static final String f4649M = "is_ofm";

    /* JADX INFO: renamed from: N */
    public static final String f4650N = "app_id";

    /* JADX INFO: renamed from: O */
    public static final String f4651O = "api_ver";

    /* JADX INFO: renamed from: P */
    public static final String f4652P = "custom";

    /* JADX INFO: renamed from: Q */
    public static final String f4653Q = "data";

    /* JADX INFO: renamed from: R */
    public static final String f4654R = "tcp_tk_da_type";

    /* JADX INFO: renamed from: S */
    public static final String f4655S = "ofl";

    /* JADX INFO: renamed from: T */
    public static final String f4656T = "tcp_rate";

    /* JADX INFO: renamed from: U */
    public static final String f4657U = "p";

    /* JADX INFO: renamed from: V */
    public static final String f4658V = "p2";

    /* JADX INFO: renamed from: W */
    public static final String f4659W = "sign";

    /* JADX INFO: renamed from: X */
    public static final String f4660X = "common";

    /* JADX INFO: renamed from: Y */
    public static final int f4661Y = 1;

    /* JADX INFO: renamed from: Z */
    public static final int f4662Z = 2;

    /* JADX INFO: renamed from: a */
    public static final String f4663a = "platform";

    /* JADX INFO: renamed from: aA */
    public static final String f4664aA = "is_sim";

    /* JADX INFO: renamed from: aB */
    public static final String f4665aB = "is_mul";

    /* JADX INFO: renamed from: aC */
    public static final String f4666aC = "is_vpn";

    /* JADX INFO: renamed from: aD */
    public static final String f4667aD = "is_charge";

    /* JADX INFO: renamed from: aE */
    public static final String f4668aE = "battery";

    /* JADX INFO: renamed from: aF */
    public static final String f4669aF = "http_able";

    /* JADX INFO: renamed from: aG */
    public static final String f4670aG = "bld_type";

    /* JADX INFO: renamed from: aH */
    public static final String f4671aH = "bld_tags";

    /* JADX INFO: renamed from: aI */
    public static final String f4672aI = "bld_user";

    /* JADX INFO: renamed from: aJ */
    public static final String f4673aJ = "bld_radio";

    /* JADX INFO: renamed from: aK */
    public static final String f4674aK = "bld_bootloader";

    /* JADX INFO: renamed from: aL */
    public static final String f4675aL = "bld_hardware";

    /* JADX INFO: renamed from: aM */
    public static final String f4676aM = "bld_host";

    /* JADX INFO: renamed from: aN */
    public static final String f4677aN = "bld_codename";

    /* JADX INFO: renamed from: aO */
    public static final String f4678aO = "bld_incremental";

    /* JADX INFO: renamed from: aP */
    public static final String f4679aP = "bld_serial";

    /* JADX INFO: renamed from: aQ */
    public static final String f4680aQ = "bld_display";

    /* JADX INFO: renamed from: aR */
    public static final String f4681aR = "bld_version_codes";

    /* JADX INFO: renamed from: aS */
    public static final String f4682aS = "bld_board";

    /* JADX INFO: renamed from: aT */
    public static final String f4683aT = "is_s";

    /* JADX INFO: renamed from: aa */
    public static final int f4684aa = 3;

    /* JADX INFO: renamed from: ab */
    public static final String f4685ab = "area_type";

    /* JADX INFO: renamed from: ac */
    public static final String f4686ac = "sp_http";

    /* JADX INFO: renamed from: ad */
    public static final String f4687ad = "os_fw";

    /* JADX INFO: renamed from: ae */
    public static final String f4688ae = "is_test";

    /* JADX INFO: renamed from: af */
    public static final String f4689af = "user_num";

    /* JADX INFO: renamed from: ag */
    public static final String f4690ag = "cp_device_id";

    /* JADX INFO: renamed from: ah */
    public static final String f4691ah = "cp_pl_id";

    /* JADX INFO: renamed from: ai */
    public static int f4692ai = -1;

    /* JADX INFO: renamed from: aj */
    public static int f4693aj = -1;

    /* JADX INFO: renamed from: ak */
    public static final String f4694ak = "al_it_apil";

    /* JADX INFO: renamed from: al */
    public static final String f4695al = "wx_data";

    /* JADX INFO: renamed from: am */
    public static final String f4696am = "cached";

    /* JADX INFO: renamed from: an */
    public static final String f4697an = "cached";

    /* JADX INFO: renamed from: ao */
    public static final String f4698ao = "n_cache";

    /* JADX INFO: renamed from: ap */
    public static final String f4699ap = "get_1st_rl";

    /* JADX INFO: renamed from: aq */
    public static final String f4700aq = "value_d";

    /* JADX INFO: renamed from: ar */
    public static final String f4701ar = "pl_type";

    /* JADX INFO: renamed from: as */
    public static final String f4702as = "amazon_id";

    /* JADX INFO: renamed from: at */
    public static final String f4703at = "amazon_lat";

    /* JADX INFO: renamed from: au */
    public static final String f4704au = "t_mem";

    /* JADX INFO: renamed from: av */
    public static final String f4705av = "c_num";

    /* JADX INFO: renamed from: aw */
    public static final String f4706aw = "t_store";

    /* JADX INFO: renamed from: ax */
    public static final String f4707ax = "cpu";

    /* JADX INFO: renamed from: ay */
    public static final String f4708ay = "isroot";

    /* JADX INFO: renamed from: az */
    public static final String f4709az = "isagent";

    /* JADX INFO: renamed from: b */
    public static final String f4710b = "os_vn";

    /* JADX INFO: renamed from: c */
    public static final String f4711c = "os_vc";

    /* JADX INFO: renamed from: d */
    public static final String f4712d = "package_name";

    /* JADX INFO: renamed from: e */
    public static final String f4713e = "app_vn";

    /* JADX INFO: renamed from: f */
    public static final String f4714f = "app_vc";

    /* JADX INFO: renamed from: g */
    public static final String f4715g = "brand";

    /* JADX INFO: renamed from: h */
    public static final String f4716h = "model";

    /* JADX INFO: renamed from: i */
    public static final String f4717i = "screen";

    /* JADX INFO: renamed from: j */
    public static final String f4718j = "network_type";

    /* JADX INFO: renamed from: k */
    public static final String f4719k = "mnc";

    /* JADX INFO: renamed from: l */
    public static final String f4720l = "mcc";

    /* JADX INFO: renamed from: m */
    public static final String f4721m = "language";

    /* JADX INFO: renamed from: n */
    public static final String f4722n = "timezone";

    /* JADX INFO: renamed from: o */
    public static final String f4723o = "sdk_ver";

    /* JADX INFO: renamed from: p */
    public static final String f4724p = "gp_ver";

    /* JADX INFO: renamed from: q */
    public static final String f4725q = "nw_ver";

    /* JADX INFO: renamed from: r */
    public static final String f4726r = "ua";

    /* JADX INFO: renamed from: s */
    public static final String f4727s = "orient";

    /* JADX INFO: renamed from: t */
    public static final String f4728t = "system";

    /* JADX INFO: renamed from: u */
    public static final String f4729u = "android_id";

    /* JADX INFO: renamed from: v */
    public static final String f4730v = "gaid";

    /* JADX INFO: renamed from: w */
    public static final String f4731w = "channel";

    /* JADX INFO: renamed from: x */
    public static final String f4732x = "sub_channel";

    /* JADX INFO: renamed from: y */
    public static final String f4733y = "upid";

    /* JADX INFO: renamed from: z */
    public static final String f4734z = "ps_id";

    /* JADX INFO: renamed from: a */
    public static JSONObject m3677a() {
        return m3680a(C1175n.m2059a().m2159l());
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m3678a(int i) {
        List<C1254s> listM4084n;
        JSONObject jSONObjectM4751ar;
        C1341e.m4092r(C1175n.m2059a().m2148f());
        JSONObject jSONObject = new JSONObject();
        Context contextM2148f = C1175n.m2059a().m2148f();
        try {
            jSONObject.put("platform", 1);
            jSONObject.put("os_vn", C1341e.m4062e());
            jSONObject.put("os_vc", C1341e.m4059d());
            jSONObject.put("package_name", C1341e.m4080l(contextM2148f));
            jSONObject.put("app_vn", C1341e.m4076j(contextM2148f));
            jSONObject.put("app_vc", C1341e.m4074i(contextM2148f));
            jSONObject.put("brand", C1341e.m4054b());
            jSONObject.put("model", C1341e.m4048a());
            jSONObject.put("screen", C1341e.m4078k(contextM2148f));
            jSONObject.put("network_type", C1341e.m4083n(contextM2148f));
            jSONObject.put("mnc", C1341e.m4058c(contextM2148f));
            jSONObject.put("mcc", C1341e.m4055b(contextM2148f));
            jSONObject.put("language", C1341e.m4066f(contextM2148f));
            jSONObject.put("timezone", C1341e.m4057c());
            jSONObject.put("sdk_ver", C1344h.m4131a());
            jSONObject.put("gp_ver", C1341e.m4086o(contextM2148f));
            jSONObject.put("ua", C1341e.m4073i());
            jSONObject.put("orient", C1341e.m4068g(contextM2148f));
            jSONObject.put("system", 1);
            if (!TextUtils.isEmpty(C1175n.m2059a().m2161m())) {
                jSONObject.put("channel", C1175n.m2059a().m2161m());
            }
            if (!TextUtils.isEmpty(C1175n.m2059a().m2163n())) {
                jSONObject.put("sub_channel", C1175n.m2059a().m2163n());
            }
            String strM4706C = "";
            jSONObject.put("upid", C1178q.m2182a(contextM2148f).m2189b() ? C1175n.m2059a().m2177x() : "");
            jSONObject.put("ps_id", C1175n.m2059a().m2168q());
            C1391a c1391aM4865b = C1392b.m4845a(contextM2148f).m4865b(C1175n.m2059a().m2165o());
            if (c1391aM4865b != null) {
                if (!TextUtils.isEmpty(c1391aM4865b.m4706C())) {
                    strM4706C = c1391aM4865b.m4706C();
                }
                jSONObject.put(f4645I, strM4706C);
            }
            jSONObject.put(f4646J, C1175n.m2059a().m2150g());
            jSONObject.put(f4647K, C1175n.m2059a().m2152h());
            StringBuilder sb = new StringBuilder();
            sb.append(C1175n.m2059a().m2142d());
            sb.append(C1178q.m2182a(contextM2148f).m2184a());
            jSONObject.put(f4644H, sb.toString());
            if (C1175n.m2059a().m2154i() == 1) {
                jSONObject.put(f4649M, 1);
            }
            jSONObject.put(f4686ac, C1175n.m2059a().m2097C() ? C1175n.m2059a().m2098D() ? "1" : "3" : C1175n.m2059a().m2098D() ? "2" : "4");
            IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
            if (iExHandlerM2132b != null) {
                iExHandlerM2132b.fillRequestDeviceData(jSONObject, i);
            }
            String strM4075j = C1341e.m4075j();
            if (!TextUtils.isEmpty(strM4075j)) {
                jSONObject.put(f4687ad, Integer.parseInt(strM4075j));
            }
            if ((i & 4) == 4) {
                try {
                    C1391a c1391aM4865b2 = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
                    if (c1391aM4865b2 != null && (jSONObjectM4751ar = c1391aM4865b2.m4751ar()) != null) {
                        jSONObject.put("a_c", jSONObjectM4751ar);
                    }
                } catch (Exception unused) {
                }
            }
            if ((i & 16) == 16 && (listM4084n = C1341e.m4084n()) != null && listM4084n.size() > 0) {
                for (int i2 = 0; i2 < listM4084n.size(); i2++) {
                    C1254s c1254s = listM4084n.get(i2);
                    if (c1254s != null && !TextUtils.isEmpty(c1254s.m3425b())) {
                        jSONObject.put(c1254s.m3424a(), c1254s.m3425b());
                    }
                }
            }
            if ((i & 64) == 64) {
                jSONObject.put("isroot", C1341e.m4091r());
                jSONObject.put("cpu", C1341e.m4089q());
                jSONObject.put("isagent", C1341e.m4098u(contextM2148f));
                jSONObject.put(f4664aA, C1341e.m4102w(contextM2148f));
                jSONObject.put(f4665aB, C1341e.m4104x(contextM2148f));
                jSONObject.put(f4666aC, C1341e.m4100v(contextM2148f));
                jSONObject.put(f4667aD, C1341e.m4106y(contextM2148f));
                jSONObject.put("battery", C1341e.m4108z(contextM2148f));
                jSONObject.put(f4669aF, C1341e.m4093s());
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m3679a(String str) {
        return m3680a(C1175n.m2059a().m2143d(str));
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m3680a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        try {
                            jSONObject.put(str, obj.toString());
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            return jSONObject;
        } catch (Throwable unused3) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.json.JSONObject] */
    /* JADX INFO: renamed from: a */
    private static void m3681a(Context context, JSONObject jSONObject) throws JSONException {
        int i = f4692ai;
        if (i == -1) {
            boolean zM4149c = C1344h.m4149c(context);
            boolean zM4146b = C1344h.m4146b(context);
            ?? r3 = zM4146b ? 2 : zM4149c;
            if (zM4149c && zM4146b) {
                r3 = 3;
            }
            if (r3 > 0) {
                jSONObject.put(f4642F, r3);
            }
            f4692ai = r3;
        } else if (i > 0) {
            jSONObject.put(f4642F, i);
        }
        int i2 = f4693aj;
        if (i2 != -1) {
            if (i2 == 1) {
                jSONObject.put(f4641E, i2);
            }
        } else {
            boolean zM4148c = C1344h.m4148c();
            if (zM4148c) {
                jSONObject.put(f4641E, 1);
            }
            f4693aj = zM4148c ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3682a(JSONObject jSONObject) {
        try {
            C1232ay c1232ayM2104J = C1175n.m2059a().m2104J();
            JSONObject jSONObject2 = new JSONObject();
            int i = 1;
            if (c1232ayM2104J.m2865b() != 1) {
                i = 0;
            }
            jSONObject2.put("has_sdk", i);
            jSONObject2.put("sdk_ver", String.valueOf(c1232ayM2104J.m2867c()));
            jSONObject2.put("sdk_api_ver", String.valueOf(c1232ayM2104J.m2869d()));
            jSONObject2.put("open_app_id", C1341e.m4079l());
            jSONObject.put(f4695al, jSONObject2);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0044  */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.anythink.core.api.IExHandler] */
    /* JADX WARN: Type inference failed for: r2v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject m3683b(int r10) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p058h.C1275c.m3683b(int):org.json.JSONObject");
    }

    /* JADX INFO: renamed from: b */
    private static void m3684b(JSONObject jSONObject) throws JSONException {
        ATPrivacyConfig aTPrivacyConfigM2103I = C1175n.m2059a().m2103I();
        if (aTPrivacyConfigM2103I != null) {
            String devGaid = aTPrivacyConfigM2103I.getDevGaid();
            String devImei = aTPrivacyConfigM2103I.getDevImei();
            String devOaid = aTPrivacyConfigM2103I.getDevOaid();
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(devGaid)) {
                jSONObject2.put("set_gaid", devGaid);
            }
            if (!TextUtils.isEmpty(devImei)) {
                jSONObject2.put("set_imei", devImei);
            }
            if (!TextUtils.isEmpty(devOaid)) {
                jSONObject2.put("set_oaid", devOaid);
            }
            jSONObject.put(f4643G, jSONObject2);
        }
    }
}
