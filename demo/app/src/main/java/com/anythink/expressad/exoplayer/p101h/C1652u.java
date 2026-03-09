package com.anythink.expressad.exoplayer.p101h;

import com.anythink.expressad.exoplayer.C1497ac;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1649r;
import com.anythink.expressad.exoplayer.p104i.InterfaceC1664f;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1652u implements InterfaceC1649r, InterfaceC1649r.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1649r[] f9063a;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1639h f9065c;

    /* JADX INFO: renamed from: e */
    private InterfaceC1649r.a f9067e;

    /* JADX INFO: renamed from: f */
    private C1621af f9068f;

    /* JADX INFO: renamed from: g */
    private InterfaceC1649r[] f9069g;

    /* JADX INFO: renamed from: h */
    private InterfaceC1657z f9070h;

    /* JADX INFO: renamed from: d */
    private final ArrayList<InterfaceC1649r> f9066d = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private final IdentityHashMap<InterfaceC1656y, Integer> f9064b = new IdentityHashMap<>();

    public C1652u(InterfaceC1639h interfaceC1639h, InterfaceC1649r... interfaceC1649rArr) {
        this.f9065c = interfaceC1639h;
        this.f9063a = interfaceC1649rArr;
        this.f9070h = interfaceC1639h.mo7378a(new InterfaceC1657z[0]);
    }

    /* JADX INFO: renamed from: f */
    private void m7489f() {
        this.f9067e.mo7364a(this);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final long mo7261a(long j, C1497ac c1497ac) {
        return this.f9069g[0].mo7261a(j, c1497ac);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final long mo7262a(InterfaceC1664f[] interfaceC1664fArr, boolean[] zArr, InterfaceC1656y[] interfaceC1656yArr, boolean[] zArr2, long j) {
        InterfaceC1656y[] interfaceC1656yArr2 = interfaceC1656yArr;
        int[] iArr = new int[interfaceC1664fArr.length];
        int[] iArr2 = new int[interfaceC1664fArr.length];
        for (int i = 0; i < interfaceC1664fArr.length; i++) {
            iArr[i] = interfaceC1656yArr2[i] == null ? -1 : this.f9064b.get(interfaceC1656yArr2[i]).intValue();
            iArr2[i] = -1;
            if (interfaceC1664fArr[i] != null) {
                C1620ae c1620aeMo7584f = interfaceC1664fArr[i].mo7584f();
                int i2 = 0;
                while (true) {
                    InterfaceC1649r[] interfaceC1649rArr = this.f9063a;
                    if (i2 >= interfaceC1649rArr.length) {
                        break;
                    }
                    if (interfaceC1649rArr[i2].mo7270b().m7298a(c1620aeMo7584f) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.f9064b.clear();
        int length = interfaceC1664fArr.length;
        InterfaceC1656y[] interfaceC1656yArr3 = new InterfaceC1656y[length];
        InterfaceC1656y[] interfaceC1656yArr4 = new InterfaceC1656y[interfaceC1664fArr.length];
        InterfaceC1664f[] interfaceC1664fArr2 = new InterfaceC1664f[interfaceC1664fArr.length];
        ArrayList arrayList = new ArrayList(this.f9063a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f9063a.length) {
            for (int i4 = 0; i4 < interfaceC1664fArr.length; i4++) {
                InterfaceC1664f interfaceC1664f = null;
                interfaceC1656yArr4[i4] = iArr[i4] == i3 ? interfaceC1656yArr2[i4] : null;
                if (iArr2[i4] == i3) {
                    interfaceC1664f = interfaceC1664fArr[i4];
                }
                interfaceC1664fArr2[i4] = interfaceC1664f;
            }
            int i5 = i3;
            InterfaceC1664f[] interfaceC1664fArr3 = interfaceC1664fArr2;
            ArrayList arrayList2 = arrayList;
            long jMo7262a = this.f9063a[i3].mo7262a(interfaceC1664fArr2, zArr, interfaceC1656yArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = jMo7262a;
            } else if (jMo7262a != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < interfaceC1664fArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    C1711a.m8012b(interfaceC1656yArr4[i6] != null);
                    interfaceC1656yArr3[i6] = interfaceC1656yArr4[i6];
                    this.f9064b.put(interfaceC1656yArr4[i6], Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    C1711a.m8012b(interfaceC1656yArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.f9063a[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            interfaceC1664fArr2 = interfaceC1664fArr3;
            interfaceC1656yArr2 = interfaceC1656yArr;
        }
        InterfaceC1656y[] interfaceC1656yArr5 = interfaceC1656yArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(interfaceC1656yArr3, 0, interfaceC1656yArr5, 0, length);
        InterfaceC1649r[] interfaceC1649rArr2 = new InterfaceC1649r[arrayList3.size()];
        this.f9069g = interfaceC1649rArr2;
        arrayList3.toArray(interfaceC1649rArr2);
        this.f9070h = this.f9065c.mo7378a(this.f9069g);
        return j2;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final void mo7263a() {
        for (InterfaceC1649r interfaceC1649r : this.f9063a) {
            interfaceC1649r.mo7263a();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final void mo7264a(long j, boolean z) {
        for (InterfaceC1649r interfaceC1649r : this.f9069g) {
            interfaceC1649r.mo7264a(j, z);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final void mo7265a(InterfaceC1649r.a aVar, long j) {
        this.f9067e = aVar;
        Collections.addAll(this.f9066d, this.f9063a);
        for (InterfaceC1649r interfaceC1649r : this.f9063a) {
            interfaceC1649r.mo7265a(this, j);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r.a
    /* JADX INFO: renamed from: a */
    public final void mo7363a(InterfaceC1649r interfaceC1649r) {
        this.f9066d.remove(interfaceC1649r);
        if (this.f9066d.isEmpty()) {
            int i = 0;
            for (InterfaceC1649r interfaceC1649r2 : this.f9063a) {
                i += interfaceC1649r2.mo7270b().f8754b;
            }
            C1620ae[] c1620aeArr = new C1620ae[i];
            int i2 = 0;
            for (InterfaceC1649r interfaceC1649r3 : this.f9063a) {
                C1621af c1621afMo7270b = interfaceC1649r3.mo7270b();
                int i3 = c1621afMo7270b.f8754b;
                int i4 = 0;
                while (i4 < i3) {
                    c1620aeArr[i2] = c1621afMo7270b.m7299a(i4);
                    i4++;
                    i2++;
                }
            }
            this.f9068f = new C1621af(c1620aeArr);
            this.f9067e.mo7363a((InterfaceC1649r) this);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1657z.a
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7364a(InterfaceC1657z interfaceC1657z) {
        this.f9067e.mo7364a(this);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: a_ */
    public final void mo7268a_(long j) {
        this.f9070h.mo7268a_(j);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: b */
    public final long mo7269b(long j) {
        long jMo7269b = this.f9069g[0].mo7269b(j);
        int i = 1;
        while (true) {
            InterfaceC1649r[] interfaceC1649rArr = this.f9069g;
            if (i >= interfaceC1649rArr.length) {
                return jMo7269b;
            }
            if (interfaceC1649rArr[i].mo7269b(jMo7269b) != jMo7269b) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: b */
    public final C1621af mo7270b() {
        return this.f9068f;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: c */
    public final long mo7271c() {
        long jMo7271c = this.f9063a[0].mo7271c();
        int i = 1;
        while (true) {
            InterfaceC1649r[] interfaceC1649rArr = this.f9063a;
            if (i >= interfaceC1649rArr.length) {
                if (jMo7271c != C1500b.f7455b) {
                    for (InterfaceC1649r interfaceC1649r : this.f9069g) {
                        if (interfaceC1649r != this.f9063a[0] && interfaceC1649r.mo7269b(jMo7271c) != jMo7271c) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                }
                return jMo7271c;
            }
            if (interfaceC1649rArr[i].mo7271c() != C1500b.f7455b) {
                throw new IllegalStateException("Child reported discontinuity.");
            }
            i++;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: c */
    public final boolean mo7272c(long j) {
        if (this.f9066d.isEmpty()) {
            return this.f9070h.mo7272c(j);
        }
        int size = this.f9066d.size();
        for (int i = 0; i < size; i++) {
            this.f9066d.get(i).mo7272c(j);
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: d */
    public final long mo7273d() {
        return this.f9070h.mo7273d();
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: e */
    public final long mo7274e() {
        return this.f9070h.mo7274e();
    }
}
