package com.anythink.splashad.p187a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATMediationRequestInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.C1294j;
import com.anythink.core.common.C1317n;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1235ba;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1257v;
import com.anythink.core.common.p065n.C1320c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1346j;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.core.common.p069p.C1362a;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.splashad.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2420f {

    /* JADX INFO: renamed from: a */
    public boolean f15039a;

    /* JADX INFO: renamed from: b */
    public C1317n f15040b;

    /* JADX INFO: renamed from: c */
    public long f15041c;

    /* JADX INFO: renamed from: d */
    public C1234b f15042d;

    /* JADX INFO: renamed from: e */
    public String f15043e;

    /* JADX INFO: renamed from: f */
    public String f15044f;

    /* JADX INFO: renamed from: g */
    public String f15045g;

    /* JADX INFO: renamed from: h */
    public int f15046h;

    /* JADX INFO: renamed from: i */
    public String f15047i;

    /* JADX INFO: renamed from: j */
    public String f15048j;

    /* JADX INFO: renamed from: k */
    public int f15049k = -1;

    /* JADX INFO: renamed from: l */
    public Map<String, Object> f15050l;

    /* JADX INFO: renamed from: m */
    public C1257v f15051m;

    /* JADX INFO: renamed from: n */
    private Context f15052n;

    /* JADX INFO: renamed from: o */
    private boolean f15053o;

    /* JADX INFO: renamed from: com.anythink.splashad.a.f$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CustomSplashAdapter f15054a;

        public AnonymousClass1(CustomSplashAdapter customSplashAdapter) {
            this.f15054a = customSplashAdapter;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CustomSplashAdapter customSplashAdapter = this.f15054a;
            if (customSplashAdapter != null) {
                customSplashAdapter.internalDestory();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.splashad.a.f$a */
    public class a implements ATCustomLoadListener {

        /* JADX INFO: renamed from: a */
        public CustomSplashAdapter f15056a;

        public a(CustomSplashAdapter customSplashAdapter) {
            this.f15056a = customSplashAdapter;
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdCacheLoaded(BaseAd... baseAdArr) {
            C2420f.this.m12477a(this.f15056a, baseAdArr);
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdDataLoaded() {
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdLoadError(String str, String str2) {
            C2420f.this.m12476a(this.f15056a, ErrorCode.getErrorCode(ErrorCode.noADError, str, str2), this.f15056a.getTrackingInfo());
        }
    }

    public C2420f(Context context) {
        this.f15052n = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    private void m12472a(ATMediationRequestInfo aTMediationRequestInfo) {
        this.f15045g = aTMediationRequestInfo.getAdSourceId();
        this.f15046h = aTMediationRequestInfo.getNetworkFirmId();
        this.f15047i = aTMediationRequestInfo.getClassName();
        Map<String, Object> requestParamMap = aTMediationRequestInfo.getRequestParamMap();
        this.f15050l = requestParamMap;
        this.f15049k = 4;
        requestParamMap.put("ad_type", 4);
    }

    /* JADX INFO: renamed from: a */
    private void m12475a(CustomSplashAdapter customSplashAdapter, AdError adError) {
        if (customSplashAdapter != null) {
            C1175n.m2059a().m2135b(new AnonymousClass1(customSplashAdapter));
        }
        C1317n c1317n = this.f15040b;
        if (c1317n != null) {
            c1317n.m3815a(3, this.f15051m, (C1235ba) null, adError);
        }
        this.f15040b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m12476a(CustomSplashAdapter customSplashAdapter, AdError adError, C1243h c1243h) {
        if (this.f15039a) {
            return;
        }
        if (c1243h != null) {
            C1352p.m4208a(c1243h, C1169h.n.f3176b, C1169h.n.f3187m, adError.printStackTrace());
        }
        this.f15039a = true;
        this.f15053o = false;
        if (customSplashAdapter != null) {
            C1175n.m2059a().m2135b(new AnonymousClass1(customSplashAdapter));
        }
        C1317n c1317n = this.f15040b;
        if (c1317n != null) {
            c1317n.m3815a(3, this.f15051m, (C1235ba) null, adError);
        }
        this.f15040b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m12477a(CustomSplashAdapter customSplashAdapter, BaseAd... baseAdArr) {
        if (this.f15039a) {
            return;
        }
        if (customSplashAdapter != null) {
            customSplashAdapter.getTrackingInfo().m3086f(SystemClock.elapsedRealtime() - this.f15041c);
            customSplashAdapter.getTrackingInfo().m3091g(customSplashAdapter.getInternalNetworkPlacementId());
            C1352p.m4208a(customSplashAdapter.getTrackingInfo(), C1169h.n.f3176b, C1169h.n.f3186l, "");
            C1320c.m3839a(this.f15052n).m3851a(12, customSplashAdapter.getTrackingInfo());
            C1320c.m3839a(this.f15052n).m3851a(2, customSplashAdapter.getTrackingInfo());
            C1234b c1234b = new C1234b();
            c1234b.m2896a(customSplashAdapter);
            c1234b.m2903c(System.currentTimeMillis());
            c1234b.m2901b(600000L);
            c1234b.m2895a(600000L);
            if (baseAdArr != null && baseAdArr.length > 0) {
                baseAdArr[0].setTrackingInfo(customSplashAdapter.getTrackingInfo().m3045V());
                c1234b.m2897a(baseAdArr[0]);
            }
            this.f15042d = c1234b;
        }
        this.f15039a = true;
        this.f15053o = false;
        C1317n c1317n = this.f15040b;
        if (c1317n != null) {
            c1317n.m3814a(3, this.f15051m, (C1235ba) null, -1);
        }
        this.f15040b = null;
    }

    /* JADX INFO: renamed from: a */
    private void m12478a(String str) {
        this.f15045g = "0";
        this.f15050l = new HashMap(1);
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f15045g = jSONObject.optString("unit_id");
            this.f15046h = jSONObject.optInt("nw_firm_id");
            this.f15047i = jSONObject.optString(C1294j.f4837B);
            this.f15048j = jSONObject.optString("content");
            this.f15049k = jSONObject.optInt("ad_type", -1);
            Map<String, Object> mapM4171c = C1345i.m4171c(this.f15048j);
            this.f15050l = mapM4171c;
            mapM4171c.put("ad_type", Integer.valueOf(this.f15049k));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m12479b() {
        C1317n c1317n = this.f15040b;
        if (c1317n != null) {
            c1317n.m3814a(3, this.f15051m, (C1235ba) null, -1);
        }
        this.f15040b = null;
    }

    /* JADX INFO: renamed from: c */
    private void m12480c() {
        this.f15040b = null;
    }

    /* JADX INFO: renamed from: d */
    private void m12481d() {
        this.f15042d = null;
    }

    /* JADX INFO: renamed from: e */
    private C1234b m12482e() {
        C1234b c1234b = this.f15042d;
        if (c1234b == null || c1234b.m2902c() > 0) {
            return null;
        }
        return this.f15042d;
    }

    /* JADX INFO: renamed from: f */
    private C1234b m12483f() {
        return this.f15042d;
    }

    /* JADX INFO: renamed from: a */
    public final void m12484a(Context context, String str, String str2, C1257v c1257v, C1317n c1317n) {
        Object obj;
        this.f15051m = c1257v;
        this.f15040b = c1317n;
        this.f15043e = str2;
        this.f15044f = str;
        if (TextUtils.isEmpty(c1257v.f4482c)) {
            ATMediationRequestInfo aTMediationRequestInfo = this.f15051m.f4481b;
            if (aTMediationRequestInfo != null) {
                this.f15045g = aTMediationRequestInfo.getAdSourceId();
                this.f15046h = aTMediationRequestInfo.getNetworkFirmId();
                this.f15047i = aTMediationRequestInfo.getClassName();
                Map<String, Object> requestParamMap = aTMediationRequestInfo.getRequestParamMap();
                this.f15050l = requestParamMap;
                this.f15049k = 4;
                requestParamMap.put("ad_type", 4);
            }
        } else {
            String str3 = this.f15051m.f4482c;
            this.f15045g = "0";
            this.f15050l = new HashMap(1);
            try {
                JSONObject jSONObject = new JSONObject(str3);
                this.f15045g = jSONObject.optString("unit_id");
                this.f15046h = jSONObject.optInt("nw_firm_id");
                this.f15047i = jSONObject.optString(C1294j.f4837B);
                this.f15048j = jSONObject.optString("content");
                this.f15049k = jSONObject.optInt("ad_type", -1);
                Map<String, Object> mapM4171c = C1345i.m4171c(this.f15048j);
                this.f15050l = mapM4171c;
                mapM4171c.put("ad_type", Integer.valueOf(this.f15049k));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        C1175n.m2059a();
        C1175n.m2087o(this.f15045g);
        C1243h c1243h = new C1243h();
        c1243h.m2685w(str);
        c1243h.m2686x(str2);
        c1243h.m3140y(this.f15046h);
        c1243h.m2687y("4");
        c1243h.m3108l(TextUtils.isEmpty(this.f15045g) ? "0" : this.f15045g);
        c1243h.m2684v("0");
        c1243h.m2661J(2);
        c1243h.m3064b(true);
        if (!TextUtils.isEmpty(this.f15048j)) {
            c1243h.m3114n(this.f15048j);
        }
        if (!TextUtils.isEmpty(this.f15051m.f4482c)) {
            c1243h.m3080e(8);
        }
        c1243h.m3017A(this.f15049k);
        try {
            ATBaseAdAdapter aTBaseAdAdapterM4176a = C1346j.m4176a(this.f15047i);
            if (!(aTBaseAdAdapterM4176a instanceof CustomSplashAdapter)) {
                throw new Exception("The class isn't instanceof CustomSplashAdapter");
            }
            ((CustomSplashAdapter) aTBaseAdAdapterM4176a).setFetchAdTimeout(this.f15051m.f4487h);
            this.f15053o = true;
            this.f15039a = false;
            this.f15041c = SystemClock.elapsedRealtime();
            try {
                c1243h.m2683u(aTBaseAdAdapterM4176a.getInternalNetworkName());
                c1243h.f4217u = aTBaseAdAdapterM4176a.getInternalNetworkSDKVersion();
                c1243h.f4213q = 2;
            } catch (Throwable unused) {
            }
            aTBaseAdAdapterM4176a.setTrackingInfo(c1243h);
            C1352p.m4208a(c1243h, C1169h.n.f3175a, C1169h.n.f3188n, "");
            C1320c.m3839a(this.f15052n).m3851a(10, c1243h);
            C1320c.m3839a(this.f15052n).m3851a(1, c1243h);
            Map<String, Object> mapM4570b = C1387u.m4556a().m4570b(str);
            if (this.f15046h == 2 && (obj = mapM4570b.get("admob_content_urls")) != null && (obj instanceof List)) {
                C1322e.m3903a(this.f15044f, c1243h, "admob_content_urls", obj);
            }
            aTBaseAdAdapterM4176a.internalLoad(context, this.f15050l, mapM4570b, new C1362a(c1243h, this.f15045g, this.f15050l, new a((CustomSplashAdapter) aTBaseAdAdapterM4176a)));
        } catch (Throwable th2) {
            m12476a((CustomSplashAdapter) null, ErrorCode.getErrorCode(ErrorCode.adapterNotExistError, "", th2.getMessage()), c1243h);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12485a() {
        return this.f15053o;
    }
}
