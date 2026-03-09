package com.anythink.nativead.p184a;

import android.content.Context;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import com.anythink.core.common.C1148a;
import com.anythink.core.common.C1201f;
import com.anythink.core.common.p051b.C1163b;
import com.anythink.core.common.p051b.InterfaceC1162a;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1257v;
import com.anythink.core.common.p066o.C1358v;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.nativead.unitgroup.AbstractC2372a;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.nativead.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C2357a {

    /* JADX INFO: renamed from: a */
    public static final String f14810a = "a";

    /* JADX INFO: renamed from: e */
    private static Map<String, C2357a> f14811e = new ConcurrentHashMap(3);

    /* JADX INFO: renamed from: b */
    private Context f14812b;

    /* JADX INFO: renamed from: c */
    private String f14813c;

    /* JADX INFO: renamed from: d */
    private C1201f f14814d;

    /* JADX INFO: renamed from: com.anythink.nativead.a.a$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1234b f14815a;

        public AnonymousClass1(C1234b c1234b) {
            c1234b = c1234b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1148a.m1904a().m1917a(c1234b);
        }
    }

    private C2357a(Context context, String str) {
        this.f14812b = context.getApplicationContext();
        this.f14813c = str;
        this.f14814d = C1201f.m2340a(context, str, "0");
    }

    /* JADX INFO: renamed from: a */
    public static C2357a m12177a(Context context, String str) {
        C2357a c2357a = f14811e.get(str);
        if (c2357a == null) {
            synchronized (C2357a.class) {
                if (c2357a == null) {
                    c2357a = new C2357a(context, str);
                    f14811e.put(str, c2357a);
                }
            }
        }
        return c2357a;
    }

    /* JADX INFO: renamed from: a */
    public final ATAdStatusInfo m12178a(Context context, Map<String, Object> map) {
        return this.f14814d.m2380a(context, map);
    }

    /* JADX INFO: renamed from: a */
    public final C1234b m12179a(String str, Map<String, Object> map) {
        C1234b c1234bM2381a = this.f14814d.m2381a(this.f14812b, false, true, map);
        if (c1234bM2381a == null || !(c1234bM2381a.m2905e() instanceof AbstractC2372a) || !(c1234bM2381a.m2904d() instanceof CustomNativeAdapter)) {
            return null;
        }
        C1243h detail = c1234bM2381a.m2905e().getDetail();
        detail.f4134B = str;
        c1234bM2381a.m2894a(c1234bM2381a.m2902c() + 1);
        C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.nativead.a.a.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1234b f14815a;

            public AnonymousClass1(C1234b c1234bM2381a2) {
                c1234b = c1234bM2381a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1148a.m1904a().m1917a(c1234b);
            }
        });
        C1358v.m4258a(map, detail);
        C1358v.m4256a(this.f14813c, detail);
        return c1234bM2381a2;
    }

    /* JADX INFO: renamed from: a */
    public final List<ATAdInfo> m12180a(Context context) {
        return this.f14814d.m2396b(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m12181a(Context context, InterfaceC1162a interfaceC1162a, C1163b c1163b, Map<String, Object> map, ATAdxBidFloorInfo aTAdxBidFloorInfo) {
        C1257v c1257v = new C1257v();
        c1257v.m3446a(context);
        c1257v.f4484e = c1163b;
        c1257v.f4483d = 0;
        if (map != null) {
            try {
                c1257v.f4486g = new HashMap(map);
            } catch (Throwable unused) {
            }
        }
        c1257v.f4491l = aTAdxBidFloorInfo;
        this.f14814d.m2398b(this.f14812b, "0", this.f14813c, c1257v, interfaceC1162a);
    }
}
