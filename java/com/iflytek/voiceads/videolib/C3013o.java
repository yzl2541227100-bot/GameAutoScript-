package com.iflytek.voiceads.videolib;

/* JADX INFO: renamed from: com.iflytek.voiceads.videolib.o */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C3013o {

    /* JADX INFO: renamed from: a */
    public static JZPlayer f16570a;

    /* JADX INFO: renamed from: b */
    public static JZPlayer f16571b;

    /* JADX INFO: renamed from: a */
    public static JZPlayer m13680a() {
        return f16570a;
    }

    /* JADX INFO: renamed from: a */
    public static void m13681a(JZPlayer jZPlayer) {
        f16570a = jZPlayer;
    }

    /* JADX INFO: renamed from: b */
    public static JZPlayer m13682b() {
        return f16571b;
    }

    /* JADX INFO: renamed from: b */
    public static void m13683b(JZPlayer jZPlayer) {
        f16571b = jZPlayer;
    }

    /* JADX INFO: renamed from: c */
    public static JZPlayer m13684c() {
        return m13682b() != null ? m13682b() : m13680a();
    }

    /* JADX INFO: renamed from: d */
    public static void m13685d() {
        if (f16571b != null) {
            f16571b.mo13631u();
            f16571b = null;
        }
        if (f16570a != null) {
            f16570a.mo13631u();
            f16570a = null;
        }
    }
}
