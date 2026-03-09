package com.anythink.core.p047c.p049b;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.anythink.core.common.p055f.AbstractC1228au;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p047c.p048a.C1137a;
import com.anythink.core.p047c.p048a.C1140d;
import com.anythink.core.p072d.C1394d;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.c.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1144c implements InterfaceC1143b {

    /* JADX INFO: renamed from: a */
    private static final String f2861a = "PlacementStatRecWrapper";

    /* JADX INFO: renamed from: c */
    private final InterfaceC1143b f2863c = new C1145d();

    /* JADX INFO: renamed from: b */
    private final Handler f2862b = C1335b.m3998a().m4003a(11);

    /* JADX INFO: renamed from: a */
    private void m1879a(Runnable runnable) {
        Handler handler = this.f2862b;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: a */
    public final C1140d mo1870a(String str, int i, C1394d c1394d) {
        return this.f2863c.mo1870a(str, i, c1394d);
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: a */
    public final List<C1137a> mo1871a(int i, String str, int i2) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Log.w(f2861a, "The getStatisticsBeanList method cannot be called from the main thread.");
        }
        return this.f2863c.mo1871a(i, str, i2);
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: a */
    public final JSONObject mo1872a(String str) {
        return mo1873a(str, 0);
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: a */
    public final JSONObject mo1873a(String str, int i) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Log.w(f2861a, "The getUserValueParams method cannot be called from the main thread.");
        }
        return this.f2863c.mo1873a(str, i);
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: a */
    public final JSONObject mo1874a(String str, int i, int i2) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Log.w(f2861a, "The getUserValueParams with count method cannot be called from the main thread.");
        }
        return this.f2863c.mo1874a(str, i, i2);
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: a */
    public final void mo1875a(final AbstractC1228au abstractC1228au, final C1229av c1229av) {
        m1879a(new Runnable() { // from class: com.anythink.core.c.b.c.2
            @Override // java.lang.Runnable
            public final void run() {
                C1144c.this.f2863c.mo1875a(abstractC1228au, c1229av);
            }
        });
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: a */
    public final void mo1876a(final String str, final String str2, final int i, final C1229av c1229av) {
        m1879a(new Runnable() { // from class: com.anythink.core.c.b.c.1
            @Override // java.lang.Runnable
            public final void run() {
                C1144c.this.f2863c.mo1876a(str, str2, i, c1229av);
            }
        });
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: b */
    public final void mo1877b(String str) {
        this.f2863c.mo1877b(str);
    }
}
