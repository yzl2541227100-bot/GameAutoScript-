package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.os.Build;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.proguard.C3459j;
import com.umeng.commonsdk.statistics.common.C3489e;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3452c implements UMLogDataProtocol {

    /* JADX INFO: renamed from: b */
    private static final String f18797b = "info";

    /* JADX INFO: renamed from: c */
    private static final String f18798c = "stat";

    /* JADX INFO: renamed from: a */
    private Context f18799a;

    public C3452c(Context context) {
        if (context != null) {
            this.f18799a = context.getApplicationContext();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m15880a(Context context) {
        WifiInfo wifiInfoM15925c;
        if (context == null || (wifiInfoM15925c = C3459j.m15925c(context)) == null) {
            return;
        }
        C3459j.c cVar = new C3459j.c();
        cVar.f18828a = wifiInfoM15925c.describeContents();
        cVar.f18829b = wifiInfoM15925c.getBSSID();
        cVar.f18830c = wifiInfoM15925c.getSSID();
        cVar.f18831d = Build.VERSION.SDK_INT >= 21 ? wifiInfoM15925c.getFrequency() : -1;
        boolean z = true;
        if (wifiInfoM15925c.getHiddenSSID()) {
            cVar.f18832e = 1;
        } else {
            cVar.f18832e = 0;
        }
        cVar.f18833f = wifiInfoM15925c.getIpAddress();
        cVar.f18834g = wifiInfoM15925c.getLinkSpeed();
        cVar.f18835h = DeviceConfig.getMac(context);
        cVar.f18836i = wifiInfoM15925c.getNetworkId();
        cVar.f18837j = wifiInfoM15925c.getRssi();
        cVar.f18838k = C3459j.m15935g(context);
        cVar.f18839l = System.currentTimeMillis();
        if (wifiInfoM15925c != null) {
            try {
                JSONArray jSONArrayM15972b = C3463n.m15972b(context);
                if (jSONArrayM15972b == null || jSONArrayM15972b.length() <= 0) {
                    z = false;
                } else {
                    for (int i = 0; i < jSONArrayM15972b.length(); i++) {
                        String strOptString = jSONArrayM15972b.optJSONObject(i).optString("ssid", null);
                        if (strOptString != null && strOptString.equals(cVar.f18830c)) {
                            break;
                        }
                    }
                    z = false;
                }
                if (z) {
                    return;
                }
                C3463n.m15970a(context, cVar);
            } catch (Exception e) {
                C3489e.m16350e("wifiChange:" + e.getMessage());
            }
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j) {
        return null;
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i) {
        C3489e.m16329a("walle", "[internal] workEvent");
        try {
            switch (i) {
                case C3408a.f18657e /* 32769 */:
                    C3489e.m16329a("walle", "[internal] workEvent send envelope");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C3471v.f18963aq, C3408a.f18656d);
                    JSONObject jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(this.f18799a, jSONObject, C3453d.m15889d(this.f18799a));
                    if (jSONObjectBuildEnvelopeWithExtHeader != null && !jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                        C3489e.m16329a("walle", "[internal] workEvent send envelope back, result is ok");
                        C3459j.m15934f(this.f18799a);
                        C3467r.m16008d(this.f18799a);
                    }
                    break;
                case C3408a.f18658f /* 32770 */:
                    C3489e.m16329a("walle", "[internal] workEvent cache location, event is " + obj.toString());
                    SharedPreferences sharedPreferences = this.f18799a.getSharedPreferences(C3457h.f18814a, 0);
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(C3457h.f18815b, obj.toString());
                        editorEdit.commit();
                        break;
                    }
                    break;
                case C3408a.f18659g /* 32771 */:
                    C3489e.m16329a("walle", "[internal] workEvent cache battery, event is " + obj.toString());
                    C3468s.m16022b(this.f18799a, obj.toString());
                    break;
                case C3408a.f18660h /* 32772 */:
                    C3489e.m16329a("walle", "[internal] workEvent cache station, event is " + obj.toString());
                    C3468s.m16020a(this.f18799a, obj.toString());
                    break;
                case C3408a.f18661i /* 32773 */:
                    C3463n.m15969a(this.f18799a, (C3459j.b) obj);
                    break;
                case C3408a.f18662j /* 32774 */:
                    try {
                        m15880a(this.f18799a);
                    } catch (Exception e) {
                        e = e;
                        C3489e.m16350e("UM_INTERNAL_CACHE_WIFICHANGE_KEY:" + e.getMessage());
                        C3454e.m15904a(this.f18799a, e);
                        return;
                    }
                    break;
                case C3408a.f18663k /* 32775 */:
                    C3463n.m15971a(this.f18799a, (String) obj);
                    break;
                case C3408a.f18664l /* 32776 */:
                    SharedPreferences sharedPreferences2 = this.f18799a.getApplicationContext().getSharedPreferences(f18797b, 0);
                    if (sharedPreferences2 != null) {
                        sharedPreferences2.edit().putString(f18798c, (String) obj).commit();
                    }
                    break;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
