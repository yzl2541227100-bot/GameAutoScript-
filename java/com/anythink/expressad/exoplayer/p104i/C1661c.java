package com.anythink.expressad.exoplayer.p104i;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p101h.C1620ae;
import com.anythink.expressad.exoplayer.p101h.C1621af;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import com.anythink.expressad.exoplayer.p104i.InterfaceC1664f;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1687d;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1661c extends AbstractC1663e {

    /* JADX INFO: renamed from: a */
    private static final float f9157a = 0.98f;

    /* JADX INFO: renamed from: b */
    private static final int[] f9158b = new int[0];

    /* JADX INFO: renamed from: c */
    private static final int f9159c = 1000;

    /* JADX INFO: renamed from: d */
    @Nullable
    private final InterfaceC1664f.a f9160d;

    /* JADX INFO: renamed from: e */
    private final AtomicReference<c> f9161e;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f9162a;

        /* JADX INFO: renamed from: b */
        public final int f9163b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final String f9164c;

        public a(int i, int i2, @Nullable String str) {
            this.f9162a = i;
            this.f9163b = i2;
            this.f9164c = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f9162a == aVar.f9162a && this.f9163b == aVar.f9163b && TextUtils.equals(this.f9164c, aVar.f9164c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = ((this.f9162a * 31) + this.f9163b) * 31;
            String str = this.f9164c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.c$b */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a */
        private final c f9165a;

        /* JADX INFO: renamed from: b */
        private final int f9166b;

        /* JADX INFO: renamed from: c */
        private final int f9167c;

        /* JADX INFO: renamed from: d */
        private final int f9168d;

        /* JADX INFO: renamed from: e */
        private final int f9169e;

        /* JADX INFO: renamed from: f */
        private final int f9170f;

        /* JADX INFO: renamed from: g */
        private final int f9171g;

        public b(C1753m c1753m, c cVar, int i) {
            this.f9165a = cVar;
            this.f9166b = C1661c.m7603a(i, false) ? 1 : 0;
            this.f9167c = C1661c.m7606a(c1753m, cVar.f9173b) ? 1 : 0;
            this.f9168d = (c1753m.f9989z & 1) != 0 ? 1 : 0;
            this.f9169e = c1753m.f9984u;
            this.f9170f = c1753m.f9985v;
            this.f9171g = c1753m.f9967d;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a */
        public final int compareTo(b bVar) {
            int i = this.f9166b;
            int i2 = bVar.f9166b;
            if (i != i2) {
                return C1661c.m7589a(i, i2);
            }
            int i3 = this.f9167c;
            int i4 = bVar.f9167c;
            if (i3 != i4) {
                return C1661c.m7589a(i3, i4);
            }
            int i5 = this.f9168d;
            int i6 = bVar.f9168d;
            if (i5 != i6) {
                return C1661c.m7589a(i5, i6);
            }
            if (this.f9165a.f9184m) {
                return C1661c.m7589a(bVar.f9171g, this.f9171g);
            }
            int i7 = i != 1 ? -1 : 1;
            int i8 = this.f9169e;
            int i9 = bVar.f9169e;
            return i7 * ((i8 == i9 && (i8 = this.f9170f) == (i9 = bVar.f9170f)) ? C1661c.m7589a(this.f9171g, bVar.f9171g) : C1661c.m7589a(i8, i9));
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f9166b == bVar.f9166b && this.f9167c == bVar.f9167c && this.f9168d == bVar.f9168d && this.f9169e == bVar.f9169e && this.f9170f == bVar.f9170f && this.f9171g == bVar.f9171g) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((((((((this.f9166b * 31) + this.f9167c) * 31) + this.f9168d) * 31) + this.f9169e) * 31) + this.f9170f) * 31) + this.f9171g;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.c$c */
    public static final class c implements Parcelable {

        /* JADX INFO: renamed from: b */
        @Nullable
        public final String f9173b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final String f9174c;

        /* JADX INFO: renamed from: d */
        public final boolean f9175d;

        /* JADX INFO: renamed from: e */
        public final int f9176e;

        /* JADX INFO: renamed from: f */
        public final int f9177f;

        /* JADX INFO: renamed from: g */
        public final int f9178g;

        /* JADX INFO: renamed from: h */
        public final int f9179h;

        /* JADX INFO: renamed from: i */
        public final boolean f9180i;

        /* JADX INFO: renamed from: j */
        public final int f9181j;

        /* JADX INFO: renamed from: k */
        public final int f9182k;

        /* JADX INFO: renamed from: l */
        public final boolean f9183l;

        /* JADX INFO: renamed from: m */
        public final boolean f9184m;

        /* JADX INFO: renamed from: n */
        public final boolean f9185n;

        /* JADX INFO: renamed from: o */
        public final boolean f9186o;

        /* JADX INFO: renamed from: p */
        public final boolean f9187p;

        /* JADX INFO: renamed from: q */
        public final int f9188q;

        /* JADX INFO: renamed from: r */
        private final SparseArray<Map<C1621af, e>> f9189r;

        /* JADX INFO: renamed from: s */
        private final SparseBooleanArray f9190s;

        /* JADX INFO: renamed from: a */
        public static final c f9172a = new c();
        public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.anythink.expressad.exoplayer.i.c.c.1
            /* JADX INFO: renamed from: a */
            private static c m7639a(Parcel parcel) {
                return new c(parcel);
            }

            /* JADX INFO: renamed from: a */
            private static c[] m7640a(int i) {
                return new c[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ c[] newArray(int i) {
                return new c[i];
            }
        };

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.c$c$1 */
        public class AnonymousClass1 implements Parcelable.Creator<c> {
            /* JADX INFO: renamed from: a */
            private static c m7639a(Parcel parcel) {
                return new c(parcel);
            }

            /* JADX INFO: renamed from: a */
            private static c[] m7640a(int i) {
                return new c[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ c[] newArray(int i) {
                return new c[i];
            }
        }

        private c() {
            this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
        }

        public c(Parcel parcel) {
            this.f9189r = m7628a(parcel);
            this.f9190s = parcel.readSparseBooleanArray();
            this.f9173b = parcel.readString();
            this.f9174c = parcel.readString();
            this.f9175d = C1717af.m8084a(parcel);
            this.f9176e = parcel.readInt();
            this.f9184m = C1717af.m8084a(parcel);
            this.f9185n = C1717af.m8084a(parcel);
            this.f9186o = C1717af.m8084a(parcel);
            this.f9177f = parcel.readInt();
            this.f9178g = parcel.readInt();
            this.f9179h = parcel.readInt();
            this.f9180i = C1717af.m8084a(parcel);
            this.f9187p = C1717af.m8084a(parcel);
            this.f9181j = parcel.readInt();
            this.f9182k = parcel.readInt();
            this.f9183l = C1717af.m8084a(parcel);
            this.f9188q = parcel.readInt();
        }

        public c(SparseArray<Map<C1621af, e>> sparseArray, SparseBooleanArray sparseBooleanArray, @Nullable String str, @Nullable String str2, boolean z, int i, boolean z3, boolean z4, boolean z5, int i2, int i3, int i4, boolean z6, boolean z7, int i5, int i6, boolean z8, int i7) {
            this.f9189r = sparseArray;
            this.f9190s = sparseBooleanArray;
            this.f9173b = C1717af.m8098b(str);
            this.f9174c = C1717af.m8098b(str2);
            this.f9175d = z;
            this.f9176e = i;
            this.f9184m = z3;
            this.f9185n = z4;
            this.f9186o = z5;
            this.f9177f = i2;
            this.f9178g = i3;
            this.f9179h = i4;
            this.f9180i = z6;
            this.f9187p = z7;
            this.f9181j = i5;
            this.f9182k = i6;
            this.f9183l = z8;
            this.f9188q = i7;
        }

        /* JADX INFO: renamed from: a */
        private static SparseArray<Map<C1621af, e>> m7628a(Parcel parcel) {
            int i = parcel.readInt();
            SparseArray<Map<C1621af, e>> sparseArray = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                HashMap map = new HashMap(i4);
                for (int i5 = 0; i5 < i4; i5++) {
                    map.put((C1621af) parcel.readParcelable(C1621af.class.getClassLoader()), (e) parcel.readParcelable(e.class.getClassLoader()));
                }
                sparseArray.put(i3, map);
            }
            return sparseArray;
        }

        /* JADX INFO: renamed from: a */
        private d m7630a() {
            return new d(this, (byte) 0);
        }

        /* JADX INFO: renamed from: a */
        private static void m7631a(Parcel parcel, SparseArray<Map<C1621af, e>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                Map<C1621af, e> mapValueAt = sparseArray.valueAt(i);
                int size2 = mapValueAt.size();
                parcel.writeInt(iKeyAt);
                parcel.writeInt(size2);
                for (Map.Entry<C1621af, e> entry : mapValueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0064 A[LOOP:0: B:39:0x000d->B:56:0x0064, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0067 A[EDGE_INSN: B:61:0x0067->B:57:0x0067 BREAK  A[LOOP:0: B:39:0x000d->B:56:0x0064], SYNTHETIC] */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean m7632a(android.util.SparseArray<java.util.Map<com.anythink.expressad.exoplayer.p101h.C1621af, com.anythink.expressad.exoplayer.p104i.C1661c.e>> r9, android.util.SparseArray<java.util.Map<com.anythink.expressad.exoplayer.p101h.C1621af, com.anythink.expressad.exoplayer.p104i.C1661c.e>> r10) {
            /*
                int r0 = r9.size()
                int r1 = r10.size()
                r2 = 0
                if (r1 == r0) goto Lc
                return r2
            Lc:
                r1 = 0
            Ld:
                r3 = 1
                if (r1 >= r0) goto L68
                int r4 = r9.keyAt(r1)
                int r4 = r10.indexOfKey(r4)
                if (r4 < 0) goto L67
                java.lang.Object r5 = r9.valueAt(r1)
                java.util.Map r5 = (java.util.Map) r5
                java.lang.Object r4 = r10.valueAt(r4)
                java.util.Map r4 = (java.util.Map) r4
                int r6 = r5.size()
                int r7 = r4.size()
                if (r7 == r6) goto L32
            L30:
                r3 = 0
                goto L61
            L32:
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L3a:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L61
                java.lang.Object r6 = r5.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r7 = r6.getKey()
                com.anythink.expressad.exoplayer.h.af r7 = (com.anythink.expressad.exoplayer.p101h.C1621af) r7
                boolean r8 = r4.containsKey(r7)
                if (r8 == 0) goto L30
                java.lang.Object r6 = r6.getValue()
                java.lang.Object r7 = r4.get(r7)
                boolean r6 = com.anythink.expressad.exoplayer.p107k.C1717af.m8085a(r6, r7)
                if (r6 != 0) goto L3a
                goto L30
            L61:
                if (r3 != 0) goto L64
                goto L67
            L64:
                int r1 = r1 + 1
                goto Ld
            L67:
                return r2
            L68:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p104i.C1661c.c.m7632a(android.util.SparseArray, android.util.SparseArray):boolean");
        }

        /* JADX INFO: renamed from: a */
        private static boolean m7633a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: a */
        private static boolean m7634a(Map<C1621af, e> map, Map<C1621af, e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<C1621af, e> entry : map.entrySet()) {
                C1621af key = entry.getKey();
                if (!map2.containsKey(key) || !C1717af.m8085a(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m7636a(int i) {
            return this.f9190s.get(i);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m7637a(int i, C1621af c1621af) {
            Map<C1621af, e> map = this.f9189r.get(i);
            return map != null && map.containsKey(c1621af);
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final e m7638b(int i, C1621af c1621af) {
            Map<C1621af, e> map = this.f9189r.get(i);
            if (map != null) {
                return map.get(c1621af);
            }
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:141:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x0107 A[LOOP:0: B:145:0x00b0->B:162:0x0107, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:165:0x010d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:167:0x00ad A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean equals(@androidx.annotation.Nullable java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 271
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p104i.C1661c.c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            int i = (((((((((((((((((((((((((((this.f9175d ? 1 : 0) * 31) + this.f9176e) * 31) + (this.f9184m ? 1 : 0)) * 31) + (this.f9185n ? 1 : 0)) * 31) + (this.f9186o ? 1 : 0)) * 31) + this.f9177f) * 31) + this.f9178g) * 31) + (this.f9180i ? 1 : 0)) * 31) + (this.f9187p ? 1 : 0)) * 31) + (this.f9183l ? 1 : 0)) * 31) + this.f9181j) * 31) + this.f9182k) * 31) + this.f9179h) * 31) + this.f9188q) * 31;
            String str = this.f9173b;
            int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f9174c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            SparseArray<Map<C1621af, e>> sparseArray = this.f9189r;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                Map<C1621af, e> mapValueAt = sparseArray.valueAt(i2);
                int size2 = mapValueAt.size();
                parcel.writeInt(iKeyAt);
                parcel.writeInt(size2);
                for (Map.Entry<C1621af, e> entry : mapValueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.f9190s);
            parcel.writeString(this.f9173b);
            parcel.writeString(this.f9174c);
            C1717af.m8072a(parcel, this.f9175d);
            parcel.writeInt(this.f9176e);
            C1717af.m8072a(parcel, this.f9184m);
            C1717af.m8072a(parcel, this.f9185n);
            C1717af.m8072a(parcel, this.f9186o);
            parcel.writeInt(this.f9177f);
            parcel.writeInt(this.f9178g);
            parcel.writeInt(this.f9179h);
            C1717af.m8072a(parcel, this.f9180i);
            C1717af.m8072a(parcel, this.f9187p);
            parcel.writeInt(this.f9181j);
            parcel.writeInt(this.f9182k);
            C1717af.m8072a(parcel, this.f9183l);
            parcel.writeInt(this.f9188q);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.c$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        private final SparseArray<Map<C1621af, e>> f9191a;

        /* JADX INFO: renamed from: b */
        private final SparseBooleanArray f9192b;

        /* JADX INFO: renamed from: c */
        @Nullable
        private String f9193c;

        /* JADX INFO: renamed from: d */
        @Nullable
        private String f9194d;

        /* JADX INFO: renamed from: e */
        private boolean f9195e;

        /* JADX INFO: renamed from: f */
        private int f9196f;

        /* JADX INFO: renamed from: g */
        private boolean f9197g;

        /* JADX INFO: renamed from: h */
        private boolean f9198h;

        /* JADX INFO: renamed from: i */
        private boolean f9199i;

        /* JADX INFO: renamed from: j */
        private int f9200j;

        /* JADX INFO: renamed from: k */
        private int f9201k;

        /* JADX INFO: renamed from: l */
        private int f9202l;

        /* JADX INFO: renamed from: m */
        private boolean f9203m;

        /* JADX INFO: renamed from: n */
        private boolean f9204n;

        /* JADX INFO: renamed from: o */
        private int f9205o;

        /* JADX INFO: renamed from: p */
        private int f9206p;

        /* JADX INFO: renamed from: q */
        private boolean f9207q;

        /* JADX INFO: renamed from: r */
        private int f9208r;

        public d() {
            this(c.f9172a);
        }

        private d(c cVar) {
            this.f9191a = m7641a((SparseArray<Map<C1621af, e>>) cVar.f9189r);
            this.f9192b = cVar.f9190s.clone();
            this.f9193c = cVar.f9173b;
            this.f9194d = cVar.f9174c;
            this.f9195e = cVar.f9175d;
            this.f9196f = cVar.f9176e;
            this.f9197g = cVar.f9184m;
            this.f9198h = cVar.f9185n;
            this.f9199i = cVar.f9186o;
            this.f9200j = cVar.f9177f;
            this.f9201k = cVar.f9178g;
            this.f9202l = cVar.f9179h;
            this.f9203m = cVar.f9180i;
            this.f9204n = cVar.f9187p;
            this.f9205o = cVar.f9181j;
            this.f9206p = cVar.f9182k;
            this.f9207q = cVar.f9183l;
            this.f9208r = cVar.f9188q;
        }

        public /* synthetic */ d(c cVar, byte b) {
            this(cVar);
        }

        /* JADX INFO: renamed from: a */
        private static SparseArray<Map<C1621af, e>> m7641a(SparseArray<Map<C1621af, e>> sparseArray) {
            SparseArray<Map<C1621af, e>> sparseArray2 = new SparseArray<>();
            for (int i = 0; i < sparseArray.size(); i++) {
                sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
            }
            return sparseArray2;
        }

        /* JADX INFO: renamed from: a */
        private d m7642a(int i, int i2) {
            this.f9200j = i;
            this.f9201k = i2;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private d m7643a(int i, int i2, boolean z) {
            this.f9205o = i;
            this.f9206p = i2;
            this.f9207q = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private d m7644a(Context context, boolean z) {
            Point pointM8062a = C1717af.m8062a(context);
            return m7643a(pointM8062a.x, pointM8062a.y, z);
        }

        /* JADX INFO: renamed from: a */
        private d m7645a(String str) {
            this.f9193c = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private d m7646a(boolean z) {
            this.f9195e = z;
            return this;
        }

        /* JADX INFO: renamed from: b */
        private d m7647b(String str) {
            this.f9194d = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        private d m7648b(boolean z) {
            this.f9197g = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        private d m7649c() {
            return m7642a(1279, 719);
        }

        /* JADX INFO: renamed from: c */
        private d m7650c(int i) {
            this.f9196f = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        private d m7651c(boolean z) {
            this.f9198h = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        private d m7652d() {
            return m7642a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        /* JADX INFO: renamed from: d */
        private d m7653d(int i) {
            this.f9202l = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        private d m7654d(boolean z) {
            this.f9199i = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        private d m7655e() {
            return m7643a(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        /* JADX INFO: renamed from: e */
        private d m7656e(boolean z) {
            this.f9203m = z;
            return this;
        }

        /* JADX INFO: renamed from: f */
        private d m7657f(boolean z) {
            this.f9204n = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final d m7658a() {
            if (this.f9191a.size() == 0) {
                return this;
            }
            this.f9191a.clear();
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final d m7659a(int i) {
            Map<C1621af, e> map = this.f9191a.get(i);
            if (map != null && !map.isEmpty()) {
                this.f9191a.remove(i);
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final d m7660a(int i, C1621af c1621af) {
            Map<C1621af, e> map = this.f9191a.get(i);
            if (map != null && map.containsKey(c1621af)) {
                map.remove(c1621af);
                if (map.isEmpty()) {
                    this.f9191a.remove(i);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final d m7661a(int i, C1621af c1621af, e eVar) {
            Map<C1621af, e> map = this.f9191a.get(i);
            if (map == null) {
                map = new HashMap<>();
                this.f9191a.put(i, map);
            }
            if (map.containsKey(c1621af) && C1717af.m8085a(map.get(c1621af), eVar)) {
                return this;
            }
            map.put(c1621af, eVar);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final d m7662a(int i, boolean z) {
            if (this.f9192b.get(i) == z) {
                return this;
            }
            if (z) {
                this.f9192b.put(i, true);
            } else {
                this.f9192b.delete(i);
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final c m7663b() {
            return new c(this.f9191a, this.f9192b, this.f9193c, this.f9194d, this.f9195e, this.f9196f, this.f9197g, this.f9198h, this.f9199i, this.f9200j, this.f9201k, this.f9202l, this.f9203m, this.f9204n, this.f9205o, this.f9206p, this.f9207q, this.f9208r);
        }

        /* JADX INFO: renamed from: b */
        public final d m7664b(int i) {
            if (this.f9208r != i) {
                this.f9208r = i;
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.c$e */
    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.anythink.expressad.exoplayer.i.c.e.1
            /* JADX INFO: renamed from: a */
            private static e m7666a(Parcel parcel) {
                return new e(parcel);
            }

            /* JADX INFO: renamed from: a */
            private static e[] m7667a(int i) {
                return new e[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ e[] newArray(int i) {
                return new e[i];
            }
        };

        /* JADX INFO: renamed from: a */
        public final int f9209a;

        /* JADX INFO: renamed from: b */
        public final int[] f9210b;

        /* JADX INFO: renamed from: c */
        public final int f9211c;

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.c$e$1 */
        public class AnonymousClass1 implements Parcelable.Creator<e> {
            /* JADX INFO: renamed from: a */
            private static e m7666a(Parcel parcel) {
                return new e(parcel);
            }

            /* JADX INFO: renamed from: a */
            private static e[] m7667a(int i) {
                return new e[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ e[] newArray(int i) {
                return new e[i];
            }
        }

        private e(int i, int... iArr) {
            this.f9209a = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f9210b = iArrCopyOf;
            this.f9211c = iArr.length;
            Arrays.sort(iArrCopyOf);
        }

        public e(Parcel parcel) {
            this.f9209a = parcel.readInt();
            int i = parcel.readByte();
            this.f9211c = i;
            int[] iArr = new int[i];
            this.f9210b = iArr;
            parcel.readIntArray(iArr);
        }

        /* JADX INFO: renamed from: a */
        private boolean m7665a(int i) {
            for (int i2 : this.f9210b) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f9209a == eVar.f9209a && Arrays.equals(this.f9210b, eVar.f9210b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f9209a * 31) + Arrays.hashCode(this.f9210b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9209a);
            parcel.writeInt(this.f9210b.length);
            parcel.writeIntArray(this.f9210b);
        }
    }

    public C1661c() {
        this((InterfaceC1664f.a) null);
    }

    private C1661c(@Nullable InterfaceC1664f.a aVar) {
        this.f9160d = aVar;
        this.f9161e = new AtomicReference<>(c.f9172a);
    }

    private C1661c(InterfaceC1687d interfaceC1687d) {
        this(new C1659a.a(interfaceC1687d));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m7589a(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* JADX INFO: renamed from: a */
    private static int m7590a(C1620ae c1620ae, int[] iArr, int i, @Nullable String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int iIntValue = list.get(i6).intValue();
            if (m7607a(c1620ae.m7294a(iIntValue), str, iArr[iIntValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    /* JADX INFO: renamed from: a */
    private static int m7591a(C1620ae c1620ae, int[] iArr, a aVar) {
        int i = 0;
        for (int i2 = 0; i2 < c1620ae.f8750a; i2++) {
            if (m7605a(c1620ae.m7294a(i2), iArr[i2], aVar)) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0010  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point m7592a(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.anythink.expressad.exoplayer.p107k.C1717af.m8049a(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.anythink.expressad.exoplayer.p107k.C1717af.m8049a(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p104i.C1661c.m7592a(boolean, int, int, int, int):android.graphics.Point");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00fd A[LOOP:0: B:72:0x0022->B:101:0x00fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x003d  */
    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.anythink.expressad.exoplayer.p104i.InterfaceC1664f m7593a(com.anythink.expressad.exoplayer.p101h.C1621af r25, int[][] r26, int r27, com.anythink.expressad.exoplayer.p104i.C1661c.c r28, @androidx.annotation.Nullable com.anythink.expressad.exoplayer.p104i.InterfaceC1664f.a r29) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p104i.C1661c.m7593a(com.anythink.expressad.exoplayer.h.af, int[][], int, com.anythink.expressad.exoplayer.i.c$c, com.anythink.expressad.exoplayer.i.f$a):com.anythink.expressad.exoplayer.i.f");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0085  */
    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.anythink.expressad.exoplayer.p104i.InterfaceC1664f m7594a(com.anythink.expressad.exoplayer.p101h.C1621af r18, int[][] r19, com.anythink.expressad.exoplayer.p104i.C1661c.c r20) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p104i.C1661c.m7594a(com.anythink.expressad.exoplayer.h.af, int[][], com.anythink.expressad.exoplayer.i.c$c):com.anythink.expressad.exoplayer.i.f");
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    private static InterfaceC1664f m7595a(C1621af c1621af, int[][] iArr, c cVar, @Nullable InterfaceC1664f.a aVar) {
        int[] iArr2;
        int iM7591a;
        b bVar = null;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < c1621af.f8754b; i3++) {
            C1620ae c1620aeM7299a = c1621af.m7299a(i3);
            int[] iArr3 = iArr[i3];
            for (int i4 = 0; i4 < c1620aeM7299a.f8750a; i4++) {
                if (m7603a(iArr3[i4], cVar.f9187p)) {
                    b bVar2 = new b(c1620aeM7299a.m7294a(i4), cVar, iArr3[i4]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        i = i3;
                        i2 = i4;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        C1620ae c1620aeM7299a2 = c1621af.m7299a(i);
        if (!cVar.f9184m && aVar != null) {
            int[] iArr4 = iArr[i];
            boolean z = cVar.f9185n;
            HashSet hashSet = new HashSet();
            a aVar2 = null;
            int i5 = 0;
            for (int i6 = 0; i6 < c1620aeM7299a2.f8750a; i6++) {
                C1753m c1753mM7294a = c1620aeM7299a2.m7294a(i6);
                a aVar3 = new a(c1753mM7294a.f9984u, c1753mM7294a.f9985v, z ? null : c1753mM7294a.f9971h);
                if (hashSet.add(aVar3) && (iM7591a = m7591a(c1620aeM7299a2, iArr4, aVar3)) > i5) {
                    i5 = iM7591a;
                    aVar2 = aVar3;
                }
            }
            if (i5 > 1) {
                iArr2 = new int[i5];
                int i7 = 0;
                for (int i8 = 0; i8 < c1620aeM7299a2.f8750a; i8++) {
                    if (m7605a(c1620aeM7299a2.m7294a(i8), iArr4[i8], (a) C1711a.m8005a(aVar2))) {
                        iArr2[i7] = i8;
                        i7++;
                    }
                }
            } else {
                iArr2 = f9158b;
            }
            if (iArr2.length > 0) {
                return aVar.mo7576a(c1620aeM7299a2, iArr2);
            }
        }
        return new C1662d(c1620aeM7299a2, i2);
    }

    /* JADX INFO: renamed from: a */
    private static List<Integer> m7596a(C1620ae c1620ae, int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = new ArrayList(c1620ae.f8750a);
        for (int i4 = 0; i4 < c1620ae.f8750a; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < c1620ae.f8750a; i6++) {
                C1753m c1753mM7294a = c1620ae.m7294a(i6);
                int i7 = c1753mM7294a.f9976m;
                if (i7 > 0 && (i3 = c1753mM7294a.f9977n) > 0) {
                    Point pointM7592a = m7592a(z, i, i2, i7, i3);
                    int i8 = c1753mM7294a.f9976m;
                    int i9 = c1753mM7294a.f9977n;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (pointM7592a.x * f9157a)) && i9 >= ((int) (pointM7592a.y * f9157a)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int iM8409a = c1620ae.m7294a(((Integer) arrayList.get(size)).intValue()).m8409a();
                    if (iM8409a == -1 || iM8409a > i5) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    private void m7597a(int i, C1621af c1621af, e eVar) {
        m7599a(m7624d().m7661a(i, c1621af, eVar));
    }

    /* JADX INFO: renamed from: a */
    private void m7598a(c cVar) {
        C1711a.m8005a(cVar);
        if (this.f9161e.getAndSet(cVar).equals(cVar)) {
            return;
        }
        m7690b();
    }

    /* JADX INFO: renamed from: a */
    private void m7599a(d dVar) {
        c cVarM7663b = dVar.m7663b();
        C1711a.m8005a(cVarM7663b);
        if (this.f9161e.getAndSet(cVarM7663b).equals(cVarM7663b)) {
            return;
        }
        m7690b();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0058 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m7600a(com.anythink.expressad.exoplayer.p104i.AbstractC1663e.a r15, int[][][] r16, com.anythink.expressad.exoplayer.C1495aa[] r17, com.anythink.expressad.exoplayer.p104i.InterfaceC1664f[] r18, int r19) {
        /*
            r0 = r15
            r1 = r19
            if (r1 != 0) goto L6
            return
        L6:
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
        Lb:
            int r7 = r15.m7681a()
            r8 = 1
            if (r4 >= r7) goto L5b
            int r7 = r15.m7682a(r4)
            r9 = r18[r4]
            if (r7 == r8) goto L1d
            r10 = 2
            if (r7 != r10) goto L58
        L1d:
            if (r9 == 0) goto L58
            r10 = r16[r4]
            com.anythink.expressad.exoplayer.h.af r11 = r15.m7686b(r4)
            if (r9 != 0) goto L29
        L27:
            r9 = 0
            goto L4a
        L29:
            com.anythink.expressad.exoplayer.h.ae r12 = r9.mo7584f()
            int r11 = r11.m7298a(r12)
            r12 = 0
        L32:
            int r13 = r9.mo7585g()
            if (r12 >= r13) goto L49
            r13 = r10[r11]
            int r14 = r9.mo7580b(r12)
            r13 = r13[r14]
            r14 = 32
            r13 = r13 & r14
            if (r13 == r14) goto L46
            goto L27
        L46:
            int r12 = r12 + 1
            goto L32
        L49:
            r9 = 1
        L4a:
            if (r9 == 0) goto L58
            if (r7 != r8) goto L53
            if (r6 == r2) goto L51
            goto L55
        L51:
            r6 = r4
            goto L58
        L53:
            if (r5 == r2) goto L57
        L55:
            r0 = 0
            goto L5c
        L57:
            r5 = r4
        L58:
            int r4 = r4 + 1
            goto Lb
        L5b:
            r0 = 1
        L5c:
            if (r6 == r2) goto L61
            if (r5 == r2) goto L61
            r3 = 1
        L61:
            r0 = r0 & r3
            if (r0 == 0) goto L6d
            com.anythink.expressad.exoplayer.aa r0 = new com.anythink.expressad.exoplayer.aa
            r0.<init>(r1)
            r17[r6] = r0
            r17[r5] = r0
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p104i.C1661c.m7600a(com.anythink.expressad.exoplayer.i.e$a, int[][][], com.anythink.expressad.exoplayer.aa[], com.anythink.expressad.exoplayer.i.f[], int):void");
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    private boolean m7601a(int i) {
        return m7620c().m7636a(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    private boolean m7602a(int i, C1621af c1621af) {
        return m7620c().m7637a(i, c1621af);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7603a(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7604a(C1753m c1753m) {
        return TextUtils.isEmpty(c1753m.f9963A) || m7606a(c1753m, C1500b.f7446ar);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7605a(C1753m c1753m, int i, a aVar) {
        String str;
        return m7603a(i, false) && c1753m.f9984u == aVar.f9162a && c1753m.f9985v == aVar.f9163b && ((str = aVar.f9164c) == null || TextUtils.equals(str, c1753m.f9971h));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7606a(C1753m c1753m, @Nullable String str) {
        return str != null && TextUtils.equals(str, C1717af.m8098b(c1753m.f9963A));
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7607a(C1753m c1753m, @Nullable String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        return m7603a(i, false) && (i & i2) != 0 && (str == null || C1717af.m8085a((Object) c1753m.f9971h, (Object) str)) && (((i6 = c1753m.f9976m) == -1 || i6 <= i3) && (((i7 = c1753m.f9977n) == -1 || i7 <= i4) && ((i8 = c1753m.f9967d) == -1 || i8 <= i5)));
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7608a(int[][] iArr, C1621af c1621af, InterfaceC1664f interfaceC1664f) {
        if (interfaceC1664f == null) {
            return false;
        }
        int iM7298a = c1621af.m7298a(interfaceC1664f.mo7584f());
        for (int i = 0; i < interfaceC1664f.mo7585g(); i++) {
            if ((iArr[iM7298a][interfaceC1664f.mo7580b(i)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static int[] m7609a(C1620ae c1620ae, int[] iArr, boolean z) {
        int iM7591a;
        HashSet hashSet = new HashSet();
        a aVar = null;
        int i = 0;
        for (int i2 = 0; i2 < c1620ae.f8750a; i2++) {
            C1753m c1753mM7294a = c1620ae.m7294a(i2);
            a aVar2 = new a(c1753mM7294a.f9984u, c1753mM7294a.f9985v, z ? null : c1753mM7294a.f9971h);
            if (hashSet.add(aVar2) && (iM7591a = m7591a(c1620ae, iArr, aVar2)) > i) {
                i = iM7591a;
                aVar = aVar2;
            }
        }
        if (i <= 1) {
            return f9158b;
        }
        int[] iArr2 = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < c1620ae.f8750a; i4++) {
            if (m7605a(c1620ae.m7294a(i4), iArr[i4], (a) C1711a.m8005a(aVar))) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: a */
    private static int[] m7610a(C1620ae c1620ae, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z3) {
        String str;
        int iM7590a;
        if (c1620ae.f8750a < 2) {
            return f9158b;
        }
        List<Integer> listM7596a = m7596a(c1620ae, i5, i6, z3);
        if (listM7596a.size() < 2) {
            return f9158b;
        }
        if (z) {
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i7 = 0;
            for (int i8 = 0; i8 < listM7596a.size(); i8++) {
                String str3 = c1620ae.m7294a(listM7596a.get(i8).intValue()).f9971h;
                if (hashSet.add(str3) && (iM7590a = m7590a(c1620ae, iArr, i, str3, i2, i3, i4, listM7596a)) > i7) {
                    i7 = iM7590a;
                    str2 = str3;
                }
            }
            str = str2;
        }
        m7618b(c1620ae, iArr, i, str, i2, i3, i4, listM7596a);
        return listM7596a.size() < 2 ? f9158b : C1717af.m8088a(listM7596a);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00f2 A[LOOP:1: B:128:0x003f->B:156:0x00f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00e6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.anythink.expressad.exoplayer.p104i.InterfaceC1664f[] m7611a(com.anythink.expressad.exoplayer.p104i.AbstractC1663e.a r32, int[][][] r33, int[] r34, com.anythink.expressad.exoplayer.p104i.C1661c.c r35) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p104i.C1661c.m7611a(com.anythink.expressad.exoplayer.i.e$a, int[][][], int[], com.anythink.expressad.exoplayer.i.c$c):com.anythink.expressad.exoplayer.i.f[]");
    }

    /* JADX INFO: renamed from: b */
    private static int m7612b(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: b */
    private e m7613b(int i, C1621af c1621af) {
        return m7620c().m7638b(i, c1621af);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0036  */
    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.anythink.expressad.exoplayer.p104i.InterfaceC1664f m7614b(com.anythink.expressad.exoplayer.p101h.C1621af r24, int[][] r25, int r26, com.anythink.expressad.exoplayer.p104i.C1661c.c r27, com.anythink.expressad.exoplayer.p104i.InterfaceC1664f.a r28) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p104i.C1661c.m7614b(com.anythink.expressad.exoplayer.h.af, int[][], int, com.anythink.expressad.exoplayer.i.c$c, com.anythink.expressad.exoplayer.i.f$a):com.anythink.expressad.exoplayer.i.f");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0070  */
    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.anythink.expressad.exoplayer.p104i.InterfaceC1664f m7615b(com.anythink.expressad.exoplayer.p101h.C1621af r16, int[][] r17, com.anythink.expressad.exoplayer.p104i.C1661c.c r18) {
        /*
            r0 = r16
            r1 = r18
            r2 = 0
            r3 = 0
            r5 = r2
            r4 = 0
            r6 = 0
            r7 = 0
        La:
            int r8 = r0.f8754b
            if (r4 >= r8) goto L92
            com.anythink.expressad.exoplayer.h.ae r8 = r0.m7299a(r4)
            r9 = r17[r4]
            r10 = 0
        L15:
            int r11 = r8.f8750a
            if (r10 >= r11) goto L8e
            r11 = r9[r10]
            boolean r12 = r1.f9187p
            boolean r11 = m7603a(r11, r12)
            if (r11 == 0) goto L8b
            com.anythink.expressad.exoplayer.m r11 = r8.m7294a(r10)
            int r12 = r11.f9989z
            int r13 = r1.f9176e
            int r13 = ~r13
            r12 = r12 & r13
            r13 = r12 & 1
            if (r13 == 0) goto L33
            r13 = 1
            goto L34
        L33:
            r13 = 0
        L34:
            r12 = r12 & 2
            if (r12 == 0) goto L3a
            r12 = 1
            goto L3b
        L3a:
            r12 = 0
        L3b:
            java.lang.String r15 = r1.f9174c
            boolean r15 = m7606a(r11, r15)
            if (r15 != 0) goto L70
            boolean r14 = r1.f9175d
            if (r14 == 0) goto L5e
            java.lang.String r14 = r11.f9963A
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L5a
            java.lang.String r14 = "und"
            boolean r14 = m7606a(r11, r14)
            if (r14 == 0) goto L58
            goto L5a
        L58:
            r14 = 0
            goto L5b
        L5a:
            r14 = 1
        L5b:
            if (r14 == 0) goto L5e
            goto L70
        L5e:
            if (r13 == 0) goto L62
            r14 = 3
            goto L7c
        L62:
            if (r12 == 0) goto L8b
            java.lang.String r12 = r1.f9173b
            boolean r11 = m7606a(r11, r12)
            if (r11 == 0) goto L6e
            r14 = 2
            goto L7c
        L6e:
            r14 = 1
            goto L7c
        L70:
            if (r13 == 0) goto L75
            r11 = 8
            goto L7a
        L75:
            if (r12 != 0) goto L79
            r11 = 6
            goto L7a
        L79:
            r11 = 4
        L7a:
            int r14 = r11 + r15
        L7c:
            r11 = r9[r10]
            boolean r11 = m7603a(r11, r3)
            if (r11 == 0) goto L86
            int r14 = r14 + 1000
        L86:
            if (r14 <= r7) goto L8b
            r5 = r8
            r6 = r10
            r7 = r14
        L8b:
            int r10 = r10 + 1
            goto L15
        L8e:
            int r4 = r4 + 1
            goto La
        L92:
            if (r5 != 0) goto L95
            return r2
        L95:
            com.anythink.expressad.exoplayer.i.d r0 = new com.anythink.expressad.exoplayer.i.d
            r0.<init>(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p104i.C1661c.m7615b(com.anythink.expressad.exoplayer.h.af, int[][], com.anythink.expressad.exoplayer.i.c$c):com.anythink.expressad.exoplayer.i.f");
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    private void m7616b(int i) {
        m7599a(m7624d().m7659a(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    private void m7617b(int i, boolean z) {
        m7599a(m7624d().m7662a(i, z));
    }

    /* JADX INFO: renamed from: b */
    private static void m7618b(C1620ae c1620ae, int[] iArr, int i, @Nullable String str, int i2, int i3, int i4, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!m7607a(c1620ae.m7294a(iIntValue), str, iArr[iIntValue], i, i2, i3, i4)) {
                list.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m7619c(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* JADX INFO: renamed from: c */
    private c m7620c() {
        return this.f9161e.get();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    private static InterfaceC1664f m7621c(C1621af c1621af, int[][] iArr, c cVar) {
        C1620ae c1620ae = null;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < c1621af.f8754b; i3++) {
            C1620ae c1620aeM7299a = c1621af.m7299a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < c1620aeM7299a.f8750a; i4++) {
                if (m7603a(iArr2[i4], cVar.f9187p)) {
                    int i5 = (c1620aeM7299a.m7294a(i4).f9989z & 1) != 0 ? 2 : 1;
                    if (m7603a(iArr2[i4], false)) {
                        i5 += 1000;
                    }
                    if (i5 > i2) {
                        c1620ae = c1620aeM7299a;
                        i = i4;
                        i2 = i5;
                    }
                }
            }
        }
        if (c1620ae == null) {
            return null;
        }
        return new C1662d(c1620ae, i);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    private void m7622c(int i) {
        m7599a(m7624d().m7664b(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    private void m7623c(int i, C1621af c1621af) {
        m7599a(m7624d().m7660a(i, c1621af));
    }

    /* JADX INFO: renamed from: d */
    private d m7624d() {
        return new d(m7620c(), (byte) 0);
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    private void m7625e() {
        m7599a(m7624d().m7658a());
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00fa A[LOOP:1: B:169:0x004b->B:197:0x00fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00ee A[SYNTHETIC] */
    @Override // com.anythink.expressad.exoplayer.p104i.AbstractC1663e
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.anythink.expressad.exoplayer.C1495aa[], com.anythink.expressad.exoplayer.p104i.InterfaceC1664f[]> mo7626a(com.anythink.expressad.exoplayer.p104i.AbstractC1663e.a r33, int[][][] r34, int[] r35) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p104i.C1661c.mo7626a(com.anythink.expressad.exoplayer.i.e$a, int[][][], int[]):android.util.Pair");
    }
}
