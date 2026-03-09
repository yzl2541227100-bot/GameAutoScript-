package com.anythink.expressad.foundation.p120g.p126f.p133g;

import android.text.TextUtils;
import com.anythink.expressad.foundation.p120g.p126f.p129c.C1831c;
import com.anythink.expressad.foundation.p120g.p126f.p134h.C1855b;
import com.anythink.expressad.foundation.p138h.C1889w;
import com.github.kevinsawicki.http.HttpRequest;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.g.d */
/* JADX INFO: loaded from: classes.dex */
public class C1851d {

    /* JADX INFO: renamed from: a */
    private static final String f11412a = "d";

    /* JADX INFO: renamed from: a */
    public static String m9571a(List<C1831c> list) {
        C1831c c1831cM9574b = m9574b(list, "Content-Type");
        if (c1831cM9574b != null) {
            String strM9518b = c1831cM9574b.m9518b();
            if (!TextUtils.isEmpty(strM9518b)) {
                String[] strArrSplit = strM9518b.split(";");
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=");
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals(HttpRequest.PARAM_CHARSET)) {
                        return strArrSplit2[1];
                    }
                }
            }
        }
        return "UTF-8";
    }

    /* JADX INFO: renamed from: a */
    public static String m9572a(List<C1831c> list, String str) {
        C1831c c1831cM9574b = m9574b(list, str);
        return c1831cM9574b != null ? c1831cM9574b.m9518b() : "";
    }

    /* JADX INFO: renamed from: a */
    private static void m9573a(C1855b c1855b, String str, String str2) {
        if (c1855b != null) {
            try {
                if (!C1889w.m9867a(str) && !C1889w.m9867a(str2)) {
                    c1855b.m9595a(str, str2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static C1831c m9574b(List<C1831c> list, String str) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                C1831c c1831c = list.get(i);
                if (c1831c != null && str.equals(c1831c.m9517a())) {
                    return c1831c;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9575b(List<C1831c> list) {
        return TextUtils.equals(m9572a(list, "Content-Encoding"), "gzip");
    }

    /* JADX INFO: renamed from: c */
    private static boolean m9576c(List<C1831c> list) {
        if (TextUtils.equals(m9572a(list, "Accept-Ranges"), "bytes")) {
            return true;
        }
        String strM9572a = m9572a(list, "Content-Range");
        return strM9572a != null && strM9572a.startsWith("bytes");
    }
}
