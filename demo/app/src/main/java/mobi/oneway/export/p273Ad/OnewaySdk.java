package mobi.oneway.export.p273Ad;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import mobi.oneway.export.C3580a;
import mobi.oneway.export.p274a.C3582b;
import mobi.oneway.export.p278c.C3601c;
import mobi.oneway.export.p280e.C3609a;
import mobi.oneway.export.p280e.C3610b;
import mobi.oneway.export.p283g.C3641m;

/* JADX INFO: loaded from: classes2.dex */
public class OnewaySdk {

    /* JADX INFO: renamed from: a */
    private static AtomicBoolean f19593a = new AtomicBoolean(false);

    public static void checkSdkConfigured() {
        if (isConfigured()) {
            return;
        }
        C3641m.m16997d(" OnewaySdk.configure method has not invoked first ");
    }

    public static void configure(Context context, String str) {
        if (!f19593a.compareAndSet(false, true)) {
            C3641m.m16997d("config method has been called");
            return;
        }
        if (context == null) {
            C3641m.m16997d("Context must not be null");
            return;
        }
        C3582b.m16652a(str);
        C3582b.m16651a(context.getApplicationContext());
        C3601c.m16723a().m16724a(context);
        C3610b.m16807a().m16811b();
        new C3609a(str).start();
    }

    public static String getVersion() {
        return C3580a.f19599f;
    }

    public static boolean isConfigured() {
        return f19593a.get();
    }

    public static void setDebugMode(boolean z) {
        C3641m.m16990a(z);
    }
}
