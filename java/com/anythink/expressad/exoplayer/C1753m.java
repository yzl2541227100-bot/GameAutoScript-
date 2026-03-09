package com.anythink.expressad.exoplayer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p093d.C1536e;
import com.anythink.expressad.exoplayer.p097g.C1582a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p108l.C1746b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1753m implements Parcelable {
    public static final Parcelable.Creator<C1753m> CREATOR = new Parcelable.Creator<C1753m>() { // from class: com.anythink.expressad.exoplayer.m.1
        /* JADX INFO: renamed from: a */
        private static C1753m m8417a(Parcel parcel) {
            return new C1753m(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1753m[] m8418a(int i) {
            return new C1753m[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1753m createFromParcel(Parcel parcel) {
            return new C1753m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1753m[] newArray(int i) {
            return new C1753m[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public static final int f9961a = -1;

    /* JADX INFO: renamed from: b */
    public static final long f9962b = Long.MAX_VALUE;

    /* JADX INFO: renamed from: A */
    @Nullable
    public final String f9963A;

    /* JADX INFO: renamed from: B */
    public final int f9964B;

    /* JADX INFO: renamed from: C */
    private int f9965C;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f9966c;

    /* JADX INFO: renamed from: d */
    public final int f9967d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final String f9968e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final C1582a f9969f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final String f9970g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f9971h;

    /* JADX INFO: renamed from: i */
    public final int f9972i;

    /* JADX INFO: renamed from: j */
    public final List<byte[]> f9973j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final C1536e f9974k;

    /* JADX INFO: renamed from: l */
    public final long f9975l;

    /* JADX INFO: renamed from: m */
    public final int f9976m;

    /* JADX INFO: renamed from: n */
    public final int f9977n;

    /* JADX INFO: renamed from: o */
    public final float f9978o;

    /* JADX INFO: renamed from: p */
    public final int f9979p;

    /* JADX INFO: renamed from: q */
    public final float f9980q;

    /* JADX INFO: renamed from: r */
    public final int f9981r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public final byte[] f9982s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public final C1746b f9983t;

    /* JADX INFO: renamed from: u */
    public final int f9984u;

    /* JADX INFO: renamed from: v */
    public final int f9985v;

    /* JADX INFO: renamed from: w */
    public final int f9986w;

    /* JADX INFO: renamed from: x */
    public final int f9987x;

    /* JADX INFO: renamed from: y */
    public final int f9988y;

    /* JADX INFO: renamed from: z */
    public final int f9989z;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.m$1 */
    public class AnonymousClass1 implements Parcelable.Creator<C1753m> {
        /* JADX INFO: renamed from: a */
        private static C1753m m8417a(Parcel parcel) {
            return new C1753m(parcel);
        }

        /* JADX INFO: renamed from: a */
        private static C1753m[] m8418a(int i) {
            return new C1753m[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C1753m createFromParcel(Parcel parcel) {
            return new C1753m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C1753m[] newArray(int i) {
            return new C1753m[i];
        }
    }

    public C1753m(Parcel parcel) {
        this.f9966c = parcel.readString();
        this.f9970g = parcel.readString();
        this.f9971h = parcel.readString();
        this.f9968e = parcel.readString();
        this.f9967d = parcel.readInt();
        this.f9972i = parcel.readInt();
        this.f9976m = parcel.readInt();
        this.f9977n = parcel.readInt();
        this.f9978o = parcel.readFloat();
        this.f9979p = parcel.readInt();
        this.f9980q = parcel.readFloat();
        this.f9982s = C1717af.m8084a(parcel) ? parcel.createByteArray() : null;
        this.f9981r = parcel.readInt();
        this.f9983t = (C1746b) parcel.readParcelable(C1746b.class.getClassLoader());
        this.f9984u = parcel.readInt();
        this.f9985v = parcel.readInt();
        this.f9986w = parcel.readInt();
        this.f9987x = parcel.readInt();
        this.f9988y = parcel.readInt();
        this.f9989z = parcel.readInt();
        this.f9963A = parcel.readString();
        this.f9964B = parcel.readInt();
        this.f9975l = parcel.readLong();
        int i = parcel.readInt();
        this.f9973j = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f9973j.add(parcel.createByteArray());
        }
        this.f9974k = (C1536e) parcel.readParcelable(C1536e.class.getClassLoader());
        this.f9969f = (C1582a) parcel.readParcelable(C1582a.class.getClassLoader());
    }

    private C1753m(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, @Nullable byte[] bArr, int i6, @Nullable C1746b c1746b, int i7, int i8, int i9, int i10, int i11, int i12, @Nullable String str5, int i13, long j, @Nullable List<byte[]> list, @Nullable C1536e c1536e, @Nullable C1582a c1582a) {
        this.f9966c = str;
        this.f9970g = str2;
        this.f9971h = str3;
        this.f9968e = str4;
        this.f9967d = i;
        this.f9972i = i2;
        this.f9976m = i3;
        this.f9977n = i4;
        this.f9978o = f;
        int i14 = i5;
        this.f9979p = i14 == -1 ? 0 : i14;
        this.f9980q = f2 == -1.0f ? 1.0f : f2;
        this.f9982s = bArr;
        this.f9981r = i6;
        this.f9983t = c1746b;
        this.f9984u = i7;
        this.f9985v = i8;
        this.f9986w = i9;
        int i15 = i10;
        this.f9987x = i15 == -1 ? 0 : i15;
        this.f9988y = i11 != -1 ? i11 : 0;
        this.f9989z = i12;
        this.f9963A = str5;
        this.f9964B = i13;
        this.f9975l = j;
        this.f9973j = list == null ? Collections.emptyList() : list;
        this.f9974k = c1536e;
        this.f9969f = c1582a;
    }

    /* JADX INFO: renamed from: a */
    public static C1753m m8387a(@Nullable String str, @Nullable String str2) {
        return new C1753m(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
    }

    /* JADX INFO: renamed from: a */
    private static C1753m m8388a(@Nullable String str, String str2, int i, @Nullable String str3) {
        return m8397a(str, str2, (String) null, -1, i, str3, -1, (C1536e) null, Long.MAX_VALUE, (List<byte[]>) Collections.emptyList());
    }

    /* JADX INFO: renamed from: a */
    private static C1753m m8389a(@Nullable String str, String str2, int i, @Nullable String str3, @Nullable C1536e c1536e) {
        return m8397a(str, str2, (String) null, -1, i, str3, -1, c1536e, Long.MAX_VALUE, (List<byte[]>) Collections.emptyList());
    }

    /* JADX INFO: renamed from: a */
    public static C1753m m8390a(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, @Nullable C1746b c1746b, @Nullable C1536e c1536e) {
        return new C1753m(str, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, c1746b, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, c1536e, null);
    }

    /* JADX INFO: renamed from: a */
    private static C1753m m8391a(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, @Nullable C1536e c1536e) {
        return m8390a(str, str2, str3, i, i2, i3, i4, f, list, -1, -1.0f, null, -1, null, c1536e);
    }

    /* JADX INFO: renamed from: a */
    private C1753m m8392a(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, @Nullable String str4) {
        return new C1753m(str, this.f9970g, str2, str3, i, this.f9972i, i2, i3, this.f9978o, this.f9979p, this.f9980q, this.f9982s, this.f9981r, this.f9983t, this.f9984u, this.f9985v, this.f9986w, this.f9987x, this.f9988y, i4, str4, this.f9964B, this.f9975l, this.f9973j, this.f9974k, this.f9969f);
    }

    /* JADX INFO: renamed from: a */
    public static C1753m m8393a(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, List<byte[]> list, @Nullable C1536e c1536e, @Nullable String str4) {
        return m8394a(str, str2, str3, i, i2, i3, i4, list, c1536e, str4, null);
    }

    /* JADX INFO: renamed from: a */
    private static C1753m m8394a(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, List<byte[]> list, @Nullable C1536e c1536e, @Nullable String str4, @Nullable C1582a c1582a) {
        return new C1753m(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, i4, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, c1536e, c1582a);
    }

    /* JADX INFO: renamed from: a */
    public static C1753m m8395a(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, List<byte[]> list, @Nullable C1536e c1536e, @Nullable String str4) {
        return m8393a(str, str2, str3, i, i2, i3, -1, list, c1536e, str4);
    }

    /* JADX INFO: renamed from: a */
    private static C1753m m8396a(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, int i3, @Nullable C1536e c1536e) {
        return m8397a(str, str2, str3, i, i2, str4, i3, c1536e, Long.MAX_VALUE, (List<byte[]>) Collections.emptyList());
    }

    /* JADX INFO: renamed from: a */
    public static C1753m m8397a(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, int i3, @Nullable C1536e c1536e, long j, List<byte[]> list) {
        return new C1753m(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, c1536e, null);
    }

    /* JADX INFO: renamed from: a */
    private static C1753m m8398a(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, @Nullable C1536e c1536e, long j) {
        return m8397a(str, str2, str3, i, i2, str4, -1, c1536e, j, (List<byte[]>) Collections.emptyList());
    }

    /* JADX INFO: renamed from: a */
    private static C1753m m8399a(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, List<byte[]> list, @Nullable String str4, @Nullable C1536e c1536e) {
        return new C1753m(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, Long.MAX_VALUE, list, c1536e, null);
    }

    /* JADX INFO: renamed from: a */
    public static C1753m m8400a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable C1536e c1536e) {
        return new C1753m(str, null, str2, str3, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, c1536e, null);
    }

    /* JADX INFO: renamed from: a */
    private static C1753m m8401a(@Nullable String str, @Nullable String str2, String str3, String str4, int i, int i2, int i3, float f, List<byte[]> list, int i4) {
        return new C1753m(str, str2, str3, str4, i, -1, i2, i3, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, null, -1, Long.MAX_VALUE, list, null, null);
    }

    /* JADX INFO: renamed from: a */
    private static C1753m m8402a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, int i3, List<byte[]> list, int i4, @Nullable String str5) {
        return new C1753m(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, i4, str5, -1, Long.MAX_VALUE, list, null, null);
    }

    /* JADX INFO: renamed from: a */
    private static C1753m m8403a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, @Nullable String str5) {
        return new C1753m(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    /* JADX INFO: renamed from: b */
    private C1753m m8404b(int i) {
        return new C1753m(this.f9966c, this.f9970g, this.f9971h, this.f9968e, this.f9967d, this.f9972i, this.f9976m, this.f9977n, this.f9978o, i, this.f9980q, this.f9982s, this.f9981r, this.f9983t, this.f9984u, this.f9985v, this.f9986w, this.f9987x, this.f9988y, this.f9989z, this.f9963A, this.f9964B, this.f9975l, this.f9973j, this.f9974k, this.f9969f);
    }

    /* JADX INFO: renamed from: b */
    private static C1753m m8405b(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, @Nullable C1536e c1536e) {
        return m8390a(str, str2, str3, i, i2, i3, i4, f, list, -1, -1.0f, null, -1, null, c1536e);
    }

    /* JADX INFO: renamed from: b */
    private static C1753m m8406b(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, @Nullable String str5) {
        return new C1753m(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    /* JADX INFO: renamed from: c */
    private static C1753m m8407c(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, @Nullable String str5) {
        return new C1753m(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    /* JADX INFO: renamed from: c */
    public static String m8408c(C1753m c1753m) {
        if (c1753m == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(c1753m.f9966c);
        sb.append(", mimeType=");
        sb.append(c1753m.f9971h);
        if (c1753m.f9967d != -1) {
            sb.append(", bitrate=");
            sb.append(c1753m.f9967d);
        }
        if (c1753m.f9976m != -1 && c1753m.f9977n != -1) {
            sb.append(", res=");
            sb.append(c1753m.f9976m);
            sb.append("x");
            sb.append(c1753m.f9977n);
        }
        if (c1753m.f9978o != -1.0f) {
            sb.append(", fps=");
            sb.append(c1753m.f9978o);
        }
        if (c1753m.f9984u != -1) {
            sb.append(", channels=");
            sb.append(c1753m.f9984u);
        }
        if (c1753m.f9985v != -1) {
            sb.append(", sample_rate=");
            sb.append(c1753m.f9985v);
        }
        if (c1753m.f9963A != null) {
            sb.append(", language=");
            sb.append(c1753m.f9963A);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final int m8409a() {
        int i;
        int i2 = this.f9976m;
        if (i2 == -1 || (i = this.f9977n) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* JADX INFO: renamed from: a */
    public final C1753m m8410a(int i) {
        return new C1753m(this.f9966c, this.f9970g, this.f9971h, this.f9968e, this.f9967d, i, this.f9976m, this.f9977n, this.f9978o, this.f9979p, this.f9980q, this.f9982s, this.f9981r, this.f9983t, this.f9984u, this.f9985v, this.f9986w, this.f9987x, this.f9988y, this.f9989z, this.f9963A, this.f9964B, this.f9975l, this.f9973j, this.f9974k, this.f9969f);
    }

    /* JADX INFO: renamed from: a */
    public final C1753m m8411a(int i, int i2) {
        return new C1753m(this.f9966c, this.f9970g, this.f9971h, this.f9968e, this.f9967d, this.f9972i, this.f9976m, this.f9977n, this.f9978o, this.f9979p, this.f9980q, this.f9982s, this.f9981r, this.f9983t, this.f9984u, this.f9985v, this.f9986w, i, i2, this.f9989z, this.f9963A, this.f9964B, this.f9975l, this.f9973j, this.f9974k, this.f9969f);
    }

    /* JADX INFO: renamed from: a */
    public final C1753m m8412a(long j) {
        return new C1753m(this.f9966c, this.f9970g, this.f9971h, this.f9968e, this.f9967d, this.f9972i, this.f9976m, this.f9977n, this.f9978o, this.f9979p, this.f9980q, this.f9982s, this.f9981r, this.f9983t, this.f9984u, this.f9985v, this.f9986w, this.f9987x, this.f9988y, this.f9989z, this.f9963A, this.f9964B, j, this.f9973j, this.f9974k, this.f9969f);
    }

    /* JADX INFO: renamed from: a */
    public final C1753m m8413a(@Nullable C1536e c1536e) {
        return new C1753m(this.f9966c, this.f9970g, this.f9971h, this.f9968e, this.f9967d, this.f9972i, this.f9976m, this.f9977n, this.f9978o, this.f9979p, this.f9980q, this.f9982s, this.f9981r, this.f9983t, this.f9984u, this.f9985v, this.f9986w, this.f9987x, this.f9988y, this.f9989z, this.f9963A, this.f9964B, this.f9975l, this.f9973j, c1536e, this.f9969f);
    }

    /* JADX INFO: renamed from: a */
    public final C1753m m8414a(@Nullable C1582a c1582a) {
        return new C1753m(this.f9966c, this.f9970g, this.f9971h, this.f9968e, this.f9967d, this.f9972i, this.f9976m, this.f9977n, this.f9978o, this.f9979p, this.f9980q, this.f9982s, this.f9981r, this.f9983t, this.f9984u, this.f9985v, this.f9986w, this.f9987x, this.f9988y, this.f9989z, this.f9963A, this.f9964B, this.f9975l, this.f9973j, this.f9974k, c1582a);
    }

    /* JADX INFO: renamed from: a */
    public final C1753m m8415a(C1753m c1753m) {
        if (this == c1753m) {
            return this;
        }
        String str = c1753m.f9966c;
        String str2 = this.f9968e;
        if (str2 == null) {
            str2 = c1753m.f9968e;
        }
        String str3 = str2;
        int i = this.f9967d;
        if (i == -1) {
            i = c1753m.f9967d;
        }
        int i2 = i;
        float f = this.f9978o;
        if (f == -1.0f) {
            f = c1753m.f9978o;
        }
        float f2 = f;
        int i3 = this.f9989z | c1753m.f9989z;
        String str4 = this.f9963A;
        if (str4 == null) {
            str4 = c1753m.f9963A;
        }
        return new C1753m(str, this.f9970g, this.f9971h, str3, i2, this.f9972i, this.f9976m, this.f9977n, f2, this.f9979p, this.f9980q, this.f9982s, this.f9981r, this.f9983t, this.f9984u, this.f9985v, this.f9986w, this.f9987x, this.f9988y, i3, str4, this.f9964B, this.f9975l, this.f9973j, C1536e.m6766a(c1753m.f9974k, this.f9974k), this.f9969f);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8416b(C1753m c1753m) {
        if (this.f9973j.size() != c1753m.f9973j.size()) {
            return false;
        }
        for (int i = 0; i < this.f9973j.size(); i++) {
            if (!Arrays.equals(this.f9973j.get(i), c1753m.f9973j.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1753m.class == obj.getClass()) {
            C1753m c1753m = (C1753m) obj;
            if (this.f9967d == c1753m.f9967d && this.f9972i == c1753m.f9972i && this.f9976m == c1753m.f9976m && this.f9977n == c1753m.f9977n && this.f9978o == c1753m.f9978o && this.f9979p == c1753m.f9979p && this.f9980q == c1753m.f9980q && this.f9981r == c1753m.f9981r && this.f9984u == c1753m.f9984u && this.f9985v == c1753m.f9985v && this.f9986w == c1753m.f9986w && this.f9987x == c1753m.f9987x && this.f9988y == c1753m.f9988y && this.f9975l == c1753m.f9975l && this.f9989z == c1753m.f9989z && C1717af.m8085a((Object) this.f9966c, (Object) c1753m.f9966c) && C1717af.m8085a((Object) this.f9963A, (Object) c1753m.f9963A) && this.f9964B == c1753m.f9964B && C1717af.m8085a((Object) this.f9970g, (Object) c1753m.f9970g) && C1717af.m8085a((Object) this.f9971h, (Object) c1753m.f9971h) && C1717af.m8085a((Object) this.f9968e, (Object) c1753m.f9968e) && C1717af.m8085a(this.f9974k, c1753m.f9974k) && C1717af.m8085a(this.f9969f, c1753m.f9969f) && C1717af.m8085a(this.f9983t, c1753m.f9983t) && Arrays.equals(this.f9982s, c1753m.f9982s) && m8416b(c1753m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f9965C == 0) {
            String str = this.f9966c;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f9970g;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f9971h;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f9968e;
            int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f9967d) * 31) + this.f9976m) * 31) + this.f9977n) * 31) + this.f9984u) * 31) + this.f9985v) * 31;
            String str5 = this.f9963A;
            int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f9964B) * 31;
            C1536e c1536e = this.f9974k;
            int iHashCode6 = (iHashCode5 + (c1536e == null ? 0 : c1536e.hashCode())) * 31;
            C1582a c1582a = this.f9969f;
            this.f9965C = iHashCode6 + (c1582a != null ? c1582a.hashCode() : 0);
        }
        return this.f9965C;
    }

    public final String toString() {
        return "Format(" + this.f9966c + ", " + this.f9970g + ", " + this.f9971h + ", " + this.f9967d + ", " + this.f9963A + ", [" + this.f9976m + ", " + this.f9977n + ", " + this.f9978o + "], [" + this.f9984u + ", " + this.f9985v + "])";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9966c);
        parcel.writeString(this.f9970g);
        parcel.writeString(this.f9971h);
        parcel.writeString(this.f9968e);
        parcel.writeInt(this.f9967d);
        parcel.writeInt(this.f9972i);
        parcel.writeInt(this.f9976m);
        parcel.writeInt(this.f9977n);
        parcel.writeFloat(this.f9978o);
        parcel.writeInt(this.f9979p);
        parcel.writeFloat(this.f9980q);
        C1717af.m8072a(parcel, this.f9982s != null);
        byte[] bArr = this.f9982s;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f9981r);
        parcel.writeParcelable(this.f9983t, i);
        parcel.writeInt(this.f9984u);
        parcel.writeInt(this.f9985v);
        parcel.writeInt(this.f9986w);
        parcel.writeInt(this.f9987x);
        parcel.writeInt(this.f9988y);
        parcel.writeInt(this.f9989z);
        parcel.writeString(this.f9963A);
        parcel.writeInt(this.f9964B);
        parcel.writeLong(this.f9975l);
        int size = this.f9973j.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f9973j.get(i2));
        }
        parcel.writeParcelable(this.f9974k, 0);
        parcel.writeParcelable(this.f9969f, 0);
    }
}
