package com.anythink.banner.p009b;

import android.text.TextUtils;
import com.anythink.banner.p008a.InterfaceC0706c;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p064m.C1314c;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.anythink.banner.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0715a {

    /* JADX INFO: renamed from: a */
    public String f377a;

    /* JADX INFO: renamed from: b */
    public WeakReference<InterfaceC0706c> f378b;

    /* JADX INFO: renamed from: c */
    public C1314c f379c;

    /* JADX INFO: renamed from: d */
    public CustomBannerAdapter f380d;

    /* JADX INFO: renamed from: f */
    private boolean f382f = false;

    /* JADX INFO: renamed from: e */
    private Runnable f381e = new Runnable() { // from class: com.anythink.banner.b.a.1
        @Override // java.lang.Runnable
        public final void run() {
            C0715a.m118a(C0715a.this);
            C0715a.m119b(C0715a.this);
        }
    };

    public C0715a(InterfaceC0706c interfaceC0706c) {
        this.f378b = new WeakReference<>(interfaceC0706c);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m118a(C0715a c0715a) {
        c0715a.f382f = false;
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m119b(C0715a c0715a) {
        WeakReference<InterfaceC0706c> weakReference = c0715a.f378b;
        InterfaceC0706c interfaceC0706c = weakReference != null ? weakReference.get() : null;
        if (interfaceC0706c != null) {
            interfaceC0706c.timeUpRefreshView();
        } else {
            c0715a.m125c();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m120d() {
        WeakReference<InterfaceC0706c> weakReference = this.f378b;
        InterfaceC0706c interfaceC0706c = weakReference != null ? weakReference.get() : null;
        if (interfaceC0706c != null) {
            interfaceC0706c.timeUpRefreshView();
        } else {
            m125c();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m121a(CustomBannerAdapter customBannerAdapter) {
        this.f380d = customBannerAdapter;
    }

    /* JADX INFO: renamed from: a */
    public final void m122a(String str) {
        this.f377a = str;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m123a() {
        return this.f382f;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m124b() {
        CustomBannerAdapter customBannerAdapter;
        C1229av unitGroupInfo;
        if (TextUtils.isEmpty(this.f377a)) {
            return;
        }
        C1396f c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(this.f377a);
        if (this.f379c != null) {
            m125c();
        }
        if (c1396fM5139a != null && c1396fM5139a.m5088af() == 1) {
            this.f382f = true;
            long jM2767at = (c1396fM5139a.m5109c() != 2 || (customBannerAdapter = this.f380d) == null || (unitGroupInfo = customBannerAdapter.getUnitGroupInfo()) == null) ? 0L : unitGroupInfo.m2767at();
            if (jM2767at <= 0) {
                jM2767at = c1396fM5139a.m5089ag();
            }
            if (jM2767at <= C1659a.f9130f) {
                jM2767at = 2000;
            }
            C1314c c1314c = new C1314c(jM2767at, this.f381e, (byte) 0);
            this.f379c = c1314c;
            c1314c.m3802a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m125c() {
        C1314c c1314c = this.f379c;
        if (c1314c != null) {
            c1314c.m3804c();
        }
        this.f379c = null;
    }
}
