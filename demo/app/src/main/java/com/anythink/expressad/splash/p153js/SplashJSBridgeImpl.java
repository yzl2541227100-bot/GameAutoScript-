package com.anythink.expressad.splash.p153js;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.expressad.atsignalcommon.base.C1452d;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.C1460a;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.p073a.C1405a;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.p086d.C1489c;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.anythink.expressad.splash.p148a.C1976a;
import com.anythink.expressad.splash.p152d.InterfaceC1988a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class SplashJSBridgeImpl implements ISplashBridge {

    /* JADX INFO: renamed from: b */
    private WeakReference<Context> f12683b;

    /* JADX INFO: renamed from: c */
    private List<C1781c> f12684c;

    /* JADX INFO: renamed from: d */
    private String f12685d;

    /* JADX INFO: renamed from: e */
    private String f12686e;

    /* JADX INFO: renamed from: f */
    private int f12687f;

    /* JADX INFO: renamed from: g */
    private int f12688g;

    /* JADX INFO: renamed from: i */
    private int f12690i;

    /* JADX INFO: renamed from: j */
    private InterfaceC1988a f12691j;

    /* JADX INFO: renamed from: k */
    private SplashExpandDialog f12692k;

    /* JADX INFO: renamed from: a */
    private String f12682a = "SplashJSBridgeImpl";

    /* JADX INFO: renamed from: h */
    private int f12689h = 5;

    public SplashJSBridgeImpl(Context context, String str, String str2) {
        this.f12686e = str;
        this.f12685d = str2;
        this.f12683b = new WeakReference<>(context);
    }

    @Override // com.anythink.expressad.splash.p153js.ISplashBridge
    public void cai(Object obj, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "params is null";
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                try {
                    String strOptString = new JSONObject(str).optString("packageName");
                    if (TextUtils.isEmpty(strOptString)) {
                        CommonJSBridgeImpUtils.callbackExcep(obj, "packageName is empty");
                    }
                    int i = C1886t.m9827a(C1175n.m2059a().m2148f(), strOptString) ? 1 : 2;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", CommonJSBridgeImpUtils.f6693b);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(C1796r.f10844ah, i);
                        jSONObject.put("data", jSONObject2);
                        C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        return;
                    } catch (Exception e) {
                        CommonJSBridgeImpUtils.callbackExcep(obj, e.getMessage());
                        e.getMessage();
                        return;
                    }
                } catch (JSONException e2) {
                    str2 = "exception: " + e2.getLocalizedMessage();
                }
            } catch (Throwable th) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
                return;
            }
        }
        CommonJSBridgeImpUtils.callbackExcep(obj, str2);
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void close() {
        try {
            InterfaceC1988a interfaceC1988a = this.f12691j;
            if (interfaceC1988a != null) {
                interfaceC1988a.mo10662c();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void expand(String str, boolean z) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString(C1781c.f10246am, str);
            bundle.putBoolean("shouldUseCustomClose", z);
            WeakReference<Context> weakReference = this.f12683b;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            SplashExpandDialog splashExpandDialog = this.f12692k;
            if (splashExpandDialog == null || !splashExpandDialog.isShowing()) {
                SplashExpandDialog splashExpandDialog2 = new SplashExpandDialog(this.f12683b.get(), bundle, this.f12691j);
                this.f12692k = splashExpandDialog2;
                splashExpandDialog2.setCampaignList(this.f12685d, this.f12684c);
                this.f12692k.show();
                InterfaceC1988a interfaceC1988a = this.f12691j;
                if (interfaceC1988a != null) {
                    interfaceC1988a.mo10658a(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public C1781c getMraidCampaign() {
        List<C1781c> list = this.f12684c;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f12684c.get(0);
    }

    public InterfaceC1988a getSplashBridgeListener() {
        return this.f12691j;
    }

    public List<C1781c> getmCampaignList() {
        return this.f12684c;
    }

    @Override // com.anythink.expressad.splash.p153js.ISplashBridge
    public void gial(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f6693b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageNameList", new JSONArray());
            jSONObject.put("data", jSONObject2);
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e.getMessage());
            e.getMessage();
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.splash.p153js.ISplashBridge
    public void handlerH5Exception(Object obj, String str) {
    }

    @Override // com.anythink.expressad.splash.p153js.ISplashBridge
    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            C1976a c1976a = new C1976a(C1175n.m2059a().m2148f());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f12687f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", c1976a.m10482a());
            jSONObject.put("campaignList", C1781c.m8705b(this.f12684c));
            C1486b.m6002a();
            C1489c c1489cM6011c = C1486b.m6011c(C1773a.m8548c().m8558f(), this.f12685d);
            if (c1489cM6011c == null) {
                c1489cM6011c = C1489c.m6069c(this.f12685d);
            }
            if (!TextUtils.isEmpty(this.f12686e)) {
                c1489cM6011c.m6100e(this.f12686e);
            }
            c1489cM6011c.m6090a(this.f12685d);
            c1489cM6011c.m6093b(this.f12689h);
            c1489cM6011c.m6089a(this.f12688g);
            jSONObject.put("unitSetting", c1489cM6011c.m6114s());
            C1486b.m6002a();
            String strM6004a = C1486b.m6004a(C1773a.m8548c().m8558f());
            if (!TextUtils.isEmpty(strM6004a)) {
                jSONObject.put("appSetting", new JSONObject(strM6004a));
            }
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, C1452d.f6677a);
            new StringBuilder("init").append(jSONObject.toString());
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.splash.p153js.ISplashBridge
    public void install(Object obj, String str) {
        try {
            List<C1781c> list = this.f12684c;
            if (list == null) {
                return;
            }
            C1781c c1781c = null;
            if (list != null && list.size() > 0) {
                c1781c = this.f12684c.get(0);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectM8671a = C1781c.m8671a(c1781c);
                JSONObject jSONObject = new JSONObject(str);
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
            InterfaceC1988a interfaceC1988a = this.f12691j;
            if (interfaceC1988a != null) {
                interfaceC1988a.mo10656a(c1781c);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.splash.p153js.ISplashBridge
    public void onJSBridgeConnect(Object obj, String str) {
        try {
            if (obj instanceof C1460a) {
                C1469j.m5701a();
                C1469j.m5704b(((C1460a) obj).f6757a);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void open(String str) {
        InterfaceC1988a interfaceC1988a = this.f12691j;
        if (interfaceC1988a != null) {
            interfaceC1988a.mo10661b(str);
        }
    }

    @Override // com.anythink.expressad.splash.p153js.ISplashBridge
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        Context contextM2148f = C1175n.m2059a().m2148f();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextM2148f == null) {
            try {
                if ((obj instanceof C1460a) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                    contextM2148f = windVaneWebView.getContext();
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        if (contextM2148f == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(C1781c.f10246am);
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                C1350n.m4204a(strOptString);
            } else if (iOptInt == 2) {
                C1350n.m4203a(contextM2148f, strOptString);
            }
        } catch (JSONException e2) {
            e2.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.splash.p153js.ISplashBridge
    public void pauseCountDown(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            jSONObject.put("message", "Call pause count down success.");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C1485b.f7175dk, this.f12690i);
            jSONObject.put("data", jSONObject2);
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.getMessage();
        }
        InterfaceC1988a interfaceC1988a = this.f12691j;
        if (interfaceC1988a != null) {
            interfaceC1988a.mo10655a(1, -1);
        }
    }

    @Override // com.anythink.expressad.splash.p153js.ISplashBridge
    public void readyStatus(Object obj, String str) {
    }

    public void release() {
        if (this.f12691j != null) {
            this.f12691j = null;
        }
    }

    @Override // com.anythink.expressad.splash.p153js.ISplashBridge
    public void reportUrls(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int iOptInt = jSONObject.optInt("type");
                String strOptString = jSONObject.optString(C1781c.f10246am);
                int iOptInt2 = jSONObject.optInt("report");
                boolean z = true;
                if (iOptInt2 == 0) {
                    Context contextM2148f = C1175n.m2059a().m2148f();
                    if (iOptInt == 0) {
                        z = false;
                    }
                    C1405a.m5185a(contextM2148f, (C1781c) null, "", strOptString, z);
                } else {
                    C1405a.m5186a(C1175n.m2059a().m2148f(), null, "", strOptString, false, iOptInt != 0, iOptInt2);
                }
            }
            C1469j.m5701a().mo5673a(obj, SplashJsUtils.codeToJsonString(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.splash.p153js.ISplashBridge
    public void resetCountdown(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i = new JSONObject(str).getInt(C1485b.f7175dk);
            InterfaceC1988a interfaceC1988a = this.f12691j;
            if (interfaceC1988a != null) {
                interfaceC1988a.mo10660b(i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.splash.p153js.ISplashBridge
    public void resumeCountDown(Object obj, String str) {
        int iOptInt;
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            try {
                iOptInt = new JSONObject(str).optInt(C1485b.f7175dk);
            } catch (Exception e) {
                e = e;
            }
            try {
                C1469j.m5701a().mo5673a(obj, SplashJsUtils.codeToJsonString(0));
                i = iOptInt;
            } catch (Exception e2) {
                e = e2;
                i = iOptInt;
                e.getMessage();
            }
        }
        InterfaceC1988a interfaceC1988a = this.f12691j;
        if (interfaceC1988a != null) {
            interfaceC1988a.mo10655a(2, i);
        }
    }

    @Override // com.anythink.expressad.splash.p153js.ISplashBridge
    public void sendImpressions(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                for (C1781c c1781c : this.f12684c) {
                    if (c1781c.m10146aZ().equals(string)) {
                        C1807f.m9397a(this.f12685d, c1781c, C1807f.f11182f);
                        arrayList.add(string);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setAllowSkip(int i) {
        this.f12688g = i;
    }

    public void setCampaignList(List<C1781c> list) {
        this.f12684c = list;
    }

    public void setCountdownS(int i) {
        this.f12689h = i;
    }

    public void setDevCloseBtnStatus(int i) {
        this.f12687f = i;
    }

    public void setSplashBridgeListener(InterfaceC1988a interfaceC1988a) {
        if (interfaceC1988a != null) {
            this.f12691j = interfaceC1988a;
        }
    }

    @Override // com.anythink.expressad.splash.p153js.ISplashBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            InterfaceC1988a interfaceC1988a = this.f12691j;
            if (interfaceC1988a != null) {
                interfaceC1988a.mo10654a(iOptInt);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.splash.p153js.ISplashBridge
    public void triggerCloseBtn(Object obj, String str) {
        InterfaceC1988a interfaceC1988a = this.f12691j;
        if (interfaceC1988a != null) {
            interfaceC1988a.mo10653a();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void unload() {
        close();
    }

    public void updateContext(Context context) {
        this.f12683b = new WeakReference<>(context);
    }

    public void updateCountDown(int i) {
        this.f12690i = i;
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void useCustomClose(boolean z) {
        int i = z ? 2 : 1;
        try {
            InterfaceC1988a interfaceC1988a = this.f12691j;
            if (interfaceC1988a != null) {
                interfaceC1988a.mo10654a(i);
            }
        } catch (Throwable unused) {
        }
    }
}
