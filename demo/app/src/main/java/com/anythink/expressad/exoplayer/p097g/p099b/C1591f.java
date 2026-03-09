package com.anythink.expressad.exoplayer.p097g.p099b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1591f extends AbstractC1593h {
    public static final Parcelable.Creator<C1591f> CREATOR = new Parcelable.Creator<C1591f>() { // from class: com.anythink.expressad.exoplayer.g.b.f.1
        /* JADX INFO: renamed from: a */
        private static C1591f m7106a(Parcel parcel) {
            return new C1591f(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1591f[] m7107a(int i) {
            return new C1591f[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1591f createFromParcel(Parcel parcel) {
            return new C1591f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1591f[] newArray(int i) {
            return new C1591f[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public static final String f8530a = "GEOB";

    /* JADX INFO: renamed from: b */
    public final String f8531b;

    /* JADX INFO: renamed from: c */
    public final String f8532c;

    /* JADX INFO: renamed from: d */
    public final String f8533d;

    /* JADX INFO: renamed from: e */
    public final byte[] f8534e;

    public C1591f(Parcel parcel) {
        super(f8530a);
        this.f8531b = parcel.readString();
        this.f8532c = parcel.readString();
        this.f8533d = parcel.readString();
        this.f8534e = parcel.createByteArray();
    }

    public C1591f(String str, String str2, String str3, byte[] bArr) {
        super(f8530a);
        this.f8531b = str;
        this.f8532c = str2;
        this.f8533d = str3;
        this.f8534e = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1591f.class == obj.getClass()) {
            C1591f c1591f = (C1591f) obj;
            if (C1717af.m8085a((Object) this.f8531b, (Object) c1591f.f8531b) && C1717af.m8085a((Object) this.f8532c, (Object) c1591f.f8532c) && C1717af.m8085a((Object) this.f8533d, (Object) c1591f.f8533d) && Arrays.equals(this.f8534e, c1591f.f8534e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8531b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f8532c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8533d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f8534e);
    }

    @Override // com.anythink.expressad.exoplayer.p097g.p099b.AbstractC1593h
    public final String toString() {
        return this.f8555g + ": mimeType=" + this.f8531b + ", filename=" + this.f8532c + ", description=" + this.f8533d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8531b);
        parcel.writeString(this.f8532c);
        parcel.writeString(this.f8533d);
        parcel.writeByteArray(this.f8534e);
    }
}
