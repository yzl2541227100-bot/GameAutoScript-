package com.anythink.expressad.exoplayer.p101h;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.af */
/* JADX INFO: loaded from: classes.dex */
public final class C1621af implements Parcelable {

    /* JADX INFO: renamed from: b */
    public final int f8754b;

    /* JADX INFO: renamed from: c */
    private final C1620ae[] f8755c;

    /* JADX INFO: renamed from: d */
    private int f8756d;

    /* JADX INFO: renamed from: a */
    public static final C1621af f8753a = new C1621af(new C1620ae[0]);
    public static final Parcelable.Creator<C1621af> CREATOR = new Parcelable.Creator<C1621af>() { // from class: com.anythink.expressad.exoplayer.h.af.1
        /* JADX INFO: renamed from: a */
        private static C1621af m7300a(Parcel parcel) {
            return new C1621af(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1621af[] m7301a(int i) {
            return new C1621af[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1621af createFromParcel(Parcel parcel) {
            return new C1621af(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1621af[] newArray(int i) {
            return new C1621af[i];
        }
    };

    public C1621af(Parcel parcel) {
        int i = parcel.readInt();
        this.f8754b = i;
        this.f8755c = new C1620ae[i];
        for (int i2 = 0; i2 < this.f8754b; i2++) {
            this.f8755c[i2] = (C1620ae) parcel.readParcelable(C1620ae.class.getClassLoader());
        }
    }

    public C1621af(C1620ae... c1620aeArr) {
        this.f8755c = c1620aeArr;
        this.f8754b = c1620aeArr.length;
    }

    /* JADX INFO: renamed from: a */
    private boolean m7297a() {
        return this.f8754b == 0;
    }

    /* JADX INFO: renamed from: a */
    public final int m7298a(C1620ae c1620ae) {
        for (int i = 0; i < this.f8754b; i++) {
            if (this.f8755c[i] == c1620ae) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public final C1620ae m7299a(int i) {
        return this.f8755c[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1621af.class == obj.getClass()) {
            C1621af c1621af = (C1621af) obj;
            if (this.f8754b == c1621af.f8754b && Arrays.equals(this.f8755c, c1621af.f8755c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8756d == 0) {
            this.f8756d = Arrays.hashCode(this.f8755c);
        }
        return this.f8756d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8754b);
        for (int i2 = 0; i2 < this.f8754b; i2++) {
            parcel.writeParcelable(this.f8755c[i2], 0);
        }
    }
}
