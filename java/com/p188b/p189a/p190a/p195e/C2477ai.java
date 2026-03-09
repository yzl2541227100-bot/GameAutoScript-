package com.p188b.p189a.p190a.p195e;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.b.a.a.e.ai */
/* JADX INFO: loaded from: classes.dex */
public final class C2477ai {

    /* JADX INFO: renamed from: a */
    private final CountDownLatch f15279a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b */
    private long f15280b = -1;

    /* JADX INFO: renamed from: c */
    private long f15281c = -1;

    /* JADX INFO: renamed from: a */
    public final void m12682a() {
        if (this.f15280b != -1) {
            throw new IllegalStateException();
        }
        this.f15280b = System.nanoTime();
    }

    /* JADX INFO: renamed from: b */
    public final void m12683b() {
        if (this.f15281c != -1 || this.f15280b == -1) {
            throw new IllegalStateException();
        }
        this.f15281c = System.nanoTime();
        this.f15279a.countDown();
    }

    /* JADX INFO: renamed from: c */
    public final void m12684c() {
        if (this.f15281c == -1) {
            long j = this.f15280b;
            if (j != -1) {
                this.f15281c = j - 1;
                this.f15279a.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }
}
