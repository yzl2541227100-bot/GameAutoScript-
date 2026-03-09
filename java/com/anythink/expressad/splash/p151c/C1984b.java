package com.anythink.expressad.splash.p151c;

import android.graphics.Bitmap;
import android.text.TextUtils;
import cn.haorui.sdk.adsail_ad.view.scaleImage.ImageSource;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.splash.p151c.C1987e;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.splash.view.InterfaceC2020a;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.expressad.splash.c.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1984b {

    /* JADX INFO: renamed from: a */
    private static String f12511a = "ResManager";

    /* JADX INFO: renamed from: b */
    private static int f12512b = 1;

    /* JADX INFO: renamed from: c */
    private static ConcurrentHashMap<String, Boolean> f12513c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.b$1 */
    public class AnonymousClass1 implements InterfaceC1819c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC2020a f12515b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ATSplashView f12516c;

        public AnonymousClass1(InterfaceC2020a interfaceC2020a, ATSplashView aTSplashView) {
            interfaceC2020a = interfaceC2020a;
            aTSplashView = aTSplashView;
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            C1984b.f12513c.put(c1781c.m10151be(), Boolean.TRUE);
            InterfaceC2020a interfaceC2020a = interfaceC2020a;
            if (interfaceC2020a != null) {
                interfaceC2020a.mo10605a();
            }
            ATSplashView aTSplashView = aTSplashView;
            if (aTSplashView != null) {
                aTSplashView.setImageReady(true);
            }
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
            C1984b.f12513c.put(c1781c.m10151be(), Boolean.FALSE);
            InterfaceC2020a interfaceC2020a = interfaceC2020a;
            if (interfaceC2020a != null) {
                interfaceC2020a.mo10606b();
            }
            ATSplashView aTSplashView = aTSplashView;
            if (aTSplashView != null) {
                aTSplashView.setImageReady(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.b$2 */
    public class AnonymousClass2 implements InterfaceC1819c {
        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10551a(ATSplashView aTSplashView, C1781c c1781c, InterfaceC2020a interfaceC2020a) {
        C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(c1781c.m10151be(), new InterfaceC1819c() { // from class: com.anythink.expressad.splash.c.b.1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC2020a f12515b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ATSplashView f12516c;

            public AnonymousClass1(InterfaceC2020a interfaceC2020a2, ATSplashView aTSplashView2) {
                interfaceC2020a = interfaceC2020a2;
                aTSplashView = aTSplashView2;
            }

            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5462a(Bitmap bitmap, String str) {
                C1984b.f12513c.put(c1781c.m10151be(), Boolean.TRUE);
                InterfaceC2020a interfaceC2020a2 = interfaceC2020a;
                if (interfaceC2020a2 != null) {
                    interfaceC2020a2.mo10605a();
                }
                ATSplashView aTSplashView2 = aTSplashView;
                if (aTSplashView2 != null) {
                    aTSplashView2.setImageReady(true);
                }
            }

            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5463a(String str, String str2) {
                C1984b.f12513c.put(c1781c.m10151be(), Boolean.FALSE);
                InterfaceC2020a interfaceC2020a2 = interfaceC2020a;
                if (interfaceC2020a2 != null) {
                    interfaceC2020a2.mo10606b();
                }
                ATSplashView aTSplashView2 = aTSplashView;
                if (aTSplashView2 != null) {
                    aTSplashView2.setImageReady(false);
                }
            }
        });
        if (TextUtils.isEmpty(c1781c.m10150bd())) {
            return;
        }
        C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(c1781c.m10150bd(), new InterfaceC1819c() { // from class: com.anythink.expressad.splash.c.b.2
            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5462a(Bitmap bitmap, String str) {
            }

            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5463a(String str, String str2) {
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static void m10552a(ATSplashView aTSplashView, String str, C1781c c1781c, String str2, String str3, boolean z, int i, boolean z3) {
        C1987e.c cVar = new C1987e.c();
        cVar.m10679c(str3);
        cVar.m10676b(str2);
        cVar.m10672a(c1781c);
        cVar.m10673a(str);
        cVar.m10677b(z);
        cVar.m10671a(i);
        cVar.m10674a(z3);
        C1987e.a.f12606a.m10667a(aTSplashView, cVar, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m10553a(String str) {
        f12513c.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x002f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m10554a(com.anythink.expressad.foundation.p116d.C1781c r7) {
        /*
            java.lang.String r0 = r7.m8811S()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2f
            com.anythink.expressad.videocommon.p178b.C2316a.m11773a()
            java.lang.String r0 = r7.m8811S()
            java.lang.String r0 = com.anythink.expressad.videocommon.p178b.C2316a.m11774a(r0)
            boolean r3 = com.anythink.expressad.foundation.p138h.C1889w.m9867a(r0)
            if (r3 != 0) goto L2d
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            long r3 = r3.length()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L2d
            goto L2f
        L2d:
            r0 = 0
            goto L30
        L2f:
            r0 = 1
        L30:
            if (r0 == 0) goto L47
            java.lang.String r3 = r7.m8862c()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L47
            java.lang.String r3 = r7.m8866d()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L47
            r0 = 0
        L47:
            boolean r3 = r7.m8886j()
            if (r3 == 0) goto L6e
            java.lang.String r0 = r7.m10151be()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6c
            java.lang.String r7 = r7.m10151be()
            java.lang.String r7 = com.anythink.expressad.foundation.p138h.C1885s.m9804a(r7)
            android.graphics.Bitmap r7 = com.anythink.expressad.foundation.p120g.p124d.C1817a.m9423a(r7)
            if (r7 == 0) goto L6c
            boolean r7 = r7.isRecycled()
            if (r7 != 0) goto L6c
            goto L6f
        L6c:
            r1 = 0
            goto L6f
        L6e:
            r1 = r0
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.splash.p151c.C1984b.m10554a(com.anythink.expressad.foundation.d.c):boolean");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10555a(ATSplashView aTSplashView, C1781c c1781c) {
        if (aTSplashView == null) {
            return false;
        }
        boolean zIsVideoReady = TextUtils.isEmpty(c1781c.m8811S()) ? true : aTSplashView.isVideoReady();
        if (zIsVideoReady && !TextUtils.isEmpty(c1781c.m8862c())) {
            zIsVideoReady = aTSplashView.isH5Ready();
        }
        if (zIsVideoReady && TextUtils.isEmpty(c1781c.m8862c()) && !TextUtils.isEmpty(c1781c.m8866d())) {
            zIsVideoReady = aTSplashView.isH5Ready();
        }
        if (TextUtils.isEmpty(c1781c.m8862c()) && TextUtils.isEmpty(c1781c.m8866d())) {
            zIsVideoReady = false;
        }
        if (!c1781c.m8886j()) {
            return zIsVideoReady;
        }
        if (TextUtils.isEmpty(c1781c.m10151be())) {
            return false;
        }
        return aTSplashView.isImageReady();
    }

    /* JADX INFO: renamed from: b */
    private static C1781c m10556b(C1781c c1781c) {
        if (!TextUtils.isEmpty(c1781c.m8862c()) || (!TextUtils.isEmpty(c1781c.m8866d()) && c1781c.m8866d().contains("<MBTPLMARK>"))) {
            c1781c.m8824a(true);
            c1781c.m8861b(false);
        } else {
            c1781c.m8824a(false);
            c1781c.m8861b(true);
        }
        return c1781c;
    }

    /* JADX INFO: renamed from: b */
    private static String m10557b(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return ImageSource.FILE_SCHEME + file.getAbsolutePath();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e) {
                e.getMessage();
                return "";
            }
        }
    }
}
