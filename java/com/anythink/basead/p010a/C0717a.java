package com.anythink.basead.p010a;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.anythink.basead.p015c.C0746d;
import com.anythink.basead.p015c.C0751i;
import com.anythink.basead.p024g.C0791b;
import com.anythink.basead.p024g.C0792c;
import com.anythink.core.api.IExHandler;
import com.anythink.core.basead.p043a.C1116a;
import com.anythink.core.common.p050a.C1152d;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1218ak;
import com.anythink.core.common.p055f.C1245j;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p055f.C1261z;
import com.anythink.core.common.p057g.InterfaceC1264b;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.p068b.C1335b;

/* JADX INFO: renamed from: com.anythink.basead.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0717a {

    /* JADX INFO: renamed from: A */
    public static final int f384A = 27;

    /* JADX INFO: renamed from: B */
    public static final int f385B = 28;

    /* JADX INFO: renamed from: C */
    public static final int f386C = 29;

    /* JADX INFO: renamed from: D */
    public static final int f387D = 30;

    /* JADX INFO: renamed from: E */
    public static final int f388E = 31;

    /* JADX INFO: renamed from: F */
    public static final int f389F = 32;

    /* JADX INFO: renamed from: G */
    public static final int f390G = 33;

    /* JADX INFO: renamed from: H */
    public static final int f391H = 34;

    /* JADX INFO: renamed from: I */
    public static final int f392I = 35;

    /* JADX INFO: renamed from: J */
    public static final int f393J = 36;

    /* JADX INFO: renamed from: a */
    public static final int f394a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f395b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f396c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f397d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f398e = 5;

    /* JADX INFO: renamed from: f */
    public static final int f399f = 6;

    /* JADX INFO: renamed from: g */
    public static final int f400g = 7;

    /* JADX INFO: renamed from: h */
    public static final int f401h = 8;

    /* JADX INFO: renamed from: i */
    public static final int f402i = 9;

    /* JADX INFO: renamed from: j */
    public static final int f403j = 10;

    /* JADX INFO: renamed from: k */
    public static final int f404k = 11;

    /* JADX INFO: renamed from: l */
    public static final int f405l = 12;

    /* JADX INFO: renamed from: m */
    public static final int f406m = 13;

    /* JADX INFO: renamed from: n */
    public static final int f407n = 14;

    /* JADX INFO: renamed from: o */
    public static final int f408o = 15;

    /* JADX INFO: renamed from: p */
    public static final int f409p = 16;

    /* JADX INFO: renamed from: q */
    public static final int f410q = 17;

    /* JADX INFO: renamed from: r */
    public static final int f411r = 18;

    /* JADX INFO: renamed from: s */
    public static final int f412s = 19;

    /* JADX INFO: renamed from: t */
    public static final int f413t = 20;

    /* JADX INFO: renamed from: u */
    public static final int f414u = 21;

    /* JADX INFO: renamed from: v */
    public static final int f415v = 22;

    /* JADX INFO: renamed from: w */
    public static final int f416w = 23;

    /* JADX INFO: renamed from: x */
    public static final int f417x = 24;

    /* JADX INFO: renamed from: y */
    public static final int f418y = 25;

    /* JADX INFO: renamed from: z */
    public static final int f419z = 26;

    /* JADX INFO: renamed from: com.anythink.basead.a.a$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f421b;

        public AnonymousClass1(Context context) {
            context = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (abstractC1247l instanceof AbstractC1217aj) {
                C0734g.m256a(context).m258a();
                C0734g.m256a(context).m259a(abstractC1247l.m3229t(), abstractC1247l);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.a$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f423b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0751i f424c;

        public AnonymousClass2(int i, C0751i c0751i) {
            i = i;
            c0751i = c0751i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC1247l abstractC1247l = abstractC1247l;
            if (abstractC1247l instanceof C1261z) {
                C1261z c1261z = (C1261z) abstractC1247l;
                boolean zM128a = abstractC1247l.m3220o() != null ? C0717a.m128a(i, abstractC1247l.m3220o()) : false;
                if (i == 8) {
                    new C0792c(c1261z.m3498Z(), c0751i.f761a, zM128a).mo3639a(0, (InterfaceC1283k) null);
                }
                C0791b c0791b = new C0791b(i, c1261z, c0751i.f761a);
                c0791b.m638a(c0751i.f762b);
                c0791b.mo3639a(0, (InterfaceC1283k) null);
            } else {
                C0736i.m271a(i, (AbstractC1217aj) abstractC1247l, c0751i);
            }
            if (i == 21) {
                AbstractC1247l abstractC1247l2 = abstractC1247l;
                if (abstractC1247l2 instanceof C1245j) {
                    C1245j c1245j = (C1245j) abstractC1247l2;
                    if (c1245j.m3150c() == 1) {
                        if (!C1345i.m4160a(C1175n.m2059a().m2148f().getApplicationContext(), c1245j.m3167F())) {
                            StringBuilder sb = new StringBuilder("check offer installed(Apk Install Broadcast):false,dsp offerid:");
                            sb.append(c1245j.m2486ae());
                            sb.append(",packagename:");
                            sb.append(c1245j.m3167F());
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder("check offer installed(Apk Install Broadcast):true,dsp offerid:");
                        sb2.append(c1245j.m2486ae());
                        sb2.append(",packagename:");
                        sb2.append(c1245j.m3167F());
                        C1152d.m1954a().m1962c(c1245j);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m126a(int i, AbstractC1247l abstractC1247l, @NonNull C0751i c0751i) {
        if (abstractC1247l.mo2424P()) {
            return;
        }
        C1335b.m3998a().m4006a((Runnable) new Runnable() { // from class: com.anythink.basead.a.a.2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f423b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C0751i f424c;

            public AnonymousClass2(int i2, C0751i c0751i2) {
                i = i2;
                c0751i = c0751i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1247l abstractC1247l2 = abstractC1247l;
                if (abstractC1247l2 instanceof C1261z) {
                    C1261z c1261z = (C1261z) abstractC1247l2;
                    boolean zM128a = abstractC1247l2.m3220o() != null ? C0717a.m128a(i, abstractC1247l.m3220o()) : false;
                    if (i == 8) {
                        new C0792c(c1261z.m3498Z(), c0751i.f761a, zM128a).mo3639a(0, (InterfaceC1283k) null);
                    }
                    C0791b c0791b = new C0791b(i, c1261z, c0751i.f761a);
                    c0791b.m638a(c0751i.f762b);
                    c0791b.mo3639a(0, (InterfaceC1283k) null);
                } else {
                    C0736i.m271a(i, (AbstractC1217aj) abstractC1247l2, c0751i);
                }
                if (i == 21) {
                    AbstractC1247l abstractC1247l22 = abstractC1247l;
                    if (abstractC1247l22 instanceof C1245j) {
                        C1245j c1245j = (C1245j) abstractC1247l22;
                        if (c1245j.m3150c() == 1) {
                            if (!C1345i.m4160a(C1175n.m2059a().m2148f().getApplicationContext(), c1245j.m3167F())) {
                                StringBuilder sb = new StringBuilder("check offer installed(Apk Install Broadcast):false,dsp offerid:");
                                sb.append(c1245j.m2486ae());
                                sb.append(",packagename:");
                                sb.append(c1245j.m3167F());
                                return;
                            }
                            StringBuilder sb2 = new StringBuilder("check offer installed(Apk Install Broadcast):true,dsp offerid:");
                            sb2.append(c1245j.m2486ae());
                            sb2.append(",packagename:");
                            sb2.append(c1245j.m3167F());
                            C1152d.m1954a().m1962c(c1245j);
                        }
                    }
                }
            }
        }, 13);
    }

    /* JADX INFO: renamed from: a */
    private static void m127a(AbstractC1247l abstractC1247l) {
        if (abstractC1247l instanceof C1245j) {
            C1245j c1245j = (C1245j) abstractC1247l;
            if (c1245j.m3150c() == 1) {
                if (!C1345i.m4160a(C1175n.m2059a().m2148f().getApplicationContext(), c1245j.m3167F())) {
                    StringBuilder sb = new StringBuilder("check offer installed(Apk Install Broadcast):false,dsp offerid:");
                    sb.append(c1245j.m2486ae());
                    sb.append(",packagename:");
                    sb.append(c1245j.m3167F());
                    return;
                }
                StringBuilder sb2 = new StringBuilder("check offer installed(Apk Install Broadcast):true,dsp offerid:");
                sb2.append(c1245j.m2486ae());
                sb2.append(",packagename:");
                sb2.append(c1245j.m3167F());
                C1152d.m1954a().m1962c(c1245j);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m128a(int r3, com.anythink.core.common.p055f.AbstractC1249n r4) {
        /*
            r0 = 0
            r1 = 1
            if (r3 == r1) goto L25
            r2 = 2
            if (r3 == r2) goto L25
            r2 = 3
            if (r3 == r2) goto L25
            r2 = 4
            if (r3 == r2) goto L25
            r2 = 5
            if (r3 == r2) goto L25
            r2 = 8
            if (r3 == r2) goto L25
            r2 = 9
            if (r3 == r2) goto L1d
            r2 = 35
            if (r3 == r2) goto L25
            goto L2c
        L1d:
            int r3 = r4.m3354j()
            if (r3 != r1) goto L2c
        L23:
            r0 = 1
            goto L2c
        L25:
            int r3 = r4.m3351i()
            if (r3 != r1) goto L2c
            goto L23
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p010a.C0717a.m128a(int, com.anythink.core.common.f.n):boolean");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m129a(Context context, AbstractC1247l abstractC1247l) {
        if (!TextUtils.isEmpty(abstractC1247l.m3163D()) && C1116a.m1729a(context, abstractC1247l.m3163D(), false)) {
            return true;
        }
        if (TextUtils.isEmpty(abstractC1247l.m3167F())) {
            return false;
        }
        return C0721b.m145a(context, abstractC1247l.m3167F());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m130a(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, C0746d c0746d, String str, InterfaceC1264b interfaceC1264b) {
        try {
            IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
            String str2 = (c0746d == null || TextUtils.isEmpty(c0746d.f699c)) ? "" : c0746d.f699c;
            if (iExHandlerM2132b != null) {
                Context applicationContext = context.getApplicationContext();
                iExHandlerM2132b.handleOfferClick(applicationContext, c1248m, abstractC1247l, str, str2, new Runnable() { // from class: com.anythink.basead.a.a.1

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ Context f421b;

                    public AnonymousClass1(Context applicationContext2) {
                        context = applicationContext2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (abstractC1247l instanceof AbstractC1217aj) {
                            C0734g.m256a(context).m258a();
                            C0734g.m256a(context).m259a(abstractC1247l.m3229t(), abstractC1247l);
                        }
                    }
                }, interfaceC1264b);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m131a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                context.getPackageManager().getApplicationInfo(str, 8192);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m132a(AbstractC1247l abstractC1247l, AbstractC1249n abstractC1249n) {
        if (abstractC1247l instanceof C1245j) {
            if (!(abstractC1249n instanceof C1218ak) || ((C1218ak) abstractC1249n).m2508au() != 1) {
                return false;
            }
        } else if (!(abstractC1247l instanceof C1261z) || ((C1261z) abstractC1247l).m3497Y() != 1) {
            return false;
        }
        return true;
    }
}
