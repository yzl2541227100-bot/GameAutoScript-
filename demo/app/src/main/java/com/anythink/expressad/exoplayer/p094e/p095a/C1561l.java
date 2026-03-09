package com.anythink.expressad.exoplayer.p094e.p095a;

import com.anythink.expressad.exoplayer.p094e.InterfaceC1567f;
import com.anythink.expressad.exoplayer.p107k.C1736s;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1561l {

    /* JADX INFO: renamed from: a */
    public C1552c f8333a;

    /* JADX INFO: renamed from: b */
    public long f8334b;

    /* JADX INFO: renamed from: c */
    public long f8335c;

    /* JADX INFO: renamed from: d */
    public long f8336d;

    /* JADX INFO: renamed from: e */
    public int f8337e;

    /* JADX INFO: renamed from: f */
    public int f8338f;

    /* JADX INFO: renamed from: g */
    public long[] f8339g;

    /* JADX INFO: renamed from: h */
    public int[] f8340h;

    /* JADX INFO: renamed from: i */
    public int[] f8341i;

    /* JADX INFO: renamed from: j */
    public int[] f8342j;

    /* JADX INFO: renamed from: k */
    public long[] f8343k;

    /* JADX INFO: renamed from: l */
    public boolean[] f8344l;

    /* JADX INFO: renamed from: m */
    public boolean f8345m;

    /* JADX INFO: renamed from: n */
    public boolean[] f8346n;

    /* JADX INFO: renamed from: o */
    public C1560k f8347o;

    /* JADX INFO: renamed from: p */
    public int f8348p;

    /* JADX INFO: renamed from: q */
    public C1736s f8349q;

    /* JADX INFO: renamed from: r */
    public boolean f8350r;

    /* JADX INFO: renamed from: s */
    public long f8351s;

    /* JADX INFO: renamed from: a */
    private void m6950a(InterfaceC1567f interfaceC1567f) {
        interfaceC1567f.mo6970b(this.f8349q.f9792a, 0, this.f8348p);
        this.f8349q.m8272c(0);
        this.f8350r = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m6951a() {
        this.f8337e = 0;
        this.f8351s = 0L;
        this.f8345m = false;
        this.f8350r = false;
        this.f8347o = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m6952a(int i) {
        C1736s c1736s = this.f8349q;
        if (c1736s == null || c1736s.m8269b() < i) {
            this.f8349q = new C1736s(i);
        }
        this.f8348p = i;
        this.f8345m = true;
        this.f8350r = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m6953a(int i, int i2) {
        this.f8337e = i;
        this.f8338f = i2;
        int[] iArr = this.f8340h;
        if (iArr == null || iArr.length < i) {
            this.f8339g = new long[i];
            this.f8340h = new int[i];
        }
        int[] iArr2 = this.f8341i;
        if (iArr2 == null || iArr2.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f8341i = new int[i3];
            this.f8342j = new int[i3];
            this.f8343k = new long[i3];
            this.f8344l = new boolean[i3];
            this.f8346n = new boolean[i3];
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6954a(C1736s c1736s) {
        c1736s.m8268a(this.f8349q.f9792a, 0, this.f8348p);
        this.f8349q.m8272c(0);
        this.f8350r = false;
    }

    /* JADX INFO: renamed from: b */
    public final long m6955b(int i) {
        return this.f8343k[i] + ((long) this.f8342j[i]);
    }
}
