package com.anythink.expressad.exoplayer;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.C1767x;
import com.anythink.expressad.exoplayer.InterfaceC1610h;
import com.anythink.expressad.exoplayer.InterfaceC1766w;
import com.anythink.expressad.exoplayer.p101h.C1621af;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p104i.AbstractC1666h;
import com.anythink.expressad.exoplayer.p104i.C1665g;
import com.anythink.expressad.exoplayer.p104i.C1667i;
import com.anythink.expressad.exoplayer.p104i.InterfaceC1664f;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.InterfaceC1720c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1668j implements InterfaceC1610h {

    /* JADX INFO: renamed from: w */
    private static final String f9236w = "ExoPlayerImpl";

    /* JADX INFO: renamed from: A */
    private final Handler f9237A;

    /* JADX INFO: renamed from: B */
    private final C1710k f9238B;

    /* JADX INFO: renamed from: C */
    private final Handler f9239C;

    /* JADX INFO: renamed from: D */
    private final CopyOnWriteArraySet<InterfaceC1766w.c> f9240D;

    /* JADX INFO: renamed from: E */
    private final AbstractC1499ae.b f9241E;

    /* JADX INFO: renamed from: F */
    private final AbstractC1499ae.a f9242F;

    /* JADX INFO: renamed from: G */
    private final ArrayDeque<a> f9243G;

    /* JADX INFO: renamed from: H */
    private boolean f9244H;

    /* JADX INFO: renamed from: I */
    private int f9245I;

    /* JADX INFO: renamed from: J */
    private boolean f9246J;

    /* JADX INFO: renamed from: K */
    private int f9247K;

    /* JADX INFO: renamed from: L */
    private boolean f9248L;

    /* JADX INFO: renamed from: M */
    private boolean f9249M;

    /* JADX INFO: renamed from: N */
    private C1765v f9250N;

    /* JADX INFO: renamed from: O */
    @Nullable
    private C1581g f9251O;

    /* JADX INFO: renamed from: P */
    private C1764u f9252P;

    /* JADX INFO: renamed from: Q */
    private int f9253Q;

    /* JADX INFO: renamed from: R */
    private int f9254R;

    /* JADX INFO: renamed from: S */
    private long f9255S;

    /* JADX INFO: renamed from: x */
    private final InterfaceC1768y[] f9256x;

    /* JADX INFO: renamed from: y */
    private final AbstractC1666h f9257y;

    /* JADX INFO: renamed from: z */
    private final C1667i f9258z;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final C1764u f9260a;

        /* JADX INFO: renamed from: b */
        private final Set<InterfaceC1766w.c> f9261b;

        /* JADX INFO: renamed from: c */
        private final AbstractC1666h f9262c;

        /* JADX INFO: renamed from: d */
        private final boolean f9263d;

        /* JADX INFO: renamed from: e */
        private final int f9264e;

        /* JADX INFO: renamed from: f */
        private final int f9265f;

        /* JADX INFO: renamed from: g */
        private final boolean f9266g;

        /* JADX INFO: renamed from: h */
        private final boolean f9267h;

        /* JADX INFO: renamed from: i */
        private final boolean f9268i;

        /* JADX INFO: renamed from: j */
        private final boolean f9269j;

        /* JADX INFO: renamed from: k */
        private final boolean f9270k;

        /* JADX INFO: renamed from: l */
        private final boolean f9271l;

        public a(C1764u c1764u, C1764u c1764u2, Set<InterfaceC1766w.c> set, AbstractC1666h abstractC1666h, boolean z, int i, int i2, boolean z3, boolean z4, boolean z5) {
            this.f9260a = c1764u;
            this.f9261b = set;
            this.f9262c = abstractC1666h;
            this.f9263d = z;
            this.f9264e = i;
            this.f9265f = i2;
            this.f9266g = z3;
            this.f9267h = z4;
            this.f9268i = z5 || c1764u2.f10063f != c1764u.f10063f;
            this.f9269j = (c1764u2.f10058a == c1764u.f10058a && c1764u2.f10059b == c1764u.f10059b) ? false : true;
            this.f9270k = c1764u2.f10064g != c1764u.f10064g;
            this.f9271l = c1764u2.f10066i != c1764u.f10066i;
        }

        /* JADX INFO: renamed from: a */
        public final void m7701a() {
            if (this.f9269j || this.f9265f == 0) {
                for (InterfaceC1766w.c cVar : this.f9261b) {
                    C1764u c1764u = this.f9260a;
                    cVar.onTimelineChanged(c1764u.f10058a, c1764u.f10059b, this.f9265f);
                }
            }
            if (this.f9263d) {
                Iterator<InterfaceC1766w.c> it = this.f9261b.iterator();
                while (it.hasNext()) {
                    it.next().onPositionDiscontinuity(this.f9264e);
                }
            }
            if (this.f9271l) {
                this.f9262c.mo7674a(this.f9260a.f10066i.f9235d);
                for (InterfaceC1766w.c cVar2 : this.f9261b) {
                    C1764u c1764u2 = this.f9260a;
                    cVar2.onTracksChanged(c1764u2.f10065h, c1764u2.f10066i.f9234c);
                }
            }
            if (this.f9270k) {
                Iterator<InterfaceC1766w.c> it2 = this.f9261b.iterator();
                while (it2.hasNext()) {
                    it2.next().onLoadingChanged(this.f9260a.f10064g);
                }
            }
            if (this.f9268i) {
                Iterator<InterfaceC1766w.c> it3 = this.f9261b.iterator();
                while (it3.hasNext()) {
                    it3.next().onPlayerStateChanged(this.f9267h, this.f9260a.f10063f);
                }
            }
            if (this.f9266g) {
                Iterator<InterfaceC1766w.c> it4 = this.f9261b.iterator();
                while (it4.hasNext()) {
                    it4.next().onSeekProcessed();
                }
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public C1668j(InterfaceC1768y[] interfaceC1768yArr, AbstractC1666h abstractC1666h, InterfaceC1756p interfaceC1756p, InterfaceC1720c interfaceC1720c) {
        Log.i(f9236w, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.8.4] [" + C1717af.f9631e + "]");
        C1711a.m8012b(interfaceC1768yArr.length > 0);
        this.f9256x = (InterfaceC1768y[]) C1711a.m8005a(interfaceC1768yArr);
        this.f9257y = (AbstractC1666h) C1711a.m8005a(abstractC1666h);
        this.f9244H = false;
        this.f9245I = 0;
        this.f9246J = false;
        this.f9240D = new CopyOnWriteArraySet<>();
        C1667i c1667i = new C1667i(new C1495aa[interfaceC1768yArr.length], new InterfaceC1664f[interfaceC1768yArr.length], null);
        this.f9258z = c1667i;
        this.f9241E = new AbstractC1499ae.b();
        this.f9242F = new AbstractC1499ae.a();
        this.f9250N = C1765v.f10069a;
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()) { // from class: com.anythink.expressad.exoplayer.j.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1668j.this.m7700a(message);
            }
        };
        this.f9237A = handler;
        this.f9252P = new C1764u(AbstractC1499ae.f7359a, 0L, C1621af.f8753a, c1667i);
        this.f9243G = new ArrayDeque<>();
        C1710k c1710k = new C1710k(interfaceC1768yArr, abstractC1666h, c1667i, interfaceC1756p, this.f9244H, this.f9245I, this.f9246J, handler, this, interfaceC1720c);
        this.f9238B = c1710k;
        this.f9239C = new Handler(c1710k.m7991b());
    }

    /* JADX INFO: renamed from: H */
    private boolean m7695H() {
        return this.f9252P.f10058a.m6365a() || this.f9247K > 0;
    }

    /* JADX INFO: renamed from: a */
    private C1764u m7696a(boolean z, boolean z3, int i) {
        long jMo6347t;
        if (z) {
            this.f9253Q = 0;
            this.f9254R = 0;
            jMo6347t = 0;
        } else {
            this.f9253Q = mo6343p();
            this.f9254R = mo6342o();
            jMo6347t = mo6347t();
        }
        this.f9255S = jMo6347t;
        AbstractC1499ae abstractC1499ae = z3 ? AbstractC1499ae.f7359a : this.f9252P.f10058a;
        Object obj = z3 ? null : this.f9252P.f10059b;
        C1764u c1764u = this.f9252P;
        return new C1764u(abstractC1499ae, obj, c1764u.f10060c, c1764u.f10061d, c1764u.f10062e, i, false, z3 ? C1621af.f8753a : c1764u.f10065h, z3 ? this.f9258z : c1764u.f10066i);
    }

    /* JADX INFO: renamed from: a */
    private void m7697a(C1764u c1764u, int i, boolean z, int i2) {
        int i3 = this.f9247K - i;
        this.f9247K = i3;
        if (i3 == 0) {
            if (c1764u.f10061d == C1500b.f7455b) {
                c1764u = c1764u.m8503a(c1764u.f10060c, 0L, c1764u.f10062e);
            }
            C1764u c1764u2 = c1764u;
            if ((!this.f9252P.f10058a.m6365a() || this.f9248L) && c1764u2.f10058a.m6365a()) {
                this.f9254R = 0;
                this.f9253Q = 0;
                this.f9255S = 0L;
            }
            int i4 = this.f9248L ? 0 : 2;
            boolean z3 = this.f9249M;
            this.f9248L = false;
            this.f9249M = false;
            m7698a(c1764u2, z, i2, i4, z3, false);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7698a(C1764u c1764u, boolean z, int i, int i2, boolean z3, boolean z4) {
        boolean z5 = !this.f9243G.isEmpty();
        this.f9243G.addLast(new a(c1764u, this.f9252P, this.f9240D, this.f9257y, z, i, i2, z3, this.f9244H, z4));
        this.f9252P = c1764u;
        if (z5) {
            return;
        }
        while (!this.f9243G.isEmpty()) {
            this.f9243G.peekFirst().m7701a();
            this.f9243G.removeFirst();
        }
    }

    /* JADX INFO: renamed from: b */
    private long m7699b(long j) {
        long jM6396a = C1500b.m6396a(j);
        if (this.f9252P.f10060c.m7464a()) {
            return jM6396a;
        }
        C1764u c1764u = this.f9252P;
        c1764u.f10058a.mo6362a(c1764u.f10060c.f9012a, this.f9242F, false);
        return jM6396a + this.f9242F.m6375a();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: A */
    public final int mo6289A() {
        if (mo6352y()) {
            return this.f9252P.f10060c.f9014c;
        }
        return -1;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: B */
    public final long mo6290B() {
        if (!mo6352y()) {
            return mo6347t();
        }
        C1764u c1764u = this.f9252P;
        c1764u.f10058a.mo6362a(c1764u.f10060c.f9012a, this.f9242F, false);
        return this.f9242F.m6375a() + C1500b.m6396a(this.f9252P.f10062e);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: C */
    public final int mo6291C() {
        return this.f9256x.length;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: D */
    public final C1621af mo6292D() {
        return this.f9252P.f10065h;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: E */
    public final C1665g mo6293E() {
        return this.f9252P.f10066i.f9234c;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: F */
    public final AbstractC1499ae mo6294F() {
        return this.f9252P.f10058a;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: G */
    public final Object mo6295G() {
        return this.f9252P.f10059b;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1610h
    /* JADX INFO: renamed from: a */
    public final Looper mo6299a() {
        return this.f9238B.m7991b();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1610h
    /* JADX INFO: renamed from: a */
    public final C1767x mo6300a(C1767x.b bVar) {
        return new C1767x(this.f9238B, bVar, this.f9252P.f10058a, mo6343p(), this.f9239C);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: a */
    public final void mo6302a(int i) {
        if (this.f9245I != i) {
            this.f9245I = i;
            this.f9238B.m7985a(i);
            Iterator<InterfaceC1766w.c> it = this.f9240D.iterator();
            while (it.hasNext()) {
                it.next().onRepeatModeChanged(i);
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: a */
    public final void mo6303a(int i, long j) {
        AbstractC1499ae abstractC1499ae = this.f9252P.f10058a;
        if (i < 0 || (!abstractC1499ae.m6365a() && i >= abstractC1499ae.mo6366b())) {
            throw new C1755o(abstractC1499ae, i, j);
        }
        this.f9249M = true;
        this.f9247K++;
        if (mo6352y()) {
            Log.w(f9236w, "seekTo ignored because an ad is playing");
            this.f9237A.obtainMessage(0, 1, -1, this.f9252P).sendToTarget();
            return;
        }
        this.f9253Q = i;
        if (abstractC1499ae.m6365a()) {
            this.f9255S = j == C1500b.f7455b ? 0L : j;
            this.f9254R = 0;
        } else {
            long jM6397b = j == C1500b.f7455b ? abstractC1499ae.m6363a(i, this.f9241E, false).f7373h : C1500b.m6397b(j);
            Pair<Integer, Long> pairM6360a = abstractC1499ae.m6360a(this.f9241E, this.f9242F, i, jM6397b);
            this.f9255S = C1500b.m6396a(jM6397b);
            this.f9254R = ((Integer) pairM6360a.first).intValue();
        }
        this.f9238B.m7987a(abstractC1499ae, i, C1500b.m6397b(j));
        Iterator<InterfaceC1766w.c> it = this.f9240D.iterator();
        while (it.hasNext()) {
            it.next().onPositionDiscontinuity(1);
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: a */
    public final void mo6304a(long j) {
        mo6303a(mo6343p(), j);
    }

    /* JADX INFO: renamed from: a */
    public final void m7700a(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                C1581g c1581g = (C1581g) message.obj;
                this.f9251O = c1581g;
                Iterator<InterfaceC1766w.c> it = this.f9240D.iterator();
                while (it.hasNext()) {
                    it.next().onPlayerError(c1581g);
                }
                return;
            }
            C1765v c1765v = (C1765v) message.obj;
            if (this.f9250N.equals(c1765v)) {
                return;
            }
            this.f9250N = c1765v;
            Iterator<InterfaceC1766w.c> it2 = this.f9240D.iterator();
            while (it2.hasNext()) {
                it2.next().onPlaybackParametersChanged(c1765v);
            }
            return;
        }
        C1764u c1764uM8503a = (C1764u) message.obj;
        int i2 = message.arg1;
        int i3 = message.arg2;
        boolean z = i3 != -1;
        int i4 = this.f9247K - i2;
        this.f9247K = i4;
        if (i4 == 0) {
            if (c1764uM8503a.f10061d == C1500b.f7455b) {
                c1764uM8503a = c1764uM8503a.m8503a(c1764uM8503a.f10060c, 0L, c1764uM8503a.f10062e);
            }
            C1764u c1764u = c1764uM8503a;
            if ((!this.f9252P.f10058a.m6365a() || this.f9248L) && c1764u.f10058a.m6365a()) {
                this.f9254R = 0;
                this.f9253Q = 0;
                this.f9255S = 0L;
            }
            int i5 = this.f9248L ? 0 : 2;
            boolean z3 = this.f9249M;
            this.f9248L = false;
            this.f9249M = false;
            m7698a(c1764u, z, i3, i5, z3, false);
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1610h
    /* JADX INFO: renamed from: a */
    public final void mo6309a(@Nullable C1497ac c1497ac) {
        if (c1497ac == null) {
            c1497ac = C1497ac.f7332e;
        }
        this.f9238B.m7986a(c1497ac);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1610h
    /* JADX INFO: renamed from: a */
    public final void mo6310a(InterfaceC1650s interfaceC1650s) {
        mo6311a(interfaceC1650s, true, true);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1610h
    /* JADX INFO: renamed from: a */
    public final void mo6311a(InterfaceC1650s interfaceC1650s, boolean z, boolean z3) {
        this.f9251O = null;
        C1764u c1764uM7696a = m7696a(z, z3, 2);
        this.f9248L = true;
        this.f9247K++;
        this.f9238B.m7988a(interfaceC1650s, z, z3);
        m7698a(c1764uM7696a, false, 4, 1, false, false);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: a */
    public final void mo6313a(@Nullable C1765v c1765v) {
        if (c1765v == null) {
            c1765v = C1765v.f10069a;
        }
        this.f9238B.m7992b(c1765v);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: a */
    public final void mo6314a(InterfaceC1766w.c cVar) {
        this.f9240D.add(cVar);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: a */
    public final void mo6315a(boolean z) {
        if (this.f9244H != z) {
            this.f9244H = z;
            this.f9238B.m7990a(z);
            m7698a(this.f9252P, false, 4, 1, false, true);
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1610h
    /* JADX INFO: renamed from: a */
    public final void mo6316a(InterfaceC1610h.c... cVarArr) {
        for (InterfaceC1610h.c cVar : cVarArr) {
            mo6300a(cVar.f8632a).m8514a(cVar.f8633b).m8515a(cVar.f8634c).m8524i();
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: b */
    public final InterfaceC1766w.g mo6317b() {
        return null;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: b */
    public final void mo6318b(int i) {
        mo6303a(i, C1500b.f7455b);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: b */
    public final void mo6324b(InterfaceC1766w.c cVar) {
        this.f9240D.remove(cVar);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: b */
    public final void mo6325b(boolean z) {
        if (this.f9246J != z) {
            this.f9246J = z;
            this.f9238B.m7993b(z);
            Iterator<InterfaceC1766w.c> it = this.f9240D.iterator();
            while (it.hasNext()) {
                it.next().onShuffleModeEnabledChanged(z);
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1610h
    /* JADX INFO: renamed from: b */
    public final void mo6326b(InterfaceC1610h.c... cVarArr) {
        ArrayList<C1767x> arrayList = new ArrayList();
        for (InterfaceC1610h.c cVar : cVarArr) {
            arrayList.add(mo6300a(cVar.f8632a).m8514a(cVar.f8633b).m8515a(cVar.f8634c).m8524i());
        }
        boolean z = false;
        for (C1767x c1767x : arrayList) {
            boolean z3 = true;
            while (z3) {
                try {
                    c1767x.m8526k();
                    z3 = false;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (TimeoutException e) {
                    e.getMessage();
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: c */
    public final int mo6327c(int i) {
        return this.f9256x[i].mo6122a();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: c */
    public final InterfaceC1766w.e mo6328c() {
        return null;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: c */
    public final void mo6329c(boolean z) {
        if (z) {
            this.f9251O = null;
        }
        C1764u c1764uM7696a = m7696a(z, z, 1);
        this.f9247K++;
        this.f9238B.m7994c(z);
        m7698a(c1764uM7696a, false, 4, 1, false, false);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: d */
    public final int mo6330d() {
        return this.f9252P.f10063f;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    @Nullable
    /* JADX INFO: renamed from: e */
    public final C1581g mo6332e() {
        return this.f9251O;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: f */
    public final boolean mo6333f() {
        return this.f9244H;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: g */
    public final int mo6334g() {
        return this.f9245I;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: h */
    public final boolean mo6335h() {
        return this.f9246J;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: i */
    public final boolean mo6336i() {
        return this.f9252P.f10064g;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: j */
    public final void mo6337j() {
        mo6318b(mo6343p());
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: k */
    public final C1765v mo6338k() {
        return this.f9250N;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    @Nullable
    /* JADX INFO: renamed from: l */
    public final Object mo6339l() {
        int iMo6343p = mo6343p();
        if (iMo6343p > this.f9252P.f10058a.mo6366b()) {
            return null;
        }
        return this.f9252P.f10058a.m6363a(iMo6343p, this.f9241E, true).f7366a;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: m */
    public final void mo6340m() {
        mo6329c(false);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: n */
    public final void mo6341n() {
        Log.i(f9236w, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.8.4] [" + C1717af.f9631e + "] [" + C1744l.m8317a() + "]");
        this.f9238B.m7984a();
        this.f9237A.removeCallbacksAndMessages(null);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: o */
    public final int mo6342o() {
        return m7695H() ? this.f9254R : this.f9252P.f10060c.f9012a;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: p */
    public final int mo6343p() {
        if (m7695H()) {
            return this.f9253Q;
        }
        C1764u c1764u = this.f9252P;
        return c1764u.f10058a.mo6362a(c1764u.f10060c.f9012a, this.f9242F, false).f7362c;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: q */
    public final int mo6344q() {
        AbstractC1499ae abstractC1499ae = this.f9252P.f10058a;
        if (abstractC1499ae.m6365a()) {
            return -1;
        }
        return abstractC1499ae.mo6356a(mo6343p(), this.f9245I, this.f9246J);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: r */
    public final int mo6345r() {
        AbstractC1499ae abstractC1499ae = this.f9252P.f10058a;
        if (abstractC1499ae.m6365a()) {
            return -1;
        }
        return abstractC1499ae.mo6367b(mo6343p(), this.f9245I, this.f9246J);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: s */
    public final long mo6346s() {
        long jM6384c;
        AbstractC1499ae abstractC1499ae = this.f9252P.f10058a;
        if (abstractC1499ae.m6365a()) {
            return C1500b.f7455b;
        }
        if (mo6352y()) {
            InterfaceC1650s.a aVar = this.f9252P.f10060c;
            abstractC1499ae.mo6362a(aVar.f9012a, this.f9242F, false);
            jM6384c = this.f9242F.m6384c(aVar.f9013b, aVar.f9014c);
        } else {
            jM6384c = abstractC1499ae.m6363a(mo6343p(), this.f9241E, false).f7374i;
        }
        return C1500b.m6396a(jM6384c);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: t */
    public final long mo6347t() {
        return m7695H() ? this.f9255S : m7699b(this.f9252P.f10067j);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: u */
    public final long mo6348u() {
        return m7695H() ? this.f9255S : m7699b(this.f9252P.f10068k);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: v */
    public final int mo6349v() {
        long jMo6348u = mo6348u();
        long jMo6346s = mo6346s();
        if (jMo6348u == C1500b.f7455b || jMo6346s == C1500b.f7455b) {
            return 0;
        }
        if (jMo6346s == 0) {
            return 100;
        }
        return C1717af.m8050a((int) ((jMo6348u * 100) / jMo6346s), 0, 100);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: w */
    public final boolean mo6350w() {
        AbstractC1499ae abstractC1499ae = this.f9252P.f10058a;
        return !abstractC1499ae.m6365a() && abstractC1499ae.m6363a(mo6343p(), this.f9241E, false).f7370e;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: x */
    public final boolean mo6351x() {
        AbstractC1499ae abstractC1499ae = this.f9252P.f10058a;
        return !abstractC1499ae.m6365a() && abstractC1499ae.m6363a(mo6343p(), this.f9241E, false).f7369d;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: y */
    public final boolean mo6352y() {
        return !m7695H() && this.f9252P.f10060c.m7464a();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: z */
    public final int mo6353z() {
        if (mo6352y()) {
            return this.f9252P.f10060c.f9013b;
        }
        return -1;
    }
}
