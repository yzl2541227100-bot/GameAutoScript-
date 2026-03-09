package com.anythink.expressad.foundation.p120g.p126f.p134h;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p126f.C1823a;
import com.anythink.expressad.foundation.p120g.p126f.C1825b;
import com.anythink.expressad.foundation.p120g.p126f.C1860m;
import com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e;
import com.anythink.expressad.foundation.p120g.p126f.InterfaceC1859l;
import com.anythink.expressad.foundation.p120g.p126f.p130d.C1839g;
import com.anythink.expressad.foundation.p138h.C1882p;
import com.anythink.expressad.out.C1936k;
import java.io.File;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.h.a */
/* JADX INFO: loaded from: classes.dex */
public class C1854a {

    /* JADX INFO: renamed from: b */
    private static final String f11418b = "a";

    /* JADX INFO: renamed from: a */
    public Context f11419a;

    public C1854a(Context context) {
        this.f11419a = context == null ? C1773a.m8548c().m8557e() : context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    private void m9581a(int i, String str, C1855b c1855b, InterfaceC1840e interfaceC1840e) {
        String str2 = c1855b.m9596b().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1855b.m9595a("ts", String.valueOf(jCurrentTimeMillis));
        c1855b.m9595a("st", C1882p.m9771a(str2 + jCurrentTimeMillis));
        m9585b(i, str, c1855b, new C1825b(), interfaceC1840e);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m9582a(int r6, java.lang.String r7, com.anythink.expressad.foundation.p120g.p126f.p134h.C1855b r8, com.anythink.expressad.foundation.p120g.p126f.InterfaceC1859l r9, com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e r10) {
        /*
            r5 = this;
            if (r8 != 0) goto L8
            com.anythink.expressad.foundation.g.f.h.b r0 = new com.anythink.expressad.foundation.g.f.h.b     // Catch: java.lang.Exception -> L41
            r0.<init>()     // Catch: java.lang.Exception -> L41
            r8 = r0
        L8:
            r5.mo9586a(r7, r8)     // Catch: java.lang.Exception -> L41
            java.util.Map r0 = r8.m9596b()     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = "sign"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L41
            if (r0 != 0) goto L1b
            java.lang.String r0 = ""
        L1b:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = "ts"
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L41
            r8.m9595a(r3, r4)     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = "st"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L41
            r4.<init>()     // Catch: java.lang.Exception -> L41
            r4.append(r0)     // Catch: java.lang.Exception -> L41
            r4.append(r1)     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = com.anythink.expressad.foundation.p138h.C1882p.m9771a(r0)     // Catch: java.lang.Exception -> L41
            r8.m9595a(r3, r0)     // Catch: java.lang.Exception -> L41
            goto L45
        L41:
            r0 = move-exception
            r0.getMessage()
        L45:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = "?"
            r0.append(r7)
            java.lang.String r7 = r8.toString()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8 = 0
            r0 = 0
            if (r6 == 0) goto L74
            r1 = 1
            if (r6 == r1) goto L6e
            r1 = 2
            if (r6 == r1) goto L68
            goto L7a
        L68:
            com.anythink.expressad.foundation.g.f.d.c r6 = new com.anythink.expressad.foundation.g.f.d.c
            r6.<init>(r8, r7, r0, r10)
            goto L79
        L6e:
            com.anythink.expressad.foundation.g.f.d.d r6 = new com.anythink.expressad.foundation.g.f.d.d
            r6.<init>(r8, r7, r0, r10)
            goto L79
        L74:
            com.anythink.expressad.foundation.g.f.d.g r6 = new com.anythink.expressad.foundation.g.f.d.g
            r6.<init>(r8, r7, r0, r10)
        L79:
            r0 = r6
        L7a:
            if (r0 == 0) goto L82
            r0.m9608a(r9)
            com.anythink.expressad.foundation.p120g.p126f.C1860m.m9639a(r0)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p120g.p126f.p134h.C1854a.m9582a(int, java.lang.String, com.anythink.expressad.foundation.g.f.h.b, com.anythink.expressad.foundation.g.f.l, com.anythink.expressad.foundation.g.f.e):void");
    }

    /* JADX INFO: renamed from: a */
    public static void m9583a(File file, String str, InterfaceC1840e interfaceC1840e) {
        C1860m.m9637a().m9529a(file, str, (InterfaceC1840e<Void>) interfaceC1840e);
    }

    /* JADX INFO: renamed from: b */
    private void m9584b(int i, String str, C1855b c1855b, InterfaceC1840e interfaceC1840e) {
        m9585b(i, str, c1855b, new C1825b(), interfaceC1840e);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m9585b(int r6, java.lang.String r7, com.anythink.expressad.foundation.p120g.p126f.p134h.C1855b r8, com.anythink.expressad.foundation.p120g.p126f.InterfaceC1859l r9, com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e r10) {
        /*
            r5 = this;
            if (r8 != 0) goto L8
            com.anythink.expressad.foundation.g.f.h.b r0 = new com.anythink.expressad.foundation.g.f.h.b     // Catch: java.lang.Exception -> Lc
            r0.<init>()     // Catch: java.lang.Exception -> Lc
            r8 = r0
        L8:
            r5.mo9586a(r7, r8)     // Catch: java.lang.Exception -> Lc
            goto L10
        Lc:
            r0 = move-exception
            r0.getMessage()
        L10:
            r0 = 0
            java.lang.String r1 = "application/x-www-form-urlencoded"
            java.lang.String r2 = "Content-Type"
            r3 = 1
            if (r6 == 0) goto L32
            if (r6 == r3) goto L28
            r4 = 2
            if (r6 == r4) goto L1e
            goto L3e
        L1e:
            com.anythink.expressad.foundation.g.f.d.c r0 = new com.anythink.expressad.foundation.g.f.d.c
            java.lang.String r6 = r8.toString()
            r0.<init>(r3, r7, r6, r10)
            goto L3b
        L28:
            com.anythink.expressad.foundation.g.f.d.d r0 = new com.anythink.expressad.foundation.g.f.d.d
            java.lang.String r6 = r8.toString()
            r0.<init>(r3, r7, r6, r10)
            goto L3b
        L32:
            com.anythink.expressad.foundation.g.f.d.g r0 = new com.anythink.expressad.foundation.g.f.d.g
            java.lang.String r6 = r8.toString()
            r0.<init>(r3, r7, r6, r10)
        L3b:
            r0.m9612a(r2, r1)
        L3e:
            if (r0 == 0) goto L46
            r0.m9608a(r9)
            com.anythink.expressad.foundation.p120g.p126f.C1860m.m9639a(r0)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p120g.p126f.p134h.C1854a.m9585b(int, java.lang.String, com.anythink.expressad.foundation.g.f.h.b, com.anythink.expressad.foundation.g.f.l, com.anythink.expressad.foundation.g.f.e):void");
    }

    /* JADX INFO: renamed from: a */
    public void mo9586a(String str, C1855b c1855b) {
        if (c1855b != null) {
            c1855b.m9595a("open", C1801a.f11136cy);
            StringBuilder sb = new StringBuilder();
            C1823a.m9484a();
            sb.append(C1823a.m9485b());
            c1855b.m9595a("band_width", sb.toString());
            String str2 = c1855b.m9596b().get("unit_id");
            if (str2 != null) {
                String strM10167a = C1936k.m10164a().m10167a(str2, str);
                if (TextUtils.isEmpty(strM10167a)) {
                    return;
                }
                c1855b.m9595a("ch_info", strM10167a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9587a(String str, C1855b c1855b, InterfaceC1840e interfaceC1840e) {
        C1825b c1825b = new C1825b();
        if (c1855b == null) {
            try {
                c1855b = new C1855b();
            } catch (Exception e) {
                e.getMessage();
            }
        }
        mo9586a(str, c1855b);
        String str2 = c1855b.m9596b().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1855b.m9595a("ts", String.valueOf(jCurrentTimeMillis));
        c1855b.m9595a("st", C1882p.m9771a(str2 + jCurrentTimeMillis));
        C1839g c1839g = new C1839g(0, str + "?" + c1855b.toString(), null, interfaceC1840e);
        c1839g.m9608a((InterfaceC1859l) c1825b);
        C1860m.m9639a(c1839g);
    }
}
