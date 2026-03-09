package com.anythink.basead.p016d.p018b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.p010a.C0717a;
import com.anythink.basead.p010a.C0732e;
import com.anythink.basead.p010a.p012b.C0723b;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p015c.C0751i;
import com.anythink.basead.p016d.p020c.C0761a;
import com.anythink.basead.p016d.p020c.C0763c;
import com.anythink.basead.p016d.p020c.C0764d;
import com.anythink.basead.p024g.C0793d;
import com.anythink.core.api.AdError;
import com.anythink.core.api.IExHandler;
import com.anythink.core.basead.C1118b;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1216ai;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p058h.InterfaceC1283k;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.basead.d.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0757a {

    /* JADX INFO: renamed from: c */
    private static volatile C0757a f868c;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, Boolean> f869a = new ConcurrentHashMap<>(3);

    /* JADX INFO: renamed from: b */
    private Context f870b;

    /* JADX INFO: renamed from: com.anythink.basead.d.b.a$1, reason: invalid class name */
    public class AnonymousClass1 implements InterfaceC1283k {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1248m f871a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ a f872b;

        public AnonymousClass1(C1248m c1248m, a aVar) {
            this.f871a = c1248m;
            this.f872b = aVar;
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadCanceled(int i) {
            a aVar = this.f872b;
            if (aVar != null) {
                aVar.mo414a(null, C0748f.m310a(C0748f.f727i, "Cancel Request."));
            }
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadError(int i, String str, AdError adError) {
            a aVar = this.f872b;
            if (aVar != null) {
                aVar.mo414a(null, C0748f.m310a(C0748f.f727i, str));
            }
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadFinish(int i, Object obj) {
            JSONObject jSONObject;
            C1216ai c1216aiM426a;
            try {
                jSONObject = (JSONObject) obj;
            } catch (Exception unused) {
                jSONObject = null;
            }
            try {
                jSONObject.put(C0759b.f878a, System.currentTimeMillis());
                c1216aiM426a = C0759b.m426a(this.f871a, jSONObject);
            } catch (Exception unused2) {
                c1216aiM426a = null;
            }
            if (c1216aiM426a == null) {
                a aVar = this.f872b;
                if (aVar != null) {
                    aVar.mo414a(null, C0748f.m310a(C0748f.f727i, obj != null ? obj.toString() : "No Ad Return."));
                    return;
                }
                return;
            }
            C0763c.m452a(c1216aiM426a);
            if (c1216aiM426a.m2453b() == 1 && C0717a.m131a(C0757a.this.f870b.getApplicationContext(), c1216aiM426a.m3167F())) {
                C0764d c0764dM453a = C0764d.m453a();
                Context context = C0757a.this.f870b;
                C1248m c1248m = this.f871a;
                c0764dM453a.m455a(context, C0764d.m454a(c1248m.f4321b, c1248m.f4322c), c1216aiM426a, this.f871a.f4333n);
                a aVar2 = this.f872b;
                if (aVar2 != null) {
                    aVar2.mo414a(null, C0748f.m310a(C0748f.f727i, "Application installed."));
                    return;
                }
                return;
            }
            if (c1216aiM426a.m2453b() == 2 && !C0717a.m131a(C0757a.this.f870b.getApplicationContext(), c1216aiM426a.m3167F())) {
                C0764d c0764dM453a2 = C0764d.m453a();
                Context context2 = C0757a.this.f870b;
                C1248m c1248m2 = this.f871a;
                c0764dM453a2.m455a(context2, C0764d.m454a(c1248m2.f4321b, c1248m2.f4322c), c1216aiM426a, this.f871a.f4333n);
                a aVar3 = this.f872b;
                if (aVar3 != null) {
                    aVar3.mo414a(null, C0748f.m310a(C0748f.f727i, "Application not installed yet."));
                    return;
                }
                return;
            }
            C0761a.m450a(this.f871a, c1216aiM426a);
            C0717a.m126a(10, c1216aiM426a, new C0751i(this.f871a.f4323d, ""));
            C1118b.m1736a();
            Context context3 = C0757a.this.f870b;
            C1118b.m1736a();
            C1118b.m1740a(context3, C1118b.m1738a(this.f871a), jSONObject.toString());
            C0757a.this.m421a(this.f871a, c1216aiM426a);
            a aVar4 = this.f872b;
            if (aVar4 != null) {
                aVar4.mo412a();
            }
            C0757a.this.m420a(c1216aiM426a, this.f871a, this.f872b);
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadStart(int i) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.b.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo412a();

        /* JADX INFO: renamed from: a */
        void mo413a(C1216ai c1216ai);

        /* JADX INFO: renamed from: a */
        void mo414a(C1216ai c1216ai, C0747e c0747e);
    }

    private C0757a(Context context) {
        this.f870b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static C0757a m416a(Context context) {
        if (f868c == null) {
            synchronized (C0757a.class) {
                if (f868c == null) {
                    f868c = new C0757a(context);
                }
            }
        }
        return f868c;
    }

    /* JADX INFO: renamed from: a */
    private C1216ai m417a(C1248m c1248m) {
        C1118b.m1736a();
        String strM1738a = C1118b.m1738a(c1248m);
        C1118b.m1736a();
        String strM1737a = C1118b.m1737a(this.f870b, strM1738a);
        C1216ai c1216aiM426a = null;
        if (TextUtils.isEmpty(strM1737a)) {
            return null;
        }
        try {
            c1216aiM426a = C0759b.m426a(c1248m, new JSONObject(strM1737a));
        } catch (Throwable unused) {
        }
        if (c1216aiM426a != null) {
            C0763c.m452a(c1216aiM426a);
            C0761a.m450a(c1248m, c1216aiM426a);
        }
        return c1216aiM426a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m420a(final C1216ai c1216ai, final C1248m c1248m, final a aVar) {
        C0732e.m247a();
        C0732e.m249a(c1248m.f4321b, c1216ai, c1248m, new C0723b.b() { // from class: com.anythink.basead.d.b.a.2
            @Override // com.anythink.basead.p010a.p012b.C0723b.b
            /* JADX INFO: renamed from: a */
            public final void mo192a() {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = C0757a.this.f869a;
                C1118b.m1736a();
                concurrentHashMap.put(C1118b.m1738a(c1248m), Boolean.FALSE);
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo413a(c1216ai);
                }
            }

            @Override // com.anythink.basead.p010a.p012b.C0723b.b
            /* JADX INFO: renamed from: a */
            public final void mo193a(C0747e c0747e) {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = C0757a.this.f869a;
                C1118b.m1736a();
                concurrentHashMap.put(C1118b.m1738a(c1248m), Boolean.FALSE);
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo414a(c1216ai, c0747e);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m421a(C1248m c1248m, AbstractC1247l abstractC1247l) {
        IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
        if (iExHandlerM2132b != null) {
            iExHandlerM2132b.fillDownloadStatus(this.f870b, abstractC1247l, c1248m);
        } else {
            abstractC1247l.m3212l(0);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m422b(C1248m c1248m, String str, a aVar) {
        C1216ai c1216aiM417a;
        int i;
        int i2;
        int i3;
        try {
            c1216aiM417a = m417a(c1248m);
        } catch (Throwable unused) {
            c1216aiM417a = null;
        }
        if (c1216aiM417a != null && !c1216aiM417a.m2477Y()) {
            m421a(c1248m, c1216aiM417a);
            if (aVar != null) {
                aVar.mo412a();
            }
            m420a(c1216aiM417a, c1248m, aVar);
            return;
        }
        if (!TextUtils.isEmpty(c1248m.f4333n.m3383x())) {
            try {
                String[] strArrSplit = c1248m.f4333n.m3383x().split("x");
                i = Integer.parseInt(strArrSplit[0]);
                try {
                    i3 = Integer.parseInt(strArrSplit[1]);
                    i2 = i;
                } catch (Throwable unused2) {
                    i2 = i;
                    i3 = 0;
                }
            } catch (Throwable unused3) {
                i = 0;
            }
            new C0793d(c1248m, i2, i3, C0764d.m453a().m456a(this.f870b, C0764d.m454a(c1248m.f4321b, c1248m.f4322c)), str).mo3639a(0, (InterfaceC1283k) new AnonymousClass1(c1248m, aVar));
        }
        i2 = 0;
        i3 = 0;
        new C0793d(c1248m, i2, i3, C0764d.m453a().m456a(this.f870b, C0764d.m454a(c1248m.f4321b, c1248m.f4322c)), str).mo3639a(0, (InterfaceC1283k) new AnonymousClass1(c1248m, aVar));
    }

    /* JADX INFO: renamed from: a */
    public final void m423a(C1248m c1248m, String str, a aVar) {
        int i;
        int i2;
        int i3;
        C1118b.m1736a();
        String strM1738a = C1118b.m1738a(c1248m);
        C1216ai c1216aiM417a = null;
        if (this.f869a.contains(strM1738a) && this.f869a.get(strM1738a).booleanValue()) {
            aVar.mo414a(null, C0748f.m310a(C0748f.f725g, C0748f.f736r));
            return;
        }
        this.f869a.put(strM1738a, Boolean.TRUE);
        try {
            c1216aiM417a = m417a(c1248m);
        } catch (Throwable unused) {
        }
        if (c1216aiM417a != null && !c1216aiM417a.m2477Y()) {
            m421a(c1248m, c1216aiM417a);
            aVar.mo412a();
            m420a(c1216aiM417a, c1248m, aVar);
            return;
        }
        if (!TextUtils.isEmpty(c1248m.f4333n.m3383x())) {
            try {
                String[] strArrSplit = c1248m.f4333n.m3383x().split("x");
                i = Integer.parseInt(strArrSplit[0]);
                try {
                    i3 = Integer.parseInt(strArrSplit[1]);
                    i2 = i;
                } catch (Throwable unused2) {
                    i2 = i;
                    i3 = 0;
                }
            } catch (Throwable unused3) {
                i = 0;
            }
            new C0793d(c1248m, i2, i3, C0764d.m453a().m456a(this.f870b, C0764d.m454a(c1248m.f4321b, c1248m.f4322c)), str).mo3639a(0, (InterfaceC1283k) new AnonymousClass1(c1248m, aVar));
        }
        i2 = 0;
        i3 = 0;
        new C0793d(c1248m, i2, i3, C0764d.m453a().m456a(this.f870b, C0764d.m454a(c1248m.f4321b, c1248m.f4322c)), str).mo3639a(0, (InterfaceC1283k) new AnonymousClass1(c1248m, aVar));
    }
}
