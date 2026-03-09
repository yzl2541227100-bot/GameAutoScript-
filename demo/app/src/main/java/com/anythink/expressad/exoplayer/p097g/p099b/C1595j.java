package com.anythink.expressad.exoplayer.p097g.p099b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.b.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1595j extends AbstractC1593h {
    public static final Parcelable.Creator<C1595j> CREATOR = new Parcelable.Creator<C1595j>() { // from class: com.anythink.expressad.exoplayer.g.b.j.1
        /* JADX INFO: renamed from: a */
        private static C1595j m7136a(Parcel parcel) {
            return new C1595j(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1595j[] m7137a(int i) {
            return new C1595j[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1595j createFromParcel(Parcel parcel) {
            return new C1595j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1595j[] newArray(int i) {
            return new C1595j[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public static final String f8560a = "PRIV";

    /* JADX INFO: renamed from: b */
    public final String f8561b;

    /* JADX INFO: renamed from: c */
    public final byte[] f8562c;

    public C1595j(Parcel parcel) {
        super(f8560a);
        this.f8561b = parcel.readString();
        this.f8562c = parcel.createByteArray();
    }

    public C1595j(String str, byte[] bArr) {
        super(f8560a);
        this.f8561b = str;
        this.f8562c = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1595j.class == obj.getClass()) {
            C1595j c1595j = (C1595j) obj;
            if (C1717af.m8085a((Object) this.f8561b, (Object) c1595j.f8561b) && Arrays.equals(this.f8562c, c1595j.f8562c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8561b;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f8562c);
    }

    @Override // com.anythink.expressad.exoplayer.p097g.p099b.AbstractC1593h
    public final String toString() {
        return this.f8555g + ": owner=" + this.f8561b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8561b);
        parcel.writeByteArray(this.f8562c);
    }
}
