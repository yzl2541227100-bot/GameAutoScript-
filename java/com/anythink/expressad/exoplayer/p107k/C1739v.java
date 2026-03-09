package com.anythink.expressad.exoplayer.p107k;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1739v {

    /* JADX INFO: renamed from: a */
    private final Object f9799a = new Object();

    /* JADX INFO: renamed from: b */
    private final PriorityQueue<Integer> f9800b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c */
    private int f9801c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.v$a */
    public static class a extends IOException {
        public a(int i, int i2) {
            super("Priority too low [priority=" + i + ", highest=" + i2 + "]");
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m8300b(int i) {
        boolean z;
        synchronized (this.f9799a) {
            z = this.f9801c == i;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public final void m8301a() {
        synchronized (this.f9799a) {
            this.f9800b.add(0);
            this.f9801c = Math.max(this.f9801c, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8302a(int i) {
        synchronized (this.f9799a) {
            if (this.f9801c != i) {
                throw new a(i, this.f9801c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8303b() {
        synchronized (this.f9799a) {
            while (this.f9801c != 0) {
                this.f9799a.wait();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8304c() {
        synchronized (this.f9799a) {
            this.f9800b.remove(0);
            this.f9801c = this.f9800b.isEmpty() ? Integer.MIN_VALUE : this.f9800b.peek().intValue();
            this.f9799a.notifyAll();
        }
    }
}
