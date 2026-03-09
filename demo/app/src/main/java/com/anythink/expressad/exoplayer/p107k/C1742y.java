package com.anythink.expressad.exoplayer.p107k;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1742y {

    /* JADX INFO: renamed from: a */
    private static final Comparator<a> f9806a = new Comparator<a>() { // from class: com.anythink.expressad.exoplayer.k.y.1
        /* JADX INFO: renamed from: a */
        private static int m8312a(a aVar, a aVar2) {
            return aVar.f9819a - aVar2.f9819a;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            return aVar.f9819a - aVar2.f9819a;
        }
    };

    /* JADX INFO: renamed from: b */
    private static final Comparator<a> f9807b = new Comparator<a>() { // from class: com.anythink.expressad.exoplayer.k.y.2
        /* JADX INFO: renamed from: a */
        private static int m8313a(a aVar, a aVar2) {
            float f = aVar.f9821c;
            float f2 = aVar2.f9821c;
            if (f < f2) {
                return -1;
            }
            return f2 < f ? 1 : 0;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            float f = aVar.f9821c;
            float f2 = aVar2.f9821c;
            if (f < f2) {
                return -1;
            }
            return f2 < f ? 1 : 0;
        }
    };

    /* JADX INFO: renamed from: c */
    private static final int f9808c = -1;

    /* JADX INFO: renamed from: d */
    private static final int f9809d = 0;

    /* JADX INFO: renamed from: e */
    private static final int f9810e = 1;

    /* JADX INFO: renamed from: f */
    private static final int f9811f = 5;

    /* JADX INFO: renamed from: g */
    private final int f9812g;

    /* JADX INFO: renamed from: k */
    private int f9816k;

    /* JADX INFO: renamed from: l */
    private int f9817l;

    /* JADX INFO: renamed from: m */
    private int f9818m;

    /* JADX INFO: renamed from: i */
    private final a[] f9814i = new a[5];

    /* JADX INFO: renamed from: h */
    private final ArrayList<a> f9813h = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    private int f9815j = -1;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.y$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f9819a;

        /* JADX INFO: renamed from: b */
        public int f9820b;

        /* JADX INFO: renamed from: c */
        public float f9821c;

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public C1742y(int i) {
        this.f9812g = i;
    }

    /* JADX INFO: renamed from: b */
    private void m8308b() {
        if (this.f9815j != 1) {
            Collections.sort(this.f9813h, f9806a);
            this.f9815j = 1;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m8309c() {
        if (this.f9815j != 0) {
            Collections.sort(this.f9813h, f9807b);
            this.f9815j = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m8310a() {
        if (this.f9815j != 0) {
            Collections.sort(this.f9813h, f9807b);
            this.f9815j = 0;
        }
        float f = this.f9817l * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.f9813h.size(); i2++) {
            a aVar = this.f9813h.get(i2);
            i += aVar.f9820b;
            if (i >= f) {
                return aVar.f9821c;
            }
        }
        if (this.f9813h.isEmpty()) {
            return Float.NaN;
        }
        return this.f9813h.get(r0.size() - 1).f9821c;
    }

    /* JADX INFO: renamed from: a */
    public final void m8311a(int i, float f) {
        a aVar;
        int i2;
        a aVar2;
        int i3;
        if (this.f9815j != 1) {
            Collections.sort(this.f9813h, f9806a);
            this.f9815j = 1;
        }
        int i4 = this.f9818m;
        byte b = 0;
        if (i4 > 0) {
            a[] aVarArr = this.f9814i;
            int i5 = i4 - 1;
            this.f9818m = i5;
            aVar = aVarArr[i5];
        } else {
            aVar = new a(b);
        }
        int i6 = this.f9816k;
        this.f9816k = i6 + 1;
        aVar.f9819a = i6;
        aVar.f9820b = i;
        aVar.f9821c = f;
        this.f9813h.add(aVar);
        int i7 = this.f9817l + i;
        while (true) {
            this.f9817l = i7;
            while (true) {
                int i8 = this.f9817l;
                int i9 = this.f9812g;
                if (i8 <= i9) {
                    return;
                }
                i2 = i8 - i9;
                aVar2 = this.f9813h.get(0);
                i3 = aVar2.f9820b;
                if (i3 <= i2) {
                    this.f9817l -= i3;
                    this.f9813h.remove(0);
                    int i10 = this.f9818m;
                    if (i10 < 5) {
                        a[] aVarArr2 = this.f9814i;
                        this.f9818m = i10 + 1;
                        aVarArr2[i10] = aVar2;
                    }
                }
            }
            aVar2.f9820b = i3 - i2;
            i7 = this.f9817l - i2;
        }
    }
}
