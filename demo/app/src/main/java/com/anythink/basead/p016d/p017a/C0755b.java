package com.anythink.basead.p016d.p017a;

import android.text.TextUtils;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.core.common.p050a.InterfaceC1157i;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1219al;
import com.anythink.core.common.p055f.C1245j;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.advanced.p079d.C1431c;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1782d;
import com.anythink.expressad.foundation.p116d.C1792n;
import com.anythink.expressad.out.C1927b;
import com.anythink.expressad.out.C1932g;
import com.anythink.expressad.out.InterfaceC1933h;
import com.anythink.expressad.out.InterfaceC1940o;
import com.anythink.expressad.out.TemplateBannerView;
import com.anythink.expressad.p089e.C1490a;
import com.anythink.expressad.reward.p147b.C1964a;
import com.anythink.expressad.shake.C1974a;
import com.anythink.expressad.video.dynview.p158a.C2069a;
import com.anythink.expressad.videocommon.p180d.InterfaceC2334a;
import com.anythink.expressad.videocommon.p181e.C2339c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.basead.d.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0755b {

    /* JADX INFO: renamed from: c */
    private static volatile C0755b f822c;

    /* JADX INFO: renamed from: b */
    private final String f824b = getClass().getSimpleName();

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, InterfaceC1157i> f823a = new ConcurrentHashMap<>(2);

    /* JADX INFO: renamed from: com.anythink.basead.d.a.b$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1245j f825a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1248m f826b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1782d f827c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ a f828d;

        public AnonymousClass1(C1245j c1245j, C1248m c1248m, C1782d c1782d, a aVar) {
            this.f825a = c1245j;
            this.f826b = c1248m;
            this.f827c = c1782d;
            this.f828d = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0046 A[PHI: r4
  0x0046: PHI (r4v7 int) = (r4v1 int), (r4v2 int) binds: [B:11:0x0044, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instruction units count: 282
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p016d.p017a.C0755b.AnonymousClass1.run():void");
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.a.b$2, reason: invalid class name */
    public class AnonymousClass2 implements InterfaceC1933h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1248m f831a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ a f832b;

        public AnonymousClass2(C1248m c1248m, a aVar) {
            this.f831a = c1248m;
            this.f832b = aVar;
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: a */
        public final void mo320a() {
            TemplateBannerView templateBannerView = (TemplateBannerView) C0755b.this.f823a.remove(this.f831a.f4321b + this.f831a.f4320a);
            if (templateBannerView != null) {
                a aVar = this.f832b;
                if (aVar != null) {
                    aVar.mo345b(templateBannerView);
                    return;
                }
                return;
            }
            if (this.f832b != null) {
                this.f832b.mo343a(C0748f.m310a(C0748f.f731m, "Resource download fail."));
            }
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: a */
        public final void mo321a(C1781c c1781c) {
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: a */
        public final void mo322a(String str) {
            C0755b.m354a(C0755b.this, str, this.f831a, this.f832b);
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: b */
        public final void mo323b() {
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: c */
        public final void mo324c() {
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: d */
        public final void mo325d() {
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: e */
        public final void mo326e() {
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: f */
        public final void mo327f() {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.a.b$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1245j f837a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1248m f838b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ a f839c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C1782d f840d;

        public AnonymousClass4(C1245j c1245j, C1248m c1248m, a aVar, C1782d c1782d) {
            this.f837a = c1245j;
            this.f838b = c1248m;
            this.f839c = aVar;
            this.f840d = c1782d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1431c c1431c = new C1431c("", TextUtils.isEmpty(this.f837a.m2484ac()) ? this.f838b.f4322c : this.f837a.m2484ac(), C1175n.m2059a().m2148f());
            c1431c.m5541a(new InterfaceC1940o() { // from class: com.anythink.basead.d.a.b.4.1
                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: a */
                public final void mo383a() {
                    C1431c c1431c2 = (C1431c) C0755b.this.f823a.remove(AnonymousClass4.this.f838b.f4321b + AnonymousClass4.this.f838b.f4320a);
                    if (c1431c2 != null) {
                        a aVar = AnonymousClass4.this.f839c;
                        if (aVar != null) {
                            aVar.mo345b(c1431c2);
                            return;
                        }
                        return;
                    }
                    if (AnonymousClass4.this.f839c != null) {
                        AnonymousClass4.this.f839c.mo343a(C0748f.m310a(C0748f.f732n, C0748f.f710I));
                    }
                }

                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: a */
                public final void mo384a(C1781c c1781c) {
                }

                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: a */
                public final void mo385a(String str) {
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    C0755b.m354a(C0755b.this, str, anonymousClass4.f838b, anonymousClass4.f839c);
                }

                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: b */
                public final void mo386b() {
                }

                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: c */
                public final void mo387c() {
                }

                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: d */
                public final void mo388d() {
                }

                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: e */
                public final void mo389e() {
                }

                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: f */
                public final void mo390f() {
                }
            });
            a aVar = this.f839c;
            if (aVar != null) {
                aVar.mo344a(c1431c);
            }
            C0755b.this.f823a.put(this.f838b.f4321b + this.f838b.f4320a, c1431c);
            c1431c.m5540a(this.f840d);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.a.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo343a(C0747e c0747e);

        /* JADX INFO: renamed from: a */
        void mo344a(InterfaceC1157i interfaceC1157i);

        /* JADX INFO: renamed from: b */
        void mo345b(InterfaceC1157i interfaceC1157i);
    }

    private C0755b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[PHI: r4
  0x005c: PHI (r4v1 int) = (r4v0 int), (r4v0 int), (r4v2 int) binds: [B:9:0x0039, B:10:0x003b, B:12:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.anythink.basead.p010a.C0721b m350a(com.anythink.basead.p010a.C0721b r6, com.anythink.expressad.foundation.p116d.C1781c r7) {
        /*
            com.anythink.core.common.f.l r0 = r6.m159b()
            com.anythink.core.common.f.n r0 = r0.m3220o()
            com.anythink.core.common.f.l r1 = r6.m159b()
            java.lang.String r1 = r1.m3229t()
            java.lang.String r2 = r7.m10146aZ()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L22
            com.anythink.core.common.f.l r0 = r6.m159b()
            m358a(r0, r7)
            return r6
        L22:
            com.anythink.core.common.f.j r1 = new com.anythink.core.common.f.j
            r1.<init>()
            m356a(r1, r7)
            java.lang.String r2 = r7.m10146aZ()
            r1.m3209k(r2)
            int r2 = r7.m8809Q()
            r3 = 2
            if (r2 == 0) goto L60
            r4 = 1
            if (r2 == r4) goto L5c
            if (r2 == r3) goto L5c
            r4 = 4
            r5 = 3
            if (r2 == r5) goto L5c
            if (r2 == r4) goto L58
            r4 = 5
            if (r2 == r4) goto L60
            r4 = 8
            if (r2 == r4) goto L58
            r4 = 9
            if (r2 == r4) goto L60
            r3 = 12
            if (r2 == r3) goto L53
            goto L63
        L53:
            r2 = 6
            r1.m3200h(r2)
            goto L63
        L58:
            r1.m3200h(r5)
            goto L63
        L5c:
            r1.m3200h(r4)
            goto L63
        L60:
            r1.m3200h(r3)
        L63:
            com.anythink.expressad.foundation.d.a r7 = r7.m9105aG()
            if (r7 == 0) goto L8c
            java.lang.String r2 = r7.m8607b()
            r1.m2476O(r2)
            java.lang.String r2 = r7.m8611f()
            r1.m3242z(r2)
            java.lang.String r2 = r7.m8610e()
            r1.m3158A(r2)
            java.lang.String r2 = r7.m8608c()
            r1.m3160B(r2)
            java.lang.String r7 = r7.m8606a()
            r1.m3162C(r7)
        L8c:
            com.anythink.core.common.f.m r6 = r6.m160c()
            com.anythink.basead.a.b r7 = new com.anythink.basead.a.b
            com.anythink.core.common.b.n r2 = com.anythink.core.common.p051b.C1175n.m2059a()
            android.content.Context r2 = r2.m2148f()
            r7.<init>(r2, r6, r1)
            r1.m3186a(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p016d.p017a.C0755b.m350a(com.anythink.basead.a.b, com.anythink.expressad.foundation.d.c):com.anythink.basead.a.b");
    }

    /* JADX INFO: renamed from: a */
    public static C0755b m351a() {
        if (f822c == null) {
            synchronized (C0755b.class) {
                if (f822c == null) {
                    f822c = new C0755b();
                }
            }
        }
        return f822c;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m354a(C0755b c0755b, String str, C1248m c1248m, a aVar) {
        c0755b.f823a.remove(c1248m.f4321b + c1248m.f4320a);
        if (aVar != null) {
            aVar.mo343a(C0748f.m310a(C0748f.f731m, str));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m355a(C1245j c1245j) {
        if (!TextUtils.isEmpty(c1245j.m3222p())) {
            C1927b.f11909a = c1245j.m3222p();
        }
        if (C1773a.m8548c().m8557e() == null) {
            C1773a.m8548c().m8550a(C1175n.m2059a().m2148f());
            C1773a.m8548c().m8551a(C1175n.m2059a().m2106L());
            C1490a c1490aM10119a = C1932g.m10119a();
            HashMap map = new HashMap(3);
            map.put(C1404a.f6217d, c1245j.m2482aa());
            map.put(C1404a.f6218e, c1245j.m2483ab());
            c1490aM10119a.mo5718a(map, C1175n.m2059a().m2148f());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m356a(C1245j c1245j, C1781c c1781c) {
        c1245j.m3238x(c1781c.m10147ba());
        c1245j.m3221o(c1781c.m10150bd());
        c1245j.m3216m(c1781c.m10148bb());
        c1245j.m3219n(c1781c.m10149bc());
        c1245j.m3236w(c1781c.m8835ad());
        c1245j.m3234v(c1781c.m8837af());
        C1219al c1219alM2489ah = c1245j.m2489ah();
        if (c1219alM2489ah == null) {
            c1219alM2489ah = new C1219al();
            c1245j.m2480a(c1219alM2489ah);
        }
        C1792n c1792nM8804L = c1781c.m8804L();
        if (c1792nM8804L != null) {
            c1219alM2489ah.m2556b(c1792nM8804L.m9177a());
            c1219alM2489ah.m2559c(c1792nM8804L.m9179b());
            c1219alM2489ah.m2560d(c1792nM8804L.m9181c());
        }
        m358a((AbstractC1247l) c1245j, c1781c);
    }

    /* JADX INFO: renamed from: a */
    public static void m357a(C1245j c1245j, List<C1781c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<C1781c> it = list.iterator();
        while (it.hasNext()) {
            it.next().m8910t(c1245j.m3241z());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m358a(AbstractC1247l abstractC1247l, C1781c c1781c) {
        String[] strArrM9199l;
        C1245j c1245j = abstractC1247l instanceof C1245j ? (C1245j) abstractC1247l : null;
        if (abstractC1247l == null || c1781c == null) {
            return;
        }
        abstractC1247l.m3236w(c1781c.m8835ad());
        abstractC1247l.m3192e(c1781c.m9113aO());
        abstractC1247l.m3190d(c1781c.m9112aN());
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1781c.m8839ah() + "&opdptype={opdptype}&apk_ptype={apk_ptype}");
        C1792n c1792nM8804L = c1781c.m8804L();
        if (c1792nM8804L != null && (strArrM9199l = c1792nM8804L.m9199l()) != null) {
            for (String str : strArrM9199l) {
                arrayList.add(str);
            }
        }
        C1219al c1219alM2489ah = c1245j.m2489ah();
        if (c1219alM2489ah == null) {
            c1219alM2489ah = new C1219al();
            c1245j.m2480a(c1219alM2489ah);
        }
        c1219alM2489ah.m2537a((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX INFO: renamed from: a */
    public static void m359a(C1248m c1248m, List<C1781c> list) {
        int i = c1248m.f4329j;
        if (i == 1 || i == 3) {
            list.get(0).m8820a(c1248m.f4333n.m3255F());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m360a(String str, C1248m c1248m, a aVar) {
        this.f823a.remove(c1248m.f4321b + c1248m.f4320a);
        if (aVar != null) {
            aVar.mo343a(C0748f.m310a(C0748f.f731m, str));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m361b(String str, boolean z) {
        StringBuilder sb;
        String str2;
        if (z) {
            if (str.contains("hdbtn")) {
                return str.replace("hdbtn=1", "hdbtn=0");
            }
            sb = new StringBuilder();
            sb.append(str);
            str2 = "&hdbtn=0";
        } else {
            if (str.contains("hdbtn")) {
                return str.replace("hdbtn=0", "hdbtn=1");
            }
            sb = new StringBuilder();
            sb.append(str);
            str2 = "&hdbtn=1";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m362b(String str, boolean z, int i, long j) {
        StringBuilder sb;
        String str2;
        String strReplace;
        String strReplaceAll;
        if (z) {
            if (str.contains("shake_show")) {
                strReplace = str.replace("shake_show=0", "shake_show=1");
            } else {
                sb = new StringBuilder();
                sb.append(str);
                str2 = "&shake_show=1";
                sb.append(str2);
                strReplace = sb.toString();
            }
        } else if (str.contains("shake_show")) {
            strReplace = str.replace("shake_show=1", "shake_show=0");
        } else {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "&shake_show=0";
            sb.append(str2);
            strReplace = sb.toString();
        }
        if (strReplace.contains("shake_time")) {
            strReplaceAll = strReplace.replaceAll("(shake_time=[^&]*)", "shake_time=" + (j / 1000));
        } else {
            strReplaceAll = strReplace + "&shake_time=" + (j / 1000);
        }
        if (strReplaceAll.contains("shake_strength")) {
            return strReplaceAll.replaceAll("(shake_strength=[^&]*)", "shake_strength=".concat(String.valueOf(i)));
        }
        return strReplaceAll + "&shake_strength=" + i;
    }

    /* JADX INFO: renamed from: b */
    private void m363b(C1245j c1245j, C1248m c1248m, C1782d c1782d, a aVar) {
        C1175n.m2059a().m2135b(new AnonymousClass1(c1245j, c1248m, c1782d, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static String m364c(String str, boolean z) {
        StringBuilder sb;
        String str2;
        if (z) {
            if (str.contains(C2069a.f13134L)) {
                return str.replace("alecfc=0", "alecfc=1");
            }
            sb = new StringBuilder();
            sb.append(str);
            str2 = "&alecfc=1";
        } else {
            if (str.contains(C2069a.f13134L)) {
                return str.replace("alecfc=1", "alecfc=0");
            }
            sb = new StringBuilder();
            sb.append(str);
            str2 = "&alecfc=0";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m365c(com.anythink.core.common.p055f.C1245j r10, com.anythink.core.common.p055f.C1248m r11, com.anythink.expressad.foundation.p116d.C1782d r12, com.anythink.basead.p016d.p017a.C0755b.a r13) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p016d.p017a.C0755b.m365c(com.anythink.core.common.f.j, com.anythink.core.common.f.m, com.anythink.expressad.foundation.d.d, com.anythink.basead.d.a.b$a):void");
    }

    /* JADX INFO: renamed from: d */
    private static String m366d(String str, boolean z) {
        StringBuilder sb;
        String str2;
        if (z) {
            if (str.contains("hdbtn")) {
                return str.replace("hdbtn=1", "hdbtn=0");
            }
            sb = new StringBuilder();
            sb.append(str);
            str2 = "&hdbtn=0";
        } else {
            if (str.contains("hdbtn")) {
                return str.replace("hdbtn=0", "hdbtn=1");
            }
            sb = new StringBuilder();
            sb.append(str);
            str2 = "&hdbtn=1";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    private void m367d(C1245j c1245j, final C1248m c1248m, C1782d c1782d, final a aVar) {
        C1964a c1964a = new C1964a();
        String strM2484ac = TextUtils.isEmpty(c1245j.m2484ac()) ? c1248m.f4322c : c1245j.m2484ac();
        int i = c1248m.f4329j;
        if (i == 1) {
            C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), strM2484ac, false);
            c1964a.m10385a(false);
        } else if (i == 3) {
            C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), strM2484ac, true);
            c1964a.m10385a(true);
        }
        c1964a.m10380a(c1248m.f4333n.m3253E() == 0 ? 1 : 2);
        c1964a.m10384a("", strM2484ac);
        C2340d c2340dM12000a = C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), strM2484ac, false);
        if (c1248m.f4333n.m3255F() >= 0) {
            c2340dM12000a.m12079a(c1248m.f4333n.m3255F());
        }
        if (c1248m.f4329j == 1) {
            c2340dM12000a.m12094l();
        }
        ArrayList<C1781c> arrayList = c1782d.f10572J;
        if (arrayList != null && arrayList.size() > 0) {
            for (C1781c c1781c : arrayList) {
                if (c1781c != null) {
                    boolean z = C1974a.m10477a().m10480b() && c1248m.f4333n.m3277Q() == 1;
                    boolean z3 = c1248m.f4333n.m3251D() == 0;
                    String strM8801I = c1781c.m8801I();
                    if (!TextUtils.isEmpty(strM8801I)) {
                        c1781c.m8889k(m362b(m364c(strM8801I, z3), z, c1248m.f4333n.m3279R(), c1248m.f4333n.m3281S()));
                    }
                    String strM8808P = c1781c.m8808P();
                    if (!TextUtils.isEmpty(strM8808P)) {
                        c1781c.m8898n(m362b(m364c(strM8808P, z3), z, c1248m.f4333n.m3279R(), c1248m.f4333n.m3281S()));
                    }
                    C1781c.c cVarM8805M = c1781c.m8805M();
                    boolean z4 = c1248m.f4333n.m3245A() == 1;
                    if (cVarM8805M != null) {
                        String strM8957e = cVarM8805M.m8957e();
                        if (!TextUtils.isEmpty(strM8957e)) {
                            cVarM8805M.m8953a(m364c(strM8957e, z4));
                        }
                    }
                }
            }
        }
        c1964a.m10383a(new InterfaceC2334a() { // from class: com.anythink.basead.d.a.b.3
            @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
            /* JADX INFO: renamed from: a */
            public final void mo373a() {
            }

            @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
            /* JADX INFO: renamed from: a */
            public final void mo374a(C1781c c1781c2) {
            }

            @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
            /* JADX INFO: renamed from: a */
            public final void mo375a(String str) {
                C0755b.m354a(C0755b.this, str, c1248m, aVar);
            }

            @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
            /* JADX INFO: renamed from: a */
            public final void mo376a(boolean z5, String str, float f) {
            }

            @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
            /* JADX INFO: renamed from: b */
            public final void mo377b() {
                C1964a c1964a2 = (C1964a) C0755b.this.f823a.remove(c1248m.f4321b + c1248m.f4320a);
                if (c1964a2 == null || !c1964a2.isReady()) {
                    if (aVar != null) {
                        aVar.mo343a(C0748f.m310a(C0748f.f731m, "Resource download fail."));
                        return;
                    }
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo345b(c1964a2);
                }
            }

            @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
            /* JADX INFO: renamed from: b */
            public final void mo378b(String str) {
            }

            @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
            /* JADX INFO: renamed from: c */
            public final void mo379c() {
            }

            @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
            /* JADX INFO: renamed from: d */
            public final void mo380d() {
            }

            @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
            /* JADX INFO: renamed from: e */
            public final void mo381e() {
            }

            @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
            /* JADX INFO: renamed from: f */
            public final void mo382f() {
            }
        });
        if (aVar != null) {
            aVar.mo344a(c1964a);
        }
        this.f823a.put(c1248m.f4321b + c1248m.f4320a, c1964a);
        c1964a.m10382a(c1782d);
    }

    /* JADX INFO: renamed from: e */
    private void m368e(C1245j c1245j, C1248m c1248m, C1782d c1782d, a aVar) {
        C1175n.m2059a().m2135b(new AnonymousClass4(c1245j, c1248m, aVar, c1782d));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m369a(com.anythink.core.common.p055f.C1245j r10, com.anythink.core.common.p055f.C1248m r11, com.anythink.expressad.foundation.p116d.C1782d r12, com.anythink.basead.p016d.p017a.C0755b.a r13) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p016d.p017a.C0755b.m369a(com.anythink.core.common.f.j, com.anythink.core.common.f.m, com.anythink.expressad.foundation.d.d, com.anythink.basead.d.a.b$a):void");
    }
}
