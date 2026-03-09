package com.anythink.expressad.videocommon.p178b;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import androidx.multidex.MultiDexExtractor;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a;
import com.anythink.expressad.foundation.p138h.C1888v;
import com.anythink.expressad.foundation.p138h.C1889w;
import com.anythink.expressad.videocommon.p178b.C2323h;
import com.anythink.expressad.videocommon.p178b.C2325j;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.i */
/* JADX INFO: loaded from: classes.dex */
public class C2324i {

    /* JADX INFO: renamed from: a */
    public static final String f14449a = "ending_page_source";

    /* JADX INFO: renamed from: b */
    public static final String f14450b = "ending_page_save_time";

    /* JADX INFO: renamed from: c */
    private static final String f14451c = "H5DownLoadManager";

    /* JADX INFO: renamed from: f */
    private static volatile C2324i f14452f;

    /* JADX INFO: renamed from: d */
    private CopyOnWriteArrayList<String> f14453d;

    /* JADX INFO: renamed from: e */
    private ConcurrentMap<String, C2319d> f14454e;

    /* JADX INFO: renamed from: g */
    private C2328m f14455g;

    /* JADX INFO: renamed from: h */
    private C2325j f14456h;

    /* JADX INFO: renamed from: i */
    private boolean f14457i = false;

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.i$1 */
    public class AnonymousClass1 extends AbstractRunnableC1861a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f14458a;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ a f14459e;

        /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.i$1$1 */
        public class C46831 implements c {
            public C46831() {
            }

            @Override // com.anythink.expressad.videocommon.p178b.C2324i.c
            /* JADX INFO: renamed from: a */
            public final void mo11839a() {
            }

            @Override // com.anythink.expressad.videocommon.p178b.C2324i.c
            /* JADX INFO: renamed from: a */
            public final void mo11841a(String str) {
                try {
                    C2324i.this.f14453d.remove(str);
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo5465a(str, str);
                    }
                } catch (Exception e) {
                    if (C1404a.f6209a) {
                        e.printStackTrace();
                    }
                    AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo5465a(str, str);
                    }
                }
            }

            @Override // com.anythink.expressad.videocommon.p178b.C2324i.c
            /* JADX INFO: renamed from: a */
            public final void mo11842a(byte[] bArr, String str) {
                try {
                    C2324i.this.f14453d.remove(str);
                    if (bArr == null || bArr.length <= 0) {
                        return;
                    }
                    if (C2324i.this.f14456h.m11888a(str, bArr)) {
                        a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo5464a(str);
                            return;
                        }
                        return;
                    }
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo5465a(str, "save file failed");
                    }
                } catch (Exception e) {
                    if (C1404a.f6209a) {
                        e.printStackTrace();
                    }
                    a aVar3 = aVar;
                    if (aVar3 != null) {
                        aVar3.mo5465a(str, e.getMessage());
                    }
                }
            }
        }

        public AnonymousClass1(String str, a aVar) {
            str = str;
            aVar = aVar;
        }

        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
        /* JADX INFO: renamed from: a */
        public final void mo5269a() {
            if (TextUtils.isEmpty(C2324i.this.f14456h.m11889b(str))) {
                C2322g.m11863a(str, new c() { // from class: com.anythink.expressad.videocommon.b.i.1.1
                    public C46831() {
                    }

                    @Override // com.anythink.expressad.videocommon.p178b.C2324i.c
                    /* JADX INFO: renamed from: a */
                    public final void mo11839a() {
                    }

                    @Override // com.anythink.expressad.videocommon.p178b.C2324i.c
                    /* JADX INFO: renamed from: a */
                    public final void mo11841a(String str) {
                        try {
                            C2324i.this.f14453d.remove(str);
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a aVar = aVar;
                            if (aVar != null) {
                                aVar.mo5465a(str, str);
                            }
                        } catch (Exception e) {
                            if (C1404a.f6209a) {
                                e.printStackTrace();
                            }
                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.mo5465a(str, str);
                            }
                        }
                    }

                    @Override // com.anythink.expressad.videocommon.p178b.C2324i.c
                    /* JADX INFO: renamed from: a */
                    public final void mo11842a(byte[] bArr, String str) {
                        try {
                            C2324i.this.f14453d.remove(str);
                            if (bArr == null || bArr.length <= 0) {
                                return;
                            }
                            if (C2324i.this.f14456h.m11888a(str, bArr)) {
                                a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo5464a(str);
                                    return;
                                }
                                return;
                            }
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.mo5465a(str, "save file failed");
                            }
                        } catch (Exception e) {
                            if (C1404a.f6209a) {
                                e.printStackTrace();
                            }
                            a aVar3 = aVar;
                            if (aVar3 != null) {
                                aVar3.mo5465a(str, e.getMessage());
                            }
                        }
                    }
                });
                return;
            }
            C2324i.this.f14453d.remove(str);
            a aVar = aVar;
            if (aVar != null) {
                aVar.mo5464a(str);
            }
        }

        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
        /* JADX INFO: renamed from: b */
        public final void mo5270b() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
        /* JADX INFO: renamed from: c */
        public final void mo5271c() {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.i$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo5464a(String str);

        /* JADX INFO: renamed from: a */
        void mo5465a(String str, String str2);
    }

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.i$b */
    public interface b extends a {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.i$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo11839a();

        /* JADX INFO: renamed from: a */
        void mo11841a(String str);

        /* JADX INFO: renamed from: a */
        void mo11842a(byte[] bArr, String str);
    }

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.i$d */
    public interface d extends a {
    }

    private C2324i() {
        try {
            this.f14455g = C2328m.m11910a();
            this.f14456h = C2325j.a.f14466a;
            this.f14453d = new CopyOnWriteArrayList<>();
            this.f14454e = new ConcurrentHashMap();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2324i m11867a() {
        if (f14452f == null) {
            synchronized (C2324i.class) {
                if (f14452f == null) {
                    f14452f = new C2324i();
                }
            }
        }
        return f14452f;
    }

    /* JADX INFO: renamed from: a */
    private void m11869a(String str, d dVar) {
        try {
            if (!TextUtils.isEmpty(this.f14455g.m11914a(str))) {
                if (dVar != null) {
                    dVar.mo5464a(str);
                }
            } else if (!this.f14454e.containsKey(str)) {
                C2319d c2319d = new C2319d(this.f14454e, this.f14455g, dVar, str);
                this.f14454e.put(str, c2319d);
                C2322g.m11863a(str, c2319d);
            } else {
                C2319d c2319d2 = this.f14454e.get(str);
                if (c2319d2 != null) {
                    c2319d2.m11840a(dVar);
                }
            }
        } catch (Exception e) {
            if (dVar != null) {
                dVar.mo5465a(str, "downloadzip failed");
            }
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m11870a(String str, String str2) {
        try {
            C1888v.m9861a(C1773a.m8548c().m8557e(), f14449a.concat(String.valueOf(str2)), str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11872b(String str, d dVar) {
        try {
            if (!TextUtils.isEmpty(this.f14455g.m11914a(str))) {
                if (dVar != null) {
                    dVar.mo5464a(str);
                }
            } else if (!this.f14454e.containsKey(str)) {
                C2319d c2319d = new C2319d(this.f14454e, this.f14455g, dVar, str);
                this.f14454e.put(str, c2319d);
                C2322g.m11863a(str, c2319d);
            } else {
                C2319d c2319d2 = this.f14454e.get(str);
                if (c2319d2 != null) {
                    c2319d2.m11840a(dVar);
                }
            }
        } catch (Exception e) {
            if (dVar != null) {
                dVar.mo5465a(str, "downloadzip failed");
            }
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m11873c(String str, a aVar) {
        try {
            if (this.f14453d.contains(str)) {
                return;
            }
            this.f14453d.add(str);
            C2323h.a.f14448a.m11866a(new AbstractRunnableC1861a() { // from class: com.anythink.expressad.videocommon.b.i.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f14458a;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ a f14459e;

                /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.i$1$1 */
                public class C46831 implements c {
                    public C46831() {
                    }

                    @Override // com.anythink.expressad.videocommon.p178b.C2324i.c
                    /* JADX INFO: renamed from: a */
                    public final void mo11839a() {
                    }

                    @Override // com.anythink.expressad.videocommon.p178b.C2324i.c
                    /* JADX INFO: renamed from: a */
                    public final void mo11841a(String str) {
                        try {
                            C2324i.this.f14453d.remove(str);
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a aVar = aVar;
                            if (aVar != null) {
                                aVar.mo5465a(str, str);
                            }
                        } catch (Exception e) {
                            if (C1404a.f6209a) {
                                e.printStackTrace();
                            }
                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.mo5465a(str, str);
                            }
                        }
                    }

                    @Override // com.anythink.expressad.videocommon.p178b.C2324i.c
                    /* JADX INFO: renamed from: a */
                    public final void mo11842a(byte[] bArr, String str) {
                        try {
                            C2324i.this.f14453d.remove(str);
                            if (bArr == null || bArr.length <= 0) {
                                return;
                            }
                            if (C2324i.this.f14456h.m11888a(str, bArr)) {
                                a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo5464a(str);
                                    return;
                                }
                                return;
                            }
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.mo5465a(str, "save file failed");
                            }
                        } catch (Exception e) {
                            if (C1404a.f6209a) {
                                e.printStackTrace();
                            }
                            a aVar3 = aVar;
                            if (aVar3 != null) {
                                aVar3.mo5465a(str, e.getMessage());
                            }
                        }
                    }
                }

                public AnonymousClass1(String str2, a aVar2) {
                    str = str2;
                    aVar = aVar2;
                }

                @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
                /* JADX INFO: renamed from: a */
                public final void mo5269a() {
                    if (TextUtils.isEmpty(C2324i.this.f14456h.m11889b(str))) {
                        C2322g.m11863a(str, new c() { // from class: com.anythink.expressad.videocommon.b.i.1.1
                            public C46831() {
                            }

                            @Override // com.anythink.expressad.videocommon.p178b.C2324i.c
                            /* JADX INFO: renamed from: a */
                            public final void mo11839a() {
                            }

                            @Override // com.anythink.expressad.videocommon.p178b.C2324i.c
                            /* JADX INFO: renamed from: a */
                            public final void mo11841a(String str2) {
                                try {
                                    C2324i.this.f14453d.remove(str);
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    a aVar2 = aVar;
                                    if (aVar2 != null) {
                                        aVar2.mo5465a(str, str2);
                                    }
                                } catch (Exception e) {
                                    if (C1404a.f6209a) {
                                        e.printStackTrace();
                                    }
                                    AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                    a aVar22 = aVar;
                                    if (aVar22 != null) {
                                        aVar22.mo5465a(str, str2);
                                    }
                                }
                            }

                            @Override // com.anythink.expressad.videocommon.p178b.C2324i.c
                            /* JADX INFO: renamed from: a */
                            public final void mo11842a(byte[] bArr, String str2) {
                                try {
                                    C2324i.this.f14453d.remove(str2);
                                    if (bArr == null || bArr.length <= 0) {
                                        return;
                                    }
                                    if (C2324i.this.f14456h.m11888a(str2, bArr)) {
                                        a aVar2 = aVar;
                                        if (aVar2 != null) {
                                            aVar2.mo5464a(str2);
                                            return;
                                        }
                                        return;
                                    }
                                    a aVar22 = aVar;
                                    if (aVar22 != null) {
                                        aVar22.mo5465a(str2, "save file failed");
                                    }
                                } catch (Exception e) {
                                    if (C1404a.f6209a) {
                                        e.printStackTrace();
                                    }
                                    a aVar3 = aVar;
                                    if (aVar3 != null) {
                                        aVar3.mo5465a(str2, e.getMessage());
                                    }
                                }
                            }
                        });
                        return;
                    }
                    C2324i.this.f14453d.remove(str);
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo5464a(str);
                    }
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
        } catch (Throwable th) {
            if (C1404a.f6209a) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private String m11874d(String str) {
        C2325j c2325j = this.f14456h;
        return c2325j != null ? c2325j.m11887a(str) : str;
    }

    /* JADX INFO: renamed from: e */
    private static String m11875e(String str) {
        try {
            Object objM9864b = C1888v.m9864b(C1773a.m8548c().m8557e(), f14449a.concat(String.valueOf(str)), "");
            if (objM9864b == null || !(objM9864b instanceof String)) {
                return null;
            }
            String str2 = (String) objM9864b;
            if (C1889w.m9868b(str2)) {
                return str2;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private static long m11876f(String str) {
        try {
            Object objM9864b = C1888v.m9864b(C1773a.m8548c().m8557e(), f14450b.concat(String.valueOf(str)), 0L);
            if (objM9864b != null && (objM9864b instanceof Long)) {
                return ((Long) objM9864b).longValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: g */
    private static void m11877g(String str) {
        try {
            C1888v.m9861a(C1773a.m8548c().m8557e(), f14450b.concat(String.valueOf(str)), Long.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: h */
    private void m11878h(String str) {
        m11882b(str, (a) null);
    }

    /* JADX INFO: renamed from: a */
    public final String m11879a(String str) {
        C2328m c2328m = this.f14455g;
        if (c2328m != null) {
            return c2328m.m11914a(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m11880a(String str, a aVar) {
        m11873c(str, aVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m11881b(String str) {
        m11873c(str, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m11882b(String str, a aVar) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                String path = Uri.parse(str).getPath();
                if (!TextUtils.isEmpty(path)) {
                    if (path.toLowerCase().endsWith(MultiDexExtractor.EXTRACTED_SUFFIX)) {
                        m11869a(str, (d) aVar);
                        return;
                    } else {
                        m11873c(str, aVar);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (aVar != null) {
            aVar.mo5465a(str, "The URL does not contain a path ");
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m11883c(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri uri = Uri.parse(str);
                String path = uri.getPath();
                if (TextUtils.isEmpty(path) || !TextUtils.isEmpty(uri.getQueryParameter("urlDebug"))) {
                    return str;
                }
                if (path.toLowerCase().endsWith(MultiDexExtractor.EXTRACTED_SUFFIX)) {
                    return m11879a(str);
                }
                C2325j c2325j = this.f14456h;
                return c2325j != null ? c2325j.m11887a(str) : str;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}
