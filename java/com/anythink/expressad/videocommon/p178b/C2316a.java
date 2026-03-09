package com.anythink.expressad.videocommon.p178b;

import android.text.TextUtils;
import com.anythink.core.common.p050a.C1159k;
import com.anythink.core.common.p050a.C1160l;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1343g;
import com.anythink.core.common.res.C1380d;
import com.anythink.core.common.res.p070a.C1377c;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C2316a {

    /* JADX INFO: renamed from: a */
    private static volatile C2316a f14366a;

    /* JADX INFO: renamed from: b */
    private final C1377c f14367b = C1377c.m4478a();

    private C2316a() {
    }

    /* JADX INFO: renamed from: a */
    public static C2316a m11773a() {
        if (f14366a == null) {
            synchronized (C2316a.class) {
                if (f14366a == null) {
                    f14366a = new C2316a();
                }
            }
        }
        return f14366a;
    }

    /* JADX INFO: renamed from: a */
    public static String m11774a(String str) {
        return TextUtils.isEmpty(str) ? "" : C1380d.m4520a(C1175n.m2059a().m2148f()).m4532c(4, C1343g.m4123a(str));
    }

    /* JADX INFO: renamed from: b */
    public static C1159k m11775b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C1160l.m1996a().m2002a(str);
    }
}
