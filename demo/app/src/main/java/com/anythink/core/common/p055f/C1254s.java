package com.anythink.core.common.p055f;

import android.content.Context;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.common.p066o.C1355s;

/* JADX INFO: renamed from: com.anythink.core.common.f.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1254s {

    /* JADX INFO: renamed from: a */
    private String f4459a;

    /* JADX INFO: renamed from: b */
    private String f4460b;

    /* JADX INFO: renamed from: c */
    private String f4461c;

    public C1254s(Context context, long j, String str, String str2) {
        this.f4459a = str;
        this.f4460b = str2;
        if (System.currentTimeMillis() - j <= 86400000) {
            this.f4461c = C1355s.m4239b(context, C1169h.f3065p, "det".concat(String.valueOf(str)), "");
        } else {
            this.f4461c = C1341e.m4049a(context, str2);
            C1355s.m4237a(context, C1169h.f3065p, "det".concat(String.valueOf(str)), this.f4461c);
        }
    }

    /* JADX INFO: renamed from: c */
    private String m3423c() {
        return this.f4460b;
    }

    /* JADX INFO: renamed from: a */
    public final String m3424a() {
        return this.f4459a;
    }

    /* JADX INFO: renamed from: b */
    public final String m3425b() {
        return this.f4461c;
    }
}
