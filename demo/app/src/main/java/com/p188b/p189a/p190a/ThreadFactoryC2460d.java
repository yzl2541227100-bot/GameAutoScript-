package com.p188b.p189a.p190a;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.b.a.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC2460d implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f15214a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f15215b;

    public ThreadFactoryC2460d(String str, boolean z) {
        this.f15214a = str;
        this.f15215b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f15214a);
        thread.setDaemon(this.f15215b);
        return thread;
    }
}
