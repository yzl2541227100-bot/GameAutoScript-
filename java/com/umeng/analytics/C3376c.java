package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3398t;

/* JADX INFO: renamed from: com.umeng.analytics.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3376c {

    /* JADX INFO: renamed from: a */
    private static String[] f18300a = new String[2];

    /* JADX INFO: renamed from: a */
    public static void m15436a(Context context, String str, String str2) {
        String[] strArr = f18300a;
        strArr[0] = str;
        strArr[1] = str2;
        if (context != null) {
            C3398t.m15624a(context).m15628a(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String[] m15437a(Context context) {
        String[] strArrM15629a;
        if (!TextUtils.isEmpty(f18300a[0]) && !TextUtils.isEmpty(f18300a[1])) {
            return f18300a;
        }
        if (context == null || (strArrM15629a = C3398t.m15624a(context).m15629a()) == null) {
            return null;
        }
        String[] strArr = f18300a;
        strArr[0] = strArrM15629a[0];
        strArr[1] = strArrM15629a[1];
        return strArr;
    }

    /* JADX INFO: renamed from: b */
    public static void m15438b(Context context) {
        String[] strArr = f18300a;
        strArr[0] = null;
        strArr[1] = null;
        if (context != null) {
            C3398t.m15624a(context).m15630b();
        }
    }
}
