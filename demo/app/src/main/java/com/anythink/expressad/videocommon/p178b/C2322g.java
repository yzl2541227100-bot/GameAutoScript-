package com.anythink.expressad.videocommon.p178b;

import android.webkit.URLUtil;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a;
import com.anythink.expressad.foundation.p138h.C1889w;
import com.anythink.expressad.videocommon.p178b.C2323h;
import com.anythink.expressad.videocommon.p178b.C2324i;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2322g {

    /* JADX INFO: renamed from: a */
    public static final String f14440a = "<anythinkloadend></anythinkloadend>";

    /* JADX INFO: renamed from: b */
    private static final String f14441b = "DownLoadUtils";

    /* JADX INFO: renamed from: c */
    private static final int f14442c = 20000;

    /* JADX INFO: renamed from: d */
    private static final int f14443d = 30000;

    /* JADX INFO: renamed from: a */
    public static void m11863a(final String str, final C2324i.c cVar) {
        try {
            if (!C1889w.m9867a(str) && URLUtil.isNetworkUrl(str)) {
                C2323h.a.f14448a.m11866a(new AbstractRunnableC1861a() { // from class: com.anythink.expressad.videocommon.b.g.1

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ boolean f14446f = true;

                    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:100|3)|(8:5|6|113|7|(8:108|8|(1:10)(1:115)|45|(1:47)|(1:51)|(3:107|55|(2:60|61))|(2:75|(2:77|78)(1:117))(2:71|(2:73|74)(1:116)))|11|(4:13|101|14|(2:16|17))(1:20)|21)(2:30|31)|103|32|(1:34)|(1:36)|37|(0)|(1:65)|75|(0)(0)|(1:(0))) */
                    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
                    
                        r2 = e;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:107:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:110:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa A[Catch: Exception -> 0x00ae, TRY_ENTER, TryCatch #0 {Exception -> 0x00ae, blocks: (B:34:0x0080, B:36:0x0085, B:47:0x00aa, B:51:0x00b2), top: B:100:0x0002 }] */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2 A[Catch: Exception -> 0x00ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ae, blocks: (B:34:0x0080, B:36:0x0085, B:47:0x00aa, B:51:0x00b2), top: B:100:0x0002 }] */
                    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6 A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #7 {all -> 0x00d0, blocks: (B:55:0x00bf, B:58:0x00c5, B:60:0x00c8, B:65:0x00d4, B:67:0x00da, B:69:0x00e0, B:71:0x00e8, B:73:0x00ec, B:75:0x00f2, B:77:0x00f6), top: B:107:0x00bf }] */
                    /* JADX WARN: Removed duplicated region for block: B:96:0x012a A[Catch: Exception -> 0x0126, TRY_LEAVE, TryCatch #10 {Exception -> 0x0126, blocks: (B:92:0x0122, B:96:0x012a), top: B:110:0x0122 }] */
                    @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
                    /* JADX INFO: renamed from: a */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void mo5269a() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 309
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.p178b.C2322g.AnonymousClass1.mo5269a():void");
                    }

                    @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
                    /* JADX INFO: renamed from: b */
                    public final void mo5270b() {
                    }

                    @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
                    /* JADX INFO: renamed from: c */
                    public final void mo5271c() {
                    }
                });
                return;
            }
            cVar.mo11841a("url is error");
        } catch (Throwable th) {
            if (C1404a.f6209a) {
                th.printStackTrace();
            }
        }
    }
}
