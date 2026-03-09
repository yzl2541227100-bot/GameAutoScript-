package com.anythink.expressad.exoplayer.p105j.p106a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1500b;
import java.io.File;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.e */
/* JADX INFO: loaded from: classes.dex */
public class C1674e implements Comparable<C1674e> {

    /* JADX INFO: renamed from: a */
    public final String f9315a;

    /* JADX INFO: renamed from: b */
    public final long f9316b;

    /* JADX INFO: renamed from: c */
    public final long f9317c;

    /* JADX INFO: renamed from: d */
    public final boolean f9318d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final File f9319e;

    /* JADX INFO: renamed from: f */
    public final long f9320f;

    private C1674e(String str, long j, long j2) {
        this(str, j, j2, C1500b.f7455b, null);
    }

    public C1674e(String str, long j, long j2, long j3, @Nullable File file) {
        this.f9315a = str;
        this.f9316b = j;
        this.f9317c = j2;
        this.f9318d = file != null;
        this.f9319e = file;
        this.f9320f = j3;
    }

    /* JADX INFO: renamed from: a */
    private int m7749a(@NonNull C1674e c1674e) {
        if (!this.f9315a.equals(c1674e.f9315a)) {
            return this.f9315a.compareTo(c1674e.f9315a);
        }
        long j = this.f9316b - c1674e.f9316b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7750a() {
        return this.f9317c == -1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7751b() {
        return !this.f9318d;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(@NonNull C1674e c1674e) {
        C1674e c1674e2 = c1674e;
        if (!this.f9315a.equals(c1674e2.f9315a)) {
            return this.f9315a.compareTo(c1674e2.f9315a);
        }
        long j = this.f9316b - c1674e2.f9316b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }
}
