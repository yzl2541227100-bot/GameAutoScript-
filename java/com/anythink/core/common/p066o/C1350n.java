package com.anythink.core.common.p066o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.anythink.core.basead.p045ui.web.WebLandPageActivity;
import com.anythink.core.common.p051b.C1175n;

/* JADX INFO: renamed from: com.anythink.core.common.o.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1350n {
    /* JADX INFO: renamed from: a */
    public static void m4203a(Context context, String str) {
        try {
            WebLandPageActivity.m1780a(context, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4204a(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268468224);
            Context contextM2148f = C1175n.m2059a().m2148f();
            if (contextM2148f != null) {
                contextM2148f.startActivity(intent);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
