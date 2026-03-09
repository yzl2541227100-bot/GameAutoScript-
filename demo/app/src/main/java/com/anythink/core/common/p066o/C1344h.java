package com.anythink.core.common.p066o;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.anythink.core.api.ATCustomRuleKeys;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1222ao;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p057g.InterfaceC1266d;
import com.anythink.core.p037a.C1086a;
import com.anythink.expressad.foundation.p116d.C1782d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.o.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1344h {

    /* JADX INFO: renamed from: a */
    public static Random f5284a = new Random();

    /* JADX INFO: renamed from: com.anythink.core.common.o.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final String f5285a = "com.android.vending";
    }

    /* JADX INFO: renamed from: a */
    public static double m4129a(C1229av c1229av) {
        if (c1229av != null) {
            return c1229av.m2754ag();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: a */
    private static int m4130a(int i, int[] iArr, int i2) {
        if (iArr == null) {
            return i2;
        }
        for (int i3 : iArr) {
            if (i == i3) {
                return i;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static String m4131a() {
        return TextUtils.isEmpty("UA_6.2.77") ? "UA_0.0.0" : "UA_6.2.77";
    }

    /* JADX INFO: renamed from: a */
    public static String m4132a(int i) {
        switch (i) {
            case 2:
                return "c2s";
            case 3:
                return "s2s";
            case 4:
                return "adx";
            case 5:
                return "adx open";
            case 6:
            case 10:
            default:
                return "";
            case 7:
                return "fb in-house";
            case 8:
                return "directly";
            case 9:
                return "dynamic";
            case 11:
                return "custom in-house";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m4133a(Context context) {
        String strM2177x = C1175n.m2059a().m2177x();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C1341e.m4060d(context));
        stringBuffer.append("&");
        stringBuffer.append(C1341e.m4065f());
        stringBuffer.append("&");
        stringBuffer.append(strM2177x);
        stringBuffer.append("&");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("&");
        stringBuffer.append(new Random().nextInt(10000));
        return C1343g.m4123a(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: a */
    public static String m4134a(AbstractC1247l abstractC1247l) {
        return C1343g.m4123a(abstractC1247l.m3229t() + abstractC1247l.m3165E());
    }

    /* JADX INFO: renamed from: a */
    public static String m4135a(String str, String str2, long j) {
        return str + "_" + str2 + "_" + j;
    }

    /* JADX INFO: renamed from: a */
    public static List<C1229av> m4136a(List<C1229av> list, InterfaceC1266d interfaceC1266d) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap map = new HashMap(3);
        ArrayList arrayList = new ArrayList();
        for (C1229av c1229av : list) {
            double dM4129a = m4129a(c1229av);
            List arrayList2 = (List) linkedHashMap.get(String.valueOf(dM4129a));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(String.valueOf(dM4129a), arrayList2);
            }
            Integer num = (Integer) map.get(String.valueOf(dM4129a));
            if (num == null) {
                num = 0;
            }
            map.put(String.valueOf(dM4129a), Integer.valueOf(num.intValue() + c1229av.m2725S()));
            arrayList2.add(c1229av);
        }
        int i = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            List list2 = (List) entry.getValue();
            int iIntValue = ((Integer) map.get(entry.getKey())).intValue();
            int i2 = -1;
            while (true) {
                if (list2.size() <= 0) {
                    break;
                }
                if (list2.size() == 1) {
                    C1229av c1229av2 = (C1229av) list2.get(0);
                    arrayList.add(c1229av2);
                    list2.remove(0);
                    if (interfaceC1266d != null) {
                        interfaceC1266d.mo3613a(c1229av2, i, i2);
                    }
                    i++;
                } else {
                    int iNextInt = f5284a.nextInt(iIntValue) + 1;
                    Iterator it = list2.iterator();
                    int iM2725S = 0;
                    while (true) {
                        if (it.hasNext()) {
                            C1229av c1229av3 = (C1229av) it.next();
                            if (c1229av3.m2725S() + iM2725S >= iNextInt) {
                                arrayList.add(c1229av3);
                                list2.remove(c1229av3);
                                iIntValue -= c1229av3.m2725S();
                                if (i2 == -1) {
                                    i2 = 0;
                                }
                                if (interfaceC1266d != null) {
                                    interfaceC1266d.mo3613a(c1229av3, i, i2);
                                }
                                i2++;
                                i++;
                            } else {
                                iM2725S += c1229av3.m2725S();
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m4137a(Context context, String str, String str2, int i, int i2) {
        int[] iArrM1573a = C1086a.m1566a(context).m1573a(i);
        int i3 = iArrM1573a[0];
        int i4 = iArrM1573a[1];
        C1222ao c1222aoM1568a = C1086a.m1566a(context).m1568a(str2, i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sr", "tp");
            jSONObject.put("rid", str);
            jSONObject.put(C1782d.f10553h, i3);
            jSONObject.put("ahs", i4);
            jSONObject.put("pds", c1222aoM1568a != null ? c1222aoM1568a.f3862c : 0);
            jSONObject.put("phs", c1222aoM1568a != null ? c1222aoM1568a.f3863d : 0);
            jSONObject.put("ap", i2);
            jSONObject.put("tpl", str2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static void m4138a(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.removeJavascriptInterface("searchBoxjavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
        webView.getSettings().setAllowFileAccess(false);
        if (Build.VERSION.SDK_INT >= 16) {
            webView.getSettings().setAllowFileAccessFromFileURLs(false);
            webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        }
        webView.getSettings().setSavePassword(false);
    }

    /* JADX INFO: renamed from: a */
    private static void m4139a(String str, List<C1229av> list) {
        if (list != null) {
            try {
                StringBuilder sb = new StringBuilder();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C1229av c1229av = list.get(i);
                    sb.append("\n");
                    sb.append(i);
                    sb.append(" --> adSourceId: ");
                    sb.append(c1229av.m2842u());
                    sb.append(", ");
                    sb.append(c1229av.m2789e());
                    sb.append(", real: ");
                    sb.append(c1229av.m2850y());
                    sb.append(", sort: ");
                    sb.append(m4129a(c1229av));
                    String strM2698A = c1229av.m2698A();
                    if (!TextUtils.isEmpty(strM2698A)) {
                        sb.append(", errorMsg: ");
                        sb.append(strM2698A);
                    }
                }
                Log.e(str, sb.toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4140a(List<C1229av> list, C1229av c1229av) {
        if (list == null) {
            return;
        }
        int size = list.size();
        if (size == 0) {
            list.add(c1229av);
            return;
        }
        int i = size - 1;
        for (int i2 = 0; i2 < size; i2++) {
            C1229av c1229av2 = list.get(i2);
            double dM4129a = m4129a(c1229av);
            double dM4129a2 = m4129a(c1229av2);
            boolean z = true;
            if (dM4129a >= dM4129a2) {
                list.add(i2, c1229av);
            } else if (i2 == i) {
                list.add(c1229av);
            } else {
                z = false;
            }
            if (z) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4141a(Map<String, Object> map, C1243h c1243h) {
        if (c1243h == null || c1243h.m3039P() >= 100000) {
            return;
        }
        map.put(C1169h.p.f3229h, c1243h);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4142a(String str) {
        String str2;
        if (TextUtils.isEmpty(str) || str.length() > 128) {
            str2 = "Invalid Channel(" + str + "):Channel'length over 128";
        } else {
            if (Pattern.matches("^([.A-Za-z0-9_-]){1,128}$", str)) {
                return true;
            }
            str2 = "Invalid Channel(" + str + "): contains some characters that are not in the ^([.A-Za-z0-9_-]){1,128}$";
        }
        Log.e("anythink", str2);
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4143a(List<C1229av> list, C1229av c1229av, C1229av c1229av2, int i, int i2, boolean z) {
        if (z && c1229av.m2774b() == -1) {
            list.add(i, c1229av2);
            return true;
        }
        if (m4129a(c1229av2) >= m4129a(c1229av)) {
            list.add(i, c1229av2);
            return true;
        }
        if (i != i2) {
            return false;
        }
        list.add(c1229av2);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static String m4144b(String str, String str2, long j) {
        return m4135a(str, str2, j) + "_refresh";
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4145b() {
        try {
            Map<String, Object> mapM2159l = C1175n.m2059a().m2159l();
            if (mapM2159l == null || !mapM2159l.containsKey(ATCustomRuleKeys.AGE)) {
                return false;
            }
            return Integer.parseInt(mapM2159l.get(ATCustomRuleKeys.AGE).toString()) <= 13;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4146b(Context context) {
        return C1356t.m4243a().m4244a(context);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4147b(String str) {
        String str2;
        if (TextUtils.isEmpty(str) || str.length() > 128) {
            str2 = "Invalid SubChannel(" + str + "):SubChannel'length over 128";
        } else {
            if (Pattern.matches("^([.A-Za-z0-9_-]){1,128}$", str)) {
                return true;
            }
            str2 = "Invalid SubChannel(" + str + "):SubChannel contains some characters that are not in the ^([.A-Za-z0-9_-]){1,128}$";
        }
        Log.e("anythink", str2);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4148c() {
        return C1356t.m4243a().m4245b();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4149c(Context context) {
        return C1356t.m4243a().m4246b(context);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4150c(String str) {
        StringBuilder sb;
        String str2;
        if (!TextUtils.isEmpty(str)) {
            if (str.length() > 50) {
                sb = new StringBuilder("Invalid ScenarioId(");
                sb.append(str);
                str2 = "):The length of ScenarioId must be between 1-50.";
            } else {
                if (!Pattern.matches(".*[\\u4E00-\\u9FFF\\s]+.*", str)) {
                    return true;
                }
                sb = new StringBuilder("Invalid ScenarioId(");
                sb.append(str);
                str2 = "):ScenarioId cannot contain spaces or chinese characters.";
            }
            sb.append(str2);
            Log.e("anythink", sb.toString());
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private static String m4151d(Context context) {
        String strM2177x = C1175n.m2059a().m2177x();
        if (TextUtils.isEmpty(strM2177x)) {
            strM2177x = C1341e.m4060d(context) + C1341e.m4065f();
        }
        return C1343g.m4123a(strM2177x + UUID.randomUUID().toString());
    }

    /* JADX INFO: renamed from: d */
    public static String m4152d(String str) {
        str.hashCode();
        switch (str) {
            case "0":
                return C1169h.j.f3155a;
            case "1":
                return C1169h.j.f3156b;
            case "2":
                return C1169h.j.f3157c;
            case "3":
                return "Interstitial";
            case "4":
                return C1169h.j.f3159e;
            default:
                return "";
        }
    }
}
