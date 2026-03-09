package com.anythink.expressad.p073a;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1172k;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p114c.C1778c;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1784f;
import com.anythink.expressad.foundation.p138h.C1885s;
import com.anythink.expressad.foundation.p138h.C1889w;
import com.anythink.expressad.out.C1935j;
import com.anythink.expressad.out.C1941p;
import com.anythink.expressad.out.InterfaceC1931f;
import com.anythink.expressad.out.LoadingActivity;
import com.anythink.expressad.p073a.C1411c;
import com.anythink.expressad.p073a.p074a.C1406a;
import com.anythink.expressad.p086d.C1483a;
import com.anythink.expressad.p086d.C1486b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.anythink.expressad.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1405a {

    /* JADX INFO: renamed from: a */
    public static final String f6240a = "Anythink SDK M";

    /* JADX INFO: renamed from: b */
    public static boolean f6241b = false;

    /* JADX INFO: renamed from: c */
    public static Map<String, Long> f6242c = new HashMap();

    /* JADX INFO: renamed from: d */
    public static Set<String> f6243d = new HashSet();

    /* JADX INFO: renamed from: e */
    public static final String f6244e = "2";

    /* JADX INFO: renamed from: f */
    private static final int f6245f = 1;

    /* JADX INFO: renamed from: g */
    private String f6246g;

    /* JADX INFO: renamed from: h */
    private long f6247h;

    /* JADX INFO: renamed from: i */
    private C1778c f6248i;

    /* JADX INFO: renamed from: j */
    private Context f6249j;

    /* JADX INFO: renamed from: k */
    private C1411c f6250k;

    /* JADX INFO: renamed from: l */
    private InterfaceC1931f f6251l;

    /* JADX INFO: renamed from: n */
    private C1483a f6253n;

    /* JADX INFO: renamed from: o */
    private boolean f6254o;

    /* JADX INFO: renamed from: r */
    private boolean f6257r;

    /* JADX INFO: renamed from: m */
    private C1941p.c f6252m = null;

    /* JADX INFO: renamed from: p */
    private boolean f6255p = false;

    /* JADX INFO: renamed from: q */
    private boolean f6256q = true;

    /* JADX INFO: renamed from: com.anythink.expressad.a.a$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f6258a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1935j f6259b;

        public AnonymousClass1(boolean z, C1935j c1935j) {
            z = z;
            c1935j = c1935j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (z && !C1405a.f6241b && C1404a.f6228o) {
                C1405a.m5188a(C1405a.this);
            }
            if (C1405a.this.f6252m == null || C1405a.f6241b || !C1404a.f6228o) {
                return;
            }
            C1405a.this.f6252m.mo10055b(c1935j);
        }
    }

    public C1405a(Context context, String str) {
        this.f6248i = null;
        this.f6249j = null;
        C1486b.m6002a();
        C1483a c1483aM6007b = C1486b.m6007b();
        this.f6253n = c1483aM6007b;
        if (c1483aM6007b == null) {
            C1486b.m6002a();
            this.f6253n = C1486b.m6010c();
        }
        this.f6254o = this.f6253n.m5977t();
        Context applicationContext = context.getApplicationContext();
        this.f6249j = applicationContext;
        this.f6246g = str;
        if (this.f6248i == null) {
            this.f6248i = C1778c.m8584a(applicationContext);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5184a(int i, String str, C1781c c1781c, C1941p.c cVar) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (i == 2) {
                C1885s.m9805a(this.f6249j, str, c1781c, cVar);
            } else {
                C1885s.m9806a(this.f6249j, str, cVar);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5185a(Context context, C1781c c1781c, String str, String str2, boolean z) {
        if (context == null) {
            return;
        }
        new C1411c(context.getApplicationContext()).m5265a("2", str, c1781c, null, str2, false, z, C1406a.f6268h);
    }

    /* JADX INFO: renamed from: a */
    public static void m5186a(Context context, C1781c c1781c, String str, String str2, boolean z, boolean z3, int i) {
        if (context == null) {
            return;
        }
        new C1411c(context.getApplicationContext()).m5265a("2", str, c1781c, null, str2, z, z3, i);
    }

    /* JADX INFO: renamed from: a */
    public static void m5187a(Context context, C1781c c1781c, String str, String[] strArr, boolean z) {
        if (context == null || c1781c == null || TextUtils.isEmpty(str) || strArr == null) {
            return;
        }
        C1411c c1411c = new C1411c(context.getApplicationContext());
        for (String str2 : strArr) {
            c1411c.m5265a("2", str, c1781c, null, str2, false, z, C1406a.f6268h);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5188a(C1405a c1405a) {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            C1172k.m2050a(c1405a.f6249j).m2053a(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5189a(C1411c.b bVar, C1781c c1781c, boolean z) {
        if (c1781c == null || bVar == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f6247h;
            C1784f c1784f = new C1784f();
            c1784f.m9070i(c1781c.m8832aa());
            c1784f.m9057a();
            c1784f.m9069h(String.valueOf(jCurrentTimeMillis));
            c1784f.m9068g(c1781c.m10146aZ());
            c1784f.m9064d(bVar.m5283c());
            if (!TextUtils.isEmpty(bVar.m5294j())) {
                c1784f.m9067f(URLEncoder.encode(bVar.m5294j(), "utf-8"));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6247h / 1000);
            c1784f.m9061b(sb.toString());
            c1784f.m9058a(Integer.parseInt(c1781c.m8834ac()));
            c1784f.m9060b(c1781c.m8809Q());
            c1784f.m9059a(this.f6246g);
            c1784f.m9064d(bVar.m5283c());
            if (!TextUtils.isEmpty(bVar.m5294j())) {
                c1784f.m9067f(URLEncoder.encode(bVar.m5294j(), "utf-8"));
            }
            if (this.f6254o) {
                c1784f.m9062c(bVar.m5275a());
                if (!TextUtils.isEmpty(bVar.m5286d())) {
                    c1784f.m9065d(URLEncoder.encode(bVar.m5286d(), "utf-8"));
                }
                if (!TextUtils.isEmpty(bVar.m5290f())) {
                    c1784f.m9066e(URLEncoder.encode(bVar.m5290f(), "UTF-8"));
                }
                if (!TextUtils.isEmpty(bVar.m5288e())) {
                    c1784f.m9063c(URLEncoder.encode(bVar.m5288e(), "utf-8"));
                }
            }
            if (z) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(c1784f);
            C1889w.m9868b(C1784f.m9034a(arrayList));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x00ad A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:91:0x0000, B:98:0x000c, B:101:0x0022, B:103:0x0028, B:106:0x0032, B:108:0x0036, B:110:0x0048, B:113:0x0052, B:115:0x005c, B:117:0x0066, B:120:0x0076, B:128:0x00ad, B:129:0x00b6, B:132:0x00bc, B:133:0x00c0, B:153:0x010c, B:155:0x011a, B:157:0x0122, B:161:0x012a, B:156:0x011f, B:124:0x0087, B:126:0x0091, B:136:0x00c8, B:137:0x00d3, B:140:0x00d9, B:142:0x00e0, B:144:0x00e6, B:146:0x00ea, B:148:0x00f0, B:150:0x00f8, B:152:0x0107, B:164:0x0134, B:166:0x013b), top: B:171:0x0000 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5190a(com.anythink.expressad.foundation.p116d.C1781c r7, com.anythink.expressad.p073a.C1411c.b r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.p073a.C1405a.m5190a(com.anythink.expressad.foundation.d.c, com.anythink.expressad.a.c$b, boolean, boolean):void");
    }

    /* JADX INFO: renamed from: a */
    private void m5191a(C1781c c1781c, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m5186a(this.f6249j, c1781c, this.f6246g, str, true, false, C1406a.f6271k);
    }

    /* JADX INFO: renamed from: a */
    private void m5192a(InterfaceC1931f interfaceC1931f) {
        this.f6251l = interfaceC1931f;
    }

    /* JADX INFO: renamed from: a */
    private void m5193a(C1935j c1935j, String str) {
        try {
            if (!TextUtils.isEmpty(str) && c1935j != null) {
                C1781c c1781c = c1935j instanceof C1781c ? (C1781c) c1935j : null;
                if ((!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) || C1885s.a.m9812a(this.f6249j, str, this.f6252m) || c1781c == null) {
                    return;
                }
                if (TextUtils.isEmpty(c1781c.m10147ba())) {
                    if (m5209i() == 2) {
                        C1885s.m9805a(this.f6249j, c1781c.m8835ad(), c1781c, this.f6252m);
                        return;
                    } else {
                        C1885s.m9806a(this.f6249j, c1781c.m8835ad(), this.f6252m);
                        return;
                    }
                }
                C1885s.a.m9812a(this.f6249j, "market://details?id=" + c1781c.m10147ba(), this.f6252m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5194a(String str) {
        this.f6246g = str;
    }

    /* JADX INFO: renamed from: a */
    private void m5195a(boolean z, C1935j c1935j) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.anythink.expressad.a.a.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean f6258a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1935j f6259b;

            public AnonymousClass1(boolean z3, C1935j c1935j2) {
                z = z3;
                c1935j = c1935j2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (z && !C1405a.f6241b && C1404a.f6228o) {
                    C1405a.m5188a(C1405a.this);
                }
                if (C1405a.this.f6252m == null || C1405a.f6241b || !C1404a.f6228o) {
                    return;
                }
                C1405a.this.f6252m.mo10055b(c1935j);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0017 -> B:31:0x0018). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m5196a(int r3, java.lang.String r4) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            if (r3 != r0) goto Lc
            boolean r3 = com.anythink.expressad.foundation.p138h.C1885s.a.m9813a(r4)     // Catch: java.lang.Exception -> L13
            if (r3 == 0) goto L17
            goto L18
        Lc:
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L13
            if (r3 != 0) goto L17
            goto L18
        L13:
            r3 = move-exception
            r3.printStackTrace()
        L17:
            r1 = 0
        L18:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.p073a.C1405a.m5196a(int, java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: a */
    private static boolean m5197a(C1781c c1781c) {
        Long l;
        if (c1781c == null) {
            return true;
        }
        try {
            if (2 != c1781c.m8809Q() && 3 != c1781c.m8809Q()) {
                return true;
            }
            String strM10146aZ = c1781c.m10146aZ();
            Map<String, Long> map = f6242c;
            if (map == null) {
                return true;
            }
            if (map.containsKey(strM10146aZ) && (l = f6242c.get(strM10146aZ)) != null) {
                if (l.longValue() > System.currentTimeMillis() || f6243d.contains(c1781c.m10146aZ())) {
                    return false;
                }
            }
            f6242c.put(c1781c.m10146aZ(), Long.valueOf(System.currentTimeMillis() + ((long) (c1781c.m8817Y() * 1000))));
            return true;
        } catch (Exception e) {
            if (!C1404a.f6209a) {
                return true;
            }
            e.printStackTrace();
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0015 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:22:0x0004, B:23:0x0010, B:25:0x0015, B:27:0x0019, B:28:0x0021, B:30:0x0025), top: B:35:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0021 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:22:0x0004, B:23:0x0010, B:25:0x0015, B:27:0x0019, B:28:0x0021, B:30:0x0025), top: B:35:0x0004 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m5198a(com.anythink.expressad.foundation.p116d.C1781c r5, com.anythink.expressad.p073a.C1411c.b r6, boolean r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L10
            android.content.Context r7 = r4.f6249j     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r5.m8835ad()     // Catch: java.lang.Throwable -> L2d
            com.anythink.expressad.out.p$c r3 = r4.f6252m     // Catch: java.lang.Throwable -> L2d
            com.anythink.expressad.foundation.p138h.C1885s.m9806a(r7, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r1 = 1
        L10:
            r4.m5201b(r6, r5, r0)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L21
            com.anythink.expressad.out.p$c r7 = r4.f6252m     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L31
            java.lang.String r6 = r6.m5294j()     // Catch: java.lang.Throwable -> L2d
            r7.mo10052a(r5, r6)     // Catch: java.lang.Throwable -> L2d
            goto L31
        L21:
            com.anythink.expressad.out.p$c r7 = r4.f6252m     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L31
            java.lang.String r6 = r6.m5294j()     // Catch: java.lang.Throwable -> L2d
            r7.mo10056b(r5, r6)     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r5 = move-exception
            r5.getMessage()
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.p073a.C1405a.m5198a(com.anythink.expressad.foundation.d.c, com.anythink.expressad.a.c$b, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0062 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:37:0x0004, B:39:0x000e, B:43:0x001e, B:44:0x002a, B:46:0x0030, B:49:0x004d, B:50:0x0053, B:51:0x0057, B:55:0x0062, B:57:0x0069, B:58:0x0071, B:61:0x007a), top: B:65:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0071 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:37:0x0004, B:39:0x000e, B:43:0x001e, B:44:0x002a, B:46:0x0030, B:49:0x004d, B:50:0x0053, B:51:0x0057, B:55:0x0062, B:57:0x0069, B:58:0x0071, B:61:0x007a), top: B:65:0x0004 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m5199a(com.anythink.expressad.foundation.p116d.C1781c r6, com.anythink.expressad.p073a.C1411c.b r7, boolean r8, int r9) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L60
            java.lang.String r2 = r6.m8834ac()     // Catch: java.lang.Throwable -> L5e
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L5e
            if (r2 != r1) goto L1b
            android.content.Context r9 = r5.f6249j     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r7.m5294j()     // Catch: java.lang.Throwable -> L5e
            com.anythink.expressad.out.p$c r3 = r5.f6252m     // Catch: java.lang.Throwable -> L5e
            com.anythink.expressad.foundation.p138h.C1885s.m9806a(r9, r2, r3)     // Catch: java.lang.Throwable -> L5e
        L19:
            r0 = 1
            goto L60
        L1b:
            r3 = 2
            if (r2 != r3) goto L2a
            android.content.Context r9 = r5.f6249j     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r7.m5294j()     // Catch: java.lang.Throwable -> L5e
            com.anythink.expressad.out.p$c r3 = r5.f6252m     // Catch: java.lang.Throwable -> L5e
            com.anythink.expressad.foundation.p138h.C1885s.m9805a(r9, r2, r6, r3)     // Catch: java.lang.Throwable -> L5e
            goto L19
        L2a:
            java.lang.String r2 = r6.m10147ba()     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L57
            android.content.Context r2 = r5.f6249j     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "market://details?id="
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = r6.m10147ba()     // Catch: java.lang.Throwable -> L5e
            r3.append(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5e
            com.anythink.expressad.out.p$c r4 = r5.f6252m     // Catch: java.lang.Throwable -> L5e
            boolean r2 = com.anythink.expressad.foundation.p138h.C1885s.a.m9812a(r2, r3, r4)     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L4d
            goto L19
        L4d:
            java.lang.String r2 = r7.m5294j()     // Catch: java.lang.Throwable -> L5e
            com.anythink.expressad.out.p$c r3 = r5.f6252m     // Catch: java.lang.Throwable -> L5e
        L53:
            r5.m5184a(r9, r2, r6, r3)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L57:
            java.lang.String r2 = r7.m5294j()     // Catch: java.lang.Throwable -> L5e
            com.anythink.expressad.out.p$c r3 = r5.f6252m     // Catch: java.lang.Throwable -> L5e
            goto L53
        L5e:
            r6 = move-exception
            goto L82
        L60:
            if (r0 == 0) goto L71
            r5.m5201b(r7, r6, r1)     // Catch: java.lang.Throwable -> L5e
            com.anythink.expressad.out.p$c r8 = r5.f6252m     // Catch: java.lang.Throwable -> L5e
            if (r8 == 0) goto L85
            java.lang.String r7 = r7.m5294j()     // Catch: java.lang.Throwable -> L5e
            r8.mo10052a(r6, r7)     // Catch: java.lang.Throwable -> L5e
            goto L85
        L71:
            r5.m5201b(r7, r6, r1)     // Catch: java.lang.Throwable -> L5e
            com.anythink.expressad.out.p$c r9 = r5.f6252m     // Catch: java.lang.Throwable -> L5e
            if (r9 == 0) goto L85
            if (r8 == 0) goto L85
            java.lang.String r7 = r7.m5294j()     // Catch: java.lang.Throwable -> L5e
            r9.mo10056b(r6, r7)     // Catch: java.lang.Throwable -> L5e
            goto L85
        L82:
            r6.getMessage()
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.p073a.C1405a.m5199a(com.anythink.expressad.foundation.d.c, com.anythink.expressad.a.c$b, boolean, int):boolean");
    }

    /* JADX INFO: renamed from: b */
    private void m5201b(C1411c.b bVar, C1781c c1781c, boolean z) {
        if (c1781c == null || bVar == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f6247h;
            C1784f c1784f = new C1784f();
            c1784f.m9070i(c1781c.m8832aa());
            c1784f.m9057a();
            c1784f.m9069h(String.valueOf(jCurrentTimeMillis));
            c1784f.m9068g(c1781c.m10146aZ());
            c1784f.m9064d(bVar.m5283c());
            if (!TextUtils.isEmpty(bVar.m5294j())) {
                c1784f.m9067f(URLEncoder.encode(bVar.m5294j(), "utf-8"));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6247h / 1000);
            c1784f.m9061b(sb.toString());
            c1784f.m9058a(Integer.parseInt(c1781c.m8834ac()));
            c1784f.m9060b(c1781c.m8809Q());
            c1784f.m9059a(this.f6246g);
            c1784f.m9064d(bVar.m5283c());
            if (!TextUtils.isEmpty(bVar.m5294j())) {
                c1784f.m9067f(URLEncoder.encode(bVar.m5294j(), "utf-8"));
            }
            if (this.f6254o) {
                c1784f.m9062c(bVar.m5275a());
                if (!TextUtils.isEmpty(bVar.m5286d())) {
                    c1784f.m9065d(URLEncoder.encode(bVar.m5286d(), "utf-8"));
                }
                if (!TextUtils.isEmpty(bVar.m5290f())) {
                    c1784f.m9066e(URLEncoder.encode(bVar.m5290f(), "UTF-8"));
                }
                if (!TextUtils.isEmpty(bVar.m5288e())) {
                    c1784f.m9063c(URLEncoder.encode(bVar.m5288e(), "utf-8"));
                }
            }
            if (z) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(c1784f);
            C1889w.m9868b(C1784f.m9034a(arrayList));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m5202b(C1781c c1781c) {
        try {
            Intent intent = new Intent(this.f6249j, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("icon_url", c1781c.m10150bd());
            this.f6249j.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m5203c() {
        return this.f6256q;
    }

    /* JADX INFO: renamed from: d */
    private InterfaceC1931f m5204d() {
        return this.f6251l;
    }

    /* JADX INFO: renamed from: e */
    private C1778c m5205e() {
        return this.f6248i;
    }

    /* JADX INFO: renamed from: f */
    private static void m5206f() {
    }

    /* JADX INFO: renamed from: g */
    private void m5207g() {
        C1411c c1411c = this.f6250k;
        if (c1411c == null || !c1411c.m5266a()) {
            return;
        }
        this.f6250k.mo5267b();
    }

    /* JADX INFO: renamed from: h */
    private static void m5208h() {
    }

    /* JADX INFO: renamed from: i */
    private int m5209i() {
        try {
            C1483a c1483a = this.f6253n;
            if (c1483a != null) {
                return c1483a.m5968k();
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    /* JADX INFO: renamed from: j */
    private void m5210j() {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            C1172k.m2050a(this.f6249j).m2053a(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5211a() {
        this.f6256q = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m5212a(C1941p.c cVar) {
        this.f6252m = cVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m5213b() {
        try {
            this.f6252m = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
