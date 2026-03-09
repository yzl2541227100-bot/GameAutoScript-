package com.anythink.expressad.atsignalcommon.mraid;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.windvane.C1460a;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1876j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MraidUriUtil {

    /* JADX INFO: renamed from: a */
    private static volatile ConcurrentHashMap<String, String> f6723a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    private static ArrayList<String> f6724b = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    private static Set<String> m5665a(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int iIndexOf = encodedQuery.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = encodedQuery.length();
            }
            int iIndexOf2 = encodedQuery.indexOf(61, i);
            if (iIndexOf2 > iIndexOf || iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, iIndexOf2)));
            i = iIndexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: renamed from: a */
    private static void m5666a() {
        for (Method method : IMraidSignalCommunication.class.getDeclaredMethods()) {
            f6724b.add(method.getName());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5667a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!f6723a.containsKey(str)) {
            f6723a.put(str, str2);
            return;
        }
        String strConcat = f6723a.get(str);
        if (TextUtils.isEmpty(str2) || strConcat.contains(str2)) {
            return;
        }
        if (strConcat.length() > 0) {
            strConcat = strConcat.concat(",");
        }
        f6723a.put(str, strConcat.concat(str2));
    }

    public static void clearUnSupportMraidMethodMap() {
        if (f6723a.size() > 0) {
            f6723a.clear();
        }
    }

    public static void clearUnSupportMraidMethodMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f6723a.remove(str);
    }

    public static C1460a getMraidMethodContext(WindVaneWebView windVaneWebView, String str) {
        Set<String> setUnmodifiableSet;
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains(C1781c.f10338m)) {
            return null;
        }
        C1460a c1460a = new C1460a();
        c1460a.f6760d = C1876j.m9688b("n+ztLkxpVTzBLkxgHN==");
        c1460a.f6761e = uri.getHost();
        int i = 0;
        if (f6724b.size() == 0) {
            for (Method method : IMraidSignalCommunication.class.getDeclaredMethods()) {
                f6724b.add(method.getName());
            }
        }
        if (!f6724b.contains(c1460a.f6761e) && windVaneWebView != null) {
            String campaignId = windVaneWebView.getCampaignId();
            String strConcat = c1460a.f6761e;
            if (!TextUtils.isEmpty(campaignId)) {
                if (f6723a.containsKey(campaignId)) {
                    String strConcat2 = f6723a.get(campaignId);
                    if (!TextUtils.isEmpty(strConcat) && !strConcat2.contains(strConcat)) {
                        if (strConcat2.length() > 0) {
                            strConcat2 = strConcat2.concat(",");
                        }
                        strConcat = strConcat2.concat(strConcat);
                        f6723a.put(campaignId, strConcat);
                    }
                } else {
                    f6723a.put(campaignId, strConcat);
                }
            }
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(windVaneWebView, c1460a.f6761e);
            CallMraidJS.getInstance().fireErrorEvent(windVaneWebView, c1460a.f6761e, "Specified command is not implemented");
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            setUnmodifiableSet = Collections.emptySet();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            do {
                int iIndexOf = encodedQuery.indexOf(38, i);
                if (iIndexOf == -1) {
                    iIndexOf = encodedQuery.length();
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i);
                if (iIndexOf2 > iIndexOf || iIndexOf2 == -1) {
                    iIndexOf2 = iIndexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i, iIndexOf2)));
                i = iIndexOf + 1;
            } while (i < encodedQuery.length());
            setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : setUnmodifiableSet) {
                jSONObject.put(str2, uri.getQueryParameter(str2));
            }
            c1460a.f6762f = jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c1460a;
    }

    public static String getUnSupportMraidMethodString(String str) {
        if (f6723a.containsKey(str)) {
            return f6723a.get(str);
        }
        return null;
    }
}
