package com.anythink.interstitial.api;

import android.app.Activity;
import android.content.Context;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.interstitial.p183a.C2350c;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ATInterstitialAutoAd {
    public static void addPlacementId(String... strArr) {
        C2350c.m12160a().m12172a(strArr);
    }

    public static ATAdStatusInfo checkAdStatus(String str) {
        return C2350c.m12160a().m12174c(str);
    }

    public static List<ATAdInfo> checkValidAdCaches(String str) {
        C2350c.m12160a();
        return C2350c.m12167d(str);
    }

    public static void entryAdScenario(String str, String str2) {
        C2350c.m12160a();
        C2350c.m12163a(str, str2, (Map<String, Object>) null);
    }

    public static void entryAdScenario(String str, String str2, Map<String, Object> map) {
        C2350c.m12160a();
        C2350c.m12163a(str, str2, map);
    }

    public static void init(Context context, String[] strArr, ATInterstitialAutoLoadListener aTInterstitialAutoLoadListener) {
        C2350c.m12160a().m12171a(context, strArr, aTInterstitialAutoLoadListener);
    }

    public static boolean isAdReady(String str) {
        return C2350c.m12160a().m12173b(str);
    }

    public static void removePlacementId(String... strArr) {
        C2350c.m12160a();
        C2350c.m12166b(strArr);
    }

    public static void setLocalExtra(String str, Map<String, Object> map) {
        C2350c.m12160a();
        C2350c.m12164a(str, map);
    }

    public static void show(Activity activity, String str, ATInterstitialAutoEventListener aTInterstitialAutoEventListener) {
        C2350c.m12160a().m12170a(activity, str, "", aTInterstitialAutoEventListener);
    }

    public static void show(Activity activity, String str, String str2, ATInterstitialAutoEventListener aTInterstitialAutoEventListener) {
        C2350c.m12160a().m12170a(activity, str, str2, aTInterstitialAutoEventListener);
    }
}
