package com.anythink.expressad.video.dynview;

import android.content.Context;
import android.view.View;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.video.dynview.p159b.C2072a;
import com.anythink.expressad.video.dynview.p159b.C2073b;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2086h;
import com.anythink.expressad.video.dynview.p165h.C2088a;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.b */
/* JADX INFO: loaded from: classes.dex */
public class C2071b {

    /* JADX INFO: renamed from: b */
    private static volatile C2071b f13180b;

    /* JADX INFO: renamed from: a */
    public Map<String, SoftReference<View>> f13181a = new HashMap();

    private C2071b() {
    }

    /* JADX INFO: renamed from: a */
    public static C2071b m11062a() {
        C2071b c2071b;
        if (f13180b != null) {
            return f13180b;
        }
        synchronized (C2071b.class) {
            if (f13180b == null) {
                f13180b = new C2071b();
            }
            c2071b = f13180b;
        }
        return c2071b;
    }

    /* JADX INFO: renamed from: a */
    public static void m11063a(Context context, List<C1781c> list, InterfaceC2086h interfaceC2086h, Map<String, Object> map) {
        new C2088a(context, list, interfaceC2086h, map);
    }

    /* JADX INFO: renamed from: a */
    public static void m11064a(C2074c c2074c, InterfaceC2086h interfaceC2086h) {
        new C2088a(c2074c, interfaceC2086h, new HashMap());
    }

    /* JADX INFO: renamed from: a */
    public static void m11065a(C2074c c2074c, InterfaceC2086h interfaceC2086h, Map<String, Object> map) {
        new C2088a(c2074c, interfaceC2086h, map);
    }

    /* JADX INFO: renamed from: b */
    private static void m11066b() {
    }

    /* JADX INFO: renamed from: c */
    private static void m11067c() {
        C2073b.m11078a();
        C2073b.m11081b();
        C2072a.m11068a();
        C2072a.m11071b();
    }
}
