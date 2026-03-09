package com.anythink.core.basead.p043a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1236bb;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.core.p072d.C1392b;

/* JADX INFO: renamed from: com.anythink.core.basead.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1116a {

    /* JADX INFO: renamed from: a */
    public static final String f2725a = "play.google.com";

    /* JADX INFO: renamed from: b */
    public static final String f2726b = "market.android.com";

    /* JADX INFO: renamed from: c */
    public static final String f2727c = "details?";

    /* JADX INFO: renamed from: d */
    public static final String f2728d = "market";

    /* JADX INFO: renamed from: e */
    public static final String f2729e = "market://";

    /* JADX INFO: renamed from: a */
    public static C1236bb m1727a(Context context, String str) {
        C1236bb c1236bb = new C1236bb();
        c1236bb.f4090n = !str.startsWith("http");
        c1236bb.f4091o = str;
        if (m1733d(str)) {
            c1236bb.f4091o = str;
            boolean zEquals = TextUtils.equals(C1392b.m4845a(context).m4865b(C1175n.m2059a().m2165o()).m4769n(), "1");
            if (m1730a(context, str, false, zEquals)) {
                c1236bb.f4089m = true;
                if (zEquals) {
                    c1236bb.f4088l = 3;
                } else {
                    c1236bb.f4088l = 4;
                }
            } else if (m1730a(context, str, false, false)) {
                c1236bb.f4089m = true;
                c1236bb.f4088l = 4;
            }
            return c1236bb;
        }
        if (!str.startsWith("http")) {
            c1236bb.f4091o = str;
            if (m1730a(context, str, false, false)) {
                c1236bb.f4089m = true;
                c1236bb.f4088l = 5;
            }
            return c1236bb;
        }
        if (m1731b(str)) {
            String strM1735f = m1735f(str);
            c1236bb.f4090n = true;
            c1236bb.f4091o = strM1735f;
            if (m1730a(context, strM1735f, false, true)) {
                c1236bb.f4089m = true;
                c1236bb.f4088l = 1;
            } else if (m1730a(context, strM1735f, false, false)) {
                c1236bb.f4089m = true;
                c1236bb.f4088l = 2;
            }
        }
        return c1236bb;
    }

    /* JADX INFO: renamed from: a */
    public static C1236bb m1728a(String str) {
        C1236bb c1236bb = new C1236bb();
        c1236bb.f4088l = 8;
        c1236bb.f4090n = false;
        c1236bb.f4089m = true;
        c1236bb.f4091o = str;
        try {
            if (Uri.parse(str).getScheme().equals("intent")) {
                Intent uri = Intent.parseUri(str, 1);
                uri.addCategory("android.intent.category.BROWSABLE");
                uri.setComponent(null);
                if (Build.VERSION.SDK_INT >= 15) {
                    uri.setSelector(null);
                }
                String stringExtra = uri.getStringExtra("browser_fallback_url");
                if (!TextUtils.isEmpty(stringExtra) && stringExtra.startsWith("http")) {
                    c1236bb.f4088l = 10;
                    c1236bb.f4091o = stringExtra;
                    return c1236bb;
                }
            }
        } catch (Throwable unused) {
        }
        if (m1733d(str)) {
            String strM1734e = m1734e(str);
            c1236bb.f4088l = 9;
            c1236bb.f4091o = strM1734e;
        }
        return c1236bb;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1729a(Context context, String str, boolean z) {
        if (m1731b(str)) {
            return m1730a(context, m1735f(str), z, true);
        }
        String scheme = Uri.parse(str).getScheme();
        if (scheme == null || scheme.startsWith("http")) {
            return false;
        }
        return m1730a(context, str, z, scheme.startsWith("market") && TextUtils.equals(C1392b.m4845a(context).m4865b(C1175n.m2059a().m2165o()).m4769n(), "1"));
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1730a(final Context context, String str, boolean z, boolean z3) {
        Intent intent;
        try {
            Uri uri = Uri.parse(str);
            if (uri.getScheme().equals("intent")) {
                intent = Intent.parseUri(str, 1);
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setComponent(null);
                if (Build.VERSION.SDK_INT >= 15) {
                    intent.setSelector(null);
                }
            } else {
                intent = new Intent("android.intent.action.VIEW", uri);
                intent.setData(uri);
            }
            if (z3 && TextUtils.isEmpty(intent.getPackage())) {
                intent.setPackage("com.android.vending");
            }
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            if (!z) {
                return false;
            }
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.core.basead.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    Toast.makeText(context, "Detect that the App Market is not installed and cannot be opened through the App Market.", 1).show();
                }
            });
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1731b(String str) {
        Uri uri;
        try {
            if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && uri.getHost() != null) {
                if (uri.getHost().equals("play.google.com")) {
                    return true;
                }
                return uri.getHost().equals("market.android.com");
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private static void m1732c(String str) {
        C1350n.m4204a(str);
    }

    /* JADX INFO: renamed from: d */
    private static boolean m1733d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return Uri.parse(str).getScheme().equals("market");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    private static String m1734e(String str) {
        try {
            return "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", "")));
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: f */
    private static String m1735f(String str) {
        try {
            return "market://".concat(String.valueOf(str.substring(str.indexOf(f2727c))));
        } catch (Throwable unused) {
            return null;
        }
    }
}
