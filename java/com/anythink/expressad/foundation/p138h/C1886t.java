package com.anythink.expressad.foundation.p138h;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.p086d.C1483a;
import com.anythink.expressad.p086d.C1486b;
import com.umeng.analytics.pro.C3387i;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.p284io.FilenameUtils;
import org.json.JSONArray;
import p285z2.C3902g6;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1886t extends C1873g {

    /* JADX INFO: renamed from: a */
    public static final String f11620a = "SameTools";

    /* JADX INFO: renamed from: b */
    public static List<String> f11621b;

    /* JADX INFO: renamed from: c */
    private static char[] f11622c = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};

    /* JADX INFO: renamed from: d */
    private static char[] f11623d = {FilenameUtils.EXTENSION_SEPARATOR, 'X'};

    /* JADX INFO: renamed from: e */
    private static int f11624e = 0;

    /* JADX INFO: renamed from: f */
    private static int f11625f = 1;

    /* JADX INFO: renamed from: g */
    private static int f11626g = 2;

    /* JADX INFO: renamed from: h */
    private static int f11627h = 3;

    /* JADX INFO: renamed from: i */
    private static int f11628i = 0;

    /* JADX INFO: renamed from: j */
    private static int f11629j = 7;

    /* JADX INFO: renamed from: k */
    private static int f11630k = 14;

    /* JADX INFO: renamed from: l */
    private static int f11631l = 19;

    /* JADX INFO: renamed from: m */
    private static int f11632m = 16;

    /* JADX INFO: renamed from: n */
    private static int f11633n = 26;

    /* JADX INFO: renamed from: o */
    private static int f11634o = 1;

    /* JADX INFO: renamed from: a */
    public static double m9818a(Double d) {
        try {
            String str = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US)).format(d);
            if (C1889w.m9868b(str)) {
                return Double.parseDouble(str);
            }
            return 0.0d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m9819a() {
        int i = f11634o;
        f11634o = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static int m9820a(int i) {
        if ((i > 100 && i < 199) || i == 2) {
            return 1;
        }
        if ((i <= 200 || i >= 299) && i != 4) {
            return (i <= 500 || i >= 599) ? -1 : 5;
        }
        return 2;
    }

    /* JADX INFO: renamed from: a */
    public static int m9821a(Context context, float f) {
        float f2 = 2.5f;
        if (context != null) {
            try {
                float f3 = context.getResources().getDisplayMetrics().density;
                if (f3 != 0.0f) {
                    f2 = f3;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (int) ((f / f2) + 0.5f);
    }

    /* JADX INFO: renamed from: a */
    public static int m9822a(Object obj) {
        if (obj == null) {
            return 0;
        }
        try {
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
            return 0;
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m9823a(Context context, String str, String str2) {
        StringBuilder sb;
        sb = new StringBuilder(str2);
        try {
            sb.append(m9824a(str2, context, str));
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static synchronized String m9824a(String str, Context context, String str2) {
        StringBuilder sb;
        try {
            Set<String> queryParameterNames = Uri.parse(str).getQueryParameterNames();
            sb = (queryParameterNames == null || queryParameterNames.size() <= 0) ? new StringBuilder("?rtins_type=") : new StringBuilder("&rtins_type=");
        } catch (Exception unused) {
            sb = new StringBuilder("&rtins_type=");
        }
        try {
            if (m9835b(str2, context) != null) {
                sb.append(1);
            } else {
                sb.append(2);
            }
        } catch (Exception unused2) {
            sb.append(0);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m9825a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (C1889w.m9868b(strOptString)) {
                    arrayList.add(strOptString);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9826a(View view) {
        if (view == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                view.setSystemUiVisibility(C3387i.a.f18539f);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m9827a(Context context, String str) {
        boolean z;
        z = false;
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (m9835b(str, context) != null) {
                        z = true;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9828a(C1781c c1781c) {
        if (c1781c != null) {
            try {
                return c1781c.m8806N() == 1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static <T extends String> boolean m9829a(T t) {
        return t == null || t.length() == 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9830a(String str, Context context) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m9831a(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    private static <T> boolean m9832a(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    /* JADX INFO: renamed from: b */
    public static double m9833b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0.0d;
            }
            return Double.parseDouble(str);
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m9834b(Context context, float f) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: b */
    private static Object m9835b(String str, Context context) {
        try {
            return Class.forName(String.valueOf(m9840b(f11624e))).getMethod(String.valueOf(m9840b(f11626g)), String.class, Integer.TYPE).invoke(Class.forName(String.valueOf(m9840b(f11625f))).getMethod(String.valueOf(m9840b(f11627h)), new Class[0]).invoke(context, new Object[0]), str, 8192);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9836b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9837b(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m9838b(List list) {
        return !(list == null || list.isEmpty());
    }

    /* JADX INFO: renamed from: b */
    private static <T> boolean m9839b(T[] tArr) {
        return !(tArr == null || tArr.length == 0);
    }

    /* JADX INFO: renamed from: b */
    private static final char[] m9840b(int i) {
        StringBuilder sb;
        String strValueOf;
        if (i == 0) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(C1885s.f11610b, f11629j)));
            sb.append(f11623d[f11628i]);
            sb.append(String.valueOf(Arrays.copyOfRange(C1885s.f11610b, f11629j, f11630k)));
            sb.append(f11623d[f11628i]);
            sb.append(String.valueOf(Arrays.copyOfRange(C1885s.f11610b, f11630k, f11632m)));
            sb.append(f11623d[f11628i]);
            strValueOf = String.valueOf(C1884r.f11600c);
        } else if (i == 1) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(C1885s.f11610b, f11629j)));
            sb.append(f11623d[f11628i]);
            sb.append(String.valueOf(Arrays.copyOfRange(C1885s.f11610b, f11629j, f11630k)));
            sb.append(f11623d[f11628i]);
            strValueOf = String.valueOf(Arrays.copyOfRange(C1885s.f11610b, f11631l, f11633n));
        } else if (i == 2) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(C1885s.f11610b, f11632m, f11631l)));
            strValueOf = String.valueOf(f11622c);
        } else {
            if (i != 3) {
                sb = null;
                return sb.toString().toCharArray();
            }
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(C1885s.f11610b, f11632m, f11631l)));
            strValueOf = String.valueOf(C1884r.f11600c);
        }
        sb.append(strValueOf);
        return sb.toString().toCharArray();
    }

    /* JADX INFO: renamed from: c */
    public static float m9841c(Context context) {
        if (context == null) {
            return 2.5f;
        }
        try {
            float f = context.getResources().getDisplayMetrics().density;
            if (f == 0.0f) {
                return 2.5f;
            }
            return f;
        } catch (Exception e) {
            e.printStackTrace();
            return 2.5f;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m9842c(String str) {
        try {
            return C1889w.m9868b(str) ? URLEncoder.encode(str, "utf-8") : "";
        } catch (Throwable th) {
            th.getMessage();
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m9843d(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m9844d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                return false;
            }
            String queryParameter = uri.getQueryParameter(C1404a.f6239z);
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals("1");
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m9845e(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return m9856k(context).heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m9846e(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L4d
            r0 = 1
            if (r4 == 0) goto L45
            java.lang.String r2 = "dyview"
            java.lang.String r2 = r4.getQueryParameter(r2)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L4d
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L4d
            if (r3 == 0) goto L21
            java.lang.String r2 = "view"
            java.lang.String r2 = r4.getQueryParameter(r2)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L4d
        L21:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L4d
            if (r3 != 0) goto L32
            r3 = -1
            int r3 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L4d
        L2c:
            int r3 = r3 % 2
            if (r3 != 0) goto L32
            r2 = 1
            goto L33
        L32:
            r2 = 0
        L33:
            java.lang.String r3 = "natmp"
            java.lang.String r4 = r4.getQueryParameter(r3)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L4c
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L4c
            if (r4 != 0) goto L41
            r1 = 1
            goto L45
        L41:
            r1 = r2
            goto L45
        L43:
            r4 = move-exception
            goto L48
        L45:
            return r1
        L46:
            r4 = move-exception
            r2 = 0
        L48:
            r4.getMessage()     // Catch: java.lang.Throwable -> L4c
            return r1
        L4c:
            r1 = r2
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p138h.C1886t.m9846e(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: f */
    public static int m9847f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return m9856k(context).widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m9848f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                return false;
            }
            String queryParameter = uri.getQueryParameter(C1404a.f6208Z);
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals("0");
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m9849g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m9850g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                return -1;
            }
            String queryParameter = uri.getQueryParameter(C1404a.f6185C);
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = uri.getQueryParameter(C1404a.f6184B);
            }
            if (TextUtils.isEmpty(queryParameter)) {
                return -1;
            }
            try {
                return Integer.parseInt(queryParameter);
            } catch (Exception unused) {
                return -1;
            }
        } catch (Exception e) {
            e.getMessage();
            return -1;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m9851h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    private static <T extends String> boolean m9852h(T t) {
        return t != null && t.length() > 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m9853i(Context context) {
        if (context != null) {
            return 0;
        }
        try {
            if (context.getResources().getIdentifier("config_showNavigationBar", "bool", C3902g6.OooO0O0) != 0) {
                return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", C3902g6.OooO0O0));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m9854i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                Uri uri = Uri.parse(str);
                if (uri != null) {
                    return !TextUtils.isEmpty(uri.getQueryParameter(C1404a.f6185C));
                }
                return false;
            } catch (Exception e) {
                e.getMessage();
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static int m9855j(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            PackageInfo currentWebViewPackage = Build.VERSION.SDK_INT >= 26 ? WebView.getCurrentWebViewPackage() : context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            C1486b.m6002a();
            C1773a.m8548c().m8558f();
            C1483a c1483aM6007b = C1486b.m6007b();
            if (c1483aM6007b == null) {
                C1486b.m6002a();
                c1483aM6007b = C1486b.m6010c();
            }
            if (currentWebViewPackage == null || TextUtils.isEmpty(currentWebViewPackage.versionName) || !currentWebViewPackage.versionName.equals("77.0.3865.92")) {
                return c1483aM6007b.m5942P();
            }
            return 5;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: k */
    private static DisplayMetrics m9856k(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealMetrics(displayMetrics);
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            return displayMetrics;
        } catch (Throwable th) {
            th.printStackTrace();
            return context.getResources().getDisplayMetrics();
        }
    }
}
