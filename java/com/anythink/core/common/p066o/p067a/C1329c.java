package com.anythink.core.common.p066o.p067a;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.anythink.core.common.p066o.p067a.C1332f;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.o.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C1329c {

    /* JADX INFO: renamed from: a */
    private final C1332f f5138a;

    /* JADX INFO: renamed from: b */
    private final Map<View, InterfaceC1328b> f5139b;

    /* JADX INFO: renamed from: c */
    private final Map<View, C1330d<InterfaceC1328b>> f5140c;

    /* JADX INFO: renamed from: d */
    private final C1332f.b f5141d;

    /* JADX INFO: renamed from: e */
    private C1332f.d f5142e;

    public C1329c() {
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        C1332f.b bVar = new C1332f.b();
        C1332f c1332f = new C1332f();
        new Handler(Looper.getMainLooper());
        this(weakHashMap, weakHashMap2, bVar, c1332f);
    }

    public C1329c(int i) {
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        C1332f.b bVar = new C1332f.b();
        C1332f c1332f = new C1332f(i);
        new Handler(Looper.getMainLooper());
        this(weakHashMap, weakHashMap2, bVar, c1332f);
    }

    private C1329c(Map<View, InterfaceC1328b> map, Map<View, C1330d<InterfaceC1328b>> map2, C1332f.b bVar, C1332f c1332f) {
        this.f5139b = map;
        this.f5140c = map2;
        this.f5141d = bVar;
        this.f5138a = c1332f;
        C1332f.d dVar = new C1332f.d() { // from class: com.anythink.core.common.o.a.c.1
            @Override // com.anythink.core.common.p066o.p067a.C1332f.d
            /* JADX INFO: renamed from: a */
            public final void mo3966a(List<View> list) {
                for (View view : list) {
                    InterfaceC1328b interfaceC1328b = (InterfaceC1328b) C1329c.this.f5139b.get(view);
                    if (interfaceC1328b == null) {
                        C1329c.this.m3963a(view);
                    } else {
                        interfaceC1328b.recordImpression(view);
                        interfaceC1328b.setImpressionRecorded();
                    }
                }
            }
        };
        this.f5142e = dVar;
        c1332f.m3983a(dVar);
    }

    /* JADX INFO: renamed from: b */
    private void m3960b(View view) {
        this.f5140c.remove(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    private C1332f.d m3961c() {
        return this.f5142e;
    }

    /* JADX INFO: renamed from: a */
    public final void m3962a() {
        this.f5139b.clear();
        this.f5140c.clear();
        this.f5138a.m3980a();
    }

    /* JADX INFO: renamed from: a */
    public final void m3963a(View view) {
        this.f5139b.remove(view);
        m3960b(view);
        this.f5138a.m3981a(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m3964a(View view, InterfaceC1328b interfaceC1328b) {
        if (this.f5139b.get(view) == interfaceC1328b) {
            return;
        }
        m3963a(view);
        if (interfaceC1328b.isImpressionRecorded()) {
            return;
        }
        this.f5139b.put(view, interfaceC1328b);
        C1332f c1332f = this.f5138a;
        int impressionMinPercentageViewed = interfaceC1328b.getImpressionMinPercentageViewed();
        c1332f.m3982a(view, view, impressionMinPercentageViewed, impressionMinPercentageViewed, interfaceC1328b.getImpressionMinVisiblePx());
    }

    /* JADX INFO: renamed from: b */
    public final void m3965b() {
        m3962a();
        this.f5138a.m3984b();
        this.f5142e = null;
    }
}
