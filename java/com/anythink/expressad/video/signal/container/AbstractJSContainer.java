package com.anythink.expressad.video.signal.container;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.video.signal.InterfaceC2192a;
import com.anythink.expressad.video.signal.InterfaceC2208b;
import com.anythink.expressad.video.signal.InterfaceC2209c;
import com.anythink.expressad.video.signal.InterfaceC2306e;
import com.anythink.expressad.video.signal.InterfaceC2310g;
import com.anythink.expressad.video.signal.InterfaceC2312i;
import com.anythink.expressad.video.signal.InterfaceC2313j;
import com.anythink.expressad.video.signal.factory.C2308a;
import com.anythink.expressad.video.signal.factory.IJSFactory;
import com.anythink.expressad.video.signal.p176a.C2202j;
import com.anythink.expressad.videocommon.C2314a;
import com.anythink.expressad.videocommon.p179c.C2333c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* JADX INFO: renamed from: l */
    public static final String f14273l = "AbstractJSContainer";

    /* JADX INFO: renamed from: A */
    public IJSFactory f14274A;

    /* JADX INFO: renamed from: a */
    private int f14275a;

    /* JADX INFO: renamed from: b */
    private int f14276b;

    /* JADX INFO: renamed from: m */
    public Activity f14277m;

    /* JADX INFO: renamed from: n */
    public String f14278n;

    /* JADX INFO: renamed from: o */
    public String f14279o;

    /* JADX INFO: renamed from: p */
    public C2340d f14280p;

    /* JADX INFO: renamed from: q */
    public String f14281q;

    /* JADX INFO: renamed from: r */
    public C2333c f14282r;

    /* JADX INFO: renamed from: s */
    public String f14283s;

    /* JADX INFO: renamed from: t */
    public int f14284t;

    /* JADX INFO: renamed from: u */
    public boolean f14285u;

    /* JADX INFO: renamed from: v */
    public boolean f14286v;

    /* JADX INFO: renamed from: w */
    public int f14287w;

    /* JADX INFO: renamed from: x */
    public int f14288x;

    /* JADX INFO: renamed from: y */
    public int f14289y;

    /* JADX INFO: renamed from: z */
    public boolean f14290z;

    public AbstractJSContainer(Context context) {
        super(context);
        this.f14275a = 0;
        this.f14276b = 1;
        this.f14284t = 2;
        this.f14285u = false;
        this.f14286v = false;
        this.f14290z = false;
        this.f14274A = new C2308a();
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14275a = 0;
        this.f14276b = 1;
        this.f14284t = 2;
        this.f14285u = false;
        this.f14286v = false;
        this.f14290z = false;
        this.f14274A = new C2308a();
    }

    /* JADX INFO: renamed from: a */
    private static String m11726a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m11727a(WindVaneWebView windVaneWebView, String str, String str2) {
        C1469j.m5701a();
        C1469j.m5703a((WebView) windVaneWebView, str, Base64.encodeToString(str2.getBytes(), 2));
    }

    /* JADX INFO: renamed from: a */
    public static void m11728a(Object obj, String str) {
        C1469j.m5701a().mo5675b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    /* JADX INFO: renamed from: b */
    private void m11729b(Object obj) {
        C1469j.m5701a().mo5675b(obj, m11726a(this.f14276b));
    }

    /* JADX INFO: renamed from: b */
    private static void m11730b(Object obj, String str) {
        C1469j.m5701a().mo5673a(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    /* JADX INFO: renamed from: b */
    private boolean m11731b(int i) {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        try {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                if (i2 >= 18) {
                    this.f14277m.setRequestedOrientation(11);
                } else {
                    this.f14277m.setRequestedOrientation(0);
                }
            } else if (i2 >= 18) {
                this.f14277m.setRequestedOrientation(12);
            } else {
                this.f14277m.setRequestedOrientation(1);
            }
            z = true;
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return z;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11732a(C2340d c2340d, C1781c c1781c) {
        C1781c.c cVarM8805M;
        if (m11736c(c1781c) == 1) {
            return;
        }
        boolean zM11731b = false;
        if (c1781c != null && (cVarM8805M = c1781c.m8805M()) != null) {
            zM11731b = m11731b(cVarM8805M.m8955c());
        }
        if (zM11731b || c2340d == null) {
            return;
        }
        m11731b(this.f14280p.m12083b());
    }

    /* JADX INFO: renamed from: a */
    public final void m11733a(Object obj) {
        C1469j.m5701a().mo5673a(obj, m11726a(this.f14275a));
    }

    /* JADX INFO: renamed from: a */
    public void mo10946a(String str) {
        Activity activity = this.f14277m;
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: b */
    public final C2202j m11734b(C1781c c1781c) {
        if (c1781c == null) {
            return null;
        }
        C2314a.a aVarM11739a = C2314a.m11739a(this.f14285u ? C1801a.f11010aU : 94, c1781c);
        if (aVarM11739a != null && aVarM11739a.m11763c()) {
            WindVaneWebView windVaneWebViewM11758a = aVarM11739a.m11758a();
            if (windVaneWebViewM11758a.getObject() instanceof C2202j) {
                return (C2202j) windVaneWebViewM11758a.getObject();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final String m11735b() {
        C2340d c2340d;
        return (!TextUtils.isEmpty(this.f14279o) || (c2340d = this.f14280p) == null || TextUtils.isEmpty(c2340d.m12070O())) ? this.f14279o : this.f14280p.m12070O();
    }

    /* JADX INFO: renamed from: c */
    public final int m11736c(C1781c c1781c) {
        C2202j c2202jM11734b = m11734b(c1781c);
        if (c2202jM11734b != null) {
            return c2202jM11734b.mo11564d();
        }
        return 0;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2192a getActivityProxy() {
        return this.f14274A.getActivityProxy();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2312i getIJSRewardVideoV1() {
        return this.f14274A.getIJSRewardVideoV1();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2208b getJSBTModule() {
        return this.f14274A.getJSBTModule();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2209c getJSCommon() {
        return this.f14274A.getJSCommon();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2306e getJSContainerModule() {
        return this.f14274A.getJSContainerModule();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2310g getJSNotifyProxy() {
        return this.f14274A.getJSNotifyProxy();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2313j getJSVideoModule() {
        return this.f14274A.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.f14279o;
    }

    public String getUnitId() {
        return this.f14278n;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().mo11571g()) {
            getActivityProxy().mo11541a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().mo11571g()) {
            getActivityProxy().mo11543c();
        }
    }

    public void onPause() {
        if (getJSCommon().mo11571g()) {
            getActivityProxy().mo11539a();
        }
        getActivityProxy().mo11540a(1);
    }

    public void onRestart() {
        if (getJSCommon().mo11571g()) {
            getActivityProxy();
        }
        getActivityProxy().mo11540a(4);
    }

    public void onResume() {
        if (C1800b.f10958c) {
            return;
        }
        if (getJSCommon().mo11571g()) {
            getActivityProxy().mo11542b();
        }
        getActivityProxy().mo11540a(0);
    }

    public void onStart() {
        if (getJSCommon().mo11571g()) {
            getActivityProxy();
        }
        getActivityProxy().mo11540a(2);
    }

    public void onStop() {
        if (getJSCommon().mo11571g()) {
            getActivityProxy();
        }
        getActivityProxy().mo11540a(3);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f14274A = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.f14277m = activity;
    }

    public void setBidCampaign(boolean z) {
        this.f14286v = z;
    }

    public void setBigOffer(boolean z) {
        this.f14290z = z;
    }

    public void setIV(boolean z) {
        this.f14285u = z;
    }

    public void setIVRewardEnable(int i, int i2, int i3) {
        this.f14287w = i;
        this.f14288x = i2;
        this.f14289y = i3;
    }

    public void setMute(int i) {
        this.f14284t = i;
    }

    public void setPlacementId(String str) {
        this.f14279o = str;
    }

    public void setReward(C2333c c2333c) {
        this.f14282r = c2333c;
    }

    public void setRewardId(String str) {
        this.f14283s = str;
    }

    public void setRewardUnitSetting(C2340d c2340d) {
        this.f14280p = c2340d;
    }

    public void setUnitId(String str) {
        this.f14278n = str;
    }

    public void setUserId(String str) {
        this.f14281q = str;
    }
}
