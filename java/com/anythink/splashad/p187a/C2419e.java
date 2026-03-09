package com.anythink.splashad.p187a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.C1317n;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1238c;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1257v;
import com.anythink.core.common.p061j.InterfaceC1299e;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.p072d.C1396f;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.splashad.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2419e implements InterfaceC1299e {

    /* JADX INFO: renamed from: a */
    public C2420f f15038a;

    @Override // com.anythink.core.common.p061j.InterfaceC1299e
    /* JADX INFO: renamed from: a */
    public final C1234b mo3736a(String str, boolean z, Map<String, Object> map, C1238c c1238c) {
        C1234b c1234b;
        C2420f c2420f = this.f15038a;
        C1234b c1234b2 = (c2420f == null || (c1234b = c2420f.f15042d) == null || c1234b.m2902c() > 0) ? null : c2420f.f15042d;
        if (c1234b2 == null) {
            return null;
        }
        C1243h c1243hM2908h = c1234b2.m2908h();
        if (z) {
            C1322e.m3923a(c1243hM2908h.m2678ai(), str, true, -1, (C1396f) null, c1234b2, "", "", map, c1238c);
        }
        return c1234b2;
    }

    @Override // com.anythink.core.common.p061j.InterfaceC1299e
    /* JADX INFO: renamed from: a */
    public final void mo3737a(C1234b c1234b) {
        C2420f c2420f = this.f15038a;
        if (c2420f == null || c2420f.f15042d != c1234b) {
            return;
        }
        c2420f.f15042d = null;
    }

    @Override // com.anythink.core.common.p061j.InterfaceC1299e
    /* JADX INFO: renamed from: a */
    public final boolean mo3738a() {
        C2420f c2420f = this.f15038a;
        return c2420f != null && c2420f.m12485a();
    }

    @Override // com.anythink.core.common.p061j.InterfaceC1299e
    /* JADX INFO: renamed from: a */
    public final boolean mo3739a(Context context, String str, String str2, C1257v c1257v, C1317n c1317n) {
        C2420f c2420f = new C2420f(context);
        this.f15038a = c2420f;
        c2420f.m12484a(c1257v.m3445a(), str, str2, c1257v, c1317n);
        return true;
    }

    @Override // com.anythink.core.common.p061j.InterfaceC1299e
    /* JADX INFO: renamed from: b */
    public final boolean mo3740b() {
        C2420f c2420f = this.f15038a;
        return (c2420f == null || TextUtils.isEmpty(c2420f.f15043e)) ? false : true;
    }
}
