package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.commonsdk.proguard.C3454e;
import com.umeng.commonsdk.proguard.C3471v;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.utils.UMUtils;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.internal.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3514a {

    /* JADX INFO: renamed from: a */
    private static Context f19274a;

    /* JADX INFO: renamed from: b */
    private String f19275b;

    /* JADX INFO: renamed from: c */
    private String f19276c;

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.internal.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C3514a f19277a = new C3514a();

        private a() {
        }
    }

    private C3514a() {
        this.f19275b = null;
        this.f19276c = null;
    }

    /* JADX INFO: renamed from: a */
    public static C3514a m16423a(Context context) {
        if (f19274a == null && context != null) {
            f19274a = context.getApplicationContext();
        }
        return a.f19277a;
    }

    /* JADX INFO: renamed from: c */
    private void m16424c(String str) {
        try {
            this.f19275b = str.replaceAll("&=", C4196o4.OooO00o.OooO0Oo).replaceAll("&&", C4196o4.OooO00o.OooO0Oo).replaceAll("==", "/") + "/Android/" + Build.DISPLAY + "/" + Build.MODEL + "/" + Build.VERSION.RELEASE + C4196o4.OooO00o.OooO0Oo + HelperUtils.getUmengMD5(UMUtils.getAppkey(f19274a));
        } catch (Throwable th) {
            C3454e.m15904a(f19274a, th);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m16425d(String str) {
        try {
            String str2 = str.split("&&")[0];
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String[] strArrSplit = str2.split("&=");
            StringBuilder sb = new StringBuilder();
            sb.append(C3471v.f18964ar);
            for (String str3 : strArrSplit) {
                if (!TextUtils.isEmpty(str3)) {
                    String strSubstring = str3.substring(0, 2);
                    if (strSubstring.endsWith("=")) {
                        strSubstring = strSubstring.replace("=", "");
                    }
                    sb.append(strSubstring);
                }
            }
            this.f19276c = sb.toString();
        } catch (Throwable th) {
            C3454e.m15904a(f19274a, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m16426a() {
        return this.f19276c;
    }

    /* JADX INFO: renamed from: a */
    public boolean m16427a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("a");
    }

    /* JADX INFO: renamed from: b */
    public String m16428b() {
        return this.f19275b;
    }

    /* JADX INFO: renamed from: b */
    public void m16429b(String str) {
        String strSubstring = str.substring(0, str.indexOf(95));
        m16425d(strSubstring);
        m16424c(strSubstring);
    }
}
