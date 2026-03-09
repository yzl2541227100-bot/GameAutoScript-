package com.anythink.basead.p016d.p017a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.p010a.C0732e;
import com.anythink.basead.p010a.p012b.C0723b;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p016d.p017a.C0755b;
import com.anythink.basead.p016d.p020c.C0761a;
import com.anythink.basead.p016d.p020c.C0763c;
import com.anythink.basead.p024g.C0790a;
import com.anythink.core.api.AdError;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.p050a.C1149a;
import com.anythink.core.common.p050a.C1153e;
import com.anythink.core.common.p050a.InterfaceC1157i;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p053d.C1195b;
import com.anythink.core.common.p053d.C1196c;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1214ag;
import com.anythink.core.common.p055f.C1245j;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1782d;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.basead.d.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0754a {

    /* JADX INFO: renamed from: d */
    private static volatile C0754a f800d;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, Boolean> f801a = new ConcurrentHashMap<>(3);

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, InterfaceC1157i> f802b = new ConcurrentHashMap<>(2);

    /* JADX INFO: renamed from: c */
    private Context f803c;

    /* JADX INFO: renamed from: com.anythink.basead.d.a.a$2, reason: invalid class name */
    public class AnonymousClass2 implements InterfaceC1283k {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1248m f807a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ a f808b;

        public AnonymousClass2(C1248m c1248m, a aVar) {
            this.f807a = c1248m;
            this.f808b = aVar;
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadCanceled(int i) {
            a aVar = this.f808b;
            if (aVar != null) {
                aVar.mo348a((C1245j) null, C0748f.m310a(C0748f.f727i, "Cancel Request."));
            }
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadError(int i, String str, AdError adError) {
            a aVar = this.f808b;
            if (aVar != null) {
                aVar.mo348a((C1245j) null, C0748f.m310a(C0748f.f727i, str));
            }
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadFinish(int i, Object obj) {
            C1245j c1245jM1964a;
            try {
                C1248m c1248m = this.f807a;
                c1245jM1964a = C1153e.m1964a(c1248m.f4320a, (JSONObject) obj, c1248m.f4325f, false);
            } catch (Exception unused) {
                c1245jM1964a = null;
            }
            if (c1245jM1964a == null) {
                a aVar = this.f808b;
                if (aVar != null) {
                    aVar.mo348a((C1245j) null, C0748f.m310a(C0748f.f727i, obj != null ? obj.toString() : "No Ad Return."));
                    return;
                }
                return;
            }
            c1245jM1964a.m2494c(this.f807a.f4332m);
            c1245jM1964a.m3201h(this.f807a.f4323d);
            C0763c.m452a(c1245jM1964a);
            C0761a.m450a(this.f807a, c1245jM1964a);
            if (this.f807a.f4325f == 67) {
                C1196c.m2305a(C0754a.this.f803c).m2302a(c1245jM1964a.m3229t(), c1245jM1964a.m2478Z());
                C1195b.m2304a(C0754a.this.f803c).m2302a(c1245jM1964a.m3231u(), c1245jM1964a.m2478Z());
            }
            C1149a c1149aM1921a = C1149a.m1921a();
            Context context = C0754a.this.f803c;
            C1248m c1248m2 = this.f807a;
            c1149aM1921a.m1929a(context, c1248m2.f4322c, c1248m2.f4320a, obj.toString());
            C1782d c1782dM331a = C0754a.this.m331a(c1245jM1964a, this.f807a);
            C0754a.this.m338a(this.f807a, c1245jM1964a);
            a aVar2 = this.f808b;
            if (aVar2 != null) {
                aVar2.mo347a(c1245jM1964a);
            }
            C0754a.this.m337a(c1245jM1964a, this.f807a, c1782dM331a, this.f808b);
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadStart(int i) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.a.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo346a(InterfaceC1157i interfaceC1157i);

        /* JADX INFO: renamed from: a */
        void mo347a(C1245j c1245j);

        /* JADX INFO: renamed from: a */
        void mo348a(C1245j c1245j, C0747e c0747e);

        /* JADX INFO: renamed from: a */
        void mo349a(C1245j c1245j, InterfaceC1157i interfaceC1157i);
    }

    private C0754a(Context context) {
        this.f803c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static C0754a m329a(Context context) {
        if (f800d == null) {
            synchronized (C0754a.class) {
                if (f800d == null) {
                    f800d = new C0754a(context);
                }
            }
        }
        return f800d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized C1782d m331a(C1245j c1245j, C1248m c1248m) {
        if (TextUtils.isEmpty(c1245j.m3144a())) {
            return null;
        }
        C1782d c1782dM8964a = C1782d.m8964a(c1245j.m3144a());
        ArrayList<C1781c> arrayList = c1782dM8964a.f10572J;
        C0755b.m356a(c1245j, arrayList.get(0));
        C0755b.m357a(c1245j, arrayList);
        C0755b.m359a(c1248m, arrayList);
        return c1782dM8964a;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m334a(C0754a c0754a, C1248m c1248m, a aVar) {
        C1245j c1245jM340a;
        try {
            c1245jM340a = c0754a.m340a(c1248m);
            try {
                c1245jM340a.m2494c(c1248m.f4332m);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            c1245jM340a = null;
        }
        if (c1245jM340a == null) {
            new C0790a(c1248m).mo3639a(0, (InterfaceC1283k) c0754a.new AnonymousClass2(c1248m, aVar));
        } else {
            c0754a.m336a(c1245jM340a, c1248m, aVar, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m336a(com.anythink.core.common.p055f.C1245j r5, com.anythink.core.common.p055f.C1248m r6, com.anythink.basead.p016d.p017a.C0754a.a r7, boolean r8) {
        /*
            r4 = this;
            java.lang.String r0 = r6.f4323d
            r5.m3201h(r0)
            com.anythink.expressad.foundation.d.d r0 = r4.m331a(r5, r6)
            r4.m338a(r6, r5)
            if (r7 == 0) goto L11
            r7.mo347a(r5)
        L11:
            if (r8 == 0) goto L74
            int r8 = r6.f4329j
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "0"
            boolean r8 = r8.equals(r1)
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L24
            goto L6e
        L24:
            int r8 = r6.f4329j
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r3 = "2"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L33
            goto L6e
        L33:
            int r8 = r6.f4329j
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "4"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L5a
            if (r0 == 0) goto L6d
            java.util.ArrayList<com.anythink.expressad.foundation.d.c> r8 = r0.f10572J
            if (r8 == 0) goto L6d
            int r8 = r8.size()
            if (r8 <= 0) goto L6d
            java.util.ArrayList<com.anythink.expressad.foundation.d.c> r8 = r0.f10572J
            java.lang.Object r8 = r8.get(r2)
            com.anythink.expressad.foundation.d.c r8 = (com.anythink.expressad.foundation.p116d.C1781c) r8
            boolean r1 = com.anythink.expressad.splash.p151c.C1984b.m10554a(r8)
            goto L6e
        L5a:
            if (r0 == 0) goto L6d
            java.util.ArrayList<com.anythink.expressad.foundation.d.c> r8 = r0.f10572J
            if (r8 == 0) goto L6d
            int r8 = r8.size()
            if (r8 <= 0) goto L6d
            java.util.ArrayList<com.anythink.expressad.foundation.d.c> r8 = r0.f10572J
            boolean r1 = com.anythink.expressad.videocommon.p178b.C2329n.m11929b(r8)
            goto L6e
        L6d:
            r1 = 0
        L6e:
            if (r1 == 0) goto L73
            r4.m337a(r5, r6, r0, r7)
        L73:
            return
        L74:
            r4.m337a(r5, r6, r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p016d.p017a.C0754a.m336a(com.anythink.core.common.f.j, com.anythink.core.common.f.m, com.anythink.basead.d.a.a$a, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m337a(final C1245j c1245j, final C1248m c1248m, C1782d c1782d, final a aVar) {
        if (!TextUtils.isEmpty(c1245j.m3144a())) {
            C0755b.m351a().m369a(c1245j, c1248m, c1782d, new C0755b.a() { // from class: com.anythink.basead.d.a.a.4
                @Override // com.anythink.basead.p016d.p017a.C0755b.a
                /* JADX INFO: renamed from: a */
                public final void mo343a(C0747e c0747e) {
                    C0754a.this.f801a.put(c1248m.f4321b + c1248m.f4320a, Boolean.FALSE);
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo348a(c1245j, c0747e);
                    }
                }

                @Override // com.anythink.basead.p016d.p017a.C0755b.a
                /* JADX INFO: renamed from: a */
                public final void mo344a(InterfaceC1157i interfaceC1157i) {
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo346a(interfaceC1157i);
                    }
                }

                @Override // com.anythink.basead.p016d.p017a.C0755b.a
                /* JADX INFO: renamed from: b */
                public final void mo345b(InterfaceC1157i interfaceC1157i) {
                    C0754a.this.f801a.put(c1248m.f4321b + c1248m.f4320a, Boolean.FALSE);
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo349a(c1245j, interfaceC1157i);
                    }
                }
            });
        } else {
            C0732e.m247a();
            C0732e.m249a(c1248m.f4321b, c1245j, c1248m, new C0723b.b() { // from class: com.anythink.basead.d.a.a.5
                @Override // com.anythink.basead.p010a.p012b.C0723b.b
                /* JADX INFO: renamed from: a */
                public final void mo192a() {
                    C0754a.this.f801a.put(c1248m.f4321b + c1248m.f4320a, Boolean.FALSE);
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo349a(c1245j, (InterfaceC1157i) null);
                    }
                }

                @Override // com.anythink.basead.p010a.p012b.C0723b.b
                /* JADX INFO: renamed from: a */
                public final void mo193a(C0747e c0747e) {
                    C0754a.this.f801a.put(c1248m.f4321b + c1248m.f4320a, Boolean.FALSE);
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo348a(c1245j, c0747e);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m338a(C1248m c1248m, AbstractC1247l abstractC1247l) {
        IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
        if (iExHandlerM2132b != null) {
            iExHandlerM2132b.fillDownloadStatus(this.f803c, abstractC1247l, c1248m);
        } else {
            abstractC1247l.m3212l(0);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m339b(C1248m c1248m, a aVar) {
        C1245j c1245jM340a;
        try {
            c1245jM340a = m340a(c1248m);
            try {
                c1245jM340a.m2494c(c1248m.f4332m);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            c1245jM340a = null;
        }
        if (c1245jM340a == null) {
            new C0790a(c1248m).mo3639a(0, (InterfaceC1283k) new AnonymousClass2(c1248m, aVar));
        } else {
            m336a(c1245jM340a, c1248m, aVar, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1245j m340a(C1248m c1248m) {
        C1214ag c1214agM1927a = C1149a.m1921a().m1927a(this.f803c, c1248m.f4320a);
        C1245j c1245jM1964a = null;
        if (c1214agM1927a != null && !TextUtils.isEmpty(c1214agM1927a.m2445a())) {
            try {
                c1245jM1964a = C1153e.m1964a(c1248m.f4320a, new JSONObject(c1214agM1927a.m2445a()), c1248m.f4325f, false);
                c1245jM1964a.m2494c(c1214agM1927a.m2446b());
            } catch (Throwable unused) {
            }
            if (c1245jM1964a != null) {
                C0763c.m452a(c1245jM1964a);
                C0761a.m450a(c1248m, c1245jM1964a);
            }
        }
        return c1245jM1964a;
    }

    /* JADX INFO: renamed from: a */
    public final void m341a(final AbstractC1217aj abstractC1217aj, final C1248m c1248m, final a aVar) {
        C1335b.m3998a().m4010c(new Runnable() { // from class: com.anythink.basead.d.a.a.3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1217aj abstractC1217aj2 = abstractC1217aj;
                if (abstractC1217aj2 == null || !(abstractC1217aj2 instanceof C1245j) || TextUtils.isEmpty(((C1245j) abstractC1217aj2).m3144a())) {
                    return;
                }
                C0755b.m351a();
                C0755b.m355a((C1245j) abstractC1217aj);
                C0754a.this.m336a((C1245j) abstractC1217aj, c1248m, aVar, true);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m342a(final C1248m c1248m, final a aVar) {
        if (this.f801a.contains(c1248m.f4321b + c1248m.f4320a)) {
            if (this.f801a.get(c1248m.f4321b + c1248m.f4320a).booleanValue()) {
                aVar.mo348a((C1245j) null, C0748f.m310a(C0748f.f725g, C0748f.f736r));
                return;
            }
        }
        this.f801a.put(c1248m.f4321b + c1248m.f4320a, Boolean.TRUE);
        C1335b.m3998a().m4010c(new Runnable() { // from class: com.anythink.basead.d.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                C0754a.m334a(C0754a.this, c1248m, aVar);
            }
        });
    }
}
