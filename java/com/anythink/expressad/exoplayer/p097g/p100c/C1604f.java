package com.anythink.expressad.exoplayer.p097g.p100c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.c.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1604f extends AbstractC1600b {
    public static final Parcelable.Creator<C1604f> CREATOR = new Parcelable.Creator<C1604f>() { // from class: com.anythink.expressad.exoplayer.g.c.f.1
        /* JADX INFO: renamed from: a */
        private static C1604f m7153a(Parcel parcel) {
            return new C1604f(parcel, (byte) 0);
        }

        /* JADX INFO: renamed from: a */
        private static C1604f[] m7154a(int i) {
            return new C1604f[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1604f createFromParcel(Parcel parcel) {
            return new C1604f(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1604f[] newArray(int i) {
            return new C1604f[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public final List<b> f8594a;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.c.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f8595a;

        /* JADX INFO: renamed from: b */
        public final long f8596b;

        private a(int i, long j) {
            this.f8595a = i;
            this.f8596b = j;
        }

        public /* synthetic */ a(int i, long j, byte b) {
            this(i, j);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m7155a(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m7156a(a aVar, Parcel parcel) {
            parcel.writeInt(aVar.f8595a);
            parcel.writeLong(aVar.f8596b);
        }

        /* JADX INFO: renamed from: b */
        private static a m7157b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: renamed from: c */
        private void m7158c(Parcel parcel) {
            parcel.writeInt(this.f8595a);
            parcel.writeLong(this.f8596b);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.c.f$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final long f8597a;

        /* JADX INFO: renamed from: b */
        public final boolean f8598b;

        /* JADX INFO: renamed from: c */
        public final boolean f8599c;

        /* JADX INFO: renamed from: d */
        public final boolean f8600d;

        /* JADX INFO: renamed from: e */
        public final long f8601e;

        /* JADX INFO: renamed from: f */
        public final List<a> f8602f;

        /* JADX INFO: renamed from: g */
        public final boolean f8603g;

        /* JADX INFO: renamed from: h */
        public final long f8604h;

        /* JADX INFO: renamed from: i */
        public final int f8605i;

        /* JADX INFO: renamed from: j */
        public final int f8606j;

        /* JADX INFO: renamed from: k */
        public final int f8607k;

        private b(long j, boolean z, boolean z3, boolean z4, List<a> list, long j2, boolean z5, long j3, int i, int i2, int i3) {
            this.f8597a = j;
            this.f8598b = z;
            this.f8599c = z3;
            this.f8600d = z4;
            this.f8602f = Collections.unmodifiableList(list);
            this.f8601e = j2;
            this.f8603g = z5;
            this.f8604h = j3;
            this.f8605i = i;
            this.f8606j = i2;
            this.f8607k = i3;
        }

        private b(Parcel parcel) {
            this.f8597a = parcel.readLong();
            this.f8598b = parcel.readByte() == 1;
            this.f8599c = parcel.readByte() == 1;
            this.f8600d = parcel.readByte() == 1;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(a.m7155a(parcel));
            }
            this.f8602f = Collections.unmodifiableList(arrayList);
            this.f8601e = parcel.readLong();
            this.f8603g = parcel.readByte() == 1;
            this.f8604h = parcel.readLong();
            this.f8605i = parcel.readInt();
            this.f8606j = parcel.readInt();
            this.f8607k = parcel.readInt();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ b m7159a(Parcel parcel) {
            return new b(parcel);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ b m7160a(C1736s c1736s) {
            ArrayList arrayList;
            long j;
            boolean z;
            boolean z3;
            int i;
            int i2;
            int iM8273d;
            long j2;
            long jM8279h;
            long jM8279h2 = c1736s.m8279h();
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = (c1736s.m8273d() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z6) {
                arrayList = arrayList2;
                j = C1500b.f7455b;
                z = false;
                z3 = false;
                i = 0;
                i2 = 0;
                iM8273d = 0;
                j2 = C1500b.f7455b;
            } else {
                int iM8273d2 = c1736s.m8273d();
                boolean z7 = (iM8273d2 & 128) != 0;
                z3 = (iM8273d2 & 64) != 0;
                boolean z8 = (iM8273d2 & 32) != 0;
                long jM8279h3 = z3 ? c1736s.m8279h() : C1500b.f7455b;
                if (!z3) {
                    int iM8273d3 = c1736s.m8273d();
                    ArrayList arrayList3 = new ArrayList(iM8273d3);
                    for (int i3 = 0; i3 < iM8273d3; i3++) {
                        arrayList3.add(new a(c1736s.m8273d(), c1736s.m8279h(), z4 ? (byte) 1 : (byte) 0));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long jM8273d = c1736s.m8273d();
                    boolean z9 = (128 & jM8273d) != 0;
                    jM8279h = ((((jM8273d & 1) << 32) | c1736s.m8279h()) * 1000) / 90;
                    z5 = z9;
                } else {
                    jM8279h = C1500b.f7455b;
                }
                int iM8275e = c1736s.m8275e();
                int iM8273d4 = c1736s.m8273d();
                j2 = jM8279h;
                iM8273d = c1736s.m8273d();
                arrayList = arrayList2;
                long j3 = jM8279h3;
                i = iM8275e;
                i2 = iM8273d4;
                j = j3;
                boolean z10 = z7;
                z = z5;
                z4 = z10;
            }
            return new b(jM8279h2, z6, z4, z3, arrayList, j, z, j2, i, i2, iM8273d);
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m7161a(b bVar, Parcel parcel) {
            parcel.writeLong(bVar.f8597a);
            parcel.writeByte(bVar.f8598b ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f8599c ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f8600d ? (byte) 1 : (byte) 0);
            int size = bVar.f8602f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                a.m7156a(bVar.f8602f.get(i), parcel);
            }
            parcel.writeLong(bVar.f8601e);
            parcel.writeByte(bVar.f8603g ? (byte) 1 : (byte) 0);
            parcel.writeLong(bVar.f8604h);
            parcel.writeInt(bVar.f8605i);
            parcel.writeInt(bVar.f8606j);
            parcel.writeInt(bVar.f8607k);
        }

        /* JADX INFO: renamed from: b */
        private static b m7162b(C1736s c1736s) {
            ArrayList arrayList;
            long j;
            boolean z;
            boolean z3;
            int i;
            int i2;
            int iM8273d;
            long j2;
            long jM8279h;
            long jM8279h2 = c1736s.m8279h();
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = (c1736s.m8273d() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z6) {
                arrayList = arrayList2;
                j = C1500b.f7455b;
                z = false;
                z3 = false;
                i = 0;
                i2 = 0;
                iM8273d = 0;
                j2 = C1500b.f7455b;
            } else {
                int iM8273d2 = c1736s.m8273d();
                boolean z7 = (iM8273d2 & 128) != 0;
                z3 = (iM8273d2 & 64) != 0;
                boolean z8 = (iM8273d2 & 32) != 0;
                long jM8279h3 = z3 ? c1736s.m8279h() : C1500b.f7455b;
                if (!z3) {
                    int iM8273d3 = c1736s.m8273d();
                    ArrayList arrayList3 = new ArrayList(iM8273d3);
                    for (int i3 = 0; i3 < iM8273d3; i3++) {
                        arrayList3.add(new a(c1736s.m8273d(), c1736s.m8279h(), z4 ? (byte) 1 : (byte) 0));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long jM8273d = c1736s.m8273d();
                    boolean z9 = (128 & jM8273d) != 0;
                    jM8279h = ((((jM8273d & 1) << 32) | c1736s.m8279h()) * 1000) / 90;
                    z5 = z9;
                } else {
                    jM8279h = C1500b.f7455b;
                }
                int iM8275e = c1736s.m8275e();
                int iM8273d4 = c1736s.m8273d();
                j2 = jM8279h;
                iM8273d = c1736s.m8273d();
                arrayList = arrayList2;
                long j3 = jM8279h3;
                i = iM8275e;
                i2 = iM8273d4;
                j = j3;
                boolean z10 = z7;
                z = z5;
                z4 = z10;
            }
            return new b(jM8279h2, z6, z4, z3, arrayList, j, z, j2, i, i2, iM8273d);
        }

        /* JADX INFO: renamed from: b */
        private void m7163b(Parcel parcel) {
            parcel.writeLong(this.f8597a);
            parcel.writeByte(this.f8598b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f8599c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f8600d ? (byte) 1 : (byte) 0);
            int size = this.f8602f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                a.m7156a(this.f8602f.get(i), parcel);
            }
            parcel.writeLong(this.f8601e);
            parcel.writeByte(this.f8603g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f8604h);
            parcel.writeInt(this.f8605i);
            parcel.writeInt(this.f8606j);
            parcel.writeInt(this.f8607k);
        }

        /* JADX INFO: renamed from: c */
        private static b m7164c(Parcel parcel) {
            return new b(parcel);
        }
    }

    private C1604f(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(b.m7159a(parcel));
        }
        this.f8594a = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ C1604f(Parcel parcel, byte b2) {
        this(parcel);
    }

    private C1604f(List<b> list) {
        this.f8594a = Collections.unmodifiableList(list);
    }

    /* JADX INFO: renamed from: a */
    public static C1604f m7152a(C1736s c1736s) {
        int iM8273d = c1736s.m8273d();
        ArrayList arrayList = new ArrayList(iM8273d);
        for (int i = 0; i < iM8273d; i++) {
            arrayList.add(b.m7160a(c1736s));
        }
        return new C1604f(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.f8594a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f8594a.get(i2);
            parcel.writeLong(bVar.f8597a);
            parcel.writeByte(bVar.f8598b ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f8599c ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f8600d ? (byte) 1 : (byte) 0);
            int size2 = bVar.f8602f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                a.m7156a(bVar.f8602f.get(i3), parcel);
            }
            parcel.writeLong(bVar.f8601e);
            parcel.writeByte(bVar.f8603g ? (byte) 1 : (byte) 0);
            parcel.writeLong(bVar.f8604h);
            parcel.writeInt(bVar.f8605i);
            parcel.writeInt(bVar.f8606j);
            parcel.writeInt(bVar.f8607k);
        }
    }
}
