package com.anythink.core.p038b;

import android.text.TextUtils;
import com.anythink.core.common.C1294j;
import com.anythink.core.common.C1388v;
import com.anythink.core.common.p055f.C1202a;
import com.anythink.core.common.p055f.C1224aq;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1233az;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1246k;
import com.anythink.core.common.p055f.C1250o;
import com.anythink.core.common.p055f.C1251p;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1359w;
import com.anythink.core.common.p069p.C1370i;
import com.anythink.core.p038b.p039a.C1099a;
import com.anythink.core.p038b.p039a.C1100b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1105c extends AbstractC1110e {

    /* JADX INFO: renamed from: a */
    public String f2630a;

    /* JADX INFO: renamed from: b */
    public List<C1229av> f2631b;

    /* JADX INFO: renamed from: c */
    public List<C1229av> f2632c;

    /* JADX INFO: renamed from: d */
    public boolean f2633d;

    /* JADX INFO: renamed from: e */
    public boolean f2634e;

    public C1105c(C1202a c1202a, List<C1229av> list) {
        super(c1202a);
        this.f2630a = C1344h.m4137a(c1202a.f3678b, this.f2666n, this.f2667o, c1202a.f3682f, 0).toString();
        C1370i c1370i = c1202a.f3701y;
        this.f2631b = c1370i != null ? c1370i.m4375a() : null;
        this.f2632c = list != null ? new ArrayList(list) : null;
    }

    /* JADX INFO: renamed from: a */
    private void m1632a(String str, String str2) {
        String strM2630a;
        boolean zM2632b;
        Boolean boolM2633c;
        int iM4581b = C1388v.m4576a(this.f2638f.f3678b).m4581b(this.f2638f.f3681e);
        C1224aq c1224aq = this.f2638f.f3699w;
        if (c1224aq != null) {
            boolM2633c = c1224aq.m2633c();
            strM2630a = this.f2638f.f3699w.m2630a();
            zM2632b = this.f2638f.f3699w.m2632b();
        } else {
            strM2630a = "";
            zM2632b = true;
            boolM2633c = null;
        }
        C1202a c1202a = this.f2638f;
        C1243h c1243h = c1202a.f3695s;
        int i = c1202a.f3679c.f4483d;
        int i2 = c1202a.f3696t;
        boolean z = this.f2633d;
        boolean z3 = this.f2634e;
        boolean zM4159a = C1345i.m4159a(c1202a.f3678b);
        C1246k c1246k = new C1246k(c1243h.m2679aj(), null);
        c1246k.f4244a = "1004684";
        c1246k.f4245b = c1243h.m2678ai();
        c1246k.f4247d = c1243h.m2677ah();
        c1246k.f4254k = String.valueOf(i);
        c1246k.f4256m = String.valueOf(iM4581b);
        c1246k.f4257n = String.valueOf(c1243h.m2679aj());
        c1246k.f4258o = zM2632b ? "1" : "2";
        c1246k.f4259p = String.valueOf(i2);
        if (!TextUtils.isEmpty(str2)) {
            c1246k.f4260q = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            c1246k.f4261r = str;
        }
        c1246k.f4262s = boolM2633c == null ? "0" : boolM2633c.booleanValue() ? "1" : "2";
        c1246k.f4263t = strM2630a;
        c1246k.f4264u = z ? "1" : "2";
        c1246k.f4265v = z3 ? "1" : "2";
        c1246k.f4266w = String.valueOf(i);
        c1246k.f4267x = zM4159a ? "1" : "2";
        C1322e.m3929b(c1246k);
    }

    /* JADX INFO: renamed from: a */
    private void m1633a(JSONArray jSONArray) {
        List<C1229av> list = this.f2632c;
        if (list != null) {
            Iterator<C1229av> it = list.iterator();
            while (it.hasNext()) {
                List<C1233az.a> listM4259a = C1359w.m4259a(this.f2667o, it.next());
                if (listM4259a != null && listM4259a.size() > 0) {
                    Iterator<C1233az.a> it2 = listM4259a.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next().m2887a());
                    }
                }
            }
        }
        List<C1229av> list2 = this.f2631b;
        if (list2 != null) {
            Iterator<C1229av> it3 = list2.iterator();
            while (it3.hasNext()) {
                List<C1233az.a> listM4259a2 = C1359w.m4259a(this.f2667o, it3.next());
                if (listM4259a2 != null && listM4259a2.size() > 0) {
                    Iterator<C1233az.a> it4 = listM4259a2.iterator();
                    while (it4.hasNext()) {
                        jSONArray.put(it4.next().m2887a());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1634b(JSONArray jSONArray) {
        C1370i c1370i = this.f2638f.f3701y;
        List<C1229av> listM4375a = c1370i != null ? c1370i.m4375a() : null;
        if (listM4375a != null) {
            int size = listM4375a.size();
            for (int i = 0; i < size; i++) {
                C1229av c1229av = listM4375a.get(i);
                if (!c1229av.m2748aa()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("ad_source_id", c1229av.m2842u());
                        jSONObject.put("price", c1229av.m2850y());
                        C1252q c1252qM2719M = c1229av.m2719M();
                        if (c1252qM2719M != null) {
                            jSONObject.put(C1233az.f4044m, c1252qM2719M.f4438g);
                        }
                        jSONObject.put(C1294j.f4881ao, c1229av.m2754ag());
                        jSONArray.put(jSONObject);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private String m1635f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh", this.f2638f.f3695s.m3037N());
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.p038b.AbstractC1110e, com.anythink.core.p038b.AbstractC1107d
    /* JADX INFO: renamed from: a */
    public final void mo1606a(C1229av c1229av, C1250o c1250o, long j) {
        super.mo1606a(c1229av, c1250o, j);
    }

    @Override // com.anythink.core.p038b.AbstractC1110e
    /* JADX INFO: renamed from: a */
    public final void mo1636a(List<JSONObject> list, InterfaceC1283k interfaceC1283k) {
        String string;
        String strM2630a;
        Boolean boolM2633c;
        boolean zM2632b;
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        m1634b(jSONArray2);
        m1633a(jSONArray);
        C1100b c1100b = new C1100b();
        c1100b.f2589a = this.f2630a;
        c1100b.f2590b = jSONArray2.toString();
        c1100b.f2594f = this.f2638f.f3690n.m2916a().m5062aD();
        String string2 = jSONArray.length() > 0 ? jSONArray.toString() : "";
        C1233az c1233az = this.f2638f.f3698v;
        if (c1233az != null) {
            string = c1233az.m2880a().toString();
            c1100b.f2592d = string;
        } else {
            string = "";
        }
        c1100b.f2593e = string2;
        c1100b.f2595g = this.f2638f.f3690n.m2916a().m5124r();
        c1100b.f2596h = m1635f();
        C1251p c1251p = this.f2638f.f3700x;
        c1100b.f2597i = c1251p != null ? c1251p.m3398f() : "";
        C1202a c1202a = this.f2638f;
        String str = c1202a.f3677B;
        if (str == null) {
            str = "";
        }
        c1100b.f2598j = str;
        int iM4581b = C1388v.m4576a(c1202a.f3678b).m4581b(this.f2638f.f3681e);
        C1224aq c1224aq = this.f2638f.f3699w;
        if (c1224aq != null) {
            boolM2633c = c1224aq.m2633c();
            strM2630a = this.f2638f.f3699w.m2630a();
            zM2632b = this.f2638f.f3699w.m2632b();
        } else {
            strM2630a = "";
            boolM2633c = null;
            zM2632b = true;
        }
        C1202a c1202a2 = this.f2638f;
        C1243h c1243h = c1202a2.f3695s;
        int i = c1202a2.f3679c.f4483d;
        int i2 = c1202a2.f3696t;
        boolean z = this.f2633d;
        boolean z3 = this.f2634e;
        boolean zM4159a = C1345i.m4159a(c1202a2.f3678b);
        C1246k c1246k = new C1246k(c1243h.m2679aj(), null);
        c1246k.f4244a = "1004684";
        c1246k.f4245b = c1243h.m2678ai();
        c1246k.f4247d = c1243h.m2677ah();
        c1246k.f4254k = String.valueOf(i);
        c1246k.f4256m = String.valueOf(iM4581b);
        c1246k.f4257n = String.valueOf(c1243h.m2679aj());
        c1246k.f4258o = zM2632b ? "1" : "2";
        c1246k.f4259p = String.valueOf(i2);
        if (!TextUtils.isEmpty(string2)) {
            c1246k.f4260q = string2;
        }
        if (!TextUtils.isEmpty(string)) {
            c1246k.f4261r = string;
        }
        c1246k.f4262s = boolM2633c == null ? "0" : boolM2633c.booleanValue() ? "1" : "2";
        c1246k.f4263t = strM2630a;
        c1246k.f4264u = z ? "1" : "2";
        c1246k.f4265v = z3 ? "1" : "2";
        c1246k.f4266w = String.valueOf(i);
        c1246k.f4267x = zM4159a ? "1" : "2";
        C1322e.m3929b(c1246k);
        C1099a c1099a = new C1099a(this.f2668p, this.f2667o, this.f2666n, list, 0, this.f2638f.f3690n.m2916a());
        c1099a.m1609a(c1100b);
        c1099a.mo3639a(0, interfaceC1283k);
    }

    @Override // com.anythink.core.p038b.AbstractC1110e
    /* JADX INFO: renamed from: a */
    public final synchronized void mo1637a(List<JSONObject> list, Map<String, C1229av> map) {
        super.mo1637a(list, map);
        C1388v.m4576a(this.f2638f.f3678b).m4579a(this.f2638f.f3681e);
        this.f2633d = false;
        this.f2634e = false;
        try {
            Iterator<Map.Entry<String, C1229av>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    C1229av value = it.next().getValue();
                    if (value.m2784d() == 66) {
                        this.f2633d = true;
                    } else if (value.m2784d() == 6) {
                        this.f2634e = true;
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.anythink.core.p038b.AbstractC1110e
    /* JADX INFO: renamed from: b */
    public final String mo1638b() {
        return this.f2638f.f3688l;
    }
}
