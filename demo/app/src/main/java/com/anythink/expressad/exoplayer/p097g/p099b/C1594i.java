package com.anythink.expressad.exoplayer.p097g.p099b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.b.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1594i extends AbstractC1593h {
    public static final Parcelable.Creator<C1594i> CREATOR = new Parcelable.Creator<C1594i>() { // from class: com.anythink.expressad.exoplayer.g.b.i.1
        /* JADX INFO: renamed from: a */
        private static C1594i m7134a(Parcel parcel) {
            return new C1594i(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1594i[] m7135a(int i) {
            return new C1594i[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1594i createFromParcel(Parcel parcel) {
            return new C1594i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1594i[] newArray(int i) {
            return new C1594i[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public static final String f8556a = "----";

    /* JADX INFO: renamed from: b */
    public final String f8557b;

    /* JADX INFO: renamed from: c */
    public final String f8558c;

    /* JADX INFO: renamed from: d */
    public final String f8559d;

    public C1594i(Parcel parcel) {
        super(f8556a);
        this.f8557b = (String) C1711a.m8005a(parcel.readString());
        this.f8558c = (String) C1711a.m8005a(parcel.readString());
        this.f8559d = (String) C1711a.m8005a(parcel.readString());
    }

    public C1594i(String str, String str2, String str3) {
        super(f8556a);
        this.f8557b = str;
        this.f8558c = str2;
        this.f8559d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1594i.class == obj.getClass()) {
            C1594i c1594i = (C1594i) obj;
            if (C1717af.m8085a((Object) this.f8558c, (Object) c1594i.f8558c) && C1717af.m8085a((Object) this.f8557b, (Object) c1594i.f8557b) && C1717af.m8085a((Object) this.f8559d, (Object) c1594i.f8559d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8557b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f8558c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8559d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.anythink.expressad.exoplayer.p097g.p099b.AbstractC1593h
    public final String toString() {
        return this.f8555g + ": domain=" + this.f8557b + ", description=" + this.f8558c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8555g);
        parcel.writeString(this.f8557b);
        parcel.writeString(this.f8559d);
    }
}
