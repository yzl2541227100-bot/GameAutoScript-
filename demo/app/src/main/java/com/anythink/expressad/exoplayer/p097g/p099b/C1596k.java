package com.anythink.expressad.exoplayer.p097g.p099b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1717af;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.b.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1596k extends AbstractC1593h {
    public static final Parcelable.Creator<C1596k> CREATOR = new Parcelable.Creator<C1596k>() { // from class: com.anythink.expressad.exoplayer.g.b.k.1
        /* JADX INFO: renamed from: a */
        private static C1596k m7138a(Parcel parcel) {
            return new C1596k(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1596k[] m7139a(int i) {
            return new C1596k[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1596k createFromParcel(Parcel parcel) {
            return new C1596k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1596k[] newArray(int i) {
            return new C1596k[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public final String f8563a;

    /* JADX INFO: renamed from: b */
    public final String f8564b;

    public C1596k(Parcel parcel) {
        super(parcel.readString());
        this.f8563a = parcel.readString();
        this.f8564b = parcel.readString();
    }

    public C1596k(String str, String str2, String str3) {
        super(str);
        this.f8563a = str2;
        this.f8564b = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1596k.class == obj.getClass()) {
            C1596k c1596k = (C1596k) obj;
            if (this.f8555g.equals(c1596k.f8555g) && C1717af.m8085a((Object) this.f8563a, (Object) c1596k.f8563a) && C1717af.m8085a((Object) this.f8564b, (Object) c1596k.f8564b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f8555g.hashCode() + 527) * 31;
        String str = this.f8563a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8564b;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.anythink.expressad.exoplayer.p097g.p099b.AbstractC1593h
    public final String toString() {
        return this.f8555g + ": value=" + this.f8564b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8555g);
        parcel.writeString(this.f8563a);
        parcel.writeString(this.f8564b);
    }
}
