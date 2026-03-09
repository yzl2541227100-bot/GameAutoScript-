package com.anythink.expressad.exoplayer;

import java.util.HashSet;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1744l {

    /* JADX INFO: renamed from: a */
    public static final String f9827a = "ExoPlayer";

    /* JADX INFO: renamed from: b */
    public static final String f9828b = "2.8.4";

    /* JADX INFO: renamed from: c */
    public static final String f9829c = "ExoPlayerLib/2.8.4";

    /* JADX INFO: renamed from: d */
    public static final int f9830d = 2008004;

    /* JADX INFO: renamed from: e */
    public static final boolean f9831e = true;

    /* JADX INFO: renamed from: f */
    public static final boolean f9832f = true;

    /* JADX INFO: renamed from: g */
    private static final HashSet<String> f9833g = new HashSet<>();

    /* JADX INFO: renamed from: h */
    private static String f9834h = "goog.exo.core";

    private C1744l() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m8317a() {
        return f9834h;
    }

    /* JADX INFO: renamed from: a */
    private static synchronized void m8318a(String str) {
        if (f9833g.add(str)) {
            f9834h += ", " + str;
        }
    }
}
