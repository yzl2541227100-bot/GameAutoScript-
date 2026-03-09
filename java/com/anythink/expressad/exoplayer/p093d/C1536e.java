package com.anythink.expressad.exoplayer.p093d;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1536e implements Parcelable, Comparator<a> {
    public static final Parcelable.Creator<C1536e> CREATOR = new Parcelable.Creator<C1536e>() { // from class: com.anythink.expressad.exoplayer.d.e.1
        /* JADX INFO: renamed from: a */
        private static C1536e m6770a(Parcel parcel) {
            return new C1536e(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1536e[] m6771a(int i) {
            return new C1536e[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1536e createFromParcel(Parcel parcel) {
            return new C1536e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1536e[] newArray(int i) {
            return new C1536e[i];
        }
    };

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f7985a;

    /* JADX INFO: renamed from: b */
    public final int f7986b;

    /* JADX INFO: renamed from: c */
    private final a[] f7987c;

    /* JADX INFO: renamed from: d */
    private int f7988d;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.e$a */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.expressad.exoplayer.d.e.a.1
            /* JADX INFO: renamed from: a */
            private static a m6776a(Parcel parcel) {
                return new a(parcel);
            }

            /* JADX INFO: renamed from: a */
            private static a[] m6777a(int i) {
                return new a[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ a[] newArray(int i) {
                return new a[i];
            }
        };

        /* JADX INFO: renamed from: a */
        @Nullable
        public final String f7989a;

        /* JADX INFO: renamed from: b */
        public final String f7990b;

        /* JADX INFO: renamed from: c */
        public final byte[] f7991c;

        /* JADX INFO: renamed from: d */
        public final boolean f7992d;

        /* JADX INFO: renamed from: e */
        private int f7993e;

        /* JADX INFO: renamed from: f */
        private final UUID f7994f;

        public a(Parcel parcel) {
            this.f7994f = new UUID(parcel.readLong(), parcel.readLong());
            this.f7989a = parcel.readString();
            this.f7990b = parcel.readString();
            this.f7991c = parcel.createByteArray();
            this.f7992d = parcel.readByte() != 0;
        }

        private a(UUID uuid, @Nullable String str, String str2, byte[] bArr) {
            this.f7994f = (UUID) C1711a.m8005a(uuid);
            this.f7989a = str;
            this.f7990b = (String) C1711a.m8005a(str2);
            this.f7991c = bArr;
            this.f7992d = false;
        }

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, (byte) 0);
        }

        private a(UUID uuid, String str, byte[] bArr, byte b) {
            this(uuid, (String) null, str, bArr);
        }

        /* JADX INFO: renamed from: b */
        private boolean m6773b(a aVar) {
            return m6774a() && !aVar.m6774a() && m6775a(aVar.f7994f);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m6774a() {
            return this.f7991c != null;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m6775a(UUID uuid) {
            return C1500b.f7468bh.equals(this.f7994f) || uuid.equals(this.f7994f);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            return C1717af.m8085a((Object) this.f7989a, (Object) aVar.f7989a) && C1717af.m8085a((Object) this.f7990b, (Object) aVar.f7990b) && C1717af.m8085a(this.f7994f, aVar.f7994f) && Arrays.equals(this.f7991c, aVar.f7991c);
        }

        public final int hashCode() {
            if (this.f7993e == 0) {
                int iHashCode = this.f7994f.hashCode() * 31;
                String str = this.f7989a;
                this.f7993e = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f7990b.hashCode()) * 31) + Arrays.hashCode(this.f7991c);
            }
            return this.f7993e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f7994f.getMostSignificantBits());
            parcel.writeLong(this.f7994f.getLeastSignificantBits());
            parcel.writeString(this.f7989a);
            parcel.writeString(this.f7990b);
            parcel.writeByteArray(this.f7991c);
            parcel.writeByte(this.f7992d ? (byte) 1 : (byte) 0);
        }
    }

    public C1536e(Parcel parcel) {
        this.f7985a = parcel.readString();
        a[] aVarArr = (a[]) parcel.createTypedArray(a.CREATOR);
        this.f7987c = aVarArr;
        this.f7986b = aVarArr.length;
    }

    private C1536e(String str, List<a> list) {
        this(str, false, (a[]) list.toArray(new a[list.size()]));
    }

    private C1536e(@Nullable String str, boolean z, a... aVarArr) {
        this.f7985a = str;
        aVarArr = z ? (a[]) aVarArr.clone() : aVarArr;
        Arrays.sort(aVarArr, this);
        this.f7987c = aVarArr;
        this.f7986b = aVarArr.length;
    }

    private C1536e(@Nullable String str, a... aVarArr) {
        this(str, true, aVarArr);
    }

    public C1536e(List<a> list) {
        this(null, false, (a[]) list.toArray(new a[list.size()]));
    }

    private C1536e(a... aVarArr) {
        this((String) null, aVarArr);
    }

    /* JADX INFO: renamed from: a */
    private static int m6764a(a aVar, a aVar2) {
        UUID uuid = C1500b.f7468bh;
        return uuid.equals(aVar.f7994f) ? uuid.equals(aVar2.f7994f) ? 0 : 1 : aVar.f7994f.compareTo(aVar2.f7994f);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    private a m6765a(UUID uuid) {
        for (a aVar : this.f7987c) {
            if (aVar.m6775a(uuid)) {
                return aVar;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static C1536e m6766a(@Nullable C1536e c1536e, @Nullable C1536e c1536e2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c1536e != null) {
            str = c1536e.f7985a;
            for (a aVar : c1536e.f7987c) {
                if (aVar.m6774a()) {
                    arrayList.add(aVar);
                }
            }
        } else {
            str = null;
        }
        if (c1536e2 != null) {
            if (str == null) {
                str = c1536e2.f7985a;
            }
            int size = arrayList.size();
            for (a aVar2 : c1536e2.f7987c) {
                if (aVar2.m6774a() && !m6767a(arrayList, size, aVar2.f7994f)) {
                    arrayList.add(aVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1536e(str, arrayList);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m6767a(ArrayList<a> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).f7994f.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final a m6768a(int i) {
        return this.f7987c[i];
    }

    /* JADX INFO: renamed from: a */
    public final C1536e m6769a(@Nullable String str) {
        return C1717af.m8085a((Object) this.f7985a, (Object) str) ? this : new C1536e(str, false, this.f7987c);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(a aVar, a aVar2) {
        a aVar3 = aVar;
        a aVar4 = aVar2;
        UUID uuid = C1500b.f7468bh;
        return uuid.equals(aVar3.f7994f) ? uuid.equals(aVar4.f7994f) ? 0 : 1 : aVar3.f7994f.compareTo(aVar4.f7994f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1536e.class == obj.getClass()) {
            C1536e c1536e = (C1536e) obj;
            if (C1717af.m8085a((Object) this.f7985a, (Object) c1536e.f7985a) && Arrays.equals(this.f7987c, c1536e.f7987c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f7988d == 0) {
            String str = this.f7985a;
            this.f7988d = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f7987c);
        }
        return this.f7988d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7985a);
        parcel.writeTypedArray(this.f7987c, 0);
    }
}
