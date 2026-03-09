package com.anythink.expressad.exoplayer.p101h.p103b;

import android.util.SparseArray;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p094e.C1565d;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1566e;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1567f;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1568g;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1572k;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1574m;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1736s;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1627d implements InterfaceC1568g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1566e f8772a;

    /* JADX INFO: renamed from: b */
    private final int f8773b;

    /* JADX INFO: renamed from: c */
    private final C1753m f8774c;

    /* JADX INFO: renamed from: d */
    private final SparseArray<a> f8775d = new SparseArray<>();

    /* JADX INFO: renamed from: e */
    private boolean f8776e;

    /* JADX INFO: renamed from: f */
    private b f8777f;

    /* JADX INFO: renamed from: g */
    private InterfaceC1572k f8778g;

    /* JADX INFO: renamed from: h */
    private C1753m[] f8779h;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.b.d$a */
    public static final class a implements InterfaceC1574m {

        /* JADX INFO: renamed from: a */
        public C1753m f8780a;

        /* JADX INFO: renamed from: b */
        private final int f8781b;

        /* JADX INFO: renamed from: c */
        private final int f8782c;

        /* JADX INFO: renamed from: d */
        private final C1753m f8783d;

        /* JADX INFO: renamed from: e */
        private InterfaceC1574m f8784e;

        public a(int i, int i2, C1753m c1753m) {
            this.f8781b = i;
            this.f8782c = i2;
            this.f8783d = c1753m;
        }

        @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1574m
        /* JADX INFO: renamed from: a */
        public final int mo6981a(InterfaceC1567f interfaceC1567f, int i, boolean z) {
            return this.f8784e.mo6981a(interfaceC1567f, i, z);
        }

        @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1574m
        /* JADX INFO: renamed from: a */
        public final void mo6982a(long j, int i, int i2, int i3, InterfaceC1574m.a aVar) {
            this.f8784e.mo6982a(j, i, i2, i3, aVar);
        }

        /* JADX INFO: renamed from: a */
        public final void m7313a(b bVar) {
            if (bVar == null) {
                this.f8784e = new C1565d();
                return;
            }
            InterfaceC1574m interfaceC1574mMo7305a = bVar.mo7305a(this.f8782c);
            this.f8784e = interfaceC1574mMo7305a;
            C1753m c1753m = this.f8780a;
            if (c1753m != null) {
                interfaceC1574mMo7305a.mo6984a(c1753m);
            }
        }

        @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1574m
        /* JADX INFO: renamed from: a */
        public final void mo6983a(C1736s c1736s, int i) {
            this.f8784e.mo6983a(c1736s, i);
        }

        @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1574m
        /* JADX INFO: renamed from: a */
        public final void mo6984a(C1753m c1753m) {
            C1753m c1753m2 = this.f8783d;
            if (c1753m2 != null) {
                c1753m = c1753m.m8415a(c1753m2);
            }
            this.f8780a = c1753m;
            this.f8784e.mo6984a(c1753m);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.b.d$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        InterfaceC1574m mo7305a(int i);
    }

    private C1627d(InterfaceC1566e interfaceC1566e, int i, C1753m c1753m) {
        this.f8772a = interfaceC1566e;
        this.f8773b = i;
        this.f8774c = c1753m;
    }

    /* JADX INFO: renamed from: b */
    private InterfaceC1572k m7310b() {
        return this.f8778g;
    }

    /* JADX INFO: renamed from: c */
    private C1753m[] m7311c() {
        return this.f8779h;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1568g
    /* JADX INFO: renamed from: a */
    public final InterfaceC1574m mo6985a(int i, int i2) {
        a aVar = this.f8775d.get(i);
        if (aVar == null) {
            C1711a.m8012b(this.f8779h == null);
            aVar = new a(i, i2, i2 == this.f8773b ? this.f8774c : null);
            aVar.m7313a(this.f8777f);
            this.f8775d.put(i, aVar);
        }
        return aVar;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1568g
    /* JADX INFO: renamed from: a */
    public final void mo6986a(InterfaceC1572k interfaceC1572k) {
        this.f8778g = interfaceC1572k;
    }

    /* JADX INFO: renamed from: a */
    public final void m7312a(b bVar, long j) {
        this.f8777f = bVar;
        if (!this.f8776e) {
            this.f8772a.mo6898a(this);
            if (j != C1500b.f7455b) {
                this.f8772a.mo6897a(0L, j);
            }
            this.f8776e = true;
            return;
        }
        InterfaceC1566e interfaceC1566e = this.f8772a;
        if (j == C1500b.f7455b) {
            j = 0;
        }
        interfaceC1566e.mo6897a(0L, j);
        for (int i = 0; i < this.f8775d.size(); i++) {
            this.f8775d.valueAt(i).m7313a(bVar);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1568g
    /* JADX INFO: renamed from: c_ */
    public final void mo6987c_() {
        C1753m[] c1753mArr = new C1753m[this.f8775d.size()];
        for (int i = 0; i < this.f8775d.size(); i++) {
            c1753mArr[i] = this.f8775d.valueAt(i).f8780a;
        }
        this.f8779h = c1753mArr;
    }
}
