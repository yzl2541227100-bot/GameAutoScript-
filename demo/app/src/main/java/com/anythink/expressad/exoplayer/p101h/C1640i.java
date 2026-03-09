package com.anythink.expressad.exoplayer.p101h;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1767x;
import com.anythink.expressad.exoplayer.InterfaceC1610h;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1685b;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1640i extends AbstractC1637f<e> implements C1767x.b {

    /* JADX INFO: renamed from: a */
    private static final int f8872a = 0;

    /* JADX INFO: renamed from: b */
    private static final int f8873b = 1;

    /* JADX INFO: renamed from: c */
    private static final int f8874c = 2;

    /* JADX INFO: renamed from: d */
    private static final int f8875d = 3;

    /* JADX INFO: renamed from: e */
    private static final int f8876e = 4;

    /* JADX INFO: renamed from: f */
    private static final int f8877f = 5;

    /* JADX INFO: renamed from: g */
    private static final int f8878g = 6;

    /* JADX INFO: renamed from: h */
    private final List<e> f8879h;

    /* JADX INFO: renamed from: i */
    private final List<e> f8880i;

    /* JADX INFO: renamed from: j */
    private final e f8881j;

    /* JADX INFO: renamed from: k */
    private final Map<InterfaceC1649r, e> f8882k;

    /* JADX INFO: renamed from: l */
    private final List<d> f8883l;

    /* JADX INFO: renamed from: m */
    private final boolean f8884m;

    /* JADX INFO: renamed from: n */
    private final AbstractC1499ae.b f8885n;

    /* JADX INFO: renamed from: o */
    private InterfaceC1610h f8886o;

    /* JADX INFO: renamed from: p */
    private boolean f8887p;

    /* JADX INFO: renamed from: q */
    private InterfaceC1616aa f8888q;

    /* JADX INFO: renamed from: r */
    private int f8889r;

    /* JADX INFO: renamed from: s */
    private int f8890s;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.i$a */
    public static final class a extends AbstractC1611a {

        /* JADX INFO: renamed from: b */
        private final int f8891b;

        /* JADX INFO: renamed from: c */
        private final int f8892c;

        /* JADX INFO: renamed from: d */
        private final int[] f8893d;

        /* JADX INFO: renamed from: e */
        private final int[] f8894e;

        /* JADX INFO: renamed from: f */
        private final AbstractC1499ae[] f8895f;

        /* JADX INFO: renamed from: g */
        private final Object[] f8896g;

        /* JADX INFO: renamed from: h */
        private final HashMap<Object, Integer> f8897h;

        public a(Collection<e> collection, int i, int i2, InterfaceC1616aa interfaceC1616aa, boolean z) {
            super(z, interfaceC1616aa);
            this.f8891b = i;
            this.f8892c = i2;
            int size = collection.size();
            this.f8893d = new int[size];
            this.f8894e = new int[size];
            this.f8895f = new AbstractC1499ae[size];
            this.f8896g = new Object[size];
            this.f8897h = new HashMap<>();
            int i3 = 0;
            for (e eVar : collection) {
                this.f8895f[i3] = eVar.f8906c;
                this.f8893d[i3] = eVar.f8909f;
                this.f8894e[i3] = eVar.f8908e;
                Object[] objArr = this.f8896g;
                objArr[i3] = eVar.f8905b;
                this.f8897h.put(objArr[i3], Integer.valueOf(i3));
                i3++;
            }
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1611a
        /* JADX INFO: renamed from: a */
        public final int mo7176a(int i) {
            return C1717af.m8054a(this.f8893d, i + 1);
        }

        @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: b */
        public final int mo6366b() {
            return this.f8891b;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1611a
        /* JADX INFO: renamed from: b */
        public final int mo7177b(int i) {
            return C1717af.m8054a(this.f8894e, i + 1);
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1611a
        /* JADX INFO: renamed from: b */
        public final int mo7178b(Object obj) {
            Integer num = this.f8897h.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: c */
        public final int mo6370c() {
            return this.f8892c;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1611a
        /* JADX INFO: renamed from: c */
        public final AbstractC1499ae mo7179c(int i) {
            return this.f8895f[i];
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1611a
        /* JADX INFO: renamed from: d */
        public final int mo7180d(int i) {
            return this.f8893d[i];
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1611a
        /* JADX INFO: renamed from: e */
        public final int mo7181e(int i) {
            return this.f8894e[i];
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1611a
        /* JADX INFO: renamed from: f */
        public final Object mo7182f(int i) {
            return this.f8896g[i];
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.i$b */
    public static final class b extends AbstractC1647p {

        /* JADX INFO: renamed from: c */
        private static final Object f8898c = new Object();

        /* JADX INFO: renamed from: d */
        private static final AbstractC1499ae.a f8899d = new AbstractC1499ae.a();

        /* JADX INFO: renamed from: e */
        private static final c f8900e = new c(0);

        /* JADX INFO: renamed from: f */
        private final Object f8901f;

        public b() {
            this(f8900e, null);
        }

        private b(AbstractC1499ae abstractC1499ae, Object obj) {
            super(abstractC1499ae);
            this.f8901f = obj;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1647p, com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: a */
        public final int mo6358a(Object obj) {
            AbstractC1499ae abstractC1499ae = this.f9004b;
            if (f8898c.equals(obj)) {
                obj = this.f8901f;
            }
            return abstractC1499ae.mo6358a(obj);
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1647p, com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: a */
        public final AbstractC1499ae.a mo6362a(int i, AbstractC1499ae.a aVar, boolean z) {
            this.f9004b.mo6362a(i, aVar, z);
            if (C1717af.m8085a(aVar.f7361b, this.f8901f)) {
                aVar.f7361b = f8898c;
            }
            return aVar;
        }

        /* JADX INFO: renamed from: a */
        public final b m7406a(AbstractC1499ae abstractC1499ae) {
            return new b(abstractC1499ae, (this.f8901f != null || abstractC1499ae.mo6370c() <= 0) ? this.f8901f : abstractC1499ae.mo6362a(0, f8899d, true).f7361b);
        }

        /* JADX INFO: renamed from: d */
        public final AbstractC1499ae m7407d() {
            return this.f9004b;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.i$c */
    public static final class c extends AbstractC1499ae {
        private c() {
        }

        public /* synthetic */ c(byte b) {
            this();
        }

        @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: a */
        public final int mo6358a(Object obj) {
            return obj == null ? 0 : -1;
        }

        @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: a */
        public final AbstractC1499ae.a mo6362a(int i, AbstractC1499ae.a aVar, boolean z) {
            return aVar.m6378a(null, null, C1500b.f7455b, 0L);
        }

        @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: a */
        public final AbstractC1499ae.b mo6364a(int i, AbstractC1499ae.b bVar, boolean z, long j) {
            return bVar.m6394a(null, C1500b.f7455b, C1500b.f7455b, false, true, j > 0 ? C1500b.f7455b : 0L, C1500b.f7455b, 0L);
        }

        @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: b */
        public final int mo6366b() {
            return 1;
        }

        @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: c */
        public final int mo6370c() {
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.i$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final Handler f8902a;

        /* JADX INFO: renamed from: b */
        public final Runnable f8903b;

        public d(Runnable runnable) {
            this.f8903b = runnable;
            this.f8902a = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        }

        /* JADX INFO: renamed from: a */
        private void m7408a() {
            this.f8902a.post(this.f8903b);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.i$e */
    public static final class e implements Comparable<e> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1650s f8904a;

        /* JADX INFO: renamed from: d */
        public int f8907d;

        /* JADX INFO: renamed from: e */
        public int f8908e;

        /* JADX INFO: renamed from: f */
        public int f8909f;

        /* JADX INFO: renamed from: g */
        public boolean f8910g;

        /* JADX INFO: renamed from: h */
        public boolean f8911h;

        /* JADX INFO: renamed from: c */
        public b f8906c = new b();

        /* JADX INFO: renamed from: i */
        public List<C1643l> f8912i = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Object f8905b = new Object();

        public e(InterfaceC1650s interfaceC1650s) {
            this.f8904a = interfaceC1650s;
        }

        /* JADX INFO: renamed from: a */
        private int m7409a(@NonNull e eVar) {
            return this.f8909f - eVar.f8909f;
        }

        /* JADX INFO: renamed from: a */
        public final void m7410a(int i, int i2, int i3) {
            this.f8907d = i;
            this.f8908e = i2;
            this.f8909f = i3;
            this.f8910g = false;
            this.f8911h = false;
            this.f8912i.clear();
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(@NonNull e eVar) {
            return this.f8909f - eVar.f8909f;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.i$f */
    public static final class f<T> {

        /* JADX INFO: renamed from: a */
        public final int f8913a;

        /* JADX INFO: renamed from: b */
        public final T f8914b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final d f8915c;

        public f(int i, T t, @Nullable Runnable runnable) {
            this.f8913a = i;
            this.f8915c = runnable != null ? new d(runnable) : null;
            this.f8914b = t;
        }
    }

    public C1640i() {
        this(false, (InterfaceC1616aa) new InterfaceC1616aa.a());
    }

    private C1640i(boolean z) {
        this(z, new InterfaceC1616aa.a());
    }

    private C1640i(boolean z, InterfaceC1616aa interfaceC1616aa) {
        this(z, interfaceC1616aa, new InterfaceC1650s[0]);
    }

    private C1640i(boolean z, InterfaceC1616aa interfaceC1616aa, InterfaceC1650s... interfaceC1650sArr) {
        for (InterfaceC1650s interfaceC1650s : interfaceC1650sArr) {
            C1711a.m8005a(interfaceC1650s);
        }
        this.f8888q = interfaceC1616aa.mo7247a() > 0 ? interfaceC1616aa.mo7254d() : interfaceC1616aa;
        this.f8882k = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        this.f8879h = arrayList;
        this.f8880i = new ArrayList();
        this.f8883l = new ArrayList();
        this.f8881j = new e(null);
        this.f8884m = z;
        this.f8885n = new AbstractC1499ae.b();
        m7388a(arrayList.size(), Arrays.asList(interfaceC1650sArr), (Runnable) null);
    }

    private C1640i(InterfaceC1650s... interfaceC1650sArr) {
        this(interfaceC1650sArr, (byte) 0);
    }

    private C1640i(InterfaceC1650s[] interfaceC1650sArr, byte b2) {
        this(false, new InterfaceC1616aa.a(), interfaceC1650sArr);
    }

    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    private static int a2(e eVar, int i) {
        return i + eVar.f8908e;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    private static InterfaceC1650s.a a2(e eVar, InterfaceC1650s.a aVar) {
        for (int i = 0; i < eVar.f8912i.size(); i++) {
            if (eVar.f8912i.get(i).f8917b.f9015d == aVar.f9015d) {
                return aVar.m7463a(aVar.f9012a + eVar.f8909f);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m7379a(int i) {
        this.f8879h.remove(i);
        InterfaceC1610h interfaceC1610h = this.f8886o;
        if (interfaceC1610h != null) {
            interfaceC1610h.mo6300a((C1767x.b) this).m8514a(2).m8515a(new f(i, null, null)).m8524i();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7380a(int i, int i2) {
        if (i != i2) {
            List<e> list = this.f8879h;
            list.add(i2, list.remove(i));
            InterfaceC1610h interfaceC1610h = this.f8886o;
            if (interfaceC1610h != null) {
                interfaceC1610h.mo6300a((C1767x.b) this).m8514a(3).m8515a(new f(i, Integer.valueOf(i2), null)).m8524i();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7381a(int i, int i2, int i3, int i4) {
        this.f8889r += i3;
        this.f8890s += i4;
        while (i < this.f8880i.size()) {
            this.f8880i.get(i).f8907d += i2;
            this.f8880i.get(i).f8908e += i3;
            this.f8880i.get(i).f8909f += i4;
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7382a(int i, int i2, @Nullable Runnable runnable) {
        if (i == i2) {
            return;
        }
        List<e> list = this.f8879h;
        list.add(i2, list.remove(i));
        InterfaceC1610h interfaceC1610h = this.f8886o;
        if (interfaceC1610h != null) {
            interfaceC1610h.mo6300a((C1767x.b) this).m8514a(3).m8515a(new f(i, Integer.valueOf(i2), runnable)).m8524i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7383a(int i, e eVar) {
        if (i > 0) {
            e eVar2 = this.f8880i.get(i - 1);
            eVar.m7410a(i, eVar2.f8908e + eVar2.f8906c.mo6366b(), eVar2.f8909f + eVar2.f8906c.mo6370c());
        } else {
            eVar.m7410a(i, 0, 0);
        }
        m7381a(i, 1, eVar.f8906c.mo6366b(), eVar.f8906c.mo6370c());
        this.f8880i.add(i, eVar);
        m7374a(eVar, eVar.f8904a);
    }

    /* JADX INFO: renamed from: a */
    private void m7384a(int i, InterfaceC1650s interfaceC1650s) {
        m7385a(i, interfaceC1650s, (Runnable) null);
    }

    /* JADX INFO: renamed from: a */
    private void m7385a(int i, InterfaceC1650s interfaceC1650s, @Nullable Runnable runnable) {
        C1711a.m8005a(interfaceC1650s);
        e eVar = new e(interfaceC1650s);
        this.f8879h.add(i, eVar);
        InterfaceC1610h interfaceC1610h = this.f8886o;
        if (interfaceC1610h != null) {
            interfaceC1610h.mo6300a((C1767x.b) this).m8514a(0).m8515a(new f(i, eVar, runnable)).m8524i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7386a(int i, @Nullable Runnable runnable) {
        this.f8879h.remove(i);
        InterfaceC1610h interfaceC1610h = this.f8886o;
        if (interfaceC1610h != null) {
            interfaceC1610h.mo6300a((C1767x.b) this).m8514a(2).m8515a(new f(i, null, runnable)).m8524i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7387a(int i, Collection<InterfaceC1650s> collection) {
        m7388a(i, collection, (Runnable) null);
    }

    /* JADX INFO: renamed from: a */
    private void m7388a(int i, Collection<InterfaceC1650s> collection, @Nullable Runnable runnable) {
        Iterator<InterfaceC1650s> it = collection.iterator();
        while (it.hasNext()) {
            C1711a.m8005a(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<InterfaceC1650s> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new e(it2.next()));
        }
        this.f8879h.addAll(i, arrayList);
        if (this.f8886o != null && !collection.isEmpty()) {
            this.f8886o.mo6300a((C1767x.b) this).m8514a(1).m8515a(new f(i, arrayList, runnable)).m8524i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7389a(@Nullable d dVar) {
        if (!this.f8887p) {
            this.f8886o.mo6300a((C1767x.b) this).m8514a(5).m8524i();
            this.f8887p = true;
        }
        if (dVar != null) {
            this.f8883l.add(dVar);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7390a(e eVar, AbstractC1499ae abstractC1499ae) {
        if (eVar == null) {
            throw new IllegalArgumentException();
        }
        b bVar = eVar.f8906c;
        if (bVar.m7407d() != abstractC1499ae) {
            int iMo6366b = abstractC1499ae.mo6366b() - bVar.mo6366b();
            int iMo6370c = abstractC1499ae.mo6370c() - bVar.mo6370c();
            if (iMo6366b != 0 || iMo6370c != 0) {
                m7381a(eVar.f8907d + 1, 0, iMo6366b, iMo6370c);
            }
            eVar.f8906c = bVar.m7406a(abstractC1499ae);
            if (!eVar.f8910g && !abstractC1499ae.m6365a()) {
                abstractC1499ae.m6363a(0, this.f8885n, false);
                AbstractC1499ae.b bVar2 = this.f8885n;
                long j = bVar2.f7375j + bVar2.f7373h;
                for (int i = 0; i < eVar.f8912i.size(); i++) {
                    C1643l c1643l = eVar.f8912i.get(i);
                    c1643l.m7413d(j);
                    c1643l.m7414f();
                }
                eVar.f8910g = true;
            }
            m7389a((d) null);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7391a(InterfaceC1650s interfaceC1650s) {
        m7385a(this.f8879h.size(), interfaceC1650s, (Runnable) null);
    }

    /* JADX INFO: renamed from: a */
    private void m7392a(InterfaceC1650s interfaceC1650s, @Nullable Runnable runnable) {
        m7385a(this.f8879h.size(), interfaceC1650s, runnable);
    }

    /* JADX INFO: renamed from: a */
    private void m7393a(@Nullable Runnable runnable) {
        this.f8879h.clear();
        InterfaceC1610h interfaceC1610h = this.f8886o;
        if (interfaceC1610h != null) {
            interfaceC1610h.mo6300a((C1767x.b) this).m8514a(4).m8515a(runnable != null ? new d(runnable) : null).m8524i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7394a(Collection<InterfaceC1650s> collection) {
        m7388a(this.f8879h.size(), collection, (Runnable) null);
    }

    /* JADX INFO: renamed from: a */
    private void m7395a(Collection<InterfaceC1650s> collection, @Nullable Runnable runnable) {
        m7388a(this.f8879h.size(), collection, runnable);
    }

    /* JADX INFO: renamed from: b */
    private InterfaceC1650s m7396b(int i) {
        return this.f8879h.get(i).f8904a;
    }

    /* JADX INFO: renamed from: b */
    private void m7397b(int i, int i2) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int iMo6366b = this.f8880i.get(iMin).f8908e;
        int iMo6370c = this.f8880i.get(iMin).f8909f;
        List<e> list = this.f8880i;
        list.add(i2, list.remove(i));
        while (iMin <= iMax) {
            e eVar = this.f8880i.get(iMin);
            eVar.f8908e = iMo6366b;
            eVar.f8909f = iMo6370c;
            iMo6366b += eVar.f8906c.mo6366b();
            iMo6370c += eVar.f8906c.mo6370c();
            iMin++;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7398b(int i, Collection<e> collection) {
        Iterator<e> it = collection.iterator();
        while (it.hasNext()) {
            m7383a(i, it.next());
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7399b(e eVar, AbstractC1499ae abstractC1499ae) {
        if (eVar == null) {
            throw new IllegalArgumentException();
        }
        b bVar = eVar.f8906c;
        if (bVar.m7407d() == abstractC1499ae) {
            return;
        }
        int iMo6366b = abstractC1499ae.mo6366b() - bVar.mo6366b();
        int iMo6370c = abstractC1499ae.mo6370c() - bVar.mo6370c();
        if (iMo6366b != 0 || iMo6370c != 0) {
            m7381a(eVar.f8907d + 1, 0, iMo6366b, iMo6370c);
        }
        eVar.f8906c = bVar.m7406a(abstractC1499ae);
        if (!eVar.f8910g && !abstractC1499ae.m6365a()) {
            abstractC1499ae.m6363a(0, this.f8885n, false);
            AbstractC1499ae.b bVar2 = this.f8885n;
            long j = bVar2.f7375j + bVar2.f7373h;
            for (int i = 0; i < eVar.f8912i.size(); i++) {
                C1643l c1643l = eVar.f8912i.get(i);
                c1643l.m7413d(j);
                c1643l.m7414f();
            }
            eVar.f8910g = true;
        }
        m7389a((d) null);
    }

    /* JADX INFO: renamed from: c */
    private void m7400c() {
        this.f8879h.clear();
        InterfaceC1610h interfaceC1610h = this.f8886o;
        if (interfaceC1610h != null) {
            interfaceC1610h.mo6300a((C1767x.b) this).m8514a(4).m8515a((Object) null).m8524i();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m7401c(int i) {
        e eVarRemove = this.f8880i.remove(i);
        b bVar = eVarRemove.f8906c;
        m7381a(i, -1, -bVar.mo6366b(), -bVar.mo6370c());
        eVarRemove.f8911h = true;
        if (eVarRemove.f8912i.isEmpty()) {
            m7373a(eVarRemove);
        }
    }

    /* JADX INFO: renamed from: d */
    private int m7402d() {
        return this.f8879h.size();
    }

    /* JADX INFO: renamed from: d */
    private int m7403d(int i) {
        e eVar = this.f8881j;
        eVar.f8909f = i;
        int iBinarySearch = Collections.binarySearch(this.f8880i, eVar);
        if (iBinarySearch < 0) {
            return (-iBinarySearch) - 2;
        }
        while (iBinarySearch < this.f8880i.size() - 1) {
            int i2 = iBinarySearch + 1;
            if (this.f8880i.get(i2).f8909f != i) {
                break;
            }
            iBinarySearch = i2;
        }
        return iBinarySearch;
    }

    /* JADX INFO: renamed from: e */
    private void m7404e() {
        this.f8887p = false;
        List listEmptyList = this.f8883l.isEmpty() ? Collections.emptyList() : new ArrayList(this.f8883l);
        this.f8883l.clear();
        m7355a(new a(this.f8880i, this.f8889r, this.f8890s, this.f8888q, this.f8884m), (Object) null);
        if (listEmptyList.isEmpty()) {
            return;
        }
        this.f8886o.mo6300a((C1767x.b) this).m8514a(6).m8515a(listEmptyList).m8524i();
    }

    /* JADX INFO: renamed from: f */
    private void m7405f() {
        for (int size = this.f8880i.size() - 1; size >= 0; size--) {
            m7401c(size);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ int mo7372a(e eVar, int i) {
        return i + eVar.f8908e;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final InterfaceC1649r mo7225a(InterfaceC1650s.a aVar, InterfaceC1685b interfaceC1685b) {
        int i;
        int i2 = aVar.f9012a;
        e eVar = this.f8881j;
        eVar.f8909f = i2;
        int iBinarySearch = Collections.binarySearch(this.f8880i, eVar);
        if (iBinarySearch < 0) {
            i = (-iBinarySearch) - 2;
        } else {
            while (iBinarySearch < this.f8880i.size() - 1) {
                int i3 = iBinarySearch + 1;
                if (this.f8880i.get(i3).f8909f != i2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i = iBinarySearch;
        }
        e eVar2 = this.f8880i.get(i);
        C1643l c1643l = new C1643l(eVar2.f8904a, aVar.m7463a(aVar.f9012a - eVar2.f8909f), interfaceC1685b);
        this.f8882k.put(c1643l, eVar2);
        eVar2.f8912i.add(c1643l);
        if (eVar2.f8910g) {
            c1643l.m7414f();
        }
        return c1643l;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f
    @Nullable
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1650s.a mo7226a(e eVar, InterfaceC1650s.a aVar) {
        e eVar2 = eVar;
        for (int i = 0; i < eVar2.f8912i.size(); i++) {
            if (eVar2.f8912i.get(i).f8917b.f9015d == aVar.f9015d) {
                return aVar.m7463a(aVar.f9012a + eVar2.f8909f);
            }
        }
        return null;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f, com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    /* JADX INFO: renamed from: a */
    public final void mo7227a() {
        super.mo7227a();
        this.f8880i.clear();
        this.f8886o = null;
        this.f8888q = this.f8888q.mo7254d();
        this.f8889r = 0;
        this.f8890s = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.expressad.exoplayer.C1767x.b
    /* JADX INFO: renamed from: a */
    public final void mo6125a(int i, Object obj) {
        switch (i) {
            case 0:
                f fVar = (f) obj;
                this.f8888q = this.f8888q.mo7249a(fVar.f8913a, 1);
                m7383a(fVar.f8913a, (e) fVar.f8914b);
                m7389a(fVar.f8915c);
                return;
            case 1:
                f fVar2 = (f) obj;
                this.f8888q = this.f8888q.mo7249a(fVar2.f8913a, ((Collection) fVar2.f8914b).size());
                m7398b(fVar2.f8913a, (Collection<e>) fVar2.f8914b);
                m7389a(fVar2.f8915c);
                return;
            case 2:
                f fVar3 = (f) obj;
                this.f8888q = this.f8888q.mo7253c(fVar3.f8913a);
                m7401c(fVar3.f8913a);
                m7389a(fVar3.f8915c);
                return;
            case 3:
                f fVar4 = (f) obj;
                InterfaceC1616aa interfaceC1616aaMo7253c = this.f8888q.mo7253c(fVar4.f8913a);
                this.f8888q = interfaceC1616aaMo7253c;
                this.f8888q = interfaceC1616aaMo7253c.mo7249a(((Integer) fVar4.f8914b).intValue(), 1);
                int i2 = fVar4.f8913a;
                int iIntValue = ((Integer) fVar4.f8914b).intValue();
                int iMin = Math.min(i2, iIntValue);
                int iMax = Math.max(i2, iIntValue);
                int iMo6366b = this.f8880i.get(iMin).f8908e;
                int iMo6370c = this.f8880i.get(iMin).f8909f;
                List<e> list = this.f8880i;
                list.add(iIntValue, list.remove(i2));
                while (iMin <= iMax) {
                    e eVar = this.f8880i.get(iMin);
                    eVar.f8908e = iMo6366b;
                    eVar.f8909f = iMo6370c;
                    iMo6366b += eVar.f8906c.mo6366b();
                    iMo6370c += eVar.f8906c.mo6370c();
                    iMin++;
                }
                m7389a(fVar4.f8915c);
                return;
            case 4:
                for (int size = this.f8880i.size() - 1; size >= 0; size--) {
                    m7401c(size);
                }
                m7389a((d) obj);
                return;
            case 5:
                m7404e();
                return;
            case 6:
                List list2 = (List) obj;
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    d dVar = (d) list2.get(i3);
                    dVar.f8902a.post(dVar.f8903b);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final void mo7228a(InterfaceC1649r interfaceC1649r) {
        e eVarRemove = this.f8882k.remove(interfaceC1649r);
        ((C1643l) interfaceC1649r).m7415g();
        eVarRemove.f8912i.remove(interfaceC1649r);
        if (eVarRemove.f8912i.isEmpty() && eVarRemove.f8911h) {
            m7373a(eVarRemove);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f, com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    /* JADX INFO: renamed from: a */
    public final void mo7229a(InterfaceC1610h interfaceC1610h, boolean z) {
        super.mo7229a(interfaceC1610h, z);
        this.f8886o = interfaceC1610h;
        if (this.f8879h.isEmpty()) {
            m7404e();
            return;
        }
        this.f8888q = this.f8888q.mo7249a(0, this.f8879h.size());
        m7398b(0, this.f8879h);
        m7389a((d) null);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo7230a(e eVar, InterfaceC1650s interfaceC1650s, AbstractC1499ae abstractC1499ae, @Nullable Object obj) {
        e eVar2 = eVar;
        if (eVar2 == null) {
            throw new IllegalArgumentException();
        }
        b bVar = eVar2.f8906c;
        if (bVar.m7407d() != abstractC1499ae) {
            int iMo6366b = abstractC1499ae.mo6366b() - bVar.mo6366b();
            int iMo6370c = abstractC1499ae.mo6370c() - bVar.mo6370c();
            if (iMo6366b != 0 || iMo6370c != 0) {
                m7381a(eVar2.f8907d + 1, 0, iMo6366b, iMo6370c);
            }
            eVar2.f8906c = bVar.m7406a(abstractC1499ae);
            if (!eVar2.f8910g && !abstractC1499ae.m6365a()) {
                abstractC1499ae.m6363a(0, this.f8885n, false);
                AbstractC1499ae.b bVar2 = this.f8885n;
                long j = bVar2.f7375j + bVar2.f7373h;
                for (int i = 0; i < eVar2.f8912i.size(); i++) {
                    C1643l c1643l = eVar2.f8912i.get(i);
                    c1643l.m7413d(j);
                    c1643l.m7414f();
                }
                eVar2.f8910g = true;
            }
            m7389a((d) null);
        }
    }
}
