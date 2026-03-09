package com.anythink.expressad.exoplayer.p101h;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.InterfaceC1610h;
import com.anythink.expressad.exoplayer.p094e.C1564c;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1569h;
import com.anythink.expressad.exoplayer.p101h.C1645n;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1651t;
import com.anythink.expressad.exoplayer.p101h.p102a.C1614c;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1685b;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.io.IOException;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1646o extends AbstractC1634c implements C1645n.c {

    /* JADX INFO: renamed from: a */
    public static final int f8983a = 3;

    /* JADX INFO: renamed from: b */
    public static final int f8984b = 6;

    /* JADX INFO: renamed from: c */
    public static final int f8985c = -1;

    /* JADX INFO: renamed from: d */
    public static final int f8986d = 1048576;

    /* JADX INFO: renamed from: e */
    private final Uri f8987e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC1691h.a f8988f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC1569h f8989g;

    /* JADX INFO: renamed from: h */
    private final int f8990h;

    /* JADX INFO: renamed from: i */
    private final String f8991i;

    /* JADX INFO: renamed from: j */
    private final int f8992j;

    /* JADX INFO: renamed from: k */
    @Nullable
    private final Object f8993k;

    /* JADX INFO: renamed from: l */
    private long f8994l;

    /* JADX INFO: renamed from: m */
    private boolean f8995m;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.o$a */
    @Deprecated
    public interface a {
        /* JADX INFO: renamed from: a */
        void m7454a();
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.o$b */
    public static final class b extends AbstractC1642k {

        /* JADX INFO: renamed from: a */
        private final a f8996a;

        public b(a aVar) {
            this.f8996a = (a) C1711a.m8005a(aVar);
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1642k, com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
        /* JADX INFO: renamed from: a */
        public final void mo6169a(int i, @Nullable InterfaceC1650s.a aVar, InterfaceC1651t.b bVar, InterfaceC1651t.c cVar, IOException iOException, boolean z) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.o$c */
    public static final class c implements C1614c.e {

        /* JADX INFO: renamed from: a */
        private final InterfaceC1691h.a f8997a;

        /* JADX INFO: renamed from: b */
        @Nullable
        private InterfaceC1569h f8998b;

        /* JADX INFO: renamed from: c */
        @Nullable
        private String f8999c;

        /* JADX INFO: renamed from: d */
        @Nullable
        private Object f9000d;

        /* JADX INFO: renamed from: e */
        private int f9001e = -1;

        /* JADX INFO: renamed from: f */
        private int f9002f = 1048576;

        /* JADX INFO: renamed from: g */
        private boolean f9003g;

        public c(InterfaceC1691h.a aVar) {
            this.f8997a = aVar;
        }

        /* JADX INFO: renamed from: a */
        private c m7455a(int i) {
            C1711a.m8012b(!this.f9003g);
            this.f9001e = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private c m7456a(InterfaceC1569h interfaceC1569h) {
            C1711a.m8012b(!this.f9003g);
            this.f8998b = interfaceC1569h;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private c m7457a(Object obj) {
            C1711a.m8012b(!this.f9003g);
            this.f9000d = obj;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private c m7458a(String str) {
            C1711a.m8012b(!this.f9003g);
            this.f8999c = str;
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: a */
        private C1646o m7459a(Uri uri, @Nullable Handler handler, @Nullable InterfaceC1651t interfaceC1651t) {
            C1646o c1646oMo7246b = mo7246b(uri);
            if (handler != null && interfaceC1651t != null) {
                c1646oMo7246b.mo7354a(handler, interfaceC1651t);
            }
            return c1646oMo7246b;
        }

        /* JADX INFO: renamed from: b */
        private c m7460b(int i) {
            C1711a.m8012b(!this.f9003g);
            this.f9002f = i;
            return this;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.p102a.C1614c.e
        /* JADX INFO: renamed from: a */
        public final C1646o mo7246b(Uri uri) {
            this.f9003g = true;
            if (this.f8998b == null) {
                this.f8998b = new C1564c();
            }
            return new C1646o(uri, this.f8997a, this.f8998b, this.f9001e, this.f8999c, this.f9002f, this.f9000d, (byte) 0);
        }

        @Override // com.anythink.expressad.exoplayer.p101h.p102a.C1614c.e
        /* JADX INFO: renamed from: a */
        public final int[] mo7245a() {
            return new int[]{3};
        }
    }

    private C1646o(Uri uri, InterfaceC1691h.a aVar, InterfaceC1569h interfaceC1569h, int i, @Nullable String str, int i2, @Nullable Object obj) {
        this.f8987e = uri;
        this.f8988f = aVar;
        this.f8989g = interfaceC1569h;
        this.f8990h = i;
        this.f8991i = str;
        this.f8992j = i2;
        this.f8994l = C1500b.f7455b;
        this.f8993k = obj;
    }

    public /* synthetic */ C1646o(Uri uri, InterfaceC1691h.a aVar, InterfaceC1569h interfaceC1569h, int i, String str, int i2, Object obj, byte b2) {
        this(uri, aVar, interfaceC1569h, i, str, i2, obj);
    }

    @Deprecated
    private C1646o(Uri uri, InterfaceC1691h.a aVar, InterfaceC1569h interfaceC1569h, Handler handler, a aVar2) {
        this(uri, aVar, interfaceC1569h, handler, aVar2, null);
    }

    @Deprecated
    private C1646o(Uri uri, InterfaceC1691h.a aVar, InterfaceC1569h interfaceC1569h, Handler handler, a aVar2, String str) {
        this(uri, aVar, interfaceC1569h, handler, aVar2, str, (byte) 0);
    }

    @Deprecated
    private C1646o(Uri uri, InterfaceC1691h.a aVar, InterfaceC1569h interfaceC1569h, Handler handler, a aVar2, String str, byte b2) {
        this(uri, aVar, interfaceC1569h, -1, str, 1048576, (Object) null);
        if (aVar2 == null || handler == null) {
            return;
        }
        mo7354a(handler, new b(aVar2));
    }

    /* JADX INFO: renamed from: b */
    private void m7453b(long j, boolean z) {
        this.f8994l = j;
        this.f8995m = z;
        m7355a(new C1617ab(this.f8994l, this.f8995m, false, this.f8993k), (Object) null);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final InterfaceC1649r mo7225a(InterfaceC1650s.a aVar, InterfaceC1685b interfaceC1685b) {
        C1711a.m8010a(aVar.f9012a == 0);
        return new C1645n(this.f8987e, this.f8988f.mo7851a(), this.f8989g.mo6901a(), this.f8990h, m7353a(aVar), this, interfaceC1685b, this.f8991i, this.f8992j);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    /* JADX INFO: renamed from: a */
    public final void mo7227a() {
    }

    @Override // com.anythink.expressad.exoplayer.p101h.C1645n.c
    /* JADX INFO: renamed from: a */
    public final void mo7451a(long j, boolean z) {
        if (j == C1500b.f7455b) {
            j = this.f8994l;
        }
        if (this.f8994l == j && this.f8995m == z) {
            return;
        }
        m7453b(j, z);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final void mo7228a(InterfaceC1649r interfaceC1649r) {
        ((C1645n) interfaceC1649r).m7441f();
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    /* JADX INFO: renamed from: a */
    public final void mo7229a(InterfaceC1610h interfaceC1610h, boolean z) {
        m7453b(this.f8994l, false);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: b */
    public final void mo7286b() {
    }
}
