package com.anythink.expressad.videocommon.p181e;

import android.text.TextUtils;
import com.anythink.expressad.foundation.p111a.p112a.C1772a;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.videocommon.p178b.C2324i;
import com.anythink.expressad.videocommon.p179c.C2332b;
import com.anythink.expressad.videocommon.p179c.C2333c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.e.c */
/* JADX INFO: loaded from: classes.dex */
public class C2339c {

    /* JADX INFO: renamed from: a */
    public static final String f14615a = "reward";

    /* JADX INFO: renamed from: c */
    private static final String f14616c = "RewardSettingManager";

    /* JADX INFO: renamed from: e */
    private static Map<String, C2340d> f14617e = new HashMap(3);

    /* JADX INFO: renamed from: f */
    private static volatile C2339c f14618f;

    /* JADX INFO: renamed from: b */
    public C2337a f14619b;

    /* JADX INFO: renamed from: d */
    private Object f14620d = new Object();

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.e.c$1 */
    public class AnonymousClass1 implements C2324i.d {
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5464a(String str) {
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5465a(String str, String str2) {
        }
    }

    private C2339c() {
        this.f14619b = null;
        this.f14619b = m11998c();
    }

    /* JADX INFO: renamed from: a */
    public static C2339c m11994a() {
        if (f14618f == null) {
            synchronized (C2339c.class) {
                if (f14618f == null) {
                    f14618f = new C2339c();
                }
            }
        }
        return f14618f;
    }

    /* JADX INFO: renamed from: a */
    private static C2340d m11995a(boolean z) {
        C2340d c2340d = new C2340d();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C2332b(1, 15, null));
            c2340d.m12082a((List<C2332b>) arrayList);
            c2340d.m12058B();
            c2340d.m12108z();
            c2340d.m12059C();
            c2340d.m12064H();
            c2340d.m12061E();
            c2340d.m12063G();
            c2340d.m12102t();
            c2340d.m12103u();
            c2340d.m12105w();
            c2340d.m12107y();
            c2340d.m12101s();
            c2340d.m12091i();
            c2340d.m12075T();
            c2340d.m12089g();
            if (z) {
                c2340d.m12079a(5);
            } else {
                c2340d.m12079a(-1);
            }
            c2340d.m12086d();
            c2340d.m12085c();
            c2340d.m12099q();
            c2340d.m12069N();
            c2340d.m12071P();
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            arrayList2.add(4);
            arrayList2.add(6);
            c2340d.m12081a(arrayList2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c2340d;
    }

    /* JADX INFO: renamed from: a */
    private void m11996a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C2324i.m11867a().m11882b(str, (C2324i.a) new AnonymousClass1());
    }

    /* JADX INFO: renamed from: b */
    private static boolean m11997b(String str) {
        JSONArray jSONArrayOptJSONArray;
        try {
            if (!TextUtils.isEmpty(str) && (jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("unitSetting")) != null) {
                String strOptString = jSONArrayOptJSONArray.optJSONObject(0).optString("unitId");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    if (!TextUtils.isEmpty(strOptString)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C2337a m11998c() {
        C2337a c2337a = new C2337a();
        HashMap map = new HashMap(5);
        map.put("1", 1000);
        map.put("9", 1000);
        map.put("8", 1000);
        HashMap map2 = new HashMap(3);
        map2.put("1", new C2333c("Virtual Item", 1));
        c2337a.m11982a(map);
        c2337a.m11984b(map2);
        c2337a.m11981a();
        c2337a.m11983b();
        c2337a.m11986d();
        c2337a.m11988f();
        c2337a.m11990h();
        return c2337a;
    }

    /* JADX INFO: renamed from: a */
    public final C2340d m11999a(String str, String str2) {
        synchronized (this.f14620d) {
            String str3 = "reward_" + str + "_" + str2;
            if (f14617e.containsKey(str3)) {
                return f14617e.get(str3);
            }
            C2340d c2340dM12033c = C2340d.m12033c(C1772a.m8536a().m8543a(str3));
            f14617e.put(str3, c2340dM12033c);
            return c2340dM12033c;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C2340d m12000a(String str, String str2, boolean z) {
        C2340d c2340dM11995a;
        synchronized (this.f14620d) {
            String str3 = "reward_" + str + "_" + str2;
            c2340dM11995a = f14617e.get(str3);
            if (c2340dM11995a == null) {
                c2340dM11995a = m11995a(z);
                f14617e.put(str3, c2340dM11995a);
            }
        }
        return c2340dM11995a;
    }

    /* JADX INFO: renamed from: a */
    public final void m12001a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strM12003J = m11994a().m12000a(C1773a.m8548c().m8558f(), str, z) != null ? C2340d.m12003J() : "";
        if (TextUtils.isEmpty(strM12003J) || !TextUtils.isEmpty(C2324i.m11867a().m11883c(strM12003J)) || TextUtils.isEmpty(strM12003J)) {
            return;
        }
        C2324i.m11867a().m11882b(strM12003J, (C2324i.a) new AnonymousClass1());
    }

    /* JADX INFO: renamed from: b */
    public final C2337a m12002b() {
        C2337a c2337a = this.f14619b;
        return c2337a == null ? m11998c() : c2337a;
    }
}
