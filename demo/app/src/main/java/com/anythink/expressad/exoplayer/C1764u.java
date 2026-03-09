package com.anythink.expressad.exoplayer;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p101h.C1621af;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p104i.C1667i;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1764u {

    /* JADX INFO: renamed from: a */
    public final AbstractC1499ae f10058a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Object f10059b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1650s.a f10060c;

    /* JADX INFO: renamed from: d */
    public final long f10061d;

    /* JADX INFO: renamed from: e */
    public final long f10062e;

    /* JADX INFO: renamed from: f */
    public final int f10063f;

    /* JADX INFO: renamed from: g */
    public final boolean f10064g;

    /* JADX INFO: renamed from: h */
    public final C1621af f10065h;

    /* JADX INFO: renamed from: i */
    public final C1667i f10066i;

    /* JADX INFO: renamed from: j */
    public volatile long f10067j;

    /* JADX INFO: renamed from: k */
    public volatile long f10068k;

    public C1764u(AbstractC1499ae abstractC1499ae, long j, C1621af c1621af, C1667i c1667i) {
        this(abstractC1499ae, null, new InterfaceC1650s.a(0), j, C1500b.f7455b, 1, false, c1621af, c1667i);
    }

    public C1764u(AbstractC1499ae abstractC1499ae, @Nullable Object obj, InterfaceC1650s.a aVar, long j, long j2, int i, boolean z, C1621af c1621af, C1667i c1667i) {
        this.f10058a = abstractC1499ae;
        this.f10059b = obj;
        this.f10060c = aVar;
        this.f10061d = j;
        this.f10062e = j2;
        this.f10067j = j;
        this.f10068k = j;
        this.f10063f = i;
        this.f10064g = z;
        this.f10065h = c1621af;
        this.f10066i = c1667i;
    }

    /* JADX INFO: renamed from: a */
    private static void m8499a(C1764u c1764u, C1764u c1764u2) {
        c1764u2.f10067j = c1764u.f10067j;
        c1764u2.f10068k = c1764u.f10068k;
    }

    /* JADX INFO: renamed from: a */
    public final C1764u m8500a(int i) {
        C1764u c1764u = new C1764u(this.f10058a, this.f10059b, this.f10060c.m7463a(i), this.f10061d, this.f10062e, this.f10063f, this.f10064g, this.f10065h, this.f10066i);
        m8499a(this, c1764u);
        return c1764u;
    }

    /* JADX INFO: renamed from: a */
    public final C1764u m8501a(AbstractC1499ae abstractC1499ae, Object obj) {
        C1764u c1764u = new C1764u(abstractC1499ae, obj, this.f10060c, this.f10061d, this.f10062e, this.f10063f, this.f10064g, this.f10065h, this.f10066i);
        m8499a(this, c1764u);
        return c1764u;
    }

    /* JADX INFO: renamed from: a */
    public final C1764u m8502a(C1621af c1621af, C1667i c1667i) {
        C1764u c1764u = new C1764u(this.f10058a, this.f10059b, this.f10060c, this.f10061d, this.f10062e, this.f10063f, this.f10064g, c1621af, c1667i);
        m8499a(this, c1764u);
        return c1764u;
    }

    /* JADX INFO: renamed from: a */
    public final C1764u m8503a(InterfaceC1650s.a aVar, long j, long j2) {
        return new C1764u(this.f10058a, this.f10059b, aVar, j, aVar.m7464a() ? j2 : -9223372036854775807L, this.f10063f, this.f10064g, this.f10065h, this.f10066i);
    }

    /* JADX INFO: renamed from: a */
    public final C1764u m8504a(boolean z) {
        C1764u c1764u = new C1764u(this.f10058a, this.f10059b, this.f10060c, this.f10061d, this.f10062e, this.f10063f, z, this.f10065h, this.f10066i);
        m8499a(this, c1764u);
        return c1764u;
    }

    /* JADX INFO: renamed from: b */
    public final C1764u m8505b(int i) {
        C1764u c1764u = new C1764u(this.f10058a, this.f10059b, this.f10060c, this.f10061d, this.f10062e, i, this.f10064g, this.f10065h, this.f10066i);
        m8499a(this, c1764u);
        return c1764u;
    }
}
