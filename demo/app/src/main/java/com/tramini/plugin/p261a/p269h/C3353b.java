package com.tramini.plugin.p261a.p269h;

import android.text.TextUtils;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAttribution;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.appsflyer.AppsFlyerLib;
import com.tramini.plugin.p261a.p263b.C3325a;
import com.tramini.plugin.p261a.p263b.C3327c;
import com.tramini.plugin.p261a.p265d.C3334b;
import com.tramini.plugin.p261a.p268g.C3350a;
import com.tramini.plugin.p261a.p269h.p271b.C3354a;
import com.tramini.plugin.p272b.C3366b;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.h.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3353b {

    /* JADX INFO: renamed from: a */
    private static C3353b f18202a;

    private C3353b() {
    }

    /* JADX INFO: renamed from: a */
    public static C3353b m15283a() {
        if (f18202a == null) {
            f18202a = new C3353b();
        }
        return f18202a;
    }

    /* JADX INFO: renamed from: a */
    private static void m15284a(String str, C3366b c3366b) {
        try {
            C3334b c3334b = new C3334b();
            c3334b.f18106c = Adjust.getSdkVersion();
            c3334b.f18107d = 2;
            AdjustAttribution attribution = Adjust.getAttribution();
            if (attribution != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adgroup", attribution.adgroup);
                jSONObject.put("adid", attribution.adid);
                jSONObject.put("campaign", attribution.campaign);
                jSONObject.put("clickLabel", attribution.clickLabel);
                jSONObject.put(C1796r.f10821aD, attribution.creative);
                jSONObject.put("network", attribution.network);
                jSONObject.put("trackerName", attribution.trackerName);
                jSONObject.put("trackerToken", attribution.trackerToken);
                jSONObject.put("attr", attribution.toString());
                c3334b.f18108e = jSONObject.toString();
                JSONObject jSONObjectM15179a = c3334b.m15179a();
                if (TextUtils.equals(C3363i.m15323b(C3327c.m15142a().m15159b(), "tramini", C3325a.d.f18072e, ""), jSONObject.toString())) {
                    return;
                }
                C3363i.m15321a(C3327c.m15142a().m15159b(), "tramini", C3325a.d.f18072e, jSONObject.toString());
                C3350a.m15276a().m15280a(str, c3366b.m15355c(), C3358d.f18220a, jSONObjectM15179a);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m15285b(String str, C3366b c3366b) {
        try {
            C3334b c3334b = new C3334b();
            c3334b.f18106c = AppsFlyerLib.getInstance().getSdkVersion();
            c3334b.f18107d = 1;
            String strM15323b = C3363i.m15323b(C3327c.m15142a().m15159b(), "appsflyer-data", "attributionId", "");
            if (TextUtils.isEmpty(strM15323b)) {
                return;
            }
            c3334b.f18108e = strM15323b;
            JSONObject jSONObjectM15179a = c3334b.m15179a();
            String strM15323b2 = C3363i.m15323b(C3327c.m15142a().m15159b(), "tramini", C3325a.d.f18071d, "");
            if (jSONObjectM15179a == null || TextUtils.equals(strM15323b2, strM15323b)) {
                return;
            }
            C3363i.m15321a(C3327c.m15142a().m15159b(), "tramini", C3325a.d.f18071d, strM15323b);
            C3350a.m15276a().m15280a(str, c3366b.m15355c(), C3358d.f18220a, jSONObjectM15179a);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private static /* synthetic */ void m15286c(String str, C3366b c3366b) {
        try {
            C3334b c3334b = new C3334b();
            c3334b.f18106c = AppsFlyerLib.getInstance().getSdkVersion();
            c3334b.f18107d = 1;
            String strM15323b = C3363i.m15323b(C3327c.m15142a().m15159b(), "appsflyer-data", "attributionId", "");
            if (TextUtils.isEmpty(strM15323b)) {
                return;
            }
            c3334b.f18108e = strM15323b;
            JSONObject jSONObjectM15179a = c3334b.m15179a();
            String strM15323b2 = C3363i.m15323b(C3327c.m15142a().m15159b(), "tramini", C3325a.d.f18071d, "");
            if (jSONObjectM15179a == null || TextUtils.equals(strM15323b2, strM15323b)) {
                return;
            }
            C3363i.m15321a(C3327c.m15142a().m15159b(), "tramini", C3325a.d.f18071d, strM15323b);
            C3350a.m15276a().m15280a(str, c3366b.m15355c(), C3358d.f18220a, jSONObjectM15179a);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    private static /* synthetic */ void m15287d(String str, C3366b c3366b) {
        try {
            C3334b c3334b = new C3334b();
            c3334b.f18106c = Adjust.getSdkVersion();
            c3334b.f18107d = 2;
            AdjustAttribution attribution = Adjust.getAttribution();
            if (attribution != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adgroup", attribution.adgroup);
                jSONObject.put("adid", attribution.adid);
                jSONObject.put("campaign", attribution.campaign);
                jSONObject.put("clickLabel", attribution.clickLabel);
                jSONObject.put(C1796r.f10821aD, attribution.creative);
                jSONObject.put("network", attribution.network);
                jSONObject.put("trackerName", attribution.trackerName);
                jSONObject.put("trackerToken", attribution.trackerToken);
                jSONObject.put("attr", attribution.toString());
                c3334b.f18108e = jSONObject.toString();
                JSONObject jSONObjectM15179a = c3334b.m15179a();
                if (TextUtils.equals(C3363i.m15323b(C3327c.m15142a().m15159b(), "tramini", C3325a.d.f18072e, ""), jSONObject.toString())) {
                    return;
                }
                C3363i.m15321a(C3327c.m15142a().m15159b(), "tramini", C3325a.d.f18072e, jSONObject.toString());
                C3350a.m15276a().m15280a(str, c3366b.m15355c(), C3358d.f18220a, jSONObjectM15179a);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15288a(final C3366b c3366b) {
        C3354a.m15289a().m15291a(new Runnable() { // from class: com.tramini.plugin.a.h.b.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (C3353b.this) {
                    try {
                        if (c3366b.m15354b() != 1) {
                            return;
                        }
                        String strM15313a = C3361g.m15313a(c3366b);
                        C3366b c3366b2 = c3366b;
                        try {
                            C3334b c3334b = new C3334b();
                            c3334b.f18106c = AppsFlyerLib.getInstance().getSdkVersion();
                            c3334b.f18107d = 1;
                            String strM15323b = C3363i.m15323b(C3327c.m15142a().m15159b(), "appsflyer-data", "attributionId", "");
                            if (!TextUtils.isEmpty(strM15323b)) {
                                c3334b.f18108e = strM15323b;
                                JSONObject jSONObjectM15179a = c3334b.m15179a();
                                String strM15323b2 = C3363i.m15323b(C3327c.m15142a().m15159b(), "tramini", C3325a.d.f18071d, "");
                                if (jSONObjectM15179a != null && !TextUtils.equals(strM15323b2, strM15323b)) {
                                    C3363i.m15321a(C3327c.m15142a().m15159b(), "tramini", C3325a.d.f18071d, strM15323b);
                                    C3350a.m15276a().m15280a(strM15313a, c3366b2.m15355c(), C3358d.f18220a, jSONObjectM15179a);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        C3366b c3366b3 = c3366b;
                        C3334b c3334b2 = new C3334b();
                        c3334b2.f18106c = Adjust.getSdkVersion();
                        c3334b2.f18107d = 2;
                        AdjustAttribution attribution = Adjust.getAttribution();
                        if (attribution != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("adgroup", attribution.adgroup);
                            jSONObject.put("adid", attribution.adid);
                            jSONObject.put("campaign", attribution.campaign);
                            jSONObject.put("clickLabel", attribution.clickLabel);
                            jSONObject.put(C1796r.f10821aD, attribution.creative);
                            jSONObject.put("network", attribution.network);
                            jSONObject.put("trackerName", attribution.trackerName);
                            jSONObject.put("trackerToken", attribution.trackerToken);
                            jSONObject.put("attr", attribution.toString());
                            c3334b2.f18108e = jSONObject.toString();
                            JSONObject jSONObjectM15179a2 = c3334b2.m15179a();
                            if (!TextUtils.equals(C3363i.m15323b(C3327c.m15142a().m15159b(), "tramini", C3325a.d.f18072e, ""), jSONObject.toString())) {
                                C3363i.m15321a(C3327c.m15142a().m15159b(), "tramini", C3325a.d.f18072e, jSONObject.toString());
                                C3350a.m15276a().m15280a(strM15313a, c3366b3.m15355c(), C3358d.f18220a, jSONObjectM15179a2);
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
        });
    }
}
