package com.anythink.core.common.p054e;

import com.anythink.core.common.p066o.C1340d;

/* JADX INFO: renamed from: com.anythink.core.common.e.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1198a {

    /* JADX INFO: renamed from: a */
    public static final String f3575a = C1340d.m4030b("YXBpLnRoZWJpZGluLmNvbQ==");

    /* JADX INFO: renamed from: b */
    public static final String f3576b = C1340d.m4030b("dGsudGhlYmlkaW4uY29t");

    /* JADX INFO: renamed from: c */
    public static final String f3577c;

    /* JADX INFO: renamed from: d */
    public static final String f3578d;

    /* JADX INFO: renamed from: e */
    public static final String f3579e = "api.anythinktech.com";

    /* JADX INFO: renamed from: f */
    public static final String f3580f;

    /* JADX INFO: renamed from: g */
    public static final String f3581g;

    /* JADX INFO: renamed from: h */
    public static final String f3582h;

    /* JADX INFO: renamed from: i */
    public static final String f3583i;

    /* JADX INFO: renamed from: j */
    public static final String f3584j;

    /* JADX INFO: renamed from: k */
    public static final String f3585k;

    /* JADX INFO: renamed from: l */
    public static final String f3586l;

    /* JADX INFO: renamed from: m */
    public static final String f3587m;

    /* JADX INFO: renamed from: n */
    public static final String f3588n;

    /* JADX INFO: renamed from: o */
    public static final String f3589o = "";

    /* JADX INFO: renamed from: p */
    public static final String f3590p;

    /* JADX INFO: renamed from: q */
    public static final String f3591q;

    static {
        String strM4030b = C1340d.m4030b("ZGEudGhlYmlkaW4uY29t");
        f3577c = strM4030b;
        f3578d = C1340d.m4030b("YWR4LW9zLnRoZWJpZGluLmNvbQ==");
        f3580f = "https://" + m2310a() + "/v2/open/app";
        f3581g = "https://" + m2310a() + "/v2/open/placement";
        StringBuilder sb = new StringBuilder("https://");
        if (!C1200c.m2314a().m2336b()) {
            strM4030b = "da.anythinktech.com";
        }
        sb.append(strM4030b);
        sb.append("/v1/open/da");
        f3582h = sb.toString();
        f3583i = "https://" + m2311b() + "/v1/open/tk";
        f3584j = "https://" + m2310a() + "/v2/open/eu";
        f3585k = "https://" + m2313d() + "/bid";
        f3586l = "https://" + m2313d() + "/request";
        f3587m = "https://adx" + m2311b() + "/v1";
        f3588n = "https://" + m2313d() + "/openapi/req";
        f3590p = "https://" + m2311b() + "/ss/rrd";
        f3591q = "https://" + m2310a() + "/v2/open/area";
    }

    /* JADX INFO: renamed from: a */
    private static String m2310a() {
        return C1200c.m2314a().m2336b() ? f3575a : f3579e;
    }

    /* JADX INFO: renamed from: b */
    private static String m2311b() {
        return C1200c.m2314a().m2336b() ? f3576b : "tk.anythinktech.com";
    }

    /* JADX INFO: renamed from: c */
    private static String m2312c() {
        return C1200c.m2314a().m2336b() ? f3577c : "da.anythinktech.com";
    }

    /* JADX INFO: renamed from: d */
    private static String m2313d() {
        return C1200c.m2314a().m2336b() ? f3578d : "adx.anythinktech.com";
    }
}
