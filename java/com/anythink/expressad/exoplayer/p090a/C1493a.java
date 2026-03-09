package com.anythink.expressad.exoplayer.p090a;

import android.net.NetworkInfo;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1581g;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.C1765v;
import com.anythink.expressad.exoplayer.InterfaceC1766w;
import com.anythink.expressad.exoplayer.p090a.InterfaceC1494b;
import com.anythink.expressad.exoplayer.p091b.InterfaceC1507g;
import com.anythink.expressad.exoplayer.p092c.C1526d;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1534c;
import com.anythink.expressad.exoplayer.p097g.C1582a;
import com.anythink.expressad.exoplayer.p097g.InterfaceC1608f;
import com.anythink.expressad.exoplayer.p101h.C1621af;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1651t;
import com.anythink.expressad.exoplayer.p104i.C1665g;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1687d;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.InterfaceC1720c;
import com.anythink.expressad.exoplayer.p108l.InterfaceC1752h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1493a implements InterfaceC1507g, InterfaceC1534c, InterfaceC1608f, InterfaceC1651t, InterfaceC1687d.a, InterfaceC1752h, InterfaceC1766w.c {

    /* JADX INFO: renamed from: b */
    private final InterfaceC1720c f7307b;

    /* JADX INFO: renamed from: e */
    @Nullable
    private InterfaceC1766w f7310e;

    /* JADX INFO: renamed from: a */
    private final CopyOnWriteArraySet<InterfaceC1494b> f7306a = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: d */
    private final b f7309d = new b();

    /* JADX INFO: renamed from: c */
    private final AbstractC1499ae.b f7308c = new AbstractC1499ae.b();

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.a.a$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static C1493a m6194a(@Nullable InterfaceC1766w interfaceC1766w, InterfaceC1720c interfaceC1720c) {
            return new C1493a(interfaceC1766w, interfaceC1720c);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.a.a$b */
    public static final class b {

        /* JADX INFO: renamed from: c */
        private c f7313c;

        /* JADX INFO: renamed from: d */
        private c f7314d;

        /* JADX INFO: renamed from: f */
        private boolean f7316f;

        /* JADX INFO: renamed from: a */
        private final ArrayList<c> f7311a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        private final AbstractC1499ae.a f7312b = new AbstractC1499ae.a();

        /* JADX INFO: renamed from: e */
        private AbstractC1499ae f7315e = AbstractC1499ae.f7359a;

        /* JADX INFO: renamed from: a */
        private c m6195a(c cVar, AbstractC1499ae abstractC1499ae) {
            int iMo6358a;
            return (abstractC1499ae.m6365a() || this.f7315e.m6365a() || (iMo6358a = abstractC1499ae.mo6358a(this.f7315e.mo6362a(cVar.f7318b.f9012a, this.f7312b, true).f7361b)) == -1) ? cVar : new c(abstractC1499ae.mo6362a(iMo6358a, this.f7312b, false).f7362c, cVar.f7318b.m7463a(iMo6358a));
        }

        /* JADX INFO: renamed from: i */
        private void m6197i() {
            if (this.f7311a.isEmpty()) {
                return;
            }
            this.f7313c = this.f7311a.get(0);
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final c m6198a() {
            if (this.f7311a.isEmpty() || this.f7315e.m6365a() || this.f7316f) {
                return null;
            }
            return this.f7311a.get(0);
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final InterfaceC1650s.a m6199a(int i) {
            AbstractC1499ae abstractC1499ae = this.f7315e;
            if (abstractC1499ae == null) {
                return null;
            }
            int iMo6370c = abstractC1499ae.mo6370c();
            InterfaceC1650s.a aVar = null;
            for (int i2 = 0; i2 < this.f7311a.size(); i2++) {
                c cVar = this.f7311a.get(i2);
                int i3 = cVar.f7318b.f9012a;
                if (i3 < iMo6370c && this.f7315e.mo6362a(i3, this.f7312b, false).f7362c == i) {
                    if (aVar != null) {
                        return null;
                    }
                    aVar = cVar.f7318b;
                }
            }
            return aVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m6200a(int i, InterfaceC1650s.a aVar) {
            this.f7311a.add(new c(i, aVar));
            if (this.f7311a.size() != 1 || this.f7315e.m6365a()) {
                return;
            }
            m6197i();
        }

        /* JADX INFO: renamed from: a */
        public final void m6201a(AbstractC1499ae abstractC1499ae) {
            for (int i = 0; i < this.f7311a.size(); i++) {
                ArrayList<c> arrayList = this.f7311a;
                arrayList.set(i, m6195a(arrayList.get(i), abstractC1499ae));
            }
            c cVar = this.f7314d;
            if (cVar != null) {
                this.f7314d = m6195a(cVar, abstractC1499ae);
            }
            this.f7315e = abstractC1499ae;
            m6197i();
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final c m6202b() {
            return this.f7313c;
        }

        /* JADX INFO: renamed from: b */
        public final void m6203b(int i, InterfaceC1650s.a aVar) {
            c cVar = new c(i, aVar);
            this.f7311a.remove(cVar);
            if (cVar.equals(this.f7314d)) {
                this.f7314d = this.f7311a.isEmpty() ? null : this.f7311a.get(0);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final c m6204c() {
            return this.f7314d;
        }

        /* JADX INFO: renamed from: c */
        public final void m6205c(int i, InterfaceC1650s.a aVar) {
            this.f7314d = new c(i, aVar);
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final c m6206d() {
            if (this.f7311a.isEmpty()) {
                return null;
            }
            return this.f7311a.get(r0.size() - 1);
        }

        /* JADX INFO: renamed from: e */
        public final boolean m6207e() {
            return this.f7316f;
        }

        /* JADX INFO: renamed from: f */
        public final void m6208f() {
            m6197i();
        }

        /* JADX INFO: renamed from: g */
        public final void m6209g() {
            this.f7316f = true;
        }

        /* JADX INFO: renamed from: h */
        public final void m6210h() {
            this.f7316f = false;
            m6197i();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.a.a$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f7317a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC1650s.a f7318b;

        public c(int i, InterfaceC1650s.a aVar) {
            this.f7317a = i;
            this.f7318b = aVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f7317a == cVar.f7317a && this.f7318b.equals(cVar.f7318b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f7317a * 31) + this.f7318b.hashCode();
        }
    }

    public C1493a(@Nullable InterfaceC1766w interfaceC1766w, InterfaceC1720c interfaceC1720c) {
        this.f7310e = interfaceC1766w;
        this.f7307b = (InterfaceC1720c) C1711a.m8005a(interfaceC1720c);
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC1494b.a m6152a(@Nullable c cVar) {
        if (cVar != null) {
            return m6156d(cVar.f7317a, cVar.f7318b);
        }
        int iMo6343p = ((InterfaceC1766w) C1711a.m8005a(this.f7310e)).mo6343p();
        return m6156d(iMo6343p, this.f7309d.m6199a(iMo6343p));
    }

    /* JADX INFO: renamed from: a */
    private void m6153a(int i, int i2) {
        InterfaceC1494b.a aVarM6159i = m6159i();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6214a(aVarM6159i, i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m6154a(@Nullable NetworkInfo networkInfo) {
        InterfaceC1494b.a aVarM6159i = m6159i();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6218a(aVarM6159i, networkInfo);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m6155a(InterfaceC1766w interfaceC1766w) {
        C1711a.m8012b(this.f7310e == null);
        this.f7310e = (InterfaceC1766w) C1711a.m8005a(interfaceC1766w);
    }

    /* JADX INFO: renamed from: d */
    private InterfaceC1494b.a m6156d(int i, @Nullable InterfaceC1650s.a aVar) {
        long jM6396a;
        long j;
        C1711a.m8005a(this.f7310e);
        long jMo8014a = this.f7307b.mo8014a();
        AbstractC1499ae abstractC1499aeMo6294F = this.f7310e.mo6294F();
        long jMo6347t = 0;
        if (i != this.f7310e.mo6343p()) {
            if (i < abstractC1499aeMo6294F.mo6366b() && (aVar == null || !aVar.m7464a())) {
                jM6396a = C1500b.m6396a(abstractC1499aeMo6294F.m6363a(i, this.f7308c, false).f7373h);
                j = jM6396a;
            }
            j = jMo6347t;
        } else if (aVar == null || !aVar.m7464a()) {
            jM6396a = this.f7310e.mo6290B();
            j = jM6396a;
        } else {
            if (this.f7310e.mo6353z() == aVar.f9013b && this.f7310e.mo6289A() == aVar.f9014c) {
                jMo6347t = this.f7310e.mo6347t();
            }
            j = jMo6347t;
        }
        return new InterfaceC1494b.a(jMo8014a, abstractC1499aeMo6294F, i, aVar, j, this.f7310e.mo6347t(), this.f7310e.mo6348u() - this.f7310e.mo6290B());
    }

    /* JADX INFO: renamed from: g */
    private Set<InterfaceC1494b> m6157g() {
        return Collections.unmodifiableSet(this.f7306a);
    }

    /* JADX INFO: renamed from: h */
    private InterfaceC1494b.a m6158h() {
        return m6152a(this.f7309d.m6202b());
    }

    /* JADX INFO: renamed from: i */
    private InterfaceC1494b.a m6159i() {
        return m6152a(this.f7309d.m6198a());
    }

    /* JADX INFO: renamed from: j */
    private InterfaceC1494b.a m6160j() {
        return m6152a(this.f7309d.m6204c());
    }

    /* JADX INFO: renamed from: k */
    private InterfaceC1494b.a m6161k() {
        return m6152a(this.f7309d.m6206d());
    }

    /* JADX INFO: renamed from: a */
    public final void m6162a() {
        if (this.f7309d.m6207e()) {
            return;
        }
        InterfaceC1494b.a aVarM6159i = m6159i();
        this.f7309d.m6209g();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6212a(aVarM6159i);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1507g
    /* JADX INFO: renamed from: a */
    public final void mo6163a(int i) {
        InterfaceC1494b.a aVarM6160j = m6160j();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6244f(aVarM6160j, i);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1752h
    /* JADX INFO: renamed from: a */
    public final void mo6164a(int i, int i2, int i3, float f) {
        InterfaceC1494b.a aVarM6160j = m6160j();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6232b(aVarM6160j, i, i2);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1752h
    /* JADX INFO: renamed from: a */
    public final void mo6165a(int i, long j) {
        InterfaceC1494b.a aVarM6158h = m6158h();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6246g(aVarM6158h, i);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1507g
    /* JADX INFO: renamed from: a */
    public final void mo6166a(int i, long j, long j2) {
        InterfaceC1494b.a aVarM6160j = m6160j();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6215a(aVarM6160j, i, j, j2);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
    /* JADX INFO: renamed from: a */
    public final void mo6167a(int i, InterfaceC1650s.a aVar) {
        this.f7309d.m6200a(i, aVar);
        InterfaceC1494b.a aVarM6156d = m6156d(i, aVar);
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6236c(aVarM6156d);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
    /* JADX INFO: renamed from: a */
    public final void mo6168a(int i, @Nullable InterfaceC1650s.a aVar, InterfaceC1651t.b bVar, InterfaceC1651t.c cVar) {
        m6156d(i, aVar);
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
    /* JADX INFO: renamed from: a */
    public final void mo6169a(int i, @Nullable InterfaceC1650s.a aVar, InterfaceC1651t.b bVar, InterfaceC1651t.c cVar, IOException iOException, boolean z) {
        InterfaceC1494b.a aVarM6156d = m6156d(i, aVar);
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6225a(aVarM6156d, iOException);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
    /* JADX INFO: renamed from: a */
    public final void mo6170a(int i, @Nullable InterfaceC1650s.a aVar, InterfaceC1651t.c cVar) {
        InterfaceC1494b.a aVarM6156d = m6156d(i, aVar);
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6233b(aVarM6156d, cVar);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1752h
    /* JADX INFO: renamed from: a */
    public final void mo6171a(Surface surface) {
        InterfaceC1494b.a aVarM6160j = m6160j();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6219a(aVarM6160j, surface);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6172a(InterfaceC1494b interfaceC1494b) {
        this.f7306a.add(interfaceC1494b);
    }

    @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1752h
    /* JADX INFO: renamed from: a */
    public final void mo6173a(C1526d c1526d) {
        InterfaceC1494b.a aVarM6159i = m6159i();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6240d(aVarM6159i, 2);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p097g.InterfaceC1608f
    /* JADX INFO: renamed from: a */
    public final void mo6174a(C1582a c1582a) {
        InterfaceC1494b.a aVarM6159i = m6159i();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6220a(aVarM6159i, c1582a);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1752h
    /* JADX INFO: renamed from: a */
    public final void mo6175a(C1753m c1753m) {
        InterfaceC1494b.a aVarM6160j = m6160j();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6216a(aVarM6160j, 2, c1753m);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1534c
    /* JADX INFO: renamed from: a */
    public final void mo6176a(Exception exc) {
        InterfaceC1494b.a aVarM6160j = m6160j();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6226a(aVarM6160j, exc);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1752h
    /* JADX INFO: renamed from: a */
    public final void mo6177a(String str, long j, long j2) {
        InterfaceC1494b.a aVarM6160j = m6160j();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6217a(aVarM6160j, 2, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6178b() {
        for (c cVar : new ArrayList(this.f7309d.f7311a)) {
            mo6179b(cVar.f7317a, cVar.f7318b);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
    /* JADX INFO: renamed from: b */
    public final void mo6179b(int i, InterfaceC1650s.a aVar) {
        this.f7309d.m6203b(i, aVar);
        InterfaceC1494b.a aVarM6156d = m6156d(i, aVar);
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6239d(aVarM6156d);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
    /* JADX INFO: renamed from: b */
    public final void mo6180b(int i, @Nullable InterfaceC1650s.a aVar, InterfaceC1651t.b bVar, InterfaceC1651t.c cVar) {
        m6156d(i, aVar);
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
    /* JADX INFO: renamed from: b */
    public final void mo6181b(int i, @Nullable InterfaceC1650s.a aVar, InterfaceC1651t.c cVar) {
        InterfaceC1494b.a aVarM6156d = m6156d(i, aVar);
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6222a(aVarM6156d, cVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6182b(InterfaceC1494b interfaceC1494b) {
        this.f7306a.remove(interfaceC1494b);
    }

    @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1752h
    /* JADX INFO: renamed from: b */
    public final void mo6183b(C1526d c1526d) {
        InterfaceC1494b.a aVarM6158h = m6158h();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6242e(aVarM6158h, 2);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1507g
    /* JADX INFO: renamed from: b */
    public final void mo6184b(C1753m c1753m) {
        InterfaceC1494b.a aVarM6160j = m6160j();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6216a(aVarM6160j, 1, c1753m);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1507g
    /* JADX INFO: renamed from: b */
    public final void mo6185b(String str, long j, long j2) {
        InterfaceC1494b.a aVarM6160j = m6160j();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6217a(aVarM6160j, 1, str);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1687d.a
    /* JADX INFO: renamed from: c */
    public final void mo6186c() {
        m6152a(this.f7309d.m6206d());
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
    /* JADX INFO: renamed from: c */
    public final void mo6187c(int i, InterfaceC1650s.a aVar) {
        this.f7309d.m6205c(i, aVar);
        InterfaceC1494b.a aVarM6156d = m6156d(i, aVar);
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6241e(aVarM6156d);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
    /* JADX INFO: renamed from: c */
    public final void mo6188c(int i, @Nullable InterfaceC1650s.a aVar, InterfaceC1651t.b bVar, InterfaceC1651t.c cVar) {
        m6156d(i, aVar);
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1507g
    /* JADX INFO: renamed from: c */
    public final void mo6189c(C1526d c1526d) {
        InterfaceC1494b.a aVarM6159i = m6159i();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6240d(aVarM6159i, 1);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1534c
    /* JADX INFO: renamed from: d */
    public final void mo6190d() {
        InterfaceC1494b.a aVarM6160j = m6160j();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6243f(aVarM6160j);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1507g
    /* JADX INFO: renamed from: d */
    public final void mo6191d(C1526d c1526d) {
        InterfaceC1494b.a aVarM6158h = m6158h();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6242e(aVarM6158h, 1);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1534c
    /* JADX INFO: renamed from: e */
    public final void mo6192e() {
        InterfaceC1494b.a aVarM6160j = m6160j();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6245g(aVarM6160j);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1534c
    /* JADX INFO: renamed from: f */
    public final void mo6193f() {
        InterfaceC1494b.a aVarM6160j = m6160j();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6247h(aVarM6160j);
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public final void onLoadingChanged(boolean z) {
        InterfaceC1494b.a aVarM6159i = m6159i();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6234b(aVarM6159i, z);
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public final void onPlaybackParametersChanged(C1765v c1765v) {
        InterfaceC1494b.a aVarM6159i = m6159i();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6224a(aVarM6159i, c1765v);
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public final void onPlayerError(C1581g c1581g) {
        InterfaceC1494b.a aVarM6159i = m6159i();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6221a(aVarM6159i, c1581g);
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public final void onPlayerStateChanged(boolean z, int i) {
        InterfaceC1494b.a aVarM6159i = m6159i();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6228a(aVarM6159i, z, i);
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public final void onPositionDiscontinuity(int i) {
        this.f7309d.m6208f();
        InterfaceC1494b.a aVarM6159i = m6159i();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6231b(aVarM6159i, i);
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public final void onRepeatModeChanged(int i) {
        InterfaceC1494b.a aVarM6159i = m6159i();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6237c(aVarM6159i, i);
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public final void onSeekProcessed() {
        if (this.f7309d.m6207e()) {
            this.f7309d.m6210h();
            InterfaceC1494b.a aVarM6159i = m6159i();
            Iterator<InterfaceC1494b> it = this.f7306a.iterator();
            while (it.hasNext()) {
                it.next().mo6230b(aVarM6159i);
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public final void onShuffleModeEnabledChanged(boolean z) {
        InterfaceC1494b.a aVarM6159i = m6159i();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6227a(aVarM6159i, z);
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public final void onTimelineChanged(AbstractC1499ae abstractC1499ae, @Nullable Object obj, int i) {
        this.f7309d.m6201a(abstractC1499ae);
        InterfaceC1494b.a aVarM6159i = m6159i();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6213a(aVarM6159i, i);
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public final void onTracksChanged(C1621af c1621af, C1665g c1665g) {
        InterfaceC1494b.a aVarM6159i = m6159i();
        Iterator<InterfaceC1494b> it = this.f7306a.iterator();
        while (it.hasNext()) {
            it.next().mo6223a(aVarM6159i, c1665g);
        }
    }
}
