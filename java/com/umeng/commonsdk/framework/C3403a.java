package com.umeng.commonsdk.framework;

import android.content.Context;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.statistics.C3484c;
import com.umeng.commonsdk.statistics.common.C3489e;
import com.umeng.commonsdk.statistics.idtracking.C3498g;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.commonsdk.framework.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3403a {
    /* JADX INFO: renamed from: a */
    public static long m15640a(Context context) {
        if (context == null) {
            return 0L;
        }
        return C3404b.m15661i(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: a */
    public static String m15641a(Context context, String str, String str2) {
        return context == null ? str2 : C3498g.m16393a(context.getApplicationContext()).m16403b().m16408a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m15642a(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        C3489e.m16332b("--->>> buildEnvelopeFile Enter.");
        return new C3484c().m16262a(context.getApplicationContext(), jSONObject, jSONObject2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15643a(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        boolean z = false;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            boolean zM15653b = C3404b.m15653b(applicationContext);
            int iM15654c = C3404b.m15654c(applicationContext);
            if (zM15653b && !C3404b.m15648a(applicationContext, uMBusinessType)) {
                z = true;
            }
            if (zM15653b && iM15654c > 0) {
                C3406d.m15677b();
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public static long m15644b(Context context) {
        if (context == null) {
            return 0L;
        }
        return C3484c.m16256a(context.getApplicationContext());
    }
}
