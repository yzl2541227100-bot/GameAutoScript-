package com.anythink.expressad.atsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.atsignalcommon.windvane.AbstractC1471l;
import com.anythink.expressad.atsignalcommon.windvane.C1460a;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.p073a.p075b.C1410a;
import org.json.JSONObject;
import p285z2.C4196o4;

/* JADX INFO: loaded from: classes.dex */
public class MraidJSBridge extends AbstractC1471l {

    /* JADX INFO: renamed from: a */
    public static final String f6721a = "MraidJSBridge";

    /* JADX INFO: renamed from: b */
    private IMraidJSBridge f6722b;

    public void close(Object obj, String str) {
        if (obj instanceof C1460a) {
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(((C1460a) obj).f6757a, C1781c.f10318cf);
        }
        try {
            IMraidJSBridge iMraidJSBridge = this.f6722b;
            if (iMraidJSBridge != null) {
                iMraidJSBridge.close();
            }
        } catch (Throwable unused) {
        }
    }

    public void expand(Object obj, String str) {
        if (obj instanceof C1460a) {
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(((C1460a) obj).f6757a, "expand");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(C1781c.f10246am);
            String strOptString2 = jSONObject.optString("shouldUseCustomClose");
            StringBuilder sb = new StringBuilder("MRAID expand ");
            sb.append(strOptString);
            sb.append(C4196o4.OooO00o.OooO0Oo);
            sb.append(strOptString2);
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f6722b == null) {
                return;
            }
            this.f6722b.expand(strOptString, strOptString2.toLowerCase().equals("true"));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.expressad.atsignalcommon.windvane.AbstractC1471l
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof IMraidJSBridge) {
                this.f6722b = (IMraidJSBridge) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IMraidJSBridge)) {
                this.f6722b = (IMraidJSBridge) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() == null || !(windVaneWebView.getMraidObject() instanceof IMraidJSBridge)) {
                return;
            }
            this.f6722b = (IMraidJSBridge) windVaneWebView.getMraidObject();
        } catch (Exception e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        }
    }

    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof C1460a) {
            windVaneWebView = ((C1460a) obj).f6757a;
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(windVaneWebView, "open");
        } else {
            windVaneWebView = null;
        }
        try {
            String strOptString = new JSONObject(str).optString(C1781c.f10246am);
            if (this.f6722b == null || TextUtils.isEmpty(strOptString)) {
                return;
            }
            if (windVaneWebView != null && System.currentTimeMillis() - windVaneWebView.lastTouchTime > C1410a.f6300c) {
                C1781c mraidCampaign = this.f6722b.getMraidCampaign();
                windVaneWebView.getUrl();
                int i = C1410a.f6298a;
                if (C1410a.m5255a(mraidCampaign)) {
                    return;
                }
            }
            this.f6722b.open(strOptString);
        } catch (Throwable unused) {
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        if (obj instanceof C1460a) {
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(((C1460a) obj).f6757a, "setOrientationProperties");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("allowOrientationChange");
            String strOptString2 = jSONObject.optString("forceOrientation");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f6722b == null) {
                return;
            }
            strOptString.toLowerCase().equals("true");
            String lowerCase = strOptString2.toLowerCase();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == 729267099) {
                if (lowerCase.equals("portrait")) {
                }
            } else {
                if (iHashCode != 1430647483) {
                    return;
                }
                lowerCase.equals("landscape");
            }
        } catch (Throwable unused) {
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof C1460a) {
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(((C1460a) obj).f6757a, "unload");
        }
        try {
            IMraidJSBridge iMraidJSBridge = this.f6722b;
            if (iMraidJSBridge != null) {
                iMraidJSBridge.unload();
            }
        } catch (Throwable unused) {
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof C1460a) {
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(((C1460a) obj).f6757a, "useCustomClose");
        }
        try {
            String strOptString = new JSONObject(str).optString("shouldUseCustomClose");
            if (TextUtils.isEmpty(strOptString) || this.f6722b == null) {
                return;
            }
            this.f6722b.useCustomClose(strOptString.toLowerCase().equals("true"));
        } catch (Throwable unused) {
        }
    }
}
