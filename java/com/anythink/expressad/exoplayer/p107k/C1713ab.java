package com.anythink.expressad.exoplayer.p107k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C1713ab implements InterfaceC1728k {

    /* JADX INFO: renamed from: a */
    private final Handler f9616a;

    public C1713ab(Handler handler) {
        this.f9616a = handler;
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1728k
    /* JADX INFO: renamed from: a */
    public final Looper mo8018a() {
        return this.f9616a.getLooper();
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1728k
    /* JADX INFO: renamed from: a */
    public final Message mo8019a(int i) {
        return this.f9616a.obtainMessage(i);
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1728k
    /* JADX INFO: renamed from: a */
    public final Message mo8020a(int i, int i2) {
        return this.f9616a.obtainMessage(i, i2, 0);
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1728k
    /* JADX INFO: renamed from: a */
    public final Message mo8021a(int i, int i2, Object obj) {
        return this.f9616a.obtainMessage(0, i, i2, obj);
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1728k
    /* JADX INFO: renamed from: a */
    public final Message mo8022a(int i, Object obj) {
        return this.f9616a.obtainMessage(i, obj);
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1728k
    /* JADX INFO: renamed from: a */
    public final void mo8023a(Object obj) {
        this.f9616a.removeCallbacksAndMessages(obj);
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1728k
    /* JADX INFO: renamed from: a */
    public final boolean mo8024a(long j) {
        return this.f9616a.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1728k
    /* JADX INFO: renamed from: a */
    public final boolean mo8025a(Runnable runnable) {
        return this.f9616a.post(runnable);
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1728k
    /* JADX INFO: renamed from: a */
    public final boolean mo8026a(Runnable runnable, long j) {
        return this.f9616a.postDelayed(runnable, j);
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1728k
    /* JADX INFO: renamed from: b */
    public final void mo8027b() {
        this.f9616a.removeMessages(2);
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1728k
    /* JADX INFO: renamed from: b */
    public final boolean mo8028b(int i) {
        return this.f9616a.sendEmptyMessage(i);
    }
}
