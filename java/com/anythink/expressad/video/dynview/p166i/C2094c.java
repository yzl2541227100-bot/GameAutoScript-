package com.anythink.expressad.video.dynview.p166i;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.video.dynview.p158a.C2069a;
import java.util.List;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.i.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2094c {
    /* JADX INFO: renamed from: a */
    public static int m11191a(C1781c c1781c) {
        if (c1781c != null && c1781c.m8805M() != null) {
            int iM8954b = c1781c.m8805M().m8954b();
            if (iM8954b == 302 || iM8954b == 802) {
                return -3;
            }
            if (iM8954b == 904) {
                return !m11196a(c1781c.m8805M().m8957e()) ? -1 : -3;
            }
        }
        return 100;
    }

    /* JADX INFO: renamed from: a */
    private static String m11192a(long j, Context context) {
        StringBuilder sb;
        String str;
        String strM4066f = C1341e.m4066f(context);
        if (strM4066f.startsWith(C2069a.f13139Q) || strM4066f.startsWith(C2069a.f13140R)) {
            return j + C4196o4.OooO00o.OooO0Oo + context.getString(C1875i.m9684a(context, "anythink_cm_video_auto_play_after", C1875i.f11532g));
        }
        if (strM4066f.startsWith(C2069a.f13141S)) {
            sb = new StringBuilder(C2069a.f13129G);
            sb.append(j);
            str = " Sekunden";
        } else if (strM4066f.startsWith(C2069a.f13142T)) {
            sb = new StringBuilder();
            sb.append(j);
            str = C2069a.f13130H;
        } else if (strM4066f.startsWith(C2069a.f13143U)) {
            sb = new StringBuilder(C2069a.f13131I);
            sb.append(j);
            str = " secondes";
        } else if (strM4066f.startsWith(C2069a.f13144V)) {
            sb = new StringBuilder(" ثوان");
            sb.append(j);
            str = C2069a.f13132J;
        } else if (strM4066f.startsWith(C2069a.f13145W)) {
            sb = new StringBuilder(C2069a.f13133K);
            sb.append(j);
            str = " секунд";
        } else {
            sb = new StringBuilder(C2069a.f13128F);
            sb.append(j);
            str = " s";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static void m11193a(Activity activity) {
        activity.setRequestedOrientation(m11195a((Context) activity) ? 6 : 7);
    }

    /* JADX INFO: renamed from: a */
    private static void m11194a(C1781c c1781c, Activity activity) {
        if (c1781c == null || c1781c.m8805M() == null) {
            return;
        }
        int iM8955c = c1781c.m8805M().m8955c();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (iM8955c == 1) {
            activity.setRequestedOrientation(7);
            return;
        }
        if (iM8955c == 2) {
            activity.setRequestedOrientation(6);
        } else if (m11195a((Context) activity)) {
            activity.setRequestedOrientation(6);
        } else {
            activity.setRequestedOrientation(7);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11195a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11196a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                return false;
            }
            String queryParameter = uri.getQueryParameter(C2069a.f13134L);
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals("1");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m11197a(List<C1781c> list) {
        C1781c c1781c;
        if (list == null || list.size() <= 0 || (c1781c = list.get(0)) == null) {
            return false;
        }
        return c1781c.m8886j();
    }

    /* JADX INFO: renamed from: b */
    private static int m11198b(C1781c c1781c) {
        if (c1781c == null || c1781c.m8805M() == null) {
            return 1;
        }
        return c1781c.m8805M().m8955c();
    }
}
