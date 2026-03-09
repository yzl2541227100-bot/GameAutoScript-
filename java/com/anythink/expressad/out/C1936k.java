package com.anythink.expressad.out;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p138h.C1876j;
import com.anythink.expressad.p089e.InterfaceC1491b;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.expressad.out.k */
/* JADX INFO: loaded from: classes.dex */
public class C1936k implements InterfaceC1491b {

    /* JADX INFO: renamed from: a */
    public static final int f11946a = 6;

    /* JADX INFO: renamed from: b */
    public static final int f11947b = 7;

    /* JADX INFO: renamed from: c */
    public static final int f11948c = 8;

    /* JADX INFO: renamed from: d */
    private static String f11949d = "CustomInfoManager";

    /* JADX INFO: renamed from: e */
    private static volatile C1936k f11950e;

    /* JADX INFO: renamed from: f */
    private ConcurrentHashMap<String, String> f11951f = new ConcurrentHashMap<>();

    private C1936k() {
    }

    /* JADX INFO: renamed from: a */
    public static C1936k m10164a() {
        if (f11950e == null) {
            synchronized (C1936k.class) {
                if (f11950e == null) {
                    f11950e = new C1936k();
                }
            }
        }
        return f11950e;
    }

    /* JADX INFO: renamed from: a */
    private String m10165a(String str, int i) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        StringBuilder sb;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (i == 6) {
            concurrentHashMap = this.f11951f;
            sb = new StringBuilder();
            sb.append(str);
            str2 = "_bid";
        } else {
            if (i != 7) {
                if (i != 8) {
                    return "";
                }
                concurrentHashMap = this.f11951f;
                return concurrentHashMap.get(str);
            }
            concurrentHashMap = this.f11951f;
            sb = new StringBuilder();
            sb.append(str);
            str2 = "_bidload";
        }
        sb.append(str2);
        str = sb.toString();
        return concurrentHashMap.get(str);
    }

    /* JADX INFO: renamed from: a */
    private void m10166a(String str, int i, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        StringBuilder sb;
        String str3;
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        String strM9686a = C1876j.m9686a(str2);
        if (i == 6) {
            concurrentHashMap = this.f11951f;
            sb = new StringBuilder();
            sb.append(str);
            str3 = "_bid";
        } else if (i != 7) {
            if (i != 8) {
                return;
            }
            this.f11951f.put(str, strM9686a);
            return;
        } else {
            concurrentHashMap = this.f11951f;
            sb = new StringBuilder();
            sb.append(str);
            str3 = "_bidload";
        }
        sb.append(str3);
        concurrentHashMap.put(sb.toString(), strM9686a);
    }

    /* JADX INFO: renamed from: a */
    public final String m10167a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Uri uri = Uri.parse(str2);
            if (uri != null) {
                String host = uri.getHost();
                String path = uri.getPath();
                if (!TextUtils.isEmpty(host) && host.contains("hb") && !TextUtils.isEmpty(path) && path.contains("bid")) {
                    return m10165a(str, 6);
                }
                if (!TextUtils.isEmpty(host) && host.contains("hb") && !TextUtils.isEmpty(path) && path.contains("load")) {
                    return m10165a(str, 7);
                }
                if (!TextUtils.isEmpty(path) && path.contains(C1801a.f11144j)) {
                    return m10165a(str, 8);
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
