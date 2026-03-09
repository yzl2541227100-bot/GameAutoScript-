package com.octopus.p222ad.internal.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.util.Pair;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import cn.haorui.sdk.core.HRConfig;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.octopus.p222ad.AdActivity;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.internal.C3120m;
import com.octopus.p222ad.internal.p225a.C3074a;
import com.octopus.p222ad.internal.p225a.C3075b;
import com.octopus.p222ad.internal.utilities.DeviceInfo;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.UserEnvInfo;
import com.octopus.p222ad.internal.utilities.WebviewUtil;
import com.octopus.p222ad.internal.view.AdViewImpl;
import com.octopus.p222ad.p224b.C3071d;
import com.octopus.p222ad.p224b.C3072e;
import com.octopus.p222ad.utils.p229a.C3226b;
import com.octopus.p222ad.utils.p258b.C3256g;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.octopus.ad.internal.view.g */
/* JADX INFO: loaded from: classes2.dex */
public class C3199g {
    /* JADX INFO: renamed from: a */
    private static void m14804a(WebView webView, Uri uri) {
        String queryParameter = uri.getQueryParameter("cb");
        DeviceInfo deviceInfo = DeviceInfo.getInstance();
        C3071d.a aVarM14190a = new C3071d.a.C4703a().m14188a(deviceInfo.sdkUID).m14200k(DeviceInfo.density).m14201l(DeviceInfo.densityDpi).m14191b(C3226b.m14911a(C3120m.m14425a().f17185h)).m14202m(C3226b.m14917d(C3120m.m14425a().m14441g())).m14204o(C3256g.m14985a(C3120m.m14425a().f17185h)).m14205p(C3256g.m14986b(C3120m.m14425a().f17185h)).m14206q(deviceInfo.bootMark).m14207r(deviceInfo.updateMark).m14192c("").m14193d(deviceInfo.f17415os).m14187a(C3072e.e.PLATFORM_ANDROID).m14186a(deviceInfo.devType).m14194e(deviceInfo.brand).m14195f(deviceInfo.model).m14196g(deviceInfo.manufacturer).m14197h(deviceInfo.resolution).m14198i(deviceInfo.screenSize).m14199j(deviceInfo.language).m14203n(deviceInfo.root).m14208s(deviceInfo.agVercode).m14209t(deviceInfo.hmsVercode).m14189a(deviceInfo.wxInstalled).m14210u(DeviceInfo.physicalMemoryByte).m14211v(DeviceInfo.harddiskSizeByte).m14212w(deviceInfo.appList).m14190a();
        UserEnvInfo userEnvInfo = UserEnvInfo.getInstance();
        C3071d.c cVarM14221a = new C3071d.c.a().m14220a(userEnvInfo.f19842net).m14219a(userEnvInfo.isp).m14221a();
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "GetDeviceID"));
        linkedList.add(new Pair("deviceInfo", Base64.encodeToString(aVarM14190a.m14185b(), 0)));
        linkedList.add(new Pair("userEnvInfo", Base64.encodeToString(cVarM14221a.m14218b(), 0)));
        m14805a(webView, queryParameter, linkedList);
    }

    /* JADX INFO: renamed from: a */
    private static void m14805a(WebView webView, String str, List<Pair<String, String>> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("cb=");
        if (str == null) {
            str = HRConfig.GENDER_UNKNOWN;
        }
        sb.append(str);
        if (list != null) {
            for (Pair<String, String> pair : list) {
                if (pair.first != null && pair.second != null) {
                    sb.append("&");
                    sb.append((String) pair.first);
                    sb.append("=");
                    sb.append(Uri.encode((String) pair.second));
                }
            }
        }
        String str2 = String.format("javascript:window.sdkjs.client.result(\"%s\")", sb.toString());
        if (Build.VERSION.SDK_INT >= 19) {
            webView.evaluateJavascript(str2, null);
        } else {
            webView.loadUrl(str2);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m14806a(AdWebView adWebView, Uri uri) {
        boolean z;
        String queryParameter = uri.getQueryParameter("cb");
        if (adWebView.loadAdAt(Integer.parseInt(uri.getQueryParameter("index")))) {
            AdViewImpl adViewImpl = adWebView.adViewImpl;
            if (adViewImpl instanceof InterstitialAdViewImpl) {
                ((C3075b) ((InterstitialAdViewImpl) adViewImpl).getAdImplementation()).m14234g();
            }
            z = true;
        } else {
            z = false;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "GotoPage"));
        linkedList.add(new Pair("success", String.valueOf(z)));
        m14805a(adWebView, queryParameter, linkedList);
    }

    /* JADX INFO: renamed from: a */
    public static void m14807a(AdWebView adWebView, String str) {
        String str2;
        String string;
        Uri uri = Uri.parse(str);
        String host = uri.getHost();
        if ("GotoPage".equals(host)) {
            m14806a(adWebView, uri);
            return;
        }
        if ("SendMsg".equals(host)) {
            m14809b(adWebView, uri);
            return;
        }
        if ("CallNo".equals(host)) {
            m14811c(adWebView, uri);
            return;
        }
        if ("ClosePage".equals(host)) {
            m14813d(adWebView, uri);
            return;
        }
        if (!"GetDeviceID".equals(host)) {
            if ("Download".equals(host)) {
                m14815e(adWebView, uri);
                return;
            }
            if ("PingClick".equals(host)) {
                m14816f(adWebView, uri);
                return;
            }
            if ("PingConvertion".equals(host)) {
                m14817g(adWebView, uri);
                return;
            }
            if ("GetCommonInfo".equals(host)) {
                m14804a((WebView) adWebView, uri);
                return;
            }
            if ("MayDeepLink".equals(host)) {
                m14808b((WebView) adWebView, uri);
                return;
            }
            if ("DeepLink".equals(host)) {
                if (adWebView.getUserInteraction()) {
                    m14810c((WebView) adWebView, uri);
                    return;
                }
            } else if ("ExternalBrowser".equals(host)) {
                if (adWebView.getUserInteraction()) {
                    m14812d((WebView) adWebView, uri);
                    return;
                }
            } else if ("InternalBrowser".equals(host)) {
                if (adWebView.getUserInteraction()) {
                    m14818h(adWebView, uri);
                    return;
                }
            } else {
                if ("RecordEvent".equals(host)) {
                    m14819i(adWebView, uri);
                    return;
                }
                if ("DispatchAppEvent".equals(host)) {
                    m14820j(adWebView, uri);
                    return;
                }
                if (!"GetDeviceID".equals(host)) {
                    str2 = HaoboLog.baseLogTag;
                    string = "OctopusSdk called with unsupported function: " + host;
                    HaoboLog.m14615w(str2, string);
                    return;
                }
            }
            str2 = HaoboLog.jsLogTag;
            string = HaoboLog.getString(C3063R.string.no_user_interaction, str);
            HaoboLog.m14615w(str2, string);
            return;
        }
        m14814e((WebView) adWebView, uri);
    }

    /* JADX INFO: renamed from: b */
    private static void m14808b(WebView webView, Uri uri) {
        String queryParameter = uri.getQueryParameter("cb");
        String queryParameter2 = uri.getQueryParameter(C1781c.f10246am);
        boolean z = false;
        if (webView.getContext() != null && webView.getContext().getPackageManager() != null && queryParameter2 != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(queryParameter2)));
            intent.setFlags(268435456);
            if (intent.resolveActivity(webView.getContext().getPackageManager()) != null) {
                z = true;
            }
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "MayDeepLink"));
        linkedList.add(new Pair("mayDeepLink", String.valueOf(z)));
        m14805a(webView, queryParameter, linkedList);
    }

    /* JADX INFO: renamed from: b */
    private static void m14809b(AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter("cb");
        uri.getQueryParameter("msg");
        uri.getQueryParameter("receiver");
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "SendMsg"));
        linkedList.add(new Pair("success", String.valueOf(false)));
        m14805a(adWebView, queryParameter, linkedList);
    }

    /* JADX INFO: renamed from: c */
    private static void m14810c(WebView webView, Uri uri) {
        String queryParameter = uri.getQueryParameter("cb");
        String queryParameter2 = uri.getQueryParameter(C1781c.f10246am);
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "DeepLink"));
        if (webView.getContext() == null || queryParameter2 == null) {
            m14805a(webView, queryParameter, linkedList);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(queryParameter2)));
            intent.setFlags(268435456);
            webView.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            m14805a(webView, queryParameter, linkedList);
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m14811c(AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter("cb");
        uri.getQueryParameter("receiver");
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "CallNo"));
        linkedList.add(new Pair("success", String.valueOf(false)));
        m14805a(adWebView, queryParameter, linkedList);
    }

    /* JADX INFO: renamed from: d */
    private static void m14812d(WebView webView, Uri uri) {
        String queryParameter = uri.getQueryParameter(C1781c.f10246am);
        if (webView.getContext() == null || queryParameter == null || !queryParameter.startsWith("http")) {
            return;
        }
        try {
            webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(queryParameter))));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(webView.getContext(), C3063R.string.action_cant_be_completed, 0).show();
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m14813d(final AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter("cb");
        adWebView.adViewImpl.getMyHandler().post(new Runnable() { // from class: com.octopus.ad.internal.view.g.1
            @Override // java.lang.Runnable
            public void run() {
                if (!adWebView.adViewImpl.mo14697e()) {
                    adWebView.m14747d();
                    return;
                }
                adWebView.adViewImpl.getAdDispatcher().mo14241b();
                Activity activity = (Activity) adWebView.getContextFromMutableContext();
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                activity.finish();
            }
        });
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "ClosePage"));
        linkedList.add(new Pair("success", String.valueOf(true)));
        m14805a(adWebView, queryParameter, linkedList);
    }

    /* JADX INFO: renamed from: e */
    private static void m14814e(WebView webView, Uri uri) {
        String queryParameter = uri.getQueryParameter("cb");
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "GetDeviceID"));
        linkedList.add(new Pair("idname", "imei"));
        m14805a(webView, queryParameter, linkedList);
    }

    /* JADX INFO: renamed from: e */
    private static void m14815e(AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter(C1781c.f10246am);
        String queryParameter2 = uri.getQueryParameter("cb");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(queryParameter)));
            if (adWebView != null) {
                adWebView.getContext().startActivity(intent);
            }
        } catch (Exception unused) {
            Toast.makeText(adWebView.getContext(), C3063R.string.action_cant_be_completed, 0).show();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "Download"));
        linkedList.add(new Pair("success", String.valueOf(true)));
        m14805a(adWebView, queryParameter2, linkedList);
    }

    /* JADX INFO: renamed from: f */
    private static void m14816f(AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter(C1781c.f10246am);
        String queryParameter2 = uri.getQueryParameter("cb");
        adWebView.adViewImpl.pingClick(queryParameter);
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "PingClick"));
        linkedList.add(new Pair("success", String.valueOf(true)));
        m14805a(adWebView, queryParameter2, linkedList);
    }

    /* JADX INFO: renamed from: g */
    private static void m14817g(AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter(C1781c.f10246am);
        String queryParameter2 = uri.getQueryParameter("cb");
        adWebView.adViewImpl.pingConvert(queryParameter);
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair("caller", "PingConvertion"));
        linkedList.add(new Pair("success", String.valueOf(true)));
        m14805a(adWebView, queryParameter2, linkedList);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: h */
    private static void m14818h(AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter(C1781c.f10246am);
        if (adWebView.getContext() == null || queryParameter == null || !queryParameter.startsWith("http")) {
            return;
        }
        String strDecode = Uri.decode(queryParameter);
        Class clsM13811a = AdActivity.m13811a();
        Intent intent = new Intent(adWebView.getContext(), (Class<?>) clsM13811a);
        intent.putExtra("ACTIVITY_TYPE", "BROWSER");
        WebView webView = new WebView(adWebView.getContext());
        WebviewUtil.setWebViewSettings(webView);
        C3074a.f17016a.add(webView);
        webView.loadUrl(strDecode);
        if (adWebView.adViewImpl.getBrowserStyle() != null) {
            String str = "" + webView.hashCode();
            intent.putExtra("bridgeid", str);
            AdViewImpl.C3174c.f17630a.add(new Pair<>(str, adWebView.adViewImpl.getBrowserStyle()));
        }
        try {
            adWebView.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(adWebView.getContext(), C3063R.string.action_cant_be_completed, 0).show();
            HaoboLog.m14615w(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.adactivity_missing, clsM13811a.getName()));
            C3074a.f17016a.remove();
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m14819i(AdWebView adWebView, Uri uri) {
        String queryParameter = uri.getQueryParameter(C1781c.f10246am);
        if (queryParameter == null || !queryParameter.startsWith("http")) {
            return;
        }
        WebView webView = new WebView(adWebView.getContext());
        webView.setWebViewClient(new WebViewClient() { // from class: com.octopus.ad.internal.view.g.2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
                HaoboLog.m14607d(HaoboLog.baseLogTag, "RecordEvent completed loading: " + str);
                CookieSyncManager cookieSyncManager = CookieSyncManager.getInstance();
                if (cookieSyncManager != null) {
                    cookieSyncManager.sync();
                }
            }
        });
        webView.loadUrl(queryParameter);
        webView.setVisibility(8);
        adWebView.addView(webView);
    }

    /* JADX INFO: renamed from: j */
    private static void m14820j(AdWebView adWebView, Uri uri) {
        adWebView.adViewImpl.getAdDispatcher().mo14240a(uri.getQueryParameter("event"), uri.getQueryParameter("data"));
    }
}
