package com.anythink.basead.p010a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.anythink.basead.handler.OfferClickHandler;
import com.anythink.basead.p015c.C0743a;
import com.anythink.basead.p015c.C0744b;
import com.anythink.basead.p015c.C0746d;
import com.anythink.basead.p015c.C0751i;
import com.anythink.basead.p016d.p018b.p019a.C0758a;
import com.anythink.china.common.p033a.AbstractC1067a;
import com.anythink.core.api.IExHandler;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.basead.p043a.C1116a;
import com.anythink.core.common.C1325o;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1216ai;
import com.anythink.core.common.p055f.C1218ak;
import com.anythink.core.common.p055f.C1232ay;
import com.anythink.core.common.p055f.C1245j;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p055f.C1261z;
import com.anythink.core.common.p057g.InterfaceC1263a;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.expressad.foundation.p138h.C1875i;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: com.anythink.basead.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0721b {

    /* JADX INFO: renamed from: A */
    public static final int f428A = 8;

    /* JADX INFO: renamed from: B */
    public static final int f429B = 9;

    /* JADX INFO: renamed from: C */
    public static final int f430C = 11;

    /* JADX INFO: renamed from: D */
    public static final int f431D = 12;

    /* JADX INFO: renamed from: E */
    public static final int f432E = 13;

    /* JADX INFO: renamed from: F */
    public static final int f433F = 13;

    /* JADX INFO: renamed from: G */
    public static final int f434G = 14;

    /* JADX INFO: renamed from: H */
    public static final int f435H = 15;

    /* JADX INFO: renamed from: I */
    public static final int f436I = 16;

    /* JADX INFO: renamed from: J */
    public static final int f437J = 17;

    /* JADX INFO: renamed from: K */
    public static final int f438K = 18;

    /* JADX INFO: renamed from: L */
    public static final int f439L = 19;

    /* JADX INFO: renamed from: M */
    public static final int f440M = 20;

    /* JADX INFO: renamed from: N */
    public static final int f441N = 21;

    /* JADX INFO: renamed from: a */
    public static final int f442a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f443b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f444c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f445d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f446e = 6;

    /* JADX INFO: renamed from: f */
    public static final int f447f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f448g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f449h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f450i = 2;

    /* JADX INFO: renamed from: j */
    public static final int f451j = 3;

    /* JADX INFO: renamed from: k */
    public static final int f452k = 4;

    /* JADX INFO: renamed from: l */
    public static final int f453l = 5;

    /* JADX INFO: renamed from: m */
    public static final int f454m = 6;

    /* JADX INFO: renamed from: n */
    public static final int f455n = 7;

    /* JADX INFO: renamed from: o */
    public static final int f456o = 10;

    /* JADX INFO: renamed from: p */
    public static final int f457p = 11;

    /* JADX INFO: renamed from: q */
    public static final int f458q = 12;

    /* JADX INFO: renamed from: r */
    public static final int f459r = 13;

    /* JADX INFO: renamed from: s */
    public static final int f460s = 13;

    /* JADX INFO: renamed from: t */
    public static final int f461t = 1;

    /* JADX INFO: renamed from: u */
    public static final int f462u = 2;

    /* JADX INFO: renamed from: v */
    public static final int f463v = 3;

    /* JADX INFO: renamed from: w */
    public static final int f464w = 4;

    /* JADX INFO: renamed from: x */
    public static final int f465x = 5;

    /* JADX INFO: renamed from: y */
    public static final int f466y = 6;

    /* JADX INFO: renamed from: z */
    public static final int f467z = 7;

    /* JADX INFO: renamed from: O */
    public AbstractC1247l f468O;

    /* JADX INFO: renamed from: P */
    public boolean f469P;

    /* JADX INFO: renamed from: Q */
    public boolean f470Q;

    /* JADX INFO: renamed from: S */
    public Context f472S;

    /* JADX INFO: renamed from: T */
    public boolean f473T;

    /* JADX INFO: renamed from: U */
    public C1248m f474U;

    /* JADX INFO: renamed from: V */
    public b f475V;

    /* JADX INFO: renamed from: W */
    public IOfferClickHandler f476W;

    /* JADX INFO: renamed from: X */
    public a f477X;

    /* JADX INFO: renamed from: Y */
    public boolean f478Y;

    /* JADX INFO: renamed from: ab */
    private final String f481ab = C0721b.class.getSimpleName();

    /* JADX INFO: renamed from: ac */
    private final int f482ac = 0;

    /* JADX INFO: renamed from: ad */
    private final int f483ad = 1;

    /* JADX INFO: renamed from: ae */
    private final int f484ae = 2;

    /* JADX INFO: renamed from: af */
    private final int f485af = 10;

    /* JADX INFO: renamed from: R */
    public boolean f471R = false;

    /* JADX INFO: renamed from: Z */
    public boolean f479Z = false;

    /* JADX INFO: renamed from: aa */
    public b f480aa = new b() { // from class: com.anythink.basead.a.b.1
        public AnonymousClass1() {
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: a */
        public final void mo162a() {
            b bVar;
            C0721b c0721b = C0721b.this;
            if (c0721b.f471R || (bVar = c0721b.f475V) == null) {
                return;
            }
            bVar.mo162a();
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: a */
        public final void mo163a(boolean z) {
            b bVar;
            C0721b c0721b = C0721b.this;
            if (c0721b.f471R || (bVar = c0721b.f475V) == null) {
                return;
            }
            bVar.mo163a(z);
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: a */
        public final boolean mo164a(String str, IOfferClickHandler iOfferClickHandler) {
            b bVar = C0721b.this.f475V;
            if (bVar != null) {
                return bVar.mo164a(str, iOfferClickHandler);
            }
            return false;
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: b */
        public final void mo165b() {
            b bVar;
            C0721b c0721b = C0721b.this;
            if (c0721b.f471R || (bVar = c0721b.f475V) == null) {
                return;
            }
            bVar.mo165b();
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: c */
        public final void mo166c() {
            b bVar;
            C0721b c0721b = C0721b.this;
            if (c0721b.f471R || (bVar = c0721b.f475V) == null) {
                return;
            }
            bVar.mo166c();
        }
    };

    /* JADX INFO: renamed from: com.anythink.basead.a.b$1 */
    public class AnonymousClass1 implements b {
        public AnonymousClass1() {
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: a */
        public final void mo162a() {
            b bVar;
            C0721b c0721b = C0721b.this;
            if (c0721b.f471R || (bVar = c0721b.f475V) == null) {
                return;
            }
            bVar.mo162a();
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: a */
        public final void mo163a(boolean z) {
            b bVar;
            C0721b c0721b = C0721b.this;
            if (c0721b.f471R || (bVar = c0721b.f475V) == null) {
                return;
            }
            bVar.mo163a(z);
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: a */
        public final boolean mo164a(String str, IOfferClickHandler iOfferClickHandler) {
            b bVar = C0721b.this.f475V;
            if (bVar != null) {
                return bVar.mo164a(str, iOfferClickHandler);
            }
            return false;
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: b */
        public final void mo165b() {
            b bVar;
            C0721b c0721b = C0721b.this;
            if (c0721b.f471R || (bVar = c0721b.f475V) == null) {
                return;
            }
            bVar.mo165b();
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: c */
        public final void mo166c() {
            b bVar;
            C0721b c0721b = C0721b.this;
            if (c0721b.f471R || (bVar = c0721b.f475V) == null) {
                return;
            }
            bVar.mo166c();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.b$10 */
    public class AnonymousClass10 implements Runnable {
        public AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = C0721b.this.f480aa;
            if (bVar != null) {
                bVar.mo166c();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.b$2 */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = C0721b.this.f480aa;
            if (bVar != null) {
                bVar.mo166c();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.b$3 */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0751i f489a;

        /* JADX INFO: renamed from: com.anythink.basead.a.b$3$1 */
        public class AnonymousClass1 implements InterfaceC1263a {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f491a;

            /* JADX INFO: renamed from: com.anythink.basead.a.b$3$1$1 */
            public class RunnableC46441 implements Runnable {
                public RunnableC46441() {
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                    C0721b.m140a(C0721b.this, i, anonymousClass3.f489a);
                }
            }

            public AnonymousClass1(int i) {
                i = i;
            }

            @Override // com.anythink.core.common.p057g.InterfaceC1263a
            /* JADX INFO: renamed from: a */
            public final void mo167a(boolean z) {
                if (z) {
                    C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.basead.a.b.3.1.1
                        public RunnableC46441() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            C0721b.m140a(C0721b.this, i, anonymousClass3.f489a);
                        }
                    }, 2, true);
                } else {
                    C0721b.this.f469P = false;
                }
            }
        }

        public AnonymousClass3(C0751i c0751i) {
            this.f489a = c0751i;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            if (C0721b.m146a(C0721b.this, this.f489a)) {
                return;
            }
            int i = C0721b.this.f474U.f4333n.m3371r() != 2 ? C0721b.m150b(C0721b.this, this.f489a) ? 1 : 2 : 0;
            if (i == 1 && C0721b.this.f474U.f4333n.m3371r() == 1) {
                return;
            }
            IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
            if (this.f489a.f771k || C0721b.this.f468O.m3169H() != 4 || 1 != C0721b.this.f474U.f4333n.m3377u() || iExHandlerM2132b == null || i == 1) {
                C0721b.m140a(C0721b.this, i, this.f489a);
            } else {
                C0721b c0721b = C0721b.this;
                iExHandlerM2132b.openApkConfirmDialog(c0721b.f472S, c0721b.f468O, c0721b.f474U, new InterfaceC1263a() { // from class: com.anythink.basead.a.b.3.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ int f491a;

                    /* JADX INFO: renamed from: com.anythink.basead.a.b$3$1$1 */
                    public class RunnableC46441 implements Runnable {
                        public RunnableC46441() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            C0721b.m140a(C0721b.this, i, anonymousClass3.f489a);
                        }
                    }

                    public AnonymousClass1(int i2) {
                        i = i2;
                    }

                    @Override // com.anythink.core.common.p057g.InterfaceC1263a
                    /* JADX INFO: renamed from: a */
                    public final void mo167a(boolean z) {
                        if (z) {
                            C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.basead.a.b.3.1.1
                                public RunnableC46441() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                    C0721b.m140a(C0721b.this, i, anonymousClass3.f489a);
                                }
                            }, 2, true);
                        } else {
                            C0721b.this.f469P = false;
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.b$4 */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f494a;

        public AnonymousClass4(boolean z) {
            this.f494a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = C0721b.this.f480aa;
            if (bVar != null && !this.f494a) {
                bVar.mo165b();
            }
            b bVar2 = C0721b.this.f480aa;
            if (bVar2 != null) {
                bVar2.mo166c();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.b$5 */
    public class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f496a;

        public AnonymousClass5(boolean z) {
            z = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = C0721b.this.f480aa;
            if (bVar != null && !z) {
                bVar.mo165b();
            }
            b bVar2 = C0721b.this.f480aa;
            if (bVar2 != null) {
                bVar2.mo166c();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.b$6 */
    public class AnonymousClass6 implements Runnable {
        public AnonymousClass6() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = C0721b.this.f480aa;
            if (bVar != null) {
                bVar.mo165b();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.b$7 */
    public class AnonymousClass7 implements Runnable {
        public AnonymousClass7() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = C0721b.this.f480aa;
            if (bVar != null) {
                bVar.mo166c();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.b$8 */
    public class AnonymousClass8 implements Runnable {
        public AnonymousClass8() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = C0721b.this.f480aa;
            if (bVar != null) {
                bVar.mo166c();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.b$9 */
    public class AnonymousClass9 implements Runnable {
        public AnonymousClass9() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (TextUtils.isEmpty(C0721b.this.f468O.m3165E())) {
                    Context context = C0721b.this.f472S;
                    Toast.makeText(context, C1345i.m4154a(context, "basead_click_empty", C1875i.f11532g), 0).show();
                } else {
                    Context context2 = C0721b.this.f472S;
                    Toast.makeText(context2, C1345i.m4154a(context2, "basead_click_fail", C1875i.f11532g), 0).show();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public long f502a;

        /* JADX INFO: renamed from: b */
        public long f503b;

        /* JADX INFO: renamed from: c */
        public String f504c;

        /* JADX INFO: renamed from: a */
        public final boolean m168a() {
            return System.currentTimeMillis() - this.f502a <= this.f503b;
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo162a();

        /* JADX INFO: renamed from: a */
        void mo163a(boolean z);

        /* JADX INFO: renamed from: a */
        boolean mo164a(String str, IOfferClickHandler iOfferClickHandler);

        /* JADX INFO: renamed from: b */
        void mo165b();

        /* JADX INFO: renamed from: c */
        void mo166c();
    }

    public C0721b(Context context, C1248m c1248m, AbstractC1247l abstractC1247l) {
        this.f468O = abstractC1247l;
        this.f474U = c1248m;
        this.f472S = context.getApplicationContext();
        AbstractC1249n abstractC1249n = c1248m.f4333n;
        this.f473T = !(abstractC1247l instanceof C1245j) ? !((abstractC1247l instanceof C1261z) && ((C1261z) abstractC1247l).m3497Y() == 1) : !((abstractC1249n instanceof C1218ak) && ((C1218ak) abstractC1249n).m2508au() == 1);
        this.f468O.m3201h(c1248m.f4323d);
        this.f476W = new OfferClickHandler();
        this.f478Y = this.f474U.f4333n.m3285U() != 2;
    }

    /* JADX INFO: renamed from: a */
    private void m139a(int i, C0751i c0751i) throws Throwable {
        String strM148b;
        String strM148b2;
        String strM148b3;
        C0746d c0746dM424a;
        boolean z = true;
        if (i != 1) {
            b bVar = this.f480aa;
            if (bVar != null) {
                bVar.mo162a();
            }
            C1175n.m2059a().m2135b(new AnonymousClass6());
        }
        strM148b = "";
        String strM3165E = this.f468O.m3165E() != null ? this.f468O.m3165E() : "";
        String str = this.f474U.f4323d;
        if (str == null) {
            str = "";
        }
        String strM267a = C0736i.m267a(strM3165E.replaceAll("\\{req_id\\}", str), c0751i, System.currentTimeMillis());
        C0746d c0746d = (m154g() && this.f468O.m3169H() == 4) ? new C0746d("", "", "") : new C0746d(strM267a, "", "");
        m141a(c0746d);
        int iM3169H = this.f468O.m3169H();
        if (iM3169H == 1) {
            if (!strM267a.startsWith("http")) {
                m143a(strM267a, i, c0751i);
                return;
            }
            a aVar = this.f477X;
            boolean z3 = aVar != null && aVar.m168a();
            if (this.f473T) {
                String strM3161C = this.f468O.m3161C();
                if (z3) {
                    strM3161C = this.f477X.f504c;
                }
                if (!TextUtils.isEmpty(strM3161C)) {
                    m143a(strM3161C, i, c0751i);
                    z = false;
                }
            }
            if (z3) {
                strM148b2 = this.f477X.f504c;
            } else {
                strM148b2 = m148b(strM267a);
                if (!TextUtils.isEmpty(strM148b2)) {
                    m142a(strM148b2);
                }
            }
            if (z) {
                if (TextUtils.isEmpty(strM148b2)) {
                    strM148b2 = c0746d.f697a;
                }
                m143a(strM148b2, i, c0751i);
                return;
            }
            return;
        }
        if (iM3169H == 2 || iM3169H == 3) {
            if (m154g() && !TextUtils.isEmpty(this.f468O.m3163D())) {
                strM148b = m148b(strM267a);
                String strM425a = C0758a.m425a(strM148b);
                c0746d.f698b = strM148b;
                c0746d.f699c = strM425a;
                m141a(c0746d);
            }
            if (TextUtils.isEmpty(strM148b)) {
                strM148b = c0746d.f697a;
            }
            m143a(strM148b, i, c0751i);
            return;
        }
        if (iM3169H != 4) {
            m143a(TextUtils.isEmpty("") ? c0746d.f697a : "", i, c0751i);
            return;
        }
        if (m154g() && TextUtils.isEmpty(c0746d.f697a) && (c0746dM424a = C0758a.m424a(this.f474U, this.f468O, strM267a)) != null) {
            c0746d.f697a = c0746dM424a.f697a;
            c0746d.f699c = c0746dM424a.f699c;
        }
        a aVar2 = this.f477X;
        if (aVar2 == null || !aVar2.m168a()) {
            strM148b3 = m148b(c0746d.f697a);
            if (!TextUtils.isEmpty(strM148b3)) {
                m142a(strM148b3);
            }
        } else {
            strM148b3 = this.f477X.f504c;
        }
        c0746d.f698b = strM148b3;
        m141a(c0746d);
        if (TextUtils.isEmpty(strM148b3)) {
            strM148b3 = c0746d.f697a;
        } else {
            c0751i.f770j = true;
        }
        m143a(strM148b3, i, c0751i);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m140a(C0721b c0721b, int i, C0751i c0751i) throws Throwable {
        String strM148b;
        String strM148b2;
        String strM148b3;
        C0746d c0746dM424a;
        boolean z = true;
        if (i != 1) {
            b bVar = c0721b.f480aa;
            if (bVar != null) {
                bVar.mo162a();
            }
            C1175n.m2059a().m2135b(c0721b.new AnonymousClass6());
        }
        strM148b = "";
        String strM3165E = c0721b.f468O.m3165E() != null ? c0721b.f468O.m3165E() : "";
        String str = c0721b.f474U.f4323d;
        if (str == null) {
            str = "";
        }
        String strM267a = C0736i.m267a(strM3165E.replaceAll("\\{req_id\\}", str), c0751i, System.currentTimeMillis());
        C0746d c0746d = (c0721b.m154g() && c0721b.f468O.m3169H() == 4) ? new C0746d("", "", "") : new C0746d(strM267a, "", "");
        c0721b.m141a(c0746d);
        int iM3169H = c0721b.f468O.m3169H();
        if (iM3169H == 1) {
            if (!strM267a.startsWith("http")) {
                c0721b.m143a(strM267a, i, c0751i);
                return;
            }
            a aVar = c0721b.f477X;
            boolean z3 = aVar != null && aVar.m168a();
            if (c0721b.f473T) {
                String strM3161C = c0721b.f468O.m3161C();
                if (z3) {
                    strM3161C = c0721b.f477X.f504c;
                }
                if (!TextUtils.isEmpty(strM3161C)) {
                    c0721b.m143a(strM3161C, i, c0751i);
                    z = false;
                }
            }
            if (z3) {
                strM148b2 = c0721b.f477X.f504c;
            } else {
                strM148b2 = c0721b.m148b(strM267a);
                if (!TextUtils.isEmpty(strM148b2)) {
                    c0721b.m142a(strM148b2);
                }
            }
            if (z) {
                if (TextUtils.isEmpty(strM148b2)) {
                    strM148b2 = c0746d.f697a;
                }
                c0721b.m143a(strM148b2, i, c0751i);
                return;
            }
            return;
        }
        if (iM3169H == 2 || iM3169H == 3) {
            if (c0721b.m154g() && !TextUtils.isEmpty(c0721b.f468O.m3163D())) {
                strM148b = c0721b.m148b(strM267a);
                String strM425a = C0758a.m425a(strM148b);
                c0746d.f698b = strM148b;
                c0746d.f699c = strM425a;
                c0721b.m141a(c0746d);
            }
            if (TextUtils.isEmpty(strM148b)) {
                strM148b = c0746d.f697a;
            }
            c0721b.m143a(strM148b, i, c0751i);
            return;
        }
        if (iM3169H != 4) {
            c0721b.m143a(TextUtils.isEmpty("") ? c0746d.f697a : "", i, c0751i);
            return;
        }
        if (c0721b.m154g() && TextUtils.isEmpty(c0746d.f697a) && (c0746dM424a = C0758a.m424a(c0721b.f474U, c0721b.f468O, strM267a)) != null) {
            c0746d.f697a = c0746dM424a.f697a;
            c0746d.f699c = c0746dM424a.f699c;
        }
        a aVar2 = c0721b.f477X;
        if (aVar2 == null || !aVar2.m168a()) {
            strM148b3 = c0721b.m148b(c0746d.f697a);
            if (!TextUtils.isEmpty(strM148b3)) {
                c0721b.m142a(strM148b3);
            }
        } else {
            strM148b3 = c0721b.f477X.f504c;
        }
        c0746d.f698b = strM148b3;
        c0721b.m141a(c0746d);
        if (TextUtils.isEmpty(strM148b3)) {
            strM148b3 = c0746d.f697a;
        } else {
            c0751i.f770j = true;
        }
        c0721b.m143a(strM148b3, i, c0751i);
    }

    /* JADX INFO: renamed from: a */
    private void m141a(C0746d c0746d) {
        C0729c.m232a().m234a(this.f468O.mo2426d(), this.f468O.m3229t(), c0746d);
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m142a(String str) {
        if (this.f477X == null) {
            this.f477X = new a();
        }
        a aVar = this.f477X;
        aVar.f504c = str;
        aVar.f503b = this.f474U.f4333n.m3283T();
        this.f477X.f502a = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0131  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m143a(java.lang.String r8, int r9, com.anythink.basead.p015c.C0751i r10) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p010a.C0721b.m143a(java.lang.String, int, com.anythink.basead.c.i):void");
    }

    /* JADX INFO: renamed from: a */
    private void m144a(String str, C0751i c0751i) {
        if (c0751i.f770j) {
            if (TextUtils.isEmpty(str)) {
                C1350n.m4204a(str);
                return;
            } else if (C0717a.m130a(this.f472S, this.f474U, this.f468O, m152e(), str, new C0735h())) {
                return;
            }
        }
        C1350n.m4204a(str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m145a(Context context, String str) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                return false;
            }
            launchIntentForPackage.setFlags(268435456);
            context.startActivity(launchIntentForPackage);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m146a(C0721b c0721b, C0751i c0751i) {
        c0751i.f769i = new C0744b();
        C0746d c0746dM152e = c0721b.m152e();
        c0751i.f769i.f690a = c0746dM152e != null ? c0746dM152e.f699c : "";
        if (!TextUtils.isEmpty(c0721b.f468O.m3227s())) {
            String strM3227s = c0721b.f468O.m3227s();
            String str = c0721b.f474U.f4323d;
            String strReplaceAll = strM3227s.replaceAll("\\{req_id\\}", str != null ? str : "");
            if (C1116a.m1729a(c0721b.f472S, strReplaceAll, false)) {
                C0743a c0743a = c0751i.f767g;
                if (c0743a != null) {
                    c0743a.f688i = true;
                }
                c0721b.m149b(c0751i);
                C1322e.m3896a(c0721b.f474U, c0721b.f468O, strReplaceAll, "1", 1);
                b bVar = c0721b.f480aa;
                if (bVar != null) {
                    bVar.mo162a();
                }
                b bVar2 = c0721b.f480aa;
                if (bVar2 != null) {
                    bVar2.mo163a(true);
                }
                c0721b.f469P = false;
                C1175n.m2059a().m2135b(c0721b.new AnonymousClass4(false));
                return true;
            }
            C1322e.m3896a(c0721b.f474U, c0721b.f468O, strReplaceAll, "0", 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m147a(C0751i c0751i, boolean z) {
        c0751i.f769i = new C0744b();
        C0746d c0746dM152e = m152e();
        c0751i.f769i.f690a = c0746dM152e != null ? c0746dM152e.f699c : "";
        if (!TextUtils.isEmpty(this.f468O.m3227s())) {
            String strM3227s = this.f468O.m3227s();
            String str = this.f474U.f4323d;
            String strReplaceAll = strM3227s.replaceAll("\\{req_id\\}", str != null ? str : "");
            if (C1116a.m1729a(this.f472S, strReplaceAll, false)) {
                C0743a c0743a = c0751i.f767g;
                if (c0743a != null) {
                    c0743a.f688i = true;
                }
                m149b(c0751i);
                C1322e.m3896a(this.f474U, this.f468O, strReplaceAll, "1", 1);
                b bVar = this.f480aa;
                if (bVar != null && !z) {
                    bVar.mo162a();
                }
                b bVar2 = this.f480aa;
                if (bVar2 != null) {
                    bVar2.mo163a(true);
                }
                this.f469P = false;
                C1175n.m2059a().m2135b(new AnonymousClass4(z));
                return true;
            }
            C1322e.m3896a(this.f474U, this.f468O, strReplaceAll, "0", 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private String m148b(String str) throws Throwable {
        String str2;
        boolean z = false;
        String headerField = str;
        for (int i = 0; i < 10; i++) {
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(headerField).openConnection();
                    try {
                        httpURLConnection2.setRequestMethod("GET");
                        httpURLConnection2.setInstanceFollowRedirects(false);
                        AbstractC1249n abstractC1249n = this.f474U.f4333n;
                        if (abstractC1249n != null && C0717a.m128a(9, abstractC1249n)) {
                            String strM4073i = C1341e.m4073i();
                            if (!TextUtils.isEmpty(strM4073i)) {
                                httpURLConnection2.addRequestProperty("User-Agent", strM4073i);
                            }
                        }
                        httpURLConnection2.setConnectTimeout(30000);
                        httpURLConnection2.connect();
                        int responseCode = httpURLConnection2.getResponseCode();
                        if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                            headerField = httpURLConnection2.getHeaderField("Location");
                            if (!C1116a.m1731b(headerField) && !headerField.contains(AbstractC1067a.f2406g) && headerField.startsWith("http")) {
                                httpURLConnection2.disconnect();
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                            }
                            z = true;
                        }
                        if (z || responseCode == 200) {
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            return headerField;
                        }
                        C1322e.m3897a(this.f474U, this.f468O, str, headerField, String.valueOf(responseCode), "");
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        return "";
                    } catch (Exception e) {
                        e = e;
                        str2 = headerField;
                        httpURLConnection = httpURLConnection2;
                        C1322e.m3897a(this.f474U, this.f468O, str, str2, "", e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str2 = headerField;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    private void m149b(C0751i c0751i) {
        if (this.f478Y || !this.f479Z) {
            this.f479Z = true;
            C0717a.m126a(9, this.f468O, c0751i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m150b(C0721b c0721b, C0751i c0751i) {
        return c0721b.m151b(c0751i, false);
    }

    /* JADX INFO: renamed from: b */
    private boolean m151b(C0751i c0751i, boolean z) {
        c0751i.f769i = new C0744b();
        C0746d c0746dM152e = m152e();
        c0751i.f769i.f690a = c0746dM152e != null ? c0746dM152e.f699c : "";
        C0717a.m126a(23, this.f468O, c0751i);
        if (!TextUtils.isEmpty(this.f468O.m3163D())) {
            String strM3163D = this.f468O.m3163D();
            String str = this.f474U.f4323d;
            String strReplaceAll = strM3163D.replaceAll("\\{req_id\\}", str != null ? str : "");
            C1325o.m3942a().m3950a(this.f468O);
            if (C1116a.m1729a(this.f472S, strReplaceAll, false)) {
                C0743a c0743a = c0751i.f767g;
                if (c0743a != null) {
                    c0743a.f688i = true;
                }
                m149b(c0751i);
                C1322e.m3896a(this.f474U, this.f468O, strReplaceAll, "1", 0);
                b bVar = this.f480aa;
                if (bVar != null && !z) {
                    bVar.mo162a();
                }
                b bVar2 = this.f480aa;
                if (bVar2 != null) {
                    bVar2.mo163a(true);
                }
                this.f469P = false;
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.basead.a.b.5

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ boolean f496a;

                    public AnonymousClass5(boolean z3) {
                        z = z3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar3 = C0721b.this.f480aa;
                        if (bVar3 != null && !z) {
                            bVar3.mo165b();
                        }
                        b bVar22 = C0721b.this.f480aa;
                        if (bVar22 != null) {
                            bVar22.mo166c();
                        }
                    }
                });
                C0717a.m126a(24, this.f468O, c0751i);
                return true;
            }
            C1325o.m3942a().m3951b(this.f468O);
            C0717a.m126a(C0717a.m131a(this.f472S, this.f468O.m3167F()) ? 28 : 29, this.f468O, c0751i);
            C1322e.m3896a(this.f474U, this.f468O, strReplaceAll, "0", 0);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    private C0746d m152e() {
        return C0729c.m232a().m233a(this.f468O.mo2426d(), this.f468O.m3229t());
    }

    /* JADX INFO: renamed from: f */
    private boolean m153f() {
        C1232ay c1232ayM2104J = C1175n.m2059a().m2104J();
        boolean z = c1232ayM2104J.m2865b() == 1;
        boolean z3 = c1232ayM2104J.m2863a() == 1;
        String strM4079l = C1341e.m4079l();
        if (TextUtils.isEmpty(strM4079l)) {
            C1322e.m3895a(this.f474U, this.f468O, 5);
            return false;
        }
        if (!z) {
            C1322e.m3895a(this.f474U, this.f468O, 3);
            return false;
        }
        if (!z3) {
            C1322e.m3895a(this.f474U, this.f468O, 1);
            return false;
        }
        String strM3202i = this.f468O.m3202i();
        String strM3205j = this.f468O.m3205j();
        if (TextUtils.isEmpty(strM3202i) || TextUtils.isEmpty(strM3205j)) {
            C1322e.m3895a(this.f474U, this.f468O, 4);
            return false;
        }
        try {
            Object objM4056c = C1341e.m4056c(strM4079l);
            Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
            Object objNewInstance = cls.newInstance();
            cls.getField("userName").set(objNewInstance, strM3202i);
            cls.getField("path").set(objNewInstance, strM3205j);
            cls.getField("miniprogramType").set(objNewInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
            Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(objM4056c, objNewInstance);
            C1322e.m3895a(this.f474U, this.f468O, 0);
            return true;
        } catch (Throwable th) {
            C1248m c1248m = this.f474U;
            AbstractC1247l abstractC1247l = this.f468O;
            th.getMessage();
            C1322e.m3895a(c1248m, abstractC1247l, 2);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    private boolean m154g() {
        if (this.f468O.m3225r() == 42) {
            return true;
        }
        AbstractC1247l abstractC1247l = this.f468O;
        return (abstractC1247l instanceof C1216ai) && ((C1216ai) abstractC1247l).m2451a() == 42;
    }

    /* JADX INFO: renamed from: h */
    private void m155h() {
        this.f470Q = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m156a(b bVar) {
        this.f475V = bVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m157a(C0751i c0751i) {
        if (this.f469P) {
            return;
        }
        this.f469P = true;
        this.f470Q = false;
        C1335b.m3998a().m4007a((Runnable) new AnonymousClass3(c0751i), 2, true);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m158a() {
        return this.f469P;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1247l m159b() {
        return this.f468O;
    }

    /* JADX INFO: renamed from: c */
    public final C1248m m160c() {
        return this.f474U;
    }

    /* JADX INFO: renamed from: d */
    public final void m161d() {
        this.f471R = true;
    }
}
