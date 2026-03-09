package com.anythink.expressad.foundation.p138h;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URL;
import java.util.Set;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1890x {
    /* JADX INFO: renamed from: a */
    public static String m9869a(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : new URL(str).getPath();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m9870a(String str, String str2) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : Uri.parse(str).getQueryParameter(str2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m9871b(String str) {
        try {
            if (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) {
                return 0;
            }
            return Uri.parse(str).getQueryParameterNames().size();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m9872c(String str) {
        try {
            if (TextUtils.isEmpty(str) || str.contains("n_logo=0")) {
                return str;
            }
            Set<String> queryParameterNames = Uri.parse(str).getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.size() != 0) {
                return str + "&n_logo=0";
            }
            return str + "?n_logo=0";
        } catch (Exception unused) {
            return str;
        }
    }
}
