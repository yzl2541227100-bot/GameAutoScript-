package mobi.oneway.export.p278c;

import android.content.Context;

/* JADX INFO: renamed from: mobi.oneway.export.c.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3601c {

    /* JADX INFO: renamed from: a */
    private static C3601c f19660a;

    private C3601c() {
    }

    /* JADX INFO: renamed from: a */
    public static C3601c m16723a() {
        if (f19660a == null) {
            f19660a = new C3601c();
        }
        return f19660a;
    }

    /* JADX INFO: renamed from: a */
    public void m16724a(Context context) {
        C3599a c3599a = new C3599a(context);
        c3599a.m16721a();
        Thread.setDefaultUncaughtExceptionHandler(new C3602d(c3599a));
    }
}
