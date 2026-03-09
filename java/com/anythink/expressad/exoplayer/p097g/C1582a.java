package com.anythink.expressad.exoplayer.p097g;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1582a implements Parcelable {
    public static final Parcelable.Creator<C1582a> CREATOR = new Parcelable.Creator<C1582a>() { // from class: com.anythink.expressad.exoplayer.g.a.1
        /* JADX INFO: renamed from: a */
        private static C1582a m7087a(Parcel parcel) {
            return new C1582a(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1582a[] m7088a() {
            return new C1582a[0];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1582a createFromParcel(Parcel parcel) {
            return new C1582a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1582a[] newArray(int i) {
            return new C1582a[0];
        }
    };

    /* JADX INFO: renamed from: a */
    private final a[] f8499a;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.a$a */
    public interface a extends Parcelable {
    }

    public C1582a(Parcel parcel) {
        this.f8499a = new a[parcel.readInt()];
        int i = 0;
        while (true) {
            a[] aVarArr = this.f8499a;
            if (i >= aVarArr.length) {
                return;
            }
            aVarArr[i] = (a) parcel.readParcelable(a.class.getClassLoader());
            i++;
        }
    }

    public C1582a(List<? extends a> list) {
        a[] aVarArr = new a[list.size()];
        this.f8499a = aVarArr;
        list.toArray(aVarArr);
    }

    public C1582a(a... aVarArr) {
        this.f8499a = aVarArr;
    }

    /* JADX INFO: renamed from: a */
    public final int m7085a() {
        return this.f8499a.length;
    }

    /* JADX INFO: renamed from: a */
    public final a m7086a(int i) {
        return this.f8499a[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1582a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8499a, ((C1582a) obj).f8499a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8499a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8499a.length);
        for (a aVar : this.f8499a) {
            parcel.writeParcelable(aVar, 0);
        }
    }
}
