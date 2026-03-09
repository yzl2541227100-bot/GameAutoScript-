package com.anythink.core.api;

import android.content.Context;
import android.webkit.GeolocationPermissions;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p057g.InterfaceC1263a;
import com.anythink.core.common.p057g.InterfaceC1264b;
import com.anythink.core.p072d.C1391a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface IExHandler {
    boolean checkDebuggerDevice(Context context, String str);

    int checkDownloadType(AbstractC1247l abstractC1247l, C1248m c1248m);

    ATEventInterface createDownloadListener(ATBaseAdAdapter aTBaseAdAdapter, BaseAd baseAd, ATEventInterface aTEventInterface);

    String fillCDataParam(String str);

    void fillDownloadStatus(Context context, AbstractC1247l abstractC1247l, C1248m c1248m);

    void fillRequestData(JSONObject jSONObject, C1391a c1391a);

    void fillRequestData(JSONObject jSONObject, C1391a c1391a, int i);

    void fillRequestDeviceData(JSONObject jSONObject, int i);

    void fillTestDeviceData(JSONObject jSONObject, C1391a c1391a);

    String getAid(Context context);

    String getUniqueId(Context context);

    void handleOfferClick(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, String str, String str2, Runnable runnable, InterfaceC1264b interfaceC1264b);

    void initDeviceInfo(Context context);

    boolean onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback);

    void openApkConfirmDialog(Context context, AbstractC1247l abstractC1247l, C1248m c1248m, InterfaceC1263a interfaceC1263a);
}
