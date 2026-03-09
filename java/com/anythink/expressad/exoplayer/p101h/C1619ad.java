package com.anythink.expressad.exoplayer.p101h;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.InterfaceC1610h;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1651t;
import com.anythink.expressad.exoplayer.p105j.C1694k;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1685b;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.io.IOException;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.ad */
/* JADX INFO: loaded from: classes.dex */
public final class C1619ad extends AbstractC1634c {

    /* JADX INFO: renamed from: a */
    public static final int f8735a = 3;

    /* JADX INFO: renamed from: b */
    private final C1694k f8736b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1691h.a f8737c;

    /* JADX INFO: renamed from: d */
    private final C1753m f8738d;

    /* JADX INFO: renamed from: e */
    private final long f8739e;

    /* JADX INFO: renamed from: f */
    private final int f8740f;

    /* JADX INFO: renamed from: g */
    private final boolean f8741g;

    /* JADX INFO: renamed from: h */
    private final AbstractC1499ae f8742h;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.ad$a */
    @Deprecated
    public interface a {
        /* JADX INFO: renamed from: a */
        void m7287a();
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.ad$b */
    public static final class b extends AbstractC1642k {

        /* JADX INFO: renamed from: a */
        private final a f8743a;

        /* JADX INFO: renamed from: b */
        private final int f8744b;

        public b(a aVar, int i) {
            this.f8743a = (a) C1711a.m8005a(aVar);
            this.f8744b = i;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1642k, com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
        /* JADX INFO: renamed from: a */
        public final void mo6169a(int i, @Nullable InterfaceC1650s.a aVar, InterfaceC1651t.b bVar, InterfaceC1651t.c cVar, IOException iOException, boolean z) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.ad$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final InterfaceC1691h.a f8745a;

        /* JADX INFO: renamed from: b */
        private int f8746b = 3;

        /* JADX INFO: renamed from: c */
        private boolean f8747c;

        /* JADX INFO: renamed from: d */
        private boolean f8748d;

        /* JADX INFO: renamed from: e */
        @Nullable
        private Object f8749e;

        private c(InterfaceC1691h.a aVar) {
            this.f8745a = (InterfaceC1691h.a) C1711a.m8005a(aVar);
        }

        /* JADX INFO: renamed from: a */
        private c m7288a(int i) {
            C1711a.m8012b(!this.f8748d);
            this.f8746b = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private c m7289a(Object obj) {
            C1711a.m8012b(!this.f8748d);
            this.f8749e = obj;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private c m7290a(boolean z) {
            C1711a.m8012b(!this.f8748d);
            this.f8747c = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private C1619ad m7291a(Uri uri, C1753m c1753m, long j) {
            this.f8748d = true;
            return new C1619ad(uri, this.f8745a, c1753m, j, this.f8746b, this.f8747c, this.f8749e, (byte) 0);
        }

        @Deprecated
        /* JADX INFO: renamed from: a */
        private C1619ad m7292a(Uri uri, C1753m c1753m, long j, @Nullable Handler handler, @Nullable InterfaceC1651t interfaceC1651t) {
            this.f8748d = true;
            C1619ad c1619ad = new C1619ad(uri, this.f8745a, c1753m, j, this.f8746b, this.f8747c, this.f8749e, (byte) 0);
            if (handler != null && interfaceC1651t != null) {
                c1619ad.mo7354a(handler, interfaceC1651t);
            }
            return c1619ad;
        }
    }

    @Deprecated
    private C1619ad(Uri uri, InterfaceC1691h.a aVar, C1753m c1753m, long j) {
        this(uri, aVar, c1753m, j, (byte) 0);
    }

    @Deprecated
    private C1619ad(Uri uri, InterfaceC1691h.a aVar, C1753m c1753m, long j, byte b2) {
        this(uri, aVar, c1753m, j, 3, false, null);
    }

    @Deprecated
    private C1619ad(Uri uri, InterfaceC1691h.a aVar, C1753m c1753m, long j, int i, Handler handler, a aVar2, int i2, boolean z) {
        this(uri, aVar, c1753m, j, i, z, null);
        if (handler == null || aVar2 == null) {
            return;
        }
        mo7354a(handler, new b(aVar2, i2));
    }

    private C1619ad(Uri uri, InterfaceC1691h.a aVar, C1753m c1753m, long j, int i, boolean z, @Nullable Object obj) {
        this.f8737c = aVar;
        this.f8738d = c1753m;
        this.f8739e = j;
        this.f8740f = i;
        this.f8741g = z;
        this.f8736b = new C1694k(uri);
        this.f8742h = new C1617ab(j, true, false, obj);
    }

    public /* synthetic */ C1619ad(Uri uri, InterfaceC1691h.a aVar, C1753m c1753m, long j, int i, boolean z, Object obj, byte b2) {
        this(uri, aVar, c1753m, j, i, z, obj);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final InterfaceC1649r mo7225a(InterfaceC1650s.a aVar, InterfaceC1685b interfaceC1685b) {
        C1711a.m8010a(aVar.f9012a == 0);
        return new C1618ac(this.f8736b, this.f8737c, this.f8738d, this.f8739e, this.f8740f, m7353a(aVar), this.f8741g);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    /* JADX INFO: renamed from: a */
    public final void mo7227a() {
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final void mo7228a(InterfaceC1649r interfaceC1649r) {
        ((C1618ac) interfaceC1649r).m7275f();
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    /* JADX INFO: renamed from: a */
    public final void mo7229a(InterfaceC1610h interfaceC1610h, boolean z) {
        m7355a(this.f8742h, (Object) null);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: b */
    public final void mo7286b() {
    }
}
