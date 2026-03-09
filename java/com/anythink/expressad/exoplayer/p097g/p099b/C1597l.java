package com.anythink.expressad.exoplayer.p097g.p099b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1717af;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.b.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1597l extends AbstractC1593h {
    public static final Parcelable.Creator<C1597l> CREATOR = new Parcelable.Creator<C1597l>() { // from class: com.anythink.expressad.exoplayer.g.b.l.1
        /* JADX INFO: renamed from: a */
        private static C1597l m7140a(Parcel parcel) {
            return new C1597l(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1597l[] m7141a(int i) {
            return new C1597l[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1597l createFromParcel(Parcel parcel) {
            return new C1597l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1597l[] newArray(int i) {
            return new C1597l[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public final String f8565a;

    /* JADX INFO: renamed from: b */
    public final String f8566b;

    public C1597l(Parcel parcel) {
        super(parcel.readString());
        this.f8565a = parcel.readString();
        this.f8566b = parcel.readString();
    }

    public C1597l(String str, String str2, String str3) {
        super(str);
        this.f8565a = str2;
        this.f8566b = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1597l.class == obj.getClass()) {
            C1597l c1597l = (C1597l) obj;
            if (this.f8555g.equals(c1597l.f8555g) && C1717af.m8085a((Object) this.f8565a, (Object) c1597l.f8565a) && C1717af.m8085a((Object) this.f8566b, (Object) c1597l.f8566b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f8555g.hashCode() + 527) * 31;
        String str = this.f8565a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8566b;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.anythink.expressad.exoplayer.p097g.p099b.AbstractC1593h
    public final String toString() {
        return this.f8555g + ": url=" + this.f8566b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8555g);
        parcel.writeString(this.f8565a);
        parcel.writeString(this.f8566b);
    }
}
