package com.anythink.expressad.foundation.p120g.p126f;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.j */
/* JADX INFO: loaded from: classes.dex */
public class C1857j {

    /* JADX INFO: renamed from: a */
    private static final String f11449a = "j";

    /* JADX INFO: renamed from: b */
    private Context f11450b;

    /* JADX INFO: renamed from: d */
    private Set<AbstractC1856i> f11452d = new HashSet();

    /* JADX INFO: renamed from: e */
    private ExecutorService f11453e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());

    /* JADX INFO: renamed from: f */
    private AtomicInteger f11454f = new AtomicInteger();

    /* JADX INFO: renamed from: c */
    private InterfaceC1828c f11451c = new C1832d(new Handler(Looper.getMainLooper()));

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.j$1 */
    public class AnonymousClass1 implements a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f11455a;

        public AnonymousClass1(Object obj) {
            obj = obj;
        }

        @Override // com.anythink.expressad.foundation.p120g.p126f.C1857j.a
        /* JADX INFO: renamed from: a */
        public final boolean mo9633a(AbstractC1856i<?> abstractC1856i) {
            return abstractC1856i.m9614b() == obj;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.j$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC1856i f11457a;

        public AnonymousClass2(AbstractC1856i abstractC1856i) {
            abstractC1856i = abstractC1856i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context unused = C1857j.this.f11450b;
            new C1853h(null, C1857j.this.f11451c).m9580a(abstractC1856i);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.j$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo9633a(AbstractC1856i<?> abstractC1856i);
    }

    public C1857j(Context context) {
        this.f11450b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    private int m9626a() {
        return this.f11454f.incrementAndGet();
    }

    /* JADX INFO: renamed from: a */
    private void m9628a(a aVar) {
        synchronized (this) {
            for (AbstractC1856i abstractC1856i : this.f11452d) {
                if (aVar.mo9633a(abstractC1856i)) {
                    abstractC1856i.m9618e();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m9629a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        m9628a((a) new a() { // from class: com.anythink.expressad.foundation.g.f.j.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f11455a;

            public AnonymousClass1(Object obj2) {
                obj = obj2;
            }

            @Override // com.anythink.expressad.foundation.p120g.p126f.C1857j.a
            /* JADX INFO: renamed from: a */
            public final boolean mo9633a(AbstractC1856i<?> abstractC1856i) {
                return abstractC1856i.m9614b() == obj;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m9631a(AbstractC1856i abstractC1856i) {
        abstractC1856i.m9607a(this);
        synchronized (this) {
            this.f11452d.add(abstractC1856i);
        }
        abstractC1856i.m9606a(this.f11454f.incrementAndGet());
        this.f11453e.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.j.2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractC1856i f11457a;

            public AnonymousClass2(AbstractC1856i abstractC1856i2) {
                abstractC1856i = abstractC1856i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context unused = C1857j.this.f11450b;
                new C1853h(null, C1857j.this.f11451c).m9580a(abstractC1856i);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m9632b(AbstractC1856i abstractC1856i) {
        synchronized (this) {
            this.f11452d.remove(abstractC1856i);
        }
    }
}
