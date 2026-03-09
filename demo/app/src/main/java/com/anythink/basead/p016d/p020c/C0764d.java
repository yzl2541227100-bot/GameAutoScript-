package com.anythink.basead.p016d.p020c;

import android.content.Context;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1218ak;
import com.anythink.core.common.p066o.C1355s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.anythink.basead.d.c.d */
/* JADX INFO: loaded from: classes.dex */
public class C0764d {

    /* JADX INFO: renamed from: b */
    private static volatile C0764d f899b;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, ArrayList<String>> f900a = new ConcurrentHashMap<>();

    private C0764d() {
    }

    /* JADX INFO: renamed from: a */
    public static C0764d m453a() {
        if (f899b == null) {
            synchronized (C0764d.class) {
                if (f899b == null) {
                    f899b = new C0764d();
                }
            }
        }
        return f899b;
    }

    /* JADX INFO: renamed from: a */
    public static String m454a(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m455a(Context context, String str, AbstractC1247l abstractC1247l, AbstractC1249n abstractC1249n) {
        if (abstractC1247l.mo2426d() == 3 && (abstractC1249n instanceof C1218ak)) {
            if (((C1218ak) abstractC1249n).m2507at() <= 0) {
                return;
            }
            C1218ak c1218ak = (C1218ak) abstractC1249n;
            ArrayList<String> arrayList = this.f900a.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                try {
                    JSONArray jSONArray = new JSONArray(C1355s.m4239b(context, C1169h.f3039D, str, ""));
                    if (jSONArray.length() > 0) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(jSONArray.optString(i));
                        }
                    }
                } catch (Exception unused) {
                }
                this.f900a.put(str, arrayList);
            }
            if (arrayList.size() >= c1218ak.m2507at()) {
                arrayList.remove(arrayList.size() - 1);
            }
            arrayList.add(0, abstractC1247l.m3229t());
            C1355s.m4237a(context, C1169h.f3039D, str, new JSONArray((Collection) arrayList).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final String[] m456a(Context context, String str) {
        ArrayList<String> arrayList = this.f900a.get(str);
        if (arrayList == null) {
            try {
                JSONArray jSONArray = new JSONArray(C1355s.m4239b(context, C1169h.f3039D, str, ""));
                if (jSONArray.length() > 0) {
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            arrayList2.add(jSONArray.optString(i));
                        } catch (Exception unused) {
                        }
                    }
                    arrayList = arrayList2;
                }
            } catch (Exception unused2) {
            }
        }
        if (arrayList == null) {
            return null;
        }
        this.f900a.put(str, arrayList);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }
}
