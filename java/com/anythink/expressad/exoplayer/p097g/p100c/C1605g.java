package com.anythink.expressad.exoplayer.p097g.p100c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p107k.C1714ac;
import com.anythink.expressad.exoplayer.p107k.C1736s;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.c.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1605g extends AbstractC1600b {
    public static final Parcelable.Creator<C1605g> CREATOR = new Parcelable.Creator<C1605g>() { // from class: com.anythink.expressad.exoplayer.g.c.g.1
        /* JADX INFO: renamed from: a */
        private static C1605g m7167a(Parcel parcel) {
            return new C1605g(parcel.readLong(), parcel.readLong(), (byte) 0);
        }

        /* JADX INFO: renamed from: a */
        private static C1605g[] m7168a(int i) {
            return new C1605g[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1605g createFromParcel(Parcel parcel) {
            return new C1605g(parcel.readLong(), parcel.readLong(), (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1605g[] newArray(int i) {
            return new C1605g[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public final long f8608a;

    /* JADX INFO: renamed from: b */
    public final long f8609b;

    private C1605g(long j, long j2) {
        this.f8608a = j;
        this.f8609b = j2;
    }

    public /* synthetic */ C1605g(long j, long j2, byte b) {
        this(j, j2);
    }

    /* JADX INFO: renamed from: a */
    public static long m7165a(C1736s c1736s, long j) {
        long jM8273d = c1736s.m8273d();
        return (128 & jM8273d) != 0 ? 8589934591L & ((((jM8273d & 1) << 32) | c1736s.m8279h()) + j) : C1500b.f7455b;
    }

    /* JADX INFO: renamed from: a */
    public static C1605g m7166a(C1736s c1736s, long j, C1714ac c1714ac) {
        long jM7165a = m7165a(c1736s, j);
        return new C1605g(jM7165a, c1714ac.m8037a(jM7165a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8608a);
        parcel.writeLong(this.f8609b);
    }
}
