package com.anythink.expressad.exoplayer.p097g.p100c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.p107k.C1736s;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1599a extends AbstractC1600b {
    public static final Parcelable.Creator<C1599a> CREATOR = new Parcelable.Creator<C1599a>() { // from class: com.anythink.expressad.exoplayer.g.c.a.1
        /* JADX INFO: renamed from: a */
        private static C1599a m7143a(Parcel parcel) {
            return new C1599a(parcel, (byte) 0);
        }

        /* JADX INFO: renamed from: a */
        private static C1599a[] m7144a(int i) {
            return new C1599a[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1599a createFromParcel(Parcel parcel) {
            return new C1599a(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1599a[] newArray(int i) {
            return new C1599a[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public final long f8567a;

    /* JADX INFO: renamed from: b */
    public final long f8568b;

    /* JADX INFO: renamed from: c */
    public final byte[] f8569c;

    private C1599a(long j, byte[] bArr, long j2) {
        this.f8567a = j2;
        this.f8568b = j;
        this.f8569c = bArr;
    }

    private C1599a(Parcel parcel) {
        this.f8567a = parcel.readLong();
        this.f8568b = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f8569c = bArr;
        parcel.readByteArray(bArr);
    }

    public /* synthetic */ C1599a(Parcel parcel, byte b) {
        this(parcel);
    }

    /* JADX INFO: renamed from: a */
    public static C1599a m7142a(C1736s c1736s, int i, long j) {
        long jM8279h = c1736s.m8279h();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        c1736s.m8268a(bArr, 0, i2);
        return new C1599a(jM8279h, bArr, j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8567a);
        parcel.writeLong(this.f8568b);
        parcel.writeInt(this.f8569c.length);
        parcel.writeByteArray(this.f8569c);
    }
}
