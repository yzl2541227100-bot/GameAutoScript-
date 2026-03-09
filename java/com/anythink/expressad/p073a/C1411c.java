package com.anythink.expressad.p073a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a;
import com.anythink.expressad.foundation.p120g.p135g.C1863c;
import com.anythink.expressad.p073a.p074a.C1406a;
import com.anythink.expressad.p085c.InterfaceC1482b;
import com.anythink.expressad.p089e.InterfaceC1491b;
import java.io.Serializable;

/* JADX INFO: renamed from: com.anythink.expressad.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1411c extends C1412d {

    /* JADX INFO: renamed from: i */
    private static final boolean f6303i = true;

    /* JADX INFO: renamed from: l */
    private int f6307l;

    /* JADX INFO: renamed from: o */
    private C1863c f6310o;

    /* JADX INFO: renamed from: p */
    private C1416h f6311p;

    /* JADX INFO: renamed from: j */
    private int f6305j = 0;

    /* JADX INFO: renamed from: k */
    private String f6306k = null;

    /* JADX INFO: renamed from: a */
    public b f6304a = null;

    /* JADX INFO: renamed from: m */
    private InterfaceC1413e f6308m = null;

    /* JADX INFO: renamed from: n */
    private boolean f6309n = true;

    /* JADX INFO: renamed from: q */
    private Handler f6312q = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.anythink.expressad.a.c$1 */
    public class AnonymousClass1 implements AbstractRunnableC1861a.b {

        /* JADX INFO: renamed from: com.anythink.expressad.a.c$1$1 */
        public class RunnableC46711 implements Runnable {
            public RunnableC46711() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (C1411c.this.f6308m != null) {
                    if (C1411c.this.f6304a.m5291g()) {
                        InterfaceC1413e unused = C1411c.this.f6308m;
                    } else {
                        InterfaceC1413e unused2 = C1411c.this.f6308m;
                        C1411c.this.f6304a.m5292h();
                    }
                }
            }
        }

        private AnonymousClass1() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a.b
        /* JADX INFO: renamed from: a */
        public final void mo5268a(AbstractRunnableC1861a.a aVar) {
            if (aVar == AbstractRunnableC1861a.a.FINISH && C1411c.this.f6309n) {
                C1411c.this.f6312q.post(new Runnable() { // from class: com.anythink.expressad.a.c.1.1
                    public RunnableC46711() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (C1411c.this.f6308m != null) {
                            if (C1411c.this.f6304a.m5291g()) {
                                InterfaceC1413e unused = C1411c.this.f6308m;
                            } else {
                                InterfaceC1413e unused2 = C1411c.this.f6308m;
                                C1411c.this.f6304a.m5292h();
                            }
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.a.c$a */
    public class a extends AbstractRunnableC1861a {
        private a() {
        }

        private /* synthetic */ a(C1411c c1411c, byte b) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:149:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x0101 A[Catch: Exception -> 0x01de, TryCatch #2 {Exception -> 0x01de, blocks: (B:116:0x0001, B:120:0x0015, B:123:0x001e, B:130:0x0085, B:160:0x00cb, B:162:0x00d1, B:164:0x00d9, B:167:0x00e2, B:169:0x00f1, B:170:0x00f5, B:168:0x00ea, B:171:0x00f9, B:172:0x0101, B:174:0x0107, B:175:0x010c, B:177:0x0118, B:178:0x0122, B:181:0x0138, B:147:0x00b2, B:150:0x00b8, B:185:0x0140, B:186:0x0143, B:187:0x0144, B:189:0x0156, B:192:0x0169, B:194:0x0179, B:195:0x018f, B:203:0x01cf, B:196:0x0193, B:198:0x019b, B:201:0x01ac, B:200:0x01a5, B:202:0x01b8), top: B:210:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:175:0x010c A[Catch: Exception -> 0x01de, TryCatch #2 {Exception -> 0x01de, blocks: (B:116:0x0001, B:120:0x0015, B:123:0x001e, B:130:0x0085, B:160:0x00cb, B:162:0x00d1, B:164:0x00d9, B:167:0x00e2, B:169:0x00f1, B:170:0x00f5, B:168:0x00ea, B:171:0x00f9, B:172:0x0101, B:174:0x0107, B:175:0x010c, B:177:0x0118, B:178:0x0122, B:181:0x0138, B:147:0x00b2, B:150:0x00b8, B:185:0x0140, B:186:0x0143, B:187:0x0144, B:189:0x0156, B:192:0x0169, B:194:0x0179, B:195:0x018f, B:203:0x01cf, B:196:0x0193, B:198:0x019b, B:201:0x01ac, B:200:0x01a5, B:202:0x01b8), top: B:210:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:185:0x0140 A[Catch: Exception -> 0x01de, TryCatch #2 {Exception -> 0x01de, blocks: (B:116:0x0001, B:120:0x0015, B:123:0x001e, B:130:0x0085, B:160:0x00cb, B:162:0x00d1, B:164:0x00d9, B:167:0x00e2, B:169:0x00f1, B:170:0x00f5, B:168:0x00ea, B:171:0x00f9, B:172:0x0101, B:174:0x0107, B:175:0x010c, B:177:0x0118, B:178:0x0122, B:181:0x0138, B:147:0x00b2, B:150:0x00b8, B:185:0x0140, B:186:0x0143, B:187:0x0144, B:189:0x0156, B:192:0x0169, B:194:0x0179, B:195:0x018f, B:203:0x01cf, B:196:0x0193, B:198:0x019b, B:201:0x01ac, B:200:0x01a5, B:202:0x01b8), top: B:210:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:218:0x009e A[EDGE_INSN: B:218:0x009e->B:145:0x009e BREAK  A[LOOP:0: B:118:0x000b->B:181:0x0138], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:220:0x0107 A[SYNTHETIC] */
        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo5269a() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 512
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.p073a.C1411c.a.mo5269a():void");
        }

        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
        /* JADX INFO: renamed from: b */
        public final void mo5270b() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
        /* JADX INFO: renamed from: c */
        public final void mo5271c() {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.a.c$b */
    public static class b implements InterfaceC1491b, Serializable {

        /* JADX INFO: renamed from: a */
        public static final int f6316a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f6317b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f6318c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f6319d = 4;

        /* JADX INFO: renamed from: e */
        private static final long f6320e = 1;

        /* JADX INFO: renamed from: f */
        private boolean f6321f;

        /* JADX INFO: renamed from: g */
        private String f6322g;

        /* JADX INFO: renamed from: h */
        private int f6323h;

        /* JADX INFO: renamed from: i */
        private String f6324i;

        /* JADX INFO: renamed from: j */
        private String f6325j;

        /* JADX INFO: renamed from: k */
        private boolean f6326k;

        /* JADX INFO: renamed from: l */
        private String f6327l;

        /* JADX INFO: renamed from: m */
        private String f6328m;

        /* JADX INFO: renamed from: n */
        private String f6329n;

        /* JADX INFO: renamed from: o */
        private int f6330o;

        /* JADX INFO: renamed from: p */
        private boolean f6331p;

        /* JADX INFO: renamed from: q */
        private int f6332q;

        /* JADX INFO: renamed from: f */
        private void m5272f(String str) {
            this.f6325j = str;
        }

        /* JADX INFO: renamed from: l */
        private boolean m5273l() {
            return this.f6331p;
        }

        /* JADX INFO: renamed from: m */
        private String m5274m() {
            return this.f6325j;
        }

        /* JADX INFO: renamed from: a */
        public final int m5275a() {
            return this.f6332q;
        }

        /* JADX INFO: renamed from: a */
        public final void m5276a(int i) {
            this.f6332q = i;
        }

        /* JADX INFO: renamed from: a */
        public final void m5277a(String str) {
            this.f6329n = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m5278a(boolean z) {
            this.f6321f = z;
        }

        /* JADX INFO: renamed from: b */
        public final void m5279b() {
            this.f6331p = true;
        }

        /* JADX INFO: renamed from: b */
        public final void m5280b(int i) {
            this.f6330o = i;
        }

        /* JADX INFO: renamed from: b */
        public final void m5281b(String str) {
            this.f6328m = str;
        }

        /* JADX INFO: renamed from: b */
        public final void m5282b(boolean z) {
            this.f6326k = z;
        }

        /* JADX INFO: renamed from: c */
        public final int m5283c() {
            return this.f6330o;
        }

        /* JADX INFO: renamed from: c */
        public final void m5284c(int i) {
            this.f6323h = i;
        }

        /* JADX INFO: renamed from: c */
        public final void m5285c(String str) {
            this.f6327l = str;
        }

        /* JADX INFO: renamed from: d */
        public final String m5286d() {
            return this.f6329n;
        }

        /* JADX INFO: renamed from: d */
        public final void m5287d(String str) {
            this.f6322g = str;
        }

        /* JADX INFO: renamed from: e */
        public final String m5288e() {
            return this.f6328m;
        }

        /* JADX INFO: renamed from: e */
        public final void m5289e(String str) {
            this.f6324i = str;
        }

        /* JADX INFO: renamed from: f */
        public final String m5290f() {
            return this.f6327l;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m5291g() {
            return this.f6321f;
        }

        /* JADX INFO: renamed from: h */
        public final String m5292h() {
            return this.f6322g;
        }

        /* JADX INFO: renamed from: i */
        public final int m5293i() {
            return this.f6323h;
        }

        /* JADX INFO: renamed from: j */
        public final String m5294j() {
            return this.f6324i;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m5295k() {
            return this.f6326k;
        }
    }

    public C1411c(Context context) {
        this.f6310o = new C1863c(context, 2);
        this.f6311p = new C1416h(context);
    }

    /* JADX INFO: renamed from: a */
    private void m5257a(String str, String str2, C1781c c1781c, InterfaceC1413e interfaceC1413e) {
        this.f6306k = new String(c1781c.m8835ad());
        this.f6308m = interfaceC1413e;
        this.f6304a = null;
        this.f6311p.m5366a(c1781c.m8835ad(), interfaceC1413e, "5".equals(c1781c.m8833ab()) || "6".equals(c1781c.m8833ab()), str, c1781c.m10146aZ(), str2, null, c1781c, true, false, C1406a.f6272l);
    }

    /* JADX INFO: renamed from: a */
    private void m5258a(String str, String str2, C1781c c1781c, InterfaceC1413e interfaceC1413e, InterfaceC1482b interfaceC1482b) {
        this.f6306k = new String(c1781c.m8835ad());
        this.f6308m = interfaceC1413e;
        this.f6304a = null;
        this.f6311p.m5366a(c1781c.m8835ad(), interfaceC1413e, "5".equals(c1781c.m8833ab()) || "6".equals(c1781c.m8833ab()), str, c1781c.m10146aZ(), str2, interfaceC1482b, c1781c, true, false, C1406a.f6272l);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m5262d(C1411c c1411c) {
        int i = c1411c.f6305j;
        c1411c.f6305j = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: a */
    public final void m5265a(String str, String str2, C1781c c1781c, InterfaceC1413e interfaceC1413e, String str3, boolean z, boolean z3, int i) {
        String strM10146aZ;
        boolean z4;
        this.f6306k = str3;
        this.f6308m = interfaceC1413e;
        this.f6304a = null;
        this.f6307l = i;
        if (c1781c != null) {
            boolean z5 = "5".equals(c1781c.m8833ab()) || "6".equals(c1781c.m8833ab());
            strM10146aZ = c1781c.m10146aZ();
            z4 = z5;
        } else {
            strM10146aZ = "";
            z4 = false;
        }
        this.f6311p.m5366a(str3, interfaceC1413e, z4, str, strM10146aZ, str2, null, c1781c, z, z3, i);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5266a() {
        return this.f6309n;
    }

    @Override // com.anythink.expressad.p073a.C1412d
    /* JADX INFO: renamed from: b */
    public final void mo5267b() {
        this.f6309n = false;
    }
}
