package com.p188b.p189a;

import com.p188b.p189a.p190a.p191a.C2433f;
import com.p188b.p189a.p190a.p191a.InterfaceC2436i;
import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: com.b.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2550d implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2436i f15608a;

    /* JADX INFO: renamed from: b */
    public final C2433f f15609b;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15609b.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f15609b.flush();
    }
}
