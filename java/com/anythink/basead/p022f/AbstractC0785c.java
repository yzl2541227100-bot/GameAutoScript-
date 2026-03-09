package com.anythink.basead.p022f;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p022f.p023a.C0782a;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p055f.C1261z;

/* JADX INFO: renamed from: com.anythink.basead.f.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0785c implements InterfaceC0781a {

    /* JADX INFO: renamed from: h */
    public static final String f994h = "extra_request_id";

    /* JADX INFO: renamed from: i */
    public static final String f995i = "extra_scenario";

    /* JADX INFO: renamed from: j */
    public static final String f996j = "extra_orientation";

    /* JADX INFO: renamed from: b */
    public String f997b = getClass().getSimpleName();

    /* JADX INFO: renamed from: c */
    public Context f998c;

    /* JADX INFO: renamed from: d */
    public C1248m f999d;

    /* JADX INFO: renamed from: e */
    public String f1000e;

    /* JADX INFO: renamed from: f */
    public boolean f1001f;

    /* JADX INFO: renamed from: g */
    public C1261z f1002g;

    public AbstractC0785c(Context context, C1248m c1248m, String str, boolean z) {
        this.f998c = context.getApplicationContext();
        this.f999d = c1248m;
        this.f1000e = str;
        this.f1001f = z;
    }

    /* JADX INFO: renamed from: b */
    private C0747e m582b() {
        if (TextUtils.isEmpty(this.f1000e) || TextUtils.isEmpty(this.f999d.f4321b)) {
            return C0748f.m310a(C0748f.f727i, C0748f.f740v);
        }
        C1261z c1261zM565a = C0782a.m563a(this.f998c).m565a(this.f999d.f4321b, this.f1000e);
        this.f1002g = c1261zM565a;
        if (c1261zM565a == null) {
            return C0748f.m310a(C0748f.f727i, C0748f.f743y);
        }
        if (this.f999d.f4333n == null) {
            return C0748f.m310a(C0748f.f728j, C0748f.f744z);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:2:0x0000, B:5:0x000a, B:8:0x0015, B:11:0x002b, B:18:0x0046, B:20:0x004a, B:12:0x0030, B:14:0x0036), top: B:25:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a A[Catch: Exception -> 0x005f, TRY_LEAVE, TryCatch #0 {Exception -> 0x005f, blocks: (B:2:0x0000, B:5:0x000a, B:8:0x0015, B:11:0x002b, B:18:0x0046, B:20:0x004a, B:12:0x0030, B:14:0x0036), top: B:25:0x0000 }] */
    @Override // com.anythink.basead.p022f.InterfaceC0781a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo561a(final com.anythink.basead.p021e.InterfaceC0773c r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.f1000e     // Catch: java.lang.Exception -> L5f
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L5f
            java.lang.String r1 = "30001"
            if (r0 != 0) goto L41
            com.anythink.core.common.f.m r0 = r5.f999d     // Catch: java.lang.Exception -> L5f
            java.lang.String r0 = r0.f4321b     // Catch: java.lang.Exception -> L5f
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L5f
            if (r0 == 0) goto L15
            goto L41
        L15:
            android.content.Context r0 = r5.f998c     // Catch: java.lang.Exception -> L5f
            com.anythink.basead.f.a.a r0 = com.anythink.basead.p022f.p023a.C0782a.m563a(r0)     // Catch: java.lang.Exception -> L5f
            com.anythink.core.common.f.m r2 = r5.f999d     // Catch: java.lang.Exception -> L5f
            java.lang.String r2 = r2.f4321b     // Catch: java.lang.Exception -> L5f
            java.lang.String r3 = r5.f1000e     // Catch: java.lang.Exception -> L5f
            com.anythink.core.common.f.z r0 = r0.m565a(r2, r3)     // Catch: java.lang.Exception -> L5f
            r5.f1002g = r0     // Catch: java.lang.Exception -> L5f
            if (r0 != 0) goto L30
            java.lang.String r0 = "No fill, offer = null!"
        L2b:
            com.anythink.basead.c.e r0 = com.anythink.basead.p015c.C0748f.m310a(r1, r0)     // Catch: java.lang.Exception -> L5f
            goto L44
        L30:
            com.anythink.core.common.f.m r0 = r5.f999d     // Catch: java.lang.Exception -> L5f
            com.anythink.core.common.f.n r0 = r0.f4333n     // Catch: java.lang.Exception -> L5f
            if (r0 != 0) goto L3f
            java.lang.String r0 = "30002"
            java.lang.String r1 = "No fill, setting = null!"
            com.anythink.basead.c.e r0 = com.anythink.basead.p015c.C0748f.m310a(r0, r1)     // Catch: java.lang.Exception -> L5f
            goto L44
        L3f:
            r0 = 0
            goto L44
        L41:
            java.lang.String r0 = "offerid、placementid can not be null!"
            goto L2b
        L44:
            if (r0 == 0) goto L4a
            r6.onAdLoadFailed(r0)     // Catch: java.lang.Exception -> L5f
            return
        L4a:
            android.content.Context r0 = r5.f998c     // Catch: java.lang.Exception -> L5f
            com.anythink.basead.f.a.a r0 = com.anythink.basead.p022f.p023a.C0782a.m563a(r0)     // Catch: java.lang.Exception -> L5f
            com.anythink.core.common.f.m r1 = r5.f999d     // Catch: java.lang.Exception -> L5f
            java.lang.String r2 = r1.f4321b     // Catch: java.lang.Exception -> L5f
            com.anythink.core.common.f.z r3 = r5.f1002g     // Catch: java.lang.Exception -> L5f
            com.anythink.basead.f.c$1 r4 = new com.anythink.basead.f.c$1     // Catch: java.lang.Exception -> L5f
            r4.<init>()     // Catch: java.lang.Exception -> L5f
            r0.m567a(r2, r3, r1, r4)     // Catch: java.lang.Exception -> L5f
            return
        L5f:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "-9999"
            com.anythink.basead.c.e r0 = com.anythink.basead.p015c.C0748f.m310a(r1, r0)
            r6.onAdLoadFailed(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p022f.AbstractC0785c.mo561a(com.anythink.basead.e.c):void");
    }

    @Override // com.anythink.basead.p022f.InterfaceC0781a
    /* JADX INFO: renamed from: a */
    public boolean mo562a() {
        try {
            if (m583d()) {
                return C0782a.m563a(this.f998c).m568a(this.f1002g, this.f999d, this.f1001f);
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo581c() {
    }

    /* JADX INFO: renamed from: d */
    public final boolean m583d() {
        if (this.f998c == null || TextUtils.isEmpty(this.f999d.f4321b) || TextUtils.isEmpty(this.f1000e)) {
            return false;
        }
        if (this.f1002g != null) {
            return true;
        }
        C1261z c1261zM565a = C0782a.m563a(this.f998c).m565a(this.f999d.f4321b, this.f1000e);
        this.f1002g = c1261zM565a;
        return c1261zM565a != null;
    }

    /* JADX INFO: renamed from: e */
    public final C1261z m584e() {
        return this.f1002g;
    }
}
