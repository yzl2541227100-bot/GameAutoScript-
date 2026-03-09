package com.anythink.expressad.exoplayer.p097g.p099b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1717af;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.b.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1590e extends AbstractC1593h {
    public static final Parcelable.Creator<C1590e> CREATOR = new Parcelable.Creator<C1590e>() { // from class: com.anythink.expressad.exoplayer.g.b.e.1
        /* JADX INFO: renamed from: a */
        private static C1590e m7104a(Parcel parcel) {
            return new C1590e(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1590e[] m7105a(int i) {
            return new C1590e[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1590e createFromParcel(Parcel parcel) {
            return new C1590e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1590e[] newArray(int i) {
            return new C1590e[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public static final String f8526a = "COMM";

    /* JADX INFO: renamed from: b */
    public final String f8527b;

    /* JADX INFO: renamed from: c */
    public final String f8528c;

    /* JADX INFO: renamed from: d */
    public final String f8529d;

    public C1590e(Parcel parcel) {
        super(f8526a);
        this.f8527b = parcel.readString();
        this.f8528c = parcel.readString();
        this.f8529d = parcel.readString();
    }

    public C1590e(String str, String str2, String str3) {
        super(f8526a);
        this.f8527b = str;
        this.f8528c = str2;
        this.f8529d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1590e.class == obj.getClass()) {
            C1590e c1590e = (C1590e) obj;
            if (C1717af.m8085a((Object) this.f8528c, (Object) c1590e.f8528c) && C1717af.m8085a((Object) this.f8527b, (Object) c1590e.f8527b) && C1717af.m8085a((Object) this.f8529d, (Object) c1590e.f8529d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8527b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f8528c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8529d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.anythink.expressad.exoplayer.p097g.p099b.AbstractC1593h
    public final String toString() {
        return this.f8555g + ": language=" + this.f8527b + ", description=" + this.f8528c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8555g);
        parcel.writeString(this.f8527b);
        parcel.writeString(this.f8529d);
    }
}
