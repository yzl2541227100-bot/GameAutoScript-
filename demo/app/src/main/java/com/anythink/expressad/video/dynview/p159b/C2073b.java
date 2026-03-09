package com.anythink.expressad.video.dynview.p159b;

import android.view.View;
import com.anythink.expressad.video.dynview.C2074c;
import com.anythink.expressad.video.dynview.p170j.C2098b;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C2073b {

    /* JADX INFO: renamed from: a */
    private static volatile C2073b f13184a;

    private C2073b() {
    }

    /* JADX INFO: renamed from: a */
    public static C2073b m11078a() {
        C2073b c2073b;
        if (f13184a != null) {
            return f13184a;
        }
        synchronized (C2073b.class) {
            if (f13184a == null) {
                f13184a = new C2073b();
            }
            c2073b = f13184a;
        }
        return c2073b;
    }

    /* JADX INFO: renamed from: a */
    private static void m11079a(View view) {
        new C2098b().m11248a(view);
    }

    /* JADX INFO: renamed from: a */
    public static void m11080a(View view, C2074c c2074c) {
        if (c2074c == null) {
            return;
        }
        int iM11094h = c2074c.m11094h();
        if (iM11094h == 1) {
            new C2098b().m11248a(view);
            return;
        }
        if (iM11094h == 102 || iM11094h == 202 || iM11094h == 302 || iM11094h == 802 || iM11094h == 904) {
            new C2098b().m11249a(view, c2074c);
            return;
        }
        if (iM11094h == 3) {
            new C2098b().m11250b(view, c2074c);
        } else if (iM11094h == 4) {
            new C2098b().m11251c(view, c2074c);
        } else {
            if (iM11094h != 5) {
                return;
            }
            new C2098b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11081b() {
        if (f13184a != null) {
            f13184a = null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m11082b(View view, C2074c c2074c) {
        new C2098b().m11249a(view, c2074c);
    }

    /* JADX INFO: renamed from: c */
    private static void m11083c() {
        new C2098b();
    }

    /* JADX INFO: renamed from: c */
    private static void m11084c(View view, C2074c c2074c) {
        new C2098b().m11250b(view, c2074c);
    }

    /* JADX INFO: renamed from: d */
    private static void m11085d(View view, C2074c c2074c) {
        new C2098b().m11251c(view, c2074c);
    }
}
