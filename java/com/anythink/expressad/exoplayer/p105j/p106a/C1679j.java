package com.anythink.expressad.exoplayer.p105j.p106a;

import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1679j {

    /* JADX INFO: renamed from: a */
    private static final String f9344a = "exo_";

    /* JADX INFO: renamed from: b */
    private static final String f9345b = "exo_redir";

    /* JADX INFO: renamed from: c */
    private static final String f9346c = "exo_len";

    private C1679j() {
    }

    /* JADX INFO: renamed from: a */
    public static long m7796a(InterfaceC1678i interfaceC1678i) {
        return interfaceC1678i.mo7792a(f9346c);
    }

    /* JADX INFO: renamed from: a */
    private static void m7797a(C1680k c1680k) {
        c1680k.m7804a(f9346c);
    }

    /* JADX INFO: renamed from: a */
    public static void m7798a(C1680k c1680k, long j) {
        c1680k.m7805a(f9346c, j);
    }

    /* JADX INFO: renamed from: a */
    public static void m7799a(C1680k c1680k, Uri uri) {
        c1680k.m7806a(f9345b, uri.toString());
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    private static Uri m7800b(InterfaceC1678i interfaceC1678i) {
        String strMo7793a = interfaceC1678i.mo7793a(f9345b, (String) null);
        if (strMo7793a == null) {
            return null;
        }
        return Uri.parse(strMo7793a);
    }

    /* JADX INFO: renamed from: b */
    private static void m7801b(C1680k c1680k) {
        c1680k.m7804a(f9345b);
    }
}
