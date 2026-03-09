package com.anythink.p185pd;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions;
import com.anythink.china.activity.ApkConfirmDialogActivity;
import com.anythink.china.common.C1066a;
import com.anythink.china.common.C1079c;
import com.anythink.china.common.p036c.C1080a;
import com.anythink.china.p032b.C1062a;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p055f.C1254s;
import com.anythink.core.common.p057g.InterfaceC1263a;
import com.anythink.core.common.p057g.InterfaceC1264b;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.p072d.C1391a;
import com.anythink.expressad.p086d.p087a.C1485b;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ExHandler implements IExHandler {
    public static final String JSON_REQUEST_BOOT_MARK = "boot_mark";
    public static final String JSON_REQUEST_COMMON_DENY_PLAD = "deny_plad";
    public static final String JSON_REQUEST_COMMON_IMSI = "imsi";
    public static final String JSON_REQUEST_CPU = "cpu";
    public static final String JSON_REQUEST_IMEI = "imei";
    public static final String JSON_REQUEST_INSTALL_TS = "install_ts";
    public static final String JSON_REQUEST_ISAGENT = "isagent";
    public static final String JSON_REQUEST_ISROOT = "isroot";
    public static final String JSON_REQUEST_MAC = "mac";
    public static final String JSON_REQUEST_OAID = "oaid";
    public static final String JSON_REQUEST_SSID = "wifi_name";
    public static final String JSON_REQUEST_UPDATE_MARK = "update_mark";
    public static final String JSON_REQUEST_UPDATE_TS = "update_ts";
    public int macOpen = 1;
    public int imeiOpen = 1;

    @Override // com.anythink.core.api.IExHandler
    public boolean checkDebuggerDevice(Context context, String str) {
        String strM1395b = C1062a.m1395b();
        if (TextUtils.isEmpty(strM1395b)) {
            strM1395b = C1355s.m4239b(context, C1169h.f3065p, "oaid", "");
        }
        return TextUtils.equals(str, strM1395b);
    }

    @Override // com.anythink.core.api.IExHandler
    public int checkDownloadType(AbstractC1247l abstractC1247l, C1248m c1248m) {
        return C1066a.m1427a(C1175n.m2059a().m2148f()).m1453b(abstractC1247l);
    }

    @Override // com.anythink.core.api.IExHandler
    public ATEventInterface createDownloadListener(ATBaseAdAdapter aTBaseAdAdapter, BaseAd baseAd, ATEventInterface aTEventInterface) {
        return new C1079c(aTBaseAdAdapter, baseAd, aTEventInterface);
    }

    @Override // com.anythink.core.api.IExHandler
    public String fillCDataParam(String str) {
        if (str == null) {
            return "";
        }
        String strM1402d = this.imeiOpen == 1 ? C1062a.m1402d(C1175n.m2059a().m2148f()) : "";
        String strM1392a = this.macOpen == 1 ? C1062a.m1392a() : "";
        String strM1395b = C1062a.m1395b();
        if (strM1402d == null) {
            strM1402d = "";
        }
        String strReplaceAll = str.replaceAll("at_device1", strM1402d);
        if (strM1392a == null) {
            strM1392a = "";
        }
        return strReplaceAll.replaceAll("at_device2", strM1392a).replaceAll("at_device3", strM1395b != null ? strM1395b : "");
    }

    @Override // com.anythink.core.api.IExHandler
    public void fillDownloadStatus(Context context, AbstractC1247l abstractC1247l, C1248m c1248m) throws Throwable {
        C1080a.m1539a(context, abstractC1247l, c1248m);
    }

    @Override // com.anythink.core.api.IExHandler
    public void fillRequestData(JSONObject jSONObject, C1391a c1391a) {
        fillRequestData(jSONObject, c1391a, -1);
    }

    @Override // com.anythink.core.api.IExHandler
    public void fillRequestData(JSONObject jSONObject, C1391a c1391a, int i) {
        String strM1395b;
        String strM4711H = c1391a != null ? c1391a.m4711H() : "";
        try {
            if (TextUtils.isEmpty(strM4711H)) {
                jSONObject.put("mac", C1062a.m1392a());
                jSONObject.put("imei", C1062a.m1402d(C1175n.m2059a().m2148f()));
                strM1395b = C1062a.m1395b();
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject(strM4711H);
                    this.macOpen = jSONObject2.optInt(C1485b.f7146dH);
                    this.imeiOpen = jSONObject2.optInt("i");
                } catch (Exception unused) {
                }
                jSONObject.put("mac", this.macOpen == 1 ? C1062a.m1392a() : "");
                jSONObject.put("imei", this.imeiOpen == 1 ? C1062a.m1402d(C1175n.m2059a().m2148f()) : "");
                strM1395b = C1062a.m1395b();
            }
            jSONObject.put("oaid", strM1395b);
        } catch (Exception unused2) {
        }
        if (i == -1 || (i & 64) != 64) {
            return;
        }
        try {
            jSONObject.put("imsi", C1062a.m1401d());
        } catch (Throwable unused3) {
        }
    }

    @Override // com.anythink.core.api.IExHandler
    public void fillRequestDeviceData(JSONObject jSONObject, int i) {
        if ((i & 1) == 1) {
            try {
                if (!TextUtils.isEmpty(C1062a.m1403e())) {
                    jSONObject.put("isroot", Integer.parseInt(C1062a.m1403e()));
                }
            } catch (Throwable unused) {
            }
            try {
                if (!TextUtils.isEmpty(C1062a.m1405f())) {
                    jSONObject.put("isagent", Integer.parseInt(C1062a.m1405f()));
                }
            } catch (Throwable unused2) {
            }
            try {
                jSONObject.put("wifi_name", C1062a.m1398c());
            } catch (Throwable unused3) {
            }
            try {
                if (!TextUtils.isEmpty(C1062a.m1406g())) {
                    jSONObject.put(JSON_REQUEST_INSTALL_TS, Long.parseLong(C1062a.m1406g()));
                }
            } catch (Throwable unused4) {
            }
            try {
                if (!TextUtils.isEmpty(C1062a.m1407h())) {
                    jSONObject.put(JSON_REQUEST_UPDATE_TS, Long.parseLong(C1062a.m1407h()));
                }
            } catch (Throwable unused5) {
            }
            try {
                jSONObject.put("cpu", C1062a.m1408i());
            } catch (Throwable unused6) {
            }
        }
        if ((i & 2) == 2) {
            try {
                jSONObject.put(JSON_REQUEST_BOOT_MARK, C1062a.m1409j());
                jSONObject.put(JSON_REQUEST_UPDATE_MARK, C1062a.m1410k());
            } catch (Throwable unused7) {
            }
        }
        if ((i & 16) == 16) {
            try {
                List<C1254s> listM1411l = C1062a.m1411l();
                if (listM1411l != null && listM1411l.size() > 0) {
                    for (int i2 = 0; i2 < listM1411l.size(); i2++) {
                        C1254s c1254s = listM1411l.get(i2);
                        if (c1254s != null && !TextUtils.isEmpty(c1254s.m3425b())) {
                            jSONObject.put(c1254s.m3424a(), c1254s.m3425b());
                        }
                    }
                }
            } catch (Throwable unused8) {
            }
        }
        if ((i & 64) == 64) {
            try {
                jSONObject.put("wifi_name", C1062a.m1398c());
                jSONObject.put(JSON_REQUEST_COMMON_DENY_PLAD, ATSDK.getPersionalizedAdStatus());
            } catch (Throwable unused9) {
            }
        }
    }

    @Override // com.anythink.core.api.IExHandler
    public void fillTestDeviceData(JSONObject jSONObject, C1391a c1391a) {
        Object obj = "";
        String strM4711H = c1391a != null ? c1391a.m4711H() : "";
        if (TextUtils.isEmpty(strM4711H)) {
            try {
                String strM1402d = C1062a.m1402d(C1175n.m2059a().m2148f());
                if (!TextUtils.isEmpty(strM1402d)) {
                    obj = strM1402d;
                }
                jSONObject.put("IMEI", obj);
                jSONObject.put("OAID", C1062a.m1399c(C1175n.m2059a().m2148f()));
                return;
            } catch (Exception unused) {
                return;
            }
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strM4711H);
            this.macOpen = jSONObject2.optInt(C1485b.f7146dH);
            this.imeiOpen = jSONObject2.optInt("i");
        } catch (Exception unused2) {
        }
        try {
            String strM1402d2 = C1062a.m1402d(C1175n.m2059a().m2148f());
            if (this.imeiOpen == 1 && !TextUtils.isEmpty(strM1402d2)) {
                obj = strM1402d2;
            }
            jSONObject.put("IMEI", obj);
            jSONObject.put("OAID", C1062a.m1399c(C1175n.m2059a().m2148f()));
        } catch (Exception unused3) {
        }
    }

    @Override // com.anythink.core.api.IExHandler
    public String getAid(Context context) {
        return C1062a.m1404e(context);
    }

    @Override // com.anythink.core.api.IExHandler
    public String getUniqueId(Context context) {
        return C1062a.m1396b(context);
    }

    @Override // com.anythink.core.api.IExHandler
    public void handleOfferClick(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, String str, String str2, Runnable runnable, InterfaceC1264b interfaceC1264b) {
        C1066a.m1427a(context).mo1447a(context, c1248m, abstractC1247l, str, str2, runnable, interfaceC1264b);
    }

    @Override // com.anythink.core.api.IExHandler
    public void initDeviceInfo(Context context) {
        C1062a.m1393a(context);
    }

    @Override // com.anythink.core.api.IExHandler
    public boolean onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        try {
            callback.invoke(str, true, false);
        } catch (Throwable unused) {
        }
        return true;
    }

    @Override // com.anythink.core.api.IExHandler
    public void openApkConfirmDialog(Context context, AbstractC1247l abstractC1247l, C1248m c1248m, InterfaceC1263a interfaceC1263a) {
        ApkConfirmDialogActivity.m1389a(context, abstractC1247l, interfaceC1263a);
    }
}
