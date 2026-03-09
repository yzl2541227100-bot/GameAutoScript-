package mobi.oneway.export.p274a;

import android.content.Context;
import mobi.oneway.export.p283g.C3641m;

/* JADX INFO: renamed from: mobi.oneway.export.a.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3582b {

    /* JADX INFO: renamed from: a */
    private static Context f19614a;

    /* JADX INFO: renamed from: b */
    private static String f19615b;

    /* JADX INFO: renamed from: c */
    private static boolean f19616c;

    /* JADX INFO: renamed from: d */
    private static String f19617d;

    /* JADX INFO: renamed from: e */
    private static String f19618e;

    /* JADX INFO: renamed from: a */
    public static Context m16650a() {
        if (f19614a == null) {
            C3641m.m16997d("OnewaySdk.init method must invoke first and paramter context must not be null");
        }
        return f19614a;
    }

    /* JADX INFO: renamed from: a */
    public static void m16651a(Context context) {
        f19614a = context;
    }

    /* JADX INFO: renamed from: a */
    public static void m16652a(String str) {
        f19615b = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m16653a(boolean z) {
        f19616c = z;
    }

    /* JADX INFO: renamed from: b */
    public static String m16654b() {
        return f19615b;
    }

    /* JADX INFO: renamed from: b */
    public static void m16655b(String str) {
        f19617d = str;
    }

    /* JADX INFO: renamed from: c */
    public static void m16656c(String str) {
        f19618e = str;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16657c() {
        return f19616c;
    }

    /* JADX INFO: renamed from: d */
    public static String m16658d() {
        return f19617d;
    }

    /* JADX INFO: renamed from: e */
    public static String m16659e() {
        return f19618e;
    }
}
