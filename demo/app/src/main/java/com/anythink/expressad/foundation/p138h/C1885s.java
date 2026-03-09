package com.anythink.expressad.foundation.p138h;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p123c.C1814d;
import com.anythink.expressad.foundation.p120g.p123c.EnumC1811a;
import com.anythink.expressad.out.C1941p;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1885s extends C1872f {

    /* JADX INFO: renamed from: a */
    public static boolean f11609a = false;

    /* JADX INFO: renamed from: b */
    public static char[] f11610b = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};

    /* JADX INFO: renamed from: c */
    private static final String f11611c = "SDKUtil";

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.h.s$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final String f11612a = "com.android.vending";

        /* JADX INFO: renamed from: b */
        public static final String f11613b = "market";

        /* JADX INFO: renamed from: c */
        public static final String f11614c = "play.google.com";

        /* JADX INFO: renamed from: d */
        public static final String f11615d = "market.android.com";

        /* JADX INFO: renamed from: e */
        public static final String f11616e = "google.com";

        /* JADX INFO: renamed from: f */
        public static final String f11617f = "market://";

        /* JADX INFO: renamed from: g */
        public static final String f11618g = "details?id=";

        /* JADX INFO: renamed from: h */
        public static final String f11619h = "market://details?id=com.package.name";

        /* JADX INFO: renamed from: a */
        private static Intent m9810a() {
            return new Intent("android.intent.action.VIEW", Uri.parse(f11619h));
        }

        /* JADX INFO: renamed from: a */
        private static List<ResolveInfo> m9811a(Context context) {
            try {
                return context.getPackageManager().queryIntentActivities(m9810a(), 0);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public static boolean m9812a(Context context, String str, C1941p.c cVar) {
            try {
                if (!m9815b(str)) {
                    str = m9816c(str) ? "market://".concat(String.valueOf(str.substring(str.indexOf(f11618g)))) : null;
                }
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                Intent intentM9810a = m9810a();
                intentM9810a.setData(Uri.parse(str));
                intentM9810a.addFlags(268435456);
                context.startActivity(intentM9810a);
                C1885s.m9807a(cVar);
                return true;
            } catch (Throwable th) {
                Log.getStackTraceString(th);
                return false;
            }
        }

        /* JADX INFO: renamed from: a */
        public static boolean m9813a(String str) {
            return m9815b(str) || m9816c(str);
        }

        /* JADX INFO: renamed from: b */
        private static boolean m9814b(Context context) {
            List<ResolveInfo> listM9811a = m9811a(context);
            return listM9811a != null && listM9811a.size() > 0;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m9815b(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return Uri.parse(str).getScheme().equals("market");
            } catch (Throwable th) {
                Log.getStackTraceString(th);
                return false;
            }
        }

        /* JADX INFO: renamed from: c */
        private static boolean m9816c(String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    Uri uri = Uri.parse(str);
                    if (uri.getHost().equals("play.google.com")) {
                        return true;
                    }
                    return uri.getHost().equals("market.android.com");
                }
            } catch (Throwable th) {
                Log.getStackTraceString(th);
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        private static String m9817d(String str) {
            if (m9815b(str)) {
                return str;
            }
            if (m9816c(str)) {
                return "market://".concat(String.valueOf(str.substring(str.indexOf(f11618g))));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m9803a() {
        return C1814d.m9407b(EnumC1811a.AD_ANYTHINK_700);
    }

    /* JADX INFO: renamed from: a */
    public static String m9804a(String str) {
        String string;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File fileM9404a = C1814d.m9404a(EnumC1811a.ANYTHINK_700_IMG);
        if (TextUtils.isEmpty(str)) {
            string = "";
        } else if (str.lastIndexOf("/") == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.hashCode());
            string = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.hashCode() + str.substring(str.lastIndexOf("/") + 1).hashCode());
            string = sb2.toString();
        }
        return new File(fileM9404a, string).getAbsolutePath();
    }

    /* JADX INFO: renamed from: a */
    public static void m9805a(Context context, String str, C1781c c1781c, C1941p.c cVar) {
        if (context == null) {
            return;
        }
        if (f11609a) {
            m9806a(context, str, cVar);
            return;
        }
        try {
            Class.forName("com.anythink.expressad.activity.ATCommonActivity");
            Intent intent = new Intent(context, Class.forName("com.anythink.expressad.activity.ATCommonActivity"));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (a.m9815b(str)) {
                str = "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", "")));
            }
            intent.putExtra(C1781c.f10246am, str);
            intent.setFlags(268435456);
            intent.putExtra("mvcommon", c1781c);
            context.startActivity(intent);
        } catch (Exception unused) {
            m9806a(context, str, cVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9806a(Context context, String str, C1941p.c cVar) {
        if (str == null || context == null) {
            return;
        }
        try {
            if (a.m9815b(str)) {
                str = "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", "")));
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null) {
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
            }
            context.startActivity(intent);
            m9807a(cVar);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268468224);
                context.startActivity(intent2);
                m9807a(cVar);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9807a(C1941p.c cVar) {
        if (cVar instanceof C1941p.e) {
            ((C1941p.e) cVar).mo10057c();
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m9808b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.lastIndexOf("/") == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.hashCode());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.hashCode() + str.substring(str.lastIndexOf("/") + 1).hashCode());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    private static void m9809b(Context context, String str, C1941p.c cVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            boolean z = listQueryIntentActivities.size() > 0;
            if (!str.startsWith("market://")) {
                if (str.startsWith("https://play.google.com/")) {
                    m9809b(context, "market://details?id=".concat(String.valueOf(str.replace("https://play.google.com/store/apps/details?id=", ""))), cVar);
                }
            } else {
                if (!z) {
                    m9806a(context, "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", ""))), cVar);
                    return;
                }
                Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                            intent.setClassName("com.android.vending", "com.android.vending.AssetBrowserActivity");
                            break;
                        }
                    }
                }
                try {
                    context.startActivity(intent);
                    m9807a(cVar);
                } catch (Exception unused) {
                    m9806a(context, "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", ""))), cVar);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
