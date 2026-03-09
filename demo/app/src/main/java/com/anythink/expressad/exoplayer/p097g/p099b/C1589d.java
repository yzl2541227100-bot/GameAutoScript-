package com.anythink.expressad.exoplayer.p097g.p099b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1589d extends AbstractC1593h {
    public static final Parcelable.Creator<C1589d> CREATOR = new Parcelable.Creator<C1589d>() { // from class: com.anythink.expressad.exoplayer.g.b.d.1
        /* JADX INFO: renamed from: a */
        private static C1589d m7102a(Parcel parcel) {
            return new C1589d(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1589d[] m7103a(int i) {
            return new C1589d[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1589d createFromParcel(Parcel parcel) {
            return new C1589d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1589d[] newArray(int i) {
            return new C1589d[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public static final String f8520a = "CTOC";

    /* JADX INFO: renamed from: b */
    public final String f8521b;

    /* JADX INFO: renamed from: c */
    public final boolean f8522c;

    /* JADX INFO: renamed from: d */
    public final boolean f8523d;

    /* JADX INFO: renamed from: e */
    public final String[] f8524e;

    /* JADX INFO: renamed from: f */
    private final AbstractC1593h[] f8525f;

    public C1589d(Parcel parcel) {
        super(f8520a);
        this.f8521b = parcel.readString();
        this.f8522c = parcel.readByte() != 0;
        this.f8523d = parcel.readByte() != 0;
        this.f8524e = parcel.createStringArray();
        int i = parcel.readInt();
        this.f8525f = new AbstractC1593h[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f8525f[i2] = (AbstractC1593h) parcel.readParcelable(AbstractC1593h.class.getClassLoader());
        }
    }

    public C1589d(String str, boolean z, boolean z3, String[] strArr, AbstractC1593h[] abstractC1593hArr) {
        super(f8520a);
        this.f8521b = str;
        this.f8522c = z;
        this.f8523d = z3;
        this.f8524e = strArr;
        this.f8525f = abstractC1593hArr;
    }

    /* JADX INFO: renamed from: a */
    private int m7100a() {
        return this.f8525f.length;
    }

    /* JADX INFO: renamed from: a */
    private AbstractC1593h m7101a(int i) {
        return this.f8525f[i];
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1589d.class == obj.getClass()) {
            C1589d c1589d = (C1589d) obj;
            if (this.f8522c == c1589d.f8522c && this.f8523d == c1589d.f8523d && C1717af.m8085a((Object) this.f8521b, (Object) c1589d.f8521b) && Arrays.equals(this.f8524e, c1589d.f8524e) && Arrays.equals(this.f8525f, c1589d.f8525f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f8522c ? 1 : 0) + 527) * 31) + (this.f8523d ? 1 : 0)) * 31;
        String str = this.f8521b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8521b);
        parcel.writeByte(this.f8522c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8523d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f8524e);
        parcel.writeInt(this.f8525f.length);
        for (AbstractC1593h abstractC1593h : this.f8525f) {
            parcel.writeParcelable(abstractC1593h, 0);
        }
    }
}
