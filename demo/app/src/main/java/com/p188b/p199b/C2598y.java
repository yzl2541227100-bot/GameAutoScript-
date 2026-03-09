package com.p188b.p199b;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.b.b.y */
/* JADX INFO: loaded from: classes.dex */
public class C2598y {

    /* JADX INFO: renamed from: b */
    public static final C2598y f15860b = new C2599z();

    /* JADX INFO: renamed from: a */
    private boolean f15861a;

    /* JADX INFO: renamed from: c */
    private long f15862c;

    /* JADX INFO: renamed from: d */
    private long f15863d;

    /* JADX INFO: renamed from: a */
    public C2598y mo13060a(long j) {
        this.f15861a = true;
        this.f15862c = j;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C2598y mo13061a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j)));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f15863d = timeUnit.toNanos(j);
        return this;
    }

    /* JADX INFO: renamed from: b_ */
    public long mo13062b_() {
        return this.f15863d;
    }

    /* JADX INFO: renamed from: c_ */
    public boolean mo13063c_() {
        return this.f15861a;
    }

    /* JADX INFO: renamed from: d */
    public long mo13064d() {
        if (this.f15861a) {
            return this.f15862c;
        }
        throw new IllegalStateException("No deadline");
    }

    /* JADX INFO: renamed from: d_ */
    public C2598y mo13065d_() {
        this.f15863d = 0L;
        return this;
    }

    /* JADX INFO: renamed from: e_ */
    public C2598y mo13066e_() {
        this.f15861a = false;
        return this;
    }

    /* JADX INFO: renamed from: f_ */
    public void mo13067f_() throws InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.f15861a && this.f15862c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
