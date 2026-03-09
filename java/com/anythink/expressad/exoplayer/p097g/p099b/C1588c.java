package com.anythink.expressad.exoplayer.p097g.p099b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1588c extends AbstractC1593h {
    public static final Parcelable.Creator<C1588c> CREATOR = new Parcelable.Creator<C1588c>() { // from class: com.anythink.expressad.exoplayer.g.b.c.1
        /* JADX INFO: renamed from: a */
        private static C1588c m7098a(Parcel parcel) {
            return new C1588c(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1588c[] m7099a(int i) {
            return new C1588c[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1588c createFromParcel(Parcel parcel) {
            return new C1588c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1588c[] newArray(int i) {
            return new C1588c[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public static final String f8513a = "CHAP";

    /* JADX INFO: renamed from: b */
    public final String f8514b;

    /* JADX INFO: renamed from: c */
    public final int f8515c;

    /* JADX INFO: renamed from: d */
    public final int f8516d;

    /* JADX INFO: renamed from: e */
    public final long f8517e;

    /* JADX INFO: renamed from: f */
    public final long f8518f;

    /* JADX INFO: renamed from: h */
    private final AbstractC1593h[] f8519h;

    public C1588c(Parcel parcel) {
        super(f8513a);
        this.f8514b = parcel.readString();
        this.f8515c = parcel.readInt();
        this.f8516d = parcel.readInt();
        this.f8517e = parcel.readLong();
        this.f8518f = parcel.readLong();
        int i = parcel.readInt();
        this.f8519h = new AbstractC1593h[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f8519h[i2] = (AbstractC1593h) parcel.readParcelable(AbstractC1593h.class.getClassLoader());
        }
    }

    public C1588c(String str, int i, int i2, long j, long j2, AbstractC1593h[] abstractC1593hArr) {
        super(f8513a);
        this.f8514b = str;
        this.f8515c = i;
        this.f8516d = i2;
        this.f8517e = j;
        this.f8518f = j2;
        this.f8519h = abstractC1593hArr;
    }

    /* JADX INFO: renamed from: a */
    private int m7096a() {
        return this.f8519h.length;
    }

    /* JADX INFO: renamed from: a */
    private AbstractC1593h m7097a(int i) {
        return this.f8519h[i];
    }

    @Override // com.anythink.expressad.exoplayer.p097g.p099b.AbstractC1593h, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1588c.class == obj.getClass()) {
            C1588c c1588c = (C1588c) obj;
            if (this.f8515c == c1588c.f8515c && this.f8516d == c1588c.f8516d && this.f8517e == c1588c.f8517e && this.f8518f == c1588c.f8518f && C1717af.m8085a((Object) this.f8514b, (Object) c1588c.f8514b) && Arrays.equals(this.f8519h, c1588c.f8519h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.f8515c + 527) * 31) + this.f8516d) * 31) + ((int) this.f8517e)) * 31) + ((int) this.f8518f)) * 31;
        String str = this.f8514b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8514b);
        parcel.writeInt(this.f8515c);
        parcel.writeInt(this.f8516d);
        parcel.writeLong(this.f8517e);
        parcel.writeLong(this.f8518f);
        parcel.writeInt(this.f8519h.length);
        for (AbstractC1593h abstractC1593h : this.f8519h) {
            parcel.writeParcelable(abstractC1593h, 0);
        }
    }
}
