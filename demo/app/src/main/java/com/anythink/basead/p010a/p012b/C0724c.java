package com.anythink.basead.p010a.p012b;

import android.text.TextUtils;
import com.anythink.basead.mraid.MraidWebView;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.p050a.C1160l;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1343g;
import com.anythink.core.common.res.C1380d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.basead.a.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0724c {

    /* JADX INFO: renamed from: a */
    public static final int f527a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f528b = -1;

    /* JADX INFO: renamed from: c */
    public static final int f529c = 100;

    /* JADX INFO: renamed from: d */
    private static Map<String, Integer> f530d = new HashMap();

    /* JADX INFO: renamed from: e */
    private static ConcurrentHashMap<String, MraidWebView> f531e = new ConcurrentHashMap<>(3);

    /* JADX INFO: renamed from: a */
    public static void m194a(String str, int i) {
        Integer num = f530d.get(str);
        if (num == null || num.intValue() < i) {
            f530d.put(str, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m195a(String str, MraidWebView mraidWebView) {
        f531e.put(str, mraidWebView);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m196a(AbstractC1247l abstractC1247l, int i, AbstractC1249n abstractC1249n) {
        if (!TextUtils.equals(String.valueOf(i), "1")) {
            if (TextUtils.equals(String.valueOf(i), "3") && abstractC1247l.m3168G() == 1 && !TextUtils.isEmpty(abstractC1247l.m3159B())) {
                return m198a(abstractC1247l, abstractC1249n);
            }
            return true;
        }
        if (!TextUtils.isEmpty(abstractC1247l.m3159B())) {
            return m198a(abstractC1247l, abstractC1249n);
        }
        if (abstractC1249n.m3309aj() != 1 && abstractC1249n.m3310ak() <= 0) {
            return false;
        }
        if (TextUtils.isEmpty(abstractC1247l.m3239y())) {
            return abstractC1247l.m3210k() && abstractC1249n.m3310ak() == 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m197a(AbstractC1247l abstractC1247l, C1248m c1248m) {
        if (abstractC1247l == null) {
            return false;
        }
        if (abstractC1247l.m3182V() == -1) {
            IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
            if (iExHandlerM2132b != null) {
                iExHandlerM2132b.fillDownloadStatus(C1175n.m2059a().m2148f(), abstractC1247l, c1248m);
            } else {
                abstractC1247l.m3212l(0);
            }
        }
        return m196a(abstractC1247l, c1248m.f4329j, c1248m.f4333n);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m198a(AbstractC1247l abstractC1247l, AbstractC1249n abstractC1249n) {
        int iM3289W = abstractC1249n.m3289W();
        String strM3159B = abstractC1247l.m3159B();
        if (TextUtils.isEmpty(strM3159B)) {
            return false;
        }
        if (iM3289W == 0) {
            return true;
        }
        boolean zM2004a = C1160l.m1996a().m2004a(strM3159B, iM3289W);
        if (zM2004a) {
            C0728g.m231a(abstractC1247l, abstractC1249n);
        }
        return zM2004a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m199a(C1248m c1248m, AbstractC1247l abstractC1247l) {
        if (c1248m == null || abstractC1247l == null) {
            return false;
        }
        return f531e.containsKey(m202b(c1248m, abstractC1247l));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m200a(String str) {
        Integer num = f530d.get(str);
        return num != null && num.intValue() == 0;
    }

    /* JADX INFO: renamed from: b */
    public static MraidWebView m201b(String str) {
        return f531e.remove(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m202b(C1248m c1248m, AbstractC1247l abstractC1247l) {
        return c1248m.f4323d + "_" + abstractC1247l.m3229t();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m203b(String str, int i) {
        return C1380d.m4520a(C1175n.m2059a().m2148f()).m4531b(i, C1343g.m4123a(str));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m204c(String str) {
        return m203b(str, 1);
    }
}
