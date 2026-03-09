package com.anythink.core.common.p053d;

import android.content.Context;
import com.anythink.core.common.p052c.C1182c;
import com.anythink.core.common.p052c.C1189j;
import com.anythink.core.common.p055f.C1212ae;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.d.a */
/* JADX INFO: loaded from: classes.dex */
public class C1194a {

    /* JADX INFO: renamed from: a */
    public C1189j f3568a;

    /* JADX INFO: renamed from: b */
    public int f3569b;

    public C1194a(Context context) {
        this.f3568a = C1189j.m2255a(C1182c.m2210a(context));
    }

    /* JADX INFO: renamed from: a */
    private List<C1212ae> m2299a() {
        return this.f3568a.m2261a(this.f3569b);
    }

    /* JADX INFO: renamed from: a */
    public final List<C1212ae> m2300a(List<String> list) {
        return this.f3568a.m2262a(list, this.f3569b);
    }

    /* JADX INFO: renamed from: a */
    public final void m2301a(String str, int i, int i2) {
        this.f3568a.m2263a(this.f3569b, str, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m2302a(String str, long j) {
        this.f3568a.m2264a(this.f3569b, str, j);
    }

    /* JADX INFO: renamed from: a */
    public final void m2303a(String str, String str2) {
        this.f3568a.m2265a(str, this.f3569b, str2);
    }
}
