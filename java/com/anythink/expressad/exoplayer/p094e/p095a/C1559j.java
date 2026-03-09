package com.anythink.expressad.exoplayer.p094e.p095a;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1753m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1559j {

    /* JADX INFO: renamed from: a */
    public static final int f8314a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f8315b = 1;

    /* JADX INFO: renamed from: c */
    public final int f8316c;

    /* JADX INFO: renamed from: d */
    public final int f8317d;

    /* JADX INFO: renamed from: e */
    public final long f8318e;

    /* JADX INFO: renamed from: f */
    public final long f8319f;

    /* JADX INFO: renamed from: g */
    public final long f8320g;

    /* JADX INFO: renamed from: h */
    public final C1753m f8321h;

    /* JADX INFO: renamed from: i */
    public final int f8322i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final long[] f8323j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final long[] f8324k;

    /* JADX INFO: renamed from: l */
    public final int f8325l;

    /* JADX INFO: renamed from: m */
    @Nullable
    private final C1560k[] f8326m;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.j$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public C1559j(int i, int i2, long j, long j2, long j3, C1753m c1753m, int i3, @Nullable C1560k[] c1560kArr, int i4, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f8316c = i;
        this.f8317d = i2;
        this.f8318e = j;
        this.f8319f = j2;
        this.f8320g = j3;
        this.f8321h = c1753m;
        this.f8322i = i3;
        this.f8326m = c1560kArr;
        this.f8325l = i4;
        this.f8323j = jArr;
        this.f8324k = jArr2;
    }

    /* JADX INFO: renamed from: a */
    public final C1560k m6948a(int i) {
        C1560k[] c1560kArr = this.f8326m;
        if (c1560kArr == null) {
            return null;
        }
        return c1560kArr[i];
    }
}
