package com.anythink.rewardvideo.api;

import android.app.Activity;
import android.content.Context;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.rewardvideo.p186a.C2408c;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ATRewardVideoAutoAd {
    public static void addPlacementId(String... strArr) {
        C2408c.m12436a().m12447a(strArr);
    }

    public static ATAdStatusInfo checkAdStatus(String str) {
        return C2408c.m12436a().m12449c(str);
    }

    public static List<ATAdInfo> checkValidAdCaches(String str) {
        return C2408c.m12436a().m12450d(str);
    }

    public static void entryAdScenario(String str, String str2) {
        C2408c.m12436a();
        C2408c.m12439a(str, str2, (Map<String, Object>) null);
    }

    public static void entryAdScenario(String str, String str2, Map<String, Object> map) {
        C2408c.m12436a();
        C2408c.m12439a(str, str2, map);
    }

    public static void init(Context context, String[] strArr, ATRewardVideoAutoLoadListener aTRewardVideoAutoLoadListener) {
        C2408c.m12436a().m12446a(context, strArr, aTRewardVideoAutoLoadListener);
    }

    public static boolean isAdReady(String str) {
        return C2408c.m12436a().m12448b(str);
    }

    public static void removePlacementId(String... strArr) {
        C2408c.m12436a();
        C2408c.m12442b(strArr);
    }

    public static void setLocalExtra(String str, Map<String, Object> map) {
        C2408c.m12436a();
        C2408c.m12440a(str, map);
    }

    public static void show(Activity activity, String str, ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener) {
        C2408c.m12436a().m12445a(activity, str, "", aTRewardVideoAutoEventListener);
    }

    public static void show(Activity activity, String str, String str2, ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener) {
        C2408c.m12436a().m12445a(activity, str, str2, aTRewardVideoAutoEventListener);
    }
}
