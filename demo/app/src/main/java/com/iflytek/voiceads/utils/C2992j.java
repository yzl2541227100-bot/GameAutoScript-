package com.iflytek.voiceads.utils;

import android.content.Context;
import com.anythink.core.p038b.p042d.C1109b;
import com.iflytek.voiceads.request.C2974a;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.iflytek.voiceads.utils.j */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2992j {
    /* JADX INFO: renamed from: a */
    public static JSONArray m13569a(double d, JSONArray jSONArray) {
        try {
            String string = jSONArray.toString();
            if (!string.contains(C1109b.f2643b)) {
                return jSONArray;
            }
            if (d < 0.0d) {
                return null;
            }
            return new JSONArray(string.replace(C1109b.f2643b, C2986d.m13547b(d + "")));
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "exp array" + e.getMessage());
            return jSONArray;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m13570a(Object... objArr) {
        C2989g.m13555a("IFLY_AD_SDK", "sendMonitor");
        try {
            JSONArray jSONArray = (JSONArray) objArr[0];
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    if (objArr.length <= 1 || i != 0) {
                        m13571b(string);
                    } else {
                        m13571b(string, objArr[1], objArr[2]);
                    }
                }
            }
        } catch (JSONException e) {
            C2989g.m13557b("IFLY_AD_SDK", "MonitorUtil::sendMonitor() error");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m13571b(Object... objArr) {
        C2974a c2974a = new C2974a();
        if (objArr == null || objArr.length <= 1) {
            c2974a.m13525a(false);
        } else {
            c2974a.m13522a((Context) objArr[1]);
            c2974a.m13521a(((Integer) objArr[2]).intValue());
        }
        c2974a.m13526b(0);
        c2974a.m13527c(15000);
        c2974a.m13524a((String) objArr[0], null, null);
        c2974a.m13523a((C2974a.a) null);
    }
}
