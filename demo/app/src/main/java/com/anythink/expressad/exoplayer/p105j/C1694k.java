package com.anythink.expressad.exoplayer.p105j;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1694k {

    /* JADX INFO: renamed from: a */
    public static final int f9393a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f9394b = 2;

    /* JADX INFO: renamed from: c */
    public final Uri f9395c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final byte[] f9396d;

    /* JADX INFO: renamed from: e */
    public final long f9397e;

    /* JADX INFO: renamed from: f */
    public final long f9398f;

    /* JADX INFO: renamed from: g */
    public final long f9399g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f9400h;

    /* JADX INFO: renamed from: i */
    public final int f9401i;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.k$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public C1694k(Uri uri) {
        this(uri, 0);
    }

    public C1694k(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    public C1694k(Uri uri, long j, long j2, long j3, @Nullable String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public C1694k(Uri uri, long j, long j2, @Nullable String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public C1694k(Uri uri, long j, @Nullable String str) {
        this(uri, j, j, -1L, str, 0);
    }

    public C1694k(Uri uri, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i) {
        boolean z = true;
        C1711a.m8010a(j >= 0);
        C1711a.m8010a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C1711a.m8010a(z);
        this.f9395c = uri;
        this.f9396d = bArr;
        this.f9397e = j;
        this.f9398f = j2;
        this.f9399g = j3;
        this.f9400h = str;
        this.f9401i = i;
    }

    /* JADX INFO: renamed from: a */
    private C1694k m7855a(long j, long j2) {
        return (j == 0 && this.f9399g == j2) ? this : new C1694k(this.f9395c, this.f9396d, this.f9397e + j, this.f9398f + j, j2, this.f9400h, this.f9401i);
    }

    /* JADX INFO: renamed from: a */
    private C1694k m7856a(Uri uri) {
        return new C1694k(uri, this.f9396d, this.f9397e, this.f9398f, this.f9399g, this.f9400h, this.f9401i);
    }

    /* JADX INFO: renamed from: a */
    public final C1694k m7857a(long j) {
        long j2 = this.f9399g;
        long j3 = j2 != -1 ? j2 - j : -1L;
        return (j == 0 && j2 == j3) ? this : new C1694k(this.f9395c, this.f9396d, this.f9397e + j, this.f9398f + j, j3, this.f9400h, this.f9401i);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7858a(int i) {
        return (this.f9401i & i) == i;
    }

    public final String toString() {
        return "DataSpec[" + this.f9395c + ", " + Arrays.toString(this.f9396d) + ", " + this.f9397e + ", " + this.f9398f + ", " + this.f9399g + ", " + this.f9400h + ", " + this.f9401i + "]";
    }
}
