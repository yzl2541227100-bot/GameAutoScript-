package com.anythink.expressad.exoplayer.p097g.p098a;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p097g.C1582a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1583a implements C1582a.a {
    public static final Parcelable.Creator<C1583a> CREATOR = new Parcelable.Creator<C1583a>() { // from class: com.anythink.expressad.exoplayer.g.a.a.1
        /* JADX INFO: renamed from: a */
        private static C1583a m7089a(Parcel parcel) {
            return new C1583a(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1583a[] m7090a(int i) {
            return new C1583a[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1583a createFromParcel(Parcel parcel) {
            return new C1583a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1583a[] newArray(int i) {
            return new C1583a[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public final String f8500a;

    /* JADX INFO: renamed from: b */
    public final String f8501b;

    /* JADX INFO: renamed from: c */
    public final long f8502c;

    /* JADX INFO: renamed from: d */
    public final long f8503d;

    /* JADX INFO: renamed from: e */
    public final long f8504e;

    /* JADX INFO: renamed from: f */
    public final byte[] f8505f;

    /* JADX INFO: renamed from: g */
    private int f8506g;

    public C1583a(Parcel parcel) {
        this.f8500a = parcel.readString();
        this.f8501b = parcel.readString();
        this.f8503d = parcel.readLong();
        this.f8502c = parcel.readLong();
        this.f8504e = parcel.readLong();
        this.f8505f = parcel.createByteArray();
    }

    public C1583a(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        this.f8500a = str;
        this.f8501b = str2;
        this.f8502c = j;
        this.f8504e = j2;
        this.f8505f = bArr;
        this.f8503d = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1583a.class == obj.getClass()) {
            C1583a c1583a = (C1583a) obj;
            if (this.f8503d == c1583a.f8503d && this.f8502c == c1583a.f8502c && this.f8504e == c1583a.f8504e && C1717af.m8085a((Object) this.f8500a, (Object) c1583a.f8500a) && C1717af.m8085a((Object) this.f8501b, (Object) c1583a.f8501b) && Arrays.equals(this.f8505f, c1583a.f8505f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8506g == 0) {
            String str = this.f8500a;
            int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f8501b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f8503d;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f8502c;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f8504e;
            this.f8506g = ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(this.f8505f);
        }
        return this.f8506g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f8500a + ", id=" + this.f8504e + ", value=" + this.f8501b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8500a);
        parcel.writeString(this.f8501b);
        parcel.writeLong(this.f8503d);
        parcel.writeLong(this.f8502c);
        parcel.writeLong(this.f8504e);
        parcel.writeByteArray(this.f8505f);
    }
}
