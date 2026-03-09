package com.anythink.expressad.exoplayer.p097g.p099b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1587b extends AbstractC1593h {
    public static final Parcelable.Creator<C1587b> CREATOR = new Parcelable.Creator<C1587b>() { // from class: com.anythink.expressad.exoplayer.g.b.b.1
        /* JADX INFO: renamed from: a */
        private static C1587b m7094a(Parcel parcel) {
            return new C1587b(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1587b[] m7095a(int i) {
            return new C1587b[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1587b createFromParcel(Parcel parcel) {
            return new C1587b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1587b[] newArray(int i) {
            return new C1587b[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public final byte[] f8512a;

    public C1587b(Parcel parcel) {
        super(parcel.readString());
        this.f8512a = parcel.createByteArray();
    }

    public C1587b(String str, byte[] bArr) {
        super(str);
        this.f8512a = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1587b.class == obj.getClass()) {
            C1587b c1587b = (C1587b) obj;
            if (this.f8555g.equals(c1587b.f8555g) && Arrays.equals(this.f8512a, c1587b.f8512a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8555g.hashCode() + 527) * 31) + Arrays.hashCode(this.f8512a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8555g);
        parcel.writeByteArray(this.f8512a);
    }
}
