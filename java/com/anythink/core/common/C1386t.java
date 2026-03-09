package com.anythink.core.common;

import com.anythink.core.api.AdError;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p052c.C1182c;
import com.anythink.core.common.p052c.C1186g;
import com.anythink.core.common.p055f.C1256u;
import com.anythink.core.common.p058h.C1286n;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p058h.p059a.AbstractC1271c;
import com.anythink.core.common.p058h.p059a.C1270b;
import com.anythink.core.common.p066o.C1343g;
import com.anythink.core.common.p066o.p068b.C1335b;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.t */
/* JADX INFO: loaded from: classes.dex */
public class C1386t {

    /* JADX INFO: renamed from: c */
    private static volatile C1386t f5605c;

    /* JADX INFO: renamed from: b */
    private String f5607b = C1386t.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public AtomicInteger f5606a = new AtomicInteger(0);

    /* JADX INFO: renamed from: com.anythink.core.common.t$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5608a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f5609b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f5610c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f5611d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f5612e;

        public AnonymousClass1(int i, String str, String str2, String str3, String str4) {
            i = i;
            str = str;
            str = str2;
            str = str3;
            str = str4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1256u c1256u = new C1256u();
            c1256u.f4474b = i;
            c1256u.f4476d = str;
            c1256u.f4475c = str;
            c1256u.f4477e = str;
            c1256u.f4478f = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(c1256u.f4478f);
            sb.append(str);
            c1256u.f4473a = C1343g.m4123a(sb.toString() != null ? str : "");
            c1256u.f4479g = str;
            String unused = C1386t.this.f5607b;
            new StringBuilder("save request:").append(c1256u.m3443a());
            C1186g.m2238a(C1182c.m2210a(C1175n.m2059a().m2148f())).m2240a(c1256u);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.t$2 */
    public class AnonymousClass2 implements AbstractC1271c.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1256u f5614a;

        public AnonymousClass2(C1256u c1256u) {
            c1256u = c1256u;
        }

        @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c.a
        /* JADX INFO: renamed from: a */
        public final void mo3660a(Object obj) {
            String unused = C1386t.this.f5607b;
            new StringBuilder("re-send success.... ").append(c1256u.m3443a());
            C1186g.m2238a(C1182c.m2210a(C1175n.m2059a().m2148f())).m2241b(c1256u);
            C1386t.this.f5606a.decrementAndGet();
        }

        @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c.a
        /* JADX INFO: renamed from: a */
        public final void mo3661a(Throwable th) {
            String unused = C1386t.this.f5607b;
            StringBuilder sb = new StringBuilder("re-send fail.... ");
            sb.append(c1256u.m3443a());
            sb.append("--error: ");
            sb.append(th.getMessage());
            C1386t.this.f5606a.decrementAndGet();
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.t$3 */
    public class AnonymousClass3 implements InterfaceC1283k {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1256u f5616a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1286n f5617b;

        public AnonymousClass3(C1256u c1256u, C1286n c1286n) {
            c1256u = c1256u;
            c1286n = c1286n;
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadCanceled(int i) {
            C1386t.this.f5606a.decrementAndGet();
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadError(int i, String str, AdError adError) {
            String unused = C1386t.this.f5607b;
            StringBuilder sb = new StringBuilder("re-send fail.... ");
            sb.append(c1256u.m3443a());
            sb.append("--error: ");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            C1386t.this.f5606a.decrementAndGet();
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadFinish(int i, Object obj) {
            String unused = C1386t.this.f5607b;
            new StringBuilder("re-send success.... ").append(c1256u.m3443a());
            C1186g.m2238a(C1182c.m2210a(C1175n.m2059a().m2148f())).m2241b(c1286n.m3689q());
            C1386t.this.f5606a.decrementAndGet();
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadStart(int i) {
        }
    }

    private C1386t() {
    }

    /* JADX INFO: renamed from: a */
    public static C1386t m4552a() {
        if (f5605c == null) {
            synchronized (C1386t.class) {
                if (f5605c == null) {
                    f5605c = new C1386t();
                }
            }
        }
        return f5605c;
    }

    /* JADX INFO: renamed from: a */
    public final void m4554a(int i, String str, String str2, String str3, String str4) {
        C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.core.common.t.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f5608a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f5609b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f5610c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String f5611d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ String f5612e;

            public AnonymousClass1(int i2, String str5, String str22, String str32, String str42) {
                i = i2;
                str = str5;
                str = str22;
                str = str32;
                str = str42;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1256u c1256u = new C1256u();
                c1256u.f4474b = i;
                c1256u.f4476d = str;
                c1256u.f4475c = str;
                c1256u.f4477e = str;
                c1256u.f4478f = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(c1256u.f4478f);
                sb.append(str);
                c1256u.f4473a = C1343g.m4123a(sb.toString() != null ? str : "");
                c1256u.f4479g = str;
                String unused = C1386t.this.f5607b;
                new StringBuilder("save request:").append(c1256u.m3443a());
                C1186g.m2238a(C1182c.m2210a(C1175n.m2059a().m2148f())).m2240a(c1256u);
            }
        }, 16, true);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4555b() {
        List<C1256u> listM2242c;
        if (this.f5606a.get() <= 0 && (listM2242c = C1186g.m2238a(C1182c.m2210a(C1175n.m2059a().m2148f())).m2242c()) != null && listM2242c.size() > 0) {
            this.f5606a.set(listM2242c.size());
            new StringBuilder("need to send request count: ").append(this.f5606a.get());
            for (C1256u c1256u : listM2242c) {
                if (System.currentTimeMillis() - c1256u.f4478f >= 604800000) {
                    this.f5606a.decrementAndGet();
                    C1186g.m2238a(C1182c.m2210a(C1175n.m2059a().m2148f())).m2241b(c1256u);
                } else {
                    int iOptInt = 1000;
                    try {
                        iOptInt = new JSONObject(c1256u.f4479g).optInt(C1256u.f4470h);
                    } catch (Throwable unused) {
                    }
                    if (c1256u.f4474b == 3) {
                        new C1270b(c1256u.f4477e, iOptInt).m3657a(new AbstractC1271c.a() { // from class: com.anythink.core.common.t.2

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ C1256u f5614a;

                            public AnonymousClass2(C1256u c1256u2) {
                                c1256u = c1256u2;
                            }

                            @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c.a
                            /* JADX INFO: renamed from: a */
                            public final void mo3660a(Object obj) {
                                String unused2 = C1386t.this.f5607b;
                                new StringBuilder("re-send success.... ").append(c1256u.m3443a());
                                C1186g.m2238a(C1182c.m2210a(C1175n.m2059a().m2148f())).m2241b(c1256u);
                                C1386t.this.f5606a.decrementAndGet();
                            }

                            @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c.a
                            /* JADX INFO: renamed from: a */
                            public final void mo3661a(Throwable th) {
                                String unused2 = C1386t.this.f5607b;
                                StringBuilder sb = new StringBuilder("re-send fail.... ");
                                sb.append(c1256u.m3443a());
                                sb.append("--error: ");
                                sb.append(th.getMessage());
                                C1386t.this.f5606a.decrementAndGet();
                            }
                        });
                    } else {
                        C1286n c1286n = new C1286n(c1256u2);
                        if (iOptInt == 1001) {
                            c1286n.m3688p();
                        }
                        c1286n.mo3639a(0, (InterfaceC1283k) new InterfaceC1283k() { // from class: com.anythink.core.common.t.3

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ C1256u f5616a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ C1286n f5617b;

                            public AnonymousClass3(C1256u c1256u2, C1286n c1286n2) {
                                c1256u = c1256u2;
                                c1286n = c1286n2;
                            }

                            @Override // com.anythink.core.common.p058h.InterfaceC1283k
                            public final void onLoadCanceled(int i) {
                                C1386t.this.f5606a.decrementAndGet();
                            }

                            @Override // com.anythink.core.common.p058h.InterfaceC1283k
                            public final void onLoadError(int i, String str, AdError adError) {
                                String unused2 = C1386t.this.f5607b;
                                StringBuilder sb = new StringBuilder("re-send fail.... ");
                                sb.append(c1256u.m3443a());
                                sb.append("--error: ");
                                if (str == null) {
                                    str = "";
                                }
                                sb.append(str);
                                C1386t.this.f5606a.decrementAndGet();
                            }

                            @Override // com.anythink.core.common.p058h.InterfaceC1283k
                            public final void onLoadFinish(int i, Object obj) {
                                String unused2 = C1386t.this.f5607b;
                                new StringBuilder("re-send success.... ").append(c1256u.m3443a());
                                C1186g.m2238a(C1182c.m2210a(C1175n.m2059a().m2148f())).m2241b(c1286n.m3689q());
                                C1386t.this.f5606a.decrementAndGet();
                            }

                            @Override // com.anythink.core.common.p058h.InterfaceC1283k
                            public final void onLoadStart(int i) {
                            }
                        });
                    }
                }
            }
        }
    }
}
