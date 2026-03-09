package com.anythink.expressad.splash.p151c;

import android.content.Context;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.splash.p148a.C1978b;
import com.anythink.expressad.splash.p150b.InterfaceC1979a;
import com.anythink.expressad.splash.view.ATSplashNativeView;
import com.anythink.expressad.splash.view.ATSplashView;

/* JADX INFO: renamed from: com.anythink.expressad.splash.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1983a {

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C1983a f12510a = new C1983a((byte) 0);
    }

    private C1983a() {
    }

    public /* synthetic */ C1983a(byte b) {
        this();
    }

    /* JADX INFO: renamed from: a */
    private static C1983a m10546a() {
        return a.f12510a;
    }

    /* JADX INFO: renamed from: a */
    private static void m10547a(Context context, ATSplashView aTSplashView, C1978b c1978b, InterfaceC1979a interfaceC1979a) {
        try {
            ATSplashNativeView aTSplashNativeView = new ATSplashNativeView(context, aTSplashView, c1978b);
            if (interfaceC1979a != null) {
                interfaceC1979a.mo10535a(aTSplashNativeView);
            }
        } catch (Throwable unused) {
            if (interfaceC1979a != null) {
                interfaceC1979a.mo10536a("View render error.");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10548a(ATSplashView aTSplashView, C1978b c1978b, InterfaceC1979a interfaceC1979a) {
        Context context = aTSplashView.getContext();
        if (context == null) {
            context = C1175n.m2059a().m2148f();
        }
        try {
            interfaceC1979a.mo10535a(new ATSplashNativeView(context, aTSplashView, c1978b));
        } catch (Throwable unused) {
            interfaceC1979a.mo10536a("View render error.");
        }
    }
}
