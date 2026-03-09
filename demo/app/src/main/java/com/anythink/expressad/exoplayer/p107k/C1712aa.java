package com.anythink.expressad.exoplayer.p107k;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C1712aa implements InterfaceC1720c {
    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1720c
    /* JADX INFO: renamed from: a */
    public final long mo8014a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1720c
    /* JADX INFO: renamed from: a */
    public final InterfaceC1728k mo8015a(Looper looper, @Nullable Handler.Callback callback) {
        return new C1713ab(new Handler(looper, callback));
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1720c
    /* JADX INFO: renamed from: a */
    public final void mo8016a(long j) {
        SystemClock.sleep(j);
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1720c
    /* JADX INFO: renamed from: b */
    public final long mo8017b() {
        return SystemClock.uptimeMillis();
    }
}
