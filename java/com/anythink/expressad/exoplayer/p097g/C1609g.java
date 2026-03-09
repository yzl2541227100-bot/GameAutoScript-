package com.anythink.expressad.exoplayer.p097g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.anythink.expressad.exoplayer.AbstractC1492a;
import com.anythink.expressad.exoplayer.C1581g;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.C1754n;
import com.anythink.expressad.exoplayer.p092c.C1527e;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1538g;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1609g extends AbstractC1492a implements Handler.Callback {

    /* JADX INFO: renamed from: n */
    private static final int f8612n = 0;

    /* JADX INFO: renamed from: o */
    private static final int f8613o = 5;

    /* JADX INFO: renamed from: p */
    private final InterfaceC1606d f8614p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC1608f f8615q;

    /* JADX INFO: renamed from: r */
    private final Handler f8616r;

    /* JADX INFO: renamed from: s */
    private final C1754n f8617s;

    /* JADX INFO: renamed from: t */
    private final C1607e f8618t;

    /* JADX INFO: renamed from: u */
    private final C1582a[] f8619u;

    /* JADX INFO: renamed from: v */
    private final long[] f8620v;

    /* JADX INFO: renamed from: w */
    private int f8621w;

    /* JADX INFO: renamed from: x */
    private int f8622x;

    /* JADX INFO: renamed from: y */
    private InterfaceC1585b f8623y;

    /* JADX INFO: renamed from: z */
    private boolean f8624z;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.g$a */
    @Deprecated
    public interface a extends InterfaceC1608f {
    }

    public C1609g(InterfaceC1608f interfaceC1608f, Looper looper) {
        this(interfaceC1608f, looper, InterfaceC1606d.f8610a);
    }

    private C1609g(InterfaceC1608f interfaceC1608f, Looper looper, InterfaceC1606d interfaceC1606d) {
        super(4);
        this.f8615q = (InterfaceC1608f) C1711a.m8005a(interfaceC1608f);
        this.f8616r = looper == null ? null : new Handler(looper, this);
        this.f8614p = (InterfaceC1606d) C1711a.m8005a(interfaceC1606d);
        this.f8617s = new C1754n();
        this.f8618t = new C1607e();
        this.f8619u = new C1582a[5];
        this.f8620v = new long[5];
    }

    /* JADX INFO: renamed from: a */
    private void m7171a(C1582a c1582a) {
        Handler handler = this.f8616r;
        if (handler != null) {
            handler.obtainMessage(0, c1582a).sendToTarget();
        } else {
            m7172b(c1582a);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7172b(C1582a c1582a) {
        this.f8615q.mo6174a(c1582a);
    }

    /* JADX INFO: renamed from: w */
    private void m7173w() {
        Arrays.fill(this.f8619u, (Object) null);
        this.f8621w = 0;
        this.f8622x = 0;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1769z
    /* JADX INFO: renamed from: a */
    public final int mo6600a(C1753m c1753m) {
        if (this.f8614p.mo7169a(c1753m)) {
            return AbstractC1492a.m6121a((InterfaceC1538g<?>) null, c1753m.f9974k) ? 4 : 2;
        }
        return 0;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: a */
    public final void mo6601a(long j, long j2) throws C1581g {
        if (!this.f8624z && this.f8622x < 5) {
            this.f8618t.mo6637a();
            if (m6123a(this.f8617s, (C1527e) this.f8618t, false) == -4) {
                if (this.f8618t.m6641c()) {
                    this.f8624z = true;
                } else if (!this.f8618t.m6640b()) {
                    C1607e c1607e = this.f8618t;
                    c1607e.f8611g = this.f8617s.f9990a.f9975l;
                    c1607e.m6663h();
                    try {
                        int i = (this.f8621w + this.f8622x) % 5;
                        this.f8619u[i] = this.f8623y.mo7091a(this.f8618t);
                        this.f8620v[i] = this.f8618t.f7880f;
                        this.f8622x++;
                    } catch (C1598c e) {
                        throw C1581g.m7080a(e, m6150s());
                    }
                }
            }
        }
        if (this.f8622x > 0) {
            long[] jArr = this.f8620v;
            int i2 = this.f8621w;
            if (jArr[i2] <= j) {
                C1582a c1582a = this.f8619u[i2];
                Handler handler = this.f8616r;
                if (handler != null) {
                    handler.obtainMessage(0, c1582a).sendToTarget();
                } else {
                    m7172b(c1582a);
                }
                C1582a[] c1582aArr = this.f8619u;
                int i3 = this.f8621w;
                c1582aArr[i3] = null;
                this.f8621w = (i3 + 1) % 5;
                this.f8622x--;
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: a */
    public final void mo6127a(long j, boolean z) {
        m7173w();
        this.f8624z = false;
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: a */
    public final void mo6130a(C1753m[] c1753mArr, long j) {
        this.f8623y = this.f8614p.mo7170b(c1753mArr[0]);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        m7172b((C1582a) message.obj);
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: p */
    public final void mo6147p() {
        m7173w();
        this.f8623y = null;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: u */
    public final boolean mo6568u() {
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: v */
    public final boolean mo6569v() {
        return this.f8624z;
    }
}
