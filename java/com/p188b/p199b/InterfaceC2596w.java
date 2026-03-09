package com.p188b.p199b;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: com.b.b.w */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2596w extends Closeable, Flushable {
    /* JADX INFO: renamed from: a */
    C2598y mo12632a();

    /* JADX INFO: renamed from: a_ */
    void mo12633a_(C2579f c2579f, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
