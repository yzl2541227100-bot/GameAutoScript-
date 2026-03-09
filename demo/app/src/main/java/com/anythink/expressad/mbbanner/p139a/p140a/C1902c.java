package com.anythink.expressad.mbbanner.p139a.p140a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.p050a.C1159k;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import com.anythink.expressad.foundation.p138h.C1869c;
import com.anythink.expressad.foundation.p138h.C1885s;
import com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.p086d.C1489c;
import com.anythink.expressad.videocommon.p178b.C2316a;
import com.anythink.expressad.videocommon.p178b.C2324i;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1902c extends CommonBannerJSBridgeImp {

    /* JADX INFO: renamed from: b */
    private static final String f11726b = "BannerJSBridgeImpl";

    /* JADX INFO: renamed from: c */
    private WeakReference<Context> f11727c;

    /* JADX INFO: renamed from: d */
    private List<C1781c> f11728d;

    /* JADX INFO: renamed from: e */
    private String f11729e;

    /* JADX INFO: renamed from: f */
    private String f11730f;

    /* JADX INFO: renamed from: g */
    private int f11731g;

    /* JADX INFO: renamed from: h */
    private InterfaceC1908a f11732h;

    /* JADX INFO: renamed from: i */
    private DialogC1901b f11733i;

    /* JADX INFO: renamed from: j */
    private boolean f11734j = false;

    public C1902c(Context context, String str, String str2) {
        this.f11729e = str;
        this.f11730f = str2;
        this.f11727c = new WeakReference<>(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX INFO: renamed from: a */
    private static void m9910a(Object obj, JSONObject jSONObject) {
        String str;
        ?? r17;
        String str2;
        File file;
        ?? r3 = "message";
        String str3 = "code";
        ?? jSONObject2 = new JSONObject();
        int i = 1;
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put("message", "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray != null && jSONArray.length() > 0) {
                ?? jSONArray2 = new JSONArray();
                int length = jSONArray.length();
                int i2 = 0;
                r3 = r3;
                while (i2 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    String strOptString = jSONObject3.optString("ref", "");
                    int i3 = jSONObject3.getInt("type");
                    ?? jSONObject4 = new JSONObject();
                    if (i3 != i || TextUtils.isEmpty(strOptString)) {
                        r17 = r3;
                        str2 = str3;
                        if (i3 == 2 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("type", 2);
                            jSONObject5.put("path", C2324i.m11867a().m11879a(strOptString) == null ? "" : C2324i.m11867a().m11883c(strOptString));
                            jSONObject4.put(strOptString, jSONObject5);
                            r17 = r17;
                        } else if (i3 == 3 && !TextUtils.isEmpty(strOptString)) {
                            try {
                                file = new File(strOptString);
                            } catch (Throwable th) {
                                if (C1404a.f6209a) {
                                    th.printStackTrace();
                                }
                            }
                            String strConcat = (file.exists() && file.isFile() && file.canRead()) ? "file:////".concat(String.valueOf(strOptString)) : "";
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 3);
                            jSONObject6.put("path", strConcat);
                            jSONObject4.put(strOptString, jSONObject6);
                            r17 = r17;
                        } else if (i3 == 4 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 4);
                            jSONObject7.put("path", C1885s.m9804a(strOptString) == null ? "" : C1885s.m9804a(strOptString));
                            jSONObject4.put(strOptString, jSONObject7);
                            r17 = r17;
                        }
                        jSONArray2.put(jSONObject4);
                    } else {
                        JSONObject jSONObject8 = new JSONObject();
                        C2316a.m11773a();
                        C1159k c1159kM11775b = C2316a.m11775b(strOptString);
                        if (c1159kM11775b != null) {
                            jSONObject8.put("type", i);
                            r17 = r3;
                            str2 = str3;
                            try {
                                jSONObject8.put("videoDataLength", c1159kM11775b.m1993d());
                                String strM1988b = c1159kM11775b.m1988b();
                                if (TextUtils.isEmpty(strM1988b)) {
                                    jSONObject8.put("path", "");
                                    jSONObject8.put("path4Web", "");
                                } else {
                                    jSONObject8.put("path", strM1988b);
                                    jSONObject8.put("path4Web", strM1988b);
                                }
                                if (c1159kM11775b.m1991c() == 100) {
                                    jSONObject8.put("downloaded", 1);
                                } else {
                                    jSONObject8.put("downloaded", 0);
                                }
                                jSONObject4.put(strOptString, jSONObject8);
                                r17 = r17;
                                jSONArray2.put(jSONObject4);
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = r17;
                                str = str2;
                            }
                        } else {
                            r17 = r3;
                            str2 = str3;
                        }
                    }
                    i2++;
                    r3 = r17;
                    str3 = str2;
                    i = 1;
                }
                r17 = r3;
                str2 = str3;
                jSONObject2.put("resource", jSONArray2);
                C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            str = "code";
            r3 = 1;
            try {
                try {
                    jSONObject2.put(str, 1);
                } catch (JSONException e) {
                    e = e;
                } catch (Throwable th3) {
                    th = th3;
                    r3 = "message";
                }
                try {
                    jSONObject2.put("message", "resource is null");
                    C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                } catch (JSONException e2) {
                    e = e2;
                    e.getMessage();
                    return;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str = str3;
        }
        try {
            jSONObject2.put(str, 1);
            jSONObject2.put(r3, th.getLocalizedMessage());
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (JSONException e3) {
            e3.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9911a() {
        if (this.f11732h != null) {
            this.f11732h = null;
        }
        if (this.f11733i != null) {
            this.f11733i = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9912a(int i) {
        this.f11731g = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m9913a(InterfaceC1908a interfaceC1908a) {
        if (interfaceC1908a != null) {
            this.f11732h = interfaceC1908a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9914a(List<C1781c> list) {
        this.f11728d = list;
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void click(Object obj, String str) {
        try {
            List<C1781c> list = this.f11728d;
            if (list == null) {
                return;
            }
            C1781c c1781c = null;
            if (list != null && list.size() > 0) {
                c1781c = this.f11728d.get(0);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectM8671a = C1781c.m8671a(c1781c);
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectM8671a.put(next, jSONObject.getString(next));
                }
                C1781c c1781cM8703b = C1781c.m8703b(jSONObjectM8671a);
                String strOptString = jSONObjectM8671a.optString("unitId");
                if (!TextUtils.isEmpty(strOptString)) {
                    c1781cM8703b.m8891l(strOptString);
                }
                c1781c = c1781cM8703b;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            InterfaceC1908a interfaceC1908a = this.f11732h;
            if (interfaceC1908a != null) {
                interfaceC1908a.mo9954a(c1781c);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void close() {
        try {
            InterfaceC1908a interfaceC1908a = this.f11732h;
            if (interfaceC1908a != null) {
                interfaceC1908a.mo9957b();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void expand(String str, boolean z) {
        Context context;
        try {
            String strM8901p = "";
            if (getMraidCampaign() != null) {
                if (TextUtils.isEmpty(getMraidCampaign().m8903q())) {
                    strM8901p = getMraidCampaign().m8901p();
                } else {
                    strM8901p = "file:////" + getMraidCampaign().m8903q();
                }
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str = strM8901p;
            }
            bundle.putString(C1781c.f10246am, str);
            bundle.putBoolean("shouldUseCustomClose", z);
            WeakReference<Context> weakReference = this.f11727c;
            if (weakReference != null && (context = weakReference.get()) != null) {
                DialogC1901b dialogC1901b = this.f11733i;
                if (dialogC1901b != null && dialogC1901b.isShowing()) {
                    return;
                }
                DialogC1901b dialogC1901b2 = new DialogC1901b(context, bundle, this.f11732h);
                this.f11733i = dialogC1901b2;
                dialogC1901b2.m9908a(this.f11730f, this.f11728d);
                this.f11733i.show();
            }
            InterfaceC1908a interfaceC1908a = this.f11732h;
            if (interfaceC1908a != null) {
                interfaceC1908a.mo9955a(true);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void getFileInfo(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is empty");
            return;
        }
        try {
            m9910a(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final C1781c getMraidCampaign() {
        List<C1781c> list = this.f11728d;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f11728d.get(0);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            C1869c c1869c = new C1869c(C1175n.m2059a().m2148f());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f11731g);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", c1869c.mo9675a());
            jSONObject.put("campaignList", C1781c.m8705b(this.f11728d));
            C1486b.m6002a();
            C1489c c1489cM6011c = C1486b.m6011c(C1773a.m8548c().m8558f(), this.f11730f);
            if (c1489cM6011c == null) {
                c1489cM6011c = C1489c.m6069c(this.f11730f);
            }
            if (!TextUtils.isEmpty(this.f11729e)) {
                c1489cM6011c.m6100e(this.f11729e);
            }
            jSONObject.put("unitSetting", c1489cM6011c.m6114s());
            C1486b.m6002a();
            C1486b.m6004a(C1773a.m8548c().m8558f());
            jSONObject.put("appSetting", new JSONObject());
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void open(String str) {
        try {
            if (this.f11728d.size() > 1) {
                C1175n.m2059a().m2148f().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            InterfaceC1908a interfaceC1908a = this.f11732h;
            if (interfaceC1908a != null) {
                interfaceC1908a.mo9956a(true, str);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                C1469j.m5701a().mo5673a(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
                InterfaceC1908a interfaceC1908a = this.f11732h;
                if (interfaceC1908a != null) {
                    interfaceC1908a.mo9958b(iOptInt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void sendImpressions(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                for (C1781c c1781c : this.f11728d) {
                    if (c1781c.m10146aZ().equals(string)) {
                        C1807f.m9397a(this.f11730f, c1781c, C1807f.f11181e);
                        arrayList.add(string);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            InterfaceC1908a interfaceC1908a = this.f11732h;
            if (interfaceC1908a != null) {
                interfaceC1908a.mo9953a(iOptInt);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void triggerCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            new JSONObject(str).optString("state");
            InterfaceC1908a interfaceC1908a = this.f11732h;
            if (interfaceC1908a != null) {
                interfaceC1908a.mo9952a();
            }
            C1469j.m5701a().mo5673a(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
        } catch (Throwable unused) {
            C1469j.m5701a().mo5673a(obj, CommonJSBridgeImpUtils.codeToJsonString(-1));
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void unload() {
        close();
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void useCustomClose(boolean z) {
        int i = z ? 2 : 1;
        try {
            InterfaceC1908a interfaceC1908a = this.f11732h;
            if (interfaceC1908a != null) {
                interfaceC1908a.mo9953a(i);
            }
        } catch (Throwable unused) {
        }
    }
}
