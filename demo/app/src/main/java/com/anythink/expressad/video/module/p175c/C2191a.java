package com.anythink.expressad.video.module.p175c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p126f.p134h.C1854a;
import com.anythink.expressad.foundation.p120g.p126f.p134h.C1855b;
import com.anythink.expressad.foundation.p138h.C1876j;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.out.C1927b;
import com.anythink.expressad.p086d.C1486b;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.video.module.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2191a extends C1854a {
    public C2191a(Context context) {
        super(context);
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.p134h.C1854a
    /* JADX INFO: renamed from: a */
    public final void mo9586a(String str, C1855b c1855b) {
        super.mo9586a(str, c1855b);
        c1855b.m9595a("platform", "1");
        c1855b.m9595a("os_version", Build.VERSION.RELEASE);
        c1855b.m9595a("package_name", C1877k.m9709h(this.f11419a));
        c1855b.m9595a(C1801a.f11074bf, C1877k.m9701d(this.f11419a));
        StringBuilder sb = new StringBuilder();
        sb.append(C1877k.m9698c(this.f11419a));
        c1855b.m9595a("app_version_code", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C1877k.m9696b(this.f11419a));
        c1855b.m9595a("orientation", sb2.toString());
        c1855b.m9595a("gaid", "");
        c1855b.m9595a("sdk_version", C1927b.f11909a);
        C1486b.m6002a();
        C1773a.m8548c().m8558f();
        if (C1486b.m6007b() != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (TextUtils.isEmpty(jSONObject.toString())) {
                    return;
                }
                String strM9686a = C1876j.m9686a(jSONObject.toString());
                if (TextUtils.isEmpty(strM9686a)) {
                    return;
                }
                c1855b.m9595a("dvi", strM9686a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
