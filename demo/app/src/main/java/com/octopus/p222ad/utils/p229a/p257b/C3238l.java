package com.octopus.p222ad.utils.p229a.p257b;

import android.app.Application;
import android.content.Context;
import com.octopus.p222ad.utils.p229a.C3247f;
import com.octopus.p222ad.utils.p229a.C3248g;
import com.octopus.p222ad.utils.p229a.InterfaceC3245d;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.b.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C3238l {

    /* JADX INFO: renamed from: a */
    private static InterfaceC3245d f17868a;

    /* JADX INFO: renamed from: b */
    private static InterfaceC3245d f17869b;

    /* JADX INFO: renamed from: a */
    public static InterfaceC3245d m14924a(Context context) {
        if (context != null && !(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        InterfaceC3245d interfaceC3245d = f17868a;
        if (interfaceC3245d != null) {
            return interfaceC3245d;
        }
        InterfaceC3245d interfaceC3245dM14926c = m14926c(context);
        f17868a = interfaceC3245dM14926c;
        if (interfaceC3245dM14926c == null || !interfaceC3245dM14926c.mo14920a()) {
            InterfaceC3245d interfaceC3245dM14927d = m14927d(context);
            f17868a = interfaceC3245dM14927d;
            return interfaceC3245dM14927d;
        }
        C3247f.m14935a("Manufacturer interface has been found: " + f17868a.getClass().getName());
        return f17868a;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC3245d m14925b(Context context) {
        if (context != null && !(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        InterfaceC3245d interfaceC3245d = f17869b;
        if (interfaceC3245d != null) {
            return interfaceC3245d;
        }
        InterfaceC3245d interfaceC3245dM14928e = m14928e(context);
        f17869b = interfaceC3245dM14928e;
        return interfaceC3245dM14928e;
    }

    /* JADX INFO: renamed from: c */
    private static InterfaceC3245d m14926c(Context context) {
        if (C3248g.m14949k() || C3248g.m14952n()) {
            return new C3234h(context);
        }
        if (C3248g.m14948j()) {
            return new C3235i(context);
        }
        if (C3248g.m14950l()) {
            return new C3237k(context);
        }
        if (C3248g.m14943e() || C3248g.m14944f() || C3248g.m14945g()) {
            return new C3243q(context);
        }
        if (C3248g.m14947i()) {
            return new C3241o(context);
        }
        if (C3248g.m14942d()) {
            return new C3242p(context);
        }
        if (C3248g.m14951m()) {
            return new C3227a(context);
        }
        if (C3248g.m14938a() || C3248g.m14940b()) {
            return new C3233g(context);
        }
        if (C3248g.m14941c() || C3248g.m14946h()) {
            return new C3240n(context);
        }
        if (C3248g.m14939a(context)) {
            return new C3228b(context);
        }
        if (C3248g.m14954p()) {
            return new C3229c(context);
        }
        if (C3248g.m14953o()) {
            return new C3231e(context);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static InterfaceC3245d m14927d(Context context) {
        StringBuilder sb;
        Class cls;
        InterfaceC3245d c3236j = new C3236j(context);
        if (c3236j.mo14920a()) {
            sb = new StringBuilder();
            sb.append("Mobile Security Alliance has been found: ");
            cls = C3236j.class;
        } else {
            c3236j = new C3232f(context);
            if (!c3236j.mo14920a()) {
                C3230d c3230d = new C3230d();
                C3247f.m14935a("OAID/GAID was not supported: " + C3230d.class.getName());
                return c3230d;
            }
            sb = new StringBuilder();
            sb.append("Google Play Service has been found: ");
            cls = C3232f.class;
        }
        sb.append(cls.getName());
        C3247f.m14935a(sb.toString());
        return c3236j;
    }

    /* JADX INFO: renamed from: e */
    private static InterfaceC3245d m14928e(Context context) {
        C3232f c3232f = new C3232f(context);
        if (c3232f.mo14920a()) {
            C3247f.m14935a("Google Play Service has been found: " + C3232f.class.getName());
            return c3232f;
        }
        C3230d c3230d = new C3230d();
        C3247f.m14935a("GAID was not supported: " + C3230d.class.getName());
        return c3230d;
    }
}
