package com.anythink.expressad.exoplayer.p108l;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.l.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1746b implements Parcelable {
    public static final Parcelable.Creator<C1746b> CREATOR = new Parcelable.Creator<C1746b>() { // from class: com.anythink.expressad.exoplayer.l.b.1
        /* JADX INFO: renamed from: a */
        private static C1746b m8321a(Parcel parcel) {
            return new C1746b(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1746b[] m8322a() {
            return new C1746b[0];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1746b createFromParcel(Parcel parcel) {
            return new C1746b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1746b[] newArray(int i) {
            return new C1746b[0];
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f9840a;

    /* JADX INFO: renamed from: b */
    public final int f9841b;

    /* JADX INFO: renamed from: c */
    public final int f9842c;

    /* JADX INFO: renamed from: d */
    public final byte[] f9843d;

    /* JADX INFO: renamed from: e */
    private int f9844e;

    private C1746b(int i, int i2, int i3, byte[] bArr) {
        this.f9840a = i;
        this.f9841b = i2;
        this.f9842c = i3;
        this.f9843d = bArr;
    }

    public C1746b(Parcel parcel) {
        this.f9840a = parcel.readInt();
        this.f9841b = parcel.readInt();
        this.f9842c = parcel.readInt();
        this.f9843d = C1717af.m8084a(parcel) ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1746b.class == obj.getClass()) {
            C1746b c1746b = (C1746b) obj;
            if (this.f9840a == c1746b.f9840a && this.f9841b == c1746b.f9841b && this.f9842c == c1746b.f9842c && Arrays.equals(this.f9843d, c1746b.f9843d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f9844e == 0) {
            this.f9844e = ((((((this.f9840a + 527) * 31) + this.f9841b) * 31) + this.f9842c) * 31) + Arrays.hashCode(this.f9843d);
        }
        return this.f9844e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f9840a);
        sb.append(", ");
        sb.append(this.f9841b);
        sb.append(", ");
        sb.append(this.f9842c);
        sb.append(", ");
        sb.append(this.f9843d != null);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9840a);
        parcel.writeInt(this.f9841b);
        parcel.writeInt(this.f9842c);
        C1717af.m8072a(parcel, this.f9843d != null);
        byte[] bArr = this.f9843d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
