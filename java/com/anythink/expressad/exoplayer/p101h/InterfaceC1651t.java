package com.anythink.expressad.exoplayer.p101h;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p105j.C1694k;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.t */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1651t {

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.t$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f9016a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final InterfaceC1650s.a f9017b;

        /* JADX INFO: renamed from: c */
        private final CopyOnWriteArrayList<C4676a> f9018c;

        /* JADX INFO: renamed from: d */
        private final long f9019d;

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.t$a$1 */
        public class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC1651t f9020a;

            public AnonymousClass1(InterfaceC1651t interfaceC1651t) {
                interfaceC1651t = interfaceC1651t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1651t interfaceC1651t = interfaceC1651t;
                a aVar = a.this;
                interfaceC1651t.mo6167a(aVar.f9016a, aVar.f9017b);
            }
        }

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.t$a$2 */
        public class AnonymousClass2 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC1651t f9022a;

            public AnonymousClass2(InterfaceC1651t interfaceC1651t) {
                interfaceC1651t = interfaceC1651t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1651t interfaceC1651t = interfaceC1651t;
                a aVar = a.this;
                interfaceC1651t.mo6179b(aVar.f9016a, aVar.f9017b);
            }
        }

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.t$a$3 */
        public class AnonymousClass3 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC1651t f9024a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ b f9025b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ c f9026c;

            public AnonymousClass3(InterfaceC1651t interfaceC1651t, b bVar, c cVar) {
                interfaceC1651t = interfaceC1651t;
                bVar = bVar;
                cVar = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1651t interfaceC1651t = interfaceC1651t;
                a aVar = a.this;
                interfaceC1651t.mo6168a(aVar.f9016a, aVar.f9017b, bVar, cVar);
            }
        }

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.t$a$4 */
        public class AnonymousClass4 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC1651t f9028a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ b f9029b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ c f9030c;

            public AnonymousClass4(InterfaceC1651t interfaceC1651t, b bVar, c cVar) {
                interfaceC1651t = interfaceC1651t;
                bVar = bVar;
                cVar = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1651t interfaceC1651t = interfaceC1651t;
                a aVar = a.this;
                interfaceC1651t.mo6180b(aVar.f9016a, aVar.f9017b, bVar, cVar);
            }
        }

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.t$a$5 */
        public class AnonymousClass5 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC1651t f9032a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ b f9033b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ c f9034c;

            public AnonymousClass5(InterfaceC1651t interfaceC1651t, b bVar, c cVar) {
                interfaceC1651t = interfaceC1651t;
                bVar = bVar;
                cVar = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1651t interfaceC1651t = interfaceC1651t;
                a aVar = a.this;
                interfaceC1651t.mo6188c(aVar.f9016a, aVar.f9017b, bVar, cVar);
            }
        }

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.t$a$6 */
        public class AnonymousClass6 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC1651t f9036a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ b f9037b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ c f9038c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ IOException f9039d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ boolean f9040e;

            public AnonymousClass6(InterfaceC1651t interfaceC1651t, b bVar, c cVar, IOException iOException, boolean z) {
                interfaceC1651t = interfaceC1651t;
                bVar = bVar;
                cVar = cVar;
                iOException = iOException;
                z = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1651t interfaceC1651t = interfaceC1651t;
                a aVar = a.this;
                interfaceC1651t.mo6169a(aVar.f9016a, aVar.f9017b, bVar, cVar, iOException, z);
            }
        }

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.t$a$7 */
        public class AnonymousClass7 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC1651t f9042a;

            public AnonymousClass7(InterfaceC1651t interfaceC1651t) {
                interfaceC1651t = interfaceC1651t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1651t interfaceC1651t = interfaceC1651t;
                a aVar = a.this;
                interfaceC1651t.mo6187c(aVar.f9016a, aVar.f9017b);
            }
        }

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.t$a$8 */
        public class AnonymousClass8 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC1651t f9044a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ c f9045b;

            public AnonymousClass8(InterfaceC1651t interfaceC1651t, c cVar) {
                interfaceC1651t = interfaceC1651t;
                cVar = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1651t interfaceC1651t = interfaceC1651t;
                a aVar = a.this;
                interfaceC1651t.mo6170a(aVar.f9016a, aVar.f9017b, cVar);
            }
        }

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.t$a$9 */
        public class AnonymousClass9 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC1651t f9047a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ c f9048b;

            public AnonymousClass9(InterfaceC1651t interfaceC1651t, c cVar) {
                interfaceC1651t = interfaceC1651t;
                cVar = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1651t interfaceC1651t = interfaceC1651t;
                a aVar = a.this;
                interfaceC1651t.mo6181b(aVar.f9016a, aVar.f9017b, cVar);
            }
        }

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.t$a$a */
        public static final class C4676a {

            /* JADX INFO: renamed from: a */
            public final Handler f9050a;

            /* JADX INFO: renamed from: b */
            public final InterfaceC1651t f9051b;

            public C4676a(Handler handler, InterfaceC1651t interfaceC1651t) {
                this.f9050a = handler;
                this.f9051b = interfaceC1651t;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private a(CopyOnWriteArrayList<C4676a> copyOnWriteArrayList, int i, @Nullable InterfaceC1650s.a aVar, long j) {
            this.f9018c = copyOnWriteArrayList;
            this.f9016a = i;
            this.f9017b = aVar;
            this.f9019d = j;
        }

        /* JADX INFO: renamed from: a */
        private long m7465a(long j) {
            long jM6396a = C1500b.m6396a(j);
            return jM6396a == C1500b.f7455b ? C1500b.f7455b : this.f9019d + jM6396a;
        }

        /* JADX INFO: renamed from: a */
        private static void m7466a(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        /* JADX INFO: renamed from: a */
        private void m7467a(C1694k c1694k, int i, long j) {
            m7479a(c1694k, i, -1, null, 0, null, C1500b.f7455b, C1500b.f7455b, j);
        }

        /* JADX INFO: renamed from: a */
        private void m7468a(C1694k c1694k, int i, long j, long j2, long j3) {
            m7480a(c1694k, i, -1, null, 0, null, C1500b.f7455b, C1500b.f7455b, j, j2, j3);
        }

        /* JADX INFO: renamed from: b */
        private void m7469b(C1694k c1694k, int i, long j, long j2, long j3) {
            m7486b(c1694k, i, -1, null, 0, null, C1500b.f7455b, C1500b.f7455b, j, j2, j3);
        }

        @CheckResult
        /* JADX INFO: renamed from: a */
        public final a m7470a(int i, @Nullable InterfaceC1650s.a aVar, long j) {
            return new a(this.f9018c, i, aVar, j);
        }

        /* JADX INFO: renamed from: a */
        public final void m7471a() {
            C1711a.m8012b(this.f9017b != null);
            for (C4676a c4676a : this.f9018c) {
                m7466a(c4676a.f9050a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ InterfaceC1651t f9020a;

                    public AnonymousClass1(InterfaceC1651t interfaceC1651t) {
                        interfaceC1651t = interfaceC1651t;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1651t interfaceC1651t = interfaceC1651t;
                        a aVar = a.this;
                        interfaceC1651t.mo6167a(aVar.f9016a, aVar.f9017b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m7472a(int i, long j, long j2) {
            m7477a(new c(1, i, null, 3, null, m7465a(j), m7465a(j2)));
        }

        /* JADX INFO: renamed from: a */
        public final void m7473a(int i, @Nullable C1753m c1753m, int i2, @Nullable Object obj, long j) {
            m7485b(new c(1, i, c1753m, i2, obj, m7465a(j), C1500b.f7455b));
        }

        /* JADX INFO: renamed from: a */
        public final void m7474a(Handler handler, InterfaceC1651t interfaceC1651t) {
            C1711a.m8010a((handler == null || interfaceC1651t == null) ? false : true);
            this.f9018c.add(new C4676a(handler, interfaceC1651t));
        }

        /* JADX INFO: renamed from: a */
        public final void m7475a(b bVar, c cVar) {
            for (C4676a c4676a : this.f9018c) {
                m7466a(c4676a.f9050a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.3

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ InterfaceC1651t f9024a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ b f9025b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ c f9026c;

                    public AnonymousClass3(InterfaceC1651t interfaceC1651t, b bVar2, c cVar2) {
                        interfaceC1651t = interfaceC1651t;
                        bVar = bVar2;
                        cVar = cVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1651t interfaceC1651t = interfaceC1651t;
                        a aVar = a.this;
                        interfaceC1651t.mo6168a(aVar.f9016a, aVar.f9017b, bVar, cVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m7476a(b bVar, c cVar, IOException iOException, boolean z) {
            for (C4676a c4676a : this.f9018c) {
                m7466a(c4676a.f9050a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.6

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ InterfaceC1651t f9036a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ b f9037b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ c f9038c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ IOException f9039d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ boolean f9040e;

                    public AnonymousClass6(InterfaceC1651t interfaceC1651t, b bVar2, c cVar2, IOException iOException2, boolean z3) {
                        interfaceC1651t = interfaceC1651t;
                        bVar = bVar2;
                        cVar = cVar2;
                        iOException = iOException2;
                        z = z3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1651t interfaceC1651t = interfaceC1651t;
                        a aVar = a.this;
                        interfaceC1651t.mo6169a(aVar.f9016a, aVar.f9017b, bVar, cVar, iOException, z);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m7477a(c cVar) {
            for (C4676a c4676a : this.f9018c) {
                m7466a(c4676a.f9050a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.8

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ InterfaceC1651t f9044a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ c f9045b;

                    public AnonymousClass8(InterfaceC1651t interfaceC1651t, c cVar2) {
                        interfaceC1651t = interfaceC1651t;
                        cVar = cVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1651t interfaceC1651t = interfaceC1651t;
                        a aVar = a.this;
                        interfaceC1651t.mo6170a(aVar.f9016a, aVar.f9017b, cVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m7478a(InterfaceC1651t interfaceC1651t) {
            for (C4676a c4676a : this.f9018c) {
                if (c4676a.f9051b == interfaceC1651t) {
                    this.f9018c.remove(c4676a);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m7479a(C1694k c1694k, int i, int i2, @Nullable C1753m c1753m, int i3, @Nullable Object obj, long j, long j2, long j3) {
            m7475a(new b(c1694k, j3, 0L, 0L), new c(i, i2, c1753m, i3, obj, m7465a(j), m7465a(j2)));
        }

        /* JADX INFO: renamed from: a */
        public final void m7480a(C1694k c1694k, int i, int i2, @Nullable C1753m c1753m, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
            m7484b(new b(c1694k, j3, j4, j5), new c(i, i2, c1753m, i3, obj, m7465a(j), m7465a(j2)));
        }

        /* JADX INFO: renamed from: a */
        public final void m7481a(C1694k c1694k, int i, int i2, @Nullable C1753m c1753m, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            m7476a(new b(c1694k, j3, j4, j5), new c(i, i2, c1753m, i3, obj, m7465a(j), m7465a(j2)), iOException, z);
        }

        /* JADX INFO: renamed from: a */
        public final void m7482a(C1694k c1694k, IOException iOException) {
            m7481a(c1694k, 6, -1, null, 0, null, C1500b.f7455b, C1500b.f7455b, -1L, 0L, 0L, iOException, true);
        }

        /* JADX INFO: renamed from: b */
        public final void m7483b() {
            C1711a.m8012b(this.f9017b != null);
            for (C4676a c4676a : this.f9018c) {
                m7466a(c4676a.f9050a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.2

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ InterfaceC1651t f9022a;

                    public AnonymousClass2(InterfaceC1651t interfaceC1651t) {
                        interfaceC1651t = interfaceC1651t;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1651t interfaceC1651t = interfaceC1651t;
                        a aVar = a.this;
                        interfaceC1651t.mo6179b(aVar.f9016a, aVar.f9017b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m7484b(b bVar, c cVar) {
            for (C4676a c4676a : this.f9018c) {
                m7466a(c4676a.f9050a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.4

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ InterfaceC1651t f9028a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ b f9029b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ c f9030c;

                    public AnonymousClass4(InterfaceC1651t interfaceC1651t, b bVar2, c cVar2) {
                        interfaceC1651t = interfaceC1651t;
                        bVar = bVar2;
                        cVar = cVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1651t interfaceC1651t = interfaceC1651t;
                        a aVar = a.this;
                        interfaceC1651t.mo6180b(aVar.f9016a, aVar.f9017b, bVar, cVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m7485b(c cVar) {
            for (C4676a c4676a : this.f9018c) {
                m7466a(c4676a.f9050a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.9

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ InterfaceC1651t f9047a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ c f9048b;

                    public AnonymousClass9(InterfaceC1651t interfaceC1651t, c cVar2) {
                        interfaceC1651t = interfaceC1651t;
                        cVar = cVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1651t interfaceC1651t = interfaceC1651t;
                        a aVar = a.this;
                        interfaceC1651t.mo6181b(aVar.f9016a, aVar.f9017b, cVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m7486b(C1694k c1694k, int i, int i2, @Nullable C1753m c1753m, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
            m7488c(new b(c1694k, j3, j4, j5), new c(i, i2, c1753m, i3, obj, m7465a(j), m7465a(j2)));
        }

        /* JADX INFO: renamed from: c */
        public final void m7487c() {
            C1711a.m8012b(this.f9017b != null);
            for (C4676a c4676a : this.f9018c) {
                m7466a(c4676a.f9050a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.7

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ InterfaceC1651t f9042a;

                    public AnonymousClass7(InterfaceC1651t interfaceC1651t) {
                        interfaceC1651t = interfaceC1651t;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1651t interfaceC1651t = interfaceC1651t;
                        a aVar = a.this;
                        interfaceC1651t.mo6187c(aVar.f9016a, aVar.f9017b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m7488c(b bVar, c cVar) {
            for (C4676a c4676a : this.f9018c) {
                m7466a(c4676a.f9050a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.5

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ InterfaceC1651t f9032a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ b f9033b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ c f9034c;

                    public AnonymousClass5(InterfaceC1651t interfaceC1651t, b bVar2, c cVar2) {
                        interfaceC1651t = interfaceC1651t;
                        bVar = bVar2;
                        cVar = cVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1651t interfaceC1651t = interfaceC1651t;
                        a aVar = a.this;
                        interfaceC1651t.mo6188c(aVar.f9016a, aVar.f9017b, bVar, cVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.t$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final C1694k f9052a;

        /* JADX INFO: renamed from: b */
        public final long f9053b;

        /* JADX INFO: renamed from: c */
        public final long f9054c;

        /* JADX INFO: renamed from: d */
        public final long f9055d;

        public b(C1694k c1694k, long j, long j2, long j3) {
            this.f9052a = c1694k;
            this.f9053b = j;
            this.f9054c = j2;
            this.f9055d = j3;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.t$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f9056a;

        /* JADX INFO: renamed from: b */
        public final int f9057b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final C1753m f9058c;

        /* JADX INFO: renamed from: d */
        public final int f9059d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public final Object f9060e;

        /* JADX INFO: renamed from: f */
        public final long f9061f;

        /* JADX INFO: renamed from: g */
        public final long f9062g;

        public c(int i, int i2, @Nullable C1753m c1753m, int i3, @Nullable Object obj, long j, long j2) {
            this.f9056a = i;
            this.f9057b = i2;
            this.f9058c = c1753m;
            this.f9059d = i3;
            this.f9060e = obj;
            this.f9061f = j;
            this.f9062g = j2;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo6167a(int i, InterfaceC1650s.a aVar);

    /* JADX INFO: renamed from: a */
    void mo6168a(int i, @Nullable InterfaceC1650s.a aVar, b bVar, c cVar);

    /* JADX INFO: renamed from: a */
    void mo6169a(int i, @Nullable InterfaceC1650s.a aVar, b bVar, c cVar, IOException iOException, boolean z);

    /* JADX INFO: renamed from: a */
    void mo6170a(int i, InterfaceC1650s.a aVar, c cVar);

    /* JADX INFO: renamed from: b */
    void mo6179b(int i, InterfaceC1650s.a aVar);

    /* JADX INFO: renamed from: b */
    void mo6180b(int i, @Nullable InterfaceC1650s.a aVar, b bVar, c cVar);

    /* JADX INFO: renamed from: b */
    void mo6181b(int i, @Nullable InterfaceC1650s.a aVar, c cVar);

    /* JADX INFO: renamed from: c */
    void mo6187c(int i, InterfaceC1650s.a aVar);

    /* JADX INFO: renamed from: c */
    void mo6188c(int i, @Nullable InterfaceC1650s.a aVar, b bVar, c cVar);
}
