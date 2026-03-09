package com.anythink.expressad.exoplayer.p092c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.c.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1530h extends AbstractC1528f {

    /* JADX INFO: renamed from: c */
    public ByteBuffer f7898c;

    /* JADX INFO: renamed from: d */
    private final AbstractC1529g<?, C1530h, ?> f7899d;

    private C1530h(AbstractC1529g<?, C1530h, ?> abstractC1529g) {
        this.f7899d = abstractC1529g;
    }

    /* JADX INFO: renamed from: a */
    private ByteBuffer m6682a(long j, int i) {
        ((AbstractC1528f) this).f7882a = j;
        ByteBuffer byteBuffer = this.f7898c;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f7898c = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.f7898c.position(0);
        this.f7898c.limit(i);
        return this.f7898c;
    }

    @Override // com.anythink.expressad.exoplayer.p092c.AbstractC1523a
    /* JADX INFO: renamed from: a */
    public final void mo6637a() {
        super.mo6637a();
        ByteBuffer byteBuffer = this.f7898c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p092c.AbstractC1528f
    /* JADX INFO: renamed from: e */
    public final void mo6664e() {
        this.f7899d.m6675a(this);
    }
}
