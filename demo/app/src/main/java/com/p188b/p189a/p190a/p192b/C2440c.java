package com.p188b.p189a.p190a.p192b;

import com.p188b.p189a.C2426a;
import com.p188b.p189a.C2532ai;
import com.p188b.p189a.C2546aw;
import com.p188b.p189a.C2560n;
import com.p188b.p189a.C2572z;
import com.p188b.p189a.EnumC2535al;
import com.p188b.p189a.InterfaceC2559m;
import com.p188b.p189a.p190a.p193c.InterfaceC2449c;
import com.p188b.p189a.p190a.p194d.C2461a;
import com.p188b.p189a.p190a.p195e.AbstractC2499s;
import com.p188b.p189a.p190a.p195e.C2470ab;
import com.p188b.p189a.p190a.p195e.C2488h;
import com.p188b.p189a.p190a.p195e.C2490j;
import com.p188b.p189a.p190a.p195e.EnumC2482b;
import com.p188b.p189a.p190a.p197g.C2516h;
import com.p188b.p199b.C2587n;
import com.p188b.p199b.C2598y;
import com.p188b.p199b.InterfaceC2580g;
import com.p188b.p199b.InterfaceC2581h;
import io.reactivex.annotations.SchedulerSupport;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.b.a.a.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2440c extends AbstractC2499s implements InterfaceC2559m {

    /* JADX INFO: renamed from: a */
    public boolean f15137a;

    /* JADX INFO: renamed from: b */
    public int f15138b;

    /* JADX INFO: renamed from: c */
    public int f15139c = 1;

    /* JADX INFO: renamed from: d */
    public final List<Reference<C2444g>> f15140d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public long f15141e = Long.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    private final C2560n f15142g;

    /* JADX INFO: renamed from: h */
    private final C2546aw f15143h;

    /* JADX INFO: renamed from: i */
    private Socket f15144i;

    /* JADX INFO: renamed from: j */
    private Socket f15145j;

    /* JADX INFO: renamed from: k */
    private C2572z f15146k;

    /* JADX INFO: renamed from: l */
    private EnumC2535al f15147l;

    /* JADX INFO: renamed from: m */
    private C2490j f15148m;

    /* JADX INFO: renamed from: n */
    private InterfaceC2581h f15149n;

    /* JADX INFO: renamed from: o */
    private InterfaceC2580g f15150o;

    public C2440c(C2560n c2560n, C2546aw c2546aw) {
        this.f15142g = c2560n;
        this.f15143h = c2546aw;
    }

    /* JADX INFO: renamed from: a */
    private void m12532a(int i, int i2) throws IOException {
        Proxy proxyM12912b = this.f15143h.m12912b();
        Socket socketCreateSocket = (proxyM12912b.type() == Proxy.Type.DIRECT || proxyM12912b.type() == Proxy.Type.HTTP) ? this.f15143h.m12911a().m12492c().createSocket() : new Socket(proxyM12912b);
        this.f15144i = socketCreateSocket;
        socketCreateSocket.setSoTimeout(i2);
        try {
            C2516h.m12773b().mo12755a(this.f15144i, this.f15143h.m12913c(), i);
            this.f15149n = C2587n.m13072a(C2587n.m13075b(this.f15144i));
            this.f15150o = C2587n.m13071a(C2587n.m13073a(this.f15144i));
        } catch (ConnectException e) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f15143h.m12913c());
            connectException.initCause(e);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2449c m12533a(C2532ai c2532ai, C2444g c2444g) throws SocketException {
        if (this.f15148m != null) {
            return new C2488h(c2532ai, c2444g, this.f15148m);
        }
        this.f15145j.setSoTimeout(c2532ai.m12839b());
        C2598y c2598yMo12514a = this.f15149n.mo12514a();
        long jM12839b = c2532ai.m12839b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c2598yMo12514a.mo13061a(jM12839b, timeUnit);
        this.f15150o.mo12632a().mo13061a(c2532ai.m12840c(), timeUnit);
        return new C2461a(c2532ai, c2444g, this.f15149n, this.f15150o);
    }

    @Override // com.p188b.p189a.InterfaceC2559m
    /* JADX INFO: renamed from: a */
    public final C2546aw mo12534a() {
        return this.f15143h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x033d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.b.a.a.g.h] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12535a(int r19, int r20, int r21, boolean r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.p190a.p192b.C2440c.m12535a(int, int, int, boolean):void");
    }

    @Override // com.p188b.p189a.p190a.p195e.AbstractC2499s
    /* JADX INFO: renamed from: a */
    public final void mo12536a(C2470ab c2470ab) {
        c2470ab.m12644a(EnumC2482b.REFUSED_STREAM);
    }

    @Override // com.p188b.p189a.p190a.p195e.AbstractC2499s
    /* JADX INFO: renamed from: a */
    public final void mo12537a(C2490j c2490j) {
        synchronized (this.f15142g) {
            this.f15139c = c2490j.m12723a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12538a(C2426a c2426a) {
        return this.f15140d.size() < this.f15139c && c2426a.equals(this.f15143h.m12911a()) && !this.f15137a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12539a(boolean z) {
        if (this.f15145j.isClosed() || this.f15145j.isInputShutdown() || this.f15145j.isOutputShutdown()) {
            return false;
        }
        C2490j c2490j = this.f15148m;
        if (c2490j != null) {
            return !c2490j.m12738c();
        }
        if (z) {
            try {
                int soTimeout = this.f15145j.getSoTimeout();
                try {
                    this.f15145j.setSoTimeout(1);
                    return !this.f15149n.mo13017d();
                } finally {
                    this.f15145j.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final Socket m12540b() {
        return this.f15145j;
    }

    /* JADX INFO: renamed from: c */
    public final C2572z m12541c() {
        return this.f15146k;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12542d() {
        return this.f15148m != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.f15143h.m12911a().m12490a().m12817f());
        sb.append(":");
        sb.append(this.f15143h.m12911a().m12490a().m12818g());
        sb.append(", proxy=");
        sb.append(this.f15143h.m12912b());
        sb.append(" hostAddress=");
        sb.append(this.f15143h.m12913c());
        sb.append(" cipherSuite=");
        C2572z c2572z = this.f15146k;
        sb.append(c2572z != null ? c2572z.m12972a() : SchedulerSupport.NONE);
        sb.append(" protocol=");
        sb.append(this.f15147l);
        sb.append(MessageFormatter.DELIM_STOP);
        return sb.toString();
    }
}
