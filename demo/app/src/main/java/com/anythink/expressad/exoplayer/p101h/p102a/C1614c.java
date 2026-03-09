package com.anythink.expressad.exoplayer.p101h.p102a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.InterfaceC1610h;
import com.anythink.expressad.exoplayer.p101h.AbstractC1637f;
import com.anythink.expressad.exoplayer.p101h.C1643l;
import com.anythink.expressad.exoplayer.p101h.C1646o;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1649r;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p101h.p102a.InterfaceC1613b;
import com.anythink.expressad.exoplayer.p105j.C1694k;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1685b;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1614c extends AbstractC1637f<InterfaceC1650s.a> {

    /* JADX INFO: renamed from: a */
    private static final String f8653a = "AdsMediaSource";

    /* JADX INFO: renamed from: b */
    private final InterfaceC1650s f8654b;

    /* JADX INFO: renamed from: c */
    private final e f8655c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1613b f8656d;

    /* JADX INFO: renamed from: e */
    private final ViewGroup f8657e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private final Handler f8658f;

    /* JADX INFO: renamed from: g */
    @Nullable
    private final d f8659g;

    /* JADX INFO: renamed from: h */
    private final Handler f8660h;

    /* JADX INFO: renamed from: i */
    private final Map<InterfaceC1650s, List<C1643l>> f8661i;

    /* JADX INFO: renamed from: j */
    private final AbstractC1499ae.a f8662j;

    /* JADX INFO: renamed from: k */
    private c f8663k;

    /* JADX INFO: renamed from: l */
    private AbstractC1499ae f8664l;

    /* JADX INFO: renamed from: m */
    private Object f8665m;

    /* JADX INFO: renamed from: n */
    private C1612a f8666n;

    /* JADX INFO: renamed from: o */
    private InterfaceC1650s[][] f8667o;

    /* JADX INFO: renamed from: p */
    private long[][] f8668p;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.a.c$a */
    public static final class a extends IOException {

        /* JADX INFO: renamed from: a */
        public static final int f8673a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f8674b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f8675c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f8676d = 3;

        /* JADX INFO: renamed from: e */
        public final int f8677e;

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.a.c$a$a, reason: collision with other inner class name */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC4675a {
        }

        private a(int i, Exception exc) {
            super(exc);
            this.f8677e = i;
        }

        /* JADX INFO: renamed from: a */
        public static a m7231a(Exception exc) {
            return new a(0, exc);
        }

        /* JADX INFO: renamed from: a */
        private static a m7232a(Exception exc, int i) {
            return new a(1, new IOException("Failed to load ad group ".concat(String.valueOf(i)), exc));
        }

        /* JADX INFO: renamed from: a */
        private static a m7233a(RuntimeException runtimeException) {
            return new a(3, runtimeException);
        }

        /* JADX INFO: renamed from: a */
        private RuntimeException m7234a() {
            C1711a.m8012b(this.f8677e == 3);
            return (RuntimeException) getCause();
        }

        /* JADX INFO: renamed from: b */
        private static a m7235b(Exception exc) {
            return new a(2, exc);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.a.c$b */
    public final class b implements C1643l.a {

        /* JADX INFO: renamed from: b */
        private final Uri f8679b;

        /* JADX INFO: renamed from: c */
        private final int f8680c;

        /* JADX INFO: renamed from: d */
        private final int f8681d;

        public b(Uri uri, int i, int i2) {
            this.f8679b = uri;
            this.f8680c = i;
            this.f8681d = i2;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.C1643l.a
        /* JADX INFO: renamed from: a */
        public final void mo7238a(InterfaceC1650s.a aVar, final IOException iOException) {
            C1614c.this.m7353a(aVar).m7482a(new C1694k(this.f8679b), a.m7231a(iOException));
            C1614c.this.f8660h.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.h.a.c.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC1613b unused = C1614c.this.f8656d;
                    int unused2 = b.this.f8680c;
                    int unused3 = b.this.f8681d;
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.a.c$c */
    public final class c implements InterfaceC1613b.a {

        /* JADX INFO: renamed from: b */
        private final Handler f8685b = new Handler();

        /* JADX INFO: renamed from: c */
        private volatile boolean f8686c;

        public c() {
        }

        @Override // com.anythink.expressad.exoplayer.p101h.p102a.InterfaceC1613b.a
        /* JADX INFO: renamed from: a */
        public final void mo7209a() {
            if (this.f8686c || C1614c.this.f8658f == null || C1614c.this.f8659g == null) {
                return;
            }
            C1614c.this.f8658f.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.h.a.c.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.f8686c) {
                        return;
                    }
                    d unused = C1614c.this.f8659g;
                }
            });
        }

        @Override // com.anythink.expressad.exoplayer.p101h.p102a.InterfaceC1613b.a
        /* JADX INFO: renamed from: a */
        public final void mo7210a(final C1612a c1612a) {
            if (this.f8686c) {
                return;
            }
            this.f8685b.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.h.a.c.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.f8686c) {
                        return;
                    }
                    C1614c.m7216a(C1614c.this, c1612a);
                }
            });
        }

        @Override // com.anythink.expressad.exoplayer.p101h.p102a.InterfaceC1613b.a
        /* JADX INFO: renamed from: a */
        public final void mo7211a(final a aVar, C1694k c1694k) {
            if (this.f8686c) {
                return;
            }
            C1614c.this.m7353a((InterfaceC1650s.a) null).m7482a(c1694k, aVar);
            if (C1614c.this.f8658f == null || C1614c.this.f8659g == null) {
                return;
            }
            C1614c.this.f8658f.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.h.a.c.c.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.f8686c) {
                        return;
                    }
                    if (aVar.f8677e != 3) {
                        d unused = C1614c.this.f8659g;
                        return;
                    }
                    d unused2 = C1614c.this.f8659g;
                    a aVar2 = aVar;
                    C1711a.m8012b(aVar2.f8677e == 3);
                    aVar2.getCause();
                }
            });
        }

        @Override // com.anythink.expressad.exoplayer.p101h.p102a.InterfaceC1613b.a
        /* JADX INFO: renamed from: b */
        public final void mo7212b() {
            if (this.f8686c || C1614c.this.f8658f == null || C1614c.this.f8659g == null) {
                return;
            }
            C1614c.this.f8658f.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.h.a.c.c.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.f8686c) {
                        return;
                    }
                    d unused = C1614c.this.f8659g;
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public final void m7240c() {
            this.f8686c = true;
            this.f8685b.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.a.c$d */
    @Deprecated
    public interface d {
        /* JADX INFO: renamed from: a */
        void m7241a();

        /* JADX INFO: renamed from: b */
        void m7242b();

        /* JADX INFO: renamed from: c */
        void m7243c();

        /* JADX INFO: renamed from: d */
        void m7244d();
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.a.c$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        int[] mo7245a();

        /* JADX INFO: renamed from: b */
        InterfaceC1650s mo7246b(Uri uri);
    }

    private C1614c(InterfaceC1650s interfaceC1650s, e eVar, InterfaceC1613b interfaceC1613b, ViewGroup viewGroup) {
        this(interfaceC1650s, eVar, interfaceC1613b, viewGroup, (Handler) null, (d) null);
    }

    @Deprecated
    private C1614c(InterfaceC1650s interfaceC1650s, e eVar, InterfaceC1613b interfaceC1613b, ViewGroup viewGroup, @Nullable Handler handler, @Nullable d dVar) {
        this.f8654b = interfaceC1650s;
        this.f8655c = eVar;
        this.f8656d = interfaceC1613b;
        this.f8657e = viewGroup;
        this.f8658f = handler;
        this.f8659g = dVar;
        this.f8660h = new Handler(Looper.getMainLooper());
        this.f8661i = new HashMap();
        this.f8662j = new AbstractC1499ae.a();
        this.f8667o = new InterfaceC1650s[0][];
        this.f8668p = new long[0][];
    }

    private C1614c(InterfaceC1650s interfaceC1650s, InterfaceC1691h.a aVar, InterfaceC1613b interfaceC1613b, ViewGroup viewGroup) {
        this(interfaceC1650s, new C1646o.c(aVar), interfaceC1613b, viewGroup, (Handler) null, (d) null);
    }

    @Deprecated
    private C1614c(InterfaceC1650s interfaceC1650s, InterfaceC1691h.a aVar, InterfaceC1613b interfaceC1613b, ViewGroup viewGroup, @Nullable Handler handler, @Nullable d dVar) {
        this(interfaceC1650s, new C1646o.c(aVar), interfaceC1613b, viewGroup, handler, dVar);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    private static InterfaceC1650s.a a2(InterfaceC1650s.a aVar, InterfaceC1650s.a aVar2) {
        return aVar.m7464a() ? aVar : aVar2;
    }

    /* JADX INFO: renamed from: a */
    private void m7215a(C1612a c1612a) {
        if (this.f8666n == null) {
            InterfaceC1650s[][] interfaceC1650sArr = new InterfaceC1650s[c1612a.f8644g][];
            this.f8667o = interfaceC1650sArr;
            Arrays.fill(interfaceC1650sArr, new InterfaceC1650s[0]);
            long[][] jArr = new long[c1612a.f8644g][];
            this.f8668p = jArr;
            Arrays.fill(jArr, new long[0]);
        }
        this.f8666n = c1612a;
        m7222c();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7216a(C1614c c1614c, C1612a c1612a) {
        if (c1614c.f8666n == null) {
            InterfaceC1650s[][] interfaceC1650sArr = new InterfaceC1650s[c1612a.f8644g][];
            c1614c.f8667o = interfaceC1650sArr;
            Arrays.fill(interfaceC1650sArr, new InterfaceC1650s[0]);
            long[][] jArr = new long[c1612a.f8644g][];
            c1614c.f8668p = jArr;
            Arrays.fill(jArr, new long[0]);
        }
        c1614c.f8666n = c1612a;
        c1614c.m7222c();
    }

    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(InterfaceC1650s.a aVar, InterfaceC1650s interfaceC1650s, AbstractC1499ae abstractC1499ae, @Nullable Object obj) {
        if (!aVar.m7464a()) {
            this.f8664l = abstractC1499ae;
            this.f8665m = obj;
            m7222c();
            return;
        }
        int i = aVar.f9013b;
        int i2 = aVar.f9014c;
        C1711a.m8010a(abstractC1499ae.mo6370c() == 1);
        this.f8668p[i][i2] = abstractC1499ae.mo6362a(0, this.f8662j, false).f7363d;
        if (this.f8661i.containsKey(interfaceC1650s)) {
            List<C1643l> list = this.f8661i.get(interfaceC1650s);
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3).m7414f();
            }
            this.f8661i.remove(interfaceC1650s);
        }
        m7222c();
    }

    /* JADX INFO: renamed from: a */
    private void m7217a(InterfaceC1650s interfaceC1650s, int i, int i2, AbstractC1499ae abstractC1499ae) {
        C1711a.m8010a(abstractC1499ae.mo6370c() == 1);
        this.f8668p[i][i2] = abstractC1499ae.mo6362a(0, this.f8662j, false).f7363d;
        if (this.f8661i.containsKey(interfaceC1650s)) {
            List<C1643l> list = this.f8661i.get(interfaceC1650s);
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3).m7414f();
            }
            this.f8661i.remove(interfaceC1650s);
        }
        m7222c();
    }

    /* JADX INFO: renamed from: b */
    private void m7220b(AbstractC1499ae abstractC1499ae, Object obj) {
        this.f8664l = abstractC1499ae;
        this.f8665m = obj;
        m7222c();
    }

    /* JADX INFO: renamed from: c */
    private void m7222c() {
        C1612a c1612a = this.f8666n;
        if (c1612a == null || this.f8664l == null) {
            return;
        }
        C1612a c1612aM7193a = c1612a.m7193a(this.f8668p);
        this.f8666n = c1612aM7193a;
        m7355a(c1612aM7193a.f8644g == 0 ? this.f8664l : new C1615d(this.f8664l, this.f8666n), this.f8665m);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final InterfaceC1649r mo7225a(InterfaceC1650s.a aVar, InterfaceC1685b interfaceC1685b) {
        if (this.f8666n.f8644g <= 0 || !aVar.m7464a()) {
            C1643l c1643l = new C1643l(this.f8654b, aVar, interfaceC1685b);
            c1643l.m7414f();
            return c1643l;
        }
        int i = aVar.f9013b;
        int i2 = aVar.f9014c;
        Uri uri = this.f8666n.f8646i[i].f8650b[i2];
        if (this.f8667o[i].length <= i2) {
            InterfaceC1650s interfaceC1650sMo7246b = this.f8655c.mo7246b(uri);
            InterfaceC1650s[][] interfaceC1650sArr = this.f8667o;
            int length = interfaceC1650sArr[i].length;
            if (i2 >= length) {
                int i3 = i2 + 1;
                interfaceC1650sArr[i] = (InterfaceC1650s[]) Arrays.copyOf(interfaceC1650sArr[i], i3);
                long[][] jArr = this.f8668p;
                jArr[i] = Arrays.copyOf(jArr[i], i3);
                Arrays.fill(this.f8668p[i], length, i3, C1500b.f7455b);
            }
            this.f8667o[i][i2] = interfaceC1650sMo7246b;
            this.f8661i.put(interfaceC1650sMo7246b, new ArrayList());
            m7374a(aVar, interfaceC1650sMo7246b);
        }
        InterfaceC1650s interfaceC1650s = this.f8667o[i][i2];
        C1643l c1643l2 = new C1643l(interfaceC1650s, new InterfaceC1650s.a(0, aVar.f9015d), interfaceC1685b);
        c1643l2.m7412a(new b(uri, i, i2));
        List<C1643l> list = this.f8661i.get(interfaceC1650s);
        if (list == null) {
            c1643l2.m7414f();
        } else {
            list.add(c1643l2);
        }
        return c1643l2;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f
    @Nullable
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC1650s.a mo7226a(InterfaceC1650s.a aVar, InterfaceC1650s.a aVar2) {
        InterfaceC1650s.a aVar3 = aVar;
        return aVar3.m7464a() ? aVar3 : aVar2;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f, com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    /* JADX INFO: renamed from: a */
    public final void mo7227a() {
        super.mo7227a();
        this.f8663k.m7240c();
        this.f8663k = null;
        this.f8661i.clear();
        this.f8664l = null;
        this.f8665m = null;
        this.f8666n = null;
        this.f8667o = new InterfaceC1650s[0][];
        this.f8668p = new long[0][];
        this.f8660h.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.h.a.c.2
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1613b unused = C1614c.this.f8656d;
            }
        });
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final void mo7228a(InterfaceC1649r interfaceC1649r) {
        C1643l c1643l = (C1643l) interfaceC1649r;
        List<C1643l> list = this.f8661i.get(c1643l.f8916a);
        if (list != null) {
            list.remove(c1643l);
        }
        c1643l.m7415g();
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f, com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    /* JADX INFO: renamed from: a */
    public final void mo7229a(final InterfaceC1610h interfaceC1610h, boolean z) {
        super.mo7229a(interfaceC1610h, z);
        C1711a.m8010a(z);
        final c cVar = new c();
        this.f8663k = cVar;
        m7374a(new InterfaceC1650s.a(0), this.f8654b);
        this.f8660h.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.h.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1613b unused = C1614c.this.f8656d;
                ViewGroup unused2 = C1614c.this.f8657e;
            }
        });
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo7230a(InterfaceC1650s.a aVar, InterfaceC1650s interfaceC1650s, AbstractC1499ae abstractC1499ae, @Nullable Object obj) {
        InterfaceC1650s.a aVar2 = aVar;
        if (!aVar2.m7464a()) {
            this.f8664l = abstractC1499ae;
            this.f8665m = obj;
            m7222c();
            return;
        }
        int i = aVar2.f9013b;
        int i2 = aVar2.f9014c;
        C1711a.m8010a(abstractC1499ae.mo6370c() == 1);
        this.f8668p[i][i2] = abstractC1499ae.mo6362a(0, this.f8662j, false).f7363d;
        if (this.f8661i.containsKey(interfaceC1650s)) {
            List<C1643l> list = this.f8661i.get(interfaceC1650s);
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3).m7414f();
            }
            this.f8661i.remove(interfaceC1650s);
        }
        m7222c();
    }
}
