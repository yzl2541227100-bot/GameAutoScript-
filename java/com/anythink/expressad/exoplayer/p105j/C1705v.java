package com.anythink.expressad.exoplayer.p105j;

import android.net.Uri;
import com.anythink.expressad.exoplayer.p105j.C1703t;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.io.Closeable;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1705v<T> implements C1703t.c {

    /* JADX INFO: renamed from: a */
    public final C1694k f9521a;

    /* JADX INFO: renamed from: b */
    public final int f9522b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1691h f9523c;

    /* JADX INFO: renamed from: d */
    private final a<? extends T> f9524d;

    /* JADX INFO: renamed from: e */
    private volatile T f9525e;

    /* JADX INFO: renamed from: f */
    private volatile long f9526f;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.v$a */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        T m7925a();
    }

    private C1705v(InterfaceC1691h interfaceC1691h, Uri uri, a<? extends T> aVar) {
        this(interfaceC1691h, new C1694k(uri, 3), aVar);
    }

    private C1705v(InterfaceC1691h interfaceC1691h, C1694k c1694k, a<? extends T> aVar) {
        this.f9523c = interfaceC1691h;
        this.f9521a = c1694k;
        this.f9522b = 0;
        this.f9524d = aVar;
    }

    /* JADX INFO: renamed from: a */
    private static <T> T m7922a(InterfaceC1691h interfaceC1691h, a<? extends T> aVar, Uri uri) {
        C1705v c1705v = new C1705v(interfaceC1691h, uri, aVar);
        c1705v.mo7285b();
        return c1705v.f9525e;
    }

    /* JADX INFO: renamed from: c */
    private T m7923c() {
        return this.f9525e;
    }

    /* JADX INFO: renamed from: d */
    private long m7924d() {
        return this.f9526f;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.c
    /* JADX INFO: renamed from: a */
    public final void mo7284a() {
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.c
    /* JADX INFO: renamed from: b */
    public final void mo7285b() {
        C1693j c1693j = new C1693j(this.f9523c, this.f9521a);
        try {
            c1693j.m7854b();
            a<? extends T> aVar = this.f9524d;
            this.f9523c.mo7743a();
            this.f9525e = aVar.m7925a();
        } finally {
            this.f9526f = c1693j.m7853a();
            C1717af.m8075a((Closeable) c1693j);
        }
    }
}
