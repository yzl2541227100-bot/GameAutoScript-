package com.anythink.expressad.exoplayer;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.C1548e;
import com.anythink.expressad.exoplayer.C1767x;
import com.anythink.expressad.exoplayer.p101h.C1621af;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1649r;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1656y;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1657z;
import com.anythink.expressad.exoplayer.p104i.AbstractC1666h;
import com.anythink.expressad.exoplayer.p104i.C1667i;
import com.anythink.expressad.exoplayer.p104i.InterfaceC1664f;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.InterfaceC1720c;
import com.anythink.expressad.exoplayer.p107k.InterfaceC1728k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1710k implements Handler.Callback, C1548e.a, InterfaceC1649r.a, InterfaceC1650s.b, AbstractC1666h.a, C1767x.a {

    /* JADX INFO: renamed from: a */
    public static final int f9545a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f9546b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f9547c = 2;

    /* JADX INFO: renamed from: d */
    private static final String f9548d = "ExoPlayerImplInternal";

    /* JADX INFO: renamed from: e */
    private static final int f9549e = 0;

    /* JADX INFO: renamed from: f */
    private static final int f9550f = 1;

    /* JADX INFO: renamed from: g */
    private static final int f9551g = 2;

    /* JADX INFO: renamed from: h */
    private static final int f9552h = 3;

    /* JADX INFO: renamed from: i */
    private static final int f9553i = 4;

    /* JADX INFO: renamed from: j */
    private static final int f9554j = 5;

    /* JADX INFO: renamed from: k */
    private static final int f9555k = 6;

    /* JADX INFO: renamed from: l */
    private static final int f9556l = 7;

    /* JADX INFO: renamed from: m */
    private static final int f9557m = 8;

    /* JADX INFO: renamed from: n */
    private static final int f9558n = 9;

    /* JADX INFO: renamed from: o */
    private static final int f9559o = 10;

    /* JADX INFO: renamed from: p */
    private static final int f9560p = 11;

    /* JADX INFO: renamed from: q */
    private static final int f9561q = 12;

    /* JADX INFO: renamed from: r */
    private static final int f9562r = 13;

    /* JADX INFO: renamed from: s */
    private static final int f9563s = 14;

    /* JADX INFO: renamed from: t */
    private static final int f9564t = 15;

    /* JADX INFO: renamed from: u */
    private static final int f9565u = 10;

    /* JADX INFO: renamed from: v */
    private static final int f9566v = 10;

    /* JADX INFO: renamed from: w */
    private static final int f9567w = 1000;

    /* JADX INFO: renamed from: x */
    private static final long f9568x = 500;

    /* JADX INFO: renamed from: A */
    private final AbstractC1666h f9569A;

    /* JADX INFO: renamed from: B */
    private final C1667i f9570B;

    /* JADX INFO: renamed from: C */
    private final InterfaceC1756p f9571C;

    /* JADX INFO: renamed from: D */
    private final InterfaceC1728k f9572D;

    /* JADX INFO: renamed from: E */
    private final HandlerThread f9573E;

    /* JADX INFO: renamed from: F */
    private final Handler f9574F;

    /* JADX INFO: renamed from: G */
    private final InterfaceC1610h f9575G;

    /* JADX INFO: renamed from: H */
    private final AbstractC1499ae.b f9576H;

    /* JADX INFO: renamed from: I */
    private final AbstractC1499ae.a f9577I;

    /* JADX INFO: renamed from: L */
    private final C1548e f9580L;

    /* JADX INFO: renamed from: N */
    private final ArrayList<b> f9582N;

    /* JADX INFO: renamed from: O */
    private final InterfaceC1720c f9583O;

    /* JADX INFO: renamed from: R */
    private C1764u f9586R;

    /* JADX INFO: renamed from: S */
    private InterfaceC1650s f9587S;

    /* JADX INFO: renamed from: T */
    private InterfaceC1768y[] f9588T;

    /* JADX INFO: renamed from: U */
    private boolean f9589U;

    /* JADX INFO: renamed from: V */
    private boolean f9590V;

    /* JADX INFO: renamed from: W */
    private boolean f9591W;

    /* JADX INFO: renamed from: X */
    private int f9592X;

    /* JADX INFO: renamed from: Y */
    private boolean f9593Y;

    /* JADX INFO: renamed from: Z */
    private int f9594Z;

    /* JADX INFO: renamed from: aa */
    private d f9595aa;

    /* JADX INFO: renamed from: ab */
    private long f9596ab;

    /* JADX INFO: renamed from: ac */
    private int f9597ac;

    /* JADX INFO: renamed from: y */
    private final InterfaceC1768y[] f9598y;

    /* JADX INFO: renamed from: z */
    private final InterfaceC1769z[] f9599z;

    /* JADX INFO: renamed from: P */
    private final C1759s f9584P = new C1759s();

    /* JADX INFO: renamed from: J */
    private final long f9578J = 0;

    /* JADX INFO: renamed from: K */
    private final boolean f9579K = false;

    /* JADX INFO: renamed from: Q */
    private C1497ac f9585Q = C1497ac.f7332e;

    /* JADX INFO: renamed from: M */
    private final c f9581M = new c((byte) 0);

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1767x f9600a;

        public AnonymousClass1(C1767x c1767x) {
            this.f9600a = c1767x;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                C1710k.m7968f(this.f9600a);
            } catch (C1581g e) {
                Log.e(C1710k.f9548d, "Unexpected error delivering message on external thread.", e);
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1650s f9602a;

        /* JADX INFO: renamed from: b */
        public final AbstractC1499ae f9603b;

        /* JADX INFO: renamed from: c */
        public final Object f9604c;

        public a(InterfaceC1650s interfaceC1650s, AbstractC1499ae abstractC1499ae, Object obj) {
            this.f9602a = interfaceC1650s;
            this.f9603b = abstractC1499ae;
            this.f9604c = obj;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k$b */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a */
        public final C1767x f9605a;

        /* JADX INFO: renamed from: b */
        public int f9606b;

        /* JADX INFO: renamed from: c */
        public long f9607c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Object f9608d;

        public b(C1767x c1767x) {
            this.f9605a = c1767x;
        }

        /* JADX INFO: renamed from: a */
        private int m7995a(@NonNull b bVar) {
            Object obj = this.f9608d;
            if ((obj == null) != (bVar.f9608d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f9606b - bVar.f9606b;
            return i != 0 ? i : C1717af.m8093b(this.f9607c, bVar.f9607c);
        }

        /* JADX INFO: renamed from: a */
        public final void m7996a(int i, long j, Object obj) {
            this.f9606b = i;
            this.f9607c = j;
            this.f9608d = obj;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(@NonNull b bVar) {
            b bVar2 = bVar;
            Object obj = this.f9608d;
            if ((obj == null) != (bVar2.f9608d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f9606b - bVar2.f9606b;
            return i != 0 ? i : C1717af.m8093b(this.f9607c, bVar2.f9607c);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private C1764u f9609a;

        /* JADX INFO: renamed from: b */
        private int f9610b;

        /* JADX INFO: renamed from: c */
        private boolean f9611c;

        /* JADX INFO: renamed from: d */
        private int f9612d;

        private c() {
        }

        public /* synthetic */ c(byte b) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m8000a(int i) {
            this.f9610b += i;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m8001a(C1764u c1764u) {
            return c1764u != this.f9609a || this.f9610b > 0 || this.f9611c;
        }

        /* JADX INFO: renamed from: b */
        public final void m8002b(int i) {
            if (this.f9611c && this.f9612d != 4) {
                C1711a.m8010a(i == 4);
            } else {
                this.f9611c = true;
                this.f9612d = i;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m8003b(C1764u c1764u) {
            this.f9609a = c1764u;
            this.f9610b = 0;
            this.f9611c = false;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final AbstractC1499ae f9613a;

        /* JADX INFO: renamed from: b */
        public final int f9614b;

        /* JADX INFO: renamed from: c */
        public final long f9615c;

        public d(AbstractC1499ae abstractC1499ae, int i, long j) {
            this.f9613a = abstractC1499ae;
            this.f9614b = i;
            this.f9615c = j;
        }
    }

    public C1710k(InterfaceC1768y[] interfaceC1768yArr, AbstractC1666h abstractC1666h, C1667i c1667i, InterfaceC1756p interfaceC1756p, boolean z, int i, boolean z3, Handler handler, InterfaceC1610h interfaceC1610h, InterfaceC1720c interfaceC1720c) {
        this.f9598y = interfaceC1768yArr;
        this.f9569A = abstractC1666h;
        this.f9570B = c1667i;
        this.f9571C = interfaceC1756p;
        this.f9590V = z;
        this.f9592X = i;
        this.f9593Y = z3;
        this.f9574F = handler;
        this.f9575G = interfaceC1610h;
        this.f9583O = interfaceC1720c;
        this.f9586R = new C1764u(AbstractC1499ae.f7359a, C1500b.f7455b, C1621af.f8753a, c1667i);
        this.f9599z = new InterfaceC1769z[interfaceC1768yArr.length];
        for (int i2 = 0; i2 < interfaceC1768yArr.length; i2++) {
            interfaceC1768yArr[i2].mo6124a(i2);
            this.f9599z[i2] = interfaceC1768yArr[i2].mo6134b();
        }
        this.f9580L = new C1548e(this, interfaceC1720c);
        this.f9582N = new ArrayList<>();
        this.f9588T = new InterfaceC1768y[0];
        this.f9576H = new AbstractC1499ae.b();
        this.f9577I = new AbstractC1499ae.a();
        abstractC1666h.m7689a((AbstractC1666h.a) this);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f9573E = handlerThread;
        handlerThread.start();
        this.f9572D = interfaceC1720c.mo8015a(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: a */
    private int m7928a(int i, AbstractC1499ae abstractC1499ae, AbstractC1499ae abstractC1499ae2) {
        int iMo6370c = abstractC1499ae.mo6370c();
        int iM6357a = i;
        int iMo6358a = -1;
        for (int i2 = 0; i2 < iMo6370c && iMo6358a == -1; i2++) {
            iM6357a = abstractC1499ae.m6357a(iM6357a, this.f9577I, this.f9576H, this.f9592X, this.f9593Y);
            if (iM6357a == -1) {
                break;
            }
            iMo6358a = abstractC1499ae2.mo6358a(abstractC1499ae.mo6362a(iM6357a, this.f9577I, true).f7361b);
        }
        return iMo6358a;
    }

    /* JADX INFO: renamed from: a */
    private long m7929a(InterfaceC1650s.a aVar, long j) {
        return m7930a(aVar, j, this.f9584P.m8466c() != this.f9584P.m8467d());
    }

    /* JADX INFO: renamed from: a */
    private long m7930a(InterfaceC1650s.a aVar, long j, boolean z) throws C1581g {
        m7967f();
        this.f9591W = false;
        m7948b(2);
        C1757q c1757qM8466c = this.f9584P.m8466c();
        C1757q c1757qM8471h = c1757qM8466c;
        while (true) {
            if (c1757qM8471h == null) {
                break;
            }
            if (m7945a(aVar, j, c1757qM8471h)) {
                this.f9584P.m8462a(c1757qM8471h);
                break;
            }
            c1757qM8471h = this.f9584P.m8471h();
        }
        if (c1757qM8466c != c1757qM8471h || z) {
            for (InterfaceC1768y interfaceC1768y : this.f9588T) {
                m7954b(interfaceC1768y);
            }
            this.f9588T = new InterfaceC1768y[0];
            c1757qM8466c = null;
        }
        if (c1757qM8471h != null) {
            m7940a(c1757qM8466c);
            if (c1757qM8471h.f10001g) {
                long jMo7269b = c1757qM8471h.f9995a.mo7269b(j);
                c1757qM8471h.f9995a.mo7264a(jMo7269b - this.f9578J, this.f9579K);
                j = jMo7269b;
            }
            m7935a(j);
            m7983r();
        } else {
            this.f9584P.m8465b(true);
            m7935a(j);
        }
        this.f9572D.mo8028b(2);
        return j;
    }

    /* JADX INFO: renamed from: a */
    private Pair<Integer, Long> m7931a(AbstractC1499ae abstractC1499ae, int i) {
        return abstractC1499ae.m6360a(this.f9576H, this.f9577I, i, C1500b.f7455b);
    }

    /* JADX INFO: renamed from: a */
    private Pair<Integer, Long> m7932a(d dVar, boolean z) {
        int iM7928a;
        AbstractC1499ae abstractC1499ae = this.f9586R.f10058a;
        AbstractC1499ae abstractC1499ae2 = dVar.f9613a;
        if (abstractC1499ae.m6365a()) {
            return null;
        }
        if (abstractC1499ae2.m6365a()) {
            abstractC1499ae2 = abstractC1499ae;
        }
        try {
            Pair<Integer, Long> pairM6360a = abstractC1499ae2.m6360a(this.f9576H, this.f9577I, dVar.f9614b, dVar.f9615c);
            if (abstractC1499ae == abstractC1499ae2) {
                return pairM6360a;
            }
            int iMo6358a = abstractC1499ae.mo6358a(abstractC1499ae2.mo6362a(((Integer) pairM6360a.first).intValue(), this.f9577I, true).f7361b);
            if (iMo6358a != -1) {
                return Pair.create(Integer.valueOf(iMo6358a), (Long) pairM6360a.second);
            }
            if (!z || (iM7928a = m7928a(((Integer) pairM6360a.first).intValue(), abstractC1499ae2, abstractC1499ae)) == -1) {
                return null;
            }
            return m7931a(abstractC1499ae, abstractC1499ae.mo6362a(iM7928a, this.f9577I, false).f7362c);
        } catch (IndexOutOfBoundsException unused) {
            throw new C1755o(abstractC1499ae, dVar.f9614b, dVar.f9615c);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7933a(float f) {
        for (C1757q c1757qM8468e = this.f9584P.m8468e(); c1757qM8468e != null; c1757qM8468e = c1757qM8468e.f10003i) {
            C1667i c1667i = c1757qM8468e.f10005k;
            if (c1667i != null) {
                for (InterfaceC1664f interfaceC1664f : c1667i.f9234c.m7688a()) {
                    if (interfaceC1664f != null) {
                        interfaceC1664f.mo7570a(f);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7934a(int i, boolean z, int i2) throws C1581g {
        C1757q c1757qM8466c = this.f9584P.m8466c();
        InterfaceC1768y interfaceC1768y = this.f9598y[i];
        this.f9588T[i2] = interfaceC1768y;
        if (interfaceC1768y.mo6132a_() == 0) {
            C1667i c1667i = c1757qM8466c.f10005k;
            C1495aa c1495aa = c1667i.f9233b[i];
            C1753m[] c1753mArrM7947a = m7947a(c1667i.f9234c.m7687a(i));
            boolean z3 = this.f9590V && this.f9586R.f10063f == 3;
            interfaceC1768y.mo6128a(c1495aa, c1753mArrM7947a, c1757qM8466c.f9997c[i], this.f9596ab, !z && z3, c1757qM8466c.f9999e);
            this.f9580L.m6814a(interfaceC1768y);
            if (z3) {
                interfaceC1768y.mo6135b_();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7935a(long j) {
        if (this.f9584P.m8469f()) {
            j += this.f9584P.m8466c().f9999e;
        }
        this.f9596ab = j;
        this.f9580L.m6813a(j);
        for (InterfaceC1768y interfaceC1768y : this.f9588T) {
            interfaceC1768y.mo6126a(this.f9596ab);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7936a(long j, long j2) {
        this.f9572D.mo8027b();
        this.f9572D.mo8024a(j + j2);
    }

    /* JADX INFO: renamed from: a */
    private void m7937a(C1667i c1667i) {
        this.f9571C.mo6687a(this.f9598y, c1667i.f9234c);
    }

    /* JADX INFO: renamed from: a */
    private void m7938a(a aVar) throws C1581g {
        C1764u c1764uM8503a;
        long jLongValue;
        InterfaceC1650s.a aVarM8453a;
        long jM7929a;
        C1764u c1764u;
        if (aVar.f9602a != this.f9587S) {
            return;
        }
        AbstractC1499ae abstractC1499ae = this.f9586R.f10058a;
        AbstractC1499ae abstractC1499ae2 = aVar.f9603b;
        Object obj = aVar.f9604c;
        this.f9584P.m8457a(abstractC1499ae2);
        this.f9586R = this.f9586R.m8501a(abstractC1499ae2, obj);
        for (int size = this.f9582N.size() - 1; size >= 0; size--) {
            if (!m7946a(this.f9582N.get(size))) {
                this.f9582N.get(size).f9605a.m8516a(false);
                this.f9582N.remove(size);
            }
        }
        Collections.sort(this.f9582N);
        int i = this.f9594Z;
        if (i > 0) {
            this.f9581M.m8000a(i);
            this.f9594Z = 0;
            d dVar = this.f9595aa;
            if (dVar == null) {
                if (this.f9586R.f10061d == C1500b.f7455b) {
                    if (abstractC1499ae2.m6365a()) {
                        m7980o();
                        return;
                    }
                    Pair<Integer, Long> pairM7931a = m7931a(abstractC1499ae2, abstractC1499ae2.mo6368b(this.f9593Y));
                    int iIntValue = ((Integer) pairM7931a.first).intValue();
                    long jLongValue2 = ((Long) pairM7931a.second).longValue();
                    InterfaceC1650s.a aVarM8453a2 = this.f9584P.m8453a(iIntValue, jLongValue2);
                    this.f9586R = this.f9586R.m8503a(aVarM8453a2, aVarM8453a2.m7464a() ? 0L : jLongValue2, jLongValue2);
                    return;
                }
                return;
            }
            Pair<Integer, Long> pairM7932a = m7932a(dVar, true);
            this.f9595aa = null;
            if (pairM7932a == null) {
                m7980o();
                return;
            }
            int iIntValue2 = ((Integer) pairM7932a.first).intValue();
            jLongValue = ((Long) pairM7932a.second).longValue();
            aVarM8453a = this.f9584P.m8453a(iIntValue2, jLongValue);
            c1764u = this.f9586R;
            jM7929a = aVarM8453a.m7464a() ? 0L : jLongValue;
        } else {
            C1764u c1764u2 = this.f9586R;
            int i2 = c1764u2.f10060c.f9012a;
            long j = c1764u2.f10062e;
            if (abstractC1499ae.m6365a()) {
                if (abstractC1499ae2.m6365a()) {
                    return;
                }
                InterfaceC1650s.a aVarM8453a3 = this.f9584P.m8453a(i2, j);
                this.f9586R = this.f9586R.m8503a(aVarM8453a3, aVarM8453a3.m7464a() ? 0L : j, j);
                return;
            }
            C1757q c1757qM8468e = this.f9584P.m8468e();
            int iMo6358a = abstractC1499ae2.mo6358a(c1757qM8468e == null ? abstractC1499ae.mo6362a(i2, this.f9577I, true).f7361b : c1757qM8468e.f9996b);
            if (iMo6358a != -1) {
                if (iMo6358a != i2) {
                    this.f9586R = this.f9586R.m8500a(iMo6358a);
                }
                InterfaceC1650s.a aVar2 = this.f9586R.f10060c;
                if (aVar2.m7464a()) {
                    InterfaceC1650s.a aVarM8453a4 = this.f9584P.m8453a(iMo6358a, j);
                    if (!aVarM8453a4.equals(aVar2)) {
                        c1764uM8503a = this.f9586R.m8503a(aVarM8453a4, m7929a(aVarM8453a4, aVarM8453a4.m7464a() ? 0L : j), j);
                        this.f9586R = c1764uM8503a;
                    }
                }
                if (this.f9584P.m8461a(aVar2, this.f9596ab)) {
                    return;
                }
                m7971g(false);
                return;
            }
            int iM7928a = m7928a(i2, abstractC1499ae, abstractC1499ae2);
            if (iM7928a == -1) {
                m7980o();
                return;
            }
            Pair<Integer, Long> pairM7931a2 = m7931a(abstractC1499ae2, abstractC1499ae2.mo6362a(iM7928a, this.f9577I, false).f7362c);
            int iIntValue3 = ((Integer) pairM7931a2.first).intValue();
            jLongValue = ((Long) pairM7931a2.second).longValue();
            aVarM8453a = this.f9584P.m8453a(iIntValue3, jLongValue);
            abstractC1499ae2.mo6362a(iIntValue3, this.f9577I, true);
            if (c1757qM8468e != null) {
                Object obj2 = this.f9577I.f7361b;
                loop1: while (true) {
                    C1758r c1758rM8439a = c1757qM8468e.f10002h.m8439a();
                    while (true) {
                        c1757qM8468e.f10002h = c1758rM8439a;
                        c1757qM8468e = c1757qM8468e.f10003i;
                        if (c1757qM8468e == null) {
                            break loop1;
                        } else if (c1757qM8468e.f9996b.equals(obj2)) {
                            c1758rM8439a = this.f9584P.m8455a(c1757qM8468e.f10002h, iIntValue3);
                        }
                    }
                }
            }
            jM7929a = m7929a(aVarM8453a, aVarM8453a.m7464a() ? 0L : jLongValue);
            c1764u = this.f9586R;
        }
        c1764uM8503a = c1764u.m8503a(aVarM8453a, jM7929a, jLongValue);
        this.f9586R = c1764uM8503a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00c7 A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #0 {all -> 0x00db, blocks: (B:73:0x005d, B:75:0x0061, B:80:0x006a, B:81:0x0072, B:83:0x007c, B:87:0x0088, B:89:0x0092, B:91:0x00a2, B:97:0x00b9, B:101:0x00c3, B:102:0x00c7), top: B:113:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m7939a(com.anythink.expressad.exoplayer.C1710k.d r21) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.C1710k.m7939a(com.anythink.expressad.exoplayer.k$d):void");
    }

    /* JADX INFO: renamed from: a */
    private void m7940a(@Nullable C1757q c1757q) throws C1581g {
        C1757q c1757qM8466c = this.f9584P.m8466c();
        if (c1757qM8466c == null || c1757q == c1757qM8466c) {
            return;
        }
        boolean[] zArr = new boolean[this.f9598y.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            InterfaceC1768y[] interfaceC1768yArr = this.f9598y;
            if (i >= interfaceC1768yArr.length) {
                this.f9586R = this.f9586R.m8502a(c1757qM8466c.f10004j, c1757qM8466c.f10005k);
                m7944a(zArr, i2);
                return;
            }
            InterfaceC1768y interfaceC1768y = interfaceC1768yArr[i];
            zArr[i] = interfaceC1768y.mo6132a_() != 0;
            if (c1757qM8466c.f10005k.m7692a(i)) {
                i2++;
            }
            if (zArr[i] && (!c1757qM8466c.f10005k.m7692a(i) || (interfaceC1768y.mo6140i() && interfaceC1768y.mo6137f() == c1757q.f9997c[i]))) {
                m7954b(interfaceC1768y);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m7941a(InterfaceC1768y interfaceC1768y) {
        if (interfaceC1768y.mo6132a_() == 2) {
            interfaceC1768y.mo6142k();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7942a(boolean z, boolean z3) {
        m7943a(true, z, z);
        this.f9581M.m8000a(this.f9594Z + (z3 ? 1 : 0));
        this.f9594Z = 0;
        this.f9571C.mo6690b();
        m7948b(1);
    }

    /* JADX INFO: renamed from: a */
    private void m7943a(boolean z, boolean z3, boolean z4) {
        InterfaceC1650s interfaceC1650s;
        this.f9572D.mo8027b();
        this.f9591W = false;
        this.f9580L.m6815b();
        this.f9596ab = 0L;
        for (InterfaceC1768y interfaceC1768y : this.f9588T) {
            try {
                m7954b(interfaceC1768y);
            } catch (C1581g | RuntimeException e) {
                Log.e(f9548d, "Stop failed.", e);
            }
        }
        this.f9588T = new InterfaceC1768y[0];
        this.f9584P.m8465b(!z3);
        m7963d(false);
        if (z3) {
            this.f9595aa = null;
        }
        if (z4) {
            this.f9584P.m8457a(AbstractC1499ae.f7359a);
            Iterator<b> it = this.f9582N.iterator();
            while (it.hasNext()) {
                it.next().f9605a.m8516a(false);
            }
            this.f9582N.clear();
            this.f9597ac = 0;
        }
        AbstractC1499ae abstractC1499ae = z4 ? AbstractC1499ae.f7359a : this.f9586R.f10058a;
        Object obj = z4 ? null : this.f9586R.f10059b;
        InterfaceC1650s.a aVar = z3 ? new InterfaceC1650s.a(m7975j()) : this.f9586R.f10060c;
        long j = C1500b.f7455b;
        long j2 = z3 ? -9223372036854775807L : this.f9586R.f10067j;
        if (!z3) {
            j = this.f9586R.f10062e;
        }
        long j3 = j;
        C1764u c1764u = this.f9586R;
        this.f9586R = new C1764u(abstractC1499ae, obj, aVar, j2, j3, c1764u.f10063f, false, z4 ? C1621af.f8753a : c1764u.f10065h, z4 ? this.f9570B : c1764u.f10066i);
        if (!z || (interfaceC1650s = this.f9587S) == null) {
            return;
        }
        interfaceC1650s.mo7356a(this);
        this.f9587S = null;
    }

    /* JADX INFO: renamed from: a */
    private void m7944a(boolean[] zArr, int i) throws C1581g {
        this.f9588T = new InterfaceC1768y[i];
        C1757q c1757qM8466c = this.f9584P.m8466c();
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9598y.length; i3++) {
            if (c1757qM8466c.f10005k.m7692a(i3)) {
                m7934a(i3, zArr[i3], i2);
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m7945a(InterfaceC1650s.a aVar, long j, C1757q c1757q) {
        if (aVar.equals(c1757q.f10002h.f10010a) && c1757q.f10000f) {
            this.f9586R.f10058a.mo6362a(c1757q.f10002h.f10010a.f9012a, this.f9577I, false);
            int iM6380b = this.f9577I.m6380b(j);
            if (iM6380b == -1 || this.f9577I.m6376a(iM6380b) == c1757q.f10002h.f10012c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m7946a(b bVar) {
        Object obj = bVar.f9608d;
        if (obj == null) {
            Pair<Integer, Long> pairM7932a = m7932a(new d(bVar.f9605a.m8513a(), bVar.f9605a.m8522g(), C1500b.m6397b(bVar.f9605a.m8521f())), false);
            if (pairM7932a == null) {
                return false;
            }
            bVar.m7996a(((Integer) pairM7932a.first).intValue(), ((Long) pairM7932a.second).longValue(), this.f9586R.f10058a.mo6362a(((Integer) pairM7932a.first).intValue(), this.f9577I, true).f7361b);
        } else {
            int iMo6358a = this.f9586R.f10058a.mo6358a(obj);
            if (iMo6358a == -1) {
                return false;
            }
            bVar.f9606b = iMo6358a;
        }
        return true;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    private static C1753m[] m7947a(InterfaceC1664f interfaceC1664f) {
        int iMo7585g = interfaceC1664f != null ? interfaceC1664f.mo7585g() : 0;
        C1753m[] c1753mArr = new C1753m[iMo7585g];
        for (int i = 0; i < iMo7585g; i++) {
            c1753mArr[i] = interfaceC1664f.mo7578a(i);
        }
        return c1753mArr;
    }

    /* JADX INFO: renamed from: b */
    private void m7948b(int i) {
        C1764u c1764u = this.f9586R;
        if (c1764u.f10063f != i) {
            this.f9586R = c1764u.m8505b(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0055, code lost:
    
        if (r6.f9597ac < r6.f9582N.size()) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0057, code lost:
    
        r1 = r6.f9582N.get(r6.f9597ac);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0062, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0063, code lost:
    
        if (r1 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0067, code lost:
    
        if (r1.f9608d == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0069, code lost:
    
        r3 = r1.f9606b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006b, code lost:
    
        if (r3 < r0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006d, code lost:
    
        if (r3 != r0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0073, code lost:
    
        if (r1.f9607c > r7) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0075, code lost:
    
        r1 = r6.f9597ac + 1;
        r6.f9597ac = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0081, code lost:
    
        if (r1 >= r6.f9582N.size()) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0084, code lost:
    
        if (r1 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0088, code lost:
    
        if (r1.f9608d == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x008c, code lost:
    
        if (r1.f9606b != r0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x008e, code lost:
    
        r3 = r1.f9607c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0092, code lost:
    
        if (r3 <= r7) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0096, code lost:
    
        if (r3 > r9) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0098, code lost:
    
        m7962d(r1.f9605a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00a3, code lost:
    
        if (r1.f9605a.m8523h() != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00ab, code lost:
    
        if (r1.f9605a.m8525j() == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00ae, code lost:
    
        r6.f9597ac++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00b5, code lost:
    
        r6.f9582N.remove(r6.f9597ac);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00c4, code lost:
    
        if (r6.f9597ac >= r6.f9582N.size()) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00c6, code lost:
    
        r1 = r6.f9582N.get(r6.f9597ac);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00d1, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0034, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0063, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x004a -> B:103:0x002a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x0081 -> B:116:0x0057). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m7949b(long r7, long r9) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.C1710k.m7949b(long, long):void");
    }

    /* JADX INFO: renamed from: b */
    private void m7950b(C1497ac c1497ac) {
        this.f9585Q = c1497ac;
    }

    /* JADX INFO: renamed from: b */
    private void m7951b(InterfaceC1649r interfaceC1649r) {
        this.f9572D.mo8022a(10, interfaceC1649r).sendToTarget();
    }

    /* JADX INFO: renamed from: b */
    private void m7952b(InterfaceC1650s interfaceC1650s, boolean z, boolean z3) {
        this.f9594Z++;
        m7943a(true, z, z3);
        this.f9571C.mo6686a();
        this.f9587S = interfaceC1650s;
        m7948b(2);
        interfaceC1650s.mo7358a(this.f9575G, true, this);
        this.f9572D.mo8028b(2);
    }

    /* JADX INFO: renamed from: b */
    private void m7954b(InterfaceC1768y interfaceC1768y) {
        this.f9580L.m6816b(interfaceC1768y);
        m7941a(interfaceC1768y);
        interfaceC1768y.mo6143l();
    }

    /* JADX INFO: renamed from: c */
    private void m7955c(int i) throws C1581g {
        this.f9592X = i;
        if (this.f9584P.m8459a(i)) {
            return;
        }
        m7971g(true);
    }

    /* JADX INFO: renamed from: c */
    private void m7956c(InterfaceC1649r interfaceC1649r) throws C1581g {
        if (this.f9584P.m8460a(interfaceC1649r)) {
            C1757q c1757qM8464b = this.f9584P.m8464b();
            float f = this.f9580L.mo6567e().f10070b;
            c1757qM8464b.f10000f = true;
            c1757qM8464b.f10004j = c1757qM8464b.f9995a.mo7270b();
            c1757qM8464b.m8434a(f);
            long jM8436b = c1757qM8464b.m8436b(c1757qM8464b.f10002h.f10011b);
            long j = c1757qM8464b.f9999e;
            C1758r c1758r = c1757qM8464b.f10002h;
            c1757qM8464b.f9999e = j + (c1758r.f10011b - jM8436b);
            c1757qM8464b.f10002h = new C1758r(c1758r.f10010a, jM8436b, c1758r.f10012c, c1758r.f10013d, c1758r.f10014e, c1758r.f10015f, c1758r.f10016g);
            m7937a(c1757qM8464b.f10005k);
            if (!this.f9584P.m8469f()) {
                m7935a(this.f9584P.m8471h().f10002h.f10011b);
                m7940a((C1757q) null);
            }
            m7983r();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m7957c(C1765v c1765v) {
        this.f9580L.mo6559a(c1765v);
    }

    /* JADX INFO: renamed from: c */
    private void m7958c(C1767x c1767x) {
        if (c1767x.m8521f() == C1500b.f7455b) {
            m7962d(c1767x);
            return;
        }
        if (this.f9587S == null || this.f9594Z > 0) {
            this.f9582N.add(new b(c1767x));
            return;
        }
        b bVar = new b(c1767x);
        if (!m7946a(bVar)) {
            c1767x.m8516a(false);
        } else {
            this.f9582N.add(bVar);
            Collections.sort(this.f9582N);
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m7959c(InterfaceC1768y interfaceC1768y) {
        C1757q c1757q = this.f9584P.m8467d().f10003i;
        return c1757q != null && c1757q.f10000f && interfaceC1768y.mo6138g();
    }

    /* JADX INFO: renamed from: d */
    private void m7960d() {
        if (this.f9581M.m8001a(this.f9586R)) {
            this.f9574F.obtainMessage(0, this.f9581M.f9610b, this.f9581M.f9611c ? this.f9581M.f9612d : -1, this.f9586R).sendToTarget();
            this.f9581M.m8003b(this.f9586R);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m7961d(InterfaceC1649r interfaceC1649r) {
        if (this.f9584P.m8460a(interfaceC1649r)) {
            this.f9584P.m8456a(this.f9596ab);
            m7983r();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m7962d(C1767x c1767x) {
        if (c1767x.m8520e().getLooper() != this.f9572D.mo8018a()) {
            this.f9572D.mo8022a(15, c1767x).sendToTarget();
            return;
        }
        m7968f(c1767x);
        int i = this.f9586R.f10063f;
        if (i == 3 || i == 2) {
            this.f9572D.mo8028b(2);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m7963d(boolean z) {
        C1764u c1764u = this.f9586R;
        if (c1764u.f10064g != z) {
            this.f9586R = c1764u.m8504a(z);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m7964e() {
        this.f9591W = false;
        this.f9580L.m6812a();
        for (InterfaceC1768y interfaceC1768y : this.f9588T) {
            interfaceC1768y.mo6135b_();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m7965e(C1767x c1767x) {
        c1767x.m8520e().post(new AnonymousClass1(c1767x));
    }

    /* JADX INFO: renamed from: e */
    private void m7966e(boolean z) {
        this.f9591W = false;
        this.f9590V = z;
        if (!z) {
            m7967f();
            m7970g();
            return;
        }
        int i = this.f9586R.f10063f;
        if (i == 3) {
            m7964e();
            this.f9572D.mo8028b(2);
        } else if (i == 2) {
            this.f9572D.mo8028b(2);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m7967f() {
        this.f9580L.m6815b();
        for (InterfaceC1768y interfaceC1768y : this.f9588T) {
            m7941a(interfaceC1768y);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m7968f(C1767x c1767x) {
        if (c1767x.m8525j()) {
            return;
        }
        try {
            c1767x.m8517b().mo6125a(c1767x.m8518c(), c1767x.m8519d());
        } finally {
            c1767x.m8516a(true);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m7969f(boolean z) throws C1581g {
        this.f9593Y = z;
        if (this.f9584P.m8463a(z)) {
            return;
        }
        m7971g(true);
    }

    /* JADX INFO: renamed from: g */
    private void m7970g() {
        if (this.f9584P.m8469f()) {
            C1757q c1757qM8466c = this.f9584P.m8466c();
            long jMo7271c = c1757qM8466c.f9995a.mo7271c();
            if (jMo7271c != C1500b.f7455b) {
                m7935a(jMo7271c);
                if (jMo7271c != this.f9586R.f10067j) {
                    C1764u c1764u = this.f9586R;
                    this.f9586R = c1764u.m8503a(c1764u.f10060c, jMo7271c, c1764u.f10062e);
                    this.f9581M.m8002b(4);
                }
            } else {
                long jM6817c = this.f9580L.m6817c();
                this.f9596ab = jM6817c;
                long j = jM6817c - c1757qM8466c.f9999e;
                m7949b(this.f9586R.f10067j, j);
                this.f9586R.f10067j = j;
            }
            this.f9586R.f10068k = this.f9588T.length == 0 ? c1757qM8466c.f10002h.f10014e : c1757qM8466c.m8431a(true);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m7971g(boolean z) throws C1581g {
        InterfaceC1650s.a aVar = this.f9584P.m8466c().f10002h.f10010a;
        long jM7930a = m7930a(aVar, this.f9586R.f10067j, true);
        if (jM7930a != this.f9586R.f10067j) {
            C1764u c1764u = this.f9586R;
            this.f9586R = c1764u.m8503a(aVar, jM7930a, c1764u.f10062e);
            if (z) {
                this.f9581M.m8002b(4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:295:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x02f5 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m7972h() throws com.anythink.expressad.exoplayer.C1581g {
        /*
            Method dump skipped, instruction units count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.C1710k.m7972h():void");
    }

    /* JADX INFO: renamed from: h */
    private boolean m7973h(boolean z) {
        if (this.f9588T.length == 0) {
            return m7978m();
        }
        if (!z) {
            return false;
        }
        if (!this.f9586R.f10064g) {
            return true;
        }
        C1757q c1757qM8464b = this.f9584P.m8464b();
        long jM8431a = c1757qM8464b.m8431a(!c1757qM8464b.f10002h.f10016g);
        return jM8431a == Long.MIN_VALUE || this.f9571C.mo6689a(jM8431a - (this.f9596ab - c1757qM8464b.f9999e), this.f9580L.mo6567e().f10070b, this.f9591W);
    }

    /* JADX INFO: renamed from: i */
    private void m7974i() {
        m7943a(true, true, true);
        this.f9571C.mo6691c();
        m7948b(1);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f9573E.quitSafely();
        } else {
            this.f9573E.quit();
        }
        synchronized (this) {
            this.f9589U = true;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: j */
    private int m7975j() {
        AbstractC1499ae abstractC1499ae = this.f9586R.f10058a;
        if (abstractC1499ae.m6365a()) {
            return 0;
        }
        return abstractC1499ae.m6363a(abstractC1499ae.mo6368b(this.f9593Y), this.f9576H, false).f7371f;
    }

    /* JADX INFO: renamed from: k */
    private void m7976k() {
        for (int size = this.f9582N.size() - 1; size >= 0; size--) {
            if (!m7946a(this.f9582N.get(size))) {
                this.f9582N.get(size).f9605a.m8516a(false);
                this.f9582N.remove(size);
            }
        }
        Collections.sort(this.f9582N);
    }

    /* JADX INFO: renamed from: l */
    private void m7977l() throws C1581g {
        if (this.f9584P.m8469f()) {
            float f = this.f9580L.mo6567e().f10070b;
            C1757q c1757qM8467d = this.f9584P.m8467d();
            boolean z = true;
            for (C1757q c1757qM8466c = this.f9584P.m8466c(); c1757qM8466c != null && c1757qM8466c.f10000f; c1757qM8466c = c1757qM8466c.f10003i) {
                if (c1757qM8466c.m8434a(f)) {
                    if (z) {
                        C1757q c1757qM8466c2 = this.f9584P.m8466c();
                        boolean zM8462a = this.f9584P.m8462a(c1757qM8466c2);
                        boolean[] zArr = new boolean[this.f9598y.length];
                        long jM8430a = c1757qM8466c2.m8430a(this.f9586R.f10067j, zM8462a, zArr);
                        m7937a(c1757qM8466c2.f10005k);
                        C1764u c1764u = this.f9586R;
                        if (c1764u.f10063f != 4 && jM8430a != c1764u.f10067j) {
                            C1764u c1764u2 = this.f9586R;
                            this.f9586R = c1764u2.m8503a(c1764u2.f10060c, jM8430a, c1764u2.f10062e);
                            this.f9581M.m8002b(4);
                            m7935a(jM8430a);
                        }
                        boolean[] zArr2 = new boolean[this.f9598y.length];
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            InterfaceC1768y[] interfaceC1768yArr = this.f9598y;
                            if (i >= interfaceC1768yArr.length) {
                                break;
                            }
                            InterfaceC1768y interfaceC1768y = interfaceC1768yArr[i];
                            zArr2[i] = interfaceC1768y.mo6132a_() != 0;
                            InterfaceC1656y interfaceC1656y = c1757qM8466c2.f9997c[i];
                            if (interfaceC1656y != null) {
                                i2++;
                            }
                            if (zArr2[i]) {
                                if (interfaceC1656y != interfaceC1768y.mo6137f()) {
                                    m7954b(interfaceC1768y);
                                } else if (zArr[i]) {
                                    interfaceC1768y.mo6126a(this.f9596ab);
                                }
                            }
                            i++;
                        }
                        this.f9586R = this.f9586R.m8502a(c1757qM8466c2.f10004j, c1757qM8466c2.f10005k);
                        m7944a(zArr2, i2);
                    } else {
                        this.f9584P.m8462a(c1757qM8466c);
                        if (c1757qM8466c.f10000f) {
                            c1757qM8466c.m8436b(Math.max(c1757qM8466c.f10002h.f10011b, this.f9596ab - c1757qM8466c.f9999e));
                            m7937a(c1757qM8466c.f10005k);
                        }
                    }
                    if (this.f9586R.f10063f != 4) {
                        m7983r();
                        m7970g();
                        this.f9572D.mo8028b(2);
                        return;
                    }
                    return;
                }
                if (c1757qM8466c == c1757qM8467d) {
                    z = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private boolean m7978m() {
        C1757q c1757qM8466c = this.f9584P.m8466c();
        long j = c1757qM8466c.f10002h.f10014e;
        if (j == C1500b.f7455b || this.f9586R.f10067j < j) {
            return true;
        }
        C1757q c1757q = c1757qM8466c.f10003i;
        if (c1757q != null) {
            return c1757q.f10000f || c1757q.f10002h.f10010a.m7464a();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    private void m7979n() {
        C1757q c1757qM8464b = this.f9584P.m8464b();
        C1757q c1757qM8467d = this.f9584P.m8467d();
        if (c1757qM8464b == null || c1757qM8464b.f10000f) {
            return;
        }
        if (c1757qM8467d == null || c1757qM8467d.f10003i == c1757qM8464b) {
            for (InterfaceC1768y interfaceC1768y : this.f9588T) {
                if (!interfaceC1768y.mo6138g()) {
                    return;
                }
            }
            c1757qM8464b.f9995a.mo7263a();
        }
    }

    /* JADX INFO: renamed from: o */
    private void m7980o() {
        m7948b(4);
        m7943a(false, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x0188  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m7981p() throws com.anythink.expressad.exoplayer.C1581g {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.C1710k.m7981p():void");
    }

    /* JADX INFO: renamed from: q */
    private void m7982q() {
        this.f9584P.m8456a(this.f9596ab);
        if (this.f9584P.m8458a()) {
            C1758r c1758rM8454a = this.f9584P.m8454a(this.f9596ab, this.f9586R);
            if (c1758rM8454a == null) {
                this.f9587S.mo7286b();
                return;
            }
            this.f9584P.m8452a(this.f9599z, this.f9569A, this.f9571C.mo6692d(), this.f9587S, this.f9586R.f10058a.mo6362a(c1758rM8454a.f10010a.f9012a, this.f9577I, true).f7361b, c1758rM8454a).mo7265a(this, c1758rM8454a.f10011b);
            m7963d(true);
        }
    }

    /* JADX INFO: renamed from: r */
    private void m7983r() {
        C1757q c1757qM8464b = this.f9584P.m8464b();
        long jM8435b = c1757qM8464b.m8435b();
        if (jM8435b == Long.MIN_VALUE) {
            m7963d(false);
            return;
        }
        boolean zMo6688a = this.f9571C.mo6688a(jM8435b - (this.f9596ab - c1757qM8464b.f9999e), this.f9580L.mo6567e().f10070b);
        m7963d(zMo6688a);
        if (zMo6688a) {
            c1757qM8464b.m8432a(this.f9596ab);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7984a() {
        if (!this.f9589U && this.f9573E.isAlive()) {
            this.f9572D.mo8028b(7);
            long jMo8014a = 500;
            long jMo8014a2 = this.f9583O.mo8014a() + 500;
            boolean z = false;
            while (!this.f9589U && jMo8014a > 0) {
                try {
                    wait(jMo8014a);
                } catch (InterruptedException unused) {
                    z = true;
                }
                jMo8014a = jMo8014a2 - this.f9583O.mo8014a();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7985a(int i) {
        this.f9572D.mo8020a(12, i).sendToTarget();
    }

    /* JADX INFO: renamed from: a */
    public final void m7986a(C1497ac c1497ac) {
        this.f9572D.mo8022a(5, c1497ac).sendToTarget();
    }

    /* JADX INFO: renamed from: a */
    public final void m7987a(AbstractC1499ae abstractC1499ae, int i, long j) {
        this.f9572D.mo8022a(3, new d(abstractC1499ae, i, j)).sendToTarget();
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r.a
    /* JADX INFO: renamed from: a */
    public final void mo7363a(InterfaceC1649r interfaceC1649r) {
        this.f9572D.mo8022a(9, interfaceC1649r).sendToTarget();
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s.b
    /* JADX INFO: renamed from: a */
    public final void mo7375a(InterfaceC1650s interfaceC1650s, AbstractC1499ae abstractC1499ae, Object obj) {
        this.f9572D.mo8022a(8, new a(interfaceC1650s, abstractC1499ae, obj)).sendToTarget();
    }

    /* JADX INFO: renamed from: a */
    public final void m7988a(InterfaceC1650s interfaceC1650s, boolean z, boolean z3) {
        this.f9572D.mo8021a(z ? 1 : 0, z3 ? 1 : 0, interfaceC1650s).sendToTarget();
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1657z.a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo7364a(InterfaceC1657z interfaceC1657z) {
        this.f9572D.mo8022a(10, (InterfaceC1649r) interfaceC1657z).sendToTarget();
    }

    @Override // com.anythink.expressad.exoplayer.C1548e.a
    /* JADX INFO: renamed from: a */
    public final void mo6818a(C1765v c1765v) {
        this.f9574F.obtainMessage(1, c1765v).sendToTarget();
        float f = c1765v.f10070b;
        for (C1757q c1757qM8468e = this.f9584P.m8468e(); c1757qM8468e != null; c1757qM8468e = c1757qM8468e.f10003i) {
            C1667i c1667i = c1757qM8468e.f10005k;
            if (c1667i != null) {
                for (InterfaceC1664f interfaceC1664f : c1667i.f9234c.m7688a()) {
                    if (interfaceC1664f != null) {
                        interfaceC1664f.mo7570a(f);
                    }
                }
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.C1767x.a
    /* JADX INFO: renamed from: a */
    public final synchronized void mo7989a(C1767x c1767x) {
        if (!this.f9589U) {
            this.f9572D.mo8022a(14, c1767x).sendToTarget();
        } else {
            Log.w(f9548d, "Ignoring messages sent after release.");
            c1767x.m8516a(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7990a(boolean z) {
        this.f9572D.mo8020a(1, z ? 1 : 0).sendToTarget();
    }

    /* JADX INFO: renamed from: b */
    public final Looper m7991b() {
        return this.f9573E.getLooper();
    }

    /* JADX INFO: renamed from: b */
    public final void m7992b(C1765v c1765v) {
        this.f9572D.mo8022a(4, c1765v).sendToTarget();
    }

    /* JADX INFO: renamed from: b */
    public final void m7993b(boolean z) {
        this.f9572D.mo8020a(13, z ? 1 : 0).sendToTarget();
    }

    @Override // com.anythink.expressad.exoplayer.p104i.AbstractC1666h.a
    /* JADX INFO: renamed from: c */
    public final void mo7691c() {
        this.f9572D.mo8028b(11);
    }

    /* JADX INFO: renamed from: c */
    public final void m7994c(boolean z) {
        this.f9572D.mo8020a(6, z ? 1 : 0).sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:949:0x07f1, code lost:
    
        if (r13 == false) goto L950;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:764:0x04de A[Catch: all -> 0x04f4, TRY_LEAVE, TryCatch #7 {all -> 0x04f4, blocks: (B:733:0x046b, B:735:0x046f, B:740:0x0479, B:741:0x0482, B:743:0x048c, B:747:0x0498, B:749:0x04a2, B:751:0x04b2, B:759:0x04cf, B:763:0x04da, B:764:0x04de), top: B:1020:0x046b }] */
    /* JADX WARN: Removed duplicated region for block: B:768:0x04f0 A[Catch: RuntimeException -> 0x08a0, IOException -> 0x08a4, g -> 0x08a9, TryCatch #12 {RuntimeException -> 0x08a0, blocks: (B:545:0x0019, B:994:0x089c, B:546:0x002b, B:548:0x0037, B:549:0x003c, B:551:0x0040, B:554:0x0045, B:556:0x0050, B:557:0x005c, B:558:0x0061, B:559:0x006d, B:563:0x0074, B:565:0x007e, B:566:0x0083, B:569:0x0090, B:571:0x0098, B:573:0x00af, B:576:0x00b5, B:580:0x00be, B:582:0x00c3, B:584:0x00e7, B:586:0x00ed, B:587:0x0104, B:588:0x010b, B:590:0x0110, B:594:0x011b, B:596:0x0123, B:597:0x0125, B:599:0x0129, B:601:0x012f, B:602:0x0133, B:604:0x0137, B:605:0x013c, B:606:0x013f, B:610:0x016d, B:612:0x0173, B:613:0x017b, B:607:0x014f, B:609:0x0158, B:614:0x0180, B:616:0x018c, B:617:0x0193, B:618:0x0198, B:620:0x01a4, B:622:0x0201, B:623:0x0212, B:625:0x021c, B:627:0x023b, B:629:0x0249, B:630:0x025c, B:631:0x025f, B:633:0x0268, B:636:0x0270, B:638:0x0274, B:640:0x027d, B:641:0x0282, B:645:0x02a3, B:646:0x02a9, B:647:0x02ad, B:649:0x02b5, B:652:0x02bc, B:656:0x02e7, B:661:0x02f4, B:663:0x0302, B:665:0x0308, B:669:0x0319, B:670:0x0320, B:672:0x0328, B:674:0x0334, B:676:0x033b, B:679:0x0343, B:681:0x036e, B:688:0x0394, B:682:0x0379, B:684:0x037d, B:686:0x0385, B:687:0x038e, B:689:0x0397, B:693:0x039f, B:695:0x03af, B:696:0x03b7, B:698:0x03c1, B:700:0x03cd, B:704:0x03d5, B:705:0x03e3, B:673:0x0332, B:710:0x03f3, B:712:0x03f8, B:716:0x03ff, B:717:0x0405, B:718:0x040d, B:719:0x0418, B:721:0x0428, B:766:0x04e2, B:768:0x04f0, B:756:0x04c9, B:752:0x04b6, B:754:0x04c6, B:770:0x04f5, B:772:0x0506, B:773:0x050c, B:723:0x0437, B:726:0x0457, B:727:0x045f, B:778:0x0517, B:780:0x0521, B:782:0x0525, B:783:0x052a, B:785:0x0539, B:787:0x0545, B:788:0x054b, B:789:0x0583, B:791:0x058b, B:794:0x0592, B:796:0x0598, B:800:0x05a0, B:802:0x05a8, B:803:0x05b5, B:806:0x05bb, B:809:0x05c7, B:810:0x05ca, B:814:0x05d3, B:815:0x0605, B:818:0x060c, B:820:0x0611, B:822:0x0619, B:824:0x061f, B:826:0x0625, B:827:0x0628, B:828:0x062b, B:830:0x062f, B:834:0x0636, B:836:0x063b, B:839:0x0649, B:842:0x0651, B:843:0x0654, B:848:0x0671, B:850:0x0676, B:853:0x0680, B:855:0x0686, B:859:0x069e, B:861:0x06a8, B:864:0x06b0, B:865:0x06be, B:866:0x06c1, B:873:0x06cf, B:875:0x06d9, B:876:0x06e1, B:878:0x070d, B:880:0x0716, B:884:0x071f, B:886:0x0725, B:888:0x072b, B:890:0x0735, B:892:0x0739, B:901:0x074a, B:906:0x0754, B:908:0x075b, B:909:0x075e, B:913:0x076d, B:915:0x0775, B:917:0x077b, B:918:0x077f, B:951:0x07fc, B:953:0x0803, B:955:0x0809, B:956:0x0811, B:958:0x0815, B:962:0x0823, B:969:0x083c, B:960:0x081c, B:963:0x0829, B:967:0x0831, B:968:0x0837, B:919:0x0784, B:921:0x078b, B:923:0x0790, B:939:0x07d2, B:941:0x07da, B:925:0x0797, B:928:0x079d, B:932:0x07ac, B:934:0x07b6, B:942:0x07de, B:944:0x07e5, B:946:0x07ea, B:950:0x07f3, B:970:0x0840, B:974:0x0847, B:976:0x084e, B:977:0x0855, B:979:0x085c, B:983:0x0867, B:985:0x086b, B:989:0x0876, B:993:0x087d), top: B:1021:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:865:0x06be A[Catch: RuntimeException -> 0x08a0, IOException -> 0x08a4, g -> 0x08a9, TryCatch #12 {RuntimeException -> 0x08a0, blocks: (B:545:0x0019, B:994:0x089c, B:546:0x002b, B:548:0x0037, B:549:0x003c, B:551:0x0040, B:554:0x0045, B:556:0x0050, B:557:0x005c, B:558:0x0061, B:559:0x006d, B:563:0x0074, B:565:0x007e, B:566:0x0083, B:569:0x0090, B:571:0x0098, B:573:0x00af, B:576:0x00b5, B:580:0x00be, B:582:0x00c3, B:584:0x00e7, B:586:0x00ed, B:587:0x0104, B:588:0x010b, B:590:0x0110, B:594:0x011b, B:596:0x0123, B:597:0x0125, B:599:0x0129, B:601:0x012f, B:602:0x0133, B:604:0x0137, B:605:0x013c, B:606:0x013f, B:610:0x016d, B:612:0x0173, B:613:0x017b, B:607:0x014f, B:609:0x0158, B:614:0x0180, B:616:0x018c, B:617:0x0193, B:618:0x0198, B:620:0x01a4, B:622:0x0201, B:623:0x0212, B:625:0x021c, B:627:0x023b, B:629:0x0249, B:630:0x025c, B:631:0x025f, B:633:0x0268, B:636:0x0270, B:638:0x0274, B:640:0x027d, B:641:0x0282, B:645:0x02a3, B:646:0x02a9, B:647:0x02ad, B:649:0x02b5, B:652:0x02bc, B:656:0x02e7, B:661:0x02f4, B:663:0x0302, B:665:0x0308, B:669:0x0319, B:670:0x0320, B:672:0x0328, B:674:0x0334, B:676:0x033b, B:679:0x0343, B:681:0x036e, B:688:0x0394, B:682:0x0379, B:684:0x037d, B:686:0x0385, B:687:0x038e, B:689:0x0397, B:693:0x039f, B:695:0x03af, B:696:0x03b7, B:698:0x03c1, B:700:0x03cd, B:704:0x03d5, B:705:0x03e3, B:673:0x0332, B:710:0x03f3, B:712:0x03f8, B:716:0x03ff, B:717:0x0405, B:718:0x040d, B:719:0x0418, B:721:0x0428, B:766:0x04e2, B:768:0x04f0, B:756:0x04c9, B:752:0x04b6, B:754:0x04c6, B:770:0x04f5, B:772:0x0506, B:773:0x050c, B:723:0x0437, B:726:0x0457, B:727:0x045f, B:778:0x0517, B:780:0x0521, B:782:0x0525, B:783:0x052a, B:785:0x0539, B:787:0x0545, B:788:0x054b, B:789:0x0583, B:791:0x058b, B:794:0x0592, B:796:0x0598, B:800:0x05a0, B:802:0x05a8, B:803:0x05b5, B:806:0x05bb, B:809:0x05c7, B:810:0x05ca, B:814:0x05d3, B:815:0x0605, B:818:0x060c, B:820:0x0611, B:822:0x0619, B:824:0x061f, B:826:0x0625, B:827:0x0628, B:828:0x062b, B:830:0x062f, B:834:0x0636, B:836:0x063b, B:839:0x0649, B:842:0x0651, B:843:0x0654, B:848:0x0671, B:850:0x0676, B:853:0x0680, B:855:0x0686, B:859:0x069e, B:861:0x06a8, B:864:0x06b0, B:865:0x06be, B:866:0x06c1, B:873:0x06cf, B:875:0x06d9, B:876:0x06e1, B:878:0x070d, B:880:0x0716, B:884:0x071f, B:886:0x0725, B:888:0x072b, B:890:0x0735, B:892:0x0739, B:901:0x074a, B:906:0x0754, B:908:0x075b, B:909:0x075e, B:913:0x076d, B:915:0x0775, B:917:0x077b, B:918:0x077f, B:951:0x07fc, B:953:0x0803, B:955:0x0809, B:956:0x0811, B:958:0x0815, B:962:0x0823, B:969:0x083c, B:960:0x081c, B:963:0x0829, B:967:0x0831, B:968:0x0837, B:919:0x0784, B:921:0x078b, B:923:0x0790, B:939:0x07d2, B:941:0x07da, B:925:0x0797, B:928:0x079d, B:932:0x07ac, B:934:0x07b6, B:942:0x07de, B:944:0x07e5, B:946:0x07ea, B:950:0x07f3, B:970:0x0840, B:974:0x0847, B:976:0x084e, B:977:0x0855, B:979:0x085c, B:983:0x0867, B:985:0x086b, B:989:0x0876, B:993:0x087d), top: B:1021:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:937:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:942:0x07de A[Catch: RuntimeException -> 0x08a0, IOException -> 0x08a4, g -> 0x08a9, TryCatch #12 {RuntimeException -> 0x08a0, blocks: (B:545:0x0019, B:994:0x089c, B:546:0x002b, B:548:0x0037, B:549:0x003c, B:551:0x0040, B:554:0x0045, B:556:0x0050, B:557:0x005c, B:558:0x0061, B:559:0x006d, B:563:0x0074, B:565:0x007e, B:566:0x0083, B:569:0x0090, B:571:0x0098, B:573:0x00af, B:576:0x00b5, B:580:0x00be, B:582:0x00c3, B:584:0x00e7, B:586:0x00ed, B:587:0x0104, B:588:0x010b, B:590:0x0110, B:594:0x011b, B:596:0x0123, B:597:0x0125, B:599:0x0129, B:601:0x012f, B:602:0x0133, B:604:0x0137, B:605:0x013c, B:606:0x013f, B:610:0x016d, B:612:0x0173, B:613:0x017b, B:607:0x014f, B:609:0x0158, B:614:0x0180, B:616:0x018c, B:617:0x0193, B:618:0x0198, B:620:0x01a4, B:622:0x0201, B:623:0x0212, B:625:0x021c, B:627:0x023b, B:629:0x0249, B:630:0x025c, B:631:0x025f, B:633:0x0268, B:636:0x0270, B:638:0x0274, B:640:0x027d, B:641:0x0282, B:645:0x02a3, B:646:0x02a9, B:647:0x02ad, B:649:0x02b5, B:652:0x02bc, B:656:0x02e7, B:661:0x02f4, B:663:0x0302, B:665:0x0308, B:669:0x0319, B:670:0x0320, B:672:0x0328, B:674:0x0334, B:676:0x033b, B:679:0x0343, B:681:0x036e, B:688:0x0394, B:682:0x0379, B:684:0x037d, B:686:0x0385, B:687:0x038e, B:689:0x0397, B:693:0x039f, B:695:0x03af, B:696:0x03b7, B:698:0x03c1, B:700:0x03cd, B:704:0x03d5, B:705:0x03e3, B:673:0x0332, B:710:0x03f3, B:712:0x03f8, B:716:0x03ff, B:717:0x0405, B:718:0x040d, B:719:0x0418, B:721:0x0428, B:766:0x04e2, B:768:0x04f0, B:756:0x04c9, B:752:0x04b6, B:754:0x04c6, B:770:0x04f5, B:772:0x0506, B:773:0x050c, B:723:0x0437, B:726:0x0457, B:727:0x045f, B:778:0x0517, B:780:0x0521, B:782:0x0525, B:783:0x052a, B:785:0x0539, B:787:0x0545, B:788:0x054b, B:789:0x0583, B:791:0x058b, B:794:0x0592, B:796:0x0598, B:800:0x05a0, B:802:0x05a8, B:803:0x05b5, B:806:0x05bb, B:809:0x05c7, B:810:0x05ca, B:814:0x05d3, B:815:0x0605, B:818:0x060c, B:820:0x0611, B:822:0x0619, B:824:0x061f, B:826:0x0625, B:827:0x0628, B:828:0x062b, B:830:0x062f, B:834:0x0636, B:836:0x063b, B:839:0x0649, B:842:0x0651, B:843:0x0654, B:848:0x0671, B:850:0x0676, B:853:0x0680, B:855:0x0686, B:859:0x069e, B:861:0x06a8, B:864:0x06b0, B:865:0x06be, B:866:0x06c1, B:873:0x06cf, B:875:0x06d9, B:876:0x06e1, B:878:0x070d, B:880:0x0716, B:884:0x071f, B:886:0x0725, B:888:0x072b, B:890:0x0735, B:892:0x0739, B:901:0x074a, B:906:0x0754, B:908:0x075b, B:909:0x075e, B:913:0x076d, B:915:0x0775, B:917:0x077b, B:918:0x077f, B:951:0x07fc, B:953:0x0803, B:955:0x0809, B:956:0x0811, B:958:0x0815, B:962:0x0823, B:969:0x083c, B:960:0x081c, B:963:0x0829, B:967:0x0831, B:968:0x0837, B:919:0x0784, B:921:0x078b, B:923:0x0790, B:939:0x07d2, B:941:0x07da, B:925:0x0797, B:928:0x079d, B:932:0x07ac, B:934:0x07b6, B:942:0x07de, B:944:0x07e5, B:946:0x07ea, B:950:0x07f3, B:970:0x0840, B:974:0x0847, B:976:0x084e, B:977:0x0855, B:979:0x085c, B:983:0x0867, B:985:0x086b, B:989:0x0876, B:993:0x087d), top: B:1021:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:953:0x0803 A[Catch: RuntimeException -> 0x08a0, IOException -> 0x08a4, g -> 0x08a9, TryCatch #12 {RuntimeException -> 0x08a0, blocks: (B:545:0x0019, B:994:0x089c, B:546:0x002b, B:548:0x0037, B:549:0x003c, B:551:0x0040, B:554:0x0045, B:556:0x0050, B:557:0x005c, B:558:0x0061, B:559:0x006d, B:563:0x0074, B:565:0x007e, B:566:0x0083, B:569:0x0090, B:571:0x0098, B:573:0x00af, B:576:0x00b5, B:580:0x00be, B:582:0x00c3, B:584:0x00e7, B:586:0x00ed, B:587:0x0104, B:588:0x010b, B:590:0x0110, B:594:0x011b, B:596:0x0123, B:597:0x0125, B:599:0x0129, B:601:0x012f, B:602:0x0133, B:604:0x0137, B:605:0x013c, B:606:0x013f, B:610:0x016d, B:612:0x0173, B:613:0x017b, B:607:0x014f, B:609:0x0158, B:614:0x0180, B:616:0x018c, B:617:0x0193, B:618:0x0198, B:620:0x01a4, B:622:0x0201, B:623:0x0212, B:625:0x021c, B:627:0x023b, B:629:0x0249, B:630:0x025c, B:631:0x025f, B:633:0x0268, B:636:0x0270, B:638:0x0274, B:640:0x027d, B:641:0x0282, B:645:0x02a3, B:646:0x02a9, B:647:0x02ad, B:649:0x02b5, B:652:0x02bc, B:656:0x02e7, B:661:0x02f4, B:663:0x0302, B:665:0x0308, B:669:0x0319, B:670:0x0320, B:672:0x0328, B:674:0x0334, B:676:0x033b, B:679:0x0343, B:681:0x036e, B:688:0x0394, B:682:0x0379, B:684:0x037d, B:686:0x0385, B:687:0x038e, B:689:0x0397, B:693:0x039f, B:695:0x03af, B:696:0x03b7, B:698:0x03c1, B:700:0x03cd, B:704:0x03d5, B:705:0x03e3, B:673:0x0332, B:710:0x03f3, B:712:0x03f8, B:716:0x03ff, B:717:0x0405, B:718:0x040d, B:719:0x0418, B:721:0x0428, B:766:0x04e2, B:768:0x04f0, B:756:0x04c9, B:752:0x04b6, B:754:0x04c6, B:770:0x04f5, B:772:0x0506, B:773:0x050c, B:723:0x0437, B:726:0x0457, B:727:0x045f, B:778:0x0517, B:780:0x0521, B:782:0x0525, B:783:0x052a, B:785:0x0539, B:787:0x0545, B:788:0x054b, B:789:0x0583, B:791:0x058b, B:794:0x0592, B:796:0x0598, B:800:0x05a0, B:802:0x05a8, B:803:0x05b5, B:806:0x05bb, B:809:0x05c7, B:810:0x05ca, B:814:0x05d3, B:815:0x0605, B:818:0x060c, B:820:0x0611, B:822:0x0619, B:824:0x061f, B:826:0x0625, B:827:0x0628, B:828:0x062b, B:830:0x062f, B:834:0x0636, B:836:0x063b, B:839:0x0649, B:842:0x0651, B:843:0x0654, B:848:0x0671, B:850:0x0676, B:853:0x0680, B:855:0x0686, B:859:0x069e, B:861:0x06a8, B:864:0x06b0, B:865:0x06be, B:866:0x06c1, B:873:0x06cf, B:875:0x06d9, B:876:0x06e1, B:878:0x070d, B:880:0x0716, B:884:0x071f, B:886:0x0725, B:888:0x072b, B:890:0x0735, B:892:0x0739, B:901:0x074a, B:906:0x0754, B:908:0x075b, B:909:0x075e, B:913:0x076d, B:915:0x0775, B:917:0x077b, B:918:0x077f, B:951:0x07fc, B:953:0x0803, B:955:0x0809, B:956:0x0811, B:958:0x0815, B:962:0x0823, B:969:0x083c, B:960:0x081c, B:963:0x0829, B:967:0x0831, B:968:0x0837, B:919:0x0784, B:921:0x078b, B:923:0x0790, B:939:0x07d2, B:941:0x07da, B:925:0x0797, B:928:0x079d, B:932:0x07ac, B:934:0x07b6, B:942:0x07de, B:944:0x07e5, B:946:0x07ea, B:950:0x07f3, B:970:0x0840, B:974:0x0847, B:976:0x084e, B:977:0x0855, B:979:0x085c, B:983:0x0867, B:985:0x086b, B:989:0x0876, B:993:0x087d), top: B:1021:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:958:0x0815 A[Catch: RuntimeException -> 0x08a0, IOException -> 0x08a4, g -> 0x08a9, TryCatch #12 {RuntimeException -> 0x08a0, blocks: (B:545:0x0019, B:994:0x089c, B:546:0x002b, B:548:0x0037, B:549:0x003c, B:551:0x0040, B:554:0x0045, B:556:0x0050, B:557:0x005c, B:558:0x0061, B:559:0x006d, B:563:0x0074, B:565:0x007e, B:566:0x0083, B:569:0x0090, B:571:0x0098, B:573:0x00af, B:576:0x00b5, B:580:0x00be, B:582:0x00c3, B:584:0x00e7, B:586:0x00ed, B:587:0x0104, B:588:0x010b, B:590:0x0110, B:594:0x011b, B:596:0x0123, B:597:0x0125, B:599:0x0129, B:601:0x012f, B:602:0x0133, B:604:0x0137, B:605:0x013c, B:606:0x013f, B:610:0x016d, B:612:0x0173, B:613:0x017b, B:607:0x014f, B:609:0x0158, B:614:0x0180, B:616:0x018c, B:617:0x0193, B:618:0x0198, B:620:0x01a4, B:622:0x0201, B:623:0x0212, B:625:0x021c, B:627:0x023b, B:629:0x0249, B:630:0x025c, B:631:0x025f, B:633:0x0268, B:636:0x0270, B:638:0x0274, B:640:0x027d, B:641:0x0282, B:645:0x02a3, B:646:0x02a9, B:647:0x02ad, B:649:0x02b5, B:652:0x02bc, B:656:0x02e7, B:661:0x02f4, B:663:0x0302, B:665:0x0308, B:669:0x0319, B:670:0x0320, B:672:0x0328, B:674:0x0334, B:676:0x033b, B:679:0x0343, B:681:0x036e, B:688:0x0394, B:682:0x0379, B:684:0x037d, B:686:0x0385, B:687:0x038e, B:689:0x0397, B:693:0x039f, B:695:0x03af, B:696:0x03b7, B:698:0x03c1, B:700:0x03cd, B:704:0x03d5, B:705:0x03e3, B:673:0x0332, B:710:0x03f3, B:712:0x03f8, B:716:0x03ff, B:717:0x0405, B:718:0x040d, B:719:0x0418, B:721:0x0428, B:766:0x04e2, B:768:0x04f0, B:756:0x04c9, B:752:0x04b6, B:754:0x04c6, B:770:0x04f5, B:772:0x0506, B:773:0x050c, B:723:0x0437, B:726:0x0457, B:727:0x045f, B:778:0x0517, B:780:0x0521, B:782:0x0525, B:783:0x052a, B:785:0x0539, B:787:0x0545, B:788:0x054b, B:789:0x0583, B:791:0x058b, B:794:0x0592, B:796:0x0598, B:800:0x05a0, B:802:0x05a8, B:803:0x05b5, B:806:0x05bb, B:809:0x05c7, B:810:0x05ca, B:814:0x05d3, B:815:0x0605, B:818:0x060c, B:820:0x0611, B:822:0x0619, B:824:0x061f, B:826:0x0625, B:827:0x0628, B:828:0x062b, B:830:0x062f, B:834:0x0636, B:836:0x063b, B:839:0x0649, B:842:0x0651, B:843:0x0654, B:848:0x0671, B:850:0x0676, B:853:0x0680, B:855:0x0686, B:859:0x069e, B:861:0x06a8, B:864:0x06b0, B:865:0x06be, B:866:0x06c1, B:873:0x06cf, B:875:0x06d9, B:876:0x06e1, B:878:0x070d, B:880:0x0716, B:884:0x071f, B:886:0x0725, B:888:0x072b, B:890:0x0735, B:892:0x0739, B:901:0x074a, B:906:0x0754, B:908:0x075b, B:909:0x075e, B:913:0x076d, B:915:0x0775, B:917:0x077b, B:918:0x077f, B:951:0x07fc, B:953:0x0803, B:955:0x0809, B:956:0x0811, B:958:0x0815, B:962:0x0823, B:969:0x083c, B:960:0x081c, B:963:0x0829, B:967:0x0831, B:968:0x0837, B:919:0x0784, B:921:0x078b, B:923:0x0790, B:939:0x07d2, B:941:0x07da, B:925:0x0797, B:928:0x079d, B:932:0x07ac, B:934:0x07b6, B:942:0x07de, B:944:0x07e5, B:946:0x07ea, B:950:0x07f3, B:970:0x0840, B:974:0x0847, B:976:0x084e, B:977:0x0855, B:979:0x085c, B:983:0x0867, B:985:0x086b, B:989:0x0876, B:993:0x087d), top: B:1021:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:960:0x081c A[Catch: RuntimeException -> 0x08a0, IOException -> 0x08a4, g -> 0x08a9, TryCatch #12 {RuntimeException -> 0x08a0, blocks: (B:545:0x0019, B:994:0x089c, B:546:0x002b, B:548:0x0037, B:549:0x003c, B:551:0x0040, B:554:0x0045, B:556:0x0050, B:557:0x005c, B:558:0x0061, B:559:0x006d, B:563:0x0074, B:565:0x007e, B:566:0x0083, B:569:0x0090, B:571:0x0098, B:573:0x00af, B:576:0x00b5, B:580:0x00be, B:582:0x00c3, B:584:0x00e7, B:586:0x00ed, B:587:0x0104, B:588:0x010b, B:590:0x0110, B:594:0x011b, B:596:0x0123, B:597:0x0125, B:599:0x0129, B:601:0x012f, B:602:0x0133, B:604:0x0137, B:605:0x013c, B:606:0x013f, B:610:0x016d, B:612:0x0173, B:613:0x017b, B:607:0x014f, B:609:0x0158, B:614:0x0180, B:616:0x018c, B:617:0x0193, B:618:0x0198, B:620:0x01a4, B:622:0x0201, B:623:0x0212, B:625:0x021c, B:627:0x023b, B:629:0x0249, B:630:0x025c, B:631:0x025f, B:633:0x0268, B:636:0x0270, B:638:0x0274, B:640:0x027d, B:641:0x0282, B:645:0x02a3, B:646:0x02a9, B:647:0x02ad, B:649:0x02b5, B:652:0x02bc, B:656:0x02e7, B:661:0x02f4, B:663:0x0302, B:665:0x0308, B:669:0x0319, B:670:0x0320, B:672:0x0328, B:674:0x0334, B:676:0x033b, B:679:0x0343, B:681:0x036e, B:688:0x0394, B:682:0x0379, B:684:0x037d, B:686:0x0385, B:687:0x038e, B:689:0x0397, B:693:0x039f, B:695:0x03af, B:696:0x03b7, B:698:0x03c1, B:700:0x03cd, B:704:0x03d5, B:705:0x03e3, B:673:0x0332, B:710:0x03f3, B:712:0x03f8, B:716:0x03ff, B:717:0x0405, B:718:0x040d, B:719:0x0418, B:721:0x0428, B:766:0x04e2, B:768:0x04f0, B:756:0x04c9, B:752:0x04b6, B:754:0x04c6, B:770:0x04f5, B:772:0x0506, B:773:0x050c, B:723:0x0437, B:726:0x0457, B:727:0x045f, B:778:0x0517, B:780:0x0521, B:782:0x0525, B:783:0x052a, B:785:0x0539, B:787:0x0545, B:788:0x054b, B:789:0x0583, B:791:0x058b, B:794:0x0592, B:796:0x0598, B:800:0x05a0, B:802:0x05a8, B:803:0x05b5, B:806:0x05bb, B:809:0x05c7, B:810:0x05ca, B:814:0x05d3, B:815:0x0605, B:818:0x060c, B:820:0x0611, B:822:0x0619, B:824:0x061f, B:826:0x0625, B:827:0x0628, B:828:0x062b, B:830:0x062f, B:834:0x0636, B:836:0x063b, B:839:0x0649, B:842:0x0651, B:843:0x0654, B:848:0x0671, B:850:0x0676, B:853:0x0680, B:855:0x0686, B:859:0x069e, B:861:0x06a8, B:864:0x06b0, B:865:0x06be, B:866:0x06c1, B:873:0x06cf, B:875:0x06d9, B:876:0x06e1, B:878:0x070d, B:880:0x0716, B:884:0x071f, B:886:0x0725, B:888:0x072b, B:890:0x0735, B:892:0x0739, B:901:0x074a, B:906:0x0754, B:908:0x075b, B:909:0x075e, B:913:0x076d, B:915:0x0775, B:917:0x077b, B:918:0x077f, B:951:0x07fc, B:953:0x0803, B:955:0x0809, B:956:0x0811, B:958:0x0815, B:962:0x0823, B:969:0x083c, B:960:0x081c, B:963:0x0829, B:967:0x0831, B:968:0x0837, B:919:0x0784, B:921:0x078b, B:923:0x0790, B:939:0x07d2, B:941:0x07da, B:925:0x0797, B:928:0x079d, B:932:0x07ac, B:934:0x07b6, B:942:0x07de, B:944:0x07e5, B:946:0x07ea, B:950:0x07f3, B:970:0x0840, B:974:0x0847, B:976:0x084e, B:977:0x0855, B:979:0x085c, B:983:0x0867, B:985:0x086b, B:989:0x0876, B:993:0x087d), top: B:1021:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:965:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:968:0x0837 A[Catch: RuntimeException -> 0x08a0, IOException -> 0x08a4, g -> 0x08a9, TryCatch #12 {RuntimeException -> 0x08a0, blocks: (B:545:0x0019, B:994:0x089c, B:546:0x002b, B:548:0x0037, B:549:0x003c, B:551:0x0040, B:554:0x0045, B:556:0x0050, B:557:0x005c, B:558:0x0061, B:559:0x006d, B:563:0x0074, B:565:0x007e, B:566:0x0083, B:569:0x0090, B:571:0x0098, B:573:0x00af, B:576:0x00b5, B:580:0x00be, B:582:0x00c3, B:584:0x00e7, B:586:0x00ed, B:587:0x0104, B:588:0x010b, B:590:0x0110, B:594:0x011b, B:596:0x0123, B:597:0x0125, B:599:0x0129, B:601:0x012f, B:602:0x0133, B:604:0x0137, B:605:0x013c, B:606:0x013f, B:610:0x016d, B:612:0x0173, B:613:0x017b, B:607:0x014f, B:609:0x0158, B:614:0x0180, B:616:0x018c, B:617:0x0193, B:618:0x0198, B:620:0x01a4, B:622:0x0201, B:623:0x0212, B:625:0x021c, B:627:0x023b, B:629:0x0249, B:630:0x025c, B:631:0x025f, B:633:0x0268, B:636:0x0270, B:638:0x0274, B:640:0x027d, B:641:0x0282, B:645:0x02a3, B:646:0x02a9, B:647:0x02ad, B:649:0x02b5, B:652:0x02bc, B:656:0x02e7, B:661:0x02f4, B:663:0x0302, B:665:0x0308, B:669:0x0319, B:670:0x0320, B:672:0x0328, B:674:0x0334, B:676:0x033b, B:679:0x0343, B:681:0x036e, B:688:0x0394, B:682:0x0379, B:684:0x037d, B:686:0x0385, B:687:0x038e, B:689:0x0397, B:693:0x039f, B:695:0x03af, B:696:0x03b7, B:698:0x03c1, B:700:0x03cd, B:704:0x03d5, B:705:0x03e3, B:673:0x0332, B:710:0x03f3, B:712:0x03f8, B:716:0x03ff, B:717:0x0405, B:718:0x040d, B:719:0x0418, B:721:0x0428, B:766:0x04e2, B:768:0x04f0, B:756:0x04c9, B:752:0x04b6, B:754:0x04c6, B:770:0x04f5, B:772:0x0506, B:773:0x050c, B:723:0x0437, B:726:0x0457, B:727:0x045f, B:778:0x0517, B:780:0x0521, B:782:0x0525, B:783:0x052a, B:785:0x0539, B:787:0x0545, B:788:0x054b, B:789:0x0583, B:791:0x058b, B:794:0x0592, B:796:0x0598, B:800:0x05a0, B:802:0x05a8, B:803:0x05b5, B:806:0x05bb, B:809:0x05c7, B:810:0x05ca, B:814:0x05d3, B:815:0x0605, B:818:0x060c, B:820:0x0611, B:822:0x0619, B:824:0x061f, B:826:0x0625, B:827:0x0628, B:828:0x062b, B:830:0x062f, B:834:0x0636, B:836:0x063b, B:839:0x0649, B:842:0x0651, B:843:0x0654, B:848:0x0671, B:850:0x0676, B:853:0x0680, B:855:0x0686, B:859:0x069e, B:861:0x06a8, B:864:0x06b0, B:865:0x06be, B:866:0x06c1, B:873:0x06cf, B:875:0x06d9, B:876:0x06e1, B:878:0x070d, B:880:0x0716, B:884:0x071f, B:886:0x0725, B:888:0x072b, B:890:0x0735, B:892:0x0739, B:901:0x074a, B:906:0x0754, B:908:0x075b, B:909:0x075e, B:913:0x076d, B:915:0x0775, B:917:0x077b, B:918:0x077f, B:951:0x07fc, B:953:0x0803, B:955:0x0809, B:956:0x0811, B:958:0x0815, B:962:0x0823, B:969:0x083c, B:960:0x081c, B:963:0x0829, B:967:0x0831, B:968:0x0837, B:919:0x0784, B:921:0x078b, B:923:0x0790, B:939:0x07d2, B:941:0x07da, B:925:0x0797, B:928:0x079d, B:932:0x07ac, B:934:0x07b6, B:942:0x07de, B:944:0x07e5, B:946:0x07ea, B:950:0x07f3, B:970:0x0840, B:974:0x0847, B:976:0x084e, B:977:0x0855, B:979:0x085c, B:983:0x0867, B:985:0x086b, B:989:0x0876, B:993:0x087d), top: B:1021:0x0014 }] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v154, types: [int] */
    /* JADX WARN: Type inference failed for: r2v155 */
    /* JADX WARN: Type inference failed for: r2v156 */
    /* JADX WARN: Type inference failed for: r2v164 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v178 */
    /* JADX WARN: Type inference failed for: r2v179 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v247 */
    /* JADX WARN: Type inference failed for: r2v248 */
    /* JADX WARN: Type inference failed for: r2v249 */
    /* JADX WARN: Type inference failed for: r2v250 */
    /* JADX WARN: Type inference failed for: r2v251 */
    /* JADX WARN: Type inference failed for: r2v252 */
    /* JADX WARN: Type inference failed for: r2v258 */
    /* JADX WARN: Type inference failed for: r2v259 */
    /* JADX WARN: Type inference failed for: r2v260 */
    /* JADX WARN: Type inference failed for: r2v261 */
    /* JADX WARN: Type inference failed for: r2v262 */
    /* JADX WARN: Type inference failed for: r2v263 */
    /* JADX WARN: Type inference failed for: r2v265 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.anythink.expressad.exoplayer.h.r$a, com.anythink.expressad.exoplayer.h.s$b, com.anythink.expressad.exoplayer.k] */
    /* JADX WARN: Type inference failed for: r5v51, types: [com.anythink.expressad.exoplayer.k$c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r32) {
        /*
            Method dump skipped, instruction units count: 2324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.C1710k.handleMessage(android.os.Message):boolean");
    }
}
