package com.anythink.expressad.exoplayer.p097g.p100c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p107k.C1714ac;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.c.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1602d extends AbstractC1600b {
    public static final Parcelable.Creator<C1602d> CREATOR = new Parcelable.Creator<C1602d>() { // from class: com.anythink.expressad.exoplayer.g.c.d.1
        /* JADX INFO: renamed from: a */
        private static C1602d m7146a(Parcel parcel) {
            return new C1602d(parcel, (byte) 0);
        }

        /* JADX INFO: renamed from: a */
        private static C1602d[] m7147a(int i) {
            return new C1602d[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1602d createFromParcel(Parcel parcel) {
            return new C1602d(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1602d[] newArray(int i) {
            return new C1602d[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public final long f8578a;

    /* JADX INFO: renamed from: b */
    public final boolean f8579b;

    /* JADX INFO: renamed from: c */
    public final boolean f8580c;

    /* JADX INFO: renamed from: d */
    public final boolean f8581d;

    /* JADX INFO: renamed from: e */
    public final boolean f8582e;

    /* JADX INFO: renamed from: f */
    public final long f8583f;

    /* JADX INFO: renamed from: g */
    public final long f8584g;

    /* JADX INFO: renamed from: h */
    public final List<a> f8585h;

    /* JADX INFO: renamed from: i */
    public final boolean f8586i;

    /* JADX INFO: renamed from: j */
    public final long f8587j;

    /* JADX INFO: renamed from: k */
    public final int f8588k;

    /* JADX INFO: renamed from: l */
    public final int f8589l;

    /* JADX INFO: renamed from: m */
    public final int f8590m;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.c.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f8591a;

        /* JADX INFO: renamed from: b */
        public final long f8592b;

        /* JADX INFO: renamed from: c */
        public final long f8593c;

        private a(int i, long j, long j2) {
            this.f8591a = i;
            this.f8592b = j;
            this.f8593c = j2;
        }

        public /* synthetic */ a(int i, long j, long j2, byte b) {
            this(i, j, j2);
        }

        /* JADX INFO: renamed from: a */
        public static a m7148a(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* JADX INFO: renamed from: b */
        private void m7149b(Parcel parcel) {
            parcel.writeInt(this.f8591a);
            parcel.writeLong(this.f8592b);
            parcel.writeLong(this.f8593c);
        }
    }

    private C1602d(long j, boolean z, boolean z3, boolean z4, boolean z5, long j2, long j3, List<a> list, boolean z6, long j4, int i, int i2, int i3) {
        this.f8578a = j;
        this.f8579b = z;
        this.f8580c = z3;
        this.f8581d = z4;
        this.f8582e = z5;
        this.f8583f = j2;
        this.f8584g = j3;
        this.f8585h = Collections.unmodifiableList(list);
        this.f8586i = z6;
        this.f8587j = j4;
        this.f8588k = i;
        this.f8589l = i2;
        this.f8590m = i3;
    }

    private C1602d(Parcel parcel) {
        this.f8578a = parcel.readLong();
        this.f8579b = parcel.readByte() == 1;
        this.f8580c = parcel.readByte() == 1;
        this.f8581d = parcel.readByte() == 1;
        this.f8582e = parcel.readByte() == 1;
        this.f8583f = parcel.readLong();
        this.f8584g = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(a.m7148a(parcel));
        }
        this.f8585h = Collections.unmodifiableList(arrayList);
        this.f8586i = parcel.readByte() == 1;
        this.f8587j = parcel.readLong();
        this.f8588k = parcel.readInt();
        this.f8589l = parcel.readInt();
        this.f8590m = parcel.readInt();
    }

    public /* synthetic */ C1602d(Parcel parcel, byte b) {
        this(parcel);
    }

    /* JADX INFO: renamed from: a */
    public static C1602d m7145a(C1736s c1736s, long j, C1714ac c1714ac) {
        List list;
        boolean z;
        boolean z3;
        long j2;
        boolean z4;
        long j3;
        int iM8275e;
        int iM8273d;
        int iM8273d2;
        boolean z5;
        boolean z6;
        long jM8279h;
        long jM8279h2 = c1736s.m8279h();
        boolean z7 = (c1736s.m8273d() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z7) {
            list = listEmptyList;
            z = false;
            z3 = false;
            j2 = C1500b.f7455b;
            z4 = false;
            j3 = C1500b.f7455b;
            iM8275e = 0;
            iM8273d = 0;
            iM8273d2 = 0;
            z5 = false;
        } else {
            int iM8273d3 = c1736s.m8273d();
            boolean z8 = (iM8273d3 & 128) != 0;
            boolean z9 = (iM8273d3 & 64) != 0;
            boolean z10 = (iM8273d3 & 32) != 0;
            boolean z11 = (iM8273d3 & 16) != 0;
            long jM7165a = (!z9 || z11) ? C1500b.f7455b : C1605g.m7165a(c1736s, j);
            if (!z9) {
                int iM8273d4 = c1736s.m8273d();
                ArrayList arrayList = new ArrayList(iM8273d4);
                for (int i = 0; i < iM8273d4; i++) {
                    int iM8273d5 = c1736s.m8273d();
                    long jM7165a2 = !z11 ? C1605g.m7165a(c1736s, j) : C1500b.f7455b;
                    arrayList.add(new a(iM8273d5, jM7165a2, c1714ac.m8037a(jM7165a2), (byte) 0));
                }
                listEmptyList = arrayList;
            }
            if (z10) {
                long jM8273d = c1736s.m8273d();
                boolean z12 = (128 & jM8273d) != 0;
                jM8279h = ((((jM8273d & 1) << 32) | c1736s.m8279h()) * 1000) / 90;
                z6 = z12;
            } else {
                z6 = false;
                jM8279h = C1500b.f7455b;
            }
            iM8275e = c1736s.m8275e();
            z5 = z9;
            iM8273d = c1736s.m8273d();
            iM8273d2 = c1736s.m8273d();
            list = listEmptyList;
            long j4 = jM7165a;
            z4 = z6;
            j3 = jM8279h;
            z3 = z11;
            z = z8;
            j2 = j4;
        }
        return new C1602d(jM8279h2, z7, z, z5, z3, j2, c1714ac.m8037a(j2), list, z4, j3, iM8275e, iM8273d, iM8273d2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8578a);
        parcel.writeByte(this.f8579b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8580c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8581d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8582e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f8583f);
        parcel.writeLong(this.f8584g);
        int size = this.f8585h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f8585h.get(i2);
            parcel.writeInt(aVar.f8591a);
            parcel.writeLong(aVar.f8592b);
            parcel.writeLong(aVar.f8593c);
        }
        parcel.writeByte(this.f8586i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f8587j);
        parcel.writeInt(this.f8588k);
        parcel.writeInt(this.f8589l);
        parcel.writeInt(this.f8590m);
    }
}
