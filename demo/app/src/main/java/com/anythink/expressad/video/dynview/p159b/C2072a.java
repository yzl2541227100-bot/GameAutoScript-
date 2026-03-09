package com.anythink.expressad.video.dynview.p159b;

import android.view.View;
import com.anythink.expressad.video.dynview.C2074c;
import com.anythink.expressad.video.dynview.p162e.InterfaceC2078a;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2083e;
import com.anythink.expressad.video.dynview.p170j.C2097a;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C2072a {

    /* JADX INFO: renamed from: b */
    private static volatile C2072a f13182b;

    /* JADX INFO: renamed from: a */
    public InterfaceC2078a f13183a;

    private C2072a() {
    }

    /* JADX INFO: renamed from: a */
    public static C2072a m11068a() {
        C2072a c2072a;
        if (f13182b != null) {
            return f13182b;
        }
        synchronized (C2072a.class) {
            if (f13182b == null) {
                f13182b = new C2072a();
            }
            c2072a = f13182b;
        }
        return c2072a;
    }

    /* JADX INFO: renamed from: a */
    private static void m11069a(C2074c c2074c, View view, InterfaceC2083e interfaceC2083e) {
        new C2097a().m11238a(c2074c, view, interfaceC2083e);
    }

    /* JADX INFO: renamed from: a */
    private void m11070a(C2074c c2074c, View view, Map map, InterfaceC2083e interfaceC2083e) {
        C2097a c2097a = new C2097a();
        c2097a.m11239a(c2074c, view, map, interfaceC2083e);
        this.f13183a = c2097a.f13269b;
    }

    /* JADX INFO: renamed from: b */
    public static void m11071b() {
        if (f13182b != null) {
            f13182b = null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m11072b(C2074c c2074c, View view, Map map, InterfaceC2083e interfaceC2083e) {
        new C2097a().m11240b(c2074c, view, map, interfaceC2083e);
    }

    /* JADX INFO: renamed from: c */
    private void m11073c() {
        InterfaceC2078a interfaceC2078a = this.f13183a;
        if (interfaceC2078a != null) {
            interfaceC2078a.mo11126a();
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m11074c(C2074c c2074c, View view, Map map, InterfaceC2083e interfaceC2083e) {
        new C2097a().m11241c(c2074c, view, map, interfaceC2083e);
    }

    /* JADX INFO: renamed from: d */
    private static void m11075d() {
    }

    /* JADX INFO: renamed from: e */
    private void m11076e() {
        InterfaceC2078a interfaceC2078a = this.f13183a;
        if (interfaceC2078a != null) {
            interfaceC2078a.mo11128c();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11077a(View view, C2074c c2074c, Map map, InterfaceC2083e interfaceC2083e) {
        int iM11094h = c2074c.m11094h();
        if (iM11094h == 1) {
            C2097a c2097a = new C2097a();
            c2097a.m11239a(c2074c, view, map, interfaceC2083e);
            this.f13183a = c2097a.f13269b;
        } else {
            if (iM11094h == 102 || iM11094h == 202 || iM11094h == 302 || iM11094h == 802 || iM11094h == 904) {
                new C2097a().m11240b(c2074c, view, map, interfaceC2083e);
                return;
            }
            if (iM11094h == 4) {
                new C2097a().m11238a(c2074c, view, interfaceC2083e);
            } else if (iM11094h != 5) {
                interfaceC2083e.mo11133a(view, new ArrayList());
            } else {
                new C2097a().m11241c(c2074c, view, map, interfaceC2083e);
            }
        }
    }
}
