package com.anythink.core.p038b.p039a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.C1305l;
import com.anythink.core.common.C1325o;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p058h.AbstractC1268a;
import com.anythink.core.common.p058h.C1275c;
import com.anythink.core.common.p066o.C1340d;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.p047c.C1141b;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.github.kevinsawicki.http.HttpRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;
import p285z2.C4003ix;

/* JADX INFO: renamed from: com.anythink.core.b.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C1099a extends AbstractC1268a {

    /* JADX INFO: renamed from: a */
    public static final int f2554a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f2555b = 1;

    /* JADX INFO: renamed from: c */
    public static final String f2556c = "ex_pkg";

    /* JADX INFO: renamed from: w */
    private static final String f2557w = "a";

    /* JADX INFO: renamed from: L */
    private int f2569L;

    /* JADX INFO: renamed from: d */
    public String f2570d;

    /* JADX INFO: renamed from: e */
    public String f2571e;

    /* JADX INFO: renamed from: f */
    public String f2572f;

    /* JADX INFO: renamed from: g */
    public String f2573g;

    /* JADX INFO: renamed from: h */
    public String f2574h;

    /* JADX INFO: renamed from: i */
    public String f2575i;

    /* JADX INFO: renamed from: j */
    public String f2576j;

    /* JADX INFO: renamed from: k */
    public String f2577k;

    /* JADX INFO: renamed from: l */
    public int f2578l;

    /* JADX INFO: renamed from: p */
    public int f2579p;

    /* JADX INFO: renamed from: q */
    public int f2580q;

    /* JADX INFO: renamed from: r */
    public String f2581r;

    /* JADX INFO: renamed from: s */
    public String f2582s;

    /* JADX INFO: renamed from: t */
    public String f2583t;

    /* JADX INFO: renamed from: u */
    public String f2584u;

    /* JADX INFO: renamed from: v */
    public String f2585v;

    /* JADX INFO: renamed from: x */
    private int f2586x;

    /* JADX INFO: renamed from: y */
    private final String f2587y = C1396f.a.f6111j;

    /* JADX INFO: renamed from: z */
    private final String f2588z = "request_id";

    /* JADX INFO: renamed from: A */
    private final String f2558A = "ch_info";

    /* JADX INFO: renamed from: B */
    private final String f2559B = "wf";

    /* JADX INFO: renamed from: C */
    private final String f2560C = "np";

    /* JADX INFO: renamed from: D */
    private final String f2561D = "hb_size";

    /* JADX INFO: renamed from: E */
    private final String f2562E = "last_wf";

    /* JADX INFO: renamed from: F */
    private final String f2563F = "co";

    /* JADX INFO: renamed from: G */
    private final String f2564G = C1396f.a.f6030S;

    /* JADX INFO: renamed from: H */
    private final String f2565H = "debug";

    /* JADX INFO: renamed from: I */
    private final String f2566I = "sdk_ext";

    /* JADX INFO: renamed from: J */
    private final String f2567J = "last_win";

    /* JADX INFO: renamed from: K */
    private final String f2568K = "last_m_data";

    public C1099a(String str, String str2, String str3, List<JSONObject> list, int i, C1396f c1396f) {
        this.f2586x = 0;
        this.f2569L = 0;
        this.f2570d = str3;
        this.f2573g = str;
        this.f2574h = str2;
        this.f2586x = i;
        JSONArray jSONArray = new JSONArray();
        Iterator<JSONObject> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        this.f2571e = C1340d.m4029a(jSONArray.toString().getBytes());
        if (c1396f != null) {
            this.f2578l = c1396f.m5054Z();
            this.f2579p = c1396f.m5097ao();
            this.f2569L = c1396f.m5073aO();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m1608d(int i) {
        this.f2580q = i;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final int mo621a() {
        return 1;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final Object mo622a(Object obj) {
        try {
            return new JSONObject(obj.toString());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final void mo623a(int i, Object obj) {
        super.mo623a(i, obj);
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final void mo624a(AdError adError) {
    }

    /* JADX INFO: renamed from: a */
    public final void m1609a(C1100b c1100b) {
        String str = c1100b.f2589a;
        if (str != null) {
            this.f2572f = C1340d.m4029a(str.getBytes());
        }
        this.f2580q = c1100b.f2594f;
        if (!TextUtils.isEmpty(c1100b.f2590b) && !TextUtils.equals(C4003ix.OooOOO, c1100b.f2590b)) {
            this.f2575i = C1340d.m4029a(c1100b.f2590b.getBytes());
        }
        if (!TextUtils.isEmpty(c1100b.f2591c) && !TextUtils.equals(C4003ix.OooOOO, c1100b.f2591c)) {
            this.f2576j = C1340d.m4029a(c1100b.f2591c.getBytes());
        }
        if (!TextUtils.isEmpty(c1100b.f2592d) && !TextUtils.equals(C4003ix.OooOOO, c1100b.f2592d)) {
            this.f2581r = C1340d.m4029a(c1100b.f2592d.getBytes());
        }
        if (!TextUtils.isEmpty(c1100b.f2593e) && !TextUtils.equals(C4003ix.OooOOO, c1100b.f2593e)) {
            this.f2582s = C1340d.m4029a(c1100b.f2593e.getBytes());
        }
        this.f2583t = "";
        if (!TextUtils.isEmpty(c1100b.f2595g)) {
            this.f2583t = C1340d.m4029a(c1100b.f2595g.getBytes());
        }
        if (!TextUtils.isEmpty(c1100b.f2596h)) {
            this.f2577k = C1340d.m4029a(c1100b.f2596h.getBytes());
        }
        if (!TextUtils.isEmpty(c1100b.f2597i) && !TextUtils.equals(MessageFormatter.DELIM_STR, c1100b.f2597i)) {
            this.f2584u = C1340d.m4029a(c1100b.f2597i.getBytes());
        }
        if (TextUtils.isEmpty(c1100b.f2598j) || TextUtils.equals(C4003ix.OooOOO, c1100b.f2598j)) {
            return;
        }
        this.f2585v = C1340d.m4029a(c1100b.f2598j.getBytes());
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final boolean mo625a(int i) {
        return false;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final String mo626b() {
        return this.f2573g;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final void mo627b(AdError adError) {
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: c */
    public final Map<String, String> mo628c() {
        HashMap map = new HashMap();
        if (this.f2586x == 0) {
            map.put(HttpRequest.HEADER_ACCEPT_ENCODING, "gzip");
        }
        map.put("Content-Type", "application/json;charset=utf-8");
        return map;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: d */
    public final byte[] mo629d() {
        return mo632g().getBytes();
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: e */
    public final JSONObject mo630e() {
        JSONObject jSONObjectM1863a;
        C1396f c1396fM5146b;
        JSONObject jSONObjectM5067aI;
        JSONObject jSONObjectMo630e = super.mo630e();
        try {
            jSONObjectMo630e.put("app_id", C1175n.m2059a().m2165o());
            jSONObjectMo630e.put("pl_id", this.f2574h);
            jSONObjectMo630e.put(C1801a.f11088bt, C1175n.m2059a().m2151g(this.f2574h));
            jSONObjectMo630e.put("t_g_id", this.f2578l);
            jSONObjectMo630e.put("gro_id", this.f2579p);
            String strM2178y = C1175n.m2059a().m2178y();
            if (!TextUtils.isEmpty(strM2178y)) {
                jSONObjectMo630e.put("sy_id", strM2178y);
            }
            String strM2179z = C1175n.m2059a().m2179z();
            if (TextUtils.isEmpty(strM2179z)) {
                C1175n.m2059a().m2158k(C1175n.m2059a().m2177x());
                strM2179z = C1175n.m2059a().m2177x();
            }
            jSONObjectMo630e.put("bk_id", strM2179z);
            if (C1175n.m2059a().m2132b() != null) {
                jSONObjectMo630e.put("deny", C1341e.m4088p(C1175n.m2059a().m2148f()));
            }
            if (this.f2586x == 0) {
                jSONObjectMo630e.put("misk_spt", C1325o.m3942a().m3952c());
                C1325o.m3942a();
                jSONObjectMo630e.put("misk_pt_det", C1325o.m3943b());
            }
            jSONObjectMo630e.put(C1275c.f4694ak, C1305l.m3759a().m3762c());
            JSONObject jSONObjectM3679a = C1275c.m3679a(this.f2574h);
            if (jSONObjectM3679a != null) {
                jSONObjectMo630e.put("customs", jSONObjectM3679a);
            }
            C1275c.m3682a(jSONObjectMo630e);
            C1398h c1398hM5135a = C1398h.m5135a(C1175n.m2059a().m2148f());
            String str = this.f2574h;
            if (jSONObjectMo630e != null && !TextUtils.isEmpty(str)) {
                try {
                    if (!TextUtils.isEmpty(str) && (c1396fM5146b = c1398hM5135a.m5146b(str)) != null && (jSONObjectM5067aI = c1396fM5146b.m5067aI()) != null) {
                        jSONObjectMo630e.put(C1396f.a.f6065aa, jSONObjectM5067aI);
                    }
                } catch (Exception unused) {
                }
            }
            if (this.f2569L > 0 && (jSONObjectM1863a = C1141b.m1860a().m1863a(this.f2574h, this.f2569L)) != null) {
                jSONObjectMo630e.put(C1275c.f4700aq, jSONObjectM1863a);
            }
            if (ATAdxSetting.getInstance().isAdxNetworkMode(this.f2574h)) {
                jSONObjectMo630e.put(C1275c.f4683aT, 1);
            }
        } catch (Exception unused2) {
        }
        return jSONObjectMo630e;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: f */
    public final JSONObject mo631f() {
        JSONObject jSONObjectMo631f = super.mo631f();
        try {
            if (C1175n.m2059a().m2132b() != null) {
                jSONObjectMo631f.put("btts", C1341e.m4069g());
            }
        } catch (JSONException unused) {
        }
        return jSONObjectMo631f;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: g */
    public final String mo632g() {
        String string = mo630e().toString();
        String string2 = mo631f().toString();
        HashMap map = new HashMap();
        String strM4028a = C1340d.m4028a(string);
        String strM4028a2 = C1340d.m4028a(string2);
        map.put("p", strM4028a);
        map.put(C1275c.f4658V, strM4028a2);
        map.put(C1396f.a.f6111j, this.f2571e);
        map.put("request_id", this.f2570d);
        int i = this.f2580q;
        if (i > 0) {
            map.put("hb_size", Integer.valueOf(i));
        }
        if (this.f2586x == 0) {
            if (!TextUtils.isEmpty(this.f2572f)) {
                map.put("ch_info", this.f2572f);
            }
            if (!TextUtils.isEmpty(this.f2575i)) {
                map.put("wf", this.f2575i);
            }
            if (!TextUtils.isEmpty(this.f2576j)) {
                map.put("np", this.f2576j);
            }
            if (!TextUtils.isEmpty(this.f2581r)) {
                map.put("last_wf", this.f2581r);
            }
            if (!TextUtils.isEmpty(this.f2582s)) {
                map.put("co", this.f2582s);
            }
            map.put(C1396f.a.f6030S, this.f2583t);
            if (C1175n.m2059a().m2157k() != null) {
                map.put(f2556c, C1340d.m4028a(C1175n.m2059a().m2157k().toString()));
            }
            if (C1175n.m2059a().m2095A() && C1175n.m2059a().m2174u()) {
                map.put("debug", 1);
            }
            if (!TextUtils.isEmpty(this.f2577k)) {
                map.put("sdk_ext", this.f2577k);
            }
            if (!TextUtils.isEmpty(this.f2584u)) {
                map.put("last_win", this.f2584u);
            }
            if (!TextUtils.isEmpty(this.f2585v)) {
                map.put("last_m_data", this.f2585v);
            }
        }
        Set<String> setKeySet = map.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : setKeySet) {
                jSONObject.put(str, map.get(str));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: h */
    public final String mo633h() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: i */
    public final Context mo634i() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: j */
    public final String mo635j() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: k */
    public final Map<String, Object> mo636k() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: l */
    public final int mo637l() {
        return 118;
    }
}
