package com.anythink.expressad.foundation.p120g.p126f.p133g;

import com.anythink.expressad.foundation.p120g.p126f.p127a.C1824a;
import com.anythink.expressad.foundation.p120g.p126f.p132f.C1846c;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1848a {

    /* JADX INFO: renamed from: a */
    public static final int f11386a = -2;

    /* JADX INFO: renamed from: b */
    public static final int f11387b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f11388c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f11389d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f11390e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f11391f = 5;

    /* JADX INFO: renamed from: g */
    public static final int f11392g = 6;

    /* JADX INFO: renamed from: h */
    public static final int f11393h = 7;

    /* JADX INFO: renamed from: i */
    public static final int f11394i = 8;

    /* JADX INFO: renamed from: j */
    public static final int f11395j = 9;

    /* JADX INFO: renamed from: k */
    public static final int f11396k = 10;

    /* JADX INFO: renamed from: l */
    public static final int f11397l = 11;

    /* JADX INFO: renamed from: m */
    public static final int f11398m = 12;

    /* JADX INFO: renamed from: n */
    public static final int f11399n = 13;

    /* JADX INFO: renamed from: o */
    public static final int f11400o = 14;

    /* JADX INFO: renamed from: p */
    public static final int f11401p = 15;

    /* JADX INFO: renamed from: a */
    public static String m9570a(C1824a c1824a) {
        String str;
        String strValueOf;
        if (c1824a != null) {
            try {
                int i = c1824a.f11292a;
                C1846c c1846c = c1824a.f11293b;
                int i2 = c1846c != null ? c1846c.f11382a : 0;
                if (i == -2) {
                    return "Network is canceled";
                }
                if (i != 1) {
                    switch (i) {
                        case 3:
                            return "Network error,timeout exception";
                        case 4:
                            return "Network unknown error";
                        case 5:
                            return "Network error,https is not work,please check your phone time";
                        case 6:
                            if (i2 == 0) {
                                return "Network error,please check ";
                            }
                            str = "Network error,please check state code";
                            strValueOf = String.valueOf(i2);
                            break;
                            break;
                        case 7:
                            if (i2 == 0) {
                                return "The server returns an exception ";
                            }
                            str = "The server returns an exception state code ";
                            strValueOf = String.valueOf(i2);
                            break;
                            break;
                        case 8:
                            return "Cast exception, return data can't be casted correctly";
                        case 9:
                        case 12:
                            return "Network error,disconnected network exception";
                        case 10:
                            return "Network error,socket timeout exception";
                        case 11:
                            return "Network error,sslp exception";
                        default:
                            return "Network error,I/O exception";
                    }
                    return str.concat(strValueOf);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "Network error,Load failed";
    }
}
