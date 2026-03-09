package com.anythink.core.debugger;

import android.content.Context;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.debugger.api.DebuggerDeviceInfo;
import com.anythink.core.debugger.api.DebuggerSdkInfo;
import com.anythink.core.debugger.api.IDeviceInfoGetter;
import com.anythink.core.debugger.api.ISdkInfoGetter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CoreDebuggerManager {

    /* JADX INFO: renamed from: a */
    private static volatile CoreDebuggerManager f6180a;

    /* JADX INFO: renamed from: b */
    private final DebuggerDeviceInfo f6181b = new DebuggerDeviceInfo();

    /* JADX INFO: renamed from: c */
    private final DebuggerSdkInfo f6182c = new DebuggerSdkInfo();

    private CoreDebuggerManager() {
    }

    /* JADX INFO: renamed from: a */
    private void m5183a() {
        IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
        Context contextM2148f = C1175n.m2059a().m2148f();
        if (iExHandlerM2132b == null) {
            return;
        }
        try {
            String aid = iExHandlerM2132b.getAid(contextM2148f);
            JSONObject jSONObject = new JSONObject();
            iExHandlerM2132b.fillRequestData(jSONObject, null);
            this.f6181b.setAndroidId(aid);
            if (jSONObject.has("imei")) {
                this.f6181b.setImei(jSONObject.opt("imei").toString());
            }
            if (jSONObject.has("oaid")) {
                this.f6181b.setOaid(jSONObject.opt("oaid").toString());
            }
            if (jSONObject.has("mac")) {
                this.f6181b.setMac(jSONObject.opt("mac").toString());
            }
        } catch (Exception unused) {
        }
    }

    public static CoreDebuggerManager getInstance() {
        if (f6180a == null) {
            synchronized (CoreDebuggerManager.class) {
                if (f6180a == null) {
                    f6180a = new CoreDebuggerManager();
                }
            }
        }
        return f6180a;
    }

    public void setDeviceInfoGetter(Context context, IDeviceInfoGetter iDeviceInfoGetter) {
        if (iDeviceInfoGetter != null) {
            this.f6181b.setGaid(C1341e.m4094s(context));
            this.f6181b.setMnc(C1341e.m4058c(context));
            this.f6181b.setMcc(C1341e.m4055b(context));
            this.f6181b.setUpId(C1175n.m2059a().m2177x());
            IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
            Context contextM2148f = C1175n.m2059a().m2148f();
            if (iExHandlerM2132b != null) {
                try {
                    String aid = iExHandlerM2132b.getAid(contextM2148f);
                    JSONObject jSONObject = new JSONObject();
                    iExHandlerM2132b.fillRequestData(jSONObject, null);
                    this.f6181b.setAndroidId(aid);
                    if (jSONObject.has("imei")) {
                        this.f6181b.setImei(jSONObject.opt("imei").toString());
                    }
                    if (jSONObject.has("oaid")) {
                        this.f6181b.setOaid(jSONObject.opt("oaid").toString());
                    }
                    if (jSONObject.has("mac")) {
                        this.f6181b.setMac(jSONObject.opt("mac").toString());
                    }
                } catch (Exception unused) {
                }
            }
            iDeviceInfoGetter.onDeviceInfoCallback(this.f6181b);
        }
    }

    public void setSdkInfoGetter(ISdkInfoGetter iSdkInfoGetter) {
        C1175n c1175nM2059a = C1175n.m2059a();
        if (iSdkInfoGetter != null) {
            this.f6182c.setInitSdk(c1175nM2059a.m2107M());
            this.f6182c.setAppId(c1175nM2059a.m2165o());
            this.f6182c.setDeniedUploadDeviceInfo(c1175nM2059a.m2147e());
            this.f6182c.setHaveLoadAd(c1175nM2059a.f3364c);
            this.f6182c.setHavePreInitNetwork(c1175nM2059a.m2102H());
            iSdkInfoGetter.onSdkInfoCallback(this.f6182c);
        }
    }
}
