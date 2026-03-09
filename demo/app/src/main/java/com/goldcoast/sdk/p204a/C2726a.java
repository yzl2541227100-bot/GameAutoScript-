package com.goldcoast.sdk.p204a;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.goldcoast.sdk.a.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2726a extends AbstractC2728c<C2726a> {

    /* JADX INFO: renamed from: a */
    private String f15924a = "0";

    /* JADX INFO: renamed from: b */
    private String f15925b;

    /* JADX INFO: renamed from: c */
    private String f15926c;

    /* JADX INFO: renamed from: d */
    private String f15927d;

    /* JADX INFO: renamed from: e */
    private String f15928e;

    /* JADX INFO: renamed from: f */
    private String f15929f;

    /* JADX INFO: renamed from: g */
    private String f15930g;

    /* JADX INFO: renamed from: h */
    private String f15931h;

    /* JADX INFO: renamed from: i */
    private String f15932i;

    /* JADX INFO: renamed from: j */
    private String f15933j;

    /* JADX INFO: renamed from: k */
    private String f15934k;

    public C2726a() {
    }

    public C2726a(Map map) {
        m13105a(map);
    }

    /* JADX INFO: renamed from: a */
    private C2726a m13105a(Map<String, String> map) {
        Iterator<String> it = map.keySet().iterator();
        if (it == null || !it.hasNext()) {
            return null;
        }
        while (it.hasNext()) {
            String next = it.next();
            if (next.replace(C4196o4.OooO00o.OooO0Oo, "").toLowerCase().contains("processorcnt")) {
                this.f15924a = map.get(next);
            } else if (next.replace(C4196o4.OooO00o.OooO0Oo, "").toLowerCase().contains("modelname")) {
                this.f15925b = map.get(next);
            } else if (next.replace(C4196o4.OooO00o.OooO0Oo, "").toLowerCase().contains("features")) {
                this.f15926c = map.get(next);
            } else if (next.replace(C4196o4.OooO00o.OooO0Oo, "").toLowerCase().contains("cpuimplementer")) {
                this.f15927d = map.get(next);
            } else if (next.replace(C4196o4.OooO00o.OooO0Oo, "").toLowerCase().contains("cpuarchitecture")) {
                this.f15928e = map.get(next);
            } else if (next.replace(C4196o4.OooO00o.OooO0Oo, "").toLowerCase().contains("cpuvariant")) {
                this.f15929f = map.get(next);
            } else if (next.replace(C4196o4.OooO00o.OooO0Oo, "").toLowerCase().contains("cpupart")) {
                this.f15930g = map.get(next);
            } else if (next.replace(C4196o4.OooO00o.OooO0Oo, "").toLowerCase().contains("cpurevision")) {
                this.f15931h = map.get(next);
            } else if (next.replace(C4196o4.OooO00o.OooO0Oo, "").toLowerCase().contains("hardware")) {
                this.f15932i = map.get(next);
            } else if (next.replace(C4196o4.OooO00o.OooO0Oo, "").toLowerCase().contains("revision")) {
                this.f15933j = map.get(next);
            } else if (next.replace(C4196o4.OooO00o.OooO0Oo, "").toLowerCase().contains("serial")) {
                this.f15934k = map.get(next);
            }
        }
        try {
            this.f15924a = String.valueOf(Integer.valueOf(this.f15924a).intValue() + 1);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m13106a() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f15924a;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("processorcnt", str);
            String str3 = this.f15925b;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("modelname", str3);
            String str4 = this.f15926c;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("features", str4);
            String str5 = this.f15927d;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("cpuimplementer", str5);
            String str6 = this.f15928e;
            if (str6 == null) {
                str6 = "";
            }
            jSONObject.put("cpuarchitecture", str6);
            String str7 = this.f15929f;
            if (str7 == null) {
                str7 = "";
            }
            jSONObject.put("cpuvariant", str7);
            String str8 = this.f15930g;
            if (str8 == null) {
                str8 = "";
            }
            jSONObject.put("cpupart", str8);
            String str9 = this.f15931h;
            if (str9 == null) {
                str9 = "";
            }
            jSONObject.put("cpurevision", str9);
            String str10 = this.f15932i;
            if (str10 == null) {
                str10 = "";
            }
            jSONObject.put("hardware", str10);
            String str11 = this.f15933j;
            if (str11 == null) {
                str11 = "";
            }
            jSONObject.put("revision", str11);
            String str12 = this.f15934k;
            if (str12 != null) {
                str2 = str12;
            }
            jSONObject.put("serial", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
