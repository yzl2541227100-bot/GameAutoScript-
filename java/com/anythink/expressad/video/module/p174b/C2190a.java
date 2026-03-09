package com.anythink.expressad.video.module.p174b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p052c.C1186g;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p126f.p134h.C1855b;
import com.anythink.expressad.foundation.p138h.C1876j;
import com.anythink.expressad.p073a.C1405a;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.anythink.expressad.video.module.p175c.C2191a;
import com.anythink.expressad.videocommon.p179c.C2333c;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.video.module.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2190a {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, ArrayList<String>> f13895a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private static final String f13896b = "VideoViewReport";

    /* JADX INFO: renamed from: a */
    private static String m11520a(String str, C1855b c1855b) {
        String strTrim = c1855b.m9594a().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return "";
        }
        if (!str.endsWith("?") && !str.endsWith("&")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str.contains("?") ? "&" : "?");
            str = sb.toString();
        }
        return str + strTrim;
    }

    /* JADX INFO: renamed from: a */
    public static void m11521a() {
    }

    /* JADX INFO: renamed from: a */
    public static void m11522a(Context context, C1781c c1781c) {
        if (c1781c == null || c1781c.m8804L() == null || c1781c.m8804L().m9205o() == null) {
            return;
        }
        C1405a.m5187a(context, c1781c, c1781c.m8803K(), c1781c.m8804L().m9205o(), false);
    }

    /* JADX INFO: renamed from: a */
    public static void m11523a(Context context, C1781c c1781c, int i, int i2) {
        StringBuilder sb;
        try {
            String[] strArrM9207p = c1781c.m8804L().m9207p();
            if (c1781c == null || c1781c.m8804L() == null || strArrM9207p == null) {
                return;
            }
            String[] strArr = new String[strArrM9207p.length];
            for (int i3 = 0; i3 < strArrM9207p.length; i3++) {
                String str = strArrM9207p[i3];
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("endscreen_type", i);
                String string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = C1876j.m9686a(string);
                }
                if (!TextUtils.isEmpty(string)) {
                    str = str + "&value=" + URLEncoder.encode(string);
                }
                if (c1781c.m8896n() == 1) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append("&to=1&cbt=");
                    sb.append(c1781c.m8857az());
                    sb.append("&tmorl=");
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append("&to=0&cbt=");
                    sb.append(c1781c.m8857az());
                    sb.append("&tmorl=");
                }
                sb.append(i2);
                strArr[i3] = sb.toString();
            }
            C1405a.m5187a(context, c1781c, c1781c.m8803K(), strArr, true);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11524a(Context context, C1781c c1781c, int i, int i2, int i3) {
        StringBuilder sb;
        if (i2 == 0 || context == null || c1781c == null) {
            return;
        }
        try {
            List<Map<Integer, String>> listM9192i = c1781c.m8804L().m9192i();
            int i4 = ((i + 1) * 100) / i2;
            if (listM9192i != null) {
                int i5 = 0;
                while (i5 < listM9192i.size()) {
                    Map<Integer, String> map = listM9192i.get(i5);
                    if (map != null && map.size() > 0) {
                        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<Integer, String> next = it.next();
                            int iIntValue = next.getKey().intValue();
                            String value = next.getValue();
                            if (c1781c.m8896n() == 1) {
                                sb = new StringBuilder();
                                sb.append(value);
                                sb.append("&to=1&cbt=");
                                sb.append(c1781c.m8857az());
                                sb.append("&tmorl=");
                            } else {
                                sb = new StringBuilder();
                                sb.append(value);
                                sb.append("&to=0&cbt=");
                                sb.append(c1781c.m8857az());
                                sb.append("&tmorl=");
                            }
                            sb.append(i3);
                            String string = sb.toString();
                            if (iIntValue <= i4 && !TextUtils.isEmpty(string)) {
                                C1405a.m5187a(context, c1781c, c1781c.m8803K(), new String[]{string}, true);
                                it.remove();
                                listM9192i.remove(i5);
                                i5--;
                            }
                        }
                    }
                    i5++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11525a(C1781c c1781c, C2333c c2333c, String str, String str2, String str3) {
        String str4 = "&";
        String str5 = "";
        if (c1781c == null || c2333c == null) {
            return;
        }
        try {
            C2191a c2191a = new C2191a(C1175n.m2059a().m2148f());
            C1855b c1855b = new C1855b();
            c1855b.m9595a("user_id", C1876j.m9686a(str2));
            c1855b.m9595a(C1485b.f6992aM, "1");
            c1855b.m9595a("reward_name", c2333c.m11969a());
            StringBuilder sb = new StringBuilder();
            sb.append(c2333c.m11972b());
            c1855b.m9595a("reward_amount", sb.toString());
            c1855b.m9595a("unit_id", str);
            c1855b.m9595a("click_id", c1781c.m8832aa());
            if (!TextUtils.isEmpty(str3)) {
                c1855b.m9595a(C1186g.a.f3498h, str3);
            }
            c2191a.mo9586a("", c1855b);
            String string = c1781c.m8842ak() + "/addReward?";
            String strTrim = c1855b.m9594a().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                if (!string.endsWith("?") && !string.endsWith("&")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    if (!string.contains("?")) {
                        str4 = "?";
                    }
                    sb2.append(str4);
                    string = sb2.toString();
                }
                str5 = string + strTrim;
            }
            C1405a.m5185a(C1175n.m2059a().m2148f(), c1781c, c1781c.m8803K(), str5, false);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11526a(C1781c c1781c, String str) {
        if (c1781c != null) {
            try {
                if (c1781c.m8843al() == null || c1781c.m8843al().size() <= 0) {
                    return;
                }
                for (String str2 : c1781c.m8843al()) {
                    if (!TextUtils.isEmpty(str2)) {
                        C1405a.m5185a(C1175n.m2059a().m2148f(), c1781c, str, str2, false);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11527a(C1781c c1781c, Map<Integer, String> map, String str, int i) {
        if (c1781c == null || map == null) {
            return;
        }
        try {
            if (map.size() > 0) {
                Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, String> next = it.next();
                    Integer key = next.getKey();
                    String value = next.getValue();
                    if (i == key.intValue() && !TextUtils.isEmpty(value)) {
                        C1405a.m5185a(C1175n.m2059a().m2148f(), c1781c, str, value, false);
                        it.remove();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11528a(String str) {
        f13895a.remove(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m11529b(Context context, C1781c c1781c) {
        if (c1781c == null || c1781c.m8804L() == null || c1781c.m8804L().m9195j() == null) {
            return;
        }
        C1405a.m5187a(context, c1781c, c1781c.m8803K(), c1781c.m8804L().m9195j(), false);
    }

    /* JADX INFO: renamed from: c */
    public static void m11530c(Context context, C1781c c1781c) {
        if (c1781c == null || c1781c.m8804L() == null || c1781c.m8804L().m9197k() == null) {
            return;
        }
        C1405a.m5187a(context, c1781c, c1781c.m8803K(), c1781c.m8804L().m9197k(), false);
    }

    /* JADX INFO: renamed from: d */
    public static void m11531d(Context context, C1781c c1781c) {
        if (c1781c == null || c1781c.m8804L() == null || c1781c.m8804L().m9209q() == null) {
            return;
        }
        C1405a.m5187a(context, c1781c, c1781c.m8803K(), c1781c.m8804L().m9209q(), false);
    }

    /* JADX INFO: renamed from: e */
    public static void m11532e(Context context, C1781c c1781c) {
        if (c1781c == null || c1781c.m8804L() == null || c1781c.m8804L().m9201m() == null) {
            return;
        }
        C1405a.m5187a(context, c1781c, c1781c.m8803K(), c1781c.m8804L().m9201m(), false);
    }

    /* JADX INFO: renamed from: f */
    private static void m11533f(Context context, C1781c c1781c) {
        if (c1781c == null || c1781c.m8804L() == null || c1781c.m8804L().m9183d() == null) {
            return;
        }
        C1405a.m5187a(context, c1781c, c1781c.m8803K(), c1781c.m8804L().m9183d(), true);
    }

    /* JADX INFO: renamed from: g */
    private static void m11534g(Context context, C1781c c1781c) {
        if (c1781c == null || c1781c.m8804L() == null || c1781c.m8804L().m9185e() == null) {
            return;
        }
        C1405a.m5187a(context, c1781c, c1781c.m8803K(), c1781c.m8804L().m9185e(), false);
    }

    /* JADX INFO: renamed from: h */
    private static void m11535h(Context context, C1781c c1781c) {
        if (c1781c == null || c1781c.m8804L() == null || c1781c.m8804L().m9187f() == null) {
            return;
        }
        C1405a.m5187a(context, c1781c, c1781c.m8803K(), c1781c.m8804L().m9187f(), false);
    }

    /* JADX INFO: renamed from: i */
    private static void m11536i(Context context, C1781c c1781c) {
        if (c1781c == null || c1781c.m8804L() == null || c1781c.m8804L().m9189g() == null) {
            return;
        }
        C1405a.m5187a(context, c1781c, c1781c.m8803K(), c1781c.m8804L().m9189g(), false);
    }

    /* JADX INFO: renamed from: j */
    private static void m11537j(Context context, C1781c c1781c) {
        if (c1781c == null || c1781c.m8804L() == null || c1781c.m8804L().m9191h() == null) {
            return;
        }
        C1405a.m5187a(context, c1781c, c1781c.m8803K(), c1781c.m8804L().m9191h(), false);
    }

    /* JADX INFO: renamed from: k */
    private static void m11538k(Context context, C1781c c1781c) {
        if (c1781c == null || c1781c.m8804L() == null || c1781c.m8804L().m9199l() == null) {
            return;
        }
        String strM8803K = c1781c.m8803K();
        ArrayList<String> arrayList = f13895a.get(strM8803K);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            f13895a.put(strM8803K, arrayList);
        }
        if (arrayList.contains(c1781c.m10146aZ())) {
            return;
        }
        C1405a.m5187a(context, c1781c, c1781c.m8803K(), c1781c.m8804L().m9199l(), false);
        arrayList.add(c1781c.m10146aZ());
    }
}
