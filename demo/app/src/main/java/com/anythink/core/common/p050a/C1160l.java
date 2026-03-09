package com.anythink.core.common.p050a;

import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p052c.C1182c;
import com.anythink.core.common.p052c.C1192m;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.res.p070a.C1377c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.common.a.l */
/* JADX INFO: loaded from: classes.dex */
public class C1160l {

    /* JADX INFO: renamed from: b */
    private static volatile C1160l f2965b;

    /* JADX INFO: renamed from: e */
    private long f2969e;

    /* JADX INFO: renamed from: a */
    public final String f2966a = C1160l.class.getSimpleName();

    /* JADX INFO: renamed from: f */
    private long f2970f = 0;

    /* JADX INFO: renamed from: c */
    private C1192m f2967c = C1192m.m2281a(C1182c.m2210a(C1175n.m2059a().m2148f()));

    /* JADX INFO: renamed from: d */
    private Map<String, Integer> f2968d = new HashMap();

    /* JADX INFO: renamed from: com.anythink.core.common.a.l$1 */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            new ArrayList();
            C1160l c1160l = C1160l.this;
            c1160l.f2970f = c1160l.f2967c.m2287c();
            StringBuilder sb = new StringBuilder("recycleSpace check curDownloadedVideoFileSize:");
            sb.append(C1160l.this.f2970f);
            sb.append(",MAX_VIDEO_CACHE_SIZE:");
            sb.append(C1160l.this.f2969e);
            if (C1160l.this.f2970f > C1160l.this.f2969e) {
                List<C1159k> listM2289d = C1160l.this.f2967c.m2289d();
                new StringBuilder("recycleSpace start to delete video file,file list size:").append(listM2289d.size());
                for (C1159k c1159k : listM2289d) {
                    try {
                        File file = new File(c1159k.m1988b());
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Throwable unused) {
                    }
                    try {
                        if (!TextUtils.isEmpty(c1159k.m1984a())) {
                            String strM1984a = c1159k.m1984a();
                            C1160l.this.f2968d.remove(strM1984a);
                            C1377c.m4478a().m4480b(strM1984a);
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.a.l$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1159k f2972a;

        public AnonymousClass2(C1159k c1159k) {
            this.f2972a = c1159k;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                File file = new File(this.f2972a.m1988b());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable unused) {
            }
            C1160l.this.f2967c.m2288c(this.f2972a.m1984a());
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.a.l$3 */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f2974a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f2975b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f2976c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f2977d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f2978e;

        public AnonymousClass3(String str, String str2, long j, long j2, int i) {
            str = str;
            str = str2;
            j = j;
            j = j2;
            i = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1160l.this.f2967c.m2285a(str, str, j, j, i);
        }
    }

    private C1160l() {
        this.f2969e = 209715200L;
        this.f2969e = C1175n.m2059a().m2138c(4);
    }

    /* JADX INFO: renamed from: a */
    public static C1160l m1996a() {
        if (f2965b == null) {
            synchronized (C1160l.class) {
                if (f2965b == null) {
                    f2965b = new C1160l();
                }
            }
        }
        return f2965b;
    }

    /* JADX INFO: renamed from: a */
    private void m1998a(C1159k c1159k) {
        if (c1159k == null) {
            return;
        }
        C1335b.m3998a().m4007a((Runnable) new AnonymousClass2(c1159k), 13, true);
    }

    /* JADX INFO: renamed from: a */
    public final C1159k m2002a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f2967c.m2284a(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m2003a(String str, String str2, long j, long j2, int i, boolean z) {
        this.f2968d.put(str, Integer.valueOf(i));
        if (z) {
            C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.core.common.a.l.3

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f2974a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f2975b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f2976c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ long f2977d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f2978e;

                public AnonymousClass3(String str3, String str22, long j3, long j22, int i2) {
                    str = str3;
                    str = str22;
                    j = j3;
                    j = j22;
                    i = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1160l.this.f2967c.m2285a(str, str, j, j, i);
                }
            }, 13, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m2004a(String str, int i) {
        return m2005b(str) >= i;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized int m2005b(String str) {
        if (this.f2968d.containsKey(str) && this.f2968d.get(str) != null) {
            return this.f2968d.get(str).intValue();
        }
        C1159k c1159kM2284a = this.f2967c.m2284a(str);
        if (c1159kM2284a == null || c1159kM2284a.m1991c() <= 0) {
            return 0;
        }
        File file = new File(c1159kM2284a.m1988b());
        if (!file.exists() || file.length() < c1159kM2284a.m1994e()) {
            if (c1159kM2284a != null) {
                C1335b.m3998a().m4007a((Runnable) new AnonymousClass2(c1159kM2284a), 13, true);
            }
            return 0;
        }
        this.f2968d.put(str, Integer.valueOf(c1159kM2284a.m1991c()));
        this.f2967c.m2286b(str);
        return c1159kM2284a.m1991c();
    }

    /* JADX INFO: renamed from: b */
    public final void m2006b() {
        C1335b.m3998a().m4006a((Runnable) new Runnable() { // from class: com.anythink.core.common.a.l.1
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                new ArrayList();
                C1160l c1160l = C1160l.this;
                c1160l.f2970f = c1160l.f2967c.m2287c();
                StringBuilder sb = new StringBuilder("recycleSpace check curDownloadedVideoFileSize:");
                sb.append(C1160l.this.f2970f);
                sb.append(",MAX_VIDEO_CACHE_SIZE:");
                sb.append(C1160l.this.f2969e);
                if (C1160l.this.f2970f > C1160l.this.f2969e) {
                    List<C1159k> listM2289d = C1160l.this.f2967c.m2289d();
                    new StringBuilder("recycleSpace start to delete video file,file list size:").append(listM2289d.size());
                    for (C1159k c1159k : listM2289d) {
                        try {
                            File file = new File(c1159k.m1988b());
                            if (file.exists()) {
                                file.delete();
                            }
                        } catch (Throwable unused) {
                        }
                        try {
                            if (!TextUtils.isEmpty(c1159k.m1984a())) {
                                String strM1984a = c1159k.m1984a();
                                C1160l.this.f2968d.remove(strM1984a);
                                C1377c.m4478a().m4480b(strM1984a);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        }, 13);
    }

    /* JADX INFO: renamed from: c */
    public final long m2007c() {
        return this.f2969e;
    }

    /* JADX INFO: renamed from: d */
    public final long m2008d() {
        return this.f2970f;
    }
}
