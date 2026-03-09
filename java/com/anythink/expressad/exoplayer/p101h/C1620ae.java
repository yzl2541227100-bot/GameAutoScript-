package com.anythink.expressad.exoplayer.p101h;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.ae */
/* JADX INFO: loaded from: classes.dex */
public final class C1620ae implements Parcelable {
    public static final Parcelable.Creator<C1620ae> CREATOR = new Parcelable.Creator<C1620ae>() { // from class: com.anythink.expressad.exoplayer.h.ae.1
        /* JADX INFO: renamed from: a */
        private static C1620ae m7295a(Parcel parcel) {
            return new C1620ae(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1620ae[] m7296a(int i) {
            return new C1620ae[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1620ae createFromParcel(Parcel parcel) {
            return new C1620ae(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1620ae[] newArray(int i) {
            return new C1620ae[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f8750a;

    /* JADX INFO: renamed from: b */
    private final C1753m[] f8751b;

    /* JADX INFO: renamed from: c */
    private int f8752c;

    public C1620ae(Parcel parcel) {
        int i = parcel.readInt();
        this.f8750a = i;
        this.f8751b = new C1753m[i];
        for (int i2 = 0; i2 < this.f8750a; i2++) {
            this.f8751b[i2] = (C1753m) parcel.readParcelable(C1753m.class.getClassLoader());
        }
    }

    public C1620ae(C1753m... c1753mArr) {
        C1711a.m8012b(true);
        this.f8751b = c1753mArr;
        this.f8750a = 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m7293a(C1753m c1753m) {
        int i = 0;
        while (true) {
            C1753m[] c1753mArr = this.f8751b;
            if (i >= c1753mArr.length) {
                return -1;
            }
            if (c1753m == c1753mArr[i]) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1753m m7294a(int i) {
        return this.f8751b[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1620ae.class == obj.getClass()) {
            C1620ae c1620ae = (C1620ae) obj;
            if (this.f8750a == c1620ae.f8750a && Arrays.equals(this.f8751b, c1620ae.f8751b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8752c == 0) {
            this.f8752c = Arrays.hashCode(this.f8751b) + 527;
        }
        return this.f8752c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8750a);
        for (int i2 = 0; i2 < this.f8750a; i2++) {
            parcel.writeParcelable(this.f8751b[i2], 0);
        }
    }
}
