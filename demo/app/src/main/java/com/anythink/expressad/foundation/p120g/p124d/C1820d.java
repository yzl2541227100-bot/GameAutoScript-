package com.anythink.expressad.foundation.p120g.p124d;

import android.text.TextUtils;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p120g.p126f.C1843f;
import com.anythink.expressad.foundation.p120g.p126f.C1858k;
import com.anythink.expressad.foundation.p120g.p126f.p127a.C1824a;
import com.anythink.expressad.foundation.p120g.p126f.p134h.C1854a;
import com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a;
import java.io.File;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.d.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1820d extends AbstractRunnableC1861a {

    /* JADX INFO: renamed from: a */
    private static final String f11278a = "ImageWorker";

    /* JADX INFO: renamed from: e */
    private String f11279e;

    /* JADX INFO: renamed from: f */
    private String f11280f;

    /* JADX INFO: renamed from: g */
    private String f11281g;

    /* JADX INFO: renamed from: h */
    private boolean f11282h = false;

    /* JADX INFO: renamed from: i */
    private a f11283i;

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.d.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo9446a(String str, String str2);

        /* JADX INFO: renamed from: b */
        void mo9447b(String str, String str2);
    }

    public C1820d(String str, String str2, String str3) {
        this.f11279e = str;
        this.f11280f = str2;
        this.f11281g = str3;
    }

    /* JADX INFO: renamed from: a */
    private void m9450a(String str, String str2) {
        a aVar = this.f11283i;
        if (aVar != null) {
            aVar.mo9446a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m9452b(String str, String str2) {
        a aVar = this.f11283i;
        if (aVar != null) {
            aVar.mo9447b(str, str2);
        }
    }

    /* JADX INFO: renamed from: h */
    private String m9453h() {
        return this.f11279e;
    }

    /* JADX INFO: renamed from: i */
    private String m9454i() {
        return this.f11280f;
    }

    /* JADX INFO: renamed from: j */
    private String m9455j() {
        return this.f11281g;
    }

    /* JADX INFO: renamed from: k */
    private boolean m9456k() {
        return this.f11282h;
    }

    /* JADX INFO: renamed from: l */
    private a m9457l() {
        return this.f11283i;
    }

    /* JADX INFO: renamed from: m */
    private static void m9458m() {
    }

    /* JADX INFO: renamed from: n */
    private void m9459n() {
        try {
            File file = new File(this.f11281g);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            C1854a.m9583a(file, this.f11280f, new C1843f<Void>() { // from class: com.anythink.expressad.foundation.g.d.d.1
                @Override // com.anythink.expressad.foundation.p120g.p126f.C1843f, com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e
                /* JADX INFO: renamed from: a */
                public final void mo9463a() {
                }

                @Override // com.anythink.expressad.foundation.p120g.p126f.C1843f, com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e
                /* JADX INFO: renamed from: a */
                public final void mo9464a(long j, long j2) {
                }

                @Override // com.anythink.expressad.foundation.p120g.p126f.C1843f, com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e
                /* JADX INFO: renamed from: a */
                public final void mo9465a(C1824a c1824a) {
                    C1820d c1820d = C1820d.this;
                    c1820d.m9452b(c1820d.f11280f, "load image from http faild because http return code: " + c1824a.f11292a + ".image url is " + C1820d.this.f11280f);
                }

                @Override // com.anythink.expressad.foundation.p120g.p126f.C1843f, com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e
                /* JADX INFO: renamed from: a */
                public final void mo9466a(C1858k c1858k) {
                    String unused = C1820d.this.f11281g;
                    C1820d.this.m9462d();
                }
            });
        } catch (Exception e) {
            m9452b(this.f11280f, e.getMessage());
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        } catch (OutOfMemoryError e2) {
            m9452b(this.f11280f, e2.getMessage());
        }
    }

    @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
    /* JADX INFO: renamed from: a */
    public final void mo5269a() {
        if (this.f11282h) {
            m9459n();
            return;
        }
        if (TextUtils.isEmpty(this.f11281g)) {
            m9452b(this.f11280f, "save path is null.");
            return;
        }
        File file = new File(this.f11281g);
        if (!file.exists() || file.length() <= 0) {
            m9459n();
        } else {
            m9462d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9460a(a aVar) {
        this.f11283i = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m9461a(boolean z) {
        this.f11282h = z;
    }

    @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
    /* JADX INFO: renamed from: b */
    public final void mo5270b() {
    }

    @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
    /* JADX INFO: renamed from: c */
    public final void mo5271c() {
    }

    /* JADX INFO: renamed from: d */
    public final void m9462d() {
        if (new File(this.f11281g).length() <= 0) {
            m9452b(this.f11280f, "load image faild.because file[" + this.f11281g + "] is not exist!");
            return;
        }
        String str = this.f11280f;
        String str2 = this.f11281g;
        a aVar = this.f11283i;
        if (aVar != null) {
            aVar.mo9446a(str, str2);
        }
    }
}
