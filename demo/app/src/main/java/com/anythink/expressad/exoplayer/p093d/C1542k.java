package com.anythink.expressad.exoplayer.p093d;

import android.annotation.TargetApi;
import android.media.MediaCrypto;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.k */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public final class C1542k implements InterfaceC1540i {

    /* JADX INFO: renamed from: a */
    private final MediaCrypto f8013a;

    /* JADX INFO: renamed from: b */
    private final boolean f8014b;

    private C1542k(MediaCrypto mediaCrypto) {
        this(mediaCrypto, false);
    }

    public C1542k(MediaCrypto mediaCrypto, boolean z) {
        this.f8013a = (MediaCrypto) C1711a.m8005a(mediaCrypto);
        this.f8014b = z;
    }

    /* JADX INFO: renamed from: a */
    public final MediaCrypto m6802a() {
        return this.f8013a;
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1540i
    /* JADX INFO: renamed from: a */
    public final boolean mo6778a(String str) {
        return !this.f8014b && this.f8013a.requiresSecureDecoderComponent(str);
    }
}
