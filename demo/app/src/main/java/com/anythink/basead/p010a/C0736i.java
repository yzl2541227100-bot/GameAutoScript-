package com.anythink.basead.p010a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.anythink.basead.p015c.C0743a;
import com.anythink.basead.p015c.C0744b;
import com.anythink.basead.p015c.C0751i;
import com.anythink.basead.p015c.C0752j;
import com.anythink.basead.p024g.C0794e;
import com.anythink.basead.p024g.C0795f;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.C1219al;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p066o.C1345i;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.anythink.basead.a.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0736i {
    /* JADX INFO: renamed from: a */
    private static String m265a(String str, C0744b c0744b) {
        String str2 = c0744b.f690a;
        if (str2 == null) {
            str2 = "";
        }
        return str.replaceAll("\\{__CLICK_ID__\\}", str2);
    }

    /* JADX INFO: renamed from: a */
    private static String m266a(String str, C0751i c0751i) {
        String strEncode;
        String strEncode2 = MessageFormatter.DELIM_STR;
        C0743a c0743a = c0751i.f767g;
        int i = c0751i.f765e;
        int i2 = c0751i.f766f;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", c0743a.f684e);
            jSONObject.put("down_y", c0743a.f685f);
            jSONObject.put("up_x", c0743a.f686g);
            jSONObject.put("up_y", c0743a.f687h);
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            float f = i;
            jSONObject2.put("down_x", (int) ((c0743a.f684e / f) * 1000.0f));
            float f2 = i2;
            jSONObject2.put("down_y", (int) ((c0743a.f684e / f2) * 1000.0f));
            jSONObject2.put("up_x", (int) ((c0743a.f686g / f) * 1000.0f));
            jSONObject2.put("up_y", (int) ((c0743a.f687h / f2) * 1000.0f));
        } catch (JSONException unused2) {
        }
        try {
            strEncode = URLEncoder.encode(jSONObject.toString(), "utf-8");
        } catch (Throwable th) {
            th.printStackTrace();
            strEncode = MessageFormatter.DELIM_STR;
        }
        try {
            strEncode2 = URLEncoder.encode(jSONObject2.toString(), "utf-8");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        int i3 = c0743a.f688i ? 1 : 2;
        StringBuilder sb = new StringBuilder();
        sb.append(c0743a.f680a);
        String strReplaceAll = str.replaceAll("\\{__DOWN_X__\\}", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c0743a.f681b);
        String strReplaceAll2 = strReplaceAll.replaceAll("\\{__DOWN_Y__\\}", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(c0743a.f682c);
        String strReplaceAll3 = strReplaceAll2.replaceAll("\\{__UP_X__\\}", sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(c0743a.f683d);
        String strReplaceAll4 = strReplaceAll3.replaceAll("\\{__UP_Y__\\}", sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(c0743a.f684e);
        String strReplaceAll5 = strReplaceAll4.replaceAll("\\{__RE_DOWN_X__\\}", sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(c0743a.f685f);
        String strReplaceAll6 = strReplaceAll5.replaceAll("\\{__RE_DOWN_Y__\\}", sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append(c0743a.f686g);
        String strReplaceAll7 = strReplaceAll6.replaceAll("\\{__RE_UP_X__\\}", sb7.toString());
        StringBuilder sb8 = new StringBuilder();
        sb8.append(c0743a.f687h);
        String strReplaceAll8 = strReplaceAll7.replaceAll("\\{__RE_UP_Y__\\}", sb8.toString()).replaceAll("\\{ABSOLUTE_COORD\\}", strEncode).replaceAll("\\{RELATIVE_COORD\\}", strEncode2).replaceAll("\\{__DPLINK_TYPE__\\}", String.valueOf(i3));
        if (c0743a.f688i) {
            strReplaceAll8 = strReplaceAll8.replaceAll("&apk_ptype=\\{apk_ptype\\}", "");
        }
        int i4 = c0743a.f689j;
        return (i4 == -1 ? strReplaceAll8.replaceAll("&apk_ptype=\\{apk_ptype\\}", "") : strReplaceAll8.replaceAll("\\{apk_ptype\\}", String.valueOf(i4))).replaceAll("\\{opdptype\\}", c0743a.f688i ? "1" : "0");
    }

    /* JADX INFO: renamed from: a */
    public static String m267a(String str, C0751i c0751i, long j) {
        String string;
        String string2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (c0751i.f767g != null) {
            str = m266a(str, c0751i);
        }
        C0752j c0752j = c0751i.f768h;
        if (c0752j != null) {
            str = m268a(str, c0752j);
        }
        C0744b c0744b = c0751i.f769i;
        if (c0744b != null) {
            str = m265a(str, c0744b);
        }
        Map<String, Object> map = c0751i.f772l;
        if (map != null) {
            str = m269a(str, map);
        }
        long j2 = j / 1000;
        if (c0751i.f763c == 0) {
            string = "__REQ_WIDTH__";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(c0751i.f763c);
            string = sb.toString();
        }
        String strReplaceAll = str.replaceAll("\\{__REQ_WIDTH__\\}", string);
        if (c0751i.f764d == 0) {
            string2 = "__REQ_HEIGHT__";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c0751i.f764d);
            string2 = sb2.toString();
        }
        String strReplaceAll2 = strReplaceAll.replaceAll("\\{__REQ_HEIGHT__\\}", string2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(c0751i.f765e);
        String strReplaceAll3 = strReplaceAll2.replaceAll("\\{__WIDTH__\\}", sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(c0751i.f766f);
        return strReplaceAll3.replaceAll("\\{__HEIGHT__\\}", sb4.toString()).replaceAll("\\{__TS__\\}", String.valueOf(j2)).replaceAll("\\{__TS_MSEC__\\}", String.valueOf(j)).replaceAll("\\{__END_TS__\\}", String.valueOf(j2)).replaceAll("\\{__END_TS_MSEC__\\}", String.valueOf(j)).replaceAll("\\{__PLAY_SEC__\\}", "0").replaceAll("\\{", "").replaceAll("\\}", "");
    }

    /* JADX INFO: renamed from: a */
    private static String m268a(String str, C0752j c0752j) {
        StringBuilder sb = new StringBuilder();
        sb.append(c0752j.f781a);
        String strReplaceAll = str.replaceAll("\\{__VIDEO_TIME__\\}", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c0752j.f782b);
        String strReplaceAll2 = strReplaceAll.replaceAll("\\{__BEGIN_TIME__\\}", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(c0752j.f783c);
        String strReplaceAll3 = strReplaceAll2.replaceAll("\\{__END_TIME__\\}", sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(c0752j.f784d);
        String strReplaceAll4 = strReplaceAll3.replaceAll("\\{__PLAY_FIRST_FRAME__\\}", sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(c0752j.f785e);
        String strReplaceAll5 = strReplaceAll4.replaceAll("\\{__PLAY_LAST_FRAME__\\}", sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(c0752j.f790l);
        String strReplaceAll6 = strReplaceAll5.replaceAll("\\{__SCENE__\\}", sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append(c0752j.f791o);
        String strReplaceAll7 = strReplaceAll6.replaceAll("\\{__TYPE__\\}", sb7.toString());
        StringBuilder sb8 = new StringBuilder();
        sb8.append(c0752j.f792r);
        String strReplaceAll8 = strReplaceAll7.replaceAll("\\{__BEHAVIOR__\\}", sb8.toString());
        StringBuilder sb9 = new StringBuilder();
        sb9.append(c0752j.f793u);
        String strReplaceAll9 = strReplaceAll8.replaceAll("\\{__STATUS__\\}", sb9.toString());
        StringBuilder sb10 = new StringBuilder();
        sb10.append(c0752j.f788h);
        String strReplaceAll10 = strReplaceAll9.replaceAll("\\{__PLAY_SEC__\\}", sb10.toString());
        StringBuilder sb11 = new StringBuilder();
        sb11.append(c0752j.f786f / 1000);
        String strReplaceAll11 = strReplaceAll10.replaceAll("\\{__TS__\\}", sb11.toString());
        StringBuilder sb12 = new StringBuilder();
        sb12.append(c0752j.f786f);
        String strReplaceAll12 = strReplaceAll11.replaceAll("\\{__TS_MSEC__\\}", sb12.toString());
        StringBuilder sb13 = new StringBuilder();
        sb13.append(c0752j.f787g / 1000);
        String strReplaceAll13 = strReplaceAll12.replaceAll("\\{__END_TS__\\}", sb13.toString());
        StringBuilder sb14 = new StringBuilder();
        sb14.append(c0752j.f787g);
        String strReplaceAll14 = strReplaceAll13.replaceAll("\\{__END_TS_MSEC__\\}", sb14.toString());
        StringBuilder sb15 = new StringBuilder();
        sb15.append(c0752j.f788h / 1000);
        String strReplaceAll15 = strReplaceAll14.replaceAll("\\{__PLAY_SEC__\\}", sb15.toString());
        StringBuilder sb16 = new StringBuilder();
        sb16.append(c0752j.f788h);
        return strReplaceAll15.replaceAll("\\{__PLAY_MSEC__\\}", sb16.toString());
    }

    /* JADX INFO: renamed from: a */
    private static String m269a(String str, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            try {
                String string = entry.getValue().toString();
                str = str.replace(key, string);
                StringBuilder sb = new StringBuilder("replaceAdxNoticeMap, replaceKey -> ");
                sb.append(key);
                sb.append(", replaceValue: ");
                sb.append(string);
            } catch (Throwable th) {
                new StringBuilder("replaceAdxNoticeMap, error: ").append(th.getMessage());
                th.printStackTrace();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    private static void m270a(int i, @NonNull C0751i c0751i, AbstractC1217aj abstractC1217aj, C1219al c1219al, Map<String, Object> map) {
        String strM2514D;
        switch (i) {
            case 1:
                strM2514D = c1219al.m2514D();
                break;
            case 2:
                strM2514D = c1219al.m2515E();
                break;
            case 3:
                strM2514D = c1219al.m2516F();
                break;
            case 4:
                strM2514D = c1219al.m2517G();
                break;
            case 5:
                strM2514D = c1219al.m2518H();
                break;
            case 6:
                strM2514D = c1219al.m2523M();
                break;
            case 7:
                strM2514D = c1219al.m2524N();
                break;
            case 8:
                strM2514D = c1219al.m2512B();
                break;
            case 9:
                strM2514D = c1219al.m2513C();
                break;
            case 10:
                strM2514D = c1219al.m2511A();
                break;
            case 11:
                strM2514D = c1219al.m2519I();
                break;
            case 12:
                strM2514D = c1219al.m2521K();
                break;
            case 13:
                strM2514D = c1219al.m2522L();
                break;
            case 14:
                strM2514D = c1219al.m2520J();
                break;
            case 15:
                strM2514D = c1219al.m2539aa();
                break;
            case 16:
                strM2514D = c1219al.m2540ab();
                break;
            case 17:
                strM2514D = c1219al.m2541ac();
                break;
            case 18:
                strM2514D = c1219al.m2525O();
                break;
            case 19:
                strM2514D = c1219al.m2526P();
                break;
            case 20:
                strM2514D = c1219al.m2542ad();
                break;
            case 21:
                strM2514D = c1219al.m2527Q();
                break;
            case 22:
            case 32:
            default:
                strM2514D = "";
                break;
            case 23:
                strM2514D = c1219al.m2543ae();
                break;
            case 24:
                strM2514D = c1219al.m2544af();
                break;
            case 25:
                strM2514D = c1219al.m2545ag();
                break;
            case 26:
                strM2514D = c1219al.m2546ah();
                break;
            case 27:
                strM2514D = c1219al.m2547ai();
                break;
            case 28:
                strM2514D = c1219al.m2549ak();
                break;
            case 29:
                strM2514D = c1219al.m2548aj();
                break;
            case 30:
                strM2514D = c1219al.m2550al();
                break;
            case 31:
                strM2514D = c1219al.m2551am();
                break;
            case 33:
                strM2514D = c1219al.m2552an();
                break;
            case 34:
                strM2514D = c1219al.m2553ao();
                break;
            case 35:
                strM2514D = c1219al.m2555aq();
                break;
        }
        if (m273a(strM2514D)) {
            return;
        }
        C0795f c0795f = new C0795f(i, abstractC1217aj, strM2514D, map);
        c0795f.m642a(c0751i.f762b);
        c0795f.mo3639a(0, (InterfaceC1283k) null);
    }

    /* JADX INFO: renamed from: a */
    public static void m271a(int i, AbstractC1217aj abstractC1217aj, @NonNull C0751i c0751i) {
        String strM2514D;
        String[] strArrM2565h;
        C1219al c1219alM2489ah = abstractC1217aj.m2489ah();
        if (c1219alM2489ah == null) {
            return;
        }
        Map<String, Object> mapM4171c = C1345i.m4171c(c1219alM2489ah.m2558c());
        try {
            switch (i) {
                case 1:
                    strArrM2565h = c1219alM2489ah.m2565h();
                    break;
                case 2:
                    strArrM2565h = c1219alM2489ah.m2566i();
                    break;
                case 3:
                    strArrM2565h = c1219alM2489ah.m2567j();
                    break;
                case 4:
                    strArrM2565h = c1219alM2489ah.m2568k();
                    break;
                case 5:
                    strArrM2565h = c1219alM2489ah.m2569l();
                    break;
                case 6:
                    strArrM2565h = c1219alM2489ah.m2574q();
                    break;
                case 7:
                    strArrM2565h = c1219alM2489ah.m2575r();
                    break;
                case 8:
                    strArrM2565h = c1219alM2489ah.m2563f();
                    break;
                case 9:
                    strArrM2565h = c1219alM2489ah.m2564g();
                    break;
                case 10:
                    strArrM2565h = c1219alM2489ah.m2561d();
                    break;
                case 11:
                    strArrM2565h = c1219alM2489ah.m2570m();
                    break;
                case 12:
                    strArrM2565h = c1219alM2489ah.m2572o();
                    break;
                case 13:
                    strArrM2565h = c1219alM2489ah.m2573p();
                    break;
                case 14:
                    strArrM2565h = c1219alM2489ah.m2571n();
                    break;
                case 15:
                    strArrM2565h = c1219alM2489ah.m2528R();
                    break;
                case 16:
                    strArrM2565h = c1219alM2489ah.m2529S();
                    break;
                case 17:
                    strArrM2565h = c1219alM2489ah.m2530T();
                    break;
                case 18:
                    strArrM2565h = c1219alM2489ah.m2576s();
                    break;
                case 19:
                    strArrM2565h = c1219alM2489ah.m2577t();
                    break;
                case 20:
                    strArrM2565h = c1219alM2489ah.m2531U();
                    break;
                case 21:
                    strArrM2565h = c1219alM2489ah.m2578u();
                    break;
                case 22:
                default:
                    strArrM2565h = null;
                    break;
                case 23:
                    strArrM2565h = c1219alM2489ah.m2532V();
                    break;
                case 24:
                    strArrM2565h = c1219alM2489ah.m2533W();
                    break;
                case 25:
                    strArrM2565h = c1219alM2489ah.m2534X();
                    break;
                case 26:
                    strArrM2565h = c1219alM2489ah.m2535Y();
                    break;
                case 27:
                    strArrM2565h = c1219alM2489ah.m2536Z();
                    break;
                case 28:
                    strArrM2565h = c1219alM2489ah.m2580w();
                    break;
                case 29:
                    strArrM2565h = c1219alM2489ah.m2579v();
                    break;
                case 30:
                    strArrM2565h = c1219alM2489ah.m2581x();
                    break;
                case 31:
                    strArrM2565h = c1219alM2489ah.m2582y();
                    break;
                case 32:
                    C0752j c0752j = c0751i.f768h;
                    Map<Integer, String[]> mapM2583z = c1219alM2489ah.m2583z();
                    strArrM2565h = (c0752j != null && mapM2583z != null) ? mapM2583z.get(Integer.valueOf(c0752j.f789i)) : null;
                    break;
                case 33:
                    strArrM2565h = c1219alM2489ah.m2538a();
                    break;
                case 34:
                    strArrM2565h = c1219alM2489ah.m2557b();
                    break;
                case 35:
                    strArrM2565h = c1219alM2489ah.m2554ap();
                    break;
                case 36:
                    strArrM2565h = c1219alM2489ah.m2562e();
                    break;
            }
            if (strArrM2565h != null) {
                boolean zM3300aa = (i == 8 || i == 9) ? abstractC1217aj.m3220o().m3300aa() : false;
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (String str : strArrM2565h) {
                    C0794e c0794e = new C0794e(i, m267a(str, c0751i, jCurrentTimeMillis), abstractC1217aj, mapM4171c);
                    c0794e.m640a(zM3300aa);
                    c0794e.mo3639a(0, (InterfaceC1283k) null);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        switch (i) {
            case 1:
                strM2514D = c1219alM2489ah.m2514D();
                break;
            case 2:
                strM2514D = c1219alM2489ah.m2515E();
                break;
            case 3:
                strM2514D = c1219alM2489ah.m2516F();
                break;
            case 4:
                strM2514D = c1219alM2489ah.m2517G();
                break;
            case 5:
                strM2514D = c1219alM2489ah.m2518H();
                break;
            case 6:
                strM2514D = c1219alM2489ah.m2523M();
                break;
            case 7:
                strM2514D = c1219alM2489ah.m2524N();
                break;
            case 8:
                strM2514D = c1219alM2489ah.m2512B();
                break;
            case 9:
                strM2514D = c1219alM2489ah.m2513C();
                break;
            case 10:
                strM2514D = c1219alM2489ah.m2511A();
                break;
            case 11:
                strM2514D = c1219alM2489ah.m2519I();
                break;
            case 12:
                strM2514D = c1219alM2489ah.m2521K();
                break;
            case 13:
                strM2514D = c1219alM2489ah.m2522L();
                break;
            case 14:
                strM2514D = c1219alM2489ah.m2520J();
                break;
            case 15:
                strM2514D = c1219alM2489ah.m2539aa();
                break;
            case 16:
                strM2514D = c1219alM2489ah.m2540ab();
                break;
            case 17:
                strM2514D = c1219alM2489ah.m2541ac();
                break;
            case 18:
                strM2514D = c1219alM2489ah.m2525O();
                break;
            case 19:
                strM2514D = c1219alM2489ah.m2526P();
                break;
            case 20:
                strM2514D = c1219alM2489ah.m2542ad();
                break;
            case 21:
                strM2514D = c1219alM2489ah.m2527Q();
                break;
            case 22:
            case 32:
            default:
                strM2514D = "";
                break;
            case 23:
                strM2514D = c1219alM2489ah.m2543ae();
                break;
            case 24:
                strM2514D = c1219alM2489ah.m2544af();
                break;
            case 25:
                strM2514D = c1219alM2489ah.m2545ag();
                break;
            case 26:
                strM2514D = c1219alM2489ah.m2546ah();
                break;
            case 27:
                strM2514D = c1219alM2489ah.m2547ai();
                break;
            case 28:
                strM2514D = c1219alM2489ah.m2549ak();
                break;
            case 29:
                strM2514D = c1219alM2489ah.m2548aj();
                break;
            case 30:
                strM2514D = c1219alM2489ah.m2550al();
                break;
            case 31:
                strM2514D = c1219alM2489ah.m2551am();
                break;
            case 33:
                strM2514D = c1219alM2489ah.m2552an();
                break;
            case 34:
                strM2514D = c1219alM2489ah.m2553ao();
                break;
            case 35:
                strM2514D = c1219alM2489ah.m2555aq();
                break;
        }
        if (m273a(strM2514D)) {
            return;
        }
        C0795f c0795f = new C0795f(i, abstractC1217aj, strM2514D, mapM4171c);
        c0795f.m642a(c0751i.f762b);
        c0795f.mo3639a(0, (InterfaceC1283k) null);
    }

    /* JADX INFO: renamed from: a */
    private static void m272a(int i, AbstractC1217aj abstractC1217aj, C1219al c1219al, Map<String, Object> map, @NonNull C0751i c0751i) {
        String[] strArrM2565h;
        try {
            switch (i) {
                case 1:
                    strArrM2565h = c1219al.m2565h();
                    break;
                case 2:
                    strArrM2565h = c1219al.m2566i();
                    break;
                case 3:
                    strArrM2565h = c1219al.m2567j();
                    break;
                case 4:
                    strArrM2565h = c1219al.m2568k();
                    break;
                case 5:
                    strArrM2565h = c1219al.m2569l();
                    break;
                case 6:
                    strArrM2565h = c1219al.m2574q();
                    break;
                case 7:
                    strArrM2565h = c1219al.m2575r();
                    break;
                case 8:
                    strArrM2565h = c1219al.m2563f();
                    break;
                case 9:
                    strArrM2565h = c1219al.m2564g();
                    break;
                case 10:
                    strArrM2565h = c1219al.m2561d();
                    break;
                case 11:
                    strArrM2565h = c1219al.m2570m();
                    break;
                case 12:
                    strArrM2565h = c1219al.m2572o();
                    break;
                case 13:
                    strArrM2565h = c1219al.m2573p();
                    break;
                case 14:
                    strArrM2565h = c1219al.m2571n();
                    break;
                case 15:
                    strArrM2565h = c1219al.m2528R();
                    break;
                case 16:
                    strArrM2565h = c1219al.m2529S();
                    break;
                case 17:
                    strArrM2565h = c1219al.m2530T();
                    break;
                case 18:
                    strArrM2565h = c1219al.m2576s();
                    break;
                case 19:
                    strArrM2565h = c1219al.m2577t();
                    break;
                case 20:
                    strArrM2565h = c1219al.m2531U();
                    break;
                case 21:
                    strArrM2565h = c1219al.m2578u();
                    break;
                case 22:
                default:
                    strArrM2565h = null;
                    break;
                case 23:
                    strArrM2565h = c1219al.m2532V();
                    break;
                case 24:
                    strArrM2565h = c1219al.m2533W();
                    break;
                case 25:
                    strArrM2565h = c1219al.m2534X();
                    break;
                case 26:
                    strArrM2565h = c1219al.m2535Y();
                    break;
                case 27:
                    strArrM2565h = c1219al.m2536Z();
                    break;
                case 28:
                    strArrM2565h = c1219al.m2580w();
                    break;
                case 29:
                    strArrM2565h = c1219al.m2579v();
                    break;
                case 30:
                    strArrM2565h = c1219al.m2581x();
                    break;
                case 31:
                    strArrM2565h = c1219al.m2582y();
                    break;
                case 32:
                    C0752j c0752j = c0751i.f768h;
                    Map<Integer, String[]> mapM2583z = c1219al.m2583z();
                    strArrM2565h = (c0752j != null && mapM2583z != null) ? mapM2583z.get(Integer.valueOf(c0752j.f789i)) : null;
                    break;
                case 33:
                    strArrM2565h = c1219al.m2538a();
                    break;
                case 34:
                    strArrM2565h = c1219al.m2557b();
                    break;
                case 35:
                    strArrM2565h = c1219al.m2554ap();
                    break;
                case 36:
                    strArrM2565h = c1219al.m2562e();
                    break;
            }
            if (strArrM2565h != null) {
                boolean zM3300aa = (i == 8 || i == 9) ? abstractC1217aj.m3220o().m3300aa() : false;
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (String str : strArrM2565h) {
                    C0794e c0794e = new C0794e(i, m267a(str, c0751i, jCurrentTimeMillis), abstractC1217aj, map);
                    c0794e.m640a(zM3300aa);
                    c0794e.mo3639a(0, (InterfaceC1283k) null);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m273a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return new JSONObject(str).length() <= 0;
    }
}
