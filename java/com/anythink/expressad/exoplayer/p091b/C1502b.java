package com.anythink.expressad.exoplayer.p091b;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1502b {

    /* JADX INFO: renamed from: a */
    public static final C1502b f7531a = new a().m6411a();

    /* JADX INFO: renamed from: b */
    public final int f7532b;

    /* JADX INFO: renamed from: c */
    public final int f7533c;

    /* JADX INFO: renamed from: d */
    public final int f7534d;

    /* JADX INFO: renamed from: e */
    private AudioAttributes f7535e;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private int f7536a = 0;

        /* JADX INFO: renamed from: b */
        private int f7537b = 0;

        /* JADX INFO: renamed from: c */
        private int f7538c = 1;

        /* JADX INFO: renamed from: c */
        private a m6409c(int i) {
            this.f7537b = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m6410a(int i) {
            this.f7536a = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1502b m6411a() {
            return new C1502b(this.f7536a, this.f7537b, this.f7538c, (byte) 0);
        }

        /* JADX INFO: renamed from: b */
        public final a m6412b(int i) {
            this.f7538c = i;
            return this;
        }
    }

    private C1502b(int i, int i2, int i3) {
        this.f7532b = i;
        this.f7533c = i2;
        this.f7534d = i3;
    }

    public /* synthetic */ C1502b(int i, int i2, int i3, byte b) {
        this(i, i2, i3);
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    public final AudioAttributes m6408a() {
        if (this.f7535e == null) {
            this.f7535e = new AudioAttributes.Builder().setContentType(this.f7532b).setFlags(this.f7533c).setUsage(this.f7534d).build();
        }
        return this.f7535e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1502b.class == obj.getClass()) {
            C1502b c1502b = (C1502b) obj;
            if (this.f7532b == c1502b.f7532b && this.f7533c == c1502b.f7533c && this.f7534d == c1502b.f7534d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7532b + 527) * 31) + this.f7533c) * 31) + this.f7534d;
    }
}
