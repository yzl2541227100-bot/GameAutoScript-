package com.anythink.expressad.advanced.p080js;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.advanced.p076a.C1421b;
import com.anythink.expressad.advanced.p079d.InterfaceC1429a;
import com.anythink.expressad.atsignalcommon.base.C1452d;
import com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.C1460a;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.p086d.C1489c;
import com.anythink.expressad.p086d.p087a.C1485b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class NativeAdvancedJSBridgeImpl extends CommonBannerJSBridgeImp {

    /* JADX INFO: renamed from: c */
    private WeakReference<Context> f6605c;

    /* JADX INFO: renamed from: d */
    private List<C1781c> f6606d;

    /* JADX INFO: renamed from: e */
    private String f6607e;

    /* JADX INFO: renamed from: f */
    private String f6608f;

    /* JADX INFO: renamed from: g */
    private int f6609g;

    /* JADX INFO: renamed from: h */
    private int f6610h;

    /* JADX INFO: renamed from: j */
    private InterfaceC1429a f6612j;

    /* JADX INFO: renamed from: k */
    private NativeAdvancedExpandDialog f6613k;

    /* JADX INFO: renamed from: b */
    private String f6604b = "NativeAdvancedJSBridgeImpl";

    /* JADX INFO: renamed from: i */
    private int f6611i = 5;

    public NativeAdvancedJSBridgeImpl(Context context, String str, String str2) {
        this.f6608f = str;
        this.f6607e = str2;
        this.f6605c = new WeakReference<>(context);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void click(Object obj, String str) {
        C1781c c1781c = null;
        try {
            List<C1781c> list = this.f6606d;
            if (list != null && list.size() > 0) {
                c1781c = this.f6606d.get(0);
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
            InterfaceC1429a interfaceC1429a = this.f6612j;
            if (interfaceC1429a != null) {
                interfaceC1429a.mo5496a(c1781c);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void close() {
        try {
            InterfaceC1429a interfaceC1429a = this.f6612j;
            if (interfaceC1429a != null) {
                interfaceC1429a.mo5502e();
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
            WeakReference<Context> weakReference = this.f6605c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            NativeAdvancedExpandDialog nativeAdvancedExpandDialog = this.f6613k;
            if (nativeAdvancedExpandDialog == null || !nativeAdvancedExpandDialog.isShowing()) {
                NativeAdvancedExpandDialog nativeAdvancedExpandDialog2 = new NativeAdvancedExpandDialog(this.f6605c.get(), bundle, this.f6612j);
                this.f6613k = nativeAdvancedExpandDialog2;
                nativeAdvancedExpandDialog2.setCampaignList(this.f6607e, this.f6606d);
                this.f6613k.show();
                InterfaceC1429a interfaceC1429a = this.f6612j;
                if (interfaceC1429a != null) {
                    interfaceC1429a.mo5498a(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void getFileInfo(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is empty");
            return;
        }
        try {
            NativeAdvancedJsUtils.getFileInfo(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public C1781c getMraidCampaign() {
        List<C1781c> list = this.f6606d;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f6606d.get(0);
    }

    public List<C1781c> getmCampaignList() {
        return this.f6606d;
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            C1421b c1421b = new C1421b(C1175n.m2059a().m2148f());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f6609g);
            jSONObject2.put("customURLScheme", 1);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", c1421b.m5403a());
            jSONObject.put("campaignList", C1781c.m8705b(this.f6606d));
            C1486b.m6002a();
            C1489c c1489cM6014d = C1486b.m6014d(C1773a.m8548c().m8558f(), this.f6607e);
            if (c1489cM6014d == null) {
                c1489cM6014d = C1489c.m6086y();
            }
            if (!TextUtils.isEmpty(this.f6608f)) {
                c1489cM6014d.m6100e(this.f6608f);
            }
            c1489cM6014d.m6090a(this.f6607e);
            c1489cM6014d.m6093b(this.f6611i);
            c1489cM6014d.m6089a(this.f6610h);
            jSONObject.put("unitSetting", c1489cM6014d.m6114s());
            jSONObject.put("appSetting", new JSONObject());
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, C1452d.f6677a);
            new StringBuilder("init").append(jSONObject.toString());
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void install(Object obj, String str) {
        C1781c c1781c = null;
        try {
            List<C1781c> list = this.f6606d;
            if (list != null && list.size() > 0) {
                c1781c = this.f6606d.get(0);
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
            InterfaceC1429a interfaceC1429a = this.f6612j;
            if (interfaceC1429a != null) {
                interfaceC1429a.mo5496a(c1781c);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
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
        InterfaceC1429a interfaceC1429a = this.f6612j;
        if (interfaceC1429a != null) {
            interfaceC1429a.mo5497a(str);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void readyStatus(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            if (!(obj instanceof C1460a) || (windVaneWebView = ((C1460a) obj).f6757a) == null) {
                return;
            }
            try {
                windVaneWebView.getWebViewListener().readyState(windVaneWebView, new JSONObject(str).getInt("isReady"));
            } catch (Exception unused) {
                windVaneWebView.getWebViewListener().readyState(windVaneWebView, 2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void release() {
        if (this.f6612j != null) {
            this.f6612j = null;
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void resetCountdown(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            new JSONObject(str).getInt(C1485b.f7175dk);
            InterfaceC1429a interfaceC1429a = this.f6612j;
            if (interfaceC1429a != null) {
                interfaceC1429a.mo5500c();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void sendImpressions(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                for (C1781c c1781c : this.f6606d) {
                    if (c1781c.m10146aZ().equals(string)) {
                        C1807f.m9397a(this.f6607e, c1781c, C1807f.f11183g);
                        arrayList.add(string);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setAllowSkip(int i) {
        this.f6610h = i;
    }

    public void setCampaignList(List<C1781c> list) {
        this.f6606d = list;
    }

    public void setCountdownS(int i) {
        this.f6611i = i;
    }

    public void setDevCloseBtnStatus(int i) {
        this.f6609g = i;
    }

    public void setNativeAdvancedBridgeListener(InterfaceC1429a interfaceC1429a) {
        if (interfaceC1429a != null) {
            this.f6612j = interfaceC1429a;
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            InterfaceC1429a interfaceC1429a = this.f6612j;
            if (interfaceC1429a != null) {
                interfaceC1429a.mo5495a(iOptInt);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void triggerCloseBtn(Object obj, String str) {
        if (this.f6612j != null) {
            NativeAdvancedJsUtils.callbackSuccess(obj);
            this.f6612j.mo5494a();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void unload() {
        close();
    }

    public void updateContext(Context context) {
        this.f6605c = new WeakReference<>(context);
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void useCustomClose(boolean z) {
        try {
            if (this.f6610h == -1) {
                int i = z ? 2 : 1;
                InterfaceC1429a interfaceC1429a = this.f6612j;
                if (interfaceC1429a != null) {
                    interfaceC1429a.mo5495a(i);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
