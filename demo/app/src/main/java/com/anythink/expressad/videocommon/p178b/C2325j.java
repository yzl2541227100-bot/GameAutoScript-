package com.anythink.expressad.videocommon.p178b;

import android.text.TextUtils;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p120g.p123c.C1814d;
import com.anythink.expressad.foundation.p120g.p123c.EnumC1811a;
import com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a;
import com.anythink.expressad.foundation.p138h.C1879m;
import com.anythink.expressad.foundation.p138h.C1882p;
import com.anythink.expressad.foundation.p138h.C1890x;
import com.anythink.expressad.videocommon.p178b.C2323h;
import java.io.File;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2325j {

    /* JADX INFO: renamed from: a */
    public static final int f14462a = 259200000;

    /* JADX INFO: renamed from: b */
    private static final String f14463b = "HTMLResourceManager";

    /* JADX INFO: renamed from: c */
    private String f14464c;

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static C2325j f14466a = new C2325j(0);

        private a() {
        }
    }

    private C2325j() {
        this.f14464c = C1814d.m9407b(EnumC1811a.ANYTHINK_700_HTML);
    }

    public /* synthetic */ C2325j(byte b) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C2325j m11884a() {
        return a.f14466a;
    }

    /* JADX INFO: renamed from: c */
    private void m11886c() {
        this.f14464c = C1814d.m9407b(EnumC1811a.ANYTHINK_700_HTML);
    }

    /* JADX INFO: renamed from: a */
    public final String m11887a(String str) {
        try {
            String str2 = this.f14464c + "/" + C1882p.m9771a(C1890x.m9869a(str)) + ".html";
            if (new File(str2).exists()) {
                return "file:////".concat(String.valueOf(str2));
            }
            return null;
        } catch (Throwable th) {
            if (!C1404a.f6209a) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11888a(String str, byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        try {
            if (bArr.length <= 0) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f14464c);
            sb.append("/");
            sb.append(C1882p.m9771a(C1890x.m9869a(str)));
            sb.append(".html");
            return C1879m.m9736a(bArr, new File(sb.toString()));
        } catch (Exception e) {
            if (!C1404a.f6209a) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m11889b(String str) {
        try {
            File file = new File(this.f14464c + "/" + C1882p.m9771a(C1890x.m9869a(str)) + ".html");
            if (file.length() > 0) {
                return C1879m.m9729a(file);
            }
            return null;
        } catch (Throwable th) {
            if (!C1404a.f6209a) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11890b() {
        try {
            if (TextUtils.isEmpty(this.f14464c)) {
                return;
            }
            C2323h.a.f14448a.m11866a(new AbstractRunnableC1861a() { // from class: com.anythink.expressad.videocommon.b.j.1
                @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
                /* JADX INFO: renamed from: a */
                public final void mo5269a() {
                    C1879m.m9744c(C2325j.this.f14464c);
                }

                @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
                /* JADX INFO: renamed from: b */
                public final void mo5270b() {
                }

                @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
                /* JADX INFO: renamed from: c */
                public final void mo5271c() {
                }
            });
        } catch (Exception e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        }
    }
}
