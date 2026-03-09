package com.anythink.expressad.exoplayer.p107k;

import android.support.v4.media.session.PlaybackStateCompat;
import javax.mail.UIDFolder;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1727j {

    /* JADX INFO: renamed from: a */
    public final int f9679a;

    /* JADX INFO: renamed from: b */
    public final int f9680b;

    /* JADX INFO: renamed from: c */
    public final int f9681c;

    /* JADX INFO: renamed from: d */
    public final int f9682d;

    /* JADX INFO: renamed from: e */
    public final int f9683e;

    /* JADX INFO: renamed from: f */
    public final int f9684f;

    /* JADX INFO: renamed from: g */
    public final int f9685g;

    /* JADX INFO: renamed from: h */
    public final long f9686h;

    private C1727j(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        this.f9679a = i;
        this.f9680b = i2;
        this.f9681c = i3;
        this.f9682d = i4;
        this.f9683e = i5;
        this.f9684f = i6;
        this.f9685g = i7;
        this.f9686h = j;
    }

    private C1727j(byte[] bArr, int i) {
        C1735r c1735r = new C1735r(bArr);
        c1735r.m8236a(i * 8);
        this.f9679a = c1735r.m8240c(16);
        this.f9680b = c1735r.m8240c(16);
        this.f9681c = c1735r.m8240c(24);
        this.f9682d = c1735r.m8240c(24);
        this.f9683e = c1735r.m8240c(20);
        this.f9684f = c1735r.m8240c(3) + 1;
        this.f9685g = c1735r.m8240c(5) + 1;
        this.f9686h = ((((long) c1735r.m8240c(4)) & 15) << 32) | (((long) c1735r.m8240c(32)) & UIDFolder.MAXUID);
    }

    /* JADX INFO: renamed from: a */
    private int m8189a() {
        return this.f9680b * this.f9684f * (this.f9685g / 8);
    }

    /* JADX INFO: renamed from: a */
    private long m8190a(long j) {
        return C1717af.m8058a((j * ((long) this.f9683e)) / 1000000, this.f9686h - 1);
    }

    /* JADX INFO: renamed from: b */
    private int m8191b() {
        return this.f9685g * this.f9683e;
    }

    /* JADX INFO: renamed from: c */
    private long m8192c() {
        return (this.f9686h * 1000000) / ((long) this.f9683e);
    }

    /* JADX INFO: renamed from: d */
    private long m8193d() {
        long j;
        long j2;
        int i = this.f9682d;
        if (i > 0) {
            j = (((long) i) + ((long) this.f9681c)) / 2;
            j2 = 1;
        } else {
            int i2 = this.f9679a;
            j = ((((i2 != this.f9680b || i2 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i2) * ((long) this.f9684f)) * ((long) this.f9685g)) / 8;
            j2 = 64;
        }
        return j + j2;
    }
}
