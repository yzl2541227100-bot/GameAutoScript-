package com.anythink.expressad.exoplayer.p097g.p099b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1586a extends AbstractC1593h {
    public static final Parcelable.Creator<C1586a> CREATOR = new Parcelable.Creator<C1586a>() { // from class: com.anythink.expressad.exoplayer.g.b.a.1
        /* JADX INFO: renamed from: a */
        private static C1586a m7092a(Parcel parcel) {
            return new C1586a(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1586a[] m7093a(int i) {
            return new C1586a[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1586a createFromParcel(Parcel parcel) {
            return new C1586a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1586a[] newArray(int i) {
            return new C1586a[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public static final String f8507a = "APIC";

    /* JADX INFO: renamed from: b */
    public final String f8508b;

    /* JADX INFO: renamed from: c */
    public final String f8509c;

    /* JADX INFO: renamed from: d */
    public final int f8510d;

    /* JADX INFO: renamed from: e */
    public final byte[] f8511e;

    public C1586a(Parcel parcel) {
        super(f8507a);
        this.f8508b = parcel.readString();
        this.f8509c = parcel.readString();
        this.f8510d = parcel.readInt();
        this.f8511e = parcel.createByteArray();
    }

    public C1586a(String str, String str2, int i, byte[] bArr) {
        super(f8507a);
        this.f8508b = str;
        this.f8509c = str2;
        this.f8510d = i;
        this.f8511e = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1586a.class == obj.getClass()) {
            C1586a c1586a = (C1586a) obj;
            if (this.f8510d == c1586a.f8510d && C1717af.m8085a((Object) this.f8508b, (Object) c1586a.f8508b) && C1717af.m8085a((Object) this.f8509c, (Object) c1586a.f8509c) && Arrays.equals(this.f8511e, c1586a.f8511e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f8510d + 527) * 31;
        String str = this.f8508b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8509c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f8511e);
    }

    @Override // com.anythink.expressad.exoplayer.p097g.p099b.AbstractC1593h
    public final String toString() {
        return this.f8555g + ": mimeType=" + this.f8508b + ", description=" + this.f8509c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8508b);
        parcel.writeString(this.f8509c);
        parcel.writeInt(this.f8510d);
        parcel.writeByteArray(this.f8511e);
    }
}
