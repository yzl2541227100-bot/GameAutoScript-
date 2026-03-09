package com.anythink.expressad.foundation.p120g.p124d;

import android.content.Context;
import android.graphics.Bitmap;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.expressad.foundation.p120g.p121a.C1804c;
import com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e;
import com.anythink.expressad.foundation.p120g.p124d.C1820d;
import com.anythink.expressad.foundation.p120g.p135g.C1863c;
import com.anythink.expressad.foundation.p138h.C1885s;
import com.anythink.expressad.foundation.p138h.C1886t;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.d.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1818b {

    /* JADX INFO: renamed from: a */
    private static final String f11246a = "ImageLoader";

    /* JADX INFO: renamed from: b */
    private static final int f11247b = 1;

    /* JADX INFO: renamed from: c */
    private static final int f11248c = 2;

    /* JADX INFO: renamed from: d */
    private static final String f11249d = "message_key";

    /* JADX INFO: renamed from: e */
    private static final String f11250e = "message_bitmap";

    /* JADX INFO: renamed from: f */
    private static final String f11251f = "message_message";

    /* JADX INFO: renamed from: g */
    private static C1818b f11252g;

    /* JADX INFO: renamed from: h */
    private C1863c f11253h;

    /* JADX INFO: renamed from: j */
    private final LinkedHashMap<String, List<InterfaceC1819c>> f11255j = new LinkedHashMap<>();

    /* JADX INFO: renamed from: i */
    private InterfaceC1806e<String, Bitmap> f11254i = new C1804c(((int) Runtime.getRuntime().maxMemory()) / 5);

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.d.b$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f11256a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f11257b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f11258c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC1819c f11259d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f11260e = false;

        public AnonymousClass1(String str, String str2, String str3, InterfaceC1819c interfaceC1819c) {
            this.f11256a = str;
            this.f11257b = str2;
            this.f11258c = str3;
            this.f11259d = interfaceC1819c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            File file = new File(this.f11256a);
            Bitmap bitmapM9441a = C1818b.this.m9441a(this.f11257b);
            if (bitmapM9441a != null && !bitmapM9441a.isRecycled()) {
                C1818b.m9431a(C1818b.this, this.f11258c, bitmapM9441a, this.f11259d);
                return;
            }
            if (file.length() <= 0) {
                C1818b.m9433a(C1818b.this, this.f11258c, this.f11257b, this.f11256a, false, this.f11259d);
                return;
            }
            Bitmap bitmapM9423a = C1817a.m9423a(this.f11256a);
            if (bitmapM9423a == null || bitmapM9423a.isRecycled()) {
                C1818b.m9433a(C1818b.this, this.f11258c, this.f11257b, this.f11256a, true, this.f11259d);
            } else {
                C1818b.this.m9442a(this.f11257b, bitmapM9423a);
                C1818b.m9431a(C1818b.this, this.f11258c, bitmapM9423a, this.f11259d);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.d.b$2 */
    public class AnonymousClass2 implements C1820d.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f11262a;

        /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.d.b$2$1 */
        public class AnonymousClass1 extends AbstractRunnableC1337d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f11264a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f11265b;

            public AnonymousClass1(String str, String str2) {
                str = str;
                str = str2;
            }

            @Override // com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d
            /* JADX INFO: renamed from: a */
            public final void mo1492a() {
                synchronized (C1818b.this.f11255j) {
                    Bitmap bitmapM9423a = C1817a.m9423a(str);
                    C1818b.this.m9442a(str, bitmapM9423a);
                    LinkedList<InterfaceC1819c> linkedList = (LinkedList) C1818b.this.f11255j.remove(str);
                    if (linkedList != null) {
                        for (InterfaceC1819c interfaceC1819c : linkedList) {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            C1818b.m9431a(C1818b.this, anonymousClass2.f11262a, bitmapM9423a, interfaceC1819c);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.d.b$2$2 */
        public class C46792 extends AbstractRunnableC1337d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f11267a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f11268b;

            public C46792(String str, String str2) {
                str = str;
                str = str2;
            }

            @Override // com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d
            /* JADX INFO: renamed from: a */
            public final void mo1492a() {
                synchronized (C1818b.this.f11255j) {
                    LinkedList<InterfaceC1819c> linkedList = (LinkedList) C1818b.this.f11255j.remove(str);
                    if (linkedList != null) {
                        for (InterfaceC1819c interfaceC1819c : linkedList) {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            C1818b c1818b = C1818b.this;
                            String str = anonymousClass2.f11262a;
                            C1175n.m2059a().m2135b(c1818b.new AnonymousClass4(interfaceC1819c, str, str));
                        }
                    }
                }
            }
        }

        public AnonymousClass2(String str) {
            this.f11262a = str;
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.C1820d.a
        /* JADX INFO: renamed from: a */
        public final void mo9446a(String str, String str2) {
            C1335b.m3998a().m4005a(new AbstractRunnableC1337d() { // from class: com.anythink.expressad.foundation.g.d.b.2.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f11264a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f11265b;

                public AnonymousClass1(String str22, String str3) {
                    str = str22;
                    str = str3;
                }

                @Override // com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d
                /* JADX INFO: renamed from: a */
                public final void mo1492a() {
                    synchronized (C1818b.this.f11255j) {
                        Bitmap bitmapM9423a = C1817a.m9423a(str);
                        C1818b.this.m9442a(str, bitmapM9423a);
                        LinkedList<InterfaceC1819c> linkedList = (LinkedList) C1818b.this.f11255j.remove(str);
                        if (linkedList != null) {
                            for (InterfaceC1819c interfaceC1819c : linkedList) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                C1818b.m9431a(C1818b.this, anonymousClass2.f11262a, bitmapM9423a, interfaceC1819c);
                            }
                        }
                    }
                }
            });
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.C1820d.a
        /* JADX INFO: renamed from: b */
        public final void mo9447b(String str, String str2) {
            C1335b.m3998a().m4005a(new AbstractRunnableC1337d() { // from class: com.anythink.expressad.foundation.g.d.b.2.2

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f11267a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f11268b;

                public C46792(String str3, String str22) {
                    str = str3;
                    str = str22;
                }

                @Override // com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d
                /* JADX INFO: renamed from: a */
                public final void mo1492a() {
                    synchronized (C1818b.this.f11255j) {
                        LinkedList<InterfaceC1819c> linkedList = (LinkedList) C1818b.this.f11255j.remove(str);
                        if (linkedList != null) {
                            for (InterfaceC1819c interfaceC1819c : linkedList) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                C1818b c1818b = C1818b.this;
                                String str3 = anonymousClass2.f11262a;
                                C1175n.m2059a().m2135b(c1818b.new AnonymousClass4(interfaceC1819c, str, str3));
                            }
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.d.b$3 */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1819c f11270a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Bitmap f11271b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f11272c;

        public AnonymousClass3(InterfaceC1819c interfaceC1819c, Bitmap bitmap, String str) {
            this.f11270a = interfaceC1819c;
            this.f11271b = bitmap;
            this.f11272c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f11270a != null) {
                Bitmap bitmap = this.f11271b;
                if (bitmap == null || bitmap.isRecycled()) {
                    this.f11270a.mo5463a("bitmap no available", this.f11272c);
                } else {
                    this.f11270a.mo5462a(this.f11271b, this.f11272c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.d.b$4 */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1819c f11274a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f11275b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f11276c;

        public AnonymousClass4(InterfaceC1819c interfaceC1819c, String str, String str2) {
            this.f11274a = interfaceC1819c;
            this.f11275b = str;
            this.f11276c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC1819c interfaceC1819c = this.f11274a;
            if (interfaceC1819c != null) {
                interfaceC1819c.mo5463a(this.f11275b, this.f11276c);
            }
        }
    }

    private C1818b(Context context) {
        this.f11253h = new C1863c(context);
    }

    /* JADX INFO: renamed from: a */
    public static C1818b m9427a(Context context) {
        if (f11252g == null) {
            f11252g = new C1818b(context);
        }
        return f11252g;
    }

    /* JADX INFO: renamed from: a */
    private C1820d m9428a(String str, String str2, String str3, boolean z) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(str);
        C1820d c1820d = new C1820d(str, str2, str3);
        c1820d.m9461a(z);
        c1820d.m9460a(anonymousClass2);
        return c1820d;
    }

    /* JADX INFO: renamed from: a */
    public static void m9430a() {
        InterfaceC1806e<String, Bitmap> interfaceC1806e = f11252g.f11254i;
        if (interfaceC1806e != null) {
            interfaceC1806e.mo5252b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9431a(C1818b c1818b, String str, Bitmap bitmap, InterfaceC1819c interfaceC1819c) {
        C1175n.m2059a().m2135b(c1818b.new AnonymousClass3(interfaceC1819c, bitmap, str));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9433a(C1818b c1818b, String str, String str2, String str3, boolean z, InterfaceC1819c interfaceC1819c) {
        synchronized (c1818b.f11255j) {
            if (c1818b.f11255j.containsKey(str2)) {
                LinkedList linkedList = (LinkedList) c1818b.f11255j.get(str2);
                if (linkedList != null && interfaceC1819c != null && !linkedList.contains(interfaceC1819c)) {
                    linkedList.add(interfaceC1819c);
                }
            } else {
                if (interfaceC1819c != null) {
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(interfaceC1819c);
                    c1818b.f11255j.put(str2, linkedList2);
                }
                AnonymousClass2 anonymousClass2 = c1818b.new AnonymousClass2(str);
                C1820d c1820d = new C1820d(str, str2, str3);
                c1820d.m9461a(z);
                c1820d.m9460a(anonymousClass2);
                c1818b.f11253h.m9653a(c1820d);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m9434a(String str, Bitmap bitmap, InterfaceC1819c interfaceC1819c) {
        C1175n.m2059a().m2135b(new AnonymousClass3(interfaceC1819c, bitmap, str));
    }

    /* JADX INFO: renamed from: a */
    private void m9435a(String str, String str2, InterfaceC1819c interfaceC1819c) {
        C1175n.m2059a().m2135b(new AnonymousClass4(interfaceC1819c, str2, str));
    }

    /* JADX INFO: renamed from: a */
    private void m9436a(String str, String str2, String str3, InterfaceC1819c interfaceC1819c) {
        if (C1886t.m9829a(str) || C1886t.m9829a(str2) || C1886t.m9829a(str3)) {
            return;
        }
        C1335b.m3998a().m4005a(new AnonymousClass1(str3, str2, str, interfaceC1819c));
    }

    /* JADX INFO: renamed from: a */
    private void m9437a(String str, String str2, String str3, boolean z, InterfaceC1819c interfaceC1819c) {
        synchronized (this.f11255j) {
            if (this.f11255j.containsKey(str2)) {
                LinkedList linkedList = (LinkedList) this.f11255j.get(str2);
                if (linkedList != null && interfaceC1819c != null && !linkedList.contains(interfaceC1819c)) {
                    linkedList.add(interfaceC1819c);
                }
            } else {
                if (interfaceC1819c != null) {
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(interfaceC1819c);
                    this.f11255j.put(str2, linkedList2);
                }
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(str);
                C1820d c1820d = new C1820d(str, str2, str3);
                c1820d.m9461a(z);
                c1820d.m9460a(anonymousClass2);
                this.f11253h.m9653a(c1820d);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m9438b() {
        this.f11254i.mo5252b();
        LinkedHashMap<String, List<InterfaceC1819c>> linkedHashMap = this.f11255j;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m9439c() {
        InterfaceC1806e<String, Bitmap> interfaceC1806e = this.f11254i;
        if (interfaceC1806e != null) {
            interfaceC1806e.mo5252b();
        }
    }

    /* JADX INFO: renamed from: d */
    private Bitmap m9440d(String str) {
        Bitmap bitmapM9423a;
        if (C1886t.m9829a(str)) {
            return null;
        }
        String strM9804a = C1885s.m9804a(str);
        File file = new File(strM9804a);
        if (m9441a(str) != null) {
            return m9441a(str);
        }
        if (!file.exists() || (bitmapM9423a = C1817a.m9423a(strM9804a)) == null) {
            return null;
        }
        m9442a(str, bitmapM9423a);
        return bitmapM9423a;
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m9441a(String str) {
        return this.f11254i.mo5251b(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m9442a(String str, Bitmap bitmap) {
        if (m9441a(str) != null || bitmap == null) {
            return;
        }
        this.f11254i.mo5250a(str, bitmap);
    }

    /* JADX INFO: renamed from: a */
    public final void m9443a(String str, InterfaceC1819c interfaceC1819c) {
        String strM9804a = C1885s.m9804a(str);
        if (C1886t.m9829a(str) || C1886t.m9829a(str) || C1886t.m9829a(strM9804a)) {
            return;
        }
        C1335b.m3998a().m4005a(new AnonymousClass1(strM9804a, str, str, interfaceC1819c));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9444b(String str) {
        if (C1886t.m9829a(str)) {
            return false;
        }
        return m9441a(str) != null || new File(C1885s.m9804a(str)).exists();
    }

    /* JADX INFO: renamed from: c */
    public final void m9445c(String str) {
        try {
            InterfaceC1806e<String, Bitmap> interfaceC1806e = this.f11254i;
            if (interfaceC1806e == null || !interfaceC1806e.mo5248a().contains(str)) {
                return;
            }
            this.f11254i.mo5249a(str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
